package fj;

import io.reactivex.internal.util.NotificationLite;
import qo.c;

/* JADX INFO: compiled from: SerializedProcessor.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f52959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f52960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bj.a<Object> f52961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f52962f;

    public void s() {
        bj.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f52961e;
                if (aVar == null) {
                    this.f52960d = false;
                    return;
                }
                this.f52961e = null;
            }
            aVar.b(this.f52959c);
        }
    }

    @Override // ii.e
    public void n(qo.b<? super T> bVar) {
        this.f52959c.a(bVar);
    }

    @Override // qo.b
    public void onComplete() {
        if (this.f52962f) {
            return;
        }
        synchronized (this) {
            if (this.f52962f) {
                return;
            }
            this.f52962f = true;
            if (!this.f52960d) {
                this.f52960d = true;
                this.f52959c.onComplete();
                return;
            }
            bj.a<Object> aVar = this.f52961e;
            if (aVar == null) {
                aVar = new bj.a<>(4);
                this.f52961e = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        if (this.f52962f) {
            ej.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f52962f) {
                this.f52962f = true;
                if (this.f52960d) {
                    bj.a<Object> aVar = this.f52961e;
                    if (aVar == null) {
                        aVar = new bj.a<>(4);
                        this.f52961e = aVar;
                    }
                    aVar.e(NotificationLite.error(th2));
                    return;
                }
                this.f52960d = true;
                z10 = false;
            }
            if (z10) {
                ej.a.s(th2);
            } else {
                this.f52959c.onError(th2);
            }
        }
    }

    @Override // qo.b
    public void onNext(T t10) {
        if (this.f52962f) {
            return;
        }
        synchronized (this) {
            if (this.f52962f) {
                return;
            }
            if (!this.f52960d) {
                this.f52960d = true;
                this.f52959c.onNext(t10);
                s();
            } else {
                bj.a<Object> aVar = this.f52961e;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f52961e = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // qo.b, ii.f
    public void onSubscribe(c cVar) {
        boolean z10 = true;
        if (!this.f52962f) {
            synchronized (this) {
                if (!this.f52962f) {
                    if (this.f52960d) {
                        bj.a<Object> aVar = this.f52961e;
                        if (aVar == null) {
                            aVar = new bj.a<>(4);
                            this.f52961e = aVar;
                        }
                        aVar.c(NotificationLite.subscription(cVar));
                        return;
                    }
                    this.f52960d = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            cVar.cancel();
        } else {
            this.f52959c.onSubscribe(cVar);
            s();
        }
    }

    public b(a<T> aVar) {
        this.f52959c = aVar;
    }
}
