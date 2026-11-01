package org.eclipse.jetty.client;

import im.f;
import im.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import lm.g;
import mm.d;
import mm.h;
import mm.k;
import org.eclipse.jetty.http.PathMap;
import ym.e;

/* JADX INFO: loaded from: classes9.dex */
public class HttpDestination implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f65486s = zm.b.a(HttpDestination.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f65491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final im.b f65492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f65493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cn.b f65494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f65495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f65496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f65497l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile im.b f65500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public jm.a f65501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PathMap f65502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<g> f65503r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i> f65487b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<im.a> f65488c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue<Object> f65489d = new ArrayBlockingQueue(10, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<im.a> f65490e = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f65498m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f65499n = 0;

    public class a extends f {
        public final b.c E;

        public a(im.b bVar, b.c cVar) {
            this.E = cVar;
            O("CONNECT");
            String string = bVar.toString();
            U(string);
            c("Host", string);
            c("Proxy-Connection", "keep-alive");
            c("User-Agent", "Jetty-Client");
        }

        @Override // im.i
        public void A() {
            i iVar;
            synchronized (HttpDestination.this) {
                iVar = !HttpDestination.this.f65487b.isEmpty() ? (i) HttpDestination.this.f65487b.remove(0) : null;
            }
            if (iVar == null || !iVar.Y(8)) {
                return;
            }
            iVar.k().h();
        }

        @Override // im.i
        public void y(Throwable th2) {
            HttpDestination.this.o(th2);
        }

        @Override // im.i
        public void z(Throwable th2) {
            i iVar;
            synchronized (HttpDestination.this) {
                iVar = !HttpDestination.this.f65487b.isEmpty() ? (i) HttpDestination.this.f65487b.remove(0) : null;
            }
            if (iVar == null || !iVar.Y(9)) {
                return;
            }
            iVar.k().f(th2);
        }

        @Override // im.i
        public void D() throws IOException {
            int iF0 = f0();
            if (iF0 == 200) {
                this.E.b();
                return;
            }
            if (iF0 == 504) {
                A();
                return;
            }
            z(new ProtocolException("Proxy: " + this.E.e() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.E.p() + " didn't return http return code 200, but " + iF0));
        }
    }

    public void b(String str, jm.a aVar) {
        synchronized (this) {
            if (this.f65502q == null) {
                this.f65502q = new PathMap();
            }
            this.f65502q.put(str, aVar);
        }
    }

    public void c() throws IOException {
        synchronized (this) {
            Iterator<im.a> it = this.f65488c.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
        }
    }

    public void d(i iVar) throws IOException {
        boolean z10;
        jm.a aVar;
        synchronized (this) {
            List<g> list = this.f65503r;
            if (list != null) {
                StringBuilder sb2 = null;
                for (g gVar : list) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    } else {
                        sb2.append("; ");
                    }
                    sb2.append(gVar.d());
                    sb2.append("=");
                    sb2.append(gVar.f());
                }
                if (sb2 != null) {
                    iVar.c("Cookie", sb2.toString());
                }
            }
        }
        PathMap pathMap = this.f65502q;
        if (pathMap != null && (aVar = (jm.a) pathMap.match(iVar.q())) != null) {
            aVar.a(iVar);
        }
        iVar.L(this);
        im.a aVarI = i();
        if (aVarI != null) {
            u(aVarI, iVar);
            return;
        }
        synchronized (this) {
            if (this.f65487b.size() == this.f65497l) {
                throw new RejectedExecutionException("Queue full for address " + this.f65492g);
            }
            this.f65487b.add(iVar);
            z10 = this.f65488c.size() + this.f65498m < this.f65496k;
        }
        if (z10) {
            y();
        }
    }

    public void e(i iVar) {
        synchronized (this) {
            this.f65487b.remove(iVar);
        }
    }

    public im.a i() throws IOException {
        im.a aVarRemove = null;
        do {
            synchronized (this) {
                if (aVarRemove != null) {
                    this.f65488c.remove(aVarRemove);
                    aVarRemove.l();
                    aVarRemove = null;
                }
                if (this.f65490e.size() > 0) {
                    List<im.a> list = this.f65490e;
                    aVarRemove = list.remove(list.size() - 1);
                }
            }
            if (aVarRemove == null) {
                return null;
            }
        } while (!aVarRemove.k());
        return aVarRemove;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public void o(Throwable th2) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            this.f65498m--;
            int i10 = this.f65499n;
            if (i10 > 0) {
                this.f65499n = i10 - 1;
                z10 = false;
            } else {
                if (this.f65487b.size() > 0) {
                    i iVarRemove = this.f65487b.remove(0);
                    if (iVarRemove.Y(9)) {
                        iVarRemove.k().a(th2);
                    }
                    if (this.f65487b.isEmpty() || !this.f65491f.isStarted()) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                th2 = null;
            }
        }
        if (z10) {
            y();
        }
        if (th2 != null) {
            try {
                this.f65489d.put(th2);
            } catch (InterruptedException e10) {
                f65486s.h(e10);
            }
        }
    }

    public void p(Throwable th2) {
        synchronized (this) {
            this.f65498m--;
            if (this.f65487b.size() > 0) {
                i iVarRemove = this.f65487b.remove(0);
                if (iVarRemove.Y(9)) {
                    iVarRemove.k().f(th2);
                }
            }
        }
    }

    public void q(im.a aVar) throws IOException {
        synchronized (this) {
            this.f65498m--;
            this.f65488c.add(aVar);
            int i10 = this.f65499n;
            if (i10 > 0) {
                this.f65499n = i10 - 1;
            } else {
                k kVarF = aVar.f();
                if (m() && (kVarF instanceof b.c)) {
                    a aVar2 = new a(f(), (b.c) kVarF);
                    aVar2.M(j());
                    f65486s.i("Establishing tunnel to {} via {}", f(), j());
                    u(aVar, aVar2);
                } else if (this.f65487b.size() == 0) {
                    f65486s.i("No exchanges for new connection {}", aVar);
                    aVar.t();
                    this.f65490e.add(aVar);
                } else {
                    u(aVar, this.f65487b.remove(0));
                }
                aVar = null;
            }
        }
        if (aVar != null) {
            try {
                this.f65489d.put(aVar);
            } catch (InterruptedException e10) {
                f65486s.h(e10);
            }
        }
    }

    public synchronized String toString() {
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", Integer.valueOf(hashCode()), this.f65492g.a(), Integer.valueOf(this.f65492g.b()), Integer.valueOf(this.f65488c.size()), Integer.valueOf(this.f65496k), Integer.valueOf(this.f65490e.size()), Integer.valueOf(this.f65487b.size()), Integer.valueOf(this.f65497l));
    }

    public void u(im.a aVar, i iVar) throws IOException {
        synchronized (this) {
            if (!aVar.r(iVar)) {
                if (iVar.s() <= 1) {
                    this.f65487b.add(0, iVar);
                }
                t(aVar);
            }
        }
    }

    public void v(i iVar) throws IOException {
        iVar.Y(1);
        LinkedList<String> linkedListH0 = this.f65491f.H0();
        if (linkedListH0 != null) {
            for (int size = linkedListH0.size(); size > 0; size--) {
                String str = linkedListH0.get(size - 1);
                try {
                    iVar.N((im.g) Class.forName(str).getDeclaredConstructor(HttpDestination.class, i.class).newInstance(this, iVar));
                } catch (Exception e10) {
                    throw new IOException("Unable to instantiate registered listener for destination: " + str, e10) { // from class: org.eclipse.jetty.client.HttpDestination.1
                        public final /* synthetic */ Exception val$e;

                        {
                            this.val$e = e10;
                            initCause(e10);
                        }
                    };
                }
            }
        }
        if (this.f65491f.L0()) {
            iVar.N(new jm.f(this, iVar));
        }
        d(iVar);
    }

    public void y() {
        try {
            synchronized (this) {
                this.f65498m++;
            }
            org.eclipse.jetty.client.a.b bVar = this.f65491f.f65512v;
            if (bVar != null) {
                bVar.K(this);
            }
        } catch (Exception e10) {
            f65486s.a(e10);
            o(e10);
        }
    }

    @Override // ym.e
    public void z(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this));
            appendable.append("idle=");
            appendable.append(String.valueOf(this.f65490e.size()));
            appendable.append(" pending=");
            appendable.append(String.valueOf(this.f65498m));
            appendable.append("\n");
            ym.b.p0(appendable, str, this.f65488c);
        }
    }

    public im.b f() {
        return this.f65492g;
    }

    public d g() {
        return this.f65495j;
    }

    public org.eclipse.jetty.client.a h() {
        return this.f65491f;
    }

    public im.b j() {
        return this.f65500o;
    }

    public jm.a k() {
        return this.f65501p;
    }

    public cn.b l() {
        return this.f65494i;
    }

    public boolean m() {
        return this.f65500o != null;
    }

    public boolean n() {
        return this.f65493h;
    }

    public void w(im.b bVar) {
        this.f65500o = bVar;
    }

    public void x(jm.a aVar) {
        this.f65501p = aVar;
    }

    public HttpDestination(org.eclipse.jetty.client.a aVar, im.b bVar, boolean z10, cn.b bVar2) {
        int i10;
        this.f65491f = aVar;
        this.f65492g = bVar;
        this.f65493h = z10;
        this.f65494i = bVar2;
        this.f65496k = aVar.E0();
        this.f65497l = aVar.F0();
        String strA = bVar.a();
        int iB = bVar.b();
        if (z10) {
            i10 = 443;
        } else {
            i10 = 80;
        }
        if (iB != i10) {
            strA = strA + StringUtils.PROCESS_POSTFIX_DELIMITER + bVar.b();
        }
        this.f65495j = new h(strA);
    }

    public void r(i iVar) throws IOException {
        iVar.k().b();
        iVar.K();
        d(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    public void s(im.a aVar, boolean z10) throws IOException {
        boolean z11;
        List<g> list;
        boolean z12 = false;
        if (aVar.o()) {
            aVar.u(false);
        }
        if (z10) {
            try {
                aVar.l();
            } catch (IOException e10) {
                f65486s.h(e10);
            }
        }
        if (!this.f65491f.isStarted()) {
            return;
        }
        if (!z10 && aVar.f().isOpen()) {
            synchronized (this) {
                if (this.f65487b.size() == 0) {
                    aVar.t();
                    this.f65490e.add(aVar);
                } else {
                    u(aVar, this.f65487b.remove(0));
                }
                notifyAll();
            }
            return;
        }
        synchronized (this) {
            this.f65488c.remove(aVar);
            z11 = true;
            if (this.f65487b.isEmpty()) {
                if (!this.f65491f.N0() || (((list = this.f65503r) != null && !list.isEmpty()) || !this.f65488c.isEmpty() || !this.f65490e.isEmpty())) {
                    z11 = false;
                }
            } else if (this.f65491f.isStarted()) {
                z12 = true;
                z11 = false;
            } else {
                z11 = false;
            }
        }
        if (z12) {
            y();
        }
        if (z11) {
            this.f65491f.P0(this);
        }
    }

    public void t(im.a aVar) {
        long jD;
        boolean z10;
        boolean z11;
        List<g> list;
        if (aVar.f() != null) {
            jD = aVar.f().d();
        } else {
            jD = -1;
        }
        aVar.a(jD);
        synchronized (this) {
            this.f65490e.remove(aVar);
            this.f65488c.remove(aVar);
            z10 = true;
            z11 = false;
            if (this.f65487b.isEmpty()) {
                if (!this.f65491f.N0() || (((list = this.f65503r) != null && !list.isEmpty()) || !this.f65488c.isEmpty() || !this.f65490e.isEmpty())) {
                    z10 = false;
                }
                z11 = z10;
                z10 = false;
            } else if (!this.f65491f.isStarted()) {
                z10 = false;
            }
        }
        if (z10) {
            y();
        }
        if (z11) {
            this.f65491f.P0(this);
        }
    }
}
