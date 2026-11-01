package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class a82 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f75433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo f75434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f75435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bq2 f75436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f75437f = false;

    private void a() throws InterruptedException {
        po2 po2Var = (po2) this.f75433b.take();
        SystemClock.elapsedRealtime();
        po2Var.a(3);
        try {
            try {
                try {
                    po2Var.a("network-queue-take");
                    if (po2Var.i()) {
                        po2Var.c("network-discard-cancelled");
                        po2Var.j();
                    } else {
                        TrafficStats.setThreadStatsTag(po2Var.f81491e);
                        e82 e82VarA = this.f75434c.a(po2Var);
                        po2Var.a("network-http-complete");
                        if (e82VarA.f76980e && po2Var.h()) {
                            po2Var.c("not-modified");
                            po2Var.j();
                        } else {
                            vp2 vp2VarA = po2Var.a(e82VarA);
                            po2Var.a("network-parse-complete");
                            if (po2Var.f81496j && vp2VarA.f83981b != null) {
                                this.f75435d.a(po2Var.c(), vp2VarA.f83981b);
                                po2Var.a("network-cache-written");
                            }
                            synchronized (po2Var.f81492f) {
                                po2Var.f81498l = true;
                            }
                            ((gn0) this.f75436e).a(po2Var, vp2VarA, null);
                            po2Var.a(vp2VarA);
                        }
                    }
                } catch (im3 e10) {
                    SystemClock.elapsedRealtime();
                    im3 im3VarA = po2Var.a(e10);
                    gn0 gn0Var = (gn0) this.f75436e;
                    gn0Var.getClass();
                    po2Var.a("post-error");
                    vp2 vp2Var = new vp2(im3VarA);
                    en0 en0Var = gn0Var.f77859a;
                    en0Var.f77137a.post(new fn0(po2Var, vp2Var, null));
                    po2Var.j();
                }
            } catch (Exception e11) {
                boolean z10 = lm3.f79855a;
                boolean z11 = ad1.f75480a;
                im3 im3Var = new im3((Throwable) e11);
                SystemClock.elapsedRealtime();
                gn0 gn0Var2 = (gn0) this.f75436e;
                gn0Var2.getClass();
                po2Var.a("post-error");
                vp2 vp2Var2 = new vp2(im3Var);
                en0 en0Var2 = gn0Var2.f77859a;
                en0Var2.f77137a.post(new fn0(po2Var, vp2Var2, null));
                po2Var.j();
            }
            po2Var.a(4);
        } catch (Throwable th2) {
            po2Var.a(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f75437f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z10 = lm3.f79855a;
                    boolean z11 = ad1.f75480a;
                }
            } catch (Throwable unused2) {
                boolean z12 = lm3.f79855a;
                boolean z13 = ad1.f75480a;
                return;
            }
        }
    }

    public a82(PriorityBlockingQueue priorityBlockingQueue, xo xoVar, mr mrVar, bq2 bq2Var) {
        this.f75433b = priorityBlockingQueue;
        this.f75434c = xoVar;
        this.f75435d = mrVar;
        this.f75436e = bq2Var;
    }
}
