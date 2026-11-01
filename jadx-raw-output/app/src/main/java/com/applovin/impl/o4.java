package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f8644b;

    public static o4 a(String str) {
        return a(str, null);
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public String b() {
        return this.f8643a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f8643a + "'params='" + this.f8644b + "'}";
    }

    private o4(String str, Map map) {
        this.f8643a = str;
        this.f8644b = map;
    }

    public Map a() {
        return this.f8644b;
    }
}
