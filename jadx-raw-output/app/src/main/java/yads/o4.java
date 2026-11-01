package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo2 f80928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f80930c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(Context context) {
        this(context, wo2.a());
        Object obj = xo2.f84662a;
    }

    public final void a(pn pnVar) {
        pnVar.f81503q = this.f80929b;
        xo2 xo2Var = this.f80928a;
        Context context = this.f80930c;
        synchronized (xo2Var) {
            r82.a(context).a(pnVar);
        }
    }

    public o4(Context context, xo2 xo2Var) {
        this.f80928a = xo2Var;
        this.f80929b = tb.a(this);
        this.f80930c = context.getApplicationContext();
    }
}
