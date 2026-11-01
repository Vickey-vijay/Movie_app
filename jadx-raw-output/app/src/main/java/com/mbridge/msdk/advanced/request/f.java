package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: NativeAdvancedV3ParamsEntity.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32710e;

    public void a(String str) {
        this.f32707b = str;
    }

    public int b() {
        return this.f32709d;
    }

    public int c() {
        return this.f32708c;
    }

    public int d() {
        return this.f32706a;
    }

    public int a() {
        return this.f32710e;
    }

    public void b(int i10) {
        this.f32709d = i10;
    }

    public void c(int i10) {
        this.f32708c = i10;
    }

    public void d(int i10) {
        this.f32706a = i10;
    }

    public String e() {
        return this.f32707b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f32706a + ", session_id='" + this.f32707b + "', offset=" + this.f32708c + ", expectWidth=" + this.f32709d + ", expectHeight=" + this.f32710e + '}';
    }

    public void a(int i10) {
        this.f32710e = i10;
    }
}
