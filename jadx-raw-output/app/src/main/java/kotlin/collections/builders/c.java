package kotlin.collections.builders;

import ck.p;
import java.util.Collection;
import java.util.Iterator;
import nj.e;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<V> extends e<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapBuilder<?, V> f62989b;

    public c(MapBuilder<?, V> mapBuilder) {
        p.j(mapBuilder, "backing");
        this.f62989b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        p.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f62989b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f62989b.containsValue(obj);
    }

    @Override // nj.e
    public int e() {
        return this.f62989b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f62989b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f62989b.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f62989b.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62989b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62989b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
