package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.web.a1;
import com.fyber.inneractive.sdk.web.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class IAConfigManager {
    public static long P;
    public final y0 A;
    public com.fyber.inneractive.sdk.network.v0 B;
    public com.fyber.inneractive.sdk.network.v0 C;
    public g D;
    public final com.fyber.inneractive.sdk.ignite.h E;
    public final com.fyber.inneractive.sdk.topics.b F;
    public final com.fyber.inneractive.sdk.dv.handler.a G;
    public final com.fyber.inneractive.sdk.cache.k H;
    public final com.fyber.inneractive.sdk.network.f I;
    public final HashMap J;
    public com.fyber.inneractive.sdk.measurement.e K;
    public WebView L;
    public final com.fyber.inneractive.sdk.config.global.r M;
    public com.fyber.inneractive.sdk.config.cellular.a N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f15006a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f15007b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f15011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f15012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f15014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InneractiveUserConfig f15015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InneractiveMediationName f15018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f15020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f15021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f15023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.l0 f15024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f15025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s f15026u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f15027v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f15028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x0 f15029x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s1 f15030y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.a f15031z;
    public static final IAConfigManager O = new IAConfigManager();
    public static final g0 Q = new g0();

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc);
    }

    public final void a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.f15012g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean z10 = O.f15010e != null;
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z10, !z10 ? exc : null);
            }
        }
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f15012g.add(onConfigurationReadyAndValidListener);
    }

    public static void b() {
        s sVar;
        com.fyber.inneractive.sdk.topics.b bVar;
        IAConfigManager iAConfigManager = O;
        iAConfigManager.getClass();
        if (iAConfigManager.F.f18499i.get() || (sVar = iAConfigManager.f15026u) == null || sVar.f15195b == null) {
            return;
        }
        if (iAConfigManager.f15023r.compareAndSet(false, true)) {
            int iA = iAConfigManager.f15026u.f15195b.a("topics_enabled", 0, 0);
            int iA2 = iAConfigManager.f15026u.f15195b.a("e_topics_enabled", 0, 0);
            if (iA == 0 && iA2 == 0) {
                IAlog.a("Topics API feature disabled - topics_enabled & e_topics_enabled flags are 0", new Object[0]);
                return;
            }
            boolean z10 = iA != 0;
            boolean z11 = iA2 != 0;
            try {
                if (!f() || (bVar = iAConfigManager.F) == null) {
                    return;
                }
                bVar.a(z10, z11);
                iAConfigManager.F.c();
            } catch (Throwable th2) {
                IAlog.a("error while trying to init topics ", th2, new Object[0]);
            }
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(1000000) >= 11 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static boolean d() {
        g gVar = O.D;
        return gVar != null && gVar.e();
    }

    public static boolean e() {
        IAConfigManager iAConfigManager = O;
        boolean z10 = iAConfigManager.f15010e != null;
        int i10 = k.f15121a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z10 && System.currentTimeMillis() - P > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                s sVar = iAConfigManager.f15026u;
                sVar.f15197d = false;
                com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.util.l(sVar.f15198e));
            }
            a();
            b1 b1Var = b1.f18642c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new a1(b1Var));
        }
        return z10;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(1000000) >= 4 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static void g() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f18599a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f15012g.remove(onConfigurationReadyAndValidListener);
    }

    public IAConfigManager() {
        com.fyber.inneractive.sdk.dv.handler.a eVar;
        new HashSet();
        this.f15013h = false;
        this.f15014i = new k0();
        this.f15016k = false;
        this.f15022q = false;
        this.f15023r = new AtomicBoolean(false);
        this.f15024s = new com.fyber.inneractive.sdk.network.l0();
        this.f15025t = "";
        this.f15029x = new x0();
        this.A = new y0();
        this.E = new com.fyber.inneractive.sdk.ignite.h();
        this.F = new com.fyber.inneractive.sdk.topics.b();
        String[] strArr = {"com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback"};
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
                eVar = new com.fyber.inneractive.sdk.dv.handler.f();
            }
        }
        eVar = new com.fyber.inneractive.sdk.dv.handler.e();
        this.G = eVar;
        this.H = new com.fyber.inneractive.sdk.cache.k();
        this.I = new com.fyber.inneractive.sdk.network.f();
        this.J = new HashMap();
        this.M = com.fyber.inneractive.sdk.config.global.r.a();
        this.f15012g = new CopyOnWriteArrayList();
    }

    public static void a() {
        IAConfigManager iAConfigManager = O;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.B;
        if (v0Var != null) {
            iAConfigManager.f15024s.a(v0Var);
        }
        s sVar = iAConfigManager.f15026u;
        if (sVar.f15197d) {
            return;
        }
        iAConfigManager.f15024s.a(new com.fyber.inneractive.sdk.network.v0(new p(sVar), sVar.f15194a, sVar.f15198e));
    }
}
