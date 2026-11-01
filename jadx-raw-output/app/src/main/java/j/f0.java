package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f61493d;

    public f0(b2 b2Var, int i10, String str) {
        this.f61493d = b2Var;
        this.f61491b = i10;
        this.f61492c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b2 b2Var = this.f61493d;
        j1 j1Var = b2Var.f61452c;
        if (!j1Var.f3374ILl) {
            j1Var.IL1Iii(this.f61491b, this.f61492c, b2Var.f61451b);
            return;
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = b2Var.f61451b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdFail(this.f61491b, this.f61492c);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f61493d.f61452c.f61525f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdFail(this.f61491b, this.f61492c);
        }
    }
}
