package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f61668b;

    public x1(e2 e2Var) {
        this.f61668b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61668b.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdSkipped();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61668b.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdSkipped();
        }
    }
}
