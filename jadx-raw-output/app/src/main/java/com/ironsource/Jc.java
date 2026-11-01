package com.ironsource;

import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class Jc implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private A2 f26890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<C2> f26891b = new WeakReference<>(null);

    public final void a(A2 a10) {
        ck.p.j(a10, "loadListener");
        this.f26890a = a10;
    }

    @Override // com.ironsource.Ic
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.Ic
    public void onBannerInitSuccess() {
    }

    public final void a(C2 c10) {
        ck.p.j(c10, "showListener");
        this.f26891b = new WeakReference<>(c10);
    }

    @Override // com.ironsource.Ic
    public void onBannerClick() {
        C2 c10 = this.f26891b.get();
        if (c10 != null) {
            c10.onBannerClick();
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadFail(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        A2 a10 = this.f26890a;
        if (a10 != null) {
            a10.onBannerLoadFail(str);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadSuccess(O9 o10, C3555k8 c3555k8) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(c3555k8, "adContainer");
        A2 a10 = this.f26890a;
        if (a10 != null) {
            a10.onBannerLoadSuccess(o10, c3555k8);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerShowSuccess() {
        C2 c10 = this.f26891b.get();
        if (c10 != null) {
            c10.onBannerShowSuccess();
        }
    }
}
