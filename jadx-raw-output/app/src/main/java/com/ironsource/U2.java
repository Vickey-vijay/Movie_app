package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class U2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f27722p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H1 f27723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<C3497h3> f27727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3497h3 f27728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3641p2 f27731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f27737o;

    public U2() {
        this.f27723a = new H1();
        this.f27727e = new ArrayList<>();
    }

    public int a() {
        return this.f27724b;
    }

    public void a(C3497h3 c3497h3) {
        if (c3497h3 != null) {
            this.f27727e.add(c3497h3);
            if (this.f27728f == null) {
                this.f27728f = c3497h3;
            } else if (c3497h3.a(0)) {
                this.f27728f = c3497h3;
            }
        }
    }

    public long b() {
        return this.f27725c;
    }

    public boolean c() {
        return this.f27726d;
    }

    public C3641p2 d() {
        return this.f27731i;
    }

    public long e() {
        return this.f27733k;
    }

    public int f() {
        return this.f27730h;
    }

    public H1 g() {
        return this.f27723a;
    }

    public int h() {
        return this.f27729g;
    }

    public C3497h3 i() {
        for (C3497h3 c3497h3 : this.f27727e) {
            if (c3497h3.d()) {
                return c3497h3;
            }
        }
        C3497h3 c3497h4 = this.f27728f;
        return c3497h4 != null ? c3497h4 : new C3626o5();
    }

    public long j() {
        return this.f27737o;
    }

    public boolean k() {
        return this.f27732j;
    }

    public boolean l() {
        return this.f27734l;
    }

    public boolean m() {
        return this.f27736n;
    }

    public boolean n() {
        return this.f27735m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f27724b + ", bidderExclusive=" + this.f27726d + '}';
    }

    public U2(int i10, long j10, boolean z10, H1 h10, int i11, C3641p2 c3641p2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f27727e = new ArrayList<>();
        this.f27724b = i10;
        this.f27725c = j10;
        this.f27726d = z10;
        this.f27723a = h10;
        this.f27729g = i11;
        this.f27730h = i12;
        this.f27731i = c3641p2;
        this.f27732j = z11;
        this.f27733k = j11;
        this.f27734l = z12;
        this.f27735m = z13;
        this.f27736n = z14;
        this.f27737o = j12;
    }

    public C3497h3 a(String str) {
        for (C3497h3 c3497h3 : this.f27727e) {
            if (c3497h3.c().equals(str)) {
                return c3497h3;
            }
        }
        return null;
    }
}
