package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class e2 implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.t0 f61487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainSplashAdCallBack f61488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f61489c;

    public e2(d1 d1Var, k.t0 t0Var, MainSplashAdCallBack mainSplashAdCallBack) {
        this.f61489c = d1Var;
        this.f61487a = t0Var;
        this.f61488b = mainSplashAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        d1 d1Var = this.f61489c;
        if (d1Var.ILL) {
            return;
        }
        d1Var.ILL = true;
        this.f61487a.s("onAdClick");
        this.f61487a.i(2, null);
        this.f61489c.IL1Iii.runOnUiThread(new y(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
        d1 d1Var = this.f61489c;
        if (d1Var.f3378Ll1) {
            return;
        }
        d1Var.f3378Ll1 = true;
        this.f61487a.s("onAdClose");
        this.f61487a.i(5, null);
        this.f61489c.IL1Iii.runOnUiThread(new m1(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
        d1 d1Var = this.f61489c;
        if (d1Var.f3379L11I) {
            return;
        }
        d1Var.f3379L11I = true;
        this.f61487a.s("onAdComplete");
        this.f61487a.i(1, null);
        this.f61489c.IL1Iii.runOnUiThread(new c2(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61487a.y();
        this.f61487a.s("onAdFail = " + str);
        this.f61487a.k(4, this.f61489c.LL1IL);
        this.f61487a.g(0);
        this.f61489c.IL1Iii.runOnUiThread(new t1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
        this.f61487a.y();
        this.f61487a.k(8, this.f61489c.LL1IL);
        this.f61487a.g(1);
        d1 d1Var = this.f61489c;
        if (d1Var.f3385llL1ii) {
            return;
        }
        d1Var.f3385llL1ii = true;
        d1Var.iIlLiL = false;
        this.f61487a.s(Mf.f27060j);
        this.f61489c.IL1Iii();
        this.f61489c.setRevenue(this.f61487a.f61604y);
        this.f61489c.IL1Iii.runOnUiThread(new j(this));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        d1 d1Var = this.f61489c;
        if (d1Var.f3387il) {
            return;
        }
        d1Var.f3387il = true;
        this.f61487a.s("onAdShow");
        this.f61487a.h(0, adInfo, this.f61489c.LL1IL, 0L, 0L, null);
        this.f61489c.IL1Iii.runOnUiThread(new x(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
        d1 d1Var = this.f61489c;
        if (d1Var.f3376IiL) {
            return;
        }
        d1Var.f3376IiL = true;
        this.f61487a.s("onAdSkipped");
        this.f61487a.i(3, null);
        this.f61489c.IL1Iii.runOnUiThread(new x1(this));
    }
}
