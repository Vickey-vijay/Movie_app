package j;

import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f61510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f61511c;

    public i0(z1 z1Var, AdInfo adInfo) {
        this.f61511c = z1Var;
        this.f61510b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f61511c.f61677b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(this.f61510b);
        }
        MainMRECCallBack mainMRECCallBack2 = this.f61511c.f61678c.f61458e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdShow(this.f61510b);
        }
    }
}
