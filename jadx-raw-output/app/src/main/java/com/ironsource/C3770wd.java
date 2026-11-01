package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3770wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, a> f31548a;

    /* JADX INFO: renamed from: com.ironsource.wd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, b> f31549a;

        public a(JSONObject jSONObject) throws JSONException {
            ck.p.j(jSONObject, "adFormatProviderOrder");
            List<String> listB = C3575la.b(jSONObject.names());
            listB = listB == null ? nj.s.k() : listB;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(listB, 10)), 16));
            for (Object obj : listB) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    ck.p.i(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f31549a = linkedHashMap;
        }

        public final Map<String, b> a() {
            return this.f31549a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wd$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f31550a;

        public b(JSONArray jSONArray) throws JSONException {
            ck.p.j(jSONArray, "providerOrder");
            List<String> listB = C3575la.b(jSONArray);
            ck.p.i(listB, "jsonArrayToStringList(providerOrder)");
            this.f31550a = listB;
        }

        public final List<String> a() {
            return this.f31550a;
        }
    }

    public C3770wd(JSONObject jSONObject) {
        ck.p.j(jSONObject, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3772wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
            } else {
                ck.p.i(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f31548a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f31548a;
    }
}
