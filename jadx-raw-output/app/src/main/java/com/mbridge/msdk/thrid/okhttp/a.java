package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: Address.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f37343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f37344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f37345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f37346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<w> f37347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<j> f37348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f37349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Proxy f37350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f37351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f37352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f37353k;

    public f a() {
        return this.f37353k;
    }

    public boolean a(a aVar) {
        return this.f37344b.equals(aVar.f37344b) && this.f37346d.equals(aVar.f37346d) && this.f37347e.equals(aVar.f37347e) && this.f37348f.equals(aVar.f37348f) && this.f37349g.equals(aVar.f37349g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37350h, aVar.f37350h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37351i, aVar.f37351i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37352j, aVar.f37352j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37353k, aVar.f37353k) && k().j() == aVar.k().j();
    }

    public List<j> b() {
        return this.f37348f;
    }

    public n c() {
        return this.f37344b;
    }

    public HostnameVerifier d() {
        return this.f37352j;
    }

    public List<w> e() {
        return this.f37347e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f37343a.equals(aVar.f37343a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public Proxy f() {
        return this.f37350h;
    }

    public b g() {
        return this.f37346d;
    }

    public ProxySelector h() {
        return this.f37349g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f37343a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37344b.hashCode()) * 31) + this.f37346d.hashCode()) * 31) + this.f37347e.hashCode()) * 31) + this.f37348f.hashCode()) * 31) + this.f37349g.hashCode()) * 31;
        Proxy proxy = this.f37350h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f37351i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f37352j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f37353k;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.f37345c;
    }

    public SSLSocketFactory j() {
        return this.f37351i;
    }

    public s k() {
        return this.f37343a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f37343a.g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f37343a.j());
        if (this.f37350h != null) {
            sb2.append(", proxy=");
            sb2.append(this.f37350h);
        } else {
            sb2.append(", proxySelector=");
            sb2.append(this.f37349g);
        }
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }

    public a(String str, int i10, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        String str2;
        s.a aVar = new s.a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.f37343a = aVar.f(str2).b(str).a(i10).a();
        if (nVar != null) {
            this.f37344b = nVar;
            if (socketFactory != null) {
                this.f37345c = socketFactory;
                if (bVar != null) {
                    this.f37346d = bVar;
                    if (list != null) {
                        this.f37347e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
                        if (list2 != null) {
                            this.f37348f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
                            if (proxySelector != null) {
                                this.f37349g = proxySelector;
                                this.f37350h = proxy;
                                this.f37351i = sSLSocketFactory;
                                this.f37352j = hostnameVerifier;
                                this.f37353k = fVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }
}
