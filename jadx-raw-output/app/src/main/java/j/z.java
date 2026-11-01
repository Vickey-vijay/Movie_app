package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.r f61672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainNativeAdCallBack f61673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f61674c;

    public z(s0 s0Var, l.r rVar, MainNativeAdCallBack mainNativeAdCallBack) {
        this.f61674c = s0Var;
        this.f61672a = rVar;
        this.f61673b = mainNativeAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        s0 s0Var = this.f61674c;
        if (s0Var.ILL) {
            return;
        }
        s0Var.ILL = true;
        this.f61672a.s("onAdClick");
        this.f61672a.i(2, null);
        this.f61674c.IL1Iii.runOnUiThread(new l(this));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
        s0 s0Var = this.f61674c;
        if (s0Var.f3378Ll1) {
            return;
        }
        s0Var.f3378Ll1 = true;
        this.f61672a.s("onAdClose");
        this.f61672a.i(5, null);
        this.f61674c.IL1Iii.runOnUiThread(new u0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61672a.y();
        this.f61672a.s("onAdFail = " + str);
        this.f61672a.k(4, this.f61674c.LL1IL);
        this.f61672a.g(0);
        this.f61674c.IL1Iii.runOnUiThread(new a2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
        this.f61672a.y();
        this.f61672a.k(8, this.f61674c.LL1IL);
        this.f61672a.g(1);
        this.f61674c.setRevenue(this.f61672a.f61604y);
        this.f61674c.getClass();
        s0 s0Var = this.f61674c;
        if (s0Var.f3385llL1ii) {
            return;
        }
        s0Var.f3385llL1ii = true;
        s0Var.iIlLiL = false;
        this.f61672a.s(Mf.f27060j);
        this.f61674c.IL1Iii();
        this.f61674c.IL1Iii.runOnUiThread(new r0(this, view));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        s0 s0Var = this.f61674c;
        if (s0Var.f3387il) {
            return;
        }
        s0Var.f3387il = true;
        this.f61672a.s("onAdShow");
        this.f61672a.h(0, adInfo, this.f61674c.LL1IL, 0L, 0L, null);
        this.f61674c.IL1Iii.runOnUiThread(new e(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
        s0 s0Var = this.f61674c;
        if (s0Var.f61671Lil) {
            return;
        }
        s0Var.f61671Lil = true;
        this.f61672a.s("onAdVideoComplete");
        this.f61674c.IL1Iii.runOnUiThread(new e1(this));
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
        s0 s0Var = this.f61674c;
        if (s0Var.f3384lIlii) {
            return;
        }
        s0Var.f3384lIlii = true;
        this.f61672a.s("onAdVideoStart");
        this.f61674c.IL1Iii.runOnUiThread(new p0(this));
    }
}
