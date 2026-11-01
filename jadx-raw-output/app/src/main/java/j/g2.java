package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f61502c;

    public g2(b2 b2Var, AdInfo adInfo) {
        this.f61502c = b2Var;
        this.f61501b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f61502c.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdShow(this.f61501b);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61502c.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdShow(this.f61501b);
        }
    }
}
