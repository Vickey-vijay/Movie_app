package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f61449b;

    public b1(k2 k2Var) {
        this.f61449b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f61449b.f61532b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClose();
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f61449b.f61533c.f61485e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdClose();
        }
    }
}
