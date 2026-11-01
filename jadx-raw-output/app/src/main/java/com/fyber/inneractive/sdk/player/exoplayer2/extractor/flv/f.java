package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f16499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f16500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16503f;

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i10 = (iJ >> 4) & 15;
        int i11 = iJ & 15;
        if (i11 != 7) {
            throw new d(m.a("Video format not supported: ", i11));
        }
        this.f16503f = i10;
        return i10 != 5;
    }

    public f(r rVar) {
        super(rVar);
        this.f16499b = new n(l.f17837a);
        this.f16500c = new n(4);
    }

    public final void a(n nVar, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (((long) nVar.l()) * 1000) + j10;
        if (iJ == 0 && !this.f16502e) {
            byte[] bArr = new byte[nVar.f17847c - nVar.f17846b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f17847c - nVar.f17846b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f16501d = aVarA.f17904b;
            this.f16498a.a(o.a(null, "video/avc", -1, aVarA.f17905c, aVarA.f17906d, aVarA.f17903a, -1, aVarA.f17907e, null, -1, null, null));
            this.f16502e = true;
            return;
        }
        if (iJ == 1 && this.f16502e) {
            byte[] bArr2 = this.f16500c.f17845a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = 4 - this.f16501d;
            int i11 = 0;
            while (nVar.f17847c - nVar.f17846b > 0) {
                nVar.a(this.f16500c.f17845a, i10, this.f16501d);
                this.f16500c.e(0);
                int iM = this.f16500c.m();
                this.f16499b.e(0);
                this.f16498a.a(4, this.f16499b);
                this.f16498a.a(iM, nVar);
                i11 = i11 + 4 + iM;
            }
            this.f16498a.a(jL, this.f16503f == 1 ? 1 : 0, i11, 0, null);
        }
    }
}
