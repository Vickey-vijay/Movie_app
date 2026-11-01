package dp;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements gl.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f52263a;

    public l0(g gVar) {
        this.f52263a = gVar;
    }

    @Override // gl.u
    public final void onAdClick() {
        MainMaterialCallback mainMaterialCallback = this.f52263a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    @Override // gl.u
    public final void onAdLoaded(View view) {
        MainMaterialCallback mainMaterialCallback = this.f52263a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdLoaded(view);
        }
    }

    @Override // gl.u
    public final void onAdShow(AdInfo adInfo) {
        MainMaterialCallback mainMaterialCallback = this.f52263a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(adInfo);
        }
    }
}
