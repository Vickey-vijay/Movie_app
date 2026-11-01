package com.unity3d.ads.core.extensions;

import ck.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kk.i;
import kk.r;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSONObjectExtensions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class JSONObjectExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        p.j(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        p.i(itKeys, "keys()");
        i iVarG = r.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarG) {
            Object objOpt = jSONObject.opt((String) obj);
            if (objOpt != null) {
                p.i(objOpt, "opt(value)");
                if (!((p.e(String.valueOf(objOpt), "undefined") || p.e(String.valueOf(objOpt), "null")) ? false : true)) {
                    objOpt = null;
                }
            } else {
                objOpt = null;
            }
            linkedHashMap.put(obj, objOpt);
        }
        return linkedHashMap;
    }
}
