package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class dr3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f76789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr3(er3 er3Var) {
        super(0);
        this.f76789b = er3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f76789b.f77189a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onReturnedToApplication();
        }
        return mj.r.f64562a;
    }
}
