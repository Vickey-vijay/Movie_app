package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;

/* JADX INFO: renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3461f3 implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f28861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f28862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3441e1 f28863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3640p1 f28864d;

    public C3461f3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1) {
        ck.p.j(bannerAdRequest, "adRequest");
        ck.p.j(bannerAdLoaderListener, "publisherListener");
        ck.p.j(interfaceC3441e1, "adapterConfigProvider");
        ck.p.j(interfaceC3640p1, "analyticsFactory");
        this.f28861a = bannerAdRequest;
        this.f28862b = bannerAdLoaderListener;
        this.f28863c = interfaceC3441e1;
        this.f28864d = interfaceC3640p1;
    }

    @Override // com.ironsource.Fb
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.f28861a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        ck.p.i(sDKVersion, "getSDKVersion()");
        InterfaceC3657q1 interfaceC3657q1A = this.f28864d.a(new C3548k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f28861a.getAdm(), this.f28861a.getProviderName$mediationsdk_release(), this.f28863c, C3541jc.f29275e.a().c().get()).a();
            new C3425d3(dbA, this.f28861a.getSize()).a();
            C3752vc c3752vc = new C3752vc();
            C3567l2 c3567l2 = new C3567l2(this.f28861a.getAdm(), this.f28861a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f28861a;
            AdSize size = bannerAdRequest.getSize();
            ck.p.g(dbA);
            V7 v10 = V7.f27797a;
            return new C3407c3(bannerAdRequest, size, c3567l2, dbA, c3752vc, interfaceC3657q1A, new C3443e3(v10, this.f28862b), new E2(interfaceC3657q1A, v10.c()), null, null, 768, null);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            if (e10 instanceof C3653pe) {
                ironSourceErrorA = ((C3653pe) e10).a();
            } else {
                C3813z5 c3813z5 = C3813z5.f31697a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c3813z5.a(message);
            }
            return new C3796y5(ironSourceErrorA, new C3443e3(V7.f27797a, this.f28862b), interfaceC3657q1A);
        }
    }

    public /* synthetic */ C3461f3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1, int i10, ck.i iVar) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC3441e1, (i10 & 8) != 0 ? new C3622o1(IronSource.a.BANNER) : interfaceC3640p1);
    }
}
