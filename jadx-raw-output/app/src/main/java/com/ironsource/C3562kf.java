package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3562kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29378b;

    public C3562kf(String str, String str2) {
        ck.p.j(str, "identifier");
        ck.p.j(str2, "baseConst");
        this.f29377a = str;
        this.f29378b = str2;
    }

    public final String a() {
        return this.f29377a + "_" + this.f29378b;
    }
}
