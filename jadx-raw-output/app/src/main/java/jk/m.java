package jk;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface m<T, V> extends k<V>, bk.l<T, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<T, V> extends k.a<V>, bk.l<T, V> {
        @Override // jk.k.a, jk.g, jk.b
        /* synthetic */ Object call(Object... objArr);
    }

    @Override // jk.k, jk.b
    /* synthetic */ Object call(Object... objArr);

    V get(T t10);

    Object getDelegate(T t10);

    a<T, V> getGetter();
}
