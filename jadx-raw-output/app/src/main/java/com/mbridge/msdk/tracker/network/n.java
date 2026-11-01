package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: NetworkDispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f38189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f38190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f38191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f38192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f38193e = false;

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    private void a() throws InterruptedException {
        b(this.f38189a.take());
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f38193e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f38189a = blockingQueue;
        this.f38190b = mVar;
        this.f38191c = bVar;
        this.f38192d = wVar;
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                tVar.a("network-queue-take");
                if (tVar.v()) {
                    tVar.c("network-discard-cancelled");
                    tVar.x();
                    return;
                }
                if (tVar.y()) {
                    a(tVar);
                }
                q qVarA = this.f38190b.a(tVar);
                tVar.a("network-http-complete");
                if (qVarA.f38224e && tVar.u()) {
                    tVar.c("not-modified");
                    tVar.x();
                    return;
                }
                v<?> vVarA = tVar.a(qVarA);
                tVar.a("network-parse-complete");
                if (tVar.z() && vVarA.f38297b != null) {
                    this.f38191c.a(tVar.e(), vVarA.f38297b);
                    tVar.a("network-cache-written");
                }
                tVar.w();
                this.f38192d.a(tVar, vVarA);
                tVar.a(vVarA);
            } catch (b0 e10) {
                e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(tVar, e10);
                tVar.x();
            } catch (Exception e11) {
                c0.a(e11, "Unhandled exception %s", e11.toString());
                a0 a0Var = new a0(e11);
                a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f38192d.a(tVar, a0Var);
                tVar.x();
            }
        } finally {
            tVar.a(4);
        }
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f38192d.a(tVar, tVar.c(b0Var));
    }
}
