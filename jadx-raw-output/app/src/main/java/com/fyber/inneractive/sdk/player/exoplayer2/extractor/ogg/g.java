package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17048h = z.a("OggS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f17054f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17055g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17055g;
        nVar.f17846b = 0;
        nVar.f17847c = 0;
        this.f17049a = 0;
        this.f17050b = 0L;
        this.f17051c = 0;
        this.f17052d = 0;
        this.f17053e = 0;
        long j10 = bVar.f16451b;
        if ((j10 != -1 && j10 - (bVar.f16452c + ((long) bVar.f16454e)) < 27) || !bVar.a(nVar.f17845a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f17055g.k() != f17048h) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f17055g.j() != 0) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f17049a = this.f17055g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17055g;
        byte[] bArr = nVar2.f17845a;
        int i10 = nVar2.f17846b;
        long j11 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        nVar2.f17846b = i10 + 8;
        this.f17050b = j11 | ((255 & ((long) bArr[i10 + 7])) << 56);
        nVar2.e();
        this.f17055g.e();
        this.f17055g.e();
        int iJ = this.f17055g.j();
        this.f17051c = iJ;
        this.f17052d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17055g;
        nVar3.f17846b = 0;
        nVar3.f17847c = 0;
        bVar.a(nVar3.f17845a, 0, iJ, false);
        for (int i11 = 0; i11 < this.f17051c; i11++) {
            this.f17054f[i11] = this.f17055g.j();
            this.f17053e += this.f17054f[i11];
        }
        return true;
    }
}
