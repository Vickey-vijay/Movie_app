package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import ck.p;
import com.inmobi.media.C2773c6;
import com.inmobi.media.H6;
import com.inmobi.media.Qe;
import com.inmobi.media.Xj;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TelemetryConfig extends Config {
    public static final Xj Companion = new Xj();
    public static final long DEFAULT_DEEPLINK_FALLBACK_INTERVAL = 1000;
    public static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    public static final long DEFAULT_EVENT_TTL_SEC = 604800;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final boolean DEFAULT_IS_ENABLED = true;
    public static final boolean DEFAULT_LOG_ENABLED = false;
    public static final long DEFAULT_LOG_EXPIRY = 86400;
    private static final String DEFAULT_LOG_LEVEL = "ERROR";
    public static final int DEFAULT_LOG_MAX_RETRIES = 3;
    public static final long DEFAULT_LOG_RETRY_INTERVAL = 5000;
    public static final double DEFAULT_LOG_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_LOG_URL = "https://log-activity.templates.inmobi.com/api/v1/ingest";
    public static final int DEFAULT_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_MAX_ENTRIES = 20;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_MAX_TEMPLATE_EVENTS = 50;
    public static final int DEFAULT_MIN_BATCH_SIZE = 5;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    public static final long DEFAULT_REDIRECTION_INTERVAL = 1000;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    public static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    private AssetReportingConfig assetReporting;
    private Base base;
    private boolean disableAllGeneralEvents;
    private LoggingConfig loggingConfig;
    private LandingPageConfig lpConfig;
    private Qe networkType;
    private double pingSamplingFactor;
    private List<String> priorityEvents;
    private double samplingFactor;
    private boolean sendCrashEvents;
    private String telemetryUrl = DEFAULT_URL;
    private final long processingInterval = 30;
    private int maxRetryCount = 1;
    private int maxEventsToPersist = 1000;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    private int maxTemplateEvents = 50;
    private long txLatency = 86400;

    @Keep
    public static final class AdTypeLoggingConfig {

        /* JADX INFO: renamed from: ab, reason: collision with root package name */
        private PlacementTypeLoggingConfig f24209ab = new PlacementTypeLoggingConfig();
        private PlacementTypeLoggingConfig nonAb = new PlacementTypeLoggingConfig();

        public final PlacementTypeLoggingConfig getAb() {
            return this.f24209ab;
        }

        public final PlacementTypeLoggingConfig getNonAb() {
            return this.nonAb;
        }
    }

    @Keep
    public static final class AssetReportingConfig {
        private boolean gif;
        private boolean image;
        private boolean video;

        public final boolean getGif() {
            return this.gif;
        }

        public final boolean getImage() {
            return this.image;
        }

        public final boolean getVideo() {
            return this.video;
        }

        public final boolean isGifEnabled() {
            return this.gif;
        }

        public final boolean isImageEnabled() {
            return this.image;
        }

        public final boolean isVideoEnabled() {
            return this.video;
        }

        public final void setGif(boolean z10) {
            this.gif = z10;
        }

        public final void setImage(boolean z10) {
            this.image = z10;
        }

        public final void setVideo(boolean z10) {
            this.video = z10;
        }
    }

    @Keep
    public static final class Base {
        private boolean enabled = true;

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    @Keep
    public static final class LandingPageConfig {
        private boolean enableOnLpLifeCycleEvent;
        private boolean nativeEnabled;
        private int maxFunnelsToTrackPerAd = 10;
        private boolean universalLinkEnabled = true;

        public final boolean getEnableOnLpLifeCycleEvent() {
            return this.enableOnLpLifeCycleEvent;
        }

        public final int getMaxFunnelsToTrackPerAd() {
            return this.maxFunnelsToTrackPerAd;
        }

        public final boolean getNativeEnabled() {
            return this.nativeEnabled;
        }

        public final boolean getUniversalLinkEnabled() {
            return this.universalLinkEnabled;
        }

        public final void setEnableOnLpLifeCycleEvent(boolean z10) {
            this.enableOnLpLifeCycleEvent = z10;
        }

        public final void setMaxFunnelsToTrackPerAd(int i10) {
            this.maxFunnelsToTrackPerAd = i10;
        }

        public final void setNativeEnabled(boolean z10) {
            this.nativeEnabled = z10;
        }

        public final void setUniversalLinkEnabled(boolean z10) {
            this.universalLinkEnabled = z10;
        }
    }

    @Keep
    public static final class LoggingConfig {
        private boolean enabled;
        private String loggingUrl = TelemetryConfig.DEFAULT_LOG_URL;
        private int maxNoOfEntries = 20;
        private long expiry = 86400;
        private int maxRetries = 3;
        private long retryInterval = 5000;
        private AdTypeLoggingConfig banner = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig audio = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_html = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_native = new AdTypeLoggingConfig();

        /* JADX INFO: renamed from: native, reason: not valid java name */
        private AdTypeLoggingConfig f3native = new AdTypeLoggingConfig();
        private PlacementTypeLoggingConfig getToken = new PlacementTypeLoggingConfig();

        public final AdTypeLoggingConfig getAudio() {
            return this.audio;
        }

        public final AdTypeLoggingConfig getBanner() {
            return this.banner;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getExpiry() {
            return this.expiry;
        }

        public final PlacementTypeLoggingConfig getGetToken() {
            return this.getToken;
        }

        public final AdTypeLoggingConfig getInt_html() {
            return this.int_html;
        }

        public final AdTypeLoggingConfig getInt_native() {
            return this.int_native;
        }

        public final String getLoggingUrl() {
            return this.loggingUrl;
        }

        public final int getMaxNoOfEntries() {
            return this.maxNoOfEntries;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final AdTypeLoggingConfig getNative() {
            return this.f3native;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }
    }

    @Keep
    public static final class PlacementTypeLoggingConfig {
        private String logLevel;
        private double samplePercent;

        public final String getLogLevel() {
            return this.logLevel;
        }

        public final double getSamplePercent() {
            return this.samplePercent;
        }

        public PlacementTypeLoggingConfig() {
            TelemetryConfig.Companion.getClass();
            this.logLevel = TelemetryConfig.DEFAULT_LOG_LEVEL;
        }
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "telemetry";
    }

    public TelemetryConfig() {
        Companion.getClass();
        this.priorityEvents = s.q("ServerFill", "ServerNoFill", "ServerError", "AdLoadFailed", "AdLoadSuccessful", "BlockAutoRedirection", "AssetDownloaded", "CrashEventOccurred", "InvalidConfig", "ConfigFetched", "SdkInitialized", "AdGetSignalsFailed", "AdGetSignalsSucceeded", "AdShowFailed", "AdLoadCalled", "AdLoadDroppedAtSDK", "AdShowCalled", "AdShowSuccessful", "AdGetSignalsCalled", "AdRequestPayloadCalled", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "MUTTSuccess", "ParseSuccess", "WebViewLoadCalled", "PageStarted", "WebViewLoadFinished", "FireAdReady", "FireAdFailed", "TemplateEventDropped", "NetworkLoadLimitExceeded", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed");
        this.base = new Base();
        this.networkType = new Qe();
        this.loggingConfig = new LoggingConfig();
        this.lpConfig = new LandingPageConfig();
        setDefaultNetworkConfig();
        this.assetReporting = getDefaultAssetReportingConfig();
    }

    private final AssetReportingConfig getDefaultAssetReportingConfig() {
        AssetReportingConfig assetReportingConfig = new AssetReportingConfig();
        assetReportingConfig.setVideo(true);
        assetReportingConfig.setImage(false);
        assetReportingConfig.setGif(false);
        return assetReportingConfig;
    }

    private final void setDefaultNetworkConfig() {
        Qe qe2 = this.networkType;
        Qe.a aVar = new Qe.a();
        aVar.a(60L);
        aVar.c(5);
        aVar.b(20);
        qe2.getClass();
        p.j(aVar, "<set-?>");
        qe2.wifi = aVar;
        Qe qe3 = this.networkType;
        Qe.a aVar2 = new Qe.a();
        aVar2.a(60L);
        aVar2.c(5);
        aVar2.b(20);
        qe3.getClass();
        p.j(aVar2, "<set-?>");
        qe3.others = aVar2;
    }

    public final AssetReportingConfig getAssetConfig() {
        return this.assetReporting;
    }

    public final boolean getEnabled() {
        return this.base.getEnabled();
    }

    public final C2773c6 getEventConfig() {
        return new C2773c6(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    public final LandingPageConfig getLpConfig() {
        return this.lpConfig;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public final int getMaxTemplateEvents() {
        return this.maxTemplateEvents;
    }

    public final Qe.a getMobileConfig() {
        Qe.a aVar = this.networkType.others;
        if (aVar != null) {
            return aVar;
        }
        p.B("others");
        return null;
    }

    public final double getPingSamplingFactor() {
        return this.pingSamplingFactor;
    }

    public final List<String> getPriorityEventsList() {
        return this.priorityEvents;
    }

    public final long getProcessingInterval() {
        return this.processingInterval;
    }

    public final double getSamplingFactor() {
        return this.samplingFactor;
    }

    public final String getTelemetryUrl() {
        return this.telemetryUrl;
    }

    public final String getUrl() {
        return this.telemetryUrl;
    }

    public final Qe.a getWifiConfig() {
        Qe.a aVar = this.networkType.wifi;
        if (aVar != null) {
            return aVar;
        }
        p.B("wifi");
        return null;
    }

    public final boolean isGeneralEventsDisabled() {
        return this.disableAllGeneralEvents;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (H6.a(this.telemetryUrl)) {
            return false;
        }
        long j10 = this.txLatency;
        if (j10 >= this.processingInterval && j10 <= this.eventTTL) {
            Qe qe2 = this.networkType;
            int i10 = this.maxEventsToPersist;
            Qe.a aVar = qe2.wifi;
            Qe.a aVar2 = null;
            if (aVar == null) {
                p.B("wifi");
                aVar = null;
            }
            if (aVar.a(i10)) {
                Qe.a aVar3 = qe2.others;
                if (aVar3 != null) {
                    aVar2 = aVar3;
                } else {
                    p.B("others");
                }
                if (aVar2.a(i10) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0 && this.samplingFactor >= 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setTelemetryUrl(String str) {
        p.j(str, "<set-?>");
        this.telemetryUrl = str;
    }

    public final boolean shouldSendCrashEvents() {
        return this.sendCrashEvents;
    }
}
