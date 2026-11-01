package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.inmobi.media.C3298x5;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3298x5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f25690d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f25692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I1 f25693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pair f25695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f25696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f25697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f25698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f25699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile long f25700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mj.g f25701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mj.g f25702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final mj.g f25703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final JSONArray f25704r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f25688b = {ck.s.i(new PropertyReference1Impl(C3298x5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), ck.s.i(new PropertyReference1Impl(C3298x5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3298x5 f25687a = new C3298x5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f25689c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25691e = C3298x5.class.getSimpleName();

    public static final int b() {
        Context context = Ji.f22951a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static boolean u() {
        return true;
    }

    public static boolean v() {
        return true;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        I1 i10 = f25693g;
        jk.k[] kVarArr = f25688b;
        int iIntValue = ((Number) i10.getValue(this, kVarArr[1])).intValue();
        int iIntValue2 = ((Number) f25692f.getValue(this, kVarArr[0])).intValue();
        if (iIntValue2 > 0) {
            return (iIntValue * 100) / iIntValue2;
        }
        ck.p.i(C3298x5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    static {
        int i10 = 15;
        f25692f = new I1(i10, new bk.a() { // from class: b7.cc
            @Override // bk.a
            public final Object invoke() {
                return Integer.valueOf(C3298x5.A());
            }
        }, 12);
        f25693g = new I1(i10, new bk.a() { // from class: b7.dc
            @Override // bk.a
            public final Object invoke() {
                return Integer.valueOf(C3298x5.b());
            }
        }, 8);
        String str = Build.VERSION.RELEASE;
        ck.p.i(str, "RELEASE");
        f25694h = str;
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        f25695i = new Pair("d-api-lev", sb2.toString());
        String str2 = Build.MANUFACTURER;
        ck.p.i(str2, "MANUFACTURER");
        f25696j = str2;
        String str3 = Build.MODEL;
        ck.p.i(str3, "MODEL");
        f25697k = str3;
        String str4 = Build.HARDWARE;
        ck.p.i(str4, "HARDWARE");
        f25698l = str4;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f25701o = kotlin.b.b(lazyThreadSafetyMode, new bk.a() { // from class: b7.ec
            @Override // bk.a
            public final Object invoke() {
                return C3298x5.B();
            }
        });
        f25702p = kotlin.b.b(lazyThreadSafetyMode, new bk.a() { // from class: b7.fc
            @Override // bk.a
            public final Object invoke() {
                return Boolean.valueOf(C3298x5.c());
            }
        });
        mj.g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a() { // from class: b7.gc
            @Override // bk.a
            public final Object invoke() {
                return C3298x5.a();
            }
        });
        f25703q = gVarB;
        f25704r = (JSONArray) gVarB.getValue();
    }

    public static final int A() {
        Context context = Ji.f22951a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final C3248v5 B() {
        boolean z10;
        String str;
        f25687a.getClass();
        try {
            Context context = Ji.f22951a;
            if (context == null) {
                return new C3248v5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                z10 = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            } catch (Exception unused) {
            }
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused2) {
                str = null;
            }
            return new C3248v5(str, z10);
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            return new C3248v5(null, false);
        }
    }

    public static void C() {
        Runnable runnable = new Runnable() { // from class: b7.yb
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.D();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void D() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f25689c = availableBytes / ((long) 1048576);
        } catch (Exception e10) {
            AbstractC2929i9.a(e10);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: b7.bc
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.F();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void F() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3426d4.a.f28418k);
        ck.p.h(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        ck.p.i(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                ck.p.g(uuidFromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManager.getFreeBytes(uuidFromString);
                    } catch (Exception e10) {
                        L2 l10 = new L2(e10);
                        mj.g gVar = P9.f23321a;
                        P9.a(l10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        f25689c = freeBytes / ((long) 1048576);
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: b7.hc
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.H();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void H() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3426d4.a.f28418k);
        ck.p.h(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        ck.p.i(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManager.getFreeBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l10 = new L2(e10);
                    mj.g gVar = P9.f23321a;
                    P9.a(l10);
                }
            }
        }
        f25689c = freeBytes / ((long) 1048576);
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: b7.ac
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.J();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void J() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            float f10 = blockCountLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f10);
            f25690d = sb2.toString();
        } catch (Exception e10) {
            AbstractC2929i9.a(e10);
        }
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: b7.zb
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.L();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void L() {
        UUID uuidFromString;
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3426d4.a.f28418k);
        ck.p.h(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        ck.p.i(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                ck.p.g(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    ck.p.g(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManager.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    L2 l10 = new L2(e10);
                    mj.g gVar = P9.f23321a;
                    P9.a(l10);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f25690d = sb2.toString();
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: b7.ic
            @Override // java.lang.Runnable
            public final void run() {
                C3298x5.N();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public static final void N() {
        Context context = Ji.f22951a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3426d4.a.f28418k);
        ck.p.h(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        ck.p.i(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManager.getTotalBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l10 = new L2(e10);
                    mj.g gVar = P9.f23321a;
                    P9.a(l10);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f25690d = sb2.toString();
    }

    public static final boolean c() {
        f25687a.getClass();
        try {
            String str = Build.FINGERPRINT;
            ck.p.i(str, "FINGERPRINT");
            Locale locale = Locale.ROOT;
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase = str.toLowerCase(locale);
            ck.p.i(lowerCase, "toLowerCase(...)");
            String str2 = Build.MODEL;
            ck.p.i(str2, "MODEL");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase2 = str2.toLowerCase(locale);
            ck.p.i(lowerCase2, "toLowerCase(...)");
            String str3 = Build.MANUFACTURER;
            ck.p.i(str3, "MANUFACTURER");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase3 = str3.toLowerCase(locale);
            ck.p.i(lowerCase3, "toLowerCase(...)");
            String str4 = Build.BRAND;
            ck.p.i(str4, "BRAND");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase4 = str4.toLowerCase(locale);
            ck.p.i(lowerCase4, "toLowerCase(...)");
            String str5 = Build.DEVICE;
            ck.p.i(str5, "DEVICE");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase5 = str5.toLowerCase(locale);
            ck.p.i(lowerCase5, "toLowerCase(...)");
            String str6 = Build.HARDWARE;
            ck.p.i(str6, "HARDWARE");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase6 = str6.toLowerCase(locale);
            ck.p.i(lowerCase6, "toLowerCase(...)");
            String str7 = Build.PRODUCT;
            ck.p.i(str7, "PRODUCT");
            ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase7 = str7.toLowerCase(locale);
            ck.p.i(lowerCase7, "toLowerCase(...)");
            if (lk.x.R(lowerCase, "generic", false, 2, null) || lk.x.R(lowerCase, "unknown", false, 2, null) || lk.a0.X(lowerCase2, "google_sdk", false, 2, null) || lk.a0.X(lowerCase2, "emu", false, 2, null) || lk.a0.X(lowerCase2, "Android SDK built for x86", false, 2, null) || lk.a0.X(lowerCase3, "Genymotion", false, 2, null) || lk.a0.X(lowerCase7, "sdk", false, 2, null) || lk.a0.X(lowerCase7, "vbox86p", false, 2, null) || lk.a0.X(lowerCase7, "emu", false, 2, null) || ck.p.e(lowerCase6, "goldfish") || ck.p.e(lowerCase6, "ranchu") || ck.p.e(lowerCase6, "vbox86p") || lk.a0.X(lowerCase6, "nox", false, 2, null)) {
                return true;
            }
            return lk.x.R(lowerCase4, "generic", false, 2, null) && lk.x.R(lowerCase5, "generic", false, 2, null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair d() {
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static Pair e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            G();
        } else if (i10 >= 26) {
            E();
        } else {
            C();
        }
        long j10 = f25689c;
        if (j10 != -1) {
            return new Pair("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public static Pair f() {
        Context context = Ji.f22951a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentA != null) {
            numValueOf = Integer.valueOf((int) ((intentA.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentA.getIntExtra("scale", -1)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(numValueOf);
        return new Pair("d-bat-lev", sb2.toString());
    }

    public static Pair g() {
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        ck.p.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair i() {
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        ck.p.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair j() {
        ArrayList arrayList = new ArrayList();
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        ck.p.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        ck.p.i(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            ck.p.i(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (ck.p.e(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    ck.p.i(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    ck.p.g(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
    }

    public static String k() {
        String strValueOf;
        Context context = Ji.f22951a;
        if (context == null || !Kf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            ck.p.i(C3298x5.class.getSimpleName(), "getSimpleName(...)");
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    strValueOf = String.valueOf(type);
                }
                return "1";
            }
            strValueOf = type + ImpressionLog.Q + subtype;
            return strValueOf;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    strValueOf = com.ironsource.Gc.f26641e;
                } else if (networkCapabilities.hasTransport(3)) {
                    strValueOf = "9";
                } else if (networkCapabilities.hasTransport(4)) {
                    strValueOf = "17";
                } else if (networkCapabilities.hasTransport(5)) {
                    strValueOf = "10";
                } else {
                    strValueOf = networkCapabilities.hasTransport(6) ? "11" : "8";
                }
            }
            return "1";
        }
        strValueOf = "0|" + activeNetworkInfo.getSubtype();
        return strValueOf;
    }

    public static final String m() {
        f25687a.getClass();
        int iL = l();
        if (iL != 0) {
            return iL != 1 ? "NIL" : "wifi";
        }
        return com.ironsource.Q6.Q0;
    }

    public static HashMap n() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        try {
            if (enabled) {
                map.put("d-t1", f25704r.toString());
                return map;
            }
            ck.p.i(f25691e, "TAG");
            return map;
        } catch (Exception unused) {
        }
    }

    public static Pair o() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            M();
        } else if (i10 >= 26) {
            K();
        } else {
            I();
        }
        String str = f25690d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean y() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static Pair h() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        } else {
            str = "0";
        }
        return new Pair("d-drk-m", str);
    }

    public static int l() {
        String strK = k();
        if (lk.x.R(strK, "0", false, 2, null)) {
            return 0;
        }
        if (!lk.x.R(strK, "1", false, 2, null)) {
            return 2;
        }
        return 1;
    }

    public final HashMap b(boolean z10) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", f25694h);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", f25696j);
        map.put("d-model-name", f25697k);
        map.put("d-nettype-raw", k());
        String string = Locale.getDefault().toString();
        ck.p.i(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        ck.p.i(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", f25698l);
        if (System.currentTimeMillis() >= f25700n) {
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) Y3.f23815a.a(SignalsConfig.class);
            f25700n = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            nk.j.d(A9.f22351c, null, null, new C3273w5(null), 3, null);
        }
        map.put("d-lowmem", String.valueOf(f25699m));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) f25702p.getValue()).booleanValue()));
        mj.g gVar2 = f25701o;
        map.put("d-ps-disabled", String.valueOf(((C3248v5) gVar2.getValue()).f25529a));
        String str = ((C3248v5) gVar2.getValue()).f25530b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(Ji.f22951a, z10)));
        return map;
    }

    public final HashMap a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z10));
            map.putAll(n());
            return map;
        } catch (Exception e10) {
            ck.p.i(C3298x5.class.getSimpleName(), "getSimpleName(...)");
            e10.getMessage();
            return map;
        }
    }

    public static final JSONArray a() {
        f25687a.getClass();
        Context context = Ji.f22951a;
        if (context != null) {
            try {
                C2924i4 c2924i4 = Y3.f23815a;
                ck.p.j(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) Y3.f23815a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "boot_time");
                ck.p.j("bt", C3426d4.i.W);
                JSONArray jSONArray = new JSONArray(eaA.f22577a.getString("bt", "[]"));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                eaA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e10) {
                mj.g gVar = P9.f23321a;
                AbstractC2929i9.a(e10);
            }
        }
        return new JSONArray();
    }
}
