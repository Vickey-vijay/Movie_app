package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3553k6 implements InterfaceC3695s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f29330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f29331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LevelPlayAdInfo f29332c;

    /* JADX INFO: renamed from: com.ironsource.k6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C3553k6(C3415cb c3415cb, a aVar) {
        ck.p.j(c3415cb, "adInternal");
        ck.p.j(aVar, "status");
        this.f29330a = c3415cb;
        this.f29331b = aVar;
        String string = c3415cb.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f29332c = new LevelPlayAdInfo(string, c3415cb.h(), c3415cb.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String str2 = this.f29331b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f29330a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f29330a.a(new LevelPlayAdError(string, this.f29330a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f29332c);
    }

    private final boolean d() {
        if (this.f29330a.h().length() == 0) {
            C3415cb c3415cb = this.f29330a;
            String string = this.f29330a.e().toString();
            ck.p.i(string, "adInternal.adId.toString()");
            C3415cb.a(c3415cb, new LevelPlayAdError(string, this.f29330a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f29330a.f().g()) {
            C3415cb c3415cb2 = this.f29330a;
            String string2 = this.f29330a.e().toString();
            ck.p.i(string2, "adInternal.adId.toString()");
            C3415cb.a(c3415cb2, new LevelPlayAdError(string2, this.f29330a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        C3379ab c3379abA = this.f29330a.l().e().a();
        if (c3379abA != null && c3379abA.a(this.f29330a.h(), this.f29330a.d())) {
            return true;
        }
        C3415cb c3415cb3 = this.f29330a;
        String string3 = this.f29330a.e().toString();
        ck.p.i(string3, "adInternal.adId.toString()");
        C3415cb.a(c3415cb3, new LevelPlayAdError(string3, this.f29330a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public LevelPlayAdInfo b() {
        return this.f29332c;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public InterfaceC3529j0 c() {
        return new InterfaceC3529j0.a(this.f29331b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClicked() {
        this.f29330a.a("onAdClicked on " + this.f29331b + " state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClosed() {
        this.f29330a.a("onAdClosed on " + this.f29331b + " state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29330a.a("onAdDisplayed on " + this.f29331b + " state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29330a.a("onAdInfoChanged on " + this.f29331b + " state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f29330a.a("onAdLoadFailed on " + this.f29331b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f29330a.a("onAdLoaded on " + this.f29331b + " state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void loadAd() {
        if (!d()) {
            return;
        }
        this.f29330a.o();
    }

    public /* synthetic */ C3553k6(C3415cb c3415cb, a aVar, int i10, ck.i iVar) {
        this(c3415cb, (i10 & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f29330a.a("onAdDisplayFailed on " + this.f29331b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a() {
        this.f29330a.a("onAdExpired on " + this.f29331b + " state");
    }
}
