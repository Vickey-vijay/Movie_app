package cm;

import java.io.IOException;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: BaseInterceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f6127a;

    public a(Map<String, String> map) {
        this.f6127a = map;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        Map<String, String> map = this.f6127a;
        if (map != null && map.size() > 0) {
            for (String str : this.f6127a.keySet()) {
                builderNewBuilder.addHeader(str, this.f6127a.get(str)).build();
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
