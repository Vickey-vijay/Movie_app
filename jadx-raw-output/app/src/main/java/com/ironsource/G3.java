package com.ironsource;

import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class G3 implements InterfaceC3696s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f26572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N3 f26574c;

    @Override // com.ironsource.InterfaceC3696s7
    public Object a() {
        Boolean bool = this.f26572a;
        if (bool == null) {
            Result.a aVar = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(Boolean.FALSE);
        }
        Integer num = this.f26573b;
        if (num == null || num.intValue() <= 0) {
            Result.a aVar3 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f26574c == null) {
            Result.a aVar4 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(new Exception("unit flag is not provided or invalid")));
        }
        Result.a aVar5 = Result.Companion;
        return Result.m3458constructorimpl(Boolean.TRUE);
    }

    public G3(Boolean bool, Integer num, N3 n10) {
        this.f26572a = bool;
        this.f26573b = num;
        this.f26574c = n10;
    }
}
