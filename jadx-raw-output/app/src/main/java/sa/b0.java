package sa;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.ironsource.Q6;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.http.interceptor.logging.Level;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: RetrofitClient.java */
/* JADX INFO: loaded from: classes10.dex */
public class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static OkHttpClient f67126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Retrofit f67127e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cache f67129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f67130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f67125c = n9.b.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f67128f = "";

    /* JADX INFO: compiled from: RetrofitClient.java */
    public class a implements Interceptor {
        public a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            String str = System.currentTimeMillis() + "";
            Request.Builder builderNewBuilder = chain.request().newBuilder();
            builderNewBuilder.addHeader("app_id", "moviein");
            builderNewBuilder.addHeader("package_name", "com.fvvcl.flickverse");
            builderNewBuilder.addHeader("version", "40000");
            builderNewBuilder.addHeader("sys_platform", "2");
            builderNewBuilder.addHeader("mob_mfr", Build.MANUFACTURER.toLowerCase());
            builderNewBuilder.addHeader("mobmodel", Build.MODEL);
            builderNewBuilder.addHeader("sysrelease", Build.VERSION.RELEASE);
            builderNewBuilder.addHeader("device_id", t9.a.a(em.r.a()));
            builderNewBuilder.addHeader(Q6.V0, em.k.i(em.r.a()).h("key_gaid", ""));
            builderNewBuilder.addHeader("channel_code", e.f(BaseApplication.getInstance()));
            builderNewBuilder.addHeader("androidid", Settings.System.getString(em.r.a().getContentResolver(), "android_id"));
            builderNewBuilder.addHeader("cur_time", str);
            builderNewBuilder.addHeader("token", o0.R());
            builderNewBuilder.addHeader("sign", e.x(e.y(str)).toUpperCase());
            builderNewBuilder.addHeader("is_vvv", em.r.e() ? "1" : "0");
            builderNewBuilder.addHeader("is_language", em.r.c());
            builderNewBuilder.addHeader("is_display", em.r.b());
            builderNewBuilder.addHeader("app_language", o0.m());
            builderNewBuilder.addHeader("en_al", o0.M() + "");
            Response responseProceed = chain.proceed(builderNewBuilder.build());
            if (responseProceed.code() == 401) {
                t9.b.a("登录失效");
            }
            return responseProceed;
        }
    }

    /* JADX INFO: compiled from: RetrofitClient.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b0 f67132a = new b0();
    }

    /* JADX INFO: compiled from: RetrofitClient.java */
    public static class c implements HostnameVerifier {
        public c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX INFO: compiled from: RetrofitClient.java */
    public static class d implements X509TrustManager {
        public d() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public b0() {
        this(f67125c, null);
    }

    @SuppressLint({"TrulyRandom"})
    public static SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new d()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(String str, Map<String, String> map) {
        Object[] objArr = 0;
        this.f67129a = null;
        str = TextUtils.isEmpty(str) ? f67125c : str;
        if (this.f67130b == null) {
            this.f67130b = new File(em.r.a().getCacheDir(), "goldze_cache");
        }
        try {
            if (this.f67129a == null) {
                this.f67129a = new Cache(this.f67130b, 10485760L);
            }
        } catch (Exception e10) {
            t9.b.e("Could not create http cache", e10);
        }
        n9.b.c();
        OkHttpClient.Builder builderAddInterceptor = RetrofitUrlManager.getInstance().with(new OkHttpClient.Builder()).cookieJar(new am.a(new bm.b(em.r.a()))).addInterceptor(new cm.b(em.r.a())).addInterceptor(new cm.a(map)).sslSocketFactory(b(), new d()).hostnameVerifier(new c()).addInterceptor(new a()).addInterceptor(new dm.c.b().i(false).l(Level.BASIC).h(4).j("Request").k("Response").b("log-header", "I am the log request header.").c());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f67126d = builderAddInterceptor.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).proxy(Proxy.NO_PROXY).connectionPool(new ConnectionPool(8, 15L, timeUnit)).build();
        f67127e = new Retrofit.Builder().client(f67126d).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl(str).build();
    }

    public static b0 c() {
        f67128f = "";
        return b.f67132a;
    }

    public <T> T a(Class<T> cls) {
        if (cls != null) {
            return (T) f67127e.create(cls);
        }
        throw new RuntimeException("Api service is null!");
    }
}
