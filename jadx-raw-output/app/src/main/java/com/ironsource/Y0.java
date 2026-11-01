package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27886b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27887c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27888a;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public Y0(JSONObject jSONObject) {
        ck.p.j(jSONObject, "configurations");
        this.f27888a = jSONObject.optJSONObject("adUnits");
    }

    public final <T> Map<String, T> a(bk.l<? super JSONObject, ? extends T> lVar) throws JSONException {
        ck.p.j(lVar, "valueExtractor");
        JSONObject jSONObject = this.f27888a;
        if (jSONObject == null) {
            return kotlin.collections.a.j();
        }
        Iterator<String> itKeys = jSONObject.keys();
        ck.p.i(itKeys, "adUnits.keys()");
        kk.i iVarG = kk.r.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iVarG) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t10);
            ck.p.i(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t10, lVar.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
