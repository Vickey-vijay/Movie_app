package j;

import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f61655c;

    public v(d0 d0Var, AdInfo adInfo) {
        this.f61655c = d0Var;
        this.f61654b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f61655c.f61471b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(this.f61654b);
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f61655c.f61472c.f61571e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdShow(this.f61654b);
        }
    }
}
