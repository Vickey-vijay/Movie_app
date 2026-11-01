package yads;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ep1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ox2 f77164b;

    public /* synthetic */ ep1(d4 d4Var) {
        this(d4Var, new ox2());
    }

    public Map a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g9 g9Var = this.f77163a.f76563e;
        if (g9Var != null) {
            Map map = g9Var.f77702g;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str = g9Var.f77697b;
            if (str != null) {
                linkedHashMap.put("age", str);
            }
            List list = g9Var.f77700e;
            if (list != null) {
                linkedHashMap.put("context_tags", list);
            }
            String str2 = g9Var.f77698c;
            if (str2 != null) {
                linkedHashMap.put(InneractiveMediationDefs.KEY_GENDER, str2);
            }
            Object obj = dw2.f76819j;
            Boolean boolB = cw2.a().b();
            if (boolB != null) {
                linkedHashMap.put("age_restricted_user", boolB);
            }
            nt2 nt2VarA = cw2.a().a(context);
            Boolean bool = nt2VarA != null ? nt2VarA.W : null;
            if (bool != null) {
                linkedHashMap.put("user_consent", bool);
            }
        }
        td tdVar = this.f77163a.f76560b.f82017b.f82195a;
        boolean zB = this.f77164b.b(context);
        if (tdVar != null) {
            boolean z10 = tdVar.f82967b;
            String str3 = tdVar.f82966a;
            if (!zB && !z10 && str3 != null) {
                linkedHashMap.put("google_aid", str3);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.f77163a.f76560b.f82016a.f79101f));
        linkedHashMap.put("sdk_version", "7.18.1");
        return linkedHashMap;
    }

    public ep1(d4 d4Var, ox2 ox2Var) {
        this.f77163a = d4Var;
        this.f77164b = ox2Var;
    }
}
