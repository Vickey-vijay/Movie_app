package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OperatorSQL.java */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33053b = Arrays.asList("sqlNew", "select", TypedValues.TransitionType.S_FROM, "where", "sqlAnd", "sqlOr", "orderBy", "groupBy", "delete", "update", "insert", "limit");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33054a;

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" and (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r6
  0x0030: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v7 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    private Object d(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        sb2.append(" insert into " + strValueOf);
        StringBuilder sb3 = new StringBuilder(" (");
        StringBuilder sb4 = new StringBuilder(" VALUES (");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object obj4 = map.get(str2);
            sb3.append(str2);
            if (obj4 == null) {
                sb4.append("NULL");
            } else if (obj4 instanceof Number) {
                sb4.append(obj4);
            } else {
                sb4.append("'");
                sb4.append(a(obj4.toString()));
                sb4.append("'");
            }
            if (it.hasNext()) {
                sb3.append(StringUtils.COMMA);
                sb4.append(StringUtils.COMMA);
            } else {
                sb3.append(" )");
                sb4.append(" )");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(sb4.toString());
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r5
  0x0030: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v11 java.lang.String) binds: [B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    private Object k(String str, Object obj, List<Object> list) {
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        String strValueOf = "";
        if (list.size() != 2) {
            map = null;
        } else {
            Object obj2 = list.get(0);
            strValueOf = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
        }
        if (TextUtils.isEmpty(strValueOf) || map == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        sb2.append("update ");
        sb2.append(strValueOf);
        sb2.append(" set");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb2.append(Z7.f27998r);
            sb2.append(str2);
            sb2.append("=");
            sb2.append(map.get(str2));
            if (it.hasNext()) {
                sb2.append(StringUtils.COMMA);
            }
        }
        return sb2.toString();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" from");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" group by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" limit");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" or (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        sb2.append(" )");
        return sb2.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" order by");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder("select");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj));
        sb2.append(" where");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) != null) {
                sb2.append(Z7.f27998r);
                sb2.append(String.valueOf(list.get(i10)));
                if (i10 < list.size() - 1) {
                    sb2.append(StringUtils.COMMA);
                }
            }
        }
        return sb2.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        Iterator<String> it = f33053b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return h(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    public m(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33054a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            switch (str) {
                case "sqlNew":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b());
                case "select":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list));
                case "from":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list));
                case "where":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list));
                case "sqlAnd":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list));
                case "sqlOr":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list));
                case "orderBy":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list));
                case "groupBy":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list));
                case "delete":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a());
                case "update":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list));
                case "insert":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list));
                case "limit":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list));
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
