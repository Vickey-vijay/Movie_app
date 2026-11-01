package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class B9 implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f26053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f26054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3441e1 f26055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3640p1 f26056d;

    public B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1) {
        ck.p.j(interstitialAdRequest, "adRequest");
        ck.p.j(interstitialAdLoaderListener, "publisherListener");
        ck.p.j(interfaceC3441e1, "adapterConfigProvider");
        ck.p.j(interfaceC3640p1, "analyticsFactory");
        this.f26053a = interstitialAdRequest;
        this.f26054b = interstitialAdLoaderListener;
        this.f26055c = interfaceC3441e1;
        this.f26056d = interfaceC3640p1;
    }

    @Override // com.ironsource.Fb
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.f26053a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        ck.p.i(sDKVersion, "getSDKVersion()");
        InterfaceC3657q1 interfaceC3657q1A = this.f26056d.a(new C3548k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f26053a.getAdm(), this.f26053a.getProviderName$mediationsdk_release(), this.f26055c, C3541jc.f29275e.a().c().get()).a();
            new C3817z9(dbA).a();
            C3752vc c3752vc = new C3752vc();
            C3567l2 c3567l2 = new C3567l2(this.f26053a.getAdm(), this.f26053a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f26053a;
            ck.p.g(dbA);
            V7 v10 = V7.f27797a;
            return new C3800y9(interstitialAdRequest, dbA, new A9(v10, this.f26054b), c3567l2, c3752vc, interfaceC3657q1A, new C3732u9(interfaceC3657q1A, v10.c()), null, null, 384, null);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            if (e10 instanceof C3653pe) {
                ironSourceErrorB = ((C3653pe) e10).a();
            } else {
                C3813z5 c3813z5 = C3813z5.f31697a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c3813z5.b(message);
            }
            return new A5(this.f26053a, new A9(V7.f27797a, this.f26054b), interfaceC3657q1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1, int i10, ck.i iVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC3441e1, (i10 & 8) != 0 ? new C3622o1(IronSource.a.INTERSTITIAL) : interfaceC3640p1);
    }
}
