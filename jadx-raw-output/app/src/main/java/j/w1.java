package j;

import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f61662c;

    public w1(x0 x0Var, AdInfo adInfo) {
        this.f61662c = x0Var;
        this.f61661b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f61662c.f61666b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdShow(this.f61661b);
        }
    }
}
