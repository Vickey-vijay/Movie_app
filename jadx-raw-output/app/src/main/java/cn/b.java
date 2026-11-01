package cn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CRL;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.eclipse.jetty.util.security.Password;
import xm.j;
import zm.c;

/* JADX INFO: compiled from: SslContextFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends ym.a {
    public static final TrustManager[] U = {new a()};
    public static final c V = zm.b.a(b.class);
    public static final String W;
    public static final String X;
    public static final String Y;
    public transient Password A;
    public transient Password B;
    public transient Password C;
    public String D;
    public String F;
    public boolean I;
    public boolean J;
    public String L;
    public String O;
    public KeyStore P;
    public KeyStore Q;
    public SSLContext S;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f6136p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InputStream f6138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f6140t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f6141u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InputStream f6143w;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set<String> f6131k = new LinkedHashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Set<String> f6132l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<String> f6133m = new LinkedHashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Set<String> f6134n = new LinkedHashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f6137q = "JKS";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6142v = "JKS";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6144x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6145y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6146z = true;
    public String E = "TLS";
    public String G = W;
    public String H = X;
    public int K = -1;
    public boolean M = false;
    public boolean N = false;
    public boolean R = true;
    public boolean T = true;

    /* JADX INFO: compiled from: SslContextFactory.java */
    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    static {
        W = Security.getProperty("ssl.KeyManagerFactory.algorithm") == null ? "SunX509" : Security.getProperty("ssl.KeyManagerFactory.algorithm");
        X = Security.getProperty("ssl.TrustManagerFactory.algorithm") != null ? Security.getProperty("ssl.TrustManagerFactory.algorithm") : "SunX509";
        Y = System.getProperty("user.home") + File.separator + ".keystore";
    }

    public KeyManager[] o0(KeyStore keyStore) throws Exception {
        KeyManager[] keyManagers = null;
        if (keyStore != null) {
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(this.G);
            Password password = this.B;
            keyManagerFactory.init(keyStore, (password == null && (password = this.A) == null) ? null : password.toString().toCharArray());
            keyManagers = keyManagerFactory.getKeyManagers();
            if (this.f6139s != null) {
                for (int i10 = 0; i10 < keyManagers.length; i10++) {
                    if (keyManagers[i10] instanceof X509KeyManager) {
                        keyManagers[i10] = new cn.a(this.f6139s, (X509KeyManager) keyManagers[i10]);
                    }
                }
            }
        }
        return keyManagers;
    }

    public String toString() {
        return String.format("%s@%x(%s,%s)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f6135o, this.f6140t);
    }

    public String[] A0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.f6134n.isEmpty()) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        } else {
            for (String str : this.f6134n) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        }
        Set<String> set = this.f6133m;
        if (set != null) {
            linkedHashSet.removeAll(set);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String[] B0(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.f6132l.isEmpty()) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        } else {
            for (String str : this.f6132l) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        }
        Set<String> set = this.f6131k;
        if (set != null) {
            linkedHashSet.removeAll(set);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    @Override // ym.a
    public void d0() throws Exception {
        String str;
        TrustManager[] trustManagerArr;
        if (this.S == null) {
            if (this.P == null && this.f6138r == null && this.f6135o == null && this.Q == null && this.f6143w == null && this.f6140t == null) {
                if (this.T) {
                    V.i("No keystore or trust store configured.  ACCEPTING UNTRUSTED CERTIFICATES!!!!!", new Object[0]);
                    trustManagerArr = U;
                } else {
                    trustManagerArr = null;
                }
                String str2 = this.F;
                SecureRandom secureRandom = str2 == null ? null : SecureRandom.getInstance(str2);
                String str3 = this.D;
                SSLContext sSLContext = str3 == null ? SSLContext.getInstance(this.E) : SSLContext.getInstance(this.E, str3);
                this.S = sSLContext;
                sSLContext.init(null, trustManagerArr, secureRandom);
                return;
            }
            m0();
            KeyStore keyStoreV0 = v0();
            KeyStore keyStoreW0 = w0();
            Collection<? extends CRL> collectionU0 = u0(this.L);
            if (this.I && keyStoreV0 != null) {
                if (this.f6139s == null) {
                    ArrayList list = Collections.list(keyStoreV0.aliases());
                    this.f6139s = list.size() == 1 ? (String) list.get(0) : null;
                }
                String str4 = this.f6139s;
                Certificate certificate = str4 == null ? null : keyStoreV0.getCertificate(str4);
                if (certificate == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No certificate found in the keystore");
                    if (this.f6139s == null) {
                        str = "";
                    } else {
                        str = " for alias " + this.f6139s;
                    }
                    sb2.append(str);
                    throw new Exception(sb2.toString());
                }
                bn.b bVar = new bn.b(keyStoreW0, collectionU0);
                bVar.c(this.K);
                bVar.a(this.M);
                bVar.b(this.N);
                bVar.d(this.O);
                bVar.e(keyStoreV0, certificate);
            }
            KeyManager[] keyManagerArrO0 = o0(keyStoreV0);
            TrustManager[] trustManagerArrR0 = r0(keyStoreW0, collectionU0);
            String str5 = this.F;
            SecureRandom secureRandom2 = str5 != null ? SecureRandom.getInstance(str5) : null;
            String str6 = this.D;
            SSLContext sSLContext2 = str6 == null ? SSLContext.getInstance(this.E) : SSLContext.getInstance(this.E, str6);
            this.S = sSLContext2;
            sSLContext2.init(keyManagerArrO0, trustManagerArrR0, secureRandom2);
            SSLEngine sSLEngineX0 = x0();
            c cVar = V;
            cVar.k("Enabled Protocols {} of {}", Arrays.asList(sSLEngineX0.getEnabledProtocols()), Arrays.asList(sSLEngineX0.getSupportedProtocols()));
            if (cVar.f()) {
                cVar.i("Enabled Ciphers   {} of {}", Arrays.asList(sSLEngineX0.getEnabledCipherSuites()), Arrays.asList(sSLEngineX0.getSupportedCipherSuites()));
            }
        }
    }

    public void m0() {
        if (this.S != null) {
            return;
        }
        KeyStore keyStore = this.P;
        if (keyStore == null && this.f6138r == null && this.f6135o == null) {
            throw new IllegalStateException("SSL doesn't have a valid keystore");
        }
        if (this.Q == null && this.f6143w == null && this.f6140t == null) {
            this.Q = keyStore;
            this.f6140t = this.f6135o;
            this.f6143w = this.f6138r;
            this.f6142v = this.f6137q;
            this.f6141u = this.f6136p;
            this.C = this.A;
            this.H = this.G;
        }
        InputStream inputStream = this.f6138r;
        if (inputStream == null || inputStream != this.f6143w) {
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            j.c(this.f6138r, byteArrayOutputStream);
            this.f6138r.close();
            this.f6138r = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            this.f6143w = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public boolean q0() {
        return this.f6144x;
    }

    public TrustManager[] r0(KeyStore keyStore, Collection<? extends CRL> collection) throws Exception {
        if (keyStore == null) {
            return null;
        }
        if (!this.J || !this.H.equalsIgnoreCase("PKIX")) {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(this.H);
            trustManagerFactory.init(keyStore);
            return trustManagerFactory.getTrustManagers();
        }
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, new X509CertSelector());
        pKIXBuilderParameters.setMaxPathLength(this.K);
        pKIXBuilderParameters.setRevocationEnabled(true);
        if (collection != null && !collection.isEmpty()) {
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(collection)));
        }
        if (this.M) {
            System.setProperty("com.sun.security.enableCRLDP", "true");
        }
        if (this.N) {
            Security.setProperty("ocsp.enable", "true");
            String str = this.O;
            if (str != null) {
                Security.setProperty("ocsp.responderURL", str);
            }
        }
        TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(this.H);
        trustManagerFactory2.init(new CertPathTrustManagerParameters(pKIXBuilderParameters));
        return trustManagerFactory2.getTrustManagers();
    }

    public boolean s0() {
        return this.f6145y;
    }

    public boolean t0() {
        return this.R;
    }

    public KeyStore v0() throws Exception {
        KeyStore keyStore = this.P;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f6138r;
        String str = this.f6135o;
        String str2 = this.f6137q;
        String str3 = this.f6136p;
        Password password = this.A;
        return p0(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    public KeyStore w0() throws Exception {
        KeyStore keyStore = this.Q;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this.f6143w;
        String str = this.f6140t;
        String str2 = this.f6142v;
        String str3 = this.f6141u;
        Password password = this.C;
        return p0(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    public SSLEngine x0() {
        SSLEngine sSLEngineCreateSSLEngine = this.S.createSSLEngine();
        n0(sSLEngineCreateSSLEngine);
        return sSLEngineCreateSSLEngine;
    }

    public SSLSocket z0() throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.S.getSocketFactory().createSocket();
        if (s0()) {
            sSLSocket.setWantClientAuth(s0());
        }
        if (q0()) {
            sSLSocket.setNeedClientAuth(q0());
        }
        sSLSocket.setEnabledCipherSuites(A0(sSLSocket.getEnabledCipherSuites(), sSLSocket.getSupportedCipherSuites()));
        sSLSocket.setEnabledProtocols(B0(sSLSocket.getEnabledProtocols(), sSLSocket.getSupportedProtocols()));
        return sSLSocket;
    }

    public void n0(SSLEngine sSLEngine) {
        if (s0()) {
            sSLEngine.setWantClientAuth(s0());
        }
        if (q0()) {
            sSLEngine.setNeedClientAuth(q0());
        }
        sSLEngine.setEnabledCipherSuites(A0(sSLEngine.getEnabledCipherSuites(), sSLEngine.getSupportedCipherSuites()));
        sSLEngine.setEnabledProtocols(B0(sSLEngine.getEnabledProtocols(), sSLEngine.getSupportedProtocols()));
    }

    @Deprecated
    public KeyStore p0(InputStream inputStream, String str, String str2, String str3, String str4) throws Exception {
        return bn.a.a(inputStream, str, str2, str3, str4);
    }

    public Collection<? extends CRL> u0(String str) throws Exception {
        return bn.a.b(str);
    }

    public SSLEngine y0(String str, int i10) {
        SSLEngine sSLEngineCreateSSLEngine;
        if (t0()) {
            sSLEngineCreateSSLEngine = this.S.createSSLEngine(str, i10);
        } else {
            sSLEngineCreateSSLEngine = this.S.createSSLEngine();
        }
        n0(sSLEngineCreateSSLEngine);
        return sSLEngineCreateSSLEngine;
    }
}
