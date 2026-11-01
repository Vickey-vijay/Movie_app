package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f61580b;

    public n(x0 x0Var) {
        this.f61580b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f61580b.f61666b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdLoaded();
        }
    }
}
