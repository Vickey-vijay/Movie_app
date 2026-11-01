package org.eclipse.jetty.client;

import en.e;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLEngine;
import mm.d;
import mm.i;
import mm.j;
import om.f;
import org.eclipse.jetty.io.nio.SelectChannelEndPoint;

/* JADX INFO: compiled from: SelectConnector.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends ym.b implements org.eclipse.jetty.client.a.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final zm.c f65518q = zm.b.a(b.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f65519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0604b f65520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map<SocketChannel, e.a> f65521p;

    /* JADX INFO: compiled from: SelectConnector.java */
    public class a extends e.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SocketChannel f65522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final HttpDestination f65523i;

        public a(SocketChannel socketChannel, HttpDestination httpDestination) {
            this.f65522h = socketChannel;
            this.f65523i = httpDestination;
        }

        @Override // en.e.a
        public void f() {
            if (this.f65522h.isConnectionPending()) {
                b.f65518q.i("Channel {} timed out while connecting, closing it", this.f65522h);
                i();
                b.this.f65521p.remove(this.f65522h);
                this.f65523i.o(new SocketTimeoutException());
            }
        }

        public final void i() {
            try {
                this.f65522h.close();
            } catch (IOException e10) {
                b.f65518q.h(e10);
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.client.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SelectConnector.java */
    public class C0604b extends org.eclipse.jetty.io.nio.b {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public zm.c f65525x = b.f65518q;

        public final synchronized SSLEngine E0(cn.b bVar, SocketChannel socketChannel) throws IOException {
            SSLEngine sSLEngineY0;
            try {
                sSLEngineY0 = socketChannel != null ? bVar.y0(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : bVar.x0();
                sSLEngineY0.setUseClientMode(true);
                sSLEngineY0.beginHandshake();
            } catch (Throwable th2) {
                throw th2;
            }
            return sSLEngineY0;
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void v0(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void w0(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void x0(i iVar, j jVar) {
        }

        public C0604b() {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public om.a B0(SocketChannel socketChannel, mm.c cVar, Object obj) {
            return new im.c(b.this.f65519n.N(), b.this.f65519n.W(), cVar);
        }

        @Override // org.eclipse.jetty.io.nio.b
        public SelectChannelEndPoint C0(SocketChannel socketChannel, org.eclipse.jetty.io.nio.b.d dVar, SelectionKey selectionKey) throws IOException {
            mm.c cVar;
            e.a aVar = (e.a) b.this.f65521p.remove(socketChannel);
            if (aVar != null) {
                aVar.d();
            }
            if (this.f65525x.f()) {
                this.f65525x.i("Channels with connection pending: {}", Integer.valueOf(b.this.f65521p.size()));
            }
            HttpDestination httpDestination = (HttpDestination) selectionKey.attachment();
            SelectChannelEndPoint selectChannelEndPoint = new SelectChannelEndPoint(socketChannel, dVar, selectionKey, (int) b.this.f65519n.D0());
            if (httpDestination.n()) {
                this.f65525x.i("secure to {}, proxied={}", socketChannel, Boolean.valueOf(httpDestination.m()));
                cVar = new c(selectChannelEndPoint, E0(httpDestination.l(), socketChannel));
            } else {
                cVar = selectChannelEndPoint;
            }
            j jVarB0 = dVar.j().B0(socketChannel, cVar, selectionKey.attachment());
            cVar.o(jVarB0);
            im.a aVar2 = (im.a) jVarB0;
            aVar2.s(httpDestination);
            if (httpDestination.n() && !httpDestination.m()) {
                ((c) cVar).b();
            }
            httpDestination.q(aVar2);
            return selectChannelEndPoint;
        }

        @Override // org.eclipse.jetty.io.nio.b
        public boolean Z(Runnable runnable) {
            return b.this.f65519n.f65511u.Z(runnable);
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void u0(SocketChannel socketChannel, Throwable th2, Object obj) {
            e.a aVar = (e.a) b.this.f65521p.remove(socketChannel);
            if (aVar != null) {
                aVar.d();
            }
            if (obj instanceof HttpDestination) {
                ((HttpDestination) obj).o(th2);
            } else {
                super.u0(socketChannel, th2, obj);
            }
        }
    }

    /* JADX INFO: compiled from: SelectConnector.java */
    public static class c implements mm.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mm.c f65527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SSLEngine f65528c;

        @Override // mm.c
        public void a() {
            this.f65527b.v();
        }

        public void b() {
            im.c cVar = (im.c) this.f65527b.getConnection();
            f fVar = new f(this.f65528c, this.f65527b);
            this.f65527b.o(fVar);
            this.f65527b = fVar.E();
            fVar.E().o(cVar);
            b.f65518q.i("upgrade {} to {} for {}", this, fVar, cVar);
        }

        @Override // mm.k
        public int c() {
            return this.f65527b.c();
        }

        @Override // mm.k
        public void close() throws IOException {
            this.f65527b.close();
        }

        @Override // mm.k
        public int d() {
            return this.f65527b.d();
        }

        @Override // mm.k
        public String e() {
            return this.f65527b.e();
        }

        @Override // mm.k
        public boolean f() {
            return this.f65527b.f();
        }

        @Override // mm.k
        public void flush() throws IOException {
            this.f65527b.flush();
        }

        @Override // mm.k
        public String g() {
            return this.f65527b.g();
        }

        @Override // mm.i
        public j getConnection() {
            return this.f65527b.getConnection();
        }

        @Override // mm.k
        public boolean h(long j10) throws IOException {
            return this.f65527b.h(j10);
        }

        @Override // mm.k
        public int i(d dVar, d dVar2, d dVar3) throws IOException {
            return this.f65527b.i(dVar, dVar2, dVar3);
        }

        @Override // mm.k
        public boolean isOpen() {
            return this.f65527b.isOpen();
        }

        @Override // mm.k
        public void j() throws IOException {
            this.f65527b.j();
        }

        @Override // mm.k
        public boolean k(long j10) throws IOException {
            return this.f65527b.k(j10);
        }

        @Override // mm.k
        public void l() throws IOException {
            this.f65527b.l();
        }

        @Override // mm.c
        public boolean m() {
            return this.f65527b.m();
        }

        @Override // mm.c
        public void n(e.a aVar, long j10) {
            this.f65527b.n(aVar, j10);
        }

        @Override // mm.i
        public void o(j jVar) {
            this.f65527b.o(jVar);
        }

        @Override // mm.k
        public int p() {
            return this.f65527b.p();
        }

        @Override // mm.k
        public void q(int i10) throws IOException {
            this.f65527b.q(i10);
        }

        @Override // mm.k
        public String r() {
            return this.f65527b.r();
        }

        @Override // mm.k
        public boolean s() {
            return this.f65527b.s();
        }

        public String toString() {
            return "Upgradable:" + this.f65527b.toString();
        }

        @Override // mm.k
        public int u(d dVar) throws IOException {
            return this.f65527b.u(dVar);
        }

        @Override // mm.c
        public void v() {
            this.f65527b.v();
        }

        @Override // mm.c
        public void w(e.a aVar) {
            this.f65527b.w(aVar);
        }

        @Override // mm.k
        public boolean x() {
            return this.f65527b.x();
        }

        @Override // mm.k
        public int y(d dVar) throws IOException {
            return this.f65527b.y(dVar);
        }

        public c(mm.c cVar, SSLEngine sSLEngine) throws IOException {
            this.f65528c = sSLEngine;
            this.f65527b = cVar;
        }
    }

    @Override // org.eclipse.jetty.client.a.b
    public void K(HttpDestination httpDestination) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            im.b bVarJ = httpDestination.m() ? httpDestination.j() : httpDestination.f();
            socketChannelOpen.socket().setTcpNoDelay(true);
            if (this.f65519n.M0()) {
                socketChannelOpen.socket().connect(bVarJ.c(), this.f65519n.A0());
                socketChannelOpen.configureBlocking(false);
                this.f65520o.D0(socketChannelOpen, httpDestination);
                return;
            }
            socketChannelOpen.configureBlocking(false);
            socketChannelOpen.connect(bVarJ.c());
            this.f65520o.D0(socketChannelOpen, httpDestination);
            a aVar = new a(socketChannelOpen, httpDestination);
            org.eclipse.jetty.client.a aVar2 = this.f65519n;
            aVar2.R0(aVar, aVar2.A0());
            this.f65521p.put(socketChannelOpen, aVar);
        } catch (IOException e10) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.o(e10);
        } catch (UnresolvedAddressException e11) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.o(e11);
        }
    }

    public b(org.eclipse.jetty.client.a aVar) {
        C0604b c0604b = new C0604b();
        this.f65520o = c0604b;
        this.f65521p = new ConcurrentHashMap();
        this.f65519n = aVar;
        n0(aVar, false);
        n0(c0604b, true);
    }
}
