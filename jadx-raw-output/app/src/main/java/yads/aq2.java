package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class aq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gq2 f75594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g12 f75595b;

    public /* synthetic */ aq2() {
        this(new gq2(), new g12());
    }

    public final fo2 a(v9 v9Var, d4 d4Var) {
        String str;
        String str2;
        String str3;
        Map map;
        e00 e00Var;
        fo2 fo2Var = new fo2(new LinkedHashMap(), 2);
        if (v9Var == null || !v9Var.f83833y) {
            fo2Var.b(v9Var != null ? v9Var.f83810b : null, "ad_type_format");
            fo2Var.b(v9Var != null ? v9Var.f83812d : null, "product_type");
        }
        if (v9Var == null || (str = v9Var.f83813e) == null) {
            str = d4Var.f76561c.f78158a;
        }
        fo2Var.b(str, "ad_unit_id");
        fo2Var.b(v9Var != null ? v9Var.f83820l : null, "ad_source");
        if (v9Var == null || (e00Var = v9Var.f83809a) == null || (str2 = e00Var.f76868b) == null) {
            str2 = d4Var.f76559a.f76868b;
        }
        fo2Var.b(str2, "ad_type");
        fo2Var.a(v9Var != null ? v9Var.f83819k : null, "design");
        List list = v9Var != null ? v9Var.f83816h : null;
        if (list != null && (!list.isEmpty())) {
            fo2Var.f77471a.put("active_experiments", list);
        }
        fo2Var.a(v9Var != null ? v9Var.f83823o : null, "server_log_id");
        this.f75594a.getClass();
        if ((v9Var != null ? v9Var.f83825q : null) != null) {
            str3 = "mediation";
        } else {
            str3 = (v9Var != null ? v9Var.f83828t : null) != null ? "ad" : "empty";
        }
        fo2Var.b(str3, "response_type");
        if (v9Var != null && (map = v9Var.f83829u) != null) {
            fo2Var.f77471a.putAll(map);
        }
        fo2Var.f77472b = v9Var != null ? v9Var.f83817i : null;
        return fo2Var;
    }

    public final fo2 b(v9 v9Var, d4 d4Var) {
        d12 d12Var;
        List listK;
        fo2 fo2VarA = a(v9Var, d4Var);
        List list = null;
        if (v9Var != null) {
            d12Var = (d12) v9Var.f83828t;
        } else {
            d12Var = null;
        }
        if (d12Var != null) {
            this.f75595b.getClass();
            listK = g12.b(d12Var);
        } else {
            listK = nj.s.k();
        }
        fo2VarA.b(nj.b0.h0(listK), CreativeInfo.f44321c);
        if (!listK.isEmpty()) {
            list = listK;
        }
        fo2VarA.b(list, "ad_ids");
        return fo2VarA;
    }

    public aq2(gq2 gq2Var, g12 g12Var) {
        this.f75594a = gq2Var;
        this.f75595b = g12Var;
    }
}
