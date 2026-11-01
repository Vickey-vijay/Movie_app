package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl.j f61531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainThirdBannerCallBack f61532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f61533c;

    public k2(e0 e0Var, fl.j jVar, MainThirdBannerCallBack mainThirdBannerCallBack) {
        this.f61533c = e0Var;
        this.f61531a = jVar;
        this.f61532b = mainThirdBannerCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        e0 e0Var = this.f61533c;
        if (e0Var.ILL) {
            return;
        }
        e0Var.ILL = true;
        this.f61531a.s("onAdClick");
        this.f61531a.i(2, null);
        this.f61533c.IL1Iii.runOnUiThread(new d2(this));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
        e0 e0Var = this.f61533c;
        if (e0Var.f3378Ll1) {
            return;
        }
        e0Var.f3378Ll1 = true;
        this.f61531a.s("onAdClose");
        this.f61531a.i(5, null);
        this.f61533c.IL1Iii.runOnUiThread(new b1(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61531a.y();
        this.f61531a.s("onAdFail = " + str);
        this.f61531a.k(4, this.f61533c.LL1IL);
        this.f61531a.g(0);
        this.f61533c.IL1Iii.runOnUiThread(new s1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
        this.f61531a.y();
        this.f61531a.k(8, this.f61533c.LL1IL);
        this.f61531a.g(1);
        e0 e0Var = this.f61533c;
        if (e0Var.f3385llL1ii) {
            return;
        }
        e0Var.f3385llL1ii = true;
        e0Var.iIlLiL = false;
        this.f61531a.s(Mf.f27060j);
        this.f61533c.setRevenue(this.f61531a.f61604y);
        this.f61533c.IL1Iii();
        this.f61533c.IL1Iii.runOnUiThread(new w0(this, view));
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        e0 e0Var = this.f61533c;
        if (e0Var.f3387il) {
            return;
        }
        e0Var.f3387il = true;
        this.f61531a.s("onAdShow");
        this.f61531a.h(0, adInfo, this.f61533c.LL1IL, 0L, 0L, null);
        this.f61533c.IL1Iii.runOnUiThread(new q0(this, adInfo));
    }
}
