package com.ironsource;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3515i3 implements InterfaceC3646p7 {

    /* JADX INFO: renamed from: com.ironsource.i3$a */
    public static final class a extends AbstractC3515i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f29118a;

        public final a a(b bVar) {
            ck.p.j(bVar, "firstReason");
            return new a(bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && ck.p.e(this.f29118a, ((a) obj).f29118a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(null);
            ck.p.j(bVar, "firstReason");
            this.f29118a = bVar;
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f29118a;
            }
            return aVar.a(bVar);
        }

        public final b d() {
            return this.f29118a;
        }

        public final b e() {
            return this.f29118a;
        }

        public int hashCode() {
            return this.f29118a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f29118a + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$b */
    public static abstract class b implements InterfaceC3646p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29119a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$b, reason: collision with other inner class name */
        public static final class C0269b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0269b f29120a = new C0269b();

            private C0269b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f29121a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(ck.i iVar) {
            this();
        }

        private b() {
        }

        @Override // com.ironsource.InterfaceC3646p7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0269b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$c */
    public static final class c extends AbstractC3515i3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f29123b;

        public final c a(long j10, d dVar) {
            ck.p.j(dVar, "recurringReason");
            return new c(j10, dVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29122a == cVar.f29122a && ck.p.e(this.f29123b, cVar.f29123b);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, d dVar) {
            super(null);
            ck.p.j(dVar, "recurringReason");
            this.f29122a = j10;
            this.f29123b = dVar;
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f29122a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f29123b;
            }
            return cVar.a(j10, dVar);
        }

        public final long d() {
            return this.f29122a;
        }

        public final d e() {
            return this.f29123b;
        }

        public final d f() {
            return this.f29123b;
        }

        public final long g() {
            return this.f29122a;
        }

        public int hashCode() {
            return (Long.hashCode(this.f29122a) * 31) + this.f29123b.hashCode();
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f29122a + ", recurringReason=" + this.f29123b + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i3$d */
    public static abstract class d implements InterfaceC3646p7 {

        /* JADX INFO: renamed from: com.ironsource.i3$d$a */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29124a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$b */
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29125a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$c */
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f29126a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$d, reason: collision with other inner class name */
        public static final class C0270d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0270d f29127a = new C0270d();

            private C0270d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$e */
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f29128a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$f */
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f29129a;

            public f(long j10) {
                super(null);
                this.f29129a = j10;
            }

            public final f a(long j10) {
                return new f(j10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f29129a == ((f) obj).f29129a;
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f29129a;
                }
                return fVar.a(j10);
            }

            public final long c() {
                return this.f29129a;
            }

            public final long d() {
                return this.f29129a;
            }

            public int hashCode() {
                return Long.hashCode(this.f29129a);
            }

            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f29129a + ")";
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$g */
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f29130a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.i3$d$h */
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f29131a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(ck.i iVar) {
            this();
        }

        private d() {
        }

        @Override // com.ironsource.InterfaceC3646p7
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0270d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }
    }

    public /* synthetic */ AbstractC3515i3(ck.i iVar) {
        this();
    }

    private AbstractC3515i3() {
    }

    @Override // com.ironsource.InterfaceC3646p7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }
}
