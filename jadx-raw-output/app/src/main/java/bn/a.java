package bn;

import an.e;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CRL;
import java.security.cert.CertificateFactory;
import java.util.Collection;

/* JADX INFO: compiled from: CertificateUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static KeyStore a(InputStream inputStream, String str, String str2, String str3, String str4) throws Exception {
        char[] charArray = null;
        if (inputStream == null && str == null) {
            return null;
        }
        if (inputStream == null) {
            try {
                inputStream = e.e(str).c();
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        KeyStore keyStore = str3 != null ? KeyStore.getInstance(str2, str3) : KeyStore.getInstance(str2);
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        keyStore.load(inputStream, charArray);
        return keyStore;
    }

    public static Collection<? extends CRL> b(String str) throws Exception {
        InputStream inputStreamC = null;
        if (str == null) {
            return null;
        }
        try {
            inputStreamC = e.e(str).c();
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCRLs(inputStreamC);
        } finally {
            if (inputStreamC != null) {
                inputStreamC.close();
            }
        }
    }
}
