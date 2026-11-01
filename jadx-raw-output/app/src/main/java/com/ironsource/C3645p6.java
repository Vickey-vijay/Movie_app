package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3645p6 implements InterfaceC3695s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f30423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3710t4 f30424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LevelPlayAdInfo f30426d;

    @Override // com.ironsource.InterfaceC3695s6
    public void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f30423a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f30423a.a(new LevelPlayAdError(string, this.f30423a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f30426d);
    }

    public C3645p6(C3415cb c3415cb, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(c3415cb, "adInternal");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f30423a = c3415cb;
        this.f30424b = interfaceC3710t4;
        this.f30425c = interfaceC3710t4.a();
        String string = c3415cb.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f30426d = new LevelPlayAdInfo(string, c3415cb.h(), c3415cb.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public LevelPlayAdInfo b() {
        return this.f30426d;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public InterfaceC3529j0 c() {
        return new InterfaceC3529j0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void loadAd() {
        String string = this.f30423a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f30423a.a(new LevelPlayAdError(string, this.f30423a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f30424b.a() - this.f30425c);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClicked() {
        this.f30423a.a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClosed() {
        this.f30423a.a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30423a.a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30423a.a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30423a.a(levelPlayAdError, this.f30424b.a() - this.f30425c);
        this.f30423a.a(C3553k6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3415cb c3415cb = this.f30423a;
        c3415cb.a(new C3627o6(c3415cb, levelPlayAdInfo, this.f30424b));
        this.f30423a.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a() {
        this.f30423a.a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30423a.a("onAdDisplayFailed on loading state with error: " + levelPlayAdError.getErrorMessage());
    }
}
