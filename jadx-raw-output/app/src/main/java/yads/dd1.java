package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class dd1 implements ly0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f76642b;

    @Override // yads.ly0
    public final qy0 a(v9 v9Var, d4 d4Var, by0 by0Var) {
        return new cd1(this.f76641a, v9Var, d4Var, this.f76642b, by0Var, new i12(d4Var));
    }

    public dd1(Context context, lu2 lu2Var) {
        this.f76641a = context;
        this.f76642b = lu2Var;
    }
}
