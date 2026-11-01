package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f61609d;

    public n2(p1 p1Var, int i10, String str) {
        this.f61609d = p1Var;
        this.f61607b = i10;
        this.f61608c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var = this.f61609d;
        p1Var.f61620c.IL1Iii(this.f61607b, this.f61608c, p1Var.f61619b);
        MainBannerCallBack mainBannerCallBack = this.f61609d.f61620c.f61448e;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdFail(this.f61607b, this.f61608c);
        }
    }
}
