package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3368a0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3735uc f28063a;

    @Override // com.ironsource.Z
    public String a() {
        return this.f28063a.a();
    }

    /* JADX INFO: renamed from: com.ironsource.a0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28064a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28065b = 1000;

        private a() {
        }
    }

    public C3368a0(InterfaceC3735uc interfaceC3735uc) {
        ck.p.j(interfaceC3735uc, "networkLoadApi");
        this.f28063a = interfaceC3735uc;
    }

    @Override // com.ironsource.Z
    public void a(O9 o10, Map<String, String> map) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(map, "loadParams");
        try {
            this.f28063a.a(o10, new C3769wc(null, false, 3, null));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + o10.e() + " failed. error: " + e10.getMessage());
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1000: loadAd failed: ");
            sb2.append(message);
            String string = sb2.toString();
            Hc hcB = o10.b();
            if (hcB instanceof C3446e6) {
                Hc hcB2 = o10.b();
                ck.p.h(hcB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C3446e6) hcB2).onInterstitialLoadFailed(string);
            } else if (hcB instanceof Jc) {
                Hc hcB3 = o10.b();
                ck.p.h(hcB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Jc) hcB3).onBannerLoadFail(string);
            }
        }
    }
}
