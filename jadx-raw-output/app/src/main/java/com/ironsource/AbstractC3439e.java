package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC3439e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28710a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28711b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28712c = "InterstitialEvents";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28713d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28714e = "events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JSONObject f28715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f28717h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C5> arrayList, JSONObject jSONObject);

    public JSONObject a(C5 c10) {
        try {
            String strA = c10.a();
            JSONObject jSONObjectJsonObjectInit = !TextUtils.isEmpty(strA) ? IronSourceVideoBridge.jsonObjectInit(strA) : IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("eventId", c10.c());
            jSONObjectJsonObjectInit.put("timestamp", c10.d());
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public abstract String c();

    public String b() {
        return TextUtils.isEmpty(this.f28717h) ? a() : this.f28717h;
    }

    public String a(JSONArray jSONArray) {
        try {
            if (this.f28715f != null) {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(this.f28715f.toString());
                jSONObjectJsonObjectInit.put("timestamp", IronSourceUtils.e());
                jSONObjectJsonObjectInit.put(a(this.f28716g), jSONArray);
                return jSONObjectJsonObjectInit.toString();
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
        return "";
    }

    public void a(String str) {
        this.f28717h = str;
    }
}
