package rm;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes10.dex */
public class n implements lj.a {
    public static final zm.c R = zm.b.a(n.class);
    public static final Collection S = Collections.singleton(Locale.getDefault());
    public String A;
    public String B;
    public Object C;
    public String D;
    public String F;
    public Map<Object, lj.e> G;
    public v.a I;
    public String J;
    public String K;
    public lj.e L;
    public t M;
    public long N;
    public mm.d O;
    public lm.n P;
    public xm.l Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile xm.b f66906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f66907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MultiMap<String> f66908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f66910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public tm.c.d f66911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f66912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f66913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f66914k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DispatcherType f66916m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public mm.k f66918o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f66921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MultiMap<String> f66922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f66923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f66924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f66925v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f66927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f66928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public BufferedReader f66929z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f66904a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66905b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f66915l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f66917n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f66919p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f66920q = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f66926w = "HTTP/1.1";
    public boolean E = false;
    public String H = "http";

    public n() {
    }

    /* JADX INFO: compiled from: Request.java */
    public static class a implements kj.r {
        @Override // kj.r
        public void m(ServletRequestEvent servletRequestEvent) {
        }

        @Override // kj.r
        public void y(ServletRequestEvent servletRequestEvent) {
            xm.l lVar = (xm.l) servletRequestEvent.getServletRequest().getAttribute("org.eclipse.multiPartInputStream");
            if (lVar != null && ((tm.c.d) servletRequestEvent.getServletRequest().getAttribute("org.eclipse.multiPartContext")) == servletRequestEvent.getServletContext()) {
                try {
                    lVar.a();
                } catch (MultiException e10) {
                    servletRequestEvent.getServletContext().g("Errors deleting multipart tmp files", e10);
                }
            }
        }
    }

    public String A() {
        d dVar = this.f66907d;
        if (dVar instanceof d.f) {
            g0(((d.f) dVar).b(this));
        }
        d dVar2 = this.f66907d;
        if (dVar2 instanceof d.h) {
            return ((d.h) dVar2).getAuthMethod();
        }
        return null;
    }

    public void A0(int i10) {
        this.f66925v = i10;
    }

    public d B() {
        return this.f66907d;
    }

    public void B0(String str) {
        this.K = str;
    }

    public String C() {
        return this.f66909f;
    }

    public void C0(lj.e eVar) {
        this.L = eVar;
    }

    public b D() {
        return this.f66910g;
    }

    public void D0(t tVar) {
        this.M = tVar;
    }

    public int E() {
        return (int) this.f66910g.x().v(lm.i.f63788j);
    }

    public void E0(long j10) {
        this.N = j10;
    }

    public DispatcherType F() {
        return this.f66916m;
    }

    public void F0(lm.n nVar) {
        this.P = nVar;
    }

    public String G() {
        mm.k kVar = this.f66918o;
        if (kVar == null) {
            return null;
        }
        if (this.f66917n) {
            return kVar.r();
        }
        String strG = kVar.g();
        if (strG == null || strG.indexOf(58) < 0) {
            return strG;
        }
        return C3426d4.j.f28586d + strG + C3426d4.j.f28588e;
    }

    public void G0(v.a aVar) {
        this.I = aVar;
    }

    public int H() {
        mm.k kVar = this.f66918o;
        if (kVar == null) {
            return 0;
        }
        return kVar.c();
    }

    public boolean H0() {
        boolean z10 = this.f66912i;
        this.f66912i = false;
        return z10;
    }

    public MultiMap<String> I() {
        return this.f66922s;
    }

    public String K() {
        return this.f66927x;
    }

    public v L() {
        d dVar = this.f66907d;
        if (dVar instanceof d.h) {
            return ((d.h) dVar).getUserIdentity();
        }
        return null;
    }

    public o M() {
        return this.f66910g.f66836o;
    }

