package io.reactivex.subjects;

import androidx.lifecycle.e;
import ej.a;
import hj.c;
import ii.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes4.dex */
public final class PublishSubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishDisposable[] f61419d = new PublishDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PublishDisposable[] f61420e = new PublishDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<PublishDisposable<T>[]> f61421b = new AtomicReference<>(f61420e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f61422c;

    public static final class PublishDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        public final r<? super T> downstream;
        public final PublishSubject<T> parent;

        @Override // mi.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.e(this);
            }
        }

        public PublishDisposable(r<? super T> rVar, PublishSubject<T> publishSubject) {
            this.downstream = rVar;
            this.parent = publishSubject;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get()) {
                a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        public void onNext(T t10) {
            if (!get()) {
                this.downstream.onNext(t10);
            }
        }
    }

    public static <T> PublishSubject<T> d() {
        return new PublishSubject<>();
    }

    public boolean c(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f61421b.get();
            if (publishDisposableArr == f61419d) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!e.a(this.f61421b, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    public void e(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f61421b.get();
            if (publishDisposableArr == f61419d || publishDisposableArr == f61420e) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (publishDisposableArr[i11] == publishDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f61420e;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, publishDisposableArr3, i10, (length - i10) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!e.a(this.f61421b, publishDisposableArr, publishDisposableArr2));
    }

    @Override // ii.r
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f61421b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f61419d;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f61421b.getAndSet(publishDisposableArr2)) {
            publishDisposable.onComplete();
        }
    }

    @Override // ii.r
    public void onError(Throwable th2) {
        qi.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.f61421b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f61419d;
        if (publishDisposableArr == publishDisposableArr2) {
            a.s(th2);
            return;
        }
        this.f61422c = th2;
        for (PublishDisposable<T> publishDisposable : this.f61421b.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th2);
        }
    }

    @Override // ii.r
    public void onNext(T t10) {
        qi.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.f61421b.get()) {
            publishDisposable.onNext(t10);
        }
    }

    @Override // ii.r
    public void onSubscribe(b bVar) {
        if (this.f61421b.get() == f61419d) {
            bVar.dispose();
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(rVar, this);
        rVar.onSubscribe(publishDisposable);
        if (c(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                e(publishDisposable);
            }
        } else {
            Throwable th2 = this.f61422c;
            if (th2 != null) {
                rVar.onError(th2);
            } else {
                rVar.onComplete();
            }
        }
    }
}
