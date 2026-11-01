package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    private static final Void CHILD_SOURCE_ID = null;
    public final MediaSource mediaSource;

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(long j10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return j10;
    }

    public int getWindowIndexForChildWindowIndex(int i10) {
        return i10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public final void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareSourceInternal();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return this.mediaSource.createPeriod(mediaPeriodId, allocator, j10);
    }

    public final void disableChildSource() {
        disableChildSource(CHILD_SOURCE_ID);
    }

    public final void enableChildSource() {
        enableChildSource(CHILD_SOURCE_ID);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return this.mediaSource.getInitialTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public final MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void r10, MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaPeriodIdForChildMediaPeriodId(mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public final long getMediaTimeForChildMediaTime(Void r10, long j10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return getMediaTimeForChildMediaTime(j10, mediaPeriodId);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    public final int getWindowIndexForChildWindowIndex(Void r10, int i10) {
        return getWindowIndexForChildWindowIndex(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return this.mediaSource.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void lambda$prepareChildSource$0(Void r10, MediaSource mediaSource, Timeline timeline) {
        onChildSourceInfoRefreshed(timeline);
    }

    public final void prepareChildSource() {
        prepareChildSource(CHILD_SOURCE_ID, this.mediaSource);
    }

    public final void releaseChildSource() {
        releaseChildSource(CHILD_SOURCE_ID);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.mediaSource.updateMediaItem(mediaItem);
    }

    public WrappingMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    public void onChildSourceInfoRefreshed(Timeline timeline) {
        refreshSourceInfo(timeline);
    }

    public void prepareSourceInternal() {
        prepareChildSource();
    }
}
