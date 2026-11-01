package bn;

import com.ironsource.C3426d4;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Security;
import java.security.cert.CRL;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidator;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CertificateValidator.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zm.c f5497g = zm.b.a(b.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AtomicLong f5498h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KeyStore f5499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection<? extends CRL> f5500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5501c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5502d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5503e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5504f;

    public void a(boolean z10) {
        this.f5502d = z10;
    }

    public void b(boolean z10) {
        this.f5503e = z10;
    }

    public void c(int i10) {
        this.f5501c = i10;
    }

    public void d(String str) {
        this.f5504f = str;
    }

    public void e(KeyStore keyStore, Certificate certificate) throws CertificateException {
        String str;
        if (certificate == null || !(certificate instanceof X509Certificate)) {
            return;
        }
        ((X509Certificate) certificate).checkValidity();
        try {
            if (keyStore == null) {
                throw new InvalidParameterException("Keystore cannot be null");
            }
            String certificateAlias = keyStore.getCertificateAlias((X509Certificate) certificate);
            if (certificateAlias == null) {
                certificateAlias = "JETTY" + String.format("%016X", Long.valueOf(f5498h.incrementAndGet()));
                keyStore.setCertificateEntry(certificateAlias, certificate);
            }
            Certificate[] certificateChain = keyStore.getCertificateChain(certificateAlias);
            if (certificateChain == null || certificateChain.length == 0) {
                throw new IllegalStateException("Unable to retrieve certificate chain");
            }
            f(certificateChain);
        } catch (KeyStoreException e10) {
            f5497g.a(e10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to validate certificate");
            if (0 == 0) {
                str = "";
            } else {
                str = " for alias [" + ((String) null) + C3426d4.j.f28588e;
            }
            sb2.append(str);
            sb2.append(": ");
            sb2.append(e10.getMessage());
            throw new CertificateException(sb2.toString(), e10);
        }
    }

    public void f(Certificate[] certificateArr) throws CertificateException {
        try {
            ArrayList arrayList = new ArrayList();
            for (Certificate certificate : certificateArr) {
                if (certificate != null) {
                    if (!(certificate instanceof X509Certificate)) {
                        throw new IllegalStateException("Invalid certificate type in chain");
                    }
                    arrayList.add((X509Certificate) certificate);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Invalid certificate chain");
            }
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate((X509Certificate) arrayList.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(this.f5499a, x509CertSelector);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
            pKIXBuilderParameters.setMaxPathLength(this.f5501c);
            pKIXBuilderParameters.setRevocationEnabled(true);
            Collection<? extends CRL> collection = this.f5500b;
            if (collection != null && !collection.isEmpty()) {
                pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(this.f5500b)));
            }
            if (this.f5503e) {
                Security.setProperty("ocsp.enable", "true");
            }
            if (this.f5502d) {
                System.setProperty("com.sun.security.enableCRLDP", "true");
            }
            CertPathValidator.getInstance("PKIX").validate(CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters).getCertPath(), pKIXBuilderParameters);
        } catch (GeneralSecurityException e10) {
            f5497g.a(e10);
            throw new CertificateException("Unable to validate certificate: " + e10.getMessage(), e10);
        }
    }

    public b(KeyStore keyStore, Collection<? extends CRL> collection) {
        if (keyStore != null) {
            this.f5499a = keyStore;
            this.f5500b = collection;
            return;
        }
        throw new InvalidParameterException("TrustStore must be specified for CertificateValidator.");
    }
}
