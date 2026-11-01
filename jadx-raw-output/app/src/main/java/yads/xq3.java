package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f84675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq3(er3 er3Var) {
        super(0);
        this.f84675b = er3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f84675b.f77189a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.closeBannerAd();
        }
        return mj.r.f64562a;
    }
}
