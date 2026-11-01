package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class L2 extends AbstractC3639p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference<O2> f26954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f26955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M2 f26956l;

    public final class a extends AbstractC3639p0.a implements InterfaceC3810z2 {
        @Override // com.ironsource.AbstractC3639p0.a, com.ironsource.E
        public void b(A a10) {
            ck.p.j(a10, C3605n2.f30210p);
            super.b(a10);
            InterfaceC3791y0 interfaceC3791y0I = L2.this.i();
            if (interfaceC3791y0I != null) {
                interfaceC3791y0I.a(a10.e());
            }
        }

        public a() {
            super();
        }

        @Override // com.ironsource.InterfaceC3810z2
        public void a(C3776x2 c3776x2) {
            ck.p.j(c3776x2, C3605n2.f30210p);
            IronLog.INTERNAL.verbose(L2.this.a(c3776x2.q()));
            O2 o10 = (O2) L2.this.f26954j.get();
            if (o10 != null) {
                o10.g();
            }
        }

        @Override // com.ironsource.InterfaceC3810z2
        public void c(C3776x2 c3776x2) {
            ck.p.j(c3776x2, C3605n2.f30210p);
            IronLog.INTERNAL.verbose(L2.this.a(c3776x2.q()));
            O2 o10 = (O2) L2.this.f26954j.get();
            if (o10 != null) {
                o10.h();
            }
        }

        @Override // com.ironsource.InterfaceC3810z2
        public void b(C3776x2 c3776x2) {
            ck.p.j(c3776x2, C3605n2.f30210p);
            IronLog.INTERNAL.verbose(L2.this.a(c3776x2.q()));
            O2 o10 = (O2) L2.this.f26954j.get();
            if (o10 != null) {
                o10.j();
            }
        }
    }

    private final ISBannerSize l() {
        return f().a(this.f26956l.b().h());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(C3621o0 c3621o0, M2 m10, O2 o10) {
        String str;
        int iB;
        super(c3621o0, m10, o10, null, 8, null);
        ck.p.j(c3621o0, "tools");
        ck.p.j(m10, "adUnitData");
        ck.p.j(o10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26954j = new WeakReference<>(o10);
        this.f26955k = new a();
        this.f26956l = m10;
        C3489gd c3489gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c3489gdG);
        if (c3489gdG == null || TextUtils.isEmpty(c3489gdG.c())) {
            ck.w wVar = ck.w.f6066a;
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{c3489gdG == null ? "placement is null" : "placement name is empty"}, 1));
            ck.p.i(str, "format(format, *args)");
            iB = A0.b(m10.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    public final void a(InterfaceC3619ng interfaceC3619ng, InterfaceC3791y0 interfaceC3791y0) {
        ck.p.j(interfaceC3791y0, "displayListener");
        if (interfaceC3619ng != null) {
            a(new B2(interfaceC3619ng), interfaceC3791y0);
        }
    }

    @Override // com.ironsource.AbstractC3639p0
    public C3672r0 b() {
        return new S2(this.f26956l.b(), a(l()));
    }

    @Override // com.ironsource.AbstractC3639p0
    public D a() {
        return new D() { // from class: com.ironsource.ki
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return L2.a(this.f29380a, b10, h10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(L2 l10, B b10, H h10) {
        ck.p.j(l10, "this$0");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        return new C3776x2(new W0(l10.f(), E0.b.PROVIDER), b10, h10, l10.f26955k);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.l.a();
        }
        return ISBannerSize.BANNER;
    }
}
