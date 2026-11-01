package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class sq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f82735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq3(tq3 tq3Var) {
        super(0);
        this.f82735b = tq3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f82735b.f83142a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
        return mj.r.f64562a;
    }
}
