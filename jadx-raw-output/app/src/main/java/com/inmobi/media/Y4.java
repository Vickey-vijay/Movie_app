package com.inmobi.media;

import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Y4 extends AbstractC2818e0 implements InterfaceC2786cj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3070o1 f23816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f23817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f23818j;

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void a() {
    }

    public final void a(byte[] bArr) {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, lk.c.f63591b) : null));
        }
        C2767c0 c2767c0 = this.f24274f;
        c2767c0.getClass();
        c2767c0.f24102a = SystemClock.elapsedRealtime();
        C3019m0 c3019m0 = this.f24275g;
        nk.j.d(c3019m0.f24793a, null, null, new C2844f0(c3019m0, null), 3, null);
        if (b()) {
            C3053n9 c3053n10 = this.f24273e;
            if (c3053n10 != null) {
                c3053n10.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3070o1 c3070o1 = this.f23816h;
        Ac ac2 = this.f23818j;
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(ac2, "stateMachine");
        C2752bb c2752bb = new C2752bb(c3070o1, ac2);
        Tc tc2 = (Tc) this;
        ck.p.j(c2752bb, "adUnitTimeout");
        C3053n9 c3053n11 = tc2.f24273e;
        if (c3053n11 != null) {
            c3053n11.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        tc2.f23558m.a(new C3057nd(bArr, tc2.f23556k, c2752bb, tc2.f23557l, tc2.f23558m), tc2);
    }

    @Override // com.inmobi.media.InterfaceC2786cj
    public final void c() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(C3070o1 c3070o1, Hc hc2, Ac ac2) {
        super(c3070o1);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(hc2, "publisherCallbacks");
        ck.p.j(ac2, "stateMachine");
        this.f23816h = c3070o1;
        this.f23817i = hc2;
        this.f23818j = ac2;
    }

    public final boolean b() {
        try {
            ck.s.b(Picasso.class).i();
            try {
                ck.s.b(CustomTabsClient.class).i();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            c3053n9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.f23818j.a(new C2804db((short) 2007, inMobiAdRequestStatus, this.f23816h, this.f23817i, this.f23818j), this);
    }
}
