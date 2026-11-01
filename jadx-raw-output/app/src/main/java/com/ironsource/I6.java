package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class I6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f26807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3712t6 f26809c;

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26807a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        F6 f10 = this.f26807a;
        f10.a(new H6(f10, this.f26808b, this.f26809c, levelPlayAdInfo));
    }

    public I6(F6 f10, C3712t6 c3712t6, C3712t6 c3712t7) {
        ck.p.j(f10, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "currentAdUnit");
        ck.p.j(c3712t7, "progressiveAdUnit");
        this.f26807a = f10;
        this.f26808b = c3712t6;
        this.f26809c = c3712t7;
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26807a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        F6 f10 = this.f26807a;
        f10.a(new K6(f10, this.f26809c));
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        F6 f10 = this.f26807a;
        f10.a(new G6(f10, this.f26808b, false, 4, null));
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f26807a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26807a.a("show success before progressive load success");
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f26807a.a("show failed before progressive load success");
    }
}
