package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorArray.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33029b = Arrays.asList("arrayNew", "arrayAddObj", "arrayAddFromArray", "arrayRemoveObj", "arrayRemoveAllObj", "arrayCount", "containsObj", "arrayToStr", "prefix", "suffix");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33030a;

    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        List<Object> arrayList;
        if (obj instanceof List) {
            arrayList = (List) obj;
        } else {
            arrayList = (obj == null || !obj.getClass().isArray()) ? null : new ArrayList(Arrays.asList(obj));
        }
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        try {
            switch (str) {
                case "arrayNew":
                    return a();
                case "arrayAddObj":
                    return b(arrayList, obj2);
                case "arrayAddFromArray":
                    return a(arrayList, obj2);
                case "arrayRemoveObj":
                    return c(arrayList, obj2);
                case "arrayRemoveAllObj":
                    return b(arrayList);
                case "arrayCount":
                    return a(arrayList);
                case "containsObj":
                    return d(arrayList, obj2);
                case "arrayToStr":
                    return g(arrayList, obj2);
                case "prefix":
                    return e(arrayList, obj2);
                case "suffix":
                    return f(arrayList, obj2);
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
        } catch (Exception e10) {
            q0.b("ArrayOperator", "Error handling array operation: " + str + ", " + e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f33029b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(List<Object> list, Object obj) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (!(obj instanceof List)) {
            if (list.contains(obj)) {
                list.remove(obj);
            } else if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int size = list.size();
                if (iIntValue >= 0 && iIntValue <= size - 1) {
                    list.remove(iIntValue);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
        }
        for (Object obj2 : (List) obj) {
            if (list.contains(obj2)) {
                list.remove(obj2);
            } else if (obj2 instanceof Integer) {
                int iIntValue2 = ((Integer) obj2).intValue();
                int size2 = list.size();
                if (iIntValue2 >= 0 && iIntValue2 <= size2 - 1) {
                    list.remove(iIntValue2);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(List<Object> list, Object obj) {
        if (list == null || obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
        }
        if (!(obj instanceof List)) {
            return list.contains(obj) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.TRUE) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        boolean z10 = true;
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (!list.contains(it.next())) {
                z10 = false;
                break;
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(List<Object> list, Object obj) {
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            iIntValue = Integer.parseInt((String) obj);
        }
        return (iIntValue < 0 || iIntValue > list.size() + (-1)) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list.subList(0, iIntValue));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(List<Object> list, Object obj) {
        int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            iIntValue = Integer.parseInt((String) obj);
        }
        return (iIntValue < 0 || iIntValue > list.size() + (-1)) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list.subList(list.size() - iIntValue, list.size()));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(List<Object> list, Object obj) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj2 = list.get(i10);
            if (obj2 instanceof String) {
                sb2.append(obj2);
            } else if (obj2 != null) {
                sb2.append(obj2.toString());
            }
            if (i10 < list.size() - 1 && obj != null) {
                sb2.append(obj);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    public a(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33030a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new ArrayList());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            list = new ArrayList<>();
        }
        if (obj instanceof List) {
            list.addAll((List) obj);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
        }
        q0.a("ArrayOperator", "ArrayAddFromArray rightObj is not List");
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(list.size()));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            list = new ArrayList<>();
        }
        list.add(obj);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(List<Object> list) {
        if (list != null) {
            list.clear();
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }
}
