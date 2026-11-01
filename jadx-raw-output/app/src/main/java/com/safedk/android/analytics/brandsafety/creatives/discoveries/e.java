package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.a;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.InMobiCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    private static final String A = "landingPageUrl";
    private static final String B = "markupType";
    private static final String C = "inmobiJson";
    private static final String D = "requestId";
    private static final String E = ".w.inmobi.com/c.asm/";
    private static final String F = "banner";
    private static final String G = "mrec";
    private static final String H = "com.applovin.mediation.adapters.InMobiMediationAdapter";
    private static final String I = "ads.inmobi.com/sdk";
    private static final String J = "client-request-id";
    private static final String K = "mk-ad-slot";
    private static final String L = "im-plid";
    private static final String M = "adtype";
    private static final String N = "creativeType";
    private static final String O = "metaInfo";
    private static final String P = "omsdkInfo";
    private static final String Q = "macros";
    private static final String R = "$PLACEMENT_DIMENSION";
    private static final String S = "content";
    private static final String T = "trackers";
    private static final String U = "title";
    private static final String V = "screenshots";
    private static final String W = "url";
    private static final String X = "icon";
    private static final String Y = "iconUrl";
    private static final String Z = "description";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44092aa = "cta";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f44093ab = "ctaText";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f44094ac = "rating";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f44095ad = "star";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f44096ae = "impressionTrackers";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f44097af = "com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f44098ag = "com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final float f44099ah = 0.3f;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final Map<String, VastAdTagUri> f44100ai = new HashMap();

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f44101aj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f44102ak = new ConcurrentHashMap();

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f44103al = new ConcurrentHashMap();

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final Map<String, CreativeInfo> f44104am = new ConcurrentHashMap();

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final Map<String, String> f44105an = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44106b = "contextData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44107c = "advertisedContent";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44108d = "InMobiDiscovery";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44109e = "rootContainer";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44110f = "assetValue";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44111g = "placementId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44112h = "ads";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44113i = "adSets";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44114j = "creativeId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44115k = "impressionId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44116l = "bidBundle";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44117w = "pubContent";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44118x = "passThroughJson";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44119y = "adContent";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44120z = "landingUrl";

    public e() {
        super(g.f44963i, f44108d, false);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, false);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f44086p.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, f44099ah);
        this.f44086p.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, true);
        this.f44086p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.f44086p.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, true);
        this.f44086p.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, true);
        this.f44086p.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        k.b(f44108d, "generate info started, url: " + str + ", event id: " + (aVar == null ? "" : aVar.f44056a) + ", buffer: " + str2);
        if (k.v(str2)) {
            if (s(str2)) {
                Logger.d(f44108d, "generate info - InMobi prefetch");
                return c(str, str2, map, aVar);
            }
            return g(str, str2);
        }
        Logger.d(f44108d, "generate info - InMobi pubContent, url: " + str);
        InMobiCreativeInfo inMobiCreativeInfo = (InMobiCreativeInfo) f44101aj.remove(str);
        if (inMobiCreativeInfo != null) {
            return a(str, str2, inMobiCreativeInfo, "");
        }
        Logger.d(f44108d, "generate info - not a valid JSON string");
        return new ArrayList();
    }

    private List<CreativeInfo> c(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        String str3;
        JSONArray jSONArray;
        BrandSafetyUtils.AdType adTypeC;
        BrandSafetyUtils.AdType adTypeC2;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has(D) || (!jSONObject.has(f44113i) && !jSONObject.has("ads"))) {
                Logger.d(f44108d, "generate info - not a JSON prefetch");
                return arrayList;
            }
            if (jSONObject.getJSONArray(f44113i).length() == 0) {
                Logger.d(f44108d, "generate info - ad sets array is empty, skipping");
                return arrayList;
            }
            if (!jSONObject.has(D)) {
                str3 = null;
            } else {
                String string = jSONObject.getString(D);
                Logger.d(f44108d, "generate info - request id: " + string);
                str3 = string;
            }
            String string2 = null;
            if (jSONObject.has("placementId")) {
                string2 = jSONObject.getString("placementId");
                Logger.d(f44108d, "generate info - placement id: " + string2);
            }
            k.b(f44108d, "generate info - url: " + str + " , Headers: " + (map != null ? map.toString() : "null") + ", buffer size: " + (str2 == null ? "0" : Integer.valueOf(str2.length())) + " , buffer: " + str2);
            JSONObject jSONObject2 = null;
            if (jSONObject.has(f44113i)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(f44113i);
                Logger.d(f44108d, "generate info - ad sets : " + jSONArray2.length() + " items");
                if (jSONArray2.length() > 0) {
                    jSONObject2 = jSONArray2.getJSONObject(0);
                } else {
                    Logger.d(f44108d, "generate info - ad sets element has no items");
                    return arrayList;
                }
            }
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.getJSONArray("ads");
            } else if (jSONObject.has("ads") && (jSONObject.get("ads") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray("ads");
            } else {
                Logger.d(f44108d, "generate info - ads element has no items or is not an array");
                return arrayList;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                String string3 = jSONObject3.getString("creativeId");
                String string4 = jSONObject3.getString(f44115k);
                Logger.d(f44108d, "generate info - impression id: " + string4 + ", creative id: " + string3);
                String strOptString = null;
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(f44106b);
                if (jSONObjectOptJSONObject != null) {
                    strOptString = jSONObjectOptJSONObject.optString(f44107c);
                }
                if (str3 != null && f44105an.containsKey(string2)) {
                    String str4 = f44105an.get(string2);
                    Logger.d(f44108d, "generate info - placement id to ad type list contains ad type " + str4 + " for placement id " + string2);
                    if (str4.equals("banner")) {
                        adTypeC2 = c(jSONObject3);
                        if (adTypeC2 == null) {
                            adTypeC2 = BrandSafetyUtils.AdType.BANNER;
                        }
                    } else if (str4.equals("mrec")) {
                        adTypeC2 = BrandSafetyUtils.AdType.MREC;
                    } else {
                        adTypeC2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    adTypeC = adTypeC2;
                } else if (aVar != null && (aVar.f44057b == BrandSafetyEvent.AdFormatType.BANNER || aVar.f44057b == BrandSafetyEvent.AdFormatType.LEADER)) {
                    adTypeC = BrandSafetyUtils.AdType.BANNER;
                } else if (aVar != null && aVar.f44057b == BrandSafetyEvent.AdFormatType.MREC) {
                    adTypeC = BrandSafetyUtils.AdType.MREC;
                } else if (aVar != null && aVar.f44057b == BrandSafetyEvent.AdFormatType.NATIVE) {
                    adTypeC = BrandSafetyUtils.AdType.NATIVE;
                } else {
                    adTypeC = c(jSONObject3);
                    if (adTypeC == null) {
                        adTypeC = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                }
                Logger.d(f44108d, "generate info - ad type: " + (adTypeC != null ? adTypeC.name() : "null"));
                InMobiCreativeInfo inMobiCreativeInfo = new InMobiCreativeInfo(string4, string3, string2, this.f44089t, adTypeC, jSONArray.length(), aVar == null ? null : aVar.f44057b, aVar == null ? null : aVar.f44056a, strOptString);
                boolean zA = a(jSONObject3);
                String string5 = jSONObject3.getString(f44117w);
                String strL = l(string5);
                List<CreativeInfo> arrayList2 = new ArrayList<>();
                if (k.a((Object) string5)) {
                    inMobiCreativeInfo.u("pubContentUrl=" + string5);
                    Logger.d(f44108d, "generate info - adding pubContent URL to follow: " + string5);
                    f44101aj.put(string5, inMobiCreativeInfo);
                    arrayList2.add(inMobiCreativeInfo);
                } else if (adTypeC == BrandSafetyUtils.AdType.NATIVE) {
                    String strA = a(inMobiCreativeInfo, jSONObject3, true);
                    if (strL != null) {
                        arrayList2 = a(str, strL, inMobiCreativeInfo, strA);
                    } else {
                        inMobiCreativeInfo.t(b(jSONObject3));
                    }
                    a(inMobiCreativeInfo, jSONObject3);
                    a(new JSONObject(string5), (CreativeInfo) inMobiCreativeInfo);
                    String str5 = string3 + "_" + string4;
                    Logger.d(f44108d, "generate info - adding native ci with creative id as key: " + str5);
                    f44102ak.put(str5, inMobiCreativeInfo);
                } else if (zA && strL != null) {
                    k.b(f44108d, "generate info - found native vast inside pubContent");
                    arrayList2 = a(str, strL, inMobiCreativeInfo, a(inMobiCreativeInfo, jSONObject3, false));
                } else if (zA) {
                    arrayList2 = a(str, string5, inMobiCreativeInfo, a(inMobiCreativeInfo, jSONObject3, false));
                    inMobiCreativeInfo.t(b(jSONObject3));
                    b(inMobiCreativeInfo, jSONObject3);
                    c(inMobiCreativeInfo, jSONObject3);
                } else if (strL != null) {
                    arrayList2 = a(str, strL, inMobiCreativeInfo, "");
                } else {
                    arrayList2 = a(str, string5, inMobiCreativeInfo, "");
                }
                if (adTypeC == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    if (aVar == null) {
                        Logger.d(f44108d, "generate info - adding interstitial ci with creative id as key (" + string3 + ")");
                        f44102ak.put(string3, inMobiCreativeInfo);
                        k.b(f44108d, "generate info - added interstitial CI. # of cis is " + f44102ak.size() + ", impression id: " + string4 + ", creative id: " + string3 + ", CI: " + inMobiCreativeInfo.toString());
                    } else if (aVar.f44056a != null && string2 != null) {
                        String str6 = string2 + "_" + aVar.f44056a + "_" + g.f44963i;
                        Logger.d(f44108d, "generate info - adding interstitial ci with complex key (" + str6 + ")");
                        f44102ak.put(str6, inMobiCreativeInfo);
                        inMobiCreativeInfo.f(aVar.f44056a);
                        k.b(f44108d, "added interstitial CI. # of cis is " + f44102ak.size() + ", impression id: " + string4 + ", complex key: " + str6 + ", CI: " + inMobiCreativeInfo.toString());
                    } else {
                        Logger.d(f44108d, "generate info - placementId and/or eventId are missing, cannot process ci");
                    }
                } else if ((adTypeC == BrandSafetyUtils.AdType.BANNER || adTypeC == BrandSafetyUtils.AdType.MREC) && string2 != null && aVar != null && aVar.f44056a != null && inMobiCreativeInfo.b() == 1) {
                    String str7 = string2 + "_" + aVar.f44056a + "_" + g.f44963i;
                    Logger.d(f44108d, "adding banner ci with complex key (" + str7 + ")");
                    f44103al.put(str7, inMobiCreativeInfo);
                    k.b(f44108d, "added banner CI. # of cis is " + f44103al.size() + ", impression id: " + string4 + ", adType = " + adTypeC + ", complex key: " + str7 + ", CI: " + inMobiCreativeInfo.toString());
                }
                Logger.d(f44108d, "recent creative IDs array item added. Key = " + string3);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    arrayList.addAll(arrayList2);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Logger.e(f44108d, "error: " + th2.getMessage(), th2);
        }
    }

    private static void a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        String strOptString;
        String strOptString2;
        String str;
        String str2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f44118x);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(f44119y);
        if (jSONObjectOptJSONObject != null) {
            strOptString3 = jSONObjectOptJSONObject.optString("title");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(V);
            String strOptString6 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("url") : null;
            String strOptString7 = jSONObjectOptJSONObject.optJSONObject("icon") != null ? jSONObjectOptJSONObject.optString("url") : null;
            strOptString2 = jSONObjectOptJSONObject.optString("description");
            strOptString = jSONObjectOptJSONObject.optString("cta");
            str = strOptString7;
            str2 = strOptString6;
        } else {
            strOptString = null;
            strOptString2 = null;
            str = null;
            str2 = null;
            strOptString3 = null;
        }
        if (jSONObjectOptJSONObject2 != null) {
            strOptString5 = TextUtils.isEmpty(strOptString3) ? jSONObjectOptJSONObject2.optString("title") : strOptString3;
            strOptString4 = TextUtils.isEmpty(str) ? jSONObjectOptJSONObject2.optString("iconUrl") : str;
            String strOptString8 = TextUtils.isEmpty(strOptString2) ? jSONObjectOptJSONObject2.optString("description") : strOptString2;
            strOptString = TextUtils.isEmpty(strOptString) ? jSONObjectOptJSONObject2.optString(f44093ab) : strOptString;
            strOptString2 = strOptString8;
        } else {
            strOptString4 = str;
            strOptString5 = strOptString3;
        }
        if (!TextUtils.isEmpty(strOptString5)) {
            creativeInfo.B(CreativeInfo.aM + strOptString5);
        }
        if (!TextUtils.isEmpty(str2)) {
            creativeInfo.B(CreativeInfo.aN + str2);
        }
        if (!TextUtils.isEmpty(strOptString4)) {
            creativeInfo.B(CreativeInfo.aO + strOptString4);
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            creativeInfo.B(CreativeInfo.aP + strOptString2);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            creativeInfo.B(CreativeInfo.aQ + strOptString);
        }
    }

    private String l(String str) {
        String string = null;
        try {
            if (!k.v(str)) {
                Logger.d(f44108d, "check vast format prefetch - pubContent is not a JSON");
            } else {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(f44109e)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(f44109e);
                    if (jSONObject2.has(f44110f)) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(f44110f);
                        loop0: for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                            if (jSONObject3.has(f44110f)) {
                                JSONArray jSONArray2 = jSONObject3.getJSONArray(f44110f);
                                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                    if ((jSONArray2.get(i11) instanceof String) && com.safedk.android.analytics.brandsafety.creatives.f.a(jSONArray2.getString(i11))) {
                                        Logger.d(f44108d, "check vast format prefetch - found vast value inside");
                                        string = jSONArray2.getString(i11);
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44108d, "check vast format prefetch - exception occurred: " + e10.getMessage());
        }
        return string;
    }

    private void a(List<String> list, JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (z10) {
                    try {
                        list.add(jSONArray.getJSONObject(i10).optString("url"));
                    } catch (JSONException e10) {
                    }
                } else {
                    list.add(jSONArray.getString(i10));
                }
            }
        }
    }

    private void a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f44117w);
        if (jSONObjectOptJSONObject != null) {
            a((List<String>) arrayList, jSONObjectOptJSONObject.optJSONArray(T), true);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(f44118x);
            if (jSONObjectOptJSONObject2 != null) {
                a((List<String>) arrayList, jSONObjectOptJSONObject2.optJSONArray(f44096ae), false);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(f44109e);
            if (jSONObjectOptJSONObject3 != null) {
                a((List<String>) arrayList, jSONObjectOptJSONObject3.optJSONArray(T), true);
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(f44110f);
                if (jSONObjectOptJSONObject4 != null) {
                    a((List<String>) arrayList, jSONObjectOptJSONObject4.optJSONArray(T), true);
                }
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            inMobiCreativeInfo.w(it.next());
        }
    }

    private void b(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        if (!jSONObject.has(f44117w)) {
            Logger.d(f44108d, "addDSPDomainURLs did not find pub_content");
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(f44117w);
            if (!jSONObject2.has(T)) {
                Logger.d(f44108d, "addDSPDomainURLs did not find trackers array");
                return;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray(T);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getJSONObject(i10).has("url")) {
                    arrayList.add(jSONArray.getJSONObject(i10).getString("url"));
                }
            }
            inMobiCreativeInfo.b((List<String>) arrayList);
        } catch (JSONException e10) {
            Logger.d(f44108d, "addDSPDomainURLs not a native ad (" + e10.getMessage() + ")");
        }
    }

    private String a(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject, boolean z10) {
        String str = z10 ? "" : CreativeInfo.aG;
        try {
            String str2 = str + "/" + jSONObject.getString(B);
            if (!jSONObject.has(O)) {
                Logger.d(f44108d, "set downstreamStruct failed because there is no metaInfo in ad object");
                return str2;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(O);
            if (!jSONObject2.has("creativeType")) {
                Logger.d(f44108d, "set downstreamStruct failed because there is no creativeType in metaInfo");
                return str2;
            }
            String str3 = str2 + "/" + jSONObject2.getString("creativeType");
            inMobiCreativeInfo.c(str3);
            return str3;
        } catch (JSONException e10) {
            Logger.d(f44108d, "set downstreamStruct - failed because of jsonException " + e10.getMessage());
            return str;
        }
    }

    private boolean a(JSONObject jSONObject, String str, CreativeInfo creativeInfo, String str2, boolean z10, boolean z11) {
        try {
            if (jSONObject.has(str2)) {
                if (z11) {
                    creativeInfo.A(jSONObject.getString(str2));
                } else {
                    creativeInfo.z(jSONObject.getString(str2));
                }
                return true;
            }
        } catch (JSONException e10) {
            Logger.d(f44108d, "findInJSONAndAddText - exception happened during trying to retrieve key " + str2 + " form json element " + str);
        }
        if (z10) {
            Logger.d(f44108d, "findInJSONAndAddText - did not find the key: " + str2 + " inside the json element: " + str);
        }
        return false;
    }

    private void c(InMobiCreativeInfo inMobiCreativeInfo, JSONObject jSONObject) {
        boolean zA;
        boolean zA2;
        boolean zA3;
        boolean z10 = false;
        boolean zA4 = false;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(f44117w);
            if (!jSONObject2.has(f44118x)) {
                zA = false;
                zA2 = false;
                zA3 = false;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(f44118x);
                if (jSONObject3.has(V)) {
                    a(jSONObject3.getJSONObject(V), V, inMobiCreativeInfo, "url", true, false);
                }
                zA4 = jSONObject3.has("icon") ? a(jSONObject3.getJSONObject("icon"), "icons", inMobiCreativeInfo, "url", false, false) : false;
                boolean zA5 = a(jSONObject3, f44118x, inMobiCreativeInfo, "title", false, true);
                zA3 = a(jSONObject3, f44118x, inMobiCreativeInfo, "description", false, true);
                zA2 = a(jSONObject3, f44118x, inMobiCreativeInfo, "cta", false, true);
                zA = a(jSONObject3, f44118x, inMobiCreativeInfo, "rating", false, true);
                z10 = zA5;
            }
            if (jSONObject2.has(f44119y)) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(f44119y);
                a(jSONObject4, f44119y, inMobiCreativeInfo, "title", !z10, true);
                a(jSONObject4, f44119y, inMobiCreativeInfo, "iconUrl", !zA4, false);
                a(jSONObject4, f44119y, inMobiCreativeInfo, "description", !zA3, true);
                a(jSONObject4, f44119y, inMobiCreativeInfo, f44093ab, !zA2, true);
                a(jSONObject4, f44119y, inMobiCreativeInfo, "rating", !zA, true);
            }
        } catch (JSONException e10) {
            Logger.d(f44108d, "extract native ad content - failed because of jsonException " + e10.getMessage());
        }
    }

    private boolean a(JSONObject jSONObject) {
        try {
            boolean z10 = jSONObject.has(B) && jSONObject.getString(B).equals(C);
            boolean z11 = jSONObject.has(f44117w) && k.v(jSONObject.getString(f44117w));
            boolean z12 = jSONObject.getJSONObject(f44117w).has(f44119y) && jSONObject.getJSONObject(f44117w).getJSONObject(f44119y).length() > 0;
            if (z10 && z11 && z12) {
                Logger.d(f44108d, "is native ad - adObj is indeed an inmobi native ad");
                return true;
            }
        } catch (JSONException e10) {
            Logger.d(f44108d, "isNativeAd not a native ad (" + e10.getMessage() + ")");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d A[Catch: JSONException -> 0x0073, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0073, blocks: (B:6:0x0011, B:8:0x001f, B:10:0x002d, B:11:0x004d), top: B:16:0x0011 }] */
    private String b(JSONObject jSONObject) {
        String str = null;
        if (!jSONObject.has(f44117w)) {
            Logger.d(f44108d, "getNativeAdClickUrl did not find pub_content");
        } else {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(f44117w);
                if (jSONObject2.has(f44118x)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(f44118x);
                    if (jSONObject3.has(f44120z)) {
                        String string = jSONObject3.getString(f44120z);
                        Logger.d(f44108d, "getNativeAdClickUrl returned " + string);
                        str = string;
                    } else {
                        String string2 = jSONObject2.getJSONObject(f44119y).getString(A);
                        Logger.d(f44108d, "getNativeAdClickUrl returned " + string2);
                        str = string2;
                    }
                } else {
                    String string3 = jSONObject2.getJSONObject(f44119y).getString(A);
                    Logger.d(f44108d, "getNativeAdClickUrl returned " + string3);
                    str = string3;
                }
            } catch (JSONException e10) {
                Logger.d(f44108d, "getNativeAdClickUrl not a native ad (" + e10.getMessage() + ")");
            }
        }
        return str;
    }

    private BrandSafetyUtils.AdType c(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(O) || !jSONObject.getJSONObject(O).has(P)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(O).getJSONObject(P);
        if (!jSONObject2.has(Q)) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(Q);
        if (!jSONObject3.has(R)) {
            return null;
        }
        String string = jSONObject3.getString(R);
        Logger.d(f44108d, "generate info - placementDimension = " + string);
        if (!string.contains("X")) {
            return null;
        }
        String[] strArrSplit = string.split("X");
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        if (i10 != 0 && i11 != 0 && k.a(i10, i11)) {
            BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.BANNER;
            Logger.d(f44108d, "generate info - adtype set to BANNER : placementDimension is " + string);
            return adType;
        }
        if (i10 == 0 || i11 == 0 || !k.b(i10, i11)) {
            return null;
        }
        BrandSafetyUtils.AdType adType2 = BrandSafetyUtils.AdType.MREC;
        Logger.d(f44108d, "generate info - adtype set to MREC : placementDimension is " + string);
        return adType2;
    }

    private List<CreativeInfo> a(String str, String str2, InMobiCreativeInfo inMobiCreativeInfo, String str3) {
        ArrayList<com.safedk.android.analytics.brandsafety.creatives.f.a> arrayListA;
        String strO;
        String strN;
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            arrayList.add(inMobiCreativeInfo);
            return arrayList;
        }
        BrandSafetyUtils.AdType adTypeK = inMobiCreativeInfo.K();
        String strK = k.k(str2);
        if (!com.safedk.android.analytics.brandsafety.creatives.f.a(strK)) {
            arrayListA = null;
        } else {
            arrayListA = com.safedk.android.analytics.brandsafety.creatives.f.a(strK, true, g.f44963i);
            k.b(f44108d, "vast ad infos: " + (arrayListA != null ? arrayListA.toString() : "null"));
        }
        if (arrayListA != null && arrayListA.size() > 0 && !str3.startsWith("vast")) {
            if (TextUtils.isEmpty(str3)) {
                str3 = "vast";
            } else {
                str3 = "vast/" + str3;
            }
        }
        Logger.d(f44108d, "is prefetch multi ad? " + (inMobiCreativeInfo.b() > 1 || u(strK)));
        if (arrayListA == null || arrayListA.size() == 0) {
            Logger.d(f44108d, "no vast info detected in prefetch");
            if (TextUtils.isEmpty(str3)) {
                str3 = "mraid";
                if (inMobiCreativeInfo.b() > 1) {
                    str3 = "mraid" + CreativeInfo.aH + inMobiCreativeInfo.b();
                }
            }
            if (inMobiCreativeInfo.M() == null && (strN = n(strK)) != null) {
                inMobiCreativeInfo.t(strN);
            }
            if (inMobiCreativeInfo.o() == null && (strO = o(strK)) != null) {
                inMobiCreativeInfo.q(strO);
            }
            arrayList.add(inMobiCreativeInfo);
        } else if (arrayListA.size() == 1) {
            Logger.d(f44108d, "prefetch has vast info");
            a(inMobiCreativeInfo, arrayListA.get(0), str);
            if (inMobiCreativeInfo.b() > 1) {
                str3 = str3 + CreativeInfo.aH + inMobiCreativeInfo.b();
            }
            Logger.d(f44108d, "downstream struct set to " + str3);
            inMobiCreativeInfo.c(true);
            arrayList.add(inMobiCreativeInfo);
        } else {
            Logger.d(f44108d, "prefetch has multiple vast infos");
            str3 = str3 + CreativeInfo.aH + arrayListA.size() + "/multiple_ads";
            for (com.safedk.android.analytics.brandsafety.creatives.f.a aVar : arrayListA) {
                InMobiCreativeInfo inMobiCreativeInfoAj = inMobiCreativeInfo.aj();
                inMobiCreativeInfoAj.ai();
                a(inMobiCreativeInfoAj, aVar, str);
                inMobiCreativeInfo.c(true);
                arrayList.add(inMobiCreativeInfoAj);
            }
        }
        if (str3.endsWith("/")) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        Logger.d(f44108d, "downstream struct set to " + str3);
        if (inMobiCreativeInfo.h() == null || str3.contains(inMobiCreativeInfo.h())) {
            inMobiCreativeInfo.c(str3);
        }
        ArrayList<String> arrayListG = k.g(strK);
        try {
            arrayListG.addAll(k.g(str2));
        } catch (Exception e10) {
            Logger.d(f44108d, "handlePubContent - could not extract urls from encoded pubContent: " + e10);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((CreativeInfo) it.next()).b((List<String>) arrayListG);
        }
        if (inMobiCreativeInfo.K() != BrandSafetyUtils.AdType.NATIVE && arrayListG.size() > 0) {
            for (String str4 : arrayListG) {
                if (str4.contains(E)) {
                    Logger.d(f44108d, "adding " + adTypeK.name().toLowerCase() + " ci with url as key (" + str4 + ")");
                    f44104am.put(str4, inMobiCreativeInfo);
                    k.b(f44108d, "added " + adTypeK.name().toLowerCase() + " CI. # of cis is " + f44104am.size() + ", impressionId: " + inMobiCreativeInfo.L() + ", prefetchResource: " + str4 + ", ci = " + inMobiCreativeInfo);
                }
            }
        }
        return arrayList;
    }

    private static List<String> a(CreativeInfo creativeInfo, String str) {
        Logger.d(f44108d, "extracting urls");
        new ArrayList();
        ArrayList<String> arrayListG = k.g(str);
        Logger.d(f44108d, "prefetch resources list after impression beacons urls removal : " + arrayListG);
        creativeInfo.b((List<String>) arrayListG);
        return arrayListG;
    }

    private List<CreativeInfo> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str2)) {
                Logger.d(f44108d, "generate info - InMobi vast proxy prefetch. vast ad tag proxy urls to follow: " + f44100ai.toString());
                CreativeInfo creativeInfoRemove = null;
                if (f44100ai.containsKey(str)) {
                    Logger.d(f44108d, "vasts proxy redirect url found: " + str);
                    creativeInfoRemove = this.f44087q.remove(f44100ai.remove(str));
                }
                String strQ = q(str);
                Logger.d(f44108d, "decodedUrl : " + strQ);
                if (creativeInfoRemove == null && f44100ai.containsKey(strQ)) {
                    Logger.d(f44108d, "vasts proxy redirect url found: " + str);
                    creativeInfoRemove = this.f44087q.remove(f44100ai.remove(strQ));
                }
                if (creativeInfoRemove != null) {
                    k.b(f44108d, "found vast proxy url: " + str + ", ci: " + creativeInfoRemove + ", content: " + str2);
                    a(creativeInfoRemove, str, str2, true);
                    Logger.d(f44108d, "vast processing was done in BaseDiscovery.");
                    arrayList.add(creativeInfoRemove);
                    return arrayList;
                }
            } else {
                Logger.d(f44108d, "generate info - buffer value cannot be empty, skipping.");
            }
        } catch (Throwable th2) {
            Logger.e(f44108d, "generate info exception: " + th2.getMessage(), th2);
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected void a(String str, VastAdTagUri vastAdTagUri) {
        if (str != null) {
            String[] strArrSplit = str.split("://");
            if (strArrSplit.length == 2) {
                f44100ai.put("http://vastproxy.brand.inmobi.com/g/" + strArrSplit[1], vastAdTagUri);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected synchronized void a(VastAdTagUri vastAdTagUri) {
        if (vastAdTagUri != null) {
            Iterator<Map.Entry<String, VastAdTagUri>> it = f44100ai.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, VastAdTagUri> next = it.next();
                if (next.getValue().equals(vastAdTagUri)) {
                    Logger.d(f44108d, "remove vast ad tag proxy uri from url to follow list: " + next.getValue());
                    it.remove();
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        Set<String> setC = super.c();
        setC.add("$TS");
        return setC;
    }

    private static String r(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(str).optJSONArray(f44113i);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0 && (jSONArrayOptJSONArray = jSONArrayOptJSONArray2.getJSONObject(0).optJSONArray("ads")) != null && jSONArrayOptJSONArray.length() > 0) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                String strOptString = jSONObject.optString("creativeId");
                String strOptString2 = jSONObject.optString(f44115k);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    String str2 = strOptString + "_" + strOptString2;
                    Logger.d(f44108d, "get creative id json - found creative id= " + str2);
                    return str2;
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44108d, "get creative id json - exception: " + e10);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x011f  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        String strR;
        try {
            Logger.d(f44108d, "match info ad instance: " + obj);
            if (obj == null) {
                Logger.d(f44108d, "match info ad instance is null");
                return null;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (k.v(str)) {
                    strR = r(str);
                    if (TextUtils.isEmpty(strR)) {
                        strR = str;
                    } else {
                        Logger.d(f44108d, "match info ad instance - updated ad instance key to= " + strR);
                    }
                } else {
                    strR = str;
                }
                k.b(f44108d, "match info ad instance " + obj + ", interstitial CIs map=" + f44102ak.toString());
                if (f44102ak.containsKey(strR)) {
                    CreativeInfo creativeInfo = f44102ak.get(strR);
                    Logger.d(f44108d, "match info ad instance - CI MATCH FOUND! by key " + strR + ", ci = " + creativeInfo);
                    return creativeInfo;
                }
                k.b(f44108d, "match info ad instance " + obj + ", banner CIs map: " + f44103al.keySet());
                if (f44103al.containsKey(strR)) {
                    CreativeInfo creativeInfo2 = f44103al.get(strR);
                    Logger.d(f44108d, "match info ad instance - CI MATCH FOUND! by key: " + strR + ", CI: " + creativeInfo2);
                    return creativeInfo2;
                }
                Logger.d(f44108d, "match info ad instance - cannot find CI");
            }
            return null;
        } catch (Throwable th2) {
            Logger.d(f44108d, "exception in match info ad instance", th2);
        }
    }

    private boolean s(String str) {
        return str.contains(D) && str.contains("placementId") && str.contains(f44113i) && str.contains("creativeId");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean b(String str, Bundle bundle) {
        String strE = k.E(str);
        boolean zContainsKey = f44101aj.containsKey(strE);
        if (zContainsKey && bundle != null) {
            bundle.putString(CreativeInfoManager.f43837a, "text/html");
            bundle.putString(CreativeInfoManager.f43854b, "UTF-8");
        }
        VastAdTagUri vastAdTagUri = new VastAdTagUri(strE);
        boolean z10 = this.f44087q.containsKey(vastAdTagUri) || com.safedk.android.analytics.brandsafety.creatives.f.f44288c.contains(vastAdTagUri) || f44100ai.containsKey(strE);
        if (strE.contains("action=skip-btn-clicked")) {
            Logger.d(f44108d, "video skipped event identified: " + strE);
            CreativeInfoManager.onVideoCompleted(g.f44963i, null);
        }
        if (!strE.contains(I) && !zContainsKey && !z10) {
            return false;
        }
        Logger.d(f44108d, "should follow input stream returned true for: " + strE);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String strO = k.o(str2);
        Logger.d(f44108d, "get ad id from resource started, resource: " + str2 + ", resource key: " + strO);
        if (!f44104am.containsKey(strO)) {
            return null;
        }
        CreativeInfo creativeInfo = f44104am.get(strO);
        k.b(f44108d, "get ad id from resource - CI identified, # of CIs: " + f44104am.size() + ", CI: " + creativeInfo.toString());
        return creativeInfo.L();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        if (!str.contains(E)) {
            return false;
        }
        Logger.d(f44108d, "should ignore redirect url - tracking url detected");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        String strO = k.o(str);
        if (!(str.contains(I) || f44104am.containsKey(strO))) {
            return false;
        }
        Logger.d(f44108d, "should follow get url key: " + strO);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    private String t(String str) {
        Map<String, String> mapB;
        String next = null;
        if (str != null && (mapB = k.b(str, false)) != null && mapB.size() > 0) {
            Iterator<String> it = mapB.values().iterator();
            while (it.hasNext()) {
                next = it.next();
            }
        }
        return next;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
        BrandSafetyEvent.AdFormatType adFormatType;
        CreativeInfo creativeInfo;
        if (str4.equals(BrandSafetyEvent.AdFormatType.APPOPEN.name())) {
            Logger.d(f44108d, "ignoring creative info details from Max, adFormat = " + str4 + ", creativeId = " + str2 + ", placementId = " + str);
            return;
        }
        if (str2 != null && str3 != null) {
            if (str4.equals(BrandSafetyUtils.f43547j)) {
                CreativeInfo creativeInfo2 = f44102ak.get(str2);
                adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                creativeInfo = creativeInfo2;
            } else if (str4.equals(BrandSafetyUtils.f43548k)) {
                CreativeInfo creativeInfo3 = f44102ak.get(str2);
                adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                creativeInfo = creativeInfo3;
            } else if (str4.equals("BANNER") || str4.equals(BrandSafetyUtils.f43551n)) {
                CreativeInfo creativeInfo4 = f44103al.get(str + "_" + str3 + "_" + g.f44963i);
                adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                creativeInfo = creativeInfo4;
            } else if (str4.equals(BrandSafetyUtils.f43552o)) {
                CreativeInfo creativeInfo5 = f44103al.get(str + "_" + str3 + "_" + g.f44963i);
                adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                creativeInfo = creativeInfo5;
            } else {
                adFormatType = null;
                creativeInfo = null;
            }
            if (adFormatType != null && creativeInfo != null) {
                creativeInfo.p(adFormatType.name());
                Logger.d(f44108d, "update CI details from Max, creative id: " + str2 + ", ID: " + creativeInfo.L() + ", placement id: " + creativeInfo.F() + ", ad format type: " + adFormatType);
            } else {
                Logger.d(f44108d, "failed to update CI details from Max, creative id: " + str2 + ", ad format: " + str4 + ", ad format type: " + adFormatType + ", CI: " + creativeInfo);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return H;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        if (!str.contains(I)) {
            return false;
        }
        Logger.d(f44108d, "should follow output stream returned true for url " + str);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        String strC;
        String strC2;
        Logger.d(f44108d, "handle on request sent url: " + str + ", content: " + str2);
        String strC3 = k.c(str + "?" + str2, L);
        if (strC3 != null && (strC = k.c(str + "?" + str2, M)) != null) {
            if (strC.equals("banner") && (strC2 = k.c(str + "?" + str2, K)) != null && strC2.contains(VastAttributes.HORIZONTAL_POSITION)) {
                String[] strArrSplit = strC2.split(VastAttributes.HORIZONTAL_POSITION);
                int i10 = Integer.parseInt(strArrSplit[0]);
                int i11 = Integer.parseInt(strArrSplit[1]);
                if (i10 != 0 && i11 != 0 && k.b(i10, i11)) {
                    strC = "mrec";
                    Logger.d(f44108d, "handle on request sent - adtype is MREC : mkAdSlot is " + strC2);
                }
            }
            Logger.d(f44108d, "adding to placement id to ad type list - size: " + f44105an.size() + ", placement id: " + strC3 + ", ad type: " + strC);
            f44105an.put(strC3, strC);
            return null;
        }
        return null;
    }

    private boolean u(String str) {
        List<String> listA = k.a(com.safedk.android.utils.f.J(), str);
        List<String> listA2 = k.a(com.safedk.android.utils.f.I(), str);
        if (listA == null || listA.size() <= 1) {
            return listA2 != null && listA2.size() > 1;
        }
        return true;
    }

    private void b(CreativeInfo creativeInfo, String str) {
        List<String> listA = k.a(com.safedk.android.utils.f.H(), str);
        if (listA != null && listA.size() > 1) {
            for (String str2 : listA) {
                Logger.d(f44108d, "adding vast clause " + str2 + " to ci debug info");
                creativeInfo.u(str2);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        List<String> listG = super.g();
        listG.add(f44097af);
        return listG;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        int i10;
        if (bundle == null || (i10 = bundle.getInt(f44098ag)) <= 0) {
            return null;
        }
        String hexString = Integer.toHexString(i10);
        Logger.d(f44108d, "found expanded ad webview address in intent extra: " + hexString);
        return hexString;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        a(view, "onClick");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
        a(view, "onSource");
    }

    public static void a(View view, String str) {
        List<CreativeInfo> listA;
        Logger.d(f44108d, "redirect potential source: " + view);
        a aVarA = null;
        if (k.a(view.getWidth(), view.getHeight())) {
            aVarA = SafeDK.getInstance().a(BrandSafetyUtils.AdType.BANNER);
        } else if (k.b(view.getWidth(), view.getHeight())) {
            aVarA = SafeDK.getInstance().a(BrandSafetyUtils.AdType.MREC);
        }
        if (aVarA != null && (listA = aVarA.a(g.f44963i, BrandSafetyUtils.a(view))) != null) {
            Iterator<CreativeInfo> it = listA.iterator();
            while (it.hasNext()) {
                it.next().u("redirectPotentialSource=" + str + ",view=" + view);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(f44102ak, "InMobiDiscovery:creativeToIdMap", false);
        com.safedk.android.utils.e.a(f44103al, "InMobiDiscovery:bannerCreativeToIdMap", false);
        com.safedk.android.utils.e.a(f44104am, "InMobiDiscovery:creativeToUrlMap", false);
        com.safedk.android.utils.e.a(f44101aj, "InMobiDiscovery:pubContentUrlsToFollow", false);
    }
}
