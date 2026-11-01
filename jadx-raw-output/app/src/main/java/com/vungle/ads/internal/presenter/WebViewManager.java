package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import ck.p;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: WebViewManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JM\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&0%j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager;", "", "", C3426d4.i.W, "Lmj/r;", "destroyWebViewInternal", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/model/AdPayload;", "adv", "Lcom/vungle/ads/internal/model/Placement;", "placement", "templatePath", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "webSettings", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "delegate", "", "loadDuration", "preloadWebView$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "preloadWebView", "Landroid/webkit/WebView;", "getOrCreateWebView", "advertisement", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "offloadExecutor", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "getOrCreateWebViewClient", "destroyWebView", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/LinkedHashMap;", "Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "Lkotlin/collections/LinkedHashMap;", "webViewCache", "Ljava/util/LinkedHashMap;", "<init>", "()V", "WebViewEntry", "Lcom/vungle/ads/internal/executor/Executors;", "executors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class WebViewManager {
    private static final String TAG = "WebViewManager";
    public static final WebViewManager INSTANCE = new WebViewManager();
    private static final ReentrantLock lock = new ReentrantLock();
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: compiled from: WebViewManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "(Landroid/webkit/WebView;Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "getWebView", "()Landroid/webkit/WebView;", "getWebViewClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WebViewEntry {
        private final WebView webView;
        private final VungleWebClient webViewClient;

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WebView getWebView() {
            return this.webView;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public final WebViewEntry copy(WebView webView, VungleWebClient webViewClient) {
            p.j(webView, "webView");
            p.j(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) other;
            return p.e(this.webView, webViewEntry.webView) && p.e(this.webViewClient, webViewEntry.webViewClient);
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }

        public final WebView getWebView() {
            return this.webView;
        }

        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public WebViewEntry(WebView webView, VungleWebClient vungleWebClient) {
            p.j(webView, "webView");
            p.j(vungleWebClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = vungleWebClient;
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(String str) {
        p.j(str, C3426d4.i.W);
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(str);
            r rVar = r.f64562a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final WebView getOrCreateWebView(Context context, String key) {
        WebView webView;
        p.j(context, GAMConfig.KEY_CONTEXT);
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(key);
            if (webViewEntry != null) {
                Logger.INSTANCE.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.INSTANCE.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final VungleWebClient getOrCreateWebViewClient(AdPayload advertisement, Placement placement, VungleThreadPoolExecutor offloadExecutor, Platform platform) {
        p.j(advertisement, "advertisement");
        p.j(placement, "placement");
        p.j(offloadExecutor, "offloadExecutor");
        p.j(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(final Context context, final AdPayload adv, final Placement placement, final String templatePath, final AdPayload.WebViewSettings webSettings, final PreloadDelegate delegate, final Long loadDuration) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(adv, "adv");
        p.j(placement, "placement");
        p.j(templatePath, "templatePath");
        p.j(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            companion.d(TAG, sb2.toString());
            final String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object objM3458constructorimpl;
                        WebViewManager webViewManager = WebViewManager.INSTANCE;
                        final Context context2 = context;
                        AdPayload adPayload = adv;
                        Placement placement2 = placement;
                        PreloadDelegate preloadDelegate = delegate;
                        Long l10 = loadDuration;
                        String str = templatePath;
                        String str2 = strEventId;
                        AdPayload.WebViewSettings webViewSettings = webSettings;
                        try {
                            Result.a aVar = Result.Companion;
                            WebView webView = new WebView(context2.getApplicationContext());
                            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
                            ServiceLocator.Companion companion2 = ServiceLocator.INSTANCE;
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement2, m3262invoke$lambda3$lambda1(kotlin.b.b(lazyThreadSafetyMode, new bk.a<Executors>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                                @Override // bk.a
                                public final Executors invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Executors.class);
                                }
                            })).getOffloadExecutor(), m3263invoke$lambda3$lambda2(kotlin.b.b(lazyThreadSafetyMode, new bk.a<Platform>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                                @Override // bk.a
                                public final Platform invoke() {
                                    return ServiceLocator.INSTANCE.getInstance(context2).getService(Platform.class);
                                }
                            })), preloadDelegate, l10);
                            ConfigManager configManager = ConfigManager.INSTANCE;
                            vungleWebClient.setConsentStatus(configManager.getGDPRIsCountryDataProtected() && p.e("unknown", PrivacyManager.INSTANCE.getConsentStatus()), configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
                            webView.setWebViewClient(vungleWebClient);
                            LiftoffMonetizeNetworkBridge.webviewLoadUrl(webView, str);
                            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.WebViewEntry(webView, vungleWebClient));
                            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT, WebViewManager.webViewCache.size(), adPayload.getLogEntry(), null, 8, null);
                            objM3458constructorimpl = Result.m3458constructorimpl(Integer.valueOf(Logger.INSTANCE.d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.Companion;
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                        }
                        PreloadDelegate preloadDelegate2 = delegate;
                        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            Logger.INSTANCE.e("WebViewManager", "Preload webview failed", thM3461exceptionOrNullimpl);
                            preloadDelegate2.onAdReadyToPlay();
                        }
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
                    private static final Executors m3262invoke$lambda3$lambda1(g<? extends Executors> gVar) {
                        return gVar.getValue();
                    }

                    /* JADX INFO: renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
                    private static final Platform m3263invoke$lambda3$lambda2(g<? extends Platform> gVar) {
                        return gVar.getValue();
                    }
                });
            }
            r rVar = r.f64562a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
