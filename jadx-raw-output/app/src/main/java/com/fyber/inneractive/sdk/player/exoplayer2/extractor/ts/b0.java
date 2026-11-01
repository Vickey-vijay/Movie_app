package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f17117l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f17118m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f17119n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f17123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f17124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f17125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f17126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f17130k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = this.f17122c.f17845a;
        bVar.a(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 == 5) {
                    bVar.a(i10);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public b0(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.f17124e = eVar;
        this.f17120a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f17121b = arrayList;
            arrayList.add(vVar);
        } else {
            this.f17121b = Collections.singletonList(vVar);
        }
        this.f17122c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.f17126g = new SparseBooleanArray();
        this.f17125f = new SparseArray();
        this.f17123d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17127h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f17121b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.f17121b.get(i10)).f17871c = -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17122c;
        nVar.f17846b = 0;
        nVar.f17847c = 0;
        this.f17123d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17122c;
        byte[] bArr = nVar.f17845a;
        int i10 = nVar.f17846b;
        if (940 - i10 < 188) {
            int i11 = nVar.f17847c - i10;
            if (i11 > 0) {
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17122c;
            nVar2.f17845a = bArr;
            nVar2.f17847c = i11;
            nVar2.f17846b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17122c;
            int i12 = nVar3.f17847c;
            int i13 = nVar3.f17846b;
            if (i12 - i13 < 188) {
                int i14 = 940 - i12;
                int i15 = bVar.f16455f;
                if (i15 == 0) {
                    iMin = 0;
                } else {
                    iMin = Math.min(i15, i14);
                    System.arraycopy(bVar.f16453d, 0, bArr, i12, iMin);
                    bVar.b(iMin);
                }
                if (iMin == 0) {
                    iMin = bVar.a(bArr, i12, i14, 0, true);
                }
                if (iMin != -1) {
                    bVar.f16452c += (long) iMin;
                }
                if (iMin == -1) {
                    return -1;
                }
                this.f17122c.d(i12 + iMin);
            } else {
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                this.f17122c.e(i13);
                int i16 = i13 + 188;
                if (i16 > i12) {
                    return 0;
                }
                int iB = this.f17122c.b();
                if ((8388608 & iB) != 0) {
                    this.f17122c.e(i16);
                    return 0;
                }
                boolean z10 = true;
                boolean z11 = (4194304 & iB) != 0;
                int i17 = (2096896 & iB) >> 8;
                boolean z12 = (iB & 32) != 0;
                boolean z13 = (iB & 16) != 0;
                if (this.f17120a != 2) {
                    int i18 = iB & 15;
                    int i19 = this.f17123d.get(i17, i18 - 1);
                    this.f17123d.put(i17, i18);
                    if (i19 == i18) {
                        if (z13) {
                            this.f17122c.e(i16);
                            return 0;
                        }
                    } else if (i18 == ((i19 + 1) & 15)) {
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z12) {
                    int iJ = this.f17122c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f17122c;
                    nVar4.e(nVar4.f17846b + iJ);
                }
                if (z13 && (f0Var = (f0) this.f17125f.get(i17)) != null) {
                    if (z10) {
                        f0Var.a();
                    }
                    this.f17122c.d(i16);
                    f0Var.a(this.f17122c, z11);
                    this.f17122c.d(i12);
                }
                this.f17122c.e(i16);
                return 0;
            }
        }
    }

    public final void a() {
        this.f17126g.clear();
        this.f17125f.clear();
        this.f17124e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17125f.put(sparseArray.keyAt(i10), (f0) sparseArray.valueAt(i10));
        }
        this.f17125f.put(0, new w(new z(this)));
        this.f17130k = null;
    }
}
