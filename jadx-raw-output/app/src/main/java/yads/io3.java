package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes7.dex */
public final class io3 implements go3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj.g f78764a = kotlin.b.a(ho3.f78293b);

    public final boolean a(Context context, SslError sslError) {
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f80803y) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : bs2.a(sslError.getCertificate(), (CertificateFactory) this.f78764a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        try {
            cf1.a(new lt2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return false;
        }
    }
}
