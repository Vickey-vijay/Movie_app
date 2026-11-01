package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.PrefetchVastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.IronSourceCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {
    public static final String A = "data=";
    public static final String B = "data";
    public static final String C = "eventname";
    public static final String D = "requestid";
    public static final String E = "bannerid";
    public static final String F = "auctionid";
    public static final String G = "producttype";
    public static final String H = "loadAd";
    public static final String I = "adLoaded";
    public static final String J = "loadAdSuccess";
    public static final String K = "mraid.supports";
    public static final String L = "saveAdInCacheSuccess";
    public static final String M = "showAd";
    public static final String N = "showAdSuccess";
    public static final String O = "adVisible";
    public static final String P = "adClosed";
    public static final String Q = "bannerID";
    public static final int R = 200;
    private static final String S = "IronSourceDiscovery";
    private static final String T = "crid";
    private static final String U = "type";
    private static final String V = "appData";
    private static final String W = "appId";
    private static final String X = "bid";
    private static final String Y = "id";
    private static final String Z = "auction";
    private static final String aA = "external_url";
    private static final String aB = "IRONSOURCE_BIDDING";
    private static final String aC = "IRONSOURCE_NETWORK";
    private static final String aD = "adMarkup";
    private static final String aE = "adViewId";
    private static final int aF = 20;
    private static final int aH = 10;
    private static final int aL = 20;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44121aa = "seatbid";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f44122ab = "cid";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f44123ac = "ext";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f44124ad = "dspName";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f44125ae = "requestID";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f44126af = "callbacks";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f44127ag = "layoutData";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f44128ah = "impressions";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f44129ai = "url";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f44130aj = "clickTags";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f44131ak = "clickURL";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f44132al = "videoData";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f44133am = "videoSource";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f44134an = "videoformat_mp4";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f44135ao = "html";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f44136ap = "htmlURL";
    private static final String aq = "vast";
    private static final String ar = "mraid";
    private static final String as = "customEndCard";
    private static final String at = "rv-gateway";
    private static final String au = "gw-rv";
    private static final String av = "_SupersonicAds";
    private static final String aw = "_IronSource_";
    private static final String az = "com.applovin.mediation.adapters.IronSourceMediationAdapter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44137b = "Interstitial";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44138c = "Banner";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44139d = "instanceID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44140e = "iid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44141f = "sdk/v";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44142g = "gateway.supersonicads.com/gateway/sdk/request";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44143h = "iads.unity3d.com/gateway/sdk/request";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44144i = "gw-ext.mediation.unity3d.com/auction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44145j = "init.supersonicads.com";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44146k = "logs.supersonic.com";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44147l = "logs.ironsrc.mobi";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44148w = "unity3d.com/logs";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44149x = "unity3d.com/d";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44150y = "iads.unity3d.com";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44151z = "isprog.com/d";
    private a aV;
    private a aW;
    private String aX;
    private boolean aY;
    private static final List<String> ax = Collections.synchronizedList(new ArrayList());
    private static final Set<String> ay = new HashSet();
    private static final LimitedConcurrentHashMap<String, String> aG = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, Long> aI = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, Long> aJ = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, List<String>> aK = new LimitedConcurrentHashMap<>(10);
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aM = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> aN = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, String> aO = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, CreativeInfo> aP = new LimitedConcurrentHashMap<>(20);
    private static final LimitedConcurrentHashMap<String, CreativeInfo> aQ = new LimitedConcurrentHashMap<>(20);
    private static final Map<String, c.a> aR = new LimitedConcurrentHashMap(20);
    private static final Map<String, BrandSafetyUtils.AdType> aS = new LimitedConcurrentHashMap(20);
    private static final LimitedConcurrentHashMap<String, BrandSafetyUtils.AdType> aT = new LimitedConcurrentHashMap<>(20);
    private static final Map<Integer, Long> aU = new LimitedConcurrentHashMap(20);
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> aZ = new LimitedConcurrentHashMap<>(20);

    private class a extends Pair<String, String> {
        a(String str, String str2) {
            super(str, str2);
        }

        String a() {
            return (String) ((Pair) this).first;
        }

        String b() {
            return (String) ((Pair) this).second;
        }
    }

    public f() {
        super(g.f44960f, S, false);
        this.aY = true;
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, aC);
        this.f44086p.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, true);
        this.f44086p.b(AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, true);
    }

    private String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            return str + "/" + str3;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        return sb2.append(str2).append("/").append(str3).toString();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return str.contains(f44142g) || str.contains(f44143h);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        return ax.remove(str) || str.contains(f44146k) || str.contains(f44147l) || str.contains(av) || str.contains(aw) || str.contains(f44149x) || str.contains(f44150y) || str.contains(f44151z) || str.contains("&adViewId=") || str.contains(f44148w);
    }

    public static boolean a(int i10) {
        Long l10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aU.get(Integer.valueOf(i10)) != null && (l10 = aU.get(Integer.valueOf(i10))) != null && jCurrentTimeMillis - l10.longValue() < 200) {
            Logger.d(S, "check if prefetch should be parsed - same prefetch that was seen earlier");
            return false;
        }
        aU.put(Integer.valueOf(i10), Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public static String l(String str) {
        if (!k.t(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("adMarkup")) {
                return null;
            }
            return URLDecoder.decode(jSONObject.getString("adMarkup"), "UTF-8");
        } catch (Throwable th2) {
            Logger.d(S, "Exception decoding prefetch: \n" + th2.getMessage() + " encoded prefetch is: \n" + str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0465  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        String string;
        String string2;
        String str3;
        String string3;
        String str4;
        String strO;
        String strN;
        String strA;
        JSONObject jSONObjectOptJSONObject;
        String str5;
        if (aVar != null) {
            aR.put(aVar.f44056a, aVar);
            Logger.d(S, "generate info received bidding prefetch with max params: " + aVar);
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            Logger.d(S, "generate info buffer value is empty, skipping. url = " + str + ", headers = " + map);
            return null;
        }
        k.b(S, "generate info started, url = " + str + " , content size=" + str2.length());
        ArrayList arrayList = new ArrayList();
        if (!str.contains(f44144i)) {
            int iIndexOf = str2.indexOf(123);
            if (iIndexOf > -1) {
                str2 = str2.substring(iIndexOf, str2.length() - 1);
            }
            k.b(S, "after removal, json response: " + str2);
            if (this.aY) {
                Logger.d(S, "generate info - found IS network fullscreen - setting is bidding to false");
                this.aY = false;
            }
        }
        if (!k.v(str2)) {
            Logger.d(S, "Not a valid JSON string, skipping");
            return null;
        }
        JSONObject jSONObject = new JSONObject(str2);
        if (!jSONObject.has(f44121aa)) {
            Logger.d(S, "generate info - no seat bid, exiting!");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(f44121aa);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(f44123ac);
        if (!jSONObject3.has(f44125ae)) {
            string = null;
        } else {
            string = jSONObject3.getString(f44125ae);
        }
        if (!jSONObject3.has("auction")) {
            string2 = null;
        } else {
            JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("auction");
            if (!jSONObjectOptJSONObject2.has("id")) {
                string2 = null;
            } else {
                string2 = jSONObjectOptJSONObject2.getString("id");
            }
        }
        if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
            Logger.d(S, "generate info - no request id or auction id");
            return null;
        }
        String string4 = null;
        if (jSONObject3.has(f44124ad)) {
            string4 = jSONObject3.getString(f44124ad);
        }
        String string5 = null;
        String str6 = null;
        if (string2 != null && aR.containsKey(string2)) {
            c.a aVar2 = aR.get(string2);
            if (aVar2 != null) {
                string5 = aVar2.f44057b.toString();
                Logger.d(S, "generate info, ad format: " + string5);
                String str7 = aVar2.f44058c;
                str5 = aVar2.f44056a;
                str6 = str7;
            } else {
                Logger.d(S, "generate info could not get the ad format and placement id!");
                str5 = null;
            }
            str3 = str5;
            string3 = string5;
        } else {
            str3 = null;
            string3 = (str.contains(at) || str.contains(au)) ? BrandSafetyEvent.AdFormatType.REWARD.toString() : BrandSafetyEvent.AdFormatType.INTER.toString();
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("bid");
        int i10 = 0;
        while (true) {
            int i11 = i10;
            String str8 = str6;
            if (i11 >= jSONArray.length()) {
                return arrayList;
            }
            JSONObject jSONObject4 = jSONArray.getJSONObject(i11);
            try {
                ArrayList arrayList2 = new ArrayList();
                String string6 = jSONObject4.getString("cid");
                String string7 = jSONObject4.getString(T);
                JSONObject jSONObject5 = jSONObject4.getJSONObject(f44123ac);
                JSONObject jSONObject6 = jSONObject5.getJSONObject(f44132al).getJSONObject(f44133am);
                String string8 = jSONObject5.getString("type");
                String strOptString = jSONObject6.optString("vast");
                String strOptString2 = jSONObject6.optString("mraid");
                String strOptString3 = jSONObject6.optString(f44134an);
                String strC = c(jSONObject5);
                String strA2 = (TextUtils.isEmpty(str8) && jSONObject5.has(f44126af)) ? a(jSONObject5.getJSONObject(f44126af)) : str8;
                String strOptString4 = null;
                try {
                    if (string8.equals(as) && (jSONObjectOptJSONObject = jSONObject5.optJSONObject(f44127ag)) != null) {
                        strOptString4 = jSONObjectOptJSONObject.optString("html");
                    }
                    String strA3 = a(string, string2, string7);
                    Logger.d(S, "generate info - ad id is: " + strA3 + " request id is: " + string + " auction id is: " + string2 + " and crid is: " + string7);
                    String strOptString5 = jSONObject6.optString(f44136ap);
                    if (TextUtils.isEmpty(strOptString5)) {
                        String strOptString6 = jSONObject6.optString("html");
                        if (!TextUtils.isEmpty(strOptString6)) {
                            Logger.d(S, "htmlSource: " + strOptString6);
                            Matcher matcher = com.safedk.android.utils.f.aD().matcher(strOptString6);
                            if (matcher.find()) {
                                strOptString5 = matcher.group(1);
                                Logger.d(S, "content playable, playable url: " + strOptString5);
                            }
                        }
                        str4 = strOptString5;
                    } else {
                        Logger.d(S, "content playable html, playable url: " + strOptString5);
                        str4 = strOptString5;
                    }
                    IronSourceCreativeInfo ironSourceCreativeInfo = new IronSourceCreativeInfo(strA3, string6, strC, strOptString3, string8, str4, string3, strA2, strOptString4, this.f44089t, string4);
                    ironSourceCreativeInfo.f(str3);
                    arrayList.add(ironSourceCreativeInfo);
                    if (string3 != null && string3.equals("BANNER")) {
                        ironSourceCreativeInfo.a(BrandSafetyUtils.AdType.BANNER);
                        ironSourceCreativeInfo.p(string3);
                    }
                    ay.add(strA3);
                    aP.put(strA3, ironSourceCreativeInfo);
                    Logger.d(S, "generate info - added adId: " + strA3 + " to adIds list");
                    if (strOptString3 != null) {
                        arrayList2.add(strOptString3);
                    }
                    if (str4 != null) {
                        arrayList2.add(str4);
                    }
                    if (!TextUtils.isEmpty(strOptString2)) {
                        Logger.d(S, "content mraid html");
                        if (com.safedk.android.analytics.brandsafety.creatives.f.a(strOptString2)) {
                            a((CreativeInfo) ironSourceCreativeInfo, str, strOptString2, true);
                            if (ironSourceCreativeInfo.g() && (strA = ironSourceCreativeInfo.a()) != null) {
                                arrayList2.add(strA);
                            }
                            if (TextUtils.isEmpty(ironSourceCreativeInfo.h())) {
                                ironSourceCreativeInfo.c("vast");
                            } else {
                                ironSourceCreativeInfo.d("/vast");
                            }
                        } else {
                            if (ironSourceCreativeInfo.M() == null && (strN = n(strOptString2)) != null) {
                                ironSourceCreativeInfo.t(strN);
                            }
                            if (ironSourceCreativeInfo.o() == null && (strO = o(strOptString2)) != null) {
                                ironSourceCreativeInfo.q(strO);
                            }
                        }
                    } else if (!TextUtils.isEmpty(strOptString)) {
                        this.f44087q.put(new PrefetchVastAdTagUri(strOptString), ironSourceCreativeInfo);
                    }
                    ironSourceCreativeInfo.b((List<String>) k.g(jSONObject4.toString().replace("\\/", "/")));
                    ironSourceCreativeInfo.c(arrayList2);
                    Logger.d(S, "generate info CI: " + ironSourceCreativeInfo);
                    str6 = strA2;
                } catch (Throwable th2) {
                    th = th2;
                    str6 = strA2;
                    Logger.d(S, "generate info error parsing " + th.getMessage(), th);
                }
            } catch (Throwable th3) {
                th = th3;
                str6 = str8;
            }
            i10 = i11 + 1;
        }
    }

    private String a(JSONObject jSONObject) {
        String strG = null;
        if (!jSONObject.has("impressions")) {
            Logger.d(S, "extract placement Id - no impressions, can't parse");
        } else {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("impressions");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    if (jSONObject2.has("url")) {
                        String string = jSONObject2.getString("url");
                        strG = g(f44139d, string);
                        if (strG == null) {
                            strG = g(f44140e, string);
                        }
                        Logger.d(S, "instance ID: " + strG);
                        break;
                    }
                }
            } catch (JSONException e10) {
                Logger.d(S, "exception occurred while extracting placement id:\n" + e10);
            }
        }
        return strG;
    }

    private String g(String str, String str2) {
        int iIndexOf = str2.indexOf(str + G5.T);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str2.indexOf(C3426d4.j.f28584c, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str2.length();
        }
        return str2.substring(iIndexOf + str.length() + 1, iIndexOf2);
    }

    private String b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(V);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(W);
        }
        return null;
    }

    private String c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f44130aj);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return jSONObjectOptJSONObject.getString(f44131ak);
    }

    private a b(String str, WeakReference<WebView> weakReference) {
        if (str.contains(f44146k) || str.contains(f44147l) || str.contains(f44148w)) {
            String[] strArrSplit = str.split(A);
            if (strArrSplit.length == 2) {
                String str2 = new String(Base64.decode(strArrSplit[1], 0));
                Logger.v(S, "message is " + str2);
                try {
                    JSONObject jSONObject = new JSONObject(str2).getJSONObject("data");
                    String string = jSONObject.getString(C);
                    String strA = k.a((Reference<?>) weakReference) ? BrandSafetyUtils.a(weakReference.get()) : null;
                    String strA2 = a(jSONObject.optString(D), jSONObject.optString(F), jSONObject.optString(E));
                    Logger.d(S, "event: " + string + " and webview is: " + strA + " ad id: " + strA2);
                    String strOptString = jSONObject.optString("producttype");
                    if (aP.get(strA2) != null) {
                        Logger.d(S, "get ad id from resource - ad format: " + strOptString);
                        a(aP.get(strA2), strOptString);
                    }
                    return new a(string, strA2);
                } catch (JSONException e10) {
                    Logger.d(S, "error in json parse: " + e10);
                }
            }
        }
        return null;
    }

    private void b(String str, String str2, WeakReference<WebView> weakReference) {
        if (k.a((Reference<?>) weakReference)) {
            String strA = BrandSafetyUtils.a(weakReference.get());
            aG.put(str2, strA);
            Logger.d(S, str + "adding ad id: " + str2 + " with webview address: " + strA);
            return;
        }
        Logger.d(S, str + "webView's ref not alive, not adding ad id: " + str2 + " to adIdToWebviewAddressMap");
    }

    private void a(LimitedConcurrentHashMap<String, String> limitedConcurrentHashMap, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : limitedConcurrentHashMap.keySet()) {
            if (str.equals(limitedConcurrentHashMap.get(str2))) {
                sb2.append(str2).append(", ");
                limitedConcurrentHashMap.remove(str2);
            }
        }
        if (sb2.length() > 0) {
            k.b(S, "a cwv occurred with webview address: " + str + " and adIds: [" + ((Object) sb2) + C3426d4.j.f28588e);
        } else {
            Logger.d(S, "possibly cwv but with no ad ids");
        }
    }

    private void a(a aVar, WeakReference<WebView> weakReference) {
        if (Arrays.asList(J, I).contains(aVar.a())) {
            b("extract adId from IronSource log message - ", aVar.b(), weakReference);
        }
        if (N.equals(aVar.a()) || M.equals(aVar.a())) {
            aG.remove(aVar.b());
            Logger.d(S, "extract adId from IronSource log message - received show ad message for ad id - " + aVar.b());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : aI.keySet()) {
            if (aI.get(str) != null) {
                long jLongValue = aI.get(str).longValue();
                Logger.d(S, "extract adId from IronSource log message - handling webview address: " + str + " and unseen period: " + (jCurrentTimeMillis - jLongValue));
                if (jCurrentTimeMillis - jLongValue > TimeUnit.SECONDS.toMillis(60L) || aJ.containsKey(str)) {
                    aJ.put(str, 0L);
                    String str2 = "cwv_issue=" + str;
                    a(aG, str);
                    if (CreativeInfoManager.j(str)) {
                        Logger.d(S, "extract adId from IronSource log message - inter info exists for webview " + str);
                    } else {
                        Logger.d(S, "extract adId from IronSource log message - inter info does NOT exist for webview " + str);
                    }
                }
            }
        }
        if (k.a((Reference<?>) weakReference)) {
            String strA = BrandSafetyUtils.a(weakReference.get());
            aI.put(strA, Long.valueOf(System.currentTimeMillis()));
            Logger.d(S, "extract adId from IronSource log message - adding webview: " + strA + " to map");
        } else {
            Logger.d(S, "extract adId from IronSource log message - webview is not alive, not adding");
        }
        for (String str3 : aK.keySet()) {
            if (str3 != null && CreativeInfoManager.j(str3)) {
                Logger.d(S, "extract adId from IronSource log message - iterating addressToMessages: inter info exists for webview " + str3);
                Iterator<String> it = aK.get(str3).iterator();
                while (it.hasNext()) {
                    CreativeInfoManager.a(str3, it.next(), BrandSafetyUtils.AdType.INTERSTITIAL, com.safedk.android.analytics.brandsafety.b.f43755y);
                }
                aK.remove(str3);
            } else {
                Logger.d(S, "extract adId from IronSource log message - iterating addressToMessages: inter info does NOT exist for webview " + str3);
            }
        }
    }

    private static String r(String str) {
        if (str != null && str.contains(".")) {
            try {
                String str2 = str.split("\\.")[2];
                return str2.substring(0, str2.length() - 2);
            } catch (Throwable th2) {
                Logger.d(S, "exception when trying to extract ad id from adViewId: " + th2.getMessage());
                return null;
            }
        }
        return str;
    }

    private String s(String str) {
        Map<String, String> mapB = k.b(str, false);
        if (mapB == null) {
            return null;
        }
        String strR = mapB.get("sid");
        if (strR == null && mapB.containsKey("adViewId")) {
            strR = r(mapB.get("adViewId"));
        }
        if (strR == null && mapB.containsKey(Q)) {
            strR = mapB.get(Q);
            Logger.d(S, "extract Ad Id From IronSource Resource - found value in banner id! value: " + strR);
        }
        String str2 = strR;
        if (str2 != null) {
            Logger.d(S, "extract Ad Id From IronSource Resource - value: " + str2);
            Iterator<String> it = ay.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.endsWith("/" + str2) || next.startsWith(str2 + "/")) {
                    return next;
                }
            }
            Logger.d(S, "extract Ad Id From IronSource Resource - did not find ad id, storing value: /" + str2 + " ad ids are: " + aU);
        }
        Logger.d(S, "extract Ad Id From IronSource Resource - did not find ad id");
        return null;
    }

    private String a(String str, List<String> list, WeakReference<WebView> weakReference) {
        a aVarB = b(str, weakReference);
        if (aVarB != null && aVarB.b() != null) {
            try {
                a(aVarB, weakReference);
            } catch (Throwable th2) {
                Logger.e(S, "error occurred while calling handle webview change: " + th2.getMessage());
            }
            if (list.contains(aVarB.a())) {
                return aVarB.b();
            }
        }
        Logger.d(S, "extract ad id from IS log message - did not find pair " + aVarB);
        return null;
    }

    private boolean i(String str, String str2) {
        if (str.contains("data=eyJ")) {
            return false;
        }
        if (aS.containsKey(str2)) {
            return aS.get(str2) == BrandSafetyUtils.AdType.BANNER;
        }
        Map<String, String> mapB = k.b(str, false);
        Logger.d(S, "isBannerMessage url is: " + str + " and map is: " + mapB);
        if (mapB == null) {
            return false;
        }
        Logger.d(S, "is banner message: values are: " + mapB.values());
        for (String str3 : mapB.values()) {
            if (str3 != null && str3.equalsIgnoreCase("Banner")) {
                Logger.d(S, "isBannerMessage added webview address: " + str2 + " to map");
                aS.put(str2, BrandSafetyUtils.AdType.BANNER);
                return true;
            }
        }
        return false;
    }

    private void a(CreativeInfo creativeInfo, String str) {
        Logger.d(S, "update CI Ad Format - ad format: " + str);
        if (creativeInfo == null) {
            Logger.d(S, "update CI Ad Format - ci is null, cannot update ad format");
            return;
        }
        if (str.equals("Banner")) {
            creativeInfo.p("BANNER");
            creativeInfo.a(BrandSafetyUtils.AdType.BANNER);
            Logger.d(S, "update CI Ad Format - setting to banner format, now ci ad format is: " + creativeInfo.I() + " and typs: " + creativeInfo.K());
        } else {
            creativeInfo.p(str.equals("Interstitial") ? BrandSafetyUtils.f43547j : BrandSafetyUtils.f43548k);
            creativeInfo.a(BrandSafetyUtils.AdType.INTERSTITIAL);
            Logger.d(S, "update CI Ad Format - setting to fullscreen format, now ci ad format is: " + creativeInfo.I() + " and typs: " + creativeInfo.K());
        }
    }

    private void c(String str, WeakReference<WebView> weakReference) {
        if (k.a((Reference<?>) weakReference) && !TextUtils.isEmpty(str) && str.contains("?")) {
            String strI = k.I(str);
            Map<String, String> mapB = k.b(str, false);
            Logger.d(S, "extract auction id started with domain: " + strI + " map is: " + mapB);
            if (mapB != null) {
                String str2 = mapB.containsKey("sid") ? mapB.get("sid") : mapB.get("s");
                if (str2 != null) {
                    Logger.d(S, "extract auction id - found auction id: " + str2);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String strA;
        String strA2 = k.a((Reference<?>) weakReference) ? BrandSafetyUtils.a(weakReference.get()) : null;
        boolean zI = i(str, strA2);
        BrandSafetyUtils.AdType adTypeA = weakReference.get().getWidth() > 0 ? com.safedk.android.analytics.brandsafety.b.a(g.f44960f, weakReference.get()) : null;
        if (adTypeA != null) {
            aS.put(strA2, adTypeA);
        }
        if (k.a((Reference<?>) weakReference)) {
            Logger.d(S, "get ad id from resource - is banner: " + zI + " width: " + weakReference.get().getWidth() + " height: " + weakReference.get().getHeight() + " ad type: " + adTypeA + " webview address: " + strA2);
            BannerFinder bannerFinderZ = SafeDK.getInstance() != null ? SafeDK.getInstance().z() : null;
            if (adTypeA == BrandSafetyUtils.AdType.BANNER) {
                c(str, weakReference);
            }
            if (adTypeA == BrandSafetyUtils.AdType.BANNER && (zI || (bannerFinderZ != null && bannerFinderZ.i(strA2)))) {
                strA = s(str);
            } else {
                strA = a(str, Arrays.asList(M, N), weakReference);
                if (strA != null) {
                    Logger.d(S, "get ad id from resource - found ad id by interstitial log message - ad id: " + strA);
                } else if (adTypeA == BrandSafetyUtils.AdType.INTERSTITIAL && (strA = s(str)) != null) {
                    Logger.d(S, "get ad id from resource - found ad id by interstitial URL resource - ad id: " + strA);
                }
            }
        } else {
            strA = null;
        }
        if (strA != null) {
            if (ay.contains(strA) && aP.get(strA) != null && adTypeA == BrandSafetyUtils.AdType.BANNER) {
                CreativeInfo creativeInfo = aP.get(strA);
                if (creativeInfo != null && creativeInfo.h() != null && creativeInfo.h().contains("mraid")) {
                    creativeInfo.t(null);
                }
                a(aP.get(strA), "Banner");
            }
            if (adTypeA != null) {
                aT.put(strA, adTypeA);
            }
            if (str2 != null) {
                aN.put(strA, str2);
            }
            aO.put(strA2, strA);
            Logger.d(S, "get ad id from resource - added ad id: " + strA + " to adIdToSource map");
        } else {
            Logger.d(S, "get ad id from resource - ad id is null");
        }
        if (str2 != null && k.a((Reference<?>) weakReference)) {
            aM.put(str2, weakReference);
            Logger.d(S, "get ad id from resource - webview is alive, adding source: " + str2);
        } else {
            Logger.d(S, "get ad id from resource - webview is not alive or source is null, not adding to map, source=" + str2);
        }
        if (strA != null && ay.remove(strA)) {
            Logger.d(S, "get ad id from resource - found ad id - " + strA);
            return strA;
        }
        Logger.d(S, "get ad id from resource - match not found for " + strA);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, WeakReference<WebView> weakReference) {
        Logger.d(S, "get ad id FOR resource started with resource: " + str);
        String strA = BrandSafetyUtils.a(weakReference.get());
        boolean zI = i(str, strA);
        BrandSafetyUtils.AdType adTypeA = weakReference.get().getWidth() > 0 ? com.safedk.android.analytics.brandsafety.b.a(g.f44960f, weakReference.get()) : null;
        Logger.d(S, "get ad id FOR resource - is banner: " + zI + " width: " + weakReference.get().getWidth() + " height: " + weakReference.get().getHeight() + " ad type: " + adTypeA + " webview address: " + strA);
        if (adTypeA == BrandSafetyUtils.AdType.BANNER) {
            aS.put(strA, BrandSafetyUtils.AdType.BANNER);
            if (aO.containsKey(strA)) {
                Logger.d(S, "get ad id for resource - returning ad id that is stored for webview: " + aO.get(strA));
                return aO.get(strA);
            }
            String strS = s(str);
            if (strS == null) {
                return null;
            }
            aO.put(strA, strS);
            return strS;
        }
        a aVarB = b(str, weakReference);
        Logger.d(S, "get ad id FOR resource pair is: " + aVarB + " and latest log message is: " + this.aV + " and latest webview address is: " + this.aX + " and resource: " + str);
        if (aVarB == null) {
            String strB = this.aV != null ? this.aV.b() : null;
            String strB2 = this.aW != null ? this.aW.b() : null;
            if (strB != null && strB2 != null && !strB.equals(strB2)) {
                Logger.d(S, "get ad id FOR resource mismatch between older message and newer messages! new latest log ad id is: " + strB + " and older latest log ad id is: " + strB2 + " resource is: " + str);
            }
            if (adTypeA == BrandSafetyUtils.AdType.INTERSTITIAL || this.aX == null || this.aX.equals(strA)) {
                if (this.aV != null) {
                    return this.aV.b();
                }
                return null;
            }
            Logger.d(S, "get ad id for resource - not returning ad id since webview address is different then stored: " + this.aX + " vs given: " + strA);
            return null;
        }
        if (aVarB.a() == null) {
            return null;
        }
        String strA2 = aVarB.a();
        List listAsList = Arrays.asList(I, H, J, M, O, K, L);
        List listAsList2 = Arrays.asList(P);
        List listAsList3 = Arrays.asList(I, M, O, K, L);
        List listAsList4 = Arrays.asList(H, J, P);
        if ((this.aY && listAsList.contains(strA2)) || listAsList3.contains(strA2)) {
            this.aV = aVarB;
            this.aX = strA;
            Logger.d(S, "get ad id for resource - setting latest log message to: " + aVarB + " and latest webview address to: " + strA);
            if (aVarB.a() == null || aVarB.a().equals(L)) {
                return null;
            }
            this.aW = aVarB;
            return null;
        }
        if ((!this.aY || !listAsList2.contains(strA2)) && !listAsList4.contains(strA2)) {
            return null;
        }
        this.aV = null;
        this.aW = null;
        this.aX = null;
        Logger.d(S, "get ad id for resource - setting latest log message to: null and latest webview address to: null");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        if (str == null || !str.equals(str2)) {
            return true;
        }
        Logger.d(S, "screenshot validity failed for hash: " + str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return az;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        List<String> listG = super.g();
        listG.add("external_url");
        return listG;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("/") || str.startsWith("/")) {
            for (String str2 : aN.keySet()) {
                if (str2.startsWith(str) || str2.endsWith(str)) {
                    Logger.d(S, "tryReverseMatching - extended ad id from: " + str + " to: " + str2);
                    str = str2;
                    break;
                }
            }
        }
        if (!aN.containsKey(str)) {
            Logger.d(S, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToSource keys: " + aN.keySet());
            return false;
        }
        if (!aP.containsKey(str)) {
            Logger.d(S, "tryReverseMatching with ad id - ad id " + str + " is not in the adIdToCI keys: " + aP.keySet());
            return false;
        }
        CreativeInfo creativeInfo = aP.get(str);
        if (creativeInfo != null && aT.get(str) == BrandSafetyUtils.AdType.BANNER) {
            creativeInfo.a(aT.get(str));
        }
        String str3 = aN.get(str);
        aQ.put(str3, creativeInfo);
        return a(str3, g.f44960f, aM, aQ, d.f44082o);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
        String strRemove = aN.remove(str);
        Logger.d(S, "clean resources started with ad id: " + str + ", and source is: " + strRemove);
        if (strRemove != null) {
            aM.remove(strRemove);
            aQ.remove(strRemove);
        }
        aT.remove(str);
        aP.remove(str);
        ay.remove(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(S, "match ci started for ironsource banner: with object: " + obj);
        try {
            if (obj instanceof HashSet) {
                for (Object obj2 : (HashSet) obj) {
                    if (obj2 instanceof String) {
                        Logger.d(S, "match ci resource is: " + obj2);
                        String strS = s((String) obj2);
                        if (strS != null && aP.containsKey(strS)) {
                            if (aM.containsKey(obj2)) {
                                WeakReference<WebView> weakReference = aM.get(obj2);
                                if (k.a((Reference<?>) weakReference)) {
                                    String strA = BrandSafetyUtils.a(weakReference.get());
                                    Logger.d(S, "match ci - added webview address: " + strA + " to webview to ad id map with ad id: " + strS);
                                    aO.put(strA, strS);
                                }
                            }
                            return aP.get(strS);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.d(S, "error while matching info: " + th2.getMessage());
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(aP, "IronSourceDiscovery:adIdToCI", false);
        com.safedk.android.utils.e.a(aQ, "IronSourceDiscovery:sourceToCI", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> j(String str) {
        String str2 = aG.get(str);
        if (str2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : aG.keySet()) {
            String str4 = aG.get(str3);
            if (str4 != null && str4.equals(str2)) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
        String strA = BrandSafetyUtils.a(webView);
        aZ.put(BrandSafetyUtils.a(obj), new WeakReference<>(webView));
        Logger.d(S, "add webview to object on interface: " + strA + " object " + obj);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
        if (str != null && str.startsWith("{\"id\":") && str.contains("openUrl")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("arguments")) {
                    Logger.d(S, "find webview from open url message - there is no arguments key for json: " + str);
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("arguments");
                if (!jSONObject2.has("url")) {
                    Logger.d(S, "find webview from open url message - there is no url key for json: " + str);
                    return;
                }
                Logger.d(S, "find webview from open url message started with json: " + jSONObject);
                if (!jSONObject2.has("type") || !jSONObject2.getString("type").equals("openUrl")) {
                    Logger.d(S, "find webview from open url message - there is no type or it's not equal to openUrl: " + (jSONObject2.has("type") ? jSONObject2.getString("type") : null));
                    return;
                }
                String strK = k.k(jSONObject2.getString("url"));
                Logger.d(S, "find webview from open url message - redirect message is: " + str);
                Logger.d(S, "find webview from open url message - url: " + strK);
                if (obj == null || !aZ.containsKey(BrandSafetyUtils.a(obj))) {
                    Logger.d(S, "find webview from open url message - did not find object: " + obj + " in set: " + aZ.keySet());
                    return;
                }
                WeakReference<WebView> weakReference = aZ.get(BrandSafetyUtils.a(obj));
                if (!k.a((Reference<?>) weakReference)) {
                    Logger.d(S, "find webview from open url message - webview is not alive, exiting");
                    return;
                }
                WebView webView = weakReference.get();
                Logger.d(S, "find webview from open url message - webview address: " + BrandSafetyUtils.a(webView) + " object: " + obj);
                BrandSafetyUtils.onMraidOpen(g.f44960f, null, strK, webView, "mraid.open");
            } catch (Throwable th2) {
                Logger.d(S, "find webview from open url message - exception occurred: " + th2);
            }
        }
    }
}
