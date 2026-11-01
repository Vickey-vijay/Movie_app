package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3600mf implements T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H3 f30187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f30188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f30189c;

    @Override // com.ironsource.T8
    public void a(int i10, String str) {
        ck.p.j(str, "identifier");
        this.f30188b.put(str, Integer.valueOf(i10));
        this.f30187a.a(str, i10);
    }

    public C3600mf(H3 h10) {
        ck.p.j(h10, C3426d4.a.f28418k);
        this.f30187a = h10;
        this.f30188b = new ConcurrentHashMap<>();
        this.f30189c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.T8
    public Long b(String str) {
        ck.p.j(str, "identifier");
        Long l10 = this.f30189c.get(str);
        if (l10 != null) {
            return l10;
        }
        Long lA = this.f30187a.a(str);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f30189c.put(str, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.T8
    public int a(String str) {
        ck.p.j(str, "identifier");
        Integer num = this.f30188b.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f30187a.c(str);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.f30188b.put(str, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f30188b.put(str, 0);
        return 0;
    }

    @Override // com.ironsource.T8
    public void a(long j10, String str) {
        ck.p.j(str, "identifier");
        this.f30189c.put(str, Long.valueOf(j10));
        this.f30187a.b(str, j10);
    }
}
