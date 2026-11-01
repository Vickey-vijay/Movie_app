package com.inmobi.media;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class X6 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X6 f23783a = new X6();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ck.p.j(chain, "chain");
        W6.a();
        Objects.toString(chain.request());
        if (W6.a()) {
            Response responseProceed = chain.proceed(chain.request());
            ck.p.g(responseProceed);
            return responseProceed;
        }
        Response.Builder builderProtocol = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1);
        Y5 y10 = EnumC2721a6.f23946b;
        Response responseBuild = builderProtocol.code(192).message("GDPR_COMPLIANCE_ENFORCED").body(ResponseBody.create((MediaType) null, "")).build();
        ck.p.g(responseBuild);
        return responseBuild;
    }
}
