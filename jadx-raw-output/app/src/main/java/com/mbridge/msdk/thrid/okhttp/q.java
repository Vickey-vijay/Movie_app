package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: Handshake.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f37908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f37909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f37910d;

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (Constraint.NONE.equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.emptyList());
    }

    public List<Certificate> b() {
        return this.f37909c;
    }

    public d0 c() {
        return this.f37907a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f37907a.equals(qVar.f37907a) && this.f37908b.equals(qVar.f37908b) && this.f37909c.equals(qVar.f37909c) && this.f37910d.equals(qVar.f37910d);
    }

    public int hashCode() {
        return ((((((this.f37907a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37908b.hashCode()) * 31) + this.f37909c.hashCode()) * 31) + this.f37910d.hashCode();
    }

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f37907a = d0Var;
        this.f37908b = gVar;
        this.f37909c = list;
        this.f37910d = list2;
    }

    public g a() {
        return this.f37908b;
    }
}
