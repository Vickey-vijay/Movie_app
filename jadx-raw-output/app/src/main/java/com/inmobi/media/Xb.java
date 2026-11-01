package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class Xb implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ck.p.j(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.isRedirect()) {
            ck.p.g(responseProceed);
            ck.p.j(responseProceed, "<this>");
            String strHeader = responseProceed.isRedirect() ? responseProceed.header("Location") : null;
            if (strHeader != null) {
                ck.p.j(strHeader, "<this>");
                try {
                    new URL(strHeader);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException("Invalid URL in Location header: " + strHeader);
        }
        ck.p.g(responseProceed);
        return responseProceed;
    }
}
