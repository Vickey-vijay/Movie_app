package v3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import g5.t;
import java.io.EOFException;
import java.io.IOException;
import q3.i;
import q3.k;
import q3.o;
import q3.p;
import q3.q;
import q3.r;
import q3.u;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements q3.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f73021q = new k() { // from class: v3.c
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return e.j();
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f4.b.a f73022r = new f4.b.a() { // from class: v3.d
        @Override // f4.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return e.k(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f73025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f73026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f73027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f73028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f73029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f73030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f73031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Metadata f73032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public f f73033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f73035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f73036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f73037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f73038p;

    public e() {
        this(0);
    }

    public static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static /* synthetic */ q3.g[] j() {
        return new q3.g[]{new e()};
    }

    public static /* synthetic */ boolean k(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        return p(hVar, true);
    }

    public void f() {
        this.f73034l = true;
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f73031i = 0;
        this.f73035m = -9223372036854775807L;
        this.f73036n = 0L;
        this.f73038p = 0;
    }

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Nullable
    public static b l(Metadata metadata, long j10) {
        if (metadata == null) {
            return null;
        }
        int iD = metadata.d();
        for (int i10 = 0; i10 < iD; i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof MlltFrame) {
                return b.a(j10, (MlltFrame) entryC);
            }
        }
        return null;
    }

    @Override // q3.g
    public int a(q3.h hVar, r rVar) throws InterruptedException, IOException {
        if (this.f73031i == 0) {
            try {
                p(hVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f73033k == null) {
            f fVarM = m(hVar);
            b bVarL = l(this.f73032j, hVar.getPosition());
            if (this.f73034l) {
                this.f73033k = new f.a();
            } else {
                if (bVarL != null) {
                    this.f73033k = bVarL;
                } else if (fVarM != null) {
                    this.f73033k = fVarM;
                }
                f fVar = this.f73033k;
                if (fVar == null || (!fVar.isSeekable() && (this.f73023a & 1) != 0)) {
                    this.f73033k = g(hVar);
                }
            }
            this.f73029g.e(this.f73033k);
            u uVar = this.f73030h;
            q qVar = this.f73026d;
            String str = qVar.f66471b;
            int i10 = qVar.f66474e;
            int i11 = qVar.f66473d;
            o oVar = this.f73027e;
            uVar.a(Format.n(null, str, null, -1, 4096, i10, i11, -1, oVar.f66460a, oVar.f66461b, null, null, 0, null, (this.f73023a & 2) != 0 ? null : this.f73032j));
            this.f73037o = hVar.getPosition();
        } else if (this.f73037o != 0) {
            long position = hVar.getPosition();
            long j10 = this.f73037o;
            if (position < j10) {
                hVar.skipFully((int) (j10 - position));
            }
        }
        return o(hVar);
    }

    @Override // q3.g
    public void c(i iVar) {
        this.f73029g = iVar;
        this.f73030h = iVar.track(0, 1);
        this.f73029g.endTracks();
    }

    public final f g(q3.h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f73025c.f53154a, 0, 4);
        this.f73025c.L(0);
        q.e(this.f73025c.j(), this.f73026d);
        return new a(hVar.getLength(), hVar.getPosition(), this.f73026d);
    }

    public final f m(q3.h hVar) throws InterruptedException, IOException {
        t tVar = new t(this.f73026d.f66472c);
        hVar.peekFully(tVar.f53154a, 0, this.f73026d.f66472c);
        q qVar = this.f73026d;
        int i10 = 21;
        if ((qVar.f66470a & 1) != 0) {
            if (qVar.f66474e != 1) {
                i10 = 36;
            }
        } else if (qVar.f66474e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iH = h(tVar, i11);
        if (iH != 1483304551 && iH != 1231971951) {
            if (iH != 1447187017) {
                hVar.resetPeekPosition();
                return null;
            }
            g gVarA = g.a(hVar.getLength(), hVar.getPosition(), this.f73026d, tVar);
            hVar.skipFully(this.f73026d.f66472c);
            return gVarA;
        }
        h hVarA = h.a(hVar.getLength(), hVar.getPosition(), this.f73026d, tVar);
        if (hVarA != null && !this.f73027e.a()) {
            hVar.resetPeekPosition();
            hVar.advancePeekPosition(i11 + 141);
            hVar.peekFully(this.f73025c.f53154a, 0, 3);
            this.f73025c.L(0);
            this.f73027e.d(this.f73025c.B());
        }
        hVar.skipFully(this.f73026d.f66472c);
        return (hVarA == null || hVarA.isSeekable() || iH != 1231971951) ? hVarA : g(hVar);
    }

    public final boolean n(q3.h hVar) throws InterruptedException, IOException {
        f fVar = this.f73033k;
        if (fVar != null) {
            long dataEndPosition = fVar.getDataEndPosition();
            if (dataEndPosition != -1 && hVar.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !hVar.peekFully(this.f73025c.f53154a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int o(q3.h hVar) throws InterruptedException, IOException {
        if (this.f73038p == 0) {
            hVar.resetPeekPosition();
            if (n(hVar)) {
                return -1;
            }
            this.f73025c.L(0);
            int iJ = this.f73025c.j();
            if (!i(iJ, this.f73031i) || q.b(iJ) == -1) {
                hVar.skipFully(1);
                this.f73031i = 0;
                return 0;
            }
            q.e(iJ, this.f73026d);
            if (this.f73035m == -9223372036854775807L) {
                this.f73035m = this.f73033k.getTimeUs(hVar.getPosition());
                if (this.f73024b != -9223372036854775807L) {
                    this.f73035m += this.f73024b - this.f73033k.getTimeUs(0L);
                }
            }
            this.f73038p = this.f73026d.f66472c;
        }
        int iB = this.f73030h.b(hVar, this.f73038p, true);
        if (iB == -1) {
            return -1;
        }
        int i10 = this.f73038p - iB;
        this.f73038p = i10;
        if (i10 > 0) {
            return 0;
        }
        long j10 = this.f73035m;
        long j11 = this.f73036n * 1000000;
        q qVar = this.f73026d;
        this.f73030h.d(j10 + (j11 / ((long) qVar.f66473d)), 1, qVar.f66472c, 0, null);
        this.f73036n += (long) this.f73026d.f66476g;
        this.f73038p = 0;
        return 0;
    }

    public final boolean p(q3.h hVar, boolean z10) throws InterruptedException, IOException {
        int peekPosition;
        int i10;
        int iB;
        int i11 = z10 ? 16384 : 131072;
        hVar.resetPeekPosition();
        if (hVar.getPosition() == 0) {
            Metadata metadataA = this.f73028f.a(hVar, (this.f73023a & 2) == 0 ? null : f73022r);
            this.f73032j = metadataA;
            if (metadataA != null) {
                this.f73027e.c(metadataA);
            }
            peekPosition = (int) hVar.getPeekPosition();
            if (!z10) {
                hVar.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (n(hVar)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f73025c.L(0);
            int iJ = this.f73025c.j();
            if ((i10 == 0 || i(iJ, i10)) && (iB = q.b(iJ)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    q.e(iJ, this.f73026d);
                    i10 = iJ;
                }
                hVar.advancePeekPosition(iB - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z10) {
                    hVar.resetPeekPosition();
                    hVar.advancePeekPosition(peekPosition + i14);
                } else {
                    hVar.skipFully(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            hVar.skipFully(peekPosition + i13);
        } else {
            hVar.resetPeekPosition();
        }
        this.f73031i = i10;
        return true;
    }

    public e(int i10, long j10) {
        this.f73023a = i10;
        this.f73024b = j10;
        this.f73025c = new t(10);
        this.f73026d = new q();
        this.f73027e = new o();
        this.f73035m = -9223372036854775807L;
        this.f73028f = new p();
    }

    public static int h(t tVar, int i10) {
        if (tVar.d() >= i10 + 4) {
            tVar.L(i10);
            int iJ = tVar.j();
            if (iJ == 1483304551 || iJ == 1231971951) {
                return iJ;
            }
        }
        if (tVar.d() >= 40) {
            tVar.L(36);
            if (tVar.j() == 1447187017) {
                return 1447187017;
            }
            return 0;
        }
        return 0;
    }
}
