package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f61634b;

    public r2(z1 z1Var) {
        this.f61634b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f61634b.f61677b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
        MainMRECCallBack mainMRECCallBack2 = this.f61634b.f61678c.f61458e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdClick();
        }
    }
}
