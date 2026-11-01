package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17095e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17097b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17099d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int iA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f17845a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f17095e) {
                break;
            }
            nVar.e(nVar.f17846b + 3);
            int i11 = nVar.i();
            i10 += i11 + 10;
            bVar.a(i11, false);
        }
        bVar.f16454e = 0;
        bVar.a(i10, false);
        int i12 = 0;
        int i13 = i10;
        while (true) {
            bVar.a(nVar.f17845a, 0, 5, false);
            nVar.e(0);
            if (nVar.o() != 2935) {
                bVar.f16454e = 0;
                i13++;
                if (i13 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f17845a;
                if (bArr.length < 5) {
                    iA = -1;
                } else {
                    byte b10 = bArr[4];
                    iA = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b10 & 192) >> 6, b10 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                bVar.a(iA - 5, false);
            }
        }
    }

    public a(long j10) {
        this.f17096a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        b bVar = new b(null);
        this.f17098c = bVar;
        bVar.f17108d = "0";
        bVar.f17109e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f17099d = false;
        this.f17098c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        byte[] bArr = this.f17097b.f17845a;
        int i10 = bVar.f16455f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 2786);
            System.arraycopy(bVar.f16453d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr, 0, 2786, 0, true);
        }
        if (iMin != -1) {
            bVar.f16452c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f17097b.e(0);
        this.f17097b.d(iMin);
        if (!this.f17099d) {
            this.f17098c.f17116l = this.f17096a;
            this.f17099d = true;
        }
        this.f17098c.a(this.f17097b);
        return 0;
    }
}
