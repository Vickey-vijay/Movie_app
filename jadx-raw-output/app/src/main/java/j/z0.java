package j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f61675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(n0 n0Var, Looper looper) {
        super(looper);
        this.f61675a = n0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this.f61675a.f61599t) {
            n0 n0Var = this.f61675a;
            int i10 = n0Var.f61600u + 1;
            n0Var.f61600u = i10;
            if (i10 == 2) {
                n0Var.f61601v = true;
                n0Var.z();
            }
        }
    }
}
