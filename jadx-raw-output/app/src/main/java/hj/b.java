package hj;

import ii.r;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: SerializedSubject.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b<T> extends c<T> implements bj.a.InterfaceC0019a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f53933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bj.a<Object> f53935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f53936e;

    public void c() {
        bj.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f53935d;
                if (aVar == null) {
                    this.f53934c = false;
                    return;
                }
                this.f53935d = null;
            }
            aVar.d(this);
        }
    }

    @Override // ii.r
    public void onComplete() {
        if (this.f53936e) {
            return;
        }
        synchronized (this) {
            if (this.f53936e) {
                return;
            }
            this.f53936e = true;
            if (!this.f53934c) {
                this.f53934c = true;
                this.f53933b.onComplete();
                return;
            }
            bj.a<Object> aVar = this.f53935d;
            if (aVar == null) {
                aVar = new bj.a<>(4);
                this.f53935d = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f53936e) {
            ej.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f53936e) {
                this.f53936e = true;
                if (this.f53934c) {
                    bj.a<Object> aVar = this.f53935d;
                    if (aVar == null) {
                        aVar = new bj.a<>(4);
                        this.f53935d = aVar;
                    }
                    aVar.e(NotificationLite.error(th2));
                    return;
                }
                this.f53934c = true;
                z10 = false;
            }
            if (z10) {
                ej.a.s(th2);
            } else {
                this.f53933b.onError(th2);
            }
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.f53936e) {
            return;
        }
        synchronized (this) {
            if (this.f53936e) {
                return;
            }
            if (!this.f53934c) {
                this.f53934c = true;
                this.f53933b.onNext(t10);
                c();
            } else {
                bj.a<Object> aVar = this.f53935d;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f53935d = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // ii.r
    public void onSubscribe(mi.b bVar) {
        boolean z10 = true;
        if (!this.f53936e) {
            synchronized (this) {
                if (!this.f53936e) {
                    if (this.f53934c) {
                        bj.a<Object> aVar = this.f53935d;
                        if (aVar == null) {
                            aVar = new bj.a<>(4);
                            this.f53935d = aVar;
                        }
                        aVar.c(NotificationLite.disposable(bVar));
                        return;
                    }
                    this.f53934c = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f53933b.onSubscribe(bVar);
            c();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f53933b.subscribe(rVar);
    }

    @Override // bj.a.InterfaceC0019a, oi.q
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f53933b);
    }

    public b(c<T> cVar) {
        this.f53933b = cVar;
    }
}
