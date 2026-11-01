package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2931ib extends AbstractC2818e0 implements InterfaceC2786cj, InterfaceC2828ea, InterfaceC2869g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f24548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3070o1 f24549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3169s1 f24550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f24551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ac f24552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X f24553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nk.l0 f24554n;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.f24548h;
        if (bArr != null && bArr.length != 0) {
            C2714a c2714a = new C2714a(bArr, this.f24272d.f22935a, this.f24273e);
            this.f24550j.d();
            nk.j.d(this.f24554n, null, null, new C2906hb(c2714a, this, null), 3, null);
        } else {
            C3053n9 c3053n10 = this.f24273e;
            if (c3053n10 != null) {
                c3053n10.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2931ib(byte[] bArr, C3070o1 c3070o1, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(c3070o1);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f24548h = bArr;
        this.f24549i = c3070o1;
        this.f24550j = abstractC3169s1;
        this.f24551k = hc2;
        this.f24552l = ac2;
        this.f24553m = new X(this.f24274f, this.f24275g);
        this.f24554n = P4.a(this.f24270b);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
        F3.a(this.f24554n);
    }

    @Override // com.inmobi.media.InterfaceC2828ea
    public final void e() {
        a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC2869g
    public final void j() {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.f24552l.a(new C3148r5(null, this.f24550j, this.f24549i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.f24552l.a(new M6(map, inMobiAdRequestStatus, this.f24550j, this.f24549i, this.f24551k, this.f24552l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.f24552l.a(new C2804db((short) 2143, inMobiAdRequestStatus, this.f24549i, this.f24551k, this.f24552l), this);
    }
}
