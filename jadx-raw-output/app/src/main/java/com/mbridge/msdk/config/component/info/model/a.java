package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DeviceModel.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f33174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f33175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f33176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33177e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33178f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33179g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f33180h;

    public List<String> a() {
        return this.f33176d;
    }

    public List<String> b() {
        return this.f33175c;
    }

    private void f() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f33177e, this.f33178f, this.f33179g);
        this.f33180h = aVar;
        aVar.c();
        this.f33180h.a();
        this.f33180h.b();
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("field");
            if (obj != null) {
                this.f33173a = String.valueOf(obj);
            }
            Object obj2 = map.get("target_list");
            if (obj2 instanceof List) {
                this.f33174b = (List) obj2;
            }
            Object obj3 = map.get("cid_list");
            if (obj3 instanceof List) {
                this.f33175c = (List) obj3;
            }
            Object obj4 = map.get("activate_type_list");
            if (obj4 instanceof List) {
                this.f33176d = (List) obj4;
            }
            Object obj5 = map.get("allow_dev_id");
            if (obj5 != null) {
                this.f33177e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get("allow_normal_info");
            if (obj6 != null) {
                this.f33178f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get("allow_other_info");
            if (obj7 != null) {
                this.f33179g = Integer.parseInt(String.valueOf(obj7));
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    public Map<String, Object> c() {
        Map<String, Object> mapA = this.f33180h.a();
        Map<String, Object> mapB = this.f33180h.b();
        HashMap map = new HashMap();
        map.putAll(mapA);
        map.putAll(mapB);
        return map;
    }

    public List<String> d() {
        return this.f33174b;
    }

    public String e() {
        return this.f33173a;
    }

    public a(Map<String, Object> map) {
        a(map);
        f();
    }

    private String a(String str) {
        return this.f33180h.a(str);
    }
}
