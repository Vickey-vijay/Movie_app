package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSourceUtil;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.StatsDataSource;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements MediaPeriod, Loader.Callback<c> {
    private static final int INITIAL_SAMPLE_SIZE = 1024;
    private static final String TAG = "SingleSampleMediaPeriod";
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    public final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    public boolean loadingFinished;
    public byte[] sampleData;
    public int sampleSize;
    private final TrackGroupArray tracks;

    @Nullable
    private final TransferListener transferListener;
    public final boolean treatLoadErrorsAsEndOfStream;
    private final ArrayList<b> sampleStreams = new ArrayList<>();
    public final Loader loader = new Loader(TAG);

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public final class b implements SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private boolean notifiedDownstreamFormat;
        private int streamState;

        private b() {
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            e.this.eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(e.this.format.sampleMimeType), e.this.format, 0, null, 0L);
            this.notifiedDownstreamFormat = true;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return e.this.loadingFinished;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            e eVar = e.this;
            if (eVar.treatLoadErrorsAsEndOfStream) {
                return;
            }
            eVar.loader.maybeThrowError();
        }

        public void reset() {
            if (this.streamState == 2) {
                this.streamState = 1;
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            maybeNotifyDownstreamFormat();
            e eVar = e.this;
            boolean z10 = eVar.loadingFinished;
            if (z10 && eVar.sampleData == null) {
                this.streamState = 2;
            }
            int i11 = this.streamState;
            if (i11 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i10 & 2) == 0 && i11 != 0) {
                if (!z10) {
                    return -3;
                }
                Assertions.checkNotNull(eVar.sampleData);
                decoderInputBuffer.addFlag(1);
                decoderInputBuffer.timeUs = 0L;
                if ((i10 & 4) == 0) {
                    decoderInputBuffer.ensureSpaceForWrite(e.this.sampleSize);
                    ByteBuffer byteBuffer = decoderInputBuffer.data;
                    e eVar2 = e.this;
                    byteBuffer.put(eVar2.sampleData, 0, eVar2.sampleSize);
                }
                if ((i10 & 1) == 0) {
                    this.streamState = 2;
                }
                return -4;
            }
            formatHolder.format = eVar.format;
            this.streamState = 1;
            return -5;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            maybeNotifyDownstreamFormat();
            if (j10 > 0 && this.streamState != 2) {
                this.streamState = 2;
                return 1;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: SingleSampleMediaPeriod.java */
    public static final class c implements Loader.Loadable {
        private final StatsDataSource dataSource;
        public final DataSpec dataSpec;
        public final long loadTaskId = LoadEventInfo.getNewId();

        @Nullable
        private byte[] sampleData;

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            this.dataSource.resetBytesRead();
            try {
                this.dataSource.open(this.dataSpec);
                int i10 = 0;
                while (i10 != -1) {
                    int bytesRead = (int) this.dataSource.getBytesRead();
                    byte[] bArr = this.sampleData;
                    if (bArr == null) {
                        this.sampleData = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.sampleData = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    StatsDataSource statsDataSource = this.dataSource;
                    byte[] bArr2 = this.sampleData;
                    i10 = statsDataSource.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
            } finally {
                DataSourceUtil.closeQuietly(this.dataSource);
            }
        }

        public c(DataSpec dataSpec, DataSource dataSource) {
            this.dataSpec = dataSpec;
            this.dataSource = new StatsDataSource(dataSource);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.sampleStreams.size(); i10++) {
            this.sampleStreams.get(i10).reset();
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            SampleStream sampleStream = sampleStreamArr[i10];
            if (sampleStream != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                this.sampleStreams.remove(sampleStream);
                sampleStreamArr[i10] = null;
            }
            if (sampleStreamArr[i10] == null && exoTrackSelectionArr[i10] != null) {
                b bVar = new b();
                this.sampleStreams.add(bVar);
                sampleStreamArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        c cVar = new c(this.dataSpec, dataSourceCreateDataSource);
        this.eventDispatcher.loadStarted(new LoadEventInfo(cVar.loadTaskId, this.dataSpec, this.loader.startLoading(cVar, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1))), 1, -1, this.format, 0, null, 0L, this.durationUs);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.loadingFinished || this.loader.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(c cVar, long j10, long j11, boolean z10) {
        StatsDataSource statsDataSource = cVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(cVar.loadTaskId, cVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(cVar.loadTaskId);
        this.eventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, 0L, this.durationUs);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(c cVar, long j10, long j11) {
        this.sampleSize = (int) cVar.dataSource.getBytesRead();
        this.sampleData = (byte[]) Assertions.checkNotNull(cVar.sampleData);
        this.loadingFinished = true;
        StatsDataSource statsDataSource = cVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(cVar.loadTaskId, cVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, this.sampleSize);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(cVar.loadTaskId);
        this.eventDispatcher.loadCompleted(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs);
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = cVar.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(cVar.loadTaskId, cVar.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j10, j11, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, this.format, 0, null, 0L, Util.usToMs(this.durationUs)), iOException, i10));
        boolean z10 = retryDelayMsFor == -9223372036854775807L || i10 >= this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1);
        if (this.treatLoadErrorsAsEndOfStream && z10) {
            Log.w(TAG, "Loading failed, treating as end-of-stream.", iOException);
            this.loadingFinished = true;
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            loadErrorActionCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z11 = !loadErrorAction.isRetry();
        this.eventDispatcher.loadError(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs, iOException, z11);
        if (z11) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(cVar.loadTaskId);
        }
        return loadErrorAction;
    }

    public void release() {
        this.loader.release();
    }

    public e(DataSpec dataSpec, DataSource.Factory factory, @Nullable TransferListener transferListener, Format format, long j10, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z10) {
        this.dataSpec = dataSpec;
        this.dataSourceFactory = factory;
        this.transferListener = transferListener;
        this.format = format;
        this.durationUs = j10;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher;
        this.treatLoadErrorsAsEndOfStream = z10;
        this.tracks = new TrackGroupArray(new TrackGroup(format));
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        callback.onPrepared(this);
    }
}
