package p4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import g5.g0;
import g5.i0;
import g5.k0;
import g5.t;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import q3.r;

/* JADX INFO: compiled from: HlsMediaChunk.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends m4.l {
    public static final r H = new r();
    public static final AtomicInteger I = new AtomicInteger();
    public q3.g A;
    public boolean B;
    public n C;
    public int D;
    public boolean E;
    public volatile boolean F;
    public boolean G;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f65920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f65921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f65922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.upstream.a f65923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final e5.h f65924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final q3.g f65925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f65926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f65927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g0 f65928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f65929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f65930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final List<Format> f65931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final DrmInitData f65932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f4.b f65933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f65934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f65935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f65936z;

    public h(f fVar, com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, Format format, boolean z10, @Nullable com.google.android.exoplayer2.upstream.a aVar2, @Nullable e5.h hVar2, boolean z11, Uri uri, @Nullable List<Format> list, int i10, @Nullable Object obj, long j10, long j11, long j12, int i11, boolean z12, boolean z13, g0 g0Var, @Nullable DrmInitData drmInitData, @Nullable q3.g gVar, f4.b bVar, t tVar, boolean z14) {
        super(aVar, hVar, format, i10, obj, j10, j11, j12);
        this.f65935y = z10;
        this.f65921k = i11;
        this.f65924n = hVar2;
        this.f65923m = aVar2;
        this.E = hVar2 != null;
        this.f65936z = z11;
        this.f65922l = uri;
        this.f65926p = z13;
        this.f65928r = g0Var;
        this.f65927q = z12;
        this.f65930t = fVar;
        this.f65931u = list;
        this.f65932v = drmInitData;
        this.f65925o = gVar;
        this.f65933w = bVar;
        this.f65934x = tVar;
        this.f65929s = z14;
        this.f65920j = I.getAndIncrement();
    }

    public static h h(f fVar, com.google.android.exoplayer2.upstream.a aVar, Format format, long j10, com.google.android.exoplayer2.source.hls.playlist.c cVar, int i10, Uri uri, @Nullable List<Format> list, int i11, @Nullable Object obj, boolean z10, o oVar, @Nullable h hVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        e5.h hVar2;
        boolean z11;
        com.google.android.exoplayer2.upstream.a aVarG;
        f4.b bVar;
        t tVar;
        q3.g gVar;
        boolean z12;
        com.google.android.exoplayer2.source.hls.playlist.c.a aVar2 = cVar.f19648o.get(i10);
        e5.h hVar3 = new e5.h(i0.d(cVar.f66517a, aVar2.f19650b), aVar2.f19659k, aVar2.f19660l, null);
        boolean z13 = bArr != null;
        com.google.android.exoplayer2.upstream.a aVarG2 = g(aVar, bArr, z13 ? j((String) g5.a.e(aVar2.f19658j)) : null);
        com.google.android.exoplayer2.source.hls.playlist.c.a aVar3 = aVar2.f19651c;
        if (aVar3 != null) {
            boolean z14 = bArr2 != null;
            byte[] bArrJ = z14 ? j((String) g5.a.e(aVar3.f19658j)) : null;
            e5.h hVar4 = new e5.h(i0.d(cVar.f66517a, aVar3.f19650b), aVar3.f19659k, aVar3.f19660l, null);
            z11 = z14;
            aVarG = g(aVar, bArr2, bArrJ);
            hVar2 = hVar4;
        } else {
            hVar2 = null;
            z11 = false;
            aVarG = null;
        }
        long j11 = j10 + aVar2.f19655g;
        long j12 = j11 + aVar2.f19652d;
        int i12 = cVar.f19641h + aVar2.f19654f;
        if (hVar != null) {
            f4.b bVar2 = hVar.f65933w;
            t tVar2 = hVar.f65934x;
            boolean z15 = (uri.equals(hVar.f65922l) && hVar.G) ? false : true;
            bVar = bVar2;
            tVar = tVar2;
            gVar = (hVar.B && hVar.f65921k == i12 && !z15) ? hVar.A : null;
            z12 = z15;
        } else {
            bVar = new f4.b();
            tVar = new t(10);
            gVar = null;
            z12 = false;
        }
        return new h(fVar, aVarG2, hVar3, format, z13, aVarG, hVar2, z11, uri, list, i11, obj, j11, j12, cVar.f19642i + ((long) i10), i12, aVar2.f19661m, z10, oVar.a(i12), aVar2.f19656h, gVar, bVar, tVar, z12);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void cancelLoad() {
        this.F = true;
    }

    public final void i(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar, boolean z10) throws InterruptedException, IOException {
        e5.h hVarE;
        boolean z11;
        int iA = 0;
        if (z10) {
            z11 = this.D != 0;
            hVarE = hVar;
        } else {
            hVarE = hVar.e(this.D);
            z11 = false;
        }
        try {
            q3.d dVarO = o(aVar, hVarE);
            if (z11) {
                dVarO.skipFully(this.D);
            }
            while (iA == 0) {
                try {
                    if (this.F) {
                        break;
                    } else {
                        iA = this.A.a(dVarO, H);
                    }
                } catch (Throwable th2) {
                    this.D = (int) (dVarO.getPosition() - hVar.f52378e);
                    throw th2;
                }
            }
            this.D = (int) (dVarO.getPosition() - hVar.f52378e);
            k0.m(aVar);
        } catch (Throwable th3) {
            k0.m(aVar);
            throw th3;
        }
    }

    public static com.google.android.exoplayer2.upstream.a g(com.google.android.exoplayer2.upstream.a aVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        g5.a.e(bArr2);
        return new a(aVar, bArr, bArr2);
    }

    @Override // m4.l
    public boolean f() {
        return this.G;
    }

    public void k(n nVar) {
        this.C = nVar;
        nVar.x(this.f65920j, this.f65929s);
    }

    public final void l() throws InterruptedException, IOException {
        if (!this.f65926p) {
            this.f65928r.j();
        } else if (this.f65928r.c() == Long.MAX_VALUE) {
            this.f65928r.h(this.f64046f);
        }
        i(this.f64048h, this.f64041a, this.f65935y);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws InterruptedException, IOException {
        q3.g gVar;
        g5.a.e(this.C);
        if (this.A == null && (gVar = this.f65925o) != null) {
            this.A = gVar;
            this.B = true;
            this.E = false;
        }
        m();
        if (this.F) {
            return;
        }
        if (!this.f65927q) {
            l();
        }
        this.G = true;
    }

    public final void m() throws InterruptedException, IOException {
        if (this.E) {
            g5.a.e(this.f65923m);
            g5.a.e(this.f65924n);
            i(this.f65923m, this.f65924n, this.f65936z);
            this.D = 0;
            this.E = false;
        }
    }

    public final q3.d o(com.google.android.exoplayer2.upstream.a aVar, e5.h hVar) throws InterruptedException, IOException {
        q3.d dVar = new q3.d(aVar, hVar.f52378e, aVar.a(hVar));
        if (this.A == null) {
            long jN = n(dVar);
            dVar.resetPeekPosition();
            f.a aVarA = this.f65930t.a(this.f65925o, hVar.f52374a, this.f64043c, this.f65931u, this.f65928r, aVar.getResponseHeaders(), dVar);
            this.A = aVarA.f65915a;
            this.B = aVarA.f65917c;
            if (aVarA.f65916b) {
                this.C.V(jN != -9223372036854775807L ? this.f65928r.b(jN) : this.f64046f);
            } else {
                this.C.V(0L);
            }
            this.C.I();
            this.A.c(this.C);
        }
        this.C.S(this.f65932v);
        return dVar;
    }

    public static byte[] j(String str) {
        int length;
        if (k0.K0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            length = byteArray.length - 16;
        } else {
            length = 0;
        }
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final long n(q3.h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        try {
            hVar.peekFully(this.f65934x.f53154a, 0, 10);
            this.f65934x.H(10);
            if (this.f65934x.B() != 4801587) {
                return -9223372036854775807L;
            }
            this.f65934x.M(3);
            int iX = this.f65934x.x();
            int i10 = iX + 10;
            if (i10 > this.f65934x.b()) {
                t tVar = this.f65934x;
                byte[] bArr = tVar.f53154a;
                tVar.H(i10);
                System.arraycopy(bArr, 0, this.f65934x.f53154a, 0, 10);
            }
            hVar.peekFully(this.f65934x.f53154a, 10, iX);
            Metadata metadataD = this.f65933w.d(this.f65934x.f53154a, iX);
            if (metadataD == null) {
                return -9223372036854775807L;
            }
            int iD = metadataD.d();
            for (int i11 = 0; i11 < iD; i11++) {
                Metadata.Entry entryC = metadataD.c(i11);
                if (entryC instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryC;
                    if (io.bidmachine.media3.exoplayer.hls.a.PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.f19331c)) {
                        System.arraycopy(privFrame.f19332d, 0, this.f65934x.f53154a, 0, 8);
                        this.f65934x.H(8);
                        return this.f65934x.r() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }
}
