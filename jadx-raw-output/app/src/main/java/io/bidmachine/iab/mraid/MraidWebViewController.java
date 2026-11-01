package io.bidmachine.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.sdk.controller.f;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.utils.Utils;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MraidWebViewController {

    @NonNull
    public static final String TAG = "MraidWebViewController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Callback f59297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MraidWebView f59298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MraidOrientationProperties f59302f;

    public interface Callback {
        void onCalendarEvent(@Nullable String str);

        void onClose();

        void onError(@NonNull IabError iabError);

        void onExpand(@Nullable String str);

        void onLoaded();

        void onOpen(@NonNull String str);

        void onOpenPrivacySheet(@NonNull String str);

        void onOrientation(@NonNull MraidOrientationProperties mraidOrientationProperties);

        void onPageFinished(@NonNull String str);

        void onPlayVideo(@Nullable String str);

        void onResize(@NonNull MraidResizeProperties mraidResizeProperties);

        void onStorePicture(@Nullable String str);

        void onUseCustomClose(boolean z10);

        void onViewableChanged(boolean z10);
    }

    public class a implements MraidWebView.MraidWebViewListener {
        public a() {
        }

        @Override // io.bidmachine.iab.mraid.MraidWebView.MraidWebViewListener
        public void onViewableChanged(boolean z10) {
            if (MraidWebViewController.this.f59299c) {
                MraidWebViewController.this.applyViewable(z10);
            }
            MraidWebViewController.this.f59297a.onViewableChanged(z10);
        }
    }

    public class b extends WebViewClient {
        private b() {
        }

        private WebResourceResponse a() {
            String strB = MraidUtils.b();
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(strB.getBytes(charset)));
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("io.bidmachine", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MraidLog.d(MraidWebViewController.TAG, "onPageFinished", new Object[0]);
            if (MraidWebViewController.this.f59299c) {
                return;
            }
            MraidWebViewController.this.f59299c = true;
            MraidWebViewController.this.f59297a.onPageFinished(str);
            MraidWebViewController.this.getWebView().onPageFinished();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            MraidLog.d(MraidWebViewController.TAG, "onPageStarted", new Object[0]);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            a(str2, str, i10);
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            MraidLog.d(MraidWebViewController.TAG, "onRenderProcessGone", new Object[0]);
            MraidWebViewController.this.destroy();
            MraidWebViewController.this.f59297a.onError(IabError.internal("WebViewClient - onRenderProcessGone"));
            return true;
        }

        public boolean safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f(WebView p10, String p11) {
            if (p11.startsWith("mraid://")) {
                MraidWebViewController.this.a(p11);
                return true;
            }
            if (JsBridgeHandler.isHandled(p11)) {
                JsBridgeHandler.handleJsCommand(MraidWebViewController.this.f59298b, p11);
                return true;
            }
            MraidWebViewController.this.c(p11);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl()) ? a() : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/mraid/MraidWebViewController$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f = safedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, str, zSafedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f);
            return zSafedk_MraidWebViewController$b_shouldOverrideUrlLoading_b4596206bcc70fc15c09a1adb02f299f;
        }

        public /* synthetic */ b(MraidWebViewController mraidWebViewController, a aVar) {
            this();
        }

        private void a(String str, String str2, int i10) {
            MraidLog.d(MraidWebViewController.TAG, "onError: %s / %s / %d", str, str2, Integer.valueOf(i10));
            if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
                return;
            }
            MraidWebViewController.this.f59301e = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            a(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return a(str) ? a() : super.shouldInterceptRequest(webView, str);
        }

        public boolean a(Uri uri) {
            return "mraid.js".equals(uri.getLastPathSegment());
        }

        public boolean a(String str) {
            return a(Uri.parse(str.toLowerCase(Locale.US)));
        }
    }

    public MraidWebViewController(@NonNull Context context, @NonNull Callback callback) {
        this.f59297a = callback;
        MraidWebView mraidWebView = new MraidWebView(context);
        this.f59298b = mraidWebView;
        mraidWebView.setWebViewClient(new b(this, null));
        mraidWebView.setListener(new a());
        this.f59300d = false;
        this.f59301e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (!this.f59298b.wasClicked()) {
            MraidLog.d(TAG, "Can't open url because webView wasn't clicked", new Object[0]);
        } else {
            this.f59297a.onOpen(str);
            this.f59298b.resetClicked();
        }
    }

    public void applyClick(int i10, int i11) {
        b(String.format("(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(%s, %s)", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public void applyLogLevel(@Nullable io.bidmachine.iab.utils.Logger.LogLevel logLevel) {
        String str;
        if (logLevel == io.bidmachine.iab.utils.Logger.LogLevel.debug) {
            str = "mraid.logLevel = mraid.LogLevelEnum.DEBUG;";
        } else if (logLevel == io.bidmachine.iab.utils.Logger.LogLevel.info) {
            str = "mraid.logLevel = mraid.LogLevelEnum.INFO;";
        } else if (logLevel == io.bidmachine.iab.utils.Logger.LogLevel.warning) {
            str = "mraid.logLevel = mraid.LogLevelEnum.WARNING;";
        } else if (logLevel == io.bidmachine.iab.utils.Logger.LogLevel.error) {
            str = "mraid.logLevel = mraid.LogLevelEnum.ERROR;";
        } else if (logLevel != io.bidmachine.iab.utils.Logger.LogLevel.none) {
            return;
        } else {
            str = "mraid.logLevel = mraid.LogLevelEnum.NONE;";
        }
        b(str);
    }

    public void applyPlacement(@NonNull MraidPlacementType mraidPlacementType) {
        b("mraid.setPlacementType('" + mraidPlacementType.b() + "');");
    }

    public void applyScreenMetrics(@NonNull MraidScreenMetrics mraidScreenMetrics) {
        Rect rectE = mraidScreenMetrics.e();
        Rect rectD = mraidScreenMetrics.d();
        b("mraid.setScreenSize(" + rectE.width() + StringUtils.COMMA + rectE.height() + ");mraid.setMaxSize(" + rectD.width() + StringUtils.COMMA + rectD.height() + ");mraid.setCurrentPosition(" + Utils.stringifyRect(mraidScreenMetrics.a()) + ");mraid.setDefaultPosition(" + Utils.stringifyRect(mraidScreenMetrics.c()) + ");mraid.fireSizeChangeEvent(" + Utils.stringifySize(mraidScreenMetrics.a()) + ");");
    }

    public void applyState(@NonNull MraidViewState mraidViewState) {
        b("mraid.fireStateChangeEvent('" + mraidViewState.toJsString() + "');");
    }

    public void applySupportedServices(@NonNull MraidNativeFeatureManager mraidNativeFeatureManager) {
        b("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + mraidNativeFeatureManager.isCalendarFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + mraidNativeFeatureManager.isInlineVideoFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + mraidNativeFeatureManager.isSmsFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + mraidNativeFeatureManager.isStorePictureFeatureAvailable() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + mraidNativeFeatureManager.isTelFeatureAvailable() + ");");
    }

    public void applyViewable(boolean z10) {
        b("mraid.fireViewableChangeEvent(" + z10 + ");");
    }

    public void destroy() {
        MraidWebView webView = getWebView();
        Utils.removeFromParent(webView);
        webView.destroy();
    }

    @Nullable
    public MraidOrientationProperties getLastOrientationProperties() {
        return this.f59302f;
    }

    @NonNull
    public MraidWebView getWebView() {
        return this.f59298b;
    }

    public boolean isReceivedJsError() {
        return this.f59301e;
    }

    public boolean isUseCustomClose() {
        return this.f59300d;
    }

    public boolean isViewable() {
        return this.f59298b.isViewable();
    }

    public void load(@NonNull String str) {
        this.f59299c = false;
        getWebView().loadUrl(str);
    }

    public void notifyReady() {
        b("mraid.fireReadyEvent();");
    }

    public void reset() {
        getWebView().reset();
    }

    public void load(@Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        this.f59299c = false;
        getWebView().loadDataWithBaseURL(str, str2, str3, str4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidLog.d(TAG, "handleJsCommand - %s", str);
        try {
            Map<String, String> commandUrl = MraidUtils.parseCommandUrl(str);
            if (commandUrl == null) {
                return;
            }
            String str2 = commandUrl.get(f.b.f30923g);
            if (str2 == null) {
                MraidLog.w(TAG, "handleJsCommand not found", new Object[0]);
            } else {
                a(str2, commandUrl);
                a();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void b(String str) {
        this.f59298b.injectJs(str);
    }

    private void a() {
        b("mraid.nativeCallComplete();");
    }

    private void a(String str, Map map) {
        str.hashCode();
        switch (str) {
            case "playVideo":
                this.f59297a.onPlayVideo((String) map.get("url"));
                break;
            case "openPrivacySheet":
                String str2 = (String) map.get("data");
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        this.f59297a.onOpenPrivacySheet(new String(Base64.decode(str2, 2)));
                    } catch (Throwable unused) {
                        MraidLog.e(TAG, "data must be base64 encoded json", new Object[0]);
                        return;
                    }
                    break;
                } else {
                    MraidLog.e(TAG, "data is null or empty", new Object[0]);
                    break;
                }
                break;
            case "expand":
                MraidLog.d(TAG, "mraid.expand is not supported", new Object[0]);
                break;
            case "loaded":
                this.f59297a.onLoaded();
                break;
            case "noFill":
                this.f59297a.onError(IabError.noFIll("Fired noFill event from mraid.js"));
                break;
            case "resize":
                MraidLog.d(TAG, "mraid.resize is not supported", new Object[0]);
                break;
            case "createCalendarEvent":
                this.f59297a.onCalendarEvent((String) map.get("eventJSON"));
                break;
            case "open":
                String str3 = (String) map.get("url");
                if (TextUtils.isEmpty(str3)) {
                    MraidLog.e(TAG, "url is null or empty", new Object[0]);
                    break;
                } else {
                    c(str3);
                    break;
                }
                break;
            case "close":
                this.f59297a.onClose();
                break;
            case "setOrientationProperties":
                MraidOrientationProperties mraidOrientationProperties = new MraidOrientationProperties(Boolean.parseBoolean((String) map.get("allowOrientationChange")), MraidOrientationProperties.forceOrientationFromString((String) map.get("forceOrientation")));
                this.f59302f = mraidOrientationProperties;
                this.f59297a.onOrientation(mraidOrientationProperties);
                break;
            case "storePicture":
                this.f59297a.onStorePicture((String) map.get("url"));
                break;
            case "useCustomClose":
                boolean z10 = Boolean.parseBoolean((String) map.get("useCustomClose"));
                if (this.f59300d != z10) {
                    this.f59300d = z10;
                    this.f59297a.onUseCustomClose(z10);
                    break;
                }
                break;
        }
    }
}
