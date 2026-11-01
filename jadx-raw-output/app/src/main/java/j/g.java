package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f61496b;

    public g(z1 z1Var) {
        this.f61496b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f61496b.f61677b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClose();
        }
        MainMRECCallBack mainMRECCallBack2 = this.f61496b.f61678c.f61458e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdClose();
        }
    }
}
