package jk;

import mj.r;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface i<V> extends l<V>, h<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<V> extends h.a<V>, bk.l<V, r> {
        @Override // jk.h.a, jk.g, jk.b
        /* synthetic */ Object call(Object... objArr);
    }

    @Override // jk.l, jk.k, jk.b
    /* synthetic */ Object call(Object... objArr);

    a<V> getSetter();

    void set(V v10);
}
