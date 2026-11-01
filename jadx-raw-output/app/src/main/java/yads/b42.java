package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b42 {
    public static final boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
