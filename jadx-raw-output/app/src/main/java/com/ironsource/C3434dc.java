package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;

/* JADX INFO: renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3434dc extends AbstractC3659q3<R0> implements NativeAdListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdapterNativeAdData f28687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdapterNativeAdViewBinder f28688s;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3434dc c3434dc, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        ck.p.j(c3434dc, "this$0");
        ck.p.j(adapterNativeAdData, "$adapterNativeAdData");
        ck.p.j(adapterNativeAdViewBinder, "$nativeAdViewBinder");
        c3434dc.a(adapterNativeAdData, adapterNativeAdViewBinder);
    }

    public final void P() {
        C3402bg c3402bg;
        Ab ab2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC3659q3.h.NONE);
        Object obj = this.f30503c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                ck.p.h(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData adData = this.f30511k;
                ck.p.i(adData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(adData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            E0 e10 = this.f30504d;
            if (e10 != null && (c3402bg = e10.f26413j) != null) {
                c3402bg.g(str);
            }
        }
        E0 e11 = this.f30504d;
        if (e11 == null || (ab2 = e11.f26409f) == null) {
            return;
        }
        Integer numR = r();
        ck.p.i(numR, "sessionDepth");
        ab2.a(numR.intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.f28687r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3434dc(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C3489gd c3489gd, C3605n2 c3605n2, R0 r10) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, new C3405c1(c3583m0.g(), c3583m0.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), c3605n2, r10);
        ck.p.j(interfaceC3652pd, "threadInterface");
        ck.p.j(c3583m0, "adSmashData");
        ck.p.j(c3605n2, "item");
        this.f30507g = c3489gd;
    }

    private final void J() {
        C3402bg c3402bg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f30505e != AbstractC3659q3.h.FAILED) {
            ck.w wVar = ck.w.f6066a;
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f30505e}, 2));
            ck.p.i(str, "format(format, *args)");
            E0 e10 = this.f30504d;
            if (e10 == null || (c3402bg = e10.f26413j) == null) {
                return;
            }
            c3402bg.q(str);
        }
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f28687r = adapterNativeAdData;
        this.f28688s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.AbstractC3659q3
    public void G() {
        C3402bg c3402bg;
        if (!(this.f30503c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            E0 e10 = this.f30504d;
            if (e10 == null || (c3402bg = e10.f26413j) == null) {
                return;
            }
            c3402bg.g("activity must not be null");
            return;
        }
        Object obj = this.f30503c;
        ck.p.h(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData adData = this.f30511k;
        ck.p.i(adData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        ck.p.i(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(adData, currentActiveActivity, this);
    }

    public final AdapterNativeAdViewBinder R() {
        return this.f28688s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        ck.p.j(adapterNativeAdData, "adapterNativeAdData");
        ck.p.j(adapterNativeAdViewBinder, "nativeAdViewBinder");
        if (u().e()) {
            u().a(new Runnable() { // from class: com.ironsource.sk
                @Override // java.lang.Runnable
                public final void run() {
                    C3434dc.a(this.f31238b, adapterNativeAdData, adapterNativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, adapterNativeAdViewBinder);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.AbstractC3659q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (!u().e()) {
            J();
        } else {
            u().a(new Runnable() { // from class: com.ironsource.tk
                @Override // java.lang.Runnable
                public final void run() {
                    C3434dc.a(this.f31336b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3434dc c3434dc) {
        ck.p.j(c3434dc, "this$0");
        c3434dc.J();
    }

    @Override // com.ironsource.AbstractC3659q3, com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        ck.p.j(b10, "event");
        Map<String, Object> mapA = super.a(b10);
        if (this.f30507g != null) {
            ck.p.i(mapA, "data");
            mapA.put("placement", j());
        }
        ck.p.i(mapA, "data");
        return mapA;
    }
}
