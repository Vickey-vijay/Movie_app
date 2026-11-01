package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class qq3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f81940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f81941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq3(tq3 tq3Var, lr3 lr3Var) {
        super(0);
        this.f81940b = tq3Var;
        this.f81941c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f81940b.f83142a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(this.f81941c);
        }
        return mj.r.f64562a;
    }
}
