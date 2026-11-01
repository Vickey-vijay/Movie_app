package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class ry0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0 f82465a;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f82465a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.zf0
    public final void c() {
        this.f82465a.c();
    }

    public ry0(zf0 zf0Var) {
        this.f82465a = zf0Var;
    }
}
