package rm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.continuation.ContinuationThrowable;

/* JADX INFO: compiled from: AsyncContinuation.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements kj.a, km.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final zm.c f66852n = zm.b.a(c.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ContinuationThrowable f66853o = new ContinuationThrowable();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rm.b f66854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<kj.c> f66855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<kj.c> f66856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<km.b> f66857d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f66862i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f66864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f66865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f66866m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f66863j = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66858e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f66859f = true;

    /* JADX INFO: compiled from: AsyncContinuation.java */
    public class a extends kj.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final kj.k f66867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public kj.k f66868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f66869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public en.e.a f66870h;

        public a(kj.k kVar, kj.p pVar, kj.t tVar) {
            super(c.this, pVar, tVar);
            this.f66870h = c.this.new b();
            this.f66867e = kVar;
            n nVarW = c.this.f66854a.w();
            if (nVarW.getAttribute("javax.servlet.async.request_uri") == null) {
                String str = (String) nVarW.getAttribute("javax.servlet.forward.request_uri");
                if (str != null) {
                    nVarW.a("javax.servlet.async.request_uri", str);
                    nVarW.a("javax.servlet.async.context_path", nVarW.getAttribute("javax.servlet.forward.context_path"));
                    nVarW.a("javax.servlet.async.servlet_path", nVarW.getAttribute("javax.servlet.forward.servlet_path"));
                    nVarW.a("javax.servlet.async.path_info", nVarW.getAttribute("javax.servlet.forward.path_info"));
                    nVarW.a("javax.servlet.async.query_string", nVarW.getAttribute("javax.servlet.forward.query_string"));
                    return;
                }
                nVarW.a("javax.servlet.async.request_uri", nVarW.v());
                nVarW.a("javax.servlet.async.context_path", nVarW.f());
                nVarW.a("javax.servlet.async.servlet_path", nVarW.t());
                nVarW.a("javax.servlet.async.path_info", nVarW.l());
                nVarW.a("javax.servlet.async.query_string", nVarW.i());
            }
        }

        public String g() {
            return this.f66869g;
        }

        public kj.k h() {
            kj.k kVar = this.f66868f;
            return kVar == null ? this.f66867e : kVar;
        }

        public void i(String str) {
            this.f66869g = str;
        }
    }

    /* JADX INFO: compiled from: AsyncContinuation.java */
    public class b extends en.e.a implements Runnable {
        public b() {
        }

        @Override // en.e.a
        public void f() {
            c.this.i();
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.i();
        }
    }

    public boolean A() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 == 0) {
                throw new IllegalStateException(m());
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f66859f = false;
                    this.f66858e = 4;
                    x();
                    int i11 = this.f66858e;
                    if (i11 == 4) {
                        return true;
                    }
                    if (i11 == 7) {
                        this.f66858e = 8;
                        return true;
                    }
                    this.f66859f = false;
                    this.f66858e = 6;
                    return false;
                }
                if (i10 == 3) {
                    this.f66859f = false;
                    this.f66858e = 6;
                    return false;
                }
                if (i10 != 6) {
                    if (i10 != 7) {
                        throw new IllegalStateException(m());
                    }
                    this.f66859f = false;
                    this.f66858e = 8;
                    return true;
                }
            }
            this.f66858e = 8;
            return true;
        }
    }

    @Override // kj.a
    public void a(kj.c cVar) {
        synchronized (this) {
            if (this.f66856c == null) {
                this.f66856c = new ArrayList();
            }
            this.f66856c.add(cVar);
        }
    }

    @Override // kj.a
    public void b(long j10) {
        synchronized (this) {
            this.f66863j = j10;
        }
    }

    public void c() {
        synchronized (this) {
            d();
            this.f66857d = null;
        }
    }

    @Override // kj.a
    public void complete() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f66858e = 7;
                    return;
                }
                if (i10 == 4) {
                    this.f66858e = 7;
                    boolean z10 = !this.f66861h;
                    if (z10) {
                        d();
                        w();
                        return;
                    }
                    return;
                }
                if (i10 != 6) {
                    throw new IllegalStateException(m());
                }
            }
            throw new IllegalStateException(m());
        }
    }

    public void e() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 == 2) {
                this.f66858e = 3;
                this.f66860g = true;
                return;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new IllegalStateException(m());
                }
                return;
            }
            boolean z10 = !this.f66861h;
            this.f66858e = 5;
            this.f66860g = true;
            if (z10) {
                d();
                w();
            }
        }
    }

    public void f(Throwable th2) {
        List<km.b> list;
        List<kj.c> list2;
        synchronized (this) {
            if (this.f66858e != 8) {
                throw new IllegalStateException(m());
            }
            this.f66858e = 9;
            list = this.f66857d;
            list2 = this.f66856c;
        }
        if (list2 != null) {
            for (kj.c cVar : list2) {
                if (th2 != null) {
                    try {
                        this.f66864k.a().a("javax.servlet.error.exception", th2);
                        this.f66864k.a().a("javax.servlet.error.message", th2.getMessage());
                        cVar.f(this.f66864k);
                    } catch (Exception e10) {
                        f66852n.e(e10);
                    }
                } else {
                    cVar.z(this.f66864k);
                }
            }
        }
        if (list != null) {
            Iterator<km.b> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().g(this);
                } catch (Exception e11) {
                    f66852n.e(e11);
                }
            }
        }
    }

    public final void g(kj.k kVar, kj.p pVar, kj.t tVar) {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 != 1 && i10 != 6) {
                throw new IllegalStateException(m());
            }
            this.f66860g = false;
            this.f66861h = false;
            a aVar = this.f66864k;
            if (aVar != null && pVar == aVar.a() && tVar == this.f66864k.b() && kVar == this.f66864k.h()) {
                this.f66864k.f66868f = null;
                this.f66864k.f66869g = null;
            } else {
                this.f66864k = new a(kVar, pVar, tVar);
            }
            this.f66858e = 2;
            List<kj.c> list = this.f66855b;
            this.f66855b = this.f66856c;
            this.f66856c = list;
            if (list != null) {
                list.clear();
            }
        }
        List<kj.c> list2 = this.f66855b;
        if (list2 != null) {
            Iterator<kj.c> it = list2.iterator();
            while (it.hasNext()) {
                try {
                    it.next().w(this.f66864k);
                } catch (Exception e10) {
                    f66852n.e(e10);
                }
            }
        }
    }

    public void h() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 == 2 || i10 == 3) {
                this.f66858e = 7;
                this.f66860g = false;
            } else if (i10 != 7) {
                throw new IllegalStateException(m());
            }
        }
    }

    public void i() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 == 2 || i10 == 4) {
                List<km.b> list = this.f66857d;
                List<kj.c> list2 = this.f66856c;
                this.f66861h = true;
                if (list2 != null) {
                    Iterator<kj.c> it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().l(this.f66864k);
                        } catch (Exception e10) {
                            f66852n.a(e10);
                            this.f66854a.w().a("javax.servlet.error.exception", e10);
                        }
                    }
                }
                if (list != null) {
                    Iterator<km.b> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().o(this);
                        } catch (Exception e11) {
                            f66852n.e(e11);
                        }
                    }
                }
                synchronized (this) {
                    int i11 = this.f66858e;
                    if (i11 == 2 || i11 == 4) {
                        e();
                    } else if (!this.f66866m) {
                        this.f66861h = false;
                    }
                }
                w();
            }
        }
    }

    public a j() {
        a aVar;
        synchronized (this) {
            aVar = this.f66864k;
        }
        return aVar;
    }

    public String m() {
        String str;
        String string;
        synchronized (this) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = this.f66858e;
            if (i10 == 0) {
                str = "IDLE";
            } else if (i10 == 1) {
                str = "DISPATCHED";
            } else if (i10 == 2) {
                str = "ASYNCSTARTED";
            } else if (i10 == 4) {
                str = "ASYNCWAIT";
            } else if (i10 == 3) {
                str = "REDISPATCHING";
            } else if (i10 == 5) {
                str = "REDISPATCH";
            } else if (i10 == 6) {
                str = "REDISPATCHED";
            } else if (i10 == 7) {
                str = "COMPLETING";
            } else if (i10 == 8) {
                str = "UNCOMPLETED";
            } else if (i10 == 9) {
                str = "COMPLETE";
            } else {
                str = "UNKNOWN?" + this.f66858e;
            }
            sb2.append(str);
            sb2.append(this.f66859f ? ",initial" : "");
            sb2.append(this.f66860g ? ",resumed" : "");
            sb2.append(this.f66861h ? ",expired" : "");
            string = sb2.toString();
        }
        return string;
    }

    public boolean n() {
        synchronized (this) {
            this.f66866m = false;
            int i10 = this.f66858e;
            if (i10 != 0) {
                if (i10 == 7) {
                    this.f66858e = 8;
                    return false;
                }
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 5) {
                    throw new IllegalStateException(m());
                }
                this.f66858e = 6;
                return true;
            }
            this.f66859f = true;
            this.f66858e = 1;
            List<kj.c> list = this.f66855b;
            if (list != null) {
                list.clear();
            }
            List<kj.c> list2 = this.f66856c;
            if (list2 != null) {
                list2.clear();
            } else {
                this.f66856c = this.f66855b;
                this.f66855b = null;
            }
            return true;
        }
    }

    public boolean o() {
        synchronized (this) {
            int i10 = this.f66858e;
            return (i10 == 0 || i10 == 1 || i10 == 8 || i10 == 9) ? false : true;
        }
    }

    public boolean p() {
        synchronized (this) {
            int i10 = this.f66858e;
            return i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
        }
    }

    public boolean r() {
        boolean z10;
        synchronized (this) {
            z10 = this.f66861h;
        }
        return z10;
    }

    public boolean s() {
        boolean z10;
        synchronized (this) {
            z10 = this.f66859f;
        }
        return z10;
    }

    public boolean t() {
        synchronized (this) {
            int i10 = this.f66858e;
            return i10 == 2 || i10 == 3 || i10 == 4 || i10 == 7;
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "@" + m();
        }
        return str;
    }

    public boolean u() {
        boolean z10;
        synchronized (this) {
            z10 = this.f66858e == 8;
        }
        return z10;
    }

    public void v() {
        synchronized (this) {
            int i10 = this.f66858e;
            if (i10 == 1 || i10 == 6) {
                throw new IllegalStateException(m());
            }
            this.f66858e = 0;
            this.f66859f = true;
            this.f66860g = false;
            this.f66861h = false;
            this.f66862i = false;
            d();
            this.f66863j = 30000L;
            this.f66857d = null;
        }
    }

    public void y(rm.b bVar) {
        synchronized (this) {
            this.f66854a = bVar;
        }
    }

    public void z() {
        this.f66862i = false;
        this.f66866m = false;
        g(this.f66854a.w().getServletContext(), this.f66854a.w(), this.f66854a.B());
    }

    public void d() {
        mm.k kVarF = this.f66854a.f();
        if (kVarF.f()) {
            synchronized (this) {
                this.f66865l = 0L;
                notifyAll();
            }
        } else {
            a aVar = this.f66864k;
            if (aVar != null) {
                ((mm.c) kVarF).w(aVar.f66870h);
            }
        }
    }

    @Override // kj.a
    public kj.t getResponse() {
        a aVar;
        return (!this.f66862i || (aVar = this.f66864k) == null || aVar.b() == null) ? this.f66854a.B() : this.f66864k.b();
    }

    public tm.c k() {
        a aVar = this.f66864k;
        if (aVar != null) {
            return ((tm.c.d) aVar.h()).b();
        }
        return null;
    }

    public kj.p l() {
        a aVar = this.f66864k;
        return aVar != null ? aVar.a() : this.f66854a.w();
    }

    public boolean q() {
        return this.f66866m;
    }

    public void w() {
        mm.k kVarF = this.f66854a.f();
        if (kVarF.f()) {
            return;
        }
        ((mm.c) kVarF).v();
    }

    public void x() {
        mm.k kVarF = this.f66854a.f();
        if (this.f66863j > 0) {
            if (!kVarF.f()) {
                ((mm.c) kVarF).n(this.f66864k.f66870h, this.f66863j);
                return;
            }
            synchronized (this) {
                this.f66865l = System.currentTimeMillis() + this.f66863j;
                long jCurrentTimeMillis = this.f66863j;
                while (this.f66865l > 0 && jCurrentTimeMillis > 0 && this.f66854a.D().isRunning()) {
                    try {
                        wait(jCurrentTimeMillis);
                    } catch (InterruptedException e10) {
                        f66852n.h(e10);
                    }
                    jCurrentTimeMillis = this.f66865l - System.currentTimeMillis();
                }
                if (this.f66865l > 0 && jCurrentTimeMillis <= 0 && this.f66854a.D().isRunning()) {
                    i();
                }
            }
        }
    }
}
