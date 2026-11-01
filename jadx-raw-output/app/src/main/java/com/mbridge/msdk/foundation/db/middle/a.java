package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FrequencyDaoMiddle.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f34667a = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f34668b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f34669c = "FrequencyDaoMiddle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static JSONArray f34670d = new JSONArray();

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f34670d == null) {
            f34670d = new JSONArray();
        }
        f34670d.put(jSONObjectA);
        d();
    }

    public static a b() {
        if (f34668b == null) {
            synchronized (a.class) {
                if (f34668b == null) {
                    f34668b = new a();
                }
            }
        }
        return f34668b;
    }

    private void d() {
        try {
            if (f34670d != null) {
                y0.b(c.n().d(), f34669c, f34670d.toString());
            }
        } catch (Exception e10) {
            q0.b(f34667a, e10.getMessage());
        }
    }

    private a() {
        c();
    }

    private void c() {
        try {
            String str = (String) y0.a(c.n().d(), f34669c, f34670d.toString());
            if (!TextUtils.isEmpty(str)) {
                f34670d = new JSONArray(str);
            }
        } catch (Exception e10) {
            q0.b(f34667a, e10.getMessage());
        }
    }

    public void a(String str) {
        if (f34670d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f34670d.length(); i10++) {
                try {
                    JSONObject jSONObject = f34670d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    q0.b(f34667a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f34670d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f34670d != null) {
            for (int i10 = 0; i10 < f34670d.length(); i10++) {
                try {
                    JSONObject jSONObject = f34670d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    q0.b(f34667a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) {
        if (f34670d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f34670d.length(); i10++) {
                try {
                    JSONObject jSONObject = f34670d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("ts") >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    q0.b(f34667a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f34670d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
                jSONObject.put("fc_a", i10);
                jSONObject.put("fc_b", i11);
                jSONObject.put("ts", j10);
                jSONObject.put("impression_count", i12);
                jSONObject.put("click_count", i13);
            } catch (Exception e10) {
                e = e10;
                q0.b(f34667a, e.getMessage());
            }
        } catch (Exception e11) {
            e = e11;
            jSONObject = null;
        }
        return jSONObject;
    }
}
