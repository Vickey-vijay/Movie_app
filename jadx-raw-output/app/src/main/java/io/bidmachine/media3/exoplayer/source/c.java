package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ConditionVariable;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.StatsDataSource;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import io.bidmachine.media3.extractor.DiscardingTrackOutput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ForwardingSeekMap;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements MediaPeriod, ExtractorOutput, Loader.Callback<b>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;

    @Nullable
    private final String customCacheKey;
    private final DataSource dataSource;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private boolean haveAudioVideoTracks;

    @Nullable
    private IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final InterfaceC0507c listener;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadingFinished;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private boolean pendingDeferredRetry;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private f trackState;
    private final Uri uri;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final Format ICY_FORMAT = new Format.Builder().setId("icy").setSampleMimeType("application/x-icy").build();
    private final Loader loader = new Loader(TAG);
    private final ConditionVariable loadCondition = new ConditionVariable();
    private final Runnable maybeFinishPrepareRunnable = new Runnable() { // from class: og.t
        @Override // java.lang.Runnable
        public final void run() {
            this.f65386b.maybeFinishPrepare();
        }
    };
    private final Runnable onContinueLoadingRequestedRunnable = new Runnable() { // from class: og.u
        @Override // java.lang.Runnable
        public final void run() {
            this.f65387b.lambda$new$0();
        }
    };
    private final Handler handler = Util.createHandlerForCurrentLooper();
    private e[] sampleQueueTrackIds = new e[0];
    private SampleQueue[] sampleQueues = new SampleQueue[0];
    private long pendingResetPositionUs = -9223372036854775807L;
    private int dataType = 1;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public class a extends ForwardingSeekMap {
        public a(SeekMap seekMap) {
            super(seekMap);
        }

        @Override // io.bidmachine.media3.extractor.ForwardingSeekMap, io.bidmachine.media3.extractor.SeekMap
        public long getDurationUs() {
            return c.this.durationUs;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class b implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorOutput extractorOutput;

        @Nullable
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private DataSpec dataSpec = buildDataSpec(0);

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        public b(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        private DataSpec buildDataSpec(long j10) {
            return new DataSpec.Builder().setUri(this.uri).setPosition(j10).setKey(c.this.customCacheKey).setFlags(6).setHttpRequestHeaders(c.ICY_METADATA_HEADERS).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j10, long j11) {
            this.positionHolder.position = j10;
            this.seekTimeUs = j11;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void load() throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.source.c.b.load():void");
        }

        @Override // io.bidmachine.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long jMax = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(c.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int iBytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.source.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public interface InterfaceC0507c {
        void onSourceInfoRefreshed(long j10, boolean z10, boolean z11);
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class d implements SampleStream {
        private final int track;

        public d(int i10) {
            this.track = i10;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return c.this.isReady(this.track);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            c.this.maybeThrowError(this.track);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            return c.this.readData(this.track, formatHolder, decoderInputBuffer, i10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            return c.this.skipData(this.track, j10);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f59894id;
        public final boolean isIcyTrack;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f59894id == eVar.f59894id && this.isIcyTrack == eVar.isIcyTrack;
        }

        public int hashCode() {
            return (this.f59894id * 31) + (this.isIcyTrack ? 1 : 0);
        }

        public e(int i10, boolean z10) {
            this.f59894id = i10;
            this.isIcyTrack = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.isLengthKnown = true;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    public void maybeThrowError(int i10) throws IOException {
        this.sampleQueues[i10].maybeThrowError();
        maybeThrowError();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class f {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public f(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i10 = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i10];
            this.trackNotifiedDownstreamFormats = new boolean[i10];
        }
    }

    private void assertPrepared() {
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackState);
        Assertions.checkNotNull(this.seekMap);
    }

    private boolean configureRetry(b bVar, int i10) {
        SeekMap seekMap;
        if (this.isLengthKnown || !((seekMap = this.seekMap) == null || seekMap.getDurationUs() == -9223372036854775807L)) {
            this.extractedSamplesCountAtStartOfLoad = i10;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        bVar.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.sampleQueues.length; i10++) {
            if (z10 || ((f) Assertions.checkNotNull(this.trackState)).trackEnabledStates[i10]) {
                jMax = Math.max(jMax, this.sampleQueues[i10].getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.released) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            Format formatBuild = (Format) Assertions.checkNotNull(this.sampleQueues[i10].getUpstreamFormat());
            String str = formatBuild.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z10 = zIsAudio || MimeTypes.isVideo(str);
            zArr[i10] = z10;
            this.haveAudioVideoTracks = z10 | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != -9223372036854775807L && length == 1 && MimeTypes.isImage(str);
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (zIsAudio || this.sampleQueueTrackIds[i10].isIcyTrack) {
                    Metadata metadata = formatBuild.metadata;
                    formatBuild = formatBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && formatBuild.averageBitrate == -1 && formatBuild.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    formatBuild = formatBuild.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            trackGroupArr[i10] = new TrackGroup(Integer.toString(i10), formatBuild.copyWithCryptoType(this.drmSessionManager.getCryptoType(formatBuild)));
        }
        this.trackState = new f(new TrackGroupArray(trackGroupArr), zArr);
        if (this.isSingleSample && this.durationUs == -9223372036854775807L) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new a(this.seekMap);
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap.isSeekable(), this.isLive);
        this.prepared = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new Runnable() { // from class: og.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f65385b.lambda$onLengthKnown$2();
            }
        });
    }

    private TrackOutput prepareTrackOutput(e eVar) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.sampleQueueTrackIds[i10])) {
                return this.sampleQueues[i10];
            }
        }
        if (this.sampleQueuesBuilt) {
            Log.w(TAG, "Extractor added new track (id=" + eVar.f59894id + ") after finishing tracks.");
            return new DiscardingTrackOutput();
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.sampleQueueTrackIds, i11);
        eVarArr[length] = eVar;
        this.sampleQueueTrackIds = (e[]) Util.castNonNullTypeArray(eVarArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i11);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueueCreateWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j10) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            SampleQueue sampleQueue = this.sampleQueues[i10];
            if (!(this.isSingleSample ? sampleQueue.seekTo(sampleQueue.getFirstIndex()) : sampleQueue.seekTo(j10, false)) && (zArr[i10] || !this.haveAudioVideoTracks)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new SeekMap.Unseekable(-9223372036854775807L);
        this.durationUs = seekMap.getDurationUs();
        boolean z10 = !this.isLengthKnown && seekMap.getDurationUs() == -9223372036854775807L;
        this.isLive = z10;
        this.dataType = z10 ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        b bVar = new b(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            Assertions.checkState(isPendingReset());
            long j10 = this.durationUs;
            if (j10 != -9223372036854775807L && this.pendingResetPositionUs > j10) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            bVar.setLoadPosition(((SeekMap) Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(bVar.loadTaskId, bVar.dataSpec, this.loader.startLoading(bVar, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType))), 1, -1, null, 0, null, bVar.seekTimeUs, this.durationUs);
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean zOpen = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sampleQueues[i10].discardTo(j10, z10, zArr[i10]);
        }
    }

    public TrackOutput icyTrack() {
        return prepareTrackOutput(new e(0, true));
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(b bVar, long j10, long j11, boolean z10) {
        StatsDataSource statsDataSource = bVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(bVar.loadTaskId, bVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(bVar.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, bVar.seekTimeUs, this.durationUs);
        if (z10) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(b bVar, long j10, long j11) {
        SeekMap seekMap;
        if (this.durationUs == -9223372036854775807L && (seekMap = this.seekMap) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j12 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j12;
            this.listener.onSourceInfoRefreshed(j12, zIsSeekable, this.isLive);
        }
        StatsDataSource statsDataSource = bVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(bVar.loadTaskId, bVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(bVar.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, bVar.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(b bVar, long j10, long j11, IOException iOException, int i10) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = bVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(bVar.loadTaskId, bVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(bVar.seekTimeUs), Util.usToMs(this.durationUs)), iOException, i10));
        if (retryDelayMsFor == -9223372036854775807L) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            loadErrorActionCreateRetryAction = configureRetry(bVar, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean z10 = !loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, bVar.seekTimeUs, this.durationUs, iOException, z10);
        if (z10) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(bVar.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.handler.post(new Runnable() { // from class: og.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f65388b.lambda$seekMap$1(seekMap);
            }
        });
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        return prepareTrackOutput(new e(i10, false));
    }

    public c(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, InterfaceC0507c interfaceC0507c, Allocator allocator, @Nullable String str, int i10, long j10) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = interfaceC0507c;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i10;
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j10;
    }

    private void maybeNotifyDownstreamFormat(int i10) {
        assertPrepared();
        f fVar = this.trackState;
        boolean[] zArr = fVar.trackNotifiedDownstreamFormats;
        if (!zArr[i10]) {
            Format format = fVar.tracks.get(i10).getFormat(0);
            this.mediaSourceEventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
            zArr[i10] = true;
        }
    }

    private void maybeStartDeferredRetry(int i10) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i10]) {
            if (!this.sampleQueues[i10].isReady(false)) {
                this.pendingResetPositionUs = 0L;
                this.pendingDeferredRetry = false;
                this.notifyDiscontinuity = true;
                this.lastSeekPositionUs = 0L;
                this.extractedSamplesCountAtStartOfLoad = 0;
                for (SampleQueue sampleQueue : this.sampleQueues) {
                    sampleQueue.reset();
                }
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j10);
        return seekParameters.resolveSeekPositionUs(j10, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.trackState;
                if (fVar.trackIsAudioVideoFlags[i10] && fVar.trackEnabledStates[i10] && !this.sampleQueues[i10].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i10].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        if (largestQueuedTimestampUs == Long.MIN_VALUE) {
            return this.lastSeekPositionUs;
        }
        return largestQueuedTimestampUs;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    public boolean isReady(int i10) {
        if (!suppressRead() && this.sampleQueues[i10].isReady(this.loadingFinished)) {
            return true;
        }
        return false;
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    public int readData(int i10, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i10);
        int i12 = this.sampleQueues[i10].read(formatHolder, decoderInputBuffer, i11, this.loadingFinished);
        if (i12 == -3) {
            maybeStartDeferredRetry(i10);
        }
        return i12;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j10 = 0;
        }
        int i10 = 0;
        this.notifyDiscontinuity = false;
        this.lastSeekPositionUs = j10;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j10;
            return j10;
        }
        if (this.dataType != 7 && ((this.loadingFinished || this.loader.isLoading()) && seekInsideBufferUs(zArr, j10))) {
            return j10;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j10;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            while (i10 < length) {
                sampleQueueArr[i10].discardToEnd();
                i10++;
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i10 < length2) {
                sampleQueueArr2[i10].reset();
                i10++;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        boolean z10;
        ExoTrackSelection exoTrackSelection;
        boolean z11;
        boolean z12;
        assertPrepared();
        f fVar = this.trackState;
        TrackGroupArray trackGroupArray = fVar.tracks;
        boolean[] zArr3 = fVar.trackEnabledStates;
        int i10 = this.enabledTrackCount;
        int i11 = 0;
        for (int i12 = 0; i12 < exoTrackSelectionArr.length; i12++) {
            SampleStream sampleStream = sampleStreamArr[i12];
            if (sampleStream != null && (exoTrackSelectionArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) sampleStream).track;
                Assertions.checkState(zArr3[i13]);
                this.enabledTrackCount--;
                zArr3[i13] = false;
                sampleStreamArr[i12] = null;
            }
        }
        if (!this.seenFirstTrackSelection ? !(j10 == 0 || this.isSingleSample) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < exoTrackSelectionArr.length; i14++) {
            if (sampleStreamArr[i14] == null && (exoTrackSelection = exoTrackSelectionArr[i14]) != null) {
                if (exoTrackSelection.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Assertions.checkState(z11);
                if (exoTrackSelection.getIndexInTrackGroup(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Assertions.checkState(z12);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                Assertions.checkState(!zArr3[iIndexOf]);
                this.enabledTrackCount++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i14] = new d(iIndexOf);
                zArr2[i14] = true;
                if (!z10) {
                    SampleQueue sampleQueue = this.sampleQueues[iIndexOf];
                    if (sampleQueue.getReadIndex() != 0 && !sampleQueue.seekTo(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i11 < length) {
                    sampleQueueArr[i11].discardToEnd();
                    i11++;
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i11 < length2) {
                    sampleQueueArr2[i11].reset();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            while (i11 < sampleStreamArr.length) {
                if (sampleStreamArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j10;
    }

    public int skipData(int i10, long j10) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i10);
        SampleQueue sampleQueue = this.sampleQueues[i10];
        int skipCount = sampleQueue.getSkipCount(j10, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i10);
        }
        return skipCount;
    }
}
