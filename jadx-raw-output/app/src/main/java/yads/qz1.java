package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes7.dex */
public final class qz1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f82043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f82044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f82045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu f82046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f82047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iy1 f82048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj f82049g;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f82043a.a(this.f82049g.a((ExtendedNativeAdView) viewGroup, this.f82048f), this.f82046d);
            this.f82043a.a(this.f82045c);
        } catch (j02 e10) {
            this.f82044b.e();
            this.f82047e.reportError("Failed to bind DivKit Native Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f82043a.a((z00) null);
    }

    public qz1(w02 w02Var, kz kzVar, z00 z00Var, pu puVar, at1 at1Var, iy1 iy1Var, mj mjVar) {
        this.f82043a = w02Var;
        this.f82044b = kzVar;
        this.f82045c = z00Var;
        this.f82046d = puVar;
        this.f82047e = at1Var;
        this.f82048f = iy1Var;
        this.f82049g = mjVar;
    }
}
