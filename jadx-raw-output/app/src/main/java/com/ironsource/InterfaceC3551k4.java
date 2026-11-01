package com.ironsource;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3551k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f29322a = c.f29329a;

    /* JADX INFO: renamed from: com.ironsource.k4$a */
    public static final class a implements InterfaceC3551k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3375a7 f29323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uf f29324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f29325d;

        /* JADX INFO: renamed from: com.ironsource.k4$a$a, reason: collision with other inner class name */
        public static final class C0274a implements Uf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f29326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f29327b;

            public C0274a(d dVar, a aVar) {
                this.f29326a = dVar;
                this.f29327b = aVar;
            }

            @Override // com.ironsource.Uf.a
            public void a() {
                this.f29326a.a(new InterfaceC3447e7.a(new InterfaceC3393b7.a(this.f29327b.f29323b.b())));
                this.f29327b.f29325d.set(false);
            }
        }

        public a(InterfaceC3375a7 interfaceC3375a7, Uf uf2) {
            ck.p.j(interfaceC3375a7, "config");
            ck.p.j(uf2, "timer");
            this.f29323b = interfaceC3375a7;
            this.f29324c = uf2;
            this.f29325d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC3551k4
        public synchronized void a(d dVar) {
            ck.p.j(dVar, "callback");
            if (this.f29325d.compareAndSet(false, true)) {
                this.f29324c.a(new C0274a(dVar, this));
            }
        }

        @Override // com.ironsource.InterfaceC3551k4
        public synchronized void a() {
            this.f29324c.cancel();
            this.f29325d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$b */
    public static final class b implements InterfaceC3551k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f29328b = new b();

        @Override // com.ironsource.InterfaceC3551k4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC3551k4
        public void a(d dVar) {
            ck.p.j(dVar, "callback");
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$d */
    public interface d {
        void a(InterfaceC3447e7 interfaceC3447e7);
    }

    void a();

    void a(d dVar);

    /* JADX INFO: renamed from: com.ironsource.k4$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f29329a = new c();

        public final InterfaceC3551k4 a(C3411c7 c3411c7) {
            ck.p.j(c3411c7, "featureFlag");
            if (!c3411c7.b()) {
                return b.f29328b;
            }
            Z6 z10 = new Z6(c3411c7);
            Uf.b bVar = new Uf.b();
            bVar.b(z10.a());
            bVar.a(z10.a());
            return new a(z10, new Uf.d().a(bVar));
        }

        private c() {
        }

        public final InterfaceC3551k4 a() {
            return b.f29328b;
        }
    }

    static InterfaceC3551k4 a(C3411c7 c3411c7) {
        return f29322a.a(c3411c7);
    }
}
