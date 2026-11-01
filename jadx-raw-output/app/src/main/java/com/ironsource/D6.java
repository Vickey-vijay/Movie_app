package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: loaded from: classes7.dex */
public final class D6 implements E6, InterfaceC3763w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3814z6 f26321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3712t6 f26323c;

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26321a.a("show called while showing");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (c3712t6 == this.f26322b) {
            this.f26321a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3763w6
    public void onClosed() {
        this.f26321a.a(a(this, null, 1, null));
        this.f26321a.c().onClosed();
    }

    public D6(C3814z6 c3814z6, C3712t6 c3712t6, C3712t6 c3712t7) {
        ck.p.j(c3814z6, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "currentAdUnit");
        this.f26321a = c3814z6;
        this.f26322b = c3712t6;
        this.f26323c = c3712t7;
        c3712t6.a(this);
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (ck.p.e(c3712t6, this.f26322b)) {
            this.f26321a.d().a(levelPlayAdInfo);
        } else {
            this.f26321a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.E6
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (c3712t6 == this.f26322b) {
            this.f26321a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f26321a.c().e();
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        this.f26321a.a("load called while showing");
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        if (c3712t6 == this.f26323c) {
            this.f26323c = null;
        } else {
            this.f26321a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        if (!ck.p.e(c3712t6, this.f26322b)) {
            this.f26321a.a("progressive show failed while showing current ad");
            return;
        }
        this.f26321a.a(a(ironSourceError));
        this.f26321a.d().c(ironSourceError);
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        if (c3712t6 == this.f26323c) {
            this.f26323c = null;
        } else {
            this.f26321a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3763w6
    public void a(LevelPlayReward levelPlayReward) {
        ck.p.j(levelPlayReward, "reward");
        this.f26321a.c().a(levelPlayReward);
    }

    public static /* synthetic */ E6 a(D6 d10, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ironSourceError = null;
        }
        return d10.a(ironSourceError);
    }

    private final E6 a(IronSourceError ironSourceError) {
        if (C3463f5.f28891a.a(ironSourceError)) {
            return new B6(this.f26321a, this.f26322b, this.f26323c, true);
        }
        C3712t6 c3712t6 = this.f26323c;
        if (c3712t6 == null) {
            return new A6(this.f26321a);
        }
        if (c3712t6.e() != null) {
            return new B6(this.f26321a, c3712t6, null, false, 8, null);
        }
        return new C6(this.f26321a, c3712t6, false);
    }
}
