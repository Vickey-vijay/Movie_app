package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import yads.b43;

/* JADX INFO: loaded from: classes6.dex */
public final class b43 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43 f75722a;

    public b43(c43 c43Var) {
        this.f75722a = c43Var;
    }

    public static void a(c43 c43Var) {
        int iB = c43.b(c43Var.f76161d, c43Var.f76164g);
        boolean zA = c43.a(c43Var.f76161d, c43Var.f76164g);
        if (c43Var.f76165h == iB && c43Var.f76166i == zA) {
            return;
        }
        c43Var.f76165h = iB;
        c43Var.f76166i = zA;
        ((wn0) c43Var.f76160c).a(zA, iB);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final c43 c43Var = this.f75722a;
        c43Var.f76159b.post(new Runnable() { // from class: cp.i
            @Override // java.lang.Runnable
            public final void run() {
                b43.a(c43Var);
            }
        });
    }
}
