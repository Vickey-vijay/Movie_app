package com.safedk.android.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.multidex.MultiDexApplication;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.SafeDKApplication;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SafeDKWebAppInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44733a = "SafeDKWebAppInterface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44734b = "status";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44735c = "playing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44736d = "paused";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44737e = "sdk_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44738f = "javascript:";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44739g = "(function(){var isMainFrame=function(){return window.location===window.parent.location};var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface video_observer safedkDebug object missing\")}}catch(error){}};var sdkId=\"{{SDK_ID}}\";var endCardDetected=false;var isElementHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return false};var isElementInEventHidden=function(event){return isElementHidden(event.srcElement)};var getVideoPath=function(event){try{var videoElement=event.srcElement;if(videoElement.tagName!=\"VIDEO\")return null;var path=videoElement.src;if(!path){var sourceNodes=videoElement.getElementsByTagName(\"SOURCE\");for(var sourceNode of sourceNodes){if(sourceNode.src){path=sourceNode.src;break}}}if(path){if(path.length>=200){path=path.substring(0,199)}}return path}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return null};var notifyPlay=function(event){if(!endCardDetected){if(isElementInEventHidden(event))return;event.srcElement.safedkVideoPlaying=true;var message={status:\"playing\",sdk_id:sdkId};var src=getVideoPath(event);if(src)message[\"src\"]=src;log(\"Notifying client that video is playing for sdkId: \"+sdkId+\", video ID: \"+event.srcElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var notifyPause=function(event){if(!endCardDetected){event.srcElement.safedkVideoPlaying=false;var message={status:\"paused\",sdk_id:sdkId};var src=getVideoPath(event);if(src)message[\"src\"]=src;log(\"Notifying client that video is paused for sdkId: \"+sdkId+\", video ID: \"+event.srcElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var notifyEndCard=function(){if(!endCardDetected){endCardDetected=true;log(\"Notifying client that end-card detected for sdkId: \"+sdkId);var message={status:\"end-card\",sdk_id:sdkId};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var addVideoListeners=function(doc){try{if(doc.nodeName==\"#text\")return;var videoElements=doc.getElementsByTagName(\"VIDEO\");if(videoElements.length==0){if(doc.tagName&&doc.tagName==\"VIDEO\"){videoElements=[doc]}}for(i=0;i<videoElements.length;i++){var videoElement=videoElements[i];if(sdkId.startsWith(\"com.applovin\")&&videoElement.id&&videoElement.id==\"ad_video\"){log(\"New applovin template. Don't add video listeners\");return}if(videoElement.safedkVideoListeners!=true){log(\"Found VIDEO tag, adding event listeners. sdkId: \"+sdkId+\", video ID: \"+videoElement.id);videoElement.safedkVideoListeners=true;videoElement.addEventListener(\"play\",notifyPlay);videoElement.addEventListener(\"pause\",notifyPause)}}}catch(error){}};var newTemplateEndCardObserver=function(){try{var rootElements=document.getElementsByClassName(\"root\");if(rootElements){var rootElement=rootElements[0];if(rootElement){var divElements=rootElement.getElementsByTagName(\"div\");if(divElements){for(var element of divElements){if(element.style){var style=element.style;var isBackground=style.background&&(style.background==\"rgb(32, 32, 32)\"||style.background.includes(\"rgba(32, 32, 32\"));var isDisplay=style.display&&style.display==\"flex\";if(isBackground&&isDisplay){log(\"New applovin template. endcard is displaying\");notifyEndCard()}}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};var addEndCardObserver=function(){try{var endCardElement=document.getElementById(\"al_endCardDiv\");if(endCardElement){var computedStyle=getComputedStyle(endCardElement);if(computedStyle&&computedStyle.display==\"flex\"){log(\"Found visible al_endCardDiv tag. sdkId: \"+sdkId);notifyEndCard()}else{if(endCardElement.safedkEndCardObserver!=true){endCardElement.safedkEndCardObserver=true;log(\"Found al_endCardDiv tag, adding end-card observer. sdkId: \"+sdkId);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":computedStyle=getComputedStyle(mutation.target);if(computedStyle&&computedStyle.display==\"flex\"){notifyEndCard()}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(endCardElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};log(\"Initializing video observer\");addVideoListeners(document);if(sdkId.startsWith(\"com.applovin\")){addEndCardObserver();newTemplateEndCardObserver()}try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var node of mutation.addedNodes){log(\"Add video listeners for added elements: \"+node);addVideoListeners(node)}for(var node of mutation.removedNodes){if(node.tagName){var removedVideoElements=node.getElementsByTagName(\"VIDEO\");for(var removedVideoElement of removedVideoElements){if(removedVideoElement.safedkVideoPlaying){log(\"VIDEO tag removed. Calling notifyPause\");var event={srcElement:removedVideoElement};notifyPause(event)}}}}if(sdkId.startsWith(\"com.applovin\")){addEndCardObserver();newTemplateEndCardObserver()}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}})();\n";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44740h = "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkPackage=\"{{sdkPackage}}\";var log=function(message){try{console.log(\"get_text \"+sdkPackage+\" \"+webviewAddress+\" : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"get_text \"+sdkPackage+\" \"+webviewAddress+\" : \"+message)}else{console.log(\"SafeDKWebApInterface get_text safedkDebug object missing\")}}catch(error){}};var textContentUnder=function(element){var n;var s=new Set;try{if(element){var walk=document.createTreeWalker(element,NodeFilter.SHOW_TEXT,null,false);while(n=walk.nextNode()){var parent=n.parentElement;if(!parent)continue;if(parent.nodeType!=1)continue;if(parent.tagName==\"SCRIPT\"||parent.tagName==\"NOSCRIPT\"||parent.tagName==\"STYLE\"||parent.tagName==\"IFRAME\")continue;if(isHidden(parent))continue;var text=n.textContent.trim();if(text==\"\")continue;s.add(text)}}}catch(error){log(\"error : \"+error)}return s};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){console.log(\"error : \"+error)}return false};var collectText=function(element){var textArray=textContentUnder(document.body);var text=Array.from(textArray).join(\"---\");try{if(typeof window.webkit.messageHandlers.safedkDebug.setContent===\"function\"){window.webkit.messageHandlers.safedkDebug.setContent(sdkPackage,webviewAddress,text)}else{console.log(\"SafeDKWebApInterface get_text safedkDebug object missing\")}}catch(error){log(\"collectText error : \"+error)}};var i=0;var interval=1e3;setInterval(function(){if(i<10){i++;collectText()}},interval)})();\n";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44741i = "(function(){var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var printError=function(error){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"ERROR: \"+fileName+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};if(window.safedkXHRMonitoring){return}var fullscreenRecommendations=function(){if(window.safedkXHRMonitoring){return}var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var recommendationBoxes=document.getElementsByClassName(\"mtg-recommend-box\");if(recommendationBoxes.length>0){var recommendationBox=recommendationBoxes[0];var imageElements=recommendationBox.getElementsByTagName(\"img\");if(imageElements.length>0){var images=[];for(var i=0;i<imageElements.length;i++){var imageElement=imageElements[i];images.push(imageElement.src)}try{var message={direction:\"recommendation-images\",sdkId:sdkId,webviewAddress:webviewAddress,recommendations:images};if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){printError(error)}window.safedkXHRMonitoring=true}}};var hookXMLHTTPRequest=function(){if(window.safedkXHRMonitoring){return}var fileName=\"{{fileName}}\";var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var origOpen=window.XMLHttpRequest.prototype.open;function open(method,url,async,user,password){origOpen.apply(this,arguments);try{this.safedkURL=url.toString();this.addEventListener(\"load\",function(){try{var message={direction:\"response\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof this.safedkRequestText!=\"undefined\"&&this.safedkRequestText)message.safedkRequestText=this.safedkRequestText;if(typeof this.responseText!=\"undefined\"&&this.responseText)message.responseText=this.responseText;if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){printError(error)}})}catch(error){printError(error)}}window.XMLHttpRequest.prototype.open=open;var origSend=window.XMLHttpRequest.prototype.send;function send(body){try{var message={direction:\"request\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof body!=\"undefined\"&&body){if(typeof body===\"string\"){this.safedkRequestText=body;message.requestText=this.safedkRequestText}}}catch(error){printError(error)}origSend.apply(this,arguments)}window.XMLHttpRequest.prototype.send=send;window.safedkXHRMonitoring=true};try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length>0){hookXMLHTTPRequest()}else{window.safedkSwiperElementTimer=setInterval(function(){try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length>0){hookXMLHTTPRequest();if(window.safedkSwiperElementTimer){clearInterval(window.safedkSwiperElementTimer)}}fullscreenRecommendations()}catch(error){printError(error)}},1e3)}}catch(error){printError(error)}})();\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44743l = "privacy";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44744m = "end_of_video";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44745n = "extract_text";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44746o = "xml_http_request";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Context f44751k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final CharSequence f44747p = "https://webview.unityads.unity3d.com/webview/";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final CharSequence f44748q = "UnityAdsWebApp.html";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List<String> f44749r = Arrays.asList("document.write", "(function()");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<String, WeakReference<WebView>> f44742j = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ExecutorService f44750s = Executors.newSingleThreadExecutor();

    public SafeDKWebAppInterface(Context c10) {
        this.f44751k = c10;
    }

    @JavascriptInterface
    public void postMessage(String msg) {
        String string;
        boolean z10 = true;
        Logger.d(f44733a, "postMessage : msg = " + msg);
        try {
            JSONObject jSONObject = new JSONObject(msg);
            if (!jSONObject.has("status") || jSONObject.get("status").equals("playing")) {
                z10 = false;
            }
            if (!jSONObject.has(f44737e)) {
                string = null;
            } else {
                string = jSONObject.getString(f44737e);
            }
            Logger.d(f44733a, "postMessage : status = " + z10 + ", sdk_id = " + string + ", src = " + (jSONObject.has("src") ? jSONObject.get("src") : "NA"));
            if (string != null) {
                String[] strArrSplit = string.split("~");
                CreativeInfoManager.a(strArrSplit[0], strArrSplit[1], z10);
            }
        } catch (JSONException e10) {
            Logger.d(f44733a, "Received msg is not a JSON object : " + msg);
        }
    }

    @JavascriptInterface
    public void logMessage(String msg) {
        Logger.d(f44733a, "logMessage msg = " + msg);
    }

    @JavascriptInterface
    public void interceptXmlHttpRequest(String message) {
        Logger.d(f44733a, "interceptXmlHttpRequest - message= " + message);
        try {
            com.safedk.android.analytics.brandsafety.creatives.discoveries.h hVar = (com.safedk.android.analytics.brandsafety.creatives.discoveries.h) CreativeInfoManager.h(com.safedk.android.utils.g.f44969o);
            if (hVar != null) {
                hVar.l(message);
            } else {
                Logger.d(f44733a, "interceptXmlHttpRequest - mintegralDiscovery is null");
            }
        } catch (Exception e10) {
            Logger.d(f44733a, "interceptXmlHttpRequest - encountered exception= " + e10);
        }
    }

    public static String a(String str, String str2) {
        Logger.d(f44733a, "getXMLHttpRequestJsScript: sdk= " + str + ", webviewAddress= " + str2);
        return f44738f + f44741i.replace("{{webviewAddress}}", str2).replace("{{SDK_ID}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkDebug.interceptXmlHttpRequest", "SafeDKWebAppInterface.interceptXmlHttpRequest");
    }

    @JavascriptInterface
    public void requestNoSampling(String sdkPackageName, String address, int height, int width) {
        Logger.d(f44733a, "requestNoSampling : address = " + address + ", height = " + height + " , width = " + width);
        if (!com.safedk.android.analytics.brandsafety.b.f(address, ImpressionLog.f43641q)) {
            com.safedk.android.analytics.brandsafety.b.a(address, ImpressionLog.f43641q, new ImpressionLog.a[0]);
        }
        if (height == 0 && width == 0) {
            CreativeInfoManager.a(sdkPackageName, address);
            return;
        }
        if (k.a(width, height)) {
            Logger.d(f44733a, "requestNoSampling calling banner requestNoSampling, : address = " + address);
            CreativeInfoManager.a(BrandSafetyUtils.AdType.BANNER, address);
        } else if (k.b(width, height)) {
            Logger.d(f44733a, "requestNoSampling calling MREC requestNoSampling, : address = " + address);
            CreativeInfoManager.a(BrandSafetyUtils.AdType.MREC, address);
        } else if (b.getInstance().isInterstitialActivity(b.getInstance().getForegroundActivity())) {
            Logger.d(f44733a, "requestNoSampling calling interstitial requestNoSampling, : address = " + address);
            CreativeInfoManager.d(sdkPackageName, address);
        } else {
            Logger.d(f44733a, "requestNoSampling WebView is non a banner nor an interstitial, probably MREC, : address = " + address);
        }
    }

    @JavascriptInterface
    public void setContent(String packageName, String webviewAddress, String texts) {
        WeakReference<WebView> weakReference;
        try {
            if (com.safedk.android.utils.a.a(packageName)) {
                if (texts != null && texts.trim().length() > 0) {
                    Logger.d(f44733a, "setContent packageName = " + packageName + ", webviewAddress = " + webviewAddress + ", text = " + texts);
                    if (f44742j.containsKey(webviewAddress) && b(texts) && (weakReference = f44742j.get(webviewAddress)) != null && weakReference.get() != null) {
                        for (String str : texts.split("---")) {
                            if (str != null && str.trim().length() > 0) {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(packageName, weakReference.get(), "text:" + str, null);
                            }
                        }
                        return;
                    }
                    return;
                }
                Logger.d(f44733a, "setContent WebView address " + webviewAddress + " text is empty");
            }
        } catch (Throwable th2) {
            Logger.d(f44733a, "setContent exception : " + th2.getMessage() + ", webviewAddress = " + webviewAddress, th2);
        }
    }

    private boolean b(String str) {
        for (String str2 : f44749r) {
            if (str != null && str.contains(str2)) {
                Logger.d(f44733a, "should add text : skipping text " + str);
                return false;
            }
        }
        Logger.d(f44733a, "should add text : eligible text " + str);
        return true;
    }

    public static void a(String str, final WebView webView, final String str2) {
        final String strA = BrandSafetyUtils.a(webView);
        SafeDK safeDK = SafeDK.getInstance();
        Logger.d(f44733a, "addJScript started sdkPackage=" + str + ", webView=" + strA + " ,url=" + str2 + " , isMaxInit=" + SafeDK.Y());
        if (!SafeDK.Y() || safeDK == null || str2 == null) {
            Logger.d(f44733a, "addJScript loaded url is empty or app not initialized yet, skipping.");
            return;
        }
        if (webView == null || webView.getContext() == null) {
            Logger.d(f44733a, "addJScript WebView is null or WebView context is null. skipping.");
            return;
        }
        final String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (CreativeInfoManager.h(mainSdkPackage) == null) {
            Logger.d(f44733a, "addJScript not supported sdkPackage :  " + mainSdkPackage + ", existing");
            return;
        }
        if ((SafeDK.Y() && safeDK != null && !safeDK.h()) || str2.contains(f44747p) || str2.contains(f44748q)) {
            if (str2.startsWith(f44738f)) {
                Logger.d(f44733a, "addJScript loaded data is javascript, ignoring. url : " + str2);
                return;
            } else {
                SafeDKApplication.runOnUiThread(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SafeDKWebAppInterface.b(mainSdkPackage, webView, str2, strA);
                    }
                });
                return;
            }
        }
        Logger.d(f44733a, "addJScript skipped url " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2, String str3) {
        if (SafeDK.P() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.addJavascriptInterface(new SafeDKWebAppInterface(webView.getContext()), f44733a);
        Logger.d(f44733a, "addJScript javascript interface added, WebView address is " + str3);
        if (SafeDK.P() && Build.VERSION.SDK_INT >= 19) {
            Logger.d(f44733a, "addJScript testing javascript call. WebView address is " + str3);
            webView.evaluateJavascript("javascript:console.log('adding js interface. success : ' + (typeof(window.SafeDKWebAppInterface.logMessage)=='function'));", null);
            webView.evaluateJavascript("javascript:window.SafeDKWebAppInterface.logMessage('adding js interface');", null);
        }
        b(str, webView, str2);
    }

    public static String a(String str, String str2, String str3) {
        return f44738f + str3.replace("window.webkit.", "window.").replace("messageHandlers.safedkNoSamplingExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.requestNoSampling").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("{{SDK_ID}}", str).replace("{{ADDRESS}}", str2);
    }

    public static String b(String str, String str2) {
        return f44738f + f44739g.replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideoExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideo", f44733a).replace("{{SDK_ID}}", str + "~" + str2);
    }

    public static String c(String str, String str2) {
        Logger.d(f44733a, "getting js html extr script for webviewAddress " + str2);
        return f44738f + f44740h.replace("{{webviewAddress}}", str2).replace("{{sdkPackage}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkDebug.setContent", "SafeDKWebAppInterface.setContent");
    }

    private static void b(final String str, final WebView webView, String str2) {
        final String strA = BrandSafetyUtils.a(webView);
        SafeDK safeDK = SafeDK.getInstance();
        if (SafeDK.Y() && safeDK != null && !SafeDK.getInstance().h()) {
            if (str2 == null || str2.equalsIgnoreCase(AndroidWebViewClient.BLANK_PAGE) || str2.trim().length() == 0) {
                Logger.d(f44733a, "attachJsScript url is blank, skipping scripts injection. sdkPackage = " + str + ", webView = " + webView);
                return;
            }
            if (str2.length() < 20480) {
                Logger.d(f44733a, "attachJsScript sdkPackage = " + str + ", webView = " + webView + " url = " + str2);
            } else {
                Logger.d(f44733a, "attachJsScript sdkPackage = " + str + ", webView = " + webView + " url too long (probably html, size is " + str2.length() + " ) ");
            }
            final HashMap map = new HashMap();
            Logger.d(f44733a, "attachJsScript sdk: " + str + ", address: " + strA);
            com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(str);
            if (aVarI == null) {
                Logger.d(f44733a, "attachJsScript configBundle is empty, existing");
                return;
            }
            if (aVarI != null) {
                Logger.d(f44733a, "attachJsScript sdk " + str + " items: js privacy fullscreen  : " + aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false) + ", js privacy banner  : " + aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false) + ", js privacy mrec  : " + aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false) + ", js video : " + aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false) + ", js text extraction : " + aVarI.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true));
            } else {
                Logger.d(f44733a, "attachJsScript sdk " + str + " config bundle is empty");
            }
            boolean zIsInterstitialActivity = b.getInstance().isInterstitialActivity(webView.getContext());
            boolean z10 = aVarI.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, false) || (webView.getContext() instanceof Application) || (webView.getContext() instanceof MultiDexApplication);
            Logger.d(f44733a, "attachJsScript interstitialActivity is " + zIsInterstitialActivity + ", context = " + webView.getContext());
            if (((zIsInterstitialActivity || z10) && aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false)) || (!zIsInterstitialActivity && (aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false) || aVarI.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false)))) {
                String strA2 = aVarI.a(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, (String) null);
                if (strA2 != null && strA2.length() > 0) {
                    map.put(f44743l, a(str, strA, strA2));
                    Logger.d(f44733a, "attachJsScript added " + str + " privacy button click detection script to list.");
                } else {
                    Logger.d(f44733a, "attachJsScript privacy button click detection script is empty, skipping.");
                }
            }
            if (aVarI.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION)) {
                map.put(f44744m, b(str, strA));
                Logger.d(f44733a, "attachJsScript added " + str + " video state detection script to list.");
            } else {
                Logger.d(f44733a, "attachJsScript no need to add video state detection script. WebView : " + strA);
            }
            String strA3 = a(str, strA);
            Logger.d(f44733a, "attachJsScript adding Xml Http Request Js Script . WebView : " + strA);
            map.put(f44746o, strA3);
            if (aVarI.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING) && aVarI.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true)) {
                if (!zIsInterstitialActivity) {
                    synchronized (f44742j) {
                        f44742j.put(strA, new WeakReference<>(webView));
                    }
                    String strC = c(str, strA);
                    map.put(f44745n, strC);
                    Logger.d(f44733a, "attachJsScript added " + str + " text extraction script to list. script : " + strC);
                } else {
                    Logger.d(f44733a, "attachJsScript WebView is in an interstitial, skipping text extraction script. sdk: " + str + ", context = " + webView.getContext());
                }
            } else {
                Logger.d(f44733a, "attachJsScript no need to add text extraction script. sdkPackage = " + str + ", WebView : " + strA);
            }
            webView.post(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT >= 19) {
                        if (webView != null) {
                            for (String str3 : map.keySet()) {
                                if (map.get(str3) != null && ((String) map.get(str3)).length() > 0) {
                                    String str4 = (String) map.get(str3);
                                    Logger.d(SafeDKWebAppInterface.f44733a, "Injecting script for " + str + " WebView : " + strA + ", script : " + str3);
                                    try {
                                        webView.evaluateJavascript(str4, null);
                                    } catch (Throwable th2) {
                                        Logger.d(SafeDKWebAppInterface.f44733a, "attachJsScript Exception injecting text extraction script : " + th2.getMessage(), th2);
                                    }
                                }
                            }
                        }
                        map.clear();
                        return;
                    }
                    for (String str5 : map.keySet()) {
                        String str6 = (String) map.get(str5);
                        if (str6 != null && str6.length() > 0 && webView != null) {
                            Logger.d(SafeDKWebAppInterface.f44733a, "attachJsScript Injecting script for " + str + " WebView : " + strA + ", script : " + str5);
                            try {
                                webView.loadUrl(str6, null);
                            } catch (Throwable th3) {
                                Logger.d(SafeDKWebAppInterface.f44733a, "attachJsScript Exception injecting text extraction script : " + th3.getMessage(), th3);
                            }
                        }
                    }
                }
            });
        }
    }

    public static void a(String str) {
        synchronized (f44742j) {
            if (f44742j.remove(str) != null) {
                Logger.d(f44733a, "WebView address removed : " + str);
            }
        }
    }
}
