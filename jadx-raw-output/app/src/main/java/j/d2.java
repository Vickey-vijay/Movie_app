package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class d2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f61478b;

    public d2(k2 k2Var) {
        this.f61478b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f61478b.f61532b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f61478b.f61533c.f61485e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdClick();
        }
    }
}
