package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17326b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17330f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f17325a.a(vVar, jVar, e0Var);
        this.f17330f = true;
    }

    public w(v vVar) {
        this.f17325a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f17330f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int iJ = z10 ? nVar.f17846b + nVar.j() : -1;
        if (this.f17330f) {
            if (!z10) {
                return;
            }
            this.f17330f = false;
            nVar.e(iJ);
            this.f17328d = 0;
        }
        while (true) {
            int i10 = nVar.f17847c - nVar.f17846b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f17328d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f17846b - 1);
                    if (iJ2 == 255) {
                        this.f17330f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f17847c - nVar.f17846b, 3 - this.f17328d);
                nVar.a(this.f17326b.f17845a, this.f17328d, iMin);
                int i12 = this.f17328d + iMin;
                this.f17328d = i12;
                if (i12 == 3) {
                    this.f17326b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17326b;
                    nVar2.e(nVar2.f17846b + 1);
                    int iJ3 = this.f17326b.j();
                    int iJ4 = this.f17326b.j();
                    this.f17329e = (iJ3 & 128) != 0;
                    this.f17327c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f17326b.a();
                    int i13 = this.f17327c;
                    if (iA < i13) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17326b;
                        byte[] bArr = nVar3.f17845a;
                        nVar3.c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f17326b.f17845a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f17327c - i11);
                nVar.a(this.f17326b.f17845a, this.f17328d, iMin2);
                int i14 = this.f17328d + iMin2;
                this.f17328d = i14;
                int i15 = this.f17327c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f17329e) {
                        byte[] bArr2 = this.f17326b.f17845a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17880h[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
                        if (i16 != 0) {
                            this.f17330f = true;
                            return;
                        }
                        this.f17326b.c(this.f17327c - 4);
                    } else {
                        this.f17326b.c(i15);
                    }
                    this.f17325a.a(this.f17326b);
                    this.f17328d = 0;
                }
            }
        }
    }
}
