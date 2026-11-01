package si;

import ii.r;

/* JADX INFO: compiled from: QueueDrainObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j<T, U, V> extends l implements r<T>, bj.h<U, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r<? super V> f71926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ri.g<U> f71927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f71928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f71929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f71930g;

    @Override // bj.h
    public void a(r<? super V> rVar, U u10) {
    }

    @Override // bj.h
    public final Throwable c() {
        return this.f71930g;
    }

    @Override // bj.h
    public final int d(int i10) {
        return this.f71931b.addAndGet(i10);
    }

    @Override // bj.h
    public final boolean e() {
        return this.f71929f;
    }

    @Override // bj.h
    public final boolean f() {
        return this.f71928e;
    }

    public final boolean g() {
        return this.f71931b.getAndIncrement() == 0;
    }

    public final boolean h() {
        return this.f71931b.get() == 0 && this.f71931b.compareAndSet(0, 1);
    }

    public final void i(U u10, boolean z10, mi.b bVar) {
        r<? super V> rVar = this.f71926c;
        ri.g<U> gVar = this.f71927d;
        if (this.f71931b.get() == 0 && this.f71931b.compareAndSet(0, 1)) {
            a(rVar, u10);
            if (d(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(u10);
            if (!g()) {
                return;
            }
        }
        bj.k.c(gVar, rVar, z10, bVar, this);
    }

    public final void j(U u10, boolean z10, mi.b bVar) {
        r<? super V> rVar = this.f71926c;
        ri.g<U> gVar = this.f71927d;
        if (this.f71931b.get() != 0 || !this.f71931b.compareAndSet(0, 1)) {
            gVar.offer(u10);
            if (!g()) {
                return;
            }
        } else if (gVar.isEmpty()) {
            a(rVar, u10);
            if (d(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(u10);
        }
        bj.k.c(gVar, rVar, z10, bVar, this);
    }

    public j(r<? super V> rVar, ri.g<U> gVar) {
        this.f71926c = rVar;
        this.f71927d = gVar;
    }
}
