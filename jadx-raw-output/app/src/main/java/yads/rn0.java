package yads;

import android.content.Context;
import android.os.Looper;
import yads.kb0;
import yads.rn0;
import yads.xv;
import yads.zd0;

/* JADX INFO: loaded from: classes5.dex */
public final class rn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f53 f82324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y43 f82325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y43 f82326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y43 f82327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y43 f82328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y43 f82329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wy0 f82330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f82331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pk f82332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f82333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f82334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ww2 f82335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yd0 f82336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f82337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f82338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f82339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f82340r;

    public rn0(final Context context) {
        this(context, new y43() { // from class: cp.j9
            @Override // yads.y43
            public final Object get() {
                return rn0.a(context);
            }
        }, new y43() { // from class: cp.k9
            @Override // yads.y43
            public final Object get() {
                return rn0.b(context);
            }
        });
    }

    public static /* synthetic */ sf1 a(sf1 sf1Var) {
        return sf1Var;
    }

    public static /* synthetic */ pe0 b(pe0 pe0Var) {
        return pe0Var;
    }

    public final void a(final zd0 zd0Var) {
        if (!(!this.f82340r)) {
            throw new IllegalStateException();
        }
        this.f82328f = new y43() { // from class: cp.m9
            @Override // yads.y43
            public final Object get() {
                return rn0.a(zd0Var);
            }
        };
    }

    public final rn0 c(final pe0 pe0Var) {
        if (!(!this.f82340r)) {
            throw new IllegalStateException();
        }
        this.f82325c = new y43() { // from class: cp.l9
            @Override // yads.y43
            public final Object get() {
                return rn0.b(pe0Var);
            }
        };
        return this;
    }

    public rn0(final Context context, y43 y43Var, y43 y43Var2) {
        this(context, y43Var, y43Var2, new y43() { // from class: cp.n9
            @Override // yads.y43
            public final Object get() {
                return rn0.c(context);
            }
        }, new y43() { // from class: cp.o9
            @Override // yads.y43
            public final Object get() {
                return new zd0();
            }
        }, new y43() { // from class: cp.p9
            @Override // yads.y43
            public final Object get() {
                return rn0.d(context);
            }
        }, new wy0() { // from class: cp.q9
            @Override // yads.wy0
            public final Object apply(Object obj) {
                return new kb0((xv) obj);
            }
        });
    }

    public static xm1 b(Context context) {
        return new ge0(new oc0(context, new pd0()), new od0());
    }

    public static im d(Context context) {
        dc0 dc0Var;
        synchronized (dc0.class) {
            if (dc0.f76617t == null) {
                dc0.f76617t = new dc0(context == null ? null : context.getApplicationContext(), cc0.a(ib3.b(context)), 2000, xv.f84701a, true);
            }
            dc0Var = dc0.f76617t;
        }
        return dc0Var;
    }

    public rn0(Context context, y43 y43Var, y43 y43Var2, y43 y43Var3, y43 y43Var4, y43 y43Var5, wy0 wy0Var) {
        this.f82323a = context;
        this.f82325c = y43Var;
        this.f82326d = y43Var2;
        this.f82327e = y43Var3;
        this.f82328f = y43Var4;
        this.f82329g = y43Var5;
        this.f82330h = wy0Var;
        this.f82331i = ib3.c();
        this.f82332j = pk.f81431h;
        this.f82333k = 1;
        this.f82334l = true;
        this.f82335m = ww2.f84368c;
        this.f82336n = new xd0().a();
        this.f82324b = xv.f84701a;
        this.f82337o = 500L;
        this.f82338p = 2000L;
        this.f82339q = true;
    }

    public static /* synthetic */ pe0 a(Context context) {
        return new pe0(context);
    }

    public static s73 c(Context context) {
        return new if0(context, af0.a(context), new dc(0));
    }
}
