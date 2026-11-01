package io.reactivex.internal.operators.single;

import ii.s;
import ii.t;
import ii.u;
import ii.v;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes8.dex */
public final class SingleSubscribeOn<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f61377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f61378b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<b> implements u<T>, b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        public final u<? super T> downstream;
        public final v<? extends T> source;
        public final SequentialDisposable task = new SequentialDisposable();

        @Override // ii.u
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            this.downstream.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.b(this);
        }

        public SubscribeOnObserver(u<? super T> uVar, v<? extends T> vVar) {
            this.downstream = uVar;
            this.source = vVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // ii.u
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    @Override // ii.t
    public void m(u<? super T> uVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(uVar, this.f61377a);
        uVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f61378b.c(subscribeOnObserver));
    }

    public SingleSubscribeOn(v<? extends T> vVar, s sVar) {
        this.f61377a = vVar;
        this.f61378b = sVar;
    }
}
