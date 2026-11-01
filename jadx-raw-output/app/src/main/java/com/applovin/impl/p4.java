package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8730c;

    public String a() {
        return this.f8729b;
    }

    public String b() {
        return this.f8728a;
    }

    public boolean c() {
        return this.f8730c;
    }

    public p4(String str, String str2, Context context) {
        this.f8728a = str.replace("android.permission.", "");
        this.f8729b = str2;
        this.f8730c = o0.a(str, context);
    }
}
