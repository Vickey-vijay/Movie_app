package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;

    @Nullable
    private ClippingMediaSource.IllegalClippingException clippingError;
    public long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private a[] sampleStreams = new a[0];
    public long startUs;

    public final class a implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public void clearSentEos() {
            this.sentEos = false;
        }

        public a(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = ClippingMediaPeriod.this.getBufferedPositionUs();
            int data = this.childStream.readData(formatHolder, decoderInputBuffer, i10);
            if (data == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i11 = format.encoderDelay;
                if (i11 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.startUs != 0) {
                        i11 = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i11).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            long j10 = ClippingMediaPeriod.this.endUs;
            if (j10 == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j10) && !(data == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return data;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // io.bidmachine.media3.exoplayer.source.SampleStream
        public int skipData(long j10) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.sampleStreams = new a[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i10 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i10 >= sampleStreamArr.length) {
                break;
            }
            a[] aVarArr = this.sampleStreams;
            a aVar = (a) sampleStreamArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                sampleStream = aVar.childStream;
            }
            sampleStreamArr2[i10] = sampleStream;
            i10++;
        }
        long jSelectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j10);
        if (isPendingInitialDiscontinuity()) {
            long j12 = this.startUs;
            if (j10 == j12 && shouldKeepInitialDiscontinuity(j12, exoTrackSelectionArr)) {
                j11 = jSelectTracks;
            } else {
                j11 = -9223372036854775807L;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.pendingInitialDiscontinuityPositionUs = j11;
        if (jSelectTracks != j10) {
            if (jSelectTracks >= this.startUs) {
                long j13 = this.endUs;
                z10 = j13 == Long.MIN_VALUE || jSelectTracks <= j13;
            }
        }
        Assertions.checkState(z10);
        for (int i11 = 0; i11 < sampleStreamArr.length; i11++) {
            SampleStream sampleStream2 = sampleStreamArr2[i11];
            if (sampleStream2 == null) {
                this.sampleStreams[i11] = null;
            } else {
                a[] aVarArr2 = this.sampleStreams;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.childStream != sampleStream2) {
                    aVarArr2[i11] = new a(sampleStream2);
                }
            }
            sampleStreamArr[i11] = this.sampleStreams[i11];
        }
        return jSelectTracks;
    }

    private SeekParameters clipSeekParameters(long j10, SeekParameters seekParameters) {
        long jConstrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j10 - this.startUs);
        long j11 = seekParameters.toleranceAfterUs;
        long j12 = this.endUs;
        long jConstrainValue2 = Util.constrainValue(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jConstrainValue == seekParameters.toleranceBeforeUs && jConstrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(jConstrainValue, jConstrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j10, ExoTrackSelection[] exoTrackSelectionArr) {
        if (j10 != 0) {
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        this.mediaPeriod.discardBuffer(j10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        long j11 = this.startUs;
        if (j10 == j11) {
            return j11;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j10, clipSeekParameters(j10, seekParameters));
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.endUs;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.endUs;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.mediaPeriod.reevaluateBuffer(j10);
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    public void updateClipping(long j10, long j11) {
        this.startUs = j10;
        this.endUs = j11;
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z10, long j10, long j11) {
        long j12;
        this.mediaPeriod = mediaPeriod;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.pendingInitialDiscontinuityPositionUs = j12;
        this.startUs = j10;
        this.endUs = j11;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        boolean z10;
        if (isPendingInitialDiscontinuity()) {
            long j10 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            if (discontinuity != -9223372036854775807L) {
                return discontinuity;
            }
            return j10;
        }
        long discontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = true;
        if (discontinuity2 >= this.startUs) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        long j11 = this.endUs;
        if (j11 != Long.MIN_VALUE && discontinuity2 > j11) {
            z11 = false;
        }
        Assertions.checkState(z11);
        return discontinuity2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.sampleStreams) {
            if (aVar != null) {
                aVar.clearSentEos();
            }
        }
        long jSeekToUs = this.mediaPeriod.seekToUs(j10);
        if (jSeekToUs != j10) {
            if (jSeekToUs >= this.startUs) {
                long j11 = this.endUs;
                if (j11 == Long.MIN_VALUE || jSeekToUs <= j11) {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
        }
        Assertions.checkState(z10);
        return jSeekToUs;
    }
}
