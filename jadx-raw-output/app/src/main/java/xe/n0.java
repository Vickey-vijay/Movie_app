package xe;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f74457b;

    public n0(u uVar) {
        this.f74457b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f74457b.D;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClick();
        }
    }
}
