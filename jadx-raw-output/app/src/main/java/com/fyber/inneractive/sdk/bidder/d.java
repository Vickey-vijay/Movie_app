package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public int D;
    public InneractiveUserConfig.Gender E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final boolean K;
    public Boolean L;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f14892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f14903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f14906o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f14909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f14910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f14911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f14912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f14914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f14915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f14916y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14917z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f14892a = cVar;
        if (TextUtils.isEmpty(this.f14893b)) {
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f14894c = sb2.toString();
        this.f14895d = com.fyber.inneractive.sdk.util.o.f18599a.getPackageName();
        this.f14896e = com.fyber.inneractive.sdk.util.k.j();
        this.f14897f = com.fyber.inneractive.sdk.util.k.l();
        this.f14904m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f14905n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f18484a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f14906o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f14909r = ((com.fyber.inneractive.sdk.util.s.a() ^ true) || IAConfigManager.O.f15022q) ? d0.SECURE : d0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f15019n)) {
            this.H = iAConfigManager.f15017l;
        } else {
            this.H = iAConfigManager.f15017l + "_" + iAConfigManager.f15019n;
        }
        this.K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f14911t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f14914w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f14915x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f14916y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f14892a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        this.f14898g = iAConfigManager.f15020o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f14892a.getClass();
            this.f14899h = com.fyber.inneractive.sdk.util.k.i();
            this.f14900i = this.f14892a.a();
            String str = this.f14892a.f18489b;
            this.f14901j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f14892a.f18489b;
            this.f14902k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f14892a.getClass();
            z0 z0VarA = z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            this.f14908q = z0VarA.b();
            int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f15211a.f15219b;
                property = vVar != null ? vVar.f15215a : null;
            }
            this.A = property;
            this.G = iAConfigManager.f15015j.getZipCode();
        }
        this.E = iAConfigManager.f15015j.getGender();
        this.D = iAConfigManager.f15015j.getAge();
        this.f14903l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f14892a.getClass();
        ArrayList arrayList = iAConfigManager.f15021p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f14907p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f14913v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f14917z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.f15016k;
        this.f14910s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f15019n)) {
            this.H = iAConfigManager.f15017l;
        } else {
            this.H = iAConfigManager.f15017l + "_" + iAConfigManager.f15019n;
        }
        this.f14912u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.E.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f15795p;
        this.I = lVar != null ? lVar.f61679a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f15795p;
        this.J = lVar2 != null ? lVar2.f61679a.d() : null;
        this.f14892a.getClass();
        this.f14904m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f14892a.getClass();
        this.f14905n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
        com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
        if (bVar != null && IAConfigManager.f()) {
            this.N = bVar.f18496f;
            this.M = bVar.f18495e;
        }
    }
}
