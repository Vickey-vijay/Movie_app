package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f61566b;

    public m1(e2 e2Var) {
        this.f61566b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61566b.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClose();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61566b.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdClose();
        }
    }
}
