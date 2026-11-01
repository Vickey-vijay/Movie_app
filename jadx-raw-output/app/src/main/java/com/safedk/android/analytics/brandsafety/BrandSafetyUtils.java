package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BrandSafetyUtils {
    private static final float A = 0.2f;
    private static final float B = 0.2f;
    private static int H = 0;
    private static int I = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f43538a = ".jpg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f43539b = ".txt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f43540c = "unknown";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f43541d = "com.appsaholic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f43542e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f43543f = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43544g = 86400000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43545h = 20000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43546i = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f43547j = "INTER";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f43548k = "REWARDED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43549l = "APPOPEN";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f43550m = "BANNER";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f43551n = "LEADER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f43552o = "MREC";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43553p = "NATIVE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f43554q = "BrandSafetyUtils";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<String> f43556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<String> f43557t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f43559v = 100;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f43560w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f43561x = 8947848;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f43562y = 0.2f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f43563z = 0.2f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<Integer> f43558u = new LinkedList();
    private static m C = null;
    private static RedirectDetails D = null;
    private static String E = null;
    private static String F = null;
    private static final ExecutorService G = Executors.newSingleThreadExecutor();
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRURnVsbFNjcmVlblZpZGVvQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5pbnRlcnN0aXRpYWwudmlldy5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0QWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsucmV3YXJkLnBsYXllci5NQlJld2FyZFZpZGVvQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYW5kcm9pZC52aWV3LlVuaXR5QWRzRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLnNtYWF0by5zZGsucmV3YXJkZWQudmlldy5SZXdhcmRlZEludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnZ1bmdsZS53YXJyZW4udWkuVnVuZ2xlQWN0aXZpdHl8Y29tLnVuaXR5M2Quc2VydmljZXMuYWRzLmFkdW5pdC5BZFVuaXRTb2Z0d2FyZUFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLk1yYWlkRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLmdvb2dsZS5hbmRyb2lkLmdtcy5hZHMuQWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5tcmFpZC5NcmFpZEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLmludGVyc3RpdGlhbC5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS51bml0eTNkLnNlcnZpY2VzLmFkcy5hZHVuaXQuQWRVbml0QWN0aXZpdHl8Y29tLmFwcGxvdmluLmltcGwuYWR2aWV3LkFwcExvdmluT3JpZW50YXRpb25Bd2FyZUludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5yZXdhcmQucGxheWVyLk1UR1Jld2FyZFZpZGVvQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUQXBwT3BlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRURnVsbFNjcmVlbkV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuVGhlbWVkQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwuc3RhdGljcmVuZGVyZXIuU3RhdGljQWRBY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWR1bml0LkFkVW5pdFNvZnR3YXJlQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLmFkY29sb255LnNkay5BZENvbG9ueUFkVmlld0FjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcnN0aXRpYWwudmlldy5NVEdJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLmludGVyc3RpdGlhbC52aWV3Lk1CSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLmludGVyYWN0aXZlYWRzLmFjdGl2aXR5LkludGVyYWN0aXZlU2hvd0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVFJld2FyZEV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLkZ1bGxTY3JlZW5BZEFjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLnJld2FyZGVkLndpZGdldC5SZXdhcmRlZEludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5BY3Rpdml0eXxjb20uZnliZXIuaW5uZXJhY3RpdmUuc2RrLmFjdGl2aXRpZXMuSW5uZXJhY3RpdmVGdWxsc2NyZWVuQWRBY3Rpdml0eXxjb20udnVuZ2xlLndhcnJlbi51aS5WdW5nbGVGbGV4Vmlld0FjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkNvbnRyb2xsZXJBY3Rpdml0eXxjb20udnVuZ2xlLmFkcy5pbnRlcm5hbC51aS5WdW5nbGVBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5Db250cm9sbGVyQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwudmFzdC5WYXN0QWN0aXZpdHl8Y29tLmFkY29sb255LnNkay5BZENvbG9ueUludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5maXZlX2NvcnAuYWQuQWRBY3Rpdml0eQ";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<String> f43555r = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));

    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    static {
        Logger.d(f43554q, "BrandSafetyUtils initialized with " + f43555r + ",  INTERSTITIAL_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f43556s = new HashSet(Arrays.asList(new String(Base64.decode("Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUTGFuZGluZ1BhZ2VBY3Rpdml0eXxjb20uZnliZXIuaW5uZXJhY3RpdmUuc2RrLmFjdGl2aXRpZXMuSW5uZXJhY3RpdmVJbnRlcm5hbEJyb3dzZXJBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRQbGF5YWJsZUxhbmRpbmdQYWdlQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuT3BlblVybEFjdGl2aXR5", 0)).split("\\|")));
        Logger.d(f43554q, "BrandSafetyUtils initialized with " + f43556s + ",  INTERNAL_BROWSER_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f43557t = new HashSet();
        H = 0;
        I = 0;
    }

    public static void a(String str) {
        f43556s.add(str);
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if ("BANNER".equals(string) || f43551n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (f43552o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (f43548k.equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (f43547j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (f43549l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            switch (adType) {
                case INTERSTITIAL:
                    return BrandSafetyEvent.AdFormatType.INTER;
                case BANNER:
                    return BrandSafetyEvent.AdFormatType.BANNER;
                case MREC:
                    return BrandSafetyEvent.AdFormatType.MREC;
                case NATIVE:
                    return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (adFormatType) {
                case INTER:
                case REWARD:
                case APPOPEN:
                    return AdType.INTERSTITIAL;
                case BANNER:
                case LEADER:
                    return AdType.BANNER;
                case MREC:
                    return AdType.MREC;
                case NATIVE:
                    return AdType.NATIVE;
            }
        }
        return null;
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.endsWith(BrandSafetyUtils.f43538a);
        }
    }

    static class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43604a;

        public b(String str) {
            this.f43604a = null;
            this.f43604a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.contains(this.f43604a);
        }
    }

    public static void detectAdClick(Intent intent, String sdkPackageName) {
        a(intent, sdkPackageName, false);
    }

    public static void a(final Intent intent, final String str, final boolean z10) {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d(f43554q, "detect ad click invoked, sdk=" + str);
            if (com.safedk.android.utils.k.c()) {
                G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BrandSafetyUtils.c(intent, str, z10);
                    }
                });
            } else {
                c(intent, str, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Intent intent, String str, boolean z10) {
        Uri uri;
        String str2;
        String string;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.d(f43554q, "detect ad click started, current timestamp (elapsed)=" + jElapsedRealtime + ", sdk=" + mainSdkPackage + ", intent=" + com.safedk.android.utils.k.a(intent) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (SafeDK.getInstance().r()) {
                Logger.d(f43554q, "detect ad click - should monitor");
                if (intent != null) {
                    Intent intent2 = (Intent) intent.clone();
                    Logger.d(f43554q, "detect ad click - intent cloned");
                    int iF = SafeDK.getInstance().f();
                    Logger.d(f43554q, "detect ad click - redirect click timeout is " + iF);
                    Uri data = intent2.getData();
                    String strA = a(mainSdkPackage, intent2);
                    if (strA != null) {
                        Logger.d(f43554q, "detect ad click - uri extracted from intent extras");
                        uri = Uri.parse(strA);
                    } else {
                        uri = data;
                    }
                    String str3 = null;
                    if (uri == null) {
                        str2 = null;
                    } else {
                        String string2 = uri.toString();
                        try {
                            if (com.safedk.android.utils.k.w(uri.toString())) {
                                Logger.d(f43554q, "detect ad click - Uri is a store url: " + uri);
                                string = uri.toString();
                            } else {
                                URL url = new URL(uri.toString());
                                Logger.d(f43554q, "detect ad click - Uri is a standard url: " + url);
                                string = url.toString();
                            }
                            str3 = string;
                            str2 = string2;
                        } catch (MalformedURLException e10) {
                            Logger.d(f43554q, "detect ad click - Uri is not a valid url: " + uri);
                            str2 = string2;
                        }
                    }
                    String strB = b(mainSdkPackage, intent2);
                    u uVarA = DetectTouchUtils.a(mainSdkPackage);
                    long jLongValue = uVarA == null ? 0L : uVarA.f44566a.longValue();
                    long jLongValue2 = uVarA == null ? 0L : uVarA.f44567b.longValue();
                    String str4 = uVarA == null ? null : uVarA.f44568c;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (("android.intent.action.VIEW".equals(intent2.getAction()) || intent2.getAction() == null) && str3 != null) {
                        Logger.d(f43554q, "detect ad click - has URL, intentUrl: " + str3);
                        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(mainSdkPackage);
                        if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.e(str3)) {
                            Logger.d(f43554q, "detect ad click - url should be ignored (by discovery class), skipping");
                            return;
                        }
                        if (!a(intent)) {
                            Logger.d(f43554q, "detect ad click - not handled (yet)");
                            Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                            StatsCollector statsCollectorC = StatsCollector.c();
                            if (foregroundActivity != null && statsCollectorC != null) {
                                Logger.d(f43554q, "detect ad click - has foreground");
                                InterstitialFinder interstitialFinderY = SafeDK.getInstance().y();
                                n nVarD = interstitialFinderY != null ? interstitialFinderY.d(foregroundActivity) : null;
                                boolean z11 = false;
                                if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().i(str4)) {
                                    z11 = true;
                                }
                                if (interstitialFinderY != null && nVarD != null && !z11) {
                                    Logger.d(f43554q, "detect ad click - has interstitial");
                                    boolean zD = nVarD.d();
                                    Logger.d(f43554q, "detect ad click - clicked " + zD);
                                    Logger.d(f43554q, "detect ad click - last touch event(elapsed): " + jLongValue + " last touch event(current time millis): " + jLongValue2 + ", activityAddress=" + a(foregroundActivity.getClass().getName(), true));
                                    if (jElapsedRealtime2 - jLongValue < 20000 && interstitialFinderY.a(str3, mainSdkPackage, str4)) {
                                        if (str4 != null) {
                                            ImpressionLog.a[] aVarArr = new ImpressionLog.a[2];
                                            aVarArr[0] = new ImpressionLog.a("url", str3);
                                            aVarArr[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f44653j : "external");
                                            com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f43638n, aVarArr);
                                        } else {
                                            n nVarD2 = interstitialFinderY.d(foregroundActivity);
                                            ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[2];
                                            aVarArr2[0] = new ImpressionLog.a("url", str3);
                                            aVarArr2[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f44653j : "external");
                                            nVarD2.a(ImpressionLog.f43638n, aVarArr2);
                                        }
                                    }
                                    String strA2 = t.a(mainSdkPackage, jLongValue);
                                    boolean z12 = true;
                                    if (SafeDK.b() && statsCollectorC.a(mainSdkPackage, strA2)) {
                                        z12 = false;
                                    } else {
                                        Logger.d(f43554q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                    Logger.d(f43554q, "detect ad click - should handle click " + z12);
                                    if (z12) {
                                        Logger.d(f43554q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", activity last touched: " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue) + ", isClicked: " + zD);
                                        if ((jLongValue == 0 || jElapsedRealtime2 - jLongValue > iF) && !zD) {
                                            Logger.d(f43554q, "detect ad click - redirect");
                                            a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f44654k : "external", str3, foregroundActivity.getClass().getName());
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Logger.d(f43554q, "detect ad click - no interstitial");
                                a(mainSdkPackage, str2, strB, z10 ? RedirectEvent.f44653j : null);
                                if (jElapsedRealtime2 - jLongValue < 20000) {
                                    Logger.d(f43554q, "detect ad click - updating click URL. address : " + str4);
                                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                        if (aVar != null && aVar.a(str3, mainSdkPackage, str4) && str4 != null) {
                                            ImpressionLog.a[] aVarArr3 = new ImpressionLog.a[2];
                                            aVarArr3[0] = new ImpressionLog.a("url", str3);
                                            aVarArr3[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f44653j : "normal");
                                            com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f43638n, aVarArr3);
                                        }
                                    }
                                }
                                String strA3 = t.a(mainSdkPackage, jLongValue);
                                Logger.d(f43554q, "detect ad click - last touch event(elapsed): " + jLongValue + ", last touch event(current time millis): " + jLongValue2 + ", redirectInfoKey: " + strA3);
                                Logger.d(f43554q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", last touch event(elapsed): " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue));
                                if (SafeDK.b() && !statsCollectorC.a(mainSdkPackage, strA3) && (jLongValue == 0 || jElapsedRealtime2 - jLongValue > iF)) {
                                    a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f44654k : "external", str3, foregroundActivity.getClass().getName());
                                    return;
                                } else {
                                    Logger.d(f43554q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    Logger.d(f43554q, "detect ad click - Intent doesn't have url");
                    Activity foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    if (foregroundActivity2 != null) {
                        if (!a(intent)) {
                            a(mainSdkPackage, str2, strB, z10 ? RedirectEvent.f44653j : null);
                            if (g(foregroundActivity2.getClass().getName())) {
                                Logger.d(f43554q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", webview last touched: " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue));
                                if (jLongValue == 0 || jElapsedRealtime2 - jLongValue > iF) {
                                    Logger.d(f43554q, "detect ad click - Redirecting through ad");
                                    a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f44654k : RedirectEvent.f44652i, str3, foregroundActivity2.getClass().getName());
                                    return;
                                }
                                return;
                            }
                            Logger.d(f43554q, "detect ad click - activity " + foregroundActivity2.getClass().getName() + " is not in the redirect tracked activities, ignoring");
                            return;
                        }
                        return;
                    }
                    Logger.d(f43554q, "detect ad click - current foreground activity is null");
                }
            }
        } catch (Throwable th2) {
            Logger.d(f43554q, "error in detect ad click", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.StringBuilder] */
    private static String a(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        Logger.d(f43554q, "Attempting to extract url from intent extra, sdkPackageName is " + str + ", intent : " + com.safedk.android.utils.k.a(intent));
        ?? string = 0;
        ?? r10 = 0;
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (adNetworkDiscoveryH = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            List<String> listG = adNetworkDiscoveryH.g();
            Iterator<String> it = listG.iterator();
            ?? r11 = listG;
            while (true) {
                try {
                    r11 = r10;
                    if (!it.hasNext()) {
                        return r11;
                    }
                    String next = it.next();
                    Logger.d(f43554q, "looking for url in intent extra with name : " + next);
                    string = intent.getExtras().getString(next);
                    if (string != 0) {
                        Logger.d(f43554q, "found url in intent : " + string);
                        return string;
                    }
                    r10 = string;
                    r11 = r11;
                } catch (Throwable th2) {
                    string = r11;
                }
            }
        } catch (Throwable th3) {
        }
        Logger.e(f43554q, "Exception when attempting to extract url from intent extra");
        return string;
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        Logger.d(f43554q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is " + str + ", intent: " + com.safedk.android.utils.k.a(intent));
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (adNetworkDiscoveryH = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            return adNetworkDiscoveryH.a(intent.getExtras());
        } catch (Throwable th2) {
            Logger.e(f43554q, "Exception when attempting to extract expanded ad webview address from intent extra");
            return null;
        }
    }

    public static void detectAdClick(final Uri uri, final String sdkPackageName) {
        if (com.safedk.android.utils.k.c()) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, sdkPackageName);
                }
            });
        } else {
            b(uri, sdkPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        RedirectDetails redirectDetailsH;
        Logger.d(f43554q, "detect ad click Uri invoked, sdk=" + str + ", url = " + uri.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        if (com.safedk.android.utils.g.f44963i.equals(str) && SafeDK.P()) {
            u uVarA = DetectTouchUtils.a(str);
            long jLongValue = uVarA == null ? 0L : uVarA.f44566a.longValue();
            if ((jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) && ((redirectDetailsH = h()) == null || redirectDetailsH.f43730g == null || !redirectDetailsH.f43730g.equals(uri.toString()))) {
                try {
                    throw new Exception("redirect potential source");
                } catch (Exception e10) {
                    Logger.d(f43554q, "detect ad click, redirect potential source", e10);
                }
            }
        }
        a(intent, str, true);
    }

    private static boolean a(Intent intent) {
        int iIdentityHashCode = System.identityHashCode(intent);
        if (f43558u.contains(Integer.valueOf(iIdentityHashCode))) {
            Logger.d(f43554q, "mark intent as handled found " + iIdentityHashCode);
            return true;
        }
        if (f43558u.size() >= 100) {
            Logger.d(f43554q, "mark intent as handled > MAX events");
            f43558u.remove(0);
        }
        Logger.d(f43554q, "mark intent as handled add " + iIdentityHashCode);
        f43558u.add(Integer.valueOf(iIdentityHashCode));
        return false;
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder interstitialFinderY;
        try {
            Logger.d(f43554q, "attach loaded url to detected click started, sdk=" + str + ", url=" + str2 + ", webview=" + webView.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            SafeDK safeDK = SafeDK.getInstance();
            if (!SafeDK.Y() || safeDK == null || str2 == null) {
                Logger.d(f43554q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
                return;
            }
            if (str2.equals(AndroidWebViewClient.BLANK_PAGE) || str2.equals("About:blank")) {
                Logger.d(f43554q, "url is blank, skipping");
                return;
            }
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.e(str2)) {
                Logger.d(f43554q, "url should be ignored (by discovery class), skipping");
                return;
            }
            if ((str2.startsWith("http://") || str2.startsWith("https://")) && (interstitialFinderY = SafeDK.getInstance().y()) != null) {
                interstitialFinderY.b(str2, str, a(webView));
            }
            if (SafeDK.b() && StatsCollector.c() != null) {
                ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.redirect);
                Iterator<String> it = concurrentHashMapA.keySet().iterator();
                while (it.hasNext()) {
                    RedirectEvent redirectEvent = (RedirectEvent) concurrentHashMapA.get(it.next());
                    if (redirectEvent.i().equals(str) && redirectEvent.d() == null) {
                        Logger.d(f43554q, "Attaching url to url-less redirect event. event = " + redirectEvent.toString() + ", url = " + str2);
                        redirectEvent.a(str2);
                    }
                }
                return;
            }
            Logger.d(f43554q, "Reporter thread not initialized or stats collector instance is null, skipping");
        } catch (Throwable th2) {
            Logger.e(f43554q, "failed to attach url to detected click (internal browser)", th2);
        }
    }

    static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            Logger.e(f43554q, "Failed to get hash value for bitmap", e10);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static String a(Bitmap bitmap, AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        FileOutputStream fileOutputStream;
        String strA = a(adType, str, str2, str3, screenShotOrientation);
        if (new File(strA).exists()) {
            new File(strA).delete();
            Logger.d(f43554q, "found existing file, deleted : " + strA);
        }
        Logger.d(f43554q, "Saving image to file: " + strA);
        FileOutputStream fileOutputStream2 = null;
        try {
            Logger.d(f43554q, "Saving screenshot to file " + strA);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            fileOutputStream = new FileOutputStream(strA);
            if (fileOutputStream != null) {
                try {
                    try {
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        Logger.e(f43554q, "Failed to save screenshot to file, error : " + th.getMessage(), th);
                        if (fileOutputStream == null) {
                            return "";
                        }
                        try {
                            fileOutputStream.close();
                            return "";
                        } catch (IOException e10) {
                            Logger.e(f43554q, "Failed to save screenshot to file (fos close) , error : " + e10.getMessage(), e10);
                            return "";
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e11) {
                            Logger.e(f43554q, "Failed to save screenshot to file (fos close) , error : " + e11.getMessage(), e11);
                            return "";
                        }
                    }
                    throw th;
                }
            }
            if (fileOutputStream == null) {
                return strA;
            }
            try {
                fileOutputStream.close();
                return strA;
            } catch (IOException e12) {
                Logger.e(f43554q, "Failed to save screenshot to file (fos close) , error : " + e12.getMessage(), e12);
                return "";
            }
        } catch (Throwable th4) {
            th = th4;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static void a(String str, AdType adType, String str2, String str3, String str4, ScreenShotOrientation screenShotOrientation) {
        FileOutputStream fileOutputStream;
        if (str == null) {
            return;
        }
        String strReplace = a(adType, str2, str3, str4, screenShotOrientation).replace(f43538a, f43539b);
        Logger.d(f43554q, "Saving ad text to file: " + strReplace);
        try {
            fileOutputStream = new FileOutputStream(strReplace);
            try {
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.close();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Logger.e(f43554q, "Failed to save ad text to file", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e12) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static String a(String str, boolean z10) {
        String str2;
        try {
            if (str == null) {
                Logger.d(f43554q, "Parameter name 'activityName' cannot be null");
                str2 = null;
            } else {
                String[] strArrSplit = str.split("@");
                str2 = strArrSplit.length > 1 ? strArrSplit[z10 ? (char) 1 : (char) 0] : "";
            }
            return str2;
        } catch (Throwable th2) {
            Logger.e(f43554q, "Failed to get activity address for " + str, th2);
            return "";
        }
    }

    static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th2) {
            Logger.e(f43554q, "Failed to create new file for screenshot", th2);
            return 0L;
        }
    }

    static synchronized void d(String str) {
        if (str != null) {
            Logger.d(f43554q, "remove ad files started, filepath " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (new File(str).exists()) {
                if (!new File(str).delete()) {
                    Logger.d(f43554q, "remove ad files failed to delete file " + str);
                } else {
                    Logger.d(f43554q, "remove ad files deleted file " + str);
                }
            } else {
                Logger.d(f43554q, "remove ad files filePath does not exist. file=" + str);
            }
            File file = new File(str.replace(f43538a, f43539b));
            if (file.exists()) {
                Logger.d(f43554q, "remove ad files deleting file " + file.getAbsolutePath());
                if (!file.delete()) {
                    Logger.d(f43554q, "remove ad files failed to delete file " + file.getAbsolutePath());
                }
            }
        }
    }

    static synchronized void a(AdType adType, String str) {
        synchronized (BrandSafetyUtils.class) {
            Logger.d(f43554q, "remove all ad files started, adType = " + adType.name() + " , impression = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (str.contains("_")) {
                String str2 = str.split("_")[1];
                File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
                Logger.d(f43554q, "remove all ad files impressionId = " + str2);
                File[] fileArrListFiles = dir.listFiles(new b(str2));
                if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                    for (File file : fileArrListFiles) {
                        Logger.d(f43554q, "remove all ad files deleting file for impression " + str2 + " : " + file.getAbsolutePath());
                        d(file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String e(String str) {
        if (str != null) {
            return r(str) ? com.safedk.android.utils.g.f44962h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String strE = e(name);
        if (strE == null) {
            strE = name;
        }
        Logger.v(f43554q, "SDK package for class " + name + " is " + strE);
        return strE == null ? "unknown" : strE;
    }

    public static boolean f(String str) {
        return r(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    private static boolean r(String str) {
        return str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN);
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    private static a a(String str, Bitmap bitmap, int i10, AdType adType) {
        int i11;
        a aVar = new a();
        Random random = new Random();
        HashMap map = new HashMap();
        float fA = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f);
        float fA2 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f);
        float fA3 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f);
        float fA4 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f);
        Logger.d(f43554q, "scanBitmap started, sdkPackage = " + str + ", adType = " + adType.name() + " bitmap scan : margins are : top " + fA + " , right " + fA2 + ", left " + fA3 + ", right " + fA4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int width = bitmap.getWidth();
        int i12 = (int) (fA3 * width);
        int i13 = (int) (width - (fA2 * width));
        int height = bitmap.getHeight();
        int i14 = (int) (fA * height);
        int i15 = (int) (height - (height * fA4));
        for (int i16 = 0; i16 < i10; i16++) {
            int pixel = 16777215 & bitmap.getPixel(random.nextInt(i13 - i12) + i12, random.nextInt(i15 - i14) + i14);
            Integer num = (Integer) map.get(Integer.valueOf(pixel));
            if (num == null) {
                map.put(Integer.valueOf(pixel), 1);
            } else {
                map.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        int iIntValue = 0;
        Iterator it = map.values().iterator();
        while (true) {
            i11 = iIntValue;
            if (!it.hasNext()) {
                break;
            }
            iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > i11) {
                aVar.a(iIntValue);
            } else {
                iIntValue = i11;
            }
        }
        if (map.get(0) != null && ((Integer) map.get(0)) != null) {
            int iIntValue2 = (((Integer) map.get(0)).intValue() * 100) / i10;
            Logger.d(f43554q, "bitmap scan : Black Pixel Percentage is " + iIntValue2 + " (" + map.get(0) + "/" + i10 + ")");
            aVar.b(iIntValue2);
        }
        if (map.get(Integer.valueOf(f43561x)) != null && ((Integer) map.get(Integer.valueOf(f43561x))) != null) {
            int iIntValue3 = (((Integer) map.get(Integer.valueOf(f43561x))).intValue() * 100) / i10;
            Logger.d(f43554q, "bitmap scan : Grey Pixel Percentage is " + iIntValue3 + " (" + map.get(Integer.valueOf(f43561x)) + "/" + i10 + ")");
            aVar.c(iIntValue3);
        }
        Logger.v(f43554q, "bitmap scan : maxPixelValue = " + i11);
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) map));
        }
        return aVar;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (Color.red(iIntValue) != Color.blue(iIntValue) || Color.blue(iIntValue) != Color.green(iIntValue)) {
                Logger.d(f43554q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(f43554q, "Image is Greyscale");
        return true;
    }

    public static boolean a(int i10) {
        return a(i10, 1000, SafeDK.getInstance().G());
    }

    public static boolean b(int i10) {
        return a(i10, 500, SafeDK.getInstance().T());
    }

    public static boolean c(int i10) {
        return a(i10, 500, SafeDK.getInstance().T());
    }

    private static boolean a(int i10, int i11, float f10) {
        Logger.d(f43554q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is " + f10);
        return ((float) i10) < (f10 / 100.0f) * ((float) i11);
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H()));
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().U());
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().U());
    }

    public static ScreenshotValidity a(String str, a aVar, int i10, float f10) {
        Logger.d(f43554q, "screenshot validity check started, number of samples: " + i10 + ", BitmapScanResult: " + aVar);
        if (aVar.b() > 98) {
            Logger.d(f43554q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int iA = (aVar.a() * 100) / i10;
        if (iA > 98) {
            Logger.d(f43554q, "screenshot validity check, uniform pixel count is " + iA + "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (iA > f10) {
            Logger.d(f43554q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = " + iA + "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && aVar.c() > 10) {
            Logger.d(f43554q, "screenshot validity check, black pixel percentage is " + aVar.b() + "% , grey pixel percentage is " + aVar.c() + "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50) {
            Logger.d(f43554q, "screenshot validity check, black pixel percentage is " + aVar.b() + "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.d()) {
                Logger.d(f43554q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(f43554q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(f43554q, "getFileName Sdk UUID is " + sdkUUIDByPackage + " for sdk " + str2);
        return SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0) + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + f43538a;
    }

    public static boolean c(Class cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        Logger.d(f43554q, "Redirect detection interstitial activity check started, Activity name : " + str + ", result : " + f43556s.contains(str) + ", redirectDetectionInterstitialActivities= " + f43556s);
        return f43556s.contains(str);
    }

    public static boolean d(Class cls) {
        return h(cls.getName());
    }

    public static boolean h(String str) {
        Logger.d(f43554q, "Interstitial activity check started, Activity name : " + str + ", result : " + f43555r.contains(str) + ", interstitialActivities= " + f43555r);
        return f43555r.contains(str);
    }

    public static String i(String str) {
        for (String str2 : f43555r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static void j(String str) {
        Logger.d(f43554q, "addInterstitialActivity started name=" + str);
        f43555r.add(str);
    }

    public static void k(String str) {
        Logger.d(f43554q, "removeInterstitialActivity started name=" + str);
        f43555r.remove(str);
    }

    public static int b(AdType adType) {
        try {
            Logger.d(f43554q, "get image count by ad type started, adType = " + adType.name() + " : " + adType);
            File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
            File[] fileArrListFiles = dir.listFiles();
            String str = "";
            for (File file : fileArrListFiles) {
                str = str + ", " + file.getName();
            }
            Logger.d(f43554q, "get image count by ad type all files in " + dir.getName() + " : " + str);
            Logger.d(f43554q, "get image count by ad type returned " + fileArrListFiles.length + " for adType " + adType.name());
            return fileArrListFiles.length;
        } catch (Throwable th2) {
            Logger.d(f43554q, "get image count by ad type  error :  " + th2.getMessage(), th2);
            return -1;
        }
    }

    public static List<d> c(AdType adType) {
        ScreenShotOrientation screenShotOrientationValueOf;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(f43554q, "Restoring " + adType + " images for upload, isOnUiThread = " + com.safedk.android.utils.k.c());
            File[] fileArrListFiles = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0).listFiles(new c());
            if (fileArrListFiles != null) {
                Logger.d(f43554q, "Found " + fileArrListFiles.length + " candidate images for upload");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Logger.d(f43554q, "Checking file " + name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(f43538a, f43539b));
                    Logger.d(f43554q, "Deleting file " + file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] strArrSplit = name.replace(f43538a, "").split("_");
                    if (strArrSplit.length == 4) {
                        String str = strArrSplit[0];
                        String sdkPackageByPackageUUID = strArrSplit[1];
                        Logger.d(f43554q, "sdk = " + strArrSplit[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]) != null) {
                            sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]);
                            Logger.d(f43554q, "sdk value replaced : " + sdkPackageByPackageUUID);
                        }
                        String str2 = strArrSplit[2];
                        try {
                            screenShotOrientationValueOf = ScreenShotOrientation.valueOf(strArrSplit[3].toUpperCase());
                        } catch (IllegalArgumentException e10) {
                            screenShotOrientationValueOf = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(f43554q, "Restore image for upload: " + absolutePath);
                        arrayList.add(new d(str, sdkPackageByPackageUUID, str2, screenShotOrientationValueOf, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.d(f43554q, "Error while restoring ads for upload", th2);
            new CrashReporter().caughtException(th2);
        }
        return arrayList;
    }

    private static void j() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        I = displayMetrics.heightPixels;
        H = displayMetrics.widthPixels;
    }

    static int a() {
        if (H == 0) {
            j();
        }
        return H;
    }

    static int b() {
        if (I == 0) {
            j();
        }
        return I;
    }

    static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    static ScreenShotOrientation b(Bitmap bitmap) {
        if (bitmap == null) {
            return ScreenShotOrientation.NOT_INITIALIZED;
        }
        return bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static String l(String str) {
        if (str != null) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f43605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f43607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScreenShotOrientation f43608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f43609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f43610f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.f43605a = str;
            this.f43606b = str2;
            this.f43607c = str3;
            this.f43608d = screenShotOrientation;
            this.f43609e = str4;
            this.f43610f = str5;
        }

        public String a() {
            return this.f43605a;
        }

        public String b() {
            return this.f43606b;
        }

        public String c() {
            return this.f43607c;
        }

        public ScreenShotOrientation d() {
            return this.f43608d;
        }

        public String e() {
            return this.f43609e;
        }

        public String f() {
            return this.f43610f;
        }
    }

    private static void a(String str, long j10, long j11, String str2, String str3, String str4) {
        try {
            Logger.d(f43554q, "Report click url with no impression to server starting, sdkPackageName=" + str + ", url=" + str3 + ", currentForegroundActivityName=" + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (!SafeDK.Y()) {
                Logger.d(f43554q, "Max not initialized, this is not a Max mediated App.");
            }
            if (!e.a(str)) {
                Logger.d(f43554q, "Redirect reporting not supported for Sdk " + str + ", report will not be sent");
                return;
            }
            if (str3 != null) {
                Uri uri = Uri.parse(str3);
                if (uri.getScheme() != null && uri.getHost() != null) {
                    if (e.a(str, str3)) {
                        Logger.d(f43554q, "Ignoring this intent as it was already reported , sdkPackageName=" + str + " ,intentUrl=" + str);
                        return;
                    }
                    RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j10, j11);
                    redirectEvent.a(p.a().b());
                    if (SafeDK.b()) {
                        StatsCollector.c().a(redirectEvent);
                    } else {
                        Logger.d(f43554q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.e(f43554q, "Exception during attempt to create redirect event", th2);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f43611a = "SdkUrlRedirectManager";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Map<String, Long> f43612b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f43613c = 1000;

        private e() {
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(f43611a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=" + str + ", url=" + str2 + " , result = " + f43612b.containsKey(b(str, str2)));
            return f43612b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(f43611a, "getting latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            if (c(str, str2)) {
                return f43612b.get(b(str, str2)).longValue();
            }
            return 0L;
        }

        public static boolean a(String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a();
            long jD = d(str, str2);
            Logger.d(f43611a, "Checking if we should ignore the redirect instance sdkPackageName=" + str + ", url=" + str2 + ", timestamp=" + jCurrentTimeMillis + ",System.currentTimeMillis()=" + System.currentTimeMillis() + ", latestTimestamp=" + jD + ", diff=" + (System.currentTimeMillis() - jD));
            if (jD != 0 && System.currentTimeMillis() - jD < f43613c) {
                Logger.d(f43611a, "should ignore this redirect.");
                return true;
            }
            a(str, str2, jCurrentTimeMillis);
            return false;
        }

        private static void a(String str, String str2, long j10) {
            Logger.d(f43611a, "Update latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            f43612b.put(b(str, str2), Long.valueOf(j10));
            Logger.d(f43611a, "timestamps : " + f43612b.toString());
        }

        private static void a() {
            Logger.d(f43611a, "Clear data started, (" + f43612b.size() + ") : " + f43612b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : f43612b.keySet()) {
                Logger.d(f43611a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=" + (System.currentTimeMillis() - f43612b.get(str).longValue()));
                if (System.currentTimeMillis() - f43612b.get(str).longValue() > f43613c) {
                    Logger.d(f43611a, "Added key for removal : " + str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(f43611a, "Removing key " + str2);
                    f43612b.remove(str2);
                }
            }
            Logger.d(f43611a, "Clear data finished, Items (" + f43612b.size() + ") : " + f43612b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage != null && sdkUUIDByPackage.length() > 0 && SdksMapping.getRedirectSupportedSdks() != null) {
                Logger.d(f43611a, "sdk=" + str + ", sdkUid=" + sdkUUIDByPackage + ", supported ? " + SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage));
                return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
            }
            Logger.d(f43611a, "Cannot determine if sdk is redirect detection supported, sdk=" + str);
            return false;
        }
    }

    public static void m(String str) {
        Logger.d(f43554q, "adding to redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f43557t.toString());
        f43557t.add(str);
    }

    public static void n(String str) {
        Logger.d(f43554q, "removing from redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f43557t.toString());
        f43557t.remove(str);
    }

    public static boolean o(String str) {
        Logger.d(f43554q, "checking if there is a redirect current open fullscreen ad in collection. sdk = " + str + ", result is " + f43557t.contains(str) + ", redirectDetectionCurrentInterstitialBySdk = " + f43557t.toString());
        return f43557t.contains(str);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f43599a = "BitmapScanResult";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f43603e = false;

        public int a() {
            return this.f43600b;
        }

        public void a(int i10) {
            this.f43600b = i10;
        }

        public int b() {
            return this.f43601c;
        }

        public void b(int i10) {
            Logger.d(f43599a, "setBlackPixelPercentage : " + i10);
            this.f43601c = i10;
        }

        public int c() {
            return this.f43602d;
        }

        public void c(int i10) {
            Logger.d(f43599a, "setGreyPixelPercentage : " + i10);
            this.f43602d = i10;
        }

        public boolean d() {
            return this.f43601c > 50 && this.f43603e;
        }

        public void a(boolean z10) {
            this.f43603e = z10;
        }

        public String toString() {
            return "{MaxPixelCount = " + this.f43600b + ", BlackPixelPercentage = " + this.f43601c + "%, GreyPixelPercentage = " + this.f43602d + "%}";
        }
    }

    public static String p(String str) {
        byte[] bArr = new byte[0];
        if (new File(str).exists()) {
            byte[] bArr2 = new byte[0];
            try {
                return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(a(new File(str)))).toString(16);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            return "";
        }
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                } else {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e10) {
            Logger.d(f43554q, "Exception reading file : " + e10.getMessage(), e10);
            return null;
        }
    }

    public static void onMraidOpen(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String strOptString;
        Logger.d(f43554q, "on mraid open, sdk: " + sdkPackageName + ", urlJsonString: " + urlJsonString + ", object: " + obj + ", originated method: " + originatedMethod);
        if (obj != null && urlJsonString != null) {
            try {
                strOptString = new JSONObject(urlJsonString).optString("url");
            } catch (JSONException e10) {
                Logger.d(f43554q, "on mraid open, failed to get url from: " + urlJsonString);
                strOptString = null;
            }
            for (Field field : obj.getClass().getFields()) {
                try {
                    if (field.get(obj) instanceof WebView) {
                        onMraidOpen(sdkPackageName, null, strOptString, (WebView) field.get(obj), originatedMethod);
                    }
                } catch (IllegalAccessException e11) {
                    Logger.d(f43554q, "on mraid open, failed to get webview from: " + obj);
                }
            }
        }
    }

    public static void onMraidExpand(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String strOptString;
        Logger.d(f43554q, "on mraid expand, sdk: " + sdkPackageName + ", urlJsonString: " + urlJsonString + ", object: " + obj + ", originated method: " + originatedMethod);
        if (obj != null && urlJsonString != null) {
            try {
                strOptString = new JSONObject(urlJsonString).optString("url");
            } catch (JSONException e10) {
                Logger.d(f43554q, "on mraid expand, failed to get url from: " + urlJsonString);
                strOptString = null;
            }
            for (Field field : obj.getClass().getFields()) {
                try {
                    if (field.get(obj) instanceof WebView) {
                        onMraidExpand(sdkPackageName, null, strOptString, (WebView) field.get(obj), originatedMethod);
                    }
                } catch (IllegalAccessException e11) {
                    Logger.d(f43554q, "on mraid expand, failed to get webview from: " + obj);
                }
            }
        }
    }

    public static void onMraidOpen(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        Logger.d(f43554q, "on mraid open, sdk: " + sdkPackageName + ", str: " + str + ", url: " + url + ", webview: " + view + ", originated method: " + originatedMethod);
        if (sdkPackageName != null && url != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.REDIRECT, originatedMethod);
                    } catch (Throwable th2) {
                        Logger.e(BrandSafetyUtils.f43554q, "exception while handling mraid open", th2);
                    }
                }
            });
        }
    }

    public static void onMraidExpand(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        Logger.d(f43554q, "on mraid expand, sdk: " + sdkPackageName + ", str: " + str + ", url: " + url + ", webview: " + view + ", originated method: " + originatedMethod);
        if (sdkPackageName != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.EXPAND, originatedMethod);
                    } catch (Throwable th2) {
                        Logger.e(BrandSafetyUtils.f43554q, "exception while handling mraid expand", th2);
                    }
                }
            });
        }
    }

    public static boolean a(String str, WebView webView) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strA = a(webView);
        u uVarA = DetectTouchUtils.a(str, strA);
        long jLongValue = uVarA == null ? 0L : uVarA.f44566a.longValue();
        boolean z10 = jElapsedRealtime - jLongValue < 20000;
        Logger.d(f43554q, "is ad clicked recently - for package: " + str + " and view address: " + strA + " returned: " + z10 + "last touch event: " + jLongValue + " vs current: " + jElapsedRealtime);
        return z10;
    }

    public static void onShouldOverrideUrlLoading(final String sdkPackageName, final WebView view, final String url, boolean ret) {
        Logger.d(f43554q, "on should override url loading, sdk: " + sdkPackageName + ", webview: " + view + ", url: " + url + ", ret: " + ret);
        CreativeInfoManager.a(sdkPackageName, view, url);
        final String strA = a(view);
        if (CreativeInfoManager.a(sdkPackageName, AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, false)) {
            Logger.d(f43554q, "on should override url loading - ignoring the call because there is another way to handle this calls");
            return;
        }
        if (ret && sdkPackageName != null && view != null && url != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(sdkPackageName);
                        if (adNetworkDiscoveryH != null) {
                            RedirectDetails.RedirectType redirectTypeF = adNetworkDiscoveryH.f(url);
                            String strG = adNetworkDiscoveryH.g(url);
                            Logger.d(BrandSafetyUtils.f43554q, "on should override url loading: target url is: " + strG + " redirect type is: " + redirectTypeF);
                            if (redirectTypeF != null) {
                                Logger.d(BrandSafetyUtils.f43554q, "on should override url loading: webView's ancestors are: " + com.safedk.android.analytics.brandsafety.b.a((View) view));
                                BrandSafetyUtils.a(sdkPackageName, view, strG, redirectTypeF, "shouldOverrideUrlLoading");
                                if (BrandSafetyUtils.a(sdkPackageName, view)) {
                                    Logger.d(BrandSafetyUtils.f43554q, "on should override url loading, updating click URL. address : " + strA);
                                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                        if (aVar != null && aVar.a(strG, sdkPackageName, strA)) {
                                            com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f43638n, new ImpressionLog.a("url", strG), new ImpressionLog.a(ImpressionLog.E, RedirectEvent.f44652i));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            Logger.d(BrandSafetyUtils.f43554q, "on should override url loading, ignore redirect, sdk: " + sdkPackageName + ", webview: " + view + ", url: " + url);
                        }
                    } catch (Throwable th2) {
                        Logger.e(BrandSafetyUtils.f43554q, "exception while handling should override url loading", th2);
                    }
                }
            });
        } else if (!ret) {
            com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f43646v, new ImpressionLog.a("api", "so"), new ImpressionLog.a("url", url), new ImpressionLog.a(ImpressionLog.L, "allow"));
        }
    }

    public static void onShouldOverrideUrlLoadingWithHeaders(String sdkPackageName, WebView view, WebResourceRequest webResourceRequest, boolean ret) {
        Logger.d(f43554q, "onShouldOverrideUrlLoadingWithHeaders started with: " + sdkPackageName + " and view: " + view + " request: " + webResourceRequest + " and ret: " + ret);
        if (Build.VERSION.SDK_INT >= 21) {
            onShouldOverrideUrlLoading(sdkPackageName, view, webResourceRequest.getUrl().toString(), ret);
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        synchronized (BrandSafetyUtils.class) {
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.Y() && safeDK != null) {
                String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
                if (SafeDK.P() && E != null && str2 != null && !E.equals(str2) && !E.equals(strReplaceAll)) {
                    Logger.d(f43554q, "ignore redirect indication, sdk: " + str + ", url: " + str2);
                    E = null;
                } else {
                    AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(str, webView);
                    if (adTypeA != AdType.INTERSTITIAL) {
                        l();
                        D = new RedirectDetails(str, adTypeA, redirectType, webView != null ? a(webView) : null, str2, str3, D != null ? D : null);
                        Logger.d(f43554q, "handle redirect: last redirect - " + D);
                        e();
                    } else {
                        Logger.d(f43554q, "handle redirect, ignore interstitial redirect, sdk: " + str + ", url: " + str2);
                    }
                }
            } else {
                Logger.d(f43554q, "handle redirect, Max/SafeDK not initialized, skipping. ");
            }
        }
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        synchronized (BrandSafetyUtils.class) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
            if (SafeDK.P() && F != null && str2 != null && !F.equals(str2) && !F.equals(strReplaceAll)) {
                Logger.d(f43554q, "ignore intent, sdk: " + mainSdkPackage + ", url: " + str2);
                F = null;
            } else {
                k();
                C = new m(mainSdkPackage, str2, str3, str4, C != null ? C : null);
                Logger.d(f43554q, "handle redirect: last intent details - " + C);
                e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    public static synchronized String d() {
        String str;
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (D != null && C != null && C.f44524c != null && C.f44524c.equals(D.f43726c)) {
                boolean zA = CreativeInfoManager.a(D.f43726c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
                if (D.f43728e == RedirectDetails.RedirectType.REDIRECT && zA) {
                    u uVarA = DetectTouchUtils.a(C.f44524c, D.f43729f);
                    long jLongValue = uVarA == null ? 0L : uVarA.f44566a.longValue();
                    if (jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) {
                        Logger.d(f43554q, "check for potential auto redirect, identified for " + C.f44524c + ", view address: " + D.f43729f + ", webviewReqURL: " + D.f43730g + ", landingPageURL: " + C.f44525d);
                        str = C.f44525d;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
        }
        return str;
    }

    public static synchronized void e() {
        l();
        k();
        if (D != null && C != null && C.f44524c != null && C.f44524c.equals(D.f43726c)) {
            a(C.f44524c, true, false);
        }
    }

    public static synchronized void f() {
        l();
        k();
        if (D != null && C != null && D.f43728e == RedirectDetails.RedirectType.EXPAND && C.f44524c != null && C.f44524c.equals(D.f43726c) && CreativeInfoManager.a(D.f43726c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
            a(C.f44524c, false, true);
        }
    }

    public static synchronized void g() {
        l();
        k();
        if (D != null && C != null && C.f44524c != null && C.f44524c.equals(D.f43726c)) {
            a(C.f44524c, true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    public static synchronized com.safedk.android.analytics.brandsafety.e a(Activity activity) {
        com.safedk.android.analytics.brandsafety.e eVarA;
        l();
        k();
        Logger.d(f43554q, "handle Redirect If Needed with activity: " + activity + " last redirect: " + D + "\nlast intent: " + C);
        if (D == null || C == null) {
            eVarA = null;
        } else {
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(activity.toString());
            Logger.d(f43554q, "handle Redirect If Needed with activity: activity sdk: " + sdkPackageByClass);
            if (sdkPackageByClass != null && sdkPackageByClass.equals(C.f44524c) && sdkPackageByClass.equals(D.f43726c)) {
                eVarA = a(sdkPackageByClass, false, true);
            } else {
                eVarA = null;
            }
        }
        return eVarA;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0125 A[Catch: all -> 0x017f, TryCatch #0 {, blocks: (B:4:0x0004, B:10:0x006a, B:7:0x0060, B:13:0x009e, B:15:0x00a4, B:17:0x0118, B:19:0x0125, B:20:0x012b, B:21:0x0130, B:23:0x013a, B:25:0x0144, B:27:0x014a, B:32:0x0182, B:34:0x018c), top: B:37:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x01ff  */
    private static synchronized com.safedk.android.analytics.brandsafety.e a(String str, boolean z10, boolean z11) {
        com.safedk.android.analytics.brandsafety.c cVarA;
        List<CreativeInfo> listA;
        com.safedk.android.analytics.brandsafety.e eVar = null;
        synchronized (BrandSafetyUtils.class) {
            Logger.d(f43554q, "handle Redirect Report: last redirect name: " + D.f43728e.name().toLowerCase() + ", intent: " + C + ", redirect: " + D);
            boolean zA = CreativeInfoManager.a(D.f43726c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
            boolean zA2 = CreativeInfoManager.a(D.f43726c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
            if ((D.f43728e == RedirectDetails.RedirectType.REDIRECT && !zA2) || (D.f43728e == RedirectDetails.RedirectType.EXPAND && !zA)) {
                Logger.d(f43554q, "handle " + D.f43728e.name().toLowerCase() + " is not supported for: " + D.f43726c);
            } else if (D.f43727d != null) {
                Logger.d(f43554q, "handle " + D.f43728e.name().toLowerCase() + ", for " + str + Z7.f27998r + D.f43727d + ", view address: " + D.f43729f + ", webviewReqURL: " + D.f43730g + ", landingPageURL: " + C.f44525d);
                com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(D.f43727d);
                if (aVarA != null) {
                    cVarA = aVarA.a(str, D, C, z10, z11);
                } else {
                    cVarA = null;
                }
                if (z11) {
                    D = null;
                    C = null;
                }
                eVar = (com.safedk.android.analytics.brandsafety.e) cVarA;
            } else {
                InterstitialFinder interstitialFinderY = SafeDK.getInstance().y();
                if (interstitialFinderY != null && (listA = interstitialFinderY.a(str, D.f43729f)) != null && !listA.isEmpty()) {
                    Logger.d(f43554q, "handle " + D.f43728e.name().toLowerCase() + ", redirect details belong to an interstitial ad, drop it: " + D);
                    D = null;
                } else {
                    BannerFinder bannerFinderZ = SafeDK.getInstance().z();
                    if (bannerFinderZ != null) {
                        Logger.d(f43554q, "handle " + D.f43728e.name().toLowerCase() + ", for " + str + Z7.f27998r + bannerFinderZ.a() + ", view address: " + D.f43729f + ", webviewReqURL: " + D.f43730g + ", landingPageURL: " + C.f44525d);
                        cVarA = bannerFinderZ.a(str, D, C, z10, z11);
                    } else {
                        cVarA = null;
                    }
                    if (z11) {
                        D = null;
                        C = null;
                    }
                    eVar = (com.safedk.android.analytics.brandsafety.e) cVarA;
                }
            }
        }
        return eVar;
    }

    private static void k() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (C != null && jElapsedRealtime - C.f44523b.longValue() > iG) {
            Logger.d(f43554q, "remove old intent: " + C);
            C = null;
        }
    }

    private static void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (D != null && jElapsedRealtime - D.f43725b.longValue() > iG) {
            Logger.d(f43554q, "remove old redirect: " + D);
            D = null;
        }
    }

    public static RedirectDetails h() {
        l();
        return D;
    }

    public static void q(String str) {
        if (SafeDK.P()) {
            E = str;
            F = str;
        }
    }

    public static void i() {
        E = null;
        F = null;
    }

    public static AdType a(long j10, long j11) {
        if (com.safedk.android.utils.k.a(j10, j11)) {
            Logger.d(f43554q, "generate info View check. banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.k.b(j10, j11)) {
            Logger.d(f43554q, "generate info View check. mrec identified");
            return AdType.MREC;
        }
        Logger.d(f43554q, "generate info View check. inter identified");
        return AdType.INTERSTITIAL;
    }
}
