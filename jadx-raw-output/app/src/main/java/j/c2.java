package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f61462b;

    public c2(e2 e2Var) {
        this.f61462b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61462b.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdComplete();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61462b.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdComplete();
        }
    }
}
