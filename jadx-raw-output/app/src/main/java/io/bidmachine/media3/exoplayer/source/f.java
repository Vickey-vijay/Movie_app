package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private final MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    /* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
    public static final class a implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.sampleStream.maybeThrowError();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            int data = this.sampleStream.readData(formatHolder, decoderInputBuffer, i10);
            if (data == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return data;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            return this.sampleStream.skipData(j10 - this.timeOffsetUs);
        }

        public a(SampleStream sampleStream, long j10) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j10;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i10 = 0;
        while (true) {
            SampleStream childStream = null;
            if (i10 >= sampleStreamArr.length) {
                break;
            }
            a aVar = (a) sampleStreamArr[i10];
            if (aVar != null) {
                childStream = aVar.getChildStream();
            }
            sampleStreamArr2[i10] = childStream;
            i10++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j10 - this.timeOffsetUs);
        for (int i11 = 0; i11 < sampleStreamArr.length; i11++) {
            SampleStream sampleStream = sampleStreamArr2[i11];
            if (sampleStream == null) {
                sampleStreamArr[i11] = null;
            } else {
                SampleStream sampleStream2 = sampleStreamArr[i11];
                if (sampleStream2 == null || ((a) sampleStream2).getChildStream() != sampleStream) {
                    sampleStreamArr[i11] = new a(sampleStream, this.timeOffsetUs);
                }
            }
        }
        return jSelectTracks + this.timeOffsetUs;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(loadingInfo.playbackPositionUs - this.timeOffsetUs).build());
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        this.mediaPeriod.discardBuffer(j10 - this.timeOffsetUs, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j10 - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.timeOffsetUs + bufferedPositionUs;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.timeOffsetUs + nextLoadPositionUs;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public MediaPeriod getWrappedMediaPeriod() {
        return this.mediaPeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j10 - this.timeOffsetUs);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long discontinuity = this.mediaPeriod.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.timeOffsetUs + discontinuity;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.mediaPeriod.reevaluateBuffer(j10 - this.timeOffsetUs);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        return this.mediaPeriod.seekToUs(j10 - this.timeOffsetUs) + this.timeOffsetUs;
    }

    public f(MediaPeriod mediaPeriod, long j10) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j10;
    }
}
