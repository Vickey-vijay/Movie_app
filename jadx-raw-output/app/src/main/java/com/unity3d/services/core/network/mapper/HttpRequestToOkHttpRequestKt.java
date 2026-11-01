package com.unity3d.services.core.network.mapper;

import ck.p;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import lk.a0;
import nj.b0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: HttpRequestToOkHttpRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), (byte[]) obj);
            p.i(requestBodyCreate, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBodyCreate;
        }
        if (obj instanceof String) {
            RequestBody requestBodyCreate2 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), (String) obj);
            p.i(requestBodyCreate2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return requestBodyCreate2;
        }
        RequestBody requestBodyCreate3 = RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), "");
        p.i(requestBodyCreate3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return requestBodyCreate3;
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.add(entry.getKey(), b0.p0(entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        Headers headersBuild = builder.build();
        p.i(headersBuild, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return headersBuild;
    }

    private static final RequestBody generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody requestBodyCreate = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            p.i(requestBodyCreate, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBodyCreate;
        }
        if (obj instanceof String) {
            RequestBody requestBodyCreate2 = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            p.i(requestBodyCreate2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return requestBodyCreate2;
        }
        RequestBody requestBodyCreate3 = RequestBody.create(MediaType.parse(CommonGatewayClient.HEADER_PROTOBUF), "");
        p.i(requestBodyCreate3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return requestBodyCreate3;
    }

    public static final Request toOkHttpProtoRequest(HttpRequest httpRequest) {
        p.j(httpRequest, "<this>");
        Request.Builder builderUrl = new Request.Builder().url(a0.F0(a0.l1(httpRequest.getBaseURL(), '/') + '/' + a0.l1(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        Request requestBuild = builderUrl.method(string, body != null ? generateOkHttpProtobufBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        p.i(requestBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return requestBuild;
    }

    public static final Request toOkHttpRequest(HttpRequest httpRequest) {
        p.j(httpRequest, "<this>");
        Request.Builder builderUrl = new Request.Builder().url(a0.F0(a0.l1(httpRequest.getBaseURL(), '/') + '/' + a0.l1(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        Request requestBuild = builderUrl.method(string, body != null ? generateOkHttpBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        p.i(requestBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return requestBuild;
    }
}
