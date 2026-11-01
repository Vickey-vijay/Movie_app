package yads;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class z8 {
    public static i8 a(f8 f8Var) {
        Object next;
        int i10 = f8Var.f77329e;
        boolean z10 = f8Var.f77325a;
        boolean z11 = f8Var.f77330f;
        Map map = f8Var.f77332h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            d8 d8Var = e8.f76970c;
            String str = (String) entry.getKey();
            d8Var.getClass();
            Iterator<E> it = e8.f76972e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ck.p.e(((e8) next).f76973b, str));
            AdQualityVerifiableNetwork adQualityVerifiableNetworkA = d8.a((e8) next);
            if (adQualityVerifiableNetworkA != null) {
                linkedHashMap.put(adQualityVerifiableNetworkA, new x8(((h8) entry.getValue()).f78093b, ((h8) entry.getValue()).f78092a));
            }
        }
        return new i8(i10, z10, z11, linkedHashMap, f8Var.f77331g);
    }
}
