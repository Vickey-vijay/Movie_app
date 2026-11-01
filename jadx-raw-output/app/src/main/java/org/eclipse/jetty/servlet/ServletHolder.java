package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import kj.g;
import kj.i;
import kj.k;
import kj.o;
import kj.p;
import kj.t;
import kj.w;
import pm.f;
import pm.j;
import rm.n;
import rm.v;

/* JADX INFO: loaded from: classes6.dex */
public class ServletHolder extends Holder<i> implements v.a, Comparable {
    public static final zm.c F = zm.b.a(ServletHolder.class);
    public static final Map<String, String> G = Collections.emptyMap();
    public transient i A;
    public transient a B;
    public transient long C;
    public transient boolean D;
    public transient UnavailableException E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f65690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f65691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f65692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f65693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f65694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f65695y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f65696z;

    public class a extends Holder<i>.b implements kj.j {
        public a() {
            super();
        }

        @Override // kj.j
        public String getServletName() {
            return ServletHolder.this.getName();
        }
    }

    public class b extends Holder<i>.c implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f65698b;

        public b() {
            super();
        }

        public g a() {
            return this.f65698b;
        }
    }

    public class c implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Stack<i> f65700b;

        public c() {
            this.f65700b = new Stack<>();
        }

        @Override // kj.i
        public void destroy() {
            synchronized (this) {
                while (this.f65700b.size() > 0) {
                    try {
                        this.f65700b.pop().destroy();
                    } catch (Exception e10) {
                        ServletHolder.F.e(e10);
                    }
                }
            }
        }

        @Override // kj.i
        public void init(kj.j jVar) throws ServletException {
            synchronized (this) {
                if (this.f65700b.size() == 0) {
                    try {
                        i iVarN0 = ServletHolder.this.N0();
                        iVarN0.init(jVar);
                        this.f65700b.push(iVarN0);
                    } catch (ServletException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        throw new ServletException(e11);
                    }
                }
            }
        }

        @Override // kj.i
        public void service(p pVar, t tVar) throws ServletException, IOException {
            i iVarN0;
            synchronized (this) {
                if (this.f65700b.size() > 0) {
                    iVarN0 = this.f65700b.pop();
                } else {
                    try {
                        iVarN0 = ServletHolder.this.N0();
                        iVarN0.init(ServletHolder.this.B);
                    } catch (ServletException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        throw new ServletException(e11);
                    }
                }
            }
            try {
                iVarN0.service(pVar, tVar);
                synchronized (this) {
                    this.f65700b.push(iVarN0);
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    this.f65700b.push(iVarN0);
                    throw th2;
                }
            }
        }
    }

    public ServletHolder() {
        this(Holder.Source.EMBEDDED);
    }

    public synchronized i D0() throws ServletException {
        long j10 = this.C;
        if (j10 != 0) {
            if (j10 < 0 || (j10 > 0 && System.currentTimeMillis() < this.C)) {
                throw this.E;
            }
            this.C = 0L;
            this.E = null;
        }
        if (this.A == null) {
            H0();
        }
        return this.A;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:140), block:B:49:0x008b */
    public final void H0() throws Throwable {
        Object obj;
        Object obj2 = null;
        try {
            try {
                if (this.A == null) {
                    this.A = N0();
                }
                if (this.B == null) {
                    this.B = new a();
                }
                f fVar = this.f65695y;
                Object objE = fVar != null ? fVar.e(fVar.a(), this.f65694x) : null;
                try {
                    if (J0()) {
                        F0();
                    }
                    G0();
                    this.A.init(this.B);
                    f fVar2 = this.f65695y;
                    if (fVar2 != null) {
                        fVar2.d(objE);
                    }
                } catch (UnavailableException e10) {
                    e = e10;
                    M0(e);
                    this.A = null;
                    this.B = null;
                    throw e;
                } catch (ServletException e11) {
                    e = e11;
                    L0(e.getCause() == null ? e : e.getCause());
                    this.A = null;
                    this.B = null;
                    throw e;
                } catch (Exception e12) {
                    e = e12;
                    L0(e);
                    this.A = null;
                    this.B = null;
                    throw new ServletException(toString(), e);
                } catch (Throwable th2) {
                    Object obj3 = objE;
                    th = th2;
                    obj2 = obj3;
                    f fVar3 = this.f65695y;
                    if (fVar3 != null) {
                        fVar3.d(obj2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj;
            }
        } catch (UnavailableException e13) {
            e = e13;
        } catch (ServletException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized void O0(i iVar) {
        if (iVar != null) {
            if (!(iVar instanceof w)) {
                this.f65682o = true;
                this.A = iVar;
                t0(iVar.getClass());
                if (getName() == null) {
                    v0(iVar.getClass().getName() + "-" + super.hashCode());
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public ServletHolder(Holder.Source source) {
        super(source);
        this.f65691u = false;
        this.D = true;
    }

    public void A0(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        i iVar = (i) obj;
        p0().K0(iVar);
        iVar.destroy();
    }

    public String B0() {
        return this.f65692v;
    }

    public o C0() {
        if (this.f65696z == null) {
            this.f65696z = new b();
        }
        return this.f65696z;
    }

    public void E0(n nVar, p pVar, t tVar) throws ServletException, IOException {
        if (this.f65679l == null) {
            throw new UnavailableException("Servlet Not Initialized");
        }
        i iVarD0 = this.A;
        synchronized (this) {
            if (!isStarted()) {
                throw new UnavailableException("Servlet not initialized", -1);
            }
            if (this.C != 0 || !this.f65691u) {
                iVarD0 = D0();
            }
            if (iVarD0 == null) {
                throw new UnavailableException("Could not instantiate " + this.f65679l);
            }
        }
        Object objE = null;
        boolean zW = nVar.W();
        try {
            try {
                String str = this.f65692v;
                if (str != null) {
                    pVar.a("org.apache.catalina.jsp_file", str);
                }
                f fVar = this.f65695y;
                objE = fVar != null ? fVar.e(nVar.L(), this.f65694x) : null;
                if (!r0()) {
                    nVar.e0(false);
                }
                g gVarA = ((b) C0()).a();
                if (gVarA != null) {
                    pVar.a("org.eclipse.multipartConfig", gVarA);
                }
                iVarD0.service(pVar, tVar);
                nVar.e0(zW);
                f fVar2 = this.f65695y;
                if (fVar2 != null) {
                    fVar2.d(objE);
                }
            } catch (UnavailableException e10) {
                M0(e10);
                throw this.E;
            }
        } catch (Throwable th2) {
            nVar.e0(zW);
            f fVar3 = this.f65695y;
            if (fVar3 != null) {
                fVar3.d(objE);
            }
            pVar.a("javax.servlet.error.servlet_name", getName());
            throw th2;
        }
    }

    public boolean I0() {
        return this.D;
    }

    public final boolean J0() {
        i iVar = this.A;
        boolean zK0 = false;
        if (iVar == null) {
            return false;
        }
        for (Class<?> superclass = iVar.getClass(); superclass != null && !zK0; superclass = superclass.getSuperclass()) {
            zK0 = K0(superclass.getName());
        }
        return zK0;
    }

    public final boolean K0(String str) {
        if (str == null) {
            return false;
        }
        return "org.apache.jasper.servlet.JspServlet".equals(str);
    }

    public final void L0(Throwable th2) {
        if (th2 instanceof UnavailableException) {
            M0((UnavailableException) th2);
            return;
        }
        k kVarP0 = this.f65685r.P0();
        if (kVarP0 == null) {
            F.b("unavailable", th2);
        } else {
            kVarP0.g("unavailable", th2);
        }
        this.E = new UnavailableException(String.valueOf(th2), -1, th2) { // from class: org.eclipse.jetty.servlet.ServletHolder.1
            public final /* synthetic */ Throwable val$e;

            {
                this.val$e = th2;
                initCause(th2);
            }
        };
        this.C = -1L;
    }

    public final void M0(UnavailableException unavailableException) {
        if (this.E != unavailableException || this.C == 0) {
            this.f65685r.P0().g("unavailable", unavailableException);
            this.E = unavailableException;
            this.C = -1L;
            if (unavailableException.isPermanent()) {
                this.C = -1L;
            } else if (this.E.getUnavailableSeconds() > 0) {
                this.C = System.currentTimeMillis() + ((long) (this.E.getUnavailableSeconds() * 1000));
            } else {
                this.C = System.currentTimeMillis() + 5000;
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        if (!(obj instanceof ServletHolder)) {
            return 1;
        }
        ServletHolder servletHolder = (ServletHolder) obj;
        int iCompareTo = 0;
        if (servletHolder == this) {
            return 0;
        }
        int i10 = servletHolder.f65690t;
        int i11 = this.f65690t;
        if (i10 < i11) {
            return 1;
        }
        if (i10 > i11) {
            return -1;
        }
        String str2 = this.f65681n;
        if (str2 != null && (str = servletHolder.f65681n) != null) {
            iCompareTo = str2.compareTo(str);
        }
        return iCompareTo == 0 ? this.f65684q.compareTo(servletHolder.f65684q) : iCompareTo;
    }

    @Override // org.eclipse.jetty.servlet.Holder, ym.a
    public void d0() throws Exception {
        String str;
        this.C = 0L;
        if (this.D) {
            try {
                super.d0();
                try {
                    z0();
                    f fVarE = this.f65685r.e();
                    this.f65695y = fVarE;
                    if (fVarE != null && (str = this.f65693w) != null) {
                        this.f65694x = fVarE.f(str);
                    }
                    this.B = new a();
                    Class<? extends T> cls = this.f65679l;
                    if (cls != 0 && w.class.isAssignableFrom(cls)) {
                        this.A = new c();
                    }
                    if (this.f65682o || this.f65691u) {
                        try {
                            H0();
                        } catch (Exception e10) {
                            if (!this.f65685r.U0()) {
                                throw e10;
                            }
                            F.h(e10);
                        }
                    }
                } catch (UnavailableException e11) {
                    M0(e11);
                    if (!this.f65685r.U0()) {
                        throw e11;
                    }
                    F.h(e11);
                }
            } catch (UnavailableException e12) {
                M0(e12);
                if (!this.f65685r.U0()) {
                    throw e12;
                }
                F.h(e12);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    @Override // org.eclipse.jetty.servlet.Holder, ym.a
    public void e0() throws Exception {
        Object obj;
        f fVar;
        Object obj2 = null;
        if (this.A != null) {
            try {
                f fVar2 = this.f65695y;
                Object objE = fVar2 != null ? fVar2.e(fVar2.a(), this.f65694x) : null;
                try {
                    A0(this.A);
                    f fVar3 = this.f65695y;
                    if (fVar3 != null) {
                        fVar3.d(objE);
                    }
                } catch (Exception e10) {
                    obj = objE;
                    e = e10;
                    try {
                        F.e(e);
                        f fVar4 = this.f65695y;
                        if (fVar4 != null) {
                            fVar4.d(obj);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = obj;
                        fVar = this.f65695y;
                        if (fVar != null) {
                            fVar.d(obj2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    obj2 = objE;
                    th = th3;
                    fVar = this.f65695y;
                    if (fVar != null) {
                        fVar.d(obj2);
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                obj = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (!this.f65682o) {
            this.A = null;
        }
        this.B = null;
    }

    public int hashCode() {
        String str = this.f65684q;
        return str == null ? System.identityHashCode(this) : str.hashCode();
    }

    public void z0() throws UnavailableException {
        Class<? extends T> cls = this.f65679l;
        if (cls == 0 || !i.class.isAssignableFrom(cls)) {
            throw new UnavailableException("Servlet " + this.f65679l + " is not a javax.servlet.Servlet");
        }
    }

    public void F0() throws Exception {
        tm.c cVarB = ((tm.c.d) p0().P0()).b();
        cVarB.a("org.apache.catalina.jsp_classpath", cVarB.T0());
        u0("com.sun.appserv.jsp.classpath", xm.k.a(cVarB.S0().getParent()));
        if ("?".equals(getInitParameter("classpath"))) {
            String strT0 = cVarB.T0();
            F.i("classpath=" + strT0, new Object[0]);
            if (strT0 != null) {
                u0("classpath", strT0);
            }
        }
    }

    public void G0() throws Exception {
        if (((b) C0()).a() != null) {
            ((tm.c.d) p0().P0()).b().N0(new n.a());
        }
    }

    public i N0() throws IllegalAccessException, ServletException, InstantiationException {
        try {
            k kVarP0 = p0().P0();
            if (kVarP0 == null) {
                return n0().newInstance();
            }
            return ((org.eclipse.jetty.servlet.b.a) kVarP0).k(n0());
        } catch (ServletException e10) {
            Throwable rootCause = e10.getRootCause();
            if (!(rootCause instanceof InstantiationException)) {
                if (rootCause instanceof IllegalAccessException) {
                    throw ((IllegalAccessException) rootCause);
                }
                throw e10;
            }
            throw ((InstantiationException) rootCause);
        }
    }

    public boolean equals(Object obj) {
        if (compareTo(obj) == 0) {
            return true;
        }
        return false;
    }

    public ServletHolder(i iVar) {
        this(Holder.Source.EMBEDDED);
        O0(iVar);
    }
}
