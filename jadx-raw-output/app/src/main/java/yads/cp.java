package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cp {
    public static fo2 a(dp dpVar) {
        e00 e00Var;
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.a((dpVar == null || (e00Var = dpVar.f76762a) == null) ? null : e00Var.f76868b, "ad_type");
        fo2Var.a(dpVar != null ? dpVar.f76764c : null, "parameters");
        a03 a03Var = dpVar != null ? dpVar.f76763b : null;
        if (a03Var != null) {
            fo2Var.b(a03Var.b().f85668b, "size_type");
            fo2Var.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2Var.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        return fo2Var;
    }
}
