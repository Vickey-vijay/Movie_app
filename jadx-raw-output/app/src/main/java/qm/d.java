package qm;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletException;
import kj.h;
import kj.p;
import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.authentication.SessionAuthentication;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.security.Constraint;
import pm.g;
import pm.l;
import rm.n;
import rm.v;
import xm.o;
import xm.q;

/* JADX INFO: compiled from: FormAuthenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public class d extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zm.c f66618j = zm.b.a(d.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f66620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f66624i;

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class a extends l implements rm.d.g {
        @Override // pm.l
        public String toString() {
            return "Form" + super.toString();
        }

        public a(String str, v vVar) {
            super(str, vVar);
        }
    }

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class b extends lj.b {
        @Override // lj.b, lj.a
        public String m(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return null;
            }
            return super.m(str);
        }

        @Override // lj.b, lj.a
        public Enumeration o(String str) {
            return str.toLowerCase(Locale.ENGLISH).startsWith("if-") ? Collections.enumeration(Collections.EMPTY_LIST) : super.o(str);
        }

        @Override // lj.b, lj.a
        public long u(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return -1L;
            }
            return super.u(str);
        }

        public b(lj.a aVar) {
            super(aVar);
        }

        @Override // lj.b, lj.a
        public Enumeration k() {
            return Collections.enumeration(Collections.list(super.k()));
        }
    }

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class c extends lj.d {
        public final boolean s(String str) {
            return ("Cache-Control".equalsIgnoreCase(str) || "Pragma".equalsIgnoreCase(str) || Command.HTTP_HEADER_ETAG.equalsIgnoreCase(str) || "Expires".equalsIgnoreCase(str) || "Last-Modified".equalsIgnoreCase(str) || "Age".equalsIgnoreCase(str)) ? false : true;
        }

        public c(lj.c cVar) {
            super(cVar);
        }

        @Override // lj.d, lj.c
        public void c(String str, String str2) {
            if (s(str)) {
                super.c(str, str2);
            }
        }

        @Override // lj.d, lj.c
        public void d(String str, long j10) {
            if (s(str)) {
                super.d(str, j10);
            }
        }

        @Override // lj.d, lj.c
        public void j(String str, String str2) {
            if (s(str)) {
                super.j(str, str2);
            }
        }
    }

    @Override // pm.a
    public boolean a(p pVar, t tVar, boolean z10, rm.d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // pm.a
    public rm.d b(p pVar, t tVar, boolean z10) throws ServerAuthException {
        g gVar;
        String strF;
        lj.a aVar = (lj.a) pVar;
        lj.c cVar = (lj.c) tVar;
        String strV = aVar.v();
        if (strV == null) {
            strV = "/";
        }
        if (!z10 && !g(strV)) {
            return new qm.c(this);
        }
        if (h(q.a(aVar.t(), aVar.l())) && !qm.c.d(cVar)) {
            return new qm.c(this);
        }
        lj.e eVarP = aVar.p(true);
        try {
            if (g(strV)) {
                String parameter = aVar.getParameter("j_username");
                v vVarE = e(parameter, aVar.getParameter("j_password"), aVar);
                lj.e eVarP2 = aVar.p(true);
                if (vVarE != null) {
                    synchronized (eVarP2) {
                        strF = (String) eVarP2.getAttribute("org.eclipse.jetty.security.form_URI");
                        if (strF == null || strF.length() == 0) {
                            strF = aVar.f();
                            if (strF.length() == 0) {
                                strF = "/";
                            }
                        }
                    }
                    cVar.p(0);
                    cVar.g(cVar.n(strF));
                    return new a(getAuthMethod(), vVarE);
                }
                zm.c cVar2 = f66618j;
                if (cVar2.f()) {
                    cVar2.i("Form authentication FAILED for " + o.e(parameter), new Object[0]);
                }
                String str = this.f66619d;
                if (str == null) {
                    if (cVar != null) {
                        cVar.o(403);
                    }
                } else if (this.f66623h) {
                    h hVarD = aVar.d(str);
                    cVar.j("Cache-Control", "No-cache");
                    cVar.d("Expires", 1L);
                    hVarD.a(new b(aVar), new c(cVar));
                } else {
                    cVar.g(cVar.n(q.a(aVar.f(), this.f66619d)));
                }
                return rm.d.K8;
            }
            rm.d dVar = (rm.d) eVarP.getAttribute(SessionAuthentication.__J_AUTHENTICATED);
            if (dVar != null) {
                if (!(dVar instanceof rm.d.h) || (gVar = this.f66625a) == null || gVar.b(((rm.d.h) dVar).getUserIdentity())) {
                    String str2 = (String) eVarP.getAttribute("org.eclipse.jetty.security.form_URI");
                    if (str2 != null) {
                        MultiMap<String> multiMap = (MultiMap) eVarP.getAttribute("org.eclipse.jetty.security.form_POST");
                        if (multiMap != null) {
                            StringBuffer stringBufferR = aVar.r();
                            if (aVar.i() != null) {
                                stringBufferR.append("?");
                                stringBufferR.append(aVar.i());
                            }
                            if (str2.equals(stringBufferR.toString())) {
                                eVarP.removeAttribute("org.eclipse.jetty.security.form_POST");
                                n nVarW = pVar instanceof n ? (n) pVar : rm.b.o().w();
                                nVarW.n0("POST");
                                nVarW.o0(multiMap);
                            }
                        } else {
                            eVarP.removeAttribute("org.eclipse.jetty.security.form_URI");
                        }
                    }
                    return dVar;
                }
                eVarP.removeAttribute(SessionAuthentication.__J_AUTHENTICATED);
            }
            if (qm.c.d(cVar)) {
                f66618j.i("auth deferred {}", eVarP.getId());
                return rm.d.H8;
            }
            synchronized (eVarP) {
                if (eVarP.getAttribute("org.eclipse.jetty.security.form_URI") == null || this.f66624i) {
                    StringBuffer stringBufferR2 = aVar.r();
                    if (aVar.i() != null) {
                        stringBufferR2.append("?");
                        stringBufferR2.append(aVar.i());
                    }
                    eVarP.a("org.eclipse.jetty.security.form_URI", stringBufferR2.toString());
                    if (ShareTarget.ENCODING_TYPE_URL_ENCODED.equalsIgnoreCase(pVar.getContentType()) && "POST".equals(aVar.getMethod())) {
                        n nVarW2 = pVar instanceof n ? (n) pVar : rm.b.o().w();
                        nVarW2.x();
                        eVarP.a("org.eclipse.jetty.security.form_POST", new MultiMap((MultiMap) nVarW2.I()));
                    }
                }
            }
            if (this.f66623h) {
                h hVarD2 = aVar.d(this.f66621f);
                cVar.j("Cache-Control", "No-cache");
                cVar.d("Expires", 1L);
                hVarD2.a(new b(aVar), new c(cVar));
            } else {
                cVar.g(cVar.n(q.a(aVar.f(), this.f66621f)));
            }
            return rm.d.J8;
        } catch (IOException e10) {
            throw new ServerAuthException(e10);
        } catch (ServletException e11) {
            throw new ServerAuthException(e11);
        }
    }

    @Override // pm.a
    public String getAuthMethod() {
        return Constraint.__FORM_AUTH;
    }

    public boolean g(String str) {
        int iIndexOf = str.indexOf("/j_security_check");
        if (iIndexOf < 0) {
            return false;
        }
        int i10 = iIndexOf + 17;
        if (i10 == str.length()) {
            return true;
        }
        char cCharAt = str.charAt(i10);
        return cCharAt == ';' || cCharAt == '#' || cCharAt == '/' || cCharAt == '?';
    }

    public boolean h(String str) {
        return str != null && (str.equals(this.f66620e) || str.equals(this.f66622g));
    }

    public final void i(String str) {
        if (str == null || str.trim().length() == 0) {
            this.f66620e = null;
            this.f66619d = null;
            return;
        }
        if (!str.startsWith("/")) {
            f66618j.g("form-error-page must start with /", new Object[0]);
            str = "/" + str;
        }
        this.f66619d = str;
        this.f66620e = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f66620e;
            this.f66620e = str2.substring(0, str2.indexOf(63));
        }
    }

    public final void j(String str) {
        if (!str.startsWith("/")) {
            f66618j.g("form-login-page must start with /", new Object[0]);
            str = "/" + str;
        }
        this.f66621f = str;
        this.f66622g = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f66622g;
            this.f66622g = str2.substring(0, str2.indexOf(63));
        }
    }

    @Override // qm.e, pm.a
    public void c(pm.a.InterfaceC0617a interfaceC0617a) {
        boolean zBooleanValue;
        super.c(interfaceC0617a);
        String initParameter = interfaceC0617a.getInitParameter("org.eclipse.jetty.security.form_login_page");
        if (initParameter != null) {
            j(initParameter);
        }
        String initParameter2 = interfaceC0617a.getInitParameter("org.eclipse.jetty.security.form_error_page");
        if (initParameter2 != null) {
            i(initParameter2);
        }
        String initParameter3 = interfaceC0617a.getInitParameter("org.eclipse.jetty.security.dispatch");
        if (initParameter3 == null) {
            zBooleanValue = this.f66623h;
        } else {
            zBooleanValue = Boolean.valueOf(initParameter3).booleanValue();
        }
        this.f66623h = zBooleanValue;
    }

    @Override // qm.e
    public v e(String str, Object obj, p pVar) {
        v vVarE = super.e(str, obj, pVar);
        if (vVarE != null) {
            ((lj.a) pVar).p(true).a(SessionAuthentication.__J_AUTHENTICATED, new SessionAuthentication(getAuthMethod(), vVarE, obj));
        }
        return vVarE;
    }
}
