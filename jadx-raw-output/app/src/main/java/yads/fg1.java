package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public final class fg1 implements gg1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zf1 f77388d = new zf1(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zf1 f77389e = new zf1(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f77390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag1 f77391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f77392c;

    @Override // yads.gg1
    public final void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f77392c;
        if (iOException != null) {
            throw iOException;
        }
        ag1 ag1Var = this.f77391b;
        if (ag1Var != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = ag1Var.f75503b;
            }
            IOException iOException2 = ag1Var.f75507f;
            if (iOException2 != null && ag1Var.f75508g > i10) {
                throw iOException2;
            }
        }
    }

    public final boolean b() {
        return this.f77391b != null;
    }

    public fg1(String str) {
        this.f77390a = ib3.d("ExoPlayer:Loader:".concat(str));
    }

    public final void a(cg1 cg1Var) {
        ag1 ag1Var = this.f77391b;
        if (ag1Var != null) {
            ag1Var.a(true);
        }
        if (cg1Var != null) {
            this.f77390a.execute(new dg1(cg1Var));
        }
        this.f77390a.shutdown();
    }

    public final long a(bg1 bg1Var, yf1 yf1Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f77392c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ag1 ag1Var = new ag1(this, looperMyLooper, bg1Var, yf1Var, i10, jElapsedRealtime);
            if (this.f77391b == null) {
                this.f77391b = ag1Var;
                ag1Var.f75507f = null;
                this.f77390a.execute(ag1Var);
                return jElapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
