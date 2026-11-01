package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class S9 implements InterfaceC3508he, InterfaceC3795y4, InterfaceC3778x4, InterfaceC3744v4, InterfaceC3761w4, Y9, Nc {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f27576m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static S9 f27577n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4 f27581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3633oc f27582e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3480g4 f27584g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27583f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeaturesManager f27585h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Q8.a f27586i = Lb.O().j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private P.a f27587j = Lb.O().E();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P f27588k = Lb.U().G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC3680r8 f27589l = Lb.U().t();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f27592c;

        public a(String str, String str2, Y4 y10) {
            this.f27590a = str;
            this.f27591b = str2;
            this.f27592c = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27590a, this.f27591b, this.f27592c, (InterfaceC3795y4) s10);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f27594a;

        public b(JSONObject jSONObject) {
            this.f27594a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27594a, (InterfaceC3795y4) s10);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f27598c;

        public c(String str, String str2, Y4 y10) {
            this.f27596a = str;
            this.f27597b = str2;
            this.f27598c = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27596a, this.f27597b, this.f27598c, (InterfaceC3778x4) s10);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27600a;

        public d(String str) {
            this.f27600a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27600a, s10);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f27602a;

        public e(JSONObject jSONObject) {
            this.f27602a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27602a, (InterfaceC3778x4) s10);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9 f27604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f27605b;

        public f(O9 o10, Map map) {
            this.f27604a = o10;
            this.f27605b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3714t8.e eVar = this.f27604a.i() ? C3714t8.e.Banner : C3714t8.e.Interstitial;
            Y4 y4A = S9.this.f27581d.a(eVar, this.f27604a);
            C3748v8 c3748v8 = new C3748v8();
            c3748v8.a(G5.f26613x, Boolean.valueOf(this.f27604a.j())).a(G5.G, Boolean.valueOf(this.f27604a.m())).a(G5.f26611v, this.f27604a.g()).a("producttype", Z9.a(this.f27604a)).a(G5.I, Long.valueOf(M.f27023a.b(this.f27604a.e())));
            A8.a(C3472fe.f28916h, c3748v8.a());
            if (eVar == C3714t8.e.Banner) {
                S9 s10 = S9.this;
                s10.f27578a.a(s10.f27579b, s10.f27580c, y4A, (InterfaceC3761w4) s10);
                S9 s11 = S9.this;
                s11.f27578a.a(y4A, this.f27605b, (InterfaceC3761w4) s11);
                return;
            }
            S9 s12 = S9.this;
            s12.f27578a.a(s12.f27579b, s12.f27580c, y4A, (InterfaceC3778x4) s12);
            S9 s13 = S9.this;
            s13.f27578a.b(y4A, this.f27605b, s13);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f27607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f27608b;

        public g(Y4 y10, Map map) {
            this.f27607a = y10;
            this.f27608b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s10 = S9.this;
            s10.f27578a.a(this.f27607a, this.f27608b, (InterfaceC3778x4) s10);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9 f27610a;

        public h(O9 o10) {
            this.f27610a = o10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3714t8.e eVar = this.f27610a.i() ? C3714t8.e.Banner : C3714t8.e.Interstitial;
            Y4 y4A = S9.this.f27581d.a(eVar, this.f27610a);
            C3748v8 c3748v8 = new C3748v8();
            c3748v8.a(G5.f26613x, Boolean.valueOf(this.f27610a.j())).a(G5.f26611v, this.f27610a.g()).a("producttype", Z9.a(this.f27610a)).a("isMultipleAdObjects", Boolean.valueOf(this.f27610a.l()));
            A8.a(C3472fe.f28921m, c3748v8.a());
            if (eVar == C3714t8.e.Banner) {
                S9.this.f27578a.a(y4A);
            } else {
                y4A.a(false);
                S9.this.f27578a.b(y4A);
            }
        }
    }

    private S9(Context context, int i10) {
        c(context);
    }

    public static Y9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized S9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C3486ga.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C3721tf(SDKUtils.getNetworkConfiguration().optJSONObject(C3426d4.a.f28418k)));
            C3486ga.e().d(SDKUtils.getSDKVersion());
            this.f27581d = new Z4();
            C3480g4 c3480g4 = new C3480g4();
            this.f27584g = c3480g4;
            if (context instanceof Activity) {
                c3480g4.a((Activity) context);
            }
            int debugMode = this.f27585h.getDebugMode();
            this.f27582e = new C3633oc();
            this.f27578a = new com.ironsource.sdk.controller.e(context, this.f27584g, this.f27581d, V7.f27797a, debugMode, this.f27585h.getDataManagerConfig(), this.f27579b, this.f27580c, this.f27582e);
            Logger.enableLogging(debugMode);
            Logger.i(f27576m, "C'tor");
            a(context);
            this.f27582e.d();
            this.f27582e.e();
            this.f27582e.a(context);
            this.f27582e.b();
            this.f27582e.a();
            this.f27582e.b(context);
            this.f27582e.c();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3778x4
    public void d(String str, String str2) {
        Y4 y4D = d(C3714t8.e.Interstitial, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f27587j.a(EnumC3603n0.SHOW_FAIL, o9C.e());
            if (c(o9C)) {
                this.f27586i.a(new C3419cf(this.f27588k.a(o9C.e())));
            }
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialShowFailed(str2);
            }
        }
    }

    public static synchronized Y9 a(String str, String str2, Context context) {
        if (f27577n == null) {
            A8.a(C3472fe.f28909a);
            f27577n = new S9(str, str2, context);
        }
        return f27577n;
    }

    private Kc b(Y4 y10) {
        if (y10 == null) {
            return null;
        }
        return (Kc) y10.i();
    }

    @Override // com.ironsource.InterfaceC3778x4
    public void onInterstitialAdRewarded(String str, int i10) {
        Y4 y4D = d(C3714t8.e.Interstitial, str);
        Kc kcB = b(y4D);
        if (y4D == null || kcB == null) {
            return;
        }
        kcB.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.InterfaceC3508he, com.ironsource.Y9
    public void onPause(Activity activity) {
        if (this.f27583f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.InterfaceC3508he, com.ironsource.Y9
    public void onResume(Activity activity) {
        if (this.f27583f) {
            return;
        }
        c(activity);
    }

    @Override // com.ironsource.InterfaceC3508he
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f27578a.a(new d(strOptString));
    }

    public static synchronized S9 a(Context context, int i10) throws Exception {
        Logger.i(f27576m, "getInstance()");
        if (f27577n == null) {
            f27577n = new S9(context, i10);
        }
        return f27577n;
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void b(C3714t8.e eVar, String str) {
        Kc kcB;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3714t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.d();
                    return;
                }
                return;
            }
            if (eVar != C3714t8.e.Interstitial || (kcB = b(y4D)) == null) {
                return;
            }
            kcB.onInterstitialClose();
        }
    }

    public S9(String str, String str2, Context context) {
        this.f27579b = str;
        this.f27580c = str2;
        c(context);
    }

    @Override // com.ironsource.Y9
    public com.ironsource.sdk.controller.e a() {
        return this.f27578a;
    }

    private Ic a(Y4 y10) {
        if (y10 == null) {
            return null;
        }
        return (Ic) y10.i();
    }

    private Y4 d(C3714t8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f27581d.a(eVar, str);
    }

    @Override // com.ironsource.InterfaceC3508he
    public void a(String str, String str2, String str3, Map<String, String> map, Pc pc2) {
        this.f27579b = str;
        this.f27580c = str2;
        this.f27578a.a(new a(str, str2, this.f27581d.a(C3714t8.e.RewardedVideo, str3, map, pc2)));
    }

    @Override // com.ironsource.InterfaceC3795y4
    public void b(String str, String str2) {
        Pc pcC;
        Y4 y4D = d(C3714t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.a(str2);
    }

    @Override // com.ironsource.InterfaceC3508he
    public void a(JSONObject jSONObject) {
        this.f27578a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3778x4
    public void b(String str) {
        Y4 y4D = d(C3714t8.e.Interstitial, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f27587j.a(EnumC3603n0.SHOW_SUCCESS, o9C.e());
            if (c(o9C)) {
                this.f27586i.a(new C3437df(this.f27588k.a(o9C.e())));
            }
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3508he
    public void a(String str, String str2, String str3, Map<String, String> map, Kc kc2) {
        this.f27579b = str;
        this.f27580c = str2;
        this.f27578a.a(new c(str, str2, this.f27581d.a(C3714t8.e.Interstitial, str3, map, kc2)));
    }

    @Override // com.ironsource.InterfaceC3508he
    public boolean a(String str) {
        return this.f27578a.a(str);
    }

    @Override // com.ironsource.InterfaceC3508he, com.ironsource.Y9
    public void a(Activity activity) {
        try {
            Logger.i(f27576m, "release()");
            C3409c5.g();
            this.f27584g.b();
            this.f27578a.a((Context) activity);
            this.f27578a.a();
            this.f27578a = null;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
        f27577n = null;
    }

    @Override // com.ironsource.InterfaceC3378aa
    public void b(Activity activity, O9 o10, Map<String, String> map) {
        if (Lb.U().g().c()) {
            this.f27584g.a(activity);
        }
        a(o10, map);
    }

    private Pc c(Y4 y10) {
        if (y10 == null) {
            return null;
        }
        return (Pc) y10.i();
    }

    @Override // com.ironsource.InterfaceC3508he
    public void c(JSONObject jSONObject) {
        this.f27578a.a(new e(jSONObject));
    }

    private void b(O9 o10, Map<String, String> map) {
        Logger.d(f27576m, "loadOnNewInstance " + o10.e());
        this.f27578a.a(new f(o10, map));
    }

    @Override // com.ironsource.InterfaceC3795y4
    public void c(String str) {
        Pc pcC;
        Y4 y4D = d(C3714t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.c();
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void a(C3714t8.e eVar, String str, Z0 z10) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            y4D.b(2);
            if (eVar == C3714t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.a(z10);
                    return;
                }
                return;
            }
            if (eVar == C3714t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C3714t8.e.Banner || (icA = a(y4D)) == null) {
                return;
            }
            icA.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.InterfaceC3378aa
    public void b(O9 o10) {
        Logger.d(f27576m, "destroyInstance " + o10.e());
        if (c(o10)) {
            this.f27587j.a(EnumC3603n0.DESTROYED, o10.e());
            this.f27586i.a(new Ze(this.f27588k.a(o10.e())));
        }
        this.f27578a.a(new h(o10));
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void c(C3714t8.e eVar, String str) {
        Pc pcC;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3714t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C3714t8.e.RewardedVideo || (pcC = c(y4D)) == null) {
                return;
            }
            pcC.b();
        }
    }

    @Override // com.ironsource.Nc
    public void b(Activity activity) {
        try {
            this.f27578a.e();
            this.f27578a.a((Context) activity);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3761w4
    public void c(String str, String str2) {
        Ic icA;
        Y4 y4D = d(C3714t8.e.Banner, str);
        if (y4D == null || (icA = a(y4D)) == null) {
            return;
        }
        icA.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void a(C3714t8.e eVar, String str, String str2) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        C3748v8 c3748v8A = new C3748v8().a(G5.f26611v, str).a("producttype", eVar).a(G5.A, str2);
        if (y4D != null) {
            M m10 = M.f27023a;
            c3748v8A.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            c3748v8A.a(G5.f26613x, Boolean.valueOf(B8.a(y4D)));
            m10.a(y4D.h());
            y4D.b(3);
            if (eVar == C3714t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.b(str2);
                }
            } else if (eVar == C3714t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C3714t8.e.Banner && (icA = a(y4D)) != null) {
                icA.onBannerLoadFail(str2);
            }
        }
        A8.a(C3472fe.f28917i, c3748v8A.a());
    }

    private void c(O9 o10, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            C3748v8 c3748v8A = new C3748v8().a(G5.A, e10.getMessage()).a(G5.f26613x, Boolean.valueOf(o10.j())).a(G5.G, Boolean.valueOf(o10.m())).a(G5.f26611v, o10.g()).a("producttype", Z9.a(o10)).a(G5.I, Long.valueOf(M.f27023a.b(o10.e())));
            M.f27023a.a(o10.e());
            A8.a(C3472fe.f28919k, c3748v8A.a());
            IronLog.INTERNAL.error(e10.toString());
            Logger.d(f27576m, "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        b(o10, map);
    }

    @Override // com.ironsource.Nc
    public void c(Activity activity) {
        this.f27584g.a(activity);
        this.f27578a.g();
        this.f27578a.b(activity);
    }

    @Override // com.ironsource.InterfaceC3795y4
    public void a(String str, int i10) {
        Pc pcC;
        Y4 y4D = d(C3714t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.a(i10);
    }

    public boolean c(O9 o10) {
        return o10.l() && !o10.i() && a(o10);
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void a(C3714t8.e eVar, String str) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3714t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.a();
                    return;
                }
                return;
            }
            if (eVar == C3714t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C3714t8.e.Banner || (icA = a(y4D)) == null) {
                return;
            }
            icA.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC3744v4
    public void a(C3714t8.e eVar, String str, String str2, JSONObject jSONObject) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f27576m, "Received Event Notification: " + str2 + " for demand source: " + y4D.f());
            if (eVar == C3714t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    jSONObject.put("demandSourceName", str);
                    kcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == C3714t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    jSONObject.put("demandSourceName", str);
                    pcC.a(str2, jSONObject);
                }
            } else if (eVar == C3714t8.e.Banner && (icA = a(y4D)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    icA.onBannerShowSuccess();
                }
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3778x4
    public void a(String str, JSONObject jSONObject) {
        C3714t8.e eVar = C3714t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C3748v8 c3748v8A = new C3748v8().a(G5.f26611v, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f27587j.a(jSONObject, EnumC3603n0.LOAD_SUCCESS, o9C.e());
            if (c(o9C)) {
                this.f27586i.a(new C3401bf(this.f27588k.a(o9C.e())));
            }
            C3748v8 c3748v8A2 = c3748v8A.a("producttype", B8.a(y4D, eVar)).a(G5.f26613x, Boolean.valueOf(B8.a(y4D)));
            M m10 = M.f27023a;
            c3748v8A2.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            m10.a(y4D.h());
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialLoadSuccess(y4D.c());
            }
        }
        A8.a(C3472fe.f28920l, c3748v8A.a());
    }

    @Override // com.ironsource.InterfaceC3778x4
    public void a(String str, String str2) {
        Object obj;
        C3714t8.e eVar = C3714t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C3748v8 c3748v8 = new C3748v8();
        c3748v8.a(G5.A, str2).a(G5.f26611v, str);
        if (y4D != null) {
            C3748v8 c3748v8A = c3748v8.a("producttype", B8.a(y4D, eVar));
            if (y4D.e() == 2) {
                obj = G5.E;
            } else {
                obj = G5.F;
            }
            C3748v8 c3748v8A2 = c3748v8A.a(G5.f26614y, obj).a(G5.f26613x, Boolean.valueOf(B8.a(y4D)));
            M m10 = M.f27023a;
            c3748v8A2.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            m10.a(y4D.h());
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialLoadFailed(str2);
            }
        }
        A8.a(C3472fe.f28915g, c3748v8.a());
    }

    @Override // com.ironsource.InterfaceC3508he
    public void a(String str, String str2, int i10) {
        C3714t8.e productType;
        Y4 y4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (y4A = this.f27581d.a(productType, str2)) == null) {
            return;
        }
        y4A.c(i10);
    }

    @Override // com.ironsource.InterfaceC3761w4
    public void a(String str, C3555k8 c3555k8) {
        Ic icA;
        Y4 y4D = d(C3714t8.e.Banner, str);
        if (y4D == null || (icA = a(y4D)) == null) {
            return;
        }
        icA.onBannerLoadSuccess(y4D.c(), c3555k8);
    }

    @Override // com.ironsource.InterfaceC3378aa
    public void a(O9 o10, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C3426d4.i.f28577y0, String.valueOf(jCurrentTimeMillis));
        M.f27023a.a(o10.e(), jCurrentTimeMillis);
        C3748v8 c3748v8 = new C3748v8();
        c3748v8.a(G5.f26613x, Boolean.valueOf(o10.j())).a(G5.G, Boolean.valueOf(o10.m())).a(G5.f26611v, o10.g()).a("producttype", Z9.a(o10)).a(G5.I, Long.valueOf(jCurrentTimeMillis));
        A8.a(C3472fe.f28914f, c3748v8.a());
        Logger.d(f27576m, "loadAd " + o10.e());
        O o11 = new O(o10);
        this.f27587j.a(o11);
        this.f27587j.a(new JSONObject(map), EnumC3603n0.LOAD_REQUEST, o11.c());
        if (c(o10)) {
            this.f27586i.a(new C3383af(o11));
        }
        if (o10.k()) {
            c(o10, map);
        } else {
            b(o10, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.InterfaceC3378aa
    public void a(Activity activity, O9 o10, Map<String, String> map) {
        this.f27584g.a(activity);
        Logger.i(f27576m, "showAd " + o10.e());
        Y4 y4A = this.f27581d.a(C3714t8.e.Interstitial, o10.e());
        if (y4A == null) {
            return;
        }
        this.f27578a.a(new g(y4A, map));
    }

    @Override // com.ironsource.InterfaceC3378aa
    public boolean a(O9 o10) {
        Logger.d(f27576m, "isAdAvailable " + o10.e());
        Y4 y4A = this.f27581d.a(C3714t8.e.Interstitial, o10.e());
        if (y4A == null) {
            return false;
        }
        return y4A.d();
    }

    public void a(Context context) {
        this.f27583f = false;
        Boolean boolC = this.f27589l.c(C3426d4.a.f28414g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f27583f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C3511i(this));
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                C3748v8 c3748v8 = new C3748v8();
                c3748v8.a(G5.f26614y, th2.getMessage());
                A8.a(C3472fe.f28929u, c3748v8.a());
            }
        }
    }
}
