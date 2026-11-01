package yads;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f75769a = kotlin.b.a(a93.f75439b);

    public static final boolean a() {
        return true;
    }

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) nj.b0.h0(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
