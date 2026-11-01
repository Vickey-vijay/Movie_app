package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: OkHttpClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class v implements Cloneable {
    public static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    public static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f37866h, j.f37868j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f37937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f37938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<w> f37939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<j> f37940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<t> f37941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<t> f37942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.c f37943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f37944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f37945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SocketFactory f37946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SSLSocketFactory f37947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.tls.c f37948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HostnameVerifier f37949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f37950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.b f37951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.b f37952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f37953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f37954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f37955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f37956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f37957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f37958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f37959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f37960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f37961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f37962z;

    /* JADX INFO: compiled from: OkHttpClient.java */
    public static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f37500e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f37369c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    /* JADX INFO: compiled from: OkHttpClient.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f37963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Proxy f37964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<w> f37965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<j> f37966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<t> f37967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<t> f37968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o.c f37969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ProxySelector f37970h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l f37971i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public SocketFactory f37972j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public SSLSocketFactory f37973k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.internal.tls.c f37974l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HostnameVerifier f37975m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f37976n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.b f37977o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.b f37978p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i f37979q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public n f37980r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f37981s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f37982t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f37983u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f37984v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f37985w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37986x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37987y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f37988z;

        public b() {
            this.f37967e = new ArrayList();
            this.f37968f = new ArrayList();
            this.f37963a = new m();
            this.f37965c = v.A;
            this.f37966d = v.B;
            this.f37969g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f37970h = proxySelector;
            if (proxySelector == null) {
                this.f37970h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f37971i = l.f37890a;
            this.f37972j = SocketFactory.getDefault();
            this.f37975m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f37862a;
            this.f37976n = f.f37416c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f37379a;
            this.f37977o = bVar;
            this.f37978p = bVar;
            this.f37979q = new i();
            this.f37980r = n.f37899a;
            this.f37981s = true;
            this.f37982t = true;
            this.f37983u = true;
            this.f37984v = 0;
            this.f37985w = 10000;
            this.f37986x = 10000;
            this.f37987y = 10000;
            this.f37988z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f37984v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f37985w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f37980r = nVar;
            return this;
        }

        public b b(boolean z10) {
            this.f37983u = z10;
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f37988z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f37986x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f37987y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f37975m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.f37979q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f37982t = z10;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f37963a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.f37965c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.f37969g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        public b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f37967e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f37968f = arrayList2;
            this.f37963a = vVar.f37937a;
            this.f37964b = vVar.f37938b;
            this.f37965c = vVar.f37939c;
            this.f37966d = vVar.f37940d;
            arrayList.addAll(vVar.f37941e);
            arrayList2.addAll(vVar.f37942f);
            this.f37969g = vVar.f37943g;
            this.f37970h = vVar.f37944h;
            this.f37971i = vVar.f37945i;
            this.f37972j = vVar.f37946j;
            this.f37973k = vVar.f37947k;
            this.f37974l = vVar.f37948l;
            this.f37975m = vVar.f37949m;
            this.f37976n = vVar.f37950n;
            this.f37977o = vVar.f37951o;
            this.f37978p = vVar.f37952p;
            this.f37979q = vVar.f37953q;
            this.f37980r = vVar.f37954r;
            this.f37981s = vVar.f37955s;
            this.f37982t = vVar.f37956t;
            this.f37983u = vVar.f37957u;
            this.f37984v = vVar.f37958v;
            this.f37985w = vVar.f37959w;
            this.f37986x = vVar.f37960x;
            this.f37987y = vVar.f37961y;
            this.f37988z = vVar.f37962z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f37503a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public v(b bVar) {
        boolean z10;
        this.f37937a = bVar.f37963a;
        this.f37938b = bVar.f37964b;
        this.f37939c = bVar.f37965c;
        List<j> list = bVar.f37966d;
        this.f37940d = list;
        this.f37941e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f37967e);
        this.f37942f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f37968f);
        this.f37943g = bVar.f37969g;
        this.f37944h = bVar.f37970h;
        this.f37945i = bVar.f37971i;
        this.f37946j = bVar.f37972j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z10 = (z10 || it.next().b()) ? true : z10;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f37973k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f37947k = a(x509TrustManagerA);
            this.f37948l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f37947k = sSLSocketFactory;
            this.f37948l = bVar.f37974l;
        }
        if (this.f37947k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f37947k);
        }
        this.f37949m = bVar.f37975m;
        this.f37950n = bVar.f37976n.a(this.f37948l);
        this.f37951o = bVar.f37977o;
        this.f37952p = bVar.f37978p;
        this.f37953q = bVar.f37979q;
        this.f37954r = bVar.f37980r;
        this.f37955s = bVar.f37981s;
        this.f37956t = bVar.f37982t;
        this.f37957u = bVar.f37983u;
        this.f37958v = bVar.f37984v;
        this.f37959w = bVar.f37985w;
        this.f37960x = bVar.f37986x;
        this.f37961y = bVar.f37987y;
        this.f37962z = bVar.f37988z;
        if (this.f37941e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f37941e);
        }
        if (this.f37942f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f37942f);
        }
    }

    public SocketFactory A() {
        return this.f37946j;
    }

    public SSLSocketFactory B() {
        return this.f37947k;
    }

    public int C() {
        return this.f37961y;
    }

    public int b() {
        return this.f37958v;
    }

    public f c() {
        return this.f37950n;
    }

    public int e() {
        return this.f37959w;
    }

    public i f() {
        return this.f37953q;
    }

    public List<j> g() {
        return this.f37940d;
    }

    public l i() {
        return this.f37945i;
    }

    public m j() {
        return this.f37937a;
    }

    public n k() {
        return this.f37954r;
    }

    public o.c l() {
        return this.f37943g;
    }

    public boolean m() {
        return this.f37956t;
    }

    public boolean n() {
        return this.f37955s;
    }

    public HostnameVerifier o() {
        return this.f37949m;
    }

    public List<t> p() {
        return this.f37941e;
    }

    public List<t> r() {
        return this.f37942f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f37962z;
    }

    public List<w> u() {
        return this.f37939c;
    }

    public Proxy v() {
        return this.f37938b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f37951o;
    }

    public ProxySelector x() {
        return this.f37944h;
    }

    public int y() {
        return this.f37960x;
    }

    public boolean z() {
        return this.f37957u;
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f37952p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
