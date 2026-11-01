package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import ii.s;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import mi.b;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableTimer extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f61334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f61336d;

    public static final class TimerObserver extends AtomicReference<b> implements b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        public final r<? super Long> downstream;

        public TimerObserver(r<? super Long> rVar) {
            this.downstream = rVar;
        }

        @Override // mi.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // mi.b
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(EmptyDisposable.INSTANCE);
                this.downstream.onComplete();
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.trySet(this, bVar);
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Long> rVar) {
        TimerObserver timerObserver = new TimerObserver(rVar);
        rVar.onSubscribe(timerObserver);
        timerObserver.setResource(this.f61334b.d(timerObserver, this.f61335c, this.f61336d));
    }

    public ObservableTimer(long j10, TimeUnit timeUnit, s sVar) {
        this.f61335c = j10;
        this.f61336d = timeUnit;
        this.f61334b = sVar;
    }
}
