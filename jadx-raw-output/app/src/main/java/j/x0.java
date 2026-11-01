package j;

import com.ironsource.Mf;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;
import com.yk.e.subad.MainFloatViewLoader;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements MainFloatViewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final il.e f61665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainFloatViewCallback f61666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainFloatViewLoader f61667c;

    public x0(MainFloatViewLoader mainFloatViewLoader, il.e eVar, MainFloatViewCallback mainFloatViewCallback) {
        this.f61667c = mainFloatViewLoader;
        this.f61665a = eVar;
        this.f61666b = mainFloatViewCallback;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        MainFloatViewLoader mainFloatViewLoader = this.f61667c;
        if (mainFloatViewLoader.ILL) {
            return;
        }
        mainFloatViewLoader.ILL = true;
        this.f61665a.s("onAdClick");
        this.f61665a.i(2, null);
        this.f61667c.IL1Iii.runOnUiThread(new h0(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdClose() {
        MainFloatViewLoader mainFloatViewLoader = this.f61667c;
        if (mainFloatViewLoader.f3378Ll1) {
            return;
        }
        mainFloatViewLoader.f3378Ll1 = true;
        this.f61665a.s("onAdClose");
        this.f61665a.i(5, null);
        this.f61667c.IL1Iii.runOnUiThread(new t0(this));
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        try {
            il.e eVar = this.f61665a;
            if (eVar != null) {
                eVar.y();
                this.f61665a.s("onAdFail = " + str);
                this.f61665a.k(4, this.f61667c.LL1IL);
                this.f61665a.g(0);
            }
            this.f61667c.IL1Iii.runOnUiThread(new j0(this, i10, str));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdHide() {
        this.f61665a.s("onAdHide");
        this.f61667c.IL1Iii.runOnUiThread(new q1(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdLoaded() {
        this.f61665a.y();
        this.f61665a.k(8, this.f61667c.LL1IL);
        this.f61665a.g(1);
        MainFloatViewLoader mainFloatViewLoader = this.f61667c;
        if (mainFloatViewLoader.f3385llL1ii) {
            return;
        }
        mainFloatViewLoader.f3385llL1ii = true;
        mainFloatViewLoader.iIlLiL = false;
        this.f61665a.s(Mf.f27060j);
        this.f61667c.IL1Iii();
        this.f61667c.IL1Iii.runOnUiThread(new n(this));
    }

    @Override // com.yk.e.callBack.MainFloatViewCallback
    public final void onAdShow(AdInfo adInfo) {
        MainFloatViewLoader mainFloatViewLoader = this.f61667c;
        if (!mainFloatViewLoader.f3387il) {
            mainFloatViewLoader.f3387il = true;
            this.f61665a.s("onAdShow");
            this.f61665a.h(0, adInfo, this.f61667c.LL1IL, 0L, 0L, null);
        }
        this.f61667c.IL1Iii.runOnUiThread(new w1(this, adInfo));
    }
}
