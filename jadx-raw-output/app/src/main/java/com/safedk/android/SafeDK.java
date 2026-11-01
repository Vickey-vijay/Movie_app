package com.safedk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.g;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.DeviceData;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.Api;
import com.safedk.android.utils.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SafeDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43369a = "com.safedk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43370c = "SafeDKMain";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f43371d = "SafeDK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f43372e = "https://config.safedk.com/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f43373f = "com.safedk.AppID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f43374g = "com.safedk.ConfigPrefix";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f43375h = "com.safedk.APIPrefix";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43376i = "com.safedk.DebugMode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f43377j = "com.safedk.MaximumStatsSetSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f43378k = "com.safedk.AggregationThreshold";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f43381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f43382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f43383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f43384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f43385r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f43386t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Context f43388v;
    private i B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f43392s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private DeviceData f43394z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<String> f43379l = Arrays.asList("com.android.vending", "com.amazon.venezia", "com.sec.android.app.samsungapps");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f43380m = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static SafeDK f43387u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static d f43389w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static AtomicBoolean f43390x = new AtomicBoolean(false);
    private static AtomicBoolean F = new AtomicBoolean(false);
    private static AtomicBoolean G = new AtomicBoolean(false);
    private static Boolean H = false;
    private static Boolean I = false;
    private static Boolean J = false;
    private static final ExecutorService K = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f43393y = null;
    private final Map<BrandSafetyUtils.AdType, b> A = new HashMap();
    private AtomicBoolean C = new AtomicBoolean(false);
    private int D = 0;
    private int E = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.safedk.android.analytics.brandsafety.i f43391b = null;

    public static String getSdkKey() {
        return "XMOKPK68yLQGgahbxRXybdKoZ1X02LDTUEhyDpkappkcveLd72eJHzxshASma_freMh1T21LxIFyznJFDdmvFm";
    }

    public static boolean a() {
        return f43386t;
    }

    public static synchronized boolean b() {
        return f43390x.get();
    }

    private SafeDK(Context context) {
        Logger.d(f43370c, "SafeDK ctor started");
        f43388v = context;
        AppLovinBridge.init(context);
        if (c()) {
            Logger.d(f43370c, "Before reading shared prefs");
            this.f43394z = new DeviceData(context, this.B);
        }
    }

    public boolean c() {
        try {
            if (!J.booleanValue() && F != null && !F.get()) {
                Logger.d(f43370c, "loading config from prefs");
                this.B = new i(f43388v.getSharedPreferences("SafeDKToggles", 0), f43380m);
            }
            J = true;
        } catch (IllegalStateException e10) {
            Logger.d(f43370c, "IllegalStateException caught during loading of configuration from prefs, device may be locked", e10);
        } catch (Throwable th2) {
            Logger.d(f43370c, "Exception during loading of configuration from prefs : " + th2.getMessage(), th2);
        }
        return J.booleanValue();
    }

    private synchronized void ac() {
        Logger.d(f43370c, C3426d4.a.f28413f);
        if (!r()) {
            Iterator<b> it = this.A.values().iterator();
            while (it.hasNext()) {
                it.next().a((String) null);
            }
            this.A.clear();
        }
    }

    private void ad() {
        try {
            ApplicationInfo applicationInfo = f43388v.getPackageManager().getApplicationInfo(f43388v.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                a(applicationInfo);
                b(applicationInfo);
                c(applicationInfo);
                d(applicationInfo);
            } else {
                Logger.e(f43370c, "SafeDK meta data is missing from manifest file");
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.d(f43370c, "Couldn't get application's meta data");
        }
    }

    private void a(ApplicationInfo applicationInfo) {
        try {
            try {
                PackageInfo packageInfo = f43388v.getPackageManager().getPackageInfo(f43388v.getPackageName(), 0);
                Logger.d(f43370c, "package is: " + packageInfo.packageName + ", Installer Package Name is " + f43388v.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f43386t = f43379l.contains(f43388v.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f43385r = (applicationInfo.flags & 2) != 0;
                f43383p = extractAppIdentifier(applicationInfo.metaData);
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendPath("apps").appendPath("cfg").appendPath(f43383p).appendPath(String.valueOf(packageInfo.versionCode)).appendQueryParameter(C3426d4.i.U, String.valueOf(f43386t));
                if (f43386t) {
                    builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("versionName", packageInfo.versionName);
                }
                String string = builderAppendQueryParameter.build().toString();
                f43382o = extractUrlPrefix(applicationInfo.metaData);
                if (f43382o != null && f43382o.length() > 0) {
                    Logger.d(f43370c, "apiURL Value from manifest is " + f43382o + ". Setting new edge urls");
                    AppLovinBridge.receiveEdgeUrls(f43382o, f43382o);
                } else {
                    Logger.d(f43370c, "no apiURL Value in manifest");
                }
                f43384q = packageInfo.versionCode;
                String string2 = applicationInfo.metaData.getString(f43374g);
                if (string2 == null) {
                    f43381n = getDefaultConfig() + string;
                    return;
                }
                if (!string2.endsWith(File.separator)) {
                    string2 = string2 + File.separator;
                }
                if (string.startsWith(File.separator)) {
                    string = string.substring(1);
                }
                f43381n = string2 + string;
                Logger.d(f43370c, "basePrefix != null, configUrl:" + f43381n);
            } catch (PackageManager.NameNotFoundException e10) {
                Logger.d(f43370c, "Bad URL; won't update toggles");
            }
        } catch (Throwable th2) {
            Logger.e(f43370c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private static String extractAppIdentifier(Bundle metaData) {
        return metaData.getString(f43373f);
    }

    private static String extractUrlPrefix(Bundle metaData) {
        return metaData.getString(f43375h, "https://edge.safedk.com");
    }

    private static String getDefaultConfig() {
        return f43372e;
    }

    public static String getProguardMD5() {
        return "";
    }

    private void b(ApplicationInfo applicationInfo) {
        boolean z10 = false;
        if (f43389w.x() && (applicationInfo.metaData.getBoolean(f43376i, false) || ai())) {
            z10 = true;
        }
        Logger.setDebugMode(z10);
    }

    public boolean d() {
        try {
            ApplicationInfo applicationInfo = SafeDKApplication.getAppContext().getPackageManager().getApplicationInfo(f43388v.getPackageName(), 128);
            if (f43389w.x()) {
                return applicationInfo.metaData.getBoolean(f43376i, false) || ai();
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    private void c(ApplicationInfo applicationInfo) {
        f43389w.a(applicationInfo.metaData.getInt(f43377j, 5000));
    }

    private void d(ApplicationInfo applicationInfo) {
        f43389w.b(applicationInfo.metaData.getInt(f43378k, 500));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if (this.B != null) {
            this.f43393y = UUID.randomUUID().toString();
            this.B.a(this.f43393y);
        }
    }

    public static synchronized SafeDK a(Context context) {
        Logger.d(f43370c, "start started");
        if (f43387u == null) {
            f43387u = new SafeDK(context);
            f43387u.a(false);
            f43387u.b(true);
        } else {
            Logger.d(f43370c, "SafeDK already started");
        }
        return f43387u;
    }

    public static void a(Application application) {
        if (getInstance() != null && getInstance().o() && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(com.safedk.android.internal.b.getInstance());
        }
    }

    private void af() {
        try {
            Logger.d(f43370c, "setIsFirstSession started");
            if (!G.get() && this.B != null) {
                String strP = this.B.p();
                Logger.d(f43370c, "setIsFirstSession Current safedk version : 5.4.0 , stored version is " + strP);
                if (strP == null || !a.f43397a.equals(strP)) {
                    Logger.d(f43370c, "setIsFirstSession setting is_first_session to true");
                    this.f43392s = true;
                }
                this.B.c(a.f43397a);
                G.set(true);
                return;
            }
            Logger.d(f43370c, "setIsFirstSession already executed, value is " + this.f43392s);
        } catch (Throwable th2) {
            Logger.d(f43370c, "setIsFirstSession Exception : " + th2.getMessage(), th2);
        }
    }

    public boolean e() {
        return this.f43392s;
    }

    public static SafeDK getInstance() {
        return f43387u;
    }

    public int f() {
        return f43389w.a();
    }

    public int g() {
        return f43389w.b();
    }

    public boolean h() {
        return f43389w.c();
    }

    private synchronized void ag() {
        if (!this.A.containsKey(BrandSafetyUtils.AdType.INTERSTITIAL)) {
            this.A.put(BrandSafetyUtils.AdType.INTERSTITIAL, new InterstitialFinder());
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.BANNER) && p()) {
            this.A.put(BrandSafetyUtils.AdType.BANNER, new BannerFinder(getInstance().V()));
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.MREC) && p()) {
            this.A.put(BrandSafetyUtils.AdType.MREC, new q(getInstance().V()));
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.NATIVE)) {
            this.A.put(BrandSafetyUtils.AdType.NATIVE, new NativeFinder(getInstance().V()));
        }
    }

    public synchronized void i() {
        F.set(true);
        CreativeInfoManager.g();
        ah();
        af();
        Logger.d(f43370c, "Loading singletons");
        g.a();
        k.a();
        if (this.f43391b == null) {
            this.f43391b = com.safedk.android.analytics.brandsafety.i.a();
        }
        ag();
        this.C.set(true);
    }

    public synchronized void j() {
        if (StatsCollector.b()) {
            for (b bVar : this.A.values()) {
                if (bVar.b() > 0) {
                    bVar.c();
                }
            }
        }
    }

    public synchronized void a(boolean z10, boolean z11) {
        try {
            if (f43389w.x()) {
                Logger.i("SafeDK", "SafeDK Device ID: " + f43387u.f43393y);
                Logger.i("SafeDK", "SafeDK version: " + getVersion());
            }
            Logger.d(f43370c, "configurationDownloadCompleted isOnUiThread = " + com.safedk.android.utils.k.c());
            if (f43387u == null) {
                Logger.d(f43370c, "instance is null, existing");
            } else {
                f43387u.b(false);
                if (!f43389w.x()) {
                    Logger.d(f43370c, "SafeDK is disabled.");
                    Logger.setDebugMode(false);
                    com.safedk.android.internal.b.getInstance().clearBackgroundForegroundListeners();
                } else {
                    ad();
                    if (ai()) {
                        Logger.setDebugMode(true);
                    }
                    Logger.d(f43370c, "Configuration download completed, configurationDownloadedSuccessfully=" + z10);
                    Logger.d(f43370c, "configurationDownloadCompleted isMaxProcess " + z11);
                    Logger.d(f43370c, "configurationDownloadCompleted isActive " + f43389w.x() + ", packageId = " + getInstance().l().getPackageName());
                    if (f43389w.x() && z11 && !F.get()) {
                        F.set(true);
                        CreativeInfoManager.g();
                        CreativeInfoManager.d();
                        ah();
                        if (z10) {
                            Logger.d(f43370c, "Will attempt to load events from storage");
                            StatsCollector.c().d();
                        } else {
                            af();
                        }
                        af();
                        Logger.d(f43370c, "Loading singletons");
                        g.a();
                        k.a();
                        if (this.f43391b == null) {
                            this.f43391b = com.safedk.android.analytics.brandsafety.i.a();
                        }
                        ag();
                    }
                    this.C.set(true);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f43370c, "Exception handling configuration event", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private static void ah() {
        if (!f43390x.get()) {
            Logger.d(f43370c, "Starting reporter thread");
            StatsCollector.a(true);
            int iZ = f43389w.z();
            int iC = f43389w.C();
            StatsReporter.a();
            StatsCollector.c().a(iZ, com.safedk.android.internal.b.getInstance().isInBackground(), iC, StatsReporter.b());
            StatsCollector.a(false);
            StatsCollector.b(getInstance().r());
            f43390x.set(true);
            Logger.d(f43370c, "Reporter thread started");
            return;
        }
        Logger.d(f43370c, "Reporter thread already initialized, skipping");
    }

    public void a(Bundle bundle, boolean z10) {
        Logger.d(f43370c, "Updating configuration");
        boolean zA = f43389w.a(bundle, true);
        if (zA) {
            a(bundle);
        }
        a(zA, z10);
    }

    private void a(Bundle bundle) {
        if (this.B != null) {
            Logger.d(f43370c, "Writing to shared preferences: " + bundle.toString());
            this.B.a(bundle);
        }
    }

    public static int k() {
        return f43384q;
    }

    public Context l() {
        return f43388v;
    }

    public boolean m() {
        return f43389w.y() || ai();
    }

    public boolean n() {
        return f43385r;
    }

    public boolean o() {
        return f43389w.x();
    }

    public boolean p() {
        return f43389w.s();
    }

    public boolean q() {
        return f43389w.t();
    }

    public boolean r() {
        return !s() && f43389w.x();
    }

    public boolean s() {
        if (this.B == null) {
            return true;
        }
        return this.B.b();
    }

    private boolean ai() {
        try {
            Set<String> setG = f43389w.G();
            return setG.contains("*") || setG.contains(this.f43393y);
        } catch (Throwable th2) {
            Logger.e(f43370c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    public static boolean t() {
        return f43389w.B();
    }

    public List<String> u() {
        return f43389w.u();
    }

    public List<String> v() {
        return f43389w.v();
    }

    public DeviceData w() {
        return this.f43394z;
    }

    public Map<BrandSafetyUtils.AdType, b> x() {
        return this.A;
    }

    public com.safedk.android.analytics.brandsafety.a a(BrandSafetyUtils.AdType adType) {
        return this.A.get(adType);
    }

    public InterstitialFinder y() {
        return (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
    }

    public BannerFinder z() {
        return (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
    }

    public q A() {
        return (q) a(BrandSafetyUtils.AdType.MREC);
    }

    public NativeFinder B() {
        return (NativeFinder) a(BrandSafetyUtils.AdType.NATIVE);
    }

    public int C() {
        return this.E;
    }

    public int D() {
        return this.D;
    }

    public int E() {
        return f43389w.d();
    }

    public int F() {
        return f43389w.e();
    }

    public float G() {
        return f43389w.f();
    }

    public float H() {
        return f43389w.g();
    }

    public boolean I() {
        return f43389w.h();
    }

    public int J() {
        return f43389w.i();
    }

    public long K() {
        return f43389w.j();
    }

    public int L() {
        return f43389w.k();
    }

    public int M() {
        return f43389w.l();
    }

    public int N() {
        return f43389w.m();
    }

    public void a(final boolean z10) {
        try {
            K.execute(new Runnable() { // from class: com.safedk.android.SafeDK.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.d(SafeDK.f43370c, "Reading configuration from shared preferences");
                        if (SafeDK.this.B != null) {
                            SafeDK.this.f43393y = SafeDK.this.B.a();
                            if (SafeDK.this.f43393y == null) {
                                SafeDK.this.ae();
                            }
                            Bundle bundleE = SafeDK.this.B.e();
                            Logger.d(SafeDK.f43370c, "configurationBundle loaded : " + bundleE.toString());
                            if (bundleE != null && !bundleE.isEmpty()) {
                                Logger.d(SafeDK.f43370c, "Parsing configuration from shared preferences");
                                SafeDK.f43389w.a(bundleE, false);
                            } else {
                                Logger.d(SafeDK.f43370c, "Configuration bundle from storage is empty");
                            }
                            SafeDK.this.a(false, z10);
                        }
                    } catch (Throwable th2) {
                        Logger.e(SafeDK.f43370c, th2.getMessage(), th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f43370c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public synchronized boolean a(Activity activity) {
        boolean z10;
        Logger.d(f43370c, "Starting interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder != null) {
            interstitialFinder.c(activity);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized void b(Activity activity) {
        Logger.d(f43370c, "Stopping interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder != null) {
            interstitialFinder.e(activity);
        }
    }

    public synchronized void c(Activity activity) {
        Logger.d(f43370c, "Starting redirect monitoring in activity " + activity.getClass().getName());
        BannerFinder bannerFinder = (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
        if (bannerFinder != null) {
            bannerFinder.c(activity);
        }
    }

    public synchronized void a(String str) {
        Iterator<b> it = this.A.values().iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public synchronized void d(Activity activity) {
        if (o()) {
            Logger.d(f43370c, "onForegroundActivity " + activity.getClass().getName());
            if (getInstance().c() && this.f43394z == null) {
                Logger.d(f43370c, "Before reading shared prefs");
                this.f43394z = new DeviceData(f43388v, this.B);
            }
        }
    }

    public synchronized void e(Activity activity) {
        if (o()) {
            Logger.d(f43370c, "onBackgroundActivity " + activity.getClass().getName());
        }
    }

    public String b(String str) {
        String string = null;
        if (this.B != null) {
            Logger.d(f43370c, "getSdkVersion getSdkVersion: " + str);
            JSONObject jSONObjectJ = this.B.j();
            if (jSONObjectJ != null) {
                Logger.d(f43370c, "getSdkVersion sdkVersionsJson=" + jSONObjectJ.toString());
            }
            try {
                JSONObject jSONObject = jSONObjectJ.getJSONObject(str);
                if (jSONObject == null) {
                    Logger.d(f43370c, "getSdkVersion sdkData is null");
                } else {
                    Logger.d(f43370c, "getSdkVersion sdkData : " + jSONObject.toString());
                    string = jSONObject.getString("sdk_version");
                    Logger.d(f43370c, "getSdkVersion version : " + string);
                    Logger.d(f43370c, "return sdk version: " + string);
                }
            } catch (Throwable th2) {
            }
        }
        return string;
    }

    public JSONObject O() {
        if (this.B == null) {
            return null;
        }
        return this.B.j();
    }

    @Api
    public String getUserId() {
        return this.f43393y;
    }

    public static String getVersion() {
        return a.f43397a;
    }

    public static boolean P() {
        return a.f43397a.contains(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT);
    }

    private void b(boolean z10) {
        boolean zR = r();
        Logger.d(f43370c, "notifyMonitorUserActivityUpdate shouldMonitorUser is " + zR);
        CreativeInfoManager.a(zR);
        com.safedk.android.internal.b.setActiveMode(zR);
        com.safedk.android.analytics.brandsafety.i.a(zR);
        if (z10) {
            ac();
        }
    }

    public long Q() {
        return f43389w.J();
    }

    public int R() {
        return f43389w.K();
    }

    public ArrayList<String> S() {
        return f43389w.L();
    }

    public float T() {
        return f43389w.n();
    }

    public float U() {
        return f43389w.o();
    }

    public int V() {
        return f43389w.p();
    }

    public int W() {
        return f43389w.q();
    }

    public int X() {
        return f43389w.r();
    }

    public static boolean Y() {
        return H.booleanValue();
    }

    public static void Z() {
        Logger.d(f43370c, "setMaxInitialized started");
        H = true;
        if (!b()) {
            ah();
        }
        CreativeInfoManager.b();
    }

    public static boolean aa() {
        boolean z10 = f43387u != null && f43389w != null && f43389w.x() && H.booleanValue();
        if (!z10) {
            Logger.d(f43370c, "isSafeDKFullyInitialized returned false , instance = " + f43387u + ",config = " + f43389w + ", config.isActive() = " + f43389w.x() + ", SafeDK.isMaxInitialized = " + H);
        }
        return z10;
    }
}
