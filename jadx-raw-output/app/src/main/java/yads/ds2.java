package yads;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ds2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f76793a;

    public final SSLSocketFactory a(Context context) {
        nt2 nt2VarA = this.f76793a.a(context);
        lt2 lt2Var = new lt2(context);
        if (nt2VarA != null && nt2VarA.f80803y) {
            hw2 hw2VarA = cf1.a(lt2Var);
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{hw2VarA}, null);
                return sSLContext.getSocketFactory();
            } catch (KeyManagementException e10) {
                throw new IllegalStateException("Failed to initialize SSLContext", e10);
            } catch (NoSuchAlgorithmException e11) {
                throw new IllegalStateException("No system TLS", e11);
            }
        }
        if (!ub.a(21)) {
            return null;
        }
        int i10 = rg2.f82262b;
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
            try {
                sSLContext2.init(null, null, null);
            } catch (KeyManagementException unused) {
                boolean z10 = ad1.f75480a;
            }
            return new rg2(sSLContext2.getSocketFactory());
        } catch (NoSuchAlgorithmException unused2) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }

    public ds2(dw2 dw2Var) {
        this.f76793a = dw2Var;
    }
}
