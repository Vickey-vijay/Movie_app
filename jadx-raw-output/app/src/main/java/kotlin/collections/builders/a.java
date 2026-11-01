package kotlin.collections.builders;

import ck.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<K, V> extends oj.a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapBuilder<K, V> f62987b;

    public a(MapBuilder<K, V> mapBuilder) {
        p.j(mapBuilder, "backing");
        this.f62987b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        p.j(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f62987b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        p.j(collection, "elements");
        return this.f62987b.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // oj.a
    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "element");
        return this.f62987b.containsEntry$kotlin_stdlib(entry);
    }

    @Override // oj.a
    public boolean g(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        return this.f62987b.removeEntry$kotlin_stdlib(entry);
    }

    @Override // nj.g
    public int getSize() {
        return this.f62987b.size();
    }

    @Override // nj.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f62987b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f62987b.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62987b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        p.j(collection, "elements");
        this.f62987b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
