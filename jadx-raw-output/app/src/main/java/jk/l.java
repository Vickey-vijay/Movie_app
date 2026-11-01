package jk;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface l<V> extends k<V>, bk.a<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<V> extends k.a<V>, bk.a<V> {
        @Override // jk.k.a, jk.g, jk.b
        /* synthetic */ Object call(Object... objArr);
    }

    @Override // jk.k, jk.b
    /* synthetic */ Object call(Object... objArr);

    Object getDelegate();

    a<V> getGetter();
}
