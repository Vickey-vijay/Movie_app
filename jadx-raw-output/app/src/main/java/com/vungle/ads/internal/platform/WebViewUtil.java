package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import ck.p;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: WebViewUtil.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/platform/WebViewUtil;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroidx/core/util/Consumer;", "", "consumer", "Lmj/r;", "getUserAgent", "Landroid/webkit/WebView;", "webView", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "webViewSettings", "applyWebSettings", "TAG", "Ljava/lang/String;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class WebViewUtil {
    public static final WebViewUtil INSTANCE = new WebViewUtil();
    private static final String TAG = "WebViewUtil";

    private WebViewUtil() {
    }

    public final void getUserAgent(Context context, Consumer<String> consumer) {
        Object objM3458constructorimpl;
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(consumer, "consumer");
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            consumer.accept((String) objM3458constructorimpl);
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Failed to get user agent", thM3461exceptionOrNullimpl);
            consumer.accept(null);
        }
    }

    public final void applyWebSettings(WebView webView, AdPayload.WebViewSettings webViewSettings) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        p.j(webView, "webView");
        WebSettings settings = webView.getSettings();
        p.i(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        if (webViewSettings != null && (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) != null) {
            zBooleanValue = allowFileAccessFromFileUrls.booleanValue();
        } else {
            zBooleanValue = false;
        }
        settings.setAllowFileAccessFromFileURLs(zBooleanValue);
        if (webViewSettings != null && (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) != null) {
            zBooleanValue2 = allowUniversalAccessFromFileUrls.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        settings.setAllowUniversalAccessFromFileURLs(zBooleanValue2);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }
}
