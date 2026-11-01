package ii;

/* JADX INFO: compiled from: Observer.java */
/* JADX INFO: loaded from: classes10.dex */
public interface r<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);

    void onSubscribe(mi.b bVar);
}
