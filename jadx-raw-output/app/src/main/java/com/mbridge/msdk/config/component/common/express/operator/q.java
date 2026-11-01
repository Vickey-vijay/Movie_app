package com.mbridge.msdk.config.component.common.express.operator;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OperatorUrl.java */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f33066b = Arrays.asList("querySet", "queryDel", "hostSet", "host", "scheme", "query", "queryArray", "queryMap", "withoutQuery");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33067a;

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Uri uri;
        String str2;
        if (obj != null && !(obj instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (obj == null) {
            obj = "";
        }
        try {
            uri = !TextUtils.isEmpty(obj.toString()) ? Uri.parse(obj.toString()) : null;
        } catch (Exception e10) {
            q0.b("UrlOperator", e10.getMessage());
        }
        try {
            switch (str) {
                case "querySet":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(uri, list));
                case "queryDel":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri, list));
                case "hostSet":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri, list));
                case "host":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getHost());
                case "scheme":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getScheme());
                case "query":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getQuery());
                case "queryArray":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri));
                case "queryMap":
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri));
                case "withoutQuery":
                    if (uri == null) {
                        str2 = null;
                    } else {
                        str2 = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str2);
                default:
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
        } catch (Exception e11) {
            q0.b("UrlOperator", e11.getMessage(), e11);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f33066b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object c(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (!TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(strValueOf2)) {
                Map<String, String> mapA = a(uri);
                mapA.put(strValueOf, strValueOf2);
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33067a = cVar;
    }

    private Object a(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                return builderBuildUpon.authority(strValueOf).build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    private Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String str : query.split(C3426d4.j.f28584c)) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    private Object b(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                Map<String, String> mapA = a(uri);
                mapA.remove(strValueOf.trim());
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    private Object b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String query = uri.getQuery();
        if (TextUtils.isEmpty(query)) {
            return null;
        }
        return query.split(C3426d4.j.f28584c);
    }
}
