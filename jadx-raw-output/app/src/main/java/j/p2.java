package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f61622c;

    public p2(p pVar, AdInfo adInfo) {
        this.f61622c = pVar;
        this.f61621b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61622c.f61615b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdShow(this.f61621b);
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f61622c.f61616c.f61438d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdShow(this.f61621b);
        }
    }
}
