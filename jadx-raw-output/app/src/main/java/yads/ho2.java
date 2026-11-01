package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ho2 {
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public static JSONObject a(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            ck.p.i(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = JSONObject.NULL;
            }
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public static JSONObject b(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            ck.p.i(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = JSONObject.NULL;
            }
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get(CreativeInfo.f44321c);
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public static JSONObject c(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            ck.p.i(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = JSONObject.NULL;
            }
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get(CreativeInfo.f44321c);
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public static JSONObject d(String str, Map map) throws JSONException {
        Object lowerCase;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            ck.p.i(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = JSONObject.NULL;
            }
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public static JSONObject a(Map map, j5 j5Var, String str) throws JSONException {
        Object lowerCase;
        Object objOptString;
        Object objOptString2;
        Object objOptString3;
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            ck.p.i(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = JSONObject.NULL;
            }
        } else {
            lowerCase = JSONObject.NULL;
        }
        jSONObject.put("ad_network", lowerCase);
        Object obj4 = map.get(CreativeInfo.f44321c);
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        JSONObject jSONObject2 = null;
        String str2 = j5Var != null ? j5Var.f78915b : null;
        if (str2 != null) {
            try {
                jSONObject2 = new JSONObject(str2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f75480a;
            }
        }
        if (jSONObject2 == null || (objOptString = jSONObject2.optString("revenue")) == null) {
            objOptString = JSONObject.NULL;
        }
        jSONObject.put("ad_revenue", objOptString);
        if (jSONObject2 == null || (objOptString2 = jSONObject2.optString("currency")) == null) {
            objOptString2 = JSONObject.NULL;
        }
        jSONObject.put("currency", objOptString2);
        if (jSONObject2 == null || (objOptString3 = jSONObject2.optString("precision")) == null) {
            objOptString3 = JSONObject.NULL;
        }
        jSONObject.put("precision", objOptString3);
        return jSONObject;
    }

    public static JSONObject a(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        return jSONObject;
    }
}
