package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3520i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29150c;

    public C3520i8() {
        this.f29148a = 0;
        this.f29149b = 0;
        this.f29150c = "";
    }

    public int a() {
        return this.f29149b;
    }

    public String b() {
        return this.f29150c;
    }

    public int c() {
        return this.f29148a;
    }

    public boolean d() {
        return this.f29149b > 0 && this.f29148a > 0;
    }

    public boolean e() {
        return this.f29149b == 0 && this.f29148a == 0;
    }

    public String toString() {
        return this.f29150c;
    }

    public C3520i8(int i10, int i11, String str) {
        this.f29148a = i10;
        this.f29149b = i11;
        this.f29150c = str;
    }
}
