package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class b2 implements MainRewardVideoAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f f61450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainRewardVideoAdCallBack f61451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f61452c;

    public b2(j1 j1Var, c.f fVar, MainRewardVideoAdCallBack mainRewardVideoAdCallBack) {
        this.f61452c = j1Var;
        this.f61450a = fVar;
        this.f61451b = mainRewardVideoAdCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        j1 j1Var = this.f61452c;
        if (j1Var.ILL) {
            return;
        }
        j1Var.ILL = true;
        this.f61450a.s("onAdClick");
        this.f61450a.i(2, null);
        this.f61452c.IL1Iii.runOnUiThread(new v0(this));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdClose() {
        j1 j1Var = this.f61452c;
        if (j1Var.f3378Ll1) {
            return;
        }
        j1Var.f3378Ll1 = true;
        this.f61450a.s("onAdClose");
        this.f61450a.i(5, null);
        this.f61452c.IL1Iii.runOnUiThread(new w(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61450a.y();
        this.f61450a.s("onAdFail = " + str);
        this.f61450a.k(4, this.f61452c.LL1IL);
        this.f61450a.g(0);
        this.f61452c.IL1Iii.runOnUiThread(new f0(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        j1 j1Var = this.f61452c;
        if (j1Var.f3387il) {
            return;
        }
        j1Var.f3387il = true;
        this.f61450a.s("onAdShow");
        this.f61450a.h(0, adInfo, this.f61452c.LL1IL, 0L, 0L, null);
        this.f61452c.IL1Iii.runOnUiThread(new g2(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoCache() {
        this.f61450a.y();
        j1 j1Var = this.f61452c;
        if (j1Var.f3374ILl) {
            return;
        }
        j1Var.f3374ILl = true;
        this.f61450a.s("onAdVideoCache");
        this.f61450a.k(8, this.f61452c.LL1IL);
        this.f61450a.g(1);
        this.f61452c.setRevenue(this.f61450a.f61604y);
        j1 j1Var2 = this.f61452c;
        j1Var2.iIlLiL = false;
        j1Var2.f61521b = this.f61450a;
        j1Var2.IL1Iii();
        this.f61452c.IL1Iii.runOnUiThread(new f1(this));
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoComplete() {
        j1 j1Var = this.f61452c;
        if (j1Var.f61671Lil) {
            return;
        }
        j1Var.f61671Lil = true;
        this.f61450a.s("onAdVideoComplete");
        this.f61450a.i(1, null);
        this.f61452c.IL1Iii.runOnUiThread(new n1(this));
    }

    @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
    public final void onReward(String str) {
        j1 j1Var = this.f61452c;
        if (j1Var.LlLI1) {
            return;
        }
        j1Var.LlLI1 = true;
        this.f61450a.s("onReward");
        this.f61450a.i(10, new y0(this));
    }
}
