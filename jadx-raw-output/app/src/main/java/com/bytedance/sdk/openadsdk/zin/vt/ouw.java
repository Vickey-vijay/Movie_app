package com.bytedance.sdk.openadsdk.zin.vt;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<C0163ouw> f13663lh;
    public String ouw;
    public List<C0163ouw> vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.zin.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0163ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f13664lh;
        public String ouw;
        public String vt;

        public final boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0163ouw)) {
                return super.equals(obj);
            }
            String str2 = this.ouw;
            if (str2 != null) {
                C0163ouw c0163ouw = (C0163ouw) obj;
                if (str2.equals(c0163ouw.ouw) && (str = this.vt) != null && str.equals(c0163ouw.vt)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static ouw ouw(String str) {
        C0163ouw c0163ouw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONObjectJsonObjectInit.optString("version");
            JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject == null) {
                        c0163ouw = null;
                    } else {
                        c0163ouw = new C0163ouw();
                        c0163ouw.ouw = jSONObjectOptJSONObject.optString("url");
                        c0163ouw.vt = jSONObjectOptJSONObject.optString("md5");
                        c0163ouw.f13664lh = jSONObjectOptJSONObject.optInt("type");
                    }
                    if (c0163ouw != null) {
                        int i11 = c0163ouw.f13664lh;
                        if (i11 == 1) {
                            arrayList.add(c0163ouw);
                        } else if (i11 == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0163ouw);
                        }
                    }
                }
            }
            ouwVar.vt = arrayList;
            ouwVar.f13663lh = arrayList2;
            return ouwVar;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
