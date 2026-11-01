package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x92 f81978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81979b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f81980c = new ArrayList();

    public final void a(ld3 ld3Var) {
        synchronized (this.f81979b) {
            this.f81980c.add(ld3Var);
            this.f81978a.b(ld3Var);
            mj.r rVar = mj.r.f64562a;
        }
    }

    public qu3(Context context) {
        this.f81978a = x92.f84499g.a(context);
    }
}
