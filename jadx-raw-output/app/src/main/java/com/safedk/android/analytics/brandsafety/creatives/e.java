package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44268a = "ResourceUrlFilter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44269b = "attribution.urls";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44270c = "general_exclusion_list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44271d = "general_inclusion_list";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44272e = "http";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f44274g = 1.1f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f44275h = 1.3f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44276i = "BannerView";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f44277j = 6.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f44278k = 8.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44280m = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String[]> f44273f = b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final LinkedHashSet<String> f44279l = new LinkedHashSet<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f44281n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ConcurrentHashMap<String, b> f44282o = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ConcurrentHashMap<String, a> f44283p = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, String[]> a() {
        return f44273f;
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConcurrentHashMap<String, Pair<ArrayList<String>, ArrayList<String>>> f44286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CreativeInfo f44287b;

        private b() {
            this.f44286a = new ConcurrentHashMap<>();
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set<String> f44284a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Set<String> f44285b = new HashSet();

        a() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            synchronized (this.f44284a) {
                sb2.append("webviewResources=" + (this.f44284a != null ? this.f44284a.toString() : "null"));
            }
            synchronized (this.f44285b) {
                sb2.append(", dspDomains=" + (this.f44285b != null ? this.f44285b.toString() : "null"));
            }
            return sb2.toString();
        }
    }

    private static ConcurrentHashMap<String, String[]> b() {
        ConcurrentHashMap<String, String[]> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(g.f44955a, new String[]{".applovin.com", ".applvn.com"});
        concurrentHashMap.put(g.f44960f, new String[]{".supersonicads.com", ".supersonic.com", "streamrail.com", "streamrail.net", "simharif.com", "atom-data.io", "supersonicads-a.akamaihd.net", ".ssacdn.com", ".isprog.com", "unity3d.com", "ironsrc.mobi"});
        concurrentHashMap.put(g.f44958d, new String[]{".vungle.com", ".liftoff.com", ".liftoff.io", ".chinaliftoff.io"});
        concurrentHashMap.put("com.unity3d.ads", new String[]{".unity3d.com"});
        concurrentHashMap.put("com.facebook.ads", new String[]{".facebook.com"});
        concurrentHashMap.put(g.f44962h, new String[]{".doubleclick.net", ".google.com", ".googlesyndication.com", ".googleadservices.com", ".googleapis.com", ".youtube.com", ".googleusercontent.com", ".gstatic.com", ".googlevideo.com"});
        concurrentHashMap.put(g.f44969o, new String[]{"rayjump.com", "mobvista.com", "mintegral.com", "mindworks-creative.com", "mtgglobals.com"});
        concurrentHashMap.put(g.f44956b, new String[]{"adcolony.com", "adccache.cn", "adtilt.com", "admarvel.com"});
        concurrentHashMap.put(f44269b, new String[]{"play.google.com", ".appsflyer.com", ".adjust.com", ".singular.net", ".tenjin.io", ".kochava.com", ".tune.com", ".partytrack.it", ".tapstream.com", ".apsalar.com", ".adj.st", ".singular.com", ".sng.link", ".tenjin.com", ".doubleverify.com", ".onelink.me", ".moatads.com", ".moatpixel.com", ".adsafeprotected.com"});
        concurrentHashMap.put(g.f44970p, new String[]{".inner-active.mobi", ".inner-active.com", "w3.org"});
        concurrentHashMap.put(g.f44963i, new String[]{"inmobicdn.net", "inmobi.com"});
        concurrentHashMap.put(g.f44975u, new String[]{"pangle.io", "byteoversea.com", "tiktokcdn.com", "ipstatp.com", "pglstatp.com", "snssdk.com", "pangolin-sdk-toutiao.com", "toutiao.com", "ibytedtos.com"});
        concurrentHashMap.put(g.f44980z, new String[]{"fivecdm.io", "fivecdm.com", "line.me"});
        concurrentHashMap.put(g.f44976v, new String[]{"smaato.net"});
        concurrentHashMap.put(g.D, new String[]{"adsmoloco.com"});
        concurrentHashMap.put(f44270c, new String[]{"outcome-cdn.supersonicads.com/", "click-haproxy.supersonicads.com/", "supersonicads.com/pixel", "supersonicads.com/endcardclick", "supersonicads.com/videoimpression", "supersonicads.com/isendcardclick", "supersonicads.com/isvideoimpression", "k.isprog.com", "events.isprog.com", ".simharif.com", "csi.gstatic.com/csi", "googleads.g.doubleclick.net/pagead/conversion", ".applovin.com/imp", ".applovin.com/click", ".applovin.com/interact", ".applovin.com/redirect", ".applvn.com/imp", ".applvn.com/click", ".applvn.com/interact", ".applvn.com/redirect", "event.inner-active.mobi", "events.inner-active.mobi"});
        concurrentHashMap.put(f44271d, new String[]{"gstatic.com", "googleusercontent.com", "tpc.googlesyndication.com", "/simgad/", "pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com", "googleadsserving.cn", "ggpht.com", "ibyteimg.com"});
        return concurrentHashMap;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (!a(SdksMapping.getMainSdkPackage(str2), str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        boolean z10;
        String[] strArr;
        if (!str2.startsWith("http")) {
            return false;
        }
        String strO = k.o(str2);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (TextUtils.isEmpty(mainSdkPackage) || (strArr = f44273f.get(mainSdkPackage)) == null) {
            z10 = false;
            break;
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (strO.contains(strArr[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        String[] strArr2 = f44273f.get(f44269b);
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (strO.contains(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        return z10 ? false : true;
    }

    public static void a(String str, WebView webView, String str2, Map<String, String> map) {
        a(str, webView, str2, map, BrandSafetyUtils.a(webView));
    }

    public static void a(String str, WebView webView, String str2, Map<String, String> map, String str3) {
        List<CreativeInfo> listA;
        BrandSafetyUtils.AdType adTypeK = null;
        if (webView != null && SafeDK.Y()) {
            String strA = BrandSafetyUtils.a(webView);
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
            Logger.d(f44268a, "handle resource url " + mainSdkPackage + " on webview " + strA + ", resource " + str2 + ", headers = " + map + " map key is: " + str3 + ", supportsMrecMonitoring = " + zA + ", webview = " + webView + ", getMaxAdViewFromChildView : " + k.b((View) webView) + ", isMrecWebView = " + k.a(webView));
            if (!zA && (k.b(webView.getWidth(), webView.getHeight()) || k.a(webView))) {
                Logger.d(f44268a, "handle resource url - ignoring url " + str2 + ",  supportsMrecMonitoring = " + zA + ", webview = " + webView + ", isMrecWebView =  " + k.a(webView) + " , isMrecRatio = " + k.b(webView.getWidth(), webView.getHeight()));
                a((List<String>) Arrays.asList(strA));
                return;
            }
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
            List<CreativeInfo> list = null;
            while (true) {
                if (!it.hasNext()) {
                    listA = list;
                    break;
                }
                com.safedk.android.analytics.brandsafety.b next = it.next();
                if (next.c(mainSdkPackage, strA, str2)) {
                    Logger.d(f44268a, "handle resource url - skip redirect URL and stop collecting resources: " + str2 + " for " + strA);
                    return;
                }
                listA = next.a(mainSdkPackage, strA);
                if (listA != null && !listA.isEmpty()) {
                    Logger.d(f44268a, "handle resource url found " + listA.size() + Z7.f27998r + next.a() + " CIs for webview " + strA);
                    break;
                }
                listA = next.b(mainSdkPackage, strA);
                if (listA != null && !listA.isEmpty()) {
                    Logger.d(f44268a, "handle resource url found " + listA.size() + " CIs for extended " + next.a() + " for webview " + strA);
                    break;
                }
                list = listA;
            }
            if (str2.startsWith("text:") && !com.safedk.android.utils.a.a(mainSdkPackage)) {
                Logger.d(f44268a, "Sdk " + mainSdkPackage + " does not support banner monitoring, skipping text resources");
                return;
            }
            boolean zIsInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
            if (listA != null && !listA.isEmpty() && listA.get(0) != null) {
                adTypeK = listA.get(0).K();
            }
            if (str2.startsWith("text:") && (BrandSafetyUtils.AdType.INTERSTITIAL.equals(adTypeK) || zIsInterstitialActivity)) {
                Logger.d(f44268a, "skipping text resource for interstitial " + mainSdkPackage + " on webview " + strA + ", resource " + str2 + ", interstitial activity = " + zIsInterstitialActivity);
                return;
            }
            if (listA != null && !listA.isEmpty()) {
                if (a(mainSdkPackage, str2, map)) {
                    if (k.b(str2, map)) {
                        if (!str2.startsWith(CreativeInfo.aq)) {
                            str2 = CreativeInfo.aq + str2;
                        }
                        Logger.d(f44268a, "handle resource url - video resource found : " + str2);
                    }
                    for (CreativeInfo creativeInfo : listA) {
                        if (creativeInfo != null) {
                            if (creativeInfo.l()) {
                                Logger.d(f44268a, "handle resource url - skip resource " + str2 + " for " + strA);
                            } else {
                                creativeInfo.y(str2);
                                Logger.d(f44268a, "handle resource url - added resource " + str2 + " to ci for " + strA + " and ad type: " + adTypeK);
                            }
                        }
                    }
                    return;
                }
                if (a(mainSdkPackage, str2)) {
                    Logger.d(f44268a, "WebView resource discarded (should not be added to dsp domains). resource = " + str2);
                    return;
                }
                return;
            }
            if (a(mainSdkPackage, str2, map)) {
                a aVar = f44283p.get(str3);
                synchronized (f44283p) {
                    if (aVar == null) {
                        aVar = new a();
                        f44283p.put(str3, aVar);
                    }
                }
                if (k.b(str2, map)) {
                    if (!str2.startsWith(CreativeInfo.aq)) {
                        str2 = CreativeInfo.aq + str2;
                    }
                    Logger.d(f44268a, "handle resource url - video resource found : " + str2);
                }
                synchronized (aVar.f44284a) {
                    aVar.f44284a.add(str2);
                }
                Logger.d(f44268a, "handle resource url - added resource " + str2 + " info " + str3 + " and ad type: " + adTypeK);
                return;
            }
            if (a(mainSdkPackage, str2)) {
                Logger.d(f44268a, "WebView resource discarded (should not be added to dsp domains). resource = " + str2);
            }
        }
    }

    public static void a(List<String> list) {
        a aVarRemove;
        if (list != null) {
            synchronized (list) {
                for (String str : list) {
                    if (str != null && (aVarRemove = f44283p.remove(str)) != null) {
                        Logger.d(f44268a, "clearing for " + str + " succeeded, " + aVarRemove.f44284a.size() + " resources removed, " + aVarRemove.f44285b.size() + " dsp domains removed");
                    }
                }
            }
        }
    }

    public static void a(String str, CreativeInfo creativeInfo, String str2) {
        k.b(f44268a, "attaching resource info to creative info. webview address=" + str + " map key is: " + str2 + ", ci = " + creativeInfo);
        a aVar = str2 != null ? f44283p.get(str2) : null;
        if (aVar == null) {
            Logger.d(f44268a, "no data for " + str2);
            return;
        }
        synchronized (aVar.f44284a) {
            for (String str3 : aVar.f44284a) {
                if (str3.startsWith("text:") && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    Logger.d(f44268a, "skipping text resource for interstitial " + creativeInfo.Q() + " on webview " + str + ", resource " + str3);
                } else {
                    Logger.d(f44268a, "attaching resource info to creative info. resource url = " + str3);
                    creativeInfo.y(str3);
                }
            }
        }
        synchronized (aVar.f44285b) {
            for (String str4 : aVar.f44285b) {
                Logger.d(f44268a, "attaching resource info to creative info. dsp resource url = " + str4);
                creativeInfo.x(str4);
            }
        }
        if (creativeInfo.Q().equals(g.f44969o)) {
            creativeInfo.u("attached_webview_rec_to_ci(" + k.e() + ")");
        }
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(creativeInfo.Q());
        AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscoveryH != null ? adNetworkDiscoveryH.b() : null;
        if (!creativeInfo.ah() && webViewResourceMatchingMethodB != null && webViewResourceMatchingMethodB != AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
            Logger.d(f44268a, "attaching resource info to creative info. clearing resource info. webview address=" + str);
            f44283p.remove(str);
        }
    }

    public static void a(String str, CreativeInfo creativeInfo) {
        Set<String> setD = CreativeInfoManager.d(str);
        setD.add(str);
        Logger.d(f44268a, "attachResourceInfosToCreativeInfo: allAddresses=" + setD);
        for (String str2 : setD) {
            a(str2, creativeInfo, str2);
        }
    }

    public static void a(String str) {
        k.b(f44268a, "clearing text resources for webview address=" + str);
        a aVar = f44283p.get(str);
        if (aVar == null || aVar.f44284a == null) {
            Logger.d(f44268a, "clearing text resources: no data for " + str);
            return;
        }
        Logger.d(f44268a, "number of items before clearing text resources is  " + aVar.f44284a.size());
        synchronized (aVar.f44284a) {
            Iterator<String> it = aVar.f44284a.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("text:")) {
                    Logger.d(f44268a, "clearing text resource " + next);
                    it.remove();
                }
            }
        }
        Logger.d(f44268a, "number of items after clearing text resources is  " + aVar.f44284a.size());
    }

    public static void a(String str, WebView webView, String str2, String str3, Map<String, String> map) {
        if (webView == null) {
            Logger.d(f44268a, "handle resource url - webView is null");
            return;
        }
        String strA = BrandSafetyUtils.a(webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        Logger.d(f44268a, "handle resource url " + mainSdkPackage + " on webview " + strA + ", context: " + webView.getContext() + " resource: " + str2 + " size: " + webView.getWidth() + StringUtils.COMMA + webView.getHeight() + ", webView id: " + Integer.toHexString(webView.getId()) + ", headers: " + map + ", supportsMrecMonitoring = " + zA + ", webview = " + webView + ", getMaxAdViewFromChildView : " + k.b((View) webView) + ", isMrecWebView = " + k.a(webView));
        if (!zA && (k.b(webView.getWidth(), webView.getHeight()) || k.a(webView))) {
            Logger.d(f44268a, "handle resource url - ignoring url " + str2 + ",  supportsMrecMonitoring = " + zA + ", webview = " + webView + ", isMrecWebView =  " + k.a(webView) + " , isMrecRatio = " + k.b(webView.getWidth(), webView.getHeight()));
            a((List<String>) Arrays.asList(strA));
            return;
        }
        if (map != null) {
            Logger.d(f44268a, "handle resource url - headers: " + map);
        }
        boolean zIsInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
        BrandSafetyUtils.AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(str, webView);
        Logger.d(f44268a, "handle resource url - interstitial activity: " + zIsInterstitialActivity + " adType: " + adTypeA);
        if (!zIsInterstitialActivity && (adTypeA == BrandSafetyUtils.AdType.MREC || adTypeA == BrandSafetyUtils.AdType.BANNER)) {
            if (!com.safedk.android.utils.a.a(mainSdkPackage)) {
                Logger.d(f44268a, "Sdk " + mainSdkPackage + " does not support banner monitoring, skipping");
                return;
            }
            if (!"com.unity3d.ads".equals(mainSdkPackage) || !webView.getContext().toString().contains("UnityPlayerActivity")) {
                if (!g.f44970p.equals(mainSdkPackage) || FyberDiscovery.j().containsKey(Integer.valueOf(webView.getId()))) {
                    Logger.d(f44268a, strA + " will be added to Webview address list");
                    f44279l.add(strA);
                    boolean zA2 = a(webView);
                    Logger.d(f44268a, "webview context: " + webView.getContext() + " size: " + webView.getWidth() + StringUtils.COMMA + webView.getHeight() + ", interstitial: " + zA2);
                    if (!zA2) {
                        Logger.d(f44268a, "handle resource url - no interstitial, skipping");
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        b bVar = f44282o.get(mainSdkPackage);
        Logger.d(f44268a, "handle resource url - sdk info is: " + bVar + " and sdkToWebViewInfo keys are: " + f44282o.keySet());
        if (bVar != null) {
            boolean zA3 = a(mainSdkPackage, str2, map);
            Logger.d(f44268a, "handle resource url - is resource url? " + zA3 + " sdkInfo ci is: " + bVar.f44287b);
            if (bVar.f44287b == null || g.f44970p.equals(mainSdkPackage)) {
                if (g.f44960f.equals(mainSdkPackage) && com.safedk.android.analytics.brandsafety.b.a(g.f44960f, webView) == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    if (str3 == null) {
                        str3 = f44281n;
                    }
                    Logger.d(f44268a, "handle resource url - using placement id as key " + str3);
                } else {
                    str3 = strA;
                }
                if (str3 != null) {
                    Pair<ArrayList<String>, ArrayList<String>> pair = bVar.f44286a.get(str3);
                    if (pair == null) {
                        pair = new Pair<>(new ArrayList(), new ArrayList());
                        bVar.f44286a.put(str3, pair);
                    }
                    if (zA3) {
                        Logger.d(f44268a, "handle resource url - storing resource for webview " + str3 + " resource = " + str2);
                        ((ArrayList) pair.second).add(str2);
                        return;
                    } else {
                        if (a(mainSdkPackage, str2)) {
                            Logger.d(f44268a, "handle resource url - WebView resource discarded (should not be added to dsp domains). resource = " + str2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (zA3) {
                if (bVar.f44287b != null && CreativeInfoManager.a(bVar.f44287b.Q(), AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, false)) {
                    Logger.d(f44268a, "handle resource url - VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER is true");
                    if (bVar.f44287b.af() != null) {
                        if (bVar.f44287b.af().equals(strA)) {
                            Logger.d(f44268a, "handle resource url - matching object address verification passed, adding resource url = " + str2);
                            bVar.f44287b.y(str2);
                            return;
                        } else {
                            Logger.d(f44268a, "handle resource url - matching object address verification failed, not adding resource url = " + str2);
                            return;
                        }
                    }
                    Logger.d(f44268a, "handle resource url - no matching object address, adding. cannot verify for resource = " + str2);
                    bVar.f44287b.y(str2);
                    return;
                }
                Logger.d(f44268a, "handle resource url - adding resource url = " + str2);
                bVar.f44287b.y(str2);
                return;
            }
            if (a(mainSdkPackage, str2)) {
                Logger.d(f44268a, "handle resource url - WebView resource discarded (should not be added to dsp domains). resource = " + str2);
            }
        }
    }

    public static boolean a(String str, String str2, Map<String, String> map) {
        return k.a(str2, map) || c(str, str2);
    }

    private static boolean c(String str, String str2) {
        if (!SdksMapping.getMainSdkPackage(str).equals("com.unity3d.ads")) {
            return false;
        }
        boolean zA = AdMobCreativeInfo.a(str2);
        if (zA) {
            Logger.d(f44268a, "admob known domain url = " + str2);
            return zA;
        }
        return zA;
    }

    public static void b(String str, String str2) {
        Logger.d(f44268a, "set new url Info data for package " + str);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (g.f44960f.equals(mainSdkPackage)) {
            if (!f44282o.contains(mainSdkPackage)) {
                f44282o.put(mainSdkPackage, new b());
            }
            f44281n = str2;
            Logger.d(f44268a, "updating placement Id to " + str2);
            return;
        }
        f44282o.put(mainSdkPackage, new b());
    }

    public static synchronized void a(CreativeInfo creativeInfo, String str) {
        String mainSdkPackage = SdksMapping.getMainSdkPackage(creativeInfo.Q());
        b bVar = f44282o.get(mainSdkPackage);
        if (bVar != null) {
            bVar.f44287b = creativeInfo;
            Logger.d(f44268a, "handle creative info selected sdk: " + mainSdkPackage + ", info data: " + creativeInfo);
            if (g.f44960f.equals(mainSdkPackage) && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (bVar != null && bVar.f44286a != null) {
                    if (creativeInfo.F() != null) {
                        Pair<ArrayList<String>, ArrayList<String>> pair = bVar.f44286a.get(creativeInfo.F());
                        if (pair != null) {
                            a(creativeInfo, creativeInfo.F(), pair);
                        } else {
                            Logger.d(f44268a, "webView resources is null, cannot attach resource url to CI, placement id = " + creativeInfo.F());
                        }
                    } else {
                        Logger.d(f44268a, "IronSource CI without placement. Cannot execute logic to determine if we need to attach resource urls to the CI. CI=" + creativeInfo);
                    }
                } else {
                    Logger.d(f44268a, "webView to url info list is null for package " + mainSdkPackage + " , cannot add resources to CI. WebView address is " + str + ", ci = " + (creativeInfo == null ? "null" : creativeInfo.toString()));
                }
            } else if (g.f44970p.equals(mainSdkPackage)) {
                if (str != null) {
                    Logger.d(f44268a, "handle creative info selected, main sdk package=" + mainSdkPackage + ", webView=" + str + ", ci=" + creativeInfo);
                    a(creativeInfo, str, bVar.f44286a.get(str));
                } else {
                    Logger.d(f44268a, "handle creative info selecte,d WebView instance is null");
                }
            } else if (str != null) {
                Logger.d(f44268a, "handle creative info selected - webView=" + str + " webview key set is: " + bVar.f44286a.keySet());
                for (String str2 : bVar.f44286a.keySet()) {
                    Pair<ArrayList<String>, ArrayList<String>> pair2 = bVar.f44286a.get(str2);
                    Logger.d(f44268a, "handle creative info selected - current webview: " + str2 + " webview resources are: " + pair2);
                    a(creativeInfo, str2, pair2);
                }
            }
        }
    }

    private static synchronized void a(CreativeInfo creativeInfo, String str, Pair<ArrayList<String>, ArrayList<String>> pair) {
        k.b(f44268a, "attach resource urls to CI from key " + str + " resource url db " + pair);
        if (pair != null) {
            Logger.d(f44268a, "attach resource urls to CI - first webView resource: " + pair.first);
            for (String str2 : (ArrayList) pair.first) {
                Logger.d(f44268a, "attach resource urls to CI - adding stored dsp resource: " + str2 + " for address: " + str);
                creativeInfo.x(str2);
            }
            Logger.d(f44268a, "attach resource urls to CI - second webView resource: " + pair.second);
            for (String str3 : (ArrayList) pair.second) {
                Logger.d(f44268a, "attach resource urls to CI - adding stored resource url: " + str3 + " for address: " + str);
                creativeInfo.y(str3);
            }
        }
    }

    public static void a(l lVar, String str, boolean z10) {
        a aVarRemove;
        k.b(f44268a, "attach resource urls to impression webview_resource_urls from key " + str);
        if (lVar != null) {
            try {
                if (lVar.c() == null && str != null) {
                    synchronized (f44283p) {
                        Logger.d(f44268a, "attach resource urls to impression and clearing resource info. webview address=" + str);
                        aVarRemove = f44283p.remove(str);
                    }
                    if (aVarRemove != null) {
                        Logger.d(f44268a, "attach resource urls to impression webview_resource_urls for webview " + str + ", webview resources : " + (aVarRemove.f44284a != null ? Integer.valueOf(aVarRemove.f44284a.size()) : "0") + ", dsp urls : " + (aVarRemove.f44285b != null ? Integer.valueOf(aVarRemove.f44285b.size()) : "0"));
                        if (aVarRemove.f44284a.size() > lVar.f44518f.size()) {
                            synchronized (aVarRemove.f44284a) {
                                for (String str2 : aVarRemove.f44284a) {
                                    if (!lVar.f44518f.contains(str2) && (!str2.startsWith("text:") || (str2.startsWith("text:") && z10))) {
                                        synchronized (lVar.f44518f) {
                                            lVar.f44518f.add(str2);
                                        }
                                        Logger.d(f44268a, "attach resource urls to impression. webview_resource_urls webview " + str + ", url " + str2);
                                    }
                                }
                            }
                        }
                        if (aVarRemove.f44285b.size() > lVar.f44519g.size()) {
                            synchronized (aVarRemove.f44285b) {
                                for (String str3 : aVarRemove.f44285b) {
                                    if (!lVar.f44519g.contains(str3) && (!str3.startsWith("text:") || (str3.startsWith("text:") && z10))) {
                                        lVar.f44519g.add(str3);
                                        Logger.d(f44268a, "attach dsp urls to impression. webview_resource_urls webview " + str + ", url " + str3);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                Logger.e(f44268a, "Exception in attach resource urls to impression : " + th2.getMessage(), th2);
                return;
            }
        }
        Logger.d(f44268a, "attach resource urls to impression - impression is empty or webview address is null");
    }

    public static synchronized void a(CreativeInfo creativeInfo) {
        Logger.d(f44268a, "handle creative info destroyed - info data to ci " + creativeInfo);
        if (creativeInfo != null && creativeInfo.Q() != null) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(creativeInfo.Q());
            if (g.f44960f.equals(mainSdkPackage) && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                b bVar = f44282o.get(mainSdkPackage);
                if (creativeInfo.F() != null) {
                    bVar.f44286a.remove(creativeInfo.F());
                }
                bVar.f44287b = null;
                f44281n = null;
                Logger.d(f44268a, "removed ci & Info data for placement id: " + creativeInfo.F());
            } else if (g.f44970p.equals(mainSdkPackage)) {
                c();
            } else {
                Logger.d(f44268a, "removed Info data: " + f44282o.remove(mainSdkPackage));
            }
        }
    }

    private static synchronized void c() {
        Logger.d(f44268a, "remove WebView urls if needed - WebView address list size=" + f44279l.size() + " , list=" + f44279l);
        while (f44279l.size() > 10) {
            try {
                Iterator<String> it = f44279l.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    Logger.d(f44268a, "remove WebView urls if needed - " + next + " will be removed");
                    f44282o.get(g.f44970p).f44286a.remove(next);
                    f44279l.remove(next);
                    Logger.d(f44268a, "remove WebView urls if needed - " + next + " removed, size is " + f44279l.size());
                } else {
                    Logger.d(f44268a, "Unable to get WebView address for removal, exiting");
                }
            } catch (Throwable th2) {
                Logger.e(f44268a, "remove WebView urls if needed exception", th2);
            }
        }
        if (f44279l.size() == 0) {
            f44282o.remove(g.f44970p);
        }
    }

    public static boolean a(WebView webView) {
        try {
            float width = webView.getWidth();
            float height = webView.getHeight();
            if (height <= 0.0f) {
                return true;
            }
            float f10 = width / height;
            Logger.d(f44268a, "interstitial webView proportions : " + f10);
            return (((f10 > f44274g ? 1 : (f10 == f44274g ? 0 : -1)) >= 0 && (f10 > f44275h ? 1 : (f10 == f44275h ? 0 : -1)) <= 0) || ((f10 > f44277j ? 1 : (f10 == f44277j ? 0 : -1)) >= 0 && (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) <= 0)) ? false : true;
        } catch (Throwable th2) {
            Logger.d(f44268a, "Exception in interstitial webView proportions : " + th2.getMessage(), th2);
            return true;
        }
    }

    public static void a(AdNetworkDiscovery adNetworkDiscovery, String str) {
        List<String> listJ = adNetworkDiscovery.j(str);
        if (listJ != null && !listJ.isEmpty()) {
            Logger.d(f44268a, "log resources from same webview - found resources from the webview which will not be added");
            for (String str2 : listJ) {
                a aVar = f44283p.get(str2);
                if (!str2.equals(str) && aVar != null && aVar.f44284a != null && !aVar.f44284a.isEmpty()) {
                    Iterator<String> it = aVar.f44284a.iterator();
                    while (it.hasNext()) {
                        Logger.d(f44268a, "for ad id: " + str2 + "not adding resource: " + it.next());
                    }
                }
            }
        }
    }
}
