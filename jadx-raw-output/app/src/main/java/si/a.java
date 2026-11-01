package si;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: BasicFuseableObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T, R> implements r<T>, ri.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super R> f71906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mi.b f71907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ri.c<T> f71908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f71909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71910f;

    public void a() {
    }

    public boolean b() {
        return true;
    }

    @Override // ri.h
    public void clear() {
        this.f71908d.clear();
    }

    public final int d(int i10) {
        ri.c<T> cVar = this.f71908d;
        if (cVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = cVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f71910f = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // mi.b
    public void dispose() {
        this.f71907c.dispose();
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f71907c.isDisposed();
    }

    @Override // ri.h
    public boolean isEmpty() {
        return this.f71908d.isEmpty();
    }

    @Override // ri.h
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f71909e) {
            return;
        }
        this.f71909e = true;
        this.f71906b.onComplete();
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f71909e) {
            ej.a.s(th2);
        } else {
            this.f71909e = true;
            this.f71906b.onError(th2);
        }
    }

    @Override // ii.r
    public final void onSubscribe(mi.b bVar) {
        if (DisposableHelper.validate(this.f71907c, bVar)) {
            this.f71907c = bVar;
            if (bVar instanceof ri.c) {
                this.f71908d = (ri.c) bVar;
            }
            if (b()) {
                this.f71906b.onSubscribe(this);
                a();
            }
        }
    }

    public a(r<? super R> rVar) {
        this.f71906b = rVar;
    }

    public final void c(Throwable th2) {
        ni.a.b(th2);
        this.f71907c.dispose();
        onError(th2);
    }
}
