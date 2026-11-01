package si;

import io.reactivex.internal.observers.InnerQueuedObserver;

/* JADX INFO: compiled from: InnerQueuedObserverSupport.java */
/* JADX INFO: loaded from: classes2.dex */
public interface i<T> {
    void drain();

    void innerComplete(InnerQueuedObserver<T> innerQueuedObserver);

    void innerError(InnerQueuedObserver<T> innerQueuedObserver, Throwable th2);

    void innerNext(InnerQueuedObserver<T> innerQueuedObserver, T t10);
}
