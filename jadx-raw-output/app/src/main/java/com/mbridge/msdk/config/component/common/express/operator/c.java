package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: OperatorAssignment.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33032a;

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        return strTrim.equals("=") ? b(strTrim, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    public c(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33032a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        if (!TextUtils.isEmpty(strA) && (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            Object objB2 = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB).b(strA);
            if (objB2 != null && !TextUtils.isEmpty(strA)) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB2).a(strA, objA);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objA);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
