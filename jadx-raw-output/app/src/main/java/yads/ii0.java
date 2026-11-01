package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f78667a = nj.s.n("native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button");

    public static void a(JSONArray jSONArray, xh0 xh0Var, hi0 hi0Var) {
        Object obj;
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                obj = jSONArray.get(i10);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, xh0Var, hi0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, xh0Var, hi0Var);
            }
        }
    }

    public static void a(JSONObject jSONObject, xh0 xh0Var, hi0 hi0Var) {
        Object obj;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("extensions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (ck.p.e((jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("params")) == null) ? null : jSONObjectOptJSONObject.optString("view_name"), "native_ad_view")) {
                    xh0Var = xh0.f84595c;
                    break;
                }
            }
        }
        hi0Var.mo1invoke(jSONObject, xh0Var);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                obj = jSONObject.get(itKeys.next());
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, xh0Var, hi0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, xh0Var, hi0Var);
            }
        }
    }

    public final Set a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(jSONObject, xh0.f84594b, new hi0(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!f78667a.contains(((wh0) obj).f84212b)) {
                arrayList2.add(obj);
            }
        }
        return nj.b0.T0(arrayList2);
    }
}
