package com.applovin.shadow.okhttp3.internal;

import ck.p;
import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.vungle.ads.internal.ui.AdActivity;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        p.j(builder, "builder");
        p.j(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        p.j(builder, "builder");
        p.j(str, "name");
        p.j(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z10) {
        p.j(connectionSpec, "connectionSpec");
        p.j(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z10);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        p.j(cache, "cache");
        p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z10) {
        p.j(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    public static final Cookie parseCookie(long j10, HttpUrl httpUrl, String str) {
        p.j(httpUrl, "url");
        p.j(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j10, httpUrl, str);
    }
}
