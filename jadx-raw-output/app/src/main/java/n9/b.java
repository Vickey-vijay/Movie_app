package n9;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: HttpsUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static X509TrustManager f64710a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HostnameVerifier f64711b = new C0591b();

    /* JADX INFO: compiled from: HttpsUtils.java */
    public class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: renamed from: n9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpsUtils.java */
    public class C0591b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX INFO: compiled from: HttpsUtils.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SSLSocketFactory f64712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X509TrustManager f64713b;
    }

    public static X509TrustManager a(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static String b() {
        return "https://moviein.ajfysu.com/";
    }

    public static c c() {
        return d(null, null, null, new InputStream[0]);
    }

    public static KeyManager[] e(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static TrustManager[] f(InputStream... inputStreamArr) {
        if (inputStreamArr != null && inputStreamArr.length > 0) {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                int length = inputStreamArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    InputStream inputStream = inputStreamArr[i10];
                    int i12 = i11 + 1;
                    keyStore.setCertificateEntry(Integer.toString(i11), certificateFactory.generateCertificate(inputStream));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    i10++;
                    i11 = i12;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    public static c d(X509TrustManager x509TrustManager, InputStream inputStream, String str, InputStream... inputStreamArr) {
        c cVar = new c();
        try {
            KeyManager[] keyManagerArrE = e(inputStream, str);
            TrustManager[] trustManagerArrF = f(inputStreamArr);
            if (x509TrustManager == null) {
                x509TrustManager = trustManagerArrF != null ? a(trustManagerArrF) : f64710a;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrE, new TrustManager[]{x509TrustManager}, null);
            cVar.f64712a = sSLContext.getSocketFactory();
            cVar.f64713b = x509TrustManager;
            return cVar;
        } catch (KeyManagementException e10) {
            throw new AssertionError(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }
}
