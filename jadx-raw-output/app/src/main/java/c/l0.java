package c;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5580b;

    public l0(v vVar) {
        this.f5580b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f5580b.B;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClick();
        }
    }
}
