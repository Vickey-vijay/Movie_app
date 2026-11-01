package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu3 f80089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k52 f80090b;

    public /* synthetic */ m52(Context context, ru3 ru3Var) {
        this(ru3Var.a(context), new k52());
    }

    public final void a() {
        List listO0;
        qu3 qu3Var = this.f80089a;
        if (qu3Var != null) {
            synchronized (qu3Var.f81979b) {
                listO0 = nj.b0.O0(qu3Var.f81980c);
                qu3Var.f81980c.clear();
                mj.r rVar = mj.r.f64562a;
            }
            Iterator it = listO0.iterator();
            while (it.hasNext()) {
                qu3Var.f81978a.a((ld3) it.next());
            }
        }
    }

    public m52(qu3 qu3Var, k52 k52Var) {
        this.f80089a = qu3Var;
        this.f80090b = k52Var;
    }
}
