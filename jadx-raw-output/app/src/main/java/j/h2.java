package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f61509d;

    public h2(d0 d0Var, int i10, String str) {
        this.f61509d = d0Var;
        this.f61507b = i10;
        this.f61508c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var = this.f61509d;
        d0Var.f61472c.IL1Iii(this.f61507b, this.f61508c, d0Var.f61471b);
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f61509d.f61472c.f61571e;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdFail(this.f61507b, this.f61508c);
        }
    }
}
