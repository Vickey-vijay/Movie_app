package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.inmobi.media.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3361zi implements Interceptor {
    /* JADX WARN: Code duplicated, block: B:52:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        IOException iOException;
        Interceptor.Chain chain2 = chain;
        ck.p.j(chain2, "chain");
        Request request = chain.request();
        Object objTag = request.tag();
        Response responseProceed = null;
        Ai ai2 = objTag instanceof Ai ? (Ai) objTag : null;
        if (ai2 == null) {
            Response responseProceed2 = chain2.proceed(request);
            ck.p.i(responseProceed2, "proceed(...)");
            return responseProceed2;
        }
        int i10 = ai2.f22374a;
        int i11 = i10 + 1;
        IOException e10 = null;
        int i12 = 0;
        while (i12 < i11) {
            if (responseProceed != null) {
                try {
                    ResponseBody responseBodyOkhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(responseProceed);
                    if (responseBodyOkhttp3Response_body != null) {
                        responseBodyOkhttp3Response_body.close();
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    if (i12 == i10) {
                        if (responseProceed != null) {
                            return responseProceed;
                        }
                        throw new IOException("Retry policy exhausted", e10);
                    }
                    iOException = e10;
                    long jPow = (long) (Math.pow(1.0d, i12) * ai2.f22375b);
                    if (jPow > 0) {
                        try {
                            Thread.sleep(jPow);
                        } catch (InterruptedException e12) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Retry delay interrupted", e12);
                        }
                    } else {
                        continue;
                    }
                } catch (CancellationException e13) {
                    throw e13;
                }
            }
            responseProceed = chain2.proceed(request);
            ck.p.g(responseProceed);
            ck.p.j(responseProceed, "<this>");
            int iCode = responseProceed.code();
            if (400 <= iCode && iCode < 600) {
                ck.p.j(responseProceed, "<this>");
                Y5 y10 = EnumC2721a6.f23946b;
                int iCode2 = responseProceed.code();
                y10.getClass();
                if (Y5.a(iCode2) != EnumC2721a6.f23948d && i12 < i10) {
                    iOException = e10;
                    long jPow2 = (long) (Math.pow(1.0d, i12) * ai2.f22375b);
                    if (jPow2 > 0) {
                        try {
                            Thread.sleep(jPow2);
                        } catch (InterruptedException e14) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Retry delay interrupted", e14);
                        }
                    } else {
                        continue;
                    }
                    e10 = iOException;
                    i12++;
                    chain2 = chain;
                }
            }
            return responseProceed;
        }
        if (responseProceed != null) {
            return responseProceed;
        }
        throw new IOException("Retry policy exhausted", e10);
    }
}
