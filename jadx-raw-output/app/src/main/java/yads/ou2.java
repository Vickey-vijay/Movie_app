package yads;

import android.util.Log;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes11.dex */
public final class ou2 extends X509ExtendedTrustManager implements hw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw2 f81152a;

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f81152a.f79218b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f81152a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        mj.r rVar;
        jw2 jw2Var = this.f81152a;
        jw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) jw2Var.f79218b.getValue();
            if (b93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (jw2Var.f79221e) {
                jw2Var.a();
                jw2Var.b();
                X509TrustManager x509TrustManager2 = jw2Var.f79220d;
                if (x509TrustManager2 != null) {
                    if (b93.a()) {
                        yf.b(x509TrustManager2, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
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

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.f81152a.f79218b.getValue()).getAcceptedIssuers();
    }

    public ou2(u20 u20Var) {
        this.f81152a = new jw2(u20Var);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        jw2 jw2Var = this.f81152a;
        jw2Var.getClass();
        if (b93.a()) {
            yf.a((X509TrustManager) jw2Var.f79218b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) jw2Var.f79218b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        jw2 jw2Var = this.f81152a;
        jw2Var.getClass();
        if (b93.a()) {
            yf.a((X509TrustManager) jw2Var.f79218b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) jw2Var.f79218b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        mj.r rVar;
        jw2 jw2Var = this.f81152a;
        jw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) jw2Var.f79218b.getValue();
            if (b93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (jw2Var.f79221e) {
                jw2Var.a();
                jw2Var.b();
                X509TrustManager x509TrustManager2 = jw2Var.f79220d;
                if (x509TrustManager2 != null) {
                    if (b93.a()) {
                        yf.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
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
}
