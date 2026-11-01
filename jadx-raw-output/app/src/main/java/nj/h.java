package nj;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> implements Collection<T>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f64738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64739c;

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r.b(this.f64738b, this.f64739c);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ck.p.j(tArr, "array");
        return (T[]) ck.h.b(this, tArr);
    }

    public h(T[] tArr, boolean z10) {
        ck.p.j(tArr, "values");
        this.f64738b = tArr;
        this.f64739c = z10;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return n.D(this.f64738b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ck.p.j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f64738b.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f64738b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return ck.b.a(this.f64738b);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }
}
