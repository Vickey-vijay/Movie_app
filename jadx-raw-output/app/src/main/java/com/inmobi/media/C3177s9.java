package com.inmobi.media;

import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3177s9 {
    public static C3227u9 a(Interceptor[] interceptorArr, Dispatcher dispatcher, Interceptor[] interceptorArr2, C3114pk c3114pk, int i10) {
        if ((i10 & 1) != 0) {
            interceptorArr = new Interceptor[0];
        }
        if ((i10 & 2) != 0) {
            dispatcher = A9.f22350b;
        }
        if ((i10 & 4) != 0) {
            interceptorArr2 = new Interceptor[0];
        }
        if ((i10 & 8) != 0) {
            c3114pk = new C3114pk(60L, 60L, 60L);
        }
        ck.p.j(interceptorArr, "interceptors");
        ck.p.j(dispatcher, "dispatcher");
        ck.p.j(interceptorArr2, "networkInterceptors");
        ck.p.j(c3114pk, "timeoutConfig");
        return new C3227u9(interceptorArr, interceptorArr2, dispatcher, c3114pk);
    }
}
