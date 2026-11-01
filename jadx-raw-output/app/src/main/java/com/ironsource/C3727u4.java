package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3727u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31398d;

    public C3727u4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.f31395a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3727u4)) {
            return false;
        }
        C3727u4 c3727u4 = (C3727u4) obj;
        return ck.p.e(this.f31395a, c3727u4.f31395a) && ck.p.e(this.f31396b, c3727u4.f31396b) && ck.p.e(this.f31397c, c3727u4.f31397c) && ck.p.e(this.f31398d, c3727u4.f31398d);
    }

    public C3727u4(String str, String str2, String str3, String str4) {
        ck.p.j(str, "customNetworkAdapterName");
        ck.p.j(str2, "customRewardedVideoAdapterName");
        ck.p.j(str3, "customInterstitialAdapterName");
        ck.p.j(str4, "customBannerAdapterName");
        this.f31395a = str;
        this.f31396b = str2;
        this.f31397c = str3;
        this.f31398d = str4;
    }

    public final C3727u4 a(String str, String str2, String str3, String str4) {
        ck.p.j(str, "customNetworkAdapterName");
        ck.p.j(str2, "customRewardedVideoAdapterName");
        ck.p.j(str3, "customInterstitialAdapterName");
        ck.p.j(str4, "customBannerAdapterName");
        return new C3727u4(str, str2, str3, str4);
    }

    public final String b() {
        return this.f31396b;
    }

    public final String c() {
        return this.f31397c;
    }

    public final String d() {
        return this.f31398d;
    }

    public final String e() {
        return this.f31398d;
    }

    public final String f() {
        return this.f31397c;
    }

    public final String g() {
        return this.f31395a;
    }

    public final String h() {
        return this.f31396b;
    }

    public int hashCode() {
        return (((((this.f31395a.hashCode() * 31) + this.f31396b.hashCode()) * 31) + this.f31397c.hashCode()) * 31) + this.f31398d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f31395a + ", customRewardedVideoAdapterName=" + this.f31396b + ", customInterstitialAdapterName=" + this.f31397c + ", customBannerAdapterName=" + this.f31398d + ")";
    }

    public static /* synthetic */ C3727u4 a(C3727u4 c3727u4, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3727u4.f31395a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3727u4.f31396b;
        }
        if ((i10 & 4) != 0) {
            str3 = c3727u4.f31397c;
        }
        if ((i10 & 8) != 0) {
            str4 = c3727u4.f31398d;
        }
        return c3727u4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C3727u4(String str, String str2, String str3, String str4, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
