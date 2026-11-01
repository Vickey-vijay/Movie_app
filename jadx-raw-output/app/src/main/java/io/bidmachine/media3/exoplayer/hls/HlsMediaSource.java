package io.bidmachine.media3.exoplayer.hls;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaLibraryInfo;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.hls.playlist.DefaultHlsPlaylistParserFactory;
import io.bidmachine.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.hls.playlist.FilteringHlsPlaylistParserFactory;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import io.bidmachine.media3.exoplayer.source.BaseMediaSource;
import io.bidmachine.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import io.bidmachine.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.MediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.SinglePeriodTimeline;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final HlsExtractorFactory extractorFactory;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @GuardedBy("this")
    private MediaItem mediaItem;

    @Nullable
    private TransferListener mediaTransferListener;
    private final int metadataType;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final boolean useSessionKeys;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f59888a = 0;
        private boolean allowChunklessPreparation;

        @Nullable
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private HlsExtractorFactory extractorFactory;
        private final HlsDataSourceFactory hlsDataSourceFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private int metadataType;
        private HlsPlaylistParserFactory playlistParserFactory;
        private HlsPlaylistTracker.Factory playlistTrackerFactory;
        private long timestampAdjusterInitializationTimeoutMs;
        private boolean useSessionKeys;

        public Factory(DataSource.Factory factory) {
            this(new DefaultHlsDataSourceFactory(factory));
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory) {
            this.hlsDataSourceFactory = (HlsDataSourceFactory) Assertions.checkNotNull(hlsDataSourceFactory);
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.playlistParserFactory = new DefaultHlsPlaylistParserFactory();
            this.playlistTrackerFactory = DefaultHlsPlaylistTracker.FACTORY;
            this.extractorFactory = HlsExtractorFactory.DEFAULT;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            this.metadataType = 1;
            this.elapsedRealTimeOffsetMs = -9223372036854775807L;
            this.allowChunklessPreparation = true;
            experimentalParseSubtitlesDuringExtraction(true);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public HlsMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            HlsPlaylistParserFactory hlsPlaylistParserFactory = this.playlistParserFactory;
            List<StreamKey> list = mediaItem.localConfiguration.streamKeys;
            HlsPlaylistParserFactory filteringHlsPlaylistParserFactory = !list.isEmpty() ? new FilteringHlsPlaylistParserFactory(hlsPlaylistParserFactory, list) : hlsPlaylistParserFactory;
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            CmcdConfiguration cmcdConfigurationCreateCmcdConfiguration = factory == null ? null : factory.createCmcdConfiguration(mediaItem);
            HlsDataSourceFactory hlsDataSourceFactory = this.hlsDataSourceFactory;
            HlsExtractorFactory hlsExtractorFactory = this.extractorFactory;
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.compositeSequenceableLoaderFactory;
            DrmSessionManager drmSessionManager = this.drmSessionManagerProvider.get(mediaItem);
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            return new HlsMediaSource(mediaItem, hlsDataSourceFactory, hlsExtractorFactory, compositeSequenceableLoaderFactory, cmcdConfigurationCreateCmcdConfiguration, drmSessionManager, loadErrorHandlingPolicy, this.playlistTrackerFactory.createTracker(this.hlsDataSourceFactory, loadErrorHandlingPolicy, filteringHlsPlaylistParserFactory), this.elapsedRealTimeOffsetMs, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, this.timestampAdjusterInitializationTimeoutMs);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @Deprecated
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.extractorFactory.experimentalParseSubtitlesDuringExtraction(z10);
            return this;
        }

        public Factory setAllowChunklessPreparation(boolean z10) {
            this.allowChunklessPreparation = z10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (CmcdConfiguration.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory, "HlsMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @VisibleForTesting
        public Factory setElapsedRealTimeOffsetMs(long j10) {
            this.elapsedRealTimeOffsetMs = j10;
            return this;
        }

        public Factory setExtractorFactory(@Nullable HlsExtractorFactory hlsExtractorFactory) {
            if (hlsExtractorFactory == null) {
                hlsExtractorFactory = HlsExtractorFactory.DEFAULT;
            }
            this.extractorFactory = hlsExtractorFactory;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory setMetadataType(int i10) {
            this.metadataType = i10;
            return this;
        }

        public Factory setPlaylistParserFactory(HlsPlaylistParserFactory hlsPlaylistParserFactory) {
            this.playlistParserFactory = (HlsPlaylistParserFactory) Assertions.checkNotNull(hlsPlaylistParserFactory, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory setPlaylistTrackerFactory(HlsPlaylistTracker.Factory factory) {
            this.playlistTrackerFactory = (HlsPlaylistTracker.Factory) Assertions.checkNotNull(factory, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.extractorFactory.setSubtitleParserFactory((SubtitleParser.Factory) Assertions.checkNotNull(factory));
            return this;
        }

        public Factory setTimestampAdjusterInitializationTimeoutMs(long j10) {
            this.timestampAdjusterInitializationTimeoutMs = j10;
            return this;
        }

        public Factory setUseSessionKeys(boolean z10) {
            this.useSessionKeys = z10;
            return this;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    @Nullable
    private static HlsMediaPlaylist.Part findClosestPrecedingIndependentPart(List<HlsMediaPlaylist.Part> list, long j10) {
        HlsMediaPlaylist.Part part = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            HlsMediaPlaylist.Part part2 = list.get(i10);
            long j11 = part2.relativeStartTimeUs;
            if (j11 > j10 || !part2.isIndependent) {
                if (j11 > j10) {
                    break;
                }
            } else {
                part = part2;
            }
        }
        return part;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @Nullable
    @UnstableApi
    public /* bridge */ /* synthetic */ Timeline getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    @UnstableApi
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.hls");
    }

    private HlsMediaSource(MediaItem mediaItem, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.extractorFactory = hlsExtractorFactory;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j10;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
        this.timestampAdjusterInitializationTimeoutMs = j11;
    }

    private SinglePeriodTimeline createTimelineForLive(HlsMediaPlaylist hlsMediaPlaylist, long j10, long j11, HlsManifest hlsManifest) {
        long initialStartTimeUs = hlsMediaPlaylist.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j12 = hlsMediaPlaylist.hasEndTag ? initialStartTimeUs + hlsMediaPlaylist.durationUs : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(hlsMediaPlaylist);
        long j13 = this.liveConfiguration.targetOffsetMs;
        updateLiveConfiguration(hlsMediaPlaylist, Util.constrainValue(j13 != -9223372036854775807L ? Util.msToUs(j13) : getTargetLiveOffsetUs(hlsMediaPlaylist, liveEdgeOffsetUs), liveEdgeOffsetUs, hlsMediaPlaylist.durationUs + liveEdgeOffsetUs));
        return new SinglePeriodTimeline(j10, j11, -9223372036854775807L, j12, hlsMediaPlaylist.durationUs, initialStartTimeUs, getLiveWindowDefaultStartPositionUs(hlsMediaPlaylist, liveEdgeOffsetUs), true, !hlsMediaPlaylist.hasEndTag, hlsMediaPlaylist.playlistType == 2 && hlsMediaPlaylist.hasPositiveStartOffset, hlsManifest, getMediaItem(), this.liveConfiguration);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    private SinglePeriodTimeline createTimelineForOnDemand(HlsMediaPlaylist hlsMediaPlaylist, long j10, long j11, HlsManifest hlsManifest) {
        long j12;
        if (hlsMediaPlaylist.startOffsetUs == -9223372036854775807L || hlsMediaPlaylist.segments.isEmpty()) {
            j12 = 0;
        } else if (hlsMediaPlaylist.preciseStart) {
            j12 = hlsMediaPlaylist.startOffsetUs;
        } else {
            long j13 = hlsMediaPlaylist.startOffsetUs;
            if (j13 == hlsMediaPlaylist.durationUs) {
                j12 = hlsMediaPlaylist.startOffsetUs;
            } else {
                j12 = findClosestPrecedingSegment(hlsMediaPlaylist.segments, j13).relativeStartTimeUs;
            }
        }
        long j14 = hlsMediaPlaylist.durationUs;
        return new SinglePeriodTimeline(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, hlsManifest, getMediaItem(), null);
    }

    private long getLiveEdgeOffsetUs(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist.hasProgramDateTime) {
            return Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealTimeOffsetMs)) - hlsMediaPlaylist.getEndTimeUs();
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(HlsMediaPlaylist hlsMediaPlaylist, long j10) {
        long jMsToUs = hlsMediaPlaylist.startOffsetUs;
        if (jMsToUs == -9223372036854775807L) {
            jMsToUs = (hlsMediaPlaylist.durationUs + j10) - Util.msToUs(this.liveConfiguration.targetOffsetMs);
        }
        if (hlsMediaPlaylist.preciseStart) {
            return jMsToUs;
        }
        HlsMediaPlaylist.Part partFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(hlsMediaPlaylist.trailingParts, jMsToUs);
        if (partFindClosestPrecedingIndependentPart != null) {
            return partFindClosestPrecedingIndependentPart.relativeStartTimeUs;
        }
        if (hlsMediaPlaylist.segments.isEmpty()) {
            return 0L;
        }
        HlsMediaPlaylist.Segment segmentFindClosestPrecedingSegment = findClosestPrecedingSegment(hlsMediaPlaylist.segments, jMsToUs);
        HlsMediaPlaylist.Part partFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(segmentFindClosestPrecedingSegment.parts, jMsToUs);
        return partFindClosestPrecedingIndependentPart2 != null ? partFindClosestPrecedingIndependentPart2.relativeStartTimeUs : segmentFindClosestPrecedingSegment.relativeStartTimeUs;
    }

    private static long getTargetLiveOffsetUs(HlsMediaPlaylist hlsMediaPlaylist, long j10) {
        long j11;
        HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
        long j12 = hlsMediaPlaylist.startOffsetUs;
        if (j12 != -9223372036854775807L) {
            j11 = hlsMediaPlaylist.durationUs - j12;
        } else {
            long j13 = serverControl.partHoldBackUs;
            if (j13 == -9223372036854775807L || hlsMediaPlaylist.partTargetDurationUs == -9223372036854775807L) {
                long j14 = serverControl.holdBackUs;
                j11 = j14 != -9223372036854775807L ? j14 : hlsMediaPlaylist.targetDurationUs * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        return new b(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, allocator, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId(), this.timestampAdjusterInitializationTimeoutMs);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
    }

    @Override // io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist) {
        long jUsToMs = hlsMediaPlaylist.hasProgramDateTime ? Util.usToMs(hlsMediaPlaylist.startTimeUs) : -9223372036854775807L;
        int i10 = hlsMediaPlaylist.playlistType;
        long j10 = (i10 == 2 || i10 == 1) ? jUsToMs : -9223372036854775807L;
        HlsManifest hlsManifest = new HlsManifest((HlsMultivariantPlaylist) Assertions.checkNotNull(this.playlistTracker.getMultivariantPlaylist()), hlsMediaPlaylist);
        refreshSourceInfo(this.playlistTracker.isLive() ? createTimelineForLive(hlsMediaPlaylist, j10, jUsToMs, hlsManifest) : createTimelineForOnDemand(hlsMediaPlaylist, j10, jUsToMs, hlsManifest));
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        this.playlistTracker.start(((MediaItem.LocalConfiguration) Assertions.checkNotNull(getMediaItem().localConfiguration)).uri, createEventDispatcher(null), this);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((b) mediaPeriod).release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }

    private static HlsMediaPlaylist.Segment findClosestPrecedingSegment(List<HlsMediaPlaylist.Segment> list, long j10) {
        return list.get(Util.binarySearchFloor((List<? extends Comparable<? super Long>>) list, Long.valueOf(j10), true, true));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    private void updateLiveConfiguration(HlsMediaPlaylist hlsMediaPlaylist, long j10) {
        boolean z10;
        float f10;
        MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        if (liveConfiguration.minPlaybackSpeed == -3.4028235E38f && liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
            HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
            if (serverControl.holdBackUs == -9223372036854775807L && serverControl.partHoldBackUs == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        MediaItem.LiveConfiguration.Builder targetOffsetMs = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(Util.usToMs(j10));
        float f11 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = this.liveConfiguration.minPlaybackSpeed;
        }
        MediaItem.LiveConfiguration.Builder minPlaybackSpeed = targetOffsetMs.setMinPlaybackSpeed(f10);
        if (!z10) {
            f11 = this.liveConfiguration.maxPlaybackSpeed;
        }
        this.liveConfiguration = minPlaybackSpeed.setMaxPlaybackSpeed(f11).build();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem mediaItem2 = getMediaItem();
        MediaItem.LocalConfiguration localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem2.localConfiguration);
        MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        if (localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(localConfiguration2.drmConfiguration, localConfiguration.drmConfiguration) && mediaItem2.liveConfiguration.equals(mediaItem.liveConfiguration)) {
            return true;
        }
        return false;
    }
}
