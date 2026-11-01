package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3569l4 implements InterfaceC3798y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3417cd f29398d;

    public C3569l4() {
        this(null, null, false, null, 15, null);
    }

    public C3569l4(String str, String str2, boolean z10, C3417cd c3417cd) {
        ck.p.j(str, "controllerUrl");
        ck.p.j(str2, "cacheFolder");
        ck.p.j(c3417cd, "rootFolder");
        this.f29395a = str;
        this.f29396b = str2;
        this.f29397c = z10;
        this.f29398d = c3417cd;
    }

    @Override // com.ironsource.InterfaceC3798y7
    public String a() {
        return this.f29395a;
    }

    @Override // com.ironsource.InterfaceC3798y7
    public boolean b() {
        return this.f29397c;
    }

    @Override // com.ironsource.InterfaceC3798y7
    public C3417cd c() {
        return this.f29398d;
    }

    @Override // com.ironsource.InterfaceC3798y7
    public String d() {
        return this.f29396b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3569l4(String str, String str2, boolean z10, C3417cd c3417cd, int i10, ck.i iVar) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new C3417cd(str) : c3417cd);
    }
}
