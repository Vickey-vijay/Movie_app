package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 extends c implements f1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f18260d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18262c;

    public q0() {
        this.f18261b = new float[10];
        this.f18262c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f18262c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18262c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f18261b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f18261b, i10, fArr2, i10 + 1, this.f18262c - i10);
            this.f18261b = fArr2;
        }
        this.f18261b[i10] = fFloatValue;
        this.f18262c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        if (this.f18262c != q0Var.f18262c) {
            return false;
        }
        float[] fArr = q0Var.f18261b;
        for (int i10 = 0; i10 < this.f18262c; i10++) {
            if (Float.floatToIntBits(this.f18261b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f18262c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f18261b[i10]);
        }
        return iFloatToIntBits;
    }

    static {
        q0 q0Var = new q0(new float[0], 0);
        f18260d = q0Var;
        q0Var.f18157a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q0 b(int i10) {
        if (i10 >= this.f18262c) {
            return new q0(Arrays.copyOf(this.f18261b, i10), this.f18262c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f18262c) {
            return Float.valueOf(this.f18261b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18262c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f18262c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18261b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 >= this.f18262c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18262c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f18261b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18262c;
    }

    public final void a(float f10) {
        c();
        int i10 = this.f18262c;
        float[] fArr = this.f18261b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f18261b = fArr2;
        }
        float[] fArr3 = this.f18261b;
        int i11 = this.f18262c;
        this.f18262c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f18232a;
        collection.getClass();
        if (!(collection instanceof q0)) {
            return super.addAll(collection);
        }
        q0 q0Var = (q0) collection;
        int i10 = q0Var.f18262c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18262c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f18261b;
            if (i12 > fArr.length) {
                this.f18261b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(q0Var.f18261b, 0, this.f18261b, this.f18262c, q0Var.f18262c);
            this.f18262c = i12;
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
        if (i10 >= 0 && i10 < (i11 = this.f18262c)) {
            float[] fArr = this.f18261b;
            float f10 = fArr[i10];
            if (i10 < i11 - 1) {
                System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
            }
            this.f18262c--;
            ((AbstractList) this).modCount++;
            return Float.valueOf(f10);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18262c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            float[] fArr = this.f18261b;
            System.arraycopy(fArr, i11, fArr, i10, this.f18262c - i11);
            this.f18262c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public q0(float[] fArr, int i10) {
        this.f18261b = fArr;
        this.f18262c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
