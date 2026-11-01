package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class br3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f75938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f75939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br3(er3 er3Var, lr3 lr3Var) {
        super(0);
        this.f75938b = er3Var;
        this.f75939c = lr3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f75938b.f77189a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onImpression(this.f75939c);
        }
        return mj.r.f64562a;
    }
}
