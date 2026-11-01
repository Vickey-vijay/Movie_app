package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3605n2 {
    public static final String A = "nurl";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f30209o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f30210p = "instance";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f30211q = "adData";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f30212r = "price";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f30213s = "serverData";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f30214t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f30215u = "order";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f30216v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f30217w = "price";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f30218x = "notifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f30219y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f30220z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f30225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f30229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f30230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f30231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JSONObject f30232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bb f30233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30234n;

    public C3605n2(String str) {
        this.f30221a = null;
        this.f30222b = "";
        this.f30223c = null;
        this.f30224d = "";
        this.f30225e = null;
        this.f30226f = -1;
        this.f30227g = -1;
        this.f30228h = -1;
        this.f30229i = new ArrayList();
        this.f30230j = new ArrayList();
        this.f30231k = new ArrayList();
        this.f30232l = null;
        this.f30233m = null;
        this.f30234n = true;
        this.f30221a = str;
    }

    private void a(JSONObject jSONObject, int i10) {
        this.f30226f = i10;
        this.f30227g = i10;
        this.f30228h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(f30216v, i10);
            this.f30227g = iOptInt;
            this.f30228h = jSONObject.optInt("price", iOptInt);
        }
    }

    public Z8 a(String str) {
        return null;
    }

    public List<String> b() {
        return this.f30229i;
    }

    public String c() {
        return this.f30221a;
    }

    public Bb d() {
        return this.f30233m;
    }

    public int e() {
        return this.f30226f;
    }

    public Integer f() {
        return this.f30225e;
    }

    public List<String> g() {
        return this.f30230j;
    }

    public List<String> h() {
        return this.f30231k;
    }

    public String i() {
        return this.f30224d;
    }

    public int j() {
        return this.f30228h;
    }

    public String k() {
        return this.f30222b;
    }

    public int l() {
        return this.f30227g;
    }

    public JSONObject m() {
        return this.f30232l;
    }

    public boolean n() {
        return this.f30234n;
    }

    public JSONObject a() {
        return this.f30223c;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C3575la.b(jSONObject.getJSONArray(str)));
        }
    }

    public C3605n2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C3605n2(JSONObject jSONObject, int i10, JSONObject jSONObject2) {
        this.f30221a = null;
        this.f30222b = "";
        this.f30223c = null;
        this.f30224d = "";
        this.f30225e = null;
        this.f30226f = -1;
        this.f30227g = -1;
        this.f30228h = -1;
        ArrayList arrayList = new ArrayList();
        this.f30229i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f30230j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f30231k = arrayList3;
        this.f30232l = null;
        this.f30233m = null;
        this.f30234n = true;
        try {
            if (jSONObject.has(f30210p)) {
                this.f30221a = jSONObject.getString(f30210p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f30222b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f30213s)) {
                this.f30222b = jSONObject.getJSONObject(f30213s).toString();
            }
            this.f30223c = jSONObject.optJSONObject("adData");
            this.f30224d = jSONObject.optString("price", "0");
            if (jSONObject.has(f30218x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f30218x);
                a(jSONObject3, f30219y, arrayList);
                a(jSONObject3, f30220z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.f30232l = C3575la.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f29592d));
            this.f30233m = jSONObject.has(com.ironsource.mediationsdk.d.f29593e) ? Bb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f29593e)) : null;
            this.f30225e = jSONObject.has(f30214t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f30214t))) : null;
            a(jSONObject.optJSONObject(f30215u), i10);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            this.f30234n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }
}
