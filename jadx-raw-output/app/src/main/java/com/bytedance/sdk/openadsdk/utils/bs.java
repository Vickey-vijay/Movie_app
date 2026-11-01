package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bs {
    private static volatile com.bytedance.sdk.component.pno.lh.le bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f13377cf;
    private static volatile com.bytedance.sdk.component.pno.lh.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f13378le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f13379lh;
    private static volatile ThreadPoolExecutor ouw;
    private static volatile com.bytedance.sdk.component.pno.lh.le pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f13380ra;
    private static volatile com.bytedance.sdk.component.pno.lh.le tlj;
    private static volatile boolean vt;
    private static volatile com.bytedance.sdk.component.pno.lh.le yu;

    public static ExecutorService fkw() {
        return bly();
    }

    public static boolean le() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService lh() {
        return zih();
    }

    public static ScheduledExecutorService ouw() {
        return com.bytedance.sdk.component.pno.le.vt();
    }

    public static ExecutorService vt() {
        return ko();
    }

    public static ExecutorService yu() {
        return mwh();
    }

    static {
        com.bytedance.sdk.component.pno.lh.lh.ouw(new com.bytedance.sdk.component.pno.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.bs.1
            @Override // com.bytedance.sdk.component.pno.lh.ouw
            public final void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.ouw("ThreadUtils", " cycleCallTask = ", vtVar.yu, new RuntimeException());
            }
        });
        ouw = null;
        vt = false;
    }

    public static com.bytedance.sdk.component.pno.lh.le bly() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f13378le;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f13378le)) {
                try {
                    f13378le = ouw("cache", f13378le);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f13378le;
            } else {
                leVar = f13378le;
            }
            throw th;
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le cf() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = tlj;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(tlj)) {
                try {
                    tlj = ouw("net", tlj);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = tlj;
            } else {
                leVar = tlj;
            }
            throw th;
        }
        return leVar;
    }

    public static void fkw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        jg().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.8
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le jg() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = fkw;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(fkw)) {
                try {
                    fkw = ouw("aidl", fkw);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = fkw;
            } else {
                leVar = fkw;
            }
            throw th;
        }
        return leVar;
    }

    private static com.bytedance.sdk.component.pno.lh.le ko() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = pno;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(pno)) {
                try {
                    pno = ouw("image", pno);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = pno;
            } else {
                leVar = pno;
            }
            throw th;
        }
        return leVar;
    }

    public static void le(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName(), pnoVar) { // from class: com.bytedance.sdk.openadsdk.utils.bs.9
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void lh(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        mwh().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.5
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le mwh() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = yu;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(yu)) {
                try {
                    yu = ouw(CreativeInfo.f44317an, yu);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = yu;
            } else {
                leVar = yu;
            }
            throw th;
        }
        return leVar;
    }

    public static void ouw(Runnable runnable) {
        if (runnable == null || uq.ouw) {
            return;
        }
        if (le()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.jg.lh().post(runnable);
        }
    }

    private static com.bytedance.sdk.component.pno.lh.le rn() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f13380ra;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f13380ra)) {
                try {
                    f13380ra = ouw("io", f13380ra);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f13380ra;
            } else {
                leVar = f13380ra;
            }
            throw th;
        }
        return leVar;
    }

    private static ThreadPoolExecutor ryl() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f13379lh;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f13379lh)) {
                try {
                    f13379lh = ouw("ad", f13379lh);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f13379lh;
            } else {
                leVar = f13379lh;
            }
            throw th;
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le tlj() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = bly;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(bly)) {
                try {
                    bly = ouw("express", bly);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = bly;
            } else {
                leVar = bly;
            }
            throw th;
        }
        return leVar;
    }

    public static void vt(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(runnable);
    }

    public static void yu(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.7
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    private static com.bytedance.sdk.component.pno.lh.le zih() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f13377cf;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            if (ouw(f13377cf)) {
                try {
                    f13377cf = ouw("imgdisk", f13377cf);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                }
                leVar = f13377cf;
            } else {
                leVar = f13377cf;
            }
            throw th;
        }
        return leVar;
    }

    public static ExecutorService pno() {
        return rn();
    }

    public static boolean ra() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        rn().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.3
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar, int i10) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.6
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f11895lh = i10;
        mwh().execute(vtVar);
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        bly().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.2
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar, int i10) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.4
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f11895lh = i10;
        rn().execute(vtVar);
    }

    public static void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
        cf().execute(vtVar);
    }

    private static com.bytedance.sdk.component.pno.lh.le ouw(String str, com.bytedance.sdk.component.pno.lh.le leVar) {
        com.bytedance.sdk.component.pno.lh.le.ouw ouwVarOuw = ouw(str);
        if (leVar == null) {
            return ouwVarOuw.ouw();
        }
        leVar.ouw(ouwVarOuw);
        return leVar;
    }

    private static boolean ouw(com.bytedance.sdk.component.pno.lh.le leVar) {
        if (leVar != null) {
            return !leVar.ouw && com.bytedance.sdk.openadsdk.core.settings.cf.hun();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private static com.bytedance.sdk.component.pno.lh.le.ouw ouw(String str) {
        byte b10;
        byte b11;
        String str2 = TextUtils.isEmpty(str) ? "unknown" : str;
        com.bytedance.sdk.component.pno.lh.le.ouw ouwVar = new com.bytedance.sdk.component.pno.lh.le.ouw();
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1308979344:
                if (!str2.equals("express")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 3107:
                if (!str2.equals("ad")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 3366:
                if (!str2.equals("io")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 107332:
                if (!str2.equals(CreativeInfo.f44317an)) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 108957:
                if (!str2.equals("net")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 2993840:
                if (!str2.equals("aidl")) {
                    b10 = -1;
                } else {
                    b11 = 5;
                    b10 = b11;
                }
                break;
            case 94416770:
                if (!str2.equals("cache")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 100313435:
                if (!str2.equals("image")) {
                    b10 = -1;
                } else {
                    b11 = 7;
                    b10 = b11;
                }
                break;
            case 1236319578:
                if (!str2.equals("monitor")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1917389792:
                if (!str2.equals("imgdisk")) {
                    b10 = -1;
                } else {
                    b11 = 9;
                    b10 = b11;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f11891lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 1:
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f11891lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 2:
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f11891lh = 10;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 3:
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f11891lh = 6;
                ouwVar.yu = 2;
                ouwVar.fkw = 20000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 4:
                ouwVar.ouw = str2;
                ouwVar.vt = 10;
                ouwVar.f11891lh = 10;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 5:
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f11891lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 6:
                ouwVar.ouw = str2;
                ouwVar.vt = 0;
                ouwVar.f11891lh = 0;
                ouwVar.yu = 0;
                ouwVar.fkw = 5000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 7:
                ouwVar.ouw = str2;
                ouwVar.vt = 3;
                ouwVar.f11891lh = 3;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 8:
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f11891lh = 2;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            case 9:
                ouwVar.ouw = str2;
                ouwVar.vt = 1;
                ouwVar.f11891lh = 2;
                ouwVar.yu = 3;
                ouwVar.fkw = 10000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
            default:
                ouwVar.ouw = str2;
                ouwVar.vt = 8;
                ouwVar.f11891lh = 16;
                ouwVar.yu = 2;
                ouwVar.fkw = 20000L;
                ouwVar.f11890le = true;
                ouwVar.pno = false;
                break;
        }
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.cf.hun()) {
                ouwVar.pno = true;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt();
                JSONObject jSONObject = (JSONObject) cfVarVt.pno.ouw("perf_con_thread_pool_config", new JSONObject(), cfVarVt.f13058rn);
                JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    ouwVar.pno = true;
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        ouwVar.vt = jSONObjectOptJSONObject.optInt("coreSize");
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        ouwVar.f11891lh = jSONObjectOptJSONObject.optInt("maxSize");
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        ouwVar.yu = jSONObjectOptJSONObject.optInt("createSize");
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        ouwVar.fkw = jSONObjectOptJSONObject.optInt("keepAlive");
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        ouwVar.f11890le = jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut");
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
        }
        return ouwVar;
    }
}
