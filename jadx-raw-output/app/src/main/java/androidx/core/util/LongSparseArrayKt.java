package androidx.core.util;

import android.util.LongSparseArray;
import bk.p;
import java.util.Iterator;
import mj.r;
import nj.h0;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LongSparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    public static final class C08171<T> implements Iterator<T>, dk.a {
        public final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C08171(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
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
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <T> h0 keyIterator(final LongSparseArray<T> longSparseArray) {
        return new h0() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // nj.h0
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return longSparseArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new C08171(longSparseArray);
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j10) {
        if (longSparseArray.indexOfKey(j10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j10) {
        if (longSparseArray.indexOfKey(j10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t10) {
        if (longSparseArray.indexOfValue(t10) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, p<? super Long, ? super T, r> pVar) {
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.mo1invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j10, T t10) {
        T t11 = longSparseArray.get(j10);
        if (t11 != null) {
            return t11;
        }
        return t10;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j10, bk.a<? extends T> aVar) {
        T t10 = longSparseArray.get(j10);
        if (t10 == null) {
            return aVar.invoke();
        }
        return t10;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        if (longSparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j10, T t10) {
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey >= 0 && ck.p.e(t10, longSparseArray.valueAt(iIndexOfKey))) {
            longSparseArray.removeAt(iIndexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j10, T t10) {
        longSparseArray.put(j10, t10);
    }
}
