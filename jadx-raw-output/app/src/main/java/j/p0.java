package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f61617b;

    public p0(z zVar) {
        this.f61617b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61617b.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoStart();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61617b.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdVideoStart();
        }
    }
}
