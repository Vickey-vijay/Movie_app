package yads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public final class tr extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f83143h = lm3.f79855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f83144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f83145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f83146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bq2 f83147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f83148f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final en3 f83149g;

    private void a() throws InterruptedException {
        po2 po2Var = (po2) this.f83144b.take();
        po2Var.a("cache-queue-take");
        po2Var.a(1);
        try {
            if (po2Var.i()) {
                po2Var.c("cache-discard-canceled");
            } else {
                lr lrVar = this.f83146d.get(po2Var.c());
                if (lrVar == null) {
                    po2Var.a("cache-miss");
                    if (!this.f83149g.a(po2Var)) {
                        this.f83145c.put(po2Var);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (lrVar.f79887e < jCurrentTimeMillis) {
                        po2Var.a("cache-hit-expired");
                        po2Var.f81502p = lrVar;
                        if (!this.f83149g.a(po2Var)) {
                            this.f83145c.put(po2Var);
                        }
                    } else {
                        po2Var.a("cache-hit");
                        byte[] bArr = lrVar.f79883a;
                        Map map = lrVar.f79889g;
                        vp2 vp2VarA = po2Var.a(new e82(200, bArr, map, e82.a(map), false));
                        po2Var.a("cache-hit-parsed");
                        if (vp2VarA.f83982c != null) {
                            po2Var.a("cache-parsing-failed");
                            this.f83146d.a(po2Var.c());
                            po2Var.f81502p = null;
                            if (!this.f83149g.a(po2Var)) {
                                this.f83145c.put(po2Var);
                            }
                        } else if (lrVar.f79888f < jCurrentTimeMillis) {
                            po2Var.a("cache-hit-refresh-needed");
                            po2Var.f81502p = lrVar;
                            vp2VarA.f83983d = true;
                            if (this.f83149g.a(po2Var)) {
                                ((gn0) this.f83147e).a(po2Var, vp2VarA, null);
                            } else {
                                ((gn0) this.f83147e).a(po2Var, vp2VarA, new sr(this, po2Var));
                            }
                        } else {
                            ((gn0) this.f83147e).a(po2Var, vp2VarA, null);
                        }
                    }
                }
            }
        } finally {
            po2Var.a(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f83143h) {
            boolean z10 = ad1.f75480a;
        }
        Process.setThreadPriority(10);
        this.f83146d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f83148f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z11 = ad1.f75480a;
            } catch (Throwable unused2) {
                boolean z12 = ad1.f75480a;
                return;
            }
        }
    }

    public tr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, mr mrVar, bq2 bq2Var) {
        this.f83144b = priorityBlockingQueue;
        this.f83145c = priorityBlockingQueue2;
        this.f83146d = mrVar;
        this.f83147e = bq2Var;
        this.f83149g = new en3(this, priorityBlockingQueue2, bq2Var);
    }
}
