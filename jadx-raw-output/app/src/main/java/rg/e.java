package rg;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.SampleStream;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PreloadMediaPeriod.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements MediaPeriod {

    @Nullable
    private MediaPeriod.Callback callback;
    public final MediaPeriod mediaPeriod;

    @Nullable
    private b preloadTrackSelectionHolder;
    private boolean prepareInternalCalled;
    private boolean prepared;

    /* JADX INFO: compiled from: PreloadMediaPeriod.java */
    public class a implements MediaPeriod.Callback {
        public a() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(e.this.callback)).onContinueLoadingRequested(e.this);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            e.this.prepared = true;
            ((MediaPeriod.Callback) Assertions.checkNotNull(e.this.callback)).onPrepared(e.this);
        }
    }

    private void prepareInternal(long j10) {
        this.prepareInternalCalled = true;
        this.mediaPeriod.prepare(new a(), j10);
    }

    private long selectTracksInternal(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        b bVar = this.preloadTrackSelectionHolder;
        if (bVar == null) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j10);
        }
        Assertions.checkState(sampleStreamArr.length == bVar.streams.length);
        b bVar2 = this.preloadTrackSelectionHolder;
        if (j10 == bVar2.trackSelectionPositionUs) {
            b bVar3 = (b) Assertions.checkNotNull(bVar2);
            long jSelectTracks = bVar3.trackSelectionPositionUs;
            boolean[] zArr3 = bVar3.streamResetFlags;
            if (maybeUpdatePreloadTrackSelectionHolderForReselection(exoTrackSelectionArr, bVar3)) {
                zArr3 = new boolean[zArr3.length];
                jSelectTracks = this.mediaPeriod.selectTracks(bVar3.selections, bVar3.mayRetainStreamFlags, bVar3.streams, zArr3, bVar3.trackSelectionPositionUs);
                int i10 = 0;
                while (true) {
                    boolean[] zArr4 = bVar3.mayRetainStreamFlags;
                    if (i10 >= zArr4.length) {
                        break;
                    }
                    if (zArr4[i10]) {
                        zArr3[i10] = true;
                    }
                    i10++;
                }
            }
            SampleStream[] sampleStreamArr2 = bVar3.streams;
            System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, sampleStreamArr2.length);
            System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
            this.preloadTrackSelectionHolder = null;
            return jSelectTracks;
        }
        int i11 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.preloadTrackSelectionHolder.streams;
            if (i11 >= sampleStreamArr3.length) {
                this.preloadTrackSelectionHolder = null;
                return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j10);
            }
            SampleStream sampleStream = sampleStreamArr3[i11];
            if (sampleStream != null) {
                sampleStreamArr[i11] = sampleStream;
                zArr[i11] = false;
            }
            i11++;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    public long selectTracksForPreloading(ExoTrackSelection[] exoTrackSelectionArr, long j10) {
        SampleStream[] sampleStreamArr = new SampleStream[exoTrackSelectionArr.length];
        boolean[] zArr = new boolean[exoTrackSelectionArr.length];
        boolean[] zArr2 = new boolean[exoTrackSelectionArr.length];
        long jSelectTracksInternal = selectTracksInternal(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, j10);
        this.preloadTrackSelectionHolder = new b(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, jSelectTracksInternal);
        return jSelectTracksInternal;
    }

    /* JADX INFO: compiled from: PreloadMediaPeriod.java */
    public static class b {
        public final boolean[] mayRetainStreamFlags;
        public final ExoTrackSelection[] selections;
        public final boolean[] streamResetFlags;
        public final SampleStream[] streams;
        public final long trackSelectionPositionUs;

        public b(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            this.selections = exoTrackSelectionArr;
            this.mayRetainStreamFlags = zArr;
            this.streams = sampleStreamArr;
            this.streamResetFlags = zArr2;
            this.trackSelectionPositionUs = j10;
        }
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
        return this.mediaPeriod.getAdjustedSeekPositionUs(j10, seekParameters);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.mediaPeriod.getBufferedPositionUs();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.mediaPeriod.getNextLoadPositionUs();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    public void preload(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        }
        if (this.prepareInternalCalled) {
            return;
        }
        prepareInternal(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        } else {
            if (this.prepareInternalCalled) {
                return;
            }
            prepareInternal(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return this.mediaPeriod.readDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod, io.bidmachine.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.mediaPeriod.reevaluateBuffer(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j10) {
        return this.mediaPeriod.seekToUs(j10);
    }

    public e(MediaPeriod mediaPeriod) {
        this.mediaPeriod = mediaPeriod;
    }

    private static boolean isSameAdaptionSet(ExoTrackSelection exoTrackSelection, ExoTrackSelection exoTrackSelection2) {
        if (!Objects.equals(exoTrackSelection.getTrackGroup(), exoTrackSelection2.getTrackGroup()) || exoTrackSelection.length() != exoTrackSelection2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < exoTrackSelection.length(); i10++) {
            if (exoTrackSelection.getIndexInTrackGroup(i10) != exoTrackSelection2.getIndexInTrackGroup(i10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean maybeUpdatePreloadTrackSelectionHolderForReselection(ExoTrackSelection[] exoTrackSelectionArr, b bVar) {
        ExoTrackSelection[] exoTrackSelectionArr2 = ((b) Assertions.checkNotNull(bVar)).selections;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < exoTrackSelectionArr.length) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr2[i10];
            if (exoTrackSelection != null || exoTrackSelection2 != null) {
                bVar.mayRetainStreamFlags[i10] = false;
                if (exoTrackSelection == null) {
                    bVar.selections[i10] = null;
                } else if (exoTrackSelection2 == null || !isSameAdaptionSet(exoTrackSelection, exoTrackSelection2)) {
                    bVar.selections[i10] = exoTrackSelection;
                } else if (exoTrackSelection.getTrackGroup().type != 2 && exoTrackSelection.getTrackGroup().type != 1 && exoTrackSelection.getSelectedIndexInTrackGroup() != exoTrackSelection2.getSelectedIndexInTrackGroup()) {
                    bVar.selections[i10] = exoTrackSelection;
                } else {
                    bVar.mayRetainStreamFlags[i10] = true;
                }
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        return selectTracksInternal(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j10);
    }
}
