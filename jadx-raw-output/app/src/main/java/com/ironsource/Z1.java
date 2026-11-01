package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f27961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f27962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f27963g;

    public final String a() {
        return this.f27957a;
    }

    public final boolean b() {
        return this.f27958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z10 = (Z1) obj;
        return ck.p.e(this.f27957a, z10.f27957a) && this.f27958b == z10.f27958b;
    }

    public Z1(String str, boolean z10) {
        ck.p.j(str, "name");
        this.f27957a = str;
        this.f27958b = z10;
        this.f27960d = "";
        this.f27961e = kotlin.collections.a.j();
        this.f27963g = new HashMap();
    }

    public final Z1 a(String str, boolean z10) {
        ck.p.j(str, "name");
        return new Z1(str, z10);
    }

    public final void b(Map<String, ? extends Object> map) {
        ck.p.j(map, "<set-?>");
        this.f27961e = map;
    }

    public final Map<String, Object> c() {
        return this.f27963g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f27962f;
    }

    public final boolean e() {
        return this.f27958b;
    }

    public final Map<String, Object> f() {
        return this.f27961e;
    }

    public final String g() {
        return this.f27957a;
    }

    public final String h() {
        return this.f27960d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f27957a.hashCode() * 31;
        boolean z10 = this.f27958b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean i() {
        return this.f27959c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f27957a + ", bidder=" + this.f27958b + ")";
    }

    public static /* synthetic */ Z1 a(Z1 z10, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = z10.f27957a;
        }
        if ((i10 & 2) != 0) {
            z11 = z10.f27958b;
        }
        return z10.a(str, z11);
    }

    public final void a(boolean z10) {
        this.f27959c = z10;
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f27960d = str;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f27962f = hVar;
    }

    public final void a(Map<String, Object> map) {
        ck.p.j(map, "<set-?>");
        this.f27963g = map;
    }
}
