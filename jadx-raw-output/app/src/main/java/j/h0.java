package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f61504b;

    public h0(x0 x0Var) {
        this.f61504b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f61504b.f61666b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdClick();
        }
    }
}
