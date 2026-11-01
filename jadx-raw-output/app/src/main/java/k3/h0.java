package k3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.q f62143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f62144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4.i0[] f62145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f62148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f62149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0[] f62150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c5.d f62151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k4.r f62152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public h0 f62153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TrackGroupArray f62154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c5.e f62155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f62156n;

    public long b(c5.e eVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= eVar.f5650a) {
                break;
            }
            boolean[] zArr2 = this.f62149g;
            if (z10 || !eVar.b(this.f62155m, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f62145c);
        f();
        this.f62155m = eVar;
        h();
        c5.c cVar = eVar.f5652c;
        long jD = this.f62143a.d(cVar.b(), this.f62149g, this.f62145c, zArr, j10);
        c(this.f62145c);
        this.f62147e = false;
        int i11 = 0;
        while (true) {
            k4.i0[] i0VarArr = this.f62145c;
            if (i11 >= i0VarArr.length) {
                return jD;
            }
            if (i0VarArr[i11] != null) {
                g5.a.f(eVar.c(i11));
                if (this.f62150h[i11].getTrackType() != 6) {
                    this.f62147e = true;
                }
            } else {
                g5.a.f(cVar.a(i11) == null);
            }
            i11++;
        }
    }

    public final void c(k4.i0[] i0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f62150h;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == 6 && this.f62155m.c(i10)) {
                i0VarArr[i10] = new k4.k();
            }
            i10++;
        }
    }

    public final void g(k4.i0[] i0VarArr) {
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f62150h;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (q0VarArr[i10].getTrackType() == 6) {
                i0VarArr[i10] = null;
            }
            i10++;
        }
    }

    public void p(float f10, v0 v0Var) throws ExoPlaybackException {
        this.f62146d = true;
        this.f62154l = this.f62143a.getTrackGroups();
        long jA = a(v(f10, v0Var), this.f62148f.f62164b, false);
        long j10 = this.f62156n;
        i0 i0Var = this.f62148f;
        this.f62156n = j10 + (i0Var.f62164b - jA);
        this.f62148f = i0Var.b(jA);
    }

    public long a(c5.e eVar, long j10, boolean z10) {
        return b(eVar, j10, z10, new boolean[this.f62150h.length]);
    }

    public long i() {
        if (!this.f62146d) {
            return this.f62148f.f62164b;
        }
        long bufferedPositionUs = this.f62147e ? this.f62143a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f62148f.f62167e : bufferedPositionUs;
    }

    @Nullable
    public h0 j() {
        return this.f62153k;
    }

    public long k() {
        if (this.f62146d) {
            return this.f62143a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long l() {
        return this.f62156n;
    }

    public long m() {
        return this.f62148f.f62164b + this.f62156n;
    }

    public TrackGroupArray n() {
        return this.f62154l;
    }

    public c5.e o() {
        return this.f62155m;
    }

    public boolean q() {
        return this.f62146d && (!this.f62147e || this.f62143a.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f62153k == null;
    }

    public c5.e v(float f10, v0 v0Var) throws ExoPlaybackException {
        c5.e eVarE = this.f62151i.e(this.f62150h, n(), this.f62148f.f62163a, v0Var);
        for (com.google.android.exoplayer2.trackselection.c cVar : eVarE.f5652c.b()) {
            if (cVar != null) {
                cVar.onPlaybackSpeed(f10);
            }
        }
        return eVarE;
    }

    public void w(@Nullable h0 h0Var) {
        if (h0Var == this.f62153k) {
            return;
        }
        f();
        this.f62153k = h0Var;
        h();
    }

    public void x(long j10) {
        this.f62156n = j10;
    }

    public h0(q0[] q0VarArr, long j10, c5.d dVar, e5.b bVar, k4.r rVar, i0 i0Var, c5.e eVar) {
        this.f62150h = q0VarArr;
        this.f62156n = j10;
        this.f62151i = dVar;
        this.f62152j = rVar;
        k4.r.a aVar = i0Var.f62163a;
        this.f62144b = aVar.f62602a;
        this.f62148f = i0Var;
        this.f62154l = TrackGroupArray.f19434e;
        this.f62155m = eVar;
        this.f62145c = new k4.i0[q0VarArr.length];
        this.f62149g = new boolean[q0VarArr.length];
        this.f62143a = e(aVar, rVar, bVar, i0Var.f62164b, i0Var.f62166d);
    }

    public static k4.q e(k4.r.a aVar, k4.r rVar, e5.b bVar, long j10, long j11) {
        k4.q qVarJ = rVar.j(aVar, bVar, j10);
        if (j11 != -9223372036854775807L && j11 != Long.MIN_VALUE) {
            return new k4.c(qVarJ, true, 0L, j11);
        }
        return qVarJ;
    }

    public void d(long j10) {
        g5.a.f(r());
        this.f62143a.continueLoading(y(j10));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            c5.e eVar = this.f62155m;
            if (i10 < eVar.f5650a) {
                boolean zC = eVar.c(i10);
                com.google.android.exoplayer2.trackselection.c cVarA = this.f62155m.f5652c.a(i10);
                if (zC && cVarA != null) {
                    cVarA.disable();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            c5.e eVar = this.f62155m;
            if (i10 < eVar.f5650a) {
                boolean zC = eVar.c(i10);
                com.google.android.exoplayer2.trackselection.c cVarA = this.f62155m.f5652c.a(i10);
                if (zC && cVarA != null) {
                    cVarA.enable();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void s(long j10) {
        g5.a.f(r());
        if (this.f62146d) {
            this.f62143a.reevaluateBuffer(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f62148f.f62166d, this.f62152j, this.f62143a);
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }

    public static void u(long j10, k4.r rVar, k4.q qVar) {
        try {
            if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                rVar.c(((k4.c) qVar).f62389b);
            } else {
                rVar.c(qVar);
            }
        } catch (RuntimeException e10) {
            g5.m.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }
}
