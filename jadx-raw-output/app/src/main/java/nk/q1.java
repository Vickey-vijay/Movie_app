package nk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64816g = AtomicIntegerFieldUpdater.newUpdater(q1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bk.l<Throwable, mj.r> f64817f;

    @Override // nk.u1
    public boolean u() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q1(bk.l<? super Throwable, mj.r> lVar) {
        this.f64817f = lVar;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        if (f64816g.compareAndSet(this, 0, 1)) {
            this.f64817f.invoke(th2);
        }
    }
}
