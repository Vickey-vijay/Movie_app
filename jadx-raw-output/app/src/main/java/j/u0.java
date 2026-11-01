package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f61652b;

    public u0(z zVar) {
        this.f61652b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61652b.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClose();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61652b.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdClose();
        }
    }
}
