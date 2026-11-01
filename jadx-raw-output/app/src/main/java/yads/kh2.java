package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kh2 {
    public static LinkedHashMap a(ih2 ih2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.G1, ih2Var.f78657a);
        qh2 qh2Var = ih2Var.f78658b;
        if (qh2Var != null) {
            linkedHashMap.put("winner_name", qh2Var.f81852a);
            linkedHashMap.put("winner_ad_unit", qh2Var.f81853b);
        }
        String lowerCase = ih2Var.f78660d.f75528a.name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer num = ih2Var.f78660d.f75530c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        String str = ih2Var.f78660d.f75529b;
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
