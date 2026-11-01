package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class Ca extends AbstractC3582m implements O2, Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3621o0 f26087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J2 f26088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<InterfaceC3759w2> f26089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LevelPlayAdInfo f26090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Da f26091f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(Ca ca2, boolean z10) {
        ck.p.j(ca2, "this$0");
        return ca2.a(ca2.f26087b, ca2.f26088c, z10);
    }

    public final void b() {
        this.f26091f.b();
    }

    public final void d() {
        this.f26091f.d();
    }

    public Ca(InterfaceC3759w2 interfaceC3759w2, C3621o0 c3621o0, J2 j10, W2 w10) {
        ck.p.j(interfaceC3759w2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(j10, "bannerAdProperties");
        ck.p.j(w10, "bannerViewContainer");
        this.f26087b = c3621o0;
        this.f26088c = j10;
        this.f26089d = new WeakReference<>(interfaceC3759w2);
        this.f26090e = n();
        this.f26091f = Za.f28027a.a(c3621o0, w10, c3621o0.d(j10.c()), j10, this, m(), (64 & 64) != 0 ? new InterfaceC3710t4.a() : null);
    }

    private final L2 a(C3621o0 c3621o0, J2 j10, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new L2(c3621o0, M2.f27027z.a(j10, l().a(), z10), this);
    }

    private final N2 m() {
        return new N2() { // from class: com.ironsource.sh
            @Override // com.ironsource.N2
            public final L2 a(boolean z10) {
                return Ca.a(this.f31232a, z10);
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String string = this.f26088c.b().toString();
        ck.p.i(string, "bannerAdProperties.adId.toString()");
        String strC = this.f26088c.c();
        String string2 = this.f26088c.a().toString();
        ck.p.i(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.Ea
    public void b(IronSourceError ironSourceError) {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            String string = this.f26088c.b().toString();
            ck.p.i(string, "bannerAdProperties.adId.toString()");
            interfaceC3759w2.a(new LevelPlayAdError(ironSourceError, string, this.f26088c.c()));
        }
    }

    public final void c() {
        this.f26091f.c();
    }

    @Override // com.ironsource.Ea
    public void d(IronSourceError ironSourceError) {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f26090e;
            String string = this.f26088c.b().toString();
            ck.p.i(string, "bannerAdProperties.adId.toString()");
            interfaceC3759w2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f26088c.c()));
        }
    }

    public final void f() {
        this.f26091f.f();
    }

    @Override // com.ironsource.Ea
    public void i() {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.a(this.f26090e);
        }
    }

    @Override // com.ironsource.Ea
    public void k() {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.c(this.f26090e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdClicked() {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.d(this.f26090e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26090e = levelPlayAdInfo;
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.b(this.f26090e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdLeftApplication() {
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.e(this.f26090e);
        }
    }

    @Override // com.ironsource.Ea
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26090e = levelPlayAdInfo;
        InterfaceC3759w2 interfaceC3759w2 = this.f26089d.get();
        if (interfaceC3759w2 != null) {
            interfaceC3759w2.a(levelPlayAdInfo, false);
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ mj.r g() {
        o();
        return mj.r.f64562a;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ mj.r h() {
        q();
        return mj.r.f64562a;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ mj.r j() {
        p();
        return mj.r.f64562a;
    }

    public void o() {
        onAdLeftApplication();
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }
}
