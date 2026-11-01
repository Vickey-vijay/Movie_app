package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3731u8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31399c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31401b;

    public int a() {
        return this.f31401b;
    }

    public String b() {
        return this.f31400a;
    }

    public String toString() {
        return "error - code:" + this.f31401b + ", message:" + this.f31400a;
    }

    public C3731u8(int i10, String str) {
        this.f31401b = i10;
        this.f31400a = str == null ? "" : str;
    }
}
