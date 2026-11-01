package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: OperatorString.java */
/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33056b = Arrays.asList("lower", "upper", "concat", "contains", "startWith", "endWith", "base64EncodedString", "base64DecodedString", "mtgBase64EncodedString", "mtgBase64DecodedString", "AESEncode", "len", "jsonStrToObj", "md5String", "firstIndex", "lastIndex", "subString", "split", "replaceOccurrences", "URLEncodedString", "uuidString", "appendQueryMap");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33057a;

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Object obj2;
        byte b10;
        byte b11 = -1;
        String strValueOf = "";
        if (obj == null) {
            str.hashCode();
            switch (str) {
                case "startWith":
                case "endWith":
                case "appendQueryMap":
                case "concat":
                case "contains":
                case "firstIndex":
                case "URLEncodedString":
                case "len":
                case "split":
                case "jsonStrToObj":
                case "md5String":
                case "uuidString":
                case "replaceOccurrences":
                case "lastIndex":
                    obj2 = "";
                    break;
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
        } else {
            obj2 = obj;
        }
        String string = obj2.toString();
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        }
        String str2 = strValueOf;
        try {
            switch (str.hashCode()) {
                case -2129205176:
                    if (str.equals("startWith")) {
                        b10 = 4;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -2091173456:
                    if (str.equals("base64EncodedString")) {
                        b10 = 6;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -1607153599:
                    if (str.equals("endWith")) {
                        b10 = 5;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -1427539794:
                    if (str.equals("appendQueryMap")) {
                        b10 = 21;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -1354795244:
                    if (str.equals("concat")) {
                        b10 = 2;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -928375016:
                    if (str.equals("mtgBase64DecodedString")) {
                        b10 = 9;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -567445985:
                    if (str.equals("contains")) {
                        b10 = 3;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -385590671:
                    if (str.equals("subString")) {
                        b10 = 16;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -181300222:
                    if (str.equals("firstIndex")) {
                        b10 = 14;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -130478672:
                    if (str.equals("URLEncodedString")) {
                        b10 = 19;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case -60033552:
                    if (str.equals("mtgBase64EncodedString")) {
                        b10 = 8;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 107029:
                    if (str.equals("len")) {
                        b10 = 11;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 103164673:
                    if (str.equals("lower")) {
                        b10 = 0;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 17;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 111499426:
                    if (str.equals("upper")) {
                        b10 = 1;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 557498835:
                    if (str.equals("jsonStrToObj")) {
                        b10 = 12;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1023236911:
                    if (str.equals("md5String")) {
                        b10 = 13;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1113343916:
                    if (str.equals("uuidString")) {
                        b10 = 20;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1202825125:
                    if (str.equals("AESEncode")) {
                        b10 = 10;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1335452376:
                    if (str.equals("base64DecodedString")) {
                        b10 = 7;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1632914798:
                    if (str.equals("replaceOccurrences")) {
                        b10 = 18;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                case 1992807388:
                    if (str.equals("lastIndex")) {
                        b10 = 15;
                        b11 = b10;
                        break;
                    }
                    q0.b("StringOperator", e.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            switch (b11) {
                case 0:
                    return a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.y
                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return ((String) obj3).toLowerCase();
                        }
                    });
                case 1:
                    return a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.x
                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return ((String) obj3).toUpperCase();
                        }
                    });
                case 2:
                    return a(obj2, str2);
                case 3:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.contains(str2)));
                case 4:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.startsWith(str2)));
                case 5:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.endsWith(str2)));
                case 6:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(string.getBytes(), 0));
                case 7:
                    try {
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String(Base64.decode(string, 0), "UTF-8"));
                    } catch (Exception e10) {
                        q0.b("StringOperator", "Base64解码失败: " + e10.getMessage());
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                    }
                case 8:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.b(string));
                case 9:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.a(string));
                case 10:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.a(string, str2));
                case 11:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(string.length()));
                case 12:
                    return a(string);
                case 13:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(SameMD5.getMD5(string));
                case 14:
                    return a(string, str2);
                case 15:
                    return b(string, str2);
                case 16:
                    return b(string, list);
                case 17:
                    return d(string, str2);
                case 18:
                    return a(string, list);
                case 19:
                    return d(string, list);
                case 20:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.d());
                case 21:
                    return c(string, list);
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
        } catch (Exception e11) {
            q0.b("StringOperator", e11.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        q0.b("StringOperator", e11.getMessage());
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private String c(String str, String str2) {
        str2.hashCode();
        if (str2.equals("lower")) {
            return str.toLowerCase();
        }
        if (str2.equals("upper")) {
            return str.toUpperCase();
        }
        return null;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String[0]);
        }
        return TextUtils.isEmpty(str2) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String[]{str}) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.split(str2));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f33056b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    public o(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33057a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(String str, List<Object> list) {
        Map map;
        if (list != null) {
            boolean z10 = true;
            if (list.size() == 1) {
                if (str == null) {
                    str = "";
                }
                Object obj = list.get(0);
                boolean z11 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
                if (!z11 && !(obj instanceof Map)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
                }
                if (z11) {
                    map = new HashMap();
                    for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    map = (Map) obj;
                }
                try {
                    StringBuilder sb2 = new StringBuilder(str);
                    if (!str.contains("?")) {
                        sb2.append("?");
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (!z10) {
                            sb2.append(C3426d4.j.f28584c);
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append("=");
                        sb2.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                        z10 = false;
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
                } catch (Throwable th2) {
                    q0.b("StringOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            if (!TextUtils.isEmpty(strEncode)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(strEncode);
            }
        } catch (Throwable th2) {
            q0.b("StringOperator", th2.getMessage(), th2);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, Function<String, String> function) {
        if (obj != null) {
            try {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(function.apply(String.valueOf(obj)));
            } catch (Exception e10) {
                q0.b("StringOperator", e10.getMessage(), e10);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(obj);
        }
        if (str != null) {
            sb2.append(str);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("StringOperator", "JSON字符串为空");
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a((Object) new JSONObject(str)));
        } catch (JSONException e10) {
            q0.b("StringOperator", "JSON字符串转Map对象失败: " + e10.getMessage() + ", JSON字符串: " + str);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e11) {
            q0.b("StringOperator", "JSON字符串转Map对象异常: " + e11.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(next)) {
                q0.d("StringOperator", "跳过空键: " + next);
            } else {
                map.put(next, a(jSONObject.get(next)));
            }
        }
        return map;
    }

    private List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.lastIndexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private Object a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            try {
                int i10 = Integer.parseInt(String.valueOf(list.get(0)));
                int i11 = Integer.parseInt(String.valueOf(list.get(1)));
                if (i10 >= 0 && i11 < str.length() && i10 <= i11) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.substring(i10, i11 + 1));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (NumberFormatException e10) {
                q0.b("StringOperator", "subString操作参数格式错误: " + e10.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (StringIndexOutOfBoundsException e11) {
                q0.b("StringOperator", "subString操作索引越界: " + e11.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.indexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (TextUtils.isEmpty(strValueOf)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.replace(strValueOf, strValueOf2));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }
}
