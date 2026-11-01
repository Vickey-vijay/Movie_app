package yads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final class i32 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f78477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my0 f78478b;

    @Override // yads.z00
    public final void onAdClicked() {
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", j5Var);
        ((q2) this.f78477a).a(16, bundle);
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        nt2 nt2Var = this.f78478b.f80457a;
        if (nt2Var == null || nt2Var.f80793t) {
            return;
        }
        ((q2) this.f78477a).f81684a.finish();
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        ((q2) this.f78477a).a(17, null);
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        ((q2) this.f78477a).a(18, null);
    }

    public i32(q2 q2Var, my0 my0Var) {
        this.f78477a = q2Var;
        this.f78478b = my0Var;
    }
}
