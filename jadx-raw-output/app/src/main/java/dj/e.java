package dj;

import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: SerializedObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements r<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f52127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mi.b f52129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bj.a<Object> f52131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f52132g;

    public e(r<? super T> rVar) {
        this(rVar, false);
    }

    public void a() {
        bj.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f52131f;
                if (aVar == null) {
                    this.f52130e = false;
                    return;
                }
                this.f52131f = null;
            }
        } while (!aVar.a(this.f52127b));
    }

    public e(r<? super T> rVar, boolean z10) {
        this.f52127b = rVar;
        this.f52128c = z10;
    }

    @Override // mi.b
    public void dispose() {
        this.f52129d.dispose();
    }

    @Override // mi.b
    public boolean isDisposed() {
        return this.f52129d.isDisposed();
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f52132g) {
            return;
        }
        synchronized (this) {
            if (this.f52132g) {
                return;
            }
            if (!this.f52130e) {
                this.f52132g = true;
                this.f52130e = true;
                this.f52127b.onComplete();
            } else {
                bj.a<Object> aVar = this.f52131f;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f52131f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f52132g) {
            ej.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f52132g) {
                if (this.f52130e) {
                    this.f52132g = true;
                    bj.a<Object> aVar = this.f52131f;
                    if (aVar == null) {
                        aVar = new bj.a<>(4);
                        this.f52131f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f52128c) {
                        aVar.c(objError);
                    } else {
                        aVar.e(objError);
                    }
                    return;
                }
                this.f52132g = true;
                this.f52130e = true;
                z10 = false;
            }
            if (z10) {
                ej.a.s(th2);
            } else {
                this.f52127b.onError(th2);
            }
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.f52132g) {
            return;
        }
        if (t10 == null) {
            this.f52129d.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f52132g) {
                return;
            }
            if (!this.f52130e) {
                this.f52130e = true;
                this.f52127b.onNext(t10);
                a();
            } else {
                bj.a<Object> aVar = this.f52131f;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f52131f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        if (DisposableHelper.validate(this.f52129d, bVar)) {
            this.f52129d = bVar;
            this.f52127b.onSubscribe(this);
        }
    }
}
