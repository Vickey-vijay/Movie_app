package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class Fc implements ro, InterfaceC2843f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f22638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jc f22639b;

    public final void a() {
        InterfaceC2786cj interfaceC2786cj = this.f22639b.f22924c;
        C3207te c3207te = interfaceC2786cj instanceof C3207te ? (C3207te) interfaceC2786cj : null;
        if (c3207te != null) {
            InterfaceC3028m9 interfaceC3028m9L = c3207te.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "takeAction");
            }
            ((C2957jd) c3207te.f25388b.f25478p.getValue()).b();
        }
    }

    public Fc(Ec ec2) {
        ck.p.j(ec2, "nativeAdUnitComponent");
        this.f22638a = ec2;
        this.f22639b = new Jc(ec2);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return qo.a(this.f22638a.f22583a, d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return qo.a(this.f22638a.f22583a, i10, d10);
    }

    @Override // com.inmobi.media.InterfaceC2843f
    public final Object a(rj.c cVar) {
        Object objA = this.f22639b.a(cVar);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }
}
