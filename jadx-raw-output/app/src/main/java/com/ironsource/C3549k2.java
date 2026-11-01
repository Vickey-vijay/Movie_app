package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3549k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f29318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3605n2 f29319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29321e;

    public final String a() {
        return this.f29317a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3549k2)) {
            return false;
        }
        C3549k2 c3549k2 = (C3549k2) obj;
        return ck.p.e(this.f29317a, c3549k2.f29317a) && ck.p.e(this.f29318b, c3549k2.f29318b) && ck.p.e(this.f29319c, c3549k2.f29319c) && this.f29320d == c3549k2.f29320d && ck.p.e(this.f29321e, c3549k2.f29321e);
    }

    public C3549k2(String str, JSONObject jSONObject, C3605n2 c3605n2, int i10, String str2) {
        ck.p.j(str, "auctionId");
        ck.p.j(str2, IronSourceConstants.AUCTION_FALLBACK);
        this.f29317a = str;
        this.f29318b = jSONObject;
        this.f29319c = c3605n2;
        this.f29320d = i10;
        this.f29321e = str2;
    }

    public final C3549k2 a(String str, JSONObject jSONObject, C3605n2 c3605n2, int i10, String str2) {
        ck.p.j(str, "auctionId");
        ck.p.j(str2, IronSourceConstants.AUCTION_FALLBACK);
        return new C3549k2(str, jSONObject, c3605n2, i10, str2);
    }

    public final JSONObject b() {
        return this.f29318b;
    }

    public final C3605n2 c() {
        return this.f29319c;
    }

    public final int d() {
        return this.f29320d;
    }

    public final String e() {
        return this.f29321e;
    }

    public final String f() {
        return this.f29321e;
    }

    public final String g() {
        return this.f29317a;
    }

    public final JSONObject h() {
        return this.f29318b;
    }

    public int hashCode() {
        int iHashCode = this.f29317a.hashCode() * 31;
        JSONObject jSONObject = this.f29318b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C3605n2 c3605n2 = this.f29319c;
        return ((((iHashCode2 + (c3605n2 != null ? c3605n2.hashCode() : 0)) * 31) + Integer.hashCode(this.f29320d)) * 31) + this.f29321e.hashCode();
    }

    public final int i() {
        return this.f29320d;
    }

    public final C3605n2 j() {
        return this.f29319c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f29317a + ", auctionResponseGenericParam=" + this.f29318b + ", genericNotifications=" + this.f29319c + ", auctionTrial=" + this.f29320d + ", auctionFallback=" + this.f29321e + ")";
    }

    public static /* synthetic */ C3549k2 a(C3549k2 c3549k2, String str, JSONObject jSONObject, C3605n2 c3605n2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3549k2.f29317a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c3549k2.f29318b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i11 & 4) != 0) {
            c3605n2 = c3549k2.f29319c;
        }
        C3605n2 c3605n3 = c3605n2;
        if ((i11 & 8) != 0) {
            i10 = c3549k2.f29320d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str2 = c3549k2.f29321e;
        }
        return c3549k2.a(str, jSONObject2, c3605n3, i12, str2);
    }
}
