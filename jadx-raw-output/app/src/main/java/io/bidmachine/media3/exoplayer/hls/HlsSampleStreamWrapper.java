package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.y1;
import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.HttpDataSource;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.SampleQueue;
import io.bidmachine.media3.exoplayer.source.SampleStream;
import io.bidmachine.media3.exoplayer.source.SequenceableLoader;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectionUtil;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import io.bidmachine.media3.extractor.DiscardingTrackOutput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessage;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessageDecoder;
import io.bidmachine.media3.extractor.metadata.id3.PrivFrame;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final Set<Integer> MAPPABLE_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private final Callback callback;
    private final HlsChunkSource chunkSource;

    @Nullable
    private Format downstreamTrackFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @Nullable
    private DrmInitData drmInitData;
    private final DrmSessionManager drmSessionManager;
    private TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<ig.c> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private Chunk loadingChunk;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final ArrayList<io.bidmachine.media3.exoplayer.hls.a> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;

    @Nullable
    private final Format muxedAudioFormat;
    private final Runnable onTracksEndedRunnable;
    private Set<TrackGroup> optionalTrackGroups;
    private final Map<String, DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final List<io.bidmachine.media3.exoplayer.hls.a> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private Set<Integer> sampleQueueMappingDoneByType;
    private c[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;

    @Nullable
    private io.bidmachine.media3.exoplayer.hls.a sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final String uid;
    private Format upstreamTrackFormat;
    private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
    private int[] sampleQueueTrackIds = new int[0];

    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        /* synthetic */ void onContinueLoadingRequested(SequenceableLoader sequenceableLoader);

        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    public static class b implements TrackOutput {
        private byte[] buffer;
        private int bufferPosition;
        private final TrackOutput delegate;
        private final Format delegateFormat;
        private final EventMessageDecoder emsgDecoder = new EventMessageDecoder();
        private Format format;
        private static final Format ID3_FORMAT = new Format.Builder().setSampleMimeType("application/id3").build();
        private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType("application/x-emsg").build();

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
            return super.sampleData(dataReader, i10, z10);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
            ensureBufferCapacity(this.bufferPosition + i10);
            int i12 = dataReader.read(this.buffer, this.bufferPosition, i10);
            if (i12 != -1) {
                this.bufferPosition += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
            super.sampleData(parsableByteArray, i10);
        }

        private void ensureBufferCapacity(int i10) {
            byte[] bArr = this.buffer;
            if (bArr.length < i10) {
                this.buffer = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private ParsableByteArray getSampleAndTrimBuffer(int i10, int i11) {
            int i12 = this.bufferPosition - i11;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.buffer, i12 - i10, i12));
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.bufferPosition = i11;
            return parsableByteArray;
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void format(Format format) {
            this.format = format;
            this.delegate.format(this.delegateFormat);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            Assertions.checkNotNull(this.format);
            ParsableByteArray sampleAndTrimBuffer = getSampleAndTrimBuffer(i11, i12);
            if (!Util.areEqual(this.format.sampleMimeType, this.delegateFormat.sampleMimeType)) {
                if (!"application/x-emsg".equals(this.format.sampleMimeType)) {
                    Log.w(HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.sampleMimeType);
                    return;
                }
                EventMessage eventMessageDecode = this.emsgDecoder.decode(sampleAndTrimBuffer);
                if (!emsgContainsExpectedWrappedFormat(eventMessageDecode)) {
                    Log.w(HlsSampleStreamWrapper.TAG, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.delegateFormat.sampleMimeType, eventMessageDecode.getWrappedMetadataFormat()));
                    return;
                }
                sampleAndTrimBuffer = new ParsableByteArray((byte[]) Assertions.checkNotNull(eventMessageDecode.getWrappedMetadataBytes()));
            }
            int iBytesLeft = sampleAndTrimBuffer.bytesLeft();
            this.delegate.sampleData(sampleAndTrimBuffer, iBytesLeft);
            this.delegate.sampleMetadata(j10, i10, iBytesLeft, 0, cryptoData);
        }

        public b(TrackOutput trackOutput, int i10) {
            this.delegate = trackOutput;
            if (i10 != 1) {
                if (i10 == 3) {
                    this.delegateFormat = EMSG_FORMAT;
                } else {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
            } else {
                this.delegateFormat = ID3_FORMAT;
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        private boolean emsgContainsExpectedWrappedFormat(EventMessage eventMessage) {
            Format wrappedMetadataFormat = eventMessage.getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && Util.areEqual(this.delegateFormat.sampleMimeType, wrappedMetadataFormat.sampleMimeType)) {
                return true;
            }
            return false;
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
            ensureBufferCapacity(this.bufferPosition + i10);
            parsableByteArray.readBytes(this.buffer, this.bufferPosition, i10);
            this.bufferPosition += i10;
        }
    }

    public static final class c extends SampleQueue {

        @Nullable
        private DrmInitData drmInitData;
        private final Map<String, DrmInitData> overridingDrmInitData;

        @Nullable
        private Metadata getAdjustedMetadata(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entry = metadata.get(i11);
                if ((entry instanceof PrivFrame) && io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(((PrivFrame) entry).owner)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[length - 1];
            while (i10 < length) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.get(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleQueue, io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
            return super.sampleData(dataReader, i10, z10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleQueue, io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
            super.sampleData(parsableByteArray, i10);
        }

        private c(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, DrmInitData> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.drmInitData;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.overridingDrmInitData.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata adjustedMetadata = getAdjustedMetadata(format.metadata);
            if (drmInitData2 != format.drmInitData || adjustedMetadata != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(adjustedMetadata).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        public void setDrmInitData(@Nullable DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        public void setSourceChunk(io.bidmachine.media3.exoplayer.hls.a aVar) {
            sourceId(aVar.uid);
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleQueue, io.bidmachine.media3.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(j10, i10, i11, i12, cryptoData);
        }
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i10) {
        for (int i11 = i10; i11 < this.mediaChunks.size(); i11++) {
            if (this.mediaChunks.get(i11).shouldSpliceIn) {
                return false;
            }
        }
        io.bidmachine.media3.exoplayer.hls.a aVar = this.mediaChunks.get(i10);
        for (int i12 = 0; i12 < this.sampleQueues.length; i12++) {
            if (this.sampleQueues[i12].getReadIndex() > aVar.getFirstSampleIndex(i12)) {
                return false;
            }
        }
        return true;
    }

    private TrackGroupArray createTrackGroupArrayWithDrmInfo(TrackGroup[] trackGroupArr) {
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            TrackGroup trackGroup = trackGroupArr[i10];
            Format[] formatArr = new Format[trackGroup.length];
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                Format format = trackGroup.getFormat(i11);
                formatArr[i11] = format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i10] = new TrackGroup(trackGroup.f59772id, formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    private static int getTrackTypeScore(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    private void setIsPrepared() {
        this.prepared = true;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public void maybeThrowError(int i10) throws IOException {
        maybeThrowError();
        this.sampleQueues[i10].maybeThrowError();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    private void assertIsPrepared() {
        Assertions.checkState(this.prepared);
        Assertions.checkNotNull(this.trackGroups);
        Assertions.checkNotNull(this.optionalTrackGroups);
    }

    private void buildTracksFromSampleStreams() {
        Format format;
        int length = this.sampleQueues.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((Format) Assertions.checkStateNotNull(this.sampleQueues[i12].getUpstreamFormat())).sampleMimeType;
            if (!MimeTypes.isVideo(str)) {
                i13 = MimeTypes.isAudio(str) ? 1 : MimeTypes.isText(str) ? 3 : -2;
            }
            if (getTrackTypeScore(i13) > getTrackTypeScore(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i14 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.trackGroupToSampleQueueIndex[i15] = i15;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        int i16 = 0;
        while (i16 < length) {
            Format format2 = (Format) Assertions.checkStateNotNull(this.sampleQueues[i16].getUpstreamFormat());
            if (i16 == i11) {
                Format[] formatArr = new Format[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    Format format3 = trackGroup.getFormat(i17);
                    if (i10 == 1 && (format = this.muxedAudioFormat) != null) {
                        format3 = format3.withManifestFormatInfo(format);
                    }
                    formatArr[i17] = i14 == 1 ? format2.withManifestFormatInfo(format3) : deriveFormat(format3, format2, true);
                }
                trackGroupArr[i16] = new TrackGroup(this.uid, formatArr);
                this.primaryTrackGroupIndex = i16;
            } else {
                Format format4 = (i10 == 2 && MimeTypes.isAudio(format2.sampleMimeType)) ? this.muxedAudioFormat : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.uid);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                trackGroupArr[i16] = new TrackGroup(sb2.toString(), deriveFormat(format4, format2, false));
            }
            i16++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        Assertions.checkState(this.optionalTrackGroups == null);
        this.optionalTrackGroups = Collections.emptySet();
    }

    private static DiscardingTrackOutput createDiscardingTrackOutput(int i10, int i11) {
        Log.w(TAG, "Unmapped track with id " + i10 + " of type " + i11);
        return new DiscardingTrackOutput();
    }

    private SampleQueue createSampleQueue(int i10, int i11) {
        int length = this.sampleQueues.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        c cVar = new c(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        cVar.setStartTimeUs(this.lastSeekPositionUs);
        if (z10) {
            cVar.setDrmInitData(this.drmInitData);
        }
        cVar.setSampleOffsetUs(this.sampleOffsetUs);
        io.bidmachine.media3.exoplayer.hls.a aVar = this.sourceChunk;
        if (aVar != null) {
            cVar.setSourceChunk(aVar);
        }
        cVar.setUpstreamFormatChangeListener(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.sampleQueueTrackIds, i12);
        this.sampleQueueTrackIds = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.sampleQueues = (c[]) Util.nullSafeArrayAppend(this.sampleQueues, cVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i12);
        this.sampleQueueIsAudioVideoFlags = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.haveAudioVideoSampleQueues |= z10;
        this.sampleQueueMappingDoneByType.add(Integer.valueOf(i11));
        this.sampleQueueIndicesByType.append(i11, length);
        if (getTrackTypeScore(i11) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i11;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i12);
        return cVar;
    }

    private static Format deriveFormat(@Nullable Format format, Format format2, boolean z10) {
        String codecsCorrespondingToMimeType;
        String mediaMimeType;
        if (format == null) {
            return format2;
        }
        int trackType = MimeTypes.getTrackType(format2.sampleMimeType);
        if (Util.getCodecCountOfType(format.codecs, trackType) == 1) {
            codecsCorrespondingToMimeType = Util.getCodecsOfType(format.codecs, trackType);
            mediaMimeType = MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = MimeTypes.getCodecsCorrespondingToMimeType(format.codecs, format2.sampleMimeType);
            mediaMimeType = format2.sampleMimeType;
        }
        Format.Builder codecs = format2.buildUpon().setId(format.f59767id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setAverageBitrate(z10 ? format.averageBitrate : -1).setPeakBitrate(z10 ? format.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        int i10 = format.channelCount;
        if (i10 != -1 && trackType == 1) {
            codecs.setChannelCount(i10);
        }
        Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
        if (metadataCopyWithAppendedEntriesFrom != null) {
            Metadata metadata = format2.metadata;
            if (metadata != null) {
                metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(metadataCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    private void discardUpstream(int i10) {
        Assertions.checkState(!this.loader.isLoading());
        while (true) {
            if (i10 >= this.mediaChunks.size()) {
                i10 = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = getLastMediaChunk().endTimeUs;
        io.bidmachine.media3.exoplayer.hls.a aVarDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i10);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        } else {
            ((io.bidmachine.media3.exoplayer.hls.a) y1.f(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, aVarDiscardUpstreamMediaChunksFromIndex.startTimeUs, j10);
    }

    private io.bidmachine.media3.exoplayer.hls.a discardUpstreamMediaChunksFromIndex(int i10) {
        io.bidmachine.media3.exoplayer.hls.a aVar = this.mediaChunks.get(i10);
        ArrayList<io.bidmachine.media3.exoplayer.hls.a> arrayList = this.mediaChunks;
        Util.removeRange(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.sampleQueues.length; i11++) {
            this.sampleQueues[i11].discardUpstreamSamples(aVar.getFirstSampleIndex(i11));
        }
        return aVar;
    }

    private boolean finishedReadingChunk(io.bidmachine.media3.exoplayer.hls.a aVar) {
        int i10 = aVar.uid;
        int length = this.sampleQueues.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.sampleQueuesEnabledStates[i11] && this.sampleQueues[i11].peekSourceId() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean formatsMatch(Format format, Format format2) {
        String str = format.sampleMimeType;
        String str2 = format2.sampleMimeType;
        int trackType = MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == MimeTypes.getTrackType(str2);
        }
        if (Util.areEqual(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        }
        return false;
    }

    private io.bidmachine.media3.exoplayer.hls.a getLastMediaChunk() {
        ArrayList<io.bidmachine.media3.exoplayer.hls.a> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    private TrackOutput getMappedTrackOutput(int i10, int i11) {
        Assertions.checkArgument(MAPPABLE_TYPES.contains(Integer.valueOf(i11)));
        int i12 = this.sampleQueueIndicesByType.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(Integer.valueOf(i11))) {
            this.sampleQueueTrackIds[i12] = i10;
        }
        return this.sampleQueueTrackIds[i12] == i10 ? this.sampleQueues[i12] : createDiscardingTrackOutput(i10, i11);
    }

    private void initMediaChunkLoad(io.bidmachine.media3.exoplayer.hls.a aVar) {
        this.sourceChunk = aVar;
        this.upstreamTrackFormat = aVar.trackFormat;
        this.pendingResetPositionUs = -9223372036854775807L;
        this.mediaChunks.add(aVar);
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (c cVar : this.sampleQueues) {
            aVarBuilder.a(Integer.valueOf(cVar.getWriteIndex()));
        }
        aVar.init(this, aVarBuilder.m());
        for (c cVar2 : this.sampleQueues) {
            cVar2.setSourceChunk(aVar);
            if (aVar.shouldSpliceIn) {
                cVar2.splice();
            }
        }
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof io.bidmachine.media3.exoplayer.hls.a;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlaylistUpdated$0(io.bidmachine.media3.exoplayer.hls.a aVar) {
        this.callback.onPlaylistRefreshRequired(aVar.playlistUrl);
    }

    private void mapSampleQueuesToMatchTrackGroups() {
        int i10 = this.trackGroups.length;
        int[] iArr = new int[i10];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                c[] cVarArr = this.sampleQueues;
                if (i12 >= cVarArr.length) {
                    break;
                }
                if (formatsMatch((Format) Assertions.checkStateNotNull(cVarArr[i12].getUpstreamFormat()), this.trackGroups.get(i11).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<ig.c> it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().bindSampleQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (c cVar : this.sampleQueues) {
                if (cVar.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    private void resetSampleQueues() {
        for (c cVar : this.sampleQueues) {
            cVar.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    private boolean seekInsideBufferUs(long j10, @Nullable io.bidmachine.media3.exoplayer.hls.a aVar) {
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            c cVar = this.sampleQueues[i10];
            if (!(aVar != null ? cVar.seekTo(aVar.getFirstSampleIndex(i10)) : cVar.seekTo(j10, false)) && (this.sampleQueueIsAudioVideoFlags[i10] || !this.haveAudioVideoSampleQueues)) {
                return false;
            }
        }
        return true;
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((ig.c) sampleStream);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<io.bidmachine.media3.exoplayer.hls.a> listEmptyList;
        long jMax;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            listEmptyList = Collections.emptyList();
            jMax = this.pendingResetPositionUs;
            for (c cVar : this.sampleQueues) {
                cVar.setStartTimeUs(this.pendingResetPositionUs);
            }
        } else {
            listEmptyList = this.readOnlyMediaChunks;
            io.bidmachine.media3.exoplayer.hls.a lastMediaChunk = getLastMediaChunk();
            jMax = lastMediaChunk.isLoadCompleted() ? lastMediaChunk.endTimeUs : Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
        }
        List<io.bidmachine.media3.exoplayer.hls.a> list = listEmptyList;
        long j10 = jMax;
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j10, list, this.prepared || !list.isEmpty(), this.nextChunkHolder);
        HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.nextChunkHolder;
        boolean z10 = hlsChunkHolder.endOfStream;
        Chunk chunk = hlsChunkHolder.chunk;
        Uri uri = hlsChunkHolder.playlistUrl;
        if (z10) {
            this.pendingResetPositionUs = -9223372036854775807L;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.callback.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (isMediaChunk(chunk)) {
            initMediaChunkLoad((io.bidmachine.media3.exoplayer.hls.a) chunk);
        }
        this.loadingChunk = chunk;
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void discardBuffer(long j10, boolean z10) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.sampleQueues[i10].discardTo(j10, z10, this.sampleQueuesEnabledStates[i10]);
        }
    }

    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long jMax = this.lastSeekPositionUs;
        io.bidmachine.media3.exoplayer.hls.a lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                ArrayList<io.bidmachine.media3.exoplayer.hls.a> arrayList = this.mediaChunks;
                lastMediaChunk = arrayList.get(arrayList.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (c cVar : this.sampleQueues) {
                jMax = Math.max(jMax, cVar.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j10, long j11, boolean z10) {
        this.loadingChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j10, j11, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z10) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j10, long j11) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j10, j11, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (this.prepared) {
            this.callback.onContinueLoadingRequested(this);
        } else {
            continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j10, long j11, IOException iOException, int i10) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i11;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        if (zIsMediaChunk && !((io.bidmachine.media3.exoplayer.hls.a) chunk).isPublished() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i11 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i11 == 404)) {
            return Loader.RETRY;
        }
        long jBytesLoaded = chunk.bytesLoaded();
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j10, j11, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, Util.usToMs(chunk.startTimeUs), Util.usToMs(chunk.endTimeUs)), iOException, i10);
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo);
        boolean zMaybeExcludeTrack = (fallbackSelectionFor == null || fallbackSelectionFor.type != 2) ? false : this.chunkSource.maybeExcludeTrack(chunk, fallbackSelectionFor.exclusionDurationMs);
        if (zMaybeExcludeTrack) {
            if (zIsMediaChunk && jBytesLoaded == 0) {
                ArrayList<io.bidmachine.media3.exoplayer.hls.a> arrayList = this.mediaChunks;
                Assertions.checkState(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((io.bidmachine.media3.exoplayer.hls.a) y1.f(this.mediaChunks)).invalidateExtractor();
                }
            }
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z10 = !loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, z10);
        if (z10) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (zMaybeExcludeTrack) {
            if (this.prepared) {
                this.callback.onContinueLoadingRequested(this);
            } else {
                continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
            }
        }
        return loadErrorAction;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (c cVar : this.sampleQueues) {
            cVar.release();
        }
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z10) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return true;
        }
        long j10 = (z10 || (fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo)) == null || fallbackSelectionFor.type != 2) ? -9223372036854775807L : fallbackSelectionFor.exclusionDurationMs;
        return this.chunkSource.onPlaylistError(uri, j10) && j10 != -9223372036854775807L;
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        final io.bidmachine.media3.exoplayer.hls.a aVar = (io.bidmachine.media3.exoplayer.hls.a) y1.f(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(aVar);
        if (chunkPublicationState == 1) {
            aVar.publish();
            return;
        }
        if (chunkPublicationState == 0) {
            this.handler.post(new Runnable() { // from class: ig.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54170b.lambda$onPlaylistUpdated$0(aVar);
                }
            });
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            Assertions.checkNotNull(this.loadingChunk);
            if (this.chunkSource.shouldCancelLoad(j10, this.loadingChunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j10, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    public void release() {
        if (this.prepared) {
            for (c cVar : this.sampleQueues) {
                cVar.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    public boolean seekToUs(long j10, boolean z10) {
        this.lastSeekPositionUs = j10;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j10;
            return true;
        }
        io.bidmachine.media3.exoplayer.hls.a aVar = null;
        if (this.chunkSource.hasIndependentSegments()) {
            for (int i10 = 0; i10 < this.mediaChunks.size(); i10++) {
                io.bidmachine.media3.exoplayer.hls.a aVar2 = this.mediaChunks.get(i10);
                if (aVar2.startTimeUs == j10) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (this.sampleQueuesBuilt && !z10 && seekInsideBufferUs(j10, aVar)) {
            return false;
        }
        this.pendingResetPositionUs = j10;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (c cVar : this.sampleQueues) {
                    cVar.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    public boolean selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        assertIsPrepared();
        int i10 = this.enabledTrackGroupCount;
        int i11 = 0;
        for (int i12 = 0; i12 < exoTrackSelectionArr.length; i12++) {
            ig.c cVar = (ig.c) sampleStreamArr[i12];
            if (cVar != null && (exoTrackSelectionArr[i12] == null || !zArr[i12])) {
                this.enabledTrackGroupCount--;
                cVar.unbindSampleQueue();
                sampleStreamArr[i12] = null;
            }
        }
        boolean z13 = z10 || (!this.seenFirstTrackSelection ? j10 == this.lastSeekPositionUs : i10 != 0);
        ExoTrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z14 = z13;
        ExoTrackSelection exoTrackSelection = trackSelection;
        for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i13];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.trackGroups.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.setTrackSelection(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (sampleStreamArr[i13] == null) {
                    this.enabledTrackGroupCount++;
                    ig.c cVar2 = new ig.c(this, iIndexOf);
                    sampleStreamArr[i13] = cVar2;
                    zArr2[i13] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        cVar2.bindSampleQueue();
                        if (!z14) {
                            c cVar3 = this.sampleQueues[this.trackGroupToSampleQueueIndex[iIndexOf]];
                            z14 = (cVar3.getReadIndex() == 0 || cVar3.seekTo(j10, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.pendingResetUpstreamFormats = true;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    c[] cVarArr = this.sampleQueues;
                    int length = cVarArr.length;
                    while (i11 < length) {
                        cVarArr[i11].discardToEnd();
                        i11++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else {
            if (this.mediaChunks.isEmpty() || Util.areEqual(exoTrackSelection, trackSelection)) {
                z11 = z10;
            } else {
                if (this.seenFirstTrackSelection) {
                    z12 = true;
                } else {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    io.bidmachine.media3.exoplayer.hls.a lastMediaChunk = getLastMediaChunk();
                    exoTrackSelection.updateSelectedTrack(j10, j11, -9223372036854775807L, this.readOnlyMediaChunks, this.chunkSource.createMediaChunkIterators(lastMediaChunk, j10));
                    if (exoTrackSelection.getSelectedIndexInTrackGroup() != this.chunkSource.getTrackGroup().indexOf(lastMediaChunk.trackFormat)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    this.pendingResetUpstreamFormats = true;
                    z11 = true;
                    z14 = true;
                } else {
                    z11 = z10;
                }
            }
            if (z14) {
                seekToUs(j10, z11);
                while (i11 < sampleStreamArr.length) {
                    if (sampleStreamArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z14;
    }

    public void setDrmInitData(@Nullable DrmInitData drmInitData) {
        if (Util.areEqual(this.drmInitData, drmInitData)) {
            return;
        }
        this.drmInitData = drmInitData;
        int i10 = 0;
        while (true) {
            c[] cVarArr = this.sampleQueues;
            if (i10 >= cVarArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i10]) {
                cVarArr[i10].setDrmInitData(drmInitData);
            }
            i10++;
        }
    }

    public void setIsPrimaryTimestampSource(boolean z10) {
        this.chunkSource.setIsPrimaryTimestampSource(z10);
    }

    public void setSampleOffsetUs(long j10) {
        if (this.sampleOffsetUs != j10) {
            this.sampleOffsetUs = j10;
            for (c cVar : this.sampleQueues) {
                cVar.setSampleOffsetUs(j10);
            }
        }
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        TrackOutput trackOutputCreateSampleQueue;
        if (!MAPPABLE_TYPES.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                TrackOutput[] trackOutputArr = this.sampleQueues;
                if (i12 >= trackOutputArr.length) {
                    trackOutputCreateSampleQueue = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i12] == i10) {
                    trackOutputCreateSampleQueue = trackOutputArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            trackOutputCreateSampleQueue = getMappedTrackOutput(i10, i11);
        }
        if (trackOutputCreateSampleQueue == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i10, i11);
            }
            trackOutputCreateSampleQueue = createSampleQueue(i10, i11);
        }
        if (i11 != 5) {
            return trackOutputCreateSampleQueue;
        }
        if (this.emsgUnwrappingTrackOutput == null) {
            this.emsgUnwrappingTrackOutput = new b(trackOutputCreateSampleQueue, this.metadataType);
        }
        return this.emsgUnwrappingTrackOutput;
    }

    public HlsSampleStreamWrapper(String str, int i10, Callback callback, HlsChunkSource hlsChunkSource, Map<String, DrmInitData> map, Allocator allocator, long j10, @Nullable Format format, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, int i11) {
        this.uid = str;
        this.trackType = i10;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i11;
        Set<Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new HashSet(set.size());
        this.sampleQueueIndicesByType = new SparseIntArray(set.size());
        this.sampleQueues = new c[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        ArrayList<io.bidmachine.media3.exoplayer.hls.a> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new ArrayList<>();
        this.maybeFinishPrepareRunnable = new Runnable() { // from class: ig.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f54168b.maybeFinishPrepare();
            }
        };
        this.onTracksEndedRunnable = new Runnable() { // from class: ig.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f54169b.onTracksEnded();
            }
        };
        this.handler = Util.createHandlerForCurrentLooper();
        this.lastSeekPositionUs = j10;
        this.pendingResetPositionUs = j10;
    }

    public int bindSampleQueueToSampleStream(int i10) {
        assertIsPrepared();
        Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i11 = this.trackGroupToSampleQueueIndex[i10];
        if (i11 == -1) {
            if (!this.optionalTrackGroups.contains(this.trackGroups.get(i10))) {
                return -2;
            }
            return -3;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    public boolean isReady(int i10) {
        if (!isPendingReset() && this.sampleQueues[i10].isReady(this.loadingFinished)) {
            return true;
        }
        return false;
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    public void prepareWithMultivariantPlaylistInfo(TrackGroup[] trackGroupArr, int i10, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(trackGroupArr);
        this.optionalTrackGroups = new HashSet();
        for (int i11 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i11));
        }
        this.primaryTrackGroupIndex = i10;
        Handler handler = this.handler;
        final Callback callback = this.callback;
        Objects.requireNonNull(callback);
        handler.post(new Runnable() { // from class: ig.g
            @Override // java.lang.Runnable
            public final void run() {
                callback.onPrepared();
            }
        });
        setIsPrepared();
    }

    public int readData(int i10, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        Format format;
        if (isPendingReset()) {
            return -3;
        }
        int i12 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i13 = 0;
            while (i13 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i13))) {
                i13++;
            }
            Util.removeRange(this.mediaChunks, 0, i13);
            io.bidmachine.media3.exoplayer.hls.a aVar = this.mediaChunks.get(0);
            Format format2 = aVar.trackFormat;
            if (!format2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, format2, aVar.trackSelectionReason, aVar.trackSelectionData, aVar.startTimeUs);
            }
            this.downstreamTrackFormat = format2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int i14 = this.sampleQueues[i10].read(formatHolder, decoderInputBuffer, i11, this.loadingFinished);
        if (i14 == -5) {
            Format formatWithManifestFormatInfo = (Format) Assertions.checkNotNull(formatHolder.format);
            if (i10 == this.primarySampleQueueIndex) {
                int iD = Ints.d(this.sampleQueues[i10].peekSourceId());
                while (i12 < this.mediaChunks.size() && this.mediaChunks.get(i12).uid != iD) {
                    i12++;
                }
                if (i12 < this.mediaChunks.size()) {
                    format = this.mediaChunks.get(i12).trackFormat;
                } else {
                    format = (Format) Assertions.checkNotNull(this.upstreamTrackFormat);
                }
                formatWithManifestFormatInfo = formatWithManifestFormatInfo.withManifestFormatInfo(format);
            }
            formatHolder.format = formatWithManifestFormatInfo;
        }
        return i14;
    }

    public int skipData(int i10, long j10) {
        if (isPendingReset()) {
            return 0;
        }
        c cVar = this.sampleQueues[i10];
        int skipCount = cVar.getSkipCount(j10, this.loadingFinished);
        io.bidmachine.media3.exoplayer.hls.a aVar = (io.bidmachine.media3.exoplayer.hls.a) y1.g(this.mediaChunks, null);
        if (aVar != null && !aVar.isPublished()) {
            skipCount = Math.min(skipCount, aVar.getFirstSampleIndex(i10) - cVar.getReadIndex());
        }
        cVar.skip(skipCount);
        return skipCount;
    }

    public void unbindSampleQueue(int i10) {
        assertIsPrepared();
        Assertions.checkNotNull(this.trackGroupToSampleQueueIndex);
        int i11 = this.trackGroupToSampleQueueIndex[i10];
        Assertions.checkState(this.sampleQueuesEnabledStates[i11]);
        this.sampleQueuesEnabledStates[i11] = false;
    }
}
