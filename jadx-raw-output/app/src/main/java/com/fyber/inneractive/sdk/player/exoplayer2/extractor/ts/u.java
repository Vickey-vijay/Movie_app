package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.EOFException;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17324g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f17318a = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17320c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f17319b = new SparseArray();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = new byte[14];
        bVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.a(bArr[13] & 7, false);
        bVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17324g = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f17318a.f17871c = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f17319b.size(); i10++) {
            t tVar = (t) this.f17319b.valueAt(i10);
            tVar.f17316f = false;
            tVar.f17311a.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        h qVar;
        if (!bVar.a(this.f17320c.f17845a, 0, 4, true)) {
            return -1;
        }
        this.f17320c.e(0);
        int iB = this.f17320c.b();
        if (iB == 441) {
            return -1;
        }
        if (iB == 442) {
            bVar.a(this.f17320c.f17845a, 0, 10, false);
            this.f17320c.e(9);
            bVar.a((this.f17320c.j() & 7) + 14);
            return 0;
        }
        if (iB == 443) {
            bVar.a(this.f17320c.f17845a, 0, 2, false);
            this.f17320c.e(0);
            bVar.a(this.f17320c.o() + 6);
            return 0;
        }
        if (((iB & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            bVar.a(1);
            return 0;
        }
        int i10 = iB & 255;
        t tVar = (t) this.f17319b.get(i10);
        if (!this.f17321d) {
            if (tVar == null) {
                boolean z10 = this.f17322e;
                h jVar = null;
                if (z10 || i10 != 189) {
                    if (!z10 && (iB & 224) == 192) {
                        qVar = new q(null);
                        this.f17322e = true;
                    } else if (!this.f17323f && (iB & 240) == 224) {
                        jVar = new j();
                        this.f17323f = true;
                    }
                    if (jVar != null) {
                        jVar.a(this.f17324g, new e0(Integer.MIN_VALUE, i10, 256));
                        t tVar2 = new t(jVar, this.f17318a);
                        this.f17319b.put(i10, tVar2);
                        tVar = tVar2;
                    }
                } else {
                    qVar = new b(null);
                    this.f17322e = true;
                }
                jVar = qVar;
                if (jVar != null) {
                    jVar.a(this.f17324g, new e0(Integer.MIN_VALUE, i10, 256));
                    t tVar3 = new t(jVar, this.f17318a);
                    this.f17319b.put(i10, tVar3);
                    tVar = tVar3;
                }
            }
            if ((this.f17322e && this.f17323f) || bVar.f16452c > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                this.f17321d = true;
                this.f17324g.b();
            }
        }
        bVar.a(this.f17320c.f17845a, 0, 2, false);
        this.f17320c.e(0);
        int iO = this.f17320c.o() + 6;
        if (tVar == null) {
            bVar.a(iO);
        } else {
            this.f17320c.c(iO);
            bVar.b(this.f17320c.f17845a, 0, iO, false);
            this.f17320c.e(6);
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17320c;
            nVar.a(tVar.f17313c.f17841a, 0, 3);
            tVar.f17313c.b(0);
            tVar.f17313c.c(8);
            tVar.f17314d = tVar.f17313c.b();
            tVar.f17315e = tVar.f17313c.b();
            tVar.f17313c.c(6);
            nVar.a(tVar.f17313c.f17841a, 0, tVar.f17313c.a(8));
            tVar.f17313c.b(0);
            tVar.f17317g = 0L;
            if (tVar.f17314d) {
                tVar.f17313c.c(4);
                long jA = ((long) tVar.f17313c.a(3)) << 30;
                tVar.f17313c.c(1);
                long jA2 = jA | ((long) (tVar.f17313c.a(15) << 15));
                tVar.f17313c.c(1);
                long jA3 = jA2 | ((long) tVar.f17313c.a(15));
                tVar.f17313c.c(1);
                if (!tVar.f17316f && tVar.f17315e) {
                    tVar.f17313c.c(4);
                    long jA4 = ((long) tVar.f17313c.a(3)) << 30;
                    tVar.f17313c.c(1);
                    long jA5 = jA4 | ((long) (tVar.f17313c.a(15) << 15));
                    tVar.f17313c.c(1);
                    long jA6 = jA5 | ((long) tVar.f17313c.a(15));
                    tVar.f17313c.c(1);
                    tVar.f17312b.b(jA6);
                    tVar.f17316f = true;
                }
                tVar.f17317g = tVar.f17312b.b(jA3);
            }
            tVar.f17311a.a(true, tVar.f17317g);
            tVar.f17311a.a(nVar);
            tVar.f17311a.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17320c;
            nVar2.d(nVar2.a());
        }
        return 0;
    }
}
