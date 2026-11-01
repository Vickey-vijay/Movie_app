package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class J5 implements D0 {
    public final Map<String, Object> a(C3476g0 c3476g0) {
        ck.p.j(c3476g0, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = c3476g0.a().toString();
        ck.p.i(string, "adProperties.adFormat.toString()");
        map.put(C3397bb.f28234f, string);
        map.put("adf", Integer.valueOf(C3772wf.c(c3476g0.a())));
        String string2 = c3476g0.b().toString();
        ck.p.i(string2, "adProperties.adId.toString()");
        map.put(C3397bb.f28237i, string2);
        map.put("mediationAdUnitId", c3476g0.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
