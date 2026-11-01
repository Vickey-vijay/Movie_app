package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3409c5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C3409c5 f28316h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B7 f28323g;

    public static C3409c5 b(Context context) {
        if (f28316h == null) {
            f28316h = new C3409c5(context);
        }
        return f28316h;
    }

    public static void g() {
        f28316h = null;
    }

    public int a() {
        return this.f28321e;
    }

    public float a(Context context) {
        return this.f28323g.E(context);
    }

    public String c() {
        return this.f28318b;
    }

    public String d() {
        return this.f28317a;
    }

    public String e() {
        return this.f28319c;
    }

    public String f() {
        return this.f28320d;
    }

    private C3409c5(Context context) {
        B7 b7I = Lb.U().i();
        this.f28323g = b7I;
        this.f28317a = b7I.q();
        this.f28318b = b7I.l();
        this.f28319c = b7I.f();
        this.f28320d = b7I.i();
        this.f28321e = b7I.e();
        this.f28322f = b7I.u(context);
    }

    public String b() {
        return this.f28322f;
    }
}
