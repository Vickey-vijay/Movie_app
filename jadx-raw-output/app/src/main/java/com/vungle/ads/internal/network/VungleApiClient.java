package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import bk.l;
import ck.i;
import ck.p;
import ck.s;
import cl.d;
import cl.m;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import lk.x;
import mj.g;
import mj.r;
import nj.b0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import org.eclipse.jetty.util.security.Constraint;
import xk.h;

/* JADX INFO: compiled from: VungleApiClient.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u008a\u00012\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B!\u0012\u0006\u0010P\u001a\u00020\r\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J \u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010 2\u0006\u0010#\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$J\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010 2\u0006\u0010\u0003\u001a\u00020(JJ\u00104\u001a\u0004\u0018\u0001032\u0006\u0010+\u001a\u00020\b2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u000101J\u001c\u0010:\u001a\u00020\u000b2\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00109\u001a\u000208J\u001c\u0010=\u001a\u00020\u000b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;052\u0006\u00109\u001a\u000208J\u0016\u0010@\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bJ\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u0012H\u0007J\u0011\u0010C\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\bE\u0010DJ\u001a\u0010.\u001a\u00020F2\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0012H\u0001¢\u0006\u0004\bH\u0010IJ\u000e\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020JJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\bM\u0010DJ\u0011\u0010L\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR(\u0010Y\u001a\u00020X8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010`\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010ZR\u0018\u0010b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR*\u0010h\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bn\u0010`\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010M\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010qR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR4\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c0x8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\by\u0010z\u0012\u0004\b\u007f\u0010`\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R1\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0005\b\u0087\u0001\u0010`\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/Response;", "defaultErrorResponse", "Lokhttp3/RequestBody;", "body", "", "getPlacementID", "bodyToString", "Lmj/r;", "initUserAgentLazy", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/model/DeviceNode;", "getBasicDeviceBody", "getDeviceBody", "", "withFirstPartyData", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUserBody", "withSignals", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExtBody", "getConnectionType", "placementID", "checkIsRetryAfterActive", "", "getRetryAfterHeaderValue", "appId", MobileAdsBridgeBase.initializeMethodName, "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "placement", "Lcom/vungle/ads/VungleAdSize;", C3426d4.i.O, "Lcom/vungle/ads/internal/model/AdPayload;", "requestAd", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "Ljava/lang/Void;", "ri", "url", "", "headers", "requestBody", "Lcom/vungle/ads/internal/network/HttpMethod;", "requestType", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/model/ErrorInfo;", "pingTPAT", "Ljava/util/concurrent/BlockingQueue;", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "metrics", "Lcom/vungle/ads/AnalyticsClient$RequestListener;", "requestListener", "reportMetrics", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "errors", "reportErrors", "adMarkup", G5.f26607r, "sendAdMarkup", Cookie.IS_PLAY_SERVICE_AVAILABLE, "addPlaySvcAvailabilityInCookie", "getPlayServicesAvailabilityFromCookie", "()Ljava/lang/Boolean;", "getPlayServicesAvailabilityFromAPI", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "explicitBlock", "getDeviceBody$vungle_ads_release", "(Z)Lcom/vungle/ads/internal/model/DeviceNode;", "", "type", "getConnectionTypeDetail", "isGooglePlayServicesAvailable", "getConnectionTypeDetail$vungle_ads_release", "()Ljava/lang/String;", "applicationContext", "Landroid/content/Context;", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "Lcom/vungle/ads/internal/network/VungleApi;", "gzipApi", "Lcom/vungle/ads/internal/network/VungleApi;", "getGzipApi$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApi;", "setGzipApi$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApi;)V", "getGzipApi$vungle_ads_release$annotations", "()V", "api", "baseDeviceInfo", "Lcom/vungle/ads/internal/model/DeviceNode;", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "Lcom/vungle/ads/internal/model/AppNode;", "appBody", "Lcom/vungle/ads/internal/model/AppNode;", "getAppBody$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AppNode;", "setAppBody$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AppNode;)V", "getAppBody$vungle_ads_release$annotations", "uaString", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "Lmj/g;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "", "retryAfterDataMap", "Ljava/util/Map;", "getRetryAfterDataMap$vungle_ads_release", "()Ljava/util/Map;", "setRetryAfterDataMap$vungle_ads_release", "(Ljava/util/Map;)V", "getRetryAfterDataMap$vungle_ads_release$annotations", "Lokhttp3/Interceptor;", "responseInterceptor", "Lokhttp3/Interceptor;", "getResponseInterceptor$vungle_ads_release", "()Lokhttp3/Interceptor;", "setResponseInterceptor$vungle_ads_release", "(Lokhttp3/Interceptor;)V", "getResponseInterceptor$vungle_ads_release$annotations", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/persistence/FilePreferences;)V", VastTagName.COMPANION, "ConnectionTypeDetail", "GzipRequestInterceptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleApiClient {
    private static final String TAG = "VungleApiClient";
    private AdvertisingInfo advertisingInfo;
    private VungleApi api;
    private AppNode appBody;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final FilePreferences filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final Platform platform;
    private Interceptor responseInterceptor;
    private Map<String, Long> retryAfterDataMap;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final g signalManager;
    private String uaString;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final Set<Interceptor> networkInterceptors = new HashSet();
    private static final Set<Interceptor> logInterceptors = new HashSet();
    private static final cl.a json = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.network.VungleApiClient$Companion$json$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d dVar) {
            p.j(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
        }
    }, 1, null);

    /* JADX INFO: compiled from: VungleApiClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$Companion;", "", "Lmj/r;", "reset$vungle_ads_release", "()V", "reset", "", "BASE_URL", "Ljava/lang/String;", "getBASE_URL$vungle_ads_release", "()Ljava/lang/String;", "TAG", "Lcl/a;", "json", "Lcl/a;", "", "Lokhttp3/Interceptor;", "logInterceptors", "Ljava/util/Set;", "networkInterceptors", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void reset$vungle_ads_release() {
            VungleHeader.INSTANCE.reset();
        }

        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }
    }

    /* JADX INFO: compiled from: VungleApiClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail;", "", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String EDGE = "edge";
        public static final String FIFTH_G = "5g";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "lte";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";

        /* JADX INFO: compiled from: VungleApiClient.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail$Companion;", "", "()V", "CDMA_1XRTT", "", "CDMA_EVDO_0", "CDMA_EVDO_A", "CDMA_EVDO_B", "EDGE", "FIFTH_G", "GPRS", "HRPD", "HSDPA", "HSUPA", "LTE", "UNKNOWN", "WCDMA", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            public static final String EDGE = "edge";
            public static final String FIFTH_G = "5g";
            public static final String GPRS = "gprs";
            public static final String HRPD = "hrpd";
            public static final String HSDPA = "hsdpa";
            public static final String HSUPA = "hsupa";
            public static final String LTE = "lte";
            public static final String UNKNOWN = "unknown";
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: VungleApiClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "()V", GzipRequestInterceptor.GZIP, "Lokhttp3/RequestBody;", "requestBody", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        private final RequestBody gzip(final RequestBody requestBody) throws IOException {
            final Buffer buffer = new Buffer();
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
            requestBody.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
            return new RequestBody() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return buffer.size();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    p.j(bufferedSink, "sink");
                    bufferedSink.write(buffer.snapshot());
                }
            };
        }

        @Override // okhttp3.Interceptor
        public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
            p.j(chain, "chain");
            Request request = chain.request();
            RequestBody requestBodyBody = request.body();
            return (requestBodyBody == null || request.header(CONTENT_ENCODING) != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header(CONTENT_ENCODING, GZIP).method(request.method(), gzip(requestBodyBody)).build());
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    @VisibleForTesting
    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    public final String getConnectionTypeDetail(int type) {
        if (type == 1) {
            return "gprs";
        }
        if (type == 2) {
            return "edge";
        }
        if (type == 20) {
            return "5g";
        }
        switch (type) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (type) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final synchronized void initialize(String str) {
        PackageInfo packageInfo;
        p.j(str, "appId");
        VungleHeader.INSTANCE.setAppId(str);
        String str2 = NastAdapter.ADAPTER_SDK_VERSION_NAME;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                p.i(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                p.i(packageInfo, "{\n                    ap…      )\n                }");
            }
            String str3 = packageInfo.versionName;
            p.i(str3, "packageInfo.versionName");
            str2 = str3;
        } catch (Exception unused) {
        }
        VungleHeader.INSTANCE.setAppVersion(str2);
        this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
        String packageName = this.applicationContext.getPackageName();
        p.i(packageName, "applicationContext.packageName");
        this.appBody = new AppNode(packageName, str2, str);
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    public VungleApiClient(final Context context, Platform platform, FilePreferences filePreferences) {
        p.j(context, "applicationContext");
        p.j(platform, "platform");
        p.j(filePreferences, "filePreferences");
        this.applicationContext = context;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<SignalManager>() { // from class: com.vungle.ads.internal.network.VungleApiClient$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // bk.a
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
            }
        });
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new Interceptor() { // from class: com.vungle.ads.internal.network.b
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.m3250responseInterceptor$lambda0(this.f45450a, chain);
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProxySelector = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(this.responseInterceptor).proxySelector(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
                } catch (Exception unused) {
                }
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                try {
                    List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                    p.i(listSelect, "{\n                      …ri)\n                    }");
                    return listSelect;
                } catch (Exception unused) {
                    return nj.r.e(Proxy.NO_PROXY);
                }
            }
        });
        OkHttpClient okHttpClientBuild = builderProxySelector.build();
        OkHttpClient okHttpClientBuild2 = builderProxySelector.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new VungleApiImpl(okHttpClientBuild);
        this.gzipApi = new VungleApiImpl(okHttpClientBuild2);
    }

    private final String bodyToString(RequestBody request) {
        try {
            Buffer buffer = new Buffer();
            if (request == null) {
                return "";
            }
            request.writeTo(buffer);
            return buffer.readUtf8();
        } catch (Exception unused) {
            return "";
        }
    }

    private final okhttp3.Response defaultErrorResponse(Request request) {
        return new okhttp3.Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.Companion.create("{\"Error\":\"Server is busy\"}", MediaType.Companion.parse(G5.L))).build();
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        p.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str = Build.MANUFACTURER;
        p.i(str, "MANUFACTURER");
        String str2 = Build.MODEL;
        p.i(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        p.i(str3, "RELEASE");
        DeviceNode deviceNode = new DeviceNode(str, str2, str3, AndroidPlatform.INSTANCE.getCarrierName$vungle_ads_release(context), p.e("Amazon", str) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.VungleExt) null, 1792, (i) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
        }
        return deviceNode;
    }

    private final String getConnectionType() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return Constraint.NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return Z7.f28000t;
        }
        if (type == 1 || type == 6) {
            return Z7.f27999s;
        }
        if (type != 7) {
            return type != 9 ? "UNKNOWN" : "ETHERNET";
        }
        return "BLUETOOTH";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    private final CommonRequestBody.RequestExt getExtBody(boolean withSignals) {
        boolean z10;
        String strGenerateSignals;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        boolean z11 = true;
        if (configExtension == null) {
            z10 = false;
        } else {
            if (configExtension.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            configExtension = this.filePreferences.getString(Cookie.CONFIG_EXTENSION);
        }
        if (withSignals) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Couldn't convert signals for sending. Error: " + e10.getMessage());
                strGenerateSignals = null;
            }
        } else {
            strGenerateSignals = null;
        }
        if (configExtension == null || configExtension.length() == 0) {
            if (strGenerateSignals != null && strGenerateSignals.length() != 0) {
                z11 = false;
            }
            if (z11) {
                return null;
            }
        }
        return new CommonRequestBody.RequestExt(configExtension, strGenerateSignals, Long.valueOf(ConfigManager.INSTANCE.configLastValidatedTimestamp()));
    }

    public static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getExtBody(z10);
    }

    private final String getPlacementID(RequestBody body) {
        List<String> placements;
        String str;
        try {
            cl.a aVar = json;
            String strBodyToString = bodyToString(body);
            xk.b<Object> bVarB = h.b(aVar.a(), s.l(CommonRequestBody.class));
            p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) aVar.b(bVarB, strBodyToString)).getRequest();
            return (request == null || (placements = request.getPlacements()) == null || (str = placements.get(0)) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    private final CommonRequestBody.User getUserBody(boolean withFirstPartyData) {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, (FirstPartyData) null, (CommonRequestBody.IAB) null, 31, (i) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(privacyManager.getCoppaStatus().getValue()));
        }
        if (privacyManager.shouldSendTCFString()) {
            user.setIab(new CommonRequestBody.IAB(privacyManager.getIABTCFString()));
        }
        if (withFirstPartyData) {
            user.setFpd(VungleAds.firstPartyData);
        }
        return user;
    }

    public static /* synthetic */ CommonRequestBody.User getUserBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new Consumer<String>() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // androidx.core.util.Consumer
            public void accept(String str) {
                if (str == null || str.length() == 0) {
                    String str2 = VungleApiClient.this.uaString;
                    if (str2 == null || str2.length() == 0) {
                        str = VungleApiClient.this.platform.getUserAgent();
                    }
                }
                if (str == null || str.length() == 0) {
                    Logger.INSTANCE.e(VungleApiClient.TAG, "All UA sources failed, logging USER_AGENT_ERROR");
                    new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    timeIntervalMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
                    VungleApiClient.this.uaString = str;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorInfo pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, HttpMethod httpMethod, LogEntry logEntry, int i10, Object obj) {
        Map map2 = (i10 & 2) != 0 ? null : map;
        String str3 = (i10 & 4) != 0 ? null : str2;
        if ((i10 & 8) != 0) {
            httpMethod = HttpMethod.GET;
        }
        return vungleApiClient.pingTPAT(str, map2, str3, httpMethod, (i10 & 16) != 0 ? null : logEntry);
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(VungleApiClient vungleApiClient, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return vungleApiClient.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final okhttp3.Response m3250responseInterceptor$lambda0(VungleApiClient vungleApiClient, Interceptor.Chain chain) {
        p.j(vungleApiClient, "this$0");
        p.j(chain, "chain");
        Request request = chain.request();
        try {
            try {
                okhttp3.Response responseProceed = chain.proceed(request);
                String str = responseProceed.headers().get(CommonGatewayClient.HEADER_RETRY_AFTER);
                boolean z10 = true;
                if (str == null || str.length() == 0) {
                    return responseProceed;
                }
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 <= 0) {
                        return responseProceed;
                    }
                    String strEncodedPath = request.url().encodedPath();
                    long jCurrentTimeMillis = (j10 * ((long) 1000)) + System.currentTimeMillis();
                    if (!x.D(strEncodedPath, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null)) {
                        return responseProceed;
                    }
                    String placementID = vungleApiClient.getPlacementID(request.body());
                    if (placementID.length() <= 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        return responseProceed;
                    }
                    vungleApiClient.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                    return responseProceed;
                } catch (Exception unused) {
                    Logger.INSTANCE.d(TAG, "Retry-After value is not an valid value");
                    return responseProceed;
                }
            } catch (OutOfMemoryError unused2) {
                Logger.INSTANCE.e(TAG, "OOM for " + request.url());
                return vungleApiClient.defaultErrorResponse(request);
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Exception: " + e10.getMessage() + " for " + request.url());
            return vungleApiClient.defaultErrorResponse(request);
        }
    }

    @VisibleForTesting
    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        p.j(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final Call<ConfigPayload> config() throws IOException {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (i) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!x.D(str, "/", false, 2, null)) {
            str = str + '/';
        }
        return this.api.config(VungleHeader.INSTANCE.getHeaderUa(), str + "config", commonRequestBody);
    }

    /* JADX INFO: renamed from: getAppBody$vungle_ads_release, reason: from getter */
    public final AppNode getAppBody() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    @VisibleForTesting
    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean explicitBlock) throws IllegalStateException {
        DeviceNode deviceNodeCopy;
        DeviceNode.VungleExt vungleExt;
        String str;
        boolean zHasSystemFeature;
        DeviceNode basicDeviceBody = this.baseDeviceInfo;
        if (basicDeviceBody == null) {
            basicDeviceBody = getBasicDeviceBody(this.applicationContext);
            this.baseDeviceInfo = basicDeviceBody;
        }
        DeviceNode deviceNode = basicDeviceBody;
        deviceNodeCopy = deviceNode.copy((2047 & 1) != 0 ? deviceNode.make : null, (2047 & 2) != 0 ? deviceNode.model : null, (2047 & 4) != 0 ? deviceNode.osv : null, (2047 & 8) != 0 ? deviceNode.carrier : null, (2047 & 16) != 0 ? deviceNode.os : null, (2047 & 32) != 0 ? deviceNode.w : 0, (2047 & 64) != 0 ? deviceNode.h : 0, (2047 & 128) != 0 ? deviceNode.ua : null, (2047 & 256) != 0 ? deviceNode.ifa : null, (2047 & 512) != 0 ? deviceNode.lmt : null, (2047 & 1024) != 0 ? deviceNode.ext : null);
        DeviceNode.VungleExt vungleExt2 = new DeviceNode.VungleExt(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (i) null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.applicationContext.getSystemService("window");
        p.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        deviceNodeCopy.setH(displayMetrics.heightPixels);
        deviceNodeCopy.setW(displayMetrics.widthPixels);
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo == null) {
            advertisingInfo = this.platform.getAdvertisingInfo();
        }
        this.advertisingInfo = advertisingInfo;
        String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
        AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
        Boolean boolValueOf = advertisingInfo2 != null ? Boolean.valueOf(advertisingInfo2.getLimitAdTracking()) : null;
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        if (!privacyManager.shouldSendAdIds()) {
            vungleExt = vungleExt2;
        } else if (advertisingId != null) {
            if (p.e("Amazon", Build.MANUFACTURER)) {
                vungleExt = vungleExt2;
                vungleExt.setAmazonAdvertisingId(advertisingId);
            } else {
                vungleExt = vungleExt2;
                vungleExt.setGaid(advertisingId);
            }
            deviceNodeCopy.setIfa(advertisingId);
        } else {
            vungleExt = vungleExt2;
            deviceNodeCopy.setIfa("");
        }
        if (explicitBlock || !privacyManager.shouldSendAdIds()) {
            deviceNodeCopy.setIfa(null);
            vungleExt.setGaid(null);
            vungleExt.setAmazonAdvertisingId(null);
        }
        Boolean bool = Boolean.TRUE;
        deviceNodeCopy.setLmt(p.e(boolValueOf, bool) ? 1 : 0);
        vungleExt.setGooglePlayServicesAvailable(p.e(bool, isGooglePlayServicesAvailable()));
        if (privacyManager.allowDeviceIDFromTCF() != PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
            String appSetId = this.platform.getAppSetId();
            if (appSetId != null) {
                vungleExt.setAppSetId(appSetId);
            }
            Integer appSetIdScope = this.platform.getAppSetIdScope();
            if (appSetIdScope != null) {
                vungleExt.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
            }
        }
        Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                vungleExt.setBatteryLevel(intExtra / intExtra2);
            }
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 == 2 || intExtra3 == 5) {
                int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                if (intExtra4 == 1) {
                    str = "BATTERY_PLUGGED_AC";
                } else if (intExtra4 != 2) {
                    str = intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS";
                } else {
                    str = "BATTERY_PLUGGED_USB";
                }
            } else {
                str = "NOT_CHARGING";
            }
        } else {
            str = "UNKNOWN";
        }
        vungleExt.setBatteryState(str);
        vungleExt.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
        String connectionType = getConnectionType();
        if (connectionType != null) {
            vungleExt.setConnectionType(connectionType);
        }
        String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
        if (connectionTypeDetail$vungle_ads_release != null) {
            vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
        }
        vungleExt.setLocale(Locale.getDefault().toString());
        vungleExt.setLanguage(Locale.getDefault().getLanguage());
        vungleExt.setTimeZone(TimeZone.getDefault().getID());
        vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
        vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
        if (p.e("Amazon", Build.MANUFACTURER)) {
            zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else {
            Object systemService2 = this.applicationContext.getSystemService("uimode");
            p.h(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
            zHasSystemFeature = ((UiModeManager) systemService2).getCurrentModeType() == 4;
        }
        vungleExt.setTv(zHasSystemFeature);
        vungleExt.setSideloadEnabled(this.platform.getIsSideLoaded());
        vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
        if (ConfigManager.INSTANCE.otEnabled()) {
            vungleExt.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
            vungleExt.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
            vungleExt.setOrt(Long.valueOf(this.platform.getLastBootTime()));
            vungleExt.setObt(Long.valueOf(this.platform.getBuildTime()));
        }
        vungleExt.setGpVersion(this.platform.getGPVersion());
        deviceNodeCopy.setUa(this.uaString);
        deviceNodeCopy.setExt(vungleExt);
        return deviceNodeCopy;
    }

    /* JADX INFO: renamed from: getGzipApi$vungle_ads_release, reason: from getter */
    public final VungleApi getGzipApi() {
        return this.gzipApi;
    }

    @VisibleForTesting
    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            p.i(googleApiAvailabilityLight, "getInstance()");
            boolValueOf = Boolean.valueOf(googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0);
            addPlaySvcAvailabilityInCookie(boolValueOf.booleanValue());
            return boolValueOf;
        } catch (Exception unused) {
            Logger.INSTANCE.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Logger.INSTANCE.w(TAG, "Play services Not available");
            Boolean bool = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
                return bool;
            } catch (Exception unused3) {
                Logger.INSTANCE.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        }
    }

    @VisibleForTesting
    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    /* JADX INFO: renamed from: getResponseInterceptor$vungle_ads_release, reason: from getter */
    public final Interceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        p.j(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @VisibleForTesting
    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final ErrorInfo pingTPAT(String url, Map<String, String> headers, String requestBody, HttpMethod requestType, LogEntry logEntry) {
        okhttp3.Response rawResponse;
        p.j(url, "url");
        p.j(requestType, "requestType");
        if (!FileUtility.INSTANCE.isValidUrl(url)) {
            return new ErrorInfo("Invalid URL", true, false, 4, null);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) && URLUtil.isHttpUrl(url)) {
                return new ErrorInfo("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str = this.uaString;
                if (str == null) {
                    str = "";
                }
                Response<Void> responseExecute = this.api.pingTPAT(str, url, requestType, headers, requestBody != null ? RequestBody.Companion.create(requestBody, MediaType.Companion.parse(G5.L)) : null).execute();
                if (responseExecute != null && responseExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (responseExecute == null || (rawResponse = responseExecute.getRawResponse()) == null) ? null : Integer.valueOf(rawResponse.code());
                if (b0.U(nj.s.n(301, 302, 307, 308), numValueOf)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, logEntry, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new ik.i(500, CommonGatewayClient.CODE_599).l(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(responseExecute != null ? responseExecute.message() : null);
                return new ErrorInfo(sb2.toString(), false, z10, 2, null);
            } catch (Throwable th2) {
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new ErrorInfo(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new ErrorInfo(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(BlockingQueue<Sdk.SDKError.Builder> blockingQueue, final AnalyticsClient.RequestListener requestListener) {
        p.j(blockingQueue, "errors");
        p.j(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKError.Builder builder : blockingQueue) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKError sDKErrorBuild = builder.build();
            Logger.INSTANCE.e(TAG, "Sending Error: " + sDKErrorBuild.getReason());
            linkedBlockingQueue.add(sDKErrorBuild);
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.Companion;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        p.i(byteArray, "batch.toByteArray()");
        this.api.sendErrors(VungleHeader.INSTANCE.getHeaderUa(), errorLoggingEndpoint, companion.create(byteArray, MediaType.Companion.parse(CommonGatewayClient.HEADER_PROTOBUF), 0, sDKErrorBatchBuild.toByteArray().length)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportErrors.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final void reportMetrics(BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue, final AnalyticsClient.RequestListener requestListener) {
        p.j(blockingQueue, "metrics");
        p.j(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKMetric.Builder builder : blockingQueue) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKMetric sDKMetricBuild = builder.build();
            Logger.INSTANCE.e(TAG, "Sending Metric: " + sDKMetricBuild.getType());
            linkedBlockingQueue.add(sDKMetricBuild);
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = metricBatchBuild.toByteArray();
        p.i(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(VungleHeader.INSTANCE.getHeaderUa(), metricsEndpoint, RequestBody.Companion.create$default(companion, mediaType, byteArray, 0, 0, 12, (Object) null)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportMetrics.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final Call<AdPayload> requestAd(String placement, VungleAdSize adSize) throws IllegalStateException {
        p.j(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String adsEndpoint = configManager.getAdsEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(nj.r.e(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 62, (i) null);
        if (adSize != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(adSize.getWidth(), adSize.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(VungleHeader.INSTANCE.getHeaderUa(), adsEndpoint, commonRequestBodyRequestBody);
    }

    public final Call<Void> ri(CommonRequestBody.RequestParam request) {
        AppNode appNode;
        p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if ((riEndpoint == null || riEndpoint.length() == 0) || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (i) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(VungleHeader.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public final void sendAdMarkup(String str, String str2) {
        p.j(str, "adMarkup");
        p.j(str2, G5.f26607r);
        this.api.sendAdMarkup(str2, RequestBody.Companion.create(str, MediaType.Companion.parse(G5.L))).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.sendAdMarkup.1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th2) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
            }
        });
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        p.j(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(Interceptor interceptor) {
        p.j(interceptor, "<set-?>");
        this.responseInterceptor = interceptor;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        p.j(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    public final CommonRequestBody requestBody(boolean withSignals, boolean withFirstPartyData) throws IllegalStateException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(withFirstPartyData), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (i) null);
        CommonRequestBody.RequestExt extBody = getExtBody(withSignals);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }
}
