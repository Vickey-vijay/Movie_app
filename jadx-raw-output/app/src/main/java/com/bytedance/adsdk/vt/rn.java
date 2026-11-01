package com.bytedance.adsdk.vt;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class rn<K, V> {
    public rn<K, V>.vt vt;

    public final class ouw<T> implements Iterator<T> {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11339lh;
        public int vt;
        public boolean yu = false;
        public final int ouw = 0;

        public ouw() {
            this.vt = rn.this.ouw();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f11339lh < this.vt;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.yu) {
                throw new IllegalStateException();
            }
            int i10 = this.f11339lh - 1;
            this.f11339lh = i10;
            this.vt--;
            this.yu = false;
            rn.this.vt(i10);
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t10 = (T) rn.this.ouw(this.f11339lh);
                this.f11339lh++;
                this.yu = true;
                return t10;
            }
            throw new NoSuchElementException();
        }
    }

    public final class vt implements Set<K> {
        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return rn.this.yu();
        }

        public vt() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            rn.this.lh();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return rn.this.ouw(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapVt.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int iHashCode = 0;
            for (int iOuw = rn.this.ouw() - 1; iOuw >= 0; iOuw--) {
                Object objOuw = rn.this.ouw(iOuw);
                iHashCode += objOuw == null ? 0 : objOuw.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return rn.this.ouw() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new ouw();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int iOuw = rn.this.ouw(obj);
            if (iOuw < 0) {
                return false;
            }
            rn.this.vt(iOuw);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            int size = mapVt.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapVt.remove(it.next());
            }
            return size != mapVt.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            int size = mapVt.size();
            Iterator<K> it = mapVt.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != mapVt.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return rn.this.ouw();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) rn.this.ouw((Object[]) tArr);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return rn.ouw(this, obj);
        }
    }

    public abstract void lh();

    public abstract int ouw();

    public abstract int ouw(Object obj);

    public abstract Object ouw(int i10);

    public final <T> T[] ouw(T[] tArr) {
        int iOuw = ouw();
        if (tArr.length < iOuw) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iOuw));
        }
        for (int i10 = 0; i10 < iOuw; i10++) {
            tArr[i10] = ouw(i10);
        }
        if (tArr.length > iOuw) {
            tArr[iOuw] = null;
        }
        return tArr;
    }

    public abstract Map<K, V> vt();

    public abstract void vt(int i10);

    public final Object[] yu() {
        int iOuw = ouw();
        Object[] objArr = new Object[iOuw];
        for (int i10 = 0; i10 < iOuw; i10++) {
            objArr[i10] = ouw(i10);
        }
        return objArr;
    }

    public static <T> boolean ouw(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
