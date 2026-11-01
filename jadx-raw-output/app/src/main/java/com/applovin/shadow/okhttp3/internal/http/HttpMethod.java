package com.applovin.shadow.okhttp3.internal.http;

import ck.p;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        p.j(str, "method");
        return (p.e(str, "GET") || p.e(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        p.j(str, "method");
        return p.e(str, "POST") || p.e(str, "PUT") || p.e(str, "PATCH") || p.e(str, "PROPPATCH") || p.e(str, "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        p.j(str, "method");
        return p.e(str, "POST") || p.e(str, "PATCH") || p.e(str, "PUT") || p.e(str, "DELETE") || p.e(str, "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        p.j(str, "method");
        return !p.e(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        p.j(str, "method");
        return p.e(str, "PROPFIND");
    }
}
