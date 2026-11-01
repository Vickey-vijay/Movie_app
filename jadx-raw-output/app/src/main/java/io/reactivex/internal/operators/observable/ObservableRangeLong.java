package io.reactivex.internal.operators.observable;

import ii.k;
import ii.r;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableRangeLong extends k<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61233c;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        public final r<? super Long> downstream;
        public final long end;
        public boolean fused;
        public long index;

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, ri.h
        public Long poll() throws Exception {
            long j10 = this.index;
            if (j10 != this.end) {
                this.index = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        public void run() {
            if (this.fused) {
                return;
            }
            r<? super Long> rVar = this.downstream;
            long j10 = this.end;
            for (long j11 = this.index; j11 != j10 && get() == 0; j11++) {
                rVar.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                rVar.onComplete();
            }
        }

        public RangeDisposable(r<? super Long> rVar, long j10, long j11) {
            this.downstream = rVar;
            this.index = j10;
            this.end = j11;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, mi.b
        public boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Long> rVar) {
        long j10 = this.f61232b;
        RangeDisposable rangeDisposable = new RangeDisposable(rVar, j10, j10 + this.f61233c);
        rVar.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }

    public ObservableRangeLong(long j10, long j11) {
        this.f61232b = j10;
        this.f61233c = j11;
    }
}
