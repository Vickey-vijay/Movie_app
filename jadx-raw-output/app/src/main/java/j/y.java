package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f61669b;

    public y(e2 e2Var) {
        this.f61669b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61669b.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61669b.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdClick();
        }
    }
}
