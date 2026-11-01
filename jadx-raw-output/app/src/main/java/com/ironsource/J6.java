package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class J6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f26858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26859b;

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26859b.a(activity, this.f26858a);
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26858a.a("Ad unit is already loaded");
    }

    public J6(F6 f10, C3712t6 c3712t6) {
        ck.p.j(f10, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "adUnit");
        this.f26858a = f10;
        this.f26859b = c3712t6;
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f26858a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26858a.d().onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        if (!C3463f5.f28891a.a(ironSourceError)) {
            F6 f10 = this.f26858a;
            f10.a(new G6(f10, null, false, 4, null));
        }
        this.f26858a.d().c(ironSourceError);
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f10 = this.f26858a;
        f10.a(new G6(f10, null, false, 4, null));
        this.f26858a.loadAd();
    }

    @Override // com.ironsource.L6
    public void a() {
        F6 f10 = this.f26858a;
        f10.a(new G6(f10, null, true));
        this.f26858a.d().a();
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26858a.d().a(levelPlayAdInfo);
        C3712t6 c3712t6A = this.f26858a.b().a(false, this.f26858a.c());
        F6 f10 = this.f26858a;
        f10.a(new I6(f10, this.f26859b, c3712t6A));
        c3712t6A.a(this.f26858a);
    }
}
