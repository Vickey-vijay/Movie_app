package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {
    private static final String A = "target_url";
    private static final String B = "video";
    private static final String C = "endcard";
    private static final String D = "video_url";
    private static final String E = "cover_url";
    private static final String F = "media_ext";
    private static final String G = "request_id";
    private static final String H = "playable";
    private static final String I = "playable_url";
    private static final String J = "icon";
    private static final String K = "image";
    private static final String L = "dsp_vast";
    private static final String M = "url";
    private static final String N = "title";
    private static final String O = "description";
    private static final String P = "null";
    private static final String Q = "app";
    private static final String R = "/playable";
    private static final String T = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var lookForPrivacyPolicy=function(){try{var isPrivacyPolicy=document.getElementsByClassName(\"renderer-policy-dialog__container\").length>0;if(isPrivacyPolicy){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};lookForPrivacyPolicy();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){lookForPrivacyPolicy()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44191b = "@!1:ad_fetch@!";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44192c = "non-app";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44193d = "PangleDiscovery";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44194e = "com.applovin.mediation.adapters.ByteDanceMediationAdapter";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44195f = "creatives";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44196g = "is_playable";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44197h = "ext";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44198i = "ad_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44199j = "ad_slot_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44200k = "rit";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44201l = "creative_id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44202w = "is_dsp_ad";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44203x = "app";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44204y = "package_name";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44205z = "download_url";
    private final Map<String, CreativeInfo> W;
    private final Map<String, CreativeInfo> X;
    private final Map<String, CreativeInfo> Y;
    private static final String[] S = {"pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com"};
    private static final String[] U = {C3426d4.i.G, "thumbnail"};
    private static final String[] V = {"app_version", "app_name", "developer_name", "orientation", "height", "width", "aspect_ratio", "lp", "is_pre_render"};

    public j() {
        super(g.f44975u, f44193d, false);
        this.W = new ConcurrentHashMap();
        this.X = new ConcurrentHashMap();
        this.Y = new ConcurrentHashMap();
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f44086p.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.f44086p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.f44086p.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, true);
        this.f44086p.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, T);
        Logger.d(f44193d, "PangleDiscovery ctor created");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected synchronized List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        List<CreativeInfo> listL;
        k.b(f44193d, "generate info url: " + str + " , headers: " + (map != null ? map.toString() : "null") + ", buffer size: " + (str2 == null ? "0" : Integer.valueOf(str2.length())));
        if (str.equals("@!1:ad_fetch@!")) {
            listL = l(str2);
        } else {
            listL = null;
        }
        return listL;
    }

    private List<CreativeInfo> l(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (k.v(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f44195f)) {
                JSONArray jSONArray = jSONObject.getJSONArray(f44195f);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    CreativeInfo creativeInfoA = a(str, jSONArray.getJSONObject(i10));
                    if (creativeInfoA != null) {
                        arrayList.add(creativeInfoA);
                    }
                }
            } else {
                CreativeInfo creativeInfoA2 = a(str, jSONObject);
                if (creativeInfoA2 != null) {
                    arrayList.add(creativeInfoA2);
                }
            }
        }
        Logger.d(f44193d, "generate info - not a valid JSON string");
        return arrayList;
    }

    private CreativeInfo a(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        if (jSONObject.has(f44197h)) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(f44197h));
            jSONObject2.optString("ad_id", null);
            String strOptString = jSONObject2.optString(f44200k, null);
            String strOptString2 = jSONObject2.optString("creative_id", null);
            jSONObject2.optBoolean(f44202w, false);
            BrandSafetyUtils.AdType adType = jSONObject2.optInt(f44199j, 0) == 1 ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.INTERSTITIAL;
            String strOptString3 = null;
            if (jSONObject.has(F)) {
                strOptString3 = jSONObject.getJSONObject(F).optString("request_id", null);
            }
            String strOptString4 = null;
            String strDecode = null;
            String str3 = f44192c;
            if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                strOptString4 = jSONObject3.optString("package_name", null);
                strDecode = jSONObject3.optString("download_url", null);
                str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            }
            String strOptString5 = jSONObject.optString(A, null);
            if (strDecode == null) {
                strDecode = strOptString5;
            }
            boolean zOptBoolean = jSONObject.optBoolean(f44196g, false);
            String str4 = zOptBoolean ? str3 + R : str3;
            String strOptString6 = null;
            if (!jSONObject.has("video")) {
                str2 = null;
            } else {
                JSONObject jSONObject4 = jSONObject.getJSONObject("video");
                String strOptString7 = jSONObject4.optString("endcard", null);
                strOptString6 = jSONObject4.optString("video_url", null);
                str2 = strOptString7;
            }
            String strOptString8 = jSONObject.optString(I, null);
            if (strOptString8 == null && jSONObject.has("playable")) {
                strOptString8 = jSONObject.getJSONObject("playable").optString(I, null);
            }
            if (strOptString8 == null) {
                strOptString8 = jSONObject2.optString(I, null);
            }
            String str5 = "null".equals(strOptString8) ? null : strOptString8;
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("image")) {
                JSONArray jSONArray = jSONObject.getJSONArray("image");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getJSONObject(i10).optString("url", null));
                }
            }
            PangleCreativeInfo pangleCreativeInfo = new PangleCreativeInfo(adType, strOptString3, strOptString2, strDecode, strOptString6, str5, zOptBoolean, strOptString, this.f44089t, strOptString4, str4);
            Logger.d(f44193d, "generate info - CI created: " + pangleCreativeInfo);
            ArrayList<String> arrayListG = k.g(str);
            if (jSONObject.has(L)) {
                a((CreativeInfo) pangleCreativeInfo, (String) null, jSONObject.getString(L), true);
                pangleCreativeInfo.c("vast");
            } else {
                if (strOptString6 != null) {
                    arrayListG.remove(strOptString6);
                }
                pangleCreativeInfo.b((List<String>) arrayListG);
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str6 : arrayListG) {
                for (String str7 : S) {
                    if (str6.contains(str7)) {
                        arrayList2.add(str6);
                        break;
                    }
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            pangleCreativeInfo.c(arrayList2);
            if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (str2 != null) {
                    String strA = k.a(k.a(k.E(str2), V), U);
                    Logger.d(f44193d, "generate info - keep interstitial CI by end-card: " + strA);
                    this.X.put(strA, pangleCreativeInfo);
                }
                if (!TextUtils.isEmpty(strOptString5)) {
                    String strReplace = k.E(strOptString5).replace("/?", "?");
                    Logger.d(f44193d, "generate info - keep interstitial CI by target url: " + strReplace);
                    this.X.put(strReplace, pangleCreativeInfo);
                }
                if (strDecode != null) {
                    try {
                        strDecode = URLDecoder.decode(strDecode, "UTF-8");
                    } catch (Throwable th2) {
                    }
                    String strA2 = k.a(strDecode, U);
                    Logger.d(f44193d, "generate info - keep interstitial CI by click url: " + strA2);
                    this.W.put(strA2, pangleCreativeInfo);
                }
            } else {
                this.Y.put(strOptString3, pangleCreativeInfo);
            }
            Logger.d(f44193d, "generateInfoImpl keep interstitial CI with adId: " + strOptString3);
            this.Y.put(strOptString3, pangleCreativeInfo);
            return pangleCreativeInfo;
        }
        Logger.d(f44193d, "generate info 'ext' element is missing");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        String strA = k.a(str, U);
        if (this.W.containsKey(strA)) {
            return true;
        }
        return this.X.containsKey(k.a(strA, V).replace("/?", "?"));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return f44194e;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        Logger.d(f44193d, "get ad ID from resource started, bufferValue = " + str + ", url =" + str2);
        if (str2 == null) {
            return null;
        }
        String strReplace = k.a(k.a(str2, U), V).replace("/?", "?");
        PangleCreativeInfo pangleCreativeInfo = (PangleCreativeInfo) this.X.get(strReplace);
        if (pangleCreativeInfo != null) {
            if (pangleCreativeInfo.h() != null && pangleCreativeInfo.h().contains(f44192c)) {
                pangleCreativeInfo.a(true);
            }
            Logger.d(f44193d, "get ad ID from resource - found interstitial CI by end card: " + strReplace);
            return pangleCreativeInfo.L();
        }
        try {
            str2 = URLDecoder.decode(str2, "UTF-8");
        } catch (Throwable th2) {
        }
        String strA = k.a(str2, U);
        PangleCreativeInfo pangleCreativeInfo2 = (PangleCreativeInfo) this.W.get(strA);
        if (pangleCreativeInfo2 == null) {
            return null;
        }
        Logger.d(f44193d, "get ad ID from resource - found interstitial CI by click url: " + strA);
        return pangleCreativeInfo2.L();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (view == null) {
            Logger.d(f44193d, "Ad View view is null");
            return false;
        }
        if (!(view instanceof NativeExpressView) && !view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout") && !view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.view.OpenScreenAdVideoExpressView") && !view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.view.OpenScreenAdExpressView") && !view.getClass().getName().startsWith("com.bytedance.sdk.openadsdk.core.video.nativevideo")) {
            return false;
        }
        Logger.d(f44193d, "Ad View identified : " + view.getClass().getName());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String k() {
        return g.f44975u;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String c(Object obj) {
        Object obj2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey("request_id") && (obj2 = map.get("request_id")) != null) {
                Logger.d(f44193d, "extract ad info - request ID: " + obj2);
                return obj2.toString();
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(f44193d, "match info adInstance - " + obj.getClass().getName() + ": " + obj + ", hashes: " + this.Y.keySet());
        if (obj instanceof String) {
            k.b(f44193d, "match info find ci started, creative infos by id: " + this.Y.toString() + ", creative infos by endcard: " + this.X.toString());
            String str = (String) obj;
            CreativeInfo creativeInfo = this.Y.get(str);
            if (creativeInfo != null) {
                k.b(f44193d, "match info adInstance - MATCH FOUND, CI: " + creativeInfo);
                return creativeInfo;
            }
            for (CreativeInfo creativeInfo2 : this.X.values()) {
                k.b(f44193d, "match info find ci checking ci: " + creativeInfo2);
                if (creativeInfo2.L().equals(str)) {
                    k.b(f44193d, "match info find ci MATCH FOUND, ci: " + creativeInfo2);
                    return creativeInfo2;
                }
            }
            Logger.d(f44193d, "match info find ci no match cannot match with creative id: " + str);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        l(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
        l(view);
    }

    private boolean k(View view) {
        int iIntValue;
        int identifier = SafeDK.getInstance().l().getResources().getIdentifier("tt_reward_full_feedback", "drawable", SafeDK.getInstance().l().getPackageName());
        if (!(view instanceof ShadowImageView)) {
            iIntValue = -1;
        } else {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mResource");
                declaredField.setAccessible(true);
                iIntValue = ((Integer) declaredField.get(view)).intValue();
            } catch (Exception e10) {
                Logger.d(f44193d, "on view clicked - could not get mResource from ShadowImageView");
                iIntValue = -1;
            }
        }
        return iIntValue == identifier;
    }

    private void l(View view) {
        int identifier = SafeDK.getInstance().l().getResources().getIdentifier("tt_top_dislike", "id", SafeDK.getInstance().l().getPackageName());
        int identifier2 = SafeDK.getInstance().l().getResources().getIdentifier("tt_ad_endcard_logo", "id", SafeDK.getInstance().l().getPackageName());
        Logger.d(f44193d, "on view clicked - ttTopDislikeResId: " + identifier + ", ttAdEndcardLogoResId: " + identifier2);
        boolean z10 = view.getParent() instanceof DynamicDislikeFeedBack;
        if (view.getId() == identifier || (view.getParent() instanceof TopLayoutDislike2) || z10) {
            Logger.d(f44193d, "on view clicked - view type is: " + view.getClass().getName());
            if ((view instanceof ShadowTextView) || k(view) || z10) {
                String strA = BrandSafetyUtils.a(view);
                Logger.d(f44193d, "on view clicked - clicked the 'top dislike' ShadowTextView. Stop taking screenshot for current impression");
                com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f43641q, new ImpressionLog.a[0]);
                CreativeInfoManager.d(g.f44975u, strA);
                return;
            }
            Logger.d(f44193d, "on view clicked - clicked view is not of type 'ShadowTextView'. exiting function");
            return;
        }
        if (view.getId() == identifier2) {
            Logger.d(f44193d, "on view clicked - view type is =" + view.getClass().getName());
            if (view instanceof TextView) {
                Logger.d(f44193d, "on view clicked - clicked the 'ad endcard logo' TextView. Stop taking screenshot for current impression");
                CreativeInfoManager.d(g.f44975u, BrandSafetyUtils.a(view));
                return;
            } else {
                Logger.d(f44193d, "on view clicked - clicked view is not of type 'TextView'. exiting function");
                return;
            }
        }
        Logger.d(f44193d, "on view clicked - clicked view is not the 'top dislike' nor 'ad end-card logo' view.");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.Y, "PangleDiscovery:creativeInfosById", false);
        com.safedk.android.utils.e.a(this.X, "PangleDiscovery:creativeInfosByEndcard", false);
        com.safedk.android.utils.e.a(this.W, "PangleDiscovery:creativeInfosByClickUrl", false);
    }
}
