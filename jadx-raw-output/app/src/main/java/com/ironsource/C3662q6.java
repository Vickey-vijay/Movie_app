package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3662q6 implements InterfaceC3695s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f30541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f30542b;

    @Override // com.ironsource.InterfaceC3695s6
    public void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f30541a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f30541a.a(new LevelPlayAdError(string, this.f30541a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f30542b);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public LevelPlayAdInfo b() {
        return this.f30542b;
    }

    public C3662q6(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "adInternal");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30541a = c3415cb;
        this.f30542b = levelPlayAdInfo;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public InterfaceC3529j0 c() {
        return new InterfaceC3529j0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void loadAd() {
        String string = this.f30541a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        C3415cb.a(this.f30541a, new LevelPlayAdError(string, this.f30541a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClicked() {
        this.f30541a.a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClosed() {
        this.f30541a.a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3621o0 c3621o0F = this.f30541a.f();
        final LevelPlayAdInfo levelPlayAdInfo2 = new LevelPlayAdInfo(levelPlayAdInfo, this.f30542b.getPlacementName());
        IronLog.INTERNAL.verbose(C3621o0.a(c3621o0F, "onAdDisplayed adInfo: " + levelPlayAdInfo2, (String) null, 2, (Object) null));
        c3621o0F.e().h().e();
        C3415cb c3415cb = this.f30541a;
        c3415cb.a(new C3678r6(c3415cb, levelPlayAdInfo2));
        c3621o0F.e(new Runnable() { // from class: com.ironsource.rl
            @Override // java.lang.Runnable
            public final void run() {
                C3662q6.a(this.f30638b, levelPlayAdInfo2);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30541a.a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30541a.a("onAdLoadFailed on showing state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30541a.a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30541a.a(a(levelPlayAdError, this.f30542b));
        this.f30541a.a(levelPlayAdError, this.f30542b);
    }

    private final InterfaceC3695s6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C3463f5.f28891a.a(Pf.f27382a.a(levelPlayAdError))) {
            C3415cb c3415cb = this.f30541a;
            return new C3627o6(c3415cb, levelPlayAdInfo, c3415cb.j());
        }
        return new C3553k6(this.f30541a, C3553k6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a() {
        this.f30541a.a("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3662q6 c3662q6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3662q6, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfoWithPlacement");
        InterfaceC3433db interfaceC3433dbK = c3662q6.f30541a.k();
        if (interfaceC3433dbK != null) {
            interfaceC3433dbK.onAdDisplayed(levelPlayAdInfo);
        }
    }
}
