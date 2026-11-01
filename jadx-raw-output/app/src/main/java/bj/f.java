package bj;

import ii.r;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: HalfSerializer.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static void a(r<?> rVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                rVar.onError(thTerminate);
            } else {
                rVar.onComplete();
            }
        }
    }

    public static void b(qo.b<?> bVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate != null) {
                bVar.onError(thTerminate);
            } else {
                bVar.onComplete();
            }
        }
    }

    public static void c(r<?> rVar, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                rVar.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        ej.a.s(th2);
    }

    public static void d(qo.b<?> bVar, Throwable th2, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.addThrowable(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                bVar.onError(atomicThrowable.terminate());
                return;
            }
            return;
        }
        ej.a.s(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(r<? super T> rVar, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            rVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    rVar.onError(thTerminate);
                } else {
                    rVar.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(qo.b<? super T> bVar, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                if (thTerminate != null) {
                    bVar.onError(thTerminate);
                } else {
                    bVar.onComplete();
                }
            }
        }
    }
}
