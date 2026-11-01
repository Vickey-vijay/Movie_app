package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class H6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f26712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3712t6 f26714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LevelPlayAdInfo f26715d;

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26712a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26712a.a("load success on progressive ad unit is already loaded");
    }

    public H6(F6 f10, C3712t6 c3712t6, C3712t6 c3712t7, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(f10, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "currentAdUnit");
        ck.p.j(c3712t7, "progressiveAdUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26712a = f10;
        this.f26713b = c3712t6;
        this.f26714c = c3712t7;
        this.f26715d = levelPlayAdInfo;
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26715d = levelPlayAdInfo;
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f26712a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        this.f26712a.d().b(this.f26715d);
        F6 f10 = this.f26712a;
        f10.a(new J6(f10, this.f26714c));
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f26712a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f10 = this.f26712a;
        f10.a(new G6(f10, this.f26713b, true));
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26712a.a("show success on progressive ad unit that already loaded");
    }
}
