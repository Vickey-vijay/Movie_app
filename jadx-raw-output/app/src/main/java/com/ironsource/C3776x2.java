package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3776x2 extends A implements BannerAdListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private WeakReference<InterfaceC3810z2> f31567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f31568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private FrameLayout.LayoutParams f31569z;

    private final ISBannerSize I() {
        W0 w0F = f();
        AbstractC3757w0 abstractC3757w0I = n().i();
        ck.p.h(abstractC3757w0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return w0F.a(((M2) abstractC3757w0I).b().h());
    }

    private final void J() {
        C3489gd c3489gdJ = j();
        if (c3489gdJ != null) {
            f().e().a().f(c3489gdJ.c());
        }
        InterfaceC3810z2 interfaceC3810z2 = this.f31567x.get();
        if (interfaceC3810z2 != null) {
            interfaceC3810z2.a(this);
        }
    }

    private final void K() {
        C3489gd c3489gdJ = j();
        if (c3489gdJ != null) {
            f().e().a().c(c3489gdJ.c());
        }
        InterfaceC3810z2 interfaceC3810z2 = this.f31567x.get();
        if (interfaceC3810z2 != null) {
            interfaceC3810z2.b(this);
        }
    }

    private final void L() {
        C3489gd c3489gdJ = j();
        if (c3489gdJ != null) {
            f().e().a().h(c3489gdJ.c());
        }
        InterfaceC3810z2 interfaceC3810z2 = this.f31567x.get();
        if (interfaceC3810z2 != null) {
            interfaceC3810z2.c(this);
        }
    }

    @Override // com.ironsource.A
    public void a(J j10) {
        ck.p.j(j10, "adInstancePresenter");
        j10.a(this);
    }

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C3768wb.a(f(), new Runnable() { // from class: com.ironsource.om
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.a(this.f30377b);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.A
    public void c() {
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object objG = g();
                ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objG).destroyAd(i());
            } else {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "destroyBanner - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
    }

    @Override // com.ironsource.A
    public LevelPlayAdInfo e() {
        String string = n().i().b().b().toString();
        ck.p.i(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().i().b().c();
        String string2 = n().h().toString();
        ck.p.i(string2, "instanceData.adFormat.toString()");
        C3605n2 c3605n2N = n().n();
        AbstractC3757w0 abstractC3757w0I = n().i();
        ck.p.h(abstractC3757w0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, c3605n2N, ((M2) abstractC3757w0I).b().h(), n().i().l(), kotlin.collections.a.x(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        ck.p.j(view, "adView");
        ck.p.j(layoutParams, "frameLayoutParams");
        onAdLoadSuccess(view, layoutParams, new LinkedHashMap());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776x2(W0 w10, B b10, H h10, InterfaceC3810z2 interfaceC3810z2) {
        super(w10, b10, h10, interfaceC3810z2);
        ck.p.j(w10, "adTools");
        ck.p.j(b10, "instanceData");
        ck.p.j(h10, "adInstancePayload");
        ck.p.j(interfaceC3810z2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f31567x = new WeakReference<>(interfaceC3810z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3776x2 c3776x2) {
        ck.p.j(c3776x2, "this$0");
        c3776x2.L();
    }

    public final void a(final InterfaceC3619ng interfaceC3619ng) {
        ck.p.j(interfaceC3619ng, "viewBinder");
        C3768wb.a(f(), new Runnable() { // from class: com.ironsource.um
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.a(this.f31437b, interfaceC3619ng);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.rm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.b(this.f30640b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final View view, final FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        ck.p.j(view, "adView");
        ck.p.j(layoutParams, "frameLayoutParams");
        ck.p.j(map, "extraData");
        C3768wb.a(f(), new Runnable() { // from class: com.ironsource.sm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.a(this.f31241b, view, layoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess(map);
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> map) {
        ck.p.j(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.qm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.a(this.f30579b, map);
            }
        });
        super.onAdOpened(map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.vm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.c(this.f31498b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.tm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.d(this.f31338b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C3776x2 c3776x2, InterfaceC3619ng interfaceC3619ng) {
        FrameLayout.LayoutParams layoutParams;
        ck.p.j(c3776x2, "this$0");
        ck.p.j(interfaceC3619ng, "$viewBinder");
        View view = c3776x2.f31568y;
        if (view == null || (layoutParams = c3776x2.f31569z) == null) {
            return;
        }
        interfaceC3619ng.a(view, layoutParams, c3776x2.f());
        IronLog.INTERNAL.verbose(C3621o0.a(c3776x2.f(), "Bind banner view", (String) null, 2, (Object) null));
        c3776x2.f().d(new Runnable() { // from class: com.ironsource.pm
            @Override // java.lang.Runnable
            public final void run() {
                C3776x2.e(this.f30483b);
            }
        });
    }

    @Override // com.ironsource.A
    public void A() {
        if (g() instanceof AdapterBannerInterface) {
            AdData adDataI = i();
            ISBannerSize iSBannerSizeI = I();
            Map<String, Object> adUnitData = adDataI.getAdUnitData();
            ck.p.i(adUnitData, "adData.adUnitData");
            adUnitData.put(K2.f26915t, new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeI));
            Object objG = g();
            ck.p.h(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
            ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeI, this);
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3776x2 c3776x2) {
        ck.p.j(c3776x2, "this$0");
        c3776x2.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3776x2 c3776x2) {
        ck.p.j(c3776x2, "this$0");
        c3776x2.f31568y = null;
        c3776x2.f31569z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3776x2 c3776x2) {
        ck.p.j(c3776x2, "this$0");
        c3776x2.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3776x2 c3776x2, View view, FrameLayout.LayoutParams layoutParams) {
        ck.p.j(c3776x2, "this$0");
        ck.p.j(view, "$adView");
        ck.p.j(layoutParams, "$frameLayoutParams");
        c3776x2.f31568y = view;
        c3776x2.f31569z = layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3776x2 c3776x2) {
        String strC;
        ck.p.j(c3776x2, "this$0");
        N nA = c3776x2.f().e().a();
        C3489gd c3489gdJ = c3776x2.j();
        if (c3489gdJ == null || (strC = c3489gdJ.c()) == null) {
            strC = "";
        }
        nA.j(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3776x2 c3776x2, Map map) {
        ck.p.j(c3776x2, "this$0");
        ck.p.j(map, "$extraData");
        c3776x2.l().putAll(map);
    }
}
