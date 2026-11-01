package j;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes7.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f61505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f61506c;

    public h1(z1 z1Var, View view) {
        this.f61506c = z1Var;
        this.f61505b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f61506c.f61677b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdLoaded(this.f61505b);
        }
        MainMRECCallBack mainMRECCallBack2 = this.f61506c.f61678c.f61458e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdLoaded(this.f61505b);
        }
    }
}
