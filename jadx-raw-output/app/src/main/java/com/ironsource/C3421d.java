package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3421d implements InterfaceC3392b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3417cd f28375a;

    public C3421d(C3417cd c3417cd) {
        ck.p.j(c3417cd, "folderRootUrl");
        this.f28375a = c3417cd;
    }

    @Override // com.ironsource.InterfaceC3392b6
    public String value() {
        return this.f28375a.a() + "/abTestMap.json";
    }
}
