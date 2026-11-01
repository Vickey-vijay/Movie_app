package nk;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c1 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f64764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nj.i<kotlinx.coroutines.f<?>> f64766d;

    public boolean L() {
        return false;
    }

    public final long q(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public void shutdown() {
    }

    public static /* synthetic */ void p(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.n(z10);
    }

    public static /* synthetic */ void z(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.x(z10);
    }

    public final boolean C() {
        return this.f64764b >= q(true);
    }

    public final boolean D() {
        nj.i<kotlinx.coroutines.f<?>> iVar = this.f64766d;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    public final boolean K() {
        kotlinx.coroutines.f<?> fVarR;
        nj.i<kotlinx.coroutines.f<?>> iVar = this.f64766d;
        if (iVar == null || (fVarR = iVar.r()) == null) {
            return false;
        }
        fVarR.run();
        return true;
    }

    public final void n(boolean z10) {
        long jQ = this.f64764b - q(z10);
        this.f64764b = jQ;
        if (jQ <= 0 && this.f64765c) {
            shutdown();
        }
    }

    public final void r(kotlinx.coroutines.f<?> fVar) {
        nj.i<kotlinx.coroutines.f<?>> iVar = this.f64766d;
        if (iVar == null) {
            iVar = new nj.i<>();
            this.f64766d = iVar;
        }
        iVar.addLast(fVar);
    }

    public long w() {
        nj.i<kotlinx.coroutines.f<?>> iVar = this.f64766d;
        return (iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void x(boolean z10) {
        this.f64764b += q(z10);
        if (z10) {
            return;
        }
        this.f64765c = true;
    }

    public long J() {
        if (!K()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    @Override // nk.h0
    public final h0 limitedParallelism(int i10, String str) {
        sk.m.a(i10);
        return sk.m.b(this, str);
    }
}
