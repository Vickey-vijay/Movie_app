package com.unity3d.services.core.network.mapper;

import ck.p;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: WebRequestToHttpRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        p.j(webRequest, "<this>");
        String string = webRequest.getUrl().toString();
        String requestType = webRequest.getRequestType();
        p.i(requestType, "requestType");
        RequestType requestTypeValueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        p.i(string, "toString()");
        p.i(headers, "headers");
        return new HttpRequest(string, null, requestTypeValueOf, body, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}
