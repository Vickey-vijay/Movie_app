package cj;

import ii.k;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import oi.g;

/* JADX INFO: compiled from: ConnectableObservable.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T> extends k<T> {
    public abstract void b(g<? super mi.b> gVar);

    public k<T> c() {
        return ej.a.o(new ObservableRefCount(this));
    }
}
