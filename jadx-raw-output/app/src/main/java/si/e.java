package si;

/* JADX INFO: compiled from: BlockingLastObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e<T> extends c<T> {
    @Override // ii.r
    public void onError(Throwable th2) {
        this.f71911b = null;
        this.f71912c = th2;
        countDown();
    }

    @Override // ii.r
    public void onNext(T t10) {
        this.f71911b = t10;
    }
}
