package j;

import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f61629c;

    public q2(p1 p1Var, AdInfo adInfo) {
        this.f61629c = p1Var;
        this.f61628b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f61629c.f61619b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(this.f61628b);
        }
        MainBannerCallBack mainBannerCallBack2 = this.f61629c.f61620c.f61448e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdShow(this.f61628b);
        }
    }
}
