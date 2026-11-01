package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public interface InterfaceC3508he {
    void a(Activity activity);

    void a(String str, String str2, int i10);

    void a(String str, String str2, String str3, Map<String, String> map, Kc kc2);

    void a(String str, String str2, String str3, Map<String, String> map, Pc pc2);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
