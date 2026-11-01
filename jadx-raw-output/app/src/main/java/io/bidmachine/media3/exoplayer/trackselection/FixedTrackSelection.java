package io.bidmachine.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class FixedTrackSelection extends BaseTrackSelection {

    @Nullable
    private final Object data;
    private final int reason;

    public FixedTrackSelection(TrackGroup trackGroup, int i10) {
        this(trackGroup, i10, 0);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
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
    public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i10, int i11) {
        this(trackGroup, i10, i11, 0, null);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.data;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i10, int i11, int i12, @Nullable Object obj) {
        super(trackGroup, new int[]{i10}, i11);
        this.reason = i12;
        this.data = obj;
    }
}
