package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f61486b;

    public e1(z zVar) {
        this.f61486b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f61486b.f61673b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoComplete();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f61486b.f61674c.f61642e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdVideoComplete();
        }
    }
}
