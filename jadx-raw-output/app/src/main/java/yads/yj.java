package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f85007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f85008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85010i;

    public final boolean a() {
        int i10 = this.f85003b + 1;
        this.f85003b = i10;
        if (i10 == this.f85002a) {
            return false;
        }
        this.f85005d = this.f85006e ? this.f85007f.q() : this.f85007f.n();
        if (this.f85003b == this.f85009h) {
            this.f85004c = this.f85008g.p();
            jb2 jb2Var = this.f85008g;
            jb2Var.e(jb2Var.f78967b + 4);
            int i11 = this.f85010i - 1;
            this.f85010i = i11;
            this.f85009h = i11 > 0 ? this.f85008g.p() - 1 : -1;
        }
        return true;
    }

    public yj(jb2 jb2Var, jb2 jb2Var2, boolean z10) throws ob2 {
        this.f85008g = jb2Var;
        this.f85007f = jb2Var2;
        this.f85006e = z10;
        jb2Var2.e(12);
        this.f85002a = jb2Var2.p();
        jb2Var.e(12);
        this.f85010i = jb2Var.p();
        qq0.a("first_chunk must be 1", jb2Var.b() == 1);
        this.f85003b = -1;
    }
}