    public StringBuilder N() {
        StringBuilder sb2 = new StringBuilder(48);
        String strO = O();
        int iP = P();
        sb2.append(strO);
        sb2.append("://");
        sb2.append(s());
        if (iP > 0 && ((strO.equalsIgnoreCase("http") && iP != 80) || (strO.equalsIgnoreCase("https") && iP != 443))) {
            sb2.append(':');
            sb2.append(iP);
        }
        return sb2;
    }

    public String O() {
        return this.H;
    }

    public int P() {
        lm.n nVar;
        if (this.f66925v <= 0) {
            if (this.J == null) {
                s();
            }
            if (this.f66925v <= 0) {
                if (this.J == null || (nVar = this.P) == null) {
                    mm.k kVar = this.f66918o;
                    this.f66925v = kVar == null ? 0 : kVar.c();
                } else {
                    this.f66925v = nVar.j();
                }
            }
        }
        int i10 = this.f66925v;
        if (i10 <= 0) {
            return O().equalsIgnoreCase("https") ? 443 : 80;
        }
        return i10;
    }

    public String Q() {
        v.a aVar = this.I;
        if (aVar != null) {
            return aVar.getName();
        }
        return null;
    }

    public kj.t R() {
        return this.f66910g.B();
    }

    public t S() {
        return this.M;
    }

    public long T() {
        return this.N;
    }

    public mm.d U() {
        if (this.O == null) {
            long j10 = this.N;
            if (j10 > 0) {
                this.O = org.eclipse.jetty.http.a.f65543e.g(j10);
            }
        }
        return this.O;
    }

    public v.a V() {
        return this.I;
    }

    public boolean W() {
        return this.f66905b;
    }

    public boolean X() {
        return this.f66919p;
    }

    public boolean Y() {
        return this.D != null && this.E;
    }

