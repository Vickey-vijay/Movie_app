package com.unity3d.services.core.network.model;

import ck.i;
import ck.p;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, null, null, null, null, 0L, 126, null);
        p.j(obj, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10) {
        this(obj, i10, null, null, null, null, 0L, 124, null);
        p.j(obj, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map) {
        this(obj, i10, map, null, null, null, 0L, 120, null);
        p.j(obj, "body");
        p.j(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map, String str) {
        this(obj, i10, map, str, null, null, 0L, 112, null);
        p.j(obj, "body");
        p.j(map, "headers");
        p.j(str, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2) {
        this(obj, i10, map, str, str2, null, 0L, 96, null);
        p.j(obj, "body");
        p.j(map, "headers");
        p.j(str, "urlString");
        p.j(str2, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2, String str3) {
        this(obj, i10, map, str, str2, str3, 0L, 64, null);
        p.j(obj, "body");
        p.j(map, "headers");
        p.j(str, "urlString");
        p.j(str2, "protocol");
        p.j(str3, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j10) {
        p.j(obj, "body");
        p.j(map, "headers");
        p.j(str, "urlString");
        p.j(str2, "protocol");
        p.j(str3, "client");
        this.body = obj;
        this.statusCode = i10;
        this.headers = map;
        this.urlString = str;
        this.protocol = str2;
        this.client = str3;
        this.contentSize = j10;
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j10) {
        p.j(obj, "body");
        p.j(map, "headers");
        p.j(str, "urlString");
        p.j(str2, "protocol");
        p.j(str3, "client");
        return new HttpResponse(obj, i10, map, str, str2, str3, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return p.e(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && p.e(this.headers, httpResponse.headers) && p.e(this.urlString, httpResponse.urlString) && p.e(this.protocol, httpResponse.protocol) && p.e(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + Long.hashCode(this.contentSize);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, i iVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? a.j() : map, (i11 & 8) != 0 ? "" : str, (i11 & 16) == 0 ? str2 : "", (i11 & 32) != 0 ? "unknown" : str3, (i11 & 64) != 0 ? -1L : j10);
    }
}
