package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.ironsource.C3784xa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class uoy {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static final HashSet<String> f13447cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private static String f13448jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private static String f13449ko;
    private static final byte[] mwh;
    public static Integer ouw;
    private static final byte[] ryl;
    private static final ExecutorService vt = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile boolean f13451lh = false;
    private static final AtomicInteger yu = new AtomicInteger(0);
    private static volatile String fkw = "";

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static final ReentrantLock f13450le = new ReentrantLock();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static String f13452ra = null;
    private static String pno = null;
    private static String bly = null;
    private static final HashSet<String> tlj = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.uoy$2, reason: invalid class name */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (TextUtils.isEmpty(uoy.fkw)) {
                    com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(com.bytedance.sdk.openadsdk.core.zih.ouw(), com.bytedance.sdk.component.bly.le.lh.USER_AGENT);
                    leVar.setWebViewClient(new com.bytedance.sdk.component.bly.le.ouw());
                    String unused = uoy.fkw = leVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.od.ouw(leVar);
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e11);
            }
        }
    }

    public static class ouw implements Callable<String> {
        private final int ouw = 2;

        private synchronized String lh() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    strArr[0] = uoy.ey();
                    com.bytedance.sdk.component.utils.ko.vt("getUA", "webview ua：" + strArr[0]);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strVt;
            strVt = "unKnow";
            int i10 = this.ouw;
            if (i10 == 1) {
                strVt = lh();
            } else if (i10 == 2) {
                strVt = vt();
            }
            return strVt;
        }

        private static String vt() {
            String property;
            Throwable th2;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                                com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_ua_data", "android_system_ua", property);
                            } else {
                                com.bytedance.sdk.openadsdk.core.lh.ouw();
                                com.bytedance.sdk.openadsdk.core.lh.ouw("android_system_ua", property);
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.qbp.lh("getUA", "e:" + th2.getMessage());
                    }
                }
            } catch (Throwable th4) {
                property = "unKnow";
                th2 = th4;
            }
            return property;
        }
    }

    public static class vt {
        private static final int ouw;

        static {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i10 = 2;
            try {
                int i11 = RecyclerView.ViewHolder.FLAG_BOUND;
                if (RecyclerView.ViewHolder.class.getDeclaredMethod("getBindingAdapterPosition", new Class[0]) != null) {
                    i10 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i10 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            ouw = i10;
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i10)));
        }
    }

    public static String cf() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.vt("total_memory", "0");
    }

    public static String fkw() {
        if (!TextUtils.isEmpty(fkw)) {
            return fkw;
        }
        com.bytedance.sdk.openadsdk.multipro.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
        String strOuw = com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_web_ua", SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        fkw = strOuw;
        if (TextUtils.isEmpty(strOuw)) {
            ReentrantLock reentrantLock = f13450le;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(fkw)) {
                            fkw = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.zih.ouw());
                        }
                        com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_local_web_ua", fkw);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e10);
                        f13450le.unlock();
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "", e11);
                        f13450le.unlock();
                    }
                }
            } catch (Throwable th2) {
                f13450le.unlock();
                throw th2;
            }
        }
        return fkw;
    }

    public static boolean fkw(int i10) {
        return i10 == 5;
    }

    public static String jqy() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static String le() {
        return ex.ouw();
    }

    public static boolean le(int i10) {
        return i10 == 6;
    }

    public static String lh() {
        String strVt;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                strVt = com.bytedance.sdk.openadsdk.multipro.yu.ouw.vt("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                strVt = com.bytedance.sdk.openadsdk.core.lh.vt("android_system_ua", "unKnow");
            }
            if (strVt != null && !"unKnow".equals(strVt)) {
                return strVt;
            }
            FutureTask futureTask = new FutureTask(new ouw());
            vt.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.qbp.lh("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String lh(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 == 2) {
            return "interaction";
        }
        if (i10 == 3 || i10 == 4) {
            return "open_ad";
        }
        if (i10 != 7) {
            return i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public static boolean od() {
        return false;
    }

    public static /* synthetic */ boolean osn() {
        f13451lh = true;
        return true;
    }

    public static Intent ouw(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String ouw(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static synchronized String pno() {
        if (TextUtils.isEmpty(pno) && com.bytedance.sdk.openadsdk.core.zih.ouw() != null) {
            try {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.zih.ouw().getPackageManager().getPackageInfo(ra(), 0);
                pno = String.valueOf(packageInfo.versionCode);
                bly = packageInfo.versionName;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
            }
        }
        return pno;
    }

    public static int ra(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static synchronized String ra() {
        Context contextOuw;
        if (TextUtils.isEmpty(f13452ra) && (contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw()) != null) {
            try {
                f13452ra = contextOuw.getPackageName();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
            }
        }
        return f13452ra;
    }

    public static String ryl() {
        return cf("MemTotal");
    }

    public static int tc() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (tlj.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 == null || !id2.startsWith("Europe/")) {
                return (id2 == null || !id2.startsWith("America/") || f13447cf.contains(id2)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static boolean th() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String tlj() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        String strVt = com.bytedance.sdk.openadsdk.core.lh.vt("total_memory", (String) null);
        if (strVt == null || tlj(strVt) <= 0) {
            strVt = cf("MemTotal");
            if (tlj(strVt) <= 0) {
                strVt = rrs();
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw();
            com.bytedance.sdk.openadsdk.core.lh.ouw("total_memory", strVt);
        }
        return strVt;
    }

    public static String vpp() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String vt(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return "splash_ad_landingpage";
        }
        if (i10 != 5) {
            return i10 != 7 ? "unknow" : "rewarded_video_landingpage";
        }
        return "fullscreen_interstitial_ad";
    }

    public static void vt() {
    }

    public static boolean vt(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.vt.ouw(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void yu() {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", uoy.fvf());
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "recycle_version_not_valid";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static boolean yu(int i10) {
        return i10 == 4;
    }

    public static synchronized String bly() {
        if (TextUtils.isEmpty(bly) && com.bytedance.sdk.openadsdk.core.zih.ouw() != null) {
            try {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.zih.ouw().getPackageManager().getPackageInfo(ra(), 0);
                pno = String.valueOf(packageInfo.versionCode);
                bly = packageInfo.versionName;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
            }
        }
        return bly;
    }

    public static boolean cd() {
        return yu.get() == 1;
    }

    private static String cf(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String[] strArrSplit = line.split("\\s+");
                com.bytedance.sdk.component.utils.ko.vt("ToolUtils", "getTotalMemory = " + strArrSplit[1]);
                String str2 = strArrSplit[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ey() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.zih.ouw());
            webView.setWebViewClient(new com.bytedance.sdk.component.bly.le.ouw());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                    com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.lh.ouw();
                    com.bytedance.sdk.openadsdk.core.lh.ouw("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    private static boolean jvy() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void le(final String str) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw();
        com.bytedance.sdk.openadsdk.rn.lh.ouw("reportMultiLog", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.utils.uoy.3
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                if (!uoy.f13451lh && com.bytedance.sdk.openadsdk.core.zih.yu().jae()) {
                    uoy.osn();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "reportMultiLog";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
                return null;
            }
        });
    }

    public static String pd() {
        String str = f13449ko;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(mwh);
        f13449ko = str2;
        return str2;
    }

    private static String ryl(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C3784xa.f31580b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", pno()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static String uq() {
        String str = f13448jg;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(ryl);
        f13448jg = str2;
        return str2;
    }

    public static boolean yu(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f13447cf = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        ouw = null;
        ryl = new byte[]{108, 111, 97, 100, 105, 110, 103};
        mwh = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String ex() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    private static String fqk() {
        String strUb = com.bytedance.sdk.openadsdk.core.settings.cf.ub();
        if (!TextUtils.isEmpty(strUb)) {
            return strUb;
        }
        String strVm = com.bytedance.sdk.openadsdk.core.zih.yu().vm();
        if (TextUtils.isEmpty(strVm)) {
            return zin.ouw();
        }
        return strVm;
    }

    public static int fvf() {
        return vt.ouw;
    }

    public static String jae() {
        int i10 = -ksc();
        if (i10 >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i10));
        }
        return "Etc/GMT".concat(String.valueOf(i10));
    }

    public static long jg() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long ko() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("free_internal_storage").longValue();
    }

    public static int ksc() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static int le(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = ouw;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(listQueryIntentActivities.size());
        ouw = numValueOf;
        return numValueOf.intValue();
    }

    public static long mwh() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("total_internal_storage").longValue();
    }

    public static String qbp() {
        String strZih = com.bytedance.sdk.openadsdk.core.zih.yu().zih();
        if (TextUtils.isEmpty(strZih)) {
            return zin.ouw();
        }
        return strZih;
    }

    public static long rn() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.ouw("total_sdcard_storage").longValue();
    }

    private static String rrs() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int vm() {
        com.bytedance.sdk.openadsdk.core.lh.ouw();
        return com.bytedance.sdk.openadsdk.core.lh.vt("is_root", -1);
    }

    public static long zih() {
        try {
            if (jvy()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            return 0L;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static String zin() {
        String strOuw = com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("dual_event_url", (String) null);
        if (TextUtils.isEmpty(strOuw)) {
            String strOuw2 = zin.ouw();
            if (!TextUtils.isEmpty(strOuw2)) {
                return "https://" + strOuw2 + "/service/2/dual_events/";
            }
            return strOuw;
        }
        return strOuw;
    }

    public static int yu(Context context) {
        return ra(com.bytedance.sdk.component.utils.ksc.ouw(context, 0L));
    }

    private static boolean ra(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    public static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        try {
            return lh(vppVar.uoy());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long tlj(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int vt(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return -1;
        }
        int iUoy = vppVar.uoy();
        int i10 = 1;
        if (iUoy == 1) {
            return 2;
        }
        if (iUoy == 3) {
            return 4;
        }
        if (iUoy != 5) {
            i10 = 7;
            if (iUoy != 7) {
                return iUoy != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static boolean yu(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        int i10;
        return vppVar != null && vppVar.f12868pd == 3 && vppVar.zin() && ((i10 = vppVar.jcd) == 4 || i10 == 5);
    }

    public static boolean ra(String str) {
        if (com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            return true;
        }
        com.bytedance.sdk.component.utils.qbp.yu("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static String vt(String str) {
        return ouw(str, false, false);
    }

    public static int ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static int vt(Context context) {
        int i10 = -1;
        try {
            i10 = context.getApplicationInfo().targetSdkVersion;
            com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "targetSdkVersion = ", Integer.valueOf(i10));
            return i10;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
            return i10;
        }
    }

    public static void pno(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.qbp.yu("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static String lh(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("app_log_url", "");
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String ouw(@NonNull String str, boolean z10, boolean z11) {
        String strQbp;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z11) {
            strQbp = fqk();
        } else {
            strQbp = qbp();
        }
        if (TextUtils.isEmpty(strQbp)) {
            strQbp = "api16-access-ttp.tiktokpangle.us";
        }
        String strOuw = "https://" + strQbp + str;
        if (fvf.ouw() && !z10) {
            strOuw = fvf.ouw(strOuw);
        }
        return z10 ? ryl(strOuw) : strOuw;
    }

    public static boolean pno(int i10) {
        if (i10 <= 0) {
            return false;
        }
        if (i10 >= 100) {
            return true;
        }
        int iNextInt = new Random(System.currentTimeMillis()).nextInt(100) + 1;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "isMatchProbability: " + iNextInt + "/" + i10);
        return iNextInt <= i10;
    }

    public static String fkw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static boolean lh(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return true;
        }
        int iFqk = vppVar.fqk();
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(iFqk);
        int iOuw = com.bytedance.sdk.component.utils.ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (iVt == 1) {
            return yu(iOuw);
        }
        if (iVt == 2) {
            return fkw(iOuw) || yu(iOuw) || le(iOuw);
        }
        if (iVt != 3) {
            return iVt != 5 || yu(iOuw) || le(iOuw);
        }
        return false;
    }

    public static void fkw(Context context) {
        try {
            AtomicInteger atomicInteger = yu;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                final com.bytedance.sdk.openadsdk.rn.lh lhVarOuw = com.bytedance.sdk.openadsdk.rn.lh.ouw();
                com.bytedance.sdk.openadsdk.rn.lh.ouw("blind_mode_status", true, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.7
                    public AnonymousClass7() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        yu yuVar = new yu();
                        yuVar.ouw = "blind_mode_status";
                        return yuVar;
                    }
                });
                return;
            }
            atomicInteger.set(2);
        } catch (Exception unused) {
            yu.set(2);
        }
    }

    public static String ouw(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static JSONObject ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, long j10, com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
        if (vppVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", vppVar.pv);
            jSONObject.put("buffers_time", j10);
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
            if (vtVar != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, vtVar.f10458lh);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, vtVar.fkw);
            }
            if (!jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) && ouwVar != null) {
                try {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(ouwVar.yu()), Integer.valueOf(ouwVar.fkw())));
                } catch (Throwable unused) {
                }
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ToolUtils", "getVideoAction json error", e10);
        }
        return jSONObject;
    }

    public static long lh(Context context) {
        int i10 = -1;
        try {
            i10 = context.getApplicationInfo().minSdkVersion;
            com.bytedance.sdk.component.utils.ko.vt("TTAD.ToolUtils", "minSdkVersion = ", Integer.valueOf(i10));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
        }
        return i10;
    }

    public static void ouw(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !ra(context)) {
            return;
        }
        int length = str2.length();
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i11 = 0;
        int i12 = 3572;
        int i13 = 1;
        while (i13 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + "-" + i13 + StringUtils.PROCESS_POSTFIX_DELIMITER + str2.substring(i11, i12));
                i13++;
                i11 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + "-" + i13 + StringUtils.PROCESS_POSTFIX_DELIMITER + str2.substring(i11));
                return;
            }
        }
    }

    public static void ouw(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = sb2.indexOf(str)) > 0) {
            sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
        }
    }

    public static void ouw(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairVt = com.bytedance.sdk.openadsdk.core.bly.vt("oem_store");
            int i10 = -1;
            if (pairVt != null && ((iIntValue = Integer.valueOf((String) pairVt.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairVt.second).longValue() < com.bytedance.sdk.openadsdk.vpp.ouw.ouw("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar) {
        ouw(vppVar, leVar, false);
    }

    public static int ouw(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.ToolUtils", th2.toString());
            return -1;
        }
    }

    public static JSONObject ouw(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static boolean ouw() {
        return (com.bytedance.sdk.openadsdk.core.ko.ouw.ouw == null || com.bytedance.sdk.openadsdk.core.ko.ouw.ouw.ouw.ouw.get()) ? false : true;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        if (vppVar != null) {
            try {
                String str2 = vppVar.osn;
                if (TextUtils.isEmpty(str2) && (rylVar = vppVar.f12857kn) != null && rylVar.f12804lh == 1 && !TextUtils.isEmpty(rylVar.vt)) {
                    str2 = vppVar.f12857kn.vt;
                }
                String str3 = str2;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.uoy.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), str3, vppVar, ouw(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.common.fkw ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar, Context context) {
        int i10 = vppVar.jcd;
        if (!vppVar.zin() || (i10 != 1 && i10 != 3)) {
            return null;
        }
        com.bytedance.sdk.openadsdk.common.yu yuVar = new com.bytedance.sdk.openadsdk.common.yu(context);
        leVar.vt = yuVar;
        yuVar.setVisibility(8);
        View view = leVar.vt;
        if (view != null && view.getParent() == null) {
            leVar.addView(leVar.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        return new com.bytedance.sdk.openadsdk.common.fkw(vppVar, leVar);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.component.bly.le leVar, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.pno pnoVar;
        List<Integer> list;
        if (vppVar == null || leVar == null) {
            return;
        }
        int i10 = vppVar.jcd;
        if (vppVar.zin() && ((i10 == 2 || i10 == 3 || i10 == 5) && (pnoVar = vppVar.our) != null)) {
            List<Integer> list2 = pnoVar.f12800lh;
            ArrayList arrayList = new ArrayList();
            if (z10) {
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    arrayList.add(Integer.valueOf(list2.get(i11).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = list2;
            }
            leVar.ouw(pnoVar.ouw, pnoVar.vt, list, pnoVar.yu, pnoVar.fkw);
        }
        int iVh = vppVar.vh();
        long jYib = vppVar.yib();
        if ((iVh == 1 || iVh == 2) && jYib > 0) {
            leVar.ouw(iVh, jYib);
        }
    }
}
