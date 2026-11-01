package qm;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import kj.p;
import kj.t;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Password;
import pm.l;
import rm.v;

/* JADX INFO: compiled from: ClientCertAuthenticator.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f66605e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Password f66607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f66609i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f66606f = "JKS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f66610j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f66611k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f66612l = false;

    @Override // pm.a
    public boolean a(p pVar, t tVar, boolean z10, rm.d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // pm.a
    public String getAuthMethod() {
        return Constraint.__CERT_AUTH;
    }

    @Override // pm.a
    public rm.d b(p pVar, t tVar, boolean z10) throws ServerAuthException {
        if (!z10) {
            return new c(this);
        }
        lj.c cVar = (lj.c) tVar;
        X509Certificate[] x509CertificateArr = (X509Certificate[]) ((lj.a) pVar).getAttribute("javax.servlet.request.X509Certificate");
        if (x509CertificateArr != null) {
            try {
                if (x509CertificateArr.length > 0) {
                    if (this.f66608h) {
                        String str = this.f66604d;
                        String str2 = this.f66606f;
                        String str3 = this.f66605e;
                        Password password = this.f66607g;
                        new bn.b(g(null, str, str2, str3, password == null ? null : password.toString()), h(this.f66609i)).f(x509CertificateArr);
                    }
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        if (x509Certificate != null) {
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            if (subjectDN == null) {
                                subjectDN = x509Certificate.getIssuerDN();
                            }
                            v vVarE = e(subjectDN == null ? "clientcert" : subjectDN.getName(), xm.d.e(x509Certificate.getSignature()), pVar);
                            if (vVarE != null) {
                                return new l(getAuthMethod(), vVarE);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                throw new ServerAuthException(e10.getMessage());
            }
        }
        if (c.d(cVar)) {
            return rm.d.H8;
        }
        cVar.o(403);
        return rm.d.K8;
    }

    public KeyStore g(InputStream inputStream, String str, String str2, String str3, String str4) throws Exception {
        return bn.a.a(inputStream, str, str2, str3, str4);
    }

    public Collection<? extends CRL> h(String str) throws Exception {
        return bn.a.b(str);
    }
}
