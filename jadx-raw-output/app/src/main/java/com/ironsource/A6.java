package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class A6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3814z6 f25933a;

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f25933a.a("show called before load success");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f25933a.a("load success before load called");
    }

    public A6(C3814z6 c3814z6) {
        ck.p.j(c3814z6, C3426d4.f.f28486e);
        this.f25933a = c3814z6;
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        this.f25933a.a("ad expired before load called");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f25933a.a("load failed before load called");
    }

    @Override // com.ironsource.E6
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f25933a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        C3712t6 c3712t6A = this.f25933a.b().a(true, this.f25933a.c());
        this.f25933a.a(new C6(this.f25933a, c3712t6A, true));
        c3712t6A.a(this.f25933a);
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f25933a.a("ad display success before load called");
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f25933a.a("ad display failed before load called");
    }
}
