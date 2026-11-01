package io.bidmachine.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.common.collect.r2;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.TrackGroup;
import io.bidmachine.media3.common.TrackSelectionOverride;
import io.bidmachine.media3.common.TrackSelectionParameters;
import io.bidmachine.media3.common.Tracks;
import io.bidmachine.media3.common.VideoSize;
import io.bidmachine.media3.common.text.CueGroup;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.DecoderCounters;
import io.bidmachine.media3.exoplayer.DecoderReuseEvaluation;
import io.bidmachine.media3.exoplayer.DefaultRendererCapabilitiesList;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.Renderer;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.RendererCapabilitiesList;
import io.bidmachine.media3.exoplayer.RenderersFactory;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.metadata.MetadataOutput;
import io.bidmachine.media3.exoplayer.offline.DownloadHelper;
import io.bidmachine.media3.exoplayer.source.DefaultMediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunkIterator;
import io.bidmachine.media3.exoplayer.text.TextOutput;
import io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.DefaultTrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.MappingTrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectionUtil;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectorResult;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.upstream.DefaultAllocator;
import io.bidmachine.media3.exoplayer.video.VideoRendererEventListener;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    private Callback callback;
    private final Handler callbackHandler;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private e mediaPreparer;

    @Nullable
    private final MediaSource mediaSource;
    private final RendererCapabilitiesList rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public class a implements VideoRendererEventListener {
        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onDroppedFrames(int i10, long j10) {
            super.onDroppedFrames(i10, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(Object obj, long j10) {
            super.onRenderedFirstFrame(obj, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoCodecError(Exception exc) {
            super.onVideoCodecError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(String str, long j10, long j11) {
            super.onVideoDecoderInitialized(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoDecoderReleased(String str) {
            super.onVideoDecoderReleased(str);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
            super.onVideoDisabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
            super.onVideoEnabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(long j10, int i10) {
            super.onVideoFrameProcessingOffset(j10, i10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            super.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoRendererEventListener
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            super.onVideoSizeChanged(videoSize);
        }
    }

    public class b implements AudioRendererEventListener {
        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioCodecError(Exception exc) {
            super.onAudioCodecError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(String str, long j10, long j11) {
            super.onAudioDecoderInitialized(str, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioDecoderReleased(String str) {
            super.onAudioDecoderReleased(str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
            super.onAudioDisabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
            super.onAudioEnabled(decoderCounters);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            super.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(long j10) {
            super.onAudioPositionAdvancing(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioSinkError(Exception exc) {
            super.onAudioSinkError(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            super.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            super.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onAudioUnderrun(int i10, long j10, long j11) {
            super.onAudioUnderrun(i10, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioRendererEventListener
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            super.onSkipSilenceEnabledChanged(z10);
        }
    }

    public static final class c extends BaseTrackSelection {
        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public /* bridge */ /* synthetic */ long getLatestBitrateEstimate() {
            return super.getLatestBitrateEstimate();
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // io.bidmachine.media3.exoplayer.trackselection.BaseTrackSelection, io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection
        public int getSelectionReason() {
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

        public static final class a implements ExoTrackSelection.Factory {
            private a() {
            }

            @Override // io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i10 = 0; i10 < definitionArr.length; i10++) {
                    ExoTrackSelection.Definition definition = definitionArr[i10];
                    exoTrackSelectionArr[i10] = definition == null ? null : new c(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        public c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }
    }

    public static final class e implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 2;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 1;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private boolean released;
        public Timeline timeline;
        private final Allocator allocator = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        private final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: mg.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f64526b.handleDownloadHelperCallbackMessage(message);
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e10) {
                    this.downloadHelperHandler.obtainMessage(2, new IOException(e10)).sendToTarget();
                }
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.mediaSource.prepareSource(this, null, PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(2);
                return true;
            }
            int i11 = 0;
            if (i10 == 2) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i11 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i11).maybeThrowPrepareError();
                            i11++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(2, 100L);
                } catch (IOException e10) {
                    this.downloadHelperHandler.obtainMessage(2, e10).sendToTarget();
                }
                return true;
            }
            if (i10 == 3) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                }
                return true;
            }
            if (i10 != 4) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i11 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i11]);
                    i11++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback, io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(3, mediaPeriod).sendToTarget();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(2);
                this.downloadHelperHandler.sendEmptyMessage(1);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(2, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i10 = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i10 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i10)), this.allocator, 0L);
                this.mediaPeriods[i10] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i10++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(4);
        }

        public e(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }
    }

    public static final class f implements RendererCapabilitiesList {
        private final RendererCapabilities[] rendererCapabilities;

        public /* synthetic */ f(RendererCapabilities[] rendererCapabilitiesArr, a aVar) {
            this(rendererCapabilitiesArr);
        }

        @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
        public void release() {
        }

        private f(RendererCapabilities[] rendererCapabilitiesArr) {
            this.rendererCapabilities = rendererCapabilitiesArr;
        }

        @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
        public RendererCapabilities[] getRendererCapabilities() {
            return this.rendererCapabilities;
        }

        @Override // io.bidmachine.media3.exoplayer.RendererCapabilitiesList
        public int size() {
            return this.rendererCapabilities.length;
        }
    }

    @Deprecated
    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilities[] rendererCapabilitiesArr) {
        this(mediaItem, mediaSource, trackSelectionParameters, new f(rendererCapabilitiesArr, null));
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DrmSessionManager lambda$createMediaSourceInternal$6(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getRendererCapabilities$0(CueGroup cueGroup) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getRendererCapabilities$1(Metadata metadata) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2() {
    }

    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    public static final class d implements BandwidthMeter {
        private d() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter
        public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
            return super.getTimeToFirstByteEstimateUs();
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilitiesList rendererCapabilitiesList) {
        this.localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        a aVar = null;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new c.a(aVar));
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesList;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: mg.e
            @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.lambda$new$2();
            }
        }, new d(aVar));
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    private void addTrackSelectionInternal(int i10, TrackSelectionParameters trackSelectionParameters) throws ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i10);
        r2<TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i10);
        }
    }

    private void assertPreparedWithMedia() {
        Assertions.checkState(this.isPreparedWithMedia);
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    private static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, @Nullable final DrmSessionManager drmSessionManager) {
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: mg.d
                @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    return DownloadHelper.lambda$createMediaSourceInternal$6(drmSessionManager, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    private static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMediaPreparationFailed$5(IOException iOException) {
        ((Callback) Assertions.checkNotNull(this.callback)).onPrepareError(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMediaPrepared$4() {
        ((Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final IOException iOException) {
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: mg.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f64524b.lambda$onMediaPreparationFailed$5(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws ExoPlaybackException {
        Assertions.checkNotNull(this.mediaPreparer);
        Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int size = this.rendererCapabilities.size();
        this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                this.trackSelectionsByPeriodAndRenderer[i10][i11] = new ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i10][i11] = Collections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i10][i11]);
            }
        }
        this.trackGroupArrays = new TrackGroupArray[length];
        this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.trackGroupArrays[i12] = this.mediaPreparer.mediaPeriods[i12].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i12).info);
            this.mappedTrackInfos[i12] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: mg.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f64520b.lambda$onMediaPrepared$4();
            }
        });
    }

    private TrackSelectorResult runTrackSelection(int i10) throws ExoPlaybackException {
        boolean z10;
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities.getRendererCapabilities(), this.trackGroupArrays[i10], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i10)), this.mediaPreparer.timeline);
        for (int i11 = 0; i11 < trackSelectorResultSelectTracks.length; i11++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i11];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i10][i11];
                int i12 = 0;
                while (true) {
                    if (i12 >= list.size()) {
                        z10 = false;
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i12);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i13 = 0; i13 < exoTrackSelection2.length(); i13++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i13), 0);
                        }
                        for (int i14 = 0; i14 < exoTrackSelection.length(); i14++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i14), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i15 = 0; i15 < this.scratchSet.size(); i15++) {
                            iArr[i15] = this.scratchSet.keyAt(i15);
                        }
                        list.set(i12, new c(exoTrackSelection2.getTrackGroup(), iArr));
                        z10 = true;
                        break;
                    }
                    i12++;
                }
                if (!z10) {
                    list.add(exoTrackSelection);
                }
            }
        }
        return trackSelectorResultSelectTracks;
    }

    public DownloadRequest getDownloadRequest(String str, @Nullable byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i10].length;
            for (int i11 = 0; i11 < length2; i11++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i10][i11]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i10].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @Nullable
    public Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.callback == null);
        this.callback = callback;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new e(mediaSource, this);
        } else {
            this.callbackHandler.post(new Runnable() { // from class: mg.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64522b.lambda$prepare$3(callback);
                }
            });
        }
    }

    public void release() {
        e eVar = this.mediaPreparer;
        if (eVar != null) {
            eVar.release();
        }
        this.trackSelector.release();
        this.rendererCapabilities.release();
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    @Deprecated
    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new a(), new b(), new TextOutput() { // from class: mg.a
            @Override // io.bidmachine.media3.exoplayer.text.TextOutput
            public final void onCues(CueGroup cueGroup) {
                DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
            }
        }, new MetadataOutput() { // from class: mg.b
            @Override // io.bidmachine.media3.exoplayer.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
                DownloadHelper.lambda$getRendererCapabilities$1(metadata);
            }
        });
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i10 = 0; i10 < rendererArrCreateRenderers.length; i10++) {
            rendererCapabilitiesArr[i10] = rendererArrCreateRenderers[i10].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$3(Callback callback) {
        callback.onPrepared(this);
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        boolean z10;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                if (trackType != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                builderBuildUpon.setTrackTypeDisabled(trackType, z10);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i10 = 0; i10 < periodCount; i10++) {
                    addTrackSelectionInternal(i10, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTextLanguagesToSelection(boolean z10, String... strArr) {
        boolean z11;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z10);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities.getRendererCapabilities()) {
                int trackType = rendererCapabilities.getTrackType();
                if (trackType != 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                builderBuildUpon.setTrackTypeDisabled(trackType, z11);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i10 = 0; i10 < periodCount; i10++) {
                    addTrackSelectionInternal(i10, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTrackSelection(int i10, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i10, trackSelectionParameters);
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i10, int i11, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        boolean z10;
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            for (int i12 = 0; i12 < this.mappedTrackInfos[i10].getRendererCount(); i12++) {
                if (i12 != i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                builderBuildUpon.setRendererDisabled(i12, z10);
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i10, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i10].getTrackGroups(i11);
            for (int i13 = 0; i13 < list.size(); i13++) {
                builderBuildUpon.setSelectionOverride(i11, trackGroups, list.get(i13));
                addTrackSelectionInternal(i10, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void clearTrackSelections(int i10) {
        assertPreparedWithMedia();
        for (int i11 = 0; i11 < this.rendererCapabilities.size(); i11++) {
            this.trackSelectionsByPeriodAndRenderer[i10][i11].clear();
        }
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i10) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i10];
    }

    public TrackGroupArray getTrackGroups(int i10) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i10];
    }

    public List<ExoTrackSelection> getTrackSelections(int i10, int i11) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i10][i11];
    }

    public Tracks getTracks(int i10) {
        assertPreparedWithMedia();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i10], this.immutableTrackSelectionsByPeriodAndRenderer[i10]);
    }

    public void replaceTrackSelections(int i10, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i10);
            addTrackSelectionInternal(i10, trackSelectionParameters);
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        RendererCapabilitiesList fVar;
        boolean zIsProgressive = isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration));
        Assertions.checkArgument(zIsProgressive || factory != null);
        a aVar = null;
        MediaSource mediaSourceCreateMediaSourceInternal = zIsProgressive ? null : createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            fVar = new DefaultRendererCapabilitiesList.Factory(renderersFactory).createRendererCapabilitiesList();
        } else {
            fVar = new f(new RendererCapabilities[0], aVar);
        }
        return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, fVar);
    }
}
