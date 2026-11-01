package io.bidmachine.util.network;

import android.net.Uri;
import androidx.annotation.WorkerThread;
import ck.p;
import io.bidmachine.util.Utils;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH\u0007R\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lio/bidmachine/util/network/NetworkUtils;", "", "Ljava/net/HttpURLConnection;", "httpURLConnection", "Lmj/r;", "disconnectSafely", "", "urlString", "", "timeOut", "findEndpoint", "url", "", "queryParameters", "appendQueryParameters", "HTTP_TEMPORARY_REDIRECT", "I", "HTTP_PERMANENT_REDIRECT", "HEADER_LOCATION", "Ljava/lang/String;", "PROTOCOL_HTTP", "PROTOCOL_HTTPS", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class NetworkUtils {
    public static final String HEADER_LOCATION = "Location";
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    public static final String PROTOCOL_HTTP = "http";
    public static final String PROTOCOL_HTTPS = "https";

    private NetworkUtils() {
    }

    @WorkerThread
    public static final String findEndpoint(String str) {
        p.j(str, "urlString");
        return findEndpoint$default(str, 0, 2, null);
    }

    public static final String appendQueryParameters(String url, Map<String, String> queryParameters) {
        p.j(url, "url");
        p.j(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        p.i(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[Catch: Exception -> 0x00d3, all -> 0x00e8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d3, blocks: (B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1), top: B:69:0x0074, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:4:0x0022, B:7:0x002b, B:59:0x00e1, B:8:0x0031, B:10:0x003a, B:16:0x0046, B:19:0x0051, B:21:0x005b, B:24:0x0069, B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1, B:50:0x00c8, B:56:0x00da, B:53:0x00d3), top: B:66:0x0022, inners: #2 }] */
    @WorkerThread
    public static final String findEndpoint(String urlString, int timeOut) {
        p.j(urlString, "urlString");
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(urlString);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            p.h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection2.setInstanceFollowRedirects(false);
            httpURLConnection2.setConnectTimeout(timeOut);
            httpURLConnection2.setReadTimeout(timeOut);
            try {
                switch (httpURLConnection2.getResponseCode()) {
                    case 301:
                    case 302:
                    case 303:
                    case 305:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        boolean z10 = true;
                        if (headerField == null || headerField.length() == 0) {
                            String string = url.toString();
                            p.i(string, "url.toString()");
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            return string;
                        }
                        p.i(headerField, "nextUrl");
                        if (Utils.isHttpUrl(headerField)) {
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            p.i(headerField, "nextUrl");
                            String strFindEndpoint$default = findEndpoint$default(headerField, 0, 2, null);
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            return strFindEndpoint$default;
                        }
                        if (new URI(headerField).getScheme() != null) {
                            p.i(headerField, "nextUrl");
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            return headerField;
                        }
                        try {
                            String string2 = new URL(url, headerField).toString();
                            p.i(string2, "URL(url, nextUrl).toString()");
                            int length = string2.length() - 1;
                            int i10 = 0;
                            boolean z11 = false;
                            while (i10 <= length) {
                                boolean z12 = p.l(string2.charAt(!z11 ? i10 : length), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        if (string2.subSequence(i10, length + 1).toString().length() == 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            p.i(headerField, "nextUrl");
                                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                            return headerField;
                                        }
                                        NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                        String strFindEndpoint$default2 = findEndpoint$default(string2, 0, 2, null);
                                        NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                        return strFindEndpoint$default2;
                                    }
                                    length--;
                                } else if (z12) {
                                    i10++;
                                } else {
                                    z11 = true;
                                }
                            }
                            if (string2.subSequence(i10, length + 1).toString().length() == 0) {
                                z10 = false;
                            }
                            if (z10) {
                                p.i(headerField, "nextUrl");
                                NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                                return headerField;
                            }
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            String strFindEndpoint$default3 = findEndpoint$default(string2, 0, 2, null);
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            return strFindEndpoint$default3;
                        } catch (Exception unused) {
                            p.i(headerField, "nextUrl");
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            return headerField;
                        }
                    case 304:
                    case 306:
                    default:
                        String string3 = url.toString();
                        p.i(string3, "url.toString()");
                        NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                        return string3;
                }
            } catch (Throwable unused2) {
                httpURLConnection = httpURLConnection2;
            }
            httpURLConnection = httpURLConnection2;
        } catch (Throwable unused3) {
        }
        NetworkUtilsKt.disconnectSafely(httpURLConnection);
        return urlString;
    }

    public static /* synthetic */ String findEndpoint$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 500;
        }
        return findEndpoint(str, i10);
    }

    public static final void disconnectSafely(HttpURLConnection httpURLConnection) {
        NetworkUtilsKt.disconnectSafely(httpURLConnection);
    }
}
