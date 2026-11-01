package ij;

import ii.f;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import qo.b;
import qo.c;

/* JADX INFO: compiled from: SerializedSubscriber.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a<T> implements f<T>, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<? super T> f54194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f54196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bj.a<Object> f54198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f54199g;

    public a(b<? super T> bVar) {
        this(bVar, false);
    }

    public void a() {
        bj.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f54198f;
                if (aVar == null) {
                    this.f54197e = false;
                    return;
                }
                this.f54198f = null;
            }
        } while (!aVar.b(this.f54194b));
    }

    public a(b<? super T> bVar, boolean z10) {
        this.f54194b = bVar;
        this.f54195c = z10;
    }

    @Override // qo.c
    public void cancel() {
        this.f54196d.cancel();
    }

    @Override // qo.b
    public void onComplete() {
        if (this.f54199g) {
            return;
        }
        synchronized (this) {
            if (this.f54199g) {
                return;
            }
            if (!this.f54197e) {
                this.f54199g = true;
                this.f54197e = true;
                this.f54194b.onComplete();
            } else {
                bj.a<Object> aVar = this.f54198f;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f54198f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // qo.b
    public void onError(Throwable th2) {
        if (this.f54199g) {
            ej.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f54199g) {
                if (this.f54197e) {
                    this.f54199g = true;
                    bj.a<Object> aVar = this.f54198f;
                    if (aVar == null) {
                        aVar = new bj.a<>(4);
                        this.f54198f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f54195c) {
                        aVar.c(objError);
                    } else {
                        aVar.e(objError);
                    }
                    return;
                }
                this.f54199g = true;
                this.f54197e = true;
                z10 = false;
            }
            if (z10) {
                ej.a.s(th2);
            } else {
                this.f54194b.onError(th2);
            }
        }
    }

    @Override // qo.b
    public void onNext(T t10) {
        if (this.f54199g) {
            return;
        }
        if (t10 == null) {
            this.f54196d.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f54199g) {
                return;
            }
            if (!this.f54197e) {
                this.f54197e = true;
                this.f54194b.onNext(t10);
                a();
            } else {
                bj.a<Object> aVar = this.f54198f;
                if (aVar == null) {
                    aVar = new bj.a<>(4);
                    this.f54198f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // ii.f
    public void onSubscribe(c cVar) {
        if (SubscriptionHelper.validate(this.f54196d, cVar)) {
            this.f54196d = cVar;
            this.f54194b.onSubscribe(this);
        }
    }

    @Override // qo.c
    public void request(long j10) {
        this.f54196d.request(j10);
    }
}
