package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final at1 f78413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij f78414b;

    public final void a(ArrayList arrayList, co2 co2Var) {
        fo2 fo2VarA = this.f78414b.a();
        fo2VarA.b(arrayList, "assets");
        Map map = fo2VarA.f77471a;
        this.f78413a.a(new eo2(co2Var.f76376b, kotlin.collections.a.B(map), fo2VarA.f77472b));
    }

    public hy1(Context context, lu2 lu2Var, o5 o5Var, e00 e00Var, String str) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this.f78413a = cf.a(context, iu3Var.b());
        this.f78414b = new ij(o5Var, e00Var, str);
    }
}
