package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes8.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f38300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f38302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f38303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f38305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f38306g;

    /* JADX INFO: compiled from: Network.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* JADX INFO: compiled from: Network.java */
    public static final class b implements com.mbridge.msdk.tracker.network.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f38308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f38309b;

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f38308a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f38101a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f38308a.a(this.f38309b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }

        public b(r rVar, t tVar) {
            this.f38308a = rVar;
            this.f38309b = tVar;
        }
    }

    /* JADX INFO: compiled from: Network.java */
    public static final class c implements com.mbridge.msdk.tracker.network.v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f38310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f38311b;

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f38310a)) {
                try {
                    this.f38310a.a(this.f38311b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f38101a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }

        public c(r rVar, t tVar) {
            this.f38310a = rVar;
            this.f38311b = tVar;
        }
    }

    public void a(r rVar) {
        this.f38300a = rVar;
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f38304e == 1 ? new v<>(this.f38302c.c(), 1, this.f38302c.a()) : new v<>(this.f38302c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f38303d);
        vVar.a(z10 ? com.mbridge.msdk.tracker.network.t.a.HIGH : com.mbridge.msdk.tracker.network.t.a.NORMAL);
        vVar.a((com.mbridge.msdk.tracker.network.v.b<Object>) new c(this.f38300a, tVar));
        vVar.a((com.mbridge.msdk.tracker.network.v.a) new b(this.f38300a, tVar));
        return vVar;
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f38301b = i10;
        this.f38302c = pVar;
        this.f38303d = wVar;
        this.f38304e = i11;
        this.f38306g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f38300a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f38101a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f38305f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f38101a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f38300a)) {
                this.f38300a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private void a() {
        if (y.a(this.f38305f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f38302c.b()), new com.mbridge.msdk.tracker.network.f(this.f38306g), this.f38301b, null);
        this.f38305f = uVarA;
        uVarA.b();
    }
}
