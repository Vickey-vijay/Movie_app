package com.unity3d.ads.core.extensions;

import ck.p;
import ik.i;
import ik.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj.g0;
import nj.t;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: JSONArrayExtensions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        p.j(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            p.h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            p.i(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            p.i(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        p.j(jSONArray, "<this>");
        i iVarQ = k.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(t.v(iVarQ, 10));
        Iterator<Integer> it = iVarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((g0) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
