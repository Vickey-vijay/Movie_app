package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: InnerStoreModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, Object> f33231f;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("type");
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get("url");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("store_info");
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                b(map2);
                if (map2 != null && !map2.isEmpty()) {
                    c(String.valueOf(map2.get("target_name")));
                }
            }
            Object obj4 = map.get("action");
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f33228c = str;
    }

    public void c(String str) {
        this.f33229d = str;
    }

    public void d(String str) {
        this.f33227b = str;
    }

    public Map<String, Object> b() {
        return this.f33231f;
    }

    public String c() {
        return this.f33230e;
    }

    public String d() {
        return this.f33228c;
    }

    public String e() {
        return this.f33229d;
    }

    public String f() {
        return this.f33227b;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public void b(Map<String, Object> map) {
        this.f33231f = map;
    }

    public Context a() {
        return this.f33226a;
    }

    public void a(Context context) {
        this.f33226a = context;
    }

    public void a(String str) {
        this.f33230e = str;
    }
}
