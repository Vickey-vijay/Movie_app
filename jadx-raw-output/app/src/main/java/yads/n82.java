package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class n82 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o82 f80596a;

    public n82(o82 o82Var) {
        this.f80596a = o82Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB = o82.b(context);
        if (ib3.f78556a >= 31 && iB == 5) {
            l82.a(context, this.f80596a);
        } else {
            this.f80596a.a(iB);
        }
    }
}
