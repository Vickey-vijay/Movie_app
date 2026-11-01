package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class K2 extends AbstractC3659q3<InterfaceC3689s0> implements BannerAdListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f26915t = "bannerLayout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f26916u = "bannerSize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.ironsource.mediationsdk.q f26917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f26918s;

    public class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f26919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f26920c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f26919b = view;
            this.f26920c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            K2.this.a(this.f26919b, this.f26920c);
        }
    }

    public class b extends AbstractRunnableC3526ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            K2.this.J();
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC3659q3.h.NONE);
        Object obj = this.f30503c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f30511k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f30505e;
            IronLog.INTERNAL.error(a(str));
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26413j.g(str);
            }
        }
        E0 e11 = this.f30504d;
        if (e11 != null) {
            e11.f26409f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.f30503c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f30511k);
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
    }

    public K2(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.q qVar, C3489gd c3489gd, boolean z10, C3605n2 c3605n2, InterfaceC3689s0 interfaceC3689s0) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, new C3405c1(c3583m0.g(), c3583m0.g().getBannerSettings(), IronSource.a.BANNER), c3605n2, interfaceC3689s0);
        this.f26917r = qVar;
        this.f30507g = c3489gd;
        this.f26918s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else {
            if (this.f30505e == AbstractC3659q3.h.FAILED) {
                return;
            }
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.f30505e));
            if (this.f30504d != null) {
                this.f30504d.f26413j.q(String.format("unexpected onAdOpened, state - %s", this.f30505e));
            }
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public void G() {
        Object obj = this.f30503c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f30511k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f26917r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    public void R() {
        Object obj = this.f30503c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f30511k);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        E0 e10;
        C3489gd c3489gd = this.f30507g;
        if (c3489gd != null && (e10 = this.f30504d) != null) {
            e10.f26412i.f(c3489gd.c());
        }
        Listener listener = this.f30502b;
        if (listener != 0) {
            ((InterfaceC3689s0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        E0 e10;
        C3489gd c3489gd = this.f30507g;
        if (c3489gd != null && (e10 = this.f30504d) != null) {
            e10.f26412i.c(c3489gd.c());
        }
        Listener listener = this.f30502b;
        if (listener != 0) {
            ((InterfaceC3689s0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        E0 e10;
        C3489gd c3489gd = this.f30507g;
        if (c3489gd != null && (e10 = this.f30504d) != null) {
            e10.f26412i.h(c3489gd.c());
        }
        Listener listener = this.f30502b;
        if (listener != 0) {
            ((InterfaceC3689s0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public boolean v() {
        return this.f26918s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (!u().e()) {
            a(view, layoutParams);
        } else {
            u().a(new a(view, layoutParams));
        }
    }

    @Override // com.ironsource.AbstractC3659q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (!u().e()) {
            J();
        } else {
            u().a(new b());
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> mapA = super.a(map);
        C3583m0 c3583m0 = this.f30501a;
        if (c3583m0 != null && this.f26917r != null && TextUtils.isEmpty(c3583m0.g().getCustomNetwork())) {
            mapA.put(f26915t, this.f26917r);
        }
        return mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.f30502b) == 0) {
            return;
        }
        ((InterfaceC3689s0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC3659q3, com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        Map<String, Object> mapA = super.a(b10);
        com.ironsource.mediationsdk.q qVar = this.f26917r;
        if (qVar != null && !qVar.b()) {
            com.ironsource.mediationsdk.l.a(mapA, this.f26917r.getSize());
        }
        if (this.f30507g != null) {
            mapA.put("placement", j());
        }
        return mapA;
    }
}
