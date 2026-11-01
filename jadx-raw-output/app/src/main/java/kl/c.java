package kl;

import android.util.SparseArray;

/* JADX INFO: compiled from: BaseDanmaku.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c {
    public String B;
    public boolean C;
    public e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f62891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f62892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f62893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f62894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f62896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f62897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62898i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f62906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f62907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f62908s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m<?> f62913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f62914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f62915z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62899j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f62900k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62901l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62902m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f62903n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f62904o = -1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f62905p = -1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f62909t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f62910u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f62911v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62912w = -1;
    public int A = 0;
    public int E = b.f62888a;
    public int F = 0;
    public int G = -1;
    public i H = null;
    public int I = 0;
    public int J = -1;
    public SparseArray<Object> K = new SparseArray<>();

    public abstract float d();

    public abstract float g();

    public abstract int getType();

    public abstract float[] h(l lVar, long j10);

    public abstract float i();

    public abstract float l();

    public abstract void x(l lVar, float f10, float f11);

    public void A(long j10) {
        this.f62890a = j10;
        this.f62891b = 0L;
    }

    public void B(e eVar) {
        this.D = eVar;
    }

    public void C(boolean z10) {
        if (!z10) {
            this.f62908s = 0;
        } else {
            this.f62909t = this.H.f62922b;
            this.f62908s = 1;
        }
    }

    public long b() {
        i iVar = this.H;
        if (iVar != null && iVar.f62925e == this.f62911v) {
            return this.f62890a + this.f62891b;
        }
        this.f62891b = 0L;
        return this.f62890a;
    }

    public int c() {
        return this.E;
    }

    public m<?> e() {
        return this.f62913x;
    }

    public long f() {
        return this.f62906q.f62920d;
    }

    public long j() {
        return this.f62890a;
    }

    public e k() {
        return this.D;
    }

    public boolean m() {
        if (this.G == this.H.f62923c) {
            return true;
        }
        this.F = 0;
        return false;
    }

    public boolean n() {
        return this.G == this.H.f62923c && this.F != 0;
    }

    public boolean o() {
        e eVar = this.D;
        return eVar == null || eVar.f62916a < b();
    }

    public boolean p() {
        return this.f62904o > -1.0f && this.f62905p > -1.0f && this.f62910u == this.H.f62921a;
    }

    public boolean q() {
        i iVar = this.H;
        if (iVar != null && iVar.f62925e == this.f62911v) {
            return this.f62891b != 0;
        }
        this.f62891b = 0L;
        return false;
    }

    public boolean r() {
        e eVar = this.D;
        return eVar == null || s(eVar.f62916a);
    }

    public boolean t() {
        return this.f62912w == this.H.f62926f;
    }

    public boolean u() {
        return this.f62908s == 1 && this.f62909t == this.H.f62922b;
    }

    public boolean v() {
        e eVar = this.D;
        return eVar == null || w(eVar.f62916a);
    }

    public int a(l lVar) {
        return lVar.q(this);
    }

    public boolean s(long j10) {
        long jB = j10 - b();
        if (jB > 0 && jB < this.f62906q.f62920d) {
            return false;
        }
        return true;
    }

    public boolean w(long j10) {
        if (j10 - b() >= this.f62906q.f62920d) {
            return true;
        }
        return false;
    }

    public void y(l lVar, boolean z10) {
        lVar.l(this, z10);
        this.f62910u = this.H.f62921a;
    }

    public void z(l lVar, boolean z10) {
        lVar.n(this, z10);
        this.f62912w = this.H.f62926f;
    }
}
