package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class DetectTouchUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43614a = "DetectTouchUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, u> f43615b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, u> f43616c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f43617d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f43618e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ExecutorService f43619f = Executors.newSingleThreadExecutor();

    public static u a(String str) {
        Logger.d(f43614a, "getLastTouchEvent is latestTouchEventBySdkMap contains " + str + "? " + f43615b.containsKey(str) + ", map = " + f43615b);
        if (!f43615b.containsKey(str) || f43615b.get(str) == null) {
            return null;
        }
        Logger.d(f43614a, "getLastTouchEvent returns " + f43615b.get(str));
        return f43615b.get(str);
    }

    public static u a(String str, String str2) {
        return f43616c.get(str + "_" + str2);
    }

    public static void activityOnTouch(String sdkPackageName, MotionEvent me2) {
        try {
            if (me2.getAction() == 0) {
                Logger.d(f43614a, "activity on touch started, sdk: " + sdkPackageName + ", motion event: " + me2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if ((0 != me2.getEventTime()) && me2.getActionMasked() != 2) {
                    b(null, sdkPackageName);
                }
            }
        } catch (Throwable th2) {
            Logger.d(f43614a, "error in activity on touch", th2);
        }
    }

    public static void viewOnTouch(String sdkPackage, View view, MotionEvent me2) {
        try {
            if (me2.getAction() == 0) {
                Logger.d(f43614a, "view on touch, started, sdkPackage = " + sdkPackage + ", View = " + view + ", MotionEvent = " + me2);
                if (sdkPackage.equals(com.safedk.android.utils.g.f44955a) && (view instanceof MaxNativeAdView)) {
                    String sdkPackage2 = NativeFinder.b((MaxNativeAdView) view);
                    if (sdkPackage2 == null) {
                        sdkPackage2 = BannerFinder.a((MaxNativeAdView) view);
                    }
                    if (sdkPackage2 != null) {
                        try {
                            Logger.d(f43614a, "view on touch, translate Max native ad view to sdk: " + sdkPackage2 + ", view: " + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            sdkPackage = sdkPackage2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        Logger.d(f43614a, "view on touch, failed to translate Max native ad view to sdk, view: " + view);
                    }
                } else if (view instanceof WebView) {
                    Logger.d(f43614a, "web view on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me2);
                } else if (view instanceof ViewGroup) {
                    Logger.d(f43614a, "view group on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me2);
                } else {
                    Logger.d(f43614a, "view on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me2);
                }
                b(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage);
                return;
            }
            return;
        } catch (Throwable th3) {
            th = th3;
        }
        Logger.d(f43614a, "error in view on touch", th);
    }

    public static void b(final String str, final String str2) {
        if (com.safedk.android.utils.k.c()) {
            f43619f.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.d(str, str2);
                }
            });
        } else {
            d(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        if (SafeDK.P() && (f43618e || (f43617d != null && str != null && f43617d.contains(str)))) {
            Logger.d(f43614a, "ignore touch event, sdk: " + str2 + ", view address: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        u uVar = new u(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str);
        f43615b.put(str2, uVar);
        Logger.d(f43614a, "Set latest touch event, setting sdk: " + str2 + ", details: " + uVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (str != null) {
            String str3 = str2 + "_" + str;
            f43616c.put(str3, uVar);
            Logger.d(f43614a, "Set latest touch event, setting key: " + str3 + ", details: " + uVar);
        }
    }

    public static void b(final String str) {
        if (com.safedk.android.utils.k.c()) {
            f43619f.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.e(str);
                }
            });
        } else {
            e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (SafeDK.P()) {
            f43617d = str;
            Logger.d(f43614a, "set ignore next touch event: " + f43617d + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            new Timer("RedirectSimulationTimer").schedule(new TimerTask() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String unused = DetectTouchUtils.f43617d = null;
                    Logger.d(DetectTouchUtils.f43614a, "timeout ignore next touch event");
                }
            }, SafeDK.getInstance().f());
        }
    }

    public static void a() {
        f43617d = null;
        Logger.d(f43614a, "reset ignore next touch event");
    }

    public static boolean b() {
        f43618e = !f43618e;
        Logger.d(f43614a, "toggle ignore touch events: " + f43618e);
        return f43618e;
    }
}
