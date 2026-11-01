package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f10136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f10138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10139d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10140e = new Object();

    public Object a(x4 x4Var) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f10140e) {
            Object obj = this.f10139d.get(x4Var.b());
            if (obj == null) {
                return x4Var.a();
            }
            return x4Var.a(obj);
        }
    }

    public List b(x4 x4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(x4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(x4 x4Var) {
        return CollectionUtils.explode((String) a(x4Var));
    }

    private void d() {
        String strB = ((Boolean) a5.a(z4.f10245j, Boolean.FALSE, com.applovin.impl.sdk.k.o())).booleanValue() ? "" : b();
        synchronized (this.f10140e) {
            for (x4 x4Var : x4.c()) {
                try {
                    Object objA = this.f10136a.a(strB + x4Var.b(), null, x4Var.a().getClass(), this.f10138c);
                    if (objA != null) {
                        this.f10139d.put(x4Var.b(), objA);
                    }
                } catch (Throwable th2) {
                    com.applovin.impl.sdk.o.c("SettingsManager", "Unable to load \"" + x4Var.b() + "\"", th2);
                    this.f10136a.D().a("SettingsManager", "initSettings", th2);
                }
            }
        }
    }

    public void e() {
        Boolean bool = (Boolean) a5.a(z4.f10245j, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        String strB = b();
        synchronized (this.f10140e) {
            SharedPreferences.Editor editorEdit = this.f10138c.edit();
            for (x4 x4Var : x4.c()) {
                Object obj = this.f10139d.get(x4Var.b());
                if (obj != null) {
                    String strB2 = x4Var.b();
                    this.f10136a.a(strB + x4Var.b(), obj, editorEdit);
                    if (bool.booleanValue()) {
                        this.f10136a.a(strB2, obj, editorEdit);
                    }
                }
            }
            if (((Boolean) this.f10136a.a(x4.F6)).booleanValue()) {
                a5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public y4(com.applovin.impl.sdk.k kVar) {
        this.f10136a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f10137b = contextO;
        this.f10138c = contextO.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(x4.class.getName());
            Class.forName(r3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public boolean c() {
        return this.f10136a.n0().isVerboseLoggingEnabled() || ((Boolean) a(x4.f9963k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + n7.f(this.f10136a.i0()) + ".";
    }

    public void a(x4 x4Var, Object obj) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f10140e) {
                this.f10139d.put(x4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f10140e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, x4.f10045u.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            try {
                                x4 x4VarA = x4.a(next);
                                if (x4VarA != null) {
                                    Object objA = zBooleanValue ? a(x4VarA) : null;
                                    Object objA2 = a(next, jSONObject, x4VarA.a());
                                    this.f10139d.put(x4VarA.b(), objA2);
                                    if (x4VarA == x4.H5) {
                                        this.f10139d.put(x4.I5.b(), Long.valueOf(System.currentTimeMillis()));
                                    }
                                    if (zBooleanValue && !objA2.equals(objA)) {
                                        map.put(x4VarA, objA);
                                    }
                                }
                            } catch (Throwable th2) {
                                com.applovin.impl.sdk.o.c("SettingsManager", "Unable to convert setting object ", th2);
                                this.f10136a.D().a("SettingsManager", "loadSettingsThrowable", th2);
                            }
                        } catch (JSONException e10) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to parse JSON settingsValues array", e10);
                            this.f10136a.D().a("SettingsManager", "loadSettingsException", e10);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    v2 v2Var = new v2();
                    v2Var.a("========== UPDATED SETTINGS ==========");
                    for (x4 x4Var : map.keySet()) {
                        v2Var.a(x4Var.b(), a(x4Var) + " (" + map.get(x4Var) + ")");
                    }
                    v2Var.a("========== END ==========");
                    this.f10136a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f10136a.O().a("SettingsManager", v2Var.toString());
                    }
                }
                a5.b(z4.f10245j, (Boolean) a(x4.T6), com.applovin.impl.sdk.k.o());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a() {
        synchronized (this.f10140e) {
            this.f10139d.clear();
        }
        this.f10136a.a(this.f10138c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
