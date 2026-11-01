package yads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class sd1 extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f82614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82616d;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return super.equals(obj);
        }
        sd1 sd1Var = (sd1) obj;
        int i10 = this.f82616d - this.f82615c;
        if (sd1Var.f82616d - sd1Var.f82615c != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82614b[this.f82615c + i11] != sd1Var.f82614b[sd1Var.f82615c + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    public final int[] a() {
        return Arrays.copyOfRange(this.f82614b, this.f82615c, this.f82616d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f82614b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f82616d;
            for (int i11 = this.f82615c; i11 < i10; i11++) {
                if (iArr[i11] == iIntValue) {
                    if (i11 != -1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f82616d - this.f82615c);
        return Integer.valueOf(this.f82614b[this.f82615c + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f82615c; i11 < this.f82616d; i11++) {
            i10 = (i10 * 31) + this.f82614b[i11];
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f82614b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f82615c;
            int i11 = this.f82616d;
            while (i10 < i11) {
                if (iArr[i10] != iIntValue) {
                    i10++;
                } else if (i10 >= 0) {
                    return i10 - this.f82615c;
                }
            }
            i10 = -1;
            if (i10 >= 0) {
                return i10 - this.f82615c;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f82614b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f82615c;
            int i11 = this.f82616d - 1;
            while (i11 >= i10) {
                if (iArr[i11] != iIntValue) {
                    i11--;
                } else if (i11 >= 0) {
                    return i11 - this.f82615c;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - this.f82615c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        ng2.a(i10, this.f82616d - this.f82615c);
        int[] iArr = this.f82614b;
        int i11 = this.f82615c + i10;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82616d - this.f82615c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        ng2.a(i10, i11, this.f82616d - this.f82615c);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        int[] iArr = this.f82614b;
        int i12 = this.f82615c;
        return new sd1(i10 + i12, i12 + i11, iArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f82616d - this.f82615c) * 5);
        sb2.append('[');
        sb2.append(this.f82614b[this.f82615c]);
        int i10 = this.f82615c;
        while (true) {
            i10++;
            if (i10 >= this.f82616d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f82614b[i10]);
        }
    }

    public sd1(int i10, int i11, int[] iArr) {
        this.f82614b = iArr;
        this.f82615c = i10;
        this.f82616d = i11;
    }
}
