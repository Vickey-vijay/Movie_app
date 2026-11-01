package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class wv extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f84320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f84321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f84322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f84323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f84324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f84325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f84326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r63 f84327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public uv f84328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public vv f84329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f84330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f84331v;

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f82464j = r83Var;
        this.f82463i = ib3.a((Handler.Callback) null);
        a((Object) null, this.f84320k);
    }

    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, mo moVar, s63 s63Var) {
        if (this.f84329t != null) {
            return;
        }
        b(s63Var);
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f84320k.c();
    }

    @Override // yads.ry, yads.mo
    public final void d() throws vv {
        vv vvVar = this.f84329t;
        if (vvVar != null) {
            throw vvVar;
        }
        super.d();
    }

    public wv(mo moVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        ni.a(z13);
        this.f84320k = (mo) ni.a(moVar);
        this.f84321l = j10;
        this.f84322m = j11;
        this.f84323n = z10;
        this.f84324o = z11;
        this.f84325p = z12;
        this.f84326q = new ArrayList();
        this.f84327r = new r63();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        this.f84329t = null;
        this.f84328s = null;
    }

    public final void b(s63 s63Var) {
        long j10;
        long j11;
        long j12;
        s63Var.a(0, this.f84327r, 0L);
        long j13 = this.f84327r.f82134r;
        if (this.f84328s != null && !this.f84326q.isEmpty() && !this.f84324o) {
            j11 = this.f84330u - j13;
            j12 = this.f84322m != Long.MIN_VALUE ? this.f84331v - j13 : Long.MIN_VALUE;
        } else {
            long j14 = this.f84321l;
            long j15 = this.f84322m;
            if (this.f84325p) {
                long j16 = this.f84327r.f82130n;
                j14 += j16;
                j10 = j16 + j15;
            } else {
                j10 = j15;
            }
            this.f84330u = j13 + j14;
            this.f84331v = j15 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f84326q.size();
            for (int i10 = 0; i10 < size; i10++) {
                tv tvVar = (tv) this.f84326q.get(i10);
                long j17 = this.f84330u;
                long j18 = this.f84331v;
                tvVar.f83185f = j17;
                tvVar.f83186g = j18;
            }
            j11 = j14;
            j12 = j10;
        }
        try {
            uv uvVar = new uv(s63Var, j11, j12);
            this.f84328s = uvVar;
            a(uvVar);
        } catch (vv e10) {
            this.f84329t = e10;
            for (int i11 = 0; i11 < this.f84326q.size(); i11++) {
                ((tv) this.f84326q.get(i11)).f83187h = this.f84329t;
            }
        }
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        if (this.f84326q.remove(pm1Var)) {
            this.f84320k.a(((tv) pm1Var).f83181b);
            if (!this.f84326q.isEmpty() || this.f84324o) {
                return;
            }
            uv uvVar = this.f84328s;
            uvVar.getClass();
            b(uvVar.f81642c);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        tv tvVar = new tv(this.f84320k.a(ym1Var, qeVar, j10), this.f84323n, this.f84330u, this.f84331v);
        this.f84326q.add(tvVar);
        return tvVar;
    }
}
