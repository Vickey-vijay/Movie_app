package io.appmetrica.analytics.network.impl;

import androidx.annotation.VisibleForTesting;
import ck.p;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import mj.r;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkClient f58212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Request f58213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f58214c;

    @VisibleForTesting
    public c(NetworkClient networkClient, Request request, d dVar) {
        this.f58212a = networkClient;
        this.f58213b = request;
        this.f58214c = dVar;
    }

    public final void a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f58213b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f58212a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f58212a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f58212a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f58212a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f58213b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f58212a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    public final Response execute() {
        Map<String, List<String>> headerFields;
        int responseCode;
        Throwable th2;
        String string;
        boolean z10;
        try {
            d dVar = this.f58214c;
            String url = this.f58213b.getUrl();
            dVar.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f58213b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrA = new byte[0];
            byte[] bArrA2 = new byte[0];
            try {
                try {
                    a(httpsURLConnection);
                    if (p.e(this.f58213b.getMethod(), "POST")) {
                        httpsURLConnection.setDoOutput(true);
                        OutputStream outputStream = httpsURLConnection.getOutputStream();
                        if (outputStream != null) {
                            try {
                                outputStream.write(this.f58213b.getBody());
                                outputStream.flush();
                                r rVar = r.f64562a;
                                yj.b.a(outputStream, null);
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    yj.b.a(outputStream, th3);
                                    throw th4;
                                }
                            }
                        }
                    }
                    responseCode = httpsURLConnection.getResponseCode();
                    try {
                        headerFields = httpsURLConnection.getHeaderFields();
                        try {
                            bArrA = e.a(this.f58212a.getMaxResponseSize(), new a(httpsURLConnection));
                            bArrA2 = e.a(this.f58212a.getMaxResponseSize(), new b(httpsURLConnection));
                            z10 = true;
                            th2 = null;
                            string = httpsURLConnection.getURL().toString();
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            string = null;
                            z10 = false;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        headerFields = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    headerFields = null;
                    responseCode = 0;
                    th2 = th;
                    string = null;
                    z10 = false;
                    byte[] bArr = bArrA;
                    byte[] bArr2 = bArrA2;
                    int i10 = responseCode;
                    Map<String, List<String>> map = headerFields;
                    httpsURLConnection.disconnect();
                    return new Response(z10, i10, bArr, bArr2, map, th2, string);
                }
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            byte[] bArr3 = bArrA;
            byte[] bArr4 = bArrA2;
            int i11 = responseCode;
            Map<String, List<String>> map2 = headerFields;
            return new Response(z10, i11, bArr3, bArr4, map2, th2, string);
        } catch (Throwable th8) {
            return new Response(th8);
        }
    }

    public c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new d());
    }
}
