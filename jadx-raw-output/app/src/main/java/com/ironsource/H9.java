package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class H9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f26716n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<M9> f26717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f26718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3641p2 f26723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f26728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private M9 f26729m;

    public H9() {
        this.f26717a = new ArrayList<>();
        this.f26718b = new H1();
        this.f26723g = new C3641p2();
    }

    public void a(M9 m10) {
        if (m10 != null) {
            this.f26717a.add(m10);
            if (this.f26729m == null) {
                this.f26729m = m10;
            } else if (m10.a(0)) {
                this.f26729m = m10;
            }
        }
    }

    public int b() {
        return this.f26722f;
    }

    public int c() {
        return this.f26719c;
    }

    public int d() {
        return this.f26721e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f26721e);
    }

    public boolean f() {
        return this.f26720d;
    }

    public C3641p2 g() {
        return this.f26723g;
    }

    public long h() {
        return this.f26725i;
    }

    public H1 i() {
        return this.f26718b;
    }

    public boolean j() {
        return this.f26724h;
    }

    public boolean k() {
        return this.f26726j;
    }

    public boolean l() {
        return this.f26728l;
    }

    public boolean m() {
        return this.f26727k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f26719c + ", bidderExclusive=" + this.f26720d + '}';
    }

    public H9(int i10, boolean z10, int i11, H1 h10, C3641p2 c3641p2, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f26717a = new ArrayList<>();
        this.f26719c = i10;
        this.f26720d = z10;
        this.f26721e = i11;
        this.f26718b = h10;
        this.f26723g = c3641p2;
        this.f26726j = z12;
        this.f26727k = z13;
        this.f26722f = i12;
        this.f26724h = z11;
        this.f26725i = j10;
        this.f26728l = z14;
    }

    public M9 a(String str) {
        for (M9 m10 : this.f26717a) {
            if (m10.c().equals(str)) {
                return m10;
            }
        }
        return null;
    }

    public M9 a() {
        for (M9 m10 : this.f26717a) {
            if (m10.d()) {
                return m10;
            }
        }
        return this.f26729m;
    }
}
