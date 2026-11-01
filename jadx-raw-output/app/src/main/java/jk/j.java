package jk;

import bk.p;
import mj.r;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface j<T, V> extends m<T, V>, h<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<T, V> extends h.a<V>, p<T, V, r> {
        @Override // jk.h.a, jk.g, jk.b
        /* synthetic */ Object call(Object... objArr);
    }

    @Override // jk.m, jk.k, jk.b
    /* synthetic */ Object call(Object... objArr);

    a<T, V> getSetter();
}
