package yads;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WindowManager f79952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f79953b = {VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f79954c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VastAttributes.HORIZONTAL_POSITION, i10 / f79954c);
            jSONObject.put(VastAttributes.VERTICAL_POSITION, i11 / f79954c);
            jSONObject.put("width", i12 / f79954c);
            jSONObject.put("height", i13 / f79954c);
        } catch (JSONException e10) {
            tw3.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f79953b;
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
                if (b(jSONObject, jSONObject2)) {
                    return true;
                }
            } else if ((jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) || (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray2.length())) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    if (jSONArrayOptJSONArray.optString(i11, "").equals(jSONArrayOptJSONArray2.optString(i11, ""))) {
                    }
                }
                if (b(jSONObject, jSONObject2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!(jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!c(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + C3426d4.j.f28588e, e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (f79952a != null) {
            Point point = new Point(0, 0);
            f79952a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f79954c;
            float f14 = f12 / f13;
            f11 = point.y / f13;
            f10 = f14;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException unused) {
        }
    }
}
