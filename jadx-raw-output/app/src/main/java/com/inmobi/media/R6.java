package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class R6 extends AbstractC2818e0 implements InterfaceC2786cj, InterfaceC2828ea, InterfaceC2869g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3070o1 f23433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f23434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3169s1 f23435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f23436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nk.l0 f23437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3056nc f23438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f23439n;

    public final void a(Y y10) {
        V v10 = y10.f23812b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y10.f23811a;
        Objects.toString(v10);
        Objects.toString(inMobiAdRequestStatus);
        V v11 = y10.f23812b;
        if (v11 instanceof Pi) {
            C3019m0 c3019m0 = this.f24275g;
            nk.j.d(c3019m0.f24793a, null, null, new C2994l0(c3019m0, null), 3, null);
            a(y10.f23811a, ((Pi) y10.f23812b).f23342a);
            return;
        }
        if (v11 instanceof J6) {
            a(y10.f23811a, ((J6) v11).f22902a);
        } else if (v11 instanceof K6) {
            a(y10.f23811a, (short) ((K6) v11).f23004a);
        } else {
            if (!(v11 instanceof Ni)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((Ni) v11).f23251a, y10.f23811a);
        }
    }

    public abstract void a(AdResponse adResponse);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(C3070o1 c3070o1, AbstractC3169s1 abstractC3169s1, Ac ac2, Hc hc2) {
        super(c3070o1);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(ac2, "stateMachine");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "publisherCallbacks");
        this.f23433h = c3070o1;
        this.f23434i = ac2;
        this.f23435j = abstractC3169s1;
        this.f23436k = hc2;
        this.f23437l = P4.a(this.f24270b);
        TimeoutConfigurations.MediationConfig mediationConfigX = this.f24271c.getTimeouts().X();
        String str = this.f24272d.f22941g;
        this.f24269a.getClass();
        C3056nc c3056ncA = AbstractC3031mc.a(mediationConfigX, str, "native", Ki.f23020b);
        this.f23438m = c3056ncA;
        this.f23439n = new Z(c3070o1, c3056ncA);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
        F3.a(this.f23437l);
    }

    @Override // com.inmobi.media.InterfaceC2828ea
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        this.f23434i.a(new C3148r5(this.f23433h), this);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-FetchingState", "Initialize Called");
        }
        AbstractC3363zk.b();
        this.f23435j.b();
        nk.j.d(this.f23437l, null, null, new Q6(this, null), 3, null);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.f23434i.a(new M6(map, inMobiAdRequestStatus, this.f23435j, this.f23433h, this.f23436k, this.f23434i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10))), inMobiAdRequestStatus);
    }
}
