package io.bidmachine.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public static final class Factory implements ExoTrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ExoTrackSelection lambda$createTrackSelections$0(ExoTrackSelection.Definition definition) {
            return new RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: tg.r
                @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
                    return this.f72392a.lambda$createTrackSelections$0(definition);
                }
            });
        }

        public Factory(int i10) {
            this.random = new Random(i10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, Chunk chunk, List list) {
        return super.shouldCancelChunkLoad(j10, chunk, list);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i10, Random random) {
        super(trackGroup, iArr, i10);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.length; i11++) {
            if (!isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.selectedIndex = this.random.nextInt(i10);
        if (i10 != this.length) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.length; i13++) {
                if (!isTrackExcluded(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.selectedIndex == i12) {
                        this.selectedIndex = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }
}
