package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class kr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr0 f79526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f79527b;

    public /* synthetic */ kr0(Context context, d4 d4Var, lu2 lu2Var, dr0 dr0Var) {
        this(dr0Var, new za(context, lu2Var, d4Var));
    }

    public final void a(long j10) {
        dr0 dr0Var = this.f79526a;
        if (j10 <= dr0Var.f76779c) {
            za.a(this.f79527b, dr0Var.f76778b, k83.f79333e);
        }
    }

    public kr0(dr0 dr0Var, za zaVar) {
        this.f79526a = dr0Var;
        this.f79527b = zaVar;
    }
}
