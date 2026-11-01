package com.mbridge.msdk.config.component.eac.model;

import java.util.Map;

/* JADX INFO: compiled from: ForEachModel.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f33169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33171c;

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("iteration_data");
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get("execute_condition");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("end_condition");
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f33170b;
    }

    public void b(String str) {
        this.f33170b = str;
    }

    public Object c() {
        return this.f33169a;
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Object obj) {
        this.f33169a = obj;
    }

    public String a() {
        return this.f33171c;
    }

    public void a(String str) {
        this.f33171c = str;
    }
}
