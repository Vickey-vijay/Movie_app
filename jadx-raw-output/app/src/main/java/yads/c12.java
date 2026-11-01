package yads;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c12 implements fp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f76084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f76085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g12 f76086c;

    public /* synthetic */ c12() {
        this(new u42(), new g12());
    }

    @Override // yads.fp2
    public final eo2 a(Object obj) {
        d4 d4Var = (d4) obj;
        fo2 fo2Var = new fo2(new HashMap(), 2);
        g9 g9Var = d4Var.f76563e;
        if (g9Var != null) {
            fo2Var = go2.a(fo2Var, this.f76084a.a(g9Var));
        }
        fo2Var.b(d4Var.f76561c.f78158a, "ad_unit_id");
        fo2Var.b(d4Var.f76559a.f76868b, "ad_type");
        a03 a03Var = d4Var.f76562d.f75685a;
        if (a03Var != null) {
            fo2Var.b(a03Var.b().f85668b, "size_type");
            fo2Var.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2Var.b(Integer.valueOf(a03Var.getHeight()), "height");
            fn fnVarA = a03Var.a();
            fo2Var.a(fnVarA != null ? fnVarA.f77453b : null, "banner_size_calculation_type");
        }
        fo2Var.b(Boolean.valueOf(d4Var.f76565g == qa3.f81784c), "is_passback");
        fo2Var.b(Boolean.valueOf(d4Var.f76571m), "image_loading_automatically");
        List list = d4Var.f76560b.f82018c;
        if (!list.isEmpty()) {
            fo2Var.b(list, "image_sizes");
        }
        co2 co2Var = co2.f76352c;
        return new eo2("ad_request", kotlin.collections.a.B(fo2Var.f77471a), fo2Var.f77472b);
    }

    public c12(u42 u42Var, g12 g12Var) {
        this.f76084a = new n9();
        this.f76085b = new x9(u42Var);
        this.f76086c = g12Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    @Override // yads.fp2
    public final eo2 a(vp2 vp2Var, int i10, Object obj) {
        v9 v9Var;
        String str;
        v9 v9Var2;
        d4 d4Var = (d4) obj;
        u42 u42Var = this.f76085b.f84495a;
        do2 do2Var = null;
        if (vp2Var != null) {
            u42Var.getClass();
            v9Var = (v9) vp2Var.f83980a;
        } else {
            v9Var = null;
        }
        fo2 fo2VarA = u42Var.f83373a.a(v9Var, d4Var, v9Var != null ? (d12) v9Var.f83828t : null);
        a03 a03Var = d4Var.f76562d.f75685a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f85668b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
            fn fnVarA = a03Var.a();
            fo2VarA.a(fnVarA != null ? fnVarA.f77453b : null, "banner_size_calculation_type");
        }
        fo2VarA.b(Integer.valueOf(i10), i10 == -1 ? "error_code" : "code");
        if (vp2Var == null || (v9Var2 = (v9) vp2Var.f83980a) == null) {
            str = "empty";
        } else if (v9Var2.f83825q != null) {
            str = "mediation";
        } else if (v9Var2.f83828t != null) {
            str = "ad";
        } else {
            str = "empty";
        }
        fo2VarA.b(str, "response_type");
        if (vp2Var != null) {
            v9 v9Var3 = (v9) vp2Var.f83980a;
            fo2VarA.f77472b = v9Var3 != null ? v9Var3.f83817i : null;
        }
        v9 v9Var4 = vp2Var != null ? (v9) vp2Var.f83980a : null;
        if (204 == i10) {
            do2Var = do2.f76758e;
        } else if (v9Var4 != null && i10 == 200) {
            this.f76086c.getClass();
            d12 d12Var = (d12) v9Var4.f83828t;
            if (d12Var != null) {
                do2Var = (do2) d12Var.f76513e.get("status");
            } else if (v9Var4.f83825q == null) {
                do2Var = do2.f76757d;
            }
        } else {
            do2Var = do2.f76757d;
        }
        if (do2Var != null) {
            fo2VarA.b(do2Var.f76760b, "status");
        }
        co2 co2Var = co2.f76352c;
        return new eo2("ad_response", kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b);
    }
}
