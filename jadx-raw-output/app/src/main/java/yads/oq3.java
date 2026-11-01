package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class oq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f81128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f81129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq3(tq3 tq3Var, AdRequestError adRequestError) {
        super(0);
        this.f81128b = tq3Var;
        this.f81129c = adRequestError;
    }

    @Override // bk.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f81128b.f83142a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(this.f81129c);
        }
        return mj.r.f64562a;
    }
}
