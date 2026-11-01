package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2832ee implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3207te f24310a;

    public C2832ee(nk.l0 l0Var, C3207te c3207te) {
        this.f24310a = c3207te;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        AbstractC2753bc abstractC2753bc = (AbstractC2753bc) obj;
        Nc nc2 = this.f24310a.f25388b.f25468f;
        nc2.getClass();
        ck.p.j(abstractC2753bc, "mediaEvent");
        if (abstractC2753bc instanceof Em) {
            nc2.f23237a.f23158d = AbstractC2916hl.a(((Em) abstractC2753bc).f22607a);
        } else if (abstractC2753bc instanceof Xm) {
            nc2.f23237a.f23159e = ((Xm) abstractC2753bc).f23806a;
        }
        if (!(abstractC2753bc instanceof Xm)) {
            InterfaceC3028m9 interfaceC3028m9L = this.f24310a.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("NativeRenderedState", "listenMediaEvents - processing media event: " + abstractC2753bc);
            }
            ((Sc) this.f24310a.f25388b.f25475m.getValue()).a(abstractC2753bc);
            C3062ni c3062ni = (C3062ni) this.f24310a.f25388b.f25476n.getValue();
            c3062ni.getClass();
            ck.p.j(abstractC2753bc, "event");
            if (abstractC2753bc instanceof Rl) {
                c3062ni.f24904b.a((Rl) abstractC2753bc);
            }
            C3062ni c3062ni2 = (C3062ni) this.f24310a.f25388b.f25476n.getValue();
            c3062ni2.getClass();
            ck.p.j(abstractC2753bc, "event");
            Ac ac2 = c3062ni2.f24905c.f22585c;
            if (abstractC2753bc instanceof C2992kn) {
                ac2.f();
            } else if (abstractC2753bc instanceof C2918hn) {
                ac2.i();
            } else if (abstractC2753bc instanceof Om) {
                ac2.b();
            } else if (abstractC2753bc instanceof Pl) {
                ac2.h();
            } else if (abstractC2753bc instanceof S1) {
                ac2.a(((S1) abstractC2753bc).f23476a);
            }
            C3062ni c3062ni3 = (C3062ni) this.f24310a.f25388b.f25476n.getValue();
            c3062ni3.getClass();
            ck.p.j(abstractC2753bc, "mediaEvent");
            if (abstractC2753bc instanceof Pl) {
                c3062ni3.f24903a.g();
            }
        }
        return mj.r.f64562a;
    }
}
