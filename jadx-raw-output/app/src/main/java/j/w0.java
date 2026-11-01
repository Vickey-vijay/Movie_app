package j;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f61660c;

    public w0(k2 k2Var, View view) {
        this.f61660c = k2Var;
        this.f61659b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f61660c.f61532b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdLoaded(this.f61659b);
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f61660c.f61533c.f61485e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdLoaded(this.f61659b);
        }
    }
}
