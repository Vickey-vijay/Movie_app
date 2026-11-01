package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import ck.p;
import cl.s;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.json.JsonObject;
import lk.a0;
import lk.w;
import lk.x;
import nj.b0;

/* JADX INFO: compiled from: VungleWebClient.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u009f\u00012\u00020\u00012\u00020\u0002:\u0004\u009f\u0001 \u0001BE\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002J8\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J/\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e0 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0017J\u001c\u0010%\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0016\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\bJ\u0010\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00102\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0016J\u0012\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000103H\u0016J*\u0010:\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0017J&\u0010<\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010;\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010:\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010>\u001a\u0004\u0018\u00010=H\u0016J\u001c\u0010A\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u0004\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR(\u0010S\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010Z\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010[\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010Z\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010b\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bb\u0010\\\u0012\u0004\be\u0010Z\u001a\u0004\bc\u0010^\"\u0004\bd\u0010`R*\u0010f\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010\\\u0012\u0004\bi\u0010Z\u001a\u0004\bg\u0010^\"\u0004\bh\u0010`R*\u0010j\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010\\\u0012\u0004\bm\u0010Z\u001a\u0004\bk\u0010^\"\u0004\bl\u0010`R*\u0010n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010Z\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010u\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bu\u0010T\u0012\u0004\bx\u0010Z\u001a\u0004\bv\u0010V\"\u0004\bw\u0010XR*\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010y\u0012\u0004\b~\u0010Z\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R/\u00101\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0004\b1\u0010\u007f\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R0\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b4\u0010\u008a\u0001\u0012\u0005\b\u008f\u0001\u0010Z\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R0\u0010.\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b.\u0010\u0090\u0001\u0012\u0005\b\u0095\u0001\u0010Z\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient;", "Landroid/webkit/WebViewClient;", "Lcom/vungle/ads/internal/ui/view/WebViewAPI;", "", "errorMsg", "url", "", "didCrash", "Lmj/r;", "handleWebViewError", "isCriticalAsset", "Landroid/webkit/WebView;", "webView", "injectJs", "runJavascriptOnWebView", "collectedConsent", "title", "message", "accept", "deny", "setConsentStatus", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "mraidDelegate", "setMraidDelegate", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/webkit/WebResourceRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "rangeHeader", "", "contentLength", "Lkotlin/Pair;", "parseRange$vungle_ads_release", "(Ljava/lang/String;J)Lkotlin/Pair;", "parseRange", "shouldOverrideUrlLoading", "onPageFinished", "skipCmdQueue", "notifyPropertiesChange", "availableDiskSize", "appFolderSize", "notifyDiskAvailableSize", "silentModeEnabled", "notifySilentModeChange", "notifyPresentAppStoreFailed", C3426d4.i.f28556o, "setAdVisibility", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "errorHandler", "setErrorHandler", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "webViewObserver", "setWebViewObserver", "", IronSourceConstants.EVENTS_ERROR_CODE, UnifiedMediationParams.KEY_DESCRIPTION, "failingUrl", "onReceivedError", "errorResponse", "onReceivedHttpError", "Landroid/webkit/WebResourceError;", "error", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "Ljava/util/concurrent/ExecutorService;", "offloadExecutor", "Ljava/util/concurrent/ExecutorService;", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "Ljava/lang/Long;", "collectConsent", "Z", "getCollectConsent$vungle_ads_release", "()Z", "setCollectConsent$vungle_ads_release", "(Z)V", "getCollectConsent$vungle_ads_release$annotations", "()V", "gdprTitle", "Ljava/lang/String;", "getGdprTitle$vungle_ads_release", "()Ljava/lang/String;", "setGdprTitle$vungle_ads_release", "(Ljava/lang/String;)V", "getGdprTitle$vungle_ads_release$annotations", "gdprBody", "getGdprBody$vungle_ads_release", "setGdprBody$vungle_ads_release", "getGdprBody$vungle_ads_release$annotations", "gdprAccept", "getGdprAccept$vungle_ads_release", "setGdprAccept$vungle_ads_release", "getGdprAccept$vungle_ads_release$annotations", "gdprDeny", "getGdprDeny$vungle_ads_release", "setGdprDeny$vungle_ads_release", "getGdprDeny$vungle_ads_release$annotations", "loadedWebView", "Landroid/webkit/WebView;", "getLoadedWebView$vungle_ads_release", "()Landroid/webkit/WebView;", "setLoadedWebView$vungle_ads_release", "(Landroid/webkit/WebView;)V", "getLoadedWebView$vungle_ads_release$annotations", C3426d4.i.f28564s, "getReady$vungle_ads_release", "setReady$vungle_ads_release", "getReady$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "getMraidDelegate$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;", "setMraidDelegate$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$MraidDelegate;)V", "getMraidDelegate$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "getErrorHandler$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "setErrorHandler$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "getErrorHandler$vungle_ads_release$annotations", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$vungle_ads_release", "()Landroid/os/Handler;", "Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "getWebViewObserver$vungle_ads_release", "()Lcom/vungle/ads/internal/omsdk/WebViewObserver;", "setWebViewObserver$vungle_ads_release", "(Lcom/vungle/ads/internal/omsdk/WebViewObserver;)V", "getWebViewObserver$vungle_ads_release$annotations", "Ljava/lang/Boolean;", "isViewable$vungle_ads_release", "()Ljava/lang/Boolean;", "setViewable$vungle_ads_release", "(Ljava/lang/Boolean;)V", "isViewable$vungle_ads_release$annotations", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadMetric", "Lcom/vungle/ads/OneShotSingleValueMetric;", "partialDownloadErrorMetric", "Lcom/vungle/ads/SingleValueMetric;", "skippedUrlMetric", "Lcom/vungle/ads/SingleValueMetric;", "<init>", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", VastTagName.COMPANION, "VungleWebViewRenderProcessClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private final Handler handler;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l10, int i10, ck.i iVar) {
        this(adPayload, placement, executorService, (i10 & 8) != 0 ? null : platform, (i10 & 16) != 0 ? null : preloadDelegate, (i10 & 32) != 0 ? null : l10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44958d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44958d, webView, str);
        safedk_VungleWebClient_onPageFinished_d298b859bb4101fde140002b07454561(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        p.j(str2, "failingUrl");
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(final WebView view, final RenderProcessGoneDetail detail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onRenderProcessGone url: ");
                    WebView webView = view;
                    sb2.append(webView != null ? webView.getUrl() : null);
                    return sb2.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(view, Boolean.TRUE);
            }
            return true;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onRenderProcessGone.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onRenderProcessGone url: ");
                WebView webView = view;
                sb2.append(webView != null ? webView.getUrl() : null);
                sb2.append(", did crash: ");
                RenderProcessGoneDetail renderProcessGoneDetail = detail;
                sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                return sb2.toString();
            }
        });
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(view, detail != null ? Boolean.valueOf(detail.didCrash()) : null);
        }
        return super.onRenderProcessGone(view, detail);
    }

    public final Pair<Long, Long> parseRange$vungle_ads_release(String rangeHeader, long contentLength) {
        Object objM3458constructorimpl;
        Pair pair;
        try {
            Result.a aVar = Result.Companion;
            if (rangeHeader != null && x.R(rangeHeader, "bytes=", false, 2, null)) {
                List listN0 = a0.N0(a0.E0(rangeHeader, "bytes="), new String[]{"-"}, false, 0, 6, null);
                String str = (String) b0.i0(listN0, 0);
                Long lT = str != null ? w.t(str) : null;
                String str2 = (String) b0.i0(listN0, 1);
                Long lT2 = str2 != null ? w.t(str2) : null;
                if (lT == null) {
                    if (lT2 == null) {
                        lT = 0L;
                    } else {
                        lT = Long.valueOf(contentLength - lT2.longValue());
                        lT2 = null;
                    }
                }
                pair = new Pair(lT, lT2);
            } else {
                pair = new Pair(0L, null);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(pair);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            objM3458constructorimpl = new Pair(0L, null);
        }
        return (Pair) objM3458constructorimpl;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44958d, view, request, safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(view, request));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44958d, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/VungleWebClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb = safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44958d, view, url, zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb);
        return zSafedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb;
    }

    /* JADX INFO: compiled from: VungleWebClient.kt */
    @RequiresApi(29)
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleWebClient$VungleWebViewRenderProcessClient;", "Landroid/webkit/WebViewRenderProcessClient;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "Lmj/r;", "onRenderProcessUnresponsive", "onRenderProcessResponsive", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "errorHandler", "Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;", "<init>", "(Lcom/vungle/ads/internal/ui/view/WebViewAPI$WebClientErrorHandler;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            p.j(webView, "webView");
        }

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessUnresponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
            p.j(webView, "webView");
            com.vungle.ads.internal.util.Logger.INSTANCE.w(VungleWebClient.TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onRenderProcessUnresponsive(Title = ");
                    sb2.append(webView.getTitle());
                    sb2.append(", URL = ");
                    sb2.append(webView.getOriginalUrl());
                    sb2.append(", (webViewRenderProcess != null) = ");
                    sb2.append(webViewRenderProcess != null);
                    return sb2.toString();
                }
            });
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l10) {
        p.j(adPayload, "advertisement");
        p.j(placement, "placement");
        p.j(executorService, "offloadExecutor");
        this.advertisement = adPayload;
        this.placement = placement;
        this.offloadExecutor = executorService;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l10;
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str3, z10);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, final String str) {
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.runJavascriptOnWebView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    return "mraid Injecting JS " + str;
                }
            });
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Throwable th2) {
            new EvaluateJsError("Evaluate js failed " + th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m3282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate mraidDelegate, String str, JsonObject jsonObject, final VungleWebClient vungleWebClient, final WebView webView) {
        p.j(mraidDelegate, "$it");
        p.j(str, "$command");
        p.j(jsonObject, "$args");
        p.j(vungleWebClient, "this$0");
        if (mraidDelegate.processCommand(str, jsonObject)) {
            vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m3283shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(this.f45462b, webView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: getCollectConsent$vungle_ads_release, reason: from getter */
    public final boolean getCollectConsent() {
        return this.collectConsent;
    }

    /* JADX INFO: renamed from: getErrorHandler$vungle_ads_release, reason: from getter */
    public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    /* JADX INFO: renamed from: getGdprAccept$vungle_ads_release, reason: from getter */
    public final String getGdprAccept() {
        return this.gdprAccept;
    }

    /* JADX INFO: renamed from: getGdprBody$vungle_ads_release, reason: from getter */
    public final String getGdprBody() {
        return this.gdprBody;
    }

    /* JADX INFO: renamed from: getGdprDeny$vungle_ads_release, reason: from getter */
    public final String getGdprDeny() {
        return this.gdprDeny;
    }

    /* JADX INFO: renamed from: getGdprTitle$vungle_ads_release, reason: from getter */
    public final String getGdprTitle() {
        return this.gdprTitle;
    }

    /* JADX INFO: renamed from: getHandler$vungle_ads_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    /* JADX INFO: renamed from: getLoadedWebView$vungle_ads_release, reason: from getter */
    public final WebView getLoadedWebView() {
        return this.loadedWebView;
    }

    /* JADX INFO: renamed from: getMraidDelegate$vungle_ads_release, reason: from getter */
    public final WebViewAPI.MraidDelegate getMraidDelegate() {
        return this.mraidDelegate;
    }

    /* JADX INFO: renamed from: getReady$vungle_ads_release, reason: from getter */
    public final boolean getReady() {
        return this.ready;
    }

    /* JADX INFO: renamed from: getWebViewObserver$vungle_ads_release, reason: from getter */
    public final WebViewObserver getWebViewObserver() {
        return this.webViewObserver;
    }

    /* JADX INFO: renamed from: isViewable$vungle_ads_release, reason: from getter */
    public final Boolean getIsViewable() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j10 + '-' + j11 + ')');
        }
    }

    public final void notifyPresentAppStoreFailed() {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(final boolean z10) {
        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.g
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m3277notifyPropertiesChange$lambda25(z10, this);
            }
        });
    }

    public final void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            s sVar = new s();
            cl.h.b(sVar, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + sVar.a() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        handleWebViewError(strValueOf, strValueOf2, isCriticalAsset(strValueOf2) && z10);
    }

    public WebResourceResponse safedk_VungleWebClient_shouldInterceptRequest_0add75f4a1a96fc4bfeddb3a64e7131d(WebView p10, WebResourceRequest p11) {
        String scheme;
        Uri url = p11 != null ? p11.getUrl() : null;
        if (url == null || (scheme = url.getScheme()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        p.i(locale, NativeAdContent.ViewTag.ROOT);
        String lowerCase = scheme.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        if (!p.e(lowerCase, "http") && !p.e(lowerCase, "https")) {
            return null;
        }
        if (!this.advertisement.isPartialDownloadEnabled()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.1
                @Override // bk.a
                public final String invoke() {
                    return "shouldInterceptRequest called but partial download is disabled.";
                }
            });
            return null;
        }
        String string = url.toString();
        p.i(string, "uri.toString()");
        AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
        String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
        if (localPath == null || localPath.length() == 0) {
            return null;
        }
        File file = new File(localPath);
        if (!file.exists()) {
            return null;
        }
        long contentLength = localPartialDownloadAssets.getContentLength();
        if (contentLength <= 0) {
            return null;
        }
        long length = file.length();
        final String str = p11.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
        this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
        Pair<Long, Long> range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
        localPartialDownloadAssets.setRangeStart(range$vungle_ads_release.getFirst().longValue());
        localPartialDownloadAssets.setRangeEnd(range$vungle_ads_release.getSecond());
        long jLongValue = range$vungle_ads_release.component1().longValue();
        Long lComponent2 = range$vungle_ads_release.component2();
        long j10 = length - jLongValue;
        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
        companion.i(TAG, ">>request: " + str + " rangeStart=" + jLongValue + " rangeEnd=" + lComponent2 + " cachedFileLength=" + length + " availableBytes=" + j10 + " contentLength=" + contentLength + ' ');
        if (j10 <= 0) {
            companion.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldInterceptRequest.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    return "Requested range exceeds cached file: " + str;
                }
            });
            localPartialDownloadAssets.waitForDownload();
            length = file.length();
        }
        long jLongValue2 = lComponent2 != null ? lComponent2.longValue() : length - 1;
        long j11 = (jLongValue2 - jLongValue) + 1;
        try {
            Result.a aVar = Result.Companion;
            WebResourceResponse webResourceResponse = new WebResourceResponse("video/mp4", "UTF-8", 206, "Partial Content", kotlin.collections.a.m(mj.h.a("Content-Type", "video/mp4"), mj.h.a("Accept-Ranges", "bytes"), mj.h.a("Content-Length", String.valueOf(j11)), mj.h.a("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(new FileInputStream(file), 1024));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<<Return:");
            sb2.append(webResourceResponse.getResponseHeaders());
            companion.i(TAG, sb2.toString());
            return webResourceResponse;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(Result.m3458constructorimpl(kotlin.c.a(th2)));
            if (thM3461exceptionOrNullimpl != null) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error serving local range video: " + thM3461exceptionOrNullimpl.getMessage(), thM3461exceptionOrNullimpl);
                this.partialDownloadErrorMetric.setMeta(string + ' ' + thM3461exceptionOrNullimpl.getMessage());
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00c3, B:52:0x00d0, B:54:0x00d6, B:55:0x00e9, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x010c, B:57:0x00fb, B:59:0x0103, B:64:0x013c, B:66:0x0154), top: B:73:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00c3, B:52:0x00d0, B:54:0x00d6, B:55:0x00e9, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x010c, B:57:0x00fb, B:59:0x0103, B:64:0x013c, B:66:0x0154), top: B:73:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[Catch: all -> 0x0169, LOOP:0: B:52:0x00d0->B:54:0x00d6, LOOP_END, TryCatch #0 {all -> 0x0169, blocks: (B:3:0x0003, B:5:0x001c, B:11:0x0028, B:13:0x002e, B:15:0x003d, B:22:0x004a, B:24:0x0056, B:26:0x005c, B:46:0x00b2, B:48:0x00b6, B:51:0x00c3, B:52:0x00d0, B:54:0x00d6, B:55:0x00e9, B:33:0x0070, B:36:0x0079, B:37:0x0085, B:40:0x008e, B:41:0x0099, B:43:0x00a1, B:45:0x00a5, B:62:0x010c, B:57:0x00fb, B:59:0x0103, B:64:0x013c, B:66:0x0154), top: B:73:0x0003 }] */
    public boolean safedk_VungleWebClient_shouldOverrideUrlLoading_11f193c49fc5d521699217c7324e1efb(final WebView p10, final String p11) {
        final WebViewAPI.MraidDelegate mraidDelegate;
        s sVar;
        try {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            companion.d(TAG, "MRAID Command " + p11);
            if (p11 == null || p11.length() == 0) {
                companion.e(TAG, "Invalid URL ");
                return false;
            }
            Uri uri = Uri.parse(p11);
            p.i(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme == null || scheme.length() == 0) {
                return false;
            }
            String scheme2 = uri.getScheme();
            if (!p.e(scheme2, "mraid")) {
                if (!x.E("http", scheme2, true)) {
                    if (x.E("https", scheme2, true)) {
                    }
                }
                companion.d(TAG, "Open URL" + p11);
                WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                if (mraidDelegate2 != null) {
                    s sVar2 = new s();
                    cl.h.d(sVar2, "url", p11);
                    mraidDelegate2.processCommand("openNonMraid", sVar2.a());
                }
                return true;
            }
            final String host = uri.getHost();
            if (host != null) {
                int iHashCode = host.hashCode();
                if (iHashCode != -1943542072) {
                    if (iHashCode != 88409791) {
                        if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                            this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m3286shouldOverrideUrlLoading$lambda16$lambda8(this.f45482b, p10);
                                }
                            });
                        } else {
                            mraidDelegate = this.mraidDelegate;
                            if (mraidDelegate == null) {
                                this.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m3281shouldOverrideUrlLoading$lambda16$lambda11(this.f45486b, p10);
                                    }
                                });
                                return true;
                            }
                            if (mraidDelegate != null) {
                                sVar = new s();
                                for (String str : uri.getQueryParameterNames()) {
                                    p.i(str, "param");
                                    cl.h.d(sVar, str, uri.getQueryParameter(str));
                                }
                                final JsonObject jsonObjectA = sVar.a();
                                this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        VungleWebClient.m3282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(mraidDelegate, host, jsonObjectA, this, p10);
                                    }
                                });
                            }
                        }
                    } else if (host.equals("failToLoad")) {
                        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m3279shouldOverrideUrlLoading$lambda16$lambda10(this.f45484b, p10);
                            }
                        });
                    } else {
                        mraidDelegate = this.mraidDelegate;
                        if (mraidDelegate == null) {
                            this.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m3281shouldOverrideUrlLoading$lambda16$lambda11(this.f45486b, p10);
                                }
                            });
                            return true;
                        }
                        if (mraidDelegate != null) {
                            sVar = new s();
                            while (r2.hasNext()) {
                                p.i(str, "param");
                                cl.h.d(sVar, str, uri.getQueryParameter(str));
                            }
                            final JsonObject jsonObjectA2 = sVar.a();
                            this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VungleWebClient.m3282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(mraidDelegate, host, jsonObjectA2, this, p10);
                                }
                            });
                        }
                    }
                } else if (!host.equals("propertiesChangeCompleted")) {
                    mraidDelegate = this.mraidDelegate;
                    if (mraidDelegate == null) {
                        this.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m3281shouldOverrideUrlLoading$lambda16$lambda11(this.f45486b, p10);
                            }
                        });
                        return true;
                    }
                    if (mraidDelegate != null) {
                        sVar = new s();
                        while (r2.hasNext()) {
                            p.i(str, "param");
                            cl.h.d(sVar, str, uri.getQueryParameter(str));
                        }
                        final JsonObject jsonObjectA3 = sVar.a();
                        this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m3282shouldOverrideUrlLoading$lambda16$lambda15$lambda14(mraidDelegate, host, jsonObjectA3, this, p10);
                            }
                        });
                    }
                } else if (!this.ready) {
                    this.ready = true;
                    this.offloadExecutor.submit(new Runnable() { // from class: com.vungle.ads.internal.ui.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            VungleWebClient.m3284shouldOverrideUrlLoading$lambda16$lambda6(this.f45480b, p10);
                        }
                    });
                }
                return true;
            }
            this.skippedUrlMetric.setMeta("url: " + p11);
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
            companion.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.shouldOverrideUrlLoading.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final String invoke() {
                    return "skipped url: " + p11;
                }
            });
            return false;
        } catch (Throwable p12) {
            if (p12 instanceof OutOfMemoryError) {
                new OutOfMemory("mraid:" + p11).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        p.j(webClientErrorHandler, "errorHandler");
        this.errorHandler = webClientErrorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    private final boolean isCriticalAsset(String url) {
        boolean z10;
        if (url.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.advertisement.isCriticalAsset(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m3277notifyPropertiesChange$lambda25(boolean z10, final VungleWebClient vungleWebClient) {
        p.j(vungleWebClient, "this$0");
        s sVar = new s();
        cl.h.d(sVar, "placementType", vungleWebClient.advertisement.templateType());
        Boolean bool = vungleWebClient.isViewable;
        if (bool != null) {
            cl.h.b(sVar, C3426d4.i.f28556o, Boolean.valueOf(bool.booleanValue()));
        }
        cl.h.d(sVar, Q6.F, "android");
        cl.h.d(sVar, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        cl.h.b(sVar, "incentivized", Boolean.valueOf(vungleWebClient.placement.isRewardedVideo()));
        Platform platform = vungleWebClient.platform;
        if (platform != null) {
            cl.h.b(sVar, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l10 = vungleWebClient.loadDuration;
        if (l10 != null) {
            l10.longValue();
            cl.h.c(sVar, "timeLoaded", vungleWebClient.loadDuration);
        }
        if (vungleWebClient.collectConsent) {
            cl.h.b(sVar, "consentRequired", Boolean.TRUE);
            cl.h.d(sVar, "consentTitleText", vungleWebClient.gdprTitle);
            cl.h.d(sVar, "consentBodyText", vungleWebClient.gdprBody);
            cl.h.d(sVar, "consentAcceptButtonText", vungleWebClient.gdprAccept);
            cl.h.d(sVar, "consentDenyButtonText", vungleWebClient.gdprDeny);
        } else {
            cl.h.b(sVar, "consentRequired", Boolean.FALSE);
        }
        cl.h.d(sVar, "sdkVersion", BuildConfig.VERSION_NAME);
        final String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + sVar.a() + ',' + z10 + ')';
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m3278notifyPropertiesChange$lambda25$lambda24(this.f45469b, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m3278notifyPropertiesChange$lambda25$lambda24(VungleWebClient vungleWebClient, String str) {
        p.j(vungleWebClient, "this$0");
        p.j(str, "$injectJs");
        WebView webView = vungleWebClient.loadedWebView;
        if (webView != null) {
            vungleWebClient.runJavascriptOnWebView(webView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m3279shouldOverrideUrlLoading$lambda16$lambda10(final VungleWebClient vungleWebClient, final WebView webView) {
        p.j(vungleWebClient, "this$0");
        PreloadDelegate preloadDelegate = vungleWebClient.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.h
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m3280shouldOverrideUrlLoading$lambda16$lambda10$lambda9(this.f45478b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m3280shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient vungleWebClient, WebView webView) {
        p.j(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m3281shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient vungleWebClient, WebView webView) {
        p.j(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m3283shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient vungleWebClient, WebView webView) {
        p.j(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m3284shouldOverrideUrlLoading$lambda16$lambda6(final VungleWebClient vungleWebClient, final WebView webView) {
        p.j(vungleWebClient, "this$0");
        final String str = "window.vungle.mraidBridge.notifyReadyEvent(" + vungleWebClient.advertisement.createMRAIDArgs() + ')';
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m3285shouldOverrideUrlLoading$lambda16$lambda6$lambda5(this.f45473b, webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3285shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient vungleWebClient, WebView webView, String str) {
        p.j(vungleWebClient, "this$0");
        p.j(str, "$injectJs");
        vungleWebClient.runJavascriptOnWebView(webView, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m3286shouldOverrideUrlLoading$lambda16$lambda8(final VungleWebClient vungleWebClient, final WebView webView) {
        p.j(vungleWebClient, "this$0");
        PreloadDelegate preloadDelegate = vungleWebClient.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        vungleWebClient.handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                VungleWebClient.m3287shouldOverrideUrlLoading$lambda16$lambda8$lambda7(this.f45471b, webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m3287shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient vungleWebClient, WebView webView) {
        p.j(vungleWebClient, "this$0");
        vungleWebClient.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer numValueOf;
        boolean z10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri url = null;
        if (webResourceResponse != null) {
            numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        }
        String strValueOf2 = String.valueOf(url);
        boolean z11 = true;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Http Error desc " + strValueOf + ' ' + z10 + " for URL " + strValueOf2);
        if (!isCriticalAsset(strValueOf2) || !z10) {
            z11 = false;
        }
        handleWebViewError(strValueOf, strValueOf2, z11);
    }

    public void safedk_VungleWebClient_onPageFinished_d298b859bb4101fde140002b07454561(WebView p10, String p11) {
        super.onPageFinished(p10, p11);
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, new bk.a<String>() { // from class: com.vungle.ads.internal.ui.VungleWebClient.onPageFinished.1
            @Override // bk.a
            public final String invoke() {
                return "onPageFinished.";
            }
        });
        if (p10 == null) {
            return;
        }
        this.loadedWebView = p10;
        p10.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            p10.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(p10);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }
}
