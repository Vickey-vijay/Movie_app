package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class kc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f79369a = kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.c().n()).plus(new x10()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz0 f79370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b53 f79371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hz0 f79372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz0 f79373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dz0 f79374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kz0 f79375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x70 f79376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb f79377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb f79378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kb f79379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lr1 f79380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qk.l f79381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qk.u f79382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final pk.d f79383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qk.c f79384p;

    public final void a(g90 g90Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (g90Var instanceof y80) {
            nk.j.d(this.f79369a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof e90) {
            nk.j.d(this.f79369a, null, null, new hc1(this, null), 3, null);
            return;
        }
        if (g90Var instanceof c90) {
            b53 b53Var = this.f79371c;
            boolean z10 = !b53Var.f75735a.f81767a.a().f75763e.f83389a;
            dw2 dw2Var = b53Var.f75735a.f81767a.f81412e.f84440a;
            dw2Var.getClass();
            synchronized (dw2.f76819j) {
                dw2Var.f76824d = z10;
                dw2Var.f76825e = z10;
                dw2Var.f76826f = z10;
                mj.r rVar = mj.r.f64562a;
            }
            nk.j.d(this.f79369a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof b90) {
            p90 p90Var = ((p90) this.f79381m.getValue()).f81312a;
            if (p90Var == null) {
                nk.j.d(this.f79369a, null, null, new gc1(this, h90.f78124a, null), 3, null);
                return;
            }
            p90 p90VarA = p90.a(p90Var, null, null, false, null, 11);
            qk.l lVar = this.f79381m;
            do {
                value4 = lVar.getValue();
            } while (!lVar.a(value4, p90VarA));
            return;
        }
        if (g90Var instanceof a90) {
            p70 p70Var = p70.f81273b;
            p90 p90Var2 = (p90) this.f79381m.getValue();
            p90 p90VarA2 = p90.a(p90Var2, p90Var2, p70Var, false, null, 12);
            qk.l lVar2 = this.f79381m;
            do {
                value3 = lVar2.getValue();
            } while (!lVar2.a(value3, p90VarA2));
            nk.j.d(this.f79369a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof z80) {
            n70 n70Var = new n70(((z80) g90Var).f85241a);
            p90 p90Var3 = (p90) this.f79381m.getValue();
            p90 p90VarA3 = p90.a(p90Var3, p90Var3, n70Var, false, null, 12);
            qk.l lVar3 = this.f79381m;
            do {
                value2 = lVar3.getValue();
            } while (!lVar3.a(value2, p90VarA3));
            nk.j.d(this.f79369a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (!(g90Var instanceof d90)) {
            if (g90Var instanceof f90) {
                nk.j.d(this.f79369a, null, null, new ic1(this, ((f90) g90Var).f77337a, null), 3, null);
                return;
            }
            return;
        }
        s70 s70Var = ((p90) this.f79381m.getValue()).f81313b;
        y90 y90Var = ((d90) g90Var).f76600a;
        s70 o70Var = s70Var instanceof n70 ? new o70(y90Var) : new r70(y90Var.f84854a);
        p90 p90Var4 = (p90) this.f79381m.getValue();
        p90 p90VarA4 = p90.a(p90Var4, p90Var4, o70Var, false, null, 12);
        qk.l lVar4 = this.f79381m;
        do {
            value = lVar4.getValue();
        } while (!lVar4.a(value, p90VarA4));
        nk.j.d(this.f79369a, null, null, new jc1(this, false, null), 3, null);
    }

    public kc1(iz0 iz0Var, b53 b53Var, hz0 hz0Var, fz0 fz0Var, dz0 dz0Var, kz0 kz0Var, x70 x70Var, qb qbVar, nb nbVar, kb kbVar, lr1 lr1Var) {
        this.f79370b = iz0Var;
        this.f79371c = b53Var;
        this.f79372d = hz0Var;
        this.f79373e = fz0Var;
        this.f79374f = dz0Var;
        this.f79375g = kz0Var;
        this.f79376h = x70Var;
        this.f79377i = qbVar;
        this.f79378j = nbVar;
        this.f79379k = kbVar;
        this.f79380l = lr1Var;
        qk.l lVarA = qk.v.a(new p90(null, q70.f81732b, false, nj.s.k()));
        this.f79381m = lVarA;
        this.f79382n = qk.e.b(lVarA);
        pk.d dVarB = pk.g.b(0, null, null, 7, null);
        this.f79383o = dVarB;
        this.f79384p = qk.e.D(dVarB);
    }
}
