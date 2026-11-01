package si;

/* JADX INFO: compiled from: BlockingFirstObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d<T> extends c<T> {
    @Override // ii.r
    public void onError(Throwable th2) {
        if (this.f71911b == null) {
            this.f71912c = th2;
        }
        countDown();
    }

    @Override // ii.r
    public void onNext(T t10) {
        if (this.f71911b == null) {
            this.f71911b = t10;
            this.f71913d.dispose();
            countDown();
        }
    }
}
