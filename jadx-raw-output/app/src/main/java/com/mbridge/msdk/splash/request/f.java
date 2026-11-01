package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: SplashV3ParamsEntity.java */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37170e;

    public void a(String str) {
        this.f37167b = str;
    }

    public int b() {
        return this.f37169d;
    }

    public int c() {
        return this.f37168c;
    }

    public int d() {
        return this.f37166a;
    }

    public int a() {
        return this.f37170e;
    }

    public void b(int i10) {
        this.f37169d = i10;
    }

    public void c(int i10) {
        this.f37168c = i10;
    }

    public void d(int i10) {
        this.f37166a = i10;
    }

    public String e() {
        return this.f37167b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f37166a + ", session_id='" + this.f37167b + "', offset=" + this.f37168c + ", expectWidth=" + this.f37169d + ", expectHeight=" + this.f37170e + '}';
    }

    public void a(int i10) {
        this.f37170e = i10;
    }
}
