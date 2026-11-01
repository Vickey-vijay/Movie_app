package m4;

import com.google.android.exoplayer2.Format;
import g5.k0;
import java.io.IOException;
import q3.u;

/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f64110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Format f64111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f64112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f64113q;

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
    }

    public n(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, int i10, Object obj, long j10, long j11, long j12, int i11, Format format2) {
        super(aVar, hVar, format, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f64110n = i11;
        this.f64111o = format2;
    }

    @Override // m4.l
    public boolean f() {
        return this.f64113q;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        c cVarH = h();
        cVarH.b(0L);
        u uVarTrack = cVarH.track(0, this.f64110n);
        uVarTrack.a(this.f64111o);
        try {
            long jA = this.f64048h.a(this.f64041a.e(this.f64112p));
            if (jA != -1) {
                jA += this.f64112p;
            }
            q3.d dVar = new q3.d(this.f64048h, this.f64112p, jA);
            for (int iB = 0; iB != -1; iB = uVarTrack.b(dVar, Integer.MAX_VALUE, true)) {
                this.f64112p += (long) iB;
            }
            uVarTrack.d(this.f64046f, 1, (int) this.f64112p, 0, null);
            k0.m(this.f64048h);
            this.f64113q = true;
        } catch (Throwable th2) {
            k0.m(this.f64048h);
            throw th2;
        }
    }
}
