package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.c0 f61470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainWdNativeAdCallback f61471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m2 f61472c;

    public d0(m2 m2Var, e.c0 c0Var, MainWdNativeAdCallback mainWdNativeAdCallback) {
        this.f61472c = m2Var;
        this.f61470a = c0Var;
        this.f61471b = mainWdNativeAdCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        m2 m2Var = this.f61472c;
        if (m2Var.ILL) {
            return;
        }
        m2Var.ILL = true;
        this.f61470a.s("onAdClick");
        this.f61470a.i(2, null);
        this.f61472c.IL1Iii.runOnUiThread(new f(this));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
        m2 m2Var = this.f61472c;
        if (m2Var.f3378Ll1) {
            return;
        }
        m2Var.f3378Ll1 = true;
        this.f61470a.s("onAdClose");
        this.f61470a.i(5, null);
        this.f61472c.IL1Iii.runOnUiThread(new h(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61470a.y();
        this.f61470a.s("onAdFail = " + str);
        this.f61470a.k(4, this.f61472c.LL1IL);
        this.f61470a.g(0);
        this.f61472c.IL1Iii.runOnUiThread(new h2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
        this.f61470a.y();
        this.f61470a.k(8, this.f61472c.LL1IL);
        this.f61470a.g(1);
        m2 m2Var = this.f61472c;
        if (m2Var.f3385llL1ii) {
            return;
        }
        m2Var.f3385llL1ii = true;
        m2Var.iIlLiL = false;
        this.f61470a.s(Mf.f27060j);
        this.f61472c.IL1Iii();
        this.f61472c.setRevenue(this.f61470a.f61604y);
        this.f61472c.IL1Iii.runOnUiThread(new g1(this, view));
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
        m2 m2Var = this.f61472c;
        if (m2Var.f3387il) {
            return;
        }
        m2Var.f3387il = true;
        this.f61470a.s("onAdShow");
        this.f61470a.h(0, adInfo, this.f61472c.LL1IL, 0L, 0L, null);
        this.f61472c.IL1Iii.runOnUiThread(new v(this, adInfo));
    }
}
