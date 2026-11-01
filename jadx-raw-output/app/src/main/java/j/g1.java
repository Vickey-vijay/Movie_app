package j;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f61500c;

    public g1(d0 d0Var, View view) {
        this.f61500c = d0Var;
        this.f61499b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f61500c.f61471b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdLoaded(this.f61499b);
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f61500c.f61472c.f61571e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdLoaded(this.f61499b);
        }
    }
}
