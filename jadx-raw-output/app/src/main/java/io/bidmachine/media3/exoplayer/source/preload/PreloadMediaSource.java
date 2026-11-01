package io.bidmachine.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.WrappingMediaSource;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectorResult;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.util.Arrays;
import rg.e;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class PreloadMediaSource extends WrappingMediaSource {
    private static final String TAG = "PreloadMediaSource";
    private final Allocator allocator;
    private final BandwidthMeter bandwidthMeter;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;

    @Nullable
    private Pair<e, MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final PreloadControl preloadControl;
    private final Handler preloadHandler;

    @Nullable
    private Pair<e, b> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;

    @Nullable
    private Timeline timeline;
    private final TrackSelector trackSelector;

    public static final class Factory implements MediaSource.Factory {
        private final Allocator allocator;
        private final BandwidthMeter bandwidthMeter;
        private final MediaSource.Factory mediaSourceFactory;
        private final PreloadControl preloadControl;
        private final Looper preloadLooper;
        private final RendererCapabilities[] rendererCapabilities;
        private final TrackSelector trackSelector;

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @UnstableApi
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return super.experimentalParseSubtitlesDuringExtraction(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @UnstableApi
        public /* bridge */ /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return super.setSubtitleParserFactory(factory);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public PreloadMediaSource createMediaSource(MediaItem mediaItem) {
            return new PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        public Factory(MediaSource.Factory factory, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (RendererCapabilities[]) Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.allocator = allocator;
            this.preloadLooper = looper;
        }

        public PreloadMediaSource createMediaSource(MediaSource mediaSource) {
            return new PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }
    }

    public interface PreloadControl {
        boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, long j10);

        default void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
        }

        boolean onSourcePrepared(PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(PreloadMediaSource preloadMediaSource);
    }

    public static class b {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final Long startPositionUs;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, bVar.mediaPeriodId) && this.startPositionUs.equals(bVar.startPositionUs);
        }

        public int hashCode() {
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.mediaPeriodId.periodUid.hashCode()) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return ((((((iHashCode + mediaPeriodId.adGroupIndex) * 31) + mediaPeriodId.adIndexInAdGroup) * 31) + mediaPeriodId.nextAdGroupIndex) * 31) + this.startPositionUs.intValue();
        }

        public b(MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = Long.valueOf(j10);
        }
    }

    public class c implements MediaPeriod.Callback {
        private final long periodStartPositionUs;
        private boolean prepared;

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(final MediaPeriod mediaPeriod) {
            this.prepared = true;
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: rg.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66775b.lambda$onPrepared$0(mediaPeriod);
                }
            });
        }

        public c(long j10) {
            this.periodStartPositionUs = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onContinueLoadingRequested$1(MediaPeriod mediaPeriod) {
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            e eVar = (e) mediaPeriod;
            if (this.prepared && mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE) {
                PreloadMediaSource.this.preloadControl.onLoadedToTheEndOfSource(PreloadMediaSource.this);
            } else if (!this.prepared || PreloadMediaSource.this.preloadControl.onContinueLoadingRequested(PreloadMediaSource.this, eVar.getBufferedPositionUs())) {
                eVar.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.periodStartPositionUs).build());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepared$0(MediaPeriod mediaPeriod) {
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            e eVar = (e) mediaPeriod;
            TrackSelectorResult trackSelectorResultSelectTracks = null;
            try {
                trackSelectorResultSelectTracks = PreloadMediaSource.this.trackSelector.selectTracks(PreloadMediaSource.this.rendererCapabilities, eVar.getTrackGroups(), ((b) ((Pair) Assertions.checkNotNull(PreloadMediaSource.this.preloadingMediaPeriodAndKey)).second).mediaPeriodId, (Timeline) Assertions.checkNotNull(PreloadMediaSource.this.timeline));
            } catch (ExoPlaybackException e10) {
                Log.e(PreloadMediaSource.TAG, "Failed to select tracks", e10);
            }
            if (trackSelectorResultSelectTracks != null) {
                eVar.selectTracksForPreloading(trackSelectorResultSelectTracks.selections, this.periodStartPositionUs);
                if (PreloadMediaSource.this.preloadControl.onTracksSelected(PreloadMediaSource.this)) {
                    eVar.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.periodStartPositionUs).build());
                }
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(final MediaPeriod mediaPeriod) {
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: rg.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66773b.lambda$onContinueLoadingRequested$1(mediaPeriod);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preload$0(long j10) {
        this.preloadCalled = true;
        this.startPositionUs = j10;
        this.onSourcePreparedNotified = false;
        if (isUsedByPlayer()) {
            notifyOnUsedByPlayer();
        } else {
            setPlayerId(PlayerId.UNSET);
            prepareSourceInternal(this.bandwidthMeter.getTransferListener());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadMediaSource$3() {
        this.preloadCalled = false;
        this.startPositionUs = -9223372036854775807L;
        this.onSourcePreparedNotified = false;
        Pair<e, b> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((e) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        releaseSourceInternal();
        this.preloadHandler.removeCallbacksAndMessages(null);
    }

    private PreloadMediaSource(MediaSource mediaSource, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.allocator = allocator;
        this.preloadHandler = Util.createHandler(looper, null);
        this.startPositionUs = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clear$1() {
        Pair<e, b> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null) {
            this.mediaSource.releasePeriod(((e) pair.first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private void notifyOnUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        this.onUsedByPlayerNotified = true;
    }

    public void clear() {
        this.preloadHandler.post(new Runnable() { // from class: rg.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f66771b.lambda$clear$1();
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public e createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        b bVar = new b(mediaPeriodId, j10);
        Pair<e, b> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && bVar.equals(pair.second)) {
            e eVar = (e) ((Pair) Assertions.checkNotNull(this.preloadingMediaPeriodAndKey)).first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new Pair<>(eVar, mediaPeriodId);
            }
            return eVar;
        }
        Pair<e, b> pair2 = this.preloadingMediaPeriodAndKey;
        if (pair2 != null) {
            this.mediaSource.releasePeriod(((e) ((Pair) Assertions.checkNotNull(pair2)).first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        e eVar2 = new e(this.mediaSource.createPeriod(mediaPeriodId, allocator, j10));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new Pair<>(eVar2, bVar);
        }
        return eVar2;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair<e, MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        return (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(pair)).second)) ? mediaPeriodId : (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(this.playingPreloadedMediaPeriodAndId)).second;
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(final Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        this.preloadHandler.post(new Runnable() { // from class: rg.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f66769b.lambda$onChildSourceInfoRefreshed$2(timeline);
            }
        });
    }

    public void preload(final long j10) {
        this.preloadHandler.post(new Runnable() { // from class: rg.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f66767b.lambda$preload$0(j10);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource, io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        e eVar = (e) mediaPeriod;
        Pair<e, b> pair = this.preloadingMediaPeriodAndKey;
        if (pair == null || eVar != ((Pair) Assertions.checkNotNull(pair)).first) {
            Pair<e, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
            if (pair2 != null && eVar == ((Pair) Assertions.checkNotNull(pair2)).first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        } else {
            this.preloadingMediaPeriodAndKey = null;
        }
        this.mediaSource.releasePeriod(eVar.mediaPeriod);
    }

    public void releasePreloadMediaSource() {
        this.preloadHandler.post(new Runnable() { // from class: rg.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f66772b.lambda$releasePreloadMediaSource$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onChildSourceInfoRefreshed$2(Timeline timeline) {
        if (!isUsedByPlayer() && !this.onSourcePreparedNotified) {
            this.onSourcePreparedNotified = true;
            if (!this.preloadControl.onSourcePrepared(this)) {
                return;
            }
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(new Timeline.Window(), new Timeline.Period(), 0, this.startPositionUs);
            createPeriod(new MediaSource.MediaPeriodId(periodPositionUs.first), this.allocator, ((Long) periodPositionUs.second).longValue()).preload(new c(((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            notifyOnUsedByPlayer();
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else if (!this.prepareChildSourceCalled) {
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.CompositeMediaSource, io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        if (!isUsedByPlayer()) {
            this.onUsedByPlayerNotified = false;
            if (!this.preloadCalled) {
                this.timeline = null;
                this.prepareChildSourceCalled = false;
                super.releaseSourceInternal();
            }
        }
    }
}
