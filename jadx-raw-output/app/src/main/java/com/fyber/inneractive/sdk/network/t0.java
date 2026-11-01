package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f16085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f16086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f16087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f16088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f16089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile i1 f16090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f16098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16099o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f16085a = false;
        this.f16090f = i1.INITIAL;
        this.f16093i = 0L;
        this.f16094j = 0L;
        this.f16095k = 0;
        this.f16096l = false;
        this.f16097m = false;
        this.f16098n = new Object();
        this.f16099o = false;
        this.f16086b = f0Var;
        this.f16087c = hVar;
        this.f16091g = UUID.randomUUID().toString();
        this.f16092h = rVar;
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f16088d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f16089e = this.f16087c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f16088d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f16089e;
        } catch (b e10) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e10.getMessage());
            throw e10;
        } catch (q1 e11) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e12.getMessage());
            throw e12;
        }
    }

    public abstract o0 a(l lVar, Map map, int i10);

    public void a(o0 o0Var, String str, String str2) {
    }

    public void c() {
        this.f16085a = true;
    }

    public void d() {
        boolean z10;
        synchronized (this.f16098n) {
            z10 = this.f16096l;
        }
        if (z10) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public String n() {
        return "application/json; charset=utf-8";
    }

    public abstract g1 o();

    public abstract String r();

    public abstract boolean u();

    public void b(long j10) {
        synchronized (this.f16098n) {
            if (this.f16097m) {
                this.f16095k = (int) ((j10 - this.f16093i) + ((long) this.f16095k));
                this.f16097m = false;
            }
        }
    }

    public void c(long j10) {
        synchronized (this.f16098n) {
            if (!this.f16096l) {
                this.f16096l = true;
                this.f16094j = j10;
            }
        }
    }

    public void e() {
        try {
            l lVar = this.f16089e;
            if (lVar != null) {
                lVar.a();
            }
            this.f16087c.getClass();
        } catch (Exception unused) {
        }
    }

    public int j() {
        return this.f16095k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f16092h;
    }

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        return new l1(iAConfigManager.f15026u.f15195b.a("connect_timeout", 5000, 1), iAConfigManager.f15026u.f15195b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i10;
        synchronized (this.f16098n) {
            i10 = this.f16095k;
        }
        return i10;
    }

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16092h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f16098n) {
            z10 = this.f16097m;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public final boolean v() {
        boolean z10;
        if (this.f16099o) {
            com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class);
            Boolean boolC = kVar.c("should_add_request_watchdog");
            if (boolC != null ? boolC.booleanValue() : false) {
                z10 = true;
            } else {
                Boolean boolC2 = kVar.c("should_report_request_watchdog");
                if (boolC2 != null ? boolC2.booleanValue() : false) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void d(long j10) {
        synchronized (this.f16098n) {
            if (!this.f16097m) {
                this.f16097m = true;
                this.f16093i = j10;
            }
        }
    }

    public t0(t0 t0Var) {
        this.f16085a = false;
        this.f16090f = i1.INITIAL;
        this.f16093i = 0L;
        this.f16094j = 0L;
        this.f16095k = 0;
        this.f16096l = false;
        this.f16097m = false;
        this.f16098n = new Object();
        this.f16099o = false;
        this.f16086b = t0Var.f16086b;
        this.f16087c = t0Var.f16087c;
        this.f16091g = UUID.randomUUID().toString();
        this.f16092h = t0Var.f16092h;
        this.f16095k = t0Var.f16095k;
        this.f16093i = t0Var.f16093i;
        this.f16094j = t0Var.f16094j;
    }

    public final void a(Object obj, Exception exc, boolean z10) {
        p0 p0Var;
        if (!z10) {
            i1 i1Var = i1.RESOLVED;
            this.f16090f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f16088d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new s0(this, obj, exc, z10));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i10, o oVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.j jVar2) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i10);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f15324a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f15325a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (fVar.f15325a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), bVarB);
            if (jVar != null) {
                bVarB.f18423c = jVar;
            }
            bVarB.f18421a = bVarB.a();
            if (oVar != null) {
                bVarB.f18423c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.K = j();
            if (jVar2 != null) {
                eVarA.f18452u = jVar2;
            }
            p0 p0Var = this.f16088d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e10.getMessage());
            throw new n0(e10);
        }
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j10) {
        synchronized (this.f16098n) {
            if (this.f16096l) {
                this.f16095k = (int) ((j10 - this.f16094j) + ((long) this.f16095k));
                this.f16096l = false;
            }
        }
    }
}
