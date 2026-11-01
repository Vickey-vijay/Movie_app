package z3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements q3.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q3.k f86005m = new q3.k() { // from class: z3.g
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return h.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f86007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5.t f86008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g5.t f86009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g5.s f86010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public q3.i f86011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86017l;

    public h() {
        this(0);
    }

    public static /* synthetic */ q3.g[] h() {
        return new q3.g[]{new h()};
    }

    public final int j(q3.h hVar) throws InterruptedException, IOException {
        int i10 = 0;
        while (true) {
            hVar.peekFully(this.f86009d.f53154a, 0, 10);
            this.f86009d.L(0);
            if (this.f86009d.B() != 4801587) {
                break;
            }
            this.f86009d.M(3);
            int iX = this.f86009d.x();
            i10 += iX + 10;
            hVar.advancePeekPosition(iX);
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        if (this.f86013h == -1) {
            this.f86013h = i10;
        }
        return i10;
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        this.f86016k = false;
        this.f86007b.seek();
        this.f86012g = j11;
    }

    public h(int i10) {
        this.f86006a = i10;
        this.f86007b = new i(true);
        this.f86008c = new g5.t(2048);
        this.f86014i = -1;
        this.f86013h = -1L;
        g5.t tVar = new g5.t(10);
        this.f86009d = tVar;
        this.f86010e = new g5.s(tVar.f53154a);
    }

    public static int f(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    @Override // q3.g
    public void c(q3.i iVar) {
        this.f86011f = iVar;
        this.f86007b.c(iVar, new h0.d(0, 1));
        iVar.endTracks();
    }

    public final void e(q3.h hVar) throws InterruptedException, IOException {
        if (this.f86015j) {
            return;
        }
        this.f86014i = -1;
        hVar.resetPeekPosition();
        long j10 = 0;
        if (hVar.getPosition() == 0) {
            j(hVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (hVar.peekFully(this.f86009d.f53154a, 0, 2, true)) {
                    this.f86009d.L(0);
                    if (!i.i(this.f86009d.E())) {
                        break;
                    }
                    if (hVar.peekFully(this.f86009d.f53154a, 0, 4, true)) {
                        this.f86010e.o(14);
                        int iH = this.f86010e.h(13);
                        if (iH <= 6) {
                            this.f86015j = true;
                            throw new ParserException("Malformed ADTS stream");
                        }
                        j10 += (long) iH;
                        i11++;
                        if (i11 != 1000 && hVar.advancePeekPosition(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        hVar.resetPeekPosition();
        if (i10 > 0) {
            this.f86014i = (int) (j10 / ((long) i10));
        } else {
            this.f86014i = -1;
        }
        this.f86015j = true;
    }

    public final q3.s g(long j10) {
        return new q3.c(j10, this.f86013h, f(this.f86014i, this.f86007b.g()), this.f86014i);
    }

    public final void i(long j10, boolean z10, boolean z11) {
        if (this.f86017l) {
            return;
        }
        boolean z12 = z10 && this.f86014i > 0;
        if (z12 && this.f86007b.g() == -9223372036854775807L && !z11) {
            return;
        }
        q3.i iVar = (q3.i) g5.a.e(this.f86011f);
        if (!z12 || this.f86007b.g() == -9223372036854775807L) {
            iVar.e(new q3.s.b(-9223372036854775807L));
        } else {
            iVar.e(g(j10));
        }
        this.f86017l = true;
    }

    @Override // q3.g
    public int a(q3.h hVar, q3.r rVar) throws InterruptedException, IOException {
        boolean z10;
        boolean z11;
        long length = hVar.getLength();
        if ((this.f86006a & 1) != 0 && length != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e(hVar);
        }
        int i10 = hVar.read(this.f86008c.f53154a, 0, 2048);
        if (i10 == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        i(length, z10, z11);
        if (z11) {
            return -1;
        }
        this.f86008c.L(0);
        this.f86008c.K(i10);
        if (!this.f86016k) {
            this.f86007b.packetStarted(this.f86012g, 4);
            this.f86016k = true;
        }
        this.f86007b.b(this.f86008c);
        return 0;
    }

    @Override // q3.g
    public boolean b(q3.h hVar) throws InterruptedException, IOException {
        int iJ = j(hVar);
        int i10 = iJ;
        while (true) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                hVar.peekFully(this.f86009d.f53154a, 0, 2);
                this.f86009d.L(0);
                if (!i.i(this.f86009d.E())) {
                    break;
                }
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hVar.peekFully(this.f86009d.f53154a, 0, 4);
                this.f86010e.o(14);
                int iH = this.f86010e.h(13);
                if (iH <= 6) {
                    return false;
                }
                hVar.advancePeekPosition(iH - 6);
                i12 += iH;
            }
            hVar.resetPeekPosition();
            i10++;
            if (i10 - iJ >= 8192) {
                return false;
            }
            hVar.advancePeekPosition(i10);
        }
    }
}
