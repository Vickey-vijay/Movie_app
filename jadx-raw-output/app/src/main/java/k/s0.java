package k;

import android.app.Activity;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f62031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f62032b;

    public s0(z0 z0Var, Activity activity) {
        this.f62032b = z0Var;
        this.f62031a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f62032b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        z0 z0Var = this.f62032b;
        z0 z0Var2 = this.f62032b;
        z0Var.K = new MBSplashHandler(z0Var2.I, z0Var2.J);
        this.f62032b.K.setSupportZoomOut(true);
        this.f62032b.K.createZoomOutByType(ZoomOutTypeEnum.BigView);
        z0 z0Var3 = this.f62032b;
        z0Var3.K.setLoadTimeOut(z0Var3.E);
        z0 z0Var4 = this.f62032b;
        z0Var4.K.setSplashLoadListener(z0Var4.L);
        z0 z0Var5 = this.f62032b;
        z0Var5.K.setSplashShowListener(z0Var5.M);
        this.f62032b.K.setOrientation(gl.r0.h(this.f62031a) ? 2 : 1);
        this.f62032b.K.preLoad();
    }
}
