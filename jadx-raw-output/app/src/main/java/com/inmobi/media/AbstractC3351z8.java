package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3351z8 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Ki.a());
            C3194t1 c3194t1 = AbstractC3363zk.f25867a;
            Boolean bool = c3194t1 != null ? c3194t1.f25367c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Qi.f23392a.getClass();
            HashMap map2 = new HashMap();
            if (Qi.f23396e && (str = Qi.f23395d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e10) {
            ck.p.i("z8", "TAG");
            e10.getMessage();
            return map;
        }
    }
}
