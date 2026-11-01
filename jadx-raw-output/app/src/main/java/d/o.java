package d;

import android.view.View;
import com.yk.e.adview.WorldNativeView;
import com.yk.e.callBack.MainWdNativeAdCallback;
import e.e0;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorldNativeView f51777b;

    public o(WorldNativeView worldNativeView) {
        this.f51777b = worldNativeView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f51777b.f3355l;
        if (nVar != null) {
            e0 e0Var = (e0) nVar;
            e.a aVar = e0Var.f52291a;
            aVar.m(aVar.M, 29);
            MainWdNativeAdCallback mainWdNativeAdCallback = e0Var.f52291a.L;
            if (mainWdNativeAdCallback != null) {
                mainWdNativeAdCallback.onAdClick();
            }
        }
    }
}
