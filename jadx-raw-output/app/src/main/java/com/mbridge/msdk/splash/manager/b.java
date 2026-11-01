package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSplashShowManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f37000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MBSplashView f37001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.splash.middle.d f37002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.click.a f37003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f37005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f37006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MBridgeIds f37009k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f37015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f37017s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f37019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f37020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f37021w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36999a = "SplashShowManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37010l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f37011m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f37012n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f37013o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37014p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37018t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f37022x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f37023y = new HandlerC0381b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37024z = true;
    public j A = new e();

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f37004f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class HandlerC0381b extends Handler {
        public HandlerC0381b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            MBSplashView mBSplashView;
            MBSplashWebview splashWebview;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                if (!b.this.f37016r) {
                    b.this.i();
                }
                b bVar = b.this;
                if (bVar.f37010l <= 0) {
                    bVar.b(2);
                    return;
                }
                if (com.mbridge.msdk.foundation.feedback.b.f34851f) {
                    b.this.f();
                } else {
                    b bVar2 = b.this;
                    if (bVar2.f37015q) {
                        b.this.f();
                    } else {
                        int i11 = bVar2.f37010l - 1;
                        bVar2.f37010l = i11;
                        bVar2.d(i11);
                        b bVar3 = b.this;
                        if (!bVar3.f37018t) {
                            bVar3.g();
                        }
                    }
                }
                b.this.f37023y.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (i10 != 2 || b.this.f37000b == null || !b.this.f37000b.isActiveOm() || (mBSplashView = b.this.f37001c) == null || (splashWebview = mBSplashView.getSplashWebview()) == null) {
                return;
            }
            try {
                b.this.f37021w = splashWebview.getAdSession();
                if (b.this.f37021w != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(b.this.f37021w);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                }
                q0.a("OMSDK", "adSession.impressionOccurred()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                if (b.this.f37000b != null) {
                    String requestId = b.this.f37000b.getRequestId();
                    String requestIdNotice = b.this.f37000b.getRequestIdNotice();
                    String id2 = b.this.f37000b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, b.this.f37007i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class d implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f37001c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f37001c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b("SplashShowManager", th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f37001c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f37001c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f37001c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f37001c);
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37030a;

        public f(int i10) {
            this.f37030a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f37030a);
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37033b;

        public g(Context context, CampaignEx campaignEx) {
            this.f37032a = context;
            this.f37033b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f37032a)).b(this.f37033b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class h implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }
    }

    /* JADX INFO: compiled from: BaseSplashShowManager.java */
    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f37010l = i10;
            bVar.f37023y.removeMessages(1);
            b.this.f37023y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f37001c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f37023y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f37002d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f37002d.a(bVar.f37009k);
                    } else {
                        CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f37000b));
                        campaignWithBackData.setClickTempSource(2);
                        campaignWithBackData.setClickType(2);
                        campaignWithBackData.setTriggerClickSource(2);
                        campaignWithBackData.setClickURL(str);
                        b.this.b(campaignWithBackData, true, str);
                    }
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f37023y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f37010l = i11;
                bVar.f37023y.removeMessages(1);
                b.this.f37023y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        if (this.f37000b == null) {
            return;
        }
        this.f37016r = true;
        if (this.f37002d != null && (mBSplashView = this.f37001c) != null) {
            if (mBSplashView.getContext() != null && (this.f37001c.getContext() instanceof Activity) && ((Activity) this.f37001c.getContext()).isFinishing()) {
                q0.a("SplashShowManager", "Activity is finishing");
            }
            if (this.f37001c.isShown()) {
                this.f37002d.b(this.f37009k);
            } else {
                this.f37002d.a(this.f37009k, "SplashView or container is not visibility");
            }
        }
        if (!this.f37000b.isReport()) {
            MBSplashView mBSplashView2 = this.f37001c;
            if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                a(this.f37000b);
            } else {
                b(this.f37000b);
            }
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37000b, this.f37007i);
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f37018t = true;
        if (this.f37001c != null && this.f37010l > 0 && (handler = this.f37023y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f37001c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f37001c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f37000b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f37023y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f34851f || (mBSplashView = this.f37001c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f37001c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING, strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING, strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING, strI);
            this.f37012n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f37014p = string;
            this.f37011m = string;
            this.f37013o = contextD.getResources().getString(identifier3);
            this.f37005g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f37005g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strI)));
        }
    }

    private void j() {
        String str;
        if (this.f37004f) {
            str = this.f37012n + this.f37010l + this.f37013o;
        } else {
            str = this.f37010l + this.f37014p;
        }
        this.f37005g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f37001c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f37001c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f37000b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f37000b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f37024z) {
            this.f37024z = false;
            this.f37001c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f37000b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f37000b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f37001c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f37000b);
                this.f37021w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f37021w.registerAdView(splashWebview);
                    this.f37021w.start();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th2) {
                q0.a("OMSDK", th2.getMessage());
                CampaignEx campaignEx2 = this.f37000b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = this.f37000b.getRequestIdNotice();
                    String id2 = this.f37000b.getId();
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(requestId, requestIdNotice, id2, this.f37007i, "fetch OM failed, exception" + th2.getMessage());
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f37007i);
        this.f37023y.removeMessages(1);
        this.f37023y.sendEmptyMessageDelayed(1, 1000L);
        this.f37023y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f37000b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37000b.getMaitve(), this.f37000b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f37007i, this.f37000b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f37019u == null) {
                    this.f37019u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f37019u.getVisibility() != 0) {
                    this.f37019u.setVisibility(0);
                }
                v0.a(this.f37019u, bitmapDrawableA, this.f37001c.getResources().getDisplayMetrics());
                if (this.f37019u.getParent() == null) {
                    this.f37001c.addView(this.f37019u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f37021w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f37019u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(int i10) {
        this.f37010l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f37000b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f37000b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f37018t = false;
        if (this.f37001c != null && this.f37010l > 0 && (handler = this.f37023y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f37001c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f37001c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public void h() {
        if (this.f37002d != null) {
            this.f37002d = null;
        }
        if (this.f37020v != null) {
            this.f37020v = null;
        }
        if (this.f37022x != null) {
            this.f37022x = null;
        }
        MBSplashView mBSplashView = this.f37001c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f37007i);
    }

    public b(Context context, String str, String str2) {
        this.f37007i = str2;
        this.f37008j = str;
        this.f37009k = new MBridgeIds(str, str2);
        this.f37017s = context;
        if (this.f37005g == null) {
            TextView textView = new TextView(context);
            this.f37005g = textView;
            textView.setGravity(1);
            this.f37005g.setTextIsSelectable(false);
            this.f37005g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37005g.getLayoutParams();
            this.f37005g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    private void b(CampaignEx campaignEx) {
        boolean z10 = true;
        if (campaignEx.isHasMBTplMark()) {
            z10 = false;
        } else {
            a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
            campaignEx.setReport(true);
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f37007i, campaignEx, "splash");
        }
        if (z10) {
            b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
            c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f37000b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f37001c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f37001c.getSplashSignalCommunicationImpl() != null) {
                this.f37001c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f37010l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f37002d;
        if (dVar != null) {
            dVar.a(this.f37009k, i10 * 1000);
        }
        if (this.f37006h == null) {
            j();
        }
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f37002d = dVar;
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f37022x);
        }
        this.f37006h = viewGroup;
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
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f37004f);
        this.f37000b = campaignEx;
        this.f37001c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        if (splashSignalCommunicationImpl == null) {
            splashSignalCommunicationImpl = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f37008j, this.f37007i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            splashSignalCommunicationImpl.a(arrayList);
        }
        splashSignalCommunicationImpl.b(this.f37010l);
        splashSignalCommunicationImpl.a(this.f37004f ? 1 : 0);
        if (this.f37020v == null) {
            this.f37020v = new i(this, null);
        }
        splashSignalCommunicationImpl.a(this.f37020v);
        mBSplashView.setSplashSignalCommunicationImpl(splashSignalCommunicationImpl);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f37006h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f37005g.setVisibility(8);
            }
            j();
            a(this.f37005g);
            mBSplashView.setCloseView(this.f37005g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f37006h);
            mBSplashView.setCloseView(this.f37006h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f37000b.getLocalRequestId(), this.f37000b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f37024z = true;
        k();
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f37001c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f37023y != null && (campaignEx = this.f37000b) != null && campaignEx.isActiveOm()) {
            this.f37023y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
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
                q0.b("SplashShowManager", th2.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f37000b;
        if (campaignEx == null) {
            return;
        }
        if (!(campaignEx.getPrivacyButtonTemplateVisibility() == 1) || (mBSplashView = this.f37001c) == null || mBSplashView.getSplashWebview() == null || this.f37001c.isDynamicView() || !this.f37000b.isMraid() || (context = this.f37001c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", "drawable");
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f37000b, context, true, new h());
            this.f37001c.addView(imageView);
        } catch (Throwable th2) {
            q0.b("SplashShowManager", th2.getMessage());
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f37000b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f37007i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f37007i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f37007i, this.f37000b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f37001c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f37007i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f37007i);
                if (feedBackButtonA != null) {
                    RelativeLayout.LayoutParams layoutParams = null;
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f34850e, com.mbridge.msdk.foundation.feedback.b.f34849d);
                    }
                    layoutParams.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    layoutParams.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f37001c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f37007i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f37002d;
        if (dVar != null) {
            dVar.a(this.f37009k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f37001c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f37001c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f37001c.getParent()).removeView(this.f37001c);
    }

    public void a(boolean z10) {
        this.f37004f = z10;
        if (z10) {
            this.f37011m = this.f37012n;
        } else {
            this.f37011m = this.f37014p;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f37003e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37007i);
            this.f37003e = aVar;
            aVar.a(this.A);
        }
        campaignEx.setCampaignUnitId(this.f37007i);
        this.f37003e.a(campaignEx);
        if (!this.f37000b.isReportClick()) {
            this.f37000b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f37002d;
        if (dVar != null) {
            dVar.a(this.f37009k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f37007i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f37022x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f37002d;
            if (dVar != null) {
                dVar.a(this.f37009k, i10);
                this.f37002d = null;
                com.mbridge.msdk.splash.report.a.a(this.f37007i, this.f37000b);
            }
            ImageView imageView = this.f37019u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f37001c) != null) {
                mBSplashView.removeView(this.f37019u);
                this.f37019u.setVisibility(8);
            }
            this.f37016r = false;
            com.mbridge.msdk.splash.report.a.a(this.f37007i, i10, this.f37000b);
            Handler handler = this.f37023y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f32916m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
