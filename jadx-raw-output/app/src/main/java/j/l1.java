package j;

import android.view.View;
import com.ironsource.Mf;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp.u f61561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainMaterialCallback f61562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f61563c;

    public l1(d dVar, dp.u uVar, MainMaterialCallback mainMaterialCallback) {
        this.f61563c = dVar;
        this.f61561a = uVar;
        this.f61562b = mainMaterialCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        d dVar = this.f61563c;
        if (dVar.ILL) {
            return;
        }
        dVar.ILL = true;
        this.f61561a.s("onAdClick");
        this.f61561a.i(2, null);
        this.f61563c.IL1Iii.runOnUiThread(new o(this));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
        d dVar = this.f61563c;
        if (dVar.f3378Ll1) {
            return;
        }
        dVar.f3378Ll1 = true;
        this.f61561a.s("onAdClose");
        this.f61561a.i(5, null);
        this.f61563c.IL1Iii.runOnUiThread(new f2(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f61561a.y();
        this.f61561a.s("onAdFail = " + str);
        this.f61561a.k(4, this.f61563c.LL1IL);
        this.f61561a.g(0);
        this.f61563c.IL1Iii.runOnUiThread(new c1(this, i10, str));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
        this.f61561a.y();
        this.f61561a.k(8, this.f61563c.LL1IL);
        this.f61561a.g(1);
        this.f61563c.setRevenue(this.f61561a.f61604y);
        d dVar = this.f61563c;
        if (dVar.f3385llL1ii) {
            return;
        }
        dVar.f3385llL1ii = true;
        dVar.iIlLiL = false;
        this.f61561a.s(Mf.f27060j);
        this.f61563c.IL1Iii();
        this.f61563c.IL1Iii.runOnUiThread(new k0(this, view));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
        d dVar = this.f61563c;
        if (dVar.f3387il) {
            return;
        }
        dVar.f3387il = true;
        this.f61561a.s("onAdShow");
        this.f61561a.h(0, adInfo, this.f61563c.LL1IL, 0L, 0L, null);
        this.f61563c.IL1Iii.runOnUiThread(new a1(this, adInfo));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
        d dVar = this.f61563c;
        if (dVar.f61671Lil) {
            return;
        }
        dVar.f61671Lil = true;
        this.f61561a.s("onAdVideoComplete");
        this.f61561a.i(1, null);
        this.f61563c.IL1Iii.runOnUiThread(new r1(this));
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
        d dVar = this.f61563c;
        if (dVar.f3384lIlii) {
            return;
        }
        dVar.f3384lIlii = true;
        this.f61561a.s("onAdVideoStart");
        this.f61563c.IL1Iii.runOnUiThread(new u(this));
    }
}
