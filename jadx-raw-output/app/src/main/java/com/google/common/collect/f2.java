package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: ObjectCountLinkedHashMap.java */
/* JADX INFO: loaded from: classes10.dex */
public class f2<K> extends e2<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient long[] f20609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient int f20610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient int f20611k;

    public f2(int i10) {
        this(i10, 1.0f);
    }

    public final void H(int i10, int i11) {
        if (i10 == -2) {
            this.f20610j = i11;
        } else {
            I(i10, i11);
        }
        if (i11 == -2) {
            this.f20611k = i10;
        } else {
            G(i11, i10);
        }
    }

    public f2(int i10, float f10) {
        super(i10, f10);
    }

    public final int E(int i10) {
        return (int) (this.f20609i[i10] >>> 32);
    }

    public final int F(int i10) {
        return (int) this.f20609i[i10];
    }

    public final void G(int i10, int i11) {
        long[] jArr = this.f20609i;
        jArr[i10] = (jArr[i10] & 4294967295L) | (((long) i11) << 32);
    }

    public final void I(int i10, int i11) {
        long[] jArr = this.f20609i;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (((long) i11) & 4294967295L);
    }

    @Override // com.google.common.collect.e2
    public int e() {
        int i10 = this.f20610j;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.common.collect.e2
    public void a() {
        super.a();
        this.f20610j = -2;
        this.f20611k = -2;
    }

    @Override // com.google.common.collect.e2
    public void n(int i10, float f10) {
        super.n(i10, f10);
        this.f20610j = -2;
        this.f20611k = -2;
        long[] jArr = new long[i10];
        this.f20609i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.e2
    public void o(int i10, K k10, int i11, int i12) {
        super.o(i10, k10, i11, i12);
        H(this.f20611k, i10);
        H(i10, -2);
    }

    @Override // com.google.common.collect.e2
    public void p(int i10) {
        int iC = C() - 1;
        H(E(i10), F(i10));
        if (i10 < iC) {
            H(E(iC), i10);
            H(i10, F(iC));
        }
        super.p(i10);
    }

    @Override // com.google.common.collect.e2
    public int s(int i10) {
        int iF = F(i10);
        if (iF == -2) {
            return -1;
        }
        return iF;
    }

    @Override // com.google.common.collect.e2
    public int t(int i10, int i11) {
        if (i10 == C()) {
            return i11;
        }
        return i10;
    }

    @Override // com.google.common.collect.e2
    public void y(int i10) {
        super.y(i10);
        long[] jArr = this.f20609i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f20609i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }
}
