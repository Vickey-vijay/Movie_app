package io.reactivex.internal.operators.observable;

import androidx.lifecycle.e;
import ii.p;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oi.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservablePublish<T> extends cj.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T> f61217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>> f61218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<T> f61219d;

    public static final class a<T> implements r<T>, mi.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final InnerDisposable[] f61220f = new InnerDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final InnerDisposable[] f61221g = new InnerDisposable[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<a<T>> f61222b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<mi.b> f61225e = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<InnerDisposable<T>[]> f61223c = new AtomicReference<>(f61220f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f61224d = new AtomicBoolean();

        public boolean a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f61223c.get();
                if (innerDisposableArr == f61221g) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!e.a(this.f61223c, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        public void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f61223c.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                for (int i11 = 0; i11 < length; i11++) {
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f61220f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!e.a(this.f61223c, innerDisposableArr, innerDisposableArr2));
        }

        @Override // mi.b
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.f61223c;
            InnerDisposable<T>[] innerDisposableArr = f61221g;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                e.a(this.f61222b, this, null);
                DisposableHelper.dispose(this.f61225e);
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f61223c.get() == f61221g;
        }

        @Override // ii.r
        public void onComplete() {
            e.a(this.f61222b, this, null);
            for (InnerDisposable<T> innerDisposable : this.f61223c.getAndSet(f61221g)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            e.a(this.f61222b, this, null);
            InnerDisposable<T>[] andSet = this.f61223c.getAndSet(f61221g);
            if (andSet.length == 0) {
                ej.a.s(th2);
                return;
            }
            for (InnerDisposable<T> innerDisposable : andSet) {
                innerDisposable.child.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            for (InnerDisposable<T> innerDisposable : this.f61223c.get()) {
                innerDisposable.child.onNext(t10);
            }
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            DisposableHelper.setOnce(this.f61225e, bVar);
        }

        public a(AtomicReference<a<T>> atomicReference) {
            this.f61222b = atomicReference;
        }
    }

    public static final class b<T> implements p<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<a<T>> f61226b;

        @Override // ii.p
        public void subscribe(r<? super T> rVar) {
            InnerDisposable innerDisposable = new InnerDisposable(rVar);
            rVar.onSubscribe(innerDisposable);
            while (true) {
                a<T> aVar = this.f61226b.get();
                if (aVar == null || aVar.isDisposed()) {
                    a<T> aVar2 = new a<>(this.f61226b);
                    if (e.a(this.f61226b, aVar, aVar2)) {
                        aVar = aVar2;
                    } else {
                        continue;
                    }
                }
                if (aVar.a(innerDisposable)) {
                    innerDisposable.setParent(aVar);
                    return;
                }
            }
        }

        public b(AtomicReference<a<T>> atomicReference) {
            this.f61226b = atomicReference;
        }
    }

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements mi.b {
        private static final long serialVersionUID = -1100270633763673112L;
        public final r<? super T> child;

        public void setParent(a<T> aVar) {
            if (compareAndSet(null, aVar)) {
                return;
            }
            aVar.b(this);
        }

        public InnerDisposable(r<? super T> rVar) {
            this.child = rVar;
        }

        @Override // mi.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((a) andSet).b(this);
            }
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == this) {
                return true;
            }
            return false;
        }
    }

    public static <T> cj.a<T> d(p<T> pVar) {
        AtomicReference atomicReference = new AtomicReference();
        return ej.a.k(new ObservablePublish(new b(atomicReference), pVar, atomicReference));
    }

    @Override // cj.a
    public void b(g<? super mi.b> gVar) {
        a<T> aVar;
        while (true) {
            aVar = this.f61218c.get();
            if (aVar != null && !aVar.isDisposed()) {
                break;
            }
            a<T> aVar2 = new a<>(this.f61218c);
            if (e.a(this.f61218c, aVar, aVar2)) {
                aVar = aVar2;
                break;
            }
        }
        boolean z10 = !aVar.f61224d.get() && aVar.f61224d.compareAndSet(false, true);
        try {
            gVar.accept(aVar);
            if (z10) {
                this.f61217b.subscribe(aVar);
            }
        } catch (Throwable th2) {
            ni.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.f61219d.subscribe(rVar);
    }

    public ObservablePublish(p<T> pVar, p<T> pVar2, AtomicReference<a<T>> atomicReference) {
        this.f61219d = pVar;
        this.f61217b = pVar2;
        this.f61218c = atomicReference;
    }
}
