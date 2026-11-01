package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f61657b;

    public v1(p1 p1Var) {
        this.f61657b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f61657b.f61619b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
        MainBannerCallBack mainBannerCallBack2 = this.f61657b.f61620c.f61448e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdClick();
        }
    }
}
