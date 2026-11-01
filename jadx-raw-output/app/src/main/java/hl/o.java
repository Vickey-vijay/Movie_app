package hl;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f53975a;

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
    }

    public o(w wVar) {
        this.f53975a = wVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53975a.q("onAdClick");
        this.f53975a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f53975a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
        this.f53975a.q("onAdClose");
        this.f53975a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f53975a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53975a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53975a.q("onAdShow");
        this.f53975a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f53975a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(adInfo);
        }
    }
}
