package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f61530b;

    public k1(p pVar) {
        this.f61530b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61530b.f61615b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoStart();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f61530b.f61616c.f61438d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdVideoStart();
        }
    }
}
