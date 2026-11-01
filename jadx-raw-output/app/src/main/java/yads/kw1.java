package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class kw1 implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f79605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv1 f79606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh3 f79607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn3 f79608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uv1 f79609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k11 f79610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nt2 f79611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ev f79612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79613i;

    public /* synthetic */ kw1(gw1 gw1Var, xv1 xv1Var) {
        lh3 lh3Var = new lh3();
        zn3 zn3Var = new zn3(gw1Var);
        uv1 uv1Var = new uv1();
        k11 k11Var = new k11();
        Object obj = dw2.f76819j;
        this(gw1Var, xv1Var, lh3Var, zn3Var, uv1Var, k11Var, cw2.a().a(gw1Var.f()));
    }

    @Override // yads.o11
    public final void a(String str) {
        nt2 nt2Var = this.f79611g;
        if (nt2Var == null || !nt2Var.B0 || this.f79613i) {
            ev evVar = this.f79612h;
            if (evVar != null) {
                gw1 gw1Var = this.f79605a;
                rv1 rv1Var = (rv1) evVar;
                if1 if1Var = rv1Var.f82442a;
                if1 if1Var2 = new if1(if1Var.f78621a, if1Var.f78622b, if1Var.f78623c, str, if1Var.f78625e);
                hv hvVar = rv1Var.f82443b;
                l12 l12Var = hvVar.f78388c;
                iv ivVar = l12Var.f79680a;
                oi oiVar = hvVar.f78386a;
                y3 y3Var = hvVar.f78387b;
                kn2 kn2Var = hvVar.f78389d;
                jx0 jx0Var = hvVar.f78390e;
                ivVar.getClass();
                new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var2).onClick(gw1Var);
            }
            this.f79613i = false;
        }
    }

    @Override // yads.o11
    public final void a(hb2 hb2Var, Map map) {
    }

    @Override // yads.o11
    public final void a(boolean z10) {
    }

    public kw1(gw1 gw1Var, xv1 xv1Var, lh3 lh3Var, zn3 zn3Var, uv1 uv1Var, k11 k11Var, nt2 nt2Var) {
        this.f79605a = gw1Var;
        this.f79606b = xv1Var;
        this.f79607c = lh3Var;
        this.f79608d = zn3Var;
        this.f79609e = uv1Var;
        this.f79610f = k11Var;
        this.f79611g = nt2Var;
    }

    @Override // yads.o11
    public final void a() {
        this.f79613i = true;
    }
}
