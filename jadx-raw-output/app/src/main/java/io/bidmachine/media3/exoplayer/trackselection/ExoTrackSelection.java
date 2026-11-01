package io.bidmachine.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {
        private static final String TAG = "ETSDefinition";
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public Definition(TrackGroup trackGroup, int[] iArr, int i10) {
            if (iArr.length == 0) {
                Log.e(TAG, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i10;
        }
    }

    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends MediaChunk> list);

    boolean excludeTrack(int i10, long j10);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ Format getFormat(int i10);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int getIndexInTrackGroup(int i10);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ TrackGroup getTrackGroup();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int getType();

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int indexOf(int i10);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int indexOf(Format format);

    boolean isTrackExcluded(int i10, long j10);

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    /* synthetic */ int length();

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }

    void onPlaybackSpeed(float f10);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);
}
