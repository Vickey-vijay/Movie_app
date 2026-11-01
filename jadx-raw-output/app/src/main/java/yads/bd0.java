package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class bd0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd0 f75780a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(gd0 gd0Var, Looper looper) {
        super(looper);
        this.f75780a = gd0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (zc0 zc0Var : this.f75780a.f77752m) {
            if (Arrays.equals(zc0Var.f85335u, bArr)) {
                if (message.what == 2 && zc0Var.f85319e == 0 && zc0Var.f85329o == 4) {
                    int i10 = ib3.f78556a;
                    zc0Var.a(false);
                    return;
                }
                return;
            }
        }
    }
}
