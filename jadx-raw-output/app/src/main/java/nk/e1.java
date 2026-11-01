package nk;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class e1 extends c1 {
    public abstract Thread M();

    public void P(long j10, d1.c cVar) {
        n0.f64805h.e0(j10, cVar);
    }

    public final void Q() {
        Thread threadM = M();
        if (Thread.currentThread() != threadM) {
            b.a();
            LockSupport.unpark(threadM);
        }
    }
}
