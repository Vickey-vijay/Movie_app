package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC2894h extends AbstractC2863fj implements InterfaceC3020m1, InterfaceC2828ea, InterfaceC2869g {
    public final void a(byte[] bArr) {
        Objects.toString(bArr != null ? Integer.valueOf(bArr.length) : "null");
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        Y4 y10 = interfaceC2786cj instanceof Y4 ? (Y4) interfaceC2786cj : null;
        if (y10 != null) {
            y10.a(bArr);
        }
    }

    public final void c() {
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        Y4 y10 = interfaceC2786cj instanceof Y4 ? (Y4) interfaceC2786cj : null;
        if (y10 == null) {
            Kb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3053n9 c3053n9 = y10.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-CreatedState", "fetch called");
        }
        C2767c0 c2767c0 = y10.f24274f;
        c2767c0.getClass();
        c2767c0.f24102a = SystemClock.elapsedRealtime();
        C3019m0 c3019m0 = y10.f24275g;
        nk.j.d(c3019m0.f24793a, null, null, new C2844f0(c3019m0, null), 3, null);
        if (y10.b()) {
            C3053n9 c3053n10 = y10.f24273e;
            if (c3053n10 != null) {
                c3053n10.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3070o1 c3070o1 = y10.f23816h;
        Ac ac2 = y10.f23818j;
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(ac2, "stateMachine");
        C2752bb c2752bb = new C2752bb(c3070o1, ac2);
        Tc tc2 = (Tc) y10;
        ck.p.j(c2752bb, "adUnitTimeout");
        C3053n9 c3053n11 = tc2.f24273e;
        if (c3053n11 != null) {
            c3053n11.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        tc2.f23558m.a(new C2754bd(tc2.f23556k, c2752bb, tc2.f23558m, tc2.f23557l), tc2);
    }

    @Override // com.inmobi.media.InterfaceC2828ea
    public final void e() {
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        InterfaceC2828ea interfaceC2828ea = interfaceC2786cj instanceof InterfaceC2828ea ? (InterfaceC2828ea) interfaceC2786cj : null;
        if (interfaceC2828ea != null) {
            interfaceC2828ea.e();
        }
    }

    public final void g() {
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        AbstractC3161ri abstractC3161ri = interfaceC2786cj instanceof AbstractC3161ri ? (AbstractC3161ri) interfaceC2786cj : null;
        if (abstractC3161ri != null) {
            InterfaceC3028m9 interfaceC3028m9L = abstractC3161ri.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("AUM-RenderedState", "onAdImpression");
            }
            P4.a(abstractC3161ri.k(), new C3112pi(abstractC3161ri, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        InterfaceC2869g interfaceC2869g = interfaceC2786cj instanceof InterfaceC2869g ? (InterfaceC2869g) interfaceC2786cj : null;
        if (interfaceC2869g != null) {
            interfaceC2869g.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2894h(nk.l0 l0Var) {
        super(l0Var);
        ck.p.j(l0Var, "coroutineScope");
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        ck.p.j(inMobiAdRequestStatus, "status");
        Objects.toString(inMobiAdRequestStatus);
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        AbstractC2955jb abstractC2955jb = interfaceC2786cj instanceof AbstractC2955jb ? (AbstractC2955jb) interfaceC2786cj : null;
        if (abstractC2955jb != null) {
            ck.p.j(inMobiAdRequestStatus, "status");
            InterfaceC3028m9 interfaceC3028m9L = abstractC2955jb.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC2955jb.a(inMobiAdRequestStatus, s10);
        }
    }

    public final void a(Map map) {
        ck.p.j(map, "params");
        Objects.toString(map);
        InterfaceC2786cj interfaceC2786cj = ((Ac) this).f22360c;
        AbstractC3161ri abstractC3161ri = interfaceC2786cj instanceof AbstractC3161ri ? (AbstractC3161ri) interfaceC2786cj : null;
        if (abstractC3161ri != null) {
            ck.p.j(map, "params");
            InterfaceC3028m9 interfaceC3028m9L = abstractC3161ri.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("AUM-RenderedState", com.ironsource.Mf.f27056f);
            }
            P4.a(abstractC3161ri.k(), new C3087oi(abstractC3161ri, map, null));
        }
    }
}
