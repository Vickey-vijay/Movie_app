package yads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes11.dex */
public final class sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qk f82671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82672c;

    public final void a() {
        if (this.f82672c) {
            this.f82670a.unregisterReceiver(this.f82671b);
            this.f82672c = false;
        }
    }

    public sk(Context context, Handler handler, wn0 wn0Var) {
        this.f82670a = context.getApplicationContext();
        this.f82671b = new qk(this, handler, wn0Var);
    }
}
