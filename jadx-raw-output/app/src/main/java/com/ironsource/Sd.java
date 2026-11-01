package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class Sd implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f27623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RewardedAdLoaderListener f27624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3441e1 f27625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3640p1 f27626d;

    public Sd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1) {
        ck.p.j(rewardedAdRequest, "adRequest");
        ck.p.j(rewardedAdLoaderListener, "publisherListener");
        ck.p.j(interfaceC3441e1, "adapterConfigProvider");
        ck.p.j(interfaceC3640p1, "analyticsFactory");
        this.f27623a = rewardedAdRequest;
        this.f27624b = rewardedAdLoaderListener;
        this.f27625c = interfaceC3441e1;
        this.f27626d = interfaceC3640p1;
    }

    @Override // com.ironsource.Fb
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorD;
        String instanceId = this.f27623a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        ck.p.i(sDKVersion, "getSDKVersion()");
        InterfaceC3657q1 interfaceC3657q1A = this.f27626d.a(new C3548k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f27623a.getAdm(), this.f27623a.getProviderName$mediationsdk_release(), this.f27625c, C3541jc.f29275e.a().c().get()).a();
            new Qd(dbA).a();
            C3752vc c3752vc = new C3752vc();
            C3567l2 c3567l2 = new C3567l2(this.f27623a.getAdm(), this.f27623a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f27623a;
            ck.p.g(dbA);
            V7 v10 = V7.f27797a;
            return new Pd(rewardedAdRequest, dbA, new Rd(v10, this.f27624b), c3567l2, c3752vc, interfaceC3657q1A, new Kd(interfaceC3657q1A, v10.c()), null, null, 384, null);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            if (e10 instanceof C3653pe) {
                ironSourceErrorD = ((C3653pe) e10).a();
            } else {
                C3813z5 c3813z5 = C3813z5.f31697a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorD = c3813z5.d(message);
            }
            return new B5(this.f27623a, new Rd(V7.f27797a, this.f27624b), interfaceC3657q1A, ironSourceErrorD);
        }
    }

    public /* synthetic */ Sd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC3441e1 interfaceC3441e1, InterfaceC3640p1 interfaceC3640p1, int i10, ck.i iVar) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC3441e1, (i10 & 8) != 0 ? new C3622o1(IronSource.a.REWARDED_VIDEO) : interfaceC3640p1);
    }
}
