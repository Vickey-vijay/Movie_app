package com.inmobi.media;

import com.vungle.ads.internal.ui.AdActivity;
import java.util.Objects;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class G2 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G2 f22715a = new G2();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        ck.p.j(chain, "chain");
        Request request = chain.request();
        String str = H2.f22769a;
        ck.p.i(str, "access$getTAG$p(...)");
        Objects.toString(request);
        try {
            Response responseProceed = chain.proceed(request);
            ck.p.i(str, "access$getTAG$p(...)");
            Objects.toString(responseProceed);
            ck.p.g(request);
            ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
            ck.p.i(str, "access$getTAG$p(...)");
            Objects.toString(request);
            Objects.toString(responseProceed);
            ck.p.g(responseProceed);
            return responseProceed;
        } catch (Exception e10) {
            String str2 = H2.f22769a;
            Objects.toString(request);
            ck.p.g(request);
            ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
            throw e10;
        }
    }
}
