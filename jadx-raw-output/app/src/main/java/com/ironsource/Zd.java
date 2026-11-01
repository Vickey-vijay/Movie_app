package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class Zd {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f28031o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<C3489gd> f28032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f28033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3489gd f28043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C3641p2 f28044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28045n;

    public Zd() {
        this.f28032a = new ArrayList<>();
        this.f28033b = new H1();
    }

    public void a(C3489gd c3489gd) {
        if (c3489gd != null) {
            this.f28032a.add(c3489gd);
            if (this.f28043l == null) {
                this.f28043l = c3489gd;
            } else if (c3489gd.a(0)) {
                this.f28043l = c3489gd;
            }
        }
    }

    public int b() {
        return this.f28038g;
    }

    public int c() {
        return this.f28037f;
    }

    public boolean d() {
        return this.f28045n;
    }

    public ArrayList<C3489gd> e() {
        return this.f28032a;
    }

    public boolean f() {
        return this.f28040i;
    }

    public int g() {
        return this.f28034c;
    }

    public int h() {
        return this.f28036e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f28036e);
    }

    public boolean j() {
        return this.f28035d;
    }

    public C3641p2 k() {
        return this.f28044m;
    }

    public long l() {
        return this.f28039h;
    }

    public H1 m() {
        return this.f28033b;
    }

    public boolean n() {
        return this.f28042k;
    }

    public boolean o() {
        return this.f28041j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f28034c + ", bidderExclusive=" + this.f28035d + '}';
    }

    public Zd(int i10, boolean z10, int i11, int i12, H1 h10, C3641p2 c3641p2, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f28032a = new ArrayList<>();
        this.f28034c = i10;
        this.f28035d = z10;
        this.f28036e = i11;
        this.f28033b = h10;
        this.f28037f = i12;
        this.f28044m = c3641p2;
        this.f28038g = i13;
        this.f28045n = z11;
        this.f28039h = j10;
        this.f28040i = z12;
        this.f28041j = z13;
        this.f28042k = z14;
    }

    public C3489gd a(String str) {
        for (C3489gd c3489gd : this.f28032a) {
            if (c3489gd.c().equals(str)) {
                return c3489gd;
            }
        }
        return null;
    }

    public C3489gd a() {
        for (C3489gd c3489gd : this.f28032a) {
            if (c3489gd.d()) {
                return c3489gd;
            }
        }
        return this.f28043l;
    }
}
