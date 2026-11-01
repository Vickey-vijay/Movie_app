package com.fyber.inneractive.sdk.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18670b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f18671c;

    public final void a() {
        try {
            i0 i0Var = this.f18671c;
            i0Var.getClass();
            IAlog.a("%sunregister screen broadcast receiver called", IAlog.a(i0Var));
            if (this.f18669a != null) {
                i0 i0Var2 = this.f18671c;
                i0Var2.getClass();
                IAlog.a("%sunregistering broadcast receiver", IAlog.a(i0Var2));
                this.f18669a.unregisterReceiver(this);
                this.f18669a = null;
            }
        } catch (Throwable th2) {
            IAlog.f("IAmraidWebViewControllerBase: OrientationBroadcastReceiver: unregister: exception: %s", th2.toString());
        }
    }

    public e0(i0 i0Var) {
        this.f18671c = i0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB;
        if (this.f18669a == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iB = com.fyber.inneractive.sdk.util.o.b()) == this.f18670b) {
            return;
        }
        this.f18670b = iB;
        i0 i0Var = this.f18671c;
        m mVar = i0Var.f18682b;
        if (mVar != null) {
            mVar.getViewTreeObserver().removeOnPreDrawListener(i0Var.f18715n0);
            i0Var.f18682b.getViewTreeObserver().addOnPreDrawListener(i0Var.f18715n0);
        }
    }
}
