package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f10811le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public List<C0068ouw> f10812lh;
    public String ouw;
    public float vt;
    public long yu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ouw$ouw, reason: collision with other inner class name */
    public static class C0068ouw {
        public String bly;
        public String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f10813le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f10814lh;
        public long ouw;
        public float[] pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f10815ra;
        public String tlj;
        public float vt;
        public long yu;

        public static C0068ouw ouw(JSONObject jSONObject, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
            if (jSONObject == null) {
                return null;
            }
            C0068ouw c0068ouw = new C0068ouw();
            c0068ouw.ouw = jSONObject.optLong("duration");
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0068ouw.vt = -1.0f;
            } else {
                try {
                    c0068ouw.vt = Float.parseFloat(strOptString);
                } catch (NumberFormatException unused) {
                    c0068ouw.vt = 0.0f;
                }
            }
            c0068ouw.f10814lh = jSONObject.optString("loopMode");
            String strOptString2 = jSONObject.optString("type");
            c0068ouw.fkw = strOptString2;
            if (TextUtils.equals(strOptString2, "ripple")) {
                c0068ouw.tlj = jSONObject.optString("rippleColor");
            }
            T t10 = lhVar.fkw;
            Context context = t10 != 0 ? t10.getContext() : null;
            if (TextUtils.equals(c0068ouw.fkw, "backgroundColor")) {
                String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("valueTo"), lhVar.yu);
                int iOuw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(jSONObject.optString("valueFrom"), ViewCompat.MEASURED_STATE_MASK);
                int iOuw2 = com.bytedance.adsdk.ugeno.ra.ouw.ouw(strOuw, ViewCompat.MEASURED_STATE_MASK);
                c0068ouw.f10813le = iOuw;
                c0068ouw.f10815ra = iOuw2;
            } else if ((TextUtils.equals(c0068ouw.fkw, "translateX") || TextUtils.equals(c0068ouw.fkw, "translateY")) && context != null) {
                try {
                    float fOuw = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueFrom"));
                    float fOuw2 = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) jSONObject.optDouble("valueTo"));
                    c0068ouw.f10813le = fOuw;
                    c0068ouw.f10815ra = fOuw2;
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0068ouw.f10813le = (float) jSONObject.optDouble("valueFrom");
                c0068ouw.f10815ra = (float) jSONObject.optDouble("valueTo");
            }
            c0068ouw.bly = jSONObject.optString("interpolator");
            String strOuw2 = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu);
            Log.d("TAG", "createAnimationModel: ");
            c0068ouw.yu = com.bytedance.adsdk.ugeno.ra.lh.ouw(strOuw2);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0068ouw.fkw, "translateX") || TextUtils.equals(c0068ouw.fkw, "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.ra.ra.ouw(context, (float) ouw.ouw(jSONArrayOptJSONArray.optString(i10), lhVar.yu));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) ouw.ouw(jSONArrayOptJSONArray.optString(i10), lhVar.yu);
                        i10++;
                    }
                }
                c0068ouw.pno = fArr;
            }
            return c0068ouw;
        }
    }

    public static ouw ouw(String str, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ouw(new JSONObject(str), null, lhVar);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static ouw ouw(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (jSONObject == null) {
            return null;
        }
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optString("ordering");
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            ouwVar.vt = -1.0f;
        } else {
            try {
                ouwVar.vt = Float.parseFloat(strOptString);
            } catch (NumberFormatException unused) {
                ouwVar.vt = 0.0f;
            }
        }
        ouwVar.yu = jSONObject.optLong("duration", 0L);
        ouwVar.fkw = com.bytedance.adsdk.ugeno.ra.lh.ouw(com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObject.optString("startDelay"), lhVar.yu));
        ouwVar.f10811le = jSONObject.optString("loopMode");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.ra.vt.ouw(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0068ouw.ouw(jSONObjectOptJSONObject, lhVar));
            }
            ouwVar.f10812lh = arrayList;
        }
        return ouwVar;
    }

    public static double ouw(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.ra.lh.vt(com.bytedance.adsdk.ugeno.lh.vt.ouw((String) obj, jSONObject));
        }
        return 0.0d;
    }
}
