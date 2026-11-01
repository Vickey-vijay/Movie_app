package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f61647b;

    public t0(x0 x0Var) {
        this.f61647b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f61647b.f61666b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdClose();
        }
    }
}
