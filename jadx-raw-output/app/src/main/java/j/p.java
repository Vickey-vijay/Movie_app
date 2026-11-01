package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe.i0 f61614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainInterstitialAdCallBack f61615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f61616c;

    public p(a0 a0Var, xe.i0 i0Var, MainInterstitialAdCallBack mainInterstitialAdCallBack) {
        this.f61616c = a0Var;
        this.f61614a = i0Var;
        this.f61615b = mainInterstitialAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        a0 a0Var = this.f61616c;
        if (a0Var.ILL) {
            return;
        }
        a0Var.ILL = true;
        this.f61614a.s("onAdClick");
        this.f61614a.i(2, null);
        this.f61616c.IL1Iii.runOnUiThread(new o2(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
        a0 a0Var = this.f61616c;
        if (a0Var.f3378Ll1) {
            return;
        }
        a0Var.f3378Ll1 = true;
        this.f61614a.s("onAdClose");
        this.f61614a.i(5, null);
        this.f61616c.IL1Iii.runOnUiThread(new u1(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61614a.y();
        this.f61614a.s("onAdFail = " + str);
        this.f61614a.k(4, this.f61616c.LL1IL);
        this.f61614a.g(0);
        this.f61616c.IL1Iii.runOnUiThread(new i2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
        this.f61614a.y();
        a0 a0Var = this.f61616c;
        if (a0Var.f3385llL1ii) {
            return;
        }
        a0Var.f3385llL1ii = true;
        this.f61614a.s(Mf.f27060j);
        this.f61614a.k(8, this.f61616c.LL1IL);
        this.f61614a.g(1);
        this.f61616c.setRevenue(this.f61614a.f61604y);
        a0 a0Var2 = this.f61616c;
        a0Var2.iIlLiL = false;
        a0Var2.IL1Iii();
        a0 a0Var3 = this.f61616c;
        a0Var3.f61436b = this.f61614a;
        a0Var3.IL1Iii.runOnUiThread(new t(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        a0 a0Var = this.f61616c;
        if (a0Var.f3387il) {
            return;
        }
        a0Var.f3387il = true;
        this.f61614a.s("onAdShow");
        this.f61614a.h(0, adInfo, this.f61616c.LL1IL, 0L, 0L, null);
        this.f61616c.IL1Iii.runOnUiThread(new p2(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
        a0 a0Var = this.f61616c;
        if (a0Var.f61671Lil) {
            return;
        }
        a0Var.f61671Lil = true;
        this.f61614a.s("onAdVideoComplete");
        this.f61614a.i(1, null);
        this.f61616c.IL1Iii.runOnUiThread(new m0(this));
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
        a0 a0Var = this.f61616c;
        if (a0Var.f3384lIlii) {
            return;
        }
        a0Var.f3384lIlii = true;
        this.f61614a.s("onAdVideoStart");
        this.f61616c.IL1Iii.runOnUiThread(new k1(this));
    }
}
