package io.reactivex.internal.operators.observable;

import bj.f;
import ii.c;
import ii.k;
import ii.r;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableMergeWithCompletable<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f61211c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;
        public final r<? super T> downstream;
        public volatile boolean mainDone;
        public volatile boolean otherDone;
        public final AtomicReference<b> mainDisposable = new AtomicReference<>();
        public final OtherObserver otherObserver = new OtherObserver(this);
        public final AtomicThrowable error = new AtomicThrowable();

        public static final class OtherObserver extends AtomicReference<b> implements ii.b {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<?> parent;

            @Override // ii.b
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // ii.b
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            public OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // ii.b
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        @Override // ii.r
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                f.a(this.downstream, this, this.error);
            }
        }

        public void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                f.a(this.downstream, this, this.error);
            }
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.mainDisposable);
            f.c(this.downstream, th2, this, this.error);
        }

        @Override // ii.r
        public void onNext(T t10) {
            f.e(this.downstream, t10, this, this.error);
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.mainDisposable, bVar);
        }

        public void otherError(Throwable th2) {
            DisposableHelper.dispose(this.mainDisposable);
            f.c(this.downstream, th2, this, this.error);
        }

        public MergeWithObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(rVar);
        rVar.onSubscribe(mergeWithObserver);
        this.f74487b.subscribe(mergeWithObserver);
        this.f61211c.b(mergeWithObserver.otherObserver);
    }

    public ObservableMergeWithCompletable(k<T> kVar, c cVar) {
        super(kVar);
        this.f61211c = cVar;
    }
}
