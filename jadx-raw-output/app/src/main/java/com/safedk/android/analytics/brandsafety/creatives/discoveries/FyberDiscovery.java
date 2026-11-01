package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.FyberCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FyberDiscovery extends d {
    private static final String A = "X-IA-Session";
    private static final String B = "X-IA-Campaign-ID";
    private static final String C = "X-IA-sdkImpressionUrl";
    private static final String D = "spotid";
    private static final String E = "vast";
    private static final String F = "rewarded";
    private static final String G = "interstitial";
    private static final String H = "banner";
    private static final String I = "mrec";
    private static final String J = "v";
    private static final String K = "vast-vpaid";
    private static final String L = "cached-ad.fyber.com/ad";
    private static final String M = "cached-ad.prod.fyber.com/ad";
    private static final String N = ".inner-active.mobi/impression";
    private static final String O = "s";
    private static final String P = "crid";
    private static final String Q = "cid";
    private static final String R = "network";
    private static final String S = "sessionId";
    private static final String T = "com.applovin.mediation.adapters.InneractiveMediationAdapter";
    private static final int Z = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43968b = "wv.inner-active.mobi/simpleM2M/clientRequestEnhancedXmlAd";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43969c = "mraid://open";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f43970d = "url";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43971e = "mraid://expand";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43973g = "com.fyber.inneractive.sdk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43974h = "com.fyber.inneractive.sdk.player.ui";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f43975i = "<tns:Response";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f43976j = "FyberDiscovery";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f43977k = "X-IA-Ad-Unit-Display-Type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f43978l = "X-IA-Creative-ID";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f43979w = "X-IA-Ad-Unit-ID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f43980x = "X-IA-AdNetwork";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f43981y = "X-IA-Adomain";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f43982z = "X-IA-sdkClickUrl";
    private ConcurrentHashMap<String, CreativeInfo> U;
    private ConcurrentHashMap<String, CreativeInfo> Y;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private OnGlobalImpressionDataListener f43983ad;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f43972f = {"mraid://close", "mraid://usecustomclose", "mraid://setOrientationProperties", "iaadfinishedloading://", "fymraidvideo://", "fmpendcard://"};
    private static final ConcurrentHashMap<String, String> V = new ConcurrentHashMap<>();
    private static HashMap<Integer, String> W = new HashMap<>();
    private static final String[] X = {"adTime", "countingMethod"};

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> f43965aa = new LimitedConcurrentHashMap<>(15);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, String> f43966ab = new LimitedConcurrentHashMap<>(15);

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static AtomicBoolean f43967ac = new AtomicBoolean(false);

    public FyberDiscovery() {
        super(g.f44970p, f43976j, false);
        this.U = new ConcurrentHashMap<>();
        this.Y = new ConcurrentHashMap<>();
        this.f43983ad = new FyberOnGlobalImpressionDataListener();
        try {
            this.f44086p.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, false);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
            this.f44086p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
            this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
            this.f44086p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, true);
            this.f44086p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
            this.f44086p.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
        } catch (Throwable th2) {
            Logger.e(f43976j, "exception in ctor", th2);
        }
    }

    private static void l() {
        if (W.isEmpty()) {
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_vast_endcard", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_vast_endcard");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_vast_vpaid", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_vast_vpaid");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_vast_endcard_html", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_vast_endcard_html");
            W.put(Integer.valueOf(SafeDK.getInstance().l().getResources().getIdentifier("inneractive_webview_mraid", "id", SafeDK.getInstance().l().getPackageName())), "inneractive_webview_mraid");
        }
    }

    public static HashMap<Integer, String> j() {
        return W;
    }

    public static void a(boolean z10) {
        f43967ac.set(z10);
        Logger.d(f43976j, "on global impression data listener is set to " + z10);
        l();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        k.b(f43976j, "generate info url = " + str + " , headers = " + (map != null ? map.toString() : "null") + ", buffer size = " + (str2 == null ? "0" : Integer.valueOf(str2.length())));
        if (TextUtils.isEmpty(str)) {
            Logger.d(f43976j, "generate info url is empty, exiting");
            return null;
        }
        if (str.contains(f43968b)) {
            return a(str, str2, map);
        }
        if (str.contains(L) || str.contains(M)) {
            String strC = k.c(str, "sessionId");
            if (TextUtils.isEmpty(strC)) {
                Logger.d(f43976j, "generate info session id is empty, exiting");
                return null;
            }
            if (str2 != null) {
                String strA = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                Logger.d(f43976j, "generate info content hash: " + strA);
                V.put(strA, strC);
                CreativeInfo creativeInfo = this.U.get(strC);
                if (creativeInfo != null) {
                    a(str2, creativeInfo, true);
                } else {
                    Logger.d(f43976j, "generate info no CI for ad content with session ID: " + strC);
                }
            }
        } else if (aVar != null) {
            return a(str2, aVar);
        }
        return null;
    }

    private List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map) {
        String string;
        BrandSafetyUtils.AdType adType;
        ArrayList arrayList = new ArrayList();
        String strC = null;
        try {
            m();
            Logger.d(f43976j, "generate info handle prefetch start");
            String strA = a(map, f43977k);
            if (strA != null) {
                Logger.d(f43976j, "generate info ad type is " + strA);
                if (strA.equals("interstitial")) {
                    string = BrandSafetyEvent.AdFormatType.INTER.toString();
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                } else if (strA.equals("rewarded")) {
                    string = BrandSafetyEvent.AdFormatType.REWARD.toString();
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                } else if (strA.equals("banner")) {
                    string = BrandSafetyEvent.AdFormatType.BANNER.toString();
                    adType = BrandSafetyUtils.AdType.BANNER;
                } else if (strA.contains("mrec")) {
                    string = BrandSafetyEvent.AdFormatType.MREC.toString();
                    adType = BrandSafetyUtils.AdType.MREC;
                } else {
                    Logger.d(f43976j, "generate info ad type is " + strA + ", skipping");
                    return null;
                }
                if (str != null && str.contains(f43968b) && ((strC = k.c(str, D)) != null || this.f44089t != null)) {
                    Logger.d(f43976j, "generate info spot id: " + strC + " ,sdk version: " + this.f44089t);
                }
                String strA2 = a(map, f43979w);
                String strA3 = a(map, f43978l);
                if (strA3 == null) {
                    Logger.d(f43976j, "generate info creative id is null, using ad id for it's value");
                } else {
                    strA2 = strA3;
                }
                String strA4 = a(map, B);
                String strA5 = a(map, f43982z);
                String strA6 = a(map, f43980x);
                String strA7 = a(map, f43981y);
                String strA8 = a(map, A);
                Logger.d(f43976j, "generate info session id: " + strA8);
                String strA9 = a(map, C);
                Logger.d(f43976j, "generate info sdk impression url: " + strA9);
                String strN = n(k.F(str2));
                if (str2 != null) {
                    String strA10 = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                    Logger.d(f43976j, "generate info content hash: " + strA10);
                    V.put(strA10, strA8);
                }
                FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strA8, strA2, strA4, strN, null, string, adType, strC, this.f44089t, strA6, strA7, strA5, null);
                arrayList.add(fyberCreativeInfo);
                if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    this.U.put(strA8, fyberCreativeInfo);
                    Logger.d(f43976j, "generate info added CI to list by session id: " + strA8 + ",  CI list: " + this.U);
                }
                String strS = s(strA9);
                this.Y.put(strS, fyberCreativeInfo);
                Logger.d(f43976j, "generate info added CI to list by sdk impression url: " + strS + ",  CI list: " + this.Y);
                a(str2, (CreativeInfo) fyberCreativeInfo, false);
                return arrayList;
            }
            Logger.d(f43976j, "generate info ad type is null, skipping");
            return null;
        } catch (Throwable th2) {
            Logger.d(f43976j, "Error in generate info : " + th2.getMessage(), th2);
        }
    }

    private List<CreativeInfo> a(String str, c.a aVar) {
        String string;
        BrandSafetyUtils.AdType adType;
        Logger.d(f43976j, "generate info handle bidding start");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList<String> arrayListG = k.g(new String(Base64.decode(str, 0)));
            for (String str2 : arrayListG) {
                if (str2.contains(N)) {
                    String strC = k.c(str2, "s");
                    String str3 = aVar != null ? aVar.f44059d : null;
                    String strC2 = k.c(str2, "network");
                    Logger.d(f43976j, "sessionId=" + strC + " creativeId=" + str3 + " adNetwork=" + strC2);
                    String str4 = null;
                    BrandSafetyUtils.AdType adType2 = null;
                    String str5 = null;
                    String str6 = null;
                    if (aVar != null) {
                        if (aVar.f44057b == BrandSafetyEvent.AdFormatType.INTER) {
                            string = BrandSafetyEvent.AdFormatType.INTER.toString();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f44057b == BrandSafetyEvent.AdFormatType.REWARD) {
                            string = BrandSafetyEvent.AdFormatType.REWARD.toString();
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f44057b == BrandSafetyEvent.AdFormatType.BANNER || aVar.f44057b == BrandSafetyEvent.AdFormatType.LEADER) {
                            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else if (aVar.f44057b == BrandSafetyEvent.AdFormatType.MREC) {
                            string = BrandSafetyEvent.AdFormatType.MREC.toString();
                            adType = BrandSafetyUtils.AdType.MREC;
                        } else {
                            Logger.d(f43976j, "generate info max params ad format is " + aVar.f44057b + ", skipping");
                            return null;
                        }
                        str5 = aVar.f44056a;
                        str6 = aVar.f44058c;
                        adType2 = adType;
                        str4 = string;
                    }
                    Logger.d(f43976j, "ad format type=" + str4 + " ad type=" + adType2);
                    FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strC, str3, null, null, null, str4, adType2, str6, this.f44089t, strC2, null, null, str5);
                    fyberCreativeInfo.b((List<String>) arrayListG);
                    arrayList.add(fyberCreativeInfo);
                    this.U.put(strC, fyberCreativeInfo);
                    Logger.d(f43976j, "generate info added CI to list by session id: " + strC + ", CI list: " + this.U);
                    this.Y.put(s(str2), fyberCreativeInfo);
                    Logger.d(f43976j, "generate info added CI to list by sdk impression url: " + str2 + ", CI list: " + this.Y);
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void a(String str, CreativeInfo creativeInfo, boolean z10) {
        Logger.d(f43976j, "generate info ad content start");
        if (k.v(str)) {
            Logger.d(f43976j, "generate info wrong content type (possibly scar-admob)");
            return;
        }
        if (z10) {
            String strA = k.a(com.safedk.android.utils.f.av(), str, 1);
            if (!TextUtils.isEmpty(strA)) {
                Logger.d(f43976j, "generate info bidding - found buyer id: " + strA);
                creativeInfo.k(strA);
            } else {
                Logger.d(f43976j, "generate info bidding - did NOT find buyer id, using the old version from prefetch: " + creativeInfo.P());
            }
        }
        String strA2 = k.a(com.safedk.android.utils.f.au(), str, 1);
        if (strA2 != null) {
            if (k.a(com.safedk.android.utils.f.c(), strA2, 1) != null) {
                String strA3 = com.safedk.android.analytics.brandsafety.creatives.d.a(strA2, true);
                k.b(f43976j, "generate info vast ad content: " + strA3);
                a(creativeInfo, strA3);
                creativeInfo.c("vast");
                return;
            }
            k.b(f43976j, "generate info processing mraid ad: " + strA2);
            b(k.a(com.safedk.android.utils.f.au(), str, 1), creativeInfo);
            creativeInfo.c("mraid");
        }
    }

    private void m() {
        if (!f43967ac.get()) {
            if (InneractiveAdManager.wasInitialized()) {
                InneractiveAdManager.setImpressionDataListener(this.f43983ad);
                Logger.d(f43976j, "on global impression data listener has been set by SafeDK");
                f43967ac.set(true);
                return;
            }
            Logger.d(f43976j, "initialize on global impression listener - Fyber Sdk is not initialized yet");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo creativeInfoRemove;
        String impressionId;
        try {
            Logger.d(f43976j, "match info ad instance: " + obj);
            if (obj instanceof ImpressionData) {
                impressionId = ((ImpressionData) obj).getImpressionId();
            } else {
                impressionId = obj instanceof String ? (String) obj : null;
            }
            if (impressionId == null) {
                return null;
            }
            creativeInfoRemove = this.U.remove(impressionId);
            try {
                if (creativeInfoRemove != null) {
                    k.b(f43976j, "match info ad instance - CI MATCH FOUND! by key: " + impressionId + ", CI : " + creativeInfoRemove);
                } else {
                    Logger.d(f43976j, "match info ad instance - cannot find key in: " + this.U.keySet());
                }
                return creativeInfoRemove;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            creativeInfoRemove = null;
        }
        Logger.d(f43976j, "Exception in match info ad instance: ", th);
        return creativeInfoRemove;
    }

    private CreativeInfo b(String str, CreativeInfo creativeInfo) {
        Logger.d(f43976j, "update Html CI started: " + creativeInfo);
        ArrayList arrayList = new ArrayList();
        List<String> listB = k.b(com.safedk.android.utils.f.ax(), str, 1);
        if (listB != null && listB.size() > 0) {
            Iterator<String> it = listB.iterator();
            while (it.hasNext()) {
                String strK = k.k(it.next());
                Logger.d(f43976j, "update Html CI - resource url: " + strK);
                arrayList.add(strK);
            }
        }
        Iterator<String> it2 = k.g(str).iterator();
        while (it2.hasNext()) {
            String strK2 = k.k(it2.next());
            Logger.d(f43976j, "update Html CI - extract urls from source new url: " + strK2);
            arrayList.add(strK2);
        }
        creativeInfo.b((List<String>) arrayList);
        Logger.d(f43976j, "update Html CI updated: " + creativeInfo);
        return creativeInfo;
    }

    public CreativeInfo a(CreativeInfo creativeInfo, String str) {
        r("parse vast prefetch start");
        a(creativeInfo, (String) null, str, false);
        creativeInfo.b(true);
        if (creativeInfo.g()) {
            ((FyberCreativeInfo) creativeInfo).c(K);
        }
        Logger.d(f43976j, "parse vast prefetch - CI updated : " + creativeInfo);
        r("parse vast prefetch return");
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        Logger.d(f43976j, "get ad ID from resource: source is: " + str2 + ", and value is: " + str + ", webViewRef is: " + (weakReference == null ? "null" : weakReference.get()));
        if (str2 == null) {
            return null;
        }
        String strS = s(str2);
        Logger.d(f43976j, "get ad ID from resource: cleanSource: " + strS + ", creativeInfosBySdkImpressionUrl keys are: " + this.Y.keySet());
        if (k.a((Reference<?>) weakReference)) {
            f43965aa.put(strS, weakReference);
            Logger.d(f43976j, "get ad ID from resource: webview is alive, adding clean source: " + strS);
        } else {
            Logger.d(f43976j, "get ad ID from resource: webview is not alive, not adding to map");
        }
        CreativeInfo creativeInfo = this.Y.get(strS);
        if (creativeInfo != null) {
            String strL = creativeInfo.L();
            Logger.d(f43976j, "get ad ID from resource: found ci in map with ad id: " + strL);
            f43966ab.put(strL, strS);
            Logger.d(f43976j, "get ad ID from resource: added ad id: " + strL + " to adIdToSource map");
            return strL;
        }
        Logger.d(f43976j, "get ad ID from resource: could not find ci in map!");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        if (f43966ab.containsKey(str)) {
            return a(f43966ab.get(str), g.f44970p, f43965aa, this.Y, d.f44082o);
        }
        Logger.d(f43976j, "try reverse matching with ad id - ad id " + str + " is not in the adIdToSource keys: " + f43966ab.keySet());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
        String strRemove = f43966ab.remove(str);
        Logger.d(f43976j, "clean resources started with ad id: " + str + ", and source is: " + strRemove);
        if (strRemove != null) {
            f43965aa.remove(strRemove);
        }
    }

    public String l(String str) {
        return k.a(com.safedk.android.utils.f.aw(), str, 1);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    private String a(Map<String, List<String>> map, String str) {
        List<String> list;
        if (map != null && map.keySet().toString().toLowerCase().contains(str.toLowerCase())) {
            if (map.get(str) != null) {
                list = map.get(str);
            } else {
                list = map.get(str.toLowerCase()) != null ? map.get(str.toLowerCase()) : null;
            }
            if (list != null && list.size() > 0) {
                Logger.d(f43976j, "get value from headers key '" + str + "', value '" + list.get(0) + "'");
                return list.get(0);
            }
            Logger.d(f43976j, "header '" + str + "' not found");
        } else {
            Logger.d(f43976j, "header '" + str + "' not found");
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return ((this.f44088r.contains(str) || this.f44088r.contains(q(str)) || this.f44088r.contains(str.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, Z7.f27998r))) && !p(str)) || this.Y.containsKey(s(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z10 = str.contains(f43968b) || str.contains(L) || str.contains(M) || this.f44087q.containsKey(new VastAdTagUri(str)) || this.f44087q.containsKey(new VastAdTagUri(q(str))) || this.f44087q.containsKey(new VastAdTagUri(str.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, Z7.f27998r)));
        if (z10) {
            Logger.d(f43976j, "should follow input stream started, url=" + str + ", result=" + z10);
        }
        m(str);
        return z10;
    }

    private void r(String str) {
        try {
            Logger.d(f43976j, "print CI collection (" + str + ")==========   by session ID (" + this.U.size() + " items) ==============");
            for (String str2 : this.U.keySet()) {
                Logger.d(f43976j, "print CI collection key=" + str2);
                b(this.U.get(str2), str);
            }
        } catch (Throwable th2) {
            Logger.e(f43976j, "Exception in print CI collection", th2);
            if (this.U == null) {
                Logger.d(f43976j, "print CI collection list was null, initializing");
                this.U = new ConcurrentHashMap<>();
            }
        }
    }

    private void b(CreativeInfo creativeInfo, String str) {
        if (creativeInfo == null) {
            Logger.d(f43976j, "print CI collection - CI is null");
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append("print CI collection ");
        if (str == null) {
            str = "";
        }
        k.b(f43976j, sbAppend.append(str).append("\n, CI : ").append(creativeInfo).toString());
    }

    public class FyberOnGlobalImpressionDataListener implements OnGlobalImpressionDataListener {
        public FyberOnGlobalImpressionDataListener() {
        }

        @Override // com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener
        public void onImpression(String s10, String s11, ImpressionData impressionData) {
            Logger.d(FyberDiscovery.f43976j, "on impression started, string1: " + s10 + ", string2: " + s11 + ", impression data: " + impressionData.toString());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return T;
    }

    private String s(String str) {
        for (String str2 : X) {
            str = k.e(str, str2);
        }
        return q(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        k(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
        k(view);
    }

    private void k(View view) {
        Context contextL = SafeDK.getInstance().l();
        int identifier = contextL.getResources().getIdentifier("ia_tv_skip", "id", contextL.getPackageName());
        int identifier2 = contextL.getResources().getIdentifier("ia_iv_close_button", "id", contextL.getPackageName());
        Logger.d(f43976j, "handle on view click - ia_tv_skip resId=" + identifier + ", ia_iv_close_button resId=" + identifier2);
        if (view.getId() == identifier || view.getId() == identifier2) {
            Logger.d(f43976j, "handle on view click - view type is =" + view.getClass().getName());
            if (view instanceof TextView) {
                Logger.d(f43976j, "handle on view click - clicked the 'skip' TextView, calling CI manager on video completed");
                CreativeInfoManager.onVideoCompleted(g.f44970p, null);
                return;
            } else {
                Logger.d(f43976j, "handle on view click - clicked view is not of type 'TextView'. exiting function");
                return;
            }
        }
        Logger.d(f43976j, "handle on view click - clicked view is not the 'skip' or 'close' TextView.");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str != null) {
            if (str.contains(f43969c)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(f43971e)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : f43972f) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!(view instanceof ViewGroup) || !view.getClass().getName().startsWith(f43974h)) {
            return false;
        }
        Logger.d(f43976j, "is ad view: " + view.getClass().getName() + " is a Fyber ViewGroup ");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String k() {
        return f43973g;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String c(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith(f43975i)) {
                String strA = BrandSafetyUtils.a(str.replace("\n", "").getBytes());
                String strRemove = V.remove(strA);
                Logger.d(f43976j, "extract ad info found, hash: " + strA + ", sessionId: " + strRemove);
                return strRemove;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        if (str == null) {
            return str;
        }
        if (str.contains(f43969c) || str.contains(f43971e)) {
            return k.c(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.Y, "FyberDiscovery:creativeInfosBySdkImpressionUrl", false);
        com.safedk.android.utils.e.a(this.U, "FyberDiscovery:creativeInfosBySessionId", false);
    }
}
