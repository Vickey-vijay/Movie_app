package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class B6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3814z6 f26048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3712t6 f26049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3712t6 f26050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26051d;

    public B6(C3814z6 c3814z6, C3712t6 c3712t6, C3712t6 c3712t7, boolean z10) {
        ck.p.j(c3814z6, C3426d4.f.f28486e);
        ck.p.j(c3712t6, "currentAdUnit");
        this.f26048a = c3814z6;
        this.f26049b = c3712t6;
        this.f26050c = c3712t7;
        this.f26051d = z10;
    }

    @Override // com.ironsource.E6
    public void a(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f26048a.a(new D6(this.f26048a, this.f26049b, this.f26050c));
        this.f26049b.a(activity, this.f26048a);
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (ck.p.e(this.f26049b, c3712t6)) {
            this.f26048a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void c(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (ck.p.e(c3712t6, this.f26049b)) {
            this.f26048a.d().onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.E6
    public void loadAd() {
        mj.r rVar;
        if (this.f26051d) {
            this.f26048a.a("load called while current ad is loaded");
            return;
        }
        this.f26051d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.f26049b.e();
        if (levelPlayAdInfoE != null) {
            this.f26048a.d().b(levelPlayAdInfoE);
            rVar = mj.r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this.f26048a.a("current ad is loaded without ad info");
        } else if (this.f26050c == null) {
            C3712t6 c3712t6A = this.f26048a.b().a(false, this.f26048a.c());
            this.f26050c = c3712t6A;
            c3712t6A.a(this.f26048a);
        }
    }

    @Override // com.ironsource.E6
    public void b(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        if (ck.p.e(c3712t6, this.f26050c)) {
            this.f26050c = null;
        } else {
            this.f26048a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(c3712t6, "adUnit");
        ck.p.j(levelPlayAdInfo, "adInfo");
        if (ck.p.e(c3712t6, this.f26049b)) {
            this.f26048a.a("show success when loaded");
        } else {
            this.f26048a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ B6(C3814z6 c3814z6, C3712t6 c3712t6, C3712t6 c3712t7, boolean z10, int i10, ck.i iVar) {
        this(c3814z6, c3712t6, c3712t7, (i10 & 8) != 0 ? false : z10);
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6, IronSourceError ironSourceError) {
        ck.p.j(c3712t6, "adUnit");
        if (ck.p.e(c3712t6, this.f26049b)) {
            this.f26048a.a("show failed when loaded");
        } else {
            this.f26048a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.E6
    public void a(C3712t6 c3712t6) {
        ck.p.j(c3712t6, "adUnit");
        if (ck.p.e(c3712t6, this.f26050c)) {
            this.f26050c = null;
        } else if (ck.p.e(c3712t6, this.f26049b)) {
            a();
        }
    }

    private final void a() {
        E6 c10;
        C3712t6 c3712t6 = this.f26050c;
        if (c3712t6 == null) {
            C3814z6 c3814z6 = this.f26048a;
            c3814z6.a(new A6(c3814z6));
        } else {
            if (c3712t6.e() != null) {
                C3814z6 c3814z7 = this.f26048a;
                C3712t6 c3712t7 = this.f26050c;
                ck.p.g(c3712t7);
                c10 = new B6(c3814z7, c3712t7, null, false, 8, null);
            } else {
                C3814z6 c3814z8 = this.f26048a;
                C3712t6 c3712t8 = this.f26050c;
                ck.p.g(c3712t8);
                c10 = new C6(c3814z8, c3712t8, false);
            }
            this.f26048a.a(c10);
        }
        this.f26048a.d().a();
    }
}
