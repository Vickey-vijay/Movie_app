package sa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: OkHttp3Util.java */
/* JADX INFO: loaded from: classes11.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f67187a = 120;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static OkHttpClient f67188b;

    /* JADX INFO: compiled from: OkHttp3Util.java */
    public static class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f67189a;

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.f67189a.a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            this.f67189a.b(response);
        }

        public a(b bVar) {
            this.f67189a = bVar;
        }
    }

    /* JADX INFO: compiled from: OkHttp3Util.java */
    public interface b {
        void a(IOException iOException);

        void b(Response response);
    }

    public static void a(String str, b bVar) {
        f67188b.newCall(new Request.Builder().url(str).get().build()).enqueue(new a(bVar));
    }

    public static synchronized OkHttpClient b() {
        if (f67188b == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long j10 = f67187a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f67188b = builder.readTimeout(j10, timeUnit).connectTimeout(f67187a, timeUnit).writeTimeout(f67187a, timeUnit).retryOnConnectionFailure(true).addNetworkInterceptor(new u()).build();
        }
        return f67188b;
    }
}
