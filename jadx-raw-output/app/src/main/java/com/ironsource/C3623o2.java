package com.ironsource;

import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3623o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f30336b;

    public final C3623o2 a(String str) {
        ck.p.j(str, C3605n2.f30213s);
        return new C3623o2(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3623o2) && ck.p.e(this.f30335a, ((C3623o2) obj).f30335a);
    }

    public C3623o2(String str) {
        ck.p.j(str, C3605n2.f30213s);
        this.f30335a = str;
        this.f30336b = com.ironsource.mediationsdk.d.b();
    }

    public static /* synthetic */ C3623o2 a(C3623o2 c3623o2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3623o2.f30335a;
        }
        return c3623o2.a(str);
    }

    private final String c() {
        return this.f30335a;
    }

    public final Map<String, String> b() {
        Map<String, String> mapB = this.f30336b.b(this.f30335a);
        ck.p.i(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    public final String d() {
        String strC = this.f30336b.c(this.f30335a);
        ck.p.i(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public int hashCode() {
        return this.f30335a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.f30335a + ")";
    }

    public final String a() {
        String strA = this.f30336b.a(this.f30335a);
        ck.p.i(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}
