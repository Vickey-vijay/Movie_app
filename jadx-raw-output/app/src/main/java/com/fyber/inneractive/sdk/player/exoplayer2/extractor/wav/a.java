package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements i, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f17338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f17339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f17340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17342e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return d.a(bVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f17338a = jVar;
        this.f17339b = jVar.a(0, 1);
        this.f17340c = null;
        jVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f17340c;
        return ((bVar.f17350h / ((long) bVar.f17346d)) * 1000000) / ((long) bVar.f17344b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f17342e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        if (this.f17340c == null) {
            b bVarA = d.a(bVar);
            this.f17340c = bVarA;
            if (bVarA != null) {
                int i10 = bVarA.f17344b;
                int i11 = bVarA.f17347e * i10;
                int i12 = bVarA.f17343a;
                this.f17339b.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/raw", i11 * i12, 32768, i12, i10, bVarA.f17348f, -1, -1, null, null, 0, null, null));
                this.f17341d = this.f17340c.f17346d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unsupported or unrecognized wav header.");
            }
        }
        b bVar2 = this.f17340c;
        if (bVar2.f17349g == 0 || bVar2.f17350h == 0) {
            bVar.f16454e = 0;
            n nVar = new n(8);
            c cVarA = c.a(bVar, nVar);
            while (cVarA.f17351a != z.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + cVarA.f17351a);
                long j10 = cVarA.f17352b + 8;
                if (cVarA.f17351a == z.a("RIFF")) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    bVar.a((int) j10);
                    cVarA = c.a(bVar, nVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Chunk is too large (~2GB+) to skip; id: " + cVarA.f17351a);
                }
            }
            bVar.a(8);
            long j11 = bVar.f16452c;
            long j12 = cVarA.f17352b;
            bVar2.f17349g = j11;
            bVar2.f17350h = j12;
            this.f17338a.a(this);
        }
        int iA = this.f17339b.a(bVar, 32768 - this.f17342e, true);
        if (iA != -1) {
            this.f17342e += iA;
        }
        int i13 = this.f17342e;
        int i14 = this.f17341d;
        int i15 = i13 / i14;
        if (i15 > 0) {
            long j13 = ((bVar.f16452c - ((long) i13)) * 1000000) / ((long) this.f17340c.f17345c);
            int i16 = i15 * i14;
            int i17 = i13 - i16;
            this.f17342e = i17;
            this.f17339b.a(j13, 1, i16, i17, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        b bVar = this.f17340c;
        long j11 = (j10 * ((long) bVar.f17345c)) / 1000000;
        long j12 = bVar.f17346d;
        return Math.min((j11 / j12) * j12, bVar.f17350h - j12) + bVar.f17349g;
    }
}
