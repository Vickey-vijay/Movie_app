package sg.bigo.ads.common.aa;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.Y1;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.d.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f69469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<a> f69470b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f69471c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f69472d = Y1.f27894f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f69473e = Y1.f27894f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f69474f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f69475g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f69476h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static sg.bigo.ads.common.b f69477i = new sg.bigo.ads.common.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f69478j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static BroadcastReceiver f69479k = new BroadcastReceiver() { // from class: sg.bigo.ads.common.aa.b.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b.f69476h <= 0 || System.currentTimeMillis() - b.f69476h >= r.f70030a.a(10)) {
                long unused = b.f69476h = System.currentTimeMillis();
                if (intent != null) {
                    try {
                        b.f69477i.f69489a = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                        b.f69477i.f69490b = intent.getIntExtra("scale", -1);
                        b.f69477i.f69491c = intent.getIntExtra("status", -1);
                    } catch (Throwable unused2) {
                        b.f69477i.f69489a = -1;
                        b.f69477i.f69490b = -1;
                        b.f69477i.f69491c = -1;
                    }
                }
            }
        }
    };

    public interface a {
        void a(int i10);
    }

    public static int a(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i10 = activity.getResources().getConfiguration().orientation;
        if (1 == i10) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i10) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static void a() {
        f69472d = Y1.f27894f;
        f69473e = Y1.f27894f;
    }

    public static synchronized void a(Context context, @NonNull a aVar) {
        if (context != null) {
            List<a> list = f69470b;
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
            if (!f69471c) {
                f69471c = true;
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "registerScreenListener");
                sg.bigo.ads.common.d.a.a().a(context, new e() { // from class: sg.bigo.ads.common.aa.b.1
                    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
                    /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:16:0x0049->B:18:0x004f, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:19:0x005d A[ORIG_RETURN, RETURN] */
                    @Override // sg.bigo.ads.common.d.b
                    public final void a(Context context2, Intent intent) {
                        Iterator it;
                        int i10;
                        String action = intent.getAction();
                        if (q.a((CharSequence) action)) {
                            return;
                        }
                        int i11 = b.f69469a;
                        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "action = ".concat(String.valueOf(action)));
                        action.hashCode();
                        if (!action.equals("android.intent.action.SCREEN_OFF")) {
                            i10 = action.equals("android.intent.action.USER_PRESENT") ? 1 : 2;
                            if (i11 != b.f69469a) {
                                it = b.f69470b.iterator();
                                while (it.hasNext()) {
                                    ((a) it.next()).a(b.f69469a);
                                }
                            }
                        }
                        int unused = b.f69469a = i10;
                        if (i11 != b.f69469a) {
                            it = b.f69470b.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(b.f69469a);
                            }
                        }
                    }
                });
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f69469a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            f69469a = powerManager == null || powerManager.isScreenOn() ? 1 : 2;
        }
        return f69469a == 1;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals(ScarConstants.IN_SIGNAL_KEY)) {
            return "id";
        }
        return language.equals("ji") ? "yi" : language;
    }

    public static boolean b() {
        return j() && f69474f == 1;
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    public static boolean c() {
        boolean z10;
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            int i10 = 0;
            while (true) {
                if (i10 >= 6) {
                    z10 = false;
                    break;
                }
                if (new File(strArr[i10]).exists()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                String str = Build.TAGS;
                if (!(str != null && str.contains("test-keys")) && !k()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f27894f.equals(f69472d)) {
            f69472d = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f69472d;
            }
            try {
                f69472d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return f69472d;
    }

    public static boolean d() {
        return true;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f27894f.equals(f69473e)) {
            f69473e = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f69473e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                f69473e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    f69473e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return f69473e;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    @WorkerThread
    public static void g(Context context) {
        if (f69475g.getAndSet(true) || context == null || !j()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "Register display listener");
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i10) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i10) {
                if (i10 == 0) {
                    try {
                        int unused = b.f69474f = displayManager.getDisplay(i10).getState();
                    } catch (Throwable unused2) {
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "onDisplayChanged: " + i10 + ", sDefaultDisplayState: " + b.f69474f);
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i10) {
            }
        }, null);
    }

    public static sg.bigo.ads.common.b h(Context context) {
        if (!f69478j) {
            i(context);
        }
        return f69477i;
    }

    public static void i(Context context) {
        if (context == null || f69478j) {
            return;
        }
        context.registerReceiver(f69479k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        f69478j = true;
    }

    public static void j(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = f69479k) == null || !f69478j) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        f69479k = null;
        f69478j = false;
    }

    private static boolean j() {
        return true;
    }

    private static boolean k() {
        for (String str : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            File file = new File(str);
            if (file.isDirectory() && new File(file, "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static int l(Context context) {
        int i10 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i10 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i10;
    }

    public static float m(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getVolume exception: " + e10.getMessage());
        }
        return 0.0f;
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            return accessibilityManager != null && accessibilityManager.isEnabled();
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isAccessibilityServiceEnabled exception: " + e10.getMessage());
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getNotificationMode exception: " + e10.getMessage());
        }
        return 0;
    }

    public static float p(Context context) {
        if (context == null) {
            return 1.0f;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.fontScale;
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getFontScale exception: " + e10.getMessage());
        }
        return 1.0f;
    }

    public static int q(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int i10 = context.getResources().getDisplayMetrics().densityDpi;
            int i11 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 0 : 2;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getDisplayScale exception: " + e10.getMessage());
            return -1;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i10 = context.getResources().getConfiguration().uiMode & 48;
            if (i10 != 16) {
                return i10 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getThemeMode exception: " + e10.getMessage());
            return 0;
        }
    }

    public static int s(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getTargetSdkVersion exception: " + th2.getMessage());
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getMinSdkVersion exception: " + th2.getMessage());
            return 0;
        }
    }

    public static boolean u(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            sg.bigo.ads.common.t.a.b("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static long v(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getApkSize exception: " + th2.getMessage());
            return 0L;
        }
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isUnityEnvironment exception: " + th2.getMessage());
            return false;
        }
    }
}
