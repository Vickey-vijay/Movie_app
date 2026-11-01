package j;

import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f61626c;

    public q0(k2 k2Var, AdInfo adInfo) {
        this.f61626c = k2Var;
        this.f61625b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f61626c.f61532b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdShow(this.f61625b);
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f61626c.f61533c.f61485e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdShow(this.f61625b);
        }
    }
}
