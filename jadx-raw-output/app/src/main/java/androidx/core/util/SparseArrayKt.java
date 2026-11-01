package androidx.core.util;

import android.util.SparseArray;
import bk.p;
import java.util.Iterator;
import mj.r;
import nj.g0;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    public static final class C08181<T> implements Iterator<T>, dk.a {
        public final /* synthetic */ SparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C08181(SparseArray<T> sparseArray) {
            this.$this_valueIterator = sparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <T> g0 keyIterator(final SparseArray<T> sparseArray) {
        return new g0() { // from class: androidx.core.util.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // nj.g0
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        return new C08181(sparseArray);
    }

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t10) {
        if (sparseArray.indexOfValue(t10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, p<? super Integer, ? super T, r> pVar) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.mo1invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i10, T t10) {
        T t11 = sparseArray.get(i10);
        if (t11 != null) {
            return t11;
        }
        return t10;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i10, bk.a<? extends T> aVar) {
        T t10 = sparseArray.get(i10);
        if (t10 == null) {
            return aVar.invoke();
        }
        return t10;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i10, T t10) {
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey >= 0 && ck.p.e(t10, sparseArray.valueAt(iIndexOfKey))) {
            sparseArray.removeAt(iIndexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i10, T t10) {
        sparseArray.put(i10, t10);
    }
}
