package q3;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import g5.k0;
import java.io.IOException;

/* JADX INFO: compiled from: BinarySearchSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0619a f66403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f66404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f66405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66406d;

    /* JADX INFO: renamed from: q3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class C0619a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f66407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f66410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f66411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f66412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f66413g;

        @Override // q3.s
        public boolean isSeekable() {
            return true;
        }

        public long f(long j10) {
            return this.f66407a.timeUsToTargetTime(j10);
        }

        @Override // q3.s
        public long getDurationUs() {
            return this.f66408b;
        }

        @Override // q3.s
        public s.a getSeekPoints(long j10) {
            return new s.a(new t(j10, c.h(this.f66407a.timeUsToTargetTime(j10), this.f66409c, this.f66410d, this.f66411e, this.f66412f, this.f66413g)));
        }

        public C0619a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f66407a = dVar;
            this.f66408b = j10;
            this.f66409c = j11;
            this.f66410d = j12;
            this.f66411e = j13;
            this.f66412f = j14;
            this.f66413g = j15;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // q3.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f66417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f66418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f66419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f66420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f66421h;

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return k0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f66420g;
        }

        public final long j() {
            return this.f66419f;
        }

        public final long k() {
            return this.f66421h;
        }

        public final long l() {
            return this.f66414a;
        }

        public final long m() {
            return this.f66415b;
        }

        public final void n() {
            this.f66421h = h(this.f66415b, this.f66417d, this.f66418e, this.f66419f, this.f66420g, this.f66416c);
        }

        public final void o(long j10, long j11) {
            this.f66418e = j10;
            this.f66420g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f66417d = j10;
            this.f66419f = j11;
            n();
        }

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f66414a = j10;
            this.f66415b = j11;
            this.f66417d = j12;
            this.f66418e = j13;
            this.f66419f = j14;
            this.f66420g = j15;
            this.f66416c = j16;
            this.f66421h = h(j11, j12, j13, j14, j15, j16);
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface d {
        long timeUsToTargetTime(long j10);
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f66422d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66425c;

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }

        public e(int i10, long j10, long j11) {
            this.f66423a = i10;
            this.f66424b = j10;
            this.f66425c = j11;
        }
    }

    /* JADX INFO: compiled from: BinarySearchSeeker.java */
    public interface f {
        e a(h hVar, long j10) throws InterruptedException, IOException;

        default void onSeekFinished() {
        }
    }

    public final void e(boolean z10, long j10) {
        this.f66405c = null;
        this.f66404b.onSeekFinished();
        f(z10, j10);
    }

    public void f(boolean z10, long j10) {
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f66404b = fVar;
        this.f66406d = i10;
        this.f66403a = new C0619a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f66403a.f(j10), this.f66403a.f66409c, this.f66403a.f66410d, this.f66403a.f66411e, this.f66403a.f66412f, this.f66403a.f66413g);
    }

    public final s b() {
        return this.f66403a;
    }

    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        f fVar = (f) g5.a.e(this.f66404b);
        while (true) {
            c cVar = (c) g5.a.e(this.f66405c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f66406d) {
                e(false, j10);
                return g(hVar, j10, rVar);
            }
            if (!i(hVar, jK)) {
                return g(hVar, jK, rVar);
            }
            hVar.resetPeekPosition();
            e eVarA = fVar.a(hVar, cVar.m());
            int i10 = eVarA.f66423a;
            if (i10 == -3) {
                e(false, jK);
                return g(hVar, jK, rVar);
            }
            if (i10 == -2) {
                cVar.p(eVarA.f66424b, eVarA.f66425c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    e(true, eVarA.f66425c);
                    i(hVar, eVarA.f66425c);
                    return g(hVar, eVarA.f66425c, rVar);
                }
                cVar.o(eVarA.f66424b, eVarA.f66425c);
            }
        }
    }

    public final boolean d() {
        return this.f66405c != null;
    }

    public final void h(long j10) {
        c cVar = this.f66405c;
        if (cVar == null || cVar.l() != j10) {
            this.f66405c = a(j10);
        }
    }

    public final int g(h hVar, long j10, r rVar) {
        if (j10 == hVar.getPosition()) {
            return 0;
        }
        rVar.f66477a = j10;
        return 1;
    }

    public final boolean i(h hVar, long j10) throws InterruptedException, IOException {
        long position = j10 - hVar.getPosition();
        if (position >= 0 && position <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            hVar.skipFully((int) position);
            return true;
        }
        return false;
    }
}
