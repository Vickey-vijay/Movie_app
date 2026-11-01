package yads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class hk2 extends mo implements ak2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fm1 f78259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zl1 f78260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f78261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yj2 f78262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sk0 f78263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ae0 f78264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f78265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f78266o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f78267p = -9223372036854775807L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f78268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f78269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r83 f78270s;

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        p30 p30VarCreateDataSource = this.f78261j.createDataSource();
        r83 r83Var = this.f78270s;
        if (r83Var != null) {
            p30VarCreateDataSource.a(r83Var);
        }
        Uri uri = this.f78260i.f85472a;
        yj2 yj2Var = this.f78262k;
        ye2 ye2Var = this.f80299g;
        if (ye2Var != null) {
            return new ek2(uri, p30VarCreateDataSource, yj2Var.a(ye2Var), this.f78263l, a(ym1Var), this.f78264m, b(ym1Var), this, qeVar, this.f78260i.f85476e, this.f78265n);
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f78259h;
    }

    @Override // yads.mo
    public final void e() {
        this.f78263l.release();
    }

    public hk2(fm1 fm1Var, o30 o30Var, yj2 yj2Var, sk0 sk0Var, ae0 ae0Var, int i10) {
        this.f78260i = (zl1) ni.a(fm1Var.f77444c);
        this.f78259h = fm1Var;
        this.f78261j = o30Var;
        this.f78262k = yj2Var;
        this.f78263l = sk0Var;
        this.f78264m = ae0Var;
        this.f78265n = i10;
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        s63 fk2Var;
        this.f78270s = r83Var;
        this.f78263l.prepare();
        sk0 sk0Var = this.f78263l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ye2 ye2Var = this.f80299g;
        if (ye2Var != null) {
            sk0Var.a(looperMyLooper, ye2Var);
            long j10 = this.f78267p;
            pz2 pz2Var = new pz2(j10, j10, this.f78268q, this.f78269r, this.f78259h);
            if (this.f78266o) {
                fk2Var = pz2Var;
                fk2Var = new fk2(pz2Var);
            }
            fk2Var = pz2Var;
            a(fk2Var);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        ek2 ek2Var = (ek2) pm1Var;
        if (ek2Var.f77125w) {
            for (ms2 ms2Var : ek2Var.f77122t) {
                ms2Var.a();
                ms2Var.d();
            }
        }
        ek2Var.f77114l.a(ek2Var);
        ek2Var.f77119q.removeCallbacksAndMessages(null);
        ek2Var.f77120r = null;
        ek2Var.M = true;
    }
}
