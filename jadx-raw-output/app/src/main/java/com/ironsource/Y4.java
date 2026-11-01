package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Y4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27901h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27902i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27903j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f27904k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27905l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f27909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O9 f27912g;

    public Y4(String str, String str2, Map<String, String> map, Hc hc2) {
        this.f27908c = -1;
        this.f27907b = str;
        this.f27906a = str2;
        this.f27909d = map;
        this.f27910e = 0;
        this.f27911f = false;
        this.f27912g = null;
    }

    public void a(boolean z10) {
        this.f27911f = z10;
    }

    public synchronized void b(int i10) {
        this.f27910e = i10;
    }

    public O9 c() {
        return this.f27912g;
    }

    public boolean a(int i10) {
        return this.f27908c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f27907b);
        map.put("demandSourceName", this.f27906a);
        Map<String, String> map2 = this.f27909d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i10) {
        this.f27908c = i10;
    }

    public boolean d() {
        return this.f27911f;
    }

    public int e() {
        return this.f27910e;
    }

    public String f() {
        return this.f27906a;
    }

    public Map<String, String> g() {
        return this.f27909d;
    }

    public String h() {
        return this.f27907b;
    }

    public Hc i() {
        if (this.f27912g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f27908c;
    }

    public boolean k() {
        Map<String, String> map = this.f27909d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f27909d.get("rewarded"));
    }

    public void a() {
        Map<String, String> map = this.f27909d;
        if (map != null) {
            map.clear();
        }
        this.f27909d = null;
    }

    public Y4(O9 o10) {
        this(o10.e(), o10.g(), o10.a(), o10.b());
        this.f27912g = o10;
    }
}
