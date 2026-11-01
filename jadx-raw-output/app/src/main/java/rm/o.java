package rm;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes2.dex */
public class o implements lj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final zm.c f66930l = zm.b.a(o.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f66931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66932b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Locale f66934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f66935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mm.e.a f66936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f66937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f66940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PrintWriter f66941k;

    @Override // lj.c
    public void k(int i10) {
        C(i10, null);
    }

    @Override // lj.c
    public void o(int i10) throws IOException {
        if (i10 == -1) {
            this.f66931a.f().close();
        } else if (i10 != 102) {
            m(i10, null);
        } else {
            A();
        }
    }

    public void A() throws IOException {
        if (!this.f66931a.I() || a()) {
            return;
        }
        ((org.eclipse.jetty.http.b) this.f66931a.q()).G(102);
    }

    public void B(String str) {
        mm.e.a aVarD;
        if (this.f66931a.J() || this.f66940j != 0 || a()) {
            return;
        }
        this.f66938h = true;
        if (str == null) {
            if (this.f66937g != null) {
                this.f66937g = null;
                mm.e.a aVar = this.f66936f;
                if (aVar != null) {
                    this.f66939i = aVar.toString();
                } else {
                    String str2 = this.f66935e;
                    if (str2 != null) {
                        this.f66939i = str2;
                    } else {
                        this.f66939i = null;
                    }
                }
                if (this.f66939i == null) {
                    this.f66931a.C().J(lm.i.f63808z);
                    return;
                } else {
                    this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                    return;
                }
            }
            return;
        }
        this.f66937g = str;
        String str3 = this.f66939i;
        if (str3 != null) {
            int iIndexOf = str3.indexOf(59);
            if (iIndexOf < 0) {
                this.f66939i = null;
                mm.e.a aVar2 = this.f66936f;
                if (aVar2 != null && (aVarD = aVar2.d(this.f66937g)) != null) {
                    this.f66939i = aVarD.toString();
                    this.f66931a.C().D(lm.i.f63808z, aVarD);
                }
                if (this.f66939i == null) {
                    this.f66939i = this.f66935e + ";charset=" + xm.m.c(this.f66937g, ";= ");
                    this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                    return;
                }
                return;
            }
            int iIndexOf2 = this.f66939i.indexOf("charset=", iIndexOf);
            if (iIndexOf2 < 0) {
                this.f66939i += ";charset=" + xm.m.c(this.f66937g, ";= ");
            } else {
                int i10 = iIndexOf2 + 8;
                int iIndexOf3 = this.f66939i.indexOf(Z7.f27998r, i10);
                if (iIndexOf3 < 0) {
                    this.f66939i = this.f66939i.substring(0, i10) + xm.m.c(this.f66937g, ";= ");
                } else {
                    this.f66939i = this.f66939i.substring(0, i10) + xm.m.c(this.f66937g, ";= ") + this.f66939i.substring(iIndexOf3);
                }
            }
            this.f66931a.C().C(lm.i.f63808z, this.f66939i);
        }
    }

    public void C(int i10, String str) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f66931a.J()) {
            return;
        }
        this.f66932b = i10;
        this.f66933c = str;
    }

    @Override // kj.t
    public boolean a() {
        return this.f66931a.K();
    }

    @Override // lj.c
    public void c(String str, String str2) {
        if (this.f66931a.J()) {
            if (!str.startsWith("org.eclipse.jetty.server.include.")) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        if ("Content-Type".equalsIgnoreCase(str)) {
            l(str2);
            return;
        }
        this.f66931a.C().d(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f66931a.f66834m.C(Long.parseLong(str2));
        }
    }

    @Override // lj.c
    public void d(String str, long j10) {
        if (this.f66931a.J()) {
            return;
        }
        this.f66931a.C().E(str, j10);
    }

    @Override // kj.t
    public kj.n e() throws IOException {
        if (this.f66940j != 0 && this.f66940j != 1) {
            throw new IllegalStateException("WRITER");
        }
        kj.n nVarT = this.f66931a.t();
        this.f66940j = 1;
        return nVarT;
    }

    @Override // kj.t
    public String f() {
        if (this.f66937g == null) {
            this.f66937g = "ISO-8859-1";
        }
        return this.f66937g;
    }

    @Override // lj.c
    public void g(String str) throws IOException {
        String strB;
        if (this.f66931a.J()) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (!xm.q.h(str)) {
            StringBuilder sbN = this.f66931a.w().N();
            if (str.startsWith("/")) {
                strB = xm.q.b(str);
            } else {
                String strV = this.f66931a.w().v();
                if (!strV.endsWith("/")) {
                    strV = xm.q.i(strV);
                }
                strB = xm.q.b(xm.q.a(strV, str));
                if (!strB.startsWith("/")) {
                    sbN.append('/');
                }
            }
            if (strB == null) {
                throw new IllegalStateException("path cannot be above root");
            }
            sbN.append(strB);
            str = sbN.toString();
        }
        b();
        j("Location", str);
        k(302);
        r();
    }

    @Override // kj.t
    public PrintWriter h() throws IOException {
        if (this.f66940j != 0 && this.f66940j != 2) {
            throw new IllegalStateException("STREAM");
        }
        if (this.f66941k == null) {
            String strA = this.f66937g;
            if (strA == null) {
                mm.e.a aVar = this.f66936f;
                if (aVar != null) {
                    strA = lm.p.a(aVar);
                }
                if (strA == null) {
                    strA = "ISO-8859-1";
                }
                B(strA);
            }
            this.f66941k = this.f66931a.v(strA);
        }
        this.f66940j = 2;
        return this.f66941k;
    }

    @Override // lj.c
    public boolean i(String str) {
        return this.f66931a.C().i(str);
    }

    @Override // lj.c
    public void j(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            l(str2);
            return;
        }
        if (this.f66931a.J()) {
            if (!str.startsWith("org.eclipse.jetty.server.include.")) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        this.f66931a.C().B(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            if (str2 == null) {
                this.f66931a.f66834m.C(-1L);
            } else {
                this.f66931a.f66834m.C(Long.parseLong(str2));
            }
        }
    }

    @Override // lj.c
    public void m(int i10, String str) throws IOException {
        if (this.f66931a.J()) {
            return;
        }
        if (a()) {
            f66930l.g("Committed before " + i10 + Z7.f27998r + str, new Object[0]);
        }
        b();
        this.f66937g = null;
        j("Expires", null);
        j("Last-Modified", null);
        j("Cache-Control", null);
        j("Content-Type", null);
        j("Content-Length", null);
        this.f66940j = 0;
        C(i10, str);
        if (str == null) {
            str = HttpStatus.b(i10);
        }
        if (i10 != 204 && i10 != 304 && i10 != 206 && i10 >= 200) {
            n nVarW = this.f66931a.w();
            tm.c.d context = nVarW.getContext();
            tm.e eVarX0 = context != null ? context.b().X0() : null;
            if (eVarX0 == null) {
                eVarX0 = (tm.e) this.f66931a.n().b().t0(tm.e.class);
            }
            if (eVarX0 != null) {
                nVarW.a("javax.servlet.error.status_code", new Integer(i10));
                nVarW.a("javax.servlet.error.message", str);
                nVarW.a("javax.servlet.error.request_uri", nVarW.v());
                nVarW.a("javax.servlet.error.servlet_name", nVarW.Q());
                eVarX0.v(null, this.f66931a.w(), this.f66931a.w(), this);
            } else {
                j("Cache-Control", "must-revalidate,no-cache,no-store");
                l("text/html;charset=ISO-8859-1");
                xm.f fVar = new xm.f(2048);
                if (str != null) {
                    str = xm.o.f(xm.o.f(xm.o.f(str, C3426d4.j.f28584c, "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                String strV = nVarW.v();
                if (strV != null) {
                    strV = xm.o.f(xm.o.f(xm.o.f(strV, C3426d4.j.f28584c, "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                fVar.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"/>\n");
                fVar.write("<title>Error ");
                fVar.write(Integer.toString(i10));
                fVar.i(' ');
                if (str == null) {
                    str = HttpStatus.b(i10);
                }
                fVar.write(str);
                fVar.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
                fVar.write(Integer.toString(i10));
                fVar.write("</h2>\n<p>Problem accessing ");
                fVar.write(strV);
                fVar.write(". Reason:\n<pre>    ");
                fVar.write(str);
                fVar.write("</pre>");
                fVar.write("</p>\n");
                if (this.f66931a.D().G0()) {
                    fVar.write("<hr /><i><small>Powered by Jetty:// ");
                    fVar.write(p.K0());
                    fVar.write("</small></i>");
                }
                for (int i11 = 0; i11 < 20; i11++) {
                    fVar.write("\n                                                ");
                }
                fVar.write("\n</body>\n</html>\n");
                fVar.flush();
                p(fVar.h());
                fVar.k(e());
                fVar.d();
            }
        } else if (i10 != 206) {
            this.f66931a.x().J(lm.i.f63808z);
            this.f66931a.x().J(lm.i.f63788j);
            this.f66937g = null;
            this.f66935e = null;
            this.f66936f = null;
        }
        r();
    }

    public void q(lm.g gVar) {
        this.f66931a.C().g(gVar);
    }

    public void r() throws IOException {
        this.f66931a.j();
    }

    public String s(String str) {
        lm.n nVar;
        n nVarW = this.f66931a.w();
        t tVarS = nVarW.S();
        if (tVarS == null) {
            return str;
        }
        String str2 = "";
        if (tVarS.x() && xm.q.h(str)) {
            nVar = new lm.n(str);
            String strH = nVar.h();
            if (strH == null) {
                strH = "";
            }
            int iJ = nVar.j();
            if (iJ < 0) {
                iJ = "https".equalsIgnoreCase(nVar.m()) ? 443 : 80;
            }
            if (!nVarW.s().equalsIgnoreCase(nVar.g()) || nVarW.P() != iJ || !strH.startsWith(nVarW.f())) {
                return str;
            }
        } else {
            nVar = null;
        }
        String strX = tVarS.X();
        if (strX == null) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if ((tVarS.Q() && nVarW.Y()) || !tVarS.O()) {
            int iIndexOf = str.indexOf(strX);
            if (iIndexOf == -1) {
                return str;
            }
            int iIndexOf2 = str.indexOf("?", iIndexOf);
            if (iIndexOf2 < 0) {
                iIndexOf2 = str.indexOf("#", iIndexOf);
            }
            if (iIndexOf2 <= iIndexOf) {
                return str.substring(0, iIndexOf);
            }
            return str.substring(0, iIndexOf) + str.substring(iIndexOf2);
        }
        lj.e eVarP = nVarW.p(false);
        if (eVarP == null || !tVarS.w(eVarP)) {
            return str;
        }
        String strT = tVarS.t(eVarP);
        if (nVar == null) {
            nVar = new lm.n(str);
        }
        int iIndexOf3 = str.indexOf(strX);
        if (iIndexOf3 != -1) {
            int iIndexOf4 = str.indexOf("?", iIndexOf3);
            if (iIndexOf4 < 0) {
                iIndexOf4 = str.indexOf("#", iIndexOf3);
            }
            if (iIndexOf4 <= iIndexOf3) {
                return str.substring(0, iIndexOf3 + strX.length()) + strT;
            }
            return str.substring(0, iIndexOf3 + strX.length()) + strT + str.substring(iIndexOf4);
        }
        int iIndexOf5 = str.indexOf(63);
        if (iIndexOf5 < 0) {
            iIndexOf5 = str.indexOf(35);
        }
        if (iIndexOf5 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (("https".equalsIgnoreCase(nVar.m()) || "http".equalsIgnoreCase(nVar.m())) && nVar.h() == null) {
                str2 = "/";
            }
            sb2.append(str2);
            sb2.append(strX);
            sb2.append(strT);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(0, iIndexOf5));
        if (("https".equalsIgnoreCase(nVar.m()) || "http".equalsIgnoreCase(nVar.m())) && nVar.h() == null) {
            str2 = "/";
        }
        sb3.append(str2);
        sb3.append(strX);
        sb3.append(strT);
        sb3.append(str.substring(iIndexOf5));
        return sb3.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTTP/1.1 ");
        sb2.append(this.f66932b);
        sb2.append(Z7.f27998r);
        String str = this.f66933c;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(System.getProperty("line.separator"));
        sb2.append(this.f66931a.C().toString());
        return sb2.toString();
    }

    public String u() {
        return this.f66933c;
    }

    public String v() {
        return this.f66937g;
    }

    public int w() {
        return this.f66932b;
    }

    public boolean x() {
        return this.f66940j == 2;
    }

    public void y() {
        this.f66932b = 200;
        this.f66933c = null;
        this.f66934d = null;
        this.f66935e = null;
        this.f66936f = null;
        this.f66937g = null;
        this.f66938h = false;
        this.f66939i = null;
        this.f66941k = null;
        this.f66940j = 0;
    }

    public o(b bVar) {
        this.f66931a = bVar;
    }

    @Override // kj.t
    public void b() {
        if (!a()) {
            this.f66931a.q().b();
            return;
        }
        throw new IllegalStateException("Committed");
    }

    @Override // kj.t
    public void l(String str) {
        if (!a() && !this.f66931a.J()) {
            if (str == null) {
                if (this.f66934d == null) {
                    this.f66937g = null;
                }
                this.f66935e = null;
                this.f66936f = null;
                this.f66939i = null;
                this.f66931a.C().J(lm.i.f63808z);
                return;
            }
            int iIndexOf = str.indexOf(59);
            if (iIndexOf > 0) {
                String strTrim = str.substring(0, iIndexOf).trim();
                this.f66935e = strTrim;
                mm.e eVar = lm.p.f63867c;
                this.f66936f = eVar.b(strTrim);
                int i10 = iIndexOf + 1;
                int iIndexOf2 = str.indexOf("charset=", i10);
                if (iIndexOf2 >= 0) {
                    this.f66938h = true;
                    int i11 = iIndexOf2 + 8;
                    int iIndexOf3 = str.indexOf(32, i11);
                    if (this.f66940j == 2) {
                        if ((iIndexOf2 == i10 && iIndexOf3 < 0) || (iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i10) == ' ')) {
                            mm.e.a aVar = this.f66936f;
                            if (aVar != null) {
                                mm.e.a aVarD = aVar.d(this.f66937g);
                                if (aVarD != null) {
                                    this.f66939i = aVarD.toString();
                                    this.f66931a.C().D(lm.i.f63808z, aVarD);
                                    return;
                                }
                                this.f66939i = this.f66935e + ";charset=" + this.f66937g;
                                this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                                return;
                            }
                            this.f66939i = this.f66935e + ";charset=" + this.f66937g;
                            this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                            return;
                        }
                        if (iIndexOf3 < 0) {
                            this.f66939i = str.substring(0, iIndexOf2) + ";charset=" + xm.m.c(this.f66937g, ";= ");
                            this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                            return;
                        }
                        this.f66939i = str.substring(0, iIndexOf2) + str.substring(iIndexOf3) + ";charset=" + xm.m.c(this.f66937g, ";= ");
                        this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                        return;
                    }
                    if ((iIndexOf2 == i10 && iIndexOf3 < 0) || (iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i10) == ' ')) {
                        this.f66936f = eVar.b(this.f66935e);
                        String strE = xm.m.e(str.substring(i11));
                        this.f66937g = strE;
                        mm.e.a aVar2 = this.f66936f;
                        if (aVar2 != null) {
                            mm.e.a aVarD2 = aVar2.d(strE);
                            if (aVarD2 != null) {
                                this.f66939i = aVarD2.toString();
                                this.f66931a.C().D(lm.i.f63808z, aVarD2);
                                return;
                            } else {
                                this.f66939i = str;
                                this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                                return;
                            }
                        }
                        this.f66939i = str;
                        this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                        return;
                    }
                    if (iIndexOf3 > 0) {
                        this.f66937g = xm.m.e(str.substring(i11, iIndexOf3));
                        this.f66939i = str;
                        this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                        return;
                    } else {
                        this.f66937g = xm.m.e(str.substring(i11));
                        this.f66939i = str;
                        this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                        return;
                    }
                }
                this.f66936f = null;
                if (this.f66937g != null) {
                    str = str + ";charset=" + xm.m.c(this.f66937g, ";= ");
                }
                this.f66939i = str;
                this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                return;
            }
            this.f66935e = str;
            mm.e.a aVarB = lm.p.f63867c.b(str);
            this.f66936f = aVarB;
            String str2 = this.f66937g;
            if (str2 != null) {
                if (aVarB != null) {
                    mm.e.a aVarD3 = aVarB.d(str2);
                    if (aVarD3 != null) {
                        this.f66939i = aVarD3.toString();
                        this.f66931a.C().D(lm.i.f63808z, aVarD3);
                        return;
                    }
                    this.f66939i = this.f66935e + ";charset=" + xm.m.c(this.f66937g, ";= ");
                    this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                    return;
                }
                this.f66939i = str + ";charset=" + xm.m.c(this.f66937g, ";= ");
                this.f66931a.C().C(lm.i.f63808z, this.f66939i);
                return;
            }
            if (aVarB != null) {
                this.f66939i = aVarB.toString();
                this.f66931a.C().D(lm.i.f63808z, this.f66936f);
            } else {
                this.f66939i = str;
                this.f66931a.C().C(lm.i.f63808z, this.f66939i);
            }
        }
    }

    @Override // lj.c
    public String n(String str) {
        return s(str);
    }

    @Override // kj.t
    public void p(int i10) {
        if (!a() && !this.f66931a.J()) {
            long j10 = i10;
            this.f66931a.f66834m.C(j10);
            if (i10 > 0) {
                this.f66931a.C().G("Content-Length", j10);
                if (this.f66931a.f66834m.y()) {
                    if (this.f66940j == 2) {
                        this.f66941k.close();
                    } else if (this.f66940j == 1) {
                        try {
                            e().close();
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                }
            }
        }
    }

    public void t() {
        b();
        this.f66941k = null;
        this.f66940j = 0;
    }

    public void z() {
        b();
        t();
        this.f66932b = 200;
        this.f66933c = null;
        org.eclipse.jetty.http.a aVarC = this.f66931a.C();
        aVarC.h();
        String strX = this.f66931a.x().x(lm.i.f63790k);
        if (strX != null) {
            String[] strArrSplit = strX.split(StringUtils.COMMA);
            for (int i10 = 0; strArrSplit != null && i10 < strArrSplit.length; i10++) {
                mm.e.a aVarB = lm.h.f63761d.b(strArrSplit[0].trim());
                if (aVarB != null) {
                    int iE = aVarB.e();
                    if (iE != 1) {
                        if (iE != 5) {
                            if (iE == 8) {
                                aVarC.C(lm.i.f63790k, "TE");
                            }
                        } else if ("HTTP/1.0".equalsIgnoreCase(this.f66931a.w().getProtocol())) {
                            aVarC.C(lm.i.f63790k, "keep-alive");
                        }
                    } else {
                        aVarC.D(lm.i.f63790k, lm.h.f63762e);
                    }
                }
            }
        }
    }
}
