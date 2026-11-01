package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class xq2 implements ly0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f84674b;

    @Override // yads.ly0
    public final qy0 a(v9 v9Var, d4 d4Var, by0 by0Var) {
        Context context = this.f84673a;
        lu2 lu2Var = this.f84674b;
        wk2 wk2Var = new wk2();
        return new wq2(context, v9Var, d4Var, lu2Var, by0Var, wk2Var, new pr2(wk2Var), new i12(d4Var), new zs2(d4Var, lu2Var));
    }

    public xq2(Context context, lu2 lu2Var) {
        this.f84673a = context;
        this.f84674b = lu2Var;
    }
}
