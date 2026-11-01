package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class q2 extends c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q2 f18263d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18265c;

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i10 = this.f18265c;
        Object[] objArr = this.f18264b;
        if (i10 == objArr.length) {
            this.f18264b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18264b;
        int i11 = this.f18265c;
        this.f18265c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    static {
        q2 q2Var = new q2(new Object[0], 0);
        f18263d = q2Var;
        q2Var.f18157a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i10) {
        if (i10 >= this.f18265c) {
            return new q2(Arrays.copyOf(this.f18264b, i10), this.f18265c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f18265c) {
            return this.f18264b[i10];
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18265c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18265c;
    }

    public q2(Object[] objArr, int i10) {
        this.f18264b = objArr;
        this.f18265c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 >= 0 && i10 < (i11 = this.f18265c)) {
            Object[] objArr = this.f18264b;
            Object obj = objArr[i10];
            if (i10 < i11 - 1) {
                System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
            }
            this.f18265c--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18265c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        c();
        if (i10 >= 0 && i10 < this.f18265c) {
            Object[] objArr = this.f18264b;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            ((AbstractList) this).modCount++;
            return obj2;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18265c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f18265c)) {
            Object[] objArr = this.f18264b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f18264b, i10, objArr2, i10 + 1, this.f18265c - i10);
                this.f18264b = objArr2;
            }
            this.f18264b[i10] = obj;
            this.f18265c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f18265c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
