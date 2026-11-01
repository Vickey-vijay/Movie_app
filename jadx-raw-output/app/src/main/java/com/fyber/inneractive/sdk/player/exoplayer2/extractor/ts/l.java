package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f17217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17219c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.o f17222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f17223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17226j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17228l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17234r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f17220d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f17221e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f17229m = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f17230n = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17227k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17231o = false;

    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    public final void a(byte[] bArr, int i10, int i11) {
        boolean zC;
        boolean zC2;
        boolean z10;
        boolean z11;
        int iD;
        int i12;
        int iE;
        int iE2;
        int i13;
        int iB;
        if (this.f17227k) {
            int i14 = i11 - i10;
            byte[] bArr2 = this.f17223g;
            int length = bArr2.length;
            int i15 = this.f17224h + i14;
            if (length < i15) {
                this.f17223g = Arrays.copyOf(bArr2, i15 * 2);
            }
            System.arraycopy(bArr, i10, this.f17223g, this.f17224h, i14);
            int i16 = this.f17224h + i14;
            this.f17224h = i16;
            com.fyber.inneractive.sdk.player.exoplayer2.util.o oVar = this.f17222f;
            oVar.f17848a = this.f17223g;
            int i17 = 0;
            oVar.f17850c = 0;
            oVar.f17849b = i16;
            oVar.f17851d = 0;
            oVar.a();
            if (this.f17222f.a(8)) {
                this.f17222f.f();
                int iB2 = this.f17222f.b(2);
                this.f17222f.d(5);
                if (this.f17222f.b()) {
                    this.f17222f.d();
                    if (this.f17222f.b()) {
                        int iD2 = this.f17222f.d();
                        if (!this.f17219c) {
                            this.f17227k = false;
                            k kVar = this.f17230n;
                            kVar.f17205e = iD2;
                            kVar.f17202b = true;
                            return;
                        }
                        if (this.f17222f.b()) {
                            int iD3 = this.f17222f.d();
                            if (this.f17221e.indexOfKey(iD3) < 0) {
                                this.f17227k = false;
                                return;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.j) this.f17221e.get(iD3);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.k) this.f17220d.get(jVar.f17825a);
                            if (kVar2.f17831e) {
                                if (!this.f17222f.a(2)) {
                                    return;
                                } else {
                                    this.f17222f.d(2);
                                }
                            }
                            if (this.f17222f.a(kVar2.f17833g)) {
                                int iB3 = this.f17222f.b(kVar2.f17833g);
                                if (!kVar2.f17832f) {
                                    if (this.f17222f.a(1)) {
                                        zC = this.f17222f.c();
                                        if (!zC) {
                                            zC2 = false;
                                        } else {
                                            if (!this.f17222f.a(1)) {
                                                return;
                                            }
                                            zC2 = this.f17222f.c();
                                            z10 = true;
                                        }
                                        if (this.f17225i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iD = 0;
                                        } else if (!this.f17222f.b()) {
                                            return;
                                        } else {
                                            iD = this.f17222f.d();
                                        }
                                        i12 = kVar2.f17834h;
                                        if (i12 == 0) {
                                            if (!this.f17222f.a(kVar2.f17835i)) {
                                                return;
                                            }
                                            iB = this.f17222f.b(kVar2.f17835i);
                                            if (jVar.f17826b || zC) {
                                                iE = 0;
                                                i13 = iB;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f17222f.b()) {
                                                    return;
                                                }
                                                iE = this.f17222f.e();
                                                i13 = iB;
                                                iE2 = 0;
                                            }
                                        } else if (i12 == 1 || kVar2.f17836j) {
                                            iE = 0;
                                            iE2 = 0;
                                            i13 = 0;
                                        } else {
                                            if (!this.f17222f.b()) {
                                                return;
                                            }
                                            int iE3 = this.f17222f.e();
                                            if (!jVar.f17826b || zC) {
                                                iE = 0;
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = 0;
                                            } else {
                                                if (!this.f17222f.b()) {
                                                    return;
                                                }
                                                i13 = 0;
                                                i17 = iE3;
                                                iE2 = this.f17222f.e();
                                                iE = 0;
                                            }
                                        }
                                        k kVar3 = this.f17230n;
                                        kVar3.f17203c = kVar2;
                                        kVar3.f17204d = iB2;
                                        kVar3.f17205e = iD2;
                                        kVar3.f17206f = iB3;
                                        kVar3.f17207g = iD3;
                                        kVar3.f17208h = zC;
                                        kVar3.f17209i = z10;
                                        kVar3.f17210j = zC2;
                                        kVar3.f17211k = z11;
                                        kVar3.f17212l = iD;
                                        kVar3.f17213m = i13;
                                        kVar3.f17214n = iE;
                                        kVar3.f17215o = i17;
                                        kVar3.f17216p = iE2;
                                        kVar3.f17201a = true;
                                        kVar3.f17202b = true;
                                        this.f17227k = false;
                                    }
                                    return;
                                }
                                zC = false;
                                zC2 = false;
                                z10 = zC2;
                                if (this.f17225i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iD = 0;
                                } else if (!this.f17222f.b()) {
                                    return;
                                } else {
                                    iD = this.f17222f.d();
                                }
                                i12 = kVar2.f17834h;
                                if (i12 == 0) {
                                    if (!this.f17222f.a(kVar2.f17835i)) {
                                        return;
                                    }
                                    iB = this.f17222f.b(kVar2.f17835i);
                                    if (jVar.f17826b) {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    } else {
                                        iE = 0;
                                        i13 = iB;
                                        iE2 = 0;
                                    }
                                } else if (i12 == 1) {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                } else {
                                    iE = 0;
                                    iE2 = 0;
                                    i13 = 0;
                                }
                                k kVar4 = this.f17230n;
                                kVar4.f17203c = kVar2;
                                kVar4.f17204d = iB2;
                                kVar4.f17205e = iD2;
                                kVar4.f17206f = iB3;
                                kVar4.f17207g = iD3;
                                kVar4.f17208h = zC;
                                kVar4.f17209i = z10;
                                kVar4.f17210j = zC2;
                                kVar4.f17211k = z11;
                                kVar4.f17212l = iD;
                                kVar4.f17213m = i13;
                                kVar4.f17214n = iE;
                                kVar4.f17215o = i17;
                                kVar4.f17216p = iE2;
                                kVar4.f17201a = true;
                                kVar4.f17202b = true;
                                this.f17227k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public l(com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar, boolean z10, boolean z11) {
        this.f17217a = rVar;
        this.f17218b = z10;
        this.f17219c = z11;
        byte[] bArr = new byte[128];
        this.f17223g = bArr;
        this.f17222f = new com.fyber.inneractive.sdk.player.exoplayer2.util.o(bArr, 0, 0);
        k kVar = this.f17230n;
        kVar.f17202b = false;
        kVar.f17201a = false;
    }
}
