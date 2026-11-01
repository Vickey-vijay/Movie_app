package ui;

import ii.t;
import ii.u;
import io.reactivex.internal.operators.flowable.FlowableSingle;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: FlowableSingleSingle.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f<T> extends t<T> implements ri.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.e<T> f72885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f72886b;

    /* JADX INFO: compiled from: FlowableSingleSingle.java */
    public static final class a<T> implements ii.f<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u<? super T> f72887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f72888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public qo.c f72889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f72890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public T f72891f;

        @Override // mi.b
        public void dispose() {
            this.f72889d.cancel();
            this.f72889d = SubscriptionHelper.CANCELLED;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f72889d == SubscriptionHelper.CANCELLED;
        }

        @Override // qo.b
        public void onComplete() {
            if (this.f72890e) {
                return;
            }
            this.f72890e = true;
            this.f72889d = SubscriptionHelper.CANCELLED;
            T t10 = this.f72891f;
            this.f72891f = null;
            if (t10 == null) {
                t10 = this.f72888c;
            }
            if (t10 != null) {
                this.f72887b.onSuccess(t10);
            } else {
                this.f72887b.onError(new NoSuchElementException());
            }
        }

        @Override // qo.b
        public void onError(Throwable th2) {
            if (this.f72890e) {
                ej.a.s(th2);
                return;
            }
            this.f72890e = true;
            this.f72889d = SubscriptionHelper.CANCELLED;
            this.f72887b.onError(th2);
        }

        @Override // qo.b
        public void onNext(T t10) {
            if (this.f72890e) {
                return;
            }
            if (this.f72891f == null) {
                this.f72891f = t10;
                return;
            }
            this.f72890e = true;
            this.f72889d.cancel();
            this.f72889d = SubscriptionHelper.CANCELLED;
            this.f72887b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // ii.f
        public void onSubscribe(qo.c cVar) {
            if (SubscriptionHelper.validate(this.f72889d, cVar)) {
                this.f72889d = cVar;
                this.f72887b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        public a(u<? super T> uVar, T t10) {
            this.f72887b = uVar;
            this.f72888c = t10;
        }
    }

    @Override // ri.a
    public ii.e<T> c() {
        return ej.a.m(new FlowableSingle(this.f72885a, this.f72886b, true));
    }

    @Override // ii.t
    public void m(u<? super T> uVar) {
        this.f72885a.m(new a(uVar, this.f72886b));
    }

    public f(ii.e<T> eVar, T t10) {
        this.f72885a = eVar;
        this.f72886b = t10;
    }
}
