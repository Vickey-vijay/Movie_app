package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4663y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ul f58011a = new Ul();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f58012b = kotlin.collections.a.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f58013c = kotlin.collections.a.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IdentifiersResult f58014d;

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map mapJ;
        List listA;
        String str;
        IdentifiersResult identifiersResult2 = this.f58014d;
        String str2 = identifiersResult2 != null ? identifiersResult2.f58084id : null;
        if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f58084id) != null && str.length() != 0)) {
            this.f58014d = identifiersResult;
            String str3 = identifiersResult.f58084id;
            if (str3 == null) {
                map = null;
            } else {
                map = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            ArrayList arrayListA = AbstractC4241hb.a(new JSONArray(jSONObject.optString(next)));
                            if (arrayListA != null) {
                                map.put(next, arrayListA);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (map != null) {
                mapJ = new LinkedHashMap(nj.l0.f(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    mapJ.put(key, new IdentifiersResult(String.valueOf(mo.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                mapJ = kotlin.collections.a.j();
            }
            this.f58013c = mapJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap(nj.l0.f(mapJ.size()));
            for (Map.Entry entry2 : mapJ.entrySet()) {
                Object key2 = entry2.getKey();
                String str4 = ((IdentifiersResult) entry2.getValue()).f58084id;
                if (str4 == null) {
                    listA = null;
                } else {
                    try {
                        listA = AbstractC4241hb.a(new JSONArray(str4));
                    } catch (Throwable unused3) {
                        listA = null;
                    }
                }
                if (listA == null) {
                    listA = nj.s.k();
                }
                linkedHashMap.put(key2, listA);
            }
            this.f58012b = linkedHashMap;
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list2 = (List) this.f58012b.get(str);
            if (list2 != null && !list2.isEmpty()) {
                linkedHashMap.put(str, list2);
            }
        }
        Ul ul2 = this.f58011a;
        String strA = AbstractC4241hb.a((Map) linkedHashMap);
        IdentifiersResult identifiersResult = this.f58014d;
        if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
            identifierStatus = IdentifierStatus.UNKNOWN;
        }
        map.put("appmetrica_custom_sdk_hosts", ul2.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
    }
}
