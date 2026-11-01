package yads;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bs2 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        if (!ck.p.e(certificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            certificateFactory.getType();
            boolean z10 = ad1.f75480a;
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState == null || (byteArray = bundleSaveState.getByteArray("x509-certificate")) == null) {
            return null;
        }
        try {
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
            if (!(certificateGenerateCertificate instanceof X509Certificate)) {
                return null;
            }
            return (X509Certificate) certificateGenerateCertificate;
        } catch (CertificateException unused) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }
}
