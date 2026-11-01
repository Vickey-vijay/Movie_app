package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public interface Uf {

    public interface a {
        void a();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f27761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f27762b;

        public final long a() {
            return this.f27762b;
        }

        public final long b() {
            return this.f27761a;
        }

        public final void a(long j10) {
            this.f27762b = j10;
        }

        public final void b(long j10) {
            this.f27761a = j10;
        }
    }

    public interface c {
        Uf a(b bVar);
    }

    public static final class d implements c {
        @Override // com.ironsource.Uf.c
        public Uf a(b bVar) {
            ck.p.j(bVar, "timerConfig");
            return new e(new Wf(bVar.b()));
        }
    }

    public static final class e implements Uf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Wf f27763a;

        public static final class a implements Wf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f27764a;

            public a(a aVar) {
                this.f27764a = aVar;
            }

            @Override // com.ironsource.Wf.a
            public void a() {
                this.f27764a.a();
            }
        }

        public e(Wf wf2) {
            ck.p.j(wf2, "timer");
            this.f27763a = wf2;
        }

        @Override // com.ironsource.Uf
        public void a(a aVar) {
            ck.p.j(aVar, "callback");
            this.f27763a.a((Wf.a) new a(aVar));
        }

        @Override // com.ironsource.Uf
        public void cancel() {
            this.f27763a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
