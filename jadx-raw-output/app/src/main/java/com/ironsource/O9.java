package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3520i8 f27279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f27280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Hc f27281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f27282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27284j;

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f27276b);
        map.put("instanceName", this.f27277c);
        map.put("rewarded", Boolean.toString(this.f27275a));
        map.put("inAppBidding", Boolean.toString(this.f27278d));
        map.put("isOneFlow", Boolean.toString(this.f27283i));
        map.put(C3426d4.f28401s, String.valueOf(2));
        C3520i8 c3520i8 = this.f27279e;
        map.put("width", c3520i8 != null ? Integer.toString(c3520i8.c()) : "0");
        C3520i8 c3520i9 = this.f27279e;
        map.put("height", c3520i9 != null ? Integer.toString(c3520i9.a()) : "0");
        C3520i8 c3520i10 = this.f27279e;
        map.put("label", c3520i10 != null ? c3520i10.b() : "");
        map.put(C3426d4.f28405w, Boolean.toString(i()));
        if (this.f27284j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f27282h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f27280f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Hc b() {
        return this.f27281g;
    }

    public String c() {
        return this.f27282h;
    }

    public Map<String, String> d() {
        return this.f27280f;
    }

    public String e() {
        return this.f27276b;
    }

    public String f() {
        return this.f27277c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f27277c;
    }

    public C3520i8 h() {
        return this.f27279e;
    }

    public boolean j() {
        return this.f27278d;
    }

    public boolean l() {
        return this.f27284j;
    }

    public boolean m() {
        return this.f27283i;
    }

    public boolean n() {
        return this.f27275a;
    }

    public O9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Hc hc2, C3520i8 c3520i8) {
        this.f27276b = str;
        this.f27277c = str2;
        this.f27275a = z10;
        this.f27278d = z11;
        this.f27280f = map;
        this.f27281g = hc2;
        this.f27279e = c3520i8;
        this.f27283i = z12;
        this.f27284j = z13;
        this.f27282h = str3;
    }

    public boolean i() {
        if (h() != null && h().d()) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (!j() && !m()) {
            return false;
        }
        return true;
    }

    public void a(Hc hc2) {
        this.f27281g = hc2;
    }

    public void a(String str) {
        this.f27282h = str;
    }
}
