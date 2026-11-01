package x3;

import androidx.annotation.VisibleForTesting;
import g5.k0;
import java.io.EOFException;
import java.io.IOException;
import q3.s;
import q3.t;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f74273a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f74276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f74278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f74279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f74280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f74281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f74282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f74283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f74284l;

    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements s {
        public b() {
        }

        @Override // q3.s
        public boolean isSeekable() {
            return true;
        }

        @Override // q3.s
        public long getDurationUs() {
            return a.this.f74276d.a(a.this.f74278f);
        }

        @Override // q3.s
        public s.a getSeekPoints(long j10) {
            return new s.a(new t(j10, k0.r((a.this.f74274b + ((a.this.f74276d.b(j10) * (a.this.f74275c - a.this.f74274b)) / a.this.f74278f)) - 30000, a.this.f74274b, a.this.f74275c - 1)));
        }
    }

    @Override // x3.g
    public long a(q3.h hVar) throws InterruptedException, IOException {
        int i10 = this.f74277e;
        if (i10 == 0) {
            long position = hVar.getPosition();
            this.f74279g = position;
            this.f74277e = 1;
            long j10 = this.f74275c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jG = g(hVar);
                if (jG != -1) {
                    return jG;
                }
                this.f74277e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(hVar);
            this.f74277e = 4;
            return -(this.f74283k + 2);
        }
        this.f74278f = h(hVar);
        this.f74277e = 4;
        return this.f74279g;
    }

    @Override // x3.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b createSeekMap() {
        if (this.f74278f != 0) {
            return new b();
        }
        return null;
    }

    public final long g(q3.h hVar) throws InterruptedException, IOException {
        if (this.f74281i == this.f74282j) {
            return -1L;
        }
        long position = hVar.getPosition();
        if (!j(hVar, this.f74282j)) {
            long j10 = this.f74281i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f74273a.a(hVar, false);
        hVar.resetPeekPosition();
        long j11 = this.f74280h;
        f fVar = this.f74273a;
        long j12 = fVar.f74302c;
        long j13 = j11 - j12;
        int i10 = fVar.f74307h + fVar.f74308i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f74282j = position;
            this.f74284l = j12;
        } else {
            this.f74281i = hVar.getPosition() + ((long) i10);
            this.f74283k = this.f74273a.f74302c;
        }
        long j14 = this.f74282j;
        long j15 = this.f74281i;
        if (j14 - j15 < 100000) {
            this.f74282j = j15;
            return j15;
        }
        long position2 = hVar.getPosition() - (((long) i10) * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f74282j;
        long j17 = this.f74281i;
        return k0.r(position2 + ((j13 * (j16 - j17)) / (this.f74284l - this.f74283k)), j17, j16 - 1);
    }

    @VisibleForTesting
    public void i(q3.h hVar) throws InterruptedException, IOException {
        if (!j(hVar, this.f74275c)) {
            throw new EOFException();
        }
    }

    public final boolean j(q3.h hVar, long j10) throws InterruptedException, IOException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f74275c);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i11 = 0;
            if (hVar.getPosition() + ((long) position) > jMin && (position = (int) (jMin - hVar.getPosition())) < 4) {
                return false;
            }
            hVar.peekFully(bArr, 0, position, false);
            while (true) {
                i10 = position - 3;
                if (i11 < i10) {
                    if (bArr[i11] == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103 && bArr[i11 + 3] == 83) {
                        hVar.skipFully(i11);
                        return true;
                    }
                    i11++;
                }
            }
            hVar.skipFully(i10);
        }
    }

    public final void k(q3.h hVar) throws InterruptedException, IOException {
        this.f74273a.a(hVar, false);
        while (true) {
            f fVar = this.f74273a;
            if (fVar.f74302c > this.f74280h) {
                hVar.resetPeekPosition();
                return;
            }
            hVar.skipFully(fVar.f74307h + fVar.f74308i);
            this.f74281i = hVar.getPosition();
            f fVar2 = this.f74273a;
            this.f74283k = fVar2.f74302c;
            fVar2.a(hVar, false);
        }
    }

    @Override // x3.g
    public void startSeek(long j10) {
        this.f74280h = k0.r(j10, 0L, this.f74278f - 1);
        this.f74277e = 2;
        this.f74281i = this.f74274b;
        this.f74282j = this.f74275c;
        this.f74283k = 0L;
        this.f74284l = this.f74278f;
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        g5.a.a(z11);
        this.f74276d = iVar;
        this.f74274b = j10;
        this.f74275c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f74277e = 0;
        } else {
            this.f74278f = j13;
            this.f74277e = 4;
        }
    }

    @VisibleForTesting
    public long h(q3.h hVar) throws InterruptedException, IOException {
        i(hVar);
        this.f74273a.b();
        while ((this.f74273a.f74301b & 4) != 4 && hVar.getPosition() < this.f74275c) {
            this.f74273a.a(hVar, false);
            f fVar = this.f74273a;
            hVar.skipFully(fVar.f74307h + fVar.f74308i);
        }
        return this.f74273a.f74302c;
    }
}
