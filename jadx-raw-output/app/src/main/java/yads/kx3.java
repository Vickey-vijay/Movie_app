package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public final class kx3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx3 f79620a = lx3.f79987d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lx3 lx3Var;
        boolean z10 = false;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            lx3 lx3Var2 = this.f79620a;
            lx3Var2.a(true, lx3Var2.f79990c);
            lx3Var = this.f79620a;
            z10 = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            lx3 lx3Var3 = this.f79620a;
            lx3Var3.a(false, lx3Var3.f79990c);
            lx3Var = this.f79620a;
        } else {
            return;
        }
        lx3Var.f79989b = z10;
    }
}
