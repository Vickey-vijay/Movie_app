package tm;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import kj.k;
import kj.l;
import kj.r;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.util.LazyList;
import rm.i;
import rm.n;
import rm.p;
import xm.o;
import xm.q;

/* JADX INFO: compiled from: ContextHandler.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends h implements xm.b, p.a {
    public static final zm.c X = zm.b.a(c.class);
    public static final ThreadLocal<d> Y = new ThreadLocal<>();
    public an.e A;
    public lm.p B;
    public e C;
    public String[] D;
    public Set<String> E;
    public EventListener[] F;
    public zm.c G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public Object Q;
    public Map<String, Object> R;
    public String[] S;
    public final CopyOnWriteArrayList<a> T;
    public boolean U;
    public boolean V;
    public volatile int W;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f72435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final xm.c f72436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xm.c f72437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map<String, String> f72438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ClassLoader f72439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f72440y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f72441z;

    /* JADX INFO: compiled from: ContextHandler.java */
    public interface a {
    }

    /* JADX INFO: compiled from: ContextHandler.java */
    public static class b implements a {
    }

    /* JADX INFO: renamed from: tm.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextHandler.java */
    public static class C0754c implements ym.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClassLoader f72442b;

        @Override // ym.e
        public void z(Appendable appendable, String str) throws IOException {
            ClassLoader parent;
            Object c0754c;
            appendable.append(String.valueOf(this.f72442b)).append("\n");
            ClassLoader classLoader = this.f72442b;
            if (classLoader == null || (parent = classLoader.getParent()) == null) {
                return;
            }
            if (!(parent instanceof ym.e)) {
                c0754c = parent;
                c0754c = new C0754c(parent);
            }
            c0754c = parent;
            ClassLoader classLoader2 = this.f72442b;
            if (classLoader2 instanceof URLClassLoader) {
                ym.b.p0(appendable, str, xm.p.a(((URLClassLoader) classLoader2).getURLs()), Collections.singleton(c0754c));
            } else {
                ym.b.p0(appendable, str, Collections.singleton(c0754c));
            }
        }

        public C0754c(ClassLoader classLoader) {
            this.f72442b = classLoader;
        }
    }

    /* JADX INFO: compiled from: ContextHandler.java */
    public class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72443a = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f72444b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f72445c = true;

        public synchronized Enumeration a() {
            HashSet hashSet;
            hashSet = new HashSet();
            if (c.this.f72437v != null) {
                Enumeration<String> enumerationC = c.this.f72437v.c();
                while (enumerationC.hasMoreElements()) {
                    hashSet.add(enumerationC.nextElement());
                }
            }
            Enumeration<String> enumerationC2 = c.this.f72436u.c();
            while (enumerationC2.hasMoreElements()) {
                hashSet.add(enumerationC2.nextElement());
            }
            return Collections.enumeration(hashSet);
        }

        @Override // kj.k
        public kj.h d(String str) {
            String strSubstring;
            if (str == null || !str.startsWith("/")) {
                return null;
            }
            try {
                int iIndexOf = str.indexOf(63);
                if (iIndexOf > 0) {
                    strSubstring = str.substring(iIndexOf + 1);
                    str = str.substring(0, iIndexOf);
                } else {
                    strSubstring = null;
                }
                String strB = q.b(q.d(str));
                if (strB != null) {
                    return new rm.h(c.this, q.a(f(), str), strB, strSubstring);
                }
            } catch (Exception e10) {
                c.X.h(e10);
            }
            return null;
        }

        @Override // kj.k
        public synchronized Object getAttribute(String str) {
            Object attribute;
            attribute = c.this.getAttribute(str);
            if (attribute == null && c.this.f72437v != null) {
                attribute = c.this.f72437v.getAttribute(str);
            }
            return attribute;
        }

        public d() {
        }

        public c b() {
            return c.this;
        }

        public String c(String str) {
            return c.this.getInitParameter(str);
        }

        public Enumeration e() {
            return c.this.Z0();
        }

        @Override // kj.k
        public String f() {
            return (c.this.f72440y == null || !c.this.f72440y.equals("/")) ? c.this.f72440y : "";
        }

        @Override // kj.k
        public void g(String str, Throwable th2) {
            c.this.G.c(str, th2);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x009b  */
        /* JADX WARN: Code duplicated, block: B:42:0x00af A[PHI: r4 r8
  0x00af: PHI (r4v6 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v9 int), (r4v2 int) binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:87:0x00af, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r8v8 java.lang.String) = 
  (r8v1 java.lang.String)
  (r8v1 java.lang.String)
  (r8v1 java.lang.String)
  (r8v12 java.lang.String)
  (r8v1 java.lang.String)
 binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:87:0x00af, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:90:0x00a1 A[SYNTHETIC] */
        @Override // kj.k
        public k getContext(String str) {
            int i10;
            int i11;
            d dVar = this;
            ArrayList arrayList = new ArrayList();
            i[] iVarArrV = c.this.b().V(c.class);
            int length = iVarArrV.length;
            int i12 = 0;
            String str2 = null;
            while (i12 < length) {
                i iVar = iVarArrV[i12];
                if (iVar == null) {
                    i10 = length;
                } else {
                    c cVar = (c) iVar;
                    String strU0 = cVar.U0();
                    if (!str.equals(strU0) && ((!str.startsWith(strU0) || str.charAt(strU0.length()) != '/') && !"/".equals(strU0))) {
                        i10 = length;
                    } else if (c.this.d1() == null || c.this.d1().length <= 0) {
                        i10 = length;
                        if (str2 == null || strU0.length() > str2.length()) {
                            arrayList.clear();
                            str2 = strU0;
                        }
                        if (str2.equals(strU0)) {
                            arrayList.add(cVar);
                        }
                    } else {
                        if (cVar.d1() != null && cVar.d1().length > 0) {
                            for (String str3 : c.this.d1()) {
                                String[] strArrD1 = cVar.d1();
                                int length2 = strArrD1.length;
                                int i13 = 0;
                                while (i13 < length2) {
                                    if (str3.equals(strArrD1[i13])) {
                                        if (str2 != null) {
                                            i11 = length;
                                            if (strU0.length() > str2.length()) {
                                            }
                                            if (str2.equals(strU0)) {
                                                arrayList.add(cVar);
                                            }
                                        } else {
                                            i11 = length;
                                        }
                                        arrayList.clear();
                                        str2 = strU0;
                                        if (str2.equals(strU0)) {
                                            arrayList.add(cVar);
                                        }
                                    } else {
                                        i11 = length;
                                    }
                                    i13++;
                                    length = i11;
                                }
                            }
                        }
                        i10 = length;
                    }
                }
                i12++;
                dVar = this;
                length = i10;
            }
            if (arrayList.size() > 0) {
                return ((c) arrayList.get(0)).f72435t;
            }
            String str4 = null;
            for (i iVar2 : iVarArrV) {
                if (iVar2 != null) {
                    c cVar2 = (c) iVar2;
                    String strU1 = cVar2.U0();
                    if (str.equals(strU1) || ((str.startsWith(strU1) && str.charAt(strU1.length()) == '/') || "/".equals(strU1))) {
                        if (str4 == null || strU1.length() > str4.length()) {
                            arrayList.clear();
                            str4 = strU1;
                        }
                        if (str4.equals(strU1)) {
                            arrayList.add(cVar2);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return ((c) arrayList.get(0)).f72435t;
            }
            return null;
        }

        @Override // kj.k
        public void h(String str) {
            c.this.G.k(str, new Object[0]);
        }

        public void i(boolean z10) {
            this.f72445c = z10;
        }

        public String toString() {
            return "ServletContext@" + c.this.toString();
        }
    }

    public c() {
        this.f72440y = "/";
        this.I = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", -1).intValue();
        this.J = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", -1).intValue();
        this.K = false;
        this.L = false;
        this.T = new CopyOnWriteArrayList<>();
        this.U = false;
        this.V = true;
        this.f72435t = new d();
        this.f72436u = new xm.c();
        this.f72437v = new xm.c();
        this.f72438w = new HashMap();
        M0(new b());
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    @Override // tm.h, tm.g, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        Thread threadCurrentThread;
        ClassLoader contextClassLoader;
        int i10;
        this.W = 0;
        if (this.f72440y == null) {
            throw new IllegalStateException("Null contextPath");
        }
        this.G = zm.b.b(W0() == null ? U0() : W0());
        d dVar = null;
        try {
            if (this.f72439x != null) {
                threadCurrentThread = Thread.currentThread();
                try {
                    contextClassLoader = threadCurrentThread.getContextClassLoader();
                    try {
                        threadCurrentThread.setContextClassLoader(this.f72439x);
                    } catch (Throwable th2) {
                        th = th2;
                        Y.set(dVar);
                        if (this.f72439x != null) {
                            threadCurrentThread.setContextClassLoader(contextClassLoader);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contextClassLoader = null;
                    Y.set(dVar);
                    if (this.f72439x != null) {
                        threadCurrentThread.setContextClassLoader(contextClassLoader);
                    }
                    throw th;
                }
            } else {
                threadCurrentThread = null;
                contextClassLoader = null;
            }
            if (this.B == null) {
                this.B = new lm.p();
            }
            ThreadLocal<d> threadLocal = Y;
            d dVar2 = threadLocal.get();
            try {
                threadLocal.set(this.f72435t);
                l1();
                synchronized (this) {
                    try {
                        if (this.U) {
                            i10 = 2;
                        } else {
                            i10 = this.V ? 1 : 3;
                        }
                        this.W = i10;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                threadLocal.set(dVar2);
                if (this.f72439x != null) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
            } catch (Throwable th5) {
                th = th5;
                dVar = dVar2;
                Y.set(dVar);
                if (this.f72439x != null) {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            threadCurrentThread = null;
            contextClassLoader = null;
        }
    }

    public boolean e1(String str) {
        boolean z10 = false;
        if (str != null && this.S != null) {
            while (str.startsWith("//")) {
                str = q.c(str);
            }
            int i10 = 0;
            while (!z10) {
                String[] strArr = this.S;
                if (i10 >= strArr.length) {
                    break;
                }
                int i11 = i10 + 1;
                boolean zG = o.g(str, strArr[i10]);
                i10 = i11;
                z10 = zG;
            }
        }
        return z10;
    }

    public void j1(EventListener[] eventListenerArr) {
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.F = eventListenerArr;
        for (int i10 = 0; eventListenerArr != null && i10 < eventListenerArr.length; i10++) {
            EventListener eventListener = this.F[i10];
            if (eventListener instanceof l) {
                this.M = LazyList.add(this.M, eventListener);
            }
            if (eventListener instanceof r) {
                this.O = LazyList.add(this.O, eventListener);
            }
            if (eventListener instanceof kj.q) {
                this.P = LazyList.add(this.P, eventListener);
            }
        }
    }

    @Override // xm.b
    public void removeAttribute(String str) {
        Q0(str, null);
        this.f72436u.removeAttribute(str);
    }

    @Override // rm.p.a
    public void u(boolean z10) {
        int i10;
        synchronized (this) {
            this.U = z10;
            if (!isRunning()) {
                i10 = 0;
            } else if (this.U) {
                i10 = 2;
            } else {
                i10 = this.V ? 1 : 3;
            }
            this.W = i10;
        }
    }

    public static d V0() {
        return Y.get();
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0106 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0130 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0134 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0138 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    @Override // tm.h
    public void D0(String str, n nVar, lj.a aVar, lj.c cVar) throws Throwable {
        String str2;
        String strC;
        ClassLoader classLoader;
        Thread threadCurrentThread;
        String str3;
        String strT;
        String str4;
        String strF;
        String strL;
        ThreadLocal<d> threadLocal;
        h hVar;
        h hVar2;
        zm.c cVar2 = X;
        if (cVar2.f()) {
            cVar2.i("scope {}|{}|{} @ {}", nVar.f(), nVar.t(), nVar.l(), this);
        }
        DispatcherType dispatcherTypeF = nVar.F();
        d context = nVar.getContext();
        try {
            try {
                try {
                    try {
                        try {
                            if (context != this.f72435t) {
                                if (DispatcherType.REQUEST.equals(dispatcherTypeF) || DispatcherType.ASYNC.equals(dispatcherTypeF) || (DispatcherType.ERROR.equals(dispatcherTypeF) && nVar.y().r())) {
                                    strC = this.K ? q.c(str) : str;
                                    if (P0(strC, nVar, cVar)) {
                                        if (strC.length() > this.f72440y.length()) {
                                            if (this.f72440y.length() > 1) {
                                                strC = strC.substring(this.f72440y.length());
                                            }
                                            str2 = strC;
                                        } else if (this.f72440y.length() == 1) {
                                            str2 = "/";
                                        } else {
                                            strC = "/";
                                            str2 = null;
                                        }
                                        if (this.f72439x != null) {
                                            threadCurrentThread = Thread.currentThread();
                                            ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
                                            threadCurrentThread.setContextClassLoader(this.f72439x);
                                            classLoader = contextClassLoader;
                                        }
                                        strF = nVar.f();
                                        strT = nVar.t();
                                        strL = nVar.l();
                                        nVar.j0(this.f72435t);
                                        threadLocal = Y;
                                        threadLocal.set(this.f72435t);
                                        if (!DispatcherType.INCLUDE.equals(dispatcherTypeF) && strC.startsWith("/")) {
                                            if (this.f72440y.length() == 1) {
                                                nVar.k0("");
                                            } else {
                                                nVar.k0(this.f72440y);
                                            }
                                            nVar.B0(null);
                                            nVar.p0(str2);
                                        }
                                        if (cVar2.f()) {
                                            cVar2.i("context={}|{}|{} @ {}", nVar.f(), nVar.t(), nVar.l(), this);
                                        }
                                        if (E0()) {
                                            G0(strC, nVar, aVar, cVar);
                                        } else {
                                            hVar = this.f72465r;
                                            if (hVar != null) {
                                                hVar.D0(strC, nVar, aVar, cVar);
                                            } else {
                                                hVar2 = this.f72464q;
                                                if (hVar2 != null) {
                                                    hVar2.C0(strC, nVar, aVar, cVar);
                                                } else {
                                                    C0(strC, nVar, aVar, cVar);
                                                }
                                            }
                                        }
                                        if (context != this.f72435t) {
                                            if (this.f72439x != null) {
                                                threadCurrentThread.setContextClassLoader(classLoader);
                                            }
                                            nVar.j0(context);
                                            threadLocal.set(context);
                                            nVar.k0(strF);
                                            nVar.B0(strT);
                                            nVar.p0(strL);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                str2 = str;
                                strC = str2;
                                if (this.f72439x != null) {
                                    threadCurrentThread = Thread.currentThread();
                                    ClassLoader contextClassLoader2 = threadCurrentThread.getContextClassLoader();
                                    threadCurrentThread.setContextClassLoader(this.f72439x);
                                    classLoader = contextClassLoader2;
                                }
                                strF = nVar.f();
                                strT = nVar.t();
                                strL = nVar.l();
                                nVar.j0(this.f72435t);
                                threadLocal = Y;
                                threadLocal.set(this.f72435t);
                                if (!DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                                    if (this.f72440y.length() == 1) {
                                        nVar.k0("");
                                    } else {
                                        nVar.k0(this.f72440y);
                                    }
                                    nVar.B0(null);
                                    nVar.p0(str2);
                                }
                                if (cVar2.f()) {
                                    cVar2.i("context={}|{}|{} @ {}", nVar.f(), nVar.t(), nVar.l(), this);
                                }
                                if (E0()) {
                                    G0(strC, nVar, aVar, cVar);
                                } else {
                                    hVar = this.f72465r;
                                    if (hVar != null) {
                                        hVar.D0(strC, nVar, aVar, cVar);
                                    } else {
                                        hVar2 = this.f72464q;
                                        if (hVar2 != null) {
                                            hVar2.C0(strC, nVar, aVar, cVar);
                                        } else {
                                            C0(strC, nVar, aVar, cVar);
                                        }
                                    }
                                }
                                if (context != this.f72435t) {
                                    if (this.f72439x != null) {
                                        threadCurrentThread.setContextClassLoader(classLoader);
                                    }
                                    nVar.j0(context);
                                    threadLocal.set(context);
                                    nVar.k0(strF);
                                    nVar.B0(strT);
                                    nVar.p0(strL);
                                    return;
                                }
                                return;
                            }
                            str2 = str;
                            strC = str2;
                            threadLocal.set(this.f72435t);
                            if (!DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                                if (this.f72440y.length() == 1) {
                                    nVar.k0("");
                                } else {
                                    nVar.k0(this.f72440y);
                                }
                                nVar.B0(null);
                                nVar.p0(str2);
                            }
                            if (cVar2.f()) {
                                cVar2.i("context={}|{}|{} @ {}", nVar.f(), nVar.t(), nVar.l(), this);
                            }
                            if (E0()) {
                                G0(strC, nVar, aVar, cVar);
                            } else {
                                hVar = this.f72465r;
                                if (hVar != null) {
                                    hVar.D0(strC, nVar, aVar, cVar);
                                } else {
                                    hVar2 = this.f72464q;
                                    if (hVar2 != null) {
                                        hVar2.C0(strC, nVar, aVar, cVar);
                                    } else {
                                        C0(strC, nVar, aVar, cVar);
                                    }
                                }
                            }
                            if (context != this.f72435t) {
                                if (this.f72439x != null) {
                                    threadCurrentThread.setContextClassLoader(classLoader);
                                }
                                nVar.j0(context);
                                threadLocal.set(context);
                                nVar.k0(strF);
                                nVar.B0(strT);
                                nVar.p0(strL);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = strL;
                            str4 = strF;
                            if (context != this.f72435t) {
                                if (this.f72439x != null) {
                                    threadCurrentThread.setContextClassLoader(classLoader);
                                }
                                nVar.j0(context);
                                Y.set(context);
                                nVar.k0(str4);
                                nVar.B0(strT);
                                nVar.p0(str3);
                            }
                            throw th;
                        }
                        nVar.j0(this.f72435t);
                        threadLocal = Y;
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = strL;
                    }
                    strL = nVar.l();
                } catch (Throwable th4) {
                    th = th4;
                    str3 = null;
                }
                strT = nVar.t();
            } catch (Throwable th5) {
                th = th5;
                str3 = null;
                strT = null;
            }
            strF = nVar.f();
        } catch (Throwable th6) {
            th = th6;
            str3 = null;
            strT = null;
            str4 = null;
        }
        classLoader = null;
        threadCurrentThread = null;
    }

    public void M0(a aVar) {
        this.T.add(aVar);
    }

    public void Q0(String str, Object obj) {
        Map<String, Object> map = this.R;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        k1(str, obj);
    }

    public an.e R0() {
        an.e eVar = this.A;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    public ClassLoader S0() {
        return this.f72439x;
    }

    public String T0() {
        ClassLoader classLoader = this.f72439x;
        if (classLoader == null || !(classLoader instanceof URLClassLoader)) {
            return null;
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        StringBuilder sb2 = new StringBuilder();
        for (URL url : uRLs) {
            try {
                File fileB = f1(url).b();
                if (fileB != null && fileB.exists()) {
                    if (sb2.length() > 0) {
                        sb2.append(File.pathSeparatorChar);
                    }
                    sb2.append(fileB.getAbsolutePath());
                }
            } catch (IOException e10) {
                X.a(e10);
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String U0() {
        return this.f72440y;
    }

    public String W0() {
        return this.f72441z;
    }

    public e X0() {
        return this.C;
    }

    public EventListener[] Y0() {
        return this.F;
    }

    public Enumeration Z0() {
        return Collections.enumeration(this.f72438w.keySet());
    }

    public int a1() {
        return this.J;
    }

    public int b1() {
        return this.I;
    }

    public d c1() {
        return this.f72435t;
    }

    public String[] d1() {
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    @Override // tm.g, tm.a, ym.b, ym.a
    public void e0() throws Exception {
        ClassLoader contextClassLoader;
        Throwable th2;
        Thread threadCurrentThread;
        this.W = 0;
        ThreadLocal<d> threadLocal = Y;
        d dVar = threadLocal.get();
        threadLocal.set(this.f72435t);
        try {
            if (this.f72439x != null) {
                threadCurrentThread = Thread.currentThread();
                try {
                    contextClassLoader = threadCurrentThread.getContextClassLoader();
                    try {
                        threadCurrentThread.setContextClassLoader(this.f72439x);
                    } catch (Throwable th3) {
                        th2 = th3;
                        X.k("stopped {}", this);
                        Y.set(dVar);
                        if (this.f72439x != null) {
                            threadCurrentThread.setContextClassLoader(contextClassLoader);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    contextClassLoader = null;
                    th2 = th4;
                    X.k("stopped {}", this);
                    Y.set(dVar);
                    if (this.f72439x != null) {
                        threadCurrentThread.setContextClassLoader(contextClassLoader);
                    }
                    throw th2;
                }
            } else {
                threadCurrentThread = null;
                contextClassLoader = null;
            }
            super.e0();
            if (this.M != null) {
                ServletContextEvent servletContextEvent = new ServletContextEvent(this.f72435t);
                int size = LazyList.size(this.M);
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    ((l) LazyList.get(this.M, i10)).j(servletContextEvent);
                    size = i10;
                }
            }
            j1((EventListener[]) LazyList.toArray(this.Q, EventListener.class));
            this.Q = null;
            e eVar = this.C;
            if (eVar != null) {
                eVar.stop();
            }
            Enumeration enumerationA = this.f72435t.a();
            while (enumerationA.hasMoreElements()) {
                Q0((String) enumerationA.nextElement(), null);
            }
            X.k("stopped {}", this);
            Y.set(dVar);
            if (this.f72439x != null) {
                threadCurrentThread.setContextClassLoader(contextClassLoader);
            }
            this.f72437v.y();
        } catch (Throwable th5) {
            contextClassLoader = null;
            th2 = th5;
            threadCurrentThread = null;
        }
    }

    @Override // tm.g, tm.a, rm.i
    public void f(p pVar) {
        if (this.C == null) {
            super.f(pVar);
            return;
        }
        p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            pVarB.E0().update((Object) this, (Object) this.C, (Object) null, "error", true);
        }
        super.f(pVar);
        if (pVar != null && pVar != pVarB) {
            pVar.E0().update((Object) this, (Object) null, (Object) this.C, "error", true);
        }
        this.C.f(pVar);
    }

    public final String g1(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    @Override // xm.b
    public Object getAttribute(String str) {
        return this.f72436u.getAttribute(str);
    }

    public String getInitParameter(String str) {
        return this.f72438w.get(str);
    }

    public void h1(String str) {
        if (str != null && str.length() > 1 && str.endsWith("/")) {
            throw new IllegalArgumentException("ends with /");
        }
        this.f72440y = str;
        if (b() != null) {
            if (b().I() || b().isStarted()) {
                i[] iVarArrV = b().V(tm.d.class);
                for (int i10 = 0; iVarArrV != null && i10 < iVarArrV.length; i10++) {
                    ((tm.d) iVarArrV[i10]).D0();
                }
            }
        }
    }

    public void i1(e eVar) {
        if (eVar != null) {
            eVar.f(b());
        }
        if (b() != null) {
            b().E0().update((Object) this, (Object) this.C, (Object) eVar, "errorHandler", true);
        }
        this.C = eVar;
    }

    public void k1(String str, Object obj) {
        b().E0().update((Object) this, this.R.put(str, obj), obj, str, true);
    }

    public void l1() throws Exception {
        String str = this.f72438w.get("org.eclipse.jetty.server.context.ManagedAttributes");
        if (str != null) {
            this.R = new HashMap();
            for (String str2 : str.split(StringUtils.COMMA)) {
                this.R.put(str2, null);
            }
            Enumeration enumerationA = this.f72435t.a();
            while (enumerationA.hasMoreElements()) {
                String str3 = (String) enumerationA.nextElement();
                Q0(str3, this.f72435t.getAttribute(str3));
            }
        }
        super.d0();
        e eVar = this.C;
        if (eVar != null) {
            eVar.start();
        }
        if (this.M != null) {
            ServletContextEvent servletContextEvent = new ServletContextEvent(this.f72435t);
            for (int i10 = 0; i10 < LazyList.size(this.M); i10++) {
                O0((l) LazyList.get(this.M, i10), servletContextEvent);
            }
        }
    }

    @Override // xm.b
    public void y() {
        Enumeration<String> enumerationC = this.f72436u.c();
        while (enumerationC.hasMoreElements()) {
            Q0(enumerationC.nextElement(), null);
        }
        this.f72436u.y();
    }

    @Override // tm.h
    public void C0(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        DispatcherType dispatcherTypeF = nVar.F();
        boolean zH0 = nVar.H0();
        try {
            if (zH0) {
                try {
                    Object obj = this.P;
                    if (obj != null) {
                        int size = LazyList.size(obj);
                        for (int i10 = 0; i10 < size; i10++) {
                            nVar.w((EventListener) LazyList.get(this.P, i10));
                        }
                    }
                    Object obj2 = this.O;
                    if (obj2 != null) {
                        int size2 = LazyList.size(obj2);
                        ServletRequestEvent servletRequestEvent = new ServletRequestEvent(this.f72435t, aVar);
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((r) LazyList.get(this.O, i11)).m(servletRequestEvent);
                        }
                    }
                } catch (HttpException e10) {
                    X.a(e10);
                    nVar.m0(true);
                    cVar.m(e10.getStatus(), e10.getReason());
                    if (zH0) {
                        if (this.O != null) {
                            ServletRequestEvent servletRequestEvent2 = new ServletRequestEvent(this.f72435t, aVar);
                            int size3 = LazyList.size(this.O);
                            while (true) {
                                int i12 = size3 - 1;
                                if (size3 <= 0) {
                                    break;
                                }
                                ((r) LazyList.get(this.O, i12)).y(servletRequestEvent2);
                                size3 = i12;
                            }
                        }
                        Object obj3 = this.P;
                        if (obj3 != null) {
                            int size4 = LazyList.size(obj3);
                            while (true) {
                                int i13 = size4 - 1;
                                if (size4 > 0) {
                                    nVar.d0((EventListener) LazyList.get(this.P, i13));
                                    size4 = i13;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (DispatcherType.REQUEST.equals(dispatcherTypeF) && e1(str)) {
                throw new HttpException(404);
            }
            if (E0()) {
                F0(str, nVar, aVar, cVar);
            } else {
                h hVar = this.f72465r;
                if (hVar != null && hVar == this.f72462p) {
                    hVar.C0(str, nVar, aVar, cVar);
                } else {
                    i iVar = this.f72462p;
                    if (iVar != null) {
                        iVar.v(str, nVar, aVar, cVar);
                    }
                }
            }
            if (zH0) {
                if (this.O != null) {
                    ServletRequestEvent servletRequestEvent3 = new ServletRequestEvent(this.f72435t, aVar);
                    int size5 = LazyList.size(this.O);
                    while (true) {
                        int i14 = size5 - 1;
                        if (size5 <= 0) {
                            break;
                        }
                        ((r) LazyList.get(this.O, i14)).y(servletRequestEvent3);
                        size5 = i14;
                    }
                }
                Object obj4 = this.P;
                if (obj4 != null) {
                    int size6 = LazyList.size(obj4);
                    while (true) {
                        int i15 = size6 - 1;
                        if (size6 > 0) {
                            nVar.d0((EventListener) LazyList.get(this.P, i15));
                            size6 = i15;
                        } else {
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            if (zH0) {
                if (this.O != null) {
                    ServletRequestEvent servletRequestEvent4 = new ServletRequestEvent(this.f72435t, aVar);
                    int size7 = LazyList.size(this.O);
                    while (true) {
                        int i16 = size7 - 1;
                        if (size7 <= 0) {
                            break;
                        }
                        ((r) LazyList.get(this.O, i16)).y(servletRequestEvent4);
                        size7 = i16;
                    }
                }
                Object obj5 = this.P;
                if (obj5 != null) {
                    int size8 = LazyList.size(obj5);
                    while (true) {
                        int i17 = size8 - 1;
                        if (size8 <= 0) {
                            break;
                        }
                        nVar.d0((EventListener) LazyList.get(this.P, i17));
                        size8 = i17;
                    }
                }
            }
            throw th2;
        }
    }

    public void N0(EventListener eventListener) {
        if (!isStarted() && !I()) {
            this.Q = LazyList.add(this.Q, eventListener);
        }
        j1((EventListener[]) LazyList.addToArray(Y0(), eventListener, EventListener.class));
    }

    public void O0(l lVar, ServletContextEvent servletContextEvent) {
        lVar.p(servletContextEvent);
    }

    public boolean P0(String str, n nVar, lj.c cVar) throws ServletException, IOException {
        String name;
        DispatcherType dispatcherTypeF = nVar.F();
        int i10 = this.W;
        if (i10 != 0 && i10 != 2) {
            if (i10 != 3) {
                if (DispatcherType.REQUEST.equals(dispatcherTypeF) && nVar.X()) {
                    return false;
                }
                String[] strArr = this.D;
                if (strArr != null && strArr.length > 0) {
                    String strG1 = g1(nVar.s());
                    boolean zEqualsIgnoreCase = false;
                    int i11 = 0;
                    while (!zEqualsIgnoreCase) {
                        String[] strArr2 = this.D;
                        if (i11 >= strArr2.length) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        if (str2 != null) {
                            if (str2.startsWith("*.")) {
                                zEqualsIgnoreCase = str2.regionMatches(true, 2, strG1, strG1.indexOf(".") + 1, str2.length() - 2);
                            } else {
                                zEqualsIgnoreCase = str2.equalsIgnoreCase(strG1);
                            }
                        }
                        i11++;
                    }
                    if (!zEqualsIgnoreCase) {
                        return false;
                    }
                }
                Set<String> set = this.E;
                if (set != null && set.size() > 0 && ((name = rm.b.o().n().getName()) == null || !this.E.contains(name))) {
                    return false;
                }
                if (this.f72440y.length() > 1) {
                    if (!str.startsWith(this.f72440y)) {
                        return false;
                    }
                    if (str.length() > this.f72440y.length() && str.charAt(this.f72440y.length()) != '/') {
                        return false;
                    }
                    if (!this.H && this.f72440y.length() == str.length()) {
                        nVar.m0(true);
                        if (nVar.i() != null) {
                            cVar.g(q.a(nVar.v(), "/") + "?" + nVar.i());
                        } else {
                            cVar.g(q.a(nVar.v(), "/"));
                        }
                        return false;
                    }
                }
                return true;
            }
            nVar.m0(true);
            cVar.o(503);
        }
        return false;
    }

    @Override // xm.b
    public void a(String str, Object obj) {
        Q0(str, obj);
        this.f72436u.a(str, obj);
    }

    public an.e f1(URL url) throws IOException {
        return an.e.g(url);
    }

    public String toString() {
        String name;
        String[] strArrD1 = d1();
        StringBuilder sb2 = new StringBuilder();
        Package r10 = getClass().getPackage();
        if (r10 != null && (name = r10.getName()) != null && name.length() > 0) {
            for (String str : name.split("\\.")) {
                sb2.append(str.charAt(0));
                sb2.append('.');
            }
        }
        sb2.append(getClass().getSimpleName());
        sb2.append('{');
        sb2.append(U0());
        sb2.append(',');
        sb2.append(R0());
        if (strArrD1 != null && strArrD1.length > 0) {
            sb2.append(',');
            sb2.append(strArrD1[0]);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // tm.b, ym.b, ym.e
    public void z(Appendable appendable, String str) throws IOException {
        s0(appendable);
        ym.b.p0(appendable, str, Collections.singletonList(new C0754c(S0())), xm.p.a(P()), u0(), this.f72438w.entrySet(), this.f72436u.b(), this.f72437v.b());
    }

    public c(d dVar) {
        this.f72440y = "/";
        this.I = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", -1).intValue();
        this.J = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", -1).intValue();
        this.K = false;
        this.L = false;
        this.T = new CopyOnWriteArrayList<>();
        this.U = false;
        this.V = true;
        this.f72435t = dVar;
        this.f72436u = new xm.c();
        this.f72437v = new xm.c();
        this.f72438w = new HashMap();
        M0(new b());
    }
}
