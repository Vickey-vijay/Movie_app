package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.j f61676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainMRECCallBack f61677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f61678c;

    public z1(c0 c0Var, h.j jVar, MainMRECCallBack mainMRECCallBack) {
        this.f61678c = c0Var;
        this.f61676a = jVar;
        this.f61677b = mainMRECCallBack;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        c0 c0Var = this.f61678c;
        if (c0Var.ILL) {
            return;
        }
        c0Var.ILL = true;
        this.f61676a.s("onAdClick");
        this.f61676a.i(2, null);
        this.f61678c.IL1Iii.runOnUiThread(new r2(this));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
        c0 c0Var = this.f61678c;
        if (c0Var.f3378Ll1) {
            return;
        }
        c0Var.f3378Ll1 = true;
        this.f61676a.s("onAdClose");
        this.f61676a.i(5, null);
        this.f61678c.IL1Iii.runOnUiThread(new g(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61676a.y();
        this.f61676a.s("onAdFail = " + str);
        this.f61676a.k(4, this.f61678c.LL1IL);
        this.f61676a.g(0);
        this.f61678c.IL1Iii.runOnUiThread(new s(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
        this.f61676a.y();
        this.f61676a.k(8, this.f61678c.LL1IL);
        this.f61676a.g(1);
        c0 c0Var = this.f61678c;
        if (c0Var.f3385llL1ii) {
            return;
        }
        c0Var.f3385llL1ii = true;
        c0Var.iIlLiL = false;
        this.f61676a.s(Mf.f27060j);
        this.f61678c.setRevenue(this.f61676a.f61604y);
        this.f61678c.IL1Iii();
        this.f61678c.IL1Iii.runOnUiThread(new h1(this, view));
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
        c0 c0Var = this.f61678c;
        if (c0Var.f3387il) {
            return;
        }
        c0Var.f3387il = true;
        this.f61676a.s("onAdShow");
        this.f61676a.h(0, adInfo, this.f61678c.LL1IL, 0L, 0L, null);
        this.f61678c.IL1Iii.runOnUiThread(new i0(this, adInfo));
    }
}
