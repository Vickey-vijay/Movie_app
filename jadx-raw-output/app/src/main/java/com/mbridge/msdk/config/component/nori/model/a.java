package com.mbridge.msdk.config.component.nori.model;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: NetworkRequestModel.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f33481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f33482b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f33484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f33485e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f33488h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f33492l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33483c = "HTTP";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33486f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33487g = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f33489i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33490j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33491k = 9377;

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("urls");
                if (obj instanceof List) {
                    b((List<String>) obj);
                } else if (obj instanceof String) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj.toString());
                    b(arrayList);
                }
                Object obj2 = map.get("scheme");
                if (obj2 != null) {
                    c(String.valueOf(obj2));
                }
                Object obj3 = map.get("method");
                if (obj3 != null) {
                    a(String.valueOf(obj3));
                }
                Object obj4 = map.get("body");
                if (obj4 instanceof Map) {
                    b((Map<String, Object>) obj4);
                }
                Object obj5 = map.get("port");
                if (obj5 != null) {
                    c(Integer.parseInt(String.valueOf(obj5)));
                }
                Object obj6 = map.get("macro");
                if (obj6 instanceof Map) {
                    d((Map) obj6);
                }
                Object obj7 = map.get("retry");
                if (obj7 != null) {
                    try {
                        a(Integer.parseInt(String.valueOf(obj7)));
                    } catch (Exception e10) {
                        q0.b("NetworkRequestModel", e10.getMessage());
                    }
                }
                Object obj8 = map.get("retry_interval");
                if (obj8 != null) {
                    try {
                        b(Integer.parseInt(String.valueOf(obj8)));
                    } catch (Exception e11) {
                        q0.b("NetworkRequestModel", e11.getMessage());
                    }
                }
                Object obj9 = map.get("timeout");
                if (obj9 != null) {
                    try {
                        a(Long.parseLong(String.valueOf(obj9)));
                    } catch (Exception e12) {
                        q0.b("NetworkRequestModel", e12.getMessage());
                    }
                }
                Object obj10 = map.get("header");
                if (obj10 instanceof Map) {
                    c((Map<String, Object>) obj10);
                }
                Object obj11 = map.get("host_to_stop");
                if (obj11 instanceof List) {
                    a((List<String>) obj11);
                } else if (obj11 instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(obj11.toString());
                    a(arrayList2);
                }
                Object obj12 = map.get("request_type");
                if (obj12 != null) {
                    b(String.valueOf(obj12));
                }
            } catch (Exception e13) {
                q0.b("NetworkRequestModel", e13.getMessage(), e13);
            }
        }
    }

    public void b(List<String> list) {
        this.f33482b = list;
    }

    public void c(String str) {
        this.f33483c = str;
    }

    public Map<String, String> d() {
        return this.f33484d;
    }

    public Map<String, Object> b() {
        return this.f33485e;
    }

    public void c(Map<String, Object> map) {
        this.f33485e = map;
    }

    public void d(Map<String, String> map) {
        this.f33484d = map;
    }

    public String e() {
        return this.f33489i;
    }

    public String f() {
        return this.f33492l;
    }

    public int g() {
        return this.f33486f;
    }

    public int h() {
        return this.f33487g;
    }

    public String i() {
        return this.f33483c;
    }

    public int j() {
        return this.f33491k;
    }

    public long k() {
        return this.f33490j;
    }

    public List<String> l() {
        return this.f33482b;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public void b(Map<String, Object> map) {
        this.f33488h = map;
    }

    public void c(int i10) {
        this.f33491k = i10;
    }

    public void b(int i10) {
        this.f33487g = i10;
    }

    public List<String> c() {
        return this.f33481a;
    }

    public void b(String str) {
        this.f33492l = str;
    }

    public void a(int i10) {
        this.f33486f = i10;
    }

    public Map<String, Object> a() {
        return this.f33488h;
    }

    public void a(String str) {
        this.f33489i = str;
    }

    public void a(long j10) {
        this.f33490j = j10;
    }

    public void a(List<String> list) {
        this.f33481a = list;
    }
}
