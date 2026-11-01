package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends c implements b1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f18219d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f18220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18221c;

    public j() {
        this.f18220b = new boolean[10];
        this.f18221c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f18221c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18221c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        boolean[] zArr = this.f18220b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f18220b, i10, zArr2, i10 + 1, this.f18221c - i10);
            this.f18220b = zArr2;
        }
        this.f18220b[i10] = zBooleanValue;
        this.f18221c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f18221c != jVar.f18221c) {
            return false;
        }
        boolean[] zArr = jVar.f18220b;
        for (int i10 = 0; i10 < this.f18221c; i10++) {
            if (this.f18220b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18221c; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f18220b[i11];
            Charset charset = l1.f18232a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    static {
        j jVar = new j(new boolean[0], 0);
        f18219d = jVar;
        jVar.f18157a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j b(int i10) {
        if (i10 >= this.f18221c) {
            return new j(Arrays.copyOf(this.f18220b, i10), this.f18221c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f18221c) {
            return Boolean.valueOf(this.f18220b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18221c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f18221c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f18220b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 >= this.f18221c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f18221c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        boolean[] zArr = this.f18220b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18221c;
    }

    public final void a(boolean z10) {
        c();
        int i10 = this.f18221c;
        boolean[] zArr = this.f18220b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f18220b = zArr2;
        }
        boolean[] zArr3 = this.f18220b;
        int i11 = this.f18221c;
        this.f18221c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f18232a;
        collection.getClass();
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f18221c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18221c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f18220b;
            if (i12 > zArr.length) {
                this.f18220b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(jVar.f18220b, 0, this.f18220b, this.f18221c, jVar.f18221c);
            this.f18221c = i12;
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
        if (i10 >= 0 && i10 < (i11 = this.f18221c)) {
            boolean[] zArr = this.f18220b;
            boolean z10 = zArr[i10];
            if (i10 < i11 - 1) {
                System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
            }
            this.f18221c--;
            ((AbstractList) this).modCount++;
            return Boolean.valueOf(z10);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18221c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            boolean[] zArr = this.f18220b;
            System.arraycopy(zArr, i11, zArr, i10, this.f18221c - i11);
            this.f18221c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public j(boolean[] zArr, int i10) {
        this.f18220b = zArr;
        this.f18221c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }
}
