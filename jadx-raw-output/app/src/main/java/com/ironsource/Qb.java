package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class Qb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f27499m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27500n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f27502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<C3398bc> f27506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3398bc f27507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3641p2 f27509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f27510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27512l;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public final void a(H1 h10) {
        ck.p.j(h10, "<set-?>");
        this.f27502b = h10;
    }

    public final int b() {
        return this.f27503c;
    }

    public final long c() {
        return this.f27504d;
    }

    public Qb(int i10, long j10, boolean z10, H1 h10, C3641p2 c3641p2, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        ck.p.j(h10, "events");
        ck.p.j(c3641p2, "auctionSettings");
        this.f27501a = z13;
        this.f27506f = new ArrayList<>();
        this.f27503c = i10;
        this.f27504d = j10;
        this.f27505e = z10;
        this.f27502b = h10;
        this.f27508h = i11;
        this.f27509i = c3641p2;
        this.f27510j = j11;
        this.f27511k = z11;
        this.f27512l = z12;
    }

    public final void a(int i10) {
        this.f27503c = i10;
    }

    public final void b(int i10) {
        this.f27508h = i10;
    }

    public final void c(boolean z10) {
        this.f27512l = z10;
    }

    public final C3641p2 d() {
        return this.f27509i;
    }

    public final C3398bc e() {
        for (C3398bc c3398bc : this.f27506f) {
            if (c3398bc.d()) {
                return c3398bc;
            }
        }
        return this.f27507g;
    }

    public final int f() {
        return this.f27508h;
    }

    public final H1 g() {
        return this.f27502b;
    }

    public final long h() {
        return this.f27510j;
    }

    public final boolean i() {
        return this.f27511k;
    }

    public final boolean j() {
        return this.f27501a;
    }

    public final boolean k() {
        return this.f27512l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f27503c + ", bidderExclusive=" + this.f27505e + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public final void a(long j10) {
        this.f27504d = j10;
    }

    public final void b(long j10) {
        this.f27510j = j10;
    }

    public final boolean a() {
        return this.f27505e;
    }

    public final void b(boolean z10) {
        this.f27511k = z10;
    }

    public final void a(boolean z10) {
        this.f27505e = z10;
    }

    public final void a(C3641p2 c3641p2) {
        ck.p.j(c3641p2, "<set-?>");
        this.f27509i = c3641p2;
    }

    public final void a(C3398bc c3398bc) {
        if (c3398bc != null) {
            this.f27506f.add(c3398bc);
            if (this.f27507g == null) {
                this.f27507g = c3398bc;
            } else if (c3398bc.b() == 0) {
                this.f27507g = c3398bc;
            }
        }
    }

    public final C3398bc a(String str) {
        ck.p.j(str, "placementName");
        for (C3398bc c3398bc : this.f27506f) {
            if (ck.p.e(c3398bc.c(), str)) {
                return c3398bc;
            }
        }
        return null;
    }
}
