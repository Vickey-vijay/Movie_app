package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements MainBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.x f61618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainBannerCallBack f61619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f61620c;

    public p1(b0 b0Var, f.x xVar, MainBannerCallBack mainBannerCallBack) {
        this.f61620c = b0Var;
        this.f61618a = xVar;
        this.f61619b = mainBannerCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        b0 b0Var = this.f61620c;
        if (b0Var.ILL) {
            return;
        }
        b0Var.ILL = true;
        this.f61618a.s("onAdClick");
        this.f61618a.i(2, null);
        this.f61620c.IL1Iii.runOnUiThread(new v1(this));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdClose() {
        b0 b0Var = this.f61620c;
        if (b0Var.f3378Ll1) {
            return;
        }
        b0Var.f3378Ll1 = true;
        this.f61618a.s("onAdClose");
        this.f61618a.i(5, null);
        this.f61620c.IL1Iii.runOnUiThread(new o0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61618a.y();
        this.f61618a.s("onAdFail = " + str);
        this.f61618a.k(4, this.f61620c.LL1IL);
        this.f61618a.g(0);
        this.f61620c.IL1Iii.runOnUiThread(new n2(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdLoaded(View view) {
        this.f61618a.y();
        this.f61618a.k(8, this.f61620c.LL1IL);
        this.f61618a.g(1);
        b0 b0Var = this.f61620c;
        if (b0Var.f3385llL1ii) {
            return;
        }
        b0Var.f3385llL1ii = true;
        b0Var.iIlLiL = false;
        this.f61618a.s(Mf.f27060j);
        this.f61620c.setRevenue(this.f61618a.f61604y);
        this.f61620c.IL1Iii();
        this.f61620c.IL1Iii.runOnUiThread(new a(this, view));
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        b0 b0Var = this.f61620c;
        if (b0Var.f3387il) {
            return;
        }
        b0Var.f3387il = true;
        this.f61618a.s("onAdShow");
        this.f61618a.h(0, adInfo, this.f61620c.LL1IL, 0L, 0L, null);
        this.f61620c.IL1Iii.runOnUiThread(new q2(this, adInfo));
    }
}
