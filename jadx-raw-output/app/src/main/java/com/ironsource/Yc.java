package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Yc implements M7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H3 f27941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f27942b;

    @Override // com.ironsource.M7
    public Long a(String str) {
        ck.p.j(str, "identifier");
        Long l10 = this.f27942b.get(str);
        if (l10 != null) {
            return l10;
        }
        Long lB = this.f27941a.b(str);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f27942b.put(str, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    public Yc(H3 h10) {
        ck.p.j(h10, C3426d4.a.f28418k);
        this.f27941a = h10;
        this.f27942b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.M7
    public void a(long j10, String str) {
        ck.p.j(str, "identifier");
        this.f27942b.put(str, Long.valueOf(j10));
        this.f27941a.a(str, j10);
    }
}
