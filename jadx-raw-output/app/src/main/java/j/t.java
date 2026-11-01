package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f61646b;

    public t(p pVar) {
        this.f61646b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61646b.f61615b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdLoaded();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f61646b.f61616c.f61438d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdLoaded();
        }
    }
}
