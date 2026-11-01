package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes5.dex */
public final class Wb extends A implements NativeAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AdapterNativeAdData f27836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AdapterNativeAdViewBinder f27837y;

    @Override // com.ironsource.A
    public void a(J j10) {
        ck.p.j(j10, "adInstancePresenter");
        j10.a(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wb(W0 w10, B b10, H h10, E e10) {
        super(w10, b10, h10, e10);
        ck.p.j(w10, "adTools");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        ck.p.j(e10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final AdapterNativeAdData I() {
        return this.f27836x;
    }

    public final AdapterNativeAdViewBinder J() {
        return this.f27837y;
    }

    public final void a(Pb pb2) {
        ck.p.j(pb2, "nativeAdBinder");
        pb2.a(this.f27836x);
        pb2.a(this.f27837y);
    }

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object objG = g();
                ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        ck.p.j(adapterNativeAdData, "adapterNativeAdData");
        ck.p.j(adapterNativeAdViewBinder, "nativeAdViewBinder");
        this.f27836x = adapterNativeAdData;
        this.f27837y = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.A
    public void A() {
        if (g() instanceof AdapterNativeAdInterface) {
            AdData adDataI = i();
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                Object objG = g();
                ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
                Context activeContext = ContextProvider.getInstance().getActiveContext();
                ck.p.i(activeContext, "getInstance().activeContext");
                ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
                return;
            }
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
    }
}
