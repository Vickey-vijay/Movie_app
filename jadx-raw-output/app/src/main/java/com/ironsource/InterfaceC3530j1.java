package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3530j1 {

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0273a f29183a = new C0273a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        public static final class C0273a {
            public /* synthetic */ C0273a(ck.i iVar) {
                this();
            }

            public final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar) {
                ck.p.j(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                ck.p.j(kVar, "errorReason");
                return new b(403, nj.s.q(jVar, kVar));
            }

            private C0273a() {
            }

            public final InterfaceC3530j1 a() {
                return new b(406, new ArrayList());
            }

            public final InterfaceC3530j1 b(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(404, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 c(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(409, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 d(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(401, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 e(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(408, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 f(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(405, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(407, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 a(boolean z10) {
                if (z10) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        public static final InterfaceC3530j1 a() {
            return f29183a.a();
        }

        /* JADX INFO: renamed from: com.ironsource.j1$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29184a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f29185b = 401;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29186c = 403;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f29187d = 404;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f29188e = 405;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f29189f = 406;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f29190g = 407;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f29191h = 408;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f29192i = 409;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f29193j = 410;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f29194k = 411;

            private b() {
            }
        }

        public static final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.a(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 b(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.b(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 c(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.c(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 d(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.d(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 e(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.e(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 f(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29183a.f(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 a(boolean z10) {
            return f29183a.a(z10);
        }

        public static final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar) {
            return f29183a.a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$b */
    public static final class b implements InterfaceC3530j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<InterfaceC3604n1> f29196b;

        public b(int i10, List<InterfaceC3604n1> list) {
            ck.p.j(list, "arrayList");
            this.f29195a = i10;
            this.f29196b = list;
        }

        @Override // com.ironsource.InterfaceC3530j1
        public void a(InterfaceC3657q1 interfaceC3657q1) {
            ck.p.j(interfaceC3657q1, "analytics");
            interfaceC3657q1.a(this.f29195a, this.f29196b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29197a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$c$a */
        public static final class a {
            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final InterfaceC3530j1 a() {
                return new b(201, new ArrayList());
            }

            private a() {
            }

            public final InterfaceC3530j1 a(C3584m1.l lVar) {
                ck.p.j(lVar, IronSourceConstants.EVENTS_EXT1);
                return new b(207, nj.s.q(lVar));
            }

            public final InterfaceC3530j1 b() {
                return new b(206, new ArrayList());
            }

            public final InterfaceC3530j1 a(InterfaceC3604n1 interfaceC3604n1) {
                ck.p.j(interfaceC3604n1, "duration");
                return new b(202, nj.s.q(interfaceC3604n1));
            }

            public final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar, C3584m1.f fVar) {
                ck.p.j(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                ck.p.j(kVar, "errorReason");
                ck.p.j(fVar, "duration");
                return new b(203, nj.s.q(jVar, kVar, fVar));
            }

            public final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(204, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }
        }

        public static final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29197a.a(interfaceC3604n1Arr);
        }

        /* JADX INFO: renamed from: com.ironsource.j1$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29198a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f29199b = 201;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29200c = 202;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f29201d = 203;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f29202e = 204;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f29203f = 205;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f29204g = 206;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f29205h = 207;

            private b() {
            }
        }

        public static final InterfaceC3530j1 a() {
            return f29197a.a();
        }

        public static final InterfaceC3530j1 b() {
            return f29197a.b();
        }

        public static final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar, C3584m1.f fVar) {
            return f29197a.a(jVar, kVar, fVar);
        }

        public static final InterfaceC3530j1 a(InterfaceC3604n1 interfaceC3604n1) {
            return f29197a.a(interfaceC3604n1);
        }

        public static final InterfaceC3530j1 a(C3584m1.l lVar) {
            return f29197a.a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29206a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$d$a */
        public static final class a {
            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final InterfaceC3530j1 a() {
                return new b(101, new ArrayList());
            }

            public final InterfaceC3530j1 b(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(110, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            private a() {
            }

            public final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
                ck.p.j(interfaceC3604n1Arr, "entity");
                return new b(102, nj.s.q(Arrays.copyOf(interfaceC3604n1Arr, interfaceC3604n1Arr.length)));
            }

            public final InterfaceC3530j1 b() {
                return new b(112, new ArrayList());
            }

            public final b c() {
                return new b(105, new ArrayList());
            }

            public final InterfaceC3530j1 a(C3584m1.f fVar) {
                ck.p.j(fVar, "duration");
                return new b(103, nj.s.q(fVar));
            }

            public final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar, C3584m1.f fVar, C3584m1.l lVar) {
                ck.p.j(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                ck.p.j(kVar, "errorReason");
                ck.p.j(fVar, "duration");
                ck.p.j(lVar, "loaderState");
                return new b(104, nj.s.q(jVar, kVar, fVar, lVar));
            }

            public final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar) {
                ck.p.j(jVar, IronSourceConstants.EVENTS_ERROR_CODE);
                ck.p.j(kVar, "errorReason");
                return new b(109, nj.s.q(jVar, kVar));
            }

            public final InterfaceC3530j1 a(InterfaceC3604n1 interfaceC3604n1) {
                ck.p.j(interfaceC3604n1, IronSourceConstants.EVENTS_EXT1);
                return new b(111, nj.s.q(interfaceC3604n1));
            }
        }

        public static final InterfaceC3530j1 a() {
            return f29206a.a();
        }

        public static final InterfaceC3530j1 b() {
            return f29206a.b();
        }

        /* JADX INFO: renamed from: com.ironsource.j1$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29207a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f29208b = 101;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f29209c = 102;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f29210d = 103;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f29211e = 104;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f29212f = 105;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f29213g = 109;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f29214h = 110;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f29215i = 111;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f29216j = 112;

            private b() {
            }
        }

        public static final InterfaceC3530j1 a(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29206a.a(interfaceC3604n1Arr);
        }

        public static final InterfaceC3530j1 b(InterfaceC3604n1... interfaceC3604n1Arr) {
            return f29206a.b(interfaceC3604n1Arr);
        }

        public static final b c() {
            return f29206a.c();
        }

        public static final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar) {
            return f29206a.a(jVar, kVar);
        }

        public static final InterfaceC3530j1 a(C3584m1.j jVar, C3584m1.k kVar, C3584m1.f fVar, C3584m1.l lVar) {
            return f29206a.a(jVar, kVar, fVar, lVar);
        }

        public static final InterfaceC3530j1 a(InterfaceC3604n1 interfaceC3604n1) {
            return f29206a.a(interfaceC3604n1);
        }

        public static final InterfaceC3530j1 a(C3584m1.f fVar) {
            return f29206a.a(fVar);
        }
    }

    void a(InterfaceC3657q1 interfaceC3657q1);
}
