package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class Pe {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    public static String N = "";
    public static String O = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f27356a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27357b = "?request=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27358c = "platform";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27359d = "applicationKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27360e = "applicationUserId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f27361f = "sdkVersion";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f27362g = "pluginType";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f27363h = "pluginVersion";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27364i = "plugin_fw_v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f27365j = "advId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f27366k = "auid";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f27367l = "isDemandOnly";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f27368m = "serr";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f27369n = "appVer";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f27370o = "osVer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f27371p = "devModel";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f27372q = "devMake";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f27373r = "connType";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f27374s = "rawConnType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f27375t = "mt";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f27376u = "fs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f27377v = "coppa";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f27378w = "dff";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f27379x = "browserUserAgent";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f27380y = "deviceLang";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f27381z = "bundleId";

    public static String a() {
        return N;
    }

    public static String b() {
        return O;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, List<Pair<String, String>> list, boolean z11) throws UnsupportedEncodingException {
        List<String> list2;
        B7 b7I = Lb.U().i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z10) {
            arrayList.add(new Pair(G, "1"));
        }
        if (!IronSourceUtils.g()) {
            arrayList.add(new Pair(f27368m, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f27362g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f27363h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f27364i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(f27365j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String strB = C1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            arrayList.add(new Pair(f27369n, strB));
        }
        arrayList.add(new Pair(f27370o, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(f27372q, Build.MANUFACTURER));
        arrayList.add(new Pair(f27371p, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.c(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C3649pa.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29880b)) {
            arrayList.add(new Pair(f27377v, concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29880b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29884f)) {
            String str5 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29884f).get(0);
            if (!TextUtils.isEmpty(str5) && str5.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f29888j)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29882d)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29882d).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase("true")) {
                arrayList.add(new Pair(f27378w, "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f29883e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f29883e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.f29883e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            arrayList.add(new Pair(f27373r, strA));
        }
        String strD = C3372a4.d(context);
        if (!TextUtils.isEmpty(strD)) {
            arrayList.add(new Pair(f27374s, strD));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = b7I.s();
        if (strS.length() != 0) {
            arrayList.add(new Pair(f27379x, strS));
        }
        String str7 = null;
        try {
            str7 = b7I.c(context) + "-" + b7I.A(context);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (str7 != null && str7.length() != 0) {
            arrayList.add(new Pair(f27380y, str7));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + Z3.b(context)));
        arrayList.add(new Pair("mnc", "" + Z3.c(context)));
        String strG = b7I.G(context);
        if (!TextUtils.isEmpty(strG)) {
            arrayList.add(new Pair("icc", strG));
        }
        String strU = b7I.u(context);
        if (!TextUtils.isEmpty(strU)) {
            arrayList.add(new Pair(D, strU));
        }
        String strD2 = b7I.d();
        if (!TextUtils.isEmpty(strD2)) {
            arrayList.add(new Pair("tz", strD2));
        }
        arrayList.add(new Pair(F, "" + b7I.m()));
        String strD3 = b7I.d(context);
        if (!TextUtils.isEmpty(strD3)) {
            arrayList.add(new Pair("auid", strD3));
        }
        if (z11) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(Q6.f27440j0, String.valueOf(C3547k0.a())));
        String strA2 = a(arrayList);
        N = strA2;
        return a(LevelPlay.getSdkVersion()) + URLEncoder.encode(N9.e(C3644p5.b().c(), strA2), "UTF-8");
    }

    private static void b(String str) {
        f27356a = str;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(String str, boolean z10, int i10) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z10)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return str + "&" + a(arrayList);
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    private static String a(String str) {
        return f27356a + str + f27357b;
    }
}
