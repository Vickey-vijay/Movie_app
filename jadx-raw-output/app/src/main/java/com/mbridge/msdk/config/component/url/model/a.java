package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: OpenAppModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Object, Object> f33613d;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("target_name");
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get("scheme");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("extra");
            if (obj3 instanceof Map) {
                b((Map<Object, Object>) obj3);
            }
        }
    }

    public void b(String str) {
        this.f33612c = str;
    }

    public Map<Object, Object> b() {
        return this.f33613d;
    }

    public String c() {
        return this.f33611b;
    }

    public String d() {
        return this.f33612c;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public void b(Map<Object, Object> map) {
        this.f33613d = map;
    }

    public Context a() {
        return this.f33610a;
    }

    public void a(Context context) {
        this.f33610a = context;
    }

    public void a(String str) {
        this.f33611b = str;
    }
}
