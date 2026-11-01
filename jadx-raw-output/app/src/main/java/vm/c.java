package vm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import kj.v;
import lj.i;
import lj.j;
import rm.p;
import rm.s;
import rm.t;

/* JADX INFO: compiled from: AbstractSessionManager.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends ym.a implements t {
    public static final zm.c L = g.f73239u;
    public static final i M = new a();
    public String A;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public Set<SessionTrackingMode> G;
    public boolean H;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f73216n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f73218p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ClassLoader f73223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public tm.c.d f73224v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f73228z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<SessionTrackingMode> f73213k = Collections.unmodifiableSet(new HashSet(Arrays.asList(SessionTrackingMode.COOKIE, SessionTrackingMode.URL)));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73214l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73215m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f73217o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f73219q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73220r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<lj.g> f73221s = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<j> f73222t = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f73225w = "JSESSIONID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f73226x = "jsessionid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f73227y = ";" + this.f73226x + "=";
    public int B = -1;
    public final dn.a I = new dn.a();
    public final dn.b J = new dn.b();
    public v K = new b();

    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public static class a implements i {
    }

    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public class b implements v {
        public b() {
        }

        @Override // kj.v
        public boolean a() {
            return c.this.f73217o;
        }

        @Override // kj.v
        public boolean c() {
            return c.this.f73219q;
        }

        @Override // kj.v
        public int getMaxAge() {
            return c.this.B;
        }

        @Override // kj.v
        public String getName() {
            return c.this.f73225w;
        }
    }

    /* JADX INFO: renamed from: vm.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public interface InterfaceC0769c extends lj.e {
        vm.a getSession();
    }

    public abstract void m0(vm.a aVar);

    public abstract vm.a q0(String str);

    public abstract void t0() throws Exception;

    public abstract vm.a v0(lj.a aVar);

    public abstract boolean x0(String str);

    public static lj.e y0(lj.a aVar, lj.e eVar, boolean z10) {
        HashMap map = new HashMap();
        Enumeration<String> enumerationB = eVar.b();
        while (enumerationB.hasMoreElements()) {
            String strNextElement = enumerationB.nextElement();
            map.put(strNextElement, eVar.getAttribute(strNextElement));
            eVar.removeAttribute(strNextElement);
        }
        eVar.invalidate();
        lj.e eVarP = aVar.p(true);
        if (z10) {
            eVarP.a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
        }
        for (Map.Entry entry : map.entrySet()) {
            eVarP.a((String) entry.getKey(), entry.getValue());
        }
        return eVarP;
    }

    @Override // rm.t
    public void A(g gVar) {
        this.f73216n = gVar;
    }

    public void A0(Set<SessionTrackingMode> set) {
        HashSet hashSet = new HashSet(set);
        this.G = hashSet;
        this.f73214l = hashSet.contains(SessionTrackingMode.COOKIE);
        this.H = this.G.contains(SessionTrackingMode.URL);
    }

    @Override // rm.t
    public v B() {
        return this.K;
    }

    @Override // rm.t
    public boolean O() {
        return this.H;
    }

    @Override // rm.t
    public boolean Q() {
        return this.f73214l;
    }

    @Override // rm.t
    public String X() {
        return this.f73227y;
    }

    @Override // rm.t
    public void g(lj.e eVar) {
        ((InterfaceC0769c) eVar).getSession().g();
    }

    public tm.c.d getContext() {
        return this.f73224v;
    }

    public void n0(vm.a aVar, boolean z10) {
        synchronized (this.f73218p) {
            this.f73218p.h(aVar);
            m0(aVar);
        }
        if (z10) {
            this.I.c();
            if (this.f73222t != null) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
                Iterator<j> it = this.f73222t.iterator();
                while (it.hasNext()) {
                    it.next().q(httpSessionEvent);
                }
            }
        }
    }

    public void o0(vm.a aVar, String str, Object obj, Object obj2) {
        if (this.f73221s.isEmpty()) {
            return;
        }
        HttpSessionBindingEvent httpSessionBindingEvent = new HttpSessionBindingEvent(aVar, str, obj == null ? obj2 : obj);
        for (lj.g gVar : this.f73221s) {
            if (obj == null) {
                gVar.d(httpSessionBindingEvent);
            } else if (obj2 == null) {
                gVar.a(httpSessionBindingEvent);
            } else {
                gVar.D(httpSessionBindingEvent);
            }
        }
    }

    public int p0() {
        return this.C;
    }

    public g r0() {
        return this.f73216n;
    }

    public s s0() {
        return this.f73218p;
    }

    @Override // rm.t
    public String t(lj.e eVar) {
        return ((InterfaceC0769c) eVar).getSession().s();
    }

    public boolean u0() {
        return this.f73220r;
    }

    @Override // rm.t
    public boolean w(lj.e eVar) {
        return ((InterfaceC0769c) eVar).getSession().v();
    }

    @Override // rm.t
    public boolean x() {
        return this.E;
    }

    public void z0(String str) {
        String str2 = null;
        this.f73226x = (str == null || "none".equals(str)) ? null : str;
        if (str != null && !"none".equals(str)) {
            str2 = ";" + this.f73226x + "=";
        }
        this.f73227y = str2;
    }

    public c() {
        A0(this.f73213k);
    }

    @Override // rm.t
    public lm.g C(lj.e eVar, boolean z10) {
        String strF;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vm.a session = ((InterfaceC0769c) eVar).getSession();
        if (session.c(jCurrentTimeMillis) && Q()) {
            if (session.u() || (B().getMaxAge() > 0 && p0() > 0 && (jCurrentTimeMillis - session.p()) / 1000 > p0())) {
                tm.c.d dVar = this.f73224v;
                if (dVar == null) {
                    strF = "/";
                } else {
                    strF = dVar.f();
                }
                lm.g gVarP = p(eVar, strF, z10);
                session.h();
                session.w(false);
                return gVarP;
            }
            return null;
        }
        return null;
    }

    @Override // rm.t
    public lj.e H(lj.a aVar) {
        vm.a aVarV0 = v0(aVar);
        aVarV0.x(this.f73215m);
        n0(aVarV0, true);
        return aVarV0;
    }

    @Override // ym.a
    public void d0() throws Exception {
        String strC;
        this.f73224v = tm.c.V0();
        this.f73223u = Thread.currentThread().getContextClassLoader();
        if (this.f73218p == null) {
            p pVarB = r0().b();
            synchronized (pVarB) {
                s sVarH0 = pVarB.H0();
                this.f73218p = sVarH0;
                if (sVarH0 == null) {
                    d dVar = new d();
                    this.f73218p = dVar;
                    pVarB.T0(dVar);
                }
            }
        }
        if (!this.f73218p.isStarted()) {
            this.f73218p.start();
        }
        tm.c.d dVar2 = this.f73224v;
        if (dVar2 != null) {
            String strC2 = dVar2.c("org.eclipse.jetty.servlet.SessionCookie");
            if (strC2 != null) {
                this.f73225w = strC2;
            }
            String strC3 = this.f73224v.c("org.eclipse.jetty.servlet.SessionIdPathParameterName");
            if (strC3 != null) {
                z0(strC3);
            }
            if (this.B == -1 && (strC = this.f73224v.c("org.eclipse.jetty.servlet.MaxAge")) != null) {
                this.B = Integer.parseInt(strC.trim());
            }
            if (this.f73228z == null) {
                this.f73228z = this.f73224v.c("org.eclipse.jetty.servlet.SessionDomain");
            }
            if (this.A == null) {
                this.A = this.f73224v.c("org.eclipse.jetty.servlet.SessionPath");
            }
            String strC4 = this.f73224v.c("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding");
            if (strC4 != null) {
                this.E = Boolean.parseBoolean(strC4);
            }
        }
        super.d0();
    }

    @Override // ym.a
    public void e0() throws Exception {
        super.e0();
        t0();
        this.f73223u = null;
    }

    @Override // rm.t
    public lj.e m(String str) {
        vm.a aVarQ0 = q0(s0().c0(str));
        if (aVarQ0 != null && !aVarQ0.s().equals(str)) {
            aVarQ0.w(true);
        }
        return aVarQ0;
    }

    @Override // rm.t
    public lm.g p(lj.e eVar, String str, boolean z10) {
        lm.g gVar;
        boolean z11;
        boolean z12;
        if (Q()) {
            String str2 = this.A;
            if (str2 != null) {
                str = str2;
            }
            if (str == null || str.length() == 0) {
                str = "/";
            }
            String str3 = str;
            String strT = t(eVar);
            if (this.F == null) {
                String str4 = this.f73225w;
                String str5 = this.f73228z;
                int maxAge = this.K.getMaxAge();
                boolean zA = this.K.a();
                if (!this.K.c() && (!u0() || !z10)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                gVar = new lm.g(str4, strT, str5, str3, maxAge, zA, z12);
            } else {
                String str6 = this.f73225w;
                String str7 = this.f73228z;
                int maxAge2 = this.K.getMaxAge();
                boolean zA2 = this.K.a();
                if (!this.K.c() && (!u0() || !z10)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                gVar = new lm.g(str6, strT, str7, str3, maxAge2, zA2, z11, this.F, 1);
            }
            return gVar;
        }
        return null;
    }

    public void w0(vm.a aVar, boolean z10) {
        if (x0(aVar.o())) {
            this.I.b();
            this.J.a(Math.round((System.currentTimeMillis() - aVar.q()) / 1000.0d));
            this.f73218p.i(aVar);
            if (z10) {
                this.f73218p.F(aVar.o());
            }
            if (z10 && this.f73222t != null) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
                Iterator<j> it = this.f73222t.iterator();
                while (it.hasNext()) {
                    it.next().e(httpSessionEvent);
                }
            }
        }
    }
}
