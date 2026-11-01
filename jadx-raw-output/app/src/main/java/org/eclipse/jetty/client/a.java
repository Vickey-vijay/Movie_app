package org.eclipse.jetty.client;

import en.e;
import im.i;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lm.d;
import lm.l;
import org.eclipse.jetty.io.Buffers;
import ym.f;

/* JADX INFO: compiled from: HttpClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends ym.b implements d, xm.b {
    public e A;
    public im.b B;
    public jm.a C;
    public Set<String> D;
    public int E;
    public int F;
    public LinkedList<String> G;
    public final cn.b H;
    public jm.e I;
    public xm.c J;
    public final lm.e K;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f65504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f65505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f65506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f65507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f65509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ConcurrentMap<im.b, HttpDestination> f65510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public en.d f65511u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f65512v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f65513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f65514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f65515y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f65516z;

    /* JADX INFO: renamed from: org.eclipse.jetty.client.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpClient.java */
    public class RunnableC0603a implements Runnable {
        public RunnableC0603a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (a.this.isRunning()) {
                a.this.f65516z.m(System.currentTimeMillis());
                a.this.A.m(a.this.f65516z.e());
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: HttpClient.java */
    public interface b extends f {
        void K(HttpDestination httpDestination) throws IOException;
    }

    /* JADX INFO: compiled from: HttpClient.java */
    public static class c extends en.b {
        public c() {
        }

        public /* synthetic */ c(RunnableC0603a runnableC0603a) {
            this();
        }
    }

    public a() {
        this(new cn.b());
    }

    public a(cn.b bVar) {
        this.f65504n = 2;
        this.f65505o = true;
        this.f65506p = true;
        this.f65507q = false;
        this.f65508r = Integer.MAX_VALUE;
        this.f65509s = Integer.MAX_VALUE;
        this.f65510t = new ConcurrentHashMap();
        this.f65513w = 20000L;
        this.f65514x = 320000L;
        this.f65515y = 75000;
        this.f65516z = new e();
        this.A = new e();
        this.E = 3;
        this.F = 20;
        this.J = new xm.c();
        lm.e eVar = new lm.e();
        this.K = eVar;
        this.H = bVar;
        m0(bVar);
        m0(eVar);
    }

    public int A0() {
        return this.f65515y;
    }

    public HttpDestination C0(im.b bVar, boolean z10, cn.b bVar2) throws IOException {
        Set<String> set;
        if (bVar == null) {
            throw new UnknownHostException("Remote socket address cannot be null.");
        }
        HttpDestination httpDestination = this.f65510t.get(bVar);
        if (httpDestination != null) {
            return httpDestination;
        }
        HttpDestination httpDestination2 = new HttpDestination(this, bVar, z10, bVar2);
        if (this.B != null && ((set = this.D) == null || !set.contains(bVar.a()))) {
            httpDestination2.w(this.B);
            jm.a aVar = this.C;
            if (aVar != null) {
                httpDestination2.x(aVar);
            }
        }
        HttpDestination httpDestinationPutIfAbsent = this.f65510t.putIfAbsent(bVar, httpDestination2);
        return httpDestinationPutIfAbsent != null ? httpDestinationPutIfAbsent : httpDestination2;
    }

    public long D0() {
        return this.f65513w;
    }

    public int E0() {
        return this.f65508r;
    }

    public int F0() {
        return this.f65509s;
    }

    public jm.e G0() {
        return this.I;
    }

    public LinkedList<String> H0() {
        return this.G;
    }

    public cn.b I0() {
        return this.H;
    }

    public en.d J0() {
        return this.f65511u;
    }

    public long K0() {
        return this.f65514x;
    }

    public boolean L0() {
        return this.I != null;
    }

    public boolean M0() {
        return this.f65506p;
    }

    @Override // lm.d
    public Buffers N() {
        return this.K.N();
    }

    public boolean N0() {
        return this.f65507q;
    }

    public int O0() {
        return this.E;
    }

    public void P0(HttpDestination httpDestination) {
        this.f65510t.remove(httpDestination.f(), httpDestination);
    }

    public void Q0(e.a aVar) {
        this.f65516z.g(aVar);
    }

    public void R0(e.a aVar, long j10) {
        e eVar = this.f65516z;
        eVar.h(aVar, j10 - eVar.d());
    }

    public void S0(e.a aVar) {
        this.A.g(aVar);
    }

    public void T0(i iVar) throws IOException {
        B0(iVar.j(), l.f63843b.j0(iVar.r())).v(iVar);
    }

    public final void U0() {
        if (this.f65504n == 0) {
            lm.e eVar = this.K;
            Buffers.Type type = Buffers.Type.BYTE_ARRAY;
            eVar.n0(type);
            this.K.o0(type);
            this.K.p0(type);
            this.K.q0(type);
            return;
        }
        lm.e eVar2 = this.K;
        Buffers.Type type2 = Buffers.Type.DIRECT;
        eVar2.n0(type2);
        this.K.o0(this.f65505o ? type2 : Buffers.Type.INDIRECT);
        this.K.p0(type2);
        lm.e eVar3 = this.K;
        if (!this.f65505o) {
            type2 = Buffers.Type.INDIRECT;
        }
        eVar3.q0(type2);
    }

    public void V0(int i10) {
        this.f65515y = i10;
    }

    @Override // lm.d
    public Buffers W() {
        return this.K.W();
    }

    public void W0(int i10) {
        this.E = i10;
    }

    public void X0(en.d dVar) {
        w0(this.f65511u);
        this.f65511u = dVar;
        m0(dVar);
    }

    public void Y0(long j10) {
        this.f65514x = j10;
    }

    @Override // xm.b
    public void a(String str, Object obj) {
        this.J.a(str, obj);
    }

    @Override // ym.b, ym.a
    public void e0() throws Exception {
        Iterator<HttpDestination> it = this.f65510t.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f65516z.b();
        this.A.b();
        super.e0();
        en.d dVar = this.f65511u;
        if (dVar instanceof c) {
            w0(dVar);
            this.f65511u = null;
        }
        w0(this.f65512v);
    }

    @Override // xm.b
    public Object getAttribute(String str) {
        return this.J.getAttribute(str);
    }

    @Override // xm.b
    public void removeAttribute(String str) {
        this.J.removeAttribute(str);
    }

    @Override // xm.b
    public void y() {
        this.J.y();
    }

    public HttpDestination B0(im.b bVar, boolean z10) throws IOException {
        return C0(bVar, z10, I0());
    }

    @Override // ym.b, ym.a
    public void d0() throws Exception {
        b cVar;
        U0();
        this.f65516z.i(this.f65514x);
        this.f65516z.j();
        this.A.i(this.f65513w);
        this.A.j();
        if (this.f65511u == null) {
            c cVar2 = new c(null);
            cVar2.D0(16);
            cVar2.C0(true);
            cVar2.E0("HttpClient");
            this.f65511u = cVar2;
            n0(cVar2, true);
        }
        if (this.f65504n == 2) {
            cVar = new org.eclipse.jetty.client.b(this);
        } else {
            cVar = new org.eclipse.jetty.client.c(this);
        }
        this.f65512v = cVar;
        n0(cVar, true);
        super.d0();
        this.f65511u.Z(new RunnableC0603a());
    }

    public void z0(e.a aVar) {
        aVar.d();
    }
}
