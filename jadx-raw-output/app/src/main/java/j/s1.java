package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f61645d;

    public s1(k2 k2Var, int i10, String str) {
        this.f61645d = k2Var;
        this.f61643b = i10;
        this.f61644c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2 k2Var = this.f61645d;
        k2Var.f61533c.IL1Iii(this.f61643b, this.f61644c, k2Var.f61532b);
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f61645d.f61533c.f61485e;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdFail(this.f61643b, this.f61644c);
        }
    }
}
