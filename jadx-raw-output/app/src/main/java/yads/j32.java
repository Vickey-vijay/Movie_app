package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j32 implements sy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f78902a;

    public j32(yz1 yz1Var) {
        this.f78902a = yz1Var;
    }

    @Override // yads.sy1
    public final void a(Context context, ry1 ry1Var, mi2 mi2Var, qy1 qy1Var, xz1 xz1Var, fz1 fz1Var, hz1 hz1Var) {
        w02 w02VarA;
        List list = ry1Var.f82466a.f76509a;
        if (list == null || list.isEmpty()) {
            w02VarA = null;
        } else if (list.size() > 1) {
            w02VarA = qy1Var.a(context, ry1Var, mi2Var, xz1Var, fz1Var);
        } else {
            w02VarA = this.f78902a.a(context, ry1Var, mi2Var, qy1Var, xz1Var, fz1Var, (fy1) list.get(0));
        }
        if (w02VarA != null) {
            hz1Var.a(w02VarA);
        } else {
            hz1Var.a(h9.f78101a);
        }
    }

    public /* synthetic */ j32(lu2 lu2Var) {
        this(new yz1(lu2Var));
    }
}
