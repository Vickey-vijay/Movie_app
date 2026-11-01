package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class w9 {
    public static c a(Map map) {
        Set setT0;
        Long lValueOf;
        String strC = t01.c(map, u11.f83311n);
        String strOptString = "";
        if (strC == null) {
            strC = "";
        }
        String strC2 = t01.c(map, u11.L);
        if (strC2 == null) {
            setT0 = nj.q0.f();
        } else {
            try {
                strOptString = new JSONObject(strC2).optString("test_ids", "");
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
            List listN0 = lk.a0.N0(strOptString, new String[]{";"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                try {
                    lValueOf = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            setT0 = nj.b0.T0(arrayList);
        }
        return new c(strC, setT0);
    }
}
