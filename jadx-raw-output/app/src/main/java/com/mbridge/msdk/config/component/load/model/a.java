package com.mbridge.msdk.config.component.load.model;

import java.util.Map;

/* JADX INFO: compiled from: DownloadModel.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33411a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33413c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33416f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f33412b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33414d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33415e = 0;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("url");
            if (obj != null) {
                this.f33411a = String.valueOf(obj);
            }
            Object obj2 = map.get("range");
            if (obj2 != null) {
                float f10 = Float.parseFloat(String.valueOf(obj2));
                if (f10 <= 0.0f || f10 > 1.0f) {
                    f10 = 1.0f;
                }
                this.f33412b = f10;
            }
            Object obj3 = map.get("action");
            if (obj3 != null) {
                this.f33413c = String.valueOf(obj3);
            }
            Object obj4 = map.get("timeout");
            if (obj4 != null) {
                int i10 = Integer.parseInt(String.valueOf(obj4));
                if (i10 == 0) {
                    i10 = 30;
                }
                this.f33414d = i10;
            }
            Object obj5 = map.get("retry");
            if (obj5 != null) {
                this.f33415e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get("max_concurrent");
            if (obj6 != null) {
                this.f33416f = Integer.parseInt(String.valueOf(obj6));
            }
        }
    }

    public float b() {
        return this.f33412b;
    }

    public int c() {
        return this.f33416f;
    }

    public String d() {
        return this.f33411a;
    }

    public int e() {
        return this.f33415e;
    }

    public int f() {
        return this.f33414d * 1000;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f33413c;
    }
}
