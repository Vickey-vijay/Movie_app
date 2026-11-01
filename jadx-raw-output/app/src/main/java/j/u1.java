package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f61653b;

    public u1(p pVar) {
        this.f61653b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61653b.f61615b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClose();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f61653b.f61616c.f61438d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdClose();
        }
    }
}
