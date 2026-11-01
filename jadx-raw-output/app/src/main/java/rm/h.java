package rm;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.MultiMap;

/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements kj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm.c f66878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f66881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f66882e = null;

    /* JADX INFO: compiled from: Dispatcher.java */
    public class a implements xm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xm.b f66883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f66884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f66885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f66886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f66887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f66888g;

        @Override // xm.b
        public void removeAttribute(String str) {
            a(str, null);
        }

        public a(xm.b bVar) {
            this.f66883b = bVar;
        }

        @Override // xm.b
        public void a(String str, Object obj) {
            if (h.this.f66882e != null || !str.startsWith("javax.servlet.")) {
                if (obj == null) {
                    this.f66883b.removeAttribute(str);
                    return;
                } else {
                    this.f66883b.a(str, obj);
                    return;
                }
            }
            if (str.equals("javax.servlet.forward.path_info")) {
                this.f66887f = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.request_uri")) {
                this.f66884c = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.servlet_path")) {
                this.f66886e = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.context_path")) {
                this.f66885d = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.query_string")) {
                this.f66888g = (String) obj;
            } else if (obj == null) {
                this.f66883b.removeAttribute(str);
            } else {
                this.f66883b.a(str, obj);
            }
        }

        @Override // xm.b
        public Object getAttribute(String str) {
            if (h.this.f66882e == null) {
                if (str.equals("javax.servlet.forward.path_info")) {
                    return this.f66887f;
                }
                if (str.equals("javax.servlet.forward.request_uri")) {
                    return this.f66884c;
                }
                if (str.equals("javax.servlet.forward.servlet_path")) {
                    return this.f66886e;
                }
                if (str.equals("javax.servlet.forward.context_path")) {
                    return this.f66885d;
                }
                if (str.equals("javax.servlet.forward.query_string")) {
                    return this.f66888g;
                }
            }
            if (str.startsWith("javax.servlet.include.")) {
                return null;
            }
            return this.f66883b.getAttribute(str);
        }

        public String toString() {
            return "FORWARD+" + this.f66883b.toString();
        }

        @Override // xm.b
        public void y() {
            throw new IllegalStateException();
        }
    }

    @Override // kj.h
    public void a(kj.p pVar, kj.t tVar) throws ServletException, IOException {
        e(pVar, tVar, DispatcherType.FORWARD);
    }

    public void d(kj.p pVar, kj.t tVar) throws ServletException, IOException {
        e(pVar, tVar, DispatcherType.ERROR);
    }

    public void e(kj.p pVar, kj.t tVar, DispatcherType dispatcherType) throws ServletException, IOException {
        n nVarW = pVar instanceof n ? (n) pVar : b.o().w();
        o oVarM = nVarW.M();
        tVar.b();
        oVarM.t();
        if (!(pVar instanceof lj.a)) {
            pVar = new q(pVar);
        }
        if (!(tVar instanceof lj.c)) {
            tVar = new r(tVar);
        }
        boolean zX = nVarW.X();
        String strV = nVarW.v();
        String strF = nVarW.f();
        String strT = nVarW.t();
        String strL = nVarW.l();
        String strI = nVarW.i();
        xm.b bVarZ = nVarW.z();
        DispatcherType dispatcherTypeF = nVarW.F();
        MultiMap<String> multiMapI = nVarW.I();
        try {
            nVarW.m0(false);
            nVarW.l0(dispatcherType);
            String str = this.f66882e;
            if (str != null) {
                this.f66878a.v(str, nVarW, (lj.a) pVar, (lj.c) tVar);
            } else {
                String str2 = this.f66881d;
                if (str2 != null) {
                    if (multiMapI == null) {
                        nVarW.x();
                        multiMapI = nVarW.I();
                    }
                    nVarW.Z(str2);
                }
                a aVar = new a(bVarZ);
                if (bVarZ.getAttribute("javax.servlet.forward.request_uri") != null) {
                    aVar.f66887f = (String) bVarZ.getAttribute("javax.servlet.forward.path_info");
                    aVar.f66888g = (String) bVarZ.getAttribute("javax.servlet.forward.query_string");
                    aVar.f66884c = (String) bVarZ.getAttribute("javax.servlet.forward.request_uri");
                    aVar.f66885d = (String) bVarZ.getAttribute("javax.servlet.forward.context_path");
                    aVar.f66886e = (String) bVarZ.getAttribute("javax.servlet.forward.servlet_path");
                } else {
                    aVar.f66887f = strL;
                    aVar.f66888g = strI;
                    aVar.f66884c = strV;
                    aVar.f66885d = strF;
                    aVar.f66886e = strT;
                }
                nVarW.v0(this.f66879b);
                nVarW.k0(this.f66878a.U0());
                nVarW.B0(null);
                nVarW.p0(this.f66879b);
                nVarW.f0(aVar);
                this.f66878a.v(this.f66880c, nVarW, (lj.a) pVar, (lj.c) tVar);
                if (!nVarW.y().p()) {
                    c(tVar, nVarW);
                }
            }
        } finally {
            nVarW.m0(zX);
            nVarW.v0(strV);
            nVarW.k0(strF);
            nVarW.B0(strT);
            nVarW.p0(strL);
            nVarW.f0(bVarZ);
            nVarW.o0(multiMapI);
            nVarW.s0(strI);
            nVarW.l0(dispatcherTypeF);
        }
    }

    public h(tm.c cVar, String str, String str2, String str3) {
        this.f66878a = cVar;
        this.f66879b = str;
        this.f66880c = str2;
        this.f66881d = str3;
    }

    public final void c(kj.t tVar, n nVar) throws IOException {
        if (nVar.M().x()) {
            try {
                tVar.h().close();
            } catch (IllegalStateException unused) {
                tVar.e().close();
            }
        } else {
            try {
                tVar.e().close();
            } catch (IllegalStateException unused2) {
                tVar.h().close();
            }
        }
    }
}
