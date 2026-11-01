package com.unity3d.services.core.network.model;

import ck.i;
import ck.p;
import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        p.j(str, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj) {
        this(str, str2, requestType, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType) {
        this(str, str2, requestType, obj, map, map2, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, i13, z10, null, null, 0, 114688, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, i13, z10, operationType, null, 0, 98304, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
        p.j(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, i13, z10, operationType, file, 0, 65536, null);
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
        p.j(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
        p.j(operationType, "operationType");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map2;
        this.bodyType = bodyType;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        p.j(str, "baseURL");
        p.j(str2, "path");
        p.j(requestType, "method");
        p.j(map, "headers");
        p.j(map2, "parameters");
        p.j(bodyType, "bodyType");
        p.j(str3, "scheme");
        p.j(operationType, "operationType");
        return new HttpRequest(str, str2, requestType, obj, map, map2, bodyType, str3, num, i10, i11, i12, i13, z10, operationType, file, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return p.e(this.baseURL, httpRequest.baseURL) && p.e(this.path, httpRequest.path) && this.method == httpRequest.method && p.e(this.body, httpRequest.body) && p.e(this.headers, httpRequest.headers) && p.e(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && p.e(this.scheme, httpRequest.scheme) && p.e(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && p.e(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public int hashCode() {
        int iHashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int iHashCode2 = (((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout)) * 31;
        boolean z10 = this.isProtobuf;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r10) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        return ((iHashCode4 + (file != null ? file.hashCode() : 0)) * 31) + Integer.hashCode(this.priority);
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, i iVar) {
        this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? RequestType.GET : requestType, (i15 & 8) != 0 ? null : obj, (i15 & 16) != 0 ? a.j() : map, (i15 & 32) != 0 ? a.j() : map2, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & 128) != 0 ? "https" : str3, (i15 & 256) != 0 ? null : num, (i15 & 512) != 0 ? 30000 : i10, (i15 & 1024) != 0 ? 30000 : i11, (i15 & 2048) != 0 ? 30000 : i12, (i15 & 4096) == 0 ? i13 : 30000, (i15 & 8192) != 0 ? false : z10, (i15 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & 65536) == 0 ? i14 : 0);
    }
}
