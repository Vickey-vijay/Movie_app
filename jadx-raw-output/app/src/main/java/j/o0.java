package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f61611b;

    public o0(p1 p1Var) {
        this.f61611b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f61611b.f61619b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClose();
        }
        MainBannerCallBack mainBannerCallBack2 = this.f61611b.f61620c.f61448e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdClose();
        }
    }
}
