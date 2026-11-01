package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import com.inmobi.media.Ji;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f22951a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f22952b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f22953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f22954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mj.g f22955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f22956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f22957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nk.l0 f22958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f22959i;

    public static final C3305xc a() {
        return new C3305xc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e10) {
                try {
                    throw new Zk(e10.getMessage());
                } catch (Zk e11) {
                    ck.p.i("Ji", "TAG");
                    e11.getMessage();
                    mj.g gVar = P9.f23321a;
                    P9.a(new L2(e11));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        ck.p.i("Ji", "TAG");
                    } catch (Exception e12) {
                        ck.p.i("Ji", "TAG");
                        e12.getMessage();
                        ck.p.i("Ji", "TAG");
                        mj.g gVar2 = P9.f23321a;
                        AbstractC2929i9.a(e12);
                    }
                    return str;
                } catch (Exception e13) {
                    ck.p.i("Ji", "TAG");
                    e13.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        ck.p.g(defaultUserAgent);
        return defaultUserAgent;
    }

    public static boolean c(Context context) {
        return true;
    }

    static {
        String simpleName = Ji.class.getSimpleName();
        f22954d = new AtomicBoolean();
        f22955e = kotlin.b.a(new bk.a() { // from class: b7.b2
            @Override // bk.a
            public final Object invoke() {
                return Ji.a();
            }
        });
        ck.p.i(simpleName, "TAG");
        ck.p.j(simpleName, "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9(simpleName, false));
        f22957g = executorServiceNewSingleThreadExecutor;
        ck.p.i(executorServiceNewSingleThreadExecutor, "COMPONENT_SERVICE");
        f22958h = kotlinx.coroutines.d.a(nk.l1.c(executorServiceNewSingleThreadExecutor));
    }

    public static void a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            T6.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e10) {
            ck.p.i("Ji", "TAG");
            e10.getMessage();
        }
    }

    public static final String c() {
        if (f22952b.length() == 0) {
            f22952b = b(f22951a);
        }
        return f22952b;
    }

    public static final boolean d() {
        return f22959i == 2;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        ck.p.j(activityLifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = f22951a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "coppa_store");
        ck.p.j("im_accid", C3426d4.i.W);
        return eaA.f22577a.getString("im_accid", null);
    }
}
