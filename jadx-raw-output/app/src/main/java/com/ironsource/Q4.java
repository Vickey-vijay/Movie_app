package com.ironsource;

import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class Q4 implements InterfaceC3696s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f27410a;

    @Override // com.ironsource.InterfaceC3696s7
    public Object a() {
        Boolean bool = this.f27410a;
        if (bool != null) {
            return Result.m3458constructorimpl(bool);
        }
        Result.a aVar = Result.Companion;
        return Result.m3458constructorimpl(kotlin.c.a(new Exception("enabled flag is not provided or invalid")));
    }

    public Q4(Boolean bool) {
        this.f27410a = bool;
    }
}
