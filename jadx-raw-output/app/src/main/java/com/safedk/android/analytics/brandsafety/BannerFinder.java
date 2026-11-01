package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class BannerFinder extends com.safedk.android.analytics.brandsafety.b {
    protected static final int F = 5;
    protected static final long G = 1000;
    protected static final long H = 500;
    protected static final long K = 10;
    protected LinkedHashSetWithItemLimit<String> L;
    private final Set<String> R;
    protected static final Map<d, e> I = new ConcurrentHashMap();
    protected static final Map<String, List<o>> J = new ConcurrentHashMap();
    private static h N = null;
    private static final Map<String, List<WeakReference<MaxAdView>>> O = new ConcurrentHashMap();
    private static final Map<String, BrandSafetyUtils.AdType> P = new ConcurrentHashMap();
    private static final Map<String, d> Q = new ConcurrentHashMap();
    protected static Map<String, RedirectData> M = null;

    public static Map<String, BrandSafetyUtils.AdType> d() {
        return P;
    }

    public Set<String> e() {
        return this.R;
    }

    public BannerFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.BANNER, Arrays.asList("BANNER", BrandSafetyUtils.f43551n), "BannerFinder", maxAttemptsToCaptureImage);
        this.R = new HashSet();
        this.L = new LinkedHashSetWithItemLimit<>(10L);
        f();
    }

    protected BannerFinder(BrandSafetyUtils.AdType adType, List<String> supportedAdFormats, String logTag, int maxAttemptsToCaptureImage) {
        super(adType, supportedAdFormats, logTag, maxAttemptsToCaptureImage);
        this.R = new HashSet();
        this.L = new LinkedHashSetWithItemLimit<>(10L);
    }

    private static void f() {
        e eVar;
        M = new PersistentConcurrentHashMap("SafeDKRedirects." + com.safedk.android.utils.k.a(SafeDK.getInstance().l()));
        Logger.d("BannerFinder", "handle saved redirects from previous session, found " + M.size() + " redirects, isOnUiThread = " + com.safedk.android.utils.k.c());
        ArrayList arrayList = new ArrayList();
        for (String str : M.keySet()) {
            RedirectData redirectData = M.get(str);
            if (redirectData != null && (redirectData.f43713a || redirectData.f43714b)) {
                redirectData.a("UnmatchedRedirectWebview=" + str);
                if (redirectData.f43723k == BrandSafetyEvent.AdFormatType.MREC) {
                    eVar = new r(redirectData.f43721i, redirectData.f43722j);
                } else {
                    if (redirectData.f43723k == null) {
                        redirectData.f43723k = BrandSafetyEvent.AdFormatType.BANNER;
                        redirectData.a("UnmatchedRedirectFallback=BANNER");
                    }
                    eVar = new e(redirectData.f43721i, redirectData.f43722j);
                }
                eVar.a(E.get(str));
                BrandSafetyEvent brandSafetyEventA = a(eVar, new l(redirectData), true, false, 0L, (String) null);
                brandSafetyEventA.c(true);
                brandSafetyEventA.a(SafeDK.getInstance().e());
                arrayList.add(brandSafetyEventA);
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
            M.clear();
        } else {
            Logger.w("BannerFinder", "handle saved redirects from previous session, cannot report brand safety event");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new e(str, str2, str3, screenShotOrientation, str4, str5);
    }

    protected e a(Activity activity, String str, int i10, String str2, Bundle bundle, String str3) {
        e eVar = new e(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i10, str2, bundle, str3);
        eVar.f44402af = new WeakReference<>(activity);
        return eVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f43758b.contains(messageData.getString("ad_format"))) {
                Logger.d(this.f43757a, "Revenue event detected : " + messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string2 = messageData.getString("ad_format");
            String string3 = messageData.getString(BrandSafetyEvent.f44592k);
            String string4 = messageData.getString(BrandSafetyEvent.f44593l);
            String string5 = messageData.getString("id", null);
            if (string5 == null) {
                Logger.d(this.f43757a, "No eventId in data bundle, cannot match");
            }
            String string6 = messageData.getString(BrandSafetyEvent.f44576ad);
            String strB = CreativeInfoManager.b(string6);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB = com.safedk.android.utils.k.b(jCurrentTimeMillis);
            String string7 = null;
            if (messageData.containsKey("creative_id")) {
                string7 = messageData.getString("creative_id");
            }
            if (this.f43758b.contains(string2)) {
                Logger.d(this.f43757a, "Max message received, package: " + strB + ", ts (seconds): " + jB + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                d dVar = new d(string4, string3, string5, strB, string6, string2.equals("BANNER") ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.MREC);
                if ("WILL_DISPLAY".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "WILL_DISPLAY event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        CreativeInfoManager.a(strB, string3, string7, string5, string2);
                        a(string5, ImpressionLog.f43630f, new ImpressionLog.a(ImpressionLog.G, BrandSafetyUtils.l(messageData.getString("ad_view"))));
                    }
                    a(string6, strB, string7, dVar, messageData, jCurrentTimeMillis);
                    return;
                }
                if ("revenue_event".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "REVENUE_EVENT event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43635k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                    }
                    a(string6, strB, string7, dVar, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (g(string6, strB)) {
                        e eVar = I.get(dVar);
                        Logger.d(this.f43757a, "DID_CLICKED event currentActivityBanner = " + eVar);
                        a(string5, ImpressionLog.f43632h, new ImpressionLog.a[0]);
                        if (eVar != null) {
                            String str = this.f43757a;
                            StringBuilder sbAppend = new StringBuilder().append("DID_CLICKED event for package=");
                            if (strB != null) {
                                string6 = strB;
                            }
                            Logger.d(str, sbAppend.append(string6).append(", slot count=").append(this.f43760d).toString());
                            d(dVar);
                            return;
                        }
                        Logger.d(this.f43757a, "DID_CLICKED event cannot find banner key " + dVar);
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "WILL_LOAD event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43628d, new ImpressionLog.a(ImpressionLog.I, string6));
                        com.safedk.android.analytics.brandsafety.creatives.e.b(strB, string3);
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "DID_HIDE event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43633i, new ImpressionLog.a[0]);
                        c(dVar);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "DID_LOAD event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43629e, new ImpressionLog.a(ImpressionLog.I, string6));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (strB != null && g(string6, strB)) {
                        Logger.d(this.f43757a, "DID_DISPLAY event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43631g, new ImpressionLog.a[0]);
                        a(strB, dVar, string7, messageData, jCurrentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && strB != null && g(string6, strB)) {
                    Logger.d(this.f43757a, "DID_FAIL_DISPLAY event for package=" + strB + " banner key=" + dVar + ", slot count=" + this.f43760d);
                    a(string5, ImpressionLog.f43634j, new ImpressionLog.a[0]);
                    a(dVar);
                }
            }
        }
    }

    private void a(d dVar) {
        e eVar = I.get(dVar);
        if (eVar != null) {
            eVar.N = true;
        }
    }

    public boolean i(String str) {
        if (str != null) {
            synchronized (BannerFinder.class) {
                Iterator<e> it = I.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        e next = it.next();
                        Logger.d(this.f43757a, "is banner web view address: banner view: " + next.K + " given address: " + str + " view hierarchy: " + next.f43774m);
                        if ((next.K != null && str.equals(next.K)) || (next.f43774m != null && next.f43774m.contains(str))) {
                            break;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f43530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f43532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f43533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f43534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f43535f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ScheduledFuture<?> f43536g;

        public b(String str, String str2, String str3, d dVar, Bundle bundle) {
            Logger.d(BannerFinder.this.f43757a, "web view scanner created, networkName = " + str + ", packageName = " + str2 + ", maxCreativeId = " + str3 + ", adInfoKey = " + dVar + ", applovinData = " + bundle + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            this.f43530a = str;
            this.f43531b = str2;
            this.f43532c = str3;
            this.f43533d = dVar;
            this.f43534e = bundle;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x03e3  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            boolean zA = CreativeInfoManager.a(this.f43531b, AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
            boolean z11 = (SafeDK.getInstance() == null || SafeDK.getInstance().y() == null || !SafeDK.getInstance().y().d()) ? false : true;
            if (zA && z11) {
                Logger.d(BannerFinder.this.f43757a, "web view scanner - fullscreen ad is displaying, postpone scanning. sdk= " + this.f43531b);
                return;
            }
            String string = this.f43534e.getString("ad_view");
            e eVar = BannerFinder.I.get(this.f43533d);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            BannerFinder.this.a(this.f43531b, this.f43532c, this.f43533d, string, arrayList, arrayList2);
            Logger.d(BannerFinder.this.f43757a, "web view scanner - is views empty? " + arrayList.isEmpty() + " info=" + eVar + " info address=" + (eVar == null ? "___" : eVar.K));
            if (arrayList.isEmpty() && (eVar == null || eVar.K == null)) {
                this.f43535f++;
                Logger.d(BannerFinder.this.f43757a, "web view scanner - failed to find view, scan counter: " + this.f43535f);
            } else if (!arrayList.isEmpty()) {
                this.f43535f++;
                Logger.d(BannerFinder.this.f43757a, "web view scanner - found view, scan counter: " + this.f43535f + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                WeakReference weakReferenceD = BannerFinder.this.d(arrayList);
                String strA = com.safedk.android.utils.k.a((Reference<?>) weakReferenceD) ? BrandSafetyUtils.a(weakReferenceD.get()) : null;
                Logger.d(BannerFinder.this.f43757a, "web view scanner - adInfoKey.webviewAddress: " + this.f43533d.f44394g + ", adInfoKey.isWebviewReplaced: " + this.f43533d.f44396i);
                if ((this.f43533d.f44394g == null || this.f43533d.f44396i) && com.safedk.android.utils.k.a((Reference<?>) weakReferenceD)) {
                    this.f43533d.f44394g = BrandSafetyUtils.a(weakReferenceD.get());
                    Logger.d(BannerFinder.this.f43757a, "web view scanner - info: " + eVar);
                    if (eVar != null && eVar.K == null) {
                        com.safedk.android.analytics.brandsafety.b.a(this.f43533d.f44394g, ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, strA));
                        eVar.K = strA;
                    }
                    BannerFinder.this.a((c) eVar);
                    AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(eVar.f43783v);
                    com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(this.f43531b);
                    if ((weakReferenceD.get() instanceof WebView) && adNetworkDiscoveryH != null && aVarI != null && aVarI.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION)) {
                        WebView webView = (WebView) weakReferenceD.get();
                        BrandSafetyUtils.AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(this.f43531b, webView);
                        CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) eVar.h().f44518f);
                        if (creativeInfoA != null) {
                            if (adTypeA == BrandSafetyUtils.AdType.BANNER) {
                                creativeInfoA.p("BANNER");
                                creativeInfoA.a(BrandSafetyUtils.AdType.BANNER);
                                if (creativeInfoA.h() != null && creativeInfoA.h().contains("mraid")) {
                                    creativeInfoA.t(null);
                                }
                            }
                            CreativeInfoManager.a(webView, this.f43531b, creativeInfoA.L());
                            synchronized (eVar.h().f44518f) {
                                Iterator<String> it = eVar.h().f44518f.iterator();
                                while (it.hasNext()) {
                                    com.safedk.android.analytics.brandsafety.creatives.e.a(this.f43531b, webView, it.next(), creativeInfoA.F(), (Map<String, String>) null);
                                }
                            }
                        }
                    }
                }
                boolean zG = BannerFinder.this.g(this.f43530a, this.f43531b);
                if (this.f43531b == null || !zG || eVar == null) {
                    z10 = false;
                } else {
                    eVar.a(arrayList2);
                    eVar.b(BannerFinder.this.b(arrayList));
                    if (com.safedk.android.utils.k.a((Reference<?>) weakReferenceD)) {
                        boolean zA2 = CreativeInfoManager.a(this.f43531b, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                        boolean zE = eVar.E();
                        Logger.d(BannerFinder.this.f43757a, "web view scanner - should detect multiple ads by web view change ? " + zA2 + ", isNativeAd = " + zE);
                        String strA2 = BrandSafetyUtils.a(weakReferenceD.get());
                        if (zE || !zA2 || eVar.K == null || eVar.K.equals(strA2)) {
                            z10 = false;
                        } else {
                            Logger.d(BannerFinder.this.f43757a, "web view scanner - webview change starts for maxCreativeId: " + this.f43532c);
                            com.safedk.android.analytics.brandsafety.b.a(strA2, ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, strA));
                            BannerFinder.this.a(eVar, strA2);
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    Logger.d(BannerFinder.this.f43757a, "web view scanner - calling reportCompletedBanners");
                    BannerFinder.this.a(arrayList, this.f43533d, eVar != null ? eVar.f44405ai : Long.MAX_VALUE);
                } else {
                    Logger.d(BannerFinder.this.f43757a, "web view scanner - not calling reportCompletedBanners");
                }
                if (this.f43531b != null && zG) {
                    if (eVar != null) {
                        Logger.d(BannerFinder.this.f43757a, "web view scanner - setting taskFuture for maxCreativeId: " + this.f43532c);
                        eVar.f44401ae = this.f43536g;
                        if (com.safedk.android.utils.k.a((Reference<?>) weakReferenceD)) {
                            BannerFinder.this.a(eVar, (WeakReference<View>) weakReferenceD);
                            BannerFinder.this.a(this.f43531b, this.f43532c, this.f43533d, (WeakReference<View>) weakReferenceD);
                            if (CreativeInfoManager.a(this.f43531b, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false) && eVar.i() == null) {
                                Logger.d(BannerFinder.this.f43757a, "web view scanner - keep scanning until we have a match. scan counter: " + this.f43535f + ", activity banner key: " + this.f43533d);
                            }
                        }
                    }
                } else if (this.f43536g != null) {
                    this.f43536g.cancel(false);
                }
            }
            Logger.d(BannerFinder.this.f43757a, "web view scanner - scan counter=" + this.f43535f + " task future=" + this.f43536g);
            if (this.f43535f >= 5 && this.f43536g != null) {
                Logger.d(BannerFinder.this.f43757a, "web view scanner - failed to find webview, scan counter: " + this.f43535f);
                BannerFinder.this.a(eVar, false, "WebviewScannerTask");
                this.f43536g.cancel(false);
            }
        }
    }

    public void a(CreativeInfo creativeInfo) {
        synchronized (BannerFinder.class) {
            for (d dVar : I.keySet()) {
                e eVar = I.get(new d(dVar.f44388a, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), dVar.f44392e, creativeInfo.K()));
                if (eVar != null) {
                    if (eVar.l() != null && eVar.l().f44460b != null) {
                        BrandSafetyUtils.d(eVar.l().f44460b);
                        eVar.h().d();
                    }
                    if (eVar.D == null) {
                        eVar.D = UUID.randomUUID().toString();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<View> weakReference) {
        String strA = BrandSafetyUtils.a(weakReference.get());
        RedirectData redirectData = M.get(strA);
        Logger.d(this.f43757a, "web view scanner - check for pending redirect: " + redirectData + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (redirectData != null) {
            redirectData.a("LateMatchedRedirectWebview=" + strA);
            if (redirectData.f43723k == null) {
                redirectData.f43723k = BrandSafetyUtils.a(this.f43759c);
            }
            if (redirectData.f43714b) {
                eVar.f44410an = true;
            }
            l lVarH = eVar.h();
            if (lVarH != null) {
                lVarH.a(redirectData);
                M.remove(strA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, String str) {
        Logger.d(this.f43757a, "handle web view change - web view change detected from: " + eVar.K + ", to: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        l lVarH = eVar.h();
        if (lVarH != null && lVarH.c() != null && !lVarH.c().ah()) {
            lVarH.c().ai();
            String strH = lVarH.c().h();
            if (strH != null) {
                lVarH.c().c(strH + CreativeInfo.aJ);
            }
        }
        eVar.K = str;
        eVar.g().add(new l(UUID.randomUUID().toString()));
        if (eVar.D == null) {
            eVar.D = UUID.randomUUID().toString();
        }
        eVar.f44399ac = false;
    }

    private void a(String str, String str2, String str3, d dVar, Bundle bundle, long j10) {
        e eVarA;
        Q.put(dVar.f44388a, dVar);
        this.R.add(dVar.f44390c);
        Logger.d(this.f43757a, "handle WILL_DISPLAY - eventIds added " + dVar.f44390c);
        if (this.L.contains(dVar.f44390c)) {
            Logger.d(this.f43757a, "handle WILL_DISPLAY - impression with id " + dVar.f44390c + " has already been reported, ignoring. ");
            return;
        }
        Activity activityA = a(bundle);
        Logger.d(this.f43757a, "handle WILL_DISPLAY - adActivity = " + activityA);
        Logger.d(this.f43757a, "handle WILL_DISPLAY - image count for " + this.f43759c.name() + " is " + BrandSafetyUtils.b(this.f43759c) + ", # impressions to report(" + this.B.keySet().size());
        if (g(str, str2)) {
            synchronized (BannerFinder.class) {
                eVarA = I.get(dVar);
                if (eVarA == null) {
                    eVarA = a(activityA, str2, dVar.f44390c, bundle);
                    I.put(dVar, eVarA);
                    Logger.d(this.f43757a, "handle WILL_DISPLAY New activity banner created for " + str2 + ", banner key is " + dVar + ", current activity banners size is " + I.size());
                } else {
                    if (eVarA.A == null) {
                        eVarA.A = bundle;
                    }
                    if (eVarA.B == null || eVarA.C == null) {
                        eVarA.a(a(activityA));
                    }
                }
            }
            eVarA.f44397aa = true;
            eVarA.f44403ag = true;
            eVarA.f44405ai = j10;
            a(eVarA, false, "handleWillDisplay");
        } else {
            this.f43760d++;
        }
        b bVar = new b(str, str2, str3, dVar, bundle);
        bVar.f43536g = this.D.scheduleAtFixedRate(bVar, 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeakReference<View> d(List<WeakReference<View>> list) {
        WeakReference<View> weakReference = null;
        for (WeakReference<View> weakReference2 : list) {
            Logger.d(this.f43757a, "select monitor view: iterating view is " + weakReference2.get());
            if (weakReference == null) {
                Logger.d(this.f43757a, "select monitor view: setting view " + weakReference2.get());
            } else if (weakReference2.get() instanceof WebView) {
                Logger.d(this.f43757a, "select monitor view: re-setting view " + weakReference2.get());
                weakReference.clear();
            } else {
                Logger.d(this.f43757a, "select monitor view: clearing view " + weakReference2.get());
                weakReference2.clear();
                weakReference2 = weakReference;
            }
            weakReference = weakReference2;
        }
        return weakReference;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j10) {
        e eVarA;
        this.R.add(dVar.f44390c);
        Logger.d(this.f43757a, "handle DID_DISPLAY - eventIds added " + dVar.f44390c);
        if (this.L.contains(dVar.f44390c)) {
            Logger.d(this.f43757a, "handle DID_DISPLAY - impression with id " + dVar.f44390c + " has already been reported, ignoring. ");
            return;
        }
        Logger.d(this.f43757a, "handle DID_DISPLAY package=" + str + " banner key=" + dVar);
        Activity activityA = a(bundle);
        synchronized (BannerFinder.class) {
            eVarA = I.get(dVar);
            if (eVarA != null) {
                Logger.d(this.f43757a, "Banner info already exists, package=" + str + " activity banner=" + eVarA);
                eVarA.f43787z = this.f43760d;
                if (eVarA.B == null || eVarA.C == null) {
                    eVarA.a(a(activityA));
                }
            } else {
                b(dVar);
                eVarA = a(activityA, str, dVar.f44390c, bundle);
                I.put(dVar, eVarA);
                Logger.d(this.f43757a, "New activity banner created for " + str + ", banner key is " + dVar + ", current activity banners size is " + I.size());
            }
        }
        eVarA.M = str2;
        eVarA.f44406aj = j10;
        a(eVarA, false, "handleDidDisplay");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, d dVar, WeakReference<View> weakReference) {
        e eVar;
        Logger.d(this.f43757a, "monitor impression started for " + str + ", adInfoKey = " + dVar + ", creativeId = " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (com.safedk.android.utils.k.a((Reference<?>) weakReference) && (eVar = I.get(dVar)) != null) {
            a(str, dVar);
            eVar.M = str2;
            eVar.f44404ah = true;
            eVar.f44407ak = 0.0f;
            if (weakReference.get().getWidth() > 0 && weakReference.get().getHeight() > 0) {
                eVar.f44407ak = weakReference.get().getWidth() / weakReference.get().getHeight();
            }
            a(weakReference, eVar);
        }
    }

    private void a(WeakReference<View> weakReference, e eVar) {
        a aVar = new a(eVar, weakReference, this.f43761e);
        eVar.f44409am = aVar;
        CreativeInfo creativeInfoI = eVar.i();
        if (creativeInfoI != null && creativeInfoI.v() && j(eVar.c())) {
            Logger.d(this.f43757a, "set Impression Handler Task If Needed : task set but not started since the ad is a video ad and the video hasn't finished yet. " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        int iW = SafeDK.getInstance().W() * 1000;
        Logger.d(this.f43757a, "start taking screenshots for view: " + weakReference.get().toString() + ", samplingInterval = " + iW + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        aVar.f43522d = this.D.scheduleAtFixedRate(aVar, 500L, iW, TimeUnit.MILLISECONDS);
        Logger.d(this.f43757a, "set Impression Handler Task If Needed : task created and started : " + eVar);
    }

    protected boolean j(String str) {
        return false;
    }

    private boolean m(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f43774m != null && eVar.f43774m.contains(str) && eVar.i() != null) {
                    return true;
                }
            }
            return false;
        }
    }

    public void k(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.K != null && eVar.K.equals(str) && eVar.i() == null) {
                    Logger.d(this.f43757a, "handle multiple impressions - reset webview data in: " + eVar);
                    eVar.K = null;
                    eVar.f44404ah = false;
                }
            }
        }
    }

    private void b(d dVar) {
        synchronized (BannerFinder.class) {
            Iterator<Map.Entry<d, e>> it = I.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, e> next = it.next();
                d key = next.getKey();
                e value = next.getValue();
                if (key.f44388a.equals(dVar.f44388a) && key.f44389b.equals(dVar.f44389b) && !key.f44390c.equals(dVar.f44390c) && !value.f44403ag) {
                    Logger.d(this.f43757a, "report undetected banner started for AdInfoKey=" + key);
                    a(value, true, "reportUndetectedBannerIfNeeded");
                    it.remove();
                    b(value);
                }
            }
        }
    }

    protected boolean g(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f43757a, "sdk " + str2 + ": config item SUPPORTS_BANNER_IMPRESSION_TRACKING is " + zA + ", config item AD_NETWORK_TO_IGNORE is " + strA);
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(this.f43757a, "Banners tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    private e a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.f43760d++;
        Logger.d(this.f43757a, "slot number incremented to " + this.f43760d + ", eventId is " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        return a(activity, str, this.f43760d, lowerCase, bundle, str2);
    }

    private void a(String str, d dVar) {
        CreativeInfo creativeInfoA;
        Logger.d(this.f43757a, "pending ci check started, sdkPackageName = " + str + ", adInfoKey = " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (dVar == null) {
            Logger.d(this.f43757a, "pending ci check - no activity key");
            return;
        }
        e eVar = I.get(dVar);
        if (eVar == null) {
            Logger.d(this.f43757a, "pending ci check - no banner info");
            return;
        }
        CreativeInfo creativeInfoI = eVar.i();
        if (creativeInfoI != null && !creativeInfoI.ah()) {
            Logger.d(this.f43757a, "pending ci check - CI already exist");
            return;
        }
        if (dVar.f44390c != null) {
            Logger.d(this.f43757a, "pending ci check - activity key : " + dVar);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && !CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false) && (creativeInfoA = adNetworkDiscoveryH.a((Object) (dVar.f44389b + "_" + dVar.f44390c + "_" + str))) != null) {
                Logger.d(this.f43757a, "pending ci check - discovery class returned a ci: " + creativeInfoA);
                if (creativeInfoA.I() == null) {
                    String strName = BrandSafetyUtils.a(eVar.A).name();
                    Logger.d(this.f43757a, "pending ci check - set ad format: " + strName);
                    creativeInfoA.p(strName);
                }
                if (creativeInfoA.m() == null) {
                    creativeInfoA.f(dVar.f44390c);
                }
                Logger.d(this.f43757a, "pending ci check - CI event ID set");
            }
        }
        synchronized (BannerFinder.class) {
            List<o> list = J.get(str);
            if (list != null) {
                Logger.d(this.f43757a, "pending ci check - sdk: " + str + ", no. of pending candidates: " + list.size());
                for (o oVar : list) {
                    Logger.d(this.f43757a, "pending ci check - pending candidate: " + oVar);
                    CreativeInfo creativeInfo = oVar.f44545a;
                    if (a(creativeInfo, eVar)) {
                        Logger.d(this.f43757a, "pending ci check - creative info found by WebView/eventID, CI: " + creativeInfo);
                        b(creativeInfo, eVar);
                        if (creativeInfo.m() == null) {
                            creativeInfo.f(dVar.f44390c);
                            creativeInfo.f(true);
                        }
                        if (a(dVar.f44388a, dVar.f44392e, oVar)) {
                            list.remove(oVar);
                        } else if (creativeInfo.B()) {
                            Logger.d(this.f43757a, "pending ci check - unreal match and event id set happened, setting ci event id back to null");
                            creativeInfo.f((String) null);
                            creativeInfo.f(false);
                        }
                        return;
                    }
                }
            } else {
                Logger.d(this.f43757a, "pending ci check - there are no pending candidates");
            }
        }
    }

    private void c(d dVar) {
        e eVar = I.get(dVar);
        if (eVar != null) {
            Logger.d(this.f43757a, "handle DID_HIDE, placementId=" + dVar.f44389b);
            eVar.f44399ac = true;
        }
    }

    private void d(d dVar) {
        e eVar = I.get(dVar);
        if (eVar == null) {
            Logger.d(this.f43757a, "handle DID_CLICKED current activity banner is null");
            return;
        }
        if (eVar.D != null && CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false)) {
            Logger.d(this.f43757a, "handle DID_CLICKED current activity banner multi ad");
            return;
        }
        eVar.a(true);
        if (eVar.e() != null) {
            Logger.d(this.f43757a, "handle DID_CLICKED current activity banner already have click url");
        } else if (N == null) {
            Logger.d(this.f43757a, "handle DID_CLICKED current click url candidate is null");
        } else if (N.f44420a == 0) {
            Logger.d(this.f43757a, "handle DID_CLICKED current click url candidate has zero timestamp");
        } else if (!a(eVar, N.f44421b, N.f44422c)) {
            Logger.d(this.f43757a, "handle DID_CLICKED ad click url is not valid");
        } else if (System.currentTimeMillis() - N.f44420a < 5000) {
            Logger.d(this.f43757a, "handle DID_CLICKED setting click URL to " + N.f44421b);
            eVar.c(N.f44421b);
            N = null;
        } else {
            Logger.d(this.f43757a, "handle DID_CLICKED click url candidate's timestamp is not within the time range");
        }
        a(eVar, false, "handleDidClicked");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f43423a;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        synchronized (BannerFinder.class) {
            Iterator<e> it = I.values().iterator();
            while (it.hasNext()) {
                it.next().f44399ac = true;
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(String str, RedirectDetails redirectDetails, m mVar, boolean z10, boolean z11) {
        Logger.d(this.f43757a, "handle " + redirectDetails.f43728e.name().toLowerCase() + " for " + str + Z7.f27998r + this.f43759c.name() + ", view address: " + redirectDetails.f43729f + ", requested URL: " + redirectDetails.f43730g + ", redirect URL: " + mVar.f44525d + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(redirectDetails.f43727d));
        if (redirectDetails.f43728e == RedirectDetails.RedirectType.REDIRECT) {
            String str2 = mVar.f44527f;
            if (TextUtils.isEmpty(str2)) {
                str2 = z10 ? "external" : RedirectEvent.f44652i;
            }
            redirectData.a(redirectDetails.f43730g, mVar.f44525d, str2);
        } else if (redirectDetails.f43728e == RedirectDetails.RedirectType.EXPAND) {
            redirectData.b(redirectDetails.f43730g, mVar.f44525d, mVar.f44526e);
            redirectData.a("expandedWebviewAddress=" + mVar.f44526e);
        }
        if (redirectData.f43713a || redirectData.f43714b) {
            if (redirectDetails.f43732i != null) {
                redirectData.a("prev " + redirectDetails.f43732i);
            }
            if (mVar.f44528g != null) {
                redirectData.a("prev " + mVar.f44528g);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iF = SafeDK.getInstance().f();
            synchronized (BannerFinder.class) {
                for (e eVar : I.values()) {
                    Logger.d(this.f43757a, "current banner info view address is: " + eVar.K + " and view hierarchy: " + eVar.f43774m + " and sdk: " + eVar.f43783v + " vs redirect sdk: " + redirectDetails.f43726c + " and view address: " + redirectDetails.f43729f);
                    if (eVar.f43774m != null && eVar.f43774m.contains(redirectDetails.f43729f) && eVar.f43783v != null && eVar.f43783v.equals(str) && eVar.f44397aa) {
                        boolean z12 = false;
                        for (int size = eVar.f43774m.size() - 1; size >= 0; size--) {
                            String str3 = eVar.f43774m.get(size);
                            u uVarA = DetectTouchUtils.a(str, str3);
                            long jLongValue = uVarA == null ? 0L : uVarA.f44566a.longValue();
                            Logger.d(this.f43757a, "handle " + redirectDetails.f43728e.name().toLowerCase() + ", view: " + str3 + ", last touch event time: " + jLongValue + ", diff: " + (jElapsedRealtime - jLongValue) + ", threshold: " + iF);
                            z12 = jLongValue != 0 && jElapsedRealtime - jLongValue <= ((long) iF);
                            if (z12) {
                                break;
                            }
                        }
                        redirectData.f43715c = !z12;
                        Logger.d(this.f43757a, "handle " + (redirectData.f43715c ? "auto " : "") + redirectDetails.f43728e.name().toLowerCase() + " for " + str + Z7.f27998r + this.f43759c.name() + ", view address: " + redirectDetails.f43729f + ", requested URL: " + redirectDetails.f43730g + ", redirect URL: " + mVar.f44525d);
                        if (z11) {
                            if (redirectData.f43714b || (redirectData.f43713a && redirectData.f43715c)) {
                                if (redirectData.f43723k == null) {
                                    redirectData.f43723k = BrandSafetyUtils.a(this.f43759c);
                                }
                                if (redirectData.f43714b) {
                                    eVar.f44410an = true;
                                }
                                l lVarH = eVar.h();
                                if (lVarH != null) {
                                    if (redirectData.f43714b) {
                                        ImpressionLog.a[] aVarArr = new ImpressionLog.a[1];
                                        aVarArr[0] = new ImpressionLog.a(ImpressionLog.F, redirectData.f43715c ? "auto" : "regular");
                                        eVar.a(ImpressionLog.f43649y, aVarArr);
                                    } else {
                                        ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[1];
                                        aVarArr2[0] = new ImpressionLog.a(ImpressionLog.H, z10 ? "external" : RedirectEvent.f44652i);
                                        eVar.a(ImpressionLog.f43648x, aVarArr2);
                                    }
                                    lVarH.a(redirectData);
                                    a(eVar, false, "handleRedirect");
                                    return eVar;
                                }
                            } else {
                                Logger.d(this.f43757a, "skip reporting " + redirectDetails.f43728e.name().toLowerCase() + " for " + str + Z7.f27998r + this.f43759c.name() + ", view address: " + redirectDetails.f43729f + ", requested URL: " + redirectDetails.f43730g + ", redirect URL: " + mVar.f44525d);
                                return null;
                            }
                        } else {
                            a(redirectDetails, mVar, eVar);
                            return eVar;
                        }
                    }
                }
                if (z11) {
                    u uVarA2 = DetectTouchUtils.a(str, redirectDetails.f43729f);
                    long jLongValue2 = uVarA2 == null ? 0L : uVarA2.f44566a.longValue();
                    Logger.d(this.f43757a, "handle " + redirectDetails.f43728e.name().toLowerCase() + ", last touch event time: " + jLongValue2 + ", diff: " + (jElapsedRealtime - jLongValue2) + ", threshold: " + iF);
                    redirectData.f43715c = jLongValue2 == 0 || jElapsedRealtime - jLongValue2 > ((long) iF);
                    if (redirectData.f43714b || (redirectData.f43713a && redirectData.f43715c)) {
                        Logger.d(this.f43757a, "handle " + (redirectData.f43715c ? "auto " : "") + redirectDetails.f43728e.name().toLowerCase() + " for " + str + Z7.f27998r + this.f43759c.name() + ", no banner info found, add to pending, webview: " + redirectDetails.f43729f);
                        M.put(redirectDetails.f43729f, redirectData);
                    } else {
                        Logger.d(this.f43757a, "handle " + (redirectData.f43715c ? "auto " : "") + redirectDetails.f43728e.name().toLowerCase() + " for " + str + Z7.f27998r + this.f43759c.name() + ", no banner info found, don't add to pending, webview: " + redirectDetails.f43729f);
                    }
                } else {
                    a(redirectDetails, mVar, (e) null);
                }
            }
        }
        return null;
    }

    private void a(RedirectDetails redirectDetails, m mVar, e eVar) {
        if (eVar != null) {
            Logger.d(this.f43757a, "add redirect log events to ad info, " + redirectDetails + ", " + mVar);
            if (redirectDetails.f43731h.equals("shouldOverrideUrlLoading")) {
                eVar.a(redirectDetails.f43724a, redirectDetails.f43725b, ImpressionLog.f43646v, new ImpressionLog.a("api", "so"), new ImpressionLog.a("url", redirectDetails.f43730g), new ImpressionLog.a(ImpressionLog.L, "cancel"));
            } else {
                Long l10 = redirectDetails.f43724a;
                Long l11 = redirectDetails.f43725b;
                ImpressionLog.a[] aVarArr = new ImpressionLog.a[2];
                aVarArr[0] = new ImpressionLog.a(ImpressionLog.F, redirectDetails.f43728e == RedirectDetails.RedirectType.REDIRECT ? RedirectEvent.f44645b : "expand");
                aVarArr[1] = new ImpressionLog.a("url", redirectDetails.f43730g);
                eVar.a(l10, l11, ImpressionLog.f43645u, aVarArr);
            }
            Long l12 = mVar.f44522a;
            Long l13 = mVar.f44523b;
            ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[2];
            aVarArr2[0] = new ImpressionLog.a(ImpressionLog.F, mVar.f44527f != null ? mVar.f44527f : "normal");
            aVarArr2[1] = new ImpressionLog.a("url", mVar.f44525d);
            eVar.a(l12, l13, ImpressionLog.f43647w, aVarArr2);
            return;
        }
        Logger.d(this.f43757a, "add redirect log events to view address, " + redirectDetails + ", " + mVar);
        if (redirectDetails.f43731h.equals("shouldOverrideUrlLoading")) {
            a(redirectDetails.f43729f, redirectDetails.f43724a, redirectDetails.f43725b, ImpressionLog.f43646v, new ImpressionLog.a("api", "so"), new ImpressionLog.a("url", redirectDetails.f43730g), new ImpressionLog.a(ImpressionLog.L, "cancel"));
        } else {
            String str = redirectDetails.f43729f;
            Long l14 = redirectDetails.f43724a;
            Long l15 = redirectDetails.f43725b;
            ImpressionLog.a[] aVarArr3 = new ImpressionLog.a[2];
            aVarArr3[0] = new ImpressionLog.a(ImpressionLog.F, redirectDetails.f43728e == RedirectDetails.RedirectType.REDIRECT ? RedirectEvent.f44645b : "expand");
            aVarArr3[1] = new ImpressionLog.a("url", redirectDetails.f43730g);
            a(str, l14, l15, ImpressionLog.f43645u, aVarArr3);
        }
        String str2 = redirectDetails.f43729f;
        Long l16 = mVar.f44522a;
        Long l17 = mVar.f44523b;
        ImpressionLog.a[] aVarArr4 = new ImpressionLog.a[2];
        aVarArr4[0] = new ImpressionLog.a(ImpressionLog.F, mVar.f44527f != null ? mVar.f44527f : "normal");
        aVarArr4[1] = new ImpressionLog.a("url", mVar.f44525d);
        a(str2, l16, l17, ImpressionLog.f43647w, aVarArr4);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.K != null && eVar.K.equals(str2) && eVar.f43783v != null && eVar.f43783v.equals(str) && eVar.f44397aa) {
                    return eVar.k();
                }
            }
            List<o> list = J.get(str);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (o oVar : list) {
                    if (oVar.f44545a != null && oVar.f44545a.af() != null && oVar.f44545a.af().equals(str2)) {
                        arrayList.add(oVar.f44545a);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Logger.d(this.f43757a, "get current CIs for webview address: " + str2 + ", found " + arrayList.size() + " pending CIs");
            }
            return arrayList;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f44411ao != null && eVar.f44411ao.equals(str2) && eVar.f43783v != null && eVar.f43783v.equals(str) && eVar.f44397aa) {
                    arrayList.add(eVar.i());
                }
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        List<CreativeInfo> listJ;
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar != null && (listJ = eVar.j()) != null && !listJ.isEmpty() && listJ.get(0) != null && listJ.get(0).L().equals(str2)) {
                    return listJ;
                }
            }
            List<o> list = J.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (o oVar : list) {
                    if (oVar.f44545a != null && oVar.f44545a.L().equals(str2)) {
                        arrayList.add(oVar.f44545a);
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f43774m != null && eVar.f43774m.contains(str) && eVar.f44397aa) {
                    return eVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e eVar) {
        try {
            Logger.d(this.f43757a, "clean started, currentActivityBanners size is " + I.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (eVar != null) {
                Logger.d(this.f43757a, "clean, adding to reported impressions map. id =  " + eVar.L);
                synchronized (BannerFinder.class) {
                    this.L.add(eVar.L);
                }
                eVar.f44399ac = true;
                if (eVar.f44401ae != null) {
                    eVar.f44401ae.cancel(false);
                }
                for (l lVar : eVar.g()) {
                    if (lVar.f44514b != null && lVar.f44514b.f44460b != null) {
                        lVar.f44515c = lVar.f44514b.f44460b;
                        Logger.d(this.f43757a, "clean, set last impression screenshot filename to " + lVar.f44514b.f44460b);
                    }
                }
                if (eVar.j().isEmpty()) {
                    com.safedk.android.analytics.brandsafety.creatives.e.a(eVar.f43775n);
                    SafeDKWebAppInterface.a(eVar.K);
                } else {
                    for (CreativeInfo creativeInfo : eVar.j()) {
                        if (creativeInfo != null) {
                            String strAf = creativeInfo.af();
                            com.safedk.android.analytics.brandsafety.creatives.e.a(strAf, creativeInfo);
                            com.safedk.android.analytics.brandsafety.creatives.e.a(eVar.f43775n);
                            SafeDKWebAppInterface.a(strAf);
                        }
                    }
                }
                b((c) eVar);
            }
        } catch (Throwable th2) {
            Logger.e(this.f43757a, "Error in clean " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, boolean z10, String str) {
        boolean z11 = !eVar.E;
        Logger.d(this.f43757a, "reporting event started, root=" + str + ", info.isClickReported=" + eVar.F + ", info.isClicked()=" + eVar.d() + ", shouldReportImpression=" + z11 + ", eventId=" + eVar.L + ", isMature=" + z10 + ", isOnUiThread=" + com.safedk.android.utils.k.c());
        boolean z12 = !eVar.F && eVar.d();
        long j10 = 0;
        if (eVar.f44405ai > 0 && eVar.f44406aj > 0) {
            j10 = eVar.f44405ai - eVar.f44406aj;
        }
        ArrayList arrayList = new ArrayList();
        if (eVar.j().isEmpty()) {
            Logger.d(this.f43757a, "reporting event, root=" + str + ", isMature=" + z10 + ", info=" + eVar);
            arrayList.add(a(eVar, eVar.h(), z10, eVar.F || z12, j10, (String) null));
            a((c) eVar);
        } else {
            for (l lVar : eVar.g()) {
                if (lVar.c() != null && lVar.c().V() == null) {
                    Logger.d(this.f43757a, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    lVar.a((CreativeInfo) null);
                }
                String str2 = null;
                if (z10 && lVar.f44514b != null && lVar.f44514b.f44459a != null) {
                    str2 = lVar.f44514b.f44459a + "_" + lVar.f44513a;
                    Logger.d(this.f43757a, "reporting event - imageFileIsValid filename = " + BrandSafetyUtils.a(eVar.f43777p, lVar.f44514b.f44459a, eVar.c(), lVar.f44513a, lVar.f44514b.f44464f));
                }
                Logger.d(this.f43757a, "reporting event, root=" + str + ", isMature=" + z10 + ", info=" + eVar + ", uniformity=" + (lVar.f44514b != null ? lVar.f44514b.a(500) : 0.0f));
                arrayList.add(a(eVar, lVar, z10, eVar.F || z12, j10, str2));
                if (z10 && lVar.c() != null && lVar.f44514b != null) {
                    if (this.B.size() <= SafeDK.getInstance().J()) {
                        Logger.d(this.f43757a, "reporting event waiting to report file " + lVar.f44514b.f44460b);
                        a(eVar, lVar);
                    } else {
                        Logger.d(this.f43757a, "reporting event no open slot for " + this.f43759c + ", " + lVar.f44514b.f44459a);
                        BrandSafetyUtils.d(lVar.f44514b.f44460b);
                    }
                }
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.d(this.f43757a, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z11) {
            eVar.b(true);
        }
        if (z12) {
            eVar.c(true);
            Logger.d(this.f43757a, "reporting event - setIsClickReported set to true");
        }
    }

    private static BrandSafetyEvent a(e eVar, l lVar, boolean z10, boolean z11, long j10, String str) {
        return new BrandSafetyEvent(eVar.c(), eVar.q(), str, z11, eVar.d() ? eVar.e() : null, lVar.c(), eVar.a(), eVar.p(), lVar.f44513a != null ? lVar.f44513a : "", eVar.D, z10, eVar.r(), lVar.f44514b != null ? lVar.f44514b.f44464f : null, lVar.f44514b != null ? lVar.f44514b.f44461c : 0L, lVar.f44514b != null ? lVar.f44514b.a(500) : 0.0f, lVar.f44514b != null ? lVar.f44514b.f44463e : 0, eVar.f44403ag, eVar.f44404ah, j10, eVar.f44407ak, eVar.f44408al, eVar.T, SafeDK.getInstance().e(), eVar.w(), eVar.M, eVar.N, eVar.P, eVar.Q, b(eVar, lVar).toString(), lVar.f44516d, lVar.f44517e, lVar.f44518f, lVar.f44519g);
    }

    protected void a(CreativeInfo creativeInfo, o oVar) {
        List<o> list;
        String strQ = creativeInfo.Q();
        Logger.d(this.f43757a, "set CI details - adding as pending, sdk: " + strQ + " matching info: " + oVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        synchronized (BannerFinder.class) {
            List<o> list2 = J.get(strQ);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                J.put(strQ, arrayList);
                list = arrayList;
            } else {
                list = list2;
            }
            if (!CreativeInfoManager.a(strQ, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                for (o oVar2 : list) {
                    if (oVar2.f44545a != null && oVar2.f44545a.equals(creativeInfo)) {
                        Logger.d(this.f43757a, "set CI details - CI already exists in pending list, sdk: " + strQ + " matching info: " + oVar);
                        return;
                    }
                }
                list.add(oVar);
            } else {
                Logger.d(this.f43757a, "set CI details - NOT adding as pending (config based), sdk: " + strQ + " matching info: " + oVar);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        try {
            com.safedk.android.utils.k.b(this.f43757a, "set CI details started. matchingInfo = " + oVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            CreativeInfo creativeInfo = oVar.f44545a;
            if (creativeInfo != null) {
                Logger.d(this.f43757a, "set CI details - CI exists in matchingInfo, sdk = " + creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                synchronized (BannerFinder.class) {
                    Logger.d(this.f43757a, "set CI details - starting to iterate over current activity banners: " + I.keySet());
                    for (d dVar : I.keySet()) {
                        e eVar = I.get(dVar);
                        if (a(creativeInfo, eVar)) {
                            Logger.d(this.f43757a, "set CI details - matched by webView/eventID, CI: " + creativeInfo);
                            if (creativeInfo.m() == null) {
                                Logger.d(this.f43757a, "set CI details - updated creative info eventId to " + dVar.f44390c + ", banner key = " + dVar);
                                creativeInfo.f(dVar.f44390c);
                                creativeInfo.f(true);
                            }
                            if (creativeInfo.I() == null) {
                                String strName = BrandSafetyUtils.a(eVar.A).name();
                                Logger.d(this.f43757a, "set CI details - set ad format: " + strName);
                                creativeInfo.p(strName);
                            }
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                                Logger.d(this.f43757a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                                if (!creativeInfo.F().equals(dVar.f44389b)) {
                                    Logger.d(this.f43757a, "set CI details - updated creative info placementId to " + dVar.f44389b + ", banner key = " + dVar);
                                    creativeInfo.h(dVar.f44389b);
                                }
                            }
                            if (a(dVar.f44388a, dVar.f44392e, oVar)) {
                                return true;
                            }
                            if (creativeInfo.B()) {
                                Logger.d(this.f43757a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                                creativeInfo.f(false);
                                creativeInfo.f((String) null);
                            }
                        }
                    }
                    a(creativeInfo, oVar);
                    return true;
                }
            }
        } catch (Throwable th2) {
            Logger.e(this.f43757a, "set CI details exception: " + th2.getMessage(), th2);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, e eVar) {
        if (eVar == null) {
            Logger.d(this.f43757a, "verify matching - banner info is null");
            return false;
        }
        if (eVar.f43783v == null) {
            Logger.d(this.f43757a, "verify matching - banner info maxSdk is null");
            return false;
        }
        if (creativeInfo == null) {
            Logger.d(this.f43757a, "verify matching - creative info is null");
            return false;
        }
        String strQ = creativeInfo.Q();
        if (!eVar.f43783v.equals(strQ)) {
            Logger.d(this.f43757a, "verify matching  - sdks does not match, ci sdk is: " + strQ + " and banner sdk is: " + eVar.f43783v);
            return false;
        }
        Logger.d(this.f43757a, "verify matching - ci sdk is: " + strQ + ", banner info: " + eVar);
        if (eVar.L != null && creativeInfo.m() != null && !eVar.L.equals(creativeInfo.m())) {
            Logger.d(this.f43757a, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + eVar.L);
            if (!CreativeInfoManager.a(eVar.f43783v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId:" + creativeInfo.m());
        }
        return a(creativeInfo.ae(), creativeInfo.af(), eVar);
    }

    private boolean a(String str, String str2, e eVar) {
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str)) {
            Logger.d(this.f43757a, "verify matching object skipped, event ID: " + eVar.L + ", object address: " + str2 + ", object type: " + str);
            return true;
        }
        if (eVar.x() != null && eVar.x().contains(str2)) {
            Logger.d(this.f43757a, "verify matching object done, event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
            return true;
        }
        if (CreativeInfoManager.a(str2, eVar)) {
            Logger.d(this.f43757a, "verify matching object done, multiple webviews detected for banner. event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
            return true;
        }
        Logger.d(this.f43757a, "verify matching object failed, event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
        return false;
    }

    private boolean a(String str, String str2, o oVar) {
        e eVar;
        com.safedk.android.utils.k.b(this.f43757a, "set CI started, adUnitId=" + str + " matchingInfo=" + oVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (oVar == null) {
            Logger.d(this.f43757a, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f44545a;
        if (creativeInfo != null) {
            d dVar = new d(creativeInfo.i() != null ? creativeInfo.i() : str, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), str2, creativeInfo.K());
            Logger.d(this.f43757a, "set CI - activity key: " + dVar);
            synchronized (BannerFinder.class) {
                Iterator<d> it = I.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    }
                    d next = it.next();
                    if (dVar.a(next, creativeInfo)) {
                        eVar = I.get(next);
                        break;
                    }
                }
            }
            com.safedk.android.utils.k.b(this.f43757a, "set CI - current activity banner: " + eVar + ", current activity banners: " + I);
            if (eVar != null) {
                if (!eVar.f44400ad && StatsReporter.b().a(creativeInfo, eVar)) {
                    eVar.f44400ad = true;
                }
                CreativeInfo creativeInfoI = eVar.i();
                if (creativeInfoI != null) {
                    Logger.d(this.f43757a, "set CI - previous CI id: " + creativeInfoI.L());
                    if (creativeInfoI.L() != null && creativeInfoI.L().equals(creativeInfo.L())) {
                        CreativeInfoManager.b(creativeInfoI);
                        com.safedk.android.utils.k.b(this.f43757a, "set CI - already matched, same ad ID. current match: " + creativeInfo.X() + ", previous match: " + creativeInfoI.X());
                    }
                }
                boolean z10 = creativeInfo.V() != null;
                creativeInfo.a(oVar.f44546b, oVar.f44547c);
                Logger.d(this.f43757a, "set CI - current banner webview address: " + eVar.K + " is CI set earlier: " + z10);
                Logger.d(this.f43757a, "set CI - current banner: " + eVar);
                Logger.d(this.f43757a, "set CI - current debug info: " + creativeInfo.U());
                eVar.a(creativeInfo);
                if (!z10) {
                    a(eVar.h());
                    eVar.h().d();
                }
                Logger.d(this.f43757a, "set CI - CI is set for activity banner " + dVar + ". CI : " + creativeInfo);
                if (j(eVar.c()) && creativeInfo.v() && eVar.f44409am != null && !eVar.H && eVar.f44409am.f43522d != null) {
                    eVar.f44409am.f43522d.cancel(false);
                    eVar.f44409am = null;
                    Logger.d(this.f43757a, "set CI - canceling running impressionHandlerTask (ad is a video ad) " + eVar);
                }
                k(creativeInfo.af());
                if (eVar.K != null && (eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO)) {
                    com.safedk.android.utils.k.b(this.f43757a, "set CI - attach resources to CI, webview address: " + eVar.K + " , ci: " + creativeInfo);
                    com.safedk.android.analytics.brandsafety.creatives.e.a(eVar.K, creativeInfo);
                }
                if (creativeInfoI != null && creativeInfoI.L() != null && creativeInfoI.L().equals(creativeInfo.L())) {
                    for (String str3 : creativeInfoI.q()) {
                        if (!creativeInfo.q().contains(str3)) {
                            Logger.d(this.f43757a, "set CI - added resource URL " + str3 + " to CI");
                            creativeInfo.q().add(str3);
                        }
                    }
                    for (String str4 : creativeInfoI.p()) {
                        if (!creativeInfo.p().contains(str4)) {
                            Logger.d(this.f43757a, "set CI - added DSP URL " + str4 + " to CI");
                            creativeInfo.p().add(str4);
                        }
                    }
                }
                b(eVar, creativeInfo);
                a(eVar, false, "setCreativeInfo");
                return true;
            }
            com.safedk.android.utils.k.b(this.f43757a, "set CI - no activity banner, cannot set CI. current activity banners: " + I);
            CreativeInfoManager.b(creativeInfo);
            return false;
        }
        Logger.d(this.f43757a, "set CI - no CI");
        return false;
    }

    private boolean a(c cVar, String str, String str2) {
        if (cVar != null) {
            String strC = com.safedk.android.utils.k.c(str, "clcode");
            Logger.d(this.f43757a, "check ad click URL validity - clcode: " + strC + ", view address: " + str2 + ", views hierarchy: " + cVar.x());
            CreativeInfo creativeInfoI = cVar.i();
            if ((strC != null && creativeInfoI != null && !creativeInfoI.L().equals(strC)) || cVar.x() == null || str2 == null || !cVar.x().contains(str2)) {
                Logger.d(this.f43757a, "check ad click URL validity - ad ID or view address does not match. clcode: " + strC + ", view address: " + str2 + ", views hierarchy: " + cVar.x());
                return false;
            }
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        Logger.d(this.f43757a, "set ad click URL started, sdkPackageName: " + str2 + ", url: " + str + ", view address: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        List<CreativeInfo> listA = a(str2, str3);
        if (listA != null) {
            Iterator<CreativeInfo> it = listA.iterator();
            while (true) {
                z10 = z12;
                if (!it.hasNext()) {
                    break;
                }
                CreativeInfo next = it.next();
                if (!next.af().equals(str3) || next.ah()) {
                    z12 = z10;
                } else {
                    Logger.d(this.f43757a, "check ad click URL validity - view address: " + str3 + ", updating click_url in pending CIs list. url = " + str + ", adId = " + next.L());
                    next.t(str);
                    z12 = true;
                }
            }
        } else {
            z10 = false;
        }
        if (str != null) {
            synchronized (BannerFinder.class) {
                for (e eVar : I.values()) {
                    if (eVar == null || eVar.c() == null || !SdksMapping.isSameSdkByPackages(eVar.c(), str2) || !a(eVar, str, str3)) {
                        z11 = z10;
                    } else {
                        if (!eVar.d()) {
                            Logger.d(this.f43757a, "set ad click URL - current activity banner is not marked as clicked, setting candidate: " + str);
                            h(str, str3);
                        } else if (eVar.e() == null) {
                            com.safedk.android.utils.k.b(this.f43757a, "set ad click URL - no click URL yet, setting click URL: " + str + ", CI: " + eVar.i());
                            if (eVar.c(str)) {
                                a(eVar, false, "setCurrentAdClickURL");
                            }
                        } else {
                            com.safedk.android.utils.k.b(this.f43757a, "set ad click URL - click URL already set: " + eVar.e() + ", CI: " + eVar.i());
                        }
                        z11 = true;
                    }
                    z10 = z11;
                }
            }
        }
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
    }

    public void l(String str) {
        Logger.d(this.f43757a, "stop taking screenshots started, address = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                Logger.d(this.f43757a, "stop taking screenshots - checking banner info address = " + eVar.K);
                if (eVar.K != null && eVar.K.equals(str)) {
                    Logger.d(this.f43757a, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = " + eVar.K);
                    eVar.O = true;
                    for (l lVar : eVar.g()) {
                        if (lVar.c() != null && str != null && str.equals(lVar.c().af())) {
                            a(lVar);
                            if (lVar.f44514b != null && lVar.f44514b.f44460b != null) {
                                Logger.d(this.f43757a, "stop taking screenshots - removing hash and file " + lVar.f44514b.f44460b);
                                BrandSafetyUtils.d(lVar.f44514b.f44460b);
                                lVar.f44514b.f44459a = null;
                            }
                        }
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10) {
        boolean zB = BrandSafetyUtils.b(i10);
        Logger.d(this.f43757a, "should stop sampling, max uniformed pixels count=" + i10 + ", return value=" + zB);
        return zB;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Logger.d(this.f43757a, "on background started");
        if (I != null) {
            for (e eVar : I.values()) {
                if (eVar.f44397aa && eVar.f43777p == this.f43759c) {
                    eVar.a(ImpressionLog.f43650z, new ImpressionLog.a[0]);
                    a(eVar, false, "onBackground");
                }
            }
        }
        BrandSafetyUtils.g();
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Logger.d(this.f43757a, "on foreground started");
        if (I != null) {
            for (e eVar : I.values()) {
                if (eVar.f44397aa && eVar.f43777p == this.f43759c) {
                    eVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    a(eVar, false, "onForeground");
                }
            }
        }
    }

    private void h(String str, String str2) {
        N = new h(System.currentTimeMillis(), str, str2);
    }

    public static synchronized void a(String str, MaxAdView maxAdView, BrandSafetyUtils.AdType adType) {
        if (str != null && maxAdView != null) {
            P.put(BrandSafetyUtils.a(maxAdView), adType);
            List<WeakReference<MaxAdView>> arrayList = O.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                O.put(str, arrayList);
                Logger.d("BannerFinder", "add Max ad view: added adUnitId: " + str + " to maxAdViews map, isOnUiThread = " + com.safedk.android.utils.k.c());
            } else if (arrayList.get(0).get() != maxAdView) {
            }
            arrayList.add(0, new WeakReference<>(maxAdView));
            Logger.d("BannerFinder", "add Max ad view: " + maxAdView + ", address: " + BrandSafetyUtils.a(maxAdView) + ", list size: " + arrayList.size());
        }
    }

    public static synchronized void a(MaxAdView maxAdView) {
        P.remove(BrandSafetyUtils.a(maxAdView));
        Iterator<String> it = O.keySet().iterator();
        while (it.hasNext() && !a(it.next(), maxAdView)) {
        }
    }

    public static synchronized boolean a(String str, MaxAdView maxAdView) {
        boolean z10;
        List<WeakReference<MaxAdView>> list = O.get(str);
        if (maxAdView == null || list == null) {
            z10 = false;
        } else {
            for (WeakReference<MaxAdView> weakReference : list) {
                if (weakReference != null && maxAdView == weakReference.get()) {
                    weakReference.clear();
                    list.remove(weakReference);
                    Logger.d("BannerFinder", "remove Max ad view: " + maxAdView + ", address: " + BrandSafetyUtils.a(maxAdView) + ", list size: " + list.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    if (list.isEmpty()) {
                        O.remove(str);
                        Logger.d("BannerFinder", "remove Max ad view: removing adUnitId: " + str + " from maxAdViews");
                    }
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public void a(l lVar) {
        Logger.d(this.f43757a, "remove impression screenshots started with impression: " + lVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f43757a, "remove impression screenshots started report impression size is: " + (this.C != null ? Integer.valueOf(this.C.size()) : "null"));
        if (lVar != null) {
            String str = lVar.f44515c;
            if (str == null && lVar.f44514b != null) {
                str = lVar.f44514b.f44460b;
            }
            if (str != null) {
                Logger.d(this.f43757a, "Calling remove ad files, filename = " + str);
                BrandSafetyUtils.d(str);
                lVar.f44515c = null;
            } else {
                Logger.d(this.f43757a, "lastActivityImpressionScreenshotFilename is null and image is: " + lVar.f44514b);
            }
        }
        if (this.C != null) {
            this.C.clear();
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f43519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<View> f43520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43521c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScheduledFuture<?> f43522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f43523e;

        public a(e eVar, WeakReference<View> weakReference, int i10) {
            this.f43520b = weakReference;
            this.f43519a = eVar;
            this.f43523e = i10;
            String strA = BrandSafetyUtils.a(weakReference.get());
            if (eVar != null) {
                eVar.K = strA;
                l lVarH = eVar.h();
                Logger.d(BannerFinder.this.f43757a, "Impression handler task: webviewAddress: " + strA + ", impression is: " + lVarH + " CI is: " + (lVarH != null ? lVarH.c() : null) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (lVarH != null && lVarH.c() != null) {
                    com.safedk.android.analytics.brandsafety.creatives.e.a(strA, lVarH.c());
                    return;
                }
                return;
            }
            Logger.d(BannerFinder.this.f43757a, "Impression handler task: currentActivityBanner is null with webview address: " + strA);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f43519a != null) {
                this.f43521c++;
                if (com.safedk.android.utils.k.a((Reference<?>) this.f43519a.f44402af)) {
                    if (this.f43521c >= this.f43523e || this.f43519a.f44399ac) {
                        Logger.d(BannerFinder.this.f43757a, "Going to report banner, eventId=" + this.f43519a.L + ", stopTimerAndReport=" + this.f43519a.f44399ac + ", image counter=" + this.f43521c + ", max attempts=" + this.f43523e + ", isImpressionReported=" + this.f43519a.E);
                        if (!this.f43519a.E) {
                            BannerFinder.this.a(this.f43519a, false, "ImpressionHandlerTask");
                        }
                        this.f43520b.clear();
                        this.f43522d.cancel(false);
                        return;
                    }
                    if (!this.f43519a.O) {
                        if (BannerFinder.this.a(this.f43519a) && com.safedk.android.utils.k.a((Reference<?>) this.f43520b)) {
                            a(this.f43519a, this.f43520b.get());
                            if ((this.f43520b.get() instanceof ViewGroup) && CreativeInfoManager.a(this.f43519a.c(), AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false)) {
                                BannerFinder.this.a((ViewGroup) this.f43520b.get(), this.f43519a);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Logger.d(BannerFinder.this.f43757a, "no creative info yet or request no sampling received, current activity banner = " + this.f43519a);
                    return;
                }
                Logger.d(BannerFinder.this.f43757a, "timer task cannot be started: banner activity=" + (!com.safedk.android.utils.k.a((Reference<?>) this.f43519a.f44402af) ? "" : this.f43519a.f44402af.get().getClass().getName()) + ", current activity banner=" + this.f43519a);
            }
        }

        private void a(final e eVar, final View view) {
            if (eVar != null && view != null) {
                try {
                    Logger.d(BannerFinder.this.f43757a, "Taking screenshot, view=" + view + ", event id=" + eVar.L + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    eVar.c();
                    WeakReference<Activity> weakReference = eVar.f44402af;
                    if (com.safedk.android.utils.k.a((Reference<?>) weakReference)) {
                        weakReference.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().X());
                                BannerFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        a.this.a(eVar, bitmapA, a.this.f43521c);
                                    }
                                });
                            }
                        });
                    }
                } catch (Throwable th2) {
                    Logger.e(BannerFinder.this.f43757a, "Error while taking screenshot", th2);
                    Logger.printStackTrace();
                    new CrashReporter().caughtException(th2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(e eVar, Bitmap bitmap, int i10) {
            if (bitmap != null) {
                String strC = eVar.c();
                BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(strC, bitmap);
                int iA = aVarB.a();
                BrandSafetyUtils.ScreenshotValidity screenshotValidityB = BrandSafetyUtils.b(strC, aVarB);
                if (screenshotValidityB == BrandSafetyUtils.ScreenshotValidity.VALID) {
                    String strA = BrandSafetyUtils.a(bitmap);
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientationB = BrandSafetyUtils.b(bitmap);
                    l lVarH = eVar.h();
                    String strA2 = BrandSafetyUtils.a(bitmap, BannerFinder.this.f43759c, strA, strC, lVarH.f44513a, screenShotOrientationB);
                    if (!BannerFinder.this.e(strA2, strC, strA)) {
                        Logger.d(BannerFinder.this.f43757a, "process screenshot - image is not valid : " + strA2);
                    }
                    Logger.d(BannerFinder.this.f43757a, "process screenshot - screenshot file created, counter = " + i10 + " filename = " + strA2 + ", hash = " + strA);
                    long jC = BrandSafetyUtils.c(strA2);
                    Logger.d(BannerFinder.this.f43757a, "process screenshot - hash " + strA + ", stored file size is " + jC + " bytes, counter is " + i10 + ", uniform pixel count is " + iA + " (" + ((iA / 500.0f) * 100.0f) + "%)");
                    int size = BannerFinder.this.B.size();
                    if (!BannerFinder.this.e(strA, lVarH.f44513a)) {
                        if (size <= SafeDK.getInstance().J()) {
                            if (lVarH.f44514b != null && lVarH.f44514b.f44459a != null && !lVarH.f44514b.f44459a.equals(strA)) {
                                Logger.d(BannerFinder.this.f43757a, "process screenshot - removing ad file " + lVarH.f44514b.f44460b);
                                BrandSafetyUtils.d(lVarH.f44514b.f44460b);
                            }
                            lVarH.b(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                            Logger.d(BannerFinder.this.f43757a, "process screenshot - setting data hash = " + strA + ", file name = " + strA2 + ", file size = " + jC + ", max uniformed pixel count = " + iA + ", image counter = " + i10);
                            lVarH.f44514b = new j(strA, strA2, jC, iA, i10, screenShotOrientationB, false);
                            BannerFinder.this.a(eVar, false, "processScreenshot");
                        } else if (!BannerFinder.this.d(strA, lVarH.f44513a)) {
                            Logger.d(BannerFinder.this.f43757a, "process screenshot - No open slot for " + strA + "_" + lVarH.f44513a);
                            BrandSafetyUtils.d(strA2);
                        } else {
                            Logger.d(BannerFinder.this.f43757a, "process screenshot - Image " + strA + "_" + lVarH.f44513a + " is already scheduled for upload");
                        }
                    } else {
                        Logger.d(BannerFinder.this.f43757a, "process screenshot - Not saving file for " + strA + "_" + lVarH.f44513a);
                        BrandSafetyUtils.d(strA2);
                    }
                    if (BannerFinder.this.a(iA)) {
                        if (!TextUtils.isEmpty(strA)) {
                            eVar.d(true);
                            eVar.f44399ac = true;
                        }
                        lVarH.a(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                        return;
                    }
                    return;
                }
                Logger.d(BannerFinder.this.f43757a, "process screenshot - screenshot is not valid: " + screenshotValidityB.name() + ", pixel count: " + iA + ", counter = " + i10 + ", try again...");
            }
        }
    }

    protected boolean a(e eVar) {
        if (eVar != null) {
            if (!SafeDK.getInstance().I()) {
                CreativeInfo creativeInfoI = eVar.i();
                if (creativeInfoI == null) {
                    Logger.d(this.f43757a, "don't take screenshot, no creative info yet");
                } else {
                    boolean zA = CreativeInfoManager.a(eVar.f43783v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    if (creativeInfoI.ah() && !zA) {
                        Logger.d(this.f43757a, "don't take screenshot, multi ad, sdk: " + eVar.f43783v);
                    } else {
                        Logger.d(this.f43757a, "take screenshot, banner ad");
                        return true;
                    }
                }
            } else {
                Logger.d(this.f43757a, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar, Bundle bundle, String str) {
        e eVar = I.get(dVar);
        if (eVar == null || dVar.f44394g == null) {
            return false;
        }
        d dVar2 = Q.get(dVar.f44388a);
        if (dVar2 != null && !dVar2.equals(dVar)) {
            Logger.d(this.f43757a, "clear CI from banner info - a new banner has loaded instead, not deleting it");
            return false;
        }
        Logger.d(this.f43757a, "clear CI from banner info started with maxCreativeId: " + str + " and webview address: " + dVar.f44394g + " and adInfoKey: " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f43757a, "clear CI from banner info started with impressions size: " + eVar.g().size() + " banner info: " + eVar);
        List<l> listG = eVar.g();
        for (l lVar : listG) {
            a(lVar);
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(lVar.f44513a);
            }
        }
        listG.clear();
        long j10 = eVar.f44405ai;
        long j11 = eVar.f44406aj;
        e eVarA = a(eVar.f44402af.get(), eVar.f43783v, dVar.f44390c, bundle);
        eVarA.f44397aa = true;
        eVarA.f44403ag = true;
        eVarA.f44405ai = j10;
        eVarA.f44406aj = j11;
        eVarA.f44404ah = true;
        I.put(dVar, eVarA);
        Logger.d(this.f43757a, "handle WILL_DISPLAY New activity banner created for " + eVarA.f43783v + ", banner key is " + dVar + ", current activity banners size is " + I.size());
        dVar.f44395h = null;
        return true;
    }

    private boolean a(String str, WeakReference<MaxAdView> weakReference, d dVar) {
        if (!CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false) || dVar.f44394g == null) {
            return false;
        }
        List<WeakReference<View>> listA = a((ViewGroup) weakReference.get());
        List<String> listC = c(listA);
        List<WeakReference<WebView>> listB = b(listA);
        Logger.d(this.f43757a, "find banner impression - webview is: " + dVar.f44394g + " there are " + listB.size() + " webViews and the views addresses list is: " + listC + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (listC.contains(dVar.f44394g) || listB.size() <= 0) {
            return false;
        }
        Logger.d(this.f43757a, "web view scanner - did not find webview address " + dVar.f44394g + " inside the views list, first webview address is: " + BrandSafetyUtils.a(listB.get(0).get()));
        return true;
    }

    protected void a(String str, String str2, d dVar, String str3, List<WeakReference<View>> list, List<String> list2) {
        try {
            List<WeakReference<MaxAdView>> list3 = O.get(dVar.f44388a);
            synchronized (BannerFinder.class) {
                if (list3 != null) {
                    for (WeakReference<MaxAdView> weakReference : list3) {
                        if (weakReference.get() != null) {
                            Logger.d(this.f43757a, "find banner impression - sdk: " + str + ", ad unit id: " + dVar.f44388a + ", max ad view: " + weakReference.get().toString() + ", address: " + BrandSafetyUtils.a(weakReference.get()) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            list2.add(BrandSafetyUtils.a(weakReference.get()));
                            arrayList2.add("h1c1:" + weakReference.get().toString());
                            String strL = BrandSafetyUtils.l(str3);
                            dVar.f44396i = a(str, weakReference, dVar);
                            a(weakReference.get(), str, strL, str2, dVar, list, arrayList, list2, arrayList2, 1, false, false);
                            Logger.d(this.f43757a, "scan for banner views - viewHierarchy is: " + list2);
                            if (!list.isEmpty()) {
                                Logger.d(this.f43757a, "find banner impression - found views: " + arrayList);
                                com.safedk.android.utils.k.b(this.f43757a, "find banner impression - views hierarchy: " + arrayList2);
                                return;
                            }
                            Logger.d(this.f43757a, "find banner impression - no new views found for top view: " + weakReference.get().toString());
                        } else {
                            Logger.d(this.f43757a, "find banner impression - sdk: " + str + ", ad unit id: " + dVar.f44388a + ", no max ad view found");
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.e(this.f43757a, "Failed while scanning the screen for banners", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x019f A[EDGE_INSN: B:39:0x019f->B:29:0x0154 BREAK  A[LOOP:1: B:24:0x011f->B:60:?]] */
    public void a(List<WeakReference<View>> list, d dVar, long j10) {
        boolean z10;
        Logger.d(this.f43757a, "report completed banners started, views = " + list + ", adInfoKey = " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        final ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (Map.Entry<d, e> entry : I.entrySet()) {
                if (entry.getKey().equals(dVar)) {
                    Logger.d(this.f43757a, "report completed banners Skipping banner info of new impression, key=" + entry.getKey());
                } else if (!entry.getKey().f44388a.equals(dVar.f44388a)) {
                    Logger.d(this.f43757a, "report completed banners Skipping banner info of another adUnitId, key=" + entry.getKey());
                } else if (j10 <= entry.getValue().f44405ai) {
                    Logger.d(this.f43757a, "report completed banners Skipping banner info of later impression, key=" + entry.getKey());
                } else {
                    Logger.d(this.f43757a, "report completed banners Check to report banner info, adInfoKey=" + entry.getKey());
                    entry.getKey();
                    e value = entry.getValue();
                    if (value.K == null) {
                        z10 = false;
                        break;
                    }
                    Logger.d(this.f43757a, "report completed banners Looking for completed banners to report, WebView=" + value.K);
                    if (list == null) {
                        z10 = false;
                        break;
                    }
                    Iterator<WeakReference<View>> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        String strA = BrandSafetyUtils.a(it.next().get());
                        if (value.K.equals(strA)) {
                            Logger.d(this.f43757a, "report completed banners WebView address still active, WebView=" + strA);
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10 && value.f44397aa) {
                        Logger.d(this.f43757a, "report completed banners executing postponed banner reporting for eventId " + value.L);
                        value.a(ImpressionLog.C, new ImpressionLog.a[0]);
                        value.f44397aa = false;
                        value.U = true;
                        arrayList.add(entry);
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry2 : arrayList) {
                        Logger.d(BannerFinder.this.f43757a, "report completed banners starting reporting for eventId " + ((e) entry2.getValue()).L);
                        if (!BannerFinder.this.L.contains(((d) entry2.getKey()).f44390c)) {
                            BannerFinder.this.a((e) entry2.getValue(), true, "reportCompletedBanners");
                            synchronized (BannerFinder.class) {
                                BannerFinder.I.remove(entry2.getKey());
                            }
                            BannerFinder.this.b((e) entry2.getValue());
                        }
                    }
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    protected void a(ViewGroup viewGroup, String str, String str2, String str3, d dVar, List<WeakReference<View>> list, List<v> list2, List<String> list3, List<String> list4, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (viewGroup != null) {
            int i11 = i10 + 1;
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                String strA = BrandSafetyUtils.a(childAt);
                list3.add(strA);
                list4.add("h" + i11 + "c" + (i12 + 1) + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt);
                e eVar = I.get(dVar);
                if (!((eVar != null && eVar.i() == null && eVar.f43774m != null && eVar.f43774m.size() > 0) || !CreativeInfoManager.a(str, AdNetworkConfiguration.AVOID_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false)) || !a(childAt, str, str3, dVar)) {
                    if (TextUtils.isEmpty(str2)) {
                        z12 = true;
                    } else if (str2.equals(strA)) {
                        Logger.d(this.f43757a, "scan for banner views - verified by ad network view address received from Max: " + str2 + ", view: " + childAt + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (z12) {
                        a(viewGroup, str, dVar);
                    }
                    if (z12 && (childAt instanceof WebView)) {
                        a(childAt, str, list, list2, dVar);
                        return;
                    }
                    if (z12 && a(str, childAt)) {
                        a(childAt, str, list, list2, dVar);
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if ((childAt instanceof TextView) && z13) {
                        if (eVar != null && eVar.i() != null && !eVar.E()) {
                            TextView textView = (TextView) childAt;
                            eVar.i().y("text:" + textView.getText().toString());
                            Logger.d(this.f43757a, "scan for banner views - added text " + textView.getText().toString());
                        }
                    } else if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, str, str2, str3, dVar, list, list2, list3, list4, i11, z12, z13);
                    }
                    i12++;
                    z11 = z13;
                    z10 = z12;
                } else {
                    return;
                }
            }
        }
    }

    protected void b(ViewGroup viewGroup, List<v> list, List<String> list2, int i10) {
        if (viewGroup != null) {
            int i11 = i10 + 1;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i13);
                    list2.add("h" + i11 + "c" + (i13 + 1) + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt);
                    if (childAt instanceof WebView) {
                        list.add(new v(BrandSafetyUtils.a(childAt), childAt.getClass().getName(), childAt.getWidth(), childAt.getHeight()));
                        Logger.d(this.f43757a, "found expanded view: " + childAt + ": width: " + childAt.getWidth() + " height: " + childAt.getHeight() + " sdk: " + childAt.getClass().getName());
                    } else if (childAt instanceof ViewGroup) {
                        b((ViewGroup) childAt, list, list2, i11);
                    }
                    i12 = i13 + 1;
                } else {
                    return;
                }
            }
        }
    }

    protected void a(ViewGroup viewGroup, e eVar) {
        Logger.d(this.f43757a, "collect banner text started. view : " + viewGroup + ", bannerInfo : " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (viewGroup != null) {
            if (eVar.E()) {
                Logger.d(this.f43757a, "collect banner text - ad is a native ad: " + viewGroup + ", child count is: " + viewGroup.getChildCount());
                return;
            }
            Logger.d(this.f43757a, "collect banner text - view is: " + viewGroup + ", child count is: " + viewGroup.getChildCount());
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i11);
                    Logger.d(this.f43757a, "collect banner text - child view " + i11 + " is: " + childAt);
                    if (childAt instanceof TextView) {
                        Logger.d(this.f43757a, "collect banner text - text box found. view " + childAt);
                        if (eVar != null && eVar.i() != null) {
                            TextView textView = (TextView) childAt;
                            eVar.i().y("text:" + textView.getText().toString());
                            Logger.d(this.f43757a, "collect banner text - added text " + textView.getText().toString());
                        }
                    } else if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, eVar);
                    }
                    i10 = i11 + 1;
                } else {
                    return;
                }
            }
        }
    }

    protected boolean a(View view, String str, List<WeakReference<View>> list, List<v> list2, d dVar) {
        String strA = BrandSafetyUtils.a(view);
        Logger.d(this.f43757a, "handle ad view - view is an instance of " + view.getClass().getName() + " : " + strA + ", class : " + view.getClass().getCanonicalName() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String sdkPackageByClass = SdksMapping.getSdkPackageByClass(view.getClass().getName());
        Logger.d(this.f43757a, "handle ad view - sdk of view: " + sdkPackageByClass + ", sdk: " + str + " and event id: " + dVar.f44390c);
        if ((c(view) || sdkPackageByClass == null || sdkPackageByClass.equals(str)) && !m(strA)) {
            list2.add(new v(strA, view.getClass().getName(), view.getWidth(), view.getHeight()));
            list.add(new WeakReference<>(view));
            Logger.d(this.f43757a, "found view: " + view + ": width: " + view.getWidth() + " height: " + view.getHeight() + " sdk: " + view.getClass().getName());
            if (view instanceof WebView) {
                return true;
            }
        }
        Logger.d(this.f43757a, "view is not a valid instance of web view, or web view already matched, view: " + view);
        return false;
    }

    public static boolean c(View view) {
        return view != null && view.getClass().getName().equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f44080m);
    }

    private boolean a(final View view, String str, final String str2, final d dVar) {
        String strC;
        final AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
        if (adNetworkDiscoveryH == null) {
            Logger.d(this.f43757a, "extract ad ID from view - no discovery object for: " + str);
            return false;
        }
        boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        boolean zA2 = CreativeInfoManager.a(str, AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        boolean zA3 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        boolean zA4 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        e eVar = I.get(dVar);
        if (zA) {
            if (eVar != null && eVar.i() == null && eVar.f43774m != null && (strC = adNetworkDiscoveryH.c(view)) != null && eVar.i() == null) {
                Logger.d(this.f43757a, "extract ad ID from view - ad ID extracted from view: " + strC + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (zA2 && str2 != null && !str2.equals(strC)) {
                    Logger.d(this.f43757a, "extract ad ID from view - value extracted (" + strC + ") from widget is not equal to creative ID (" + str2 + ")");
                    return true;
                }
                Logger.d(this.f43757a, "extract ad ID from view - attempting to locate ci by ad ID value " + strC + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) strC);
                if (creativeInfoA != null) {
                    Logger.d(this.f43757a, "extract ad ID from view - CI found, ad ID = " + strC + ", view : " + view.toString() + ", ci : " + creativeInfoA);
                    creativeInfoA.a((Object) view);
                    creativeInfoA.f(dVar.f44390c);
                    creativeInfoA.h(dVar.f44389b);
                    b(creativeInfoA, eVar);
                    Logger.d(this.f43757a, "extract ad ID from view - ci placementId set to " + dVar.f44389b + ", event ID : " + dVar.f44390c + " , ad type  = " + creativeInfoA.K());
                    a(new o(creativeInfoA, CreativeInfo.f44332n, strC));
                } else {
                    Logger.d(this.f43757a, "extract ad ID from view - CI not found, adId = " + strC);
                }
            }
        } else if (zA3) {
            final e eVar2 = I.get(dVar);
            final boolean zA5 = CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
            final String strA = BrandSafetyUtils.a(view);
            d dVar2 = Q.get(dVar.f44388a);
            final boolean z10 = dVar.f44396i && !dVar.f44394g.equals(strA) && (dVar2 == null || dVar2.equals(dVar));
            if (eVar2 != null && (eVar2.j().isEmpty() || z10)) {
                this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!zA5 || eVar2.j().isEmpty() || (z10 && (view instanceof WebView))) {
                                List<CreativeInfo> listA = adNetworkDiscoveryH.a(new WeakReference<>(view), str2, false);
                                if (listA == null || listA.size() == 0) {
                                    Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - reflect CI not found for max creative Id: " + str2 + " and creative info size is: " + eVar2.j().size());
                                    return;
                                }
                                Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - ad info's webview is: " + dVar.f44394g + " and view address is: " + strA + " and max creative id: " + str2 + " and banner info CI list size is: " + eVar2.j().size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                                Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - is the view webView? " + (view instanceof WebView) + " and event id is: " + dVar.f44390c);
                                for (CreativeInfo creativeInfo : listA) {
                                    creativeInfo.a((Object) view);
                                    creativeInfo.a(BannerFinder.this.f43759c);
                                    creativeInfo.f(dVar.f44390c);
                                    String strF = creativeInfo.F();
                                    creativeInfo.h(dVar.f44389b);
                                    if (creativeInfo.L() == null) {
                                        creativeInfo.r(creativeInfo.N());
                                    }
                                    Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - reflect CI found, view : " + view + " did webview replaced? " + z10 + ", ci : " + creativeInfo.X());
                                    Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - current adInfoKey's MatchedCIId is: " + dVar.f44395h);
                                    String strO = creativeInfo.M() != null ? com.safedk.android.utils.k.o(creativeInfo.M()) : null;
                                    Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - click url is: " + strO);
                                    if (dVar.f44395h != null && creativeInfo.L() != null) {
                                        if (!((!dVar.f44396i || dVar.f44395h.contains(new StringBuilder().append(creativeInfo.L()).append("##").toString()) || (strF != null && dVar.f44395h.contains(new StringBuilder().append("##").append(strF).toString())) || (strO != null && dVar.f44395h.contains(new StringBuilder().append("**").append(strO).toString()))) ? false : BannerFinder.this.a(dVar, eVar2.A, str2)) && dVar.f44395h != null && (dVar.f44395h.contains(creativeInfo.L() + "##") || dVar.f44395h.contains("##" + strF) || dVar.f44395h.contains("**" + strO))) {
                                            Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - redundant CI, exiting with event id - " + dVar.f44390c);
                                            return;
                                        }
                                    }
                                    dVar.f44394g = strA;
                                    String str3 = creativeInfo.L() + "##" + strF + "**" + strO;
                                    if (dVar.f44395h == null || !dVar.f44395h.contains(str3)) {
                                        d dVar3 = dVar;
                                        if (dVar.f44395h != null) {
                                            str3 = dVar.f44395h + ImpressionLog.P + str3;
                                        }
                                        dVar3.f44395h = str3;
                                    }
                                    BannerFinder.this.a(new o(creativeInfo, CreativeInfo.f44332n, null));
                                }
                            }
                        } catch (Throwable th2) {
                            Logger.e(BannerFinder.this.f43757a, "extract ad ID from view - exception occurred: " + th2.getMessage(), th2);
                        }
                    }
                });
            }
        } else if (zA4 && eVar != null && eVar.j().isEmpty() && a(str, view) && eVar.E()) {
            com.safedk.android.utils.k.b(this.f43757a, "extract ad ID from view - info :" + eVar + ", ci : " + eVar.j());
            Logger.d(this.f43757a, "extract ad ID from view - attempting to find CI by adInfoKey " + dVar);
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.3
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfo creativeInfoA2 = adNetworkDiscoveryH.a((Object) (dVar.f44389b + "_" + dVar.f44390c + "_" + dVar.f44391d));
                    if (creativeInfoA2 != null) {
                        Logger.d(BannerFinder.this.f43757a, "extract ad ID from view -  find CI by key found, adInfoKey : " + dVar + ", creativeInfo : " + creativeInfoA2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        creativeInfoA2.a((Object) view);
                        creativeInfoA2.a(BannerFinder.this.f43759c);
                        creativeInfoA2.f(dVar.f44390c);
                        creativeInfoA2.h(dVar.f44389b);
                        if (creativeInfoA2.L() == null) {
                            creativeInfoA2.r(creativeInfoA2.N());
                        }
                        Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - reflect ci placement ID set to " + dVar.f44389b + ", event ID : " + dVar.f44390c);
                        BannerFinder.this.a(new o(creativeInfoA2, CreativeInfo.f44332n, null));
                        return;
                    }
                    Logger.d(BannerFinder.this.f43757a, "extract ad ID from view - reflect CI not found");
                }
            });
        }
        return false;
    }

    private void b(CreativeInfo creativeInfo, e eVar) {
        BrandSafetyUtils.AdType adType;
        Logger.d(this.f43757a, "update ad format : started, sdk = " + creativeInfo.Q() + ", initial ad type = " + creativeInfo.I() + " , bannerInfo = " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false)) {
            Logger.d(this.f43757a, "update ad type. bannerInfo.isMrecAd : " + eVar.F());
            if (eVar.F()) {
                Logger.d(this.f43757a, "update ad type. Mrec identified");
                adType = BrandSafetyUtils.AdType.MREC;
            } else {
                Logger.d(this.f43757a, "update ad type. Banner identified");
                adType = BrandSafetyUtils.AdType.BANNER;
            }
            creativeInfo.p(adType.name());
            Logger.d(this.f43757a, "update ad type. ad type set to " + adType.name());
        }
    }

    private void a(ViewGroup viewGroup, String str, d dVar) {
        String strA = BrandSafetyUtils.a((Class) viewGroup.getClass());
        if (!TextUtils.isEmpty(strA) && !strA.equals(str) && strA.equals(com.safedk.android.utils.g.f44962h)) {
            Logger.d(this.f43757a, "scar-admob ad identified");
            e eVar = I.get(dVar);
            if (eVar != null) {
                eVar.T = true;
            }
        }
    }

    private String a(View view, String str) {
        String strA = BrandSafetyUtils.a((Class) view.getClass());
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        if (TextUtils.isEmpty(str)) {
            return view.getClass().getName();
        }
        return str;
    }

    public void c(final Activity activity) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    BannerFinder.this.d(activity);
                }
            });
        } else {
            d(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        Logger.d(this.f43757a, "start monitoring of redirect/expand, activity: " + activity + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        e eVarA = BrandSafetyUtils.a(activity);
        if (eVarA != null) {
            eVarA.f44412ap = activity.toString();
            l lVarH = eVarA.h();
            if (lVarH != null && lVarH.f44516d != null) {
                lVarH.f44516d.a("redirectActivityName=" + eVarA.f44412ap);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f44410an && eVar.f44412ap != null && eVar.f44412ap.equals(str)) {
                    a(eVar, false, "onActivityDestroyed");
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, String str3, d dVar, Bundle bundle) {
        e eVarA;
        Activity activityA = a(bundle);
        if (this.L.contains(dVar.f44390c)) {
            Logger.d(this.f43757a, "handle REVENUE_EVENT - impression with id " + dVar.f44390c + " has already been reported, ignoring. ");
            return;
        }
        if (g(str, str2)) {
            synchronized (BannerFinder.class) {
                eVarA = I.get(dVar);
                if (eVarA == null) {
                    eVarA = a(activityA, str2, dVar.f44390c, bundle);
                    I.put(dVar, eVarA);
                    Logger.d(this.f43757a, "New activity banner created for " + str2 + ", banner key is " + dVar + ", current activity banners size is " + I.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                } else {
                    if (eVarA.A == null) {
                        eVarA.A = bundle;
                    }
                    if (eVarA.B == null || eVarA.C == null) {
                        eVarA.a(a(activityA));
                    }
                }
            }
            if (eVarA != null) {
                if (bundle.getString("revenue_event") != null) {
                    eVarA.P = bundle.getString("revenue_event");
                } else {
                    eVarA.P = "unknown";
                }
                eVarA.M = str3;
                a(eVarA, false, "handleRevenueEvent");
                Logger.d(this.f43757a, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId " + dVar.f44390c);
                eVarA.f44397aa = true;
                return;
            }
            return;
        }
        this.f43760d++;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        l lVarH;
        String strD = BrandSafetyUtils.d();
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (str2 != null && str2.equals(eVar.K) && (lVarH = eVar.h()) != null && lVarH.f44516d != null && str3 != null && (str3.equals(lVarH.f44516d.f43716d) || str3.equals(strD))) {
                    Logger.d(this.f43757a, "redirect url was loaded to the ad web view: " + str2 + " url: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    lVarH.c().a(true);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, boolean z10) {
    }

    public static String a(MaxNativeAdView maxNativeAdView) {
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f43774m != null && eVar.f43774m.contains(strA)) {
                    return eVar.f43783v;
                }
            }
            return null;
        }
    }
}
