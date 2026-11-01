package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class N6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27094b = "userId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27095c = "appKey";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static N6 f27096d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f27097a = IronSourceVideoBridge.jsonObjectInit();

    public static synchronized N6 a() {
        if (f27096d == null) {
            f27096d = new N6();
        }
        return f27096d;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Lb.U().g().g()) {
            return IronSourceVideoBridge.jsonObjectInit(this.f27097a.toString());
        }
        return this.f27097a;
    }

    private N6() {
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f27097a.put(str, obj);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }

    public synchronized String a(String str) {
        return this.f27097a.optString(str);
    }
}
