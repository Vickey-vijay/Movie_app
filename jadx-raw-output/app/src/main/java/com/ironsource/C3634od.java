package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3634od {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30357b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30358c = "placements";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f30359d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f30360a;

    /* JADX INFO: renamed from: com.ironsource.od$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public C3634od(JSONObject jSONObject) {
        ck.p.j(jSONObject, com.safedk.android.utils.i.f44984c);
        this.f30360a = jSONObject.optJSONArray("placements");
    }

    public final <T> Map<String, T> a(bk.l<? super JSONObject, ? extends T> lVar) throws JSONException {
        ck.p.j(lVar, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f30360a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String strOptString = jSONObject.optString("placementName");
                ck.p.i(jSONObject, "jsonObject");
                T tInvoke = lVar.invoke(jSONObject);
                ck.p.i(strOptString, C3426d4.i.W);
                linkedHashMap.put(strOptString, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
