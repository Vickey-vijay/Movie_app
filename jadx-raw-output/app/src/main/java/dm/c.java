package dm;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.http.interceptor.logging.Level;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: LoggingInterceptor.java */
/* JADX INFO: loaded from: classes9.dex */
public class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f52220b;

    /* JADX INFO: compiled from: LoggingInterceptor.java */
    public static class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static String f52221h = "LoggingI";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f52222a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52225d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dm.b f52228g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52223b = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Level f52226e = Level.BASIC;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Headers.Builder f52227f = new Headers.Builder();

        public b b(String str, String str2) {
            this.f52227f.set(str, str2);
            return this;
        }

        public c c() {
            return new c(this);
        }

        public Headers d() {
            return this.f52227f.build();
        }

        public Level e() {
            return this.f52226e;
        }

        public dm.b f() {
            return this.f52228g;
        }

        public String g(boolean z10) {
            if (z10) {
                return TextUtils.isEmpty(this.f52224c) ? f52221h : this.f52224c;
            }
            return TextUtils.isEmpty(this.f52225d) ? f52221h : this.f52225d;
        }

        public int getType() {
            return this.f52223b;
        }

        public b h(int i10) {
            this.f52223b = i10;
            return this;
        }

        public b i(boolean z10) {
            this.f52222a = z10;
            return this;
        }

        public b j(String str) {
            this.f52224c = str;
            return this;
        }

        public b k(String str) {
            this.f52225d = str;
            return this;
        }

        public b l(Level level) {
            this.f52226e = level;
            return this;
        }
    }

    public c(b bVar) {
        this.f52220b = bVar;
        this.f52219a = bVar.f52222a;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (this.f52219a) {
            this.f52220b.l(Level.BASIC);
        } else {
            this.f52220b.l(Level.NONE);
        }
        Request request = chain.request();
        if (this.f52220b.d().size() > 0) {
            Headers headers = request.headers();
            Request.Builder builderNewBuilder = request.newBuilder();
            builderNewBuilder.headers(this.f52220b.d());
            for (String str : headers.names()) {
                builderNewBuilder.addHeader(str, headers.get(str));
            }
            request = builderNewBuilder.build();
        }
        MediaType mediaTypeContentType = request.body() != null ? request.body().contentType() : null;
        String strSubtype = mediaTypeContentType != null ? mediaTypeContentType.subtype() : null;
        if (strSubtype == null || !(strSubtype.contains("json") || strSubtype.contains("xml") || strSubtype.contains("plain") || strSubtype.contains(CreativeInfo.f44315al))) {
            if (this.f52219a) {
                d.h(this.f52220b, request);
            }
        } else if (this.f52219a) {
            d.j(this.f52220b, request);
        }
        long jNanoTime = System.nanoTime();
        Response responseProceed = chain.proceed(request);
        List<String> listEncodedPathSegments = responseProceed.request().url().encodedPathSegments();
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        String string = responseProceed.headers().toString();
        int iCode = responseProceed.code();
        boolean zIsSuccessful = responseProceed.isSuccessful();
        ResponseBody responseBodyBody = responseProceed.body();
        MediaType mediaTypeContentType2 = responseBodyBody.contentType();
        String strSubtype2 = mediaTypeContentType2 != null ? mediaTypeContentType2.subtype() : null;
        if (strSubtype2 == null || !(strSubtype2.contains("json") || strSubtype2.contains("xml") || strSubtype2.contains("plain") || strSubtype2.contains(CreativeInfo.f44315al))) {
            if (this.f52219a) {
                d.i(this.f52220b, millis, zIsSuccessful, iCode, string, listEncodedPathSegments);
            }
            return responseProceed;
        }
        String strC = d.c(em.a.a(responseBodyBody.string()));
        if (this.f52219a) {
            d.k(this.f52220b, millis, zIsSuccessful, iCode, string, strC, listEncodedPathSegments);
        }
        return responseProceed.newBuilder().body(ResponseBody.create(mediaTypeContentType2, strC)).build();
    }
}
