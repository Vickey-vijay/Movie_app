package com.unity3d.ads.network.model;

import ck.i;
import ck.p;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* JADX INFO: compiled from: HttpRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        p.j(str, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody) {
        this(str, str2, requestType, httpBody, null, null, null, null, 0, 0, 0, 0, 4080, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, httpBody, map, null, null, null, 0, 0, 0, 0, 4064, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, httpBody, map, map2, null, null, 0, 0, 0, 0, 4032, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3) {
        this(str, str2, requestType, httpBody, map, map2, str3, null, 0, 0, 0, 0, 3968, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, 0, 0, 0, 0, 3840, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i10, 0, 0, 0, 3584, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i10, i11, 0, 0, 3072, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11, int i12) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i10, i11, i12, 0, 2048, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11, int i12, int i13) {
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = httpBody;
        this.headers = map;
        this.parameters = map2;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11, int i12, int i13) {
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(httpBody, "body");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(str3, "scheme");
        return new HttpRequest(str, str2, requestType, httpBody, map, map2, str3, num, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return p.e(this.baseURL, httpRequest.baseURL) && p.e(this.path, httpRequest.path) && this.method == httpRequest.method && p.e(this.body, httpRequest.body) && p.e(this.headers, httpRequest.headers) && p.e(this.parameters, httpRequest.parameters) && p.e(this.scheme, httpRequest.scheme) && p.e(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout);
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, i iVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? RequestType.GET : requestType, (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i14 & 16) != 0 ? a.j() : map, (i14 & 32) != 0 ? a.j() : map2, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? 30000 : i10, (i14 & 512) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & 2048) == 0 ? i13 : 30000);
    }
}
