package kotlin.collections.builders;

import ck.p;
import java.util.Collection;
import java.util.Iterator;
import nj.g;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<E> extends g<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapBuilder<E, ?> f62988b;

    public b(MapBuilder<E, ?> mapBuilder) {
        p.j(mapBuilder, "backing");
        this.f62988b = mapBuilder;
    }

    @Override // nj.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f62988b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f62988b.containsKey(obj);
    }

    @Override // nj.g
    public int getSize() {
        return this.f62988b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f62988b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f62988b.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f62988b.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62988b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62988b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
