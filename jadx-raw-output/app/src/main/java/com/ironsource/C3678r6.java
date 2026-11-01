package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3678r6 implements InterfaceC3695s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f30613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f30614b;

    @Override // com.ironsource.InterfaceC3695s6
    public void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        String string = this.f30613a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        this.f30613a.a(new LevelPlayAdError(string, this.f30613a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f30614b);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public LevelPlayAdInfo b() {
        return this.f30614b;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public InterfaceC3529j0 c() {
        return new InterfaceC3529j0.a("ad is shown");
    }

    public C3678r6(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3415cb, "adInternal");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30613a = c3415cb;
        this.f30614b = levelPlayAdInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3678r6 c3678r6) {
        ck.p.j(c3678r6, "this$0");
        c3678r6.f30613a.a(C3553k6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3678r6 c3678r6) {
        ck.p.j(c3678r6, "this$0");
        InterfaceC3433db interfaceC3433dbK = c3678r6.f30613a.k();
        if (interfaceC3433dbK != null) {
            interfaceC3433dbK.onAdClosed(c3678r6.f30614b);
        }
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void loadAd() {
        String string = this.f30613a.e().toString();
        ck.p.i(string, "adInternal.adId.toString()");
        C3415cb.a(this.f30613a, new LevelPlayAdError(string, this.f30613a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30613a.f(), "onAdClicked adInfo: " + this.f30614b, (String) null, 2, (Object) null));
        this.f30613a.f().e(new Runnable() { // from class: com.ironsource.vl
            @Override // java.lang.Runnable
            public final void run() {
                C3678r6.a(this.f31497b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30613a.f(), "onAdClosed adInfo: " + this.f30614b, (String) null, 2, (Object) null));
        this.f30613a.f().d(new Runnable() { // from class: com.ironsource.tl
            @Override // java.lang.Runnable
            public final void run() {
                C3678r6.b(this.f31337b);
            }
        });
        this.f30613a.f().e(new Runnable() { // from class: com.ironsource.ul
            @Override // java.lang.Runnable
            public final void run() {
                C3678r6.c(this.f31436b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30613a.a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30613a.a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30613a.a("onAdLoadFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30613a.a("onAdLoaded on shown state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a() {
        this.f30613a.a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30613a.a("onAdDisplayFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3678r6 c3678r6) {
        ck.p.j(c3678r6, "this$0");
        InterfaceC3433db interfaceC3433dbK = c3678r6.f30613a.k();
        if (interfaceC3433dbK != null) {
            interfaceC3433dbK.onAdClicked(c3678r6.f30614b);
        }
    }
}
