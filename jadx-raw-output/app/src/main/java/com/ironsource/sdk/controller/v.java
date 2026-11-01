package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.A8;
import com.ironsource.B4;
import com.ironsource.B7;
import com.ironsource.C1;
import com.ironsource.C3369a1;
import com.ironsource.C3372a4;
import com.ironsource.C3399bd;
import com.ironsource.C3409c5;
import com.ironsource.C3417cd;
import com.ironsource.C3426d4;
import com.ironsource.C3462f4;
import com.ironsource.C3472fe;
import com.ironsource.C3474fg;
import com.ironsource.C3480g4;
import com.ironsource.C3486ga;
import com.ironsource.C3490ge;
import com.ironsource.C3533j4;
import com.ironsource.C3534j5;
import com.ironsource.C3539ja;
import com.ironsource.C3547k0;
import com.ironsource.C3555k8;
import com.ironsource.C3556k9;
import com.ironsource.C3569l4;
import com.ironsource.C3625o4;
import com.ironsource.C3664q8;
import com.ironsource.C3676r4;
import com.ironsource.C3690s1;
import com.ironsource.C3714t8;
import com.ironsource.C3731u8;
import com.ironsource.C3748v8;
import com.ironsource.C3799y8;
import com.ironsource.C8;
import com.ironsource.EnumC3592m9;
import com.ironsource.G5;
import com.ironsource.InterfaceC3393b7;
import com.ironsource.InterfaceC3447e7;
import com.ironsource.InterfaceC3465f7;
import com.ironsource.InterfaceC3551k4;
import com.ironsource.InterfaceC3601mg;
import com.ironsource.InterfaceC3666qa;
import com.ironsource.InterfaceC3710t4;
import com.ironsource.InterfaceC3724u1;
import com.ironsource.InterfaceC3733ua;
import com.ironsource.InterfaceC3744v4;
import com.ironsource.InterfaceC3761w4;
import com.ironsource.InterfaceC3778x4;
import com.ironsource.InterfaceC3795y4;
import com.ironsource.Je;
import com.ironsource.K8;
import com.ironsource.Lb;
import com.ironsource.M;
import com.ironsource.Nb;
import com.ironsource.Ng;
import com.ironsource.Oc;
import com.ironsource.Og;
import com.ironsource.Q6;
import com.ironsource.Qc;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.V7;
import com.ironsource.X3;
import com.ironsource.Y1;
import com.ironsource.Y4;
import com.ironsource.Z0;
import com.ironsource.Z3;
import com.ironsource.Z4;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.model.AdPayload;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class v implements com.ironsource.sdk.controller.l, Oc, DownloadListener {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f31074b0 = "about:blank";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static int f31075c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static String f31076d0 = "is_store";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static String f31077e0 = "external_url";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static String f31078f0 = "secondary_web_view";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static String f31079g0 = "success";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static String f31080h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private InterfaceC3601mg C;
    private C3369a1 D;
    private Z4 G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private C3690s1 N;
    private B4 O;
    private Ng P;
    private com.ironsource.sdk.controller.c Q;
    private X3 R;
    private JSONObject S;
    private com.ironsource.sdk.controller.l.a T;
    private com.ironsource.sdk.controller.l.b U;
    private C3625o4 V;
    private boolean W;
    private final B7 X;
    public C3480g4 Y;
    private volatile C3539ja Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V7 f31081a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Qc f31082a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3551k4 f31083b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3534j5 f31089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f31091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CountDownTimer f31093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownTimer f31094m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p f31098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f31099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private FrameLayout f31100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f31101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f31102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private EnumC0288v f31103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f31104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC3795y4 f31105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC3778x4 f31106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC3761w4 f31107z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31084c = v.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31085d = "IronSource";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31086e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31095n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31096o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f31097p = C3426d4.e.f28476b;
    private Object E = new Object();
    private boolean F = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3731u8 f31110a;

        public c(C3731u8 c3731u8) {
            this.f31110a = c3731u8;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.Q.c("controller html - failed to download - " + this.f31110a.b());
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31112a;

        public d(Context context) {
            this.f31112a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f31112a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31114a;

        public e(Context context) {
            this.f31114a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f31114a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3714t8.e f31116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31117b;

        public f(C3714t8.e eVar, String str) {
            this.f31116a = eVar;
            this.f31117b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3744v4 interfaceC3744v4A;
            C3714t8.e eVar = this.f31116a;
            if ((eVar == C3714t8.e.RewardedVideo || eVar == C3714t8.e.Interstitial) && (interfaceC3744v4A = v.this.a(eVar)) != null) {
                interfaceC3744v4A.b(this.f31116a, this.f31117b);
            }
        }
    }

    public class g extends X3 {
        @Override // com.ironsource.X3, com.ironsource.InterfaceC3764w7
        public void a(String str, JSONObject jSONObject) {
            v vVar = v.this;
            if (vVar.f31090i) {
                vVar.n(str);
            }
        }

        public g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC3764w7
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f31090i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                v.this.e(jSONObject);
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.X3, com.ironsource.InterfaceC3764w7
        public void a() {
            v vVar = v.this;
            if (vVar.f31090i) {
                vVar.n("none");
            }
        }
    }

    public class h implements Ng {
        public h() {
        }

        @Override // com.ironsource.Ng
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f31121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f31122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31123c;

        public i(JSONObject jSONObject, WebView webView, String str) {
            this.f31121a = jSONObject;
            this.f31122b = webView;
            this.f31123c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f31121a, this.f31122b);
            v.this.m("about:blank");
            v.this.m(this.f31123c);
        }
    }

    public class j extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31125a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.c(C3426d4.c.f28445j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j10, long j11, int i10) {
            super(j10, j11);
            this.f31125a = i10;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f31084c, "Loading Controller Timer Finish");
            int i10 = this.f31125a;
            if (i10 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            Logger.i(v.this.f31084c, "Loading Controller Timer Tick " + j10);
        }
    }

    public class k implements t {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C3714t8.e eVar, Y4 y10) {
            v.this.a(str, eVar, y10);
        }
    }

    public class l implements t {
        public l() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C3714t8.e eVar, Y4 y10) {
            v.this.a(str, eVar, y10);
        }
    }

    public class m implements t {
        public m() {
        }

        @Override // com.ironsource.sdk.controller.v.t
        public void a(String str, C3714t8.e eVar, Y4 y10) {
            v.this.a(str, eVar, y10);
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3714t8.e f31131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f31132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f31133c;

        public n(C3714t8.e eVar, Y4 y10, String str) {
            this.f31131a = eVar;
            this.f31132b = y10;
            this.f31133c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Y4 y10;
            C3714t8.e eVar = C3714t8.e.RewardedVideo;
            C3714t8.e eVar2 = this.f31131a;
            if ((eVar != eVar2 && C3714t8.e.Interstitial != eVar2 && C3714t8.e.Banner != eVar2) || (y10 = this.f31132b) == null || TextUtils.isEmpty(y10.h())) {
                return;
            }
            InterfaceC3744v4 interfaceC3744v4A = v.this.a(this.f31131a);
            Log.d(v.this.f31084c, "onAdProductInitFailed (message:" + this.f31133c + ")(" + this.f31131a + ")");
            if (interfaceC3744v4A != null) {
                interfaceC3744v4A.a(this.f31131a, this.f31132b.h(), this.f31133c);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    public class p extends WebChromeClient {
        private p() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new r());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            View view = v.this.f31099r;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            v vVar = v.this;
            vVar.f31100s.removeView(vVar.f31099r);
            v vVar2 = v.this;
            vVar2.f31099r = null;
            vVar2.f31100s.setVisibility(8);
            v.this.f31101t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.f31099r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f31100s.addView(view);
            v vVar = v.this;
            vVar.f31099r = view;
            vVar.f31101t = customViewCallback;
            vVar.f31100s.setVisibility(0);
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3714t8.e f31137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f31138b;

        public String a() {
            return this.f31138b;
        }

        public C3714t8.e b() {
            return this.f31137a;
        }

        public q(C3714t8.e eVar, String str) {
            this.f31137a = eVar;
            this.f31138b = str;
        }
    }

    public class r extends WebViewClient {
        private r() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
            p10.startActivity(p11);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$r;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812 = safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812);
            return zSafedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(v.this.f31084c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_v$r_shouldOverrideUrlLoading_ddfaabc0c09e6d6445eae92581de0812(WebView p10, String p11) {
            Context contextP = v.this.p();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextP, new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(p11).b(false).a(contextP));
            return true;
        }
    }

    public class s {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31142b;

            public a(String str, String str2) {
                this.f31141a = str;
                this.f31142b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f31141a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f31084c, "onRVShowFail(message:" + this.f31141a + ")");
                v.this.f31105x.b(this.f31142b, str);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31144a;

            public b(String str) {
                this.f31144a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f31084c, "onInterstitialInitSuccess()");
                v.this.f31106y.a(C3714t8.e.Interstitial, this.f31144a, (Z0) null);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31147b;

            public c(String str, String str2) {
                this.f31146a = str;
                this.f31147b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f31146a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f31084c, "onInterstitialInitFail(message:" + str + ")");
                v.this.f31106y.a(C3714t8.e.Interstitial, this.f31147b, str);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3744v4 f31149a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3714t8.e f31150b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f31151c;

            public d(InterfaceC3744v4 interfaceC3744v4, C3714t8.e eVar, String str) {
                this.f31149a = interfaceC3744v4;
                this.f31150b = eVar;
                this.f31151c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f31149a.a(this.f31150b, this.f31151c);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JSONObject f31154b;

            public e(String str, JSONObject jSONObject) {
                this.f31153a = str;
                this.f31154b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f31106y.a(this.f31153a, this.f31154b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31157b;

            public f(String str, String str2) {
                this.f31156a = str;
                this.f31157b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f31156a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f31106y.a(this.f31157b, str);
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31159a;

            public g(String str) {
                this.f31159a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f31084c, "onBannerInitSuccess()");
                v.this.f31107z.a(C3714t8.e.Banner, this.f31159a, (Z0) null);
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31161a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31162b;

            public h(String str, String str2) {
                this.f31161a = str;
                this.f31162b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f31161a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f31084c, "onBannerInitFail(message:" + str + ")");
                v.this.f31107z.a(C3714t8.e.Banner, this.f31162b, str);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31164a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3555k8 f31165b;

            public i(String str, C3555k8 c3555k8) {
                this.f31164a = str;
                this.f31165b = c3555k8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f31084c, "onBannerLoadSuccess()");
                v.this.f31107z.a(this.f31164a, this.f31165b);
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31168b;

            public j(String str, String str2) {
                this.f31167a = str;
                this.f31168b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f31084c, "onLoadBannerFail()");
                String str = this.f31167a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f31107z.c(this.f31168b, str);
            }
        }

        public class k implements Runnable {
            public k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        public class l implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31171a;

            public l(String str) {
                this.f31171a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (IronSourceVideoBridge.jsonObjectInit(this.f31171a).has(com.ironsource.sdk.controller.f.b.f30918b)) {
                        v.this.T.a(com.ironsource.sdk.controller.f.a.a(this.f31171a));
                    } else {
                        v.this.U.a(Nb.a(this.f31171a));
                    }
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    Logger.e(v.this.f31084c, "failed to parse received message");
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        public class m implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C3714t8.e f31173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f31175c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ JSONObject f31176d;

            public m(C3714t8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f31173a = eVar;
                this.f31174b = str;
                this.f31175c = str2;
                this.f31176d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC3744v4 interfaceC3744v4A;
                C3714t8.e eVar = this.f31173a;
                if ((eVar == C3714t8.e.Interstitial || eVar == C3714t8.e.RewardedVideo || eVar == C3714t8.e.Banner) && (interfaceC3744v4A = v.this.a(eVar)) != null) {
                    interfaceC3744v4A.a(this.f31173a, this.f31174b, this.f31175c, this.f31176d);
                }
            }
        }

        public class n implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31178a;

            public n(String str) {
                this.f31178a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.i(v.this.f31084c, "omidAPI(" + this.f31178a + ")");
                    v.this.H.a(new C3490ge(this.f31178a).toString(), s.this.new w());
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f31084c, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class o implements Runnable {
            public o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(C3426d4.f28387e);
            }
        }

        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        public class r implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f31183a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31184b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Z0 f31185c;

            public r(int i10, String str, Z0 z10) {
                this.f31183a = i10;
                this.f31184b = str;
                this.f31185c = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f31183a <= 0) {
                    v.this.f31105x.c(this.f31184b);
                } else {
                    Log.d(v.this.f31084c, "onRVInitSuccess()");
                    v.this.f31105x.a(C3714t8.e.RewardedVideo, this.f31184b, this.f31185c);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        public class RunnableC0286s implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31187a;

            public RunnableC0286s(String str) {
                this.f31187a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(IronSourceVideoBridge.jsonObjectInit(this.f31187a), s.this.new w());
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                    Logger.i(v.this.f31084c, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        public class t implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f31191c;

            public t(String str, String str2, int i10) {
                this.f31189a = str;
                this.f31190b = str2;
                this.f31191c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f31189a.equalsIgnoreCase(C3714t8.e.RewardedVideo.toString())) {
                    v.this.f31105x.a(this.f31190b, this.f31191c);
                }
            }
        }

        public class u implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f31194b;

            public u(String str, int i10) {
                this.f31193a = str;
                this.f31194b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f31106y.onInterstitialAdRewarded(this.f31193a, this.f31194b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$v, reason: collision with other inner class name */
        public class RunnableC0287v implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f31196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f31197b;

            public RunnableC0287v(String str, String str2) {
                this.f31196a = str;
                this.f31197b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f31196a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(v.this.f31084c, "onRVInitFail(message:" + str + ")");
                v.this.f31105x.a(C3714t8.e.RewardedVideo, this.f31197b, str);
            }
        }

        public class w implements InterfaceC3666qa {
            @Override // com.ironsource.InterfaceC3666qa
            public void a(boolean z10, String str, String str2) {
                C3490ge c3490ge = new C3490ge();
                c3490ge.b(z10 ? v.f31079g0 : v.f31080h0, str);
                c3490ge.b("data", str2);
                v.this.a(c3490ge.toString(), z10, (String) null, (String) null);
            }

            public w() {
            }

            @Override // com.ironsource.InterfaceC3666qa
            public void a(boolean z10, String str, C3490ge c3490ge) {
                c3490ge.b(z10 ? v.f31079g0 : v.f31080h0, str);
                v.this.a(c3490ge.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC3666qa
            public void a(boolean z10, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z10) {
                        str2 = v.f31079g0;
                    } else {
                        str2 = v.f31080h0;
                    }
                    jSONObject.put(str2, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put(com.ironsource.sdk.controller.d.f30823h, v.this.B.f());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                Logger.d(v.this.f31084c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(C3426d4.a.f28415h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                A8.a(C3472fe.f28924p, new C3748v8().a(G5.A, e10.getMessage()).a());
                Logger.d(v.this.f31084c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
            p10.startActivity(p11);
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListA = C3486ga.e().a();
                C3490ge c3490ge = new C3490ge(str);
                if (!arrayListA.isEmpty()) {
                    c3490ge.b(C3426d4.i.f28575x0, arrayListA.toString());
                }
                v.this.a(c3490ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                Logger.i(v.this.f31084c, "deleteFile(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                String strD = c3490ge.d(C3426d4.i.f28530b);
                String strD2 = c3490ge.d("path");
                if (strD2 != null && !TextUtils.isEmpty(strD)) {
                    C8 c10 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD2), strD);
                    IronSourceStorageUtils.ensurePathSafety(c10, v.this.A);
                    if (!c10.exists()) {
                        v.this.a(str, false, C3426d4.c.f28441f, "1");
                        return;
                    } else {
                        v.this.a(str, IronSourceStorageUtils.deleteFile(c10), (String) null, (String) null);
                        return;
                    }
                }
                v.this.a(str, false, C3426d4.c.f28442g, "1");
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                Logger.i(v.this.f31084c, "deleteFolder(" + str + ")");
                String strD = new C3490ge(str).d("path");
                if (strD == null) {
                    v.this.a(str, false, C3426d4.c.f28442g, "1");
                    return;
                }
                C8 c10 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD));
                IronSourceStorageUtils.ensurePathSafety(c10, v.this.A);
                if (!c10.exists()) {
                    v.this.a(str, false, C3426d4.c.f28440e, "1");
                } else {
                    v.this.a(str, IronSourceStorageUtils.deleteFolder(c10.getPath()), (String) null, (String) null);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.i(v.this.f31084c, "openUrl(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                com.ironsource.sdk.controller.p.c cVarA = new com.ironsource.sdk.controller.p.a(c3490ge.d("method"), new Sc(v.this.F, 805306368)).a(c3490ge.c(C3426d4.i.L0) ? v.this.Z.getContext() : v.this.p(), new Rc(c3490ge.d("url"), c3490ge.d("package_name")));
                if (cVarA instanceof com.ironsource.sdk.controller.p.c.a) {
                    v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) cVarA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.i(v.this.f31084c, "saveFile(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                String strD = c3490ge.d("path");
                String strD2 = c3490ge.d(C3426d4.i.f28530b);
                if (TextUtils.isEmpty(strD2)) {
                    v.this.a(str, false, C3426d4.c.f28442g, "1");
                    return;
                }
                C8 c10 = new C8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, strD), SDKUtils.getFileName(strD2));
                IronSourceStorageUtils.ensurePathSafety(c10, v.this.A);
                v vVar = v.this;
                if (vVar.X.a(vVar.A) <= 0) {
                    v.this.a(str, false, C3462f4.A, (String) null);
                    return;
                }
                if (c10.exists()) {
                    v.this.a(str, false, C3462f4.f28890z, (String) null);
                    return;
                }
                if (!Z3.h(v.this.Z.getContext())) {
                    v.this.a(str, false, C3462f4.C, (String) null);
                    return;
                }
                v.this.a(str, true, (String) null, (String) null);
                v.this.f31089h.a(c10, strD2, c3490ge.a("connectionTimeout", 0), c3490ge.a("readTimeout", 0));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public s() {
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.i(v.this.f31084c, "adClicked(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d(C3426d4.i.f28552m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C3714t8.e eVarG = v.this.g(strD);
            InterfaceC3744v4 interfaceC3744v4A = v.this.a(eVarG);
            if (eVarG == null || interfaceC3744v4A == null) {
                return;
            }
            v.this.b(new d(interfaceC3744v4A, eVarG, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(v.this.f31085d, "adCredited(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d(C3426d4.i.f28548k);
            int i10 = strD != null ? Integer.parseInt(strD) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            String strD2 = c3490ge.d(C3426d4.i.f28552m);
            if (TextUtils.isEmpty(strD2)) {
                Log.d(v.this.f31085d, "adCredited | product type is missing");
            }
            if (C3714t8.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i10);
            } else if (v.this.r(strD2)) {
                v.this.b(new t(strD2, strFetchDemandSourceId, i10));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.i(v.this.f31084c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3490ge(str));
            Z0 z10 = new Z0(str);
            if (!z10.g()) {
                v.this.a(str, false, C3426d4.c.f28453r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String strD = z10.d();
            if (C3714t8.e.RewardedVideo.toString().equalsIgnoreCase(strD) && v.this.r(strD)) {
                v.this.b(new r(Integer.parseInt(z10.c()), strFetchDemandSourceId, z10));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                Logger.i(v.this.f31084c, "adViewAPI(" + str + ")");
                v.this.L.a(new C3490ge(str).toString(), new w());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f31084c, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            V7.f27797a.b(new Runnable() { // from class: com.ironsource.sdk.controller.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31036b.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f31084c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C3714t8.e eVarG;
            try {
                Logger.i(v.this.f31084c, "cleanAdInstance(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                String strD = c3490ge.d(C3426d4.i.f28552m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = v.this.g(strD)) == null) {
                    return;
                }
                v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        public void d(String str) {
            v.this.i(v.this.a(C3426d4.h.f28503e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.i(v.this.f31084c, "destroyInlineStore() called");
            try {
                com.unity3d.ironsourceads.internal.services.a.AbstractC0443a abstractC0443aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), EnumC3592m9.f29496b.a(new C3490ge(str).a(C3426d4.f.f28486e, EnumC3592m9.APP_ACTIVITY.b())));
                if (abstractC0443aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a) abstractC0443aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                Logger.i(v.this.f31084c, "deviceDataAPI(" + str + ")");
                v.this.K.a(new C3490ge(str).toString(), new w());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f31084c, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.i(v.this.f31084c, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            C3490ge c3490ge = new C3490ge(str);
            boolean zBooleanValue = ((Boolean) c3490ge.b("display")).booleanValue();
            String strD = c3490ge.d(C3426d4.i.f28552m);
            boolean zC = c3490ge.c(C3426d4.i.f28568u);
            String strD2 = c3490ge.d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            boolean zC2 = c3490ge.c(C3426d4.i.f28579z0);
            if (!zBooleanValue) {
                v.this.a(EnumC0288v.Gone);
                v.this.n();
                return;
            }
            v.this.F = c3490ge.c("immersive");
            boolean zC3 = c3490ge.c(C3426d4.i.f28576y);
            EnumC0288v enumC0288vU = v.this.u();
            EnumC0288v enumC0288v = EnumC0288v.Display;
            if (enumC0288vU == enumC0288v) {
                Logger.i(v.this.f31084c, "State: " + v.this.f31103v);
                return;
            }
            v.this.a(enumC0288v);
            Logger.i(v.this.f31084c, "State: " + v.this.f31103v);
            Context contextP = v.this.p();
            String strS = v.this.s();
            int iK = v.this.X.K(contextP);
            if (zC) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(contextP);
                hVar.addView(v.this.f31102u);
                hVar.a(v.this);
                return;
            }
            Intent intent = zC3 ? new Intent(contextP, (Class<?>) InterstitialActivity.class) : new Intent(contextP, (Class<?>) ControllerActivity.class);
            C3714t8.e eVar = C3714t8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strS)) {
                    strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                }
                intent.putExtra(C3426d4.i.f28552m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(strFetchDemandSourceId);
                if (v.this.r(eVar.toString())) {
                    v.this.f31105x.c(eVar, strFetchDemandSourceId);
                }
            } else {
                C3714t8.e eVar2 = C3714t8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strS)) {
                        strS = SDKUtils.translateRequestedOrientation(v.this.X.N(contextP));
                    }
                    intent.putExtra(C3426d4.i.f28552m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(C3426d4.i.f28579z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra("immersive", v.this.F);
            intent.putExtra(C3426d4.i.A, strS);
            intent.putExtra(C3426d4.i.B, iK);
            v vVar = v.this;
            vVar.f31091j = new q(vVar.g(strD), strFetchDemandSourceId);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextP, intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                Logger.i(v.this.f31084c, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new C3490ge(str).toString(), new w());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f31084c, "dsSharedSignalsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.i(v.this.f31084c, "fileSystemAPI(" + str + ")");
            v.this.a(new RunnableC0286s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005f  */
        @JavascriptInterface
        public void getApplicationInfo(String str) {
            Logger.i(v.this.f31084c, "getApplicationInfo(" + str + ")");
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            C3490ge c3490ge = new C3490ge(str);
            Object[] objArrF = v.this.f(c3490ge.d(C3426d4.i.f28552m), SDKUtils.fetchDemandSourceId(c3490ge));
            String str2 = (String) objArrF[0];
            if (((Boolean) objArrF[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, C3426d4.h.f28513n, C3426d4.h.f28514o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            Logger.i(v.this.f31084c, "getCachedFilesMap(" + str + ")");
            String strE = v.this.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            C3490ge c3490ge = new C3490ge(str);
            if (!c3490ge.a("path")) {
                v.this.a(str, false, C3426d4.c.f28454s, (String) null);
                return;
            }
            String str2 = (String) c3490ge.b("path");
            if (!IronSourceStorageUtils.isPathExist(v.this.A, str2)) {
                v.this.a(str, false, C3426d4.c.f28455t, (String) null);
                return;
            }
            v.this.i(v.this.a(strE, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str2), C3426d4.h.f28518s, C3426d4.h.f28517r));
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strE;
            Logger.i(v.this.f31084c, "getConnectivityInfo(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d(v.f31079g0);
            String strD2 = c3490ge.d(v.f31080h0);
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            v vVar = v.this;
            X3 x10 = vVar.R;
            if (x10 != null) {
                jSONObjectJsonObjectInit = x10.a(vVar.Z.getContext());
            }
            if (jSONObjectJsonObjectInit.length() > 0) {
                strE = v.this.e(strD, jSONObjectJsonObjectInit.toString());
            } else {
                strE = v.this.e(strD2, v.this.a("errMsg", C3426d4.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(strE);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.i(v.this.f31084c, "getControllerConfig(" + str + ")");
            String strD = new C3490ge(str).d(v.f31079g0);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strD;
            Logger.i(v.this.f31084c, "getMediationState(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD2 = c3490ge.d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            String strD3 = c3490ge.d(C3426d4.i.f28552m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                C3714t8.e productType = SDKUtils.getProductType(strD3);
                if (productType != null) {
                    Y4 y4A = v.this.G.a(productType, strFetchDemandSourceId);
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                    jSONObjectJsonObjectInit.put(C3426d4.i.f28552m, strD3);
                    jSONObjectJsonObjectInit.put("demandSourceName", strD2);
                    jSONObjectJsonObjectInit.put("demandSourceId", strFetchDemandSourceId);
                    if (y4A == null || y4A.a(-1)) {
                        strD = v.this.d(str);
                    } else {
                        strD = v.this.e(str);
                        jSONObjectJsonObjectInit.put("state", y4A.j());
                    }
                    a(strD, jSONObjectJsonObjectInit.toString());
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0058  */
        @JavascriptInterface
        public void getDeviceStatus(String str) {
            Logger.i(v.this.f31084c, "getDeviceStatus(" + str + ")");
            String strE = v.this.e(str);
            String strD = v.this.d(str);
            v vVar = v.this;
            Object[] objArrD = vVar.d(vVar.Z.getContext());
            String str2 = (String) objArrD[0];
            if (((Boolean) objArrD[1]).booleanValue()) {
                if (TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, str2, C3426d4.h.f28511l, C3426d4.h.f28512m));
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.i(v.this.f31084c, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float fA = C3409c5.b(context).a(context);
                C3490ge c3490ge = new C3490ge(str);
                c3490ge.b(C3426d4.j.P, String.valueOf(fA));
                v.this.a(c3490ge.toString(), true, (String) null, (String) null);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.i(v.this.f31084c, "getInitSummery(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            c3490ge.a(C3426d4.j.f28617s0, v.this.S);
            v.this.a(c3490ge.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            A8.a(C3472fe.f28934z, new C3748v8().a(G5.f26614y, str).a());
            String strE = v.this.e(str);
            String string = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            v.this.i(v.this.a(strE, string, C3426d4.h.X, C3426d4.h.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.i(v.this.f31084c, "getUserData(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            if (!c3490ge.a(C3426d4.i.W)) {
                v.this.a(str, false, C3426d4.c.F, (String) null);
                return;
            }
            String strE = v.this.e(str);
            String strD = c3490ge.d(C3426d4.i.W);
            v.this.i(v.this.e(strE, v.this.a(strD, C3486ga.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                Logger.i(v.this.f31084c, "iabTokenAPI(" + str + ")");
                v.this.J.a(new C3490ge(str).toString(), new w());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f31084c, "iabTokenAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.i(v.this.f31084c, "initController(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            CountDownTimer countDownTimer = v.this.f31094m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f31094m = null;
            }
            if (c3490ge.a(C3426d4.i.f28560q)) {
                String strD = c3490ge.d(C3426d4.i.f28560q);
                if (C3426d4.i.f28564s.equalsIgnoreCase(strD)) {
                    v vVar = v.this;
                    vVar.f31090i = true;
                    vVar.Q.d();
                } else {
                    if (C3426d4.i.f28562r.equalsIgnoreCase(strD)) {
                        v.this.Q.c();
                        return;
                    }
                    if (!C3426d4.i.f28566t.equalsIgnoreCase(strD)) {
                        Logger.i(v.this.f31084c, "No STAGE mentioned! should not get here!");
                        return;
                    }
                    String strD2 = c3490ge.d("errMsg");
                    v.this.Q.c("controller js failed to initialize : " + strD2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.i(v.this.f31084c, "onAdWindowsClosed(" + str + ")");
            v.this.D.a();
            v.this.D.f(null);
            v.this.f31091j = null;
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d(C3426d4.i.f28552m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            C3714t8.e eVarG = v.this.g(strD);
            Log.d(v.this.f31085d, "onAdClosed() with type " + eVarG);
            if (v.this.r(strD)) {
                v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(v.this.f31084c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.i(v.this.f31084c, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.i(v.this.f31084c, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.i(v.this.f31084c, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.i(v.this.f31084c, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.i(v.this.f31084c, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.i(v.this.f31084c, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.i(v.this.f31084c, "onInitBannerFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f31084c, "onInitBannerFail failed with no demand source");
                return;
            }
            Z4 z10 = v.this.G;
            C3714t8.e eVar = C3714t8.e.Banner;
            Y4 y4A = z10.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new h(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f31084c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3490ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f31084c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.r(C3714t8.e.Banner.toString())) {
                v.this.b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.i(v.this.f31084c, "onInitInterstitialFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f31084c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            Z4 z10 = v.this.G;
            C3714t8.e eVar = C3714t8.e.Interstitial;
            Y4 y4A = z10.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new c(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f31084c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3490ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f31084c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.r(C3714t8.e.Interstitial.toString())) {
                v.this.b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.i(v.this.f31084c, "onInitRewardedVideoFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            Z4 z10 = v.this.G;
            C3714t8.e eVar = C3714t8.e.RewardedVideo;
            Y4 y4A = z10.a(eVar, strFetchDemandSourceId);
            if (y4A != null) {
                y4A.b(3);
            }
            if (v.this.r(eVar.toString())) {
                v.this.b(new RunnableC0287v(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f31084c, "onLoadBannerFail()");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && v.this.r(C3714t8.e.Banner.toString())) {
                v.this.b(new j(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f31084c, "onLoadBannerSuccess()");
            C3490ge c3490ge = new C3490ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            String strD = c3490ge.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            K8 k8A = C3664q8.a().a(strD);
            if (k8A == null) {
                v.this.f31107z.c(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
                return;
            }
            if (k8A instanceof C3555k8) {
                C3555k8 c3555k8 = (C3555k8) k8A;
                if (v.this.r(C3714t8.e.Banner.toString())) {
                    v.this.b(new i(strFetchDemandSourceId, c3555k8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.i(v.this.f31084c, "onLoadInterstitialFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (v.this.r(C3714t8.e.Interstitial.toString())) {
                v.this.b(new f(strD, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.i(v.this.f31084c, "onLoadInterstitialSuccess(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            JSONObject jSONObjectA = c3490ge.a();
            a(strFetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.r(C3714t8.e.Interstitial.toString())) {
                v.this.b(new e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.i(v.this.f31084c, "onReceivedMessage(" + str + ")");
            V7.f27797a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.i(v.this.f31084c, "onShowInterstitialFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            final String strD = c3490ge.d("errMsg");
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zR = v.this.r(C3714t8.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31002b.a(zR, strD, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.i(v.this.f31084c, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C3490ge(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.i(v.this.f31084c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C3369a1 c3369a1 = v.this.D;
            C3714t8.e eVar = C3714t8.e.Interstitial;
            c3369a1.a(eVar.ordinal());
            v.this.D.f(strFetchDemandSourceId);
            final boolean zR = v.this.r(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31023b.a(zR, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.i(v.this.f31084c, "onShowRewardedVideoFail(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
            if (v.this.r(C3714t8.e.RewardedVideo.toString())) {
                v.this.b(new a(strD, strFetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.i(v.this.f31084c, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(v.this.f31084c, "onVideoStatusChanged(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d(C3426d4.i.f28552m);
            if (v.this.C == null || TextUtils.isEmpty(strD)) {
                return;
            }
            String strD2 = c3490ge.d("status");
            if (C3426d4.i.f28535d0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStarted();
                return;
            }
            if ("paused".equalsIgnoreCase(strD2)) {
                v.this.C.onVideoPaused();
                return;
            }
            if ("playing".equalsIgnoreCase(strD2)) {
                v.this.C.onVideoResumed();
                return;
            }
            if (C3426d4.i.f28541g0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoEnded();
                return;
            }
            if (C3426d4.i.f28543h0.equalsIgnoreCase(strD2)) {
                v.this.C.onVideoStopped();
                return;
            }
            Logger.i(v.this.f31084c, "onVideoStatusChanged: unknown status: " + strD2);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.i(v.this.f31084c, "openInlineStore(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                com.unity3d.ironsourceads.internal.services.a.AbstractC0443a abstractC0443aA = new com.unity3d.ironsourceads.internal.services.b().a(v.this.p(), new C3556k9(c3490ge.d("url"), c3490ge.d(C3426d4.f.f28484c), EnumC3592m9.f29496b.a(c3490ge.a(C3426d4.f.f28486e, EnumC3592m9.APP_ACTIVITY.b())), (!c3490ge.a(C3426d4.f.f28485d) || c3490ge.e(C3426d4.f.f28485d)) ? null : (JSONObject) c3490ge.b(C3426d4.f.f28485d)));
                if (abstractC0443aA instanceof com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a) {
                    v.this.a(str, false, ((com.unity3d.ironsourceads.internal.services.a.AbstractC0443a.C0444a) abstractC0443aA).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                v.this.a(str, false, e10.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                Logger.i(v.this.f31084c, "permissionsAPI(" + str + ")");
                v.this.I.a(new C3490ge(str).toString(), new w());
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                Logger.i(v.this.f31084c, "permissionsAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                Logger.i(v.this.f31084c, "postAdEventNotification(" + str + ")");
                C3490ge c3490ge = new C3490ge(str);
                String strD = c3490ge.d(C3426d4.i.f28547j0);
                if (TextUtils.isEmpty(strD)) {
                    v.this.a(str, false, C3426d4.c.f28458w, (String) null);
                    return;
                }
                String strD2 = c3490ge.d(C3426d4.i.f28549k0);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c3490ge);
                String str2 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                JSONObject jSONObject = (JSONObject) c3490ge.b(C3426d4.i.f28551l0);
                String strD3 = c3490ge.d(C3426d4.i.f28552m);
                C3714t8.e eVarG = v.this.g(strD3);
                if (!v.this.r(strD3)) {
                    v.this.a(str, false, C3426d4.c.f28457v, (String) null);
                    return;
                }
                String strE = v.this.e(str);
                if (!TextUtils.isEmpty(strE)) {
                    v.this.i(v.this.a(strE, v.this.a(C3426d4.i.f28552m, strD3, C3426d4.i.f28547j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), C3426d4.h.f28500c0, C3426d4.h.f28502d0));
                }
                v.this.b(new m(eVarG, str2, strD, jSONObject));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.i(v.this.f31084c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = v.this.f31093l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            v.this.f31092k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(v.this.f31084c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(v.this.f31084c, "setBackButtonState(" + str + ")");
            C3486ga.e().c(new C3490ge(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.i(v.this.f31084c, "setForceClose(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            String strD = c3490ge.d("width");
            String strD2 = c3490ge.d("height");
            v.this.f31095n = Integer.parseInt(strD);
            v.this.f31096o = Integer.parseInt(strD2);
            v.this.f31097p = c3490ge.d(C3426d4.i.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.i(v.this.f31084c, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.i(v.this.f31084c, "setOrientation(" + str + ")");
                String strD = new C3490ge(str).d("orientation");
                v.this.o(strD);
                v vVar = v.this;
                if (vVar.f31082a0 != null) {
                    v.this.f31082a0.onOrientationChanged(strD, vVar.X.K(vVar.Z.getContext()));
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(v.this.f31084c, "setStoreSearchKeys(" + str + ")");
            C3486ga.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.i(v.this.f31084c, "setUserData(" + str + ")");
            C3490ge c3490ge = new C3490ge(str);
            if (!c3490ge.a(C3426d4.i.W)) {
                v.this.a(str, false, C3426d4.c.F, (String) null);
                return;
            }
            if (!c3490ge.a("value")) {
                v.this.a(str, false, C3426d4.c.G, (String) null);
                return;
            }
            String strD = c3490ge.d(C3426d4.i.W);
            String strD2 = c3490ge.d("value");
            C3486ga.e().a(strD, strD2);
            v.this.i(v.this.e(v.this.e(str), v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.i(v.this.f31084c, "setWebviewBackgroundColor(" + str + ")");
            v.this.q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.i(v.this.f31084c, "stillAlive(" + str + ")");
            v.this.f31083b.a();
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                    jSONObject.putOpt("testerABGroup", jSONObjectJsonObjectInit.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObjectJsonObjectInit.get("testFriendlyName"));
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    Logger.d(v.this.f31084c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        public void c(String str) {
            v.this.i(v.this.a(C3426d4.h.f28501d, str, (String) null, (String) null));
        }

        public boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains(Y1.f27894f)) {
                return false;
            }
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                return (jSONObjectJsonObjectInit.getString("testerABGroup").isEmpty() || jSONObjectJsonObjectInit.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                InterfaceC3724u1 interfaceC3724u1A = InterfaceC3724u1.a(str);
                v vVar = v.this;
                C3690s1.a aVarA = vVar.N.a(vVar.Z.getContext(), interfaceC3724u1A);
                v.this.i(v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, int i10) {
            Y4 y4A;
            v vVar = v.this;
            C3714t8.e eVar = C3714t8.e.Interstitial;
            if (vVar.r(eVar.toString()) && (y4A = v.this.G.a(eVar, str)) != null && y4A.k()) {
                v.this.b(new u(str, i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f31106y.c(C3714t8.e.Interstitial, str);
                v.this.f31106y.b(str);
            }
            a(str, false);
        }

        private void a(String str, boolean z10) {
            Y4 y4A = v.this.G.a(C3714t8.e.Interstitial, str);
            if (y4A != null) {
                y4A.a(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f31106y.d(str2, str);
            }
            a(str2, false);
        }
    }

    public interface t {
        void a(String str, C3714t8.e eVar, Y4 y10);
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f31201b;
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    public enum EnumC0288v {
        Display,
        Gone
    }

    public class w extends WebViewClient {
        private w() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, webView, str);
            safedk_v$w_onPageFinished_54a02eed08a1fb59e53d8035ae586037(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, webView, str, safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(webView, str));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/v$w;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040 = safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44960f, webView, str, zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040);
            return zSafedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.ironsource.sdk.controller.c cVar;
            Logger.i("onReceivedError", str2 + Z7.f27998r + str);
            if (str2.contains(C3426d4.f28388f) && (cVar = v.this.Q) != null) {
                cVar.c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(v.this.f31084c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            if (cVar != null) {
                cVar.b(str);
            }
            v.this.v();
            return true;
        }

        public void safedk_v$w_onPageFinished_54a02eed08a1fb59e53d8035ae586037(WebView p10, String p11) {
            Logger.i("onPageFinished", p11);
            if (p11.contains("adUnit") || p11.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(p10, p11);
        }

        public WebResourceResponse safedk_v$w_shouldInterceptRequest_db9d825c1b199e8d268f5f6da9a7d7c1(WebView p10, String p11) {
            boolean zContains;
            Logger.i("shouldInterceptRequest", p11);
            try {
                zContains = new URL(p11).getFile().contains("mraid.js");
            } catch (MalformedURLException e10) {
                C3676r4.d().a(e10);
                zContains = false;
            }
            if (zContains) {
                String str = AdPayload.FILE_SCHEME + v.this.A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str));
                } catch (FileNotFoundException e11) {
                    C3676r4.d().a(e11);
                }
            }
            return super.shouldInterceptRequest(p10, p11);
        }

        public boolean safedk_v$w_shouldOverrideUrlLoading_6bef201be90a53a277b071cc2e5aa040(WebView p10, String p11) {
            Logger.i("shouldOverrideUrlLoading", p11);
            try {
                if (v.this.h(p11)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            return super.shouldOverrideUrlLoading(p10, p11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(Context context, Z4 z10, C3480g4 c3480g4, com.ironsource.sdk.controller.c cVar, V7 v10, int i10, C3534j5 c3534j5, String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        Object[] objArr = 0;
        p pVar = new p();
        this.f31098q = pVar;
        boolean zE = Lb.U().g().e();
        if (zE) {
            countDownLatch = new CountDownLatch(1);
            a(context, v10, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.X = Lb.U().i();
        if (!zE) {
            this.Z = new C3539ja(context, new InterfaceC3733ua.a());
        }
        Logger.i(this.f31084c, "C'tor");
        this.Y = c3480g4;
        this.Q = cVar;
        this.f31081a = v10;
        this.G = z10;
        if (!zE) {
            a(context, this.Z);
        }
        this.A = str;
        this.D = new C3369a1();
        this.S = IronSourceVideoBridge.jsonObjectInit();
        this.f31089h = c3534j5;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C3426d4.a.f28416i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new C3625o4(new C3569l4(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C3417cd(SDKUtils.getControllerUrl())), new bk.l() { // from class: com.ironsource.sdk.controller.k0
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return this.f30963b.d((C8) obj);
                }
            }, c3534j5, new InterfaceC3710t4.a());
        } else {
            c3534j5.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), c3534j5);
        }
        if (!zE) {
            this.Z.setWebViewClient(new w());
            this.Z.setWebChromeClient(pVar);
            Og.a(this.Z);
            a(this.Z);
            this.Z.setDownloadListener(this);
        }
        this.R = c(context);
        b(context);
        b(i10);
        this.f31087f = str2;
        this.f31088g = str3;
        if (zE) {
            try {
                countDownLatch.await();
                if (this.Z == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.Q.c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e10) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e10);
                C3676r4.d().a(e10);
                Thread.currentThread().interrupt();
                this.Q.c("WebView initialization was interrupted");
                return;
            }
        }
        this.f31083b = InterfaceC3551k4.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    @SuppressLint({"NewApi"})
    private void G() {
    }

    private void a(final Context context, V7 v10, final CountDownLatch countDownLatch) {
        v10.d(new Runnable() { // from class: com.ironsource.sdk.controller.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f30934b.a(context, countDownLatch);
            }
        });
    }

    private X3 c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z10;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        Map<String, String> mapG = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            Y4 y4A = this.G.a(g(str), str2);
            if (y4A != null) {
                mapG = y4A.g();
                mapG.put("demandSourceName", y4A.f());
                mapG.put("demandSourceId", y4A.h());
            }
            try {
                jSONObjectJsonObjectInit.put(C3426d4.i.f28552m, str);
            } catch (JSONException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObjectJsonObjectInit = SDKUtils.mergeJSONObjects(jSONObjectJsonObjectInit, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                C3676r4.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
            z10 = false;
        }
        if (!TextUtils.isEmpty(this.f31088g)) {
            try {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28590f), SDKUtils.encodeString(this.f31088g));
            } catch (JSONException e12) {
                C3676r4.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (TextUtils.isEmpty(this.f31087f)) {
            z10 = true;
        } else {
            try {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28592g), SDKUtils.encodeString(this.f31087f));
            } catch (JSONException e13) {
                C3676r4.d().a(e13);
                IronLog.INTERNAL.error(e13.toString());
            }
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    p(entry.getValue());
                }
                try {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    C3676r4.d().a(e14);
                    IronLog.INTERNAL.error(e14.toString());
                }
            }
        }
        return new Object[]{jSONObjectJsonObjectInit.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f30955b.k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str) {
        this.Z.a(new com.ironsource.sdk.controller.m.b(str, q()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str) {
        try {
            Logger.i(this.f31084c, "load(): " + str);
            IronSourceNetworkBridge.webviewLoadUrl(this.Z, str);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            Logger.e(this.f31084c, "WebViewController::load: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Qc qc2 = this.f31082a0;
        if (qc2 != null) {
            qc2.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f31084c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C3714t8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C3714t8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C3714t8.e.Banner.toString()) || this.f31107z == null : this.f31105x == null) : this.f31106y != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(this.f31084c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z10;
    }

    public void A() {
        i(f(C3426d4.h.A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            Logger.i(this.f31084c, "WebViewController: onPause() - " + th2);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.f31082a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            Logger.i(this.f31084c, "WebViewController: onResume() - " + th2);
        }
    }

    public com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C3426d4.c.f28461z;
        }
        i(e(C3426d4.h.f28498a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        i(f(C3426d4.h.f28519t));
    }

    public void g(String str, String str2) {
        i(e(C3426d4.h.W, a(C3426d4.i.f28558p, str2, C3426d4.i.f28552m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public C3714t8.c h() {
        return C3714t8.c.Web;
    }

    public void j(String str) {
        i(e(C3426d4.f.f28491j, a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    public void l(String str) {
        i(e(C3426d4.h.f28522w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public Ng o() {
        if (this.P == null) {
            this.P = new h();
        }
        return this.P;
    }

    public Context p() {
        return this.Y.a();
    }

    public int q() {
        return f31075c0;
    }

    public String s() {
        return this.f31104w;
    }

    public C3369a1 t() {
        return this.D;
    }

    public EnumC0288v u() {
        return this.f31103v;
    }

    public void v() {
        if (this.f31091j == null) {
            return;
        }
        n();
        C3714t8.e eVarB = this.f31091j.b();
        String strA = this.f31091j.a();
        if (r(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void w() {
        this.f31098q.onHideCustomView();
    }

    public boolean x() {
        return this.f31099r != null;
    }

    public void y() {
        i(f(C3426d4.f.f28489h));
    }

    public void z() {
        i(f(C3426d4.h.Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.Z = new C3539ja(context, new InterfaceC3733ua.a());
                a(context, this.Z);
                this.Z.setWebViewClient(new w());
                this.Z.setWebChromeClient(this.f31098q);
                Og.a(this.Z);
                a(this.Z);
                this.Z.setDownloadListener(this);
            } catch (Exception e10) {
                this.Q.c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e10);
                C3676r4.d().a(e10);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    private void p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.Z.getSettings().setCacheMode(2);
        } else {
            this.Z.getSettings().setCacheMode(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str) {
        C3490ge c3490ge = new C3490ge(str);
        String strD = c3490ge.d("color");
        String strD2 = c3490ge.d("adViewId");
        int color = !C3426d4.i.T.equalsIgnoreCase(strD) ? Color.parseColor(strD) : 0;
        if (strD2 == null) {
            this.Z.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C3664q8.a().a(strD2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
        if (this.W) {
            this.V.b();
            return;
        }
        this.B.a(new C3748v8());
        if (this.B.k()) {
            a(1);
        }
    }

    public void c(String str, String str2) {
        try {
            i(e(C3426d4.h.f28515p, a(C3426d4.i.f28530b, str, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            b(str, str2, e10.getMessage());
        }
    }

    public boolean h(String str) {
        try {
            if (!new Je(str, C3486ga.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return false;
            }
            C3474fg.a(p(), str);
            return true;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f31084c, str + Z7.f27998r + str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new C3490ge(str).d(f31079g0);
    }

    public void n(String str) {
        try {
            String strD = C3372a4.d(this.Z.getContext());
            Logger.i(this.f31084c, "device status changed, connection type " + str);
            C3799y8.a(str);
            C3799y8.b(strD);
            i(e(C3426d4.h.f28523x, a("connectionType", str, "rawConnectionType", strD, null, null, null, null, null, false)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e10));
        }
    }

    private String d(JSONObject jSONObject) {
        C3409c5 c3409c5B = C3409c5.b(this.Z.getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb2.append("SDKVersion");
            sb2.append("=");
            sb2.append(sDKVersion);
            sb2.append(C3426d4.j.f28584c);
        }
        String strE = c3409c5B.e();
        if (!TextUtils.isEmpty(strE)) {
            sb2.append(C3426d4.j.f28604m);
            sb2.append("=");
            sb2.append(strE);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + StringUtils.PROCESS_POSTFIX_DELIMITER;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            }
            sb2.append(C3426d4.j.f28584c);
            sb2.append("protocol");
            sb2.append("=");
            sb2.append(str);
            sb2.append(C3426d4.j.f28584c);
            sb2.append(C3426d4.j.D);
            sb2.append("=");
            sb2.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C3426d4.j.Z, C3426d4.j.f28592g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb2.append(C3426d4.j.f28584c);
                        sb2.append("controllerConfig");
                        sb2.append("=");
                        sb2.append(string);
                    }
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb2.append(C3426d4.j.f28584c);
            sb2.append("debug");
            sb2.append("=");
            sb2.append(q());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean zB = C3533j4.b(this.Z.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && zB) {
                sb2.append(C3426d4.j.f28584c);
                sb2.append(C3426d4.j.f28619t0);
                sb2.append("=");
                sb2.append(true);
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3714t8.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C3714t8.e eVar = C3714t8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C3714t8.e eVar2 = C3714t8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C3714t8.e eVar3 = C3714t8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    public void o(String str) {
        this.f31104w = str;
    }

    public void e(JSONObject jSONObject) {
        Logger.i(this.f31084c, "device connection info changed: " + jSONObject.toString());
        i(e(C3426d4.h.f28524y, a(C3426d4.j.f28595h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C3399bd.e(this.Z.getContext()));
        jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28611p0), SDKUtils.encodeString(C3399bd.b(this.Z.getContext())));
    }

    public void b(int i10) {
        f31075c0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        i(f(C3426d4.h.f28520u));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        a(y10, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            X3 x10 = this.R;
            if (x10 == null) {
                return;
            }
            x10.b(context);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y10) {
        Map<String, String> mapB = y10.b();
        if (mapB != null) {
            i(e(C3426d4.h.T, SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(C3714t8.e.Interstitial, y10.h());
    }

    public FrameLayout r() {
        return this.f31102u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, a(sVar), C3426d4.f28386d);
        IronSourceNetworkBridge.onAddedJavascriptInterface(webView, b(sVar), C3426d4.f28387e);
    }

    private boolean c(C8 c10) {
        int iSaveFile;
        boolean zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.Z.getContext(), c10);
        if (!zCopyFileFromBundleToStorage) {
            return false;
        }
        byte[] bArrA = C3533j4.a(this.Z.getContext(), C3426d4.f28389g);
        String strA = C3533j4.a(this.Z.getContext());
        if (strA != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c10.getParent());
            String str = File.separator;
            sb2.append(str);
            sb2.append("controller_");
            sb2.append(strA);
            sb2.append(str);
            sb2.append(C3426d4.f28389g);
            String string = sb2.toString();
            if (bArrA == null || bArrA.length == 0) {
                return zCopyFileFromBundleToStorage;
            }
            try {
                iSaveFile = IronSourceStorageUtils.saveFile(bArrA, string);
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception: " + e10.getMessage());
                zCopyFileFromBundleToStorage = false;
                iSaveFile = 0;
            }
            if (iSaveFile != 0) {
                return zCopyFileFromBundleToStorage;
            }
            IronLog.INTERNAL.verbose("failed to read bytes for " + c10.getName());
        }
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(C3426d4.h.f28504e0, jSONObject != null ? jSONObject.toString() : null));
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    public com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new s()), sVar);
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(C3426d4.h.f28516q, a(C3426d4.i.f28530b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void b(boolean z10, String str) {
        i(e(C3426d4.h.V, a(C3426d4.i.K, str, null, null, null, null, null, null, C3426d4.i.f28556o, z10)));
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    public void c(String str) {
        if (str.equals(C3426d4.i.f28544i)) {
            n();
        }
        i(e(C3426d4.h.f28525z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(o());
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new d(context));
    }

    public void a(C3690s1 c3690s1) {
        this.N = c3690s1;
    }

    public void b(Runnable runnable) {
        V7 v10 = this.f31081a;
        if (v10 != null) {
            v10.c(runnable);
        }
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f31102u = new FrameLayout(context);
        this.f31100s = new FrameLayout(context);
        this.f31100s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f31100s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f31102u.addView(this.f31100s, layoutParams);
        this.f31102u.addView(frameLayout);
    }

    private String c(String str, String str2, String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    public void c(Runnable runnable) {
        V7 v10 = this.f31081a;
        if (v10 != null) {
            v10.d(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            X3 x10 = this.R;
            if (x10 == null) {
                return;
            }
            x10.c(context);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    private String f(String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        a(this.D);
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    public void a(B4 b10) {
        this.O = b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3744v4 a(C3714t8.e eVar) {
        if (eVar == C3714t8.e.Interstitial) {
            return this.f31106y;
        }
        if (eVar == C3714t8.e.RewardedVideo) {
            return this.f31105x;
        }
        if (eVar == C3714t8.e.Banner) {
            return this.f31107z;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new C3490ge(str).d(f31080h0);
    }

    public void a(InterfaceC3601mg interfaceC3601mg) {
        this.C = interfaceC3601mg;
    }

    public void a(int i10) {
        String string;
        if (!this.W && !this.B.m()) {
            Logger.i(this.f31084c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strD = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        if (this.W) {
            string = this.V.c().toURI().toString();
        } else {
            string = this.B.g().toURI().toString();
        }
        this.f31081a.d(new i(controllerConfigAsJSONObject, this.Z, string + "?" + strD));
        this.f31094m = new j(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i10).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        boolean z10;
        C3409c5 c3409c5B = C3409c5.b(context);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C3426d4.j.f28625z, "none");
            jSONObjectJsonObjectInit.put(C3426d4.j.A, SDKUtils.translateDeviceOrientation(this.X.z(context)));
            String strD = c3409c5B.d();
            if (strD != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c3409c5B.c();
            if (strC != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.f31084c, "add AID");
                    jSONObjectJsonObjectInit.put("deviceIds" + C3426d4.j.f28586d + C3426d4.j.L + C3426d4.j.f28588e, SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.i(this.f31084c, "add LAT");
                    jSONObjectJsonObjectInit.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(limitAdTracking));
                }
                String strE = c3409c5B.e();
                if (strE != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28604m), SDKUtils.encodeString(strE));
                } else {
                    z10 = true;
                }
                String strF = c3409c5B.f();
                if (strF != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOSVersion"), strF.replaceAll("[^0-9/.]", ""));
                } else {
                    z10 = true;
                }
                String strF2 = c3409c5B.f();
                if (strF2 != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28608o), SDKUtils.encodeString(strF2));
                }
                String strValueOf = String.valueOf(c3409c5B.a());
                if (strValueOf != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceApiLevel"), strValueOf);
                } else {
                    z10 = true;
                }
                jSONObjectJsonObjectInit.put(Q6.f27440j0, String.valueOf(C3547k0.a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (c3409c5B.b() != null && c3409c5B.b().length() > 0) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28614r), SDKUtils.encodeString(c3409c5B.b()));
                }
                String strB = C3372a4.b(context);
                if (strB.equals("none")) {
                    z10 = true;
                } else {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
                }
                String strD2 = C3372a4.d(context);
                if (strD2 != null) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD2));
                } else {
                    z10 = true;
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("hasVPN"), C3372a4.e(context));
                jSONObjectJsonObjectInit.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                jSONObjectJsonObjectInit.put(C3426d4.j.f28624y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
                String strValueOf2 = String.valueOf(this.X.o());
                if (TextUtils.isEmpty(strValueOf2)) {
                    z10 = true;
                } else {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.G) + C3426d4.j.f28586d + SDKUtils.encodeString("width") + C3426d4.j.f28588e, SDKUtils.encodeString(strValueOf2));
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.G) + C3426d4.j.f28586d + SDKUtils.encodeString("height") + C3426d4.j.f28588e, SDKUtils.encodeString(String.valueOf(this.X.b())));
                String strG = C1.g(this.Z.getContext());
                if (!TextUtils.isEmpty(strG)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
                }
                String strValueOf3 = String.valueOf(this.X.r());
                if (!TextUtils.isEmpty(strValueOf3)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.K), SDKUtils.encodeString(strValueOf3));
                }
                String strValueOf4 = String.valueOf(this.X.p());
                if (!TextUtils.isEmpty(strValueOf4)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.O), SDKUtils.encodeString(strValueOf4));
                }
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.P), C3409c5.b(context).a(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.Y), this.X.k(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("mcc"), Z3.b(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("mnc"), Z3.c(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.S), Z3.f(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.R), SDKUtils.encodeString(Z3.g(context)));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.V), C1.f(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.X), C1.d(context));
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C1.b(context)));
                String strE2 = C1.e(context);
                if (!TextUtils.isEmpty(strE2)) {
                    jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28585c0), SDKUtils.encodeString(strE2));
                }
                c(jSONObjectJsonObjectInit);
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28613q0), this.X.t(context));
            } catch (JSONException e10) {
                e = e10;
                C3676r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (JSONException e11) {
            e = e11;
            z10 = false;
        }
        return new Object[]{jSONObjectJsonObjectInit.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private void a(String str, C3714t8.e eVar, Y4 y10, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.a("Application key are missing", eVar, y10);
        } else {
            i(a(eVar, y10).f31201b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3795y4 interfaceC3795y4) {
        this.f31087f = str;
        this.f31088g = str2;
        this.f31105x = interfaceC3795y4;
        this.D.i(str);
        this.D.j(str2);
        a(str, C3714t8.e.RewardedVideo, y10, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3778x4 interfaceC3778x4) {
        this.f31087f = str;
        this.f31088g = str2;
        this.f31106y = interfaceC3778x4;
        this.D.g(str);
        this.D.h(this.f31088g);
        a(this.f31087f, C3714t8.e.Interstitial, y10, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3778x4 interfaceC3778x4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(C3426d4.h.E, strFlatMapToJsonAsString, C3426d4.h.F, C3426d4.h.G));
    }

    private void a(Y4 y10, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y10.b()});
        if (map.containsKey("adm")) {
            this.f31083b.a(new InterfaceC3551k4.d() { // from class: com.ironsource.sdk.controller.h0
                @Override // com.ironsource.InterfaceC3551k4.d
                public final void a(InterfaceC3447e7 interfaceC3447e7) {
                    this.f30942a.a(interfaceC3447e7);
                }
            });
        }
        this.D.d(y10.h(), true);
        i(a(C3426d4.h.E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3426d4.h.F, C3426d4.h.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3447e7 interfaceC3447e7) {
        interfaceC3447e7.a(new InterfaceC3465f7() { // from class: com.ironsource.sdk.controller.j0
            @Override // com.ironsource.InterfaceC3465f7
            public final void a(InterfaceC3393b7 interfaceC3393b7) {
                this.f30962b.a(interfaceC3393b7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC3393b7 interfaceC3393b7) {
        try {
            this.Q.a(interfaceC3393b7);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Logger.e(this.f31084c, "handleLoadAd: " + e10);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3778x4 interfaceC3778x4) {
        i(a(C3714t8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4) {
        i(a(C3714t8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, y10.b()}))));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        Y4 y4A = this.G.a(C3714t8.e.Interstitial, str);
        return y4A != null && y4A.d();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y10, InterfaceC3761w4 interfaceC3761w4) {
        this.f31087f = str;
        this.f31088g = str2;
        this.f31107z = interfaceC3761w4;
        a(str, C3714t8.e.Banner, y10, new m());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10, Map<String, String> map, InterfaceC3761w4 interfaceC3761w4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, y10.b()});
        if (map != null) {
            i(a(C3426d4.h.N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C3426d4.h.O, C3426d4.h.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y10) {
        Map<String, String> mapB = y10.b();
        if (mapB != null) {
            i(a(C3426d4.h.S, SDKUtils.flatMapToJsonAsString(mapB), C3426d4.h.P, C3426d4.h.Q));
        }
        this.G.b(C3714t8.e.Banner, y10.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3761w4 interfaceC3761w4) {
        i(a(C3426d4.h.N, jSONObject.toString(), C3426d4.h.O, C3426d4.h.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), C3426d4.h.U, C3426d4.h.U));
    }

    private u a(C3714t8.e eVar, Y4 y10) {
        u uVar = new u();
        if (eVar == C3714t8.e.RewardedVideo || eVar == C3714t8.e.Interstitial || eVar == C3714t8.e.Banner) {
            HashMap map = new HashMap();
            map.put(C3426d4.j.f28592g, this.f31087f);
            if (!TextUtils.isEmpty(this.f31088g)) {
                map.put(C3426d4.j.f28590f, this.f31088g);
            }
            if (y10 != null) {
                if (y10.g() != null) {
                    map.putAll(y10.g());
                    map.put(C3426d4.i.f28577y0, String.valueOf(M.f27023a.c(y10.h())));
                }
                map.put("demandSourceName", y10.f());
                map.put("demandSourceId", y10.h());
            }
            String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
            C3426d4.h hVarA = C3426d4.h.a(eVar);
            String strA = a(hVarA.f28526a, strFlatMapToJsonAsString, hVarA.f28527b, hVarA.f28528c);
            uVar.f31200a = hVarA.f28526a;
            uVar.f31201b = strA;
        }
        return uVar;
    }

    private String a(C3714t8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        Y4 y4A = this.G.a(eVar, strFetchDemandSourceId);
        if (y4A != null) {
            if (y4A.g() != null) {
                map.putAll(y4A.g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C3426d4.h hVarB = C3426d4.h.b(eVar);
        return a(hVarB.f28526a, strFlatMapToJsonAsString, hVarB.f28527b, hVarB.f28528c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, C3714t8.e eVar, Y4 y10) {
        if (r(eVar.toString())) {
            b(new n(eVar, y10, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3795y4 interfaceC3795y4) {
        i(a(C3714t8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    public void a(boolean z10, String str) {
        i(e(C3426d4.h.V, a(C3426d4.i.M0, str, null, null, null, null, null, null, C3426d4.i.f28556o, z10)));
    }

    public void a(int i10, boolean z10) {
        i(e(C3426d4.f.f28490i, a(C3426d4.f.f28487f, String.valueOf(i10), null, null, null, null, null, null, C3426d4.f.f28488g, z10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String strD = new C3490ge(str).d(z10 ? f31079g0 : f31080h0);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    private String a(String str, String str2) {
        return a(str, str2, C3426d4.i.f28540g);
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return IronSourceVideoBridge.jsonObjectInit(str).put(str3, str2).toString();
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObjectJsonObjectInit.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObjectJsonObjectInit.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObjectJsonObjectInit.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObjectJsonObjectInit.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObjectJsonObjectInit.put(str9, z10);
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object d(C8 c10) {
        this.f31089h.a(this);
        if (c10 != null && c10.exists()) {
            a(c10);
            return null;
        }
        a(new C8(C3426d4.f28388f), new C3731u8(1, "Unable to download Html file"));
        return null;
    }

    @Override // com.ironsource.Oc
    public void a(C8 c10) {
        if (this.W && this.V.a(c10)) {
            a(1);
        } else {
            if (c10.getName().contains(C3426d4.f28388f)) {
                C3533j4.a(this.Z.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.B.a(new o());
                return;
            }
            c(c10.getName(), c10.getParent());
        }
    }

    @Override // com.ironsource.Oc
    public void a(C8 c10, C3731u8 c3731u8) {
        if (this.W && this.V.a(c10)) {
            this.Q.c("controller html - failed to download - " + c3731u8.b());
            return;
        }
        boolean zCopyFileFromBundleToStorage = false;
        if (c10.getName().contains(C3426d4.f28388f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c10.getName().equals(C3426d4.f28388f)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c10.getName() + " and " + C3426d4.f28389g);
                zCopyFileFromBundleToStorage = c(c10);
            }
            if (zCopyFileFromBundleToStorage) {
                A8.a(C3472fe.C);
                C3533j4.a(this.Z.getContext(), true);
                this.B.a(new a());
                return;
            }
            this.B.a(new b(), new c(c3731u8));
            return;
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && a((File) c10)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c10.getName());
            zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.Z.getContext(), c10);
        }
        if (zCopyFileFromBundleToStorage) {
            c(c10.getName(), c10.getParent());
        } else {
            b(c10.getName(), c10.getParent(), c3731u8.b());
        }
    }

    private boolean a(File file) {
        return C3533j4.a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new e(context));
    }

    public void a(Qc qc2) {
        this.f31082a0 = qc2;
        this.Z.a(qc2);
    }

    public void a(EnumC0288v enumC0288v) {
        this.f31103v = enumC0288v;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        this.Z.destroy();
        C3534j5 c3534j5 = this.f31089h;
        if (c3534j5 != null) {
            c3534j5.d();
        }
        X3 x10 = this.R;
        if (x10 != null) {
            x10.b();
        }
        CountDownTimer countDownTimer = this.f31094m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    public void a(C3714t8.e eVar, String str) {
        b(new f(eVar, str));
    }

    public void a(C3369a1 c3369a1) {
        synchronized (this.E) {
            if (c3369a1.j() && this.f31090i) {
                Log.d(this.f31084c, "restoreState(state:" + c3369a1 + ")");
                int iC = c3369a1.c();
                if (iC != -1) {
                    C3714t8.e eVar = C3714t8.e.RewardedVideo;
                    if (iC == eVar.ordinal()) {
                        Log.d(this.f31084c, "onRVAdClosed()");
                        String strB = c3369a1.b();
                        InterfaceC3744v4 interfaceC3744v4A = a(eVar);
                        if (interfaceC3744v4A != null && !TextUtils.isEmpty(strB)) {
                            interfaceC3744v4A.b(eVar, strB);
                        }
                    } else {
                        C3714t8.e eVar2 = C3714t8.e.Interstitial;
                        if (iC == eVar2.ordinal()) {
                            Log.d(this.f31084c, "onInterstitialAdClosed()");
                            String strB2 = c3369a1.b();
                            InterfaceC3744v4 interfaceC3744v4A2 = a(eVar2);
                            if (interfaceC3744v4A2 != null && !TextUtils.isEmpty(strB2)) {
                                interfaceC3744v4A2.b(eVar2, strB2);
                            }
                        }
                    }
                    c3369a1.a(-1);
                    c3369a1.f(null);
                } else {
                    Log.d(this.f31084c, "No ad was opened");
                }
                String strD = c3369a1.d();
                String strF = c3369a1.f();
                for (Y4 y10 : this.G.a(C3714t8.e.Interstitial)) {
                    if (y10.e() == 2) {
                        Log.d(this.f31084c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + y10.f() + ")");
                        a(strD, strF, y10, this.f31106y);
                    }
                }
                String strG = c3369a1.g();
                String strH = c3369a1.h();
                for (Y4 y11 : this.G.a(C3714t8.e.RewardedVideo)) {
                    if (y11.e() == 2) {
                        String strF2 = y11.f();
                        Log.d(this.f31084c, "onRVNoMoreOffers()");
                        this.f31105x.c(strF2);
                        Log.d(this.f31084c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                        a(strG, strH, y11, this.f31105x);
                    }
                }
                c3369a1.a(false);
            }
            this.D = c3369a1;
        }
    }

    public void a(Runnable runnable) {
        V7 v10 = this.f31081a;
        if (v10 != null) {
            v10.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }
}
