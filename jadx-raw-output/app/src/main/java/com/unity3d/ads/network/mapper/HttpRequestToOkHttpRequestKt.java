package com.unity3d.ads.network.mapper;

import ck.p;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import lk.a0;
import nj.b0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: HttpRequestToOkHttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return RequestBody.create(MediaType.parse("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
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

    public static final Request toOkHttpRequest(HttpRequest httpRequest) {
        p.j(httpRequest, "<this>");
        Request requestBuild = new Request.Builder().url(a0.F0(a0.l1(httpRequest.getBaseURL(), '/') + '/' + a0.l1(httpRequest.getPath(), '/'), "/")).method(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).headers(generateOkHttpHeaders(httpRequest)).build();
        p.i(requestBuild, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return requestBuild;
    }
}
