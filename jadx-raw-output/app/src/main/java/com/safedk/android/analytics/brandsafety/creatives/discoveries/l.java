package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.UnityAdsCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l extends d {
    private static final String A = "portraitCreativeId";
    private static final String B = "trailerDownloadable";
    private static final String C = "trailerPortraitDownloadable";
    private static final String D = "mraidUrl";
    private static final String E = "campaign";
    private static final String F = "programmatic/mraid";
    private static final String G = "programmatic/mraid-url";
    private static final String H = "programmatic/vast";
    private static final String I = "programmatic/vast-vpaid";
    private static final String J = "programmatic/banner-html";
    private static final String K = "placements";
    private static final String L = "placementsV2";
    private static final String M = "mediaId";
    private static final String N = "placementMeta";
    private static final String O = "rs";
    private static final String P = "id";
    private static final String Q = "allowSkip";
    private static final String R = "auctionId";
    private static final String S = "creativeId";
    private static final String T = "bundleId";
    private static final String U = "placementId";
    private static final String V = "unityCreativeId";
    private static final String W = "endScreenUrl";
    private static final String X = "mraidUrl";
    private static final String Y = "data";
    private static final String Z = "tracking";
    private static final int aF = 15;
    private static final String aG = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var addObservers=function(){try{var privacyElement=document.getElementById(\"privacy\");if(!privacyElement){privacyElement=document.getElementById(\"privacy-settings\")}if(!privacyElement){privacyElement=document.querySelector('button[aria-label=\"Privacy\"]')}if(privacyElement&&privacyElement.style&&privacyElement.style.visibility){var element_style_visibility=privacyElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(privacyElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}if(mutation.type===\"attributes\"){addObservers()}})});var config={childList:true,subtree:true,attributes:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44206aa = "trackingTemplates";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f44207ab = "buyerID";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f44208ac = "dspId";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f44209ad = "advertiserDomain";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f44210ae = "events";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f44212ag = "urlIndices";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f44213ah = "params";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f44214ai = "datapts";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f44215aj = "trailerPortraitStreaming";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f44216ak = "trailerStreaming";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f44218am = "/events/v2/";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f44219an = "/v1/events/";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f44220ao = "unity3d.com/brands";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f44221ap = "unity3d.com/operative";
    private static final String aq = "unity3d.com/impression";
    private static final String ar = "com.applovin.mediation.adapters.UnityAdsMediationAdapter";
    private static final String as = "com.unity3d.ads";
    private static final String at = "https://";
    private static final String au = "http://";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44222b = "admob-video";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44223c = "admob-display";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44224d = "scar-admob";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44231k = "UnityAdsDiscovery";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44232l = "media";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44233w = "content";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44234x = "appStoreId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44235y = "clickUrl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44236z = "contentType";
    private final ConcurrentHashMap<String, Boolean> av;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String[] f44211af = {"start", "impression"};

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final Set<String> f44217al = new HashSet(Arrays.asList("auction.unityads.unity3d.com/v", "auction.unityads.unity.cn/v", "auction-load.unityads.unity3d.com/v", "auction-load.unityads.unity.cn/v", "auction-banner.unityads.unity3d.com/v", "auction-load-tpsc.unityads.unity3d.com/v"));
    private static final ConcurrentHashMap<String, CreativeInfo> aw = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> ax = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, CreativeInfo> ay = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> az = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> aA = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, HashSet<String>> aB = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> aC = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Integer> aD = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> aE = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<WebView>> f44225e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f44226f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f44227g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f44228h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Stack<String> f44229i = new Stack<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LimitedConcurrentHashMap<String, String> f44230j = new LimitedConcurrentHashMap<>(15);

    public l() {
        super("com.unity3d.ads", f44231k, false);
        this.av = new ConcurrentHashMap<>();
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f44086p.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aG);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.f44086p.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        String strE;
        if (k.A(str) || k.z(k.o(str))) {
            k.b(f44231k, "generate info started, url: " + str + ", content size: " + str2.length() + ", headers: " + map);
        } else {
            k.b(f44231k, "generate info started, url: " + str + ", buffer: " + str2);
        }
        if (k.A(str)) {
            Logger.d(f44231k, "generate info - bufferValue is binary for url " + str + ", skipping");
            return null;
        }
        if (!k.v(str2)) {
            try {
                strE = new String(Base64.decode(str2, 0));
            } catch (IllegalArgumentException e10) {
                Logger.d(f44231k, "generate info - failed to Base64 decode buffer: " + e10.getMessage());
                strE = str2;
            }
            if (strE == null || !k.v(strE)) {
                strE = k.E(strE);
            }
            if (strE == null || k.v(strE)) {
                str2 = strE;
            } else {
                try {
                    str2 = new String(Base64.decode(strE, 0));
                } catch (IllegalArgumentException e11) {
                    Logger.d(f44231k, "generate info - failed to Base64 decode buffer (decoded): " + e11.getMessage());
                    str2 = strE;
                }
            }
            if (str2 == null || !k.v(str2)) {
                Logger.d(f44231k, "generate info - not a valid JSON string, skipping");
                return null;
            }
            k.b(f44231k, "generate info - Base64 decoded json : " + str2);
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(str2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
        if (jSONObjectOptJSONObject == null) {
            Logger.d(f44231k, "generate info - can't find media block");
            return null;
        }
        String string = null;
        if (jSONObject.has("auctionId")) {
            string = jSONObject.getString("auctionId");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("placements");
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2 == null ? jSONObject.optJSONObject(L) : jSONObjectOptJSONObject2;
        if (jSONObjectOptJSONObject3 == null) {
            Logger.d(f44231k, "generate info - can't find placements block");
            return null;
        }
        ArrayList<String> arrayListA = a(jSONObject);
        Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
        Logger.d(f44231k, "generate info - placements: " + jSONObjectOptJSONObject3);
        String str3 = aVar != null ? aVar.f44056a : null;
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObjectOptJSONObject3.getJSONObject(next);
                String strOptString = jSONObject2.optString(O, null);
                Logger.d(f44231k, "generate info - rs: " + strOptString);
                String strB = null;
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(Z);
                JSONObject jSONObjectOptJSONObject4 = null;
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i10);
                        strB = b(jSONObjectOptJSONObject4);
                    }
                } else {
                    jSONObjectOptJSONObject4 = jSONObject2.optJSONObject(Z);
                    strB = b(jSONObjectOptJSONObject4);
                }
                Logger.d(f44231k, "generate info - processing start/import tracking events, datapts: " + strB);
                if (jSONObject2.has(M)) {
                    BrandSafetyEvent.AdFormatType adFormatType = aVar != null ? aVar.f44057b : null;
                    if (jSONObject2.get(M).getClass().getName().equals(String.class.getName())) {
                        String string2 = jSONObject2.getString(M);
                        Logger.d(f44231k, "generate info - media ID (single value): " + string2);
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(strOptString)) {
                            a(arrayList, jSONObjectOptJSONObject, next, string2, strOptString, strB, string, adFormatType, jSONObjectOptJSONObject4, arrayListA, str3);
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(M);
                        Logger.d(f44231k, "generate info - media ID (array): " + jSONArrayOptJSONArray2);
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                                String string3 = jSONArrayOptJSONArray2.getString(i11);
                                Logger.d(f44231k, "generate info - processing media ID: " + string3);
                                if (!TextUtils.isEmpty(string3)) {
                                    a(arrayList, jSONObjectOptJSONObject, next, string3, strOptString, strB, string, adFormatType, jSONObjectOptJSONObject4, arrayListA, str3);
                                }
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e12) {
                Logger.d(f44231k, "generate info - error decoding url: " + str2 + ", error: " + e12.getMessage(), e12);
            } catch (Throwable th2) {
                Logger.d(f44231k, "generate info - error parsing " + th2.getMessage(), th2);
            }
        }
        return arrayList;
    }

    private ArrayList<String> a(JSONObject jSONObject) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            Logger.d(f44231k, "unity - extract tracking templates - json root is null");
        } else {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f44206aa);
            if (jSONArrayOptJSONArray == null) {
                Logger.d(f44231k, "unity - extract tracking templates - tracking templates are null");
            } else {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    try {
                        arrayList.add(jSONArrayOptJSONArray.getString(i10));
                    } catch (JSONException e10) {
                        Logger.d(f44231k, "unity - extract tracking templates - exception occurred: with message\n" + e10);
                    }
                }
            }
        }
        return arrayList;
    }

    private String b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        if (jSONObject == null) {
            Logger.d(f44231k, "unity - extractDataPts - tracking is null");
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("events");
        if (jSONObjectOptJSONObject2 == null) {
            Logger.d(f44231k, "unity - extractDataPts - events is null");
            return null;
        }
        for (String str : f44211af) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(str);
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("params")) != null && (strOptString = jSONObjectOptJSONObject.optString(f44214ai, null)) != null) {
                return strOptString;
            }
        }
        Logger.d(f44231k, "unity - extractDataPts - did not find datapts");
        return null;
    }

    private ArrayList<Integer> a(JSONObject jSONObject, String str) {
        HashSet hashSet = new HashSet();
        if (jSONObject == null) {
            Logger.d(f44231k, "unity - extract tracking template indices - tracking is null for media id: " + str);
            return new ArrayList<>();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("events");
        if (jSONObjectOptJSONObject == null) {
            Logger.d(f44231k, "unity - extract tracking template indices - events are null for media id: " + str);
            return new ArrayList<>();
        }
        try {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObjectOptJSONObject.get(next) instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) jSONObjectOptJSONObject.get(next);
                    if (jSONObject2.has(f44212ag)) {
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(f44212ag);
                        for (int i10 = 0; jSONArrayOptJSONArray != null && i10 < jSONArrayOptJSONArray.length(); i10++) {
                            hashSet.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i10)));
                        }
                    } else {
                        continue;
                    }
                }
            }
            return new ArrayList<>(hashSet);
        } catch (JSONException e10) {
            Logger.d(f44231k, "unity - extract tracking template indices - exception occurred for media: " + str + " with message\n" + e10);
            return new ArrayList<>(hashSet);
        }
    }

    private ArrayList<String> a(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
        ArrayList<String> arrayList3 = new ArrayList<>();
        Iterator<Integer> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(arrayList.get(it.next().intValue()));
        }
        return arrayList3;
    }

    private boolean a(List<CreativeInfo> list, JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, BrandSafetyEvent.AdFormatType adFormatType, JSONObject jSONObject2, ArrayList<String> arrayList, String str6) throws JSONException {
        String string;
        JSONObject jSONObject3 = jSONObject.getJSONObject(str2);
        String string2 = jSONObject3.getString(f44236z);
        if (string2.equals(J)) {
            string = BrandSafetyEvent.AdFormatType.BANNER.toString();
        } else if (this.av.containsKey(str)) {
            string = this.av.remove(str).booleanValue() ? BrandSafetyEvent.AdFormatType.INTER.toString() : BrandSafetyEvent.AdFormatType.REWARD.toString();
        } else {
            string = adFormatType != null ? adFormatType.toString() : BrandSafetyEvent.AdFormatType.INTER.toString();
        }
        Logger.d(f44231k, "generate info - ad format: " + string + ", media ID: " + str2 + ", ad ID: " + str3);
        String string3 = jSONObject3.getString("content");
        String strOptString = jSONObject3.optString("creativeId");
        String string4 = null;
        if (jSONObject3.has("bundleId")) {
            string4 = jSONObject3.getString("bundleId");
        }
        String string5 = jSONObject3.has(CreativeInfo.L) ? jSONObject3.getString(CreativeInfo.L) : null;
        if (str5 != null) {
            Logger.d(f44231k, "generate info - adding auction id: " + str5 + " with ad id: " + str3);
            aC.put(str5, str3);
        }
        int size = list.size();
        Logger.d(f44231k, "generate info - content type is " + string2);
        if (string2.endsWith("campaign")) {
            b(list, str, str3, string, string2, string3, string4, string5, str4);
        } else if (string2.endsWith(f44222b) || string2.endsWith(f44223c)) {
            c(list, str, strOptString, str3, string, string2, string3, string4, string5);
        } else if (string2.equals(H) || string2.equals(I)) {
            a(list, str, strOptString, str3, string, string2, string3, string4, string5);
        } else if (string2.equals(F)) {
            k.b(f44231k, "generate info - content type is programmatic mraid: " + jSONObject3);
            list.add(a(new com.safedk.android.analytics.brandsafety.creatives.b(jSONObject3), str, str3, string, string2, string4, string5));
        } else if (string2.equals(G)) {
            list.add(a(new com.safedk.android.analytics.brandsafety.creatives.c(jSONObject3), str, str3, string, string2, string4, string5));
        } else if (string2.equals(J)) {
            UnityAdsCreativeInfo unityAdsCreativeInfoA = a(str, strOptString, str3, string, string2, string3, string4, string5);
            list.add(unityAdsCreativeInfoA);
            if (str4 != null) {
                ay.put(str4, unityAdsCreativeInfoA);
                Logger.d(f44231k, "generate info - saving CI based on datapts with initial: " + str4.substring(0, 20));
            } else if (str3 != null) {
                ay.put(str3, unityAdsCreativeInfoA);
                Logger.d(f44231k, "generate info - saving CI based on ad id with initial: " + str3);
            } else {
                Logger.d(f44231k, "generate info - no datapts or ad id, can't store CI for Unity banner");
            }
            Logger.d(f44231k, "generate info - add ci to adId map for banners, ad id: " + str3 + " datapts: " + str4 + ", ci: " + unityAdsCreativeInfoA);
        }
        if (!string2.equals(J) && !string2.contains(f44224d)) {
            for (int i10 = size; i10 < list.size(); i10++) {
                CreativeInfo creativeInfo = list.get(i10);
                Logger.d(f44231k, "generate info - add ci to datapts map, datapts: " + str4 + ", ci: " + creativeInfo);
                if (str4 != null) {
                    ax.put(str4, creativeInfo);
                } else {
                    ax.put(str3, creativeInfo);
                }
            }
            if (list.size() - size > 1) {
                Logger.d(f44231k, "generate info - found more than one CI - there are " + (list.size() - size) + " cis");
            }
            if (str4 != null) {
                az.put(str3, str4);
                aA.put(str4, str3);
            }
        }
        a(list, str2, size, jSONObject2, arrayList);
        return false;
    }

    private void a(List<CreativeInfo> list, String str, int i10, JSONObject jSONObject, ArrayList<String> arrayList) {
        String str2;
        String str3;
        String str4;
        if (list.size() != 0) {
            ArrayList<Integer> arrayListA = a(jSONObject, str);
            Logger.d(f44231k, "generate info - for media id: " + str + " url indices are: " + arrayListA);
            ArrayList<String> arrayListA2 = a(arrayList, arrayListA);
            int i11 = i10;
            String strN = null;
            String strP = null;
            while (i11 < list.size()) {
                CreativeInfo creativeInfo = list.get(i11);
                creativeInfo.b((List<String>) arrayListA2);
                if (strP == null) {
                    strP = creativeInfo.P();
                }
                i11++;
                strN = strN == null ? creativeInfo.n() : strN;
            }
            if (strP == null || strN == null) {
                Iterator<String> it = arrayListA2.iterator();
                String str5 = null;
                while (true) {
                    if (!it.hasNext()) {
                        str2 = str5;
                        str3 = strN;
                        break;
                    }
                    Map<String, String> mapB = k.b(k.k(it.next()), false);
                    if (mapB != null) {
                        Iterator<String> it2 = mapB.keySet().iterator();
                        while (true) {
                            str4 = strN;
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next = it2.next();
                            if (strP != null && str4 != null) {
                                break;
                            }
                            if (next.equals(f44208ac) && strP == null) {
                                strP = mapB.get(next);
                            }
                            strN = (next.equals(f44209ad) && str4 == null) ? mapB.get(next) : str4;
                            str5 = (next.equals(f44207ab) && str5 == null) ? mapB.get(next) : str5;
                        }
                        if (strP != null && str4 != null) {
                            str2 = str5;
                            str3 = str4;
                            break;
                        }
                        strN = str4;
                    }
                }
            } else {
                str2 = null;
                str3 = strN;
            }
            String str6 = strP == null ? str2 : strP;
            while (i10 < list.size()) {
                CreativeInfo creativeInfo2 = list.get(i10);
                if (str6 != null) {
                    creativeInfo2.k(str6);
                }
                if (str3 != null) {
                    creativeInfo2.g(str3);
                }
                i10++;
            }
            Logger.d(f44231k, "generate info - for media id: " + str + " dsps are: " + list.get(list.size() - 1).p());
        }
    }

    private void a(ArrayList<String> arrayList, String str) {
        int i10 = 0;
        for (String str2 : arrayList) {
            if (!at.contains(str2) && !au.contains(str2)) {
                int i11 = i10 + 1;
                if (aB.containsKey(str2)) {
                    aB.get(str2).add(str);
                } else {
                    HashSet<String> hashSet = new HashSet<>();
                    hashSet.add(str);
                    aB.put(str2, hashSet);
                }
                Logger.d(f44231k, "addUrlsToMaps: adding the ad id: " + str + " to the set of ad ids for the url: " + str2);
                i10 = i11;
            }
        }
        aD.put(str, Integer.valueOf(i10));
        Logger.d(f44231k, "addUrlsToMaps: added " + i10 + " urls for adId: " + str);
    }

    private UnityAdsCreativeInfo a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String strN;
        UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str3, str2, null, null, null, str5, null, str4, str, this.f44089t, str7, str8, null);
        String strK = k.k(str6);
        Matcher matcher = com.safedk.android.utils.f.C().matcher(strK);
        boolean zFind = matcher.find();
        if (zFind) {
            strK = strK.substring(matcher.start(), matcher.end());
        }
        Logger.d(f44231k, "generate info - get html and is matched? " + zFind);
        ArrayList<String> arrayListG = k.g(strK);
        unityAdsCreativeInfo.b((List<String>) arrayListG);
        a(arrayListG, str3);
        aE.put(str3, strK);
        if (unityAdsCreativeInfo.M() == null && (strN = n(strK)) != null) {
            unityAdsCreativeInfo.t(strN);
        }
        return unityAdsCreativeInfo;
    }

    private void a(List<CreativeInfo> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str3, str2, null, null, null, str5, null, str4, str, this.f44089t, str7, str8, null);
        if (a((CreativeInfo) unityAdsCreativeInfo, (String) null, str6, true)) {
            list.add(unityAdsCreativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    private void b(List<CreativeInfo> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws JSONException {
        UnityAdsCreativeInfo unityAdsCreativeInfo;
        JSONObject jSONObject = new JSONObject(str5);
        Logger.d(f44231k, "parse comet campaign prefetch - ad info: " + jSONObject);
        String strOptString = jSONObject.optString(f44234x);
        String string = jSONObject.getString("clickUrl");
        String string2 = null;
        if (jSONObject.has("creativeId")) {
            string2 = jSONObject.getString("creativeId");
        } else {
            Logger.d(f44231k, "parse comet campaign prefetch - cannot find value for key 'creativeId'");
        }
        String strOptString2 = jSONObject.optString("mraidUrl", null);
        String strOptString3 = jSONObject.optString(W, null);
        if (strOptString3 == null) {
            strOptString3 = jSONObject.optString("mraidUrl", null);
        }
        if (strOptString2 != null) {
            Logger.d(f44231k, "parse comet campaign prefetch - playable ad creative ID: " + string2 + ", playable url: " + strOptString2 + ", click url: " + string);
            unityAdsCreativeInfo = new UnityAdsCreativeInfo(str2, string2, string, null, strOptString2, str4, null, str3, str, this.f44089t, str6, str7, strOptString3);
            unityAdsCreativeInfo.b(Arrays.asList(strOptString2));
        } else {
            String strOptString4 = jSONObject.optString(C, null);
            String strOptString5 = jSONObject.optString(B, null);
            String strOptString6 = jSONObject.optString(f44215aj, null);
            Logger.d(f44231k, "parse comet campaign prefetch - streaming portrait video url: " + strOptString6);
            Logger.d(f44231k, "parse comet campaign prefetch - streaming video url: " + jSONObject.optString(f44216ak, null));
            Logger.d(f44231k, "parse comet campaign prefetch - generate info video url: " + (strOptString5 == null ? "null" : strOptString5) + ", portrait video url:" + (strOptString4 == null ? "null" : strOptString4));
            String strOptString7 = jSONObject.optString(A, null);
            Logger.d(f44231k, "parse comet campaign prefetch - creative ID: " + string2 + " click URL: " + string + " video URL: " + strOptString5);
            unityAdsCreativeInfo = new UnityAdsCreativeInfo(str2, string2, string, strOptString5, null, str4, null, str3, str, this.f44089t, str6, str7, strOptString3);
            unityAdsCreativeInfo.c(strOptString7, strOptString4);
            if (strOptString4 != null) {
                unityAdsCreativeInfo.b(Arrays.asList(strOptString4));
            }
            unityAdsCreativeInfo.a(strOptString6);
        }
        if (strOptString != null) {
            unityAdsCreativeInfo.q(strOptString);
        }
        unityAdsCreativeInfo.b((List<String>) k.g(str5.replace("\\/", "/")));
        list.add(unityAdsCreativeInfo);
        String strOptString8 = jSONObject.optString("id");
        if (strOptString8 != null) {
            Logger.d(f44231k, "parse comet campaign prefetch - add prefetch id: " + strOptString8);
            if (str8 != null) {
                f44227g.put(strOptString8, str8);
                f44228h.put(str8, strOptString8);
            }
        }
        if (str8 == null) {
            Logger.d(f44231k, "parse comet campaign prefetch - no datapts found in prefetch, ad id is: " + str2);
        }
    }

    private UnityAdsCreativeInfo a(com.safedk.android.analytics.brandsafety.creatives.b bVar, String str, String str2, String str3, String str4, String str5, String str6) {
        String strO;
        String strN;
        com.safedk.android.analytics.brandsafety.creatives.b.a aVarA = bVar.a();
        UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str2, aVarA.f43954a, aVarA.f43955b, null, null, str4, aVarA.f43956c, str3, str, this.f44089t, str5, str6, null);
        if (!TextUtils.isEmpty(aVarA.f43957d)) {
            unityAdsCreativeInfo.a(aVarA.f43957d.hashCode());
        }
        ArrayList<String> arrayListG = k.g(aVarA.f43957d);
        Logger.d(f44231k, "parse mraid prefetch - prefetch resources list: " + arrayListG);
        unityAdsCreativeInfo.b((List<String>) arrayListG);
        for (String str7 : arrayListG) {
            if (k.z(str7) && unityAdsCreativeInfo.H() == null) {
                unityAdsCreativeInfo.o(str7);
                Logger.d(f44231k, "parse mraid prefetch - video url set to " + str7);
                break;
            }
        }
        if (unityAdsCreativeInfo.H() == null && aVarA.f43958e != null && aVarA.f43958e.length() > 0) {
            unityAdsCreativeInfo.o(aVarA.f43958e);
            Logger.d(f44231k, "parse mraid prefetch - video url set to " + aVarA.f43958e);
        }
        if (unityAdsCreativeInfo.M() == null && (strN = n(aVarA.f43957d)) != null) {
            unityAdsCreativeInfo.t(strN);
        }
        if (unityAdsCreativeInfo.o() == null && (strO = o(aVarA.f43957d)) != null) {
            unityAdsCreativeInfo.q(strO);
        }
        Logger.d(f44231k, "parse mraid prefetch - CI: " + unityAdsCreativeInfo);
        return unityAdsCreativeInfo;
    }

    private void c(List<CreativeInfo> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z10;
        ArrayList<String> arrayListG;
        String str9;
        Logger.d(f44231k, "parsing admob video prefetch - ad ID: " + str3);
        String strK = k.k(str6);
        List<String> listB = k.b(com.safedk.android.utils.f.G(), strK, 1);
        int size = (listB == null || listB.size() <= 0) ? 1 : listB.size();
        if (listB.size() <= 1) {
            z10 = false;
        } else {
            Logger.d(f44231k, "parsing admob video prefetch - identified multi ad, ad count: " + listB.size());
            z10 = true;
        }
        List<String> listG = g(strK, str6);
        if (listG.isEmpty() && !TextUtils.isEmpty(str2)) {
            listG.add(str2);
        }
        List<String> listL = b.l(str6);
        ArrayList arrayList = null;
        String strE = k.e(com.safedk.android.utils.f.E(), str6);
        if (!TextUtils.isEmpty(strE)) {
            arrayList.add("element:ytId:" + strE);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b.a(strK, arrayList2, arrayList3);
        if (z10) {
            arrayListG = null;
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                str6 = str6.replace((String) it.next(), "");
            }
            arrayListG = k.g(str6);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        if (z10) {
            str9 = str5 + b.a(size, strK, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8) + CreativeInfo.aH + size + CreativeInfo.aJ;
        } else {
            str9 = str5;
        }
        Logger.d(f44231k, "parsing admob video prefetch - admob creative ID: " + listG + ", click URLs: " + listB + ", video id: " + strE + ", ad Id: " + str3);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 < size) {
                UnityAdsCreativeInfo unityAdsCreativeInfo = new UnityAdsCreativeInfo(str3, listG.size() > i11 ? listG.get(i11) : null, listB.size() == 0 ? null : listB.get(i11), null, null, str9, null, str4, str, this.f44089t, str7, str8, null);
                if (listB.size() > 1) {
                    Logger.d(f44231k, "parsing admob video prefetch - add click urls to debugInfo: " + listB);
                    unityAdsCreativeInfo.u("clickUrls=" + listB);
                }
                if (i11 < listL.size()) {
                    unityAdsCreativeInfo.H(listL.get(i11));
                    aw.put(listL.get(i11), unityAdsCreativeInfo);
                    Logger.d(f44231k, "parsing admob video prefetch - admob click string: " + listL.get(i11));
                } else {
                    Logger.d(f44231k, "parsing admob video prefetch - click string is empty");
                }
                if (i11 < arrayList2.size()) {
                    String str10 = (String) arrayList2.get(i11);
                    if (str10 != null) {
                        Logger.d(f44231k, "parsing admob video prefetch - calling vast ad parser on ad content: " + str10);
                        a((CreativeInfo) unityAdsCreativeInfo, (String) null, str10, true);
                        unityAdsCreativeInfo.b(false);
                        unityAdsCreativeInfo.d(false);
                        if (TextUtils.isEmpty(unityAdsCreativeInfo.N())) {
                            unityAdsCreativeInfo.i(unityAdsCreativeInfo.O());
                        }
                    } else {
                        Logger.d(f44231k, "parsing admob video prefetch - ad content is not vast ");
                    }
                }
                if (z10) {
                    unityAdsCreativeInfo.ai();
                    if (i11 < arrayList4.size() && arrayList4.get(i11) != null) {
                        unityAdsCreativeInfo.B(b.f44001b + ((String) arrayList4.get(i11)));
                    }
                    if (i11 < arrayList5.size() && arrayList5.get(i11) != null) {
                        unityAdsCreativeInfo.B(b.f44002c + ((String) arrayList5.get(i11)));
                    }
                    if (i11 < arrayList6.size() && arrayList6.get(i11) != null) {
                        unityAdsCreativeInfo.B(b.f44003d + ((String) arrayList6.get(i11)));
                    }
                    if (i11 < arrayList7.size() && arrayList7.get(i11) != null) {
                        unityAdsCreativeInfo.B(b.f44004e + ((String) arrayList7.get(i11)));
                    }
                    if (i11 < arrayList8.size() && arrayList8.get(i11) != null) {
                        unityAdsCreativeInfo.B(b.f44005f + ((String) arrayList8.get(i11)));
                    }
                }
                if (i11 < arrayList3.size() && arrayList3.get(i11) != null) {
                    unityAdsCreativeInfo.B(b.f44006g + ((String) arrayList3.get(i11)));
                }
                unityAdsCreativeInfo.b((List<String>) arrayListG);
                list.add(unityAdsCreativeInfo);
                i10 = i11 + 1;
            } else {
                return;
            }
        }
    }

    private List<String> g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        String strE = k.e(com.safedk.android.utils.f.F(), str);
        if (!TextUtils.isEmpty(strE)) {
            arrayList.add(strE);
            return arrayList;
        }
        return b.a(str2, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        if (!(obj instanceof String)) {
            Logger.d(f44231k, "match info, adInstance is not a String");
            return null;
        }
        String str = (String) obj;
        Logger.d(f44231k, "match info, string: " + str);
        CreativeInfo creativeInfoRemove = aw.remove(str);
        if (creativeInfoRemove != null) {
            Logger.d(f44231k, "match info, click url is: " + creativeInfoRemove.M());
            return creativeInfoRemove;
        }
        return creativeInfoRemove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean zL = l(str);
        if (zL) {
            Logger.d(f44231k, "should follow input stream started, url: " + str);
        }
        return zL;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return l(str) || r(str);
    }

    private boolean l(String str) {
        Iterator<String> it = f44217al.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean r(String str) {
        return str.toLowerCase().contains(f44218am) || str.toLowerCase().contains(f44219an) || str.toLowerCase().contains(f44220ao) || str.toLowerCase().contains(f44221ap) || str.toLowerCase().contains(aq);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        Logger.d(f44231k, "should follow get url started, url: " + str);
        return k.p(str) && this.f44088r.contains(k.q(str));
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
        return ar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
        BrandSafetyEvent.AdFormatType adFormatType;
        CreativeInfo creativeInfo = null;
        if (str4.equals(BrandSafetyUtils.f43547j)) {
            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
        } else if (str4.equals(BrandSafetyUtils.f43548k)) {
            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
        } else if (str4.equals("BANNER") || str4.equals(BrandSafetyUtils.f43551n)) {
            String str5 = str + "_" + str3 + "_com.unity3d.ads";
            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
        } else {
            adFormatType = null;
        }
        if (adFormatType != null && 0 != 0) {
            Logger.d(f44231k, "update CI details from Max, creative id: " + str2 + ", id: " + creativeInfo.L() + ", placement id: " + creativeInfo.F() + ", ad format type: " + adFormatType);
        } else {
            Logger.d(f44231k, "failed to update CI details from Max, creative id: " + str2 + ", ad format: " + str4 + ", ad format type: " + adFormatType + ", CI: " + ((Object) null));
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        return str;
    }

    private String a(ArrayList<String> arrayList, HashSet<String> hashSet, HashMap<String, String> map) {
        String strRemove;
        boolean z10;
        String strRemove2;
        boolean z11;
        for (String str : arrayList) {
            Map<String, String> mapB = k.b(str, false);
            if (mapB != null && str != null) {
                boolean z12 = false;
                String str2 = null;
                String str3 = null;
                boolean z13 = false;
                for (Map.Entry<String, String> entry : mapB.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key != null && value != null) {
                        if (!key.equals("auction_id") && !key.equals("auctionId")) {
                            strRemove = str3;
                            z10 = z13;
                            break;
                        }
                        Iterator<Map.Entry<String, String>> it = aC.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strRemove = str3;
                                z10 = z13;
                                break;
                            }
                            Map.Entry<String, String> next = it.next();
                            if (value.contains(next.getKey())) {
                                strRemove = aC.remove(next.getKey());
                                z10 = true;
                                break;
                            }
                        }
                        if ((key.equals("creative_id") || key.equals("creativeId")) && hashSet.contains(value)) {
                            strRemove2 = map.remove(value);
                            z11 = true;
                        } else {
                            strRemove2 = str2;
                            z11 = z12;
                        }
                        str2 = strRemove2;
                        str3 = strRemove;
                        z12 = z11;
                        z13 = z10;
                    }
                }
                if (z13 && z12 && str3 != null && str3.equals(str2)) {
                    s(str3);
                    return str3;
                }
            }
        }
        Logger.d(f44231k, "getAdIdFromResource: did not find matching ci inside the resource");
        return null;
    }

    private ConcurrentHashMap<String, Integer> a(ConcurrentHashMap<String, Integer> concurrentHashMap) {
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>();
        for (String str : concurrentHashMap.keySet()) {
            if (str != null) {
                concurrentHashMap2.put(str, concurrentHashMap.get(str));
            }
        }
        return concurrentHashMap2;
    }

    private void s(String str) {
        aE.remove(str);
        aD.remove(str);
        for (String str2 : aB.keySet()) {
            if (aB.get(str2) != null) {
                aB.get(str2).remove(str);
            }
        }
    }

    private String a(ArrayList<String> arrayList) {
        if (k.a((Collection<?>) arrayList)) {
            Logger.d(f44231k, "urlsListMatching failed because urls is empty!");
            return null;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMapA = a(aD);
        Logger.d(f44231k, "urlsListMatching: current adIdUrlsCounterMapCopy is: " + concurrentHashMapA);
        for (String str : arrayList) {
            if (!at.contains(str) && !au.contains(str)) {
                Iterator<String> it = aB.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        int length = next.length();
                        int length2 = str.length();
                        if ((length >= length2 && next.startsWith(str)) || (length < length2 && str.startsWith(next))) {
                            if (length != length2) {
                                Logger.d(f44231k, "urlsListMatching: the data url is contained in prefetch url or vice versa, prefetch url is: " + next + " and data url is: " + str);
                            }
                            for (String str2 : aB.get(next)) {
                                int iIntValue = concurrentHashMapA.get(str2).intValue() - 1;
                                if (iIntValue >= 0) {
                                    concurrentHashMapA.put(str2, Integer.valueOf(iIntValue));
                                    if (iIntValue == 0) {
                                        Logger.d(f44231k, "urlsListMatching: reduced counter to 0 for adId: " + str2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i10 = 0;
        for (String str3 : concurrentHashMapA.keySet()) {
            if (str3 != null) {
                if (concurrentHashMapA.get(str3).intValue() == 1) {
                    String str4 = "";
                    for (String str5 : aB.keySet()) {
                        if (!aB.get(str5).contains(str3) || !arrayList.contains(str5)) {
                            str5 = str4;
                        }
                        str4 = str5;
                    }
                    Logger.d(f44231k, "urlsListMatching: reduced adId: " + str3 + " to only 1 url: " + str4);
                }
                int i11 = concurrentHashMapA.get(str3).intValue() == 0 ? i10 + 1 : i10;
                if (i11 > 1) {
                    Logger.d(f44231k, "urlsListMatching: error, found more than one possible matching adId!");
                    return null;
                }
                i10 = i11;
            }
        }
        for (String str6 : concurrentHashMapA.keySet()) {
            if (concurrentHashMapA.get(str6).intValue() == 0) {
                s(str6);
                return str6;
            }
        }
        Logger.d(f44231k, "urlsListMatching: did not find adId with the given urls");
        Logger.d(f44231k, "urlsListMatching: after reduction adIdUrlsCounterMapCopy is: " + concurrentHashMapA);
        return null;
    }

    private String t(String str) {
        for (String str2 : aE.keySet()) {
            if (str.contains(aE.get(str2))) {
                s(str2);
                return str2;
            }
        }
        Logger.d(f44231k, "findInnerAdContent: did not find any adId for the webview - ad id to prefetch map contains ad ids: " + aE.keySet());
        return null;
    }

    private void u(String str) {
        String strRemove = az.remove(str);
        if (strRemove != null) {
            ay.remove(strRemove);
            aA.remove(strRemove);
        } else {
            ay.remove(str);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        if (str == null) {
            return null;
        }
        Logger.d(f44231k, "getAdIdFromResource started");
        String strT = t(str);
        if (strT != null) {
            Logger.d(f44231k, "getAdIdFromResource: matching found via inner prefetch, adId=" + strT);
            u(strT);
            return strT;
        }
        ArrayList<String> arrayListG = k.g(str);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= arrayListG.size()) {
                break;
            }
            arrayListG.set(i11, k.k(arrayListG.get(i11)));
            i10 = i11 + 1;
        }
        String strA = a(arrayListG);
        if (strA != null) {
            Logger.d(f44231k, "getAdIdFromResource: matching found via url list matching, adId=" + strA);
            u(strA);
            return strA;
        }
        HashSet<String> hashSet = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        for (CreativeInfo creativeInfo : ay.values()) {
            hashSet.add(creativeInfo.N());
            map.put(creativeInfo.N(), creativeInfo.L());
        }
        String strA2 = a(arrayListG, hashSet, map);
        if (strA2 == null) {
            return null;
        }
        Logger.d(f44231k, "getAdIdFromResource: matching found via liftoff auctionId and creativeId, adId=" + strA2);
        u(strA2);
        return strA2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return (creativeInfo.h().contains(f44222b) || creativeInfo.h().contains(f44223c)) ? ((long) SafeDK.getInstance().E()) * 2 : SafeDK.getInstance().E();
    }

    private boolean a(String str, String str2, String str3, String str4, String str5) {
        CreativeInfo creativeInfo;
        String strRemove;
        Logger.d(f44231k, "tryToFindCI started: ad id is: " + str2 + " datapts is: " + str + ". interface address: " + str3 + ", result is: " + str4 + " data type: " + str5);
        WebView webViewV = v(str3);
        if (webViewV == null) {
            Logger.d(f44231k, "tryToFindCI: the webview is null, can't match!");
            return false;
        }
        if (!TextUtils.isEmpty(str) && ax.containsKey(str)) {
            creativeInfo = ax.get(str);
        } else {
            creativeInfo = (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && ax.containsKey(str2)) ? ax.get(str2) : null;
        }
        if (creativeInfo == null) {
            Logger.d(f44231k, "tryToFindCI: could not find the Ci inside the map");
            return false;
        }
        Logger.d(f44231k, "tryToFindCI: match found by " + str5 + "! webview address is: " + BrandSafetyUtils.a(webViewV) + " and ad id is: " + str2);
        if (str != null && (strRemove = f44228h.remove(str)) != null) {
            f44227g.remove(strRemove);
        }
        az.remove(str2);
        if (str != null) {
            Logger.d(f44231k, "tryToFindCI: removing datapts with initial = " + str.substring(0, 30) + " with ad id - " + str2);
            aA.remove(str);
            ax.remove(str);
        } else {
            ax.remove(str2);
        }
        if (!com.safedk.android.internal.b.getInstance().isInBackground()) {
            List<CreativeInfo> listE = creativeInfo.ah() ? CreativeInfoManager.e(str2) : null;
            if (listE == null) {
                listE = new ArrayList<>();
                listE.add(creativeInfo);
            }
            for (CreativeInfo creativeInfo2 : listE) {
                creativeInfo2.a((Object) webViewV);
                creativeInfo2.u("MBT=" + str5);
                CreativeInfoManager.a(creativeInfo2, CreativeInfo.f44330l, str2);
            }
            return true;
        }
        Logger.d(f44231k, "tryToFindCI: application is in background, no match will be made");
        return false;
    }

    private WebView v(String str) {
        if (str == null) {
            return null;
        }
        WeakReference<WebView> weakReference = f44225e.get(str);
        if (weakReference == null) {
            Logger.d(f44231k, "tryMatchingInter: interfaceAddressToWebview does not contains the interface address " + str);
            return null;
        }
        WebView webView = weakReference.get();
        if (webView == null) {
            Logger.d(f44231k, "tryMatchingInter: interfaceAddressToWebview with interface: " + str + " contains a webview ref pointing to null");
            return null;
        }
        return webView;
    }

    public boolean a(String str, String str2, String str3) {
        Logger.d(f44231k, "tryMatchingInter started - dataptsToCreativeInfo keys are: " + k.a(ax.keySet(), 20));
        if (str2 == null || ax.size() == 0) {
            return false;
        }
        if (str2.equals(f44214ai)) {
            String str4 = aA.get(str);
            if (str4 != null) {
                Logger.d(f44231k, "tryMatchingInter: datapts is: " + str);
                return a(str, str4, str3, "", f44214ai);
            }
            Logger.d(f44231k, "tryMatchingInter: dataptsToAdId does not contains the ad id, it only has the ad ids values - " + aA.values());
            return false;
        }
        if (str2.equals(O)) {
            String str5 = az.get(str);
            Logger.d(f44231k, "tryMatchingInter: ad id is: " + str);
            return a(str5, str, str3, "", O);
        }
        if (!str2.equals("auctionId")) {
            return false;
        }
        Logger.d(f44231k, "tryMatchingInter started - auctionIdToAdId is: " + aC);
        String str6 = aC.get(str);
        return a(str6 != null ? az.get(str6) : null, str6, str3, str, "auctionId");
    }

    private String w(String str) {
        return null;
    }

    private boolean i(String str, String str2) {
        return false;
    }

    public HashSet<String> a(String str, String str2, String str3, int i10) {
        HashSet<String> hashSet = new HashSet<>();
        Logger.d(f44231k, "getPatternFromData: pattern name is: " + str3 + " pattern: " + str2 + ", groupNumber: " + i10);
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                if (matcher.groupCount() >= i10 && !TextUtils.isEmpty(matcher.group(i10))) {
                    hashSet.add(matcher.group(i10));
                }
            }
        } catch (Throwable th2) {
            Logger.d(f44231k, "getPatternFromData: exception occurred with message: " + th2.getMessage());
        }
        if (hashSet.size() == 0) {
            Logger.d(f44231k, "getPatternFromData: pattern " + str2 + ", was not found in data");
        }
        return hashSet;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(String str, String str2) {
        Logger.d(f44231k, "handleInvocation unity started with interface address: " + str2);
        if (!str.startsWith("[[\"com.unity3d.services.core.api.") && !str.startsWith("[[\"com.unity3d.services.ads.api.")) {
            Logger.d(f44231k, "handleInvocation: data starts with " + str.substring(0, 25));
            return false;
        }
        List listAsList = Arrays.asList("sending (.*?) (start|impression|undefined impression|paused|resume) event to (.*?)[\\?&\"]data=(.*?)[\"&\\s]");
        List listAsList2 = Arrays.asList(f44214ai);
        List listAsList3 = Arrays.asList(4);
        int i10 = 0;
        Iterator it = listAsList.iterator();
        while (true) {
            int i11 = i10;
            if (it.hasNext()) {
                String str3 = (String) it.next();
                String str4 = (String) listAsList2.get(i11);
                HashSet<String> hashSetA = a(str, str3, str4, ((Integer) listAsList3.get(i11)).intValue());
                if (hashSetA.size() > 0) {
                    Logger.d(f44231k, "handle invocation: for pattern: " + str4 + " data found are: " + hashSetA);
                }
                for (String str5 : hashSetA) {
                    if (!TextUtils.isEmpty(str5)) {
                        boolean z10 = false;
                        if (str4.equals(f44214ai) && ax.containsKey(str5)) {
                            z10 = true;
                        } else if (str4.equals(f44214ai)) {
                            Logger.d(f44231k, "handleInvocation: datapts initial: " + str5.substring(0, 20) + " and length: " + str5.length() + " that was found is not in our map");
                        } else if (str4.equals(O) && az.get(str5) != null) {
                            z10 = true;
                        } else if (str4.equals(O)) {
                            Logger.d(f44231k, "handleInvocation: ad id initial: " + str5.substring(0, 20) + " and length: " + str5.length() + " that was found is not in our map");
                            Logger.d(f44231k, "handleInvocation: current ad id (rs) stored are: " + k.a(az.keySet(), 20));
                        } else if (str4.equals("auctionId") && aC.get(str5) != null) {
                            String str6 = aC.get(str5);
                            if (str6 != null) {
                                z10 = true;
                            }
                            Logger.d(f44231k, "handleInvocation: using auction id, the ad id is: " + str6 + " and ad id to interface map is: " + f44226f);
                        } else if (str4.equals("auctionId")) {
                            Logger.d(f44231k, "handleInvocation: auction id initial: " + str5.substring(0, 20) + " and length: " + str5.length() + " that was found is not in our map");
                            Logger.d(f44231k, "handleInvocation: auction ids stored are: " + k.a(aC.keySet(), 20));
                        }
                        if (z10) {
                            Logger.d(f44231k, "handleInvocation: found relevant data target address is: " + str2 + ", and " + str4 + " is: " + str5);
                            if (a(str5, str4, str2)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i10 = i11 + 1;
            } else {
                Logger.d(f44231k, "handleInvocation: did not find relevant data");
                return false;
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, WebView webView) {
        Logger.d(f44231k, "handleWebviewInterfaceInvoke: started");
        f44225e.put(str, new WeakReference<>(webView));
        if (webView == null) {
            Logger.d(f44231k, "handleWebviewInterfaceInvoke: temporarily added interface address: " + str + " with WebView: null");
            f44229i.push(str);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
        Logger.d(f44231k, "storeWebviewOnDataLoaded: started");
        if (f44229i.size() == 0) {
            Logger.d(f44231k, "storeWebviewOnDataLoaded: interfaceAddresses size is 0");
            return;
        }
        String strPop = f44229i.pop();
        WeakReference<WebView> weakReference = f44225e.get(strPop);
        if (weakReference != null && weakReference.get() == null) {
            f44225e.put(strPop, new WeakReference<>(webView));
            Logger.d(f44231k, "storeWebviewOnDataLoaded: found interface address: " + strPop + " for webview with address: " + BrandSafetyUtils.a(webView));
        } else {
            Logger.d(f44231k, "storeWebviewOnDataLoaded: webview reference is null or points to null!");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        Logger.d(f44231k, "clear old CIs started");
        super.i();
        com.safedk.android.utils.e.a(ax, "UnityAdsDiscovery:dataptsToCreativeInfo", false);
        com.safedk.android.utils.e.a(aw, "UnityAdsDiscovery:scarAdmobKeyToCreativeInfo", false);
        com.safedk.android.utils.e.a(ay, "UnityAdsDiscovery:dataptsToCreativeInfoBanners", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean b(VastAdTagUri vastAdTagUri) {
        if (super.b(vastAdTagUri)) {
            return true;
        }
        if (vastAdTagUri.toString().contains("%3A")) {
            vastAdTagUri = new VastAdTagUri(vastAdTagUri.toString().replace("%3A", StringUtils.PROCESS_POSTFIX_DELIMITER));
        }
        return super.b(vastAdTagUri);
    }
}
