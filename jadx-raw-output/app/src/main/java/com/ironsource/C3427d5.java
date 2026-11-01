package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3427d5 implements B7, B7.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f28627j = "android";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f28628k = "com.google.android.gms.permission.AD_ID";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f28629l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f28630m = "com.google.android.gms.appset.AppSet";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f28631n = "com.google.android.gms.tasks.OnSuccessListener";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f28632o = "getAdvertisingIdInfo";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f28633p = "getClient";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f28634q = "getAppSetIdInfo";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f28635r = "addOnSuccessListener";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f28636s = "getId";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f28637t = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f28638u = "Mediation_Shared_Preferences";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f28639v = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f28640w = "cachedUUID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f28641x = "auid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f28642y = "unityads-installinfo";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f28643z = "unityads-idfi";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28644b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28645c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28646d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28647e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28648f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28649g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f28650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f28651i;

    /* JADX INFO: renamed from: com.ironsource.d5$a */
    public class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                        String string = obj2.getClass().getMethod(C3427d5.f28636s, null).invoke(objArr[0], null).toString();
                        if (!TextUtils.isEmpty(string)) {
                            C3427d5.this.f28649g = string;
                        }
                    }
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                }
            }
            return null;
        }

        public a() {
        }
    }

    @Override // com.ironsource.B7
    public String F(Context context) {
        try {
            return C3504ha.a(context, E, (String) null);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f28644b)) {
            return this.f28644b;
        }
        if (C3504ha.a(context, f28638u, "uuidEnabled", true)) {
            String strA = C3504ha.a(context, f28638u, f28640w, "");
            if (TextUtils.isEmpty(strA)) {
                String string = UUID.randomUUID().toString();
                this.f28644b = string;
                C3504ha.b(context, f28638u, f28640w, string);
            } else {
                this.f28644b = strA;
            }
        }
        return this.f28644b;
    }

    @Override // com.ironsource.B7
    public long a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.B7
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.B7
    public String c(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.B7
    public String d() {
        String id2 = TimeZone.getDefault().getID();
        return id2 != null ? id2 : "";
    }

    @Override // com.ironsource.B7
    public boolean e(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public File f(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.B7
    public String f() {
        return "android";
    }

    @Override // com.ironsource.B7
    public long g() {
        if (j()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.B7
    public boolean h(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public String i() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.B7
    public boolean j() {
        try {
            return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.B7
    public int k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.B7
    public String l() {
        return Build.MODEL;
    }

    @Override // com.ironsource.B7
    public int m() {
        return -(TimeZone.getDefault().getOffset(a()) / 60000);
    }

    @Override // com.ironsource.B7
    public ActivityManager.MemoryInfo n(Context context) {
        if (context == null || !Lb.U().g().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    @Override // com.ironsource.B7
    public int o() {
        return k();
    }

    @Override // com.ironsource.B7
    public boolean p() {
        return b("su");
    }

    @Override // com.ironsource.B7
    public long q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.ironsource.B7
    public float r() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.B7
    public String s() {
        try {
            return this.f28647e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f28647e;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return "";
        }
    }

    @Override // com.ironsource.B7
    public String t() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e10) {
            IronLog.INTERNAL.error(e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.B7
    public String v(Context context) {
        try {
            return C3504ha.a(context, "IABTCF_TCString", (String) null);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    private void P(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = AppSet.class.getMethod(f28633p, Context.class).invoke(AppSet.class, context);
        Object objInvoke2 = objInvoke.getClass().getMethod(f28634q, null).invoke(objInvoke, null);
        objInvoke2.getClass().getMethod(f28635r, OnSuccessListener.class).invoke(objInvoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return AdvertisingIdClient.class.getMethod(f28632o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String S(Context context) {
        try {
            return C3504ha.a(context, f28638u, A, "");
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(C3504ha.a(context, f28638u, B, String.valueOf(-1L)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.B7
    public boolean C(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.B7
    public int D(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public float E(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.B7
    public String G(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.B7
    public String I(Context context) {
        String strO;
        C3373a5 c3373a5 = C3373a5.f28115a;
        if (!c3373a5.b()) {
            return null;
        }
        try {
            if (!c3373a5.a()) {
                strO = O(context);
            } else {
                if (this.f28651i == null) {
                    String strO2 = O(context);
                    if (TextUtils.isEmpty(strO2)) {
                        return strO2;
                    }
                    this.f28651i = strO2;
                    return strO2;
                }
                strO = this.f28651i;
            }
            return strO;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public boolean J(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    @Override // com.ironsource.B7
    public int K(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.B7
    public String L(Context context) {
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveInfoResolveActivity != null) {
                return resolveInfoResolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.B7
    public synchronized String d(Context context) {
        if (!TextUtils.isEmpty(this.f28645c)) {
            return this.f28645c;
        }
        if (context == null) {
            return "";
        }
        String strA = C3504ha.a(context, "supersonic_shared_preferen", "auid", "");
        this.f28645c = strA;
        if (TextUtils.isEmpty(strA)) {
            String string = UUID.randomUUID().toString();
            this.f28645c = string;
            C3504ha.b(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.f28645c;
    }

    @Override // com.ironsource.B7
    public String i(Context context) {
        if (!TextUtils.isEmpty(this.f28646d)) {
            return this.f28646d;
        }
        if (context == null) {
            return null;
        }
        String strA = C3504ha.a(context, "unityads-installinfo", "unityads-idfi", (String) null);
        this.f28646d = strA;
        return strA;
    }

    @Override // com.ironsource.B7
    public File l(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.B7
    public String m(Context context) {
        if (context == null) {
            return "";
        }
        int iN = N(context);
        if (iN != 0) {
            if (iN != 1) {
                if (iN != 11) {
                    if (iN != 12) {
                        switch (iN) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return C3426d4.i.D;
        }
        return C3426d4.i.C;
    }

    @Override // com.ironsource.B7
    public int o(Context context) {
        int iK = K(context);
        int iZ = z(context);
        return (((iK == 0 || iK == 2) && iZ == 2) || ((iK == 1 || iK == 3) && iZ == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.B7
    public boolean p(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.B7
    public String u(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.B7
    public String y(Context context) {
        if (C3373a5.f28115a.c()) {
            try {
                P(context);
                if (!TextUtils.isEmpty(this.f28649g)) {
                    return this.f28649g;
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
            }
        }
        return "";
    }

    private String O(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return objQ.getClass().getMethod(f28636s, null).invoke(objQ, null).toString();
    }

    private String R(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objQ = Q(context);
        return String.valueOf(((Boolean) objQ.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objQ, null)).booleanValue());
    }

    @Override // com.ironsource.B7
    public String A(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.B7
    public File B(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.B7
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ApplicationInfo> H(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.B7
    public int c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.B7
    public int k(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    @Override // com.ironsource.B7
    public String r(Context context) {
        return a(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.B7
    public int t(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.B7
    public boolean w(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.B7
    public String x(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.B7
    public int z(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.B7
    public boolean a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
    }

    @Override // com.ironsource.B7
    public int e() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.B7
    public boolean g(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(f28628k)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return false;
        }
    }

    @Override // com.ironsource.B7
    public long h() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.B7
    public File j(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.B7
    public boolean n() {
        return this.f28648f;
    }

    @Override // com.ironsource.B7
    public String q() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.B7
    public int s(Context context) {
        try {
            return C3504ha.a(context, "IABTCF_gdprApplies", -1);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return -1;
        }
    }

    @Override // com.ironsource.B7
    public int b() {
        return c();
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    @Override // com.ironsource.B7
    public String b(Context context) {
        String strR;
        try {
            if (C3373a5.f28115a.a()) {
                if (this.f28650h == null) {
                    String strR2 = R(context);
                    if (TextUtils.isEmpty(strR2)) {
                        return strR2;
                    }
                    this.f28650h = strR2;
                    return strR2;
                }
                strR = this.f28650h;
            } else {
                strR = R(context);
            }
            return strR;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return null;
        }
    }

    @Override // com.ironsource.B7
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.B7
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.B7
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.ironsource.B7.a
    public void a(Context context, long j10) {
        if (context != null) {
            if (!new C3492gg(new InterfaceC3710t4.a()).a(T(context), j10)) {
                String strS = S(context);
                this.f28647e = strS;
                this.f28648f = !strS.isEmpty();
            }
            if (this.f28647e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f28647e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j10 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
    }

    private void b(Context context, long j10) {
        try {
            C3504ha.b(context, f28638u, B, String.valueOf(j10));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(Context context, String str) {
        try {
            C3504ha.b(context, f28638u, A, str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
