package yads;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ml2 {
    public static Uri a(Uri uri, yc3 yc3Var) {
        Map mapJ;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            mapJ = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(queryParameterNames, 10)), 16));
            for (String str : queryParameterNames) {
                Pair pairA = mj.h.a(str, uri.getQueryParameter(str));
                mapJ.put(pairA.getFirst(), pairA.getSecond());
            }
        } else {
            mapJ = null;
        }
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        nl2 nl2Var = (nl2) yc3Var.invoke(new nl2(mapJ));
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : nl2Var.f80704a.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery.build();
    }
}
