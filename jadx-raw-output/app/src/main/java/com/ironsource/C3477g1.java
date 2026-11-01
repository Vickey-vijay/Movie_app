package com.ironsource;

import java.util.Calendar;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3477g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3473ff f28968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W7 f28969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28971d;

    public C3477g1(EnumC3473ff enumC3473ff, W7 w10, String str) {
        ck.p.j(enumC3473ff, "recordType");
        ck.p.j(w10, "adProvider");
        ck.p.j(str, "adInstanceId");
        this.f28968a = enumC3473ff;
        this.f28969b = w10;
        this.f28970c = str;
        this.f28971d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    public final String a() {
        return this.f28970c;
    }

    public final W7 b() {
        return this.f28969b;
    }

    public final Map<String, Object> c() {
        return kotlin.collections.a.m(mj.h.a(C3784xa.f31581c, Integer.valueOf(this.f28969b.b())), mj.h.a("ts", String.valueOf(this.f28971d)));
    }

    public final Map<String, Object> d() {
        return kotlin.collections.a.m(mj.h.a(C3784xa.f31580b, this.f28970c), mj.h.a(C3784xa.f31581c, Integer.valueOf(this.f28969b.b())), mj.h.a("ts", String.valueOf(this.f28971d)), mj.h.a("rt", Integer.valueOf(this.f28968a.ordinal())));
    }

    public final EnumC3473ff e() {
        return this.f28968a;
    }

    public final long f() {
        return this.f28971d;
    }
}
