package yads;

import android.util.Log;
import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes8.dex */
public final class jw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u20 f79217a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f79219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X509TrustManager f79220d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f79218b = kotlin.b.a(iw2.f78843b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f79221e = new Object();

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        mj.r rVar;
        try {
            ((X509TrustManager) this.f79218b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            synchronized (this.f79221e) {
                a();
                b();
                X509TrustManager x509TrustManager = this.f79220d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    rVar = mj.r.f64562a;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    mj.r rVar2 = mj.r.f64562a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e10;
                }
            }
        }
    }

    public final void b() {
        if (!Thread.holdsLock(this.f79221e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public jw2(u20 u20Var) {
        this.f79217a = u20Var;
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.f79219c == null) {
            mj.g gVar = b93.f75769a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                lt2 lt2Var = (lt2) this.f79217a;
                lt2Var.getClass();
                try {
                    InputStream inputStreamOpenRawResource = lt2Var.f79910b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] bArrC = yj.a.c(inputStreamOpenRawResource);
                        yj.b.a(inputStreamOpenRawResource, null);
                        try {
                            InputStream inputStreamOpenRawResource2 = lt2Var.f75932a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] bArrC2 = yj.a.c(inputStreamOpenRawResource2);
                                yj.b.a(inputStreamOpenRawResource2, null);
                                byte[][] bArr = (byte[][]) nj.l.t(new byte[][]{bArrC2}, new byte[][]{bArrC});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    mj.g gVar2 = b93.f75769a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) b93.f75769a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    yj.b.a(inputStreamOpenRawResource2, th2);
                                    throw th3;
                                }
                            }
                        } catch (IOException e10) {
                            throw new IllegalStateException("Failed to create cert", e10);
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            yj.b.a(inputStreamOpenRawResource, th4);
                            throw th5;
                        }
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException("Failed to create cert", e11);
                }
            }
            this.f79219c = keyStore2;
        }
        b();
        if (this.f79220d == null) {
            b();
            if (this.f79219c != null) {
                b();
                this.f79220d = b93.a(this.f79219c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e10) {
            Log.w("SdkTrustManager", "Failed to store certificate", e10);
        }
    }
}
