package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: renamed from: com.ironsource.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3675r3 implements InterfaceC3441e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T3 f30591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cd f30592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IronSource.a f30593c;

    /* JADX INFO: renamed from: com.ironsource.r3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30594a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30594a = iArr;
        }
    }

    public C3675r3(T3 t10, Cd cd2, IronSource.a aVar) {
        ck.p.j(t10, "adFormatConfigurations");
        ck.p.j(aVar, "adFormat");
        this.f30591a = t10;
        this.f30592b = cd2;
        this.f30593c = aVar;
    }

    @Override // com.ironsource.InterfaceC3441e1
    public InterfaceC3612n9 a(InterfaceC3753vd interfaceC3753vd) {
        NetworkSettings networkSettingsB;
        Zd zdF;
        ck.p.j(interfaceC3753vd, "providerName");
        Cd cd2 = this.f30592b;
        if (cd2 == null || (networkSettingsB = cd2.b(interfaceC3753vd.value())) == null) {
            return null;
        }
        int i10 = a.f30594a[this.f30593c.ordinal()];
        if (i10 == 1) {
            U2 u2C = this.f30591a.c();
            if (u2C != null) {
                return new Z2(new C3405c1(networkSettingsB, networkSettingsB.getBannerSettings(), this.f30593c), u2C);
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3 && (zdF = this.f30591a.f()) != null) {
                return new Md(new C3405c1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.f30593c), zdF);
            }
            return null;
        }
        H9 h9D = this.f30591a.d();
        if (h9D != null) {
            return new K9(new C3405c1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.f30593c), h9D);
        }
        return null;
    }
}
