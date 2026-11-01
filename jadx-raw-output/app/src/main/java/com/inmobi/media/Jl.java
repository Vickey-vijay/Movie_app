package com.inmobi.media;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Jl {
    public static final int a(String str) {
        ck.p.j(str, "<this>");
        try {
            List listN0 = lk.a0.N0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER, "."}, false, 4, 2, null);
            int i10 = Integer.parseInt((String) listN0.get(0));
            int i11 = Integer.parseInt((String) listN0.get(1));
            return (((i11 * 60) + (i10 * 3600) + Integer.parseInt((String) listN0.get(2))) * 1000) + (listN0.size() == 4 ? Integer.parseInt((String) listN0.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String str, ArrayList arrayList) {
        ck.p.j(str, "trackerType");
        if (arrayList == null) {
            return nj.s.k();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (ck.p.e(((C3257ve) obj).f25569b, str)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(nj.t.v(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3257ve) it.next()).f25568a);
        }
        return arrayList3;
    }
}
