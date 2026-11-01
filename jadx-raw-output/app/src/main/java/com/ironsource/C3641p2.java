package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3641p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f30399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f30400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f30401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f30403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f30406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f30407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f30408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f30409t;

    public C3641p2() {
        this.f30391b = "";
        this.f30392c = "";
        this.f30393d = "";
        this.f30398i = 0L;
        this.f30399j = 0L;
        this.f30400k = 0L;
        this.f30401l = 0L;
        this.f30402m = true;
        this.f30403n = new ArrayList<>();
        this.f30396g = 0;
        this.f30404o = false;
        this.f30405p = false;
        this.f30406q = 1;
    }

    public String a() {
        return this.f30391b;
    }

    public String a(boolean z10) {
        return z10 ? this.f30393d : this.f30392c;
    }

    public long b() {
        return this.f30399j;
    }

    public int c() {
        return this.f30395f;
    }

    public int d() {
        return this.f30406q;
    }

    public boolean e() {
        return this.f30402m;
    }

    public ArrayList<String> f() {
        return this.f30403n;
    }

    public int g() {
        return this.f30394e;
    }

    public boolean h() {
        return this.f30390a;
    }

    public int i() {
        return this.f30396g;
    }

    public long j() {
        return this.f30400k;
    }

    public long k() {
        return this.f30398i;
    }

    public long l() {
        return this.f30401l;
    }

    public long m() {
        return this.f30397h;
    }

    public boolean n() {
        return this.f30409t;
    }

    public boolean o() {
        return this.f30404o;
    }

    public boolean p() {
        return this.f30405p;
    }

    public boolean q() {
        return this.f30408s;
    }

    public boolean r() {
        return this.f30407r;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30403n.add(str);
    }

    public C3641p2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f30391b = str;
        this.f30392c = str2;
        this.f30393d = str3;
        this.f30394e = i10;
        this.f30395f = i11;
        this.f30397h = j10;
        this.f30390a = z13;
        this.f30398i = j11;
        this.f30399j = j12;
        this.f30400k = j13;
        this.f30401l = j14;
        this.f30402m = z10;
        this.f30396g = i12;
        this.f30403n = new ArrayList<>();
        this.f30404o = z11;
        this.f30405p = z12;
        this.f30406q = i13;
        this.f30407r = z14;
        this.f30408s = z15;
        this.f30409t = z16;
    }
}
