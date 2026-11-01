package k4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import k3.t0;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q, q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f62389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public q.a f62390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f62391d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f62392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f62394g;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f62395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f62396c;

        public void a() {
            this.f62396c = false;
        }

        public a(i0 i0Var) {
            this.f62395b = i0Var;
        }

        @Override // k4.i0
        public int b(k3.f0 f0Var, o3.e eVar, boolean z10) {
            if (c.this.g()) {
                return -3;
            }
            if (this.f62396c) {
                eVar.setFlags(4);
                return -4;
            }
            int iB = this.f62395b.b(f0Var, eVar, z10);
            if (iB == -5) {
                Format format = (Format) g5.a.e(f0Var.f62129c);
                int i10 = format.f18986z;
                if (i10 != 0 || format.A != 0) {
                    c cVar = c.this;
                    if (cVar.f62393f != 0) {
                        i10 = 0;
                    }
                    f0Var.f62129c = format.g(i10, cVar.f62394g == Long.MIN_VALUE ? format.A : 0);
                }
                return -5;
            }
            c cVar2 = c.this;
            long j10 = cVar2.f62394g;
            if (j10 == Long.MIN_VALUE || ((iB != -4 || eVar.f64971e < j10) && !(iB == -3 && cVar2.getBufferedPositionUs() == Long.MIN_VALUE && !eVar.f64970d))) {
                return iB;
            }
            eVar.clear();
            eVar.setFlags(4);
            this.f62396c = true;
            return -4;
        }

        @Override // k4.i0
        public boolean isReady() {
            return !c.this.g() && this.f62395b.isReady();
        }

        @Override // k4.i0
        public void maybeThrowError() throws IOException {
            this.f62395b.maybeThrowError();
        }

        @Override // k4.i0
        public int skipData(long j10) {
            if (c.this.g()) {
                return -3;
            }
            return this.f62395b.skipData(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f62391d = new a[i0VarArr.length];
        i0[] i0VarArr2 = new i0[i0VarArr.length];
        int i10 = 0;
        while (true) {
            i0 i0Var = null;
            if (i10 >= i0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f62391d;
            a aVar = (a) i0VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                i0Var = aVar.f62395b;
            }
            i0VarArr2[i10] = i0Var;
            i10++;
        }
        long jD = this.f62389b.d(cVarArr, zArr, i0VarArr2, zArr2, j10);
        if (g()) {
            long j12 = this.f62393f;
            if (j10 == j12 && i(j12, cVarArr)) {
                j11 = jD;
            } else {
                j11 = -9223372036854775807L;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.f62392e = j11;
        if (jD != j10) {
            if (jD >= this.f62393f) {
                long j13 = this.f62394g;
                z10 = j13 == Long.MIN_VALUE || jD <= j13;
            }
        }
        g5.a.f(z10);
        for (int i11 = 0; i11 < i0VarArr.length; i11++) {
            i0 i0Var2 = i0VarArr2[i11];
            if (i0Var2 == null) {
                this.f62391d[i11] = null;
            } else {
                a[] aVarArr2 = this.f62391d;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f62395b != i0Var2) {
                    aVarArr2[i11] = new a(i0Var2);
                }
            }
            i0VarArr[i11] = this.f62391d[i11];
        }
        return jD;
    }

    public static boolean i(long j10, com.google.android.exoplayer2.trackselection.c[] cVarArr) {
        if (j10 != 0) {
            for (com.google.android.exoplayer2.trackselection.c cVar : cVarArr) {
                if (cVar != null && !g5.p.l(cVar.getSelectedFormat().f18970j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        long j11 = this.f62393f;
        if (j10 == j11) {
            return j11;
        }
        return this.f62389b.a(j10, b(j10, t0Var));
    }

    public final t0 b(long j10, t0 t0Var) {
        long jR = g5.k0.r(t0Var.f62285a, 0L, j10 - this.f62393f);
        long j11 = t0Var.f62286b;
        long j12 = this.f62394g;
        long jR2 = g5.k0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jR == t0Var.f62285a && jR2 == t0Var.f62286b) ? t0Var : new t0(jR, jR2);
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f62390c = aVar;
        this.f62389b.c(this, j10);
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        return this.f62389b.continueLoading(j10);
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        this.f62389b.discardBuffer(j10, z10);
    }

    @Override // k4.q.a
    public void f(q qVar) {
        ((q.a) g5.a.e(this.f62390c)).f(this);
    }

    public boolean g() {
        return this.f62392e != -9223372036854775807L;
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f62389b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f62394g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f62389b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f62394g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return this.f62389b.getTrackGroups();
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) g5.a.e(this.f62390c)).e(this);
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        return this.f62389b.isLoading();
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        this.f62389b.maybeThrowPrepareError();
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
        this.f62389b.reevaluateBuffer(j10);
    }

    public c(q qVar, boolean z10, long j10, long j11) {
        long j12;
        this.f62389b = qVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f62392e = j12;
        this.f62393f = j10;
        this.f62394g = j11;
    }

    @Override // k4.q
    public long readDiscontinuity() {
        boolean z10;
        if (g()) {
            long j10 = this.f62392e;
            this.f62392e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            if (discontinuity != -9223372036854775807L) {
                return discontinuity;
            }
            return j10;
        }
        long discontinuity2 = this.f62389b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = true;
        if (discontinuity2 >= this.f62393f) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.f(z10);
        long j11 = this.f62394g;
        if (j11 != Long.MIN_VALUE && discontinuity2 > j11) {
            z11 = false;
        }
        g5.a.f(z11);
        return discontinuity2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // k4.q
    public long seekToUs(long j10) {
        this.f62392e = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f62391d) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long jSeekToUs = this.f62389b.seekToUs(j10);
        if (jSeekToUs != j10) {
            if (jSeekToUs >= this.f62393f) {
                long j11 = this.f62394g;
                if (j11 == Long.MIN_VALUE || jSeekToUs <= j11) {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
        }
        g5.a.f(z10);
        return jSeekToUs;
    }
}
