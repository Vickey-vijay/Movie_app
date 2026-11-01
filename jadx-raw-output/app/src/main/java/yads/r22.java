package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r22 implements sy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1 f82082a;

    public r22(yz1 yz1Var) {
        this.f82082a = yz1Var;
    }

    @Override // yads.sy1
    public final void a(Context context, ry1 ry1Var, mi2 mi2Var, qy1 qy1Var, xz1 xz1Var, fz1 fz1Var, hz1 hz1Var) {
        List list = ry1Var.f82466a.f76509a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oy1 oy1VarA = this.f82082a.a(context, ry1Var, mi2Var, qy1Var, xz1Var, fz1Var, (fy1) it.next());
            if (oy1VarA != null) {
                arrayList.add(oy1VarA);
            }
        }
        if (arrayList.isEmpty()) {
            hz1Var.a(h9.f78101a);
        } else {
            hz1Var.a(arrayList);
        }
    }

    public /* synthetic */ r22(lu2 lu2Var) {
        this(new yz1(lu2Var));
    }
}
