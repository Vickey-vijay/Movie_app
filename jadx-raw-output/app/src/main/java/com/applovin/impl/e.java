package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7338d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f7335a = str;
        this.f7336b = str2;
        this.f7337c = map;
        this.f7338d = z10;
    }

    public String a() {
        return this.f7336b;
    }

    public Map b() {
        return this.f7337c;
    }

    public String c() {
        return this.f7335a;
    }

    public boolean d() {
        return this.f7338d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f7335a + "', backupUrl='" + this.f7336b + "', headers='" + this.f7337c + "', shouldFireInWebView='" + this.f7338d + "'}";
    }
}
