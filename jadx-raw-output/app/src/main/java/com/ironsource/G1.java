package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f26562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<Integer> f26563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<Integer> f26564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<Integer> f26565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<Integer> f26566n;

    public final String a() {
        return this.f26553a;
    }

    public G1(JSONObject jSONObject) {
        ck.p.j(jSONObject, "applicationEvents");
        String strOptString = jSONObject.optString("abt");
        ck.p.i(strOptString, "it");
        this.f26553a = strOptString.length() <= 0 ? null : strOptString;
        this.f26554b = jSONObject.optBoolean("sendUltraEvents", false);
        this.f26555c = jSONObject.optBoolean("sendEventsToggle", false);
        this.f26556d = jSONObject.optBoolean("eventsCompression", false);
        this.f26557e = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString2 = jSONObject.optString("serverEventsURL");
        ck.p.i(strOptString2, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f26558f = strOptString2;
        String strOptString3 = jSONObject.optString("serverEventsType");
        ck.p.i(strOptString3, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f26559g = strOptString3;
        this.f26560h = jSONObject.optInt("backupThreshold", -1);
        this.f26561i = jSONObject.optInt("maxNumberOfEvents", -1);
        this.f26562j = jSONObject.optInt("maxEventsPerBatch", 5000);
        this.f26563k = a(jSONObject, "optOut");
        this.f26564l = a(jSONObject, "optIn");
        this.f26565m = a(jSONObject, "triggerEvents");
        this.f26566n = a(jSONObject, "nonConnectivityEvents");
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return nj.s.k();
        }
        ik.i iVarQ = ik.k.q(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(nj.t.v(iVarQ, 10));
        Iterator<Integer> it = iVarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((nj.g0) it).nextInt())));
        }
        return arrayList;
    }

    public final int b() {
        return this.f26560h;
    }

    public final boolean c() {
        return this.f26556d;
    }

    public final int d() {
        return this.f26557e;
    }

    public final String e() {
        return this.f26559g;
    }

    public final int f() {
        return this.f26562j;
    }

    public final int g() {
        return this.f26561i;
    }

    public final List<Integer> h() {
        return this.f26566n;
    }

    public final List<Integer> i() {
        return this.f26564l;
    }

    public final List<Integer> j() {
        return this.f26563k;
    }

    public final boolean k() {
        return this.f26555c;
    }

    public final boolean l() {
        return this.f26554b;
    }

    public final String m() {
        return this.f26558f;
    }

    public final List<Integer> n() {
        return this.f26565m;
    }
}
