package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class bf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af2 f75802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ze2 f75803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv f75804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f75806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f75807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75810i;

    public final synchronized void a(long j10) {
        boolean z10;
        if (!this.f75808g) {
            throw new IllegalStateException();
        }
        if (this.f75807f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        ((f53) this.f75804c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f75810i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f75804c.getClass();
            wait(j10);
            ((f53) this.f75804c).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public bf2(go0 go0Var, af2 af2Var, s63 s63Var, int i10, xv xvVar, Looper looper) {
        this.f75803b = go0Var;
        this.f75802a = af2Var;
        this.f75807f = looper;
        this.f75804c = xvVar;
    }

    public final synchronized void a(boolean z10) {
        this.f75809h = z10 | this.f75809h;
        this.f75810i = true;
        notifyAll();
    }

    public final bf2 a() {
        if (!this.f75808g) {
            this.f75808g = true;
            go0 go0Var = (go0) this.f75803b;
            synchronized (go0Var) {
                if (!go0Var.A && go0Var.f77881j.isAlive()) {
                    go0Var.f77880i.a(14, this).b();
                } else {
                    ih1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                    a(false);
                }
            }
            return this;
        }
        throw new IllegalStateException();
    }
}
