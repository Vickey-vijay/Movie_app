package yads;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class xj2 implements rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f84604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f84605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr f84606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bs f84607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qj0 f84608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile wj2 f84609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f84610g;

    @Override // yads.rj0
    public final void a(qj0 qj0Var) {
        this.f84608e = qj0Var;
        this.f84609f = new wj2(this);
        try {
            if (!this.f84610g) {
                this.f84604a.execute(this.f84609f);
                try {
                    wj2 wj2Var = this.f84609f;
                    wj2Var.f75614c.a();
                    wj2Var.c();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i10 = ib3.f78556a;
                    throw cause;
                }
            }
            this.f84609f.f75614c.b();
        } catch (Throwable th2) {
            this.f84609f.f75614c.b();
            throw th2;
        }
    }

    @Override // yads.rj0
    public final void cancel() {
        this.f84610g = true;
        wj2 wj2Var = this.f84609f;
        if (wj2Var != null) {
            wj2Var.cancel(true);
        }
    }

    @Override // yads.rj0
    public final void remove() {
        rr rrVar = this.f84606c;
        ((vy2) rrVar.f82395a).c(rrVar.f82399e.a(this.f84605b));
    }

    public xj2(fm1 fm1Var, qr qrVar, Executor executor) {
        this.f84604a = (Executor) ni.a(executor);
        ni.a(fm1Var.f77444c);
        u30 u30VarA = new t30().a(fm1Var.f77444c.f85472a).a(fm1Var.f77444c.f85476e).a(4).a();
        this.f84605b = u30VarA;
        rr rrVarA = qrVar.a();
        this.f84606c = rrVarA;
        this.f84607d = new bs(rrVarA, u30VarA, null, new as() { // from class: cp.pc
            @Override // yads.as
            public final void a(long j10, long j11, long j12) {
                this.f51519a.a(j10, j11, j12);
            }
        });
    }

    public final void a(long j10, long j11, long j12) {
        qj0 qj0Var = this.f84608e;
        if (qj0Var == null) {
            return;
        }
        ((lj0) qj0Var).a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }
}
