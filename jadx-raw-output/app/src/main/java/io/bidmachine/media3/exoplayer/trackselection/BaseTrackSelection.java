package io.bidmachine.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    public final TrackGroup group;
    private int hashCode;
    public final int length;
    public final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        return this.group.equals(baseTrackSelection.group) && Arrays.equals(this.tracks, baseTrackSelection.tracks);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
        return super.getLatestBitrateEstimate();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ int getSelectedIndex();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public abstract /* synthetic */ Object getSelectionData();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ int getSelectionReason();

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (this.formats[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
        super.onDiscontinuity();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10) {
        super.onPlayWhenReadyChanged(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f10) {
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ void onRebuffer() {
        super.onRebuffer();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j10, Chunk chunk, List list) {
        return super.shouldCancelChunkLoad(j10, chunk, list);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public abstract /* synthetic */ void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i10) {
        int i11 = 0;
        Assertions.checkState(iArr.length > 0);
        this.type = i10;
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.formats[i12] = trackGroup.getFormat(iArr[i12]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: tg.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i13 = this.length;
            if (i11 >= i13) {
                this.excludeUntilTimes = new long[i13];
                return;
            } else {
                this.tracks[i11] = trackGroup.indexOf(this.formats[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final Format getFormat(int i10) {
        return this.formats[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i10) {
        return this.tracks[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i10, long j10) {
        return this.excludeUntilTimes[i10] > j10;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j10, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i10, jElapsedRealtime);
        for (int i11 = 0; i11 < this.length && !zIsTrackExcluded; i11++) {
            if (i11 != i10 && !isTrackExcluded(i11, jElapsedRealtime)) {
                zIsTrackExcluded = true;
            } else {
                zIsTrackExcluded = false;
            }
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i10] = Math.max(jArr[i10], Util.addWithOverflowDefault(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection, io.bidmachine.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (this.tracks[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
