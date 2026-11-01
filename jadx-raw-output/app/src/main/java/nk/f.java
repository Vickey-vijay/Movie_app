package nk;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends kotlinx.coroutines.a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f64786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c1 f64787f;

    public f(kotlin.coroutines.d dVar, Thread thread, c1 c1Var) {
        super(dVar, true, true);
        this.f64786e = thread;
        this.f64787f = c1Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean A0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void V(Object obj) {
        if (!ck.p.e(Thread.currentThread(), this.f64786e)) {
            Thread thread = this.f64786e;
            b.a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T i1() throws Throwable {
        long J;
        b.a();
        try {
            c1 c1Var = this.f64787f;
            z zVar = null;
            if (c1Var != null) {
                c1.z(c1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    c1 c1Var2 = this.f64787f;
                    if (c1Var2 != null) {
                        J = c1Var2.J();
                    } else {
                        J = Long.MAX_VALUE;
                    }
                    if (!d()) {
                        b.a();
                        LockSupport.parkNanos(this, J);
                    } else {
                        c1 c1Var3 = this.f64787f;
                        if (c1Var3 != null) {
                            c1.p(c1Var3, false, 1, null);
                        }
                        b.a();
                        T t10 = (T) v1.h(t0());
                        if (t10 instanceof z) {
                            zVar = (z) t10;
                        }
                        if (zVar == null) {
                            return t10;
                        }
                        throw zVar.f64844a;
                    }
                } catch (Throwable th2) {
                    c1 c1Var4 = this.f64787f;
                    if (c1Var4 != null) {
                        c1.p(c1Var4, false, 1, null);
                    }
                    throw th2;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            Y(interruptedException);
            throw interruptedException;
        } catch (Throwable th3) {
            b.a();
            throw th3;
        }
    }
}
