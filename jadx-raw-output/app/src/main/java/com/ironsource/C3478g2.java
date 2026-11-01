package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3478g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f28976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f28977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f28978g;

    public final String a() {
        return this.f28972a;
    }

    public final boolean b() {
        return this.f28973b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3478g2)) {
            return false;
        }
        C3478g2 c3478g2 = (C3478g2) obj;
        return ck.p.e(this.f28972a, c3478g2.f28972a) && this.f28973b == c3478g2.f28973b;
    }

    public C3478g2(String str, boolean z10) {
        ck.p.j(str, "name");
        this.f28972a = str;
        this.f28973b = z10;
        this.f28975d = "";
        this.f28976e = kotlin.collections.a.j();
        this.f28978g = new HashMap();
    }

    public final C3478g2 a(String str, boolean z10) {
        ck.p.j(str, "name");
        return new C3478g2(str, z10);
    }

    public final void b(Map<String, ? extends Object> map) {
        ck.p.j(map, "<set-?>");
        this.f28976e = map;
    }

    public final Map<String, Object> c() {
        return this.f28978g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f28977f;
    }

    public final boolean e() {
        return this.f28973b;
    }

    public final Map<String, Object> f() {
        return this.f28976e;
    }

    public final String g() {
        return this.f28972a;
    }

    public final String h() {
        return this.f28975d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f28972a.hashCode() * 31;
        boolean z10 = this.f28973b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean i() {
        return this.f28974c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f28972a + ", bidder=" + this.f28973b + ")";
    }

    public static /* synthetic */ C3478g2 a(C3478g2 c3478g2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3478g2.f28972a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3478g2.f28973b;
        }
        return c3478g2.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f28974c = z10;
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f28975d = str;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f28977f = hVar;
    }

    public final void a(Map<String, Object> map) {
        ck.p.j(map, "<set-?>");
        this.f28978g = map;
    }
}
