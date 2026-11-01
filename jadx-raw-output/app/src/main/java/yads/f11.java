package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f11 extends nn implements f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f77265c;

    public f11(Context context, v9 v9Var) {
        this(context, v9Var, new z9());
    }

    @Override // yads.nn
    public final synchronized void b() {
        this.f77265c.a(null);
    }

    public f11(Context context, v9 v9Var, z9 z9Var) {
        super(context, v9Var);
        this.f77265c = z9Var;
        z9Var.a(this);
    }
}
