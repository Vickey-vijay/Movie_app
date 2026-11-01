package qm;

import java.io.IOException;
import java.io.PrintWriter;
import kj.n;
import kj.p;
import org.eclipse.jetty.security.ServerAuthException;
import xm.j;

/* JADX INFO: compiled from: DeferredAuthentication.java */
/* JADX INFO: loaded from: classes7.dex */
public class c implements rm.d.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zm.c f66613d = zm.b.a(c.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lj.c f66614e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static n f66615f = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f66616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f66617c;

    /* JADX INFO: compiled from: DeferredAuthentication.java */
    public static class b extends n {
        @Override // kj.n
        public void b(String str) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    /* JADX INFO: compiled from: DeferredAuthentication.java */
    public static class a implements lj.c {
        @Override // kj.t
        public boolean a() {
            return true;
        }

        @Override // kj.t
        public void b() {
        }

        @Override // lj.c
        public void c(String str, String str2) {
        }

        @Override // lj.c
        public void d(String str, long j10) {
        }

        @Override // kj.t
        public String f() {
            return null;
        }

        @Override // lj.c
        public void g(String str) throws IOException {
        }

        @Override // lj.c
        public boolean i(String str) {
            return false;
        }

        @Override // lj.c
        public void j(String str, String str2) {
        }

        @Override // lj.c
        public void k(int i10) {
        }

        @Override // kj.t
        public void l(String str) {
        }

        @Override // lj.c
        public void m(int i10, String str) throws IOException {
        }

        @Override // lj.c
        public String n(String str) {
            return null;
        }

        @Override // lj.c
        public void o(int i10) throws IOException {
        }

        @Override // kj.t
        public void p(int i10) {
        }

        @Override // kj.t
        public n e() throws IOException {
            return c.f66615f;
        }

        @Override // kj.t
        public PrintWriter h() throws IOException {
            return j.g();
        }
    }

    public static boolean d(lj.c cVar) {
        return cVar == f66614e;
    }

    @Override // rm.d.f
    public rm.d b(p pVar) {
        try {
            rm.d dVarB = this.f66616b.b(pVar, f66614e, true);
            if (dVarB != null && (dVarB instanceof rm.d.h) && !(dVarB instanceof rm.d.g)) {
                pm.f fVarE = this.f66616b.d().e();
                if (fVarE != null) {
                    this.f66617c = fVarE.c(((rm.d.h) dVarB).getUserIdentity());
                }
                return dVarB;
            }
        } catch (ServerAuthException e10) {
            f66613d.a(e10);
        }
        return this;
    }

    public Object c() {
        return this.f66617c;
    }

    public c(e eVar) {
        if (eVar != null) {
            this.f66616b = eVar;
            return;
        }
        throw new NullPointerException("No Authenticator");
    }
}
