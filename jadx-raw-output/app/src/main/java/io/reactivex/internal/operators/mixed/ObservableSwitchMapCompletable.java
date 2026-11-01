package io.reactivex.internal.operators.mixed;

import androidx.lifecycle.e;
import ii.a;
import ii.c;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;
import oi.o;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSwitchMapCompletable<T> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f61100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f61101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61102c;

    public static final class SwitchMapCompletableObserver<T> implements r<T>, b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final SwitchMapInnerObserver f61103i = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.b f61104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends c> f61105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f61106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicThrowable f61107e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<SwitchMapInnerObserver> f61108f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f61109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f61110h;

        public static final class SwitchMapInnerObserver extends AtomicReference<b> implements ii.b {
            private static final long serialVersionUID = -8003404460084760287L;
            public final SwitchMapCompletableObserver<?> parent;

            @Override // ii.b
            public void onComplete() {
                this.parent.b(this);
            }

            @Override // ii.b
            public void onError(Throwable th2) {
                this.parent.c(this, th2);
            }

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // ii.b
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.f61109g = true;
            if (this.f61108f.get() == null) {
                Throwable thTerminate = this.f61107e.terminate();
                if (thTerminate == null) {
                    this.f61104b.onComplete();
                } else {
                    this.f61104b.onError(thTerminate);
                }
            }
        }

        public void a() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f61108f;
            SwitchMapInnerObserver switchMapInnerObserver = f61103i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        public void b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (e.a(this.f61108f, switchMapInnerObserver, null) && this.f61109g) {
                Throwable thTerminate = this.f61107e.terminate();
                if (thTerminate == null) {
                    this.f61104b.onComplete();
                } else {
                    this.f61104b.onError(thTerminate);
                }
            }
        }

        public void c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (!e.a(this.f61108f, switchMapInnerObserver, null) || !this.f61107e.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.f61106d) {
                if (this.f61109g) {
                    this.f61104b.onError(this.f61107e.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.f61107e.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.f61104b.onError(thTerminate);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f61110h.dispose();
            a();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f61108f.get() == f61103i;
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.f61107e.addThrowable(th2)) {
                ej.a.s(th2);
                return;
            }
            if (this.f61106d) {
                onComplete();
                return;
            }
            a();
            Throwable thTerminate = this.f61107e.terminate();
            if (thTerminate != ExceptionHelper.f61400a) {
                this.f61104b.onError(thTerminate);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                c cVar = (c) qi.a.e(this.f61105c.apply(t10), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f61108f.get();
                    if (switchMapInnerObserver == f61103i) {
                        return;
                    }
                } while (!e.a(this.f61108f, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                cVar.b(switchMapInnerObserver2);
            } catch (Throwable th2) {
                ni.a.b(th2);
                this.f61110h.dispose();
                onError(th2);
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f61110h, bVar)) {
                this.f61110h = bVar;
                this.f61104b.onSubscribe(this);
            }
        }

        public SwitchMapCompletableObserver(ii.b bVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.f61104b = bVar;
            this.f61105c = oVar;
            this.f61106d = z10;
        }
    }

    @Override // ii.a
    public void f(ii.b bVar) {
        if (wi.a.a(this.f61100a, this.f61101b, bVar)) {
            return;
        }
        this.f61100a.subscribe(new SwitchMapCompletableObserver(bVar, this.f61101b, this.f61102c));
    }

    public ObservableSwitchMapCompletable(k<T> kVar, o<? super T, ? extends c> oVar, boolean z10) {
        this.f61100a = kVar;
        this.f61101b = oVar;
        this.f61102c = z10;
    }
}
