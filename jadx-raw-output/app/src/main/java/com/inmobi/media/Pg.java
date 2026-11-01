package com.inmobi.media;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f23339a = kotlin.collections.a.m(mj.h.a("revenue", "getRevenue"), mj.h.a("revenue_precision", "getRevenuePrecision"), mj.h.a(BrandSafetyEvent.f44576ad, "getNetworkName"), mj.h.a("dsp_name", "getDspName"), mj.h.a(BrandSafetyEvent.f44593l, "getAdUnitId"), mj.h.a("network_placement", "getNetworkPlacement"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f23340b = kotlin.collections.a.m(mj.h.a("BANNER", "ban"), mj.h.a(BrandSafetyUtils.f43552o, "ban"), mj.h.a(BrandSafetyUtils.f43551n, "ban"), mj.h.a(BrandSafetyUtils.f43547j, ImpressionLog.f43647w), mj.h.a(BrandSafetyUtils.f43548k, "rew"), mj.h.a("REWARDED_INTER", "rew"), mj.h.a("NATIVE", "nat"));

    public static final JSONObject a(JSONObject jSONObject, String str, int i10) throws JSONException {
        String str2 = str;
        int i11 = i10;
        ck.p.j(jSONObject, "<this>");
        ck.p.j(str2, "prefix");
        if (i11 <= 0) {
            return jSONObject;
        }
        String[] strArr = {"ban", ImpressionLog.f43647w, "rew", "nat"};
        int i12 = 0;
        for (int i13 = 4; i12 < i13; i13 = 4) {
            String str3 = str2 + strArr[i12];
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str3);
            if (jSONArrayOptJSONArray != null) {
                JSONArray jSONArray = new JSONArray();
                String strB = b(str);
                long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i11) * 1000);
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i14);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(strB)) {
                        ck.p.j(jSONObjectOptJSONObject, "<this>");
                        ck.p.j(strB, "tsKey");
                        if (jSONObjectOptJSONObject.optLong(strB, 0L) >= jCurrentTimeMillis) {
                            jSONArray.put(jSONObjectOptJSONObject);
                        }
                    }
                }
                jSONObject.put(str3, jSONArray);
            }
            i12++;
            str2 = str;
            i11 = i10;
        }
        return jSONObject;
    }

    public static final Pair b(Map map) {
        ck.p.j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (lk.x.R(str, "obj_", false, 2, null) || lk.x.R(str, "auto_", false, 2, null) || lk.x.R(str, "dir_", false, 2, null)) {
                linkedHashMap2.put(str, value);
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public static final LinkedHashMap c(Map map) {
        ck.p.j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap d(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        Object objA;
        ck.p.j(map, "<this>");
        ck.p.j(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null && (objA = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, objA);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str = key2 + "_ban";
            String str2 = key2 + "_int";
            String str3 = key2 + "_rew";
            String str4 = key2 + "_nat";
            Object obj2 = map.get(str);
            Object objA2 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = map.get(str2);
            Object objA3 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = map.get(str3);
            Object objA4 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = map.get(str4);
            Object objA5 = obj5 != null ? a(obj5, value2) : null;
            if (objA2 != null || objA3 != null || objA4 != null || objA5 != null) {
                if (objA2 != null) {
                    linkedHashMap2.remove(str);
                }
                if (objA3 != null) {
                    linkedHashMap2.remove(str2);
                }
                if (objA4 != null) {
                    linkedHashMap2.remove(str3);
                }
                if (objA5 != null) {
                    linkedHashMap2.remove(str4);
                }
                JSONArray jSONArray = new JSONArray();
                if (objA2 == null) {
                    objA2 = a(value2);
                }
                JSONArray jSONArrayPut = jSONArray.put(objA2);
                if (objA3 == null) {
                    objA3 = a(value2);
                }
                JSONArray jSONArrayPut2 = jSONArrayPut.put(objA3);
                if (objA4 == null) {
                    objA4 = a(value2);
                }
                JSONArray jSONArrayPut3 = jSONArrayPut2.put(objA4);
                if (objA5 == null) {
                    objA5 = a(value2);
                }
                linkedHashMap.put(key2, jSONArrayPut3.put(objA5));
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((String) entry3.getKey()) + "=" + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }

    public static final Triple c(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        ck.p.j(map, "<this>");
        ck.p.j(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("dir_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f23340b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            Kb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new Triple("", null, "");
        }
        Triple tripleA = a(map, publisherConfig.getDirect().getAllowedKeys(), publisherConfig.getDirect().getPrecision(), publisherConfig.getDirect().getStrLen());
        JSONObject jSONObject = (JSONObject) tripleA.component1();
        List list = (List) tripleA.component2();
        List list2 = (List) tripleA.component3();
        jSONObject.put(b("dir_"), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!ck.p.e((String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it.next()) + " not supported");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Kb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it2.next()) + " invalid type");
        }
        String str3 = "dir_" + str2;
        linkedHashMap.put(str3, jSONObject);
        return new Triple(str3, jSONObject, str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    public static final Triple b(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        boolean z10;
        String str;
        Object objInvoke;
        String str2;
        boolean zA;
        ck.p.j(map, "<this>");
        ck.p.j(publisherConfig, "config");
        if (map.containsKey("obj_max")) {
            Object obj = map.get("obj_max");
            if (obj != null) {
                ck.p.j(obj, "<this>");
                Class<?> cls = obj.getClass();
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null) {
                        classLoader = ClassLoader.getSystemClassLoader();
                    }
                    Class<?> cls2 = Class.forName("com.applovin.mediation.MaxAd", false, classLoader);
                    zA = (cls2.isInstance(obj) || cls2.isAssignableFrom(cls)) ? true : a(cls);
                } catch (Throwable unused) {
                }
                if (zA) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                Object obj2 = map.get("obj_max");
                ck.p.g(obj2);
                ck.p.j(obj2, "<this>");
                try {
                    Object objInvoke2 = obj2.getClass().getMethod("getFormat", new Class[0]).invoke(obj2, new Object[0]);
                    if (objInvoke2 != null) {
                        Object objInvoke3 = objInvoke2.getClass().getMethod("getLabel", new Class[0]).invoke(objInvoke2, new Object[0]);
                        if (objInvoke3 instanceof String) {
                            str2 = (String) objInvoke3;
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    Map map2 = f23340b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = (String) map2.get(str2);
                } catch (Exception unused2) {
                    str = null;
                }
                if (str == null) {
                    Kb.a((byte) 1, "PubSignalsUtils", "Missing or invalid format for MaxAd object: " + obj2);
                    return new Triple("", null, "");
                }
                ck.p.j(obj2, "<this>");
                ck.p.j(publisherConfig, "config");
                JSONObject jSONObject = new JSONObject();
                Class<?> cls3 = obj2.getClass();
                for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : publisherConfig.getObj().getAllowedKeysAnd().entrySet()) {
                    String key = entry.getKey();
                    SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
                    String str3 = (String) f23339a.get(key);
                    if (str3 != null) {
                        try {
                            objInvoke = cls3.getMethod(str3, new Class[0]).invoke(obj2, new Object[0]);
                        } catch (Exception unused3) {
                            objInvoke = null;
                        }
                        if (objInvoke != null) {
                            String name = value.getName();
                            Object objA = a(objInvoke, value.getType(), publisherConfig.getObj().getPrecision(), publisherConfig.getObj().getStrLen());
                            if (objA == null) {
                                objA = a(value.getType());
                            }
                            jSONObject.put(name, objA);
                        } else {
                            jSONObject.put(value.getName(), a(value.getType()));
                        }
                    }
                }
                jSONObject.put(b("obj_"), System.currentTimeMillis());
                return new Triple("obj_" + str, jSONObject, str);
            }
        }
        Kb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new Triple("", null, "");
    }

    public static final Triple a(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        ck.p.j(map, "<this>");
        ck.p.j(publisherConfig, "config");
        Object obj = map.get("auto_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = f23340b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            map.toString();
            return new Triple("", null, "");
        }
        JSONObject jSONObject = (JSONObject) a(map, c(publisherConfig.getAuto().getAllowedKeys()), publisherConfig.getAuto().getPrecision(), publisherConfig.getAuto().getStrLen()).component1();
        jSONObject.put(b("auto_"), System.currentTimeMillis());
        return new Triple("auto_" + str2, jSONObject, str2);
    }

    public static final boolean a(Class cls) {
        ck.p.j(cls, "<this>");
        ck.p.j("com.applovin.mediation.MaxAd", "targetFqcn");
        Class<?>[] interfaces = cls.getInterfaces();
        ck.p.i(interfaces, "getInterfaces(...)");
        for (Class<?> cls2 : interfaces) {
            if (ck.p.e(cls2.getName(), "com.applovin.mediation.MaxAd")) {
                return true;
            }
            ck.p.g(cls2);
            if (a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final Triple a(Map map, Map map2, int i10, int i11) throws JSONException {
        ck.p.j(map, "<this>");
        ck.p.j(map2, "keys");
        JSONObject jSONObject = new JSONObject();
        Map mapB = kotlin.collections.a.B(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object objA = a(obj, str2, i10, i11);
                if (objA != null) {
                    jSONObject.put(str, objA);
                    mapB.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new Triple(jSONObject, nj.b0.O0(mapB.keySet()), arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object a(Object obj, String str, int i10, int i11) {
        ck.p.j(obj, "<this>");
        ck.p.j(str, "type");
        switch (str.hashCode()) {
            case -1881759115:
                if (str.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double dDoubleValue = number.doubleValue();
                    if (Math.abs(dDoubleValue) <= Double.MAX_VALUE) {
                        int iK = ik.k.k(i10, 0, 15);
                        if (iK == 0) {
                            dDoubleValue = dDoubleValue > 0.0d ? Math.floor(dDoubleValue) : Math.ceil(dDoubleValue);
                        } else {
                            dDoubleValue = BigDecimal.valueOf(dDoubleValue).movePointRight(iK).setScale(0, RoundingMode.DOWN).movePointLeft(iK).doubleValue();
                        }
                    }
                    return Double.valueOf(dDoubleValue);
                }
                return null;
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    String str2 = obj instanceof String ? (String) obj : null;
                    if (str2 == null) {
                        return null;
                    }
                    ck.p.j(str2, "value");
                    if (str2.length() <= i11) {
                        return str2;
                    }
                    String strSubstring = str2.substring(0, i11);
                    ck.p.i(strSubstring, "substring(...)");
                    return strSubstring;
                }
                return null;
            case 104431:
                if (str.equals(ImpressionLog.f43647w)) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (str.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public static final JSONObject b(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        ck.p.j(jSONObject, "<this>");
        ck.p.j(publisherConfig, "config");
        if (jSONObject.toString().length() <= publisherConfig.getPayloadSize()) {
            return jSONObject;
        }
        Kb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        mj.g gVar = P9.f23321a;
        P9.a(new L2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final String b(String str) {
        ck.p.j(str, "prefix");
        if (ck.p.e(str, "auto_")) {
            return "auto_sts";
        }
        return ck.p.e(str, "obj_") ? "obj_ts" : "dir_ts";
    }

    public static final JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2, int i10) throws JSONException {
        ck.p.j(jSONObject, "<this>");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(jSONObject2, "newObj");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        jSONArrayOptJSONArray.put(jSONObject2);
        while (true) {
            ck.p.j(jSONArrayOptJSONArray, "<this>");
            if (jSONArrayOptJSONArray.length() > i10) {
                jSONArrayOptJSONArray.remove(0);
            } else {
                jSONObject.put(str, jSONArrayOptJSONArray);
                return jSONObject;
            }
        }
    }

    public static final void a(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, Set set) {
        ck.p.j(jSONObject, "<this>");
        ck.p.j(jSONObject2, "cachedJson");
        ck.p.j(str, "formatKey");
        ck.p.j(str2, "prefix");
        ck.p.j(set, "allowedKeys");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(str2 + str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    Object objOpt = jSONObjectOptJSONObject.opt(str3);
                    if (objOpt == null) {
                        objOpt = com.ironsource.Y1.f27894f;
                    }
                    jSONArray.put(objOpt);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str3);
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            jSONObject.put(str3, jSONArrayOptJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0111 A[PHI: r18
  0x0111: PHI (r18v10 org.json.JSONArray) = (r18v8 org.json.JSONArray), (r18v11 org.json.JSONArray) binds: [B:37:0x010e, B:30:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Map a(Map map, JSONObject jSONObject, String str, String str2, Map map2) {
        JSONArray jSONArray;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArray2;
        ck.p.j(map, "<this>");
        ck.p.j(jSONObject, "cachedJson");
        ck.p.j(str, "prefix");
        ck.p.j(str2, "format");
        ck.p.j(map2, "configKeys");
        Map mapB = kotlin.collections.a.B(map2);
        mapB.put(b(str), "long");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str + str2);
        if (jSONArrayOptJSONArray != null) {
            ik.i iVarQ = ik.k.q(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = iVarQ.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((nj.g0) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    kk.i iVarS = nj.b0.S(mapB.keySet());
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj : iVarS) {
                        String str3 = (String) obj;
                        String str4 = (String) map2.get(str3);
                        Object objValueOf = com.ironsource.Y1.f27894f;
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case -1881759115:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str4.equals("stringf")) {
                                        objValueOf = jSONObjectOptJSONObject.optString(str3, com.ironsource.Y1.f27894f);
                                        break;
                                    }
                                    break;
                                case -1325958191:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str4.equals("double")) {
                                        objValueOf = Double.valueOf(jSONObjectOptJSONObject.optDouble(str3, Double.parseDouble(com.ironsource.Y1.f27894f)));
                                        break;
                                    }
                                    break;
                                case -891985903:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str4.equals(TypedValues.Custom.S_STRING)) {
                                        objValueOf = jSONObjectOptJSONObject.optString(str3, com.ironsource.Y1.f27894f);
                                        break;
                                    }
                                    break;
                                case 104431:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str4.equals(ImpressionLog.f43647w)) {
                                        objValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt(str3, Integer.parseInt(com.ironsource.Y1.f27894f)));
                                        break;
                                    }
                                    break;
                                case 3029738:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    if (str4.equals("bool")) {
                                        objValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean(str3, Boolean.parseBoolean(com.ironsource.Y1.f27894f)));
                                        break;
                                    }
                                    break;
                                case 3327612:
                                    if (str4.equals("long")) {
                                        objValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong(str3, Long.parseLong(com.ironsource.Y1.f27894f)));
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    }
                                    break;
                                default:
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    break;
                            }
                            linkedHashMap.put(obj, objValueOf);
                            jSONArrayOptJSONArray = jSONArray2;
                        } else {
                            jSONArray2 = jSONArrayOptJSONArray;
                        }
                        Object objOpt = jSONObjectOptJSONObject.opt(str3);
                        if (objOpt != null) {
                            objValueOf = objOpt;
                        }
                        linkedHashMap.put(obj, objValueOf);
                        jSONArrayOptJSONArray = jSONArray2;
                    }
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    jSONArray = jSONArrayOptJSONArray;
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
                jSONArrayOptJSONArray = jSONArray;
            }
            if (!arrayList.isEmpty()) {
                map.put(str + str2, arrayList);
            }
        }
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object a(Object obj, String str) {
        ck.p.j(obj, "<this>");
        ck.p.j(str, "type");
        switch (str.hashCode()) {
            case -1881759115:
                if (str.equals("stringf")) {
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    if (obj instanceof Double) {
                        return (Double) obj;
                    }
                    if (obj instanceof Integer) {
                        return Double.valueOf(((Number) obj).intValue());
                    }
                    if (obj instanceof Float) {
                        return Double.valueOf(((Number) obj).floatValue());
                    }
                    return null;
                }
                return null;
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                }
                return null;
            case 104431:
                if (str.equals(ImpressionLog.f43647w) && (obj instanceof Integer)) {
                    return (Integer) obj;
                }
                return null;
            case 3029738:
                if (str.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (str.equals("long") && (obj instanceof Long)) {
                    return (Long) obj;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(String str) {
        ck.p.j(str, "type");
        switch (str.hashCode()) {
            case -1881759115:
                str.equals("stringf");
                return com.ironsource.Y1.f27894f;
            case -1325958191:
                if (str.equals("double")) {
                    return Double.valueOf(Double.parseDouble(com.ironsource.Y1.f27894f));
                }
                return com.ironsource.Y1.f27894f;
            case -891985903:
                str.equals(TypedValues.Custom.S_STRING);
                return com.ironsource.Y1.f27894f;
            case 104431:
                if (str.equals(ImpressionLog.f43647w)) {
                    return Integer.valueOf(Integer.parseInt(com.ironsource.Y1.f27894f));
                }
                return com.ironsource.Y1.f27894f;
            case 3029738:
                str.equals("bool");
                return com.ironsource.Y1.f27894f;
            case 3327612:
                if (str.equals("long")) {
                    return Long.valueOf(Long.parseLong(com.ironsource.Y1.f27894f));
                }
                return com.ironsource.Y1.f27894f;
            default:
                return com.ironsource.Y1.f27894f;
        }
    }

    public static final JSONObject a(Map map) throws JSONException {
        ck.p.j(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        ck.p.h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                mj.r rVar = mj.r.f64562a;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final LinkedHashMap a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        Object objValueOf;
        Object objValueOf2;
        JSONObject jSONObject2 = jSONObject;
        ck.p.j(jSONObject2, "<this>");
        ck.p.j(publisherConfig, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            objValueOf2 = Double.valueOf(jSONObject2.optDouble(key));
                        }
                        break;
                    case -891985903:
                        if (value.equals(TypedValues.Custom.S_STRING)) {
                            objValueOf2 = jSONObject2.optString(key);
                        }
                        break;
                    case 104431:
                        if (value.equals(ImpressionLog.f43647w)) {
                            objValueOf2 = Integer.valueOf(jSONObject2.optInt(key));
                        }
                        break;
                    case 3029738:
                        if (value.equals("bool")) {
                            objValueOf2 = Boolean.valueOf(jSONObject2.optBoolean(key));
                        }
                        break;
                    case 3327612:
                        if (value.equals("long")) {
                            objValueOf2 = Long.valueOf(jSONObject2.optLong(key));
                        }
                        break;
                    default:
                        continue;
                }
                linkedHashMap.put(key, objValueOf2);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(key2);
            if (jSONArrayOptJSONArray != null) {
                String[] strArr = {"ban", ImpressionLog.f43647w, "rew", "nat"};
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String str = key2 + "_" + strArr[i10];
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                objValueOf = Double.valueOf(jSONArrayOptJSONArray.optDouble(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case -891985903:
                            if (value2.equals(TypedValues.Custom.S_STRING)) {
                                objValueOf = jSONArrayOptJSONArray.optString(i10);
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 104431:
                            if (value2.equals(ImpressionLog.f43647w)) {
                                objValueOf = Integer.valueOf(jSONArrayOptJSONArray.optInt(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3029738:
                            if (value2.equals("bool")) {
                                objValueOf = Boolean.valueOf(jSONArrayOptJSONArray.optBoolean(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                        case 3327612:
                            if (value2.equals("long")) {
                                objValueOf = Long.valueOf(jSONArrayOptJSONArray.optLong(i10));
                                linkedHashMap.put(str, objValueOf);
                            }
                            break;
                    }
                }
            }
            jSONObject2 = jSONObject;
        }
        return linkedHashMap;
    }
}
