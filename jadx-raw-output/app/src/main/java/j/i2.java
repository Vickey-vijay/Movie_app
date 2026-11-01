package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes8.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f61515d;

    public i2(p pVar, int i10, String str) {
        this.f61515d = pVar;
        this.f61513b = i10;
        this.f61514c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f61515d;
        a0 a0Var = pVar.f61616c;
        if (!a0Var.iIi1) {
            a0Var.iIi1 = true;
            a0Var.IL1Iii(this.f61513b, this.f61514c, pVar.f61615b);
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f61515d.f61616c.f61438d;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(this.f61513b, this.f61514c);
        }
    }
}
