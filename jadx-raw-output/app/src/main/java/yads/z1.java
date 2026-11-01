package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f85173b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z1 f85174c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f85175a = new HashMap();

    public final x1 a(long j10) {
        x1 x1Var;
        synchronized (f85173b) {
            x1Var = (x1) this.f85175a.remove(Long.valueOf(j10));
        }
        return x1Var;
    }

    public final void a(long j10, x1 x1Var) {
        synchronized (f85173b) {
            this.f85175a.put(Long.valueOf(j10), x1Var);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
