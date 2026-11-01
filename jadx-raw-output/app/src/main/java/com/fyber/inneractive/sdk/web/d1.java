package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18656c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f18654a.equals(d1Var.f18654a) && this.f18655b.equals(d1Var.f18655b)) {
            return this.f18656c.equals(d1Var.f18656c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18656c.hashCode() + ((this.f18655b.hashCode() + (this.f18654a.hashCode() * 31)) * 31);
    }

    public d1(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders;
        this.f18654a = webResourceRequest.getUrl().toString();
        this.f18655b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            requestHeaders = Collections.emptyMap();
        } else {
            requestHeaders = webResourceRequest.getRequestHeaders();
        }
        this.f18656c = new HashMap(requestHeaders);
    }
}
