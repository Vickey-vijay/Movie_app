package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: MonitorNetworkRequestLink.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f33495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f33503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f33504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f33505m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f33506n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f33507o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f33508p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f33509q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f33510r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f33511s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f33512t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f33513u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f33514v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f33515w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f33516x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f33517y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f33518z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f33493a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f33493a) {
            return;
        }
        l();
    }

    public void d() {
    }

    public void f() {
    }

    public void g() {
    }

    public void c() {
        if (this.f33493a) {
            return;
        }
        this.f33499g = (System.nanoTime() - this.f33509q) / 1000000;
    }

    public void e() {
        if (this.f33493a) {
            return;
        }
        this.f33509q = System.nanoTime();
    }

    public void h() {
        if (this.f33493a) {
            return;
        }
        this.f33498f = (System.nanoTime() - this.f33507o) / 1000000;
    }

    public void i() {
        if (this.f33493a) {
            return;
        }
        this.f33507o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f33493a));
        map2.put("retryCount", Integer.valueOf(this.f33494b));
        map2.put("requestBodySize", Long.valueOf(this.f33495c));
        map2.put("responseBodySize", Long.valueOf(this.f33496d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f33497e));
        map3.put("dnsTime", Long.valueOf(this.f33498f));
        map3.put("connectionTime", Long.valueOf(this.f33499g));
        map3.put("requestTime", Long.valueOf(this.f33500h));
        map3.put("serverTime", Long.valueOf(this.f33501i));
        map3.put("responseTime", Long.valueOf(this.f33502j));
        map3.put("queueTime", Long.valueOf(this.f33503k));
        map3.put("parsingTime", Long.valueOf(this.f33504l));
        map.put("timingInfo", map3);
        map.put(C3426d4.j.f28595h0, this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f33493a) {
            return;
        }
        this.f33497e = (System.nanoTime() - this.f33505m) / 1000000;
    }

    public void l() {
        if (this.f33493a) {
            return;
        }
        this.f33503k = (System.nanoTime() - this.f33505m) / 1000000;
    }

    public void m() {
        if (this.f33493a) {
            return;
        }
        this.f33505m = System.nanoTime();
    }

    public void n() {
        if (this.f33493a) {
            return;
        }
        this.f33515w = System.nanoTime();
    }

    public void o() {
        if (this.f33493a) {
            return;
        }
        this.f33514v = System.nanoTime();
    }

    public void p() {
        if (this.f33493a) {
            return;
        }
        this.f33513u = System.nanoTime();
    }

    public void q() {
        if (this.f33493a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f33493a) {
            return;
        }
        this.f33518z = System.nanoTime();
    }

    public void s() {
        if (this.f33493a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f33517y = jNanoTime;
        this.f33501i = (jNanoTime - this.f33516x) / 1000000;
    }

    public void t() {
        if (this.f33493a) {
            return;
        }
        this.f33511s = System.nanoTime();
    }

    public void u() {
        if (this.f33493a) {
            return;
        }
        this.f33510r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f33493a) {
            return;
        }
        this.f33502j = (System.nanoTime() - this.f33517y) / 1000000;
        this.f33496d = j10;
    }

    public void a(boolean z10) {
        this.f33493a = z10;
        if (z10) {
            this.f33494b++;
        }
    }

    public void a(long j10) {
        if (this.f33493a) {
            return;
        }
        this.f33500h = (System.nanoTime() - this.f33513u) / 1000000;
        this.f33495c = j10;
    }

    public void a() {
        if (this.f33493a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f33493a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iV = m0.v();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iV));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }
}
