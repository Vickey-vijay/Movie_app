package sa;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: compiled from: NetInterceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public class u implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().addHeader("Connection", "close").build());
    }
}
