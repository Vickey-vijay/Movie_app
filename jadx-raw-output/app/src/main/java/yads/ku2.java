package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class ku2 extends td0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SSLSocketFactory f79573s;

    public ku2(String str, int i10, int i11, boolean z10, t11 t11Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i10, i11, z10, t11Var);
        this.f79573s = sSLSocketFactory;
    }

    @Override // yads.td0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f79573s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
