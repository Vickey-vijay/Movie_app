package io.bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.MediaLibraryInfo;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.dash.manifest.AdaptationSet;
import io.bidmachine.media3.exoplayer.dash.manifest.DashManifest;
import io.bidmachine.media3.exoplayer.dash.manifest.DashManifestParser;
import io.bidmachine.media3.exoplayer.dash.manifest.Period;
import io.bidmachine.media3.exoplayer.dash.manifest.Representation;
import io.bidmachine.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import io.bidmachine.media3.exoplayer.dash.manifest.UtcTimingElement;
import io.bidmachine.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManagerProvider;
import io.bidmachine.media3.exoplayer.offline.FilteringManifestParser;
import io.bidmachine.media3.exoplayer.source.BaseMediaSource;
import io.bidmachine.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import io.bidmachine.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import io.bidmachine.media3.exoplayer.source.LoadEventInfo;
import io.bidmachine.media3.exoplayer.source.MediaLoadData;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.MediaSourceEventListener;
import io.bidmachine.media3.exoplayer.source.MediaSourceFactory;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower;
import io.bidmachine.media3.exoplayer.upstream.ParsingLoadable;
import io.bidmachine.media3.exoplayer.util.SntpClient;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    public static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final e manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;

    @GuardedBy("this")
    private MediaItem mediaItem;

    @Nullable
    private TransferListener mediaTransferListener;
    private final long minLiveStartPositionUs;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f59884a = 0;
        private final DashChunkSource.Factory chunkSourceFactory;
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        private long minLiveStartPositionUs;

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.minLiveStartPositionUs = 5000000L;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            experimentalParseSubtitlesDuringExtraction(true);
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            return createMediaSource(dashManifest, new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType("application/dash+xml").build());
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        @Deprecated
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.chunkSourceFactory.experimentalParseSubtitlesDuringExtraction(z10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (CmcdConfiguration.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j10) {
            this.fallbackTargetLiveOffsetMs = j10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        public Factory setMinLiveStartPositionUs(long j10) {
            this.minLiveStartPositionUs = j10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkSourceFactory.setSubtitleParserFactory((SubtitleParser.Factory) Assertions.checkNotNull(factory));
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, MediaItem mediaItem) {
            Assertions.checkArgument(!dashManifest.dynamic);
            MediaItem.Builder mimeType = mediaItem.buildUpon().setMimeType("application/dash+xml");
            if (mediaItem.localConfiguration == null) {
                mimeType.setUri(Uri.EMPTY);
            }
            MediaItem mediaItemBuild = mimeType.build();
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItemBuild, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItemBuild), this.drmSessionManagerProvider.get(mediaItemBuild), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs, null);
        }

        @Override // io.bidmachine.media3.exoplayer.source.MediaSourceFactory, io.bidmachine.media3.exoplayer.source.MediaSource.Factory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List<StreamKey> list = mediaItem.localConfiguration.streamKeys;
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItem, null, this.manifestDataSourceFactory, filteringManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItem), this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs, null);
        }
    }

    public class a implements SntpClient.InitializationCallback {
        public a() {
        }

        @Override // io.bidmachine.media3.exoplayer.util.SntpClient.InitializationCallback
        public void onInitializationFailed(IOException iOException) {
            DashMediaSource.this.onUtcTimestampResolutionError(iOException);
        }

        @Override // io.bidmachine.media3.exoplayer.util.SntpClient.InitializationCallback
        public void onInitialized() {
            DashMediaSource.this.onUtcTimestampResolved(SntpClient.getElapsedRealtimeOffsetMs());
        }
    }

    public static final class b extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;

        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, DashManifest dashManifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(dashManifest.dynamic == (liveConfiguration != null));
            this.presentationStartTimeMs = j10;
            this.windowStartTimeMs = j11;
            this.elapsedRealtimeEpochOffsetMs = j12;
            this.firstPeriodId = i10;
            this.offsetInFirstPeriodUs = j13;
            this.windowDurationUs = j14;
            this.windowDefaultStartPositionUs = j15;
            this.manifest = dashManifest;
            this.mediaItem = mediaItem;
            this.liveConfiguration = liveConfiguration;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j10) {
            DashSegmentIndex index;
            long j11 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.windowDurationUs) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.offsetInFirstPeriodUs + j11;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i10 = 0;
            while (i10 < this.manifest.getPeriodCount() - 1 && j12 >= periodDurationUs) {
                j12 -= periodDurationUs;
                i10++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i10);
            }
            Period period = this.manifest.getPeriod(i10);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j11 : (j11 + index.getTimeUs(index.getSegmentNum(j12, periodDurationUs))) - j12;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != -9223372036854775807L && dashManifest.durationMs == -9223372036854775807L;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // io.bidmachine.media3.common.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            Assertions.checkIndex(i10, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j10);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.mediaItem;
            DashManifest dashManifest = this.manifest;
            return window.set(obj, mediaItem, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            String str;
            Assertions.checkIndex(i10, 0, getPeriodCount());
            Integer numValueOf = null;
            if (z10) {
                str = this.manifest.getPeriod(i10).f59887id;
            } else {
                str = null;
            }
            if (z10) {
                numValueOf = Integer.valueOf(this.firstPeriodId + i10);
            }
            return period.set(str, numValueOf, 0, this.manifest.getPeriodDurationUs(i10), Util.msToUs(this.manifest.getPeriod(i10).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        @Override // io.bidmachine.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            Assertions.checkIndex(i10, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i10);
        }
    }

    public final class c implements PlayerEmsgHandler.PlayerEmsgCallback {
        private c() {
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // io.bidmachine.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j10) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    public static final class d implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, m5.c.f64119c)).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * ((((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.createForMalformedManifest(null, e10);
            }
        }
    }

    public final class e implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private e() {
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, boolean z10) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j10, j11, iOException, i10);
        }
    }

    public final class f implements LoaderErrorThrower {
        @Override // io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        public f() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i10) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i10);
            maybeThrowManifestError();
        }
    }

    public final class g implements Loader.Callback<ParsingLoadable<Long>> {
        private g() {
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j10, long j11, boolean z10) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j10, long j11) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j10, j11, iOException);
        }
    }

    public static final class h implements ParsingLoadable.Parser<Long> {
        private h() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public /* synthetic */ DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j10, long j11, a aVar) {
        this(mediaItem, dashManifest, factory, parser, factory2, compositeSequenceableLoaderFactory, cmcdConfiguration, drmSessionManager, loadErrorHandlingPolicy, j10, j11);
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            int i11 = period.adaptationSets.get(i10).type;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(Period period) {
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            DashSegmentIndex index = period.adaptationSets.get(i10).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        processManifest(false);
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

    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j10, long j11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j10, long j11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.dash");
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest dashManifest, @Nullable DataSource.Factory factory, @Nullable ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j10, long j11) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.manifestUri = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.initialManifestUri = mediaItem.localConfiguration.uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j10;
        this.minLiveStartPositionUs = j11;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new BaseUrlExclusionList();
        boolean z10 = dashManifest != null;
        this.sideloadedManifest = z10;
        a aVar = null;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new c(this, aVar);
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (!z10) {
            this.manifestCallback = new e(this, aVar);
            this.manifestLoadErrorThrower = new f();
            this.refreshManifestRunnable = new Runnable() { // from class: fg.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52956b.startLoadingManifest();
                }
            };
            this.simulateManifestRefreshRunnable = new Runnable() { // from class: fg.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52957b.lambda$new$0();
                }
            };
            return;
        }
        Assertions.checkState(true ^ dashManifest.dynamic);
        this.manifestCallback = null;
        this.refreshManifestRunnable = null;
        this.simulateManifestRefreshRunnable = null;
        this.manifestLoadErrorThrower = new LoaderErrorThrower.Placeholder();
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j10, long j11) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i10);
            List<Representation> list = adaptationSet.representations;
            int i11 = adaptationSet.type;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z10) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + j10;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j10, j11);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j10, j11) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j10) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j10, long j11) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jMsToUs;
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i10);
            List<Representation> list = adaptationSet.representations;
            int i11 = adaptationSet.type;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z10) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs;
                }
                if (index.getAvailableSegmentCount(j10, j11) == 0) {
                    return jMsToUs;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j10, j11)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j10) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long jMsToUs = Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = Util.msToUs(j10);
        long jMsToUs3 = Util.msToUs(dashManifest.availabilityStartTimeMs);
        long jMsToUs4 = Util.msToUs(5000L);
        for (int i10 = 0; i10 < period.adaptationSets.size(); i10++) {
            List<Representation> list = period.adaptationSets.get(i10).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((jMsToUs3 + jMsToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs < jMsToUs4 - 100000 || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < jMsToUs4 + 100000)) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return o5.e.b(jMsToUs4, 1000L, RoundingMode.CEILING);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private void loadNtpTimeOffset() {
        SntpClient.initialize(this.loader, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.elapsedRealtimeOffsetMs = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j10) {
        this.elapsedRealtimeOffsetMs = j10;
        processManifest(true);
    }

    private void processManifest(boolean z10) {
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.periodsById.size(); i10++) {
            int iKeyAt = this.periodsById.keyAt(i10);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i10).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jMsToUs = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jMsToUs);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jMsToUs);
        boolean z11 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z11) {
            long j12 = this.manifest.timeShiftBufferDepthMs;
            if (j12 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - Util.msToUs(j12));
            }
        }
        long j13 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            Assertions.checkState(dashManifest.availabilityStartTimeMs != -9223372036854775807L);
            long jMsToUs2 = (jMsToUs - Util.msToUs(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jMsToUs2, j13);
            long jUsToMs = this.manifest.availabilityStartTimeMs + Util.usToMs(availableStartTimeInManifestUs);
            long jMsToUs3 = jMsToUs2 - Util.msToUs(this.liveConfiguration.targetOffsetMs);
            long jMin = Math.min(this.minLiveStartPositionUs, j13 / 2);
            j10 = jUsToMs;
            j11 = jMsToUs3 < jMin ? jMin : jMsToUs3;
        } else {
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long jMsToUs4 = availableStartTimeInManifestUs - Util.msToUs(period.startMs);
        DashManifest dashManifest2 = this.manifest;
        refreshSourceInfo(new b(dashManifest2.availabilityStartTimeMs, j10, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jMsToUs4, j13, j11, dashManifest2, getMediaItem(), this.manifest.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z11) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z10) {
            DashManifest dashManifest3 = this.manifest;
            if (dashManifest3.dynamic) {
                long j14 = dashManifest3.minUpdatePeriodMs;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(0L, (this.manifestLoadStartTimestampMs + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new d());
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new h(null));
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e10) {
            onUtcTimestampResolutionError(e10);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new g(this, null), 1);
    }

    private void scheduleManifestRefresh(long j10) {
        this.handler.postDelayed(this.refreshManifestRunnable, j10);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i10) {
        this.manifestEventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.loader.startLoading(parsingLoadable, callback, i10)), parsingLoadable.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    private void updateLiveConfiguration(long j10, long j11) {
        long j12;
        long jMin;
        long jUsToMs;
        long j13;
        long jConstrainValue;
        long j14;
        ServiceDescriptionElement serviceDescriptionElement;
        long j15;
        long jConstrainValue2;
        float f10;
        float f11;
        ServiceDescriptionElement serviceDescriptionElement2;
        ServiceDescriptionElement serviceDescriptionElement3;
        ServiceDescriptionElement serviceDescriptionElement4;
        DashManifest dashManifest;
        ServiceDescriptionElement serviceDescriptionElement5;
        long j16;
        MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        long jUsToMs2 = Util.usToMs(j10);
        long j17 = liveConfiguration.maxOffsetMs;
        if (j17 == -9223372036854775807L) {
            ServiceDescriptionElement serviceDescriptionElement6 = this.manifest.serviceDescription;
            if (serviceDescriptionElement6 != null) {
                long j18 = serviceDescriptionElement6.maxOffsetMs;
                if (j18 != -9223372036854775807L) {
                    jMin = Math.min(jUsToMs2, j18);
                }
                jUsToMs = Util.usToMs(j10 - j11);
                if (jUsToMs < 0 && j12 > 0) {
                    jUsToMs = 0;
                }
                j13 = this.manifest.minBufferTimeMs;
                if (j13 != -9223372036854775807L) {
                    jUsToMs = Math.min(jUsToMs + j13, jUsToMs2);
                }
                jConstrainValue = jUsToMs;
                j14 = liveConfiguration.minOffsetMs;
                if (j14 != -9223372036854775807L) {
                    jConstrainValue = Util.constrainValue(j14, jConstrainValue, jUsToMs2);
                } else {
                    serviceDescriptionElement = this.manifest.serviceDescription;
                    if (serviceDescriptionElement != null) {
                        j15 = serviceDescriptionElement.minOffsetMs;
                        if (j15 != -9223372036854775807L) {
                            jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
                        }
                    }
                }
                if (jConstrainValue > j12) {
                    j12 = jConstrainValue;
                }
                jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
                if (jConstrainValue2 == -9223372036854775807L) {
                    dashManifest = this.manifest;
                    serviceDescriptionElement5 = dashManifest.serviceDescription;
                    if (serviceDescriptionElement5 != null) {
                        j16 = serviceDescriptionElement5.targetOffsetMs;
                        if (j16 != -9223372036854775807L) {
                            jConstrainValue2 = j16;
                        } else {
                            jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                            if (jConstrainValue2 == -9223372036854775807L) {
                                jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                            }
                        }
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == -9223372036854775807L) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                }
                if (jConstrainValue2 < jConstrainValue) {
                    jConstrainValue2 = jConstrainValue;
                }
                if (jConstrainValue2 > j12) {
                    jConstrainValue2 = Util.constrainValue(Util.usToMs(j10 - Math.min(this.minLiveStartPositionUs, j11 / 2)), jConstrainValue, j12);
                }
                f10 = liveConfiguration.minPlaybackSpeed;
                if (f10 == -3.4028235E38f) {
                    serviceDescriptionElement4 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement4 != null) {
                        f10 = serviceDescriptionElement4.minPlaybackSpeed;
                    } else {
                        f10 = -3.4028235E38f;
                    }
                }
                f11 = liveConfiguration.maxPlaybackSpeed;
                if (f11 == -3.4028235E38f) {
                    serviceDescriptionElement3 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement3 != null) {
                        f11 = serviceDescriptionElement3.maxPlaybackSpeed;
                    } else {
                        f11 = -3.4028235E38f;
                    }
                }
                if (f10 == -3.4028235E38f && f11 == -3.4028235E38f && ((serviceDescriptionElement2 = this.manifest.serviceDescription) == null || serviceDescriptionElement2.targetOffsetMs == -9223372036854775807L)) {
                    f11 = 1.0f;
                    f10 = 1.0f;
                }
                this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j12).setMinPlaybackSpeed(f10).setMaxPlaybackSpeed(f11).build();
            }
            j12 = jUsToMs2;
            jUsToMs = Util.usToMs(j10 - j11);
            if (jUsToMs < 0) {
                jUsToMs = 0;
            }
            j13 = this.manifest.minBufferTimeMs;
            if (j13 != -9223372036854775807L) {
                jUsToMs = Math.min(jUsToMs + j13, jUsToMs2);
            }
            jConstrainValue = jUsToMs;
            j14 = liveConfiguration.minOffsetMs;
            if (j14 != -9223372036854775807L) {
                jConstrainValue = Util.constrainValue(j14, jConstrainValue, jUsToMs2);
            } else {
                serviceDescriptionElement = this.manifest.serviceDescription;
                if (serviceDescriptionElement != null) {
                    j15 = serviceDescriptionElement.minOffsetMs;
                    if (j15 != -9223372036854775807L) {
                        jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
                    }
                }
            }
            if (jConstrainValue > j12) {
                j12 = jConstrainValue;
            }
            jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
            if (jConstrainValue2 == -9223372036854775807L) {
                dashManifest = this.manifest;
                serviceDescriptionElement5 = dashManifest.serviceDescription;
                if (serviceDescriptionElement5 != null) {
                    j16 = serviceDescriptionElement5.targetOffsetMs;
                    if (j16 != -9223372036854775807L) {
                        jConstrainValue2 = j16;
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == -9223372036854775807L) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == -9223372036854775807L) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            }
            if (jConstrainValue2 < jConstrainValue) {
                jConstrainValue2 = jConstrainValue;
            }
            if (jConstrainValue2 > j12) {
                jConstrainValue2 = Util.constrainValue(Util.usToMs(j10 - Math.min(this.minLiveStartPositionUs, j11 / 2)), jConstrainValue, j12);
            }
            f10 = liveConfiguration.minPlaybackSpeed;
            if (f10 == -3.4028235E38f) {
                serviceDescriptionElement4 = this.manifest.serviceDescription;
                if (serviceDescriptionElement4 != null) {
                    f10 = serviceDescriptionElement4.minPlaybackSpeed;
                } else {
                    f10 = -3.4028235E38f;
                }
            }
            f11 = liveConfiguration.maxPlaybackSpeed;
            if (f11 == -3.4028235E38f) {
                serviceDescriptionElement3 = this.manifest.serviceDescription;
                if (serviceDescriptionElement3 != null) {
                    f11 = serviceDescriptionElement3.maxPlaybackSpeed;
                } else {
                    f11 = -3.4028235E38f;
                }
            }
            if (f10 == -3.4028235E38f) {
                f11 = 1.0f;
                f10 = 1.0f;
            }
            this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j12).setMinPlaybackSpeed(f10).setMaxPlaybackSpeed(f11).build();
        }
        jMin = Math.min(jUsToMs2, j17);
        j12 = jMin;
        jUsToMs = Util.usToMs(j10 - j11);
        if (jUsToMs < 0) {
            jUsToMs = 0;
        }
        j13 = this.manifest.minBufferTimeMs;
        if (j13 != -9223372036854775807L) {
            jUsToMs = Math.min(jUsToMs + j13, jUsToMs2);
        }
        jConstrainValue = jUsToMs;
        j14 = liveConfiguration.minOffsetMs;
        if (j14 != -9223372036854775807L) {
            jConstrainValue = Util.constrainValue(j14, jConstrainValue, jUsToMs2);
        } else {
            serviceDescriptionElement = this.manifest.serviceDescription;
            if (serviceDescriptionElement != null) {
                j15 = serviceDescriptionElement.minOffsetMs;
                if (j15 != -9223372036854775807L) {
                    jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
                }
            }
        }
        if (jConstrainValue > j12) {
            j12 = jConstrainValue;
        }
        jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
        if (jConstrainValue2 == -9223372036854775807L) {
            dashManifest = this.manifest;
            serviceDescriptionElement5 = dashManifest.serviceDescription;
            if (serviceDescriptionElement5 != null) {
                j16 = serviceDescriptionElement5.targetOffsetMs;
                if (j16 != -9223372036854775807L) {
                    jConstrainValue2 = j16;
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == -9223372036854775807L) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            } else {
                jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                if (jConstrainValue2 == -9223372036854775807L) {
                    jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                }
            }
        }
        if (jConstrainValue2 < jConstrainValue) {
            jConstrainValue2 = jConstrainValue;
        }
        if (jConstrainValue2 > j12) {
            jConstrainValue2 = Util.constrainValue(Util.usToMs(j10 - Math.min(this.minLiveStartPositionUs, j11 / 2)), jConstrainValue, j12);
        }
        f10 = liveConfiguration.minPlaybackSpeed;
        if (f10 == -3.4028235E38f) {
            serviceDescriptionElement4 = this.manifest.serviceDescription;
            if (serviceDescriptionElement4 != null) {
                f10 = serviceDescriptionElement4.minPlaybackSpeed;
            } else {
                f10 = -3.4028235E38f;
            }
        }
        f11 = liveConfiguration.maxPlaybackSpeed;
        if (f11 == -3.4028235E38f) {
            serviceDescriptionElement3 = this.manifest.serviceDescription;
            if (serviceDescriptionElement3 != null) {
                f11 = serviceDescriptionElement3.maxPlaybackSpeed;
            } else {
                f11 = -3.4028235E38f;
            }
        }
        if (f10 == -3.4028235E38f) {
            f11 = 1.0f;
            f10 = 1.0f;
        }
        this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(jConstrainValue).setMaxOffsetMs(j12).setMinPlaybackSpeed(f10).setMaxPlaybackSpeed(f11).build();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(iIntValue + this.firstPeriodId, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.f59883id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public void onDashManifestPublishTimeExpired(long j10) {
        long j11 = this.expiredManifestPublishTimeUs;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.expiredManifestPublishTimeUs = j10;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11) {
        boolean z10;
        int i10;
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j12 = result.getPeriod(0).startMs;
        int i11 = 0;
        while (i11 < periodCount && this.manifest.getPeriod(i11).startMs < j12) {
            i11++;
        }
        if (result.dynamic) {
            if (periodCount - i11 > result.getPeriodCount()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.expiredManifestPublishTimeUs;
                if (j13 == -9223372036854775807L || result.publishTimeMs * 1000 > j13) {
                    z10 = false;
                } else {
                    Log.w("DashMediaSource", "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
                if (z10) {
                    i10 = this.staleManifestReloadAttempt;
                    this.staleManifestReloadAttempt = i10 + 1;
                    if (i10 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                        scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                        return;
                    } else {
                        this.manifestFatalError = new DashManifestStaleException();
                        return;
                    }
                }
                this.staleManifestReloadAttempt = 0;
            }
            z10 = true;
            if (z10) {
                i10 = this.staleManifestReloadAttempt;
                this.staleManifestReloadAttempt = i10 + 1;
                if (i10 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                    scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                    return;
                } else {
                    this.manifestFatalError = new DashManifestStaleException();
                    return;
                }
            }
            this.staleManifestReloadAttempt = 0;
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j10 - j11;
        this.manifestLoadEndTimestampMs = j10;
        this.firstPeriodId += i11;
        synchronized (this.manifestUriLock) {
            if (parsingLoadable.dataSpec.uri == this.manifestUri) {
                Uri uri = this.manifest.location;
                if (uri == null) {
                    uri = parsingLoadable.getUri();
                }
                this.manifestUri = uri;
            }
        }
        DashManifest dashManifest2 = this.manifest;
        if (!dashManifest2.dynamic || this.elapsedRealtimeOffsetMs != -9223372036854775807L) {
            processManifest(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            resolveUtcTimingElement(utcTimingElement);
        } else {
            loadNtpTimeOffset();
        }
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j10, long j11, IOException iOException, int i10) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable.type), iOException, i10));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == -9223372036854775807L ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean z10 = !loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, z10);
        if (z10) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j10, long j11, IOException iOException) {
        this.manifestEventDispatcher.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j10, j11, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.setPlayer(Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("DashMediaSource");
        this.handler = Util.createHandlerForCurrentLooper();
        startLoadingManifest();
    }

    @Override // io.bidmachine.media3.exoplayer.source.BaseMediaSource, io.bidmachine.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f59883id);
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
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
