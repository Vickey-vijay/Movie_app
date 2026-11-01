package dj;

import ii.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: SafeObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d<T> implements r<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f52124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mi.b f52125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f52126d;

    public void b() {
        this.f52126d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f52124b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f52124b.onError(nullPointerException);
            } catch (Throwable th2) {
                ni.a.b(th2);
                ej.a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            ni.a.b(th3);
            ej.a.s(new CompositeException(nullPointerException, th3));
        }
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f52124b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f52124b.onError(nullPointerException);
            } catch (Throwable th2) {
                ni.a.b(th2);
                ej.a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            ni.a.b(th3);
            ej.a.s(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // mi.b
    public void dispose() {
        this.f52125c.dispose();
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f52125c.isDisposed();
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f52126d) {
            return;
        }
        this.f52126d = true;
        if (this.f52125c == null) {
            a();
            return;
        }
        try {
            this.f52124b.onComplete();
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f52126d) {
            ej.a.s(th2);
            return;
        }
        this.f52126d = true;
        if (this.f52125c != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f52124b.onError(th2);
                return;
            } catch (Throwable th3) {
                ni.a.b(th3);
                ej.a.s(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f52124b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f52124b.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                ni.a.b(th4);
                ej.a.s(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            ni.a.b(th5);
            ej.a.s(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.f52126d) {
            return;
        }
        if (this.f52125c == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f52125c.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                ni.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f52124b.onNext(t10);
        } catch (Throwable th3) {
            ni.a.b(th3);
            try {
                this.f52125c.dispose();
                onError(th3);
            } catch (Throwable th4) {
                ni.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        if (DisposableHelper.validate(this.f52125c, bVar)) {
            this.f52125c = bVar;
            try {
                this.f52124b.onSubscribe(this);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f52126d = true;
                try {
                    bVar.dispose();
                    ej.a.s(th2);
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    ej.a.s(new CompositeException(th2, th3));
                }
            }
        }
    }

    public d(r<? super T> rVar) {
        this.f52124b = rVar;
    }
}
