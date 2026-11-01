package com.ironsource.mediationsdk;

import com.ironsource.C3450ea;
import com.ironsource.C3478g2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f29816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<C3478g2> f29817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f29821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f29822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f29824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3450ea f29825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ISBannerSize f29827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f29833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Double f29834s;

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void m() {
    }

    public final IronSource.a a() {
        return this.f29816a;
    }

    public final void b(boolean z10) {
        this.f29820e = z10;
    }

    public final IronSource.a c() {
        return this.f29816a;
    }

    public final void d(String str) {
        ck.p.j(str, "<set-?>");
        this.f29826k = str;
    }

    public final h e() {
        return this.f29824i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f29816a == ((i) obj).f29816a;
    }

    public int hashCode() {
        return this.f29816a.hashCode();
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f29816a + ")";
    }

    public i(IronSource.a aVar) {
        ck.p.j(aVar, "adUnit");
        this.f29816a = aVar;
        this.f29817b = new ArrayList<>();
        this.f29819d = "";
        this.f29821f = new HashMap();
        this.f29822g = new ArrayList();
        this.f29823h = -1;
        this.f29826k = "";
    }

    public final i a(IronSource.a aVar) {
        ck.p.j(aVar, "adUnit");
        return new i(aVar);
    }

    public final void b(String str) {
        this.f29831p = str;
    }

    public final void c(boolean z10) {
        this.f29818c = z10;
    }

    public final void d(boolean z10) {
        this.f29829n = z10;
    }

    public final void e(boolean z10) {
        this.f29830o = z10;
    }

    public final ISBannerSize f() {
        return this.f29827l;
    }

    public final Double g() {
        return this.f29834s;
    }

    public final Map<String, Object> h() {
        return this.f29821f;
    }

    public final String j() {
        return this.f29819d;
    }

    public final ArrayList<C3478g2> k() {
        return this.f29817b;
    }

    public final List<String> l() {
        return this.f29822g;
    }

    public final C3450ea n() {
        return this.f29825j;
    }

    public final int o() {
        return this.f29823h;
    }

    public final boolean p() {
        return this.f29829n;
    }

    public final boolean q() {
        return this.f29830o;
    }

    public final String r() {
        return this.f29826k;
    }

    public final boolean s() {
        return this.f29828m;
    }

    public final boolean t() {
        return this.f29820e;
    }

    public final Boolean u() {
        return this.f29833r;
    }

    public final boolean v() {
        return this.f29818c;
    }

    public static /* synthetic */ i a(i iVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f29816a;
        }
        return iVar.a(aVar);
    }

    public final String b() {
        return this.f29832q;
    }

    public final void c(String str) {
        ck.p.j(str, "<set-?>");
        this.f29819d = str;
    }

    public final String d() {
        return this.f29831p;
    }

    public final void a(C3478g2 c3478g2) {
        ck.p.j(c3478g2, "instanceInfo");
        this.f29817b.add(c3478g2);
    }

    public final void a(Map<String, Object> map) {
        ck.p.j(map, "<set-?>");
        this.f29821f = map;
    }

    public final void a(List<String> list) {
        ck.p.j(list, "<set-?>");
        this.f29822g = list;
    }

    public final void a(int i10) {
        this.f29823h = i10;
    }

    public final void a(h hVar) {
        this.f29824i = hVar;
    }

    public final void a(C3450ea c3450ea) {
        this.f29825j = c3450ea;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.f29827l = iSBannerSize;
    }

    public final void a(boolean z10) {
        this.f29828m = z10;
    }

    public final void a(String str) {
        this.f29832q = str;
    }

    public final void a(Boolean bool) {
        this.f29833r = bool;
    }

    public final void a(Double d10) {
        this.f29834s = d10;
    }
}
