package j;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f61434c;

    public a(p1 p1Var, View view) {
        this.f61434c = p1Var;
        this.f61433b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f61434c.f61619b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdLoaded(this.f61433b);
        }
        MainBannerCallBack mainBannerCallBack2 = this.f61434c.f61620c.f61448e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdLoaded(this.f61433b);
        }
    }
}
