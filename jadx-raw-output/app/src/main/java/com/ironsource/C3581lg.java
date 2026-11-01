package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3581lg implements InterfaceC3392b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3417cd f29410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29411b;

    public C3581lg(C3417cd c3417cd, String str) {
        ck.p.j(c3417cd, "folderRootUrl");
        ck.p.j(str, "version");
        this.f29410a = c3417cd;
        this.f29411b = str;
    }

    public final String a() {
        return this.f29411b;
    }

    @Override // com.ironsource.InterfaceC3392b6
    public String value() {
        return this.f29410a.a() + "/versions/" + this.f29411b + "/mobileController.html";
    }
}
