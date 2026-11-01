package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: GeckoConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f10565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f10566s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f10568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f10569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f10570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f10571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f10572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f10573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f10574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f10575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f10576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f10577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f10578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f10579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f10580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f10582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f10583q;

    /* JADX INFO: compiled from: GeckoConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f10584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f10585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f10586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f10587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f10588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f10589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f10590g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f10591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f10592i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f10593j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f10594k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f10595l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f10596m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f10597n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f10598o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f10599p;

        public final a a(String... strArr) {
            this.f10586c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f10585b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f10595l = str;
            return this;
        }

        public a(Context context) {
            this.f10587d = context.getApplicationContext();
        }

        public final a a(INetWork iNetWork) {
            this.f10584a = iNetWork;
            return this;
        }

        public final a b() {
            this.f10592i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f10599p = j10;
            return this;
        }

        public final a b(String str) {
            this.f10594k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f10589f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f10590g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f10591h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f10593j = str;
            return this;
        }

        public final a a(File file) {
            this.f10596m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public final Context a() {
        return this.f10567a;
    }

    private b(a aVar) {
        Context context = aVar.f10587d;
        this.f10567a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f10585b;
        this.f10571e = list;
        this.f10572f = aVar.f10586c;
        this.f10568b = aVar.f10588e;
        this.f10573g = aVar.f10591h;
        Long l10 = aVar.f10592i;
        this.f10574h = l10;
        if (TextUtils.isEmpty(aVar.f10593j)) {
            this.f10575i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f10575i = aVar.f10593j;
        }
        String str = aVar.f10594k;
        this.f10576j = str;
        this.f10578l = aVar.f10597n;
        this.f10579m = aVar.f10598o;
        this.f10582p = aVar.f10599p;
        if (aVar.f10596m == null) {
            this.f10580n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f10580n = aVar.f10596m;
        }
        String str2 = aVar.f10595l;
        this.f10577k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f10570d = aVar.f10584a;
        this.f10569c = aVar.f10589f;
        this.f10581o = aVar.f10590g;
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f10565r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f10566s == null) {
            synchronized (b.class) {
                if (f10566s == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f10566s = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10566s;
    }

    public final void a(JSONObject jSONObject) {
        this.f10583q = jSONObject;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f10573g;
    }

    public final boolean c() {
        return this.f10581o;
    }

    public final List<String> d() {
        return this.f10572f;
    }

    public final List<String> e() {
        return this.f10571e;
    }

    public final JSONObject f() {
        return this.f10583q;
    }

    public final INetWork i() {
        return this.f10570d;
    }

    public final String j() {
        return this.f10577k;
    }

    public final long k() {
        return this.f10574h.longValue();
    }

    public final String l() {
        return this.f10579m;
    }

    public final String m() {
        return this.f10578l;
    }

    public final File n() {
        return this.f10580n;
    }

    public final String o() {
        return this.f10575i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f10568b;
    }

    public final IStatisticMonitor q() {
        return this.f10569c;
    }

    public final String r() {
        return this.f10576j;
    }

    public final long s() {
        return this.f10582p;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f10565r = iThreadPoolCallback;
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }
}
