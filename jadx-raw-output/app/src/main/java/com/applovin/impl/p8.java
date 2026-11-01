package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p8 f8751f = new p8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f8752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8756e;

    public p8(String str, Map map, p8 p8Var) {
        this.f8752a = p8Var;
        this.f8753b = str;
        this.f8754c = Collections.unmodifiableMap(map);
        this.f8756e = new ArrayList();
    }

    public Map a() {
        return this.f8754c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f8756e);
    }

    public String c() {
        return this.f8753b;
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f8756e.size());
        for (p8 p8Var : this.f8756e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f8756e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.f8756e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    public String d() {
        return this.f8755d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f8753b + "', text='" + this.f8755d + "', attributes=" + this.f8754c + '}';
    }

    private p8() {
        this.f8752a = null;
        this.f8753b = "";
        this.f8754c = Collections.emptyMap();
        this.f8755d = "";
        this.f8756e = Collections.emptyList();
    }
}
