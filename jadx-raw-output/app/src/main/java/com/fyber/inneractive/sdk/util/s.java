package com.fyber.inneractive.sdk.util;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static boolean a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static String a(String str, int i10, int i11) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.connect();
            FilterInputStream filterInputStreamA = a(httpURLConnection);
            String strB = b(httpURLConnection);
            if (!TextUtils.isEmpty(strB)) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                return a(strB, i11, i10);
            }
            int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            boolean z10 = true;
            if (iHttpUrlConnectionGetResponseCode != 200) {
                IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(iHttpUrlConnectionGetResponseCode));
                z10 = false;
            }
            String string = z10 ? v.b((InputStream) filterInputStreamA).toString() : null;
            DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            return string;
        } catch (Exception e10) {
            IAlog.a("getBodyFromUrl failed with exception", e10, new Object[0]);
            throw e10;
        } catch (Throwable th2) {
            IAlog.a("getBodyFromUrl failed with error", th2, new Object[0]);
            return null;
        }
    }

    public static String b(HttpURLConnection httpURLConnection) throws Exception {
        int iHttpUrlConnectionGetResponseCode = DTExchangeNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        if ((iHttpUrlConnectionGetResponseCode <= 300 || iHttpUrlConnectionGetResponseCode >= 304) && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
            return null;
        }
        IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(iHttpUrlConnectionGetResponseCode));
        String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.n.LOCATION.a());
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(iHttpUrlConnectionGetResponseCode) + " with empty location header!");
    }

    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        FilterInputStream bufferedInputStream;
        try {
            InputStream inputStreamUrlConnectionGetInputStream = DTExchangeNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            if (TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(inputStreamUrlConnectionGetInputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStreamUrlConnectionGetInputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }
}
