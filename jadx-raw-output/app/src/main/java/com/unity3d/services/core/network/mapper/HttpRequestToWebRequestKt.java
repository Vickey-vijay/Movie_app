package com.unity3d.services.core.network.mapper;

import ck.p;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.request.WebRequest;

/* JADX INFO: compiled from: HttpRequestToWebRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpRequestToWebRequestKt {
    public static final WebRequest toWebRequest(HttpRequest httpRequest) {
        p.j(httpRequest, "<this>");
        WebRequest webRequest = new WebRequest(httpRequest.getBaseURL(), httpRequest.getMethod().toString(), httpRequest.getHeaders(), httpRequest.getConnectTimeout(), httpRequest.getReadTimeout());
        Object body = httpRequest.getBody();
        if (body instanceof String) {
            webRequest.setBody((String) httpRequest.getBody());
        } else if (body instanceof byte[]) {
            webRequest.setBody((byte[]) httpRequest.getBody());
        }
        return webRequest;
    }
}
