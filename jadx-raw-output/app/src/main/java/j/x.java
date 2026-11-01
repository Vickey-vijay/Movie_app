package j;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f61664c;

    public x(e2 e2Var, AdInfo adInfo) {
        this.f61664c = e2Var;
        this.f61663b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f61664c.f61488b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdShow(this.f61663b);
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f61664c.f61489c.f61477e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdShow(this.f61663b);
        }
    }
}
