package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f61494b;

    public f1(b2 b2Var) {
        this.f61494b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f61494b.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdVideoCache();
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61494b.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdVideoCache();
        }
    }
}
