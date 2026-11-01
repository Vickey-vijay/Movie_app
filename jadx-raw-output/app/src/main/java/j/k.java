package j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yk.e.callBack.MainRefreshCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f61527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l0 l0Var, Looper looper) {
        super(looper);
        this.f61527a = l0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this.f61527a.f61558x) {
            try {
                l0 l0Var = this.f61527a;
                l0Var.f61550p++;
                i.a aVar = (i.a) message.obj;
                if (message.what == AdSdkStateCode.SUCCESS) {
                    l0.n(l0Var, aVar);
                } else if (l0.x(l0Var, aVar)) {
                    return;
                }
                if (this.f61527a.s()) {
                    AdLog.i("BaseSliceLoader", "bid finish has callback");
                    return;
                }
                l0 l0Var2 = this.f61527a;
                if (!l0Var2.f61544j) {
                    l0.d(l0Var2, aVar);
                    return;
                }
                AdLog.i("BaseSliceLoader", "bid finish from refresh");
                MainRefreshCallback mainRefreshCallback = this.f61527a.f61545k;
                if (mainRefreshCallback != null) {
                    mainRefreshCallback.onFinish();
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                this.f61527a.p(e10);
            }
        }
    }
}
