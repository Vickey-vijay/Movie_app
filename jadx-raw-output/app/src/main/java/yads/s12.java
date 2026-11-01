package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s12 implements j72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy1 f82493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l12 f82494b;

    @Override // yads.j72
    public final void a(l12 l12Var) {
        l12Var.a();
    }

    @Override // yads.j72
    public final void a(l12 l12Var, gv gvVar) {
        this.f82494b = l12Var;
        fy1 fy1Var = this.f82493a;
        vb vbVar = new vb(l12Var, gvVar, fy1Var.f77549e, new hl3());
        for (oi oiVar : fy1Var.f77546b) {
            pi piVarA = l12Var.a(oiVar);
            if (!(piVarA instanceof pi)) {
                piVarA = null;
            }
            if (piVarA != null) {
                piVarA.c(oiVar.f81050c);
                ck.p.h(oiVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                piVarA.a(oiVar, vbVar);
            }
        }
        lm2 lm2Var = l12Var.f79682c.f84795e;
        jk.k kVar = y12.f84790g[4];
        List list = (List) lm2Var.f79854a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public s12(fy1 fy1Var) {
        this.f82493a = fy1Var;
    }

    @Override // yads.j72
    public final void a() {
        l12 l12Var = this.f82494b;
        if (l12Var != null) {
            for (oi oiVar : this.f82493a.f77546b) {
                pi piVarA = l12Var.a(oiVar);
                if (piVarA instanceof pf0) {
                    ((pf0) piVarA).b(oiVar.f81050c);
                }
            }
        }
    }
}
