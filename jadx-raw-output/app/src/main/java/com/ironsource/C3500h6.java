package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3500h6 extends AbstractC3582m implements InterfaceC3763w6, InterfaceC3780x6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3535j6 f29042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3476g0 f29043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3797y6 f29044d;

    public /* synthetic */ C3500h6(InterfaceC3535j6 interfaceC3535j6, C3621o0 c3621o0, C3476g0 c3476g0, InterfaceC3797y6.b bVar, InterfaceC3729u6 interfaceC3729u6, int i10, ck.i iVar) {
        this(interfaceC3535j6, c3621o0, c3476g0, (i10 & 8) != 0 ? new InterfaceC3797y6.b() : bVar, interfaceC3729u6);
    }

    public final void a(Activity activity, C3489gd c3489gd) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f29043c.a(c3489gd);
        this.f29044d.a(activity);
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29042b.onAdLoaded(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void c(IronSourceError ironSourceError) {
        InterfaceC3535j6 interfaceC3535j6 = this.f29042b;
        String string = this.f29043c.b().toString();
        ck.p.i(string, "adProperties.adId.toString()");
        interfaceC3535j6.a(new LevelPlayAdError(ironSourceError, string, this.f29043c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f29042b.onAdClicked();
    }

    public final void m() {
        this.f29044d.loadAd();
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29042b.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC3763w6
    public void onClosed() {
        this.f29042b.onAdClosed();
    }

    public C3500h6(InterfaceC3535j6 interfaceC3535j6, C3621o0 c3621o0, C3476g0 c3476g0, InterfaceC3797y6.b bVar, InterfaceC3729u6 interfaceC3729u6) {
        ck.p.j(interfaceC3535j6, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3476g0, "adProperties");
        ck.p.j(bVar, "adUnitStrategyFactory");
        ck.p.j(interfaceC3729u6, "fullscreenAdUnitFactory");
        this.f29042b = interfaceC3535j6;
        this.f29043c = c3476g0;
        this.f29044d = bVar.a(c3621o0, c3621o0.b(c3476g0.e(), c3476g0.c()), interfaceC3729u6, this, this);
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void a(IronSourceError ironSourceError) {
        InterfaceC3535j6 interfaceC3535j6 = this.f29042b;
        String string = this.f29043c.b().toString();
        ck.p.i(string, "adProperties.adId.toString()");
        interfaceC3535j6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f29043c.c()));
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29042b.onAdDisplayed(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC3763w6
    public void a(LevelPlayReward levelPlayReward) {
        ck.p.j(levelPlayReward, "reward");
        this.f29042b.a(levelPlayReward);
    }

    @Override // com.ironsource.InterfaceC3780x6
    public void a() {
        this.f29042b.a();
    }
}
