package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3627o6 implements InterfaceC3695s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f30346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LevelPlayAdInfo f30347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3710t4 f30348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30349d;

    @Override // com.ironsource.InterfaceC3695s6
    public void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        C3489gd c3489gdA = this.f30346a.f().a(this.f30346a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f30347b, str);
        this.f30347b = levelPlayAdInfo;
        C3415cb c3415cb = this.f30346a;
        c3415cb.a(new C3662q6(c3415cb, levelPlayAdInfo));
        this.f30346a.c().a(activity, c3489gdA);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public LevelPlayAdInfo b() {
        return this.f30347b;
    }

    public C3627o6(C3415cb c3415cb, LevelPlayAdInfo levelPlayAdInfo, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(c3415cb, "adInternal");
        ck.p.j(levelPlayAdInfo, "adInfo");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f30346a = c3415cb;
        this.f30347b = levelPlayAdInfo;
        this.f30348c = interfaceC3710t4;
        this.f30349d = interfaceC3710t4.a();
    }

    private final long d() {
        return this.f30348c.a() - this.f30349d;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public InterfaceC3529j0 c() {
        M3 m3A = this.f30346a.l().f().a(this.f30346a.h());
        return m3A.d() ? InterfaceC3529j0.a.f29178c.a(m3A.e()) : InterfaceC3529j0.b.f29181a;
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClicked() {
        this.f30346a.a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdClosed() {
        this.f30346a.a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30346a.a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdInfoChanged(final LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3621o0 c3621o0F = this.f30346a.f();
        IronLog.INTERNAL.verbose(C3621o0.a(c3621o0F, "onAdInfoChanged adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        c3621o0F.e().h().a(this.f30347b, levelPlayAdInfo);
        this.f30347b = levelPlayAdInfo;
        c3621o0F.e(new Runnable() { // from class: com.ironsource.ml
            @Override // java.lang.Runnable
            public final void run() {
                C3627o6.a(this.f30196b, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30346a.a("onAdLoadFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f30346a.a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void loadAd() {
        this.f30346a.f().e().h().a(Long.valueOf(d()));
        this.f30346a.a(this.f30347b);
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f30346a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f30346a.a(C3553k6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3627o6 c3627o6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3627o6, "this$0");
        ck.p.j(levelPlayAdInfo, "$adInfo");
        InterfaceC3433db interfaceC3433dbK = c3627o6.f30346a.k();
        if (interfaceC3433dbK != null) {
            interfaceC3433dbK.onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3695s6
    public void a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        this.f30346a.a("onAdDisplayFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }
}
