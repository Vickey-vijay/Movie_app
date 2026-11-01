package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nn implements mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f80712b;

    @Override // yads.mu
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public nn(Context context, v9 v9Var) {
        this.f80711a = context;
        this.f80712b = v9Var;
    }

    public void c() {
        b();
        getClass().toString();
        boolean z10 = ad1.f75480a;
    }
}
