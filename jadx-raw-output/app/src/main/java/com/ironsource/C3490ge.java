package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3490ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f29019a;

    public C3490ge() {
        this.f29019a = IronSourceVideoBridge.jsonObjectInit();
    }

    public JSONObject a() {
        return this.f29019a;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public boolean c(String str) {
        return this.f29019a.optBoolean(str);
    }

    public String d(String str) {
        return this.f29019a.optString(str, null);
    }

    public String toString() {
        JSONObject jSONObject = this.f29019a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public C3490ge(String str) {
        f(str);
    }

    public static Object b(Object obj) throws JSONException {
        if (obj instanceof Map) {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (obj2 != null) {
                    jSONObjectJsonObjectInit.put(obj2.toString(), b(map.get(obj2)));
                }
            }
            return jSONObjectJsonObjectInit;
        }
        if (!(obj instanceof Iterable)) {
            return obj;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public String a(String str, String str2) {
        return this.f29019a.optString(str, str2);
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    public int a(String str, int i10) {
        return this.f29019a.optInt(str, i10);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    private void f(String str) {
        try {
            this.f29019a = IronSourceVideoBridge.jsonObjectInit(str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            this.f29019a = IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.f29019a.put(str, jSONObject);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public void b(String str, String str2) {
        try {
            this.f29019a.put(str, str2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }
}
