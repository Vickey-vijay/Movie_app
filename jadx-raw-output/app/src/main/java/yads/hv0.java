package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f78391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z52 f78392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d72 f78393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f78394d;

    public /* synthetic */ hv0(Context context, w5 w5Var) {
        this(w5Var, new z52(context), new d72());
    }

    public final void a() {
        synchronized (this.f78394d) {
            this.f78392b.a();
            mj.r rVar = mj.r.f64562a;
        }
    }

    public hv0(w5 w5Var, z52 z52Var, d72 d72Var) {
        this.f78391a = w5Var;
        this.f78392b = z52Var;
        this.f78393c = d72Var;
        this.f78394d = new Object();
    }
}
