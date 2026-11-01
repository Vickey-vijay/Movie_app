package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f61565b;

    public m0(p pVar) {
        this.f61565b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61565b.f61615b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoComplete();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f61565b.f61616c.f61438d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdVideoComplete();
        }
    }
}
