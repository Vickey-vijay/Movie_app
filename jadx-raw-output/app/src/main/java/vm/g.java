package vm;

import java.io.IOException;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.Cookie;
import rm.i;
import rm.n;
import rm.p;
import rm.t;
import tm.h;

/* JADX INFO: compiled from: SessionHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final zm.c f73239u = zm.b.b("org.eclipse.jetty.server.session");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumSet<SessionTrackingMode> f73240v = EnumSet.of(SessionTrackingMode.COOKIE, SessionTrackingMode.URL);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f73241t;

    public g() {
        this(new e());
    }

    @Override // tm.h
    public void D0(String str, n nVar, lj.a aVar, lj.c cVar) throws Throwable {
        t tVarS;
        lj.e eVarP;
        lj.e eVarP2;
        lj.e eVar = null;
        try {
            tVarS = nVar.S();
            try {
                eVarP = nVar.p(false);
                try {
                    t tVar = this.f73241t;
                    if (tVarS != tVar) {
                        nVar.D0(tVar);
                        nVar.C0(null);
                        H0(nVar, aVar);
                    }
                    if (this.f73241t != null) {
                        eVarP2 = nVar.p(false);
                        if (eVarP2 == null) {
                            eVarP2 = nVar.a0(this.f73241t);
                            if (eVarP2 != null) {
                                nVar.C0(eVarP2);
                            }
                        } else if (eVarP2 != eVarP) {
                            try {
                                lm.g gVarC = this.f73241t.C(eVarP2, aVar.c());
                                if (gVarC != null) {
                                    nVar.M().q(gVarC);
                                }
                                eVar = eVarP2;
                            } catch (Throwable th2) {
                                th = th2;
                                eVar = eVarP2;
                                if (eVar != null) {
                                    this.f73241t.g(eVar);
                                }
                                lj.e eVarP3 = nVar.p(false);
                                if (eVarP3 != null && eVarP == null && eVarP3 != eVar) {
                                    this.f73241t.g(eVarP3);
                                }
                                if (tVarS != null && tVarS != this.f73241t) {
                                    nVar.D0(tVarS);
                                    nVar.C0(eVarP);
                                }
                                throw th;
                            }
                        }
                        lj.e eVar2 = eVarP2;
                        eVarP2 = null;
                        eVar = eVar2;
                    } else {
                        eVarP2 = null;
                    }
                    zm.c cVar2 = f73239u;
                    if (cVar2.f()) {
                        cVar2.i("sessionManager=" + this.f73241t, new Object[0]);
                        cVar2.i("session=" + eVar, new Object[0]);
                    }
                    h hVar = this.f72465r;
                    if (hVar != null) {
                        hVar.D0(str, nVar, aVar, cVar);
                    } else {
                        h hVar2 = this.f72464q;
                        if (hVar2 != null) {
                            hVar2.C0(str, nVar, aVar, cVar);
                        } else {
                            C0(str, nVar, aVar, cVar);
                        }
                    }
                    if (eVarP2 != null) {
                        this.f73241t.g(eVarP2);
                    }
                    lj.e eVarP4 = nVar.p(false);
                    if (eVarP4 != null && eVarP == null && eVarP4 != eVarP2) {
                        this.f73241t.g(eVarP4);
                    }
                    if (tVarS == null || tVarS == this.f73241t) {
                        return;
                    }
                    nVar.D0(tVarS);
                    nVar.C0(eVarP);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                eVarP = null;
            }
        } catch (Throwable th5) {
            th = th5;
            tVarS = null;
            eVarP = null;
        }
    }

    public g(t tVar) {
        J0(tVar);
    }

    public t I0() {
        return this.f73241t;
    }

    @Override // tm.h, tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        this.f73241t.start();
        super.d0();
    }

    @Override // tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        this.f73241t.stop();
        super.e0();
    }

    @Override // tm.h
    public void C0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        if (E0()) {
            F0(str, nVar, aVar, cVar);
            return;
        }
        h hVar = this.f72465r;
        if (hVar != null && hVar == this.f72462p) {
            hVar.C0(str, nVar, aVar, cVar);
            return;
        }
        i iVar = this.f72462p;
        if (iVar != null) {
            iVar.v(str, nVar, aVar, cVar);
        }
    }

    public void H0(n nVar, lj.a aVar) {
        boolean z10;
        int iIndexOf;
        char cCharAt;
        Cookie[] cookieArrJ;
        String strN = aVar.n();
        t tVarI0 = I0();
        if (strN != null && tVarI0 != null) {
            lj.e eVarM = tVarI0.m(strN);
            if (eVarM != null && tVarI0.w(eVarM)) {
                nVar.C0(eVarM);
                return;
            }
            return;
        }
        if (!DispatcherType.REQUEST.equals(nVar.F())) {
            return;
        }
        lj.e eVarM2 = null;
        boolean z11 = true;
        if (this.f73241t.Q() && (cookieArrJ = aVar.j()) != null && cookieArrJ.length > 0) {
            String name = tVarI0.B().getName();
            z10 = false;
            for (int i10 = 0; i10 < cookieArrJ.length; i10++) {
                if (name.equalsIgnoreCase(cookieArrJ[i10].getName())) {
                    strN = cookieArrJ[i10].getValue();
                    zm.c cVar = f73239u;
                    cVar.i("Got Session ID {} from cookie", strN);
                    if (strN != null) {
                        eVarM2 = tVarI0.m(strN);
                        if (eVarM2 != null && tVarI0.w(eVarM2)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        cVar.g("null session id from cookie", new Object[0]);
                    }
                    z10 = true;
                }
            }
        } else {
            z10 = false;
        }
        if (strN == null || eVarM2 == null) {
            String strV = aVar.v();
            String strX = tVarI0.X();
            if (strX != null && (iIndexOf = strV.indexOf(strX)) >= 0) {
                int length = iIndexOf + strX.length();
                int i11 = length;
                while (i11 < strV.length() && (cCharAt = strV.charAt(i11)) != ';' && cCharAt != '#' && cCharAt != '?' && cCharAt != '/') {
                    i11++;
                }
                strN = strV.substring(length, i11);
                eVarM2 = tVarI0.m(strN);
                zm.c cVar2 = f73239u;
                if (cVar2.f()) {
                    cVar2.i("Got Session ID {} from URL", strN);
                }
                z10 = false;
            }
        }
        nVar.w0(strN);
        if (strN == null || !z10) {
            z11 = false;
        }
        nVar.x0(z11);
        if (eVarM2 != null && tVarI0.w(eVarM2)) {
            nVar.C0(eVarM2);
        }
    }

    public void J0(t tVar) {
        if (!isStarted()) {
            t tVar2 = this.f73241t;
            if (b() != null) {
                b().E0().update((Object) this, (Object) tVar2, (Object) tVar, "sessionManager", true);
            }
            if (tVar != null) {
                tVar.A(this);
            }
            this.f73241t = tVar;
            if (tVar2 != null) {
                tVar2.A(null);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // tm.g, tm.a, rm.i
    public void f(p pVar) {
        p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            pVarB.E0().update((Object) this, (Object) this.f73241t, (Object) null, "sessionManager", true);
        }
        super.f(pVar);
        if (pVar != null && pVar != pVarB) {
            pVar.E0().update((Object) this, (Object) null, (Object) this.f73241t, "sessionManager", true);
        }
    }
}
