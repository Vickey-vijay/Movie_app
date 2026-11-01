package androidx.core.util;

import android.util.SparseLongArray;
import bk.p;
import mj.r;
import nj.g0;
import nj.h0;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SparseLongArrayKt {
    public static final g0 keyIterator(final SparseLongArray sparseLongArray) {
        return new g0() { // from class: androidx.core.util.SparseLongArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // nj.g0
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseLongArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final h0 valueIterator(final SparseLongArray sparseLongArray) {
        return new h0() { // from class: androidx.core.util.SparseLongArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // nj.h0
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseLongArray2.valueAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final boolean contains(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j10) {
        if (sparseLongArray.indexOfValue(j10) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseLongArray sparseLongArray, p<? super Integer, ? super Long, r> pVar) {
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.mo1invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i10, long j10) {
        return sparseLongArray.get(i10, j10);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i10, bk.a<Long> aVar) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return sparseLongArray.valueAt(iIndexOfKey);
        }
        return aVar.invoke().longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i10, long j10) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey >= 0 && j10 == sparseLongArray.valueAt(iIndexOfKey)) {
            sparseLongArray.removeAt(iIndexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(SparseLongArray sparseLongArray, int i10, long j10) {
        sparseLongArray.put(i10, j10);
    }
}
