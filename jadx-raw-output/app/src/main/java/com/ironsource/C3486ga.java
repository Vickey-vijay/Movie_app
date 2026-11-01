package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3486ga {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29008b = "ga";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29009c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29010d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29011e = "back_button_state";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f29012f = "search_keys";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29013g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C3486ga f29014h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f29015a;

    public static synchronized C3486ga a(Context context) {
        if (f29014h == null) {
            f29014h = new C3486ga(context);
        }
        return f29014h;
    }

    public static synchronized C3486ga e() {
        return f29014h;
    }

    public C3714t8.a b() {
        int i10 = Integer.parseInt(this.f29015a.getString(f29011e, "2"));
        if (i10 == 0) {
            return C3714t8.a.None;
        }
        if (i10 == 1) {
            return C3714t8.a.Device;
        }
        return i10 == 2 ? C3714t8.a.Controller : C3714t8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f29015a.edit();
        editorEdit.putString(f29011e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f29015a.getString(f29012f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C3490ge c3490ge = new C3490ge(string);
            if (c3490ge.a(C3426d4.i.R)) {
                try {
                    arrayList.addAll(c3490ge.a((JSONArray) c3490ge.b(C3426d4.i.R)));
                } catch (JSONException e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f29015a.edit();
        editorEdit.putString(f29012f, str);
        editorEdit.apply();
    }

    private C3486ga(Context context) {
        this.f29015a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f29015a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.f29015a.getString("version", Y1.f27894f);
    }

    public String a(String str) {
        String string = this.f29015a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    private boolean b(String str) {
        return str.matches(f29013g);
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f29015a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(string);
            if (jSONObjectJsonObjectInit.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject(str2);
            if (jSONObject.isNull(str3)) {
                return false;
            }
            jSONObject.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f29015a.edit();
            editorEdit.putString("ssaUserData", jSONObjectJsonObjectInit.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f29015a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f29015a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f29015a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
