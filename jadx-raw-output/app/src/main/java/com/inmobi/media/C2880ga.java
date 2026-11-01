package com.inmobi.media;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2880ga implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2880ga f24420a = new C2880ga();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ck.p.j(chain, "chain");
        EnumC2721a6 enumC2721a6A = Re.a();
        if (enumC2721a6A != null) {
            new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(enumC2721a6A.f23963a).message(enumC2721a6A.toString()).body(ResponseBody.create((MediaType) null, "")).build();
        }
        Response responseProceed = chain.proceed(chain.request());
        ck.p.i(responseProceed, "proceed(...)");
        return responseProceed;
    }
}
