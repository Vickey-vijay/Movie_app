package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f61490b;

    public f(d0 d0Var) {
        this.f61490b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f61490b.f61471b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f61490b.f61472c.f61571e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdClick();
        }
    }
}
