package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends d {
    private static final String A = "creative_id";
    private static final String B = "callToActionDest";
    private static final String C = "callToActionUrl";
    private static final String D = "info";
    private static final String E = "impression auctioned but unsold";
    private static final String F = "request is rejected by filter";
    private static final String G = "url";
    private static final String H = "ORIGINAL_VIDEO_URL";
    private static final String I = "showCloseIncentivized";
    private static final int J = 9999;
    private static final String K = "placement_reference_id";
    private static final String L = "cacheable_replacements";
    private static final String M = "MAIN_VIDEO";
    private static final String N = "postBundle";
    private static final String O = "templateURL";
    private static final String P = "template_type";
    private static final String Q = "expiry";
    private static final String R = "com.applovin.mediation.adapters.VungleMediationAdapter";
    private static final String S = "adType";
    private static final String T = "ad_type";
    private static final String U = "banner";
    private static final String V = "mrec";
    private static final String W = "native";
    private static final String X = "fullscreen";
    private static final String Y = "placements";
    private static final String Z = "reference_id";
    private static final long aA = 259200000;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44237aa = "is_incentivized";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f44238ab = "tpat";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f44239ac = "templateSettings";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f44240ad = "template_settings";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f44241ae = "normal_replacements";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f44242af = "clickUrl";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f44243ag = "ad_market_id";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f44244ah = "APP_STORE_ID";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f44245ai = "CTA_BUTTON_URL";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f44246aj = "EC_CTA_URL";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f44247ak = "https://privacy.vungle.com/";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f44248al = "vungle.com";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f44249am = "adunit";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f44250an = "AD_SOURCE";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f44251ao = "ADVERTISER_DOMAIN";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f44252ap = "ads";
    private static final String aq = "APP_NAME";
    private static final String ar = "APP_DESCRIPTION";
    private static final String as = "CTA_BUTTON_TEXT";
    private static final String at = "MAIN_IMAGE";
    private static final String au = "APP_ICON";
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> av = null;
    private static PersistentConcurrentHashMap<Integer, VungleCreativeInfo> aw = null;
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> ax = null;
    private static PersistentConcurrentHashMap<String, Boolean> ay = null;
    private static final Map<String, WeakReference<Object>> az = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44253b = "MAIN_VIDEO.mp4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44254c = "ad_markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44255d = "com.vungle.warren.BuildConfig";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44256e = "VERSION_NAME";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44257f = "ADM_HTML";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44258g = "adx.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44259h = "api.vungle.com/api/v";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44260i = "adx-stage.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44261j = "api.vungle.com/config";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44262k = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{console.log(\"log Vungle privacy policy sdkId : \"+sdkId+\",address = \"+address+\", msg : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"Vungle-Liftoff detect privacy ,address \"+message)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkDebug object missing\")}}catch(error){console.log(\"log : \"+error)}};log(\"script started sdkId = \"+sdkId+\", address = \"+address);var addPrivacyObservers=function(){try{log(\"trying with DIALOGBOX\");var dialogboxElement=document.getElementById(\"DIALOGBOX\");if(!dialogboxElement){log(\"trying again with privacy-dialog\");dialogboxElement=document.getElementById(\"privacy-dialog\")}if(!dialogboxElement){log(\"trying again with privacy-popup\");dialogboxElement=document.getElementById(\"privacy-popup\")}if(!dialogboxElement){log(\"trying again with privacy-page\");dialogboxElement=document.getElementById(\"privacy-page\")}if(!dialogboxElement){log(\"trying again with privacy-popup by class \");var elements=document.querySelectorAll(\"div#privacy-popup\");if(elements&&elements.length>0){log(\"found by class : \"+JSON.stringify(elements[0]));dialogboxElement=elements[0]}}log(\"dialogboxElement = \"+dialogboxElement);try{log(\"dialogboxElement = \"+JSON.stringify(dialogboxElement))}catch(error){log(\"dialogboxElement error \"+error)}if(dialogboxElement.hasAttribute(\"id\")){log(\"dialogboxElement.id ? \"+dialogboxElement.id)}if(dialogboxElement.hasAttribute(\"aria-hidden\")){log(\"dialogboxElement.aria-hidden ? \"+dialogboxElement.getAttribute(\"aria-hidden\"))}if(dialogboxElement&&(dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\")){log(\"found element \"+JSON.stringify(dialogboxElement));var element_style_visibility=dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\"&&dialogboxElement.classList.contains(\"ytoTpW_show\");if(element_style_visibility){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}log(\"element is visible\")}else{log(\"element is not visible\");{dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":log(\"Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");if(getComputedStyle(mutation.target).visibility==\"visible\"||mutation.target.classList.contains(\"ytoTpW_show\")){log(\"privacy dialog is visible \");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}}}}else{var privacyPageElement=document.getElementById(\"privacy-page\");if(privacyPageElement){var privacyPageParentElement=privacyPageElement.parentElement;if(privacyPageParentElement){var computedStyle=getComputedStyle(privacyPageParentElement);if(computedStyle){var displayState=computedStyle.display;if(displayState!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{{privacyPageParentElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.style.display!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,childList:true,subtree:true};observer.observe(privacyPageParentElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}}}}}}}}}catch(error){log(\"caught exception with error = \"+error+\", stack : \"+error.stack);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var addAdClosureObservers=function(){try{log(\"trying with incentivized-dialog\");var dialogboxElement=document.getElementById(\"incentivized-dialog\");if(dialogboxElement&&dialogboxElement.style&&dialogboxElement.style.visibility){log(\"found element \");var element_style_visibility=dialogboxElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}log(\"element is visible\")}else{log(\"element is not visible\");if(dialogboxElement.safedkPrivacyDialogObserver!=true){dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}log(\"Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}log(\"Error : \"+\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var monitorNotifications=function(){try{var divIds=[\"ad-notification-modal\",\"gdpr-notification-view\"];for(var divId of divIds){var element=document.getElementById(divId);if(element){var className=element.className;if(element.className.endsWith(\"show\")){log(\"element.className = \"+element.className);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{if(element.safedkVisibilityObserver!=true){element.safedkVisibilityObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){if(mutation.type==\"attributes\"){if(mutation.target.className.endsWith(\"show\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"class\"]};observer.observe(element,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}};addPrivacyObservers();addAdClosureObservers();monitorNotifications();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){for(const mutation of mutations){if(mutation.type===\"childList\"){log(\"A child node has been added or removed.\")}else if(mutation.type===\"attributes\"){log(mutation.attributeName+\" attribute was modified to \"+mutation.target.getAttribute(mutation.attributeName))}}mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];log(\"node iteration \"+i+\" : \"+JSON.stringify(node));if(node&&node.nodeName!=\"#text\"){addPrivacyObservers();addAdClosureObservers();monitorNotifications()}}})});var config={attributes:true,childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}})();\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44263l = "mraid://";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44264w = "url";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44265x = "VungleDiscovery";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44266y = "id";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44267z = "campaign";

    public m() {
        super(g.f44958d, f44265x, true);
        try {
            av = new PersistentConcurrentHashMap<>("VungleDiscoverycreativeToIdMap");
            Logger.d(f44265x, "CI to ID map loaded, key set: " + av.keySet());
            aw = new PersistentConcurrentHashMap<>("VungleDiscoverymediaPlayerIdToCreativeInfo");
            Logger.d(f44265x, "media player to CI loaded, key set: " + aw.keySet());
            ax = new PersistentConcurrentHashMap<>("VungleDiscoveryadToIdMap");
            Logger.d(f44265x, "ad to ID map loaded, key set: " + ax.keySet());
            ay = new PersistentConcurrentHashMap<>("VungleDiscoveryplacementData");
            Logger.d(f44265x, "placement data loaded, key set: " + ay.keySet());
        } catch (InvalidParameterException e10) {
            Logger.e(f44265x, "Error initializing VungleDiscovery, caching will not be available", e10);
        }
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f44086p.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, f44262k);
        this.f44086p.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, aA);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f44086p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f44086p.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.f44086p.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, true);
        this.f44086p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        CreativeInfo creativeInfoA;
        k.b(f44265x, "generate info started, url: " + str + ", buffer: " + str2 + ", maxParams: " + aVar);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (str.contains(f44261j)) {
                k.b(f44265x, "Config request intercepted: " + str2);
                l(str2);
                return null;
            }
            if (CreativeInfoManager.g(str) || str.equals("@!1:ad_fetch@!")) {
                Logger.d(f44265x, "Url is a mediation url");
                if (jSONObject.has(f44249am)) {
                    Logger.d(f44265x, "content contains an AdUnit field");
                    String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f44249am), 0));
                    k.b(f44265x, "decodedAdUnitContent = " + strA);
                    if (k.v(strA)) {
                        JSONObject jSONObject2 = new JSONObject(strA);
                        Logger.d(f44265x, "decodedAdUnitContent new JSONObject created");
                        jSONObject = jSONObject2;
                    }
                }
            }
            boolean z10 = aVar != null && aVar.f44057b == BrandSafetyEvent.AdFormatType.NATIVE;
            if (jSONObject.has("id")) {
                CreativeInfo creativeInfoA2 = a(jSONObject, (String) null, z10);
                if (creativeInfoA2 != null) {
                    if (!creativeInfoA2.K().equals(BrandSafetyUtils.AdType.NATIVE)) {
                        arrayList.add(creativeInfoA2);
                        av.put(creativeInfoA2.N(), (VungleCreativeInfo) creativeInfoA2);
                        Logger.d(f44265x, "ci to ID map key added " + creativeInfoA2.N() + ", key set: " + av.keySet());
                        creativeInfoA2.f(aVar.f44056a);
                    } else {
                        Logger.d(f44265x, "ci is a native ad, skipping: " + creativeInfoA2);
                    }
                    arrayList.add(creativeInfoA2);
                    av.put(creativeInfoA2.N(), (VungleCreativeInfo) creativeInfoA2);
                    Logger.d(f44265x, "ci to ID map key added " + creativeInfoA2.N() + ", key set: " + av.keySet().toString());
                }
            } else if (jSONObject.has("ads")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ads");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(f44254c);
                    String string = jSONObject3.getString(K);
                    if (b(jSONObject3) && (creativeInfoA = a(jSONObject4, string, z10)) != null) {
                        arrayList.add(creativeInfoA);
                        av.put(creativeInfoA.N(), (VungleCreativeInfo) creativeInfoA);
                        Logger.d(f44265x, "ci to ID map key added " + creativeInfoA.N() + ", key set: " + av.keySet());
                        if (z10) {
                            creativeInfoA.f(aVar.f44056a);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Logger.d(f44265x, "Exception parsing prefetch : " + th2.getMessage(), th2);
        }
    }

    private void l(String str) throws JSONException {
        k.b(f44265x, "process placements started, buffer = " + str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("placements")) {
            JSONArray jSONArray = jSONObject.getJSONArray("placements");
            for (int i10 = 0; i10 < jSONArray.length() - 1; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.has(Z) && jSONObject2.has(f44237aa)) {
                    ay.put(jSONObject2.getString(Z), Boolean.valueOf(jSONObject2.getBoolean(f44237aa)));
                    Logger.d(f44265x, "process placements added " + jSONObject2.getString(Z) + " : " + jSONObject2.getBoolean(f44237aa));
                } else {
                    Logger.d(f44265x, "process placements placement does not contains ref_id/is_incentivized data : " + jSONObject2);
                }
            }
            return;
        }
        Logger.d(f44265x, "process placements no placements array");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(f44265x, "match info - started. ad instance= " + obj);
        Logger.d(f44265x, "match info - creative id to ci keys: " + av.keySet());
        if (obj instanceof String) {
            String strA = (String) obj;
            if (k.v(strA)) {
                try {
                    strA = a(new JSONObject(strA));
                } catch (JSONException e10) {
                    Logger.d(f44265x, "match info - exception: " + e10);
                }
            }
            Logger.d(f44265x, "match info - started. ad id found= " + strA);
            if (!TextUtils.isEmpty(strA)) {
                VungleCreativeInfo vungleCreativeInfo = ax.get(strA);
                Logger.d(f44265x, "match info - FOUND by ad id= " + obj + ",    ci= " + vungleCreativeInfo);
                return vungleCreativeInfo;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        VungleCreativeInfo vungleCreativeInfo = ax.get(str);
        WeakReference<Object> weakReferenceRemove = az.remove(str);
        Logger.d(f44265x, "try reverse matching - value= " + str + ",   matching ref= " + weakReferenceRemove + ",    ci= " + vungleCreativeInfo);
        if (vungleCreativeInfo != null && vungleCreativeInfo.K() == BrandSafetyUtils.AdType.NATIVE && weakReferenceRemove != null) {
            CreativeInfoManager.b(g.f44958d, str, weakReferenceRemove.get());
            return false;
        }
        return false;
    }

    private String a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.has(f44249am)) {
                String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f44249am), 0));
                if (k.v(strA) && (jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("ads")) != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.getJSONObject(0).optJSONObject(f44254c)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    Logger.d(f44265x, "get ad id from prefetch - ad id found= " + strOptString);
                    return strOptString;
                }
            }
        } catch (JSONException e10) {
            Logger.d(f44265x, "get ad id from prefetch - exception: " + e10);
        }
        Logger.d(f44265x, "get ad id from prefetch - could not find ad id");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
        Logger.d(f44265x, "save matching object for reverse matching - matching object= " + obj2);
        if (obj instanceof String) {
            String str = (String) obj;
            if (k.v(str)) {
                try {
                    String strA = a(new JSONObject(str));
                    if (!TextUtils.isEmpty(strA) && obj2 != null) {
                        az.put(strA, new WeakReference<>(obj2));
                        Logger.d(f44265x, "save matching object for reverse matching - saving ad id= " + strA + ",     matching object= " + obj2);
                    }
                } catch (JSONException e10) {
                    Logger.d(f44265x, "match info - exception: " + e10);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String strR = r(str2);
        if (strR == null) {
            strR = r(str);
        }
        if (strR == null) {
            return null;
        }
        Logger.d(f44265x, "get ad ID from resource returned ad ID: " + strR);
        return strR;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        try {
            Logger.d(f44265x, "handle media player set data source call, media player: " + obj + ", video file: " + obj2);
            Uri uri = (Uri) obj2;
            Logger.d(f44265x, "handle media player set data source call, uri: " + uri.toString());
            VungleCreativeInfo vungleCreativeInfoA = a(new File(uri.getPath()));
            if (vungleCreativeInfoA != null && !aw.containsKey(Integer.valueOf(System.identityHashCode(obj)))) {
                Logger.d(f44265x, "handle media player set data source call, adding CI to map");
                aw.put(Integer.valueOf(System.identityHashCode(obj)), vungleCreativeInfoA);
            }
        } catch (Exception e10) {
            Logger.e(f44265x, "exception when trying to add mediaPlayer id and VungleCreativeInfo " + e10.getMessage());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        try {
            Logger.d(f44265x, "get CI after media player start call, media player: " + obj);
            VungleCreativeInfo vungleCreativeInfoRemove = aw.remove(Integer.valueOf(System.identityHashCode(obj)));
            if (vungleCreativeInfoRemove != null) {
                if (av.remove(vungleCreativeInfoRemove.N()) == null) {
                    Logger.d(f44265x, "Cannot find " + vungleCreativeInfoRemove.N() + " in creative to ID map");
                } else {
                    Logger.d(f44265x, "creative to ID map key '" + vungleCreativeInfoRemove.N() + "'removed, key set: " + av.keySet().toString());
                }
                Logger.d(f44265x, "get CI after media player start call - returning " + vungleCreativeInfoRemove.L() + " as ad ID");
                return vungleCreativeInfoRemove.L();
            }
            Logger.d(f44265x, "get CI after media player start call - cannot find creative in media player ID to CI map");
            return null;
        } catch (Exception e10) {
            Logger.e(f44265x, "exception when trying to remove from media player ID to CI map" + e10.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        Logger.d(f44265x, "should follow get url: " + str);
        if (str.toLowerCase().endsWith(f44253b.toLowerCase())) {
            Logger.d(f44265x, "should follow get url - returning true for url: " + str);
            return true;
        }
        if (str.equals(f44247ak)) {
            Logger.d(f44265x, "Vungle privacy policy url invoked");
            CreativeInfoManager.d(g.f44958d, null);
        }
        String strR = r(str);
        if (strR != null && strR.length() > 0) {
            if (ax.containsKey(strR)) {
                Logger.d(f44265x, "ad to ID map contains creative ID: " + strR + ", returning true");
                return true;
            }
            Logger.d(f44265x, "ad to ID map does not contain creative ID: " + strR + " , key set : " + ax.keySet());
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z10 = str.contains(f44258g) || str.contains(f44259h) || str.contains(f44260i) || str.contains(f44261j);
        if (z10) {
            Logger.d(f44265x, "should follow input stream, url: " + str);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:248:0x07ec  */
    private CreativeInfo a(JSONObject jSONObject, String str, boolean z10) throws JSONException {
        JSONObject jSONObject2;
        ArrayList<String> arrayList;
        String str2;
        String str3;
        JSONObject jSONObject3;
        try {
            k.b(f44265x, "get CI from Json object started : " + jSONObject);
            String string = jSONObject.getString("id");
            Logger.d(f44265x, "get CI from Json ad ID: " + string);
            if (string.equals("") && jSONObject.has(D) && (jSONObject.getString(D).equals(E) || jSONObject.getString(D).equals(F))) {
                Logger.d(f44265x, "get CI from Json No fill, exiting");
                return null;
            }
            String strOptString = null;
            ArrayList<String> arrayList2 = new ArrayList<>();
            JSONObject jSONObject4 = null;
            if (jSONObject.has(f44239ac)) {
                jSONObject4 = jSONObject.getJSONObject(f44239ac);
            } else if (jSONObject.has(f44240ad)) {
                jSONObject4 = jSONObject.getJSONObject(f44240ad);
            }
            if (jSONObject4 == null || !jSONObject4.has(f44241ae)) {
                jSONObject2 = null;
                arrayList = arrayList2;
                str2 = null;
                str3 = null;
            } else {
                JSONObject jSONObject5 = jSONObject4.getJSONObject(f44241ae);
                String string2 = jSONObject5.has(f44250an) ? jSONObject5.getString(f44250an) : null;
                String string3 = jSONObject5.has(f44251ao) ? jSONObject5.getString(f44251ao) : null;
                if (jSONObject5.has(f44257f)) {
                    String string4 = jSONObject5.getString(f44257f);
                    if (TextUtils.isEmpty(string4)) {
                        jSONObject2 = jSONObject5;
                        arrayList = arrayList2;
                        str2 = string3;
                        str3 = string2;
                    } else {
                        String str4 = new String(Base64.decode(string4, 0));
                        ArrayList<String> arrayListG = k.g(str4);
                        strOptString = n(str4);
                        k.b(f44265x, "get CI from Json ADM_HTML clickUrl : " + strOptString);
                        jSONObject2 = jSONObject5;
                        arrayList = arrayListG;
                        str2 = string3;
                        str3 = string2;
                    }
                } else {
                    jSONObject2 = jSONObject5;
                    arrayList = arrayList2;
                    str2 = string3;
                    str3 = string2;
                }
            }
            if (!jSONObject.has("tpat")) {
                jSONObject3 = null;
            } else {
                jSONObject3 = jSONObject.getJSONObject("tpat");
            }
            if (strOptString == null && jSONObject2 != null && jSONObject2.has("CTA_BUTTON_URL")) {
                strOptString = jSONObject2.optString("CTA_BUTTON_URL", null);
            }
            if (strOptString == null && jSONObject2 != null && jSONObject2.has(f44246aj)) {
                strOptString = jSONObject2.optString(f44246aj, null);
            }
            if (strOptString == null && jSONObject.has(C)) {
                strOptString = jSONObject.getString(C);
            }
            if (strOptString == null && jSONObject3 != null && jSONObject3.has("clickUrl")) {
                strOptString = jSONObject3.optString("clickUrl", null);
            }
            Logger.d(f44265x, "get CI from Json clickUrl processing " + strOptString);
            if (!TextUtils.isEmpty(strOptString) && k.v(strOptString)) {
                try {
                    JSONArray jSONArray = new JSONArray(strOptString);
                    strOptString = jSONArray.length() > 0 ? (String) jSONArray.get(0) : strOptString;
                } catch (Throwable th2) {
                    Logger.d(f44265x, "get CI from Json clickUrl processing exception :" + th2.getMessage(), th2);
                }
                Logger.d(f44265x, "get CI from Json clickUrl processing unescaped = " + strOptString);
            }
            String str5 = strOptString;
            HashMap<String, String> mapA = a(jSONObject, string);
            if (str5 == null && mapA.containsKey("clickUrl_0")) {
                String str6 = mapA.get("clickUrl_0");
                mapA.remove("clickUrl_0");
                str5 = str6;
            }
            String string5 = null;
            if (jSONObject.has("campaign")) {
                String string6 = jSONObject.getString("campaign");
                if (string6 == null || (string6 != null && string6.equals("null"))) {
                    Logger.d(f44265x, "get CI from Json Campaign is null, exiting");
                    return null;
                }
                string5 = string6.split("\\|")[1];
            } else if (jSONObject.has("creative_id")) {
                string5 = jSONObject.getString("creative_id");
            }
            Logger.d(f44265x, "get CI from Json creativeId is " + string5);
            String string7 = null;
            String string8 = null;
            if (jSONObject.has("url")) {
                string7 = jSONObject.getString("url");
            } else if (jSONObject2.has(H)) {
                string7 = jSONObject2.getString(H);
            }
            if (jSONObject.has(N)) {
                string8 = jSONObject.getString(N);
                Logger.d(f44265x, "get CI from Json zip files bundle identified " + string8 + " in " + N);
            } else if (jSONObject.has(O)) {
                string8 = jSONObject.getString(O);
                Logger.d(f44265x, "get CI from Json zip files bundle identified " + string8 + " in " + O);
            } else {
                Logger.d(f44265x, "get CI from Json zip files bundle not present in prefetch data.");
            }
            if (TextUtils.isEmpty(string7)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f44239ac);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = jSONObject.optJSONObject(f44240ad);
                }
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObject6 = jSONObjectOptJSONObject.getJSONObject(L);
                    if (jSONObject6.has("MAIN_VIDEO")) {
                        string7 = jSONObject6.getJSONObject("MAIN_VIDEO").getString("url");
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis() + this.f44086p.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE);
            Logger.d(f44265x, "get CI from Json expiration initial value (now + 1 week) =  " + jCurrentTimeMillis);
            if (jSONObject.has(Q)) {
                jCurrentTimeMillis = jSONObject.getLong(Q) * 1000;
                Logger.d(f44265x, "get CI from Json expiration override ,  new values is " + jCurrentTimeMillis);
            }
            BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.INTERSTITIAL;
            String strOptString2 = jSONObject.optString(P, null);
            Logger.d(f44265x, "get CI from Json templateType is " + strOptString2);
            if (strOptString2 != null && strOptString2.equals("banner")) {
                adType = BrandSafetyUtils.AdType.BANNER;
            } else if (strOptString2 != null && strOptString2.equals("mrec")) {
                adType = BrandSafetyUtils.AdType.MREC;
            } else if (strOptString2 != null && strOptString2.equals("native")) {
                adType = BrandSafetyUtils.AdType.NATIVE;
            } else if (strOptString2 != null && strOptString2.equals("fullscreen")) {
                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
            }
            String string9 = null;
            if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (str != null && ay.containsKey(str)) {
                    if (ay.get(str).booleanValue()) {
                        string9 = BrandSafetyEvent.AdFormatType.REWARD.toString();
                    } else {
                        string9 = BrandSafetyEvent.AdFormatType.INTER.toString();
                    }
                    Logger.d(f44265x, "get CI from Json process placements placement " + str + " is " + string9);
                } else {
                    Logger.d(f44265x, "get CI from Json process placements data does not contain the placement " + str + ", will try to determine based on REWARDED_VALUE");
                    string9 = jSONObject.optInt(I) == J ? BrandSafetyEvent.AdFormatType.REWARD.toString() : BrandSafetyEvent.AdFormatType.INTER.toString();
                }
            } else if (adType.equals(BrandSafetyUtils.AdType.BANNER)) {
                string9 = BrandSafetyEvent.AdFormatType.BANNER.toString();
            } else if (adType.equals(BrandSafetyUtils.AdType.MREC)) {
                string9 = BrandSafetyEvent.AdFormatType.MREC.toString();
            }
            ArrayList<String> arrayListG2 = k.g(jSONObject.toString());
            if (!TextUtils.isEmpty(str5) && !str5.contains(f44248al)) {
                k.b(f44265x, "get CI from Json clickUrl : " + str5);
            } else {
                str5 = null;
                k.b(f44265x, "get CI from Json clickUrl discarded : " + ((String) null));
            }
            String string10 = null;
            if (jSONObject.has(S)) {
                string10 = jSONObject.getString(S);
            } else if (jSONObject.has("ad_type")) {
                string10 = jSONObject.getString("ad_type");
            }
            if (string10 != null && z10 && !TextUtils.isEmpty(strOptString2)) {
                string10 = string10 + "/" + strOptString2;
            }
            Logger.d(f44265x, "get CI from Json struct : " + string10);
            Logger.d(f44265x, "get CI from Json adtype = " + (adType != null ? adType.name() : "null") + ", id: " + string + ", click url: " + str5 + ", creative id: " + string5 + ", video url: " + string7 + "postBundle = " + (string8 != null ? string8 : ""));
            VungleCreativeInfo vungleCreativeInfo = new VungleCreativeInfo(adType, string, string5, str5, string7, string9, str, this.f44089t, jCurrentTimeMillis, string10);
            if (!z10) {
                vungleCreativeInfo.b((List<String>) arrayListG2);
                vungleCreativeInfo.b((List<String>) arrayList);
            } else {
                a((CreativeInfo) vungleCreativeInfo, jSONObject);
            }
            if (str3 != null) {
                vungleCreativeInfo.k(str3);
            }
            if (str2 != null) {
                vungleCreativeInfo.g(str2);
            }
            Logger.d(f44265x, "get CI from Json - buyer id is: " + str3 + " and ad domain is: " + str2);
            ax.put(string, vungleCreativeInfo);
            if (string7 != null && !z10) {
                vungleCreativeInfo.b(Arrays.asList(string7));
            }
            if (string8 != null && !z10) {
                Logger.d(f44265x, "get CI from Json adding zip files bundle " + string8 + " to prefetch resources");
                vungleCreativeInfo.c(Arrays.asList(string8));
            }
            if (mapA.size() > 0) {
                for (String str7 : mapA.values()) {
                    if (vungleCreativeInfo.v(str7)) {
                        Logger.d(f44265x, "get CI from Json adding url to CI dsp domains: " + str7);
                        vungleCreativeInfo.x(str7);
                    }
                }
            }
            if (vungleCreativeInfo.o() == null && jSONObject.has(B)) {
                a(jSONObject.getString(B), vungleCreativeInfo, B);
            }
            if (vungleCreativeInfo.o() == null && jSONObject.has(C)) {
                a(jSONObject.getString(C), vungleCreativeInfo, C);
            }
            if (vungleCreativeInfo.o() == null && jSONObject.has(f44243ag)) {
                vungleCreativeInfo.q(jSONObject.getString(f44243ag));
                Logger.d(f44265x, "app package name will be updated from ad_market_id to " + jSONObject.getString(f44243ag));
            }
            if (vungleCreativeInfo.o() == null && jSONObject2 != null && jSONObject2.has(f44244ah)) {
                a(jSONObject2.getString(f44244ah), vungleCreativeInfo, f44244ah);
            }
            if (vungleCreativeInfo.o() == null && jSONObject2 != null && jSONObject2.has("CTA_BUTTON_URL")) {
                a(jSONObject2.getString("CTA_BUTTON_URL"), vungleCreativeInfo, "CTA_BUTTON_URL");
            }
            if (vungleCreativeInfo.o() == null && jSONObject2 != null && jSONObject2.has(f44246aj)) {
                a(jSONObject2.getString(f44246aj), vungleCreativeInfo, f44246aj);
            }
            if (vungleCreativeInfo.o() == null && jSONObject3 != null && jSONObject3.has("clickUrl")) {
                Object obj = jSONObject3.get("clickUrl");
                if (obj instanceof String) {
                    a(jSONObject3.getString("clickUrl"), vungleCreativeInfo, "clickUrl");
                    return vungleCreativeInfo;
                }
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("clickUrl");
                    for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                        if (vungleCreativeInfo.o() == null) {
                            a(jSONArray2.getString(i10), vungleCreativeInfo, "clickUrl_" + i10);
                        }
                    }
                    return vungleCreativeInfo;
                }
                return vungleCreativeInfo;
            }
            return vungleCreativeInfo;
        } catch (Throwable th3) {
            Logger.e(f44265x, "get CI from Json object exception: " + th3.getMessage(), th3);
            return null;
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f44239ac);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject(f44240ad);
        }
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(f44241ae);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("APP_NAME");
                if (!TextUtils.isEmpty(strOptString)) {
                    creativeInfo.B(CreativeInfo.aM + strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject2.optString("APP_DESCRIPTION");
                if (!TextUtils.isEmpty(strOptString2)) {
                    creativeInfo.B(CreativeInfo.aP + strOptString2);
                }
                String strOptString3 = jSONObjectOptJSONObject2.optString("CTA_BUTTON_TEXT");
                if (!TextUtils.isEmpty(strOptString3)) {
                    creativeInfo.B(CreativeInfo.aQ + strOptString3);
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(L);
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("MAIN_IMAGE");
                if (jSONObjectOptJSONObject4 != null) {
                    String strOptString4 = jSONObjectOptJSONObject4.optString("url");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        creativeInfo.B(CreativeInfo.aN + strOptString4);
                    }
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("APP_ICON");
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString5 = jSONObjectOptJSONObject5.optString("url");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        creativeInfo.B(CreativeInfo.aO + strOptString5);
                    }
                }
            }
        }
    }

    private void a(String str, VungleCreativeInfo vungleCreativeInfo, String str2) {
        if (str != null) {
            vungleCreativeInfo.q(str);
            Logger.d(f44265x, "app package name will be updated from " + str2 + " to " + str);
        } else {
            Logger.d(f44265x, "app package name from " + str2 + " not valid, skipping value " + str);
        }
    }

    private HashMap<String, String> a(JSONObject jSONObject, String str) {
        HashMap<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has("tpat")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tpat");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    if (jSONObject2.get(string) instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(string);
                        Logger.d(f44265x, "iterating over key '" + string + "' , content: " + jSONArray.toString());
                        if (jSONArray.length() > 0) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                if (!map.values().contains(jSONArray.getString(i10))) {
                                    map.put(string + "_" + i10, jSONArray.getString(i10));
                                    Logger.d(f44265x, "collecting additional url: " + jSONArray.getString(i10));
                                } else {
                                    Logger.d(f44265x, "url already in map. skipping: " + jSONArray.getString(i10));
                                }
                            }
                        }
                    } else {
                        Logger.d(f44265x, "key '" + string + "' is not a JSONArray, skipping");
                    }
                }
            } else {
                Logger.d(f44265x, "tpat key does not exist, exiting");
            }
        } catch (JSONException e10) {
            Logger.e(f44265x, "Error collecting urls under tpat key", e10);
        }
        return map;
    }

    private VungleCreativeInfo a(File file) {
        if (file == null) {
            Logger.d(f44265x, "get ad ID by video file - file is null");
            return null;
        }
        String strR = r(file.getAbsolutePath());
        Logger.d(f44265x, "get ad ID by video file - creative to ID map iteration, looking for '" + strR + "', key set: " + av.keySet().toString());
        if (av != null && strR != null) {
            VungleCreativeInfo vungleCreativeInfoRemove = av.remove(strR);
            if (vungleCreativeInfoRemove != null) {
                Logger.d(f44265x, "get ad ID by video file - CI MATCH! creative found: " + strR);
                return vungleCreativeInfoRemove;
            }
            Iterator<String> it = av.keySet().iterator();
            while (it.hasNext()) {
                VungleCreativeInfo vungleCreativeInfo = av.get(it.next());
                if (vungleCreativeInfo.N().equals(strR)) {
                    Logger.d(f44265x, "get ad ID by video file - CI MATCH! creative found: " + strR);
                    return vungleCreativeInfo;
                }
            }
        }
        Logger.d(f44265x, "get ad ID by video file - creative not found");
        return null;
    }

    private String r(String str) {
        if (str != null && str.split("/").length > 1) {
            String str2 = str.split("/")[str.split("/").length - 2];
            Logger.d(f44265x, "ad ID to be searched: " + str2);
            return str2;
        }
        Logger.d(f44265x, "file path is not according to the expected pattern: " + str + ", cannot extract CreativeId");
        return null;
    }

    private boolean b(JSONObject jSONObject) throws JSONException {
        if (!((JSONObject) jSONObject.get(f44254c)).has(P)) {
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return R;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(av, "VungleDiscovery:creativeToIdMap", false);
        com.safedk.android.utils.e.a(aw, "VungleDiscovery:mediaPlayerIdToCreativeInfo", false);
        com.safedk.android.utils.e.a(ax, "VungleDiscovery:adToIdMap", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str != null && str.startsWith("mraid://")) {
            if (str.contains("open")) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            return null;
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        if (str != null && str.contains("mraid://")) {
            return k.c(str, "url");
        }
        return str;
    }
}
