package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.ArrayList;

/* JADX INFO: compiled from: WebViewRenderManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37103b;

    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MBSplashView f37105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f37107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f37108e;

        public a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j10) {
            this.f37104a = cVar;
            this.f37105b = mBSplashView;
            this.f37106c = campaignEx;
            this.f37107d = str;
            this.f37108e = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            c cVar = this.f37104a;
            if (cVar != null) {
                cVar.a(i10);
            }
            if (i10 == 1) {
                g.this.f37102a = true;
                this.f37105b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37106c, this.f37107d, "", this.f37108e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f37107d, this.f37106c);
                return;
            }
            g.this.f37102a = false;
            this.f37105b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.f37107d, this.f37106c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37106c, this.f37107d, "readyState 2", this.f37108e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.f37104a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.f37103b = true;
            if (!this.f37106c.isHasMBTplMark()) {
                this.f37105b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.f37107d, this.f37106c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37106c, this.f37107d, "", this.f37108e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            c cVar = this.f37104a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.f37105b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i10 + str, this.f37107d, this.f37106c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37106c, this.f37107d, "error code:" + i10 + str, this.f37108e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.f37104a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.f37105b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.f37107d, this.f37106c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37106c, this.f37107d, "error url:" + sslError.getUrl(), this.f37108e, 3);
        }
    }

    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f37110a = new g(null);
    }

    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public interface c {
        void a();

        void a(int i10);

        void onError(String str);
    }

    /* JADX INFO: compiled from: WebViewRenderManager.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f37113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f37114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37116f;

        public void a(String str) {
            this.f37114d = str;
        }

        public void b(String str) {
            this.f37111a = str;
        }

        public String c() {
            return this.f37114d;
        }

        public CampaignEx a() {
            return this.f37113c;
        }

        public int b() {
            return this.f37116f;
        }

        public void c(String str) {
            this.f37112b = str;
        }

        public String d() {
            return this.f37111a;
        }

        public String e() {
            return this.f37112b;
        }

        public boolean f() {
            return this.f37115e;
        }

        public void a(CampaignEx campaignEx) {
            this.f37113c = campaignEx;
        }

        public void a(boolean z10) {
            this.f37115e = z10;
        }

        public void a(int i10) {
            this.f37116f = i10;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    private g() {
        this.f37102a = false;
        this.f37103b = false;
    }

    public static g a() {
        return b.f37110a;
    }

    public void b() {
        this.f37102a = false;
        this.f37103b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        String requestId;
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String strE = dVar.e();
        String strD = dVar.d();
        CampaignEx campaignExA = dVar.a();
        String strC = dVar.c();
        boolean zF = dVar.f();
        int iB = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), strD, strE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignExA);
        bVar.a(arrayList);
        bVar.a(zF ? 1 : 0);
        bVar.b(iB);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        if (TextUtils.isEmpty(campaignExA.getRequestId())) {
            requestId = campaignExA.getRequestIdNotice();
        } else {
            requestId = campaignExA.getRequestId();
        }
        String requestId2 = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestId + " WebView RequestId = " + requestId2);
        if (!TextUtils.isEmpty(requestId2) && requestId2.equals(requestId) && (this.f37102a || this.f37103b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestId);
        com.mbridge.msdk.splash.report.a.b(strE, campaignExA);
        long jCurrentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, campaignExA, strE, jCurrentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            MintegralNetworkBridge.webviewLoadUrl(splashWebview, strC);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignExA, strE, "webview had destory", jCurrentTimeMillis, 3);
        }
    }
}
