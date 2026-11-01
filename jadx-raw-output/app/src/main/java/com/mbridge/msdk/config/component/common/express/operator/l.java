package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: OperatorObject.java */
/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33051b = Arrays.asList("nonNull", "ifSet");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33052a;

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        byte b10;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 100091397) {
                if (iHashCode == 2123019764 && str.equals("nonNull")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("ifSet")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                return b10 != 1 ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null) : a(obj, list, aVar);
            }
            return a(obj, list);
        } catch (Exception e10) {
            q0.b("OperatorObject", "Error handling object operation: " + str + ", " + e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public l(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33052a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f33051b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list, aVar);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(1);
    }

    private synchronized com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strSubstring;
        if (list != null) {
            if (list.size() == 3) {
                try {
                    boolean z10 = ((Integer) list.get(0)).intValue() == 1;
                    if (z10) {
                        strSubstring = (String) list.get(1);
                    } else {
                        strSubstring = (String) list.get(2);
                    }
                    if (strSubstring.startsWith("\"") && strSubstring.endsWith("\"") && strSubstring.replace("\\\"", "").split("\"").length == 2) {
                        strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    }
                    if (!TextUtils.isEmpty(strSubstring)) {
                        new com.mbridge.msdk.config.component.common.express.d().a(strSubstring, aVar);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z10));
                } catch (Exception e10) {
                    q0.a("OperatorObject", e10.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }
}
