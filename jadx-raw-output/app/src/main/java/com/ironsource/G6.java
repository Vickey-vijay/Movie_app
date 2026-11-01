package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class G6 implements L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f26616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26618c;

    public G6(F6 f10, C3712t6 c3712t6, boolean z10) {
        ck.p.j(f10, C3426d4.f.f28486e);
        this.f26616a = f10;
        this.f26617b = c3712t6;
        this.f26618c = z10;
    }

    @Override // com.ironsource.L6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26616a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f26618c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.L6
    public void c(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26616a.a(this.f26618c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.L6
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26616a.a(this.f26618c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.L6
    public void loadAd() {
        C3712t6 c3712t6A = this.f26616a.b().a(true, this.f26616a.c());
        F6 f10 = this.f26616a;
        f10.a(new K6(f10, c3712t6A));
        c3712t6A.a(this.f26616a);
    }

    @Override // com.ironsource.L6
    public void c(IronSourceError ironSourceError) {
        this.f26616a.a(this.f26618c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ G6(F6 f10, C3712t6 c3712t6, boolean z10, int i10, ck.i iVar) {
        this(f10, c3712t6, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.L6
    public void a(IronSourceError ironSourceError) {
        this.f26616a.a(this.f26618c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.L6
    public void a() {
        this.f26616a.a(this.f26618c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.L6
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        this.f26616a.a(this.f26618c ? "show success on expired ad" : "show success before load called");
    }
}
