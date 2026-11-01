package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: RealConnection.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.mbridge.msdk.thrid.okhttp.internal.http2.g.j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f37545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f37546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f37547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f37548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f37549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w f37550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f37551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f37552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f37553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37556m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f37557n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f37558o = Long.MAX_VALUE;

    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:66:0x0088->B:78:?, LOOP_END, SYNTHETIC] */
    public void a(int i10, int i11, int i12, int i13, boolean z10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f37550g != null) {
            throw new IllegalStateException("already connected");
        }
        List<j> listB = this.f37546c.a().b();
        b bVar = new b(listB);
        if (this.f37546c.a().j() == null) {
            if (!listB.contains(j.f37868j)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strG = this.f37546c.a().k().g();
            if (!com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(strG)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + strG + " not permitted by network security policy"));
            }
        } else if (this.f37546c.a().e().contains(w.H2_PRIOR_KNOWLEDGE)) {
            throw new e(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        e eVar = null;
        while (true) {
            try {
                if (this.f37546c.c()) {
                    a(i10, i11, i12, dVar, oVar);
                    if (this.f37547d == null) {
                        break;
                    }
                } else {
                    try {
                        a(i10, i11, dVar, oVar);
                    } catch (IOException e10) {
                        e = e10;
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37548e);
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37547d);
                        this.f37548e = null;
                        this.f37547d = null;
                        this.f37552i = null;
                        this.f37553j = null;
                        this.f37549f = null;
                        this.f37550g = null;
                        this.f37551h = null;
                        oVar.connectFailed(dVar, this.f37546c.d(), this.f37546c.b(), null, e);
                        if (eVar == null) {
                            eVar = new e(e);
                        } else {
                            eVar.a(e);
                        }
                        if (z10) {
                            throw eVar;
                        }
                        if (bVar.a(e)) {
                            throw eVar;
                        }
                    }
                }
                try {
                    a(bVar, i13, dVar, oVar);
                    oVar.connectEnd(dVar, this.f37546c.d(), this.f37546c.b(), this.f37550g);
                    break;
                } catch (IOException e11) {
                    e = e11;
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37548e);
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37547d);
                    this.f37548e = null;
                    this.f37547d = null;
                    this.f37552i = null;
                    this.f37553j = null;
                    this.f37549f = null;
                    this.f37550g = null;
                    this.f37551h = null;
                    oVar.connectFailed(dVar, this.f37546c.d(), this.f37546c.b(), null, e);
                    if (eVar == null) {
                        eVar = new e(e);
                    } else {
                        eVar.a(e);
                    }
                    if (z10) {
                        throw eVar;
                    }
                    if (bVar.a(e)) {
                        throw eVar;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
        if (this.f37546c.c() && this.f37547d == null) {
            throw new e(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f37551h != null) {
            synchronized (this.f37545b) {
                this.f37556m = this.f37551h.k();
            }
        }
    }

    private y e() throws IOException {
        y yVarA = new y.a().a(this.f37546c.a().k()).a("CONNECT", (z) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37546c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y yVarA2 = this.f37546c.a().g().a(this.f37546c, new a0.a().a(yVarA).a(w.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f37507c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return yVarA2 != null ? yVarA2 : yVarA;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f37549f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.f37546c;
    }

    public void d() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37547d);
    }

    public boolean f() {
        return this.f37551h != null;
    }

    public Socket g() {
        return this.f37548e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f37546c.a().k().g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f37546c.a().k().j());
        sb2.append(", proxy=");
        sb2.append(this.f37546c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f37546c.d());
        sb2.append(" cipherSuite=");
        q qVar = this.f37549f;
        sb2.append(qVar != null ? qVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f37550g);
        sb2.append('}');
        return sb2.toString();
    }

    public c(i iVar, c0 c0Var) {
        this.f37545b = iVar;
        this.f37546c = c0Var;
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y yVarE = e();
        s sVarG = yVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, oVar);
            yVarE = a(i11, i12, yVarE, sVarG);
            if (yVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37547d);
            this.f37547d = null;
            this.f37553j = null;
            this.f37552i = null;
            oVar.connectEnd(dVar, this.f37546c.d(), this.f37546c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy proxyB = this.f37546c.b();
        this.f37547d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f37546c.a().i().createSocket() : new Socket(proxyB);
        oVar.connectStart(dVar, this.f37546c.d(), proxyB);
        this.f37547d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f37547d, this.f37546c.d(), i10);
            try {
                this.f37552i = l.a(l.b(this.f37547d));
                this.f37553j = l.a(l.a(this.f37547d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f37546c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f37546c.a().j() == null) {
            List<w> listE = this.f37546c.a().e();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (listE.contains(wVar)) {
                this.f37548e = this.f37547d;
                this.f37550g = wVar;
                a(i10);
                return;
            } else {
                this.f37548e = this.f37547d;
                this.f37550g = w.HTTP_1_1;
                return;
            }
        }
        oVar.secureConnectStart(dVar);
        a(bVar);
        oVar.secureConnectEnd(dVar, this.f37549f);
        if (this.f37550g == w.HTTP_2) {
            a(i10);
        }
    }

    private void a(int i10) throws IOException {
        this.f37548e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new com.mbridge.msdk.thrid.okhttp.internal.http2.g.h(true).a(this.f37548e, this.f37546c.a().k().g(), this.f37552i, this.f37553j).a(this).a(i10).a();
        this.f37551h = gVarA;
        gVarA.m();
    }

    private void a(b bVar) throws Throwable {
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f37546c.a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) aVarA.j().createSocket(this.f37547d, aVarA.k().g(), aVarA.k().j(), true);
                try {
                    j jVarA = bVar.a(sSLSocket2);
                    if (jVarA.c()) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2, aVarA.k().g(), aVarA.e());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    q qVarA = q.a(session);
                    if (!aVarA.d().verify(aVarA.k().g(), session)) {
                        List<Certificate> listB = qVarA.b();
                        if (!listB.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listB.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
                    }
                    aVarA.a().a(aVarA.k().g(), qVarA.b());
                    String strB = jVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket2) : null;
                    this.f37548e = sSLSocket2;
                    this.f37552i = l.a(l.b(sSLSocket2));
                    this.f37553j = l.a(l.a(this.f37548e));
                    this.f37549f = qVarA;
                    this.f37550g = strB != null ? w.a(strB) : w.HTTP_1_1;
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
                } catch (AssertionError e10) {
                    e = e10;
                    if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private y a(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f37552i, this.f37553j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f37552i.b().a(i10, timeUnit);
            this.f37553j.b().a(i11, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a0VarA = aVar.a(false).a(yVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0VarA);
            if (jA == -1) {
                jA = 0;
            }
            com.mbridge.msdk.thrid.okio.s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = a0VarA.k();
            if (iK == 200) {
                if (this.f37552i.a().f() && this.f37553j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK == 407) {
                y yVarA = this.f37546c.a().g().a(this.f37546c, a0VarA);
                if (yVarA != null) {
                    if ("close".equalsIgnoreCase(a0VarA.b("Connection"))) {
                        return yVarA;
                    }
                    yVar = yVarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a0VarA.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, c0 c0Var) {
        if (this.f37557n.size() >= this.f37556m || this.f37554k || !com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(this.f37546c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f37551h == null || c0Var == null || c0Var.b().type() != Proxy.Type.DIRECT || this.f37546c.b().type() != Proxy.Type.DIRECT || !this.f37546c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f37862a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f37546c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.f37546c.a().k().g())) {
            return true;
        }
        return this.f37549f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f37862a.a(sVar.g(), (X509Certificate) this.f37549f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f37551h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.f37551h);
        }
        this.f37548e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f37552i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f37553j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.f37552i, this.f37553j);
    }

    public boolean a(boolean z10) {
        if (this.f37548e.isClosed() || this.f37548e.isInputShutdown() || this.f37548e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f37551h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f37548e.getSoTimeout();
                try {
                    this.f37548e.setSoTimeout(1);
                    if (this.f37552i.f()) {
                        this.f37548e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f37548e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th2) {
                    this.f37548e.setSoTimeout(soTimeout);
                    throw th2;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f37545b) {
            this.f37556m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.f37550g;
    }
}
