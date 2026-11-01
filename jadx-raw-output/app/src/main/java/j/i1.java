package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f61512b;

    public i1(y0 y0Var) {
        this.f61512b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f61512b.f61670a.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onReward("");
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61512b.f61670a.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onReward("");
        }
    }
}
