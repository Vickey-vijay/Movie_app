package com.mbridge.msdk.foundation.tools;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.Y1;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameDiTool.java */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends v {
    private static int A = 0;
    private static String B = "";
    private static Object C = null;
    private static int D = 0;
    private static int E = 0;
    private static long F = -1;
    private static long G = -1;
    private static String H = "";
    private static String I = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f35322j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f35323k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f35324l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f35325m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f35326n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f35327o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f35328p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f35329q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f35330r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f35331s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile int f35332t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f35333u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f35334v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f35335w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f35336x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f35337y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static int f35338z = -1;

    /* JADX INFO: compiled from: SameDiTool.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35339a;

        public a(Context context) {
            this.f35339a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.c(this.f35339a);
        }
    }

    /* JADX INFO: compiled from: SameDiTool.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35340a;

        public b(Context context) {
            this.f35340a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String defaultUserAgent;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(this.f35340a);
            } catch (Throwable unused) {
                defaultUserAgent = null;
            }
            try {
                if (TextUtils.isEmpty(defaultUserAgent) || defaultUserAgent.equals(m0.f35337y)) {
                    return;
                }
                String unused2 = m0.f35337y = defaultUserAgent;
                m0.G(this.f35340a);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: SameDiTool.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35341a;

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f35341a.getSystemService("connectivity");
                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f34916z) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        int unused = m0.f35332t = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        int unused2 = m0.f35332t = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) this.f35341a.getSystemService("phone");
                    if (telephonyManager == null) {
                        int unused3 = m0.f35332t = 0;
                    } else {
                        int unused4 = m0.f35332t = m0.c(telephonyManager.getNetworkType());
                    }
                }
            } catch (Exception unused5) {
                int unused6 = m0.f35332t = 0;
            }
        }

        public c(Context context) {
            this.f35341a = context;
        }
    }

    public static int A() {
        return f35338z;
    }

    public static int B() {
        if (D == 0) {
            D = v0.e();
        }
        return D;
    }

    public static void C(Context context) {
        try {
            v.e(context);
            o();
            q();
            t(context);
            B(context);
            A(context);
            F(context);
            n();
            s();
            p(context);
            w();
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.f34916z = v0.b("android.permission.ACCESS_NETWORK_STATE", context);
            w(context);
            l();
            g.b();
            g();
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int D(Context context) {
        if (f35324l == -1) {
            f35324l = v0.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f35324l;
    }

    public static int E() {
        if (f35326n == -1) {
            f35326n = v0.g() ? 1 : 0;
        }
        return f35326n;
    }

    private static void F() {
        String str = Build.VERSION.RELEASE;
        String strN = n();
        String str2 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strN)) {
            f35337y = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mozilla/5.0 (Linux; Android ");
        sb2.append(str);
        sb2.append("; ");
        sb2.append(strN);
        sb2.append(" Build/");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
        f35337y = sb2.toString();
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static Object d(String str) {
        if (C == null) {
            C = v0.g(str);
        }
        return C;
    }

    public static void g(Context context) {
        try {
            c cVar = new c(context);
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(cVar);
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g.c(context);
            } else {
                new Handler(context.getMainLooper()).post(new a(context));
            }
        } catch (Exception e10) {
            q0.b("SameDiTool", "", e10);
        }
    }

    public static String i() {
        if (TextUtils.isEmpty(f35337y)) {
            l(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f35337y;
    }

    public static String j() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void k() {
        try {
            Object objA = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID, "");
            Object objA2 = y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (objA instanceof String) {
                String str = (String) objA;
                if (!TextUtils.isEmpty(str)) {
                    g.a(str);
                }
                if (objA2 instanceof Integer) {
                    g.a(((Integer) objA2).intValue());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    public static String l(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        i(context);
        try {
            if (!(Looper.myLooper() == Looper.getMainLooper()) || MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f35337y)) {
                    F();
                }
                z(context);
            } else if (TextUtils.isEmpty(f35337y)) {
                try {
                    f35337y = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(f35337y)) {
                    try {
                        Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                        declaredConstructor.setAccessible(true);
                        f35337y = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                        declaredConstructor.setAccessible(false);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    if (TextUtils.isEmpty(f35337y)) {
                        try {
                            f35337y = new WebView(context).getSettings().getUserAgentString();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(f35337y)) {
                        F();
                    }
                }
            } else {
                z(context);
            }
        } catch (Throwable th4) {
            q0.b("SameDiTool", th4.getMessage(), th4);
        }
        G(context);
        return f35337y;
    }

    public static int m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("height") == null ? displayMetrics.heightPixels : ((Integer) mapV.get("height")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String n() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    private static void o() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new f());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static String p() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    public static String q(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f35330r = "";
            } else if (TextUtils.isEmpty(f35330r)) {
                if (context == null) {
                    f35330r = "";
                    return "";
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f35330r = simOperator.substring(0, Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f35330r = "";
        }
        return f35330r;
    }

    public static String r(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f35331s = "";
            } else if (TextUtils.isEmpty(f35331s)) {
                if (context == null) {
                    f35331s = "";
                    return f35330r;
                }
                String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (v0.j(simOperator)) {
                    f35331s = simOperator.substring(Math.min(3, simOperator.length()));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f35331s = "";
        }
        return f35331s;
    }

    @SuppressLint({"MissingPermission"})
    public static int s(Context context) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f35332t;
            }
            if (contextD == null) {
                return f35332t;
            }
            if (f35332t != -1) {
                g(contextD);
                return f35332t;
            }
            f35332t = 0;
            return f35332t;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            f35332t = 0;
            return f35332t;
        }
    }

    public static String t(Context context) {
        if (context == null) {
            return f35334v;
        }
        try {
            if (!TextUtils.isEmpty(f35334v)) {
                return f35334v;
            }
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            f35334v = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String u() {
        try {
            if (TextUtils.isEmpty(I)) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                long jA = l0.a();
                String strJ = j(contextD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("1", strJ);
                    jSONObject.put("2", String.valueOf(G));
                    jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, String.valueOf(jA));
                    jSONObject.put("4", "");
                    jSONObject.put(CampaignEx.CLICKMODE_ON, "");
                } catch (Exception e10) {
                    q0.b("SameDiTool", e10.getMessage());
                }
                String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                I = strB;
                if (strB == null) {
                    I = "";
                }
            }
        } catch (Exception e11) {
            q0.b("SameDiTool", e11.getMessage());
        }
        return I;
    }

    public static HashMap v(Context context) {
        HashMap map = new HashMap();
        if (context == null) {
            return map;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            map.put("height", Integer.valueOf(displayMetrics.heightPixels));
            map.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
        }
        return map;
    }

    public static String w() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                return "";
            }
            if (TextUtils.isEmpty(f35336x)) {
                new Thread(new d()).start();
                return f35336x;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
        return f35336x;
    }

    public static String x(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
            return "";
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static String y(Context context) {
        return (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) && context != null) ? String.valueOf(G) : "";
    }

    private static void z(Context context) {
        try {
            new Thread(new b(context)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: compiled from: SameDiTool.java */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = m0.f35336x = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: SameDiTool.java */
    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.util.c.a();
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: SameDiTool.java */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                ActivityManager activityManager = (ActivityManager) contextD.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                long unused = m0.G = memoryInfo.totalMem;
                long unused2 = m0.F = memoryInfo.availMem;
            }
        }
    }

    public static int A(Context context) {
        if (context == null) {
            return A;
        }
        int i10 = A;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            A = i11;
            return i11;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Context context) {
        try {
            y0.b(context, "mbridge_ua", f35337y);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
        }
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 == 0 || i10 == 9) {
            return "";
        }
        try {
            return (!com.mbridge.msdk.foundation.same.a.f34916z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static int e(String str) {
        if (E == 0) {
            E = v0.f(str);
        }
        return E;
    }

    public static String j(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                f35323k = "";
            } else if (TextUtils.isEmpty(f35323k)) {
                f35323k = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            f35323k = "";
        }
        return f35323k;
    }

    public static int n(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap mapV = v(context);
            return mapV.get("width") == null ? displayMetrics.widthPixels : ((Integer) mapV.get("width")).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static float o(Context context) {
        Resources resources;
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null && (resources = context.getResources()) != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
        return -1.0f;
    }

    public static String p(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f35328p)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f35328p = languageTag;
                return languageTag;
            } catch (Throwable th2) {
                q0.a("SameDiTool", th2.getMessage());
                f35328p = "en-US";
            }
        }
        return f35328p;
    }

    public static int y() {
        try {
            if (!s0.a().a("v_a_d_p", false)) {
                return 0;
            }
            if (v0.i()) {
                f35327o = 1;
            } else if (v0.j()) {
                f35327o = 2;
            } else {
                f35327o = 0;
            }
        } catch (Exception e10) {
            f35327o = 0;
            q0.b("SameDiTool", e10.getMessage());
        }
        return f35327o;
    }

    public static String B(Context context) {
        if (context == null) {
            return B;
        }
        try {
            if (TextUtils.isEmpty(B)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                B = str;
                return str;
            }
            return B;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static int D() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return -1;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                String str3 = Build.HARDWARE;
                if (!str3.equals("goldfish") && !str3.equals("vbox86") && !str3.contains("qemu")) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static boolean E(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static void d(int i10) {
        f35329q = i10;
    }

    private static void i(Context context) {
        if (TextUtils.isEmpty(f35337y)) {
            try {
                f35337y = y0.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th2) {
                q0.b("SameDiTool", th2.getMessage(), th2);
            }
        }
    }

    public static int z() {
        try {
            if (v0.i()) {
                return 1;
            }
            return v0.j() ? 2 : 0;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage());
            return 0;
        }
    }

    public static void g() {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new e());
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
    }

    public static int h() {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return 0;
            }
            long j10 = F;
            if (j10 > 0) {
                return Long.valueOf((j10 / 1000) / 1000).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage(), th2);
            return -1;
        }
    }

    public static int m() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(H)) {
            long j10 = G;
            if (j10 > 0) {
                H = Math.ceil(Float.valueOf(j10 / 1.07374182E9f).doubleValue()) + "GB";
            }
        }
        return H;
    }

    public static int F(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static String a(String str, Context context) {
        try {
            if (!TextUtils.isEmpty(f35322j)) {
                return f35322j;
            }
            if (!TextUtils.isEmpty(str) && context != null) {
                f35322j = context.getPackageManager().getInstallerPackageName(str);
                q0.a("SameDiTool", "PKGSource:" + f35322j);
            }
            return f35322j;
        } catch (Exception e10) {
            q0.b("SameDiTool", e10.getMessage(), e10);
        }
    }

    public static String t() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + Z7.f27998r + Build.MODEL;
    }

    public static int w(Context context) {
        if (context == null) {
            return f35335w;
        }
        if (f35335w == 0) {
            try {
                f35335w = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e10) {
                q0.b("SameDiTool", e10.getMessage());
            }
        }
        return f35335w;
    }

    public static int v() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        long j10 = G;
        if (j10 > 0) {
            return Long.valueOf((j10 / 1000) / 1000).intValue();
        }
        return -1;
    }

    public static String k(Context context) {
        try {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) || context == null) {
                return Y1.f27894f;
            }
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? Y1.f27894f : str;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return Y1.f27894f;
        }
    }

    public static String q() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f35333u)) {
            f35333u = r() + "";
        }
        return f35333u;
    }

    public static int r() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static String s() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.BRAND;
    }

    public static int u(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER) && context != null) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return -1;
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
            return -1;
        }
    }

    public static int C() {
        return f35329q;
    }

    public static String l() {
        if (!TextUtils.isEmpty(f35325m)) {
            return f35325m;
        }
        JSONObject jSONObject = new JSONObject();
        String str = null;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th2) {
            q0.b("SameDiTool", th2.getMessage());
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", new Class[0]).invoke(cls2, new Object[0]));
                } catch (Throwable th3) {
                    q0.b("SameDiTool", th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    q0.b("SameDiTool", th4.getMessage());
                }
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = k0.b(string);
                }
                f35325m = string;
            } else {
                f35325m = "android";
            }
        } catch (Throwable th5) {
            q0.b("SameDiTool", th5.getMessage());
        }
        return f35325m;
    }
}
