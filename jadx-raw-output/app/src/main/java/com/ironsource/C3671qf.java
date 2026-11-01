package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3671qf extends Eg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vc f30562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yg f30563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final G f30564f;

    @Override // com.ironsource.Eg
    public void a(A a10) {
        A a11;
        ck.p.j(a10, C3605n2.f30210p);
        if (this.f30564f.a(a10)) {
            this.f30562d.a(this.f30563e.b(), a10);
        } else {
            if (!this.f30564f.a() || (a11 = this.f30564f.c().a()) == null) {
                return;
            }
            this.f30562d.a(this.f30563e.b(), a11);
        }
    }

    @Override // com.ironsource.Eg
    public void b(A a10) {
        ck.p.j(a10, C3605n2.f30210p);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3671qf(W0 w10, Vc vc2, yg ygVar, G g10) {
        super(w10, vc2);
        ck.p.j(w10, "adTools");
        ck.p.j(vc2, "outcomeReporter");
        ck.p.j(ygVar, "waterfallInstances");
        ck.p.j(g10, "adInstanceLoadStrategy");
        this.f30562d = vc2;
        this.f30563e = ygVar;
        this.f30564f = g10;
    }

    @Override // com.ironsource.Eg
    public void c(A a10) {
        ck.p.j(a10, "instanceToShow");
        this.f30562d.a(this.f30563e.b(), a10);
    }

    @Override // com.ironsource.Eg
    public void a() {
        A a10 = this.f30564f.c().a();
        if (a10 != null) {
            this.f30562d.a(this.f30563e.b(), a10);
        }
    }
}
