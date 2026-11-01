package com.inmobi.media;

import com.vungle.ads.internal.ui.AdActivity;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3227u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3297x4 f25449a;

    public C3227u9(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, C3114pk c3114pk) {
        ck.p.j(interceptorArr, "interceptors");
        ck.p.j(interceptorArr2, "networkInterceptors");
        ck.p.j(dispatcher, "dispatcher");
        ck.p.j(c3114pk, "timeoutConfig");
        this.f25449a = new C3297x4(interceptorArr, interceptorArr2, dispatcher, c3114pk);
    }

    public final nk.p0 a(Me me2) {
        ck.p.j(me2, AdActivity.REQUEST_KEY_EXTRA);
        return nk.j.b(A9.f22351c, null, null, new C3202t9(this, me2, null), 3, null);
    }
}
