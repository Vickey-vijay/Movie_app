package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: OperatorMap.java */
/* JADX INFO: loaded from: classes8.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33047b = Arrays.asList("mapNew", "mapNewFromStr", "mapSetObj", "mapGetObj", "mapAddFromMap", "mapRemoveObj", "mapToStrFormatURL", "mapToJsonStr", "mapToSqlStr", "mapCount", "containsKey");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33048a;

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        try {
            switch (str) {
                case "mapNew":
                    return a();
                case "mapNewFromStr":
                    return d(obj, list);
                case "mapSetObj":
                    return f(obj, list);
                case "mapGetObj":
                    return c(obj, list);
                case "mapAddFromMap":
                    return a(obj, list);
                case "mapRemoveObj":
                    return e(obj, list);
                case "mapToStrFormatURL":
                    return c(obj);
                case "mapToJsonStr":
                    return b(obj);
                case "mapToSqlStr":
                    return g(obj, list);
                case "mapCount":
                    return a(obj);
                case "containsKey":
                    return b(obj, list);
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        } catch (Exception e10) {
            q0.b("MapOperator", "Error handling map operation: " + str + ", " + e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b(strValueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(strValueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f33047b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        Map<String, Object> mapA;
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                mapA = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(strValueOf));
            } catch (JSONException e10) {
                q0.b("MapOperator", e10.getMessage());
                mapA = null;
            }
            if (mapA != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(mapA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c((Object) strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(strValueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        Map map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        String str = (list == null || list.isEmpty() || !"or".equals(String.valueOf(list.get(0)).trim().toLowerCase())) ? "and" : "or";
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Map.Entry entry2 : map.entrySet()) {
            if (!z11) {
                sb2.append(Z7.f27998r);
                sb2.append(str);
                sb2.append(Z7.f27998r);
            }
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue());
            z11 = false;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33048a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        Map map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject(map).toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        Map map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = true;
            for (Map.Entry entry2 : map.entrySet()) {
                if (!z11) {
                    sb2.append(C3426d4.j.f28584c);
                }
                sb2.append((String) entry2.getKey());
                sb2.append("=");
                sb2.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                z11 = false;
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
        } catch (Throwable th2) {
            q0.b("MapOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) strValueOf)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(strValueOf)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }
}
