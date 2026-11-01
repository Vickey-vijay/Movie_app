package yads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
public final class al1 implements ck1, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f75550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bl1 f75551c;

    public al1(bl1 bl1Var, dk1 dk1Var) {
        this.f75551c = bl1Var;
        Handler handlerA = ib3.a((Handler.Callback) this);
        this.f75550b = handlerA;
        dk1Var.a(this, handlerA);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = ib3.f78556a;
        long j10 = ((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11));
        bl1 bl1Var = this.f75551c;
        if (this == bl1Var.f75876n1) {
            if (j10 == Long.MAX_VALUE) {
                bl1Var.f80237z0 = true;
            } else {
                try {
                    bl1Var.b(j10);
                    bl1Var.D();
                    bl1Var.B0.f81323e++;
                    bl1Var.V0 = true;
                    if (!bl1Var.T0) {
                        bl1Var.T0 = true;
                        bl1Var.I0.a(bl1Var.P0);
                        bl1Var.R0 = true;
                    }
                    bl1Var.a(j10);
                } catch (pn0 e10) {
                    this.f75551c.A0 = e10;
                }
            }
        }
        return true;
    }
}
