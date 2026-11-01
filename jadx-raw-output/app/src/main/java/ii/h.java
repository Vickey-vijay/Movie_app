package ii;

/* JADX INFO: compiled from: MaybeObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public interface h<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(mi.b bVar);

    void onSuccess(T t10);
}
