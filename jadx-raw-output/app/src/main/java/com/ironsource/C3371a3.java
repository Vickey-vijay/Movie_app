package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3371a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0 f28079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0 f28080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F2 f28081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mj.g f28082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mj.g f28083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f28084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f28085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f28086h;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    public static final class a extends Lambda implements bk.a<C3785xb> {
        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3785xb invoke() {
            final C3371a3 c3371a3 = C3371a3.this;
            return new C3785xb(new Runnable() { // from class: com.ironsource.xj
                @Override // java.lang.Runnable
                public final void run() {
                    C3371a3.a.a(c3371a3);
                }
            }, com.ironsource.lifecycle.b.d(), new Vf());
        }

        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3371a3 c3371a3) {
            ck.p.j(c3371a3, "this$0");
            c3371a3.f28081c.c();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a3$b */
    public static final class b extends Lambda implements bk.a<C3785xb> {
        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3785xb invoke() {
            final C3371a3 c3371a3 = C3371a3.this;
            return new C3785xb(new Runnable() { // from class: com.ironsource.yj
                @Override // java.lang.Runnable
                public final void run() {
                    C3371a3.b.a(c3371a3);
                }
            }, com.ironsource.lifecycle.b.d(), new Vf());
        }

        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3371a3 c3371a3) {
            ck.p.j(c3371a3, "this$0");
            c3371a3.f28081c.d();
        }
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public C3371a3(O0 o10, I0 i10, F2 f10) {
        ck.p.j(o10, "loadingData");
        ck.p.j(i10, "interactionData");
        ck.p.j(f10, "mListener");
        this.f28079a = o10;
        this.f28080b = i10;
        this.f28081c = f10;
        this.f28082d = kotlin.b.a(new a());
        this.f28083e = kotlin.b.a(new b());
        this.f28084f = o10.b() > 0;
        this.f28085g = i10.b() > 0;
        this.f28086h = o10.a() == O0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final C3785xb c() {
        return (C3785xb) this.f28082d.getValue();
    }

    private final C3785xb d() {
        return (C3785xb) this.f28083e.getValue();
    }

    private final void f() {
        if (this.f28086h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f28086h) {
            d().b();
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f28080b.b());
    }

    public final void h() {
        if (!this.f28084f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.f28079a.b());
        }
    }

    private final void b(long j10) {
        if (this.f28086h && this.f28085g) {
            d().a(j10);
        }
    }

    private final void a(long j10) {
        if (this.f28086h && this.f28084f) {
            c().a(j10);
        }
    }
}
