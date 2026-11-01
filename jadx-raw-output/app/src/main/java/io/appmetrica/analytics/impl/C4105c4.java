package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4105c4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile C4105c4 f56435w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4513s6 f56436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E7 f56437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f56438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1 f56439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4407o f56440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Xk f56441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f56442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4357m f56443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C4406nn f56444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C4620wd f56445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4482r0 f56446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Z3 f56447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Tc f56448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile We f56449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C4120cj f56450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C4682z0 f56451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L1 f56452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C4137da f56453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile C4075b0 f56454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile N9 f56455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile H7 f56456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile C4131d4 f56457v;

    public C4105c4(C4513s6 c4513s6, C4407o c4407o, S3 s10) {
        this(c4513s6, c4407o, s10, new C4357m(c4407o));
    }

    public final C4407o a() {
        return this.f56440e;
    }

    public final We b(Context context) {
        We we2 = this.f56449n;
        if (we2 == null) {
            synchronized (this) {
                we2 = this.f56449n;
                if (we2 == null) {
                    we2 = new We(c(context).a(context));
                    this.f56449n = we2;
                }
            }
        }
        return we2;
    }

    public final C4482r0 c() {
        return this.f56446k;
    }

    public C4105c4(C4513s6 c4513s6, C4407o c4407o, S3 s10, C4357m c4357m) {
        this(c4513s6, new E7(), s10, c4357m, new G1(), c4407o, new Xk(c4407o, c4357m), new F5(c4407o), new C4406nn(), new C4482r0());
    }

    public static C4105c4 l() {
        if (f56435w == null) {
            synchronized (C4105c4.class) {
                if (f56435w == null) {
                    f56435w = new C4105c4(new C4513s6(), new C4407o(), new S3());
                }
            }
        }
        return f56435w;
    }

    public final synchronized C4620wd a(Context context) {
        if (this.f56445j == null) {
            this.f56445j = new C4620wd(context, new no());
        }
        return this.f56445j;
    }

    public final C4131d4 c(Context context) {
        File file;
        C4131d4 c4131d4 = this.f56457v;
        if (c4131d4 == null) {
            synchronized (this) {
                c4131d4 = this.f56457v;
                if (c4131d4 == null) {
                    String systemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String systemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (lk.a0.n0(systemProperty)) {
                        systemProperty = systemProperty2;
                    }
                    if (!lk.a0.n0(systemProperty)) {
                        file = new File(systemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                            file = null;
                        }
                        c4131d4 = new C4131d4(file);
                        this.f56457v = c4131d4;
                    }
                    file = null;
                    c4131d4 = new C4131d4(file);
                    this.f56457v = c4131d4;
                }
            }
        }
        return c4131d4;
    }

    public final C4682z0 d() {
        return this.f56451p;
    }

    public final G1 e() {
        return this.f56439d;
    }

    public final L1 f() {
        return this.f56452q;
    }

    public final S3 g() {
        return this.f56438c;
    }

    public final F5 h() {
        return this.f56442g;
    }

    public final C4513s6 i() {
        return this.f56436a;
    }

    public final E7 j() {
        return this.f56437b;
    }

    public final C4137da k() {
        return this.f56453r;
    }

    public final Z3 m() {
        Z3 z10 = this.f56447l;
        if (z10 == null) {
            synchronized (this) {
                z10 = this.f56447l;
                if (z10 == null) {
                    z10 = new Z3();
                    this.f56447l = z10;
                }
            }
        }
        return z10;
    }

    public final C4513s6 n() {
        return this.f56436a;
    }

    public final Xk o() {
        return this.f56441f;
    }

    public C4105c4(C4513s6 c4513s6, E7 e10, S3 s10, C4357m c4357m, G1 g10, C4407o c4407o, Xk xk2, F5 f10, C4406nn c4406nn, C4482r0 c4482r0) {
        this.f56448m = new Tc();
        this.f56451p = new C4682z0();
        this.f56452q = new L1();
        this.f56453r = new C4137da();
        new D7();
        this.f56456u = new H7();
        this.f56436a = c4513s6;
        this.f56437b = e10;
        this.f56438c = s10;
        this.f56443h = c4357m;
        this.f56439d = g10;
        this.f56440e = c4407o;
        this.f56441f = xk2;
        this.f56442g = f10;
        this.f56444i = c4406nn;
        this.f56446k = c4482r0;
    }

    public final C4075b0 b() {
        C4075b0 c4075b0 = this.f56454s;
        if (c4075b0 == null) {
            synchronized (this) {
                c4075b0 = this.f56454s;
                if (c4075b0 == null) {
                    c4075b0 = new C4075b0(this.f56451p, this.f56441f, this.f56438c);
                    this.f56454s = c4075b0;
                }
            }
        }
        return c4075b0;
    }
}
