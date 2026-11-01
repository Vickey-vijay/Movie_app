package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3792y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31616a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3792y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f31616a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3792y1) && ck.p.e(this.f31616a, ((C3792y1) obj).f31616a);
    }

    public C3792y1(String str) {
        ck.p.j(str, Ne.E1);
        this.f31616a = str;
    }

    public final C3792y1 a(String str) {
        ck.p.j(str, Ne.E1);
        return new C3792y1(str);
    }

    public final String b() {
        return this.f31616a;
    }

    public int hashCode() {
        return this.f31616a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f31616a + ")";
    }

    public /* synthetic */ C3792y1(String str, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C3792y1 a(C3792y1 c3792y1, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3792y1.f31616a;
        }
        return c3792y1.a(str);
    }
}
