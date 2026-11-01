package hl;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f53989a;

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
    }

    public t(b bVar) {
        this.f53989a = bVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53989a.q("onAdClick");
        this.f53989a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f53989a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
        this.f53989a.q("onAdClose");
        this.f53989a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f53989a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53989a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
        this.f53989a.q("onAdShow");
        this.f53989a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f53989a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
        this.f53989a.q("onAdVideoComplete");
        this.f53989a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f53989a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
        this.f53989a.q("onAdVideoStart");
        this.f53989a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f53989a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoStart();
        }
    }
}
