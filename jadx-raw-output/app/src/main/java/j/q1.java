package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f61627b;

    public q1(x0 x0Var) {
        this.f61627b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f61627b.f61666b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdHide();
        }
    }
}
