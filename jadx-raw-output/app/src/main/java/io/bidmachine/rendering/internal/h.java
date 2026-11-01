package io.bidmachine.rendering.internal;

import kotlin.jvm.internal.Lambda;
import nk.h0;
import nk.w0;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f60408i = new e(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f60409j = new h(a.f60418a, b.f60419a, c.f60420a, d.f60421a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bk.a f60410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bk.a f60411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bk.a f60412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bk.a f60413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mj.g f60414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mj.g f60415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mj.g f60416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mj.g f60417h;

    public static final class a extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f60418a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.c();
        }
    }

    public static final class b extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f60419a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.c().n();
        }
    }

    public static final class c extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f60420a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.b();
        }
    }

    public static final class d extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f60421a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return w0.a();
        }
    }

    public static final class f extends Lambda implements bk.a {
        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f60413d.invoke();
        }
    }

    public static final class g extends Lambda implements bk.a {
        public g() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f60412c.invoke();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.h$h, reason: collision with other inner class name */
    public static final class C0532h extends Lambda implements bk.a {
        public C0532h() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f60410a.invoke();
        }
    }

    public static final class i extends Lambda implements bk.a {
        public i() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return (h0) h.this.f60411b.invoke();
        }
    }

    public h(bk.a aVar, bk.a aVar2, bk.a aVar3, bk.a aVar4) {
        ck.p.j(aVar, "mainProvider");
        ck.p.j(aVar2, "mainImmediateProvider");
        ck.p.j(aVar3, "ioProvider");
        ck.p.j(aVar4, "defaultProvider");
        this.f60410a = aVar;
        this.f60411b = aVar2;
        this.f60412c = aVar3;
        this.f60413d = aVar4;
        this.f60414e = kotlin.b.a(new C0532h());
        this.f60415f = kotlin.b.a(new i());
        this.f60416g = kotlin.b.a(new g());
        this.f60417h = kotlin.b.a(new f());
    }

    public static final h f() {
        return f60408i.a();
    }

    public final h0 e() {
        return (h0) this.f60415f.getValue();
    }

    public static final class e {
        private e() {
        }

        public final h a() {
            return h.f60409j;
        }

        public /* synthetic */ e(ck.i iVar) {
            this();
        }
    }

    public final h0 b() {
        return (h0) this.f60417h.getValue();
    }

    public final h0 c() {
        return (h0) this.f60416g.getValue();
    }

    public final h0 d() {
        return (h0) this.f60414e.getValue();
    }
}
