package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class Xl implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f23805a;

    public Xl(nk.l0 l0Var, C3091om c3091om) {
        this.f23805a = c3091om;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        K3 k10;
        qk.k kVar;
        kotlinx.coroutines.g gVarD;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3053n9 c3053n9 = this.f23805a.f25012e;
        if (c3053n9 != null) {
            c3053n9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + zBooleanValue);
        }
        if (zBooleanValue) {
            C3091om c3091om = this.f23805a;
            C3053n9 c3053n10 = c3091om.f25012e;
            if (c3053n10 != null) {
                c3053n10.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC2830ec interfaceC2830ec = c3091om.f25015h;
            if (interfaceC2830ec == null) {
                ck.p.B("mediaPlayer");
                interfaceC2830ec = null;
            }
            Sd sd2 = (Sd) interfaceC2830ec;
            C3117pn c3117pn = sd2.f23515k;
            c3117pn.f25107d.set(true);
            C3284wg c3284wg = (C3284wg) c3117pn.f25112i.f23770d.getValue();
            c3284wg.f25647b.setValue(Mn.HIDDEN);
            c3284wg.f25651f.set(true);
            H6.a(c3284wg.f25650e);
            c3284wg.f25650e = null;
            C3284wg c3284wg2 = (C3284wg) c3117pn.f25112i.f23770d.getValue();
            c3284wg2.a();
            kotlinx.coroutines.g gVarD2 = nk.j.d(c3117pn.f25104a, nk.w0.c(), null, new C3067nn(new Vm(c3284wg2.f25647b), null, c3117pn), 2, null);
            ArrayList arrayList = c3117pn.f25108e;
            ck.p.j(gVarD2, "<this>");
            ck.p.j(arrayList, "activeJobs");
            arrayList.add(gVarD2);
            c3117pn.a();
            kotlinx.coroutines.g gVarD3 = nk.j.d(sd2.f23505a, null, null, new Ld(new Od(sd2.f23517m), null, sd2), 3, null);
            ArrayList arrayList2 = sd2.f23508d;
            ck.p.j(gVarD3, "<this>");
            ck.p.j(arrayList2, "activeJobs");
            arrayList2.add(gVarD3);
            sd2.f23514j.b();
            C3053n9 c3053n11 = c3091om.f25012e;
            if (c3053n11 != null) {
                c3053n11.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC2830ec interfaceC2830ec2 = c3091om.f25015h;
            if (interfaceC2830ec2 == null) {
                ck.p.B("mediaPlayer");
                interfaceC2830ec2 = null;
            }
            kotlinx.coroutines.g gVarX = qk.e.x(qk.e.A(new C2941im(qk.e.A(((Sd) interfaceC2830ec2).f23517m, new C2966jm(c3091om, null))), new C2991km(c3091om, null)), c3091om.f25009b);
            ArrayList arrayList3 = c3091om.f25013f;
            ck.p.j(gVarX, "<this>");
            ck.p.j(arrayList3, "activeJobs");
            arrayList3.add(gVarX);
            P4.a(c3091om.f25009b, new C3066nm(c3091om, null));
            if (!c3091om.f25010c.f25097b.isEmpty() && (k10 = c3091om.f25016i) != null && (kVar = k10.f22989d) != null && (gVarD = nk.j.d(c3091om.f25009b, null, null, new C2866fm(kVar, null, c3091om), 3, null)) != null) {
                ArrayList arrayList4 = c3091om.f25013f;
                ck.p.j(gVarD, "<this>");
                ck.p.j(arrayList4, "activeJobs");
                arrayList4.add(gVarD);
            }
        } else {
            this.f23805a.b();
        }
        return mj.r.f64562a;
    }
}
