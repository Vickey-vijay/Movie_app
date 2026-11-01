package com.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public final class Z6 implements InterfaceC3375a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC3429d7 f27980b;

    public Z6(long j10, EnumC3429d7 enumC3429d7) {
        ck.p.j(enumC3429d7, "recoveryStrategy");
        this.f27979a = j10;
        this.f27980b = enumC3429d7;
    }

    @Override // com.ironsource.InterfaceC3375a7
    public long a() {
        return this.f27979a;
    }

    @Override // com.ironsource.InterfaceC3375a7
    public EnumC3429d7 b() {
        return this.f27980b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z6(C3411c7 c3411c7) {
        this(c3411c7.a(), c3411c7.c());
        ck.p.j(c3411c7, "feature");
    }
}
