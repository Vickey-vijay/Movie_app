package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f61658b;

    public w(b2 b2Var) {
        this.f61658b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f61658b.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClose();
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61658b.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdClose();
        }
    }
}
