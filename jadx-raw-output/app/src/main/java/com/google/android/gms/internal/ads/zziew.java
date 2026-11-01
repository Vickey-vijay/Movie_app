package com.google.android.gms.internal.ads;

import ck.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zziew implements Collection, dk.a {
    private final Collection zza;

    public zziew(Collection collection) {
        p.j(collection, "delegate");
        this.zza = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        p.j(collection, "elements");
        return this.zza.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ck.h.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p.j(objArr, "array");
        return ck.h.b(this, objArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new zziex(this.zza.iterator());
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.zza.size();
    }
}
