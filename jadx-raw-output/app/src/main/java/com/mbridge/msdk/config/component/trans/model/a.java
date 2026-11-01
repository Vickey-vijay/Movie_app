package com.mbridge.msdk.config.component.trans.model;

import java.util.Map;

/* JADX INFO: compiled from: TransformModel.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33607a;

    public void a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("expression")) == null) {
            return;
        }
        a(String.valueOf(obj).replace("'", ""));
    }

    public a(Map<String, Object> map) {
        a(map);
    }

    public String a() {
        return this.f33607a;
    }

    public void a(String str) {
        this.f33607a = str;
    }
}
