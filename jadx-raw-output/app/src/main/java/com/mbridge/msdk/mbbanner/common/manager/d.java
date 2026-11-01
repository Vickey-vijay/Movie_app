package com.mbridge.msdk.mbbanner.common.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseBannerShowManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {
    private com.mbridge.msdk.mbbanner.common.communication.b A;
    private AdSession B;
    private AdEvents C;
    private float F;
    private float G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.mbbanner.common.listener.c f35670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CampaignEx f35672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MBBannerView f35673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f35674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBBannerWebView f35675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f35676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f35677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f35683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f35685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f35686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f35687r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.mbridge.msdk.click.a f35689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<CampaignEx> f35690u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View.OnTouchListener f35692w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35694y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35688s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35691v = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f35693x = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f35695z = 15000;
    private final Handler D = new e(Looper.getMainLooper());
    private final com.mbridge.msdk.foundation.same.task.a E = new f();
    private final View.OnClickListener H = new g();
    private com.mbridge.msdk.mbbanner.common.listener.a I = new h();
    private com.mbridge.msdk.mbsignalcommon.listener.b J = new c();

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35698b;

        public b(Context context, CampaignEx campaignEx) {
            this.f35697a = context;
            this.f35698b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f35697a)).b(this.f35698b.getId());
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            d.this.f35680k = true;
            com.mbridge.msdk.mbbanner.common.communication.a.a(webView);
            d.this.f35682m = true;
            CampaignEx campaignEx = d.this.f35672c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.p();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
            bVar.c(i10 + " WebView receive error: " + i10 + "  message : " + str);
            bVar.b(d.this.f35687r);
            d.this.a(bVar);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            d.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class C0341d implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            d.this.f35673d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        public C0341d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            d.this.f35673d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            d.this.f35673d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) d.this.f35675f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (d.this.B != null) {
                        d dVar = d.this;
                        dVar.C = AdEvents.createAdEvents(dVar.B);
                        if (d.this.C != null) {
                            d.this.C.loaded();
                            d.this.C.impressionOccurred();
                        }
                    }
                } catch (Throwable th2) {
                    q0.a("BannerShowManager", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class f extends com.mbridge.msdk.foundation.same.task.a {
        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880045);
            bVar.b(d.this.f35672c.getLocalRequestId());
            d.this.a(bVar);
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f35684o) {
                dVar.f35688s = 1;
                d.this.b();
            }
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class h implements com.mbridge.msdk.mbbanner.common.listener.a {
        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void readyStatus(int i10) {
            if (i10 != 1) {
                d.this.g();
            } else {
                d.this.p();
                d.this.a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void toggleCloseBtn(int i10) {
            if (i10 == 2) {
                d.this.e();
            } else {
                d.this.n();
            }
        }

        public h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10) {
            d dVar = d.this;
            if (dVar.f35670a != null) {
                dVar.f35683n = z10;
                if (z10) {
                    d.this.f35670a.a();
                } else {
                    d.this.f35670a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void close() {
            d.this.f35688s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void triggerCloseBtn(String str) {
            d.this.f35688s = 2;
            d.this.b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.a
        public void a(boolean z10, String str) {
            try {
                if (d.this.f35670a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f35670a.c();
                        d.this.f35670a.onLeaveApp();
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f35672c));
                        campaignWithBackData.setClickTempSource(2);
                        campaignWithBackData.setClickType(2);
                        campaignWithBackData.setTriggerClickSource(2);
                        campaignWithBackData.setClickURL(str);
                        d.this.a(campaignWithBackData, z10, str);
                    }
                }
            } catch (Exception e10) {
                q0.b("BannerShowManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f35675f != null) {
                    String str = d.this.f35691v == 2 ? com.ironsource.mediationsdk.metadata.a.f29886h : "true";
                    d.this.f35675f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class j implements View.OnTouchListener {
        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            d.this.F = motionEvent.getRawX();
            d.this.G = motionEvent.getRawY();
            q0.b("BannerShowManager", d.this.F + "  " + d.this.G);
            return false;
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.F, d.this.G), d.this.f35672c), false, "");
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class l implements com.mbridge.msdk.foundation.same.image.c {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880039);
            bVar.b(d.this.f35687r);
            d.this.a(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (d.this.f35674e != null) {
                d.this.f35674e.setImageBitmap(bitmap);
            }
            d.this.f35680k = true;
            d.this.o();
            d.this.n();
            d.this.m();
            d dVar = d.this;
            if (dVar.f35684o) {
                return;
            }
            dVar.p();
        }
    }

    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.p();
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    private synchronized boolean d() {
        boolean zIsReport;
        zIsReport = this.f35672c.isReport();
        if (!zIsReport) {
            this.f35672c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ImageView imageView;
        if (this.f35671b && (imageView = this.f35676g) != null && imageView.getVisibility() == 0) {
            this.f35676g.setVisibility(8);
            this.f35676g.setOnClickListener(null);
            if (this.f35673d == null || this.f35676g.getParent() == null) {
                return;
            }
            this.f35673d.removeView(this.f35676g);
        }
    }

    private void f() {
        if (this.f35671b && this.f35676g == null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f35676g = imageView;
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_banner_close", "drawable"));
            this.f35676g.setVisibility(8);
            this.f35676g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void g() {
        if (this.f35673d == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880046);
            bVar.b(this.f35687r);
            a(bVar);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f35675f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f35673d.removeView(this.f35675f);
        }
        if (this.f35674e == null) {
            this.f35674e = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            this.f35692w = new j();
            this.f35674e.setOnClickListener(new k());
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 296);
        if (TextUtils.isEmpty(this.f35672c.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, this.f35672c.getLocalRequestId()).a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
        b1.a(this.f35674e, this.f35672c.getLocalRequestId(), this.f35672c.getLocalAllowTrackClick(), this.f35692w);
        String imageUrl = this.f35672c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(imageUrl, new l());
            return;
        }
        com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880047);
        bVar2.b(this.f35687r);
        a(bVar2);
    }

    private void i() {
        AdSession adSession = this.B;
        if (adSession != null) {
            adSession.finish();
            this.B = null;
            q0.a("omsdk", " adSession.finish() ");
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.f35672c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, campaignEx.getLocalRequestId());
                cVarA.g(this.f35693x);
                cVarA.b(true);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000152", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void k() {
        try {
            CampaignEx campaignEx = this.f35672c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, campaignEx.getLocalRequestId());
                cVarA.g(this.f35693x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("close_click_type", Integer.valueOf(this.f35688s));
                eVar.a("creative_id", Long.valueOf(this.f35672c.getCreativeId()));
                com.mbridge.msdk.mbbanner.common.report.a.a("2000069", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    private void l() {
        try {
            CampaignEx campaignEx = this.f35672c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, campaignEx.getLocalRequestId());
                cVarA.g(this.f35693x);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000133", cVarA, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f35673d == null) {
            return;
        }
        CampaignEx campaignEx = this.f35672c;
        if (campaignEx != null) {
            if (!(campaignEx.getPrivacyButtonTemplateVisibility() == 1)) {
                return;
            }
        }
        MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
        mBAdChoice.setCampaign(this.f35672c);
        mBAdChoice.setFeedbackDialogEventListener(new a());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 6.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        this.f35673d.addView(mBAdChoice, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ImageView imageView;
        if (!this.f35671b || (imageView = this.f35676g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f35676g.setVisibility(0);
            this.f35676g.setOnClickListener(this.H);
        }
        if (this.f35676g.getParent() != null || this.f35673d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f35673d.addView(this.f35676g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f35674e != null) {
            MBBannerWebView mBBannerWebView = this.f35675f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f35674e.getVisibility() != 0) {
                this.f35674e.setVisibility(0);
            }
            this.f35693x = 2;
            if (this.f35673d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f35674e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f35674e.getParent() == null) {
                    this.f35673d.addView(this.f35674e, layoutParams);
                }
                a(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        MBBannerView mBBannerView;
        if (this.f35680k && !this.f35681l && this.f35670a != null) {
            this.f35681l = true;
            this.D.removeCallbacks(this.E);
            CampaignEx campaignEx = this.f35672c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f35672c.setCallbacked(true);
                this.f35670a.a(this.f35690u);
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f35672c.getMaitve(), this.f35672c.getMaitve_src());
            }
        }
        if (this.f35680k && this.f35678i && this.f35679j && this.f35681l && this.f35672c != null && !d()) {
            boolean zA = a();
            if (!zA && (mBBannerView = this.f35673d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f35682m && zA) {
                q0.b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f35673d.getLocationInWindow(iArr);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f35675f, iArr[0], iArr[1]);
                com.mbridge.msdk.mbbanner.common.communication.a.a(this.f35675f, iArr[0], iArr[1], this.f35673d.getWidth(), this.f35673d.getHeight());
                this.f35682m = false;
                this.f35693x = 1;
                if (!TextUtils.isEmpty(this.f35672c.getImageUrl())) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f35672c.getImageUrl());
                }
                l();
            }
            q0.b("BannerShowManager", "showSuccessed:" + this.f35672c.getId());
            CampaignEx campaignEx2 = this.f35672c;
            if (!zA) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f35674e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f35690u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f35690u.get(0);
                    boolean z10 = false;
                    int i10 = 0;
                    for (int i11 = 0; i11 < this.f35690u.size(); i11++) {
                        if (!this.f35690u.get(i11).isHasMBTplMark() && (i11 == 0 || !this.f35690u.get(i11).isReport())) {
                            a(this.f35690u.get(i11), com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
                            this.f35690u.get(i11).setReport(true);
                            com.mbridge.msdk.foundation.same.buffer.b.a(this.f35685p, this.f35690u.get(i11), "banner");
                            i10 = i11;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        b(this.f35690u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
                        c(this.f35690u.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f35672c;
                if (campaignEx3 != null) {
                    b(campaignEx3);
                    this.f35672c.setReport(true);
                    this.f35693x = 2;
                    com.mbridge.msdk.foundation.same.buffer.b.a(this.f35685p, this.f35672c, "banner");
                }
            }
            this.f35684o = true;
            if (campaignEx2 == null || this.f35670a == null || e1.a(this.f35673d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f35670a.a(this.f35672c);
            try {
                CampaignEx campaignEx4 = this.f35672c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    MBBannerWebView mBBannerWebView = this.f35675f;
                    AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(contextD, mBBannerWebView, mBBannerWebView.getUrl(), this.f35672c);
                    this.B = adSessionA;
                    if (adSessionA != null) {
                        try {
                            adSessionA.registerAdView(this.f35675f);
                            ImageView imageView2 = this.f35676g;
                            if (imageView2 != null) {
                                this.B.addFriendlyObstruction(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f35674e;
                            if (imageView3 != null) {
                                this.B.addFriendlyObstruction(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.B.start();
                        } catch (Exception e10) {
                            q0.a("OMSDK", e10.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f35672c;
                        if (campaignEx5 != null) {
                            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx5.getRequestId(), this.f35672c.getRequestIdNotice(), this.f35672c.getId(), this.f35685p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f35672c;
                if (campaignEx6 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx6.getRequestId(), this.f35672c.getRequestIdNotice(), this.f35672c.getId(), this.f35685p, "fetch OM failed, context null");
                }
            }
            this.D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35685p, this.f35672c.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f35677h == null) {
                    this.f35677h = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f35677h.getVisibility() != 0) {
                    this.f35677h.setVisibility(0);
                }
                v0.a(this.f35677h, bitmapDrawableA, this.f35673d.getResources().getDisplayMetrics());
                if (this.f35677h.getParent() == null) {
                    this.f35673d.addView(this.f35677h, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.B;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f35677h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    private boolean q() {
        String strA = a(this.f35672c);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        if (this.f35673d != null) {
            if (this.f35675f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                    this.f35675f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f35675f.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f35685p, this.f35690u, this.I));
                } catch (Throwable unused) {
                    a(com.mbridge.msdk.foundation.error.a.a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f35674e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f35675f.getVisibility() != 0) {
                this.f35675f.setVisibility(0);
            }
            if (this.f35675f.getParent() == null) {
                this.f35673d.addView(this.f35675f);
                a(this.f35672c.isMraid());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 296);
            if (TextUtils.isEmpty(this.f35672c.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, this.f35672c.getLocalRequestId());
            cVarA.a(CampaignEx.KEY_LOCAL_CHECK_STATE, eVar);
            b1.a(this.f35675f, cVarA.t(), this.f35672c.getLocalAllowTrackClick());
            if (this.f35672c.isMraid()) {
                m();
            }
            n();
            com.mbridge.msdk.mbbanner.common.communication.b bVar = new com.mbridge.msdk.mbbanner.common.communication.b(this.f35673d.getContext(), this.f35686q, this.f35685p);
            this.A = bVar;
            bVar.a(this.f35690u);
            this.A.a(this.I);
            this.A.a(this.f35694y);
            this.f35675f.setWebViewListener(this.J);
            this.f35675f.setObject(this.A);
            MintegralNetworkBridge.webviewLoadUrl(this.f35675f, strA);
            MBBannerWebView mBBannerWebView2 = this.f35675f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            a(com.mbridge.msdk.foundation.error.a.a(880046), 2);
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880046);
            bVar2.b(this.f35687r);
            a(bVar2);
        }
        return true;
    }

    public void h() {
        i();
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f35672c, this.f35685p);
        if (this.f35670a != null) {
            this.f35670a = null;
        }
        MBBannerWebView mBBannerWebView = this.f35675f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.J != null) {
            this.J = null;
        }
        ImageView imageView = this.f35676g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f35674e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f35673d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f35675f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.b bVar = this.A;
        if (bVar != null) {
            bVar.a();
        }
        if (this.I != null) {
            this.I = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35685p);
        com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p);
    }

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, com.mbridge.msdk.setting.l lVar) {
        this.f35671b = z10;
        this.f35673d = mBBannerView;
        this.f35685p = str2;
        this.f35686q = str;
        this.f35670a = new com.mbridge.msdk.mbbanner.common.listener.e(cVar, lVar);
    }

    public void c(boolean z10) {
        this.f35671b = z10;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void b(CampaignUnit campaignUnit) {
        CampaignEx campaignExA = a(campaignUnit);
        this.f35672c = campaignExA;
        if (campaignExA == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880043);
            bVar.b(this.f35687r);
            a(bVar);
            return;
        }
        if (!com.mbridge.msdk.foundation.tools.h.a(campaignExA, (Context) null, this.f35673d, campaignExA.getImpReportType())) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880044);
            bVar2.b(this.f35687r);
            a(bVar2);
            return;
        }
        this.D.removeCallbacks(this.E);
        f();
        this.f35680k = false;
        this.f35681l = false;
        this.f35684o = false;
        if (!TextUtils.isEmpty(this.f35672c.getBannerHtml()) || !TextUtils.isEmpty(this.f35672c.getBannerUrl())) {
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, this.f35672c);
        }
        this.D.postDelayed(this.E, 15000L);
        if (q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f35672c.getBannerHtml()) || !TextUtils.isEmpty(this.f35672c.getBannerUrl())) {
            a(com.mbridge.msdk.foundation.error.a.a(880048), 2);
        }
        g();
    }

    public void d(boolean z10) {
        this.f35679j = z10;
        p();
    }

    public void a(boolean z10, int i10) {
        this.f35694y = i10;
        if (i10 != 0) {
            this.f35671b = z10;
            return;
        }
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35685p);
        if (lVarE != null) {
            this.f35671b = lVarE.g() == 1;
        }
    }

    public int c() {
        return this.f35693x;
    }

    private CampaignEx a(CampaignUnit campaignUnit) {
        if (campaignUnit != null) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            this.f35690u = ads;
            if (ads != null && ads.size() > 0) {
                return this.f35690u.get(0);
            }
        }
        return null;
    }

    private String a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            String bannerUrl = campaignEx.getBannerUrl();
            if (!TextUtils.isEmpty(bannerUrl)) {
                return bannerUrl;
            }
            String bannerHtml = campaignEx.getBannerHtml();
            File file = new File(bannerHtml);
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                return bannerHtml;
            }
            return "file:////" + bannerHtml;
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        if (this.f35672c == null || d()) {
            return;
        }
        this.D.removeCallbacks(this.E);
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f35670a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        k();
        MBBannerWebView mBBannerWebView = this.f35675f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f35673d.removeView(this.f35675f);
        }
        ImageView imageView = this.f35674e;
        if (imageView != null && imageView.getParent() != null) {
            this.f35674e.setVisibility(8);
            this.f35673d.removeView(this.f35674e);
        }
        ImageView imageView2 = this.f35676g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f35673d.removeView(this.f35676g);
            this.f35676g.setVisibility(8);
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f35685p);
        ImageView imageView3 = this.f35677h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f35673d.removeView(this.f35677h);
            this.f35677h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f35685p, this.f35690u);
        j();
        com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f35670a;
        if (cVar != null) {
            cVar.b();
        }
        i();
    }

    private boolean a() {
        if (this.f35673d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f35672c;
        return (e1.a(this.f35673d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f35683n) ? false : true;
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f32916m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public void a(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        com.mbridge.msdk.mbbanner.common.communication.a.a((WebView) this.f35675f, i10, i11);
    }

    private void a(boolean z10) {
        if (this.f35673d != null) {
            View viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f35685p);
            if (com.mbridge.msdk.foundation.feedback.b.b().a() && z10 && viewA != null) {
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
                viewA.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f34850e, com.mbridge.msdk.foundation.feedback.b.f34849d);
                }
                layoutParams.addRule(12);
                viewA.setLayoutParams(layoutParams);
                this.f35673d.addView(viewA);
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f35685p, new C0341d());
            this.f35672c.setCampaignUnitId(this.f35685p);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f35685p, this.f35672c);
        }
    }

    public void b(boolean z10) {
        this.f35678i = z10;
        p();
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f35685p);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f32917n);
            } catch (Throwable th2) {
                q0.b("BannerShowManager", th2.getMessage());
            }
        }
    }

    public void a(String str) {
        this.f35687r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        try {
            CampaignEx campaignEx = this.f35672c;
            if (campaignEx != null) {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35685p, campaignEx.getLocalRequestId());
                cVarA.g(this.f35693x);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", Integer.valueOf(i10));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                eVar.a("reason", str);
                cVarA.d(TextUtils.isEmpty(this.f35672c.getBannerUrl()) ? 2 : 1);
                com.mbridge.msdk.mbbanner.common.report.a.a("2000068", cVarA, eVar);
            }
        } catch (Throwable th2) {
            q0.b("BannerShowManager", th2.getMessage());
        }
    }
}
