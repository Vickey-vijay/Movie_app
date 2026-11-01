package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f61516b;

    public j(e2 e2Var) {
        this.f61516b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61516b.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdLoaded();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61516b.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdLoaded();
        }
    }
}
