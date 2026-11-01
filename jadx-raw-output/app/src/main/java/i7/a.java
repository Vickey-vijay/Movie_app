package i7;

import ii.k;
import ii.r;

/* JADX INFO: compiled from: InitialValueObservable.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T> extends k<T> {
    public abstract T b();

    public abstract void c(r<? super T> rVar);

    @Override // ii.k
    public final void subscribeActual(r<? super T> rVar) {
        c(rVar);
        rVar.onNext(b());
    }
}
