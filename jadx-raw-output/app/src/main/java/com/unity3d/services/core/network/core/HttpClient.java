package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import rj.c;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface HttpClient {

    /* JADX INFO: compiled from: HttpClient.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object execute$default(HttpClient httpClient, HttpRequest httpRequest, boolean z10, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return httpClient.execute(httpRequest, z10, cVar);
        }
    }

    Object execute(HttpRequest httpRequest, boolean z10, c<? super HttpResponse> cVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
