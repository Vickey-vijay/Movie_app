package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C3426d4;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f22625a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f22626b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f22627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f22628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f22629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f22630f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f22626b) {
            Objects.toString(f22630f);
            Objects.toString(jSONObject);
            f22630f = jSONObject;
            f22628d = true;
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = f22630f;
                if (jSONObject2 == null) {
                    eaA.a("publisher_provided_unified_id");
                } else {
                    eaA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                    mj.r rVar = mj.r.f64562a;
                }
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f22625a) {
            if (f22627c) {
                return f22629e;
            }
            f22627c = true;
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                ck.p.j("ufids", C3426d4.i.W);
                String string = eaA.f22577a.getString("ufids", null);
                if (string != null) {
                    try {
                        f22629e = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                    return f22629e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f22626b) {
            if (f22628d) {
                Objects.toString(f22630f);
                return f22630f;
            }
            f22628d = true;
            Context context = Ji.f22951a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                ck.p.j("publisher_provided_unified_id", C3426d4.i.W);
                string = eaA.f22577a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f22630f = new JSONObject(string);
                } catch (JSONException e10) {
                    e10.getMessage();
                }
            } catch (NullPointerException e11) {
                e11.getMessage();
            }
            Objects.toString(f22630f);
            return f22630f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f22625a) {
            f22629e = jSONObject;
            f22627c = true;
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                JSONObject jSONObject2 = f22629e;
                if (jSONObject2 == null) {
                    eaA.a("ufids");
                } else {
                    eaA.a("ufids", String.valueOf(jSONObject2), false);
                }
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                JSONObject jSONObject3 = f22629e;
                if (jSONObject3 == null) {
                    editorEdit.remove("InMobi_unifiedId");
                } else {
                    editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                }
                editorEdit.apply();
            }
        }
    }
}
