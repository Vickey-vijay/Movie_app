package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f61503b;

    public h(d0 d0Var) {
        this.f61503b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f61503b.f61471b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClose();
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f61503b.f61472c.f61571e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdClose();
        }
    }
}
