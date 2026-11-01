package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes8.dex */
public final class sy0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f82827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f82828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f82829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f82830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj f82831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jy1 f82832f;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f82827a.a(this.f82831e.a((ExtendedNativeAdView) viewGroup, this.f82832f));
            this.f82827a.a(this.f82829c);
        } catch (j02 e10) {
            this.f82828b.e();
            this.f82830d.reportError("Failed to bind DivKit Fullscreen Native Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f82827a.a((z00) null);
    }

    public sy0(w02 w02Var, kz kzVar, z00 z00Var, io2 io2Var, mj mjVar, jy1 jy1Var) {
        this.f82827a = w02Var;
        this.f82828b = kzVar;
        this.f82829c = z00Var;
        this.f82830d = io2Var;
        this.f82831e = mjVar;
        this.f82832f = jy1Var;
    }
}
