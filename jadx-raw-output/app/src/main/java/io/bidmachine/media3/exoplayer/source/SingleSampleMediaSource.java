package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import m5.g;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;

    @Nullable
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private Object tag;

        @Nullable
        private String trackId;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private boolean treatLoadErrorsAsEndOfStream = true;

        public SingleSampleMediaSource createMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, long j10) {
            return new SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j10, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag);
        }

        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        public Factory setTrackId(@Nullable String str) {
            this.trackId = str;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z10) {
            this.treatLoadErrorsAsEndOfStream = z10;
            return this;
        }

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = (DataSource.Factory) Assertions.checkNotNull(factory);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(MediaItem mediaItem) {
        return super.canUpdateMediaItem(mediaItem);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    @UnstableApi
    public /* bridge */ /* synthetic */ Timeline getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ void updateMediaItem(MediaItem mediaItem) {
        super.updateMediaItem(mediaItem);
    }

    private SingleSampleMediaSource(@Nullable String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j10, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z10, @Nullable Object obj) {
        this.dataSourceFactory = factory;
        this.durationUs = j10;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z10;
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(ImmutableList.of(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = mediaItemBuild;
        Format.Builder label = new Format.Builder().setSampleMimeType((String) g.a(subtitleConfiguration.mimeType, "text/x-unknown")).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label);
        String str2 = subtitleConfiguration.f59769id;
        this.format = label.setId(str2 == null ? str : str2).build();
        this.dataSpec = new DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new SinglePeriodTimeline(j10, true, false, false, (Object) null, mediaItemBuild);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        return new e(this.dataSpec, this.dataSourceFactory, this.transferListener, this.format, this.durationUs, this.loadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((e) mediaPeriod).release();
    }
}
