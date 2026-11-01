package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class v52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s52 f83773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf2 f83774c;

    public /* synthetic */ v52(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var) {
        this(context, d4Var, lu2Var, v9Var, mt2.a(context));
    }

    public final s52 a(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        return this.f83772a ? new he0(context, v9Var, lu2Var, d4Var) : new ie0(context, v9Var, lu2Var, d4Var);
    }

    public v52(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, boolean z10) {
        this.f83772a = z10;
        this.f83773b = a(context.getApplicationContext(), v9Var, lu2Var, d4Var);
        this.f83774c = a();
    }

    public final qf2 a() {
        jp0 jp0Var;
        if (this.f83772a) {
            Object obj = jp0.f79142b;
            jp0 jp0Var2 = jp0.f79143c;
            if (jp0Var2 == null) {
                synchronized (jp0.f79142b) {
                    jp0Var = jp0.f79143c;
                    if (jp0Var == null) {
                        jp0Var = new jp0();
                        jp0.f79143c = jp0Var;
                    }
                }
                jp0Var2 = jp0Var;
            }
            return new u52(jp0Var2);
        }
        Object obj2 = kp0.f79519b;
        return new t52(ip0.a());
    }
}