    public void Z(String str) {
        boolean z10;
        MultiMap<String> multiMap = new MultiMap<>();
        UrlEncoded.decodeTo(str, multiMap, "UTF-8");
        if (!this.f66923t) {
            x();
        }
        MultiMap<String> multiMap2 = this.f66922s;
        if (multiMap2 == null || multiMap2.size() <= 0) {
            z10 = false;
        } else {
            z10 = false;
            for (Map.Entry<String, Object> entry : this.f66922s.entrySet()) {
                String key = entry.getKey();
                if (multiMap.containsKey(key)) {
                    z10 = true;
                }
                Object value = entry.getValue();
                for (int i10 = 0; i10 < LazyList.size(value); i10++) {
                    multiMap.add(key, LazyList.get(value, i10));
                }
            }
        }
        String str2 = this.f66928y;
        if (str2 != null && str2.length() > 0) {
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                MultiMap multiMap3 = new MultiMap();
                UrlEncoded.decodeTo(this.f66928y, multiMap3, K());
                MultiMap multiMap4 = new MultiMap();
                UrlEncoded.decodeTo(str, multiMap4, "UTF-8");
                for (Map.Entry entry2 : multiMap3.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!multiMap4.containsKey(str3)) {
                        Object value2 = entry2.getValue();
                        for (int i11 = 0; i11 < LazyList.size(value2); i11++) {
                            sb2.append(C3426d4.j.f28584c);
                            sb2.append(str3);
                            sb2.append("=");
                            sb2.append(LazyList.get(value2, i11));
                        }
                    }
                }
                str = str + ((Object) sb2);
            } else {
                str = str + C3426d4.j.f28584c + this.f66928y;
            }
        }
        o0(multiMap);
        s0(str);
    }

    @Override // kj.p
    public void a(String str, Object obj) {
        Object attribute = this.f66906c == null ? null : this.f66906c.getAttribute(str);
        if (str.startsWith("org.eclipse.jetty.")) {
            if ("org.eclipse.jetty.server.Request.queryEncoding".equals(str)) {
                r0(obj != null ? obj.toString() : null);
            } else if ("org.eclipse.jetty.server.sendContent".equals(str)) {
                try {
                    ((b.C0632b) R().e()).j(obj);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } else if ("org.eclipse.jetty.server.ResponseBuffer".equals(str)) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    synchronized (byteBuffer) {
                        try {
                            ((b.C0632b) R().e()).k(byteBuffer.isDirect() ? new om.b(byteBuffer, true) : new om.c(byteBuffer, true));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            } else if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
                try {
                    D().f().q(Integer.valueOf(obj.toString()).intValue());
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        if (this.f66906c == null) {
            this.f66906c = new xm.c();
        }
        this.f66906c.a(str, obj);
        if (this.C != null) {
            ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f66911h, this, str, attribute == null ? obj : attribute);
            int size = LazyList.size(this.C);
            for (int i10 = 0; i10 < size; i10++) {
                kj.q qVar = (kj.q) LazyList.get(this.C, i10);
                if (qVar instanceof kj.q) {
                    if (attribute == null) {
                        qVar.s(servletRequestAttributeEvent);
                    } else if (obj == null) {
                        qVar.v(servletRequestAttributeEvent);
                    } else {
                        qVar.C(servletRequestAttributeEvent);
                    }
                }
            }
        }
    }

    public lj.e a0(Object obj) {
        Map<Object, lj.e> map = this.G;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // kj.p
    public kj.m b() throws IOException {
        int i10 = this.f66920q;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("READER");
        }
        this.f66920q = 1;
        return this.f66910g.r();
    }

    public void b0() {
        if (this.f66920q == 2) {
            try {
                int i10 = this.f66929z.read();
                while (i10 != -1) {
                    i10 = this.f66929z.read();
                }
            } catch (Exception e10) {
                R.h(e10);
                this.f66929z = null;
            }
        }
        g0(d.I8);
        this.f66904a.v();
        this.f66905b = true;
        this.f66919p = false;
        if (this.f66911h != null) {
            throw new IllegalStateException("Request in context!");
        }
        if (this.f66906c != null) {
            this.f66906c.y();
        }
        this.f66909f = null;
        this.f66913j = null;
        g gVar = this.f66914k;
        if (gVar != null) {
            gVar.d();
        }
        this.f66915l = false;
        this.f66911h = null;
        this.J = null;
        this.f66921r = null;
        this.f66924u = null;
        this.f66925v = 0;
        this.f66926w = "HTTP/1.1";
        this.f66927x = null;
        this.f66928y = null;
        this.D = null;
        this.E = false;
        this.L = null;
        this.M = null;
        this.F = null;
        this.I = null;
        this.H = "http";
        this.K = null;
        this.N = 0L;
        this.O = null;
        this.P = null;
        MultiMap<String> multiMap = this.f66908e;
        if (multiMap != null) {
            multiMap.clear();
        }
        this.f66922s = null;
        this.f66923t = false;
        this.f66920q = 0;
        Map<Object, lj.e> map = this.G;
        if (map != null) {
            map.clear();
        }
        this.G = null;
        this.Q = null;
    }

    @Override // kj.p
    public boolean c() {
        return this.f66910g.G(this);
    }

    public void c0(String str) {
        Object attribute = this.f66906c == null ? null : this.f66906c.getAttribute(str);
        if (this.f66906c != null) {
            this.f66906c.removeAttribute(str);
        }
        if (attribute == null || this.C == null) {
            return;
        }
        ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f66911h, this, str, attribute);
        int size = LazyList.size(this.C);
        for (int i10 = 0; i10 < size; i10++) {
            kj.q qVar = (kj.q) LazyList.get(this.C, i10);
            if (qVar instanceof kj.q) {
                qVar.v(servletRequestAttributeEvent);
            }
        }
    }

    public void d0(EventListener eventListener) {
        this.C = LazyList.remove(this.C, eventListener);
    }

    @Override // kj.p
    public String e() {
        String str = this.A;
        if (str != null) {
            return str;
        }
        mm.k kVar = this.f66918o;
        if (kVar == null) {
            return null;
        }
        return kVar.e();
    }

    public void e0(boolean z10) {
        this.f66905b = z10;
    }

    @Override // lj.a
    public String f() {
        return this.f66913j;
    }

    public void f0(xm.b bVar) {
        this.f66906c = bVar;
    }

    @Override // kj.p
    public boolean g() {
        return this.f66904a.p();
    }

    public void g0(d dVar) {
        this.f66907d = dVar;
    }

    @Override // kj.p
    public Object getAttribute(String str) {
        if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
            return new Long(D().f().d());
        }
        Object attribute = this.f66906c == null ? null : this.f66906c.getAttribute(str);
        return (attribute == null && "org.eclipse.jetty.continuation".equals(str)) ? this.f66904a : attribute;
    }

    @Override // kj.p
    public String getContentType() {
        return this.f66910g.x().x(lm.i.f63808z);
    }

    public tm.c.d getContext() {
        return this.f66911h;
    }

    @Override // lj.a
    public String getMethod() {
        return this.f66921r;
    }

    @Override // kj.p
    public String getParameter(String str) {
        if (!this.f66923t) {
            x();
        }
        return (String) this.f66922s.getValue(str, 0);
    }

    @Override // kj.p
    public String getProtocol() {
        return this.f66926w;
    }

    @Override // kj.p
    public kj.k getServletContext() {
        return this.f66911h;
    }

    @Override // kj.p
    public kj.a h() {
        if (!this.f66904a.s() || this.f66904a.p()) {
            return this.f66904a;
        }
        throw new IllegalStateException(this.f66904a.m());
    }

    public void h0(String str) {
        this.f66909f = str;
    }

    @Override // lj.a
    public String i() {
        lm.n nVar;
        if (this.f66928y == null && (nVar = this.P) != null) {
            String str = this.f66927x;
            if (str == null) {
                this.f66928y = nVar.k();
            } else {
                this.f66928y = nVar.l(str);
            }
        }
        return this.f66928y;
    }

    public final void i0(b bVar) {
        this.f66910g = bVar;
        this.f66904a.y(bVar);
        this.f66918o = bVar.f();
        this.f66917n = bVar.A();
    }

    @Override // lj.a
    public Cookie[] j() {
        if (this.f66915l) {
            g gVar = this.f66914k;
            if (gVar == null) {
                return null;
            }
            return gVar.b();
        }
        this.f66915l = true;
        Enumeration<String> enumerationZ = this.f66910g.x().z(lm.i.f63785h0);
        if (enumerationZ != null) {
            if (this.f66914k == null) {
                this.f66914k = new g();
            }
            while (enumerationZ.hasMoreElements()) {
                this.f66914k.a(enumerationZ.nextElement());
            }
        }
        g gVar2 = this.f66914k;
        if (gVar2 == null) {
            return null;
        }
        return gVar2.b();
    }

    public void j0(tm.c.d dVar) {
        this.f66912i = this.f66911h != dVar;
        this.f66911h = dVar;
    }

    @Override // lj.a
    public Enumeration k() {
        return this.f66910g.x().t();
    }

    public void k0(String str) {
        this.f66913j = str;
    }

    @Override // lj.a
    public String l() {
        return this.f66924u;
    }

    public void l0(DispatcherType dispatcherType) {
        this.f66916m = dispatcherType;
    }

    @Override // lj.a
    public String m(String str) {
        return this.f66910g.x().w(str);
    }

    public void m0(boolean z10) {
        this.f66919p = z10;
    }

    @Override // lj.a
    public String n() {
        return this.D;
    }

    public void n0(String str) {
        this.f66921r = str;
    }

    @Override // lj.a
    public Enumeration o(String str) {
        Enumeration<String> enumerationY = this.f66910g.x().y(str);
        return enumerationY == null ? Collections.enumeration(Collections.EMPTY_LIST) : enumerationY;
    }

    public void o0(MultiMap<String> multiMap) {
        if (multiMap == null) {
            multiMap = this.f66908e;
        }
        this.f66922s = multiMap;
        if (this.f66923t && multiMap == null) {
            throw new IllegalStateException();
        }
    }

    @Override // lj.a
    public lj.e p(boolean z10) {
        lj.e eVar = this.L;
        if (eVar != null) {
            t tVar = this.M;
            if (tVar == null || tVar.w(eVar)) {
                return this.L;
            }
            this.L = null;
        }
        if (!z10) {
            return null;
        }
        t tVar2 = this.M;
        if (tVar2 == null) {
            throw new IllegalStateException("No SessionManager");
        }
        lj.e eVarH = tVar2.H(this);
        this.L = eVarH;
        lm.g gVarP = this.M.p(eVarH, f(), c());
        if (gVarP != null) {
            this.f66910g.B().q(gVarP);
        }
        return this.L;
    }

    public void p0(String str) {
        this.f66924u = str;
    }

    @Override // kj.p
    public kj.a q() throws IllegalStateException {
        if (!this.f66905b) {
            throw new IllegalStateException("!asyncSupported");
        }
        this.f66904a.z();
        return this.f66904a;
    }

    public void q0(String str) {
        this.f66926w = str;
    }

    @Override // lj.a
    public StringBuffer r() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            String strO = O();
            int iP = P();
            stringBuffer.append(strO);
            stringBuffer.append("://");
            stringBuffer.append(s());
            if (this.f66925v > 0 && ((strO.equalsIgnoreCase("http") && iP != 80) || (strO.equalsIgnoreCase("https") && iP != 443))) {
                stringBuffer.append(':');
                stringBuffer.append(this.f66925v);
            }
            stringBuffer.append(v());
        }
        return stringBuffer;
    }

    public void r0(String str) {
        this.f66927x = str;
        this.f66928y = null;
    }

    @Override // kj.p
    public String s() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        lm.n nVar = this.P;
        if (nVar == null) {
            throw new IllegalStateException("No uri");
        }
        this.J = nVar.g();
        this.f66925v = this.P.j();
        String str2 = this.J;
        if (str2 != null) {
            return str2;
        }
        mm.d dVarO = this.f66910g.x().o(lm.i.f63778e);
        if (dVarO == null) {
            if (this.f66910g != null) {
                this.J = G();
                this.f66925v = H();
                String str3 = this.J;
                if (str3 != null && !"0.0.0.0".equals(str3)) {
                    return this.J;
                }
            }
            try {
                this.J = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e10) {
                R.h(e10);
            }
            return this.J;
        }
        int iT = dVarO.T();
        while (true) {
            int i10 = iT - 1;
            if (iT <= dVarO.getIndex()) {
                break;
            }
            char cQ = (char) (dVarO.Q(i10) & 255);
            if (cQ == ':') {
                this.J = mm.g.f(dVarO.N(dVarO.getIndex(), i10 - dVarO.getIndex()));
                try {
                    try {
                        this.f66925v = mm.g.h(dVarO.N(i10 + 1, (dVarO.T() - i10) - 1));
                    } catch (NumberFormatException unused) {
                        b bVar = this.f66910g;
                        if (bVar != null) {
                            bVar.f66834m.B(400, "Bad Host header", null, true);
                        }
                    }
                    return this.J;
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
            if (cQ == ']') {
                break;
            }
            iT = i10;
        }
        if (this.J == null || this.f66925v < 0) {
            this.J = mm.g.f(dVarO);
            this.f66925v = 0;
        }
        return this.J;
    }

    public void s0(String str) {
        this.f66928y = str;
        this.f66927x = null;
    }

    @Override // lj.a
    public String t() {
        if (this.K == null) {
            this.K = "";
        }
        return this.K;
    }

    public void t0(String str) {
        this.A = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f66919p ? C3426d4.j.f28586d : "(");
        sb2.append(getMethod());
        sb2.append(Z7.f27998r);
        sb2.append(this.P);
        sb2.append(this.f66919p ? "]@" : ")@");
        sb2.append(hashCode());
        sb2.append(Z7.f27998r);
        sb2.append(super.toString());
        return sb2.toString();
    }

    @Override // lj.a
    public long u(String str) {
        return this.f66910g.x().p(str);
    }

    public void u0(String str) {
        this.B = str;
    }

    @Override // lj.a
    public String v() {
        lm.n nVar;
        if (this.F == null && (nVar = this.P) != null) {
            this.F = nVar.i();
        }
        return this.F;
    }

    public void v0(String str) {
        this.F = str;
    }

    public void w(EventListener eventListener) {
        if (eventListener instanceof kj.q) {
            this.C = LazyList.add(this.C, eventListener);
        }
        if (eventListener instanceof km.b) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
        if (eventListener instanceof kj.c) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
    }

    public void w0(String str) {
        this.D = str;
    }

    public void x() {
        int iE;
        int iIntValue;
        int iIntValue2;
        if (this.f66908e == null) {
            this.f66908e = new MultiMap<>(16);
        }
        if (this.f66923t) {
            if (this.f66922s == null) {
                this.f66922s = this.f66908e;
                return;
            }
            return;
        }
        this.f66923t = true;
        try {
            lm.n nVar = this.P;
            if (nVar != null && nVar.n()) {
                String str = this.f66927x;
                if (str == null) {
                    this.P.b(this.f66908e);
                } else {
                    try {
                        this.P.c(this.f66908e, str);
                    } catch (UnsupportedEncodingException e10) {
                        zm.c cVar = R;
                        if (cVar.f()) {
                            cVar.e(e10);
                        } else {
                            cVar.g(e10.toString(), new Object[0]);
                        }
                    }
                }
            }
            String strC = C();
            String contentType = getContentType();
            if (contentType != null && contentType.length() > 0) {
                contentType = org.eclipse.jetty.http.a.L(contentType, null);
                if (ShareTarget.ENCODING_TYPE_URL_ENCODED.equalsIgnoreCase(contentType) && this.f66920q == 0 && (("POST".equals(getMethod()) || "PUT".equals(getMethod())) && (iE = E()) != 0)) {
                    try {
                        tm.c.d dVar = this.f66911h;
                        if (dVar != null) {
                            iIntValue = dVar.b().a1();
                            iIntValue2 = this.f66911h.b().b1();
                        } else {
                            iIntValue = -1;
                            iIntValue2 = -1;
                        }
                        if (iIntValue < 0) {
                            Object attribute = this.f66910g.n().b().getAttribute("org.eclipse.jetty.server.Request.maxFormContentSize");
                            if (attribute == null) {
                                iIntValue = C3426d4.b.f28433c;
                            } else if (attribute instanceof Number) {
                                iIntValue = ((Number) attribute).intValue();
                            } else if (attribute instanceof String) {
                                iIntValue = Integer.valueOf((String) attribute).intValue();
                            }
                        }
                        if (iIntValue2 < 0) {
                            Object attribute2 = this.f66910g.n().b().getAttribute("org.eclipse.jetty.server.Request.maxFormKeys");
                            if (attribute2 == null) {
                                iIntValue2 = 1000;
                            } else if (attribute2 instanceof Number) {
                                iIntValue2 = ((Number) attribute2).intValue();
                            } else if (attribute2 instanceof String) {
                                iIntValue2 = Integer.valueOf((String) attribute2).intValue();
                            }
                        }
                        if (iE > iIntValue && iIntValue > 0) {
                            throw new IllegalStateException("Form too large " + iE + ">" + iIntValue);
                        }
                        UrlEncoded.decodeTo(b(), this.f66908e, strC, iE < 0 ? iIntValue : -1, iIntValue2);
                    } catch (IOException e11) {
                        zm.c cVar2 = R;
                        if (cVar2.f()) {
                            cVar2.e(e11);
                        } else {
                            cVar2.g(e11.toString(), new Object[0]);
                        }
                    }
                }
            }
            MultiMap<String> multiMap = this.f66922s;
            if (multiMap == null) {
                this.f66922s = this.f66908e;
            } else {
                MultiMap<String> multiMap2 = this.f66908e;
                if (multiMap != multiMap2) {
                    for (Map.Entry<String, Object> entry : multiMap2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        for (int i10 = 0; i10 < LazyList.size(value); i10++) {
                            this.f66922s.add(key, LazyList.get(value, i10));
                        }
                    }
                }
            }
            if (contentType != null && contentType.length() > 0 && contentType.startsWith(ShareTarget.ENCODING_TYPE_MULTIPART) && getAttribute("org.eclipse.multipartConfig") != null) {
                try {
                    J();
                } catch (IOException e12) {
                    if (R.f()) {
                        R.e(e12);
                    } else {
                        R.g(e12.toString(), new Object[0]);
                    }
                } catch (ServletException e13) {
                    if (R.f()) {
                        R.e(e13);
                    } else {
                        R.g(e13.toString(), new Object[0]);
                    }
                }
            }
            if (this.f66922s == null) {
                this.f66922s = this.f66908e;
            }
        } catch (Throwable th2) {
            if (this.f66922s == null) {
                this.f66922s = this.f66908e;
            }
            throw th2;
        }
    }

    public void x0(boolean z10) {
        this.E = z10;
    }

    public c y() {
        return this.f66904a;
    }

    public void y0(String str) {
        this.H = str;
    }

    public xm.b z() {
        if (this.f66906c == null) {
            this.f66906c = new xm.c();
        }
        return this.f66906c;
    }

    public void z0(String str) {
        this.J = str;
    }

    public Collection<lj.m> J() throws Throwable {
        File file;
        String strA;
        if (getContentType() != null && getContentType().startsWith(ShareTarget.ENCODING_TYPE_MULTIPART)) {
            if (this.Q == null) {
                this.Q = (xm.l) getAttribute("org.eclipse.multiPartInputStream");
            }
            if (this.Q == null) {
                kj.g gVar = (kj.g) getAttribute("org.eclipse.multipartConfig");
                if (gVar != null) {
                    kj.m mVarB = b();
                    String contentType = getContentType();
                    tm.c.d dVar = this.f66911h;
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    if (dVar != null) {
                        file = (File) dVar.getAttribute("javax.servlet.context.tempdir");
                    } else {
                        file = null;
                    }
                    xm.l lVar = new xm.l(mVarB, contentType, gVar, file);
                    this.Q = lVar;
                    a("org.eclipse.multiPartInputStream", lVar);
                    a("org.eclipse.multiPartContext", this.f66911h);
                    Iterator<lj.m> it = this.Q.d().iterator();
                    while (it.hasNext()) {
                        xm.l.c cVar = (xm.l.c) it.next();
                        if (cVar.d() == null) {
                            if (cVar.e() != null) {
                                strA = lm.p.a(new mm.h(cVar.e()));
                            } else {
                                strA = null;
                            }
                            InputStream inputStreamF = cVar.f();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                try {
                                    xm.j.c(inputStreamF, byteArrayOutputStream2);
                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                    if (strA == null) {
                                        strA = "UTF-8";
                                    }
                                    String str = new String(byteArray, strA);
                                    getParameter("");
                                    I().add(cVar.g(), str);
                                    xm.j.b(byteArrayOutputStream2);
                                    xm.j.a(inputStreamF);
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    xm.j.b(byteArrayOutputStream);
                                    xm.j.a(inputStreamF);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("No multipart config for servlet");
                }
            }
            return this.Q.d();
        }
        throw new ServletException("Content-Type != multipart/form-data");
    }

    @Override // kj.p
    public kj.h d(String str) {
        String strC = xm.q.c(str);
        if (strC != null && this.f66911h != null) {
            String strSubstring = "/";
            if (!strC.startsWith("/")) {
                String strA = xm.q.a(this.K, this.f66924u);
                int iLastIndexOf = strA.lastIndexOf("/");
                if (iLastIndexOf > 1) {
                    strSubstring = strA.substring(0, iLastIndexOf + 1);
                }
                strC = xm.q.a(strSubstring, strC);
            }
            return this.f66911h.d(strC);
        }
        return null;
    }

    public n(b bVar) {
        i0(bVar);
    }
}
