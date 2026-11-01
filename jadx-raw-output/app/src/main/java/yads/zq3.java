package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class zq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f85568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f85569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq3(er3 er3Var, AdRequestError adRequestError) {
        super(0);
        this.f85568b = er3Var;
        this.f85569c = adRequestError;
    }

    @Override // bk.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f85568b.f77189a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onAdFailedToLoad(this.f85569c);
        }
        return mj.r.f64562a;
    }
}
