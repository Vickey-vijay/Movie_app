package u7;

/* JADX INFO: compiled from: DownloadMgrInitialParams.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f72751a;

    /* JADX INFO: compiled from: DownloadMgrInitialParams.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w7.c.InterfaceC0776c f72752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f72753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public w7.c.e f72754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w7.c.b f72755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public w7.c.a f72756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public w7.c.d f72757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f72758g;

        public String toString() {
            return w7.f.o("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.f72752a, this.f72753b, this.f72754c, this.f72755d, this.f72756e);
        }
    }

    public c() {
        this.f72751a = null;
    }

    public w7.c.a a() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return d();
        }
        w7.c.a aVar2 = aVar.f72756e;
        if (aVar2 == null) {
            return d();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize connection count adapter: %s", aVar2);
        }
        return aVar2;
    }

    public w7.c.b b() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return e();
        }
        w7.c.b bVar = aVar.f72755d;
        if (bVar == null) {
            return e();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize connection creator: %s", bVar);
        }
        return bVar;
    }

    public o7.a c() {
        w7.c.InterfaceC0776c interfaceC0776c;
        a aVar = this.f72751a;
        if (aVar == null || (interfaceC0776c = aVar.f72752a) == null) {
            return f();
        }
        o7.a aVarA = interfaceC0776c.a();
        if (aVarA == null) {
            return f();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize database: %s", aVarA);
        }
        return aVarA;
    }

    public final w7.c.a d() {
        return new n7.a();
    }

    public final w7.c.b e() {
        return new n7.c.b();
    }

    public final o7.a f() {
        return new o7.c();
    }

    public final i g() {
        return new i.b().b(true).a();
    }

    public final w7.c.d h() {
        return new b();
    }

    public final w7.c.e i() {
        return new v7.b.a();
    }

    public i j() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return g();
        }
        i iVar = aVar.f72758g;
        if (iVar == null) {
            return g();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize foreground service config: %s", iVar);
        }
        return iVar;
    }

    public w7.c.d k() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return h();
        }
        w7.c.d dVar = aVar.f72757f;
        if (dVar == null) {
            return h();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize id generator: %s", dVar);
        }
        return dVar;
    }

    public w7.c.e l() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return i();
        }
        w7.c.e eVar = aVar.f72754c;
        if (eVar == null) {
            return i();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize output stream: %s", eVar);
        }
        return eVar;
    }

    public int n() {
        a aVar = this.f72751a;
        if (aVar == null) {
            return m();
        }
        Integer num = aVar.f72753b;
        if (num == null) {
            return m();
        }
        if (w7.d.f73535a) {
            w7.d.a(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
        }
        return w7.e.b(num.intValue());
    }

    public c(a aVar) {
        this.f72751a = aVar;
    }

    public final int m() {
        return w7.e.a().f73540e;
    }
}
