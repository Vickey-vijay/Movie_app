package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f61650d;

    public t1(e2 e2Var, int i10, String str) {
        this.f61650d = e2Var;
        this.f61648b = i10;
        this.f61649c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e2 e2Var = this.f61650d;
        e2Var.f61489c.IL1Iii(this.f61648b, this.f61649c, e2Var.f61488b);
        MainSplashAdCallBack mainSplashAdCallBack = this.f61650d.f61489c.f61477e;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdFail(this.f61648b, this.f61649c);
        }
    }
}
