package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3492gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3710t4 f29020a;

    public C3492gg(InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f29020a = interfaceC3710t4;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f29020a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}
