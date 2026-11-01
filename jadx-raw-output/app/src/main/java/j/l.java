package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f61534b;

    public l(z zVar) {
        this.f61534b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61534b.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61534b.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdClick();
        }
    }
}
