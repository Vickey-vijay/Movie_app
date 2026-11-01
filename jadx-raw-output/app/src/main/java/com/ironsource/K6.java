package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class K6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f26932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26933b;

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26932a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        F6 f10 = this.f26932a;
        f10.a(new J6(f10, this.f26933b));
        this.f26932a.d().b(levelPlayAdInfo);
    }

    public K6(F6 f10, C3712t6 c3712t6) {
        ck.p.j(f10, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "adUnit");
        this.f26932a = f10;
        this.f26933b = c3712t6;
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26932a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        this.f26932a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f26932a.a("show failed while loading");
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        F6 f10 = this.f26932a;
        f10.a(new G6(f10, this.f26933b, false, 4, null));
        this.f26932a.d().a(ironSourceError);
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f26932a.a("ad expired while loading");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26932a.a("show success while loading");
    }
}
