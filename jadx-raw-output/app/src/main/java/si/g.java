package si;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: DisposableLambdaObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g<T> implements r<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f71919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.g<? super mi.b> f71920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.a f71921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mi.b f71922e;

    @Override // mi.b
    public void dispose() {
        try {
            this.f71921d.run();
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
        }
        this.f71922e.dispose();
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f71922e.isDisposed();
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f71922e != DisposableHelper.DISPOSED) {
            this.f71919b.onComplete();
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f71922e != DisposableHelper.DISPOSED) {
            this.f71919b.onError(th2);
        } else {
            ej.a.s(th2);
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        this.f71919b.onNext(t10);
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        try {
            this.f71920c.accept(bVar);
            if (DisposableHelper.validate(this.f71922e, bVar)) {
                this.f71922e = bVar;
                this.f71919b.onSubscribe(this);
            }
        } catch (Throwable th2) {
            ni.a.b(th2);
            bVar.dispose();
            this.f71922e = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, this.f71919b);
        }
    }

    public g(r<? super T> rVar, oi.g<? super mi.b> gVar, oi.a aVar) {
        this.f71919b = rVar;
        this.f71920c = gVar;
        this.f71921d = aVar;
    }
}
