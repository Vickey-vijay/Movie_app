package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.c6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f1;
import com.applovin.impl.f7;
import com.applovin.impl.h8;
import com.applovin.impl.i5;
import com.applovin.impl.j1;
import com.applovin.impl.j4;
import com.applovin.impl.k2;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.m7;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k {
    public static k C0;
    public static Context D0;
    private static boolean E0;
    private static final boolean G0;
    private static volatile com.applovin.impl.c H0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f9299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f9307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9309h;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f9312i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f9313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f9315k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private List f9316k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9317l;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f9326p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f9327q;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f9336u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f9338v0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f9344y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f9346z0;
    private static final Object I0 = new Object();
    private static final long F0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f9311i = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference f9319m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f9321n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f9323o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f9325p = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o f9329r = new o(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f9331s = new com.applovin.impl.f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z2 f9333t = new z2(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r1 f9335u = new r1(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l7 f9337v = new l7(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f9339w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference f9341x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicReference f9343y = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicReference f9345z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final AtomicReference f9296a0 = new AtomicReference();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final AtomicReference f9298b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final AtomicReference f9300c0 = new AtomicReference();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final AtomicReference f9302d0 = new AtomicReference();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final AtomicReference f9304e0 = new AtomicReference();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final AtomicReference f9306f0 = new AtomicReference();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final AtomicReference f9308g0 = new AtomicReference();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final AtomicReference f9310h0 = new AtomicReference();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final AtomicReference f9314j0 = new AtomicReference();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Object f9318l0 = new Object();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f9320m0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f9322n0 = new AtomicBoolean();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f9324o0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f9328q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f9330r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f9332s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f9334t0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Object f9340w0 = new Object();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private SdkConfigurationImpl f9342x0 = new SdkConfigurationImpl(this);
    private final i5 A0 = new r6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.p0
        @Override // java.lang.Runnable
        public final void run() {
            this.f9540b.K0();
        }
    });
    private final i5 B0 = new r6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.q0
        @Override // java.lang.Runnable
        public final void run() {
            this.f9543b.L0();
        }
    });

    public class a implements t5.b {
        public a() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(r3.f8934e8)).booleanValue()) {
                k kVar = k.this;
                kVar.f9312i0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            com.applovin.impl.r0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.D().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(l.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(k.D0).getAll().size());
            k.this.v0().d(d2.f7203f, CollectionUtils.map("details", jSONObject2.toString()));
            k kVar2 = k.this;
            kVar2.f9316k0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f9342x0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.s0().a(jSONObject);
            k.this.b(jSONObject);
            t2.b(((Boolean) k.this.a(x4.f10068w6)).booleanValue());
            t2.a(((Boolean) k.this.a(x4.f10076x6)).booleanValue());
            k.this.P0();
            if (!((Boolean) k.this.a(x4.f9904d3)).booleanValue() || zIsValid || !com.applovin.impl.r0.a(k.o())) {
                k.this.N0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.S0();
        }
    }

    public class b implements com.applovin.impl.u0.c {
        public b() {
        }

        @Override // com.applovin.impl.u0.c
        public void a(com.applovin.impl.u0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f9324o0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.R0();
            k.this.Q0();
        }
    }

    public class c implements t5.b {
        public c() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.f9311i.set(false);
            k.this.N0();
        }
    }

    public class d implements y3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y3 f9350a;

        @Override // com.applovin.impl.y3.a
        public void b() {
        }

        public d(y3 y3Var) {
            this.f9350a = y3Var;
        }

        @Override // com.applovin.impl.y3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f9318l0) {
                if (!k.this.f9326p0) {
                    k.this.R0();
                }
            }
            this.f9350a.b(this);
        }
    }

    public static long n() {
        return F0;
    }

    public static Context o() {
        return D0;
    }

    public void M0() {
        b(false);
    }

    public void W0() {
        a((Map) null);
    }

    public e i() {
        Object eVar = this.E.get();
        if (eVar == null) {
            synchronized (this.E) {
                eVar = this.E.get();
                if (eVar == null) {
                    eVar = new e(this);
                    this.E.set(eVar);
                }
            }
        }
        if (eVar == this.E) {
            eVar = null;
        }
        return (e) eVar;
    }

    public com.applovin.impl.j j() {
        Object jVar = this.f9296a0.get();
        if (jVar == null) {
            synchronized (this.f9296a0) {
                jVar = this.f9296a0.get();
                if (jVar == null) {
                    jVar = new com.applovin.impl.j(this);
                    this.f9296a0.set(jVar);
                }
            }
        }
        if (jVar == this.f9296a0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f9319m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f9319m) {
                appLovinAdServiceImpl = this.f9319m.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.f9319m.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.f9319m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.J.get();
        if (gVar == null) {
            synchronized (this.J) {
                gVar = this.J.get();
                if (gVar == null) {
                    gVar = new g(this);
                    this.J.set(gVar);
                }
            }
        }
        if (gVar == this.J) {
            gVar = null;
        }
        return (g) gVar;
    }

    public h m() {
        Object hVar = this.V.get();
        if (hVar == null) {
            synchronized (this.V) {
                hVar = this.V.get();
                if (hVar == null) {
                    hVar = new h(this);
                    this.V.set(hVar);
                }
            }
        }
        if (hVar == this.V) {
            hVar = null;
        }
        return (h) hVar;
    }

    public i p() {
        Object iVar = this.O.get();
        if (iVar == null) {
            synchronized (this.O) {
                iVar = this.O.get();
                if (iVar == null) {
                    iVar = new i(this);
                    this.O.set(iVar);
                }
            }
        }
        if (iVar == this.O) {
            iVar = null;
        }
        return (i) iVar;
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    n7.c();
                }
            });
            G0 = true;
        } catch (Throwable unused) {
            G0 = false;
        }
    }

    private void A0() {
        Context context = D0;
        o oVarO = O();
        a5 a5VarP0 = p0();
        com.applovin.impl.u0 u0VarX = x();
        a(context);
        m0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f9295a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f9295a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f9297b) && this.f9297b.length() != 36) {
            String str2 = "Axon event key length " + this.f9297b + " is invalid - expected 36";
            if (n7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (u0VarX.l()) {
            String str3 = "Terms Flow has been replaced. " + u0VarX.g();
            if (n7.c(this)) {
                throw new IllegalStateException(str3);
            }
            o.h("AppLovinSdk", str3);
        }
        if (n7.j()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!n7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (n7.m(context)) {
            this.f9313j.setVerboseLogging(true);
        }
        o0().a(x4.f9963k, Boolean.valueOf(this.f9313j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z4 z4Var = z4.f10238c;
        if (TextUtils.isEmpty((String) a5VarP0.a(z4Var, (Object) null, defaultSharedPreferences))) {
            this.f9330r0 = true;
            a5VarP0.b(z4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            a5VarP0.b(z4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        z4 z4Var2 = z4.f10239d;
        if (((Boolean) a5VarP0.a(z4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f9332s0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            a5VarP0.b(z4Var2, Boolean.TRUE);
            a5VarP0.b(z4.f10255t, Boolean.valueOf(u0VarX.j()));
        }
        z4 z4Var3 = z4.f10240e;
        this.f9305f = ((Long) a5VarP0.a(z4Var3, 0L)).longValue() + 1;
        p0().b(z4Var3, Long.valueOf(this.f9305f));
        z4 z4Var4 = z4.f10241f;
        this.f9307g = (Long) a5VarP0.a(z4Var4, null);
        p0().b(z4Var4, Long.valueOf(F0));
        z4 z4Var5 = z4.f10242g;
        String str4 = (String) a5VarP0.a(z4Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > n7.g(str4)) {
                a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
            }
        } else {
            a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
        }
        v0().d(d2.f7201e, CollectionUtils.map("details", "isInitProviderContextSet=" + E0));
    }

    public static boolean F0() {
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        synchronized (this.f9318l0) {
            boolean zA = com.applovin.impl.r0.a(o());
            if (!G0()) {
                O();
                if (o.a()) {
                    O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                }
            }
            if (!((Boolean) a(x4.f9913e3)).booleanValue() || zA) {
                R0();
            }
            if (((Boolean) a(x4.f9904d3)).booleanValue() && !zA) {
                O();
                if (o.a()) {
                    O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                S0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        Long l10 = (Long) a(x4.f9985m3);
        if (l10.longValue() >= 0 && this.f9311i.compareAndSet(false, true)) {
            h8.a(l10.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9352b.J0();
                }
            });
        }
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(x4.f9950i4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    private void d() {
        d6 d6VarQ0 = q0();
        int i10 = this.f9334t0 + 1;
        this.f9334t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new a()), d6.b.CORE);
    }

    public l A() {
        Object lVar = this.A.get();
        if (lVar == null) {
            synchronized (this.A) {
                lVar = this.A.get();
                if (lVar == null) {
                    lVar = new l(this);
                    this.A.set(lVar);
                }
            }
        }
        if (lVar == this.A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public j1 B() {
        Object j1Var = this.D.get();
        if (j1Var == null) {
            synchronized (this.D) {
                j1Var = this.D.get();
                if (j1Var == null) {
                    j1Var = new j1(this);
                    this.D.set(j1Var);
                }
            }
        }
        if (j1Var == this.D) {
            j1Var = null;
        }
        return (j1) j1Var;
    }

    public boolean B0() {
        boolean z10;
        synchronized (this.f9318l0) {
            z10 = this.f9328q0;
        }
        return z10;
    }

    public String C() {
        return this.f9336u0;
    }

    public boolean C0() {
        return this.f9330r0;
    }

    public r1 D() {
        return this.f9335u;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f9340w0) {
            z10 = this.f9338v0 != null;
        }
        return z10;
    }

    public boolean E0() {
        boolean z10;
        synchronized (this.f9318l0) {
            z10 = this.f9326p0;
        }
        return z10;
    }

    public EventServiceImpl F() {
        Object eventServiceImpl = this.f9323o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f9323o) {
                eventServiceImpl = this.f9323o.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.f9323o.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.f9323o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public m G() {
        Object mVar = this.G.get();
        if (mVar == null) {
            synchronized (this.G) {
                mVar = this.G.get();
                if (mVar == null) {
                    mVar = new m(this);
                    this.G.set(mVar);
                }
            }
        }
        if (mVar == this.G) {
            mVar = null;
        }
        return (m) mVar;
    }

    public n H() {
        Object nVar = this.I.get();
        if (nVar == null) {
            synchronized (this.I) {
                nVar = this.I.get();
                if (nVar == null) {
                    nVar = new n(this);
                    this.I.set(nVar);
                }
            }
        }
        if (nVar == this.I) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean H0() {
        return n7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(x4.f10082y4)).booleanValue() || (weakReference = this.f9299c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.f9338v0;
    }

    public long K() {
        return this.f9301d;
    }

    public Long L() {
        return this.f9307g;
    }

    public long M() {
        return this.f9305f;
    }

    public o2 N() {
        Object o2Var = this.X.get();
        if (o2Var == null) {
            synchronized (this.X) {
                o2Var = this.X.get();
                if (o2Var == null) {
                    o2Var = new o2(this);
                    this.X.set(o2Var);
                }
            }
        }
        if (o2Var == this.X) {
            o2Var = null;
        }
        return (o2) o2Var;
    }

    public o O() {
        return this.f9329r;
    }

    public void O0() {
        if (StringUtils.isValidString(this.f9317l)) {
            return;
        }
        this.f9317l = "max";
    }

    public z2 P() {
        return this.f9333t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f9310h0.get();
        if (dVar == null) {
            synchronized (this.f9310h0) {
                dVar = this.f9310h0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.f9310h0.set(dVar);
                }
            }
        }
        if (dVar == this.f9310h0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public com.applovin.impl.mediation.e R() {
        return this.f9312i0;
    }

    public void R0() {
        synchronized (this.f9318l0) {
            this.f9326p0 = true;
            q0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f9300c0.get();
        if (fVar == null) {
            synchronized (this.f9300c0) {
                fVar = this.f9300c0.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.f9300c0.set(fVar);
                }
            }
        }
        if (fVar == this.f9300c0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f9298b0.get();
        if (gVar == null) {
            synchronized (this.f9298b0) {
                gVar = this.f9298b0.get();
                if (gVar == null) {
                    gVar = new com.applovin.impl.mediation.g(this);
                    this.f9298b0.set(gVar);
                }
            }
        }
        if (gVar == this.f9298b0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.f9320m0.compareAndSet(true, false)) {
            R0();
        } else {
            this.f9320m0.set(true);
        }
    }

    public p3 U() {
        Object p3Var = this.f9306f0.get();
        if (p3Var == null) {
            synchronized (this.f9306f0) {
                p3Var = this.f9306f0.get();
                if (p3Var == null) {
                    p3Var = new p3(this);
                    this.f9306f0.set(p3Var);
                }
            }
        }
        if (p3Var == this.f9306f0) {
            p3Var = null;
        }
        return (p3) p3Var;
    }

    public void U0() {
        if (StringUtils.isValidString(this.f9336u0)) {
            return;
        }
        this.f9336u0 = "max";
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String V() {
        return this.f9317l;
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f9302d0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f9302d0) {
                mediationServiceImpl = this.f9302d0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.f9302d0.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.f9302d0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        if ("admob".equalsIgnoreCase(this.f9317l) && ((Boolean) a(x4.M3)).booleanValue()) {
            String str = (String) a(x4.L3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(".");
            if (str.startsWith(sb2.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            o.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9289b.b(str3);
                }
            });
        }
    }

    public u3 Y() {
        Object u3Var = this.f9345z.get();
        if (u3Var == null) {
            synchronized (this.f9345z) {
                u3Var = this.f9345z.get();
                if (u3Var == null) {
                    u3Var = new u3(this);
                    this.f9345z.set(u3Var);
                }
            }
        }
        if (u3Var == this.f9345z) {
            u3Var = null;
        }
        return (u3) u3Var;
    }

    public v3 Z() {
        Object v3Var = this.f9304e0.get();
        if (v3Var == null) {
            synchronized (this.f9304e0) {
                v3Var = this.f9304e0.get();
                if (v3Var == null) {
                    v3Var = new v3();
                    this.f9304e0.set(v3Var);
                }
            }
        }
        if (v3Var == this.f9304e0) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public p a0() {
        Object pVar = this.f9308g0.get();
        if (pVar == null) {
            synchronized (this.f9308g0) {
                pVar = this.f9308g0.get();
                if (pVar == null) {
                    pVar = new p(this);
                    this.f9308g0.set(pVar);
                }
            }
        }
        if (pVar == this.f9308g0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f9321n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f9321n) {
                appLovinNativeAdService = this.f9321n.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.f9321n.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.f9321n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public y3 c0() {
        Object y3Var = this.L.get();
        if (y3Var == null) {
            synchronized (this.L) {
                y3Var = this.L.get();
                if (y3Var == null) {
                    y3Var = new y3(o());
                    this.L.set(y3Var);
                }
            }
        }
        if (y3Var == this.L) {
            y3Var = null;
        }
        return (y3) y3Var;
    }

    public c4 d0() {
        Object c4Var = this.W.get();
        if (c4Var == null) {
            synchronized (this.W) {
                c4Var = this.W.get();
                if (c4Var == null) {
                    c4Var = new c4(this);
                    this.W.set(c4Var);
                }
            }
        }
        if (c4Var == this.W) {
            c4Var = null;
        }
        return (c4) c4Var;
    }

    public com.applovin.impl.c e() {
        return a(D0);
    }

    public j4 e0() {
        Object j4Var = this.S.get();
        if (j4Var == null) {
            synchronized (this.S) {
                j4Var = this.S.get();
                if (j4Var == null) {
                    j4Var = new j4(this);
                    this.S.set(j4Var);
                }
            }
        }
        if (j4Var == this.S) {
            j4Var = null;
        }
        return (j4) j4Var;
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                aVar = this.F.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.F.set(aVar);
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.Z.get();
        if (bVar == null) {
            synchronized (this.Z) {
                bVar = this.Z.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.Z.set(bVar);
                }
            }
        }
        if (bVar == this.Z) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public com.applovin.impl.f g() {
        return this.f9331s;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.Y.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Y) {
                postbackServiceImpl = this.Y.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.Y.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.Y) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.U.get();
        if (dVar == null) {
            synchronized (this.U) {
                dVar = this.U.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.sdk.d(this);
                    this.U.set(dVar);
                }
            }
        }
        if (dVar == this.U) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public String i0() {
        return this.f9295a;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.f9315k;
    }

    public w4 l0() {
        Object w4Var = this.N.get();
        if (w4Var == null) {
            synchronized (this.N) {
                w4Var = this.N.get();
                if (w4Var == null) {
                    w4Var = new w4(this);
                    this.N.set(w4Var);
                }
            }
        }
        if (w4Var == this.N) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public SessionTracker m0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                sessionTracker = this.H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.H.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings n0() {
        return this.f9313j;
    }

    public y4 o0() {
        Object y4Var = this.f9341x.get();
        if (y4Var == null) {
            synchronized (this.f9341x) {
                y4Var = this.f9341x.get();
                if (y4Var == null) {
                    y4Var = new y4(this);
                    this.f9341x.set(y4Var);
                }
            }
        }
        if (y4Var == this.f9341x) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public a5 p0() {
        Object a5Var = this.B.get();
        if (a5Var == null) {
            synchronized (this.B) {
                a5Var = this.B.get();
                if (a5Var == null) {
                    a5Var = new a5(this);
                    this.B.set(a5Var);
                }
            }
        }
        if (a5Var == this.B) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String q() {
        return this.f9297b;
    }

    public d6 q0() {
        Object d6Var = this.f9339w.get();
        if (d6Var == null) {
            synchronized (this.f9339w) {
                d6Var = this.f9339w.get();
                if (d6Var == null) {
                    d6Var = new d6(this);
                    this.f9339w.set(d6Var);
                }
            }
        }
        if (d6Var == this.f9339w) {
            d6Var = null;
        }
        return (d6) d6Var;
    }

    public z6 r0() {
        Object z6Var = this.Q.get();
        if (z6Var == null) {
            synchronized (this.Q) {
                z6Var = this.Q.get();
                if (z6Var == null) {
                    z6Var = new z6(this);
                    this.Q.set(z6Var);
                }
            }
        }
        if (z6Var == this.Q) {
            z6Var = null;
        }
        return (z6) z6Var;
    }

    public CmpServiceImpl s() {
        Object cmpServiceImpl = this.f9325p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f9325p) {
                cmpServiceImpl = this.f9325p.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.f9325p.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.f9325p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public f7 s0() {
        Object f7Var = this.f9314j0.get();
        if (f7Var == null) {
            synchronized (this.f9314j0) {
                f7Var = this.f9314j0.get();
                if (f7Var == null) {
                    f7Var = new f7(this);
                    this.f9314j0.set(f7Var);
                }
            }
        }
        if (f7Var == this.f9314j0) {
            f7Var = null;
        }
        return (f7) f7Var;
    }

    public j t() {
        Object jVar = this.M.get();
        if (jVar == null) {
            synchronized (this.M) {
                jVar = this.M.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.M.set(jVar);
                }
            }
        }
        if (jVar == this.M) {
            jVar = null;
        }
        return (j) jVar;
    }

    public long t0() {
        if (this.f9309h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f9309h;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f9295a + "', enabled=" + this.f9328q0 + ", isFirstSession=" + this.f9330r0 + '}';
    }

    public SdkConfigurationImpl v() {
        return this.f9342x0;
    }

    public l7 v0() {
        return this.f9337v;
    }

    public com.applovin.impl.q0 w() {
        Object q0Var = this.f9343y.get();
        if (q0Var == null) {
            synchronized (this.f9343y) {
                q0Var = this.f9343y.get();
                if (q0Var == null) {
                    q0Var = new com.applovin.impl.q0(this);
                    this.f9343y.set(q0Var);
                }
            }
        }
        if (q0Var == this.f9343y) {
            q0Var = null;
        }
        return (com.applovin.impl.q0) q0Var;
    }

    public m7 w0() {
        Object m7Var = this.C.get();
        if (m7Var == null) {
            synchronized (this.C) {
                m7Var = this.C.get();
                if (m7Var == null) {
                    m7Var = new m7(this);
                    this.C.set(m7Var);
                }
            }
        }
        if (m7Var == this.C) {
            m7Var = null;
        }
        return (m7) m7Var;
    }

    public com.applovin.impl.u0 x() {
        Object u0Var = this.P.get();
        if (u0Var == null) {
            synchronized (this.P) {
                u0Var = this.P.get();
                if (u0Var == null) {
                    u0Var = new com.applovin.impl.u0(this);
                    this.P.set(u0Var);
                }
            }
        }
        if (u0Var == this.P) {
            u0Var = null;
        }
        return (com.applovin.impl.u0) u0Var;
    }

    public l8 x0() {
        Object l8Var = this.K.get();
        if (l8Var == null) {
            synchronized (this.K) {
                l8Var = this.K.get();
                if (l8Var == null) {
                    l8Var = new l8(this);
                    this.K.set(l8Var);
                }
            }
        }
        if (l8Var == this.K) {
            l8Var = null;
        }
        return (l8) l8Var;
    }

    public com.applovin.impl.e1 y() {
        Object e1Var = this.R.get();
        if (e1Var == null) {
            synchronized (this.R) {
                e1Var = this.R.get();
                if (e1Var == null) {
                    e1Var = new com.applovin.impl.e1(this);
                    this.R.set(e1Var);
                }
            }
        }
        if (e1Var == this.R) {
            e1Var = null;
        }
        return (com.applovin.impl.e1) e1Var;
    }

    public AppLovinSdk y0() {
        return this.f9327q;
    }

    public f1 z() {
        Object f1Var = this.T.get();
        if (f1Var == null) {
            synchronized (this.T) {
                f1Var = this.T.get();
                if (f1Var == null) {
                    f1Var = new f1(this);
                    this.T.set(f1Var);
                }
            }
        }
        if (f1Var == this.T) {
            f1Var = null;
        }
        return (f1) f1Var;
    }

    public boolean z0() {
        return this.f9332s0;
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f9326p0 = false;
        C0 = this;
        this.f9313j = appLovinSdkSettings;
        this.f9301d = System.currentTimeMillis();
        this.f9326p0 = true;
        if (F0()) {
            D0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.f9299c = new WeakReference((Activity) context);
                return;
            }
            return;
        }
        throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        if (q0().f()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        d6 d6VarQ0 = q0();
        int i10 = this.f9334t0 + 1;
        this.f9334t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new c()), d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (G0()) {
            k2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f9322n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(u0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        y3 y3VarC0 = c0();
        y3VarC0.a(new d(y3VarC0));
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        D0 = context.getApplicationContext();
        E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f9309h = System.currentTimeMillis();
            com.applovin.impl.r0.c(jSONObject, this);
            com.applovin.impl.r0.b(jSONObject, this);
            com.applovin.impl.r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    public String E() {
        return w0().d();
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), "max");
    }

    public void Q0() {
        t().a();
    }

    public void V0() {
        y().n();
    }

    public String h0() {
        return w0().a();
    }

    public Map k0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplJ0 = j0();
        if (maxSegmentCollectionImplJ0 == null) {
            return null;
        }
        return maxSegmentCollectionImplJ0.getJsonData();
    }

    public String r() {
        return w0().b();
    }

    public String u() {
        return w0().c();
    }

    public Activity u0() {
        Activity activityB = a(o()).b();
        if (activityB != null) {
            return activityB;
        }
        return I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.f9313j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            o0().a(x4.L3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(x4.f10029s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        d6 d6VarQ0 = q0();
        i5 i5Var = this.A0;
        d6.b bVar = d6.b.CORE;
        d6VarQ0.a(i5Var, bVar);
        q0().a(this.B0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f9327q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        q0().a(new c6(this));
    }

    public static String a(int i10, List list) {
        String string = o().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    public void c() {
        synchronized (this.f9318l0) {
            if (!this.f9326p0 && !this.f9328q0) {
                R0();
            }
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (H0 == null) {
            synchronized (I0) {
                if (H0 == null) {
                    H0 = new com.applovin.impl.c(context);
                }
            }
        }
        return H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!n7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", "admob");
            map.put("error_message", str);
            D().a(d2.S0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(x4 x4Var) {
        return o0().c(x4Var);
    }

    public void c(z4 z4Var) {
        p0().b(z4Var);
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f9340w0) {
            if (this.f9338v0 != null) {
                o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f9338v0 + ". Ignoring the provided initialization configuration.");
                if (!B0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9372b.a(sdkInitializationListener);
                    }
                });
                return;
            }
            this.f9303e = System.currentTimeMillis();
            this.f9338v0 = appLovinSdkInitializationConfiguration;
            this.f9344y0 = sdkInitializationListener;
            this.f9295a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.f9297b = appLovinSdkInitializationConfiguration.getAxonEventKey();
            this.f9317l = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.f9315k = appLovinSdkInitializationConfiguration.getSegmentCollection();
            n7.a(new Runnable() { // from class: com.applovin.impl.sdk.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9381b.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    public void b(boolean z10) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.f9344y0) == null) {
            return;
        }
        if (B0()) {
            this.f9344y0 = null;
            this.f9346z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f9346z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(x4.f10005p)).booleanValue()) {
                this.f9344y0 = null;
            } else {
                this.f9346z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f9324o0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9303e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f9337v.d(d2.f7211j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9293b.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(x4.f10013q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f9342x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f9342x0);
    }

    public void a(boolean z10) {
        synchronized (this.f9318l0) {
            this.f9326p0 = false;
            this.f9328q0 = z10;
        }
        if (z10) {
            List listA = w3.a(this);
            if (listA.isEmpty()) {
                q0().g();
                M0();
                return;
            }
            Long l10 = (Long) a(r3.f8946o7);
            r6 r6Var = new r6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9531b.I0();
                }
            });
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l10 + "ms...");
            }
            q0().a(r6Var, d6.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public List b(x4 x4Var) {
        return o0().b(x4Var);
    }

    public void b(z4 z4Var, Object obj) {
        p0().b(z4Var, obj);
    }

    public Object b(z4 z4Var) {
        return p0().a(z4Var);
    }

    public String b() {
        if (StringUtils.isValidString(this.f9336u0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapW = W();
        List listC = c(x4.f9968k4);
        Boolean bool = (Boolean) a(x4.f9977l4);
        if (mapW.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) a(x4.f9959j4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        for (Map.Entry entry : mapW.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                this.f9336u0 = (String) entry.getValue();
                                O();
                                if (o.a()) {
                                    O().a("AppLovinSdk", "Detected mediation provider: " + this.f9336u0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                        break;
                    }
                } while (!className.startsWith((String) it.next()));
            }
        } catch (Throwable th2) {
            D().a("AppLovinSdk", "detectMediationProvider", th2);
        }
        this.f9336u0 = "unknown";
        O();
        if (o.a()) {
            O().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, arrayList);
        if (!((Boolean) a(x4.f9986m4)).booleanValue()) {
            return strJoin;
        }
        D().a(d2.f7199d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    public void a(k3 k3Var) {
        if (q0().f()) {
            return;
        }
        List listA = w3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().g();
        M0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f9316k0;
        return (list == null || list.size() <= 0 || this.f9316k0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) p0().a(z4.f10242g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < n7.g(str)) {
                o.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(x4 x4Var) {
        return o0().a(x4Var);
    }

    public boolean a(x4 x4Var, MaxAdFormat maxAdFormat) {
        return b(x4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public Object a(z4 z4Var) {
        return a(z4Var, (Object) null);
    }

    public Object a(z4 z4Var, Object obj) {
        return p0().a(z4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }
}
