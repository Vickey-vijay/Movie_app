package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: NpthBus.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f6369a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f6370b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f6371c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f6372d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f6373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f6374f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f6377i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f6382n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f6375g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f6376h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f6378j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f6379k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f6380l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f6381m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f6383o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f6384p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f6385q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f6386r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f6387s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f6388t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f6389u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f6374f == null) {
            f6374f = g.a(f6369a);
        }
        return f6374f;
    }

    public static a b() {
        return f6376h;
    }

    public static g c() {
        if (f6378j == null) {
            synchronized (e.class) {
                f6378j = new g();
            }
        }
        return f6378j;
    }

    public static void d(boolean z10) {
        f6387s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f6379k == null) {
            synchronized (f6380l) {
                if (f6379k == null) {
                    f6379k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f6379k;
    }

    public static void l() {
        f6383o = 1;
    }

    public static void o() {
        f6373e = true;
    }

    public static void b(int i10, String str) {
        f6381m = i10;
        f6382n = str;
    }

    public static boolean d() {
        if (!f6375g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f6389u = z10;
    }

    public static Context g() {
        return f6369a;
    }

    public static Application h() {
        return f6370b;
    }

    public static ConfigManager i() {
        return f6375g;
    }

    public static long j() {
        return f6371c;
    }

    public static String k() {
        return f6372d;
    }

    public static int m() {
        return f6383o;
    }

    public static boolean n() {
        return f6373e;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f6377i;
    }

    public static int q() {
        return f6381m;
    }

    public static String r() {
        return f6382n;
    }

    public static boolean s() {
        return f6384p;
    }

    public static boolean t() {
        return f6385q;
    }

    public static boolean u() {
        return f6386r;
    }

    public static boolean v() {
        return f6387s;
    }

    public static boolean w() {
        return f6389u;
    }

    public static boolean x() {
        return f6388t;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f6374f = bVar;
    }

    public static void b(boolean z10) {
        f6385q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f6370b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f6370b == null) {
            f6371c = System.currentTimeMillis();
            f6369a = context;
            f6370b = application;
            f6379k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f6386r = z10;
    }

    public static void f(boolean z10) {
        f6388t = z10;
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f6374f = new com.apm.insight.nativecrash.b(f6369a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f6371c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(String str) {
        f6372d = str;
    }

    public static void a(int i10, String str) {
        if (f6377i == null) {
            synchronized (e.class) {
                if (f6377i == null) {
                    f6377i = new ConcurrentHashMap<>();
                }
            }
        }
        f6377i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f6384p = z10;
    }
}
