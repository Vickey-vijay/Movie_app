package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.Gc;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBBannerView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.brandsafety.n;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    private static Map<String, CreativeInfo> B = null;
    private static Map<String, CreativeInfo> C = null;
    private static Map<String, CreativeInfo> D = null;
    private static final String F = "com.applovin.mediation.adapters.MintegralMediationAdapter";
    private static final String G = "status";
    private static final int H = 1;
    private static final String I = "data";
    private static final String J = "ads";
    private static final String K = "id";
    private static final String L = "video_url";
    private static final String M = "image_url";
    private static final String N = "end_screen_url";
    private static final String O = "unit_id";
    private static final String P = "package_name";
    private static final String Q = "click_url";
    private static final String R = "cam_html";
    private static final String S = "http";
    private static final String T = "req_ext_data";
    private static final String U = "parent_id";
    private static final String V = "ad_tracking";
    private static final String W = "impression";
    private static final String X = "impression_url";
    private static final String Y = "only_impression_url";
    private static final String Z = "ad_type";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final int f44153aa = -1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f44154ab = 287;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final int f44155ac = 94;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final int f44156ad = 296;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final int f44157ae = 295;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f44158af = "mof_template_url";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f44159ag = "mbridge_same_choice_one_layout";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f44160ah = "choose_from_two";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f44161ai = "multi_ad_mintegral_dsp";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f44162aj = "mof_data";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f44163ak = "crt_rid";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f44164al = "rks";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f44165am = "aks";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f44166an = "k";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f44167ao = "sdkId";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f44168ap = "webviewAddress";
    private static final String aq = "direction";
    private static final String ar = "recommendation-images";
    private static final String as = "recommendations";
    private static final String at = "url";
    private static final String au = "responseText";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44171d = "{";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44172e = "}";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44173f = "mbridge_order_layout_list";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44174g = "a";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44175h = "b";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44176i = "c";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44177j = "q";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44178k = "r";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44179l = "al";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44180w = "csp";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44181x = "MintegralDiscovery";
    private final Map<String, String> av;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44169b = ".rayjump.com/openapi/ad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44182y = ".rayjump.com/load";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44183z = "mtgglobals.com/load";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44170c = "mtgglobals.com/openapi/ad/v3";
    private static final List<String> A = Arrays.asList(f44169b, f44182y, f44183z, f44170c, CreativeInfoManager.f43866n, CreativeInfoManager.f43867o);
    private static final Set<String> E = new HashSet();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f44185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f44186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f44187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f44188e;

        a() {
        }

        public String toString() {
            return (this.f44184a != null ? this.f44184a + Z7.f27998r : "") + (this.f44185b != null ? this.f44185b + Z7.f27998r : "") + (this.f44186c != null ? this.f44186c + Z7.f27998r : "") + (this.f44187d != null ? this.f44187d + Z7.f27998r : "") + (this.f44188e != null ? this.f44188e + Z7.f27998r : "");
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f44189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashSet<String> f44190b = new HashSet<>();

        b() {
        }
    }

    private void j() {
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, false);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f44086p.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, true);
    }

    private void l() {
        this.av.put(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "X");
        this.av.put("/", "u");
        this.av.put("0", "i");
        this.av.put("1", "6");
        this.av.put("2", "1");
        this.av.put(ExifInterface.GPS_MEASUREMENT_3D, "k");
        this.av.put("4", "e");
        this.av.put(CampaignEx.CLICKMODE_ON, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        this.av.put("6", InneractiveMediationDefs.GENDER_FEMALE);
        this.av.put(Gc.f26641e, RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        this.av.put("8", "r");
        this.av.put("9", "4");
        this.av.put(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z");
        this.av.put("B", VastAttributes.VERTICAL_POSITION);
        this.av.put("C", "/");
        this.av.put("D", "Y");
        this.av.put(ExifInterface.LONGITUDE_EAST, "o");
        this.av.put("F", "2");
        this.av.put(RequestConfiguration.MAX_AD_CONTENT_RATING_G, "O");
        this.av.put("H", "Z");
        this.av.put("I", "8");
        this.av.put("J", "d");
        this.av.put("K", "9");
        this.av.put("L", "a");
        this.av.put("M", "w");
        this.av.put("N", "Q");
        this.av.put("O", Gc.f26641e);
        this.av.put("P", CampaignEx.CLICKMODE_ON);
        this.av.put("Q", "l");
        this.av.put("R", "I");
        this.av.put(ExifInterface.LATITUDE_SOUTH, "B");
        this.av.put("T", "0");
        this.av.put("U", "j");
        this.av.put(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "U");
        this.av.put(ExifInterface.LONGITUDE_WEST, "L");
        this.av.put("X", "v");
        this.av.put("Y", "b");
        this.av.put("Z", ExifInterface.LATITUDE_SOUTH);
        this.av.put("a", "D");
        this.av.put("b", ExifInterface.GPS_MEASUREMENT_3D);
        this.av.put("c", "F");
        this.av.put("d", "H");
        this.av.put("e", VastAttributes.HORIZONTAL_POSITION);
        this.av.put(InneractiveMediationDefs.GENDER_FEMALE, "N");
        this.av.put("g", "n");
        this.av.put("h", "c");
        this.av.put("i", "M");
        this.av.put("j", ExifInterface.LONGITUDE_EAST);
        this.av.put("k", ExifInterface.LONGITUDE_WEST);
        this.av.put("l", "g");
        this.av.put(InneractiveMediationDefs.GENDER_MALE, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        this.av.put("n", "T");
        this.av.put("o", "C");
        this.av.put("p", "K");
        this.av.put("q", "q");
        this.av.put("r", InneractiveMediationDefs.GENDER_MALE);
        this.av.put("s", "s");
        this.av.put("t", "h");
        this.av.put("u", "p");
        this.av.put("v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        this.av.put("w", "t");
        this.av.put(VastAttributes.HORIZONTAL_POSITION, "R");
        this.av.put(VastAttributes.VERTICAL_POSITION, "P");
        this.av.put("z", "J");
        this.av.put("=", "=");
    }

    private void m() {
        try {
            if (CreativeInfoManager.f43869q) {
                B = new ConcurrentHashMap();
                C = new ConcurrentHashMap();
                D = new ConcurrentHashMap();
            } else {
                B = new PersistentConcurrentHashMap("MintegralDiscovery_kToCInfo");
                Logger.d(f44181x, "generate collections - k to Ci info loaded, keyset=" + B.keySet());
                C = new PersistentConcurrentHashMap("MintegralDiscovery_adIdToCInfo");
                Logger.d(f44181x, "generate collections - ad ID to Ci info loaded, keyset=" + C.keySet());
                D = new PersistentConcurrentHashMap("MintegralDiscovery_bannerRequestIdToCiMap");
                Logger.d(f44181x, "generate collections - banner request ID to Co info loaded, keyset=" + D.keySet());
            }
        } catch (InvalidParameterException e10) {
            Logger.e(f44181x, "generate collections - error initializing caching will not be available", e10);
        }
    }

    public h() {
        super(g.f44969o, f44181x, false);
        this.av = new HashMap();
        j();
        l();
        m();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        JSONObject jSONObject;
        k.b(f44181x, "generate info - started, url: " + str + ", buffer = " + str2 + ", maxParams = " + aVar);
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e10) {
            Logger.d(f44181x, "generate info - not a valid JSON string: " + e10.getMessage());
            jSONObject = null;
        } catch (Throwable th2) {
            Logger.d(f44181x, "generate info - not a valid JSON string: " + th2.getMessage(), th2);
            jSONObject = null;
        }
        if (jSONObject == null) {
            Logger.d(f44181x, "generate info - obj is null, skipping.");
            return null;
        }
        int i10 = jSONObject.getInt("status");
        if (i10 != 1) {
            Logger.d(f44181x, "generate info - status is not okay, skipping. status= " + i10);
            return null;
        }
        if (!jSONObject.has("data")) {
            Logger.d(f44181x, "generate info - JSON object does not contain a 'data' key. this is not s prefetch");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!e(jSONObject2)) {
            Logger.d(f44181x, "generate info - invalid ad type= " + d(jSONObject2));
            return null;
        }
        if (c(jSONObject2)) {
            Logger.d(f44181x, "generate info - data object is complementary prefetch");
            a(str, jSONObject2);
            return null;
        }
        List<CreativeInfo> listA = a(jSONObject2, (CreativeInfo) null);
        a(listA, jSONObject2);
        return listA;
    }

    private static void a(List<CreativeInfo> list, JSONObject jSONObject) {
        for (CreativeInfo creativeInfo : list) {
            if (creativeInfo instanceof MintegralCreativeInfo) {
                MintegralCreativeInfo mintegralCreativeInfo = (MintegralCreativeInfo) creativeInfo;
                String strI = mintegralCreativeInfo.I();
                if (strI != null && strI.equals(BrandSafetyEvent.AdFormatType.BANNER.toString())) {
                    String strB = b(jSONObject);
                    boolean z10 = false;
                    if (strB != null) {
                        mintegralCreativeInfo.a(strB);
                        D.put(strB, mintegralCreativeInfo);
                        Logger.d(f44181x, "save creative info - banner/MREC CI saved to bannerRequestIdToCiMap using request ID= " + strB + ", new map size= " + D.size());
                        z10 = true;
                    }
                    String strA = a(jSONObject);
                    if (strA != null) {
                        mintegralCreativeInfo.H(strA);
                        D.put(strA, creativeInfo);
                        Logger.d(f44181x, "save creative info - banner/MREC CI saved to bannerRequestIdToCiMap using onlyImpressionUrlIdentifier= " + strA + ", new map size= " + D.size());
                        z10 = true;
                    }
                    if (!z10) {
                        Logger.d(f44181x, "save creative info - banner/MREC could NOT be saved! ci id= " + mintegralCreativeInfo.L());
                    }
                } else {
                    Logger.d(f44181x, "save creative info - adding interstitial CI, ID: " + creativeInfo.L() + ", new map size= " + D.size());
                    C.put(creativeInfo.L(), creativeInfo);
                }
                B.put(mintegralCreativeInfo.aj(), creativeInfo);
                Logger.d(f44181x, "save creative info - adding CI to k map, key: " + mintegralCreativeInfo.aj() + ", new map size: " + B.size());
            }
        }
    }

    private static String a(JSONObject jSONObject) {
        String strC = null;
        if (jSONObject.has("only_impression_url")) {
            try {
                strC = k.c(jSONObject.getString("only_impression_url"), "k");
            } catch (JSONException e10) {
                Logger.d(f44181x, "get onlyImpressionUrl identifier from prefetch - exception= " + e10);
            }
        }
        Logger.d(f44181x, "get onlyImpressionUrl identifier from prefetch - only impression url identifier= " + strC);
        return strC;
    }

    private static String b(JSONObject jSONObject) {
        String strOptString = null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("req_ext_data");
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString(U);
        }
        Logger.d(f44181x, "get requestId from prefetch - request id= " + strOptString);
        return strOptString;
    }

    private List<CreativeInfo> a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        String strI;
        BrandSafetyUtils.AdType adTypeK;
        Logger.d(f44181x, "generate CI - started");
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapI = i(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f44181x, "generate CI - ads size= " + jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Logger.d(f44181x, "generate CI - Looping over ad index= " + i10);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                Map<String, String> mapH = h(jSONObject2.optJSONObject("aks"));
                a aVarB = b(jSONObject2, mapI, mapH);
                String strA = a(aVarB);
                Logger.d(f44181x, "generate CI - adId= " + strA);
                if (creativeInfo == null) {
                    Pair<String, BrandSafetyUtils.AdType> pairF = f(jSONObject);
                    String str = (String) pairF.first;
                    adTypeK = (BrandSafetyUtils.AdType) pairF.second;
                    strI = str;
                } else {
                    strI = creativeInfo.I();
                    adTypeK = creativeInfo.K();
                }
                Logger.d(f44181x, "generate CI - adFormat= " + strI + " BrandSafety adType= " + adTypeK);
                String string = jSONObject2.getString("id");
                Logger.d(f44181x, "generate CI - creativeId= " + string);
                String strA2 = a(jSONObject2, mapI, mapH);
                Logger.d(f44181x, "generate CI - clickUrl= " + strA2);
                String strS = s(jSONObject2.getString("video_url"));
                Logger.d(f44181x, "generate CI - videoUrl= " + strS);
                String string2 = jSONObject2.getString("image_url");
                Logger.d(f44181x, "generate CI - imageUrl= " + string2);
                String string3 = jSONObject.getString("end_screen_url");
                Logger.d(f44181x, "generate CI - endScreenUrl= " + string3);
                String strC = k.c(string3, "unit_id");
                Logger.d(f44181x, "generate CI - placementId= " + strC);
                String strA3 = a(jSONObject, jSONArray, adTypeK);
                Logger.d(f44181x, "generate CI - downstreamStruct= " + strA3);
                String string4 = jSONObject2.getString("package_name");
                Logger.d(f44181x, "generate CI - packageName= " + string4);
                MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(strA, adTypeK, string, strA2, strS, string2, strI, strC, this.f44089t, strA3, false, string4);
                Logger.d(f44181x, "generate CI - creativeInfo created= " + mintegralCreativeInfo);
                mintegralCreativeInfo.I(aVarB.f44184a);
                Logger.d(f44181x, "generate CI - setting creativeInfo k field= " + aVarB.f44184a);
                if (creativeInfo != null) {
                    mintegralCreativeInfo.s(creativeInfo.Q());
                }
                a(mintegralCreativeInfo, jSONObject2, string2);
                arrayList.add(mintegralCreativeInfo);
                a(mintegralCreativeInfo, adTypeK, jSONObject, jSONArray);
                a(mintegralCreativeInfo, jSONObject, i10);
                a((CreativeInfo) mintegralCreativeInfo, jSONObject2);
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "generate CI - could not extract ads array, exception= " + e10);
        }
        return arrayList;
    }

    private void a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            if (jSONObject.has("ad_tracking")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ad_tracking");
                if (jSONObject2.has("impression")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("impression");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        creativeInfo.x(jSONArray.getString(i10));
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "add impression tracking URLs - could not extract impression urls, exception= " + e10);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        Throwable th2;
        CreativeInfo creativeInfoRemove;
        if (E.contains(str)) {
            Logger.d(f44181x, "handle complementary prefetch - url already handled= " + str);
            return;
        }
        Logger.d(f44181x, "handle complementary prefetch - started, url= " + str);
        CreativeInfo creativeInfoD = null;
        try {
            String strC = k.c(str, f44162aj);
            Logger.d(f44181x, "handle complementary prefetch - " + strC);
            if (strC != null) {
                String string = new JSONObject(strC).getString(f44163ak);
                Logger.d(f44181x, "handle complementary prefetch - recommendation request ID= " + string);
                if (!TextUtils.isEmpty(string) && (creativeInfoRemove = B.remove(string)) != null) {
                    try {
                        Logger.d(f44181x, "handle complementary prefetch - ci found by request ID= " + creativeInfoRemove);
                        if (g(jSONObject)) {
                            Logger.d(f44181x, "handle complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                            creativeInfoD = c(creativeInfoRemove, jSONObject);
                        } else if (creativeInfoRemove.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                            Logger.d(f44181x, "handle complementary prefetch - ads data is two or less, ad type is fullscreen, calling handleRecommendationsPrefetch");
                            creativeInfoD = d(creativeInfoRemove, jSONObject);
                        } else {
                            Logger.d(f44181x, "handle complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                            b(creativeInfoRemove, jSONObject);
                            creativeInfoD = creativeInfoRemove;
                        }
                        E.add(str);
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        creativeInfoD = creativeInfoRemove;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
        Logger.d(f44181x, "handle complementary prefetch - exception= " + th2.getMessage(), th2);
        if (creativeInfoD != null) {
            creativeInfoD.u("rec_ex(" + k.e() + "):" + th2.getMessage() + ImpressionLog.Q);
        }
    }

    private static void c(CreativeInfo creativeInfo) {
        String strH = creativeInfo.h();
        if (strH != null) {
            creativeInfo.c(strH.replace("/multiple_ads", ""));
        }
    }

    private List<CreativeInfo> g(String str, String str2) {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
        while (it.hasNext()) {
            List<CreativeInfo> listA = it.next().a(str, str2);
            if (listA != null && !listA.isEmpty()) {
                return listA;
            }
        }
        return new ArrayList();
    }

    private void b(JSONObject jSONObject, String str, String str2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(as);
            Logger.d(f44181x, "handle dsp fullScreen recommendations - jsonArray= " + jSONArrayOptJSONArray);
            if (jSONArrayOptJSONArray != null) {
                List<CreativeInfo> listG = g(str, str2);
                Logger.d(f44181x, "handle dsp fullScreen recommendations - found CIs= " + listG);
                for (CreativeInfo creativeInfo : listG) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 < jSONArrayOptJSONArray.length()) {
                            String str3 = (String) jSONArrayOptJSONArray.get(i11);
                            Logger.d(f44181x, "handle dsp fullScreen recommendations - removing image from webView resources: " + str3);
                            creativeInfo.G(str3);
                            i10 = i11 + 1;
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "handle dsp fullScreen recommendations - exception= " + e10);
        }
    }

    public void l(String str) {
        Logger.d(f44181x, "handle dsp complementary prefetch - started. message= " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Logger.d(f44181x, "handle dsp complementary prefetch - jsonObject= " + jSONObject);
            String strOptString = jSONObject.optString(f44167ao);
            Logger.d(f44181x, "handle dsp complementary prefetch - sdk= " + strOptString);
            String strOptString2 = jSONObject.optString(f44168ap);
            Logger.d(f44181x, "handle dsp complementary prefetch - webViewAddress= " + strOptString2);
            if (!TextUtils.isEmpty(strOptString) && !strOptString.equals(g.f44969o) && !TextUtils.isEmpty(strOptString2)) {
                String string = jSONObject.getString(aq);
                Logger.d(f44181x, "handle dsp complementary prefetch - direction= " + string);
                if (!TextUtils.isEmpty(string) && string.equals(ar)) {
                    Logger.d(f44181x, "handle dsp complementary prefetch - full screen recommendations, calling handleDspFullScreenRecommendations");
                    b(jSONObject, strOptString, strOptString2);
                } else {
                    Logger.d(f44181x, "handle dsp complementary prefetch - banner complementary, calling handleDspBannerComplementaryPrefetch");
                    a(jSONObject, strOptString, strOptString2);
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "handle dsp complementary prefetch - message is not a valid JSON. exception= " + e10);
        } catch (Exception e11) {
            Logger.d(f44181x, "handle dsp complementary prefetch - encountered exception= " + e11);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            String strOptString = jSONObject.optString("url");
            Logger.d(f44181x, "handle dsp banner complementary prefetch - url is dsp complementary url= " + strOptString);
            if (!TextUtils.isEmpty(strOptString) && (strOptString.contains(CreativeInfoManager.f43866n) || strOptString.contains(CreativeInfoManager.f43867o))) {
                String strOptString2 = jSONObject.optString(au);
                if (!TextUtils.isEmpty(strOptString2)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString2);
                    Logger.d(f44181x, "handle dsp banner complementary prefetch - responsePrefetch= " + jSONObject2);
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                    Logger.d(f44181x, "handle dsp banner complementary prefetch - adsData= " + jSONObjectOptJSONObject);
                    if (jSONObjectOptJSONObject != null) {
                        for (CreativeInfo creativeInfoC : g(str, str2)) {
                            if (g(jSONObjectOptJSONObject)) {
                                Logger.d(f44181x, "handle dsp banner complementary prefetch - ads data is recommendation, calling handleRecommendationsPrefetch");
                                creativeInfoC = c(creativeInfoC, jSONObjectOptJSONObject);
                            } else {
                                Logger.d(f44181x, "handle dsp banner complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                                b(creativeInfoC, jSONObjectOptJSONObject);
                            }
                            c(creativeInfoC);
                        }
                        return;
                    }
                    return;
                }
                Logger.d(f44181x, "handle dsp banner complementary prefetch - adsData field is null or empty, returning. adsDataString= " + strOptString2);
                return;
            }
            Logger.d(f44181x, "handle dsp banner complementary prefetch - sdk field is empty or is Mintegral sdk, returning. sdk= " + str);
        } catch (JSONException e10) {
            Logger.d(f44181x, "handle dsp banner complementary prefetch - message is not a valid JSON. exception= " + e10);
        } catch (Exception e11) {
            Logger.d(f44181x, "handle dsp banner complementary prefetch - encountered exception= " + e11);
        }
    }

    private void b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f44181x, "handle second multi ad - started, firstCI= " + creativeInfo);
        Logger.d(f44181x, "handle second multi ad - calling generateCI");
        List<CreativeInfo> listA = a(jSONObject, creativeInfo);
        if (!listA.isEmpty()) {
            Logger.d(f44181x, "handle second multi ad - CIs generated= " + listA);
            creativeInfo.a(ImpressionLog.f43626b, new ImpressionLog.a[0]);
            creativeInfo.ai();
            String str = ((creativeInfo.h() != null ? creativeInfo.h() : "") + (creativeInfo.Q().equals(g.f44969o) ? CreativeInfo.aJ : f44161ai)) + CreativeInfo.aH + (listA.size() + 1);
            creativeInfo.c(str);
            c(creativeInfo);
            Logger.d(f44181x, "handle second multi ad - updating downstream struct of first CI to= " + str);
            BannerFinder bannerFinderZ = SafeDK.getInstance().z();
            Logger.d(f44181x, "handle second multi ad - calling setMintegralMultiAdUuid");
            bannerFinderZ.a(creativeInfo);
            for (CreativeInfo creativeInfo2 : listA) {
                creativeInfo2.f(creativeInfo.m());
                creativeInfo2.b(new ArrayList<>(creativeInfo.q()));
                creativeInfo2.ai();
                creativeInfo2.c(creativeInfo.h());
                creativeInfo2.h(creativeInfo.F());
                creativeInfo2.b(creativeInfo.af(), creativeInfo.ae());
                creativeInfo2.s(creativeInfo.Q());
                k.b(f44181x, "handle second multi ad - finished updating second CI, calling setCreativeInAdFinder. second CI= " + creativeInfo2);
                CreativeInfoManager.a(creativeInfo2, creativeInfo.V(), creativeInfo.U());
            }
            return;
        }
        Logger.d(f44181x, "handle second multi ad - could not generate second CI");
    }

    private static CreativeInfo c(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f44181x, "handle recommendations prefetch - started");
        if (creativeInfo.Q().equals(g.f44969o)) {
            creativeInfo = d(creativeInfo);
        }
        ArrayList<b> arrayListJ = j(jSONObject);
        for (b bVar : arrayListJ) {
            creativeInfo.a(bVar.f44189a, bVar.f44190b);
            k.b(f44181x, "handle recommendations prefetch - added recommendation= " + bVar.f44189a + ", resource list= " + bVar.f44190b);
        }
        creativeInfo.ay = true;
        creativeInfo.u("added_recs (" + k.e() + "):" + arrayListJ.size());
        return creativeInfo;
    }

    private static CreativeInfo d(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f44181x, "handle inter second prefetch - started");
        if (creativeInfo.Q().equals(g.f44969o)) {
            creativeInfo = d(creativeInfo);
        }
        for (b bVar : j(jSONObject)) {
            creativeInfo.a(bVar.f44189a, new HashSet());
            k.b(f44181x, "handle inter second prefetch - added recommendation= " + bVar.f44189a);
        }
        creativeInfo.ay = true;
        String strH = creativeInfo.h() != null ? creativeInfo.h() : "";
        if (!strH.contains("/multiple_ads")) {
            creativeInfo.c(strH + "/multiple_ads");
        }
        return creativeInfo;
    }

    private static CreativeInfo d(CreativeInfo creativeInfo) {
        CreativeInfo creativeInfoI;
        n nVarK = SafeDK.getInstance().y().k(creativeInfo.Q());
        if (nVarK != null && (creativeInfoI = nVarK.i()) != null && creativeInfo != creativeInfoI && creativeInfo.L().equals(creativeInfoI.L())) {
            Logger.d(f44181x, "get current displaying Ci - found currently displayed instance= " + creativeInfo);
            return creativeInfoI;
        }
        return creativeInfo;
    }

    private static void a(MintegralCreativeInfo mintegralCreativeInfo, JSONObject jSONObject, int i10) {
        ArrayList<b> arrayListJ;
        String strOptString = jSONObject.optString("mof_template_url", null);
        if (!TextUtils.isEmpty(strOptString) && strOptString.contains(f44159ag) && (arrayListJ = j(jSONObject)) != null && arrayListJ.size() == 2) {
            b bVar = arrayListJ.get(1 - i10);
            mintegralCreativeInfo.b(bVar.f44189a, bVar.f44190b);
            Logger.d(f44181x, "add choose ad recommendations - updating creative info recommendations= " + bVar);
        }
    }

    private static void a(CreativeInfo creativeInfo, BrandSafetyUtils.AdType adType, JSONObject jSONObject, JSONArray jSONArray) {
        if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1) {
            String strOptString = jSONObject.optString("mof_template_url");
            if (!TextUtils.isEmpty(strOptString)) {
                Logger.d(f44181x, "set mof template url - adding mofTemplateYrl to debug info= " + strOptString);
                creativeInfo.u("mofTemplateUrl:" + strOptString);
            }
        }
    }

    private static boolean c(JSONObject jSONObject) {
        boolean z10 = d(jSONObject) == f44157ae;
        Logger.d(f44181x, "is complementary prefetch - returning= " + z10);
        return z10;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        Logger.d(f44181x, "extract and classify urls - started");
        ArrayList<String> arrayListG = k.g(jSONObject.toString().replace("\\/", "/"));
        arrayListG.remove(q(str));
        Logger.d(f44181x, "extract and classify urls - prefetchResourcesList= " + arrayListG);
        creativeInfo.b((List<String>) arrayListG);
    }

    private String a(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        Logger.d(f44181x, "get click url - started");
        String strA = null;
        try {
            String string = jSONObject.getString("click_url");
            Logger.d(f44181x, "get click url - click url from ad object= " + string);
            if (string.isEmpty() && jSONObject.has("cam_html")) {
                String strN = n(jSONObject.getString("cam_html"));
                if (strN != null) {
                    string = strN;
                }
                Logger.d(f44181x, "get click url - click url from dsp ad= " + string);
            }
            if (string.contains(f44171d) && string.contains(f44172e)) {
                strA = a(map2, a(map, string));
                Logger.d(f44181x, "get click url - click url after replacing place holders= " + strA);
                return strA;
            }
            return string;
        } catch (JSONException e10) {
            Logger.d(f44181x, "get click url - exception while extracting click url. exception= " + e10);
            return strA;
        }
    }

    private static int d(JSONObject jSONObject) {
        return jSONObject.optInt("ad_type", -1);
    }

    private static boolean e(JSONObject jSONObject) {
        int iD = d(jSONObject);
        boolean z10 = iD == 287 || iD == 94 || iD == f44156ad || iD == f44157ae;
        Logger.d(f44181x, "is supported ad type - returning= " + z10);
        return z10;
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        Logger.d(f44181x, "generate downstream struct - started");
        String str = "";
        String strOptString = jSONObject.optString("mof_template_url", null);
        if (!TextUtils.isEmpty(strOptString) && strOptString.contains(f44159ag)) {
            str = "" + f44160ah;
            Logger.d(f44181x, "generate downstream struct - downstreamStruct added= choose_from_two");
        }
        if (b(jSONObject, jSONArray, adType)) {
            str = str + "/multiple_ads";
            Logger.d(f44181x, "generate downstream struct - downstreamStruct added= /multiple_ads");
        }
        String str2 = str.isEmpty() ? null : "";
        Logger.d(f44181x, "generate downstream struct - final downstreamStruct= " + str2);
        return str2;
    }

    private static boolean b(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        boolean z10 = false;
        if (adType != null) {
            try {
                if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1 && jSONObject.has("mof_template_url") && jSONObject.getString("mof_template_url").contains(f44173f)) {
                    z10 = true;
                }
                Logger.d(f44181x, "is inter multi - returning= " + z10);
            } catch (JSONException e10) {
                Logger.d(f44181x, "is inter multi - exception while checking if ad is multi. exception= " + e10);
            }
        }
        return z10;
    }

    private static Pair<String, BrandSafetyUtils.AdType> f(JSONObject jSONObject) {
        BrandSafetyUtils.AdType adType;
        String string;
        Logger.d(f44181x, "generate brandSafety ad type and format - started");
        int iD = d(jSONObject);
        if (iD == 287) {
            string = BrandSafetyEvent.AdFormatType.INTER.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        } else {
            adType = null;
            string = null;
        }
        if (iD == 94) {
            string = BrandSafetyEvent.AdFormatType.REWARD.toString();
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (iD == f44156ad) {
            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        return new Pair<>(string, adType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        ?? ContainsKey;
        String str = null;
        Logger.d(f44181x, "match info - started. ad instance= " + obj);
        if (obj == null) {
            Logger.d(f44181x, "match info - ad instance is null, returning.");
            return null;
        }
        try {
            String str2 = (String) obj;
            k.b(f44181x, "match info - ad instance: " + obj + ", banner CI to ID map: " + D.keySet() + ", k to C info: " + B.keySet());
            ContainsKey = D.containsKey(str2);
            try {
                if (ContainsKey != 0) {
                    CreativeInfo creativeInfoRemove = D.remove(str2);
                    str = f44181x;
                    Logger.d(f44181x, "match info -  CI MATCH FOUND! by request ID: " + str2 + ", CI: " + creativeInfoRemove.toString());
                    ContainsKey = creativeInfoRemove;
                } else {
                    if (B.containsKey(str2)) {
                        CreativeInfo creativeInfo = B.get(str2);
                        str = f44181x;
                        Logger.d(f44181x, "match info - CI MATCH FOUND! by AKS key " + str2 + ", CI: " + creativeInfo.toString());
                        ContainsKey = creativeInfo;
                    } else {
                        Logger.d(f44181x, "match info - cannot find CI for ad id= " + str2);
                        ContainsKey = 0;
                    }
                    return ContainsKey;
                }
            } catch (Throwable th2) {
                th = th2;
                Logger.d(f44181x, "match info - exception: ", th);
            }
        } catch (Throwable th3) {
            th = th3;
            ContainsKey = str;
        }
        return ContainsKey;
    }

    private static boolean g(JSONObject jSONObject) {
        boolean z10 = false;
        if (jSONObject != null) {
            try {
                if (jSONObject.getJSONArray("ads").length() > 2) {
                    z10 = true;
                }
            } catch (JSONException e10) {
            }
        }
        Logger.d(f44181x, "is recommendations prefetch - returning= " + z10);
        return z10;
    }

    private String s(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            stringBuffer.append(this.av.get(str.substring(i10, i10 + 1)));
        }
        return new String(Base64.decode(stringBuffer.toString(), 0));
    }

    private static String a(a aVar) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(aVar.f44184a)) {
            sb2.append(aVar.f44184a);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f44186c)) {
            sb2.append(aVar.f44186c);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f44185b)) {
            sb2.append(aVar.f44185b);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f44187d)) {
            sb2.append(aVar.f44187d);
        }
        sb2.append(ImpressionLog.Q);
        if (!TextUtils.isEmpty(aVar.f44188e)) {
            sb2.append(aVar.f44188e);
        }
        Logger.d(f44181x, "generate ad id AKS - generated ad id = " + ((Object) sb2));
        return sb2.toString();
    }

    public static String r(String str) {
        a aVarT = t(str);
        String strA = null;
        if (aVarT != null) {
            strA = a(aVarT);
        }
        Logger.d(f44181x, "generate ad id String - generated ad id= " + strA);
        return strA;
    }

    private static a b(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        a aVar;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("aks");
            String string = jSONObject.has("impression_url") ? jSONObject.getString("impression_url") : null;
            Logger.d(f44181x, "generate AKS from ad prefetch - impression url template: " + string);
            if (jSONObjectOptJSONObject != null) {
                aVar = new a();
                try {
                    if (jSONObjectOptJSONObject.has("k")) {
                        aVar.f44184a = jSONObjectOptJSONObject.getString("k");
                    }
                    if (jSONObjectOptJSONObject.has("q")) {
                        aVar.f44186c = jSONObjectOptJSONObject.getString("q");
                    }
                    if (jSONObjectOptJSONObject.has("r")) {
                        aVar.f44185b = jSONObjectOptJSONObject.getString("r");
                    }
                    if (jSONObjectOptJSONObject.has("al")) {
                        aVar.f44187d = jSONObjectOptJSONObject.getString("al");
                    }
                    if (jSONObjectOptJSONObject.has("csp")) {
                        aVar.f44188e = jSONObjectOptJSONObject.getString("csp");
                        return aVar;
                    }
                    return aVar;
                } catch (JSONException e10) {
                    e = e10;
                    Logger.d(f44181x, "generate AKS from ad prefetch - exception while generating AKS from ad data. exception= " + e);
                    return aVar;
                }
            }
            if (string.contains(f44171d) && string.contains(f44172e)) {
                string = a(map2, a(map, string));
            }
            return t(string);
        } catch (JSONException e11) {
            e = e11;
            aVar = null;
        }
    }

    private static Map<String, String> h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("k")) {
                    map.put("k", jSONObject.getString("k"));
                }
                if (jSONObject.has("q")) {
                    map.put("q", jSONObject.getString("q"));
                }
                if (jSONObject.has("r")) {
                    map.put("r", jSONObject.getString("r"));
                }
                if (jSONObject.has("al")) {
                    map.put("al", jSONObject.getString("al"));
                }
                if (jSONObject.has("csp")) {
                    map.put("csp", jSONObject.getString("csp"));
                }
            } catch (JSONException e10) {
                Logger.d(f44181x, "generate ad level place holders map - exception while generating adLevelPlaceHoldersMap. exception= " + e10);
            }
        }
        return map;
    }

    private static Map<String, String> i(JSONObject jSONObject) {
        Map<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has("rks")) {
                map = com.safedk.android.utils.d.a(jSONObject.getJSONObject("rks"));
                if (jSONObject.has("a")) {
                    map.put("a", jSONObject.getString("a"));
                }
                if (jSONObject.has("b")) {
                    map.put("b", jSONObject.getString("b"));
                }
                if (jSONObject.has("c")) {
                    map.put("c", jSONObject.getString("c"));
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "generate prefetch level place holders map - exception while generating prefetchLevelPlaceHoldersMap. exception= " + e10);
        }
        return map;
    }

    private static a t(String str) {
        try {
            a aVar = new a();
            Map<String, String> mapB = k.b(str, false);
            aVar.f44184a = mapB.get("k");
            aVar.f44186c = mapB.get("q");
            aVar.f44185b = mapB.get("r");
            aVar.f44187d = mapB.get("al");
            aVar.f44188e = mapB.get("csp");
            Logger.d(f44181x, "generate AKS from impression url - generated AKS data= " + aVar);
            return aVar;
        } catch (Throwable th2) {
            Logger.d(f44181x, "generate AKS from impression url - exception while generating AKS from url " + str + ",  exception= " + th2.getMessage());
            return null;
        }
    }

    private static String a(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            str = str.replace(f44171d + str2 + f44172e, map.get(str2));
        }
        return str;
    }

    private static ArrayList<b> j(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f44181x, "generate recommendations - number of recommendations= " + jSONArray.length());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                bVar.f44189a = jSONObject2.getString("package_name");
                bVar.f44190b.addAll(k.g(jSONObject2.toString().replace("\\/", "/")));
                Logger.d(f44181x, "generate recommendations - generating recommendation num " + i10 + ". packageName= " + bVar.f44189a + ", resources= " + bVar.f44190b);
                arrayList.add(bVar);
            }
        } catch (JSONException e10) {
            Logger.d(f44181x, "generate recommendations - exception while generating recommendations. exception= " + e10);
        }
        return arrayList;
    }

    public static void a(CreativeInfo creativeInfo, String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        Logger.d(f44181x, "handle dsp recommendations prefetch - started, url= " + str);
        Logger.d(f44181x, "handle dsp recommendations prefetch - bufferValue= " + str2);
        if (creativeInfo != null && str != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject != null) {
                    if (jSONObject.getInt("status") == 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && c(jSONObjectOptJSONObject)) {
                        Logger.d(f44181x, "handle dsp recommendations prefetch - buffer is recommendations prefetch, calling handleRecommendationsPrefetch");
                        c(creativeInfo, jSONObjectOptJSONObject);
                    }
                } else {
                    Logger.d(f44181x, "handle dsp recommendations prefetch - not a valid JSON string");
                }
            } catch (JSONException e10) {
                Logger.d(f44181x, "handle dsp recommendations prefetch - not a valid JSON string, exception= ", e10);
            } catch (Throwable th2) {
                Logger.d(f44181x, "handle dsp recommendations prefetch - encountered exception, ", th2);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        int iIdentityHashCode = System.identityHashCode(obj);
        Logger.d(f44181x, "get creative info after media player start call - player id= " + iIdentityHashCode);
        return c((String) null, String.valueOf(iIdentityHashCode));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        Logger.d(f44181x, "get ad id from resource - started, value: " + str + ", ad ID:" + str2);
        if (str2 != null && !str2.startsWith("http")) {
            CreativeInfo creativeInfoRemove = C.remove(str2);
            if (creativeInfoRemove != null) {
                k.b(f44181x, "get ad id from resource - found ad ID: " + str2 + " CI: " + creativeInfoRemove);
                return creativeInfoRemove.L();
            }
            Logger.d(f44181x, "get ad id from resource - missing ID: " + str2);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(View view) {
        Logger.d(f44181x, "get ad id from view - view class= " + view.getClass().getName());
        try {
            if (view instanceof MBBannerView) {
                MBBannerView mBBannerView = (MBBannerView) view;
                Logger.d(f44181x, "get ad id from view - mbBannerView request ID is " + mBBannerView.getRequestId());
                return mBBannerView.getRequestId();
            }
            Logger.d(f44181x, "get ad id from view - v is not of the expected type (actual is " + view.getClass().getName() + ")");
            return null;
        } catch (Throwable th2) {
            Logger.d(f44181x, "get ad id from view - exception= " + th2.getMessage(), th2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    private static boolean u(String str) {
        boolean z10;
        Iterator<String> it = A.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                z10 = true;
                Logger.d(f44181x, "should follow url - returning= " + z10 + ", url= " + str);
                return z10;
            }
        }
        z10 = false;
        Logger.d(f44181x, "should follow url - returning= " + z10 + ", url= " + str);
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        boolean zU = u(str);
        Logger.d(f44181x, "should follow get url impl - returning= " + zU + ", url= " + str);
        return zU;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean zU = u(str);
        Logger.d(f44181x, "should follow input stream Iimpl - returning= " + zU + ", url= " + str);
        return zU;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return F;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        Logger.d(f44181x, "get webView resource matching method - returning= " + AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP);
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        Logger.d(f44181x, "should ignore redirect url - ignoring redirect url: " + str);
        return false;
    }
}
