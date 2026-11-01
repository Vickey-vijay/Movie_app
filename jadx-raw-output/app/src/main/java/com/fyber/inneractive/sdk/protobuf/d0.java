package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c implements c1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f18165d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f18166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18167c;

    public d0() {
        this.f18166b = new double[10];
        this.f18167c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f18167c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18167c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f18166b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f18166b, i10, dArr2, i10 + 1, this.f18167c - i10);
            this.f18166b = dArr2;
        }
        this.f18166b[i10] = dDoubleValue;
        this.f18167c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.f18167c != d0Var.f18167c) {
            return false;
        }
        double[] dArr = d0Var.f18166b;
        for (int i10 = 0; i10 < this.f18167c; i10++) {
            if (Double.doubleToLongBits(this.f18166b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18167c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f18166b[i11]);
            Charset charset = l1.f18232a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    static {
        d0 d0Var = new d0(new double[0], 0);
        f18165d = d0Var;
        d0Var.f18157a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d0 b(int i10) {
        if (i10 >= this.f18167c) {
            return new d0(Arrays.copyOf(this.f18166b, i10), this.f18167c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f18167c) {
            return Double.valueOf(this.f18166b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18167c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f18167c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18166b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 >= this.f18167c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18167c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f18166b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18167c;
    }

    public final void a(double d10) {
        c();
        int i10 = this.f18167c;
        double[] dArr = this.f18166b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f18166b = dArr2;
        }
        double[] dArr3 = this.f18166b;
        int i11 = this.f18167c;
        this.f18167c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f18232a;
        collection.getClass();
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i10 = d0Var.f18167c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18167c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f18166b;
            if (i12 > dArr.length) {
                this.f18166b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(d0Var.f18166b, 0, this.f18166b, this.f18167c, d0Var.f18167c);
            this.f18167c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 >= 0 && i10 < (i11 = this.f18167c)) {
            double[] dArr = this.f18166b;
            double d10 = dArr[i10];
            if (i10 < i11 - 1) {
                System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
            }
            this.f18167c--;
            ((AbstractList) this).modCount++;
            return Double.valueOf(d10);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18167c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            double[] dArr = this.f18166b;
            System.arraycopy(dArr, i11, dArr, i10, this.f18167c - i11);
            this.f18167c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public d0(double[] dArr, int i10) {
        this.f18166b = dArr;
        this.f18167c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
