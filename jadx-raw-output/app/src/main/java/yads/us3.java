package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class us3 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f83594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us3(zs3 zs3Var) {
        super(0);
        this.f83594b = zs3Var;
    }

    @Override // bk.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f83594b.f85582a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
        return mj.r.f64562a;
    }
}
