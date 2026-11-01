package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class C6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3814z6 f26084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26086c;

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26084a.a("show called while loading");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (!this.f26086c) {
            this.f26084a.a(new B6(this.f26084a, this.f26085b, null, false));
            return;
        }
        C3712t6 c3712t6A = this.f26084a.b().a(false, this.f26084a.c());
        this.f26084a.a(new B6(this.f26084a, this.f26085b, c3712t6A, true));
        this.f26084a.d().b(levelPlayAdInfo);
        c3712t6A.a(this.f26084a);
    }

    public C6(C3814z6 c3814z6, C3712t6 c3712t6, boolean z10) {
        ck.p.j(c3814z6, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "currentAdUnit");
        this.f26084a = c3814z6;
        this.f26085b = c3712t6;
        this.f26086c = z10;
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26084a.a("show success while loading");
    }

    @Override // com.ironsource.E6
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26084a.a("ad info changed while loading");
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        if (this.f26086c) {
            this.f26084a.a("load called while loading");
        }
        this.f26086c = true;
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f26084a.a("show failed while loading");
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        this.f26084a.a("ad expired while loading");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        this.f26084a.a(new A6(this.f26084a));
        if (this.f26086c) {
            this.f26084a.d().a(ironSourceError);
        }
    }
}
