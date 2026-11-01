package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.m;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends WebViewClient implements Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15553e = IAlog.a(b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f15554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f15556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f15557d = new Handler(Looper.getMainLooper(), this);

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f44970p, view, url);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44970p, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f44970p, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/nativead/trackers/b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd = safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44970p, webView, str, zSafedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd);
        return zSafedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd;
    }

    public final void a() {
        String str;
        Handler handler = this.f15557d;
        if (handler != null) {
            handler.removeMessages(13);
        }
        if (this.f15554a.isEmpty() || this.f15557d == null || this.f15556c == null || (str = (String) this.f15554a.poll()) == null) {
            Handler handler2 = this.f15557d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(12);
                return;
            }
            return;
        }
        if (this.f15557d != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            messageObtain.obj = str;
            this.f15557d.sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 12:
                c cVar = this.f15555b;
                if (cVar != null) {
                    cVar.b();
                }
                return true;
            case 13:
                Object obj = message.obj;
                IAlog.b("%sTimeout reached for tracker: %s", f15553e, obj != null ? obj.toString() : "unknown");
                a();
                return true;
            case 14:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    String str = f15553e;
                    IAlog.a("%sLoading tracker %s", str, obj2);
                    String string = message.obj.toString();
                    if (this.f15557d == null || this.f15556c == null) {
                        IAlog.b("%sWas destroyed. Unable to load JS tracker %s", str, string);
                    } else {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 13;
                        messageObtain.obj = string;
                        this.f15557d.sendMessageDelayed(messageObtain, 5000L);
                        DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(this.f15556c, null, string, "text/html", "UTF-8", null);
                    }
                }
                return true;
            default:
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Encountered WebViewRendererProcessGone while executing native JS tracking", null, null);
        Handler handler = this.f15557d;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(12);
        return true;
    }

    public b(ArrayList arrayList, c cVar) {
        this.f15554a = new ConcurrentLinkedQueue(arrayList);
        this.f15555b = cVar;
        m mVar = new m();
        mVar.setWebViewClient(this);
        mVar.setVisibility(8);
        mVar.getSettings().setJavaScriptEnabled(true);
        this.f15556c = mVar;
    }

    public boolean safedk_b_shouldOverrideUrlLoading_be336b6550c1769861c4d09a8f9da4dd(WebView p10, String p11) {
        if (!TextUtils.isEmpty(p11) && p11.contains("iaadfinishedloading")) {
            IAlog.a("%sTracker finished", f15553e);
            a();
            return true;
        }
        return super.shouldOverrideUrlLoading(p10, p11);
    }
}
