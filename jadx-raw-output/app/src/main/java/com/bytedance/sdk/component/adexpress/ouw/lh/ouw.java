package com.bytedance.sdk.component.adexpress.ouw.lh;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.ko;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {
    public Map<String, ouw> fkw = new ConcurrentHashMap();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f11563le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public vt f11564lh;
    public String ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private List<C0086ouw> f11565ra;
    public String vt;
    public String yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ouw.lh.ouw$ouw, reason: collision with other inner class name */
    public static class C0086ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11566lh;
        public String ouw;
        public String vt;

        public final boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0086ouw)) {
                return super.equals(obj);
            }
            String str2 = this.ouw;
            if (str2 != null) {
                C0086ouw c0086ouw = (C0086ouw) obj;
                if (str2.equals(c0086ouw.ouw) && (str = this.vt) != null && str.equals(c0086ouw.vt)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class vt {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public List<Pair<String, String>> f11567lh;
        public String ouw;
        public String vt;
    }

    public final List<C0086ouw> ouw() {
        if (this.f11565ra == null) {
            this.f11565ra = new ArrayList();
        }
        return this.f11565ra;
    }

    public final JSONObject lh() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", this.f11563le);
            jSONObject.putOpt("version", this.ouw);
            jSONObject.putOpt(C3426d4.i.Z, this.vt);
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("template_fetch_url", this.yu);
            }
            JSONArray jSONArray = new JSONArray();
            if (ouw() != null) {
                for (C0086ouw c0086ouw : ouw()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0086ouw.ouw);
                    jSONObject2.putOpt("md5", c0086ouw.vt);
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0086ouw.f11566lh));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.fkw.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.fkw.keySet()) {
                    ouw ouwVar = this.fkw.get(str);
                    if (ouwVar != null) {
                        jSONObject3.put(str, ouwVar.lh());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            vt vtVar = this.f11564lh;
            if (vtVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", vtVar.ouw);
                jSONObject4.put("md5", vtVar.vt);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> list = vtVar.f11567lh;
                if (list != null) {
                    for (Pair<String, String> pair : list) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean vt() {
        return (TextUtils.isEmpty(this.vt) || TextUtils.isEmpty(this.ouw) || TextUtils.isEmpty(this.f11563le)) ? false : true;
    }

    public static ouw ouw(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ouw(PangleVideoBridge.jsonObjectInit(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static ouw ouw(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        ouw ouwVar = new ouw();
        ouwVar.f11563le = jSONObject.optString("name");
        ouwVar.ouw = jSONObject.optString("version");
        ouwVar.vt = jSONObject.optString(C3426d4.i.Z);
        ouwVar.yu = jSONObject.optString("template_fetch_url", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0086ouw c0086ouw = new C0086ouw();
                c0086ouw.ouw = jSONObjectOptJSONObject2.optString("url");
                c0086ouw.vt = jSONObjectOptJSONObject2.optString("md5");
                c0086ouw.f11566lh = jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL);
                arrayList.add(c0086ouw);
            }
        }
        ouwVar.f11565ra = arrayList;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ouw ouwVarOuw = ouw(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (ouwVarOuw != null) {
                        ouwVar.fkw.put(next, ouwVarOuw);
                    }
                }
            }
        } catch (Exception e10) {
            ko.vt("engine", "parse exception:" + e10.getMessage());
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            vt vtVar = new vt();
            vtVar.ouw = jSONObjectOptJSONObject.optString("url");
            vtVar.vt = jSONObjectOptJSONObject.optString("md5");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                vtVar.f11567lh = arrayList2;
            }
            ouwVar.f11564lh = vtVar;
        }
        if (ouwVar.vt()) {
            return ouwVar;
        }
        return null;
    }
}
