package pl;

import kl.k;
import kl.l;

/* JADX INFO: compiled from: DanmakusRetainer.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f66176a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f66177b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f66178c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f66179d = null;

    /* JADX INFO: renamed from: pl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class C0616b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f66180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ll.e f66181e;

        /* JADX INFO: renamed from: pl.b$b$a */
        /* JADX INFO: compiled from: DanmakusRetainer.java */
        public class a extends k.b<kl.c, f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l f66182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f66183b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public kl.c f66184c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public kl.c f66185d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public kl.c f66186e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f66187f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f66188g;

            @Override // kl.k.b
            public void c() {
                this.f66183b = 0;
                this.f66185d = null;
                this.f66184c = null;
                this.f66187f = false;
            }

            public a() {
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                if (C0616b.this.f66191b) {
                    return 1;
                }
                this.f66183b++;
                if (cVar == this.f66186e) {
                    this.f66184c = null;
                    this.f66187f = false;
                    return 1;
                }
                if (this.f66185d == null) {
                    this.f66185d = cVar;
                    if (cVar.d() != this.f66182a.getHeight()) {
                        return 1;
                    }
                }
                if (this.f66188g < this.f66182a.k()) {
                    this.f66184c = null;
                    return 1;
                }
                l lVar = this.f66182a;
                kl.c cVar2 = this.f66186e;
                boolean zH = ql.a.h(lVar, cVar, cVar2, cVar2.f(), this.f66186e.k().f62916a);
                this.f66187f = zH;
                if (zH) {
                    this.f66188g = (cVar.l() - this.f66182a.getMargin()) - this.f66186e.f62905p;
                    return 0;
                }
                this.f66184c = cVar;
                return 1;
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public f d() {
                f fVar = new f();
                fVar.f66204a = this.f66183b;
                fVar.f66206c = this.f66185d;
                fVar.f66209f = this.f66184c;
                fVar.f66212i = this.f66187f;
                return fVar;
            }
        }

        public C0616b() {
            super();
            this.f66180d = new a();
            this.f66181e = new ll.e(2);
        }

        @Override // pl.b.c, pl.b.e
        public void clear() {
            this.f66191b = true;
            this.f66181e.clear();
        }

        @Override // pl.b.c, pl.b.e
        public void a(kl.c cVar, l lVar, g gVar) {
            boolean z10;
            boolean z11;
            kl.c cVar2;
            kl.c cVar3;
            int i10;
            if (cVar.r()) {
                return;
            }
            boolean zU = cVar.u();
            float fL = zU ? cVar.l() : -1.0f;
            int i11 = 1;
            boolean zB = false;
            boolean z12 = (zU || this.f66181e.isEmpty()) ? false : true;
            if (fL < lVar.k()) {
                fL = lVar.getHeight() - cVar.f62905p;
            }
            kl.c cVar4 = null;
            if (zU) {
                i11 = 0;
            } else {
                this.f66191b = false;
                a aVar = this.f66180d;
                aVar.f66188g = fL;
                aVar.f66182a = lVar;
                aVar.f66186e = cVar;
                this.f66181e.c(aVar);
                f fVarD = this.f66180d.d();
                float f10 = this.f66180d.f66188g;
                if (fVarD != null) {
                    int i12 = fVarD.f66204a;
                    kl.c cVar5 = fVarD.f66206c;
                    kl.c cVar6 = fVarD.f66209f;
                    boolean z13 = fVarD.f66211h;
                    i10 = i12;
                    z11 = fVarD.f66212i;
                    cVar2 = cVar5;
                    cVar3 = cVar6;
                    z10 = z13;
                } else {
                    z10 = zU;
                    z11 = z12;
                    cVar2 = null;
                    cVar3 = null;
                    i10 = 0;
                }
                zB = b(false, cVar, lVar, f10, cVar2, null);
                if (zB) {
                    fL = lVar.getHeight() - cVar.f62905p;
                    z12 = true;
                } else {
                    boolean z14 = f10 >= ((float) lVar.k()) ? false : z11;
                    if (cVar3 != null) {
                        zB = zB;
                        z12 = z14;
                        zU = z10;
                        cVar4 = cVar3;
                        i11 = i10 - 1;
                        fL = f10;
                    } else {
                        z12 = z14;
                        fL = f10;
                        i11 = i10;
                    }
                }
                zU = z10;
                cVar4 = cVar3;
            }
            if (gVar == null || !gVar.a(cVar, fL, i11, z12)) {
                if (zB) {
                    clear();
                }
                cVar.x(lVar, cVar.g(), fL);
                if (zU) {
                    return;
                }
                this.f66181e.g(cVar4);
                this.f66181e.a(cVar);
            }
        }

        @Override // pl.b.d, pl.b.c
        public boolean b(boolean z10, kl.c cVar, l lVar, float f10, kl.c cVar2, kl.c cVar3) {
            if (f10 >= lVar.k()) {
                if (cVar2 == null || cVar2.d() == lVar.getHeight()) {
                    return false;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ll.e f66190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f66191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f66192c;

        /* JADX INFO: compiled from: DanmakusRetainer.java */
        public class a extends k.b<kl.c, f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public l f66193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f66194b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public kl.c f66195c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public kl.c f66196d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public kl.c f66197e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public kl.c f66198f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public kl.c f66199g = null;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f66200h = false;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f66201i = false;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f66202j = false;

            @Override // kl.k.b
            public void c() {
                this.f66194b = 0;
                this.f66198f = null;
                this.f66197e = null;
                this.f66196d = null;
                this.f66195c = null;
                this.f66202j = false;
                this.f66201i = false;
                this.f66200h = false;
            }

            public a() {
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int a(kl.c cVar) {
                if (c.this.f66191b) {
                    return 1;
                }
                this.f66194b++;
                kl.c cVar2 = this.f66199g;
                if (cVar == cVar2) {
                    this.f66195c = cVar;
                    this.f66197e = null;
                    this.f66201i = true;
                    this.f66202j = false;
                    return 1;
                }
                if (this.f66196d == null) {
                    this.f66196d = cVar;
                }
                if (cVar2.f62905p + cVar.l() > this.f66193a.getHeight()) {
                    this.f66200h = true;
                    return 1;
                }
                kl.c cVar3 = this.f66198f;
                if (cVar3 == null || cVar3.i() >= cVar.i()) {
                    this.f66198f = cVar;
                }
                l lVar = this.f66193a;
                kl.c cVar4 = this.f66199g;
                boolean zH = ql.a.h(lVar, cVar, cVar4, cVar4.f(), this.f66199g.k().f62916a);
                this.f66202j = zH;
                if (zH) {
                    this.f66197e = cVar;
                    return 0;
                }
                this.f66195c = cVar;
                return 1;
            }

            @Override // kl.k.b
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public f d() {
                f fVar = new f();
                fVar.f66204a = this.f66194b;
                fVar.f66206c = this.f66196d;
                fVar.f66205b = this.f66195c;
                fVar.f66207d = this.f66197e;
                fVar.f66208e = this.f66198f;
                fVar.f66210g = this.f66200h;
                fVar.f66211h = this.f66201i;
                fVar.f66212i = this.f66202j;
                return fVar;
            }
        }

        public c() {
            this.f66190a = new ll.e(1);
            this.f66191b = false;
            this.f66192c = new a();
        }

        @Override // pl.b.e
        public void clear() {
            this.f66191b = true;
            this.f66190a.clear();
        }

        @Override // pl.b.e
        public void a(kl.c cVar, l lVar, g gVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            kl.c cVar2;
            kl.c cVar3;
            kl.c cVar4;
            kl.c cVar5;
            boolean z13;
            int i10;
            float fK;
            kl.c cVar6;
            boolean z14;
            float fD;
            boolean z15;
            if (cVar.r()) {
                return;
            }
            float fK2 = lVar.k();
            boolean zU = cVar.u();
            int i11 = 1;
            int i12 = 0;
            boolean z16 = (zU || this.f66190a.isEmpty()) ? false : true;
            int margin = lVar.getMargin();
            kl.c cVar7 = null;
            if (zU) {
                z10 = false;
            } else {
                this.f66191b = false;
                a aVar = this.f66192c;
                aVar.f66193a = lVar;
                aVar.f66199g = cVar;
                this.f66190a.c(aVar);
                f fVarD = this.f66192c.d();
                if (fVarD != null) {
                    int i13 = fVarD.f66204a;
                    cVar2 = fVarD.f66205b;
                    cVar3 = fVarD.f66206c;
                    cVar4 = fVarD.f66207d;
                    kl.c cVar8 = fVarD.f66208e;
                    boolean z17 = fVarD.f66210g;
                    z11 = fVarD.f66211h;
                    z12 = fVarD.f66212i;
                    i10 = i13;
                    z13 = z17;
                    cVar5 = cVar8;
                } else {
                    z11 = zU;
                    z12 = z16;
                    cVar2 = null;
                    cVar3 = null;
                    cVar4 = null;
                    cVar5 = null;
                    z13 = false;
                    i10 = 0;
                }
                if (cVar2 != null) {
                    fK = cVar4 != null ? cVar4.d() + margin : cVar2.l();
                    if (cVar2 != cVar) {
                        cVar6 = cVar2;
                        z11 = false;
                    } else {
                        cVar6 = null;
                    }
                    fD = fK;
                    z15 = z12;
                    z14 = true;
                } else if (z13 && cVar5 != null) {
                    cVar6 = null;
                    z11 = false;
                    fD = cVar5.l();
                    z15 = z12;
                    z14 = false;
                } else if (cVar4 != null) {
                    cVar6 = null;
                    z14 = true;
                    fD = cVar4.d() + margin;
                    z15 = false;
                } else if (cVar3 != null) {
                    fK = cVar3.l();
                    cVar6 = cVar3;
                    z11 = false;
                    fD = fK;
                    z15 = z12;
                    z14 = true;
                } else {
                    fK = lVar.k();
                    cVar6 = null;
                    fD = fK;
                    z15 = z12;
                    z14 = true;
                }
                boolean zB = z14 ? b(z13, cVar, lVar, fD, cVar3, cVar4) : false;
                if (zB) {
                    fD = lVar.k();
                    z15 = true;
                } else {
                    i11 = cVar6 != null ? i10 - 1 : i10;
                }
                z10 = zB;
                if (fD == lVar.k()) {
                    zU = false;
                    z16 = z15;
                    cVar7 = cVar6;
                    fK2 = fD;
                    i12 = i11;
                } else {
                    i12 = i11;
                    z16 = z15;
                    zU = z11;
                    cVar7 = cVar6;
                    fK2 = fD;
                }
            }
            if (gVar == null || !gVar.a(cVar, fK2, i12, z16)) {
                if (z10) {
                    clear();
                }
                cVar.x(lVar, cVar.g(), fK2);
                if (zU) {
                    return;
                }
                this.f66190a.g(cVar7);
                this.f66190a.a(cVar);
            }
        }

        public boolean b(boolean z10, kl.c cVar, l lVar, float f10, kl.c cVar2, kl.c cVar3) {
            if (f10 >= lVar.k()) {
                if ((cVar2 == null || cVar2.l() <= 0.0f) && f10 + cVar.f62905p <= lVar.getHeight()) {
                    return false;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class d extends c {
        public d() {
            super();
        }

        @Override // pl.b.c
        public boolean b(boolean z10, kl.c cVar, l lVar, float f10, kl.c cVar2, kl.c cVar3) {
            return f10 + cVar.f62905p > ((float) lVar.getHeight());
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public interface e {
        void a(kl.c cVar, l lVar, g gVar);

        void clear();
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public kl.c f66205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public kl.c f66206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public kl.c f66207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public kl.c f66208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public kl.c f66209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f66210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f66211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f66212i;

        public f() {
            this.f66204a = 0;
            this.f66205b = null;
            this.f66206c = null;
            this.f66207d = null;
            this.f66208e = null;
            this.f66209f = null;
            this.f66210g = false;
            this.f66211h = false;
            this.f66212i = false;
        }
    }

    /* JADX INFO: compiled from: DanmakusRetainer.java */
    public interface g {
        boolean a(kl.c cVar, float f10, int i10, boolean z10);
    }

    public void a(boolean z10) {
        this.f66176a = z10 ? new C0616b() : new c();
        this.f66177b = z10 ? new C0616b() : new c();
        if (this.f66178c == null) {
            this.f66178c = new d();
        }
        if (this.f66179d == null) {
            this.f66179d = new C0616b();
        }
    }

    public void b() {
        e eVar = this.f66176a;
        if (eVar != null) {
            eVar.clear();
        }
        e eVar2 = this.f66177b;
        if (eVar2 != null) {
            eVar2.clear();
        }
        e eVar3 = this.f66178c;
        if (eVar3 != null) {
            eVar3.clear();
        }
        e eVar4 = this.f66179d;
        if (eVar4 != null) {
            eVar4.clear();
        }
    }

    public b(boolean z10) {
        a(z10);
    }

    public void c(kl.c cVar, l lVar, g gVar) {
        int type = cVar.getType();
        if (type != 1) {
            if (type != 4) {
                if (type != 5) {
                    if (type != 6) {
                        if (type == 7) {
                            cVar.x(lVar, 0.0f, 0.0f);
                            return;
                        }
                        return;
                    }
                    this.f66177b.a(cVar, lVar, gVar);
                    return;
                }
                this.f66178c.a(cVar, lVar, gVar);
                return;
            }
            this.f66179d.a(cVar, lVar, gVar);
            return;
        }
        this.f66176a.a(cVar, lVar, gVar);
    }

    public void d() {
        b();
    }
}
