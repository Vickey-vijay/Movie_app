package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f17100a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[5]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17101b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f17102c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f17104e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }

    public a0(b0 b0Var, int i10) {
        this.f17104e = b0Var;
        this.f17103d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2;
        char c10;
        f0 f0VarA;
        int i10;
        int i11;
        if (nVar.j() != 2) {
            return;
        }
        b0 b0Var = this.f17104e;
        int i12 = b0Var.f17120a;
        int i13 = 0;
        if (i12 == 1 || i12 == 2 || b0Var.f17128i == 1) {
            vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.f17121b.get(0);
        } else {
            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(((com.fyber.inneractive.sdk.player.exoplayer2.util.v) b0Var.f17121b.get(0)).f17869a);
            this.f17104e.f17121b.add(vVar);
        }
        nVar.e(nVar.f17846b + 2);
        int iO = nVar.o();
        int i14 = 5;
        nVar.e(nVar.f17846b + 5);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f17100a;
        nVar.a(mVar.f17841a, 0, 2);
        mVar.b(0);
        int i15 = 4;
        this.f17100a.c(4);
        int i16 = 12;
        nVar.e(nVar.f17846b + this.f17100a.a(12));
        b0 b0Var2 = this.f17104e;
        if (b0Var2.f17120a == 2 && b0Var2.f17130k == null) {
            d0 d0Var = new d0(21, null, null, new byte[0]);
            b0 b0Var3 = this.f17104e;
            b0Var3.f17130k = b0Var3.f17124e.a(21, d0Var);
            b0 b0Var4 = this.f17104e;
            b0Var4.f17130k.a(vVar, b0Var4.f17127h, new e0(iO, 21, 8192));
        }
        this.f17101b.clear();
        this.f17102c.clear();
        int i17 = nVar.f17847c - nVar.f17846b;
        while (i17 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar2 = this.f17100a;
            nVar.a(mVar2.f17841a, i13, i14);
            mVar2.b(i13);
            int iA = this.f17100a.a(8);
            this.f17100a.c(3);
            int iA2 = this.f17100a.a(13);
            this.f17100a.c(i15);
            int iA3 = this.f17100a.a(i16);
            int i18 = nVar.f17846b;
            int i19 = i18 + iA3;
            int i20 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (nVar.f17846b < i19) {
                int iJ = nVar.j();
                int iJ2 = nVar.f17846b + nVar.j();
                if (iJ == i14) {
                    long jK = nVar.k();
                    if (jK == b0.f17117l) {
                        i11 = 129;
                    } else if (jK == b0.f17118m) {
                        i11 = 135;
                    } else {
                        if (jK == b0.f17119n) {
                            i11 = 36;
                        }
                        i10 = 4;
                    }
                    i20 = i11;
                    i10 = 4;
                } else {
                    if (iJ == 106) {
                        i11 = 129;
                    } else if (iJ == 122) {
                        i11 = 135;
                    } else if (iJ == 123) {
                        i11 = 138;
                    } else {
                        if (iJ == 10) {
                            strTrim = nVar.b(3).trim();
                        } else {
                            int i21 = 3;
                            if (iJ == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (nVar.f17846b < iJ2) {
                                    String strTrim2 = nVar.b(i21).trim();
                                    nVar.j();
                                    byte[] bArr = new byte[4];
                                    nVar.a(bArr, 0, 4);
                                    arrayList2.add(new c0(strTrim2, bArr));
                                    vVar = vVar;
                                    i21 = 3;
                                }
                                vVar = vVar;
                                i10 = 4;
                                arrayList = arrayList2;
                                i20 = 89;
                            }
                        }
                        i10 = 4;
                    }
                    i20 = i11;
                    i10 = 4;
                }
                int i22 = nVar.f17846b;
                nVar.e((iJ2 - i22) + i22);
                i15 = i10;
                vVar = vVar;
                i14 = 5;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = vVar;
            int i23 = i15;
            nVar.e(i19);
            d0 d0Var2 = new d0(i20, strTrim, arrayList, Arrays.copyOfRange(nVar.f17845a, i18, i19));
            if (iA == 6) {
                iA = i20;
            }
            i17 -= iA3 + 5;
            b0 b0Var5 = this.f17104e;
            int i24 = b0Var5.f17120a == 2 ? iA : iA2;
            if (b0Var5.f17126g.get(i24)) {
                c10 = 21;
            } else {
                b0 b0Var6 = this.f17104e;
                if (b0Var6.f17120a == 2) {
                    c10 = 21;
                    if (iA == 21) {
                        f0VarA = b0Var6.f17130k;
                    }
                    if (this.f17104e.f17120a == 2 || iA2 < this.f17102c.get(i24, 8192)) {
                        this.f17102c.put(i24, iA2);
                        this.f17101b.put(i24, f0VarA);
                    }
                } else {
                    c10 = 21;
                }
                f0VarA = b0Var6.f17124e.a(iA, d0Var2);
                if (this.f17104e.f17120a == 2) {
                    this.f17102c.put(i24, iA2);
                    this.f17101b.put(i24, f0VarA);
                } else {
                    this.f17102c.put(i24, iA2);
                    this.f17101b.put(i24, f0VarA);
                }
            }
            i15 = i23;
            vVar = vVar3;
            i13 = 0;
            i14 = 5;
            i16 = 12;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar4 = vVar;
        int size = this.f17102c.size();
        int i25 = 0;
        while (i25 < size) {
            int iKeyAt = this.f17102c.keyAt(i25);
            this.f17104e.f17126g.put(iKeyAt, true);
            f0 f0Var = (f0) this.f17101b.valueAt(i25);
            if (f0Var != null) {
                b0 b0Var7 = this.f17104e;
                if (f0Var != b0Var7.f17130k) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar = b0Var7.f17127h;
                    e0 e0Var = new e0(iO, iKeyAt, 8192);
                    vVar2 = vVar4;
                    f0Var.a(vVar2, jVar, e0Var);
                } else {
                    vVar2 = vVar4;
                }
                this.f17104e.f17125f.put(this.f17102c.valueAt(i25), f0Var);
            } else {
                vVar2 = vVar4;
            }
            i25++;
            vVar4 = vVar2;
        }
        b0 b0Var8 = this.f17104e;
        if (b0Var8.f17120a == 2) {
            if (b0Var8.f17129j) {
                return;
            }
            b0Var8.f17127h.b();
            b0 b0Var9 = this.f17104e;
            b0Var9.f17128i = 0;
            b0Var9.f17129j = true;
            return;
        }
        b0Var8.f17125f.remove(this.f17103d);
        b0 b0Var10 = this.f17104e;
        int i26 = b0Var10.f17120a == 1 ? 0 : b0Var10.f17128i - 1;
        b0Var10.f17128i = i26;
        if (i26 == 0) {
            b0Var10.f17127h.b();
            this.f17104e.f17129j = true;
        }
    }
}
