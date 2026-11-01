package nj;

import java.util.AbstractList;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f<E> extends AbstractList<E> implements dk.d {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i10, E e10);

    public abstract int getSize();

    public abstract E removeAt(int i10);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i10, E e10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
