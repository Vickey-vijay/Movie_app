package io.bidmachine.util.network;

import ck.p;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import mj.r;
import yj.a;
import yj.b;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0003\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007¨\u0006\n"}, d2 = {"Ljava/net/HttpURLConnection;", "Lmj/r;", "disconnectSafely", "Ljava/net/URLConnection;", "", "readBytes", "readBytesSafely", "Ljava/net/URL;", "", "isHttp", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class NetworkUtilsKt {
    public static final void disconnectSafely(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
            r rVar = r.f64562a;
        } catch (Throwable unused) {
        }
    }

    public static final boolean isHttp(URL url) {
        p.j(url, "<this>");
        return p.e("http", url.getProtocol()) || p.e("https", url.getProtocol());
    }

    public static final byte[] readBytes(URLConnection uRLConnection) throws IOException {
        p.j(uRLConnection, "<this>");
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            p.i(inputStream, "it");
            byte[] bArrC = a.c(inputStream);
            b.a(inputStream, null);
            return bArrC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStream, th2);
                throw th3;
            }
        }
    }

    public static final byte[] readBytesSafely(URLConnection uRLConnection) {
        p.j(uRLConnection, "<this>");
        try {
            return readBytes(uRLConnection);
        } catch (Throwable unused) {
            return null;
        }
    }
}
