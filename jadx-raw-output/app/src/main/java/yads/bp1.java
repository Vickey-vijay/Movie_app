package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class bp1 extends ep1 {
    public bp1(d4 d4Var) {
        super(d4Var);
    }

    @Override // yads.ep1
    public final Map a(Context context) {
        Map mapB = kotlin.collections.a.B(super.a(context));
        a03 a03Var = this.f77163a.f76562d.f75685a;
        if (a03Var != null) {
            mapB.put("width", Integer.valueOf(a03Var.c(context)));
            mapB.put("height", Integer.valueOf(a03Var.a(context)));
        }
        return mapB;
    }
}
