package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.ironsource.C3426d4;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class InterstitialFinder extends com.safedk.android.analytics.brandsafety.b {
    private static final String J = "InterstitialFinder";
    private static final long K = 500;
    private static final long L = 1000;
    private static final int M = 2;
    private static final int N = 3;
    public final InterstitialInfoCollection F;
    FullScreenActivitiesCollection G;
    boolean H;
    protected String I;
    private long O;
    private final Map<String, List<o>> P;
    private String Q;
    private final Set<String> R;

    public boolean i(String str) {
        List<n> listA = this.F.a(str);
        com.safedk.android.utils.k.b(J, "activeImpressionExists current impressions are " + this.F.toString());
        return listA != null && listA.size() > 0;
    }

    public InterstitialFinder() {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, Arrays.asList(BrandSafetyUtils.f43547j, BrandSafetyUtils.f43548k, BrandSafetyUtils.f43549l), J, 120);
        this.F = new InterstitialInfoCollection();
        this.O = 0L;
        this.P = new HashMap();
        this.G = new FullScreenActivitiesCollection();
        this.H = false;
        this.I = "";
        this.R = new HashSet(Arrays.asList(CreativeInfo.f44328j, CreativeInfo.f44327i));
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new n(str, str2, str3, screenShotOrientation, str4, str5);
    }

    public void a(final String str, final Object obj) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.b(str, obj);
                }
            });
        } else {
            b(str, obj);
        }
    }

    public void j(String str) {
        for (n nVar : this.F.a(str)) {
            CreativeInfo creativeInfoI = nVar.i();
            if (creativeInfoI != null && creativeInfoI.w()) {
                Logger.d(J, "set on endcard displayed - setting ci endcard detected. ci= " + creativeInfoI);
                creativeInfoI.f44356bb = true;
            } else if (creativeInfoI != null && creativeInfoI.v()) {
                Logger.d(J, "set on endcard displayed - ci is video ad, setting video complete. ci= " + creativeInfoI);
                c(nVar, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object obj) {
        Logger.d(J, "on video completed - sdk = " + str + ", source = " + obj);
        n nVarA = null;
        if (obj != null) {
            nVarA = this.F.a(BrandSafetyUtils.a(obj), false);
            Logger.d(J, "on video completed - sdk = " + str + ", found interstitialInfo : " + nVarA);
        }
        if (nVarA != null) {
            c(nVarA, str);
            return;
        }
        synchronized (this) {
            Iterator<n> it = this.F.values().iterator();
            while (it.hasNext()) {
                c(it.next(), str);
            }
        }
    }

    private void c(n nVar, String str) {
        if (nVar != null) {
            Logger.d(J, "on video completed - started, sdkPackageName = " + str + ", eventId = " + nVar.L);
            if (nVar.f43783v.equals(str) && !nVar.H) {
                a((c) nVar, true);
                nVar.H = true;
                nVar.a(ImpressionLog.f43640p, new ImpressionLog.a[0]);
                Logger.d(J, "on video completed - set to true, sdkPackageName = " + str + ", eventId = " + nVar.L);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, boolean z10) {
        n nVarA;
        if (str2 != null && (nVarA = this.F.a(str2, false)) != null) {
            Logger.d(J, "on video completed triggered - for view address  : " + str2 + ", sdkPackageName : " + str + ", video completed: " + z10);
            a(nVarA, z10);
            return;
        }
        for (n nVar : this.F.a(str)) {
            Logger.d(J, "on video completed triggered - sdkPackageName : " + str + ", view address: " + str2 + ", video completed: " + z10);
            a(nVar, z10);
        }
    }

    private void a(n nVar, boolean z10) {
        Logger.d(J, "set on video completed started, eventId  : " + nVar.L);
        if (!nVar.H && z10) {
            a((c) nVar, z10);
            CreativeInfo creativeInfoI = nVar.i();
            if (creativeInfoI != null && !creativeInfoI.v()) {
                creativeInfoI.d(true);
            }
            nVar.H = true;
            nVar.a(ImpressionLog.f43640p, new ImpressionLog.a[0]);
            return;
        }
        if (!z10) {
            nVar.H = false;
            nVar.f44529aa = false;
            nVar.a(ImpressionLog.f43639o, new ImpressionLog.a(ImpressionLog.K, C3426d4.i.K));
        }
    }

    public void b(String str, String str2, boolean z10) {
        if (str2 != null && this.F.a(str2, false) != null) {
            b(this.F.a(str2, false), z10);
        }
        List<n> listA = this.F.a(str);
        if (listA != null) {
            Iterator<n> it = listA.iterator();
            while (it.hasNext()) {
                b(it.next(), z10);
            }
        }
    }

    private void b(n nVar, boolean z10) {
        Logger.d(J, "stop taking screenshots for impression. starting. address = " + nVar.K);
        if (nVar == null) {
            Logger.d(J, "stop taking screenshots for impression. info is null.");
            return;
        }
        if (z10 || this.H) {
            nVar.f44533ae = true;
            a(nVar.h());
            Logger.d(J, "stop taking screenshots for impression. attempting to clear image hash and files");
            j jVarL = nVar.l();
            if (jVarL != null && jVarL.f44460b != null) {
                a(nVar, jVarL);
            } else {
                Logger.d(J, "stop taking screenshots for impression. no active ci or no image taken.");
            }
            e(nVar, "stopTakingScreenshotsForImpression");
            return;
        }
        Logger.d(J, "stop taking screenshots for impression. Request to stop taking screenshots received when no max ad is active. ignoring");
    }

    private void a(n nVar, j jVar) {
        Logger.d(J, "remove file and report event, file: " + jVar.f44460b);
        BrandSafetyUtils.d(jVar.f44460b);
        jVar.f44459a = null;
        jVar.f44460b = null;
        BrandSafetyUtils.d(nVar.b());
        nVar.f43780s = null;
        e(nVar, "removeFileAndReportEvent");
    }

    private void a(n nVar, String str, ViewGroup viewGroup, List<WeakReference<WebView>> list, List<String> list2, List<String> list3, int i10) {
        int i11 = i10 + 1;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                list2.add(BrandSafetyUtils.a(childAt));
                list3.add("h" + i11 + "c" + (i13 + 1) + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt);
                if (childAt instanceof WebView) {
                    list.add(new WeakReference<>((WebView) childAt));
                    Logger.d(J, "find WebViews in view group - found view: " + childAt + " , parent: " + childAt.getParent().toString());
                } else if (childAt instanceof ViewGroup) {
                    a(nVar, str, (ViewGroup) childAt, list, list2, list3, i11);
                }
                AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
                if (adNetworkDiscoveryH != null) {
                    if (a(str, childAt) && nVar.f43774m != null && nVar.i() == null) {
                        Logger.d(J, "find WebViews in view group - found ad view: " + childAt + " , parent: " + childAt.getParent().toString());
                        String strC = adNetworkDiscoveryH.c(childAt);
                        if (strC != null) {
                            Logger.d(J, "find WebViews in view group - found adId: " + strC);
                            CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) strC);
                            if (creativeInfoA != null) {
                                Logger.d(J, "find WebViews in view group - found CI for adId " + strC + " : " + creativeInfoA);
                                creativeInfoA.a((Object) childAt);
                                if (nVar.A != null) {
                                    String strName = BrandSafetyUtils.a(nVar.A).name();
                                    Logger.d(J, "find WebViews in view group - setting ad format type to " + strName);
                                    creativeInfoA.p(strName);
                                    nVar.e("ad_type_upd(fndWVUndrVGroup):" + strName);
                                }
                                a(new o(creativeInfoA, CreativeInfo.f44332n, BrandSafetyUtils.a(childAt)));
                            }
                        }
                    }
                    if (!nVar.V && adNetworkDiscoveryH.a(childAt)) {
                        Logger.d(J, "find WebViews in view group - native player identified");
                        nVar.a(ImpressionLog.f43639o, new ImpressionLog.a(ImpressionLog.K, "native"));
                    }
                    nVar.V = nVar.V || adNetworkDiscoveryH.a(childAt);
                }
                i12 = i13 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        n nVarD;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f43758b.contains(messageData.getString("ad_format"))) {
                Logger.d(J, "Revenue event detected : " + messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string2 = messageData.getString("ad_format");
            String string3 = messageData.getString(BrandSafetyEvent.f44592k);
            String string4 = messageData.getString(BrandSafetyEvent.f44576ad);
            String string5 = messageData.getString("dsp_name");
            String strB = CreativeInfoManager.b(string4);
            long jB = com.safedk.android.utils.k.b(System.currentTimeMillis());
            String string6 = null;
            if (messageData.containsKey("creative_id")) {
                string6 = messageData.getString("creative_id");
            }
            MaxEvent maxEvent = new MaxEvent(string, jB, string2, string4, string6, string5);
            p.a().a(maxEvent);
            boolean zContains = this.f43758b.contains(string2);
            String strA = CreativeInfoManager.a(strB, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
            if (zContains && string4 != null && string4.equals(strA)) {
                Logger.d(J, "full screen type but ad network not supported (" + strA + ")");
                return;
            }
            String string7 = messageData.getString("id", null);
            if (string7 == null) {
                Logger.d(J, "No eventId in data bundle.");
            }
            if (zContains) {
                Logger.d(J, "Max message received, package: " + strB + ", ts (seconds): " + jB + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if ("WILL_DISPLAY".equals(string)) {
                    com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count: " + this.B.size());
                    e();
                    this.f43760d++;
                    if (strB != null) {
                        p.a().b(maxEvent);
                        this.H = true;
                        a(string7, ImpressionLog.f43630f, new ImpressionLog.a[0]);
                        BrandSafetyUtils.m(strB);
                        a(strB, new AtomicReference<>(messageData));
                        CreativeInfoManager.a(strB, string3, string6, (String) null, string2);
                        a aVar = new a(string3, string7);
                        Logger.d(J, "WILL_DISPLAY event for package: " + strB + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string7);
                        a(strB, aVar, string7);
                        return;
                    }
                    return;
                }
                if ("revenue_event".equals(string)) {
                    Logger.d(J, "REVENUE_EVENT event for package: " + strB + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string7);
                    a(string7, ImpressionLog.f43635k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                    a(string7, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    n nVarD2 = this.F.d(string7);
                    if (nVarD2 != null) {
                        StringBuilder sbAppend = new StringBuilder().append("DID_CLICKED event for package: ");
                        if (strB != null) {
                            string4 = strB;
                        }
                        Logger.d(J, sbAppend.append(string4).toString());
                        a(string7, ImpressionLog.f43632h, new ImpressionLog.a[0]);
                        b(nVarD2);
                        if (!TextUtils.isEmpty(nVarD2.e())) {
                            e(nVarD2, "onMessageReceived");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (strB != null) {
                        Logger.d(J, "WILL_LOAD event for package: " + strB + " placement: " + string3);
                        a(string7, ImpressionLog.f43628d, new ImpressionLog.a(ImpressionLog.I, string4));
                        com.safedk.android.analytics.brandsafety.creatives.e.b(strB, string3);
                        CreativeInfoManager.a(strB, string3, string6, (String) null, string2);
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (strB != null) {
                        BrandSafetyUtils.n(strB);
                        Logger.d(J, "DID_HIDE event for package: " + strB + " placement: " + string3 + ", event id: " + string7);
                        n nVarD3 = this.F.d(string7);
                        if (nVarD3 != null) {
                            a(string7, ImpressionLog.f43633i, new ImpressionLog.a[0]);
                            a(nVarD3, (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (strB != null) {
                        Logger.d(J, "DID_LOAD event for package: " + strB + " placement: " + string3);
                        a(string7, ImpressionLog.f43629e, new ImpressionLog.a(ImpressionLog.I, string4));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (strB != null) {
                        Logger.d(J, "DID_DISPLAY event for package: " + strB + " placement: " + string3);
                        a(string7, ImpressionLog.f43631g, new ImpressionLog.a[0]);
                        if (string6 != null && (nVarD = this.F.d(string7)) != null) {
                            if (nVarD.A != null && nVarD.A.containsKey("id") && nVarD.A.getString("id") != null && nVarD.A.getString("id").equals(string7)) {
                                Logger.d(J, "setting Max creative id to: " + string6 + " for event id: " + string7);
                                nVarD.M = string6;
                                return;
                            } else {
                                Logger.d(J, "cannot update Max creative id. event id check failed.");
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string)) {
                    Logger.d(J, "DID_FAIL_DISPLAY event for package: " + strB + " placement: " + string3);
                    a(string7, ImpressionLog.f43634j, new ImpressionLog.a[0]);
                    n nVarD4 = this.F.d(string7);
                    if (nVarD4 != null) {
                        nVarD4.N = true;
                    }
                }
            }
        }
    }

    private synchronized void e() {
        ArrayList<String> arrayList = new ArrayList();
        for (n nVar : this.F.values()) {
            if (nVar.N && nVar.B == null) {
                arrayList.add(nVar.L);
                e(nVar, "reportPreviousFailedImpressions");
                b((c) nVar);
            }
        }
        for (String str : arrayList) {
            Logger.d(J, "report previous failed impression, event ID: " + str);
            a(str);
            p(str);
        }
    }

    private void a(String str, a aVar, String str2) {
        Logger.d(J, "match CI started, sdk = " + str + ", interstitial key = " + aVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (aVar.f43688b != null) {
            Logger.d(J, "match CI - interstitial key: " + aVar);
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.d() != null && adNetworkDiscoveryH.d().a(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false)) {
                Logger.d(J, "match CI - discovery configuration: " + adNetworkDiscoveryH.d());
                String str3 = aVar.f43687a + "_" + aVar.f43688b + "_" + str;
                CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) str3);
                if (creativeInfoA != null) {
                    Logger.d(J, "match CI - discovery class returned a ci: " + creativeInfoA);
                    if (creativeInfoA.m() == null) {
                        creativeInfoA.f(aVar.f43688b);
                    }
                    creativeInfoA.p(BrandSafetyEvent.AdFormatType.INTER.name());
                    creativeInfoA.u("ad_type_upd(matchCI):" + BrandSafetyEvent.AdFormatType.INTER.name());
                    a(new o(creativeInfoA, CreativeInfo.f44332n, str3));
                    return;
                }
                Logger.d(J, "match CI - ci not found");
                return;
            }
            Logger.d(J, "match CI - sdk not configured to allow max events based matching");
        }
    }

    public void a(String str, AtomicReference<Bundle> atomicReference) {
        if (atomicReference != null && atomicReference.get() != null) {
            Logger.d(J, "start ad monitoring - slot = " + this.f43760d + ", max package name = " + str + ", AppLovin data bundle is " + atomicReference.get() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (CreativeInfoManager.h(str) != null) {
                n nVar = new n(str, this.f43760d, atomicReference.get());
                nVar.L = atomicReference.get().getString("id");
                synchronized (this) {
                    this.F.put(nVar.L, nVar);
                }
                Logger.d(J, "start ad monitoring - new interstitial info created : " + nVar);
                f((Activity) null);
                return;
            }
            Logger.d(J, "start ad monitoring - slot = " + this.f43760d + ", max package name = " + str + ", ad network is not supported");
        }
    }

    public void c(final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.3
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(InterstitialFinder.J, "start ad monitoring - activity : " + activity + ", current interstitial infos :" + InterstitialFinder.this.F.toString());
                if (activity != null) {
                    if (!InterstitialFinder.this.F.c(activity.toString())) {
                        synchronized (InterstitialFinder.this.G) {
                            InterstitialFinder.this.G.put(activity.toString(), new WeakReference<>(activity));
                        }
                        if (!InterstitialFinder.this.H) {
                            InterstitialFinder.this.H = true;
                        }
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity added : " + activity.toString());
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity null or already registered.");
                    }
                    if (InterstitialFinder.this.m(activity.toString())) {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - sdk: " + InterstitialFinder.this.F.b() + ", activity " + activity + " started but this is not the start of impression. not starting ad monitoring");
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring calling 'start', activity is " + activity);
                        InterstitialFinder.this.f(activity);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        n nVarB = this.F.b(str);
        if (str == null || nVarB == null || nVarB.c() == null) {
            return false;
        }
        Logger.d(J, "instances of same activity - current activity class name = " + nVarB.p() + ",  current activity address = " + nVarB.o());
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVarB.c());
        if (adNetworkDiscoveryH == null || adNetworkDiscoveryH.d() == null || !adNetworkDiscoveryH.d().a(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false)) {
            return false;
        }
        Logger.d(J, "instances of same activity - discovery configuration = " + adNetworkDiscoveryH.d());
        String str2 = nVarB.p() + "@" + nVarB.o();
        Logger.d(J, "instances of same activity - current activity = " + str2);
        if (str.equals(str2)) {
            return false;
        }
        Logger.d(J, "instances of same activity - activityClass " + str2 + " is a different instance of the same activity");
        return true;
    }

    private void b(n nVar) {
        Logger.d(J, "handle DID_CLICKED started , isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null) {
            Logger.d(J, "current activity interstitial is null");
            return;
        }
        nVar.a(true);
        if (nVar.e() != null) {
            Logger.d(J, "current activity interstitial already have click url");
            return;
        }
        if (nVar.f44537ai == null) {
            Logger.d(J, "current activity interstitial doesn't have click url candidate");
            return;
        }
        if (nVar.f44537ai.f44420a == 0) {
            Logger.d(J, "current click url candidate has zero timestamp");
            return;
        }
        Logger.d(J, "handle DID_CLICKED checking click url candidate");
        if (System.currentTimeMillis() - nVar.f44537ai.f44420a < 20000) {
            Logger.d(J, "handle DID_CLICKED setting click url");
            nVar.c(nVar.f44537ai.f44421b);
        } else {
            Logger.d(J, "click url candidate's timestamp is not within the time range");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f43423a;
    }

    public n d(Activity activity) {
        if (activity != null) {
            return this.F.b(activity.toString());
        }
        Logger.d(J, "get activity interstitial by activity, activity is null");
        return null;
    }

    public n k(String str) {
        if (str == null) {
            Logger.d(J, "get activity interstitial by package, package is null");
            return null;
        }
        List<n> listA = this.F.a(str);
        if (listA.size() == 1) {
            Logger.d(J, "get activity interstitial by package, ci found : " + listA.get(0));
            return listA.get(0);
        }
        Logger.d(J, "there are " + listA.size() + " interstitial infos, exisitng");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        String strB;
        String strA;
        String strA2;
        n nVarB;
        Set<String> set;
        n nVar;
        n nVar2;
        WeakReference<Activity> weakReferenceB;
        if (activity != null) {
            strA2 = BrandSafetyUtils.a(activity.toString(), true);
            strA = BrandSafetyUtils.a(activity.toString(), false);
            strB = BrandSafetyUtils.b(activity.getClass());
        } else {
            strB = null;
            strA = null;
            strA2 = null;
        }
        Logger.d(J, "interstitial finder start - activity name = " + activity + ", sdk = " + strB + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity != null) {
            nVarB = this.F.b(BrandSafetyUtils.a((Object) activity));
            Logger.d(J, "interstitial finder start - attempt to find by activity address, currentActivityInterstitial = " + nVarB);
        } else {
            nVarB = this.F.a(true) == 1 ? this.F.get(this.F.keySet().toArray()[0]) : null;
        }
        if (nVarB != null && strA2 != null && strA2.equals(nVarB.B)) {
            boolean zA = CreativeInfoManager.a(strB, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            j jVarL = nVarB.l();
            if (!zA && jVarL != null && !TextUtils.isEmpty(jVarL.f44459a) && a(jVarL.f44462d, jVarL.f44461c)) {
                Logger.d(J, "interstitial finder start - Not starting timer on activity " + nVarB.f44531ac + " -- impression already logged");
                return;
            } else {
                Logger.d(J, "interstitial finder start - Starting counter from previous value " + nVarB.s());
                nVarB.I();
                nVar = nVarB;
            }
        } else {
            Logger.d(J, "interstitial finder start - current activity interstitial = " + nVarB);
            if (nVarB == null) {
                set = null;
            } else if (strA != null && nVarB.C.equals(strA)) {
                Logger.d(J, "interstitial finder start - current activity interstitial class name = " + nVarB.C + ", activity class name = " + strA);
                set = null;
            } else {
                Set<String> set2 = nVarB.W;
                if (set2.contains(strA2)) {
                    Logger.d(J, "interstitial finder start - Ignoring restart of suspected mediation " + nVarB.f44531ac);
                    return;
                } else {
                    if (nVarB.B != null) {
                        set2.add(nVarB.B);
                    }
                    set = set2;
                }
            }
            List<o> arrayList = new ArrayList<>();
            Logger.d(J, "interstitial finder start - start current activity interstitial is " + nVarB);
            if (nVarB != null && !nVarB.E && !nVarB.j().isEmpty()) {
                Logger.d(J, "interstitial finder start - current activity interstitial != null : " + nVarB);
                List<CreativeInfo> listJ = nVarB.j();
                if (!listJ.isEmpty()) {
                    for (CreativeInfo creativeInfo : listJ) {
                        if (creativeInfo != null) {
                            Logger.d(J, "interstitial finder start - setting current activity interstitials CI: " + creativeInfo);
                            arrayList.add(new o(creativeInfo, creativeInfo.V(), creativeInfo.U()));
                        } else {
                            Logger.d(J, "interstitial finder start - current CI matching method not equal, current CI: " + creativeInfo);
                        }
                    }
                } else {
                    Logger.d(J, "interstitial finder start - current CI is null");
                }
                Logger.d(J, "interstitial finder start - current activity interstitial impression reported? " + nVarB.E);
                b(nVarB, true);
            }
            Logger.d(J, "interstitial finder start - activity : " + activity + ", activities : " + this.G.a());
            if (this.F.a(true) > 0 && this.G.size() > 0) {
                for (n nVar3 : this.F.c()) {
                    if (activity == null && (weakReferenceB = this.G.b(nVar3.f43783v)) != null && weakReferenceB.get() != null) {
                        Activity activity2 = weakReferenceB.get();
                        Logger.d(J, "interstitial finder start - activity set to " + activity2);
                        activity = activity2;
                    }
                    if (activity != null) {
                        String strB2 = BrandSafetyUtils.b(activity.getClass());
                        Logger.d(J, "interstitial finder start - activity : " + activity + ", activitySdk : " + strB2 + ", InterstitialInfo sdk : " + nVar3.f43783v);
                        nVar3.f44532ad = SystemClock.elapsedRealtime();
                        if (nVar3.f43783v != null && strB2 != null && strB2.equals(nVar3.f43783v)) {
                            a(activity, nVar3);
                            nVar2 = nVar3;
                        } else if (com.safedk.android.utils.g.f44962h.equals(strB2) && A.contains(nVar3.f43783v)) {
                            Logger.d(J, "interstitial finder start - maybe scar-admob");
                            nVar2 = nVarB;
                        } else {
                            Logger.d(J, "interstitial finder start - activity SDK is not compatible with interstitial SDK");
                        }
                    } else {
                        nVar2 = nVarB;
                    }
                    a(nVar3, activity);
                    nVarB = nVar2;
                }
            }
            synchronized (this) {
                Logger.d(J, "interstitial finder start - scanning " + this.F.a(false) + " inter infos");
                for (n nVar4 : this.F.values()) {
                    if (nVar4.U) {
                        Logger.d(J, "interstitial finder start - skipping on iterating ad that finished, interstitial info: " + nVar4);
                    } else {
                        Logger.d(J, "interstitial finder start - setting the current activity interstitial to: " + nVar4);
                        if (nVar4.f43783v != null) {
                            Logger.d(J, "interstitial finder start - current Max package name: " + nVar4.f43783v);
                            boolean zA2 = CreativeInfoManager.a(nVar4.f43783v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
                            if (activity != null && !BrandSafetyUtils.d(activity.getClass()) && !zA2) {
                                Logger.d(J, "interstitial finder start - current foreground activity is not a supported ad activity");
                                return;
                            }
                            if (!zA2 && activity != null) {
                                Logger.d(J, "interstitial finder start - checking pending ci for no activity sdk " + nVar4.f43783v);
                                arrayList = a(nVar4.f43783v, nVar4);
                                for (o oVar : arrayList) {
                                    Logger.d(J, "interstitial finder start - found pending ci(s) for no activity sdk, mi : " + oVar);
                                    b(oVar, nVar4);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(this.I)) {
                            nVar4.e(this.I);
                            Logger.d(J, "interstitial finder start - ci_debug_info set to " + this.I);
                        } else {
                            nVar4.L();
                            Logger.d(J, "interstitial finder start - no CI so adding the noCIDebug to CIDebugInfo");
                        }
                        if (nVar4.f44541am != null) {
                            e(nVar4);
                            if (arrayList.isEmpty()) {
                                arrayList = a(strB, nVar4);
                            }
                            nVar4.Z = 0L;
                        }
                        if (CreativeInfoManager.a(nVar4.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                            nVar4.f44532ad = SystemClock.elapsedRealtime();
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. sdk = " + nVar4.c());
                            arrayList = a(nVar4.c(), nVar4);
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. found " + arrayList.size() + " items");
                        }
                        for (o oVar2 : arrayList) {
                            if (oVar2 != null && oVar2.f44545a != null) {
                                b(oVar2, nVar4);
                            }
                        }
                        if (set != null) {
                            nVar4.W = set;
                        }
                        nVarB = nVar4;
                    }
                }
                nVar = nVarB;
            }
        }
        Logger.d(J, "interstitial finder start - before timer, time interstitial info event id is: " + (nVar != null ? nVar.L : null));
        if (c(nVar)) {
            Logger.d(J, "interstitial finder start - starting timer for InterstitialInfo with eventId " + nVar.w());
            nVar.f44539ak = this.D.scheduleAtFixedRate(new b(nVar.L), 500L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private boolean c(n nVar) {
        ScheduledFuture<?> scheduledFuture = nVar != null ? nVar.f44539ak : null;
        Logger.d(J, "shouldStartTimer started, taskFuture = " + scheduledFuture + ", isisCancelled = " + (scheduledFuture != null ? Boolean.valueOf(scheduledFuture.isCancelled()) : null));
        if (nVar != null) {
            Logger.d(J, "shouldStartTimer - inter activity is: " + nVar.f44541am);
            Logger.d(J, "shouldStartTimer - inter activity CI is: " + nVar.i());
        }
        boolean z10 = nVar != null && (scheduledFuture == null || scheduledFuture.isCancelled()) && !(nVar.f44541am == null && (nVar.i() == null || nVar.i().f() == null));
        Logger.d(J, "shouldStartTimer returned: " + z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, n nVar) {
        if (activity != null) {
            String[] strArr = {BrandSafetyUtils.a(activity.toString(), false), BrandSafetyUtils.a(activity.toString(), true)};
            String string = activity.toString();
            nVar.f44531ac = string;
            nVar.f44541am = activity;
            nVar.a(strArr);
            synchronized (this.G) {
                this.G.remove((Object) activity.toString());
            }
            Logger.d(J, "interstitial info activity details set : " + activity.getClass() + ", sdk = " + nVar.f43783v + ", activity name = " + string + ", activities = " + this.G.a() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        Logger.d(J, "cannot set interstitial info activity details, activity is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<o> a(String str, n nVar) {
        ArrayList arrayList = new ArrayList();
        List<o> list = this.P.get(str);
        com.safedk.android.utils.k.b(J, "pending ci check, number of pending CIs: " + (list != null ? list.size() : 0) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(J, "pending ci check, pending object addresses are: " + a(list));
        if (list != null) {
            synchronized (this) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    Logger.d(J, "pending ci check, matching method: " + next.f44546b + ", ci: " + next.f44545a.X());
                    if (a(next.f44545a, nVar) && next.f44545a != null) {
                        nVar.e("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + "|i=" + next.f44547c + ";" + next.f44546b + "|o=" + next.f44545a.ae() + ";" + next.f44545a.af());
                        it.remove();
                        Logger.d(J, "pending ci check, creative info is the pending creative info: " + next);
                        arrayList.add(next);
                    }
                }
            }
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                list.clear();
            }
        }
        return arrayList;
    }

    private boolean a(CreativeInfo creativeInfo, n nVar) {
        if (creativeInfo == null || nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching - current activity interstitial: " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar.L != null && creativeInfo.m() != null && !nVar.L.equals(creativeInfo.m())) {
            Logger.d(J, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + nVar.L);
            if (!CreativeInfoManager.a(nVar.f43783v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.m());
        }
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(creativeInfo.R() == null ? creativeInfo.Q() : creativeInfo.R());
        if (adNetworkDiscoveryH != null) {
            if (adNetworkDiscoveryH.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                if (nVar.r() != null) {
                    String string = nVar.r().getString(BrandSafetyEvent.f44592k);
                    String string2 = nVar.r().getString("ad_format");
                    if (creativeInfo.F() == null || (string != null && string.equals(creativeInfo.F()))) {
                        Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                        return true;
                    }
                    Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, verification failed for CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                    nVar.e("verifyMatchingFailed|placement=(" + string + StringUtils.COMMA + creativeInfo.F() + ")|format=(" + string2 + StringUtils.COMMA + creativeInfo.F() + ")");
                    return false;
                }
            } else {
                return a(creativeInfo.ae(), creativeInfo.af(), nVar);
            }
        }
        Logger.d(J, "verify matching, no InterstitialInfo or no discovery for " + creativeInfo.Q());
        return false;
    }

    private boolean a(String str, String str2, n nVar) {
        if (nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching object started, event ID: " + nVar.L + ", object address: " + str2 + ", webview address: " + nVar.K + ", object type: " + str + ", currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        boolean zA = CreativeInfoManager.a(nVar.f43783v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str) || zA) {
            Logger.d(J, "verify matching object skipped, event ID: " + nVar.L + ", object address: " + str2 + ", object type: " + str + ", sdkInterstitialsRunOnAppActivity: " + zA);
            return true;
        }
        if (nVar.x() != null && nVar.x().contains(str2)) {
            Logger.d(J, "verify matching object done, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
            return true;
        }
        Logger.d(J, "verify matching object failed, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.n(str);
                }
            });
        } else {
            n(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        Logger.d(J, "stop timers - canceling timer for interstitials, eventId = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        n nVarD = this.F.d(str);
        if (nVarD != null) {
            if (nVarD.s() == 0) {
                nVarD.f44530ab = null;
            }
            if (this.F.size() < 1 || this.F.a()) {
                this.O = 0L;
            }
            if (nVarD.f44539ak != null) {
                Logger.d(J, "stop timers - calling timer cancel.");
                if (!nVarD.f44539ak.cancel(true)) {
                    Logger.d(J, "stop timers - failed to call timer cancel.");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        for (n nVar : this.F.values()) {
            Logger.d(J, "get CI by webView address, hierarchy:" + nVar.f43774m + ", webViewAddress: " + str2);
            if (nVar != null) {
                boolean z10 = nVar.K != null && nVar.K.equals(str2);
                boolean z11 = nVar.f43774m != null && nVar.f43774m.contains(str2);
                if (z10 || z11) {
                    return nVar.k();
                }
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        List<CreativeInfo> listJ;
        synchronized (this) {
            for (n nVar : this.F.values()) {
                if (nVar != null && (listJ = nVar.j()) != null && !listJ.isEmpty() && listJ.get(0) != null && listJ.get(0).L() != null && listJ.get(0).L().equals(str2)) {
                    return listJ;
                }
            }
            List<o> list = this.P.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (o oVar : list) {
                    if (oVar.f44545a != null && oVar.f44545a.L() != null && oVar.f44545a.L().equals(str2)) {
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
        for (n nVar : this.F.values()) {
            if (nVar != null && nVar.f43774m != null && nVar.f43774m.contains(str)) {
                return nVar;
            }
        }
        return null;
    }

    public void e(final Activity activity) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.g(activity);
                }
            });
        } else {
            g(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Activity activity) {
        try {
            Logger.d(J, "interstitial finder stop, activity = " + activity.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            n nVarB = this.F.b(activity.toString());
            if (nVarB != null) {
                if (nVarB.f44531ac == null || activity.toString().equals(nVarB.f44531ac)) {
                    Logger.d(J, "Stopping interstitial finder for activity " + nVarB.f44531ac);
                    a(nVarB.L);
                    Logger.d(J, "interstitial finder, viewing time (ms) = " + nVarB.Z);
                }
            }
        } catch (Throwable th2) {
            Logger.e(J, th2.getMessage(), th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.6
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.o(str);
                }
            });
        } else {
            o(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (str != null) {
            synchronized (this.G) {
                Logger.d(J, "Activity destroyed activity class: " + str + ", activities: " + this.G.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                this.G.remove((Object) str);
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
            n nVarB = this.F.b(str);
            if (nVarB != null) {
                if (sdkPackageByClass != null && nVarB.f43783v != null && !sdkPackageByClass.equals(nVarB.f43783v)) {
                    Logger.d(J, "Activity destroyed, activity SDK does not fit the WILL_DISPLAY msg: " + sdkPackageByClass);
                    return;
                }
                if (nVarB.f44531ac != null && !nVarB.f44531ac.equals(str)) {
                    Logger.d(J, "Activity destroyed, activity address (" + str + " ) does not match the address of the ad's activity (" + nVarB.f44531ac + ")");
                    return;
                }
                Logger.d(J, "Activity destroyed, calling onAdHidden");
                nVarB.a(ImpressionLog.C, new ImpressionLog.a[0]);
                a(nVarB, str);
            }
        }
    }

    public void a(String str, Bundle bundle) {
        n nVar;
        if (this.F.containsKey(str) && (nVar = this.F.get(str)) != null) {
            if (bundle.getString("revenue_event") != null) {
                nVar.P = bundle.getString("revenue_event");
            } else {
                nVar.P = "unknown";
            }
            e(nVar, "handleRevenueEvent");
            Logger.d(J, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId: " + str);
            return;
        }
        Logger.d(J, "Revenue event - no interstitial info found for event " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
    }

    public void a(final n nVar, final String str) {
        Logger.d(J, "Ad hidden started, activityClass=" + (str == null ? "null" : str) + ", interstitial infos=" + this.F.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar != null) {
            if (m(str)) {
                Logger.d(J, "Ad hidden " + nVar.c() + " activity " + str + " unloaded but this is not the end of impression. not calling cleanAndReport");
            } else {
                nVar.U = true;
                this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.7
                    @Override // java.lang.Runnable
                    public void run() {
                        InterstitialFinder.this.d(nVar, str);
                    }
                }, 3L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(n nVar, String str) {
        if (nVar == null) {
            Logger.d(J, "clean and report - current interstitial info is NULL, SKIPPING");
            return;
        }
        synchronized (this.F) {
            if (nVar.E()) {
                Logger.d(J, "clean and report - already run, SKIPPING");
            } else {
                nVar.f(true);
                try {
                    try {
                        Logger.d(J, "clean and report started, activity class=" + str + ", eventId = " + nVar.L + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        if (str == null) {
                            str = nVar.f44531ac;
                            Logger.d(J, "clean and report - activity class set to (curr intractname) " + nVar.f44531ac);
                        }
                        String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
                        for (l lVar : nVar.g()) {
                            if (lVar.c() != null) {
                                Logger.d(J, "clean and report - activity SDK = " + sdkPackageByClass + ", CI SDK = " + lVar.c().Q() + ", interstitial activity name=" + nVar.f44531ac);
                                Logger.d(J, "clean and report - currentMaxPackageName = " + nVar.f43783v + ", activitySdk = " + sdkPackageByClass);
                                if (nVar.f43783v != null && !nVar.f43783v.equals(sdkPackageByClass) && !nVar.f43783v.equals(lVar.c().Q()) && !nVar.f44538aj) {
                                    Logger.d(J, "clean and report - skip reporting as no related WILL_DISPLAY message received, current Max package name: " + nVar.f43783v + ", activity SDK: " + sdkPackageByClass + ", CI SDK: " + lVar.c().Q());
                                    lVar.a((CreativeInfo) null);
                                }
                            }
                            if (lVar.f44514b != null && lVar.f44514b.f44460b != null) {
                                lVar.f44515c = lVar.f44514b.f44460b;
                            } else if (nVar.b() != null) {
                                lVar.f44515c = nVar.b();
                            }
                            Logger.d(J, "clean and report - last impression screenshot filename set to " + lVar.f44515c);
                        }
                        if ((nVar.B == null || !nVar.B.equals(BrandSafetyUtils.a(str, true))) && !CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                            Logger.d(J, "clean and report - DID NOT enter unload logic, current interstitial info=" + nVar);
                        } else {
                            for (l lVar2 : nVar.g()) {
                                if (lVar2 != null && lVar2.f44514b != null && lVar2.f44514b.f44460b != null && nVar.b() != null) {
                                    if (this.B.size() < SafeDK.getInstance().J()) {
                                        Logger.d(J, "clean and report - image files: " + lVar2.f44514b.f44460b + ", " + nVar.f43781t);
                                        Logger.d(J, "clean and report - waiting to report file: " + nVar.f43781t + ", impression ID: " + lVar2.f44513a);
                                        a(nVar, lVar2);
                                        com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload addAdInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
                                    } else if (!d(nVar.f43780s, lVar2.f44513a)) {
                                        BrandSafetyUtils.d(nVar.f43781t);
                                        nVar.f44530ab = null;
                                        nVar.f43781t = null;
                                    }
                                    Logger.d(J, "clean and report - hash value: " + lVar2.f44514b.f44459a + " orientation: " + lVar2.f44514b.f44464f);
                                    if (lVar2.f44514b.f44459a == null && !nVar.f44533ae) {
                                        Logger.d(J, "clean and report - assigning last captured hash to interstitial: " + nVar.f44530ab);
                                        lVar2.f44514b.f44459a = nVar.f44530ab;
                                        lVar2.f44514b.f44464f = nVar.f43782u;
                                    }
                                    this.Q = lVar2.f44514b.f44459a;
                                }
                            }
                            nVar.f44534af = SystemClock.elapsedRealtime();
                            nVar.Z += nVar.f44534af - nVar.f44532ad;
                            Logger.d(J, "clean and report - Viewing time (ms) = " + nVar.Z);
                            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.f43783v);
                            if (adNetworkDiscoveryH == null) {
                                a(nVar.L);
                                p(nVar.L);
                            } else {
                                AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscoveryH.b();
                                for (CreativeInfo creativeInfo : nVar.j()) {
                                    if (nVar.K != null) {
                                        String strL = nVar.K;
                                        if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                                            strL = creativeInfo.L();
                                            com.safedk.android.analytics.brandsafety.creatives.e.a(adNetworkDiscoveryH, strL);
                                        }
                                        Logger.d(J, "clean and report - attach resources to CI for webview/adId: " + strL);
                                        com.safedk.android.analytics.brandsafety.creatives.e.a(strL, creativeInfo);
                                        com.safedk.android.analytics.brandsafety.creatives.e.a(nVar.f43775n);
                                    }
                                    com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo);
                                }
                                Logger.d(J, "clean and report - number of CIs to report: " + nVar.j().size());
                                e(nVar, "onAdHidden");
                            }
                        }
                        if (str != null) {
                            Logger.d(J, "clean and report - removing from activities : " + str);
                            synchronized (this.G) {
                                this.G.remove((Object) str);
                            }
                        }
                        b((c) nVar);
                        a(nVar.L);
                        p(nVar.L);
                    } catch (Throwable th2) {
                        Logger.e(J, "Exception in clean and report : " + th2.getMessage(), th2);
                        a(nVar.L);
                        p(nVar.L);
                    }
                } catch (Throwable th3) {
                    a(nVar.L);
                    p(nVar.L);
                    throw th3;
                }
            }
        }
    }

    private void p(String str) {
        Logger.d(J, "clearing AppLovin bundle, eventId = " + str);
        this.H = this.F.size() != 0;
        Logger.d(J, "clear variables, maxAdIsActive set to " + this.H);
        if (str != null) {
            synchronized (this) {
                this.F.remove(str);
            }
            Logger.d(J, "clear variables, removing " + str + " from currentInterstitialInfos");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(n nVar, String str) {
        com.safedk.android.utils.k.b(J, "reporting event started, root= " + str + ", info=" + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null || !nVar.Y) {
            Logger.d(J, "reporting event - info is not interstitial, don't report info");
            return;
        }
        boolean z10 = !nVar.E;
        boolean z11 = !nVar.F && nVar.d();
        String string = null;
        if (nVar.A != null && nVar.A.containsKey("id")) {
            string = nVar.A.getString("id");
            Logger.d(J, "reporting event - event ID: " + string);
        } else {
            Logger.d(J, "reporting event - no event ID");
        }
        ArrayList arrayList = new ArrayList();
        if (nVar.j().isEmpty()) {
            arrayList.add(a(nVar, nVar.h(), z11, string, (String) null));
            a((c) nVar);
        } else {
            Logger.d(J, "reporting event - number of CIs: " + nVar.j().size());
            synchronized (this) {
                for (l lVar : nVar.g()) {
                    if (lVar.c() != null && !nVar.c().equals(lVar.c().Q())) {
                        Logger.d(J, "reporting event without CI - sdk: " + nVar.c() + ", CI sdk: " + lVar.c().Q() + ", CI actual sdk: " + lVar.c().R());
                        lVar.a((CreativeInfo) null);
                    }
                    Logger.d(J, "reporting event (Check) root = " + str + ", debug info = " + nVar.B());
                    List listAsList = Arrays.asList(com.safedk.android.utils.g.f44963i, com.safedk.android.utils.g.f44956b, "com.unity3d.ads");
                    if (!TextUtils.isEmpty(nVar.B()) && str.equals("onAdHidden") && lVar.c() != null && listAsList.contains(lVar.c().Q()) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format") != null && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f43549l)) {
                        lVar.c().u(nVar.B());
                        String string2 = p.a().c().toString();
                        com.safedk.android.utils.k.b(J, "reporting event Invalid AppOpen impression detected ciDebugInfo = " + nVar.B() + " , lastMaxEvents = " + string2);
                        lVar.c().u(string2);
                    }
                    String str2 = null;
                    if (lVar.f44514b != null) {
                        Logger.d(J, "reporting event - image uniformity: " + lVar.f44514b.a(1000));
                        if (lVar.f44514b.f44459a != null && !nVar.f44533ae) {
                            str2 = lVar.f44514b.f44459a + "_" + lVar.f44513a;
                        }
                        f(nVar, str2);
                    }
                    arrayList.add(a(nVar, lVar, z11, string, str2));
                }
            }
        }
        Logger.d(J, "reporting event " + string + ", viewingTime = " + nVar.Z);
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(J, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z10) {
            nVar.b(true);
        }
        if (z11) {
            nVar.c(true);
        }
    }

    private BrandSafetyEvent a(n nVar, l lVar, boolean z10, String str, String str2) {
        return new BrandSafetyEvent(nVar.c(), nVar.f43787z, str2, z10, nVar.d() ? nVar.e() : null, lVar.c(), nVar.a(), nVar.C, lVar.f44513a != null ? lVar.f44513a : "", nVar.D, nVar.Z, nVar.Z > 0, nVar.A, lVar.f44514b != null ? lVar.f44514b.f44464f : null, lVar.f44514b != null ? lVar.f44514b.f44465g : false, lVar.f44514b != null ? lVar.f44514b.f44461c : 0L, lVar.f44514b != null ? lVar.f44514b.a(1000) : 0.0f, nVar.f43786y, SafeDK.getInstance().e(), str, nVar.M, nVar.N, nVar.P, nVar.Q, b(nVar, lVar).toString(), lVar.f44518f, lVar.f44519g, nVar.T);
    }

    private void f(n nVar, String str) {
        Logger.d(J, "add CI debug info started, hashValue " + str + ", info=" + nVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        for (l lVar : nVar.g()) {
            if (lVar.c() != null && lVar.f44514b != null && str != null && lVar.f44514b.f44459a != null && lVar.f44514b.f44464f != null && nVar.n() != null) {
                String strA = BrandSafetyUtils.a(BrandSafetyUtils.AdType.INTERSTITIAL, lVar.f44514b.f44459a, nVar.c(), nVar.n(), lVar.f44514b.f44464f);
                if (new File(strA).exists()) {
                    if (lVar.c().U() == null || !lVar.c().U().contains("screenshot_datetime")) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        lVar.c().u("screenshot_datetime=" + jCurrentTimeMillis);
                        Logger.d(J, "add CI debug info: " + jCurrentTimeMillis);
                    } else {
                        Logger.d(J, "add CI debug info - stats repo is null or already contains this event");
                    }
                } else {
                    Logger.d(J, "add CI debug info - screenshot file path doesn't exist: " + strA);
                }
            } else {
                Logger.d(J, "add CI debug info - no creative info or hash is null");
            }
            if (lVar != null && lVar.c() != null && this.B.size() > 2) {
                synchronized (this.B) {
                    Logger.d(J, "add CI debug info - adding pending images info to ci_debug_info : image_id_pending : " + this.B.keySet());
                    lVar.c().u("image_id_pending : " + this.B.keySet());
                }
            }
        }
    }

    public void a(n nVar) {
        if (nVar != null) {
            Logger.d(J, "take screenshot started - currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            Activity activity = nVar.f44541am;
            if (nVar.J()) {
                Logger.d(J, "take screenshot - sdk Interstitials Run On App Activity = " + nVar.f44538aj);
                if (nVar.f44541am != null && !BrandSafetyUtils.d(activity.getClass()) && !nVar.f44538aj) {
                    Logger.d(J, "take screenshot - The activity is not supported : " + activity.getClass());
                    return;
                }
                String str = nVar.f43783v;
                Activity activityD = d(nVar);
                Logger.d(J, "take screenshot - activity = " + activityD);
                try {
                    Logger.d(J, "take screenshot - Run on UI thread in " + nVar.f44531ac);
                    View viewK = nVar.K();
                    Logger.d(J, "take screenshot - screenshot view: " + viewK);
                    int iF = nVar.F();
                    if (iF > 0 && (viewK instanceof ViewGroup)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new WeakReference(viewK));
                        a((ViewGroup) viewK, arrayList);
                        Logger.d(J, "take screenshot - views hierarchy size: " + arrayList.size());
                        if (iF < arrayList.size()) {
                            View view = (View) ((WeakReference) arrayList.get(iF)).get();
                            Logger.d(J, "take screenshot - get screenshot view, index: " + iF + ", view: " + view);
                            viewK = view;
                        } else {
                            nVar.H();
                            Logger.d(J, "take screenshot - reset screenshot view: " + viewK);
                        }
                    }
                    CreativeInfo creativeInfoI = nVar.i();
                    String strC = (creativeInfoI == null || creativeInfoI.R() == null) ? nVar.c() : creativeInfoI.R();
                    Logger.d(J, "take screenshot - AdMob sdk package name is " + strC);
                    boolean zEquals = com.safedk.android.utils.g.f44962h.equals(strC);
                    boolean zEquals2 = com.safedk.android.utils.g.f44960f.equals(nVar.c());
                    if (creativeInfoI != null && VungleCreativeInfo.f44386a.equals(creativeInfoI.h())) {
                        Logger.d(J, "take screenshot - This ad is a VUNGLE_MRAID_AD");
                    }
                    if (creativeInfoI != null) {
                        Logger.d(J, "take screenshot - is video ad? " + creativeInfoI.v() + ", is vast video ad? " + creativeInfoI.y() + ", is multi ad? " + creativeInfoI.ah());
                    }
                    boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    if (!SafeDK.getInstance().I() && !zEquals && !zEquals2) {
                        if (creativeInfoI == null) {
                            Logger.d(J, "don't take screenshot - no creative info yet");
                            return;
                        }
                        if (creativeInfoI.w()) {
                            if (!creativeInfoI.f44356bb) {
                                Logger.d(J, "don't take screenshot - ad is playable. no endcard displaying");
                                return;
                            } else {
                                Logger.d(J, "take screenshot - playable ad finished. endcard is displaying");
                                a(nVar, viewK, activityD);
                                return;
                            }
                        }
                        if (creativeInfoI.ah() && !zA) {
                            Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                            return;
                        }
                        if (!creativeInfoI.v()) {
                            Logger.d(J, "take screenshot - ad is not a video/playable ad");
                            a(nVar, viewK, activityD);
                            return;
                        } else if (nVar.H || CreativeInfoManager.a(creativeInfoI.Q(), AdNetworkConfiguration.SHOULD_TAKE_INTERSTITIAL_SCREENSHOTS_THROUGHOUT_IMPRESSION, false)) {
                            Logger.d(J, "take screenshot - video ad finished playing or sdk configured to take screenshots throughout the impression");
                            a(nVar, viewK, activityD);
                            return;
                        } else if (a(nVar, viewK)) {
                            Logger.d(J, "take screenshot - native video player completed");
                            a(nVar, viewK, activityD);
                            return;
                        } else {
                            Logger.d(J, "don't take screenshot - video hasn't finished playing yet, waiting for video completed event");
                            return;
                        }
                    }
                    if (SafeDK.getInstance().I()) {
                        Logger.d(J, "take screenshot - SafeDK Config item 'AlwaysTakeScreenshot' is true");
                        a(nVar, viewK, activityD);
                    } else if (creativeInfoI == null) {
                        Logger.d(J, "don't take screenshot - Admob/IronSource SDK but no ci yet");
                    } else if (creativeInfoI.ah() && !zA) {
                        Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                    } else {
                        Logger.d(J, "take screenshot - Admob/IronSource SDK");
                        a(nVar, viewK, activityD);
                    }
                } catch (Throwable th2) {
                    Logger.e(J, "Failed while taking screenshot", th2);
                    new CrashReporter().caughtException(th2);
                }
            }
        }
    }

    private boolean a(n nVar, View view) {
        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.c());
        if (adNetworkDiscoveryH == null || !nVar.V || !adNetworkDiscoveryH.b(view)) {
            return false;
        }
        if (nVar.H) {
            return true;
        }
        Logger.d(J, "is native video player completed - native video end, info:" + nVar);
        nVar.a(ImpressionLog.f43640p, new ImpressionLog.a[0]);
        nVar.H = true;
        return true;
    }

    private Activity d(n nVar) {
        if (nVar.f44538aj) {
            return com.safedk.android.internal.b.getInstance().getForegroundActivity();
        }
        return nVar.f44541am;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        Logger.d(J, "set CI details started, matchingInfo = " + oVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        CreativeInfo creativeInfo = oVar.f44545a;
        if (creativeInfo == null) {
            return false;
        }
        creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
        n nVar = null;
        if (creativeInfo.m() != null) {
            n nVarD = this.F.d(creativeInfo.m());
            Logger.d(J, "set CI details, attempt to locate interstitial info by eventId " + creativeInfo.m() + ", success? " + (nVarD != null));
            nVar = nVarD;
        }
        if (nVar == null && creativeInfo.af() != null) {
            n nVarA = this.F.a(creativeInfo.af(), true);
            Logger.d(J, "set CI details, attempt to locate interstitial info by matching object address " + creativeInfo.af() + ", success ? " + (nVarA != null));
            nVar = nVarA;
        }
        if (nVar != null) {
            return a(oVar, nVar);
        }
        List<n> listA = this.F.a(creativeInfo.Q());
        if (listA.size() > 0) {
            Logger.d(J, "set CI details, attempt to locate interstitial info, list size: " + listA.size());
            Iterator<n> it = this.F.a(creativeInfo.Q()).iterator();
            while (it.hasNext()) {
                if (a(oVar, it.next())) {
                    List<o> list = this.P.get(creativeInfo.Q());
                    if (list != null) {
                        list.remove(oVar);
                    }
                    return true;
                }
            }
            return false;
        }
        Logger.d(J, "set CI details, failed to locate interstitial info");
        a(oVar, creativeInfo.Q());
        return false;
    }

    private boolean a(o oVar, n nVar) {
        BrandSafetyEvent.AdFormatType adFormatTypeA;
        if (nVar == null) {
            return false;
        }
        CreativeInfo creativeInfo = oVar.f44545a;
        Logger.d(J, "set CI details - ad info sdk: " + nVar.c() + ", CI sdk: " + creativeInfo.Q() + " ad info webview address: " + nVar.K + ", ci matching object address: " + creativeInfo.af());
        if (nVar.A != null) {
            Logger.d(J, "set CI details - CI ad format: " + creativeInfo.I() + ", max ad type: " + nVar.A.getString("ad_format"));
            BrandSafetyEvent.AdFormatType adFormatTypeA2 = BrandSafetyUtils.a(nVar.A);
            if ((creativeInfo.I() == null || !creativeInfo.I().equals(adFormatTypeA2.name())) && adFormatTypeA2 != null) {
                Logger.d(J, "set CI details - updating ad format value to " + adFormatTypeA2.name());
                creativeInfo.p(adFormatTypeA2.name());
                nVar.e("ad_type_upd(sCrInfoDtls):" + adFormatTypeA2.name());
            }
        }
        if (nVar.f43783v != null && (nVar.f43783v.equals(creativeInfo.Q()) || nVar.f43783v.equals(creativeInfo.R()))) {
            if (nVar.U) {
                Logger.d(J, "set CI details - ad is already finished, cannot set creative info");
                return false;
            }
            Logger.d(J, "set CI details - currentMaxPackageName: " + nVar.f43783v);
            if (a(creativeInfo, nVar)) {
                Logger.d(J, "set CI details - setting as current CI for SDK: " + creativeInfo.Q());
                if (nVar.i() != null) {
                    Logger.d(J, "set CI details - replacing CI " + nVar.i());
                }
                if (creativeInfo.I() == null && (adFormatTypeA = BrandSafetyUtils.a(nVar.A)) != null) {
                    Logger.d(J, "set CI details - Start monitoring ad check, updating ad format value to " + adFormatTypeA.name());
                    creativeInfo.p(adFormatTypeA.name());
                    nVar.e("ad_type_upd(shldStrtMntrngAd):" + adFormatTypeA.name());
                }
                b(creativeInfo, nVar);
                if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false) && creativeInfo.F() != null && nVar.y() != null && creativeInfo.F().contains(nVar.y())) {
                    Logger.d(J, "set CI details - replacing ci placement " + creativeInfo.F() + " with Max placement " + nVar.y());
                    creativeInfo.h(nVar.y());
                }
                try {
                    boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    com.safedk.android.utils.k.b(J, "set CI details - Multi ad detectMultipleAdsByWebview =  " + zA + ", currentActivityInterstitial.isMultiAd() = " + nVar.f() + ", currentActivityInterstitial.getImpression() != null ?" + (nVar.h() != null) + ", currentActivityInterstitial.getImpression().getCreativeInfo() != null ? " + (nVar.h().c() != null) + ", getImpressionList = " + nVar.g());
                    if (zA && nVar.f() && nVar.h() != null && nVar.h().c() != null) {
                        Logger.d(J, "set CI details - Multi ad, current impression already has a CI. not calling setCreativeInfo.");
                        return false;
                    }
                } catch (Throwable th2) {
                    Logger.d(J, "Exception in set CI details - Multi ad : " + th2.getMessage(), th2);
                }
                return b(oVar, nVar);
            }
        }
        a(oVar, creativeInfo.Q());
        creativeInfo.u("apci|ts=" + System.currentTimeMillis() + "|i=" + oVar.f44547c + ";" + oVar.f44546b + "|o=" + oVar.f44545a.ae() + ";" + oVar.f44545a.af());
        b(creativeInfo, nVar);
        return false;
    }

    private void b(CreativeInfo creativeInfo, n nVar) {
        if (nVar != null) {
            if (nVar.f44539ak == null || nVar.f44539ak.isCancelled()) {
                Logger.d(J, "Set CI details - task future is: " + nVar.f44539ak + ", is scanning? " + nVar.f44540al + " is ad finished? " + nVar.U);
                if (!nVar.f44540al) {
                    Logger.d(J, "set CI details - starting timer for InterstitialInfo with event id: " + nVar.w());
                    e(nVar);
                    nVar.Z = 0L;
                    nVar.f44539ak = this.D.scheduleAtFixedRate(new b(nVar.L), 500L, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
                Logger.d(J, "set CI details - avoid recursive call to web view scanning");
                creativeInfo.u("avoidRecWebScan");
            }
        }
    }

    private synchronized void a(o oVar, String str) {
        if (oVar != null) {
            if (oVar.f44545a != null) {
                List<o> arrayList = this.P.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.P.put(str, arrayList);
                }
                if (!CreativeInfoManager.a(str, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                    Logger.d(J, "adding as pending for SDK: " + oVar.f44545a.Q() + " matching info: " + oVar);
                    arrayList.add(oVar);
                } else {
                    Logger.d(J, "NOT adding as pending (config based), sdk: " + str + " matching info: " + oVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b(o oVar, n nVar) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        boolean z10 = false;
        synchronized (this) {
            Logger.d(J, "set CI started, matching info=" + (oVar == null ? "null" : oVar.toString()) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (oVar == null) {
                Logger.d(J, "set CI, matching info is null");
            } else {
                CreativeInfo creativeInfo = oVar.f44545a;
                if (creativeInfo != null) {
                    Logger.d(J, "set CI, matching info is " + oVar);
                    if (nVar != null) {
                        if (nVar.i() != null && !nVar.i().ah()) {
                            CreativeInfoManager.b(creativeInfo);
                            com.safedk.android.utils.k.b(J, "set CI, already matched! ignore matching attempt CI: " + creativeInfo);
                        } else {
                            creativeInfo.a(oVar.f44546b, oVar.f44547c);
                            Logger.d(J, "set CI: " + creativeInfo);
                            nVar.a(creativeInfo);
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false) && (adNetworkDiscoveryH = CreativeInfoManager.h(creativeInfo.Q())) != null) {
                                adNetworkDiscoveryH.b(creativeInfo);
                            }
                            if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && nVar.K != null) {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(nVar.K, creativeInfo);
                            } else {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo, (String) null);
                            }
                            if (oVar.f44546b.startsWith(CreativeInfo.f44326h)) {
                                nVar.u();
                            }
                            b(nVar, creativeInfo);
                            e(nVar, "setCreativeInfo");
                            if (creativeInfo.v()) {
                                nVar.H = false;
                            }
                            if (!nVar.f44536ah && StatsReporter.b().a(creativeInfo, nVar)) {
                                nVar.f44536ah = true;
                            }
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        Logger.d(J, "set ad click URL started, sdk: " + str2 + ", url: " + str + ", view address: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str2);
        n nVarA = this.F.a(str3, false);
        if (nVarA == null && this.F.a(mainSdkPackage).size() == 1) {
            Logger.d(J, "InterstitialInfo not found by address, trying by SdkPackageName " + mainSdkPackage);
            nVarA = this.F.a(mainSdkPackage).get(0);
        }
        if (nVarA != null && nVarA.c() != null && SdksMapping.isSameSdkByPackages(nVarA.c(), mainSdkPackage)) {
            Logger.d(J, "set ad click URL - applying clickUrl candidate logic. url: " + str);
            if (!nVarA.d()) {
                Logger.d(J, "set ad click URL - current Activity Interstitial is not marked as clicked, setting click URL: " + str);
                b(nVarA, str);
            } else if (nVarA.e() == null) {
                Logger.d(J, "set ad click URL - no click URL yet, setting clickUrl: " + str);
                nVarA.c(str);
            } else {
                Logger.d(J, "set ad click URL - click URL already set: " + nVarA.e());
            }
            return true;
        }
        Logger.d(J, "set ad click URL skipped, SDK: " + (nVarA != null ? nVarA.c() : "null"));
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
        n nVarA = this.F.a(str3, false);
        if (nVarA != null && nVarA.d() && str2 != null && str2.equals(nVarA.c()) && nVarA.f44541am != null) {
            String string = nVarA.f44541am.toString();
            Logger.d(J, "set previous activity click url, click activity: " + string + ", ad activity: " + nVarA.f44531ac);
            String strA = BrandSafetyUtils.a(string, true);
            if (strA != null && !strA.equals(nVarA.B)) {
                Logger.d(J, "set previous activity click url - detected URL for click in previous activity (not yet destroyed), url: " + str);
                if (nVarA.c(str)) {
                    e(nVarA, "setPreviousActivityClickUrl");
                }
            }
        }
    }

    private void a(final n nVar, final View view, final Activity activity) {
        try {
            if (nVar == null || activity == null) {
                Logger.d(J, "currentActivityInterstitial or activity are null");
            } else {
                final String strC = nVar.c();
                Logger.d(J, "taking screenshot on UIThread, view=" + view);
                activity.runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CreativeInfoManager.a(strC, AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, false)) {
                            Logger.d(InterstitialFinder.J, "Taking screenshot - network supports copying bitmap using PixelCopy");
                            ScreenshotHelper.a(activity, nVar, view, SafeDK.getInstance().F());
                            return;
                        }
                        final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().F());
                        if (bitmapA == null) {
                            nVar.G();
                            Logger.d(InterstitialFinder.J, "taking screenshot, black screenshot detected index = " + nVar.F());
                        } else {
                            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    InterstitialFinder.this.a(nVar, strC, bitmapA);
                                }
                            });
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            Logger.e(J, "taking screenshot taking screenshot exception:", th2);
        }
    }

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.InterstitialFinder$9, reason: invalid class name */
    class AnonymousClass9 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f43682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f43683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f43684c;

        AnonymousClass9(n nVar, Bitmap bitmap) {
            this.f43683b = nVar;
            this.f43684c = bitmap;
            this.f43682a = this.f43683b.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.9.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.a(AnonymousClass9.this.f43683b, AnonymousClass9.this.f43682a, AnonymousClass9.this.f43684c);
                }
            });
        }
    }

    public void a(Bitmap bitmap, n nVar, Activity activity) {
        activity.runOnUiThread(new AnonymousClass9(nVar, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, String str, Bitmap bitmap) {
        if (bitmap != null) {
            BrandSafetyUtils.a aVarA = BrandSafetyUtils.a(str, bitmap);
            int iA = aVarA.a();
            BrandSafetyUtils.ScreenshotValidity screenshotValidityA = BrandSafetyUtils.a(str, aVarA);
            if (screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                nVar.G();
                Logger.d(J, "process screenshot, black/uniform screenshot detected index = " + nVar.F());
                return;
            }
            if (screenshotValidityA == BrandSafetyUtils.ScreenshotValidity.VALID) {
                String strA = BrandSafetyUtils.a(bitmap);
                Logger.d(J, "process screenshot found interstitial, hash = " + strA);
                AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
                if (adNetworkDiscoveryH != null && !adNetworkDiscoveryH.a(strA, this.Q)) {
                    Logger.d(J, "process screenshot skipping file, not valid for " + str);
                    nVar.e("SkippedImageHash=" + strA);
                    return;
                }
                nVar.f44535ag = BrandSafetyUtils.b(bitmap);
                String strN = nVar.n();
                Logger.d(J, "process screenshot impressionId is " + strN);
                String strA2 = BrandSafetyUtils.a(bitmap, BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.f44535ag);
                Logger.d(J, "process screenshot screenshot file created, filename = " + strA2);
                long jC = BrandSafetyUtils.c(strA2);
                float f10 = (iA / 1000.0f) * 100.0f;
                if (adNetworkDiscoveryH != null && jC < adNetworkDiscoveryH.a(nVar.i())) {
                    Logger.d(J, "process screenshot file size too small " + jC + " (bytes). This image will not be used");
                    BrandSafetyUtils.d(strA2);
                    return;
                }
                Logger.d(J, "process screenshot stored file size is " + jC + " bytes, counter is " + nVar.f43786y + ", uniform pixel count is " + iA + " (" + f10 + "%)");
                int size = this.B.size();
                if (!e(strA, strN)) {
                    boolean z10 = false;
                    if (size < SafeDK.getInstance().J()) {
                        Logger.d(J, "process screenshot impressions to report size=" + size + ", max images to store=" + SafeDK.getInstance().J());
                        if (nVar.f44530ab == null) {
                            z10 = true;
                        } else if (!nVar.f44530ab.equals(strA)) {
                            Logger.d(J, "process screenshot removing previous file : " + nVar.f43781t);
                            BrandSafetyUtils.d(nVar.f43781t);
                            z10 = true;
                        }
                        if (z10) {
                            Logger.d(J, "process screenshot keeping file of interstitial " + strA + ". file size is " + jC + " (bytes), orientation: " + nVar.f44535ag);
                            BrandSafetyUtils.a(nVar.t(), BrandSafetyUtils.AdType.INTERSTITIAL, strA, str, strN, nVar.f44535ag);
                        }
                    } else if (!d(strA, strN)) {
                        Logger.d(J, "process screenshot no open slot for interstitial " + strA);
                        BrandSafetyUtils.d(strA2);
                        strA = null;
                    } else {
                        Logger.d(J, "process screenshot image " + strA + "_" + strN + " is already scheduled for upload");
                    }
                } else {
                    Logger.d(J, "process screenshot not saving file for interstitial " + strA + "_" + strN);
                    BrandSafetyUtils.d(strA2);
                    if (e(strA, strN)) {
                        Logger.d(J, "process screenshot interstitial " + strA + "_" + strN + " was already reported");
                    } else {
                        Logger.d(J, "process screenshot waiting to report stored interstitial " + nVar.f44530ab);
                    }
                    if (nVar.f44530ab != null) {
                        if (d(nVar.f44530ab, nVar.n())) {
                            BrandSafetyUtils.d(nVar.f43781t);
                        } else {
                            Logger.d(J, "process screenshot not deleting not best image " + nVar.f43781t);
                        }
                    }
                }
                boolean z11 = false;
                if (strA != null) {
                    Logger.d(J, "process screenshot setting interstitial info data (previous hash = " + nVar.f44530ab + ", current hash = " + strA + ")");
                    z11 = (nVar.f44530ab == null || strA.equals(nVar.f44530ab)) ? false : true;
                }
                if (nVar.f44535ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED)) {
                    nVar.f44535ag = BrandSafetyUtils.b(bitmap);
                }
                l lVarH = nVar.h();
                if (lVarH != null) {
                    lVarH.b(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                    Logger.d(J, "process screenshot setting image details: " + lVarH.f44514b);
                    lVarH.f44514b = new j(strA, strA2, jC, iA, nVar.f43786y, nVar.f44535ag, z11);
                    e(nVar, "processScreenshot");
                }
                if (nVar.f44530ab == null) {
                    Logger.d(J, "process screenshot no previous hash to detect animation, keep sampling");
                    nVar.f44530ab = strA;
                    nVar.f43781t = strA2;
                    nVar.f43782u = nVar.f44535ag;
                    return;
                }
                boolean z12 = true;
                CreativeInfo creativeInfoI = nVar.i();
                if (creativeInfoI != null && creativeInfoI.D()) {
                    if (z11) {
                        Logger.d(J, "process screenshot, shopping collage didn't finished loading");
                        z12 = false;
                    } else {
                        Logger.d(J, "process screenshot, shopping collage finished loading");
                    }
                }
                if (a(iA, jC) && z12) {
                    if (lVarH != null) {
                        lVarH.a(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                    }
                    j jVarL = nVar.l();
                    if (jVarL != null) {
                        jVarL.f44465g = z11;
                        Logger.d(J, "process screenshot setting interstitial is_animated field to " + z11);
                    }
                    if (!TextUtils.isEmpty(strA)) {
                        if (nVar.f44535ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) && jVarL != null) {
                            jVarL.f44464f = BrandSafetyUtils.b(bitmap);
                        }
                        Logger.d(J, "process screenshot - before reporting, debug info is: " + nVar.B());
                        e(nVar, "processScreenshot");
                        nVar.d(true);
                    }
                    a(nVar.L);
                    return;
                }
                nVar.f44530ab = strA;
                nVar.f43781t = strA2;
                nVar.f43782u = nVar.f44535ag;
                return;
            }
            Logger.d(J, "process screenshot is not valid: " + screenshotValidityA.name() + ", pixel count: " + iA + ", try again...");
            if (nVar.f44529aa && nVar.H) {
                Logger.d(J, "process screenshot back from background - reset video completed indication to false");
                nVar.f44529aa = false;
                nVar.H = false;
            }
        }
    }

    private String c(View view) {
        return BrandSafetyUtils.b(view.getClass());
    }

    protected String b(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WebView) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                Logger.d(J, "View = " + childAt + ": width = " + width + " height = " + height);
                if (childAt.getVisibility() == 0 && a(width, height)) {
                    String strC = c(childAt);
                    Logger.d(J, "Found full screen webview of SDK = " + strC);
                    return strC;
                }
            } else if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
            i10 = i11 + 1;
        }
    }

    private boolean a(int i10, int i11) {
        return i10 == BrandSafetyUtils.a() && i11 == BrandSafetyUtils.b();
    }

    private boolean a(int i10, long j10) {
        Logger.d(J, "should stop sampling started, maxUniformedPixelsCount=" + i10 + ", fileSize=" + j10 + " (bytes), stopSamplingFileSize=" + SafeDK.getInstance().K());
        boolean z10 = BrandSafetyUtils.a(i10) && j10 > SafeDK.getInstance().K();
        Logger.d(J, "should stop sampling returned " + z10);
        return z10;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null && nVar.Y) {
                    nVar.a(ImpressionLog.f43650z, new ImpressionLog.a[0]);
                    e(nVar, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null) {
                    nVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    e(nVar, "onForeground");
                    if (nVar.H) {
                        continue;
                    } else {
                        nVar.f44529aa = true;
                    }
                }
            }
        }
    }

    private void a(List<WeakReference<WebView>> list, n nVar) {
        Iterator<WeakReference<WebView>> it = list.iterator();
        while (it.hasNext()) {
            WebView webView = it.next().get();
            if (webView != null) {
                String strA = BrandSafetyUtils.a((Class) webView.getClass());
                if (!TextUtils.isEmpty(strA) && !strA.equals(nVar.c()) && strA.equals(com.safedk.android.utils.g.f44962h)) {
                    Logger.d(J, "identify scar-admob - webView is Admob: " + webView + ", current interstitial info: " + nVar);
                    nVar.T = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final n nVar) {
        if (nVar == null || nVar.f44540al) {
            return;
        }
        Activity activity = nVar.f44541am;
        Logger.d(J, "scan for webViews started, activity: " + (activity == null ? "null" : activity.toString()) + ", currentActivityInterstitial.resourceMatching: " + nVar.J + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity == null || !BrandSafetyUtils.h(activity.getClass().getName())) {
            try {
                if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                    Logger.d(J, "scan for webViews : resourceMatching DEFAULT");
                    if (nVar.i() != null) {
                        View viewF = nVar.i().f();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList2.add(BrandSafetyUtils.a(viewF));
                        arrayList3.add("h1c1:" + viewF);
                        String strC = nVar.c() != null ? nVar.c() : "";
                        a(nVar, strC, (ViewGroup) viewF, arrayList, arrayList2, arrayList3, 1);
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT found viewHierarchy " + arrayList3);
                        if (nVar.x() != null) {
                            Logger.d(J, "scan for webViews resourceMatching DEFAULT previous ViewsHierarchy size :  " + nVar.x().size() + " , current : " + arrayList2.size());
                            long jA = CreativeInfoManager.a(strC, AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
                            if (jA > 0 && nVar.x().size() >= jA + ((long) arrayList2.size())) {
                                Logger.d(J, "scan for webViews resourceMatching DEFAULT End of video detected");
                                a(strC, (Object) viewF);
                            }
                        } else {
                            nVar.a(ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, "none"));
                        }
                        nVar.a(arrayList2);
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                Logger.e(J, "scan for webViews resourceMatching DEFAULT exception : ", th2);
                return;
            } finally {
                Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                nVar.f44540al = false;
            }
        }
        try {
            try {
                nVar.f44540al = true;
                View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
                final AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(nVar.c());
                String strC2 = nVar.c() != null ? nVar.c() : "";
                if (adNetworkDiscoveryH == null) {
                    Logger.d(J, "scan for webViews - exit scanning");
                    nVar.f44540al = false;
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (viewFindViewById != null) {
                    arrayList5.add(BrandSafetyUtils.a(viewFindViewById));
                    arrayList6.add("h1c1:" + viewFindViewById);
                    a(nVar, strC2, (ViewGroup) viewFindViewById, arrayList4, arrayList5, arrayList6, 1);
                    a(arrayList4, nVar);
                    com.safedk.android.utils.k.b(J, "scan for webViews found views hierarchy : " + arrayList6);
                }
                if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP) {
                    final WeakReference<WebView> weakReferenceA = adNetworkDiscoveryH.a((List<WeakReference<WebView>>) arrayList4, nVar.i() != null ? nVar.i().L() : null);
                    if (weakReferenceA == null || weakReferenceA.get() == null) {
                        Logger.d(J, "scan for webViews - WebView not found");
                        if (nVar.f43774m == null) {
                            nVar.a(ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, "none"));
                        }
                        nVar.a(arrayList5);
                    } else {
                        nVar.a(arrayList5);
                        nVar.b(arrayList4);
                        final String strA = BrandSafetyUtils.a(weakReferenceA.get());
                        if (nVar.K == null) {
                            a(strA, ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, strA));
                        }
                        SafeDKWebAppInterface.a(strA);
                        com.safedk.android.analytics.brandsafety.creatives.e.a(strA);
                        a((c) nVar);
                        if (nVar.K != null && nVar.K.equals(strA)) {
                            Logger.d(J, "scan for webViews - exit scanning");
                            nVar.f44540al = false;
                            return;
                        }
                        Logger.d(J, "scan for webViews found " + weakReferenceA.get());
                        boolean zA = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                        Logger.d(J, "scan for webViews, should detect multiple ads by web view change? " + zA);
                        if (zA && nVar.K != null && !nVar.K.equals(strA)) {
                            g(nVar, strA);
                        }
                        nVar.K = strA;
                        Logger.d(J, "scan for webViews address set to " + strA);
                        Iterator<l> it = nVar.g().iterator();
                        while (it.hasNext()) {
                            CreativeInfo creativeInfoC = it.next().c();
                            Logger.d(J, "scan for webViews - current ci is: " + creativeInfoC);
                            if (creativeInfoC == null) {
                                Logger.d(J, "scan for webViews will check for pending CIs for package " + nVar.c());
                                Iterator<o> it2 = a(nVar.c(), nVar).iterator();
                                while (it2.hasNext()) {
                                    b(it2.next(), nVar);
                                }
                            } else if (creativeInfoC.af() == null || arrayList5.contains(creativeInfoC.af())) {
                                Logger.d(J, "scan for webViews attempting to collect resources for " + strA + ", CI: " + creativeInfoC);
                                com.safedk.android.analytics.brandsafety.creatives.e.a(strA, creativeInfoC);
                            } else {
                                Logger.d(J, "scan for webViews skip resources collection for address: " + strA + ", CI: " + creativeInfoC);
                            }
                        }
                        if (adNetworkDiscoveryH.d() != null && adNetworkDiscoveryH.d().a(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f43549l)) {
                            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.10
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (weakReferenceA != null && weakReferenceA.get() != null) {
                                        List<CreativeInfo> listA = adNetworkDiscoveryH.a(new WeakReference<>((View) weakReferenceA.get()), (String) null, false);
                                        if (listA != null) {
                                            for (CreativeInfo creativeInfo : listA) {
                                                com.safedk.android.utils.k.b(InterstitialFinder.J, "scan for webViews ci returned : " + creativeInfo);
                                                if (creativeInfo.m() == null) {
                                                    creativeInfo.f(nVar.L);
                                                }
                                                if (nVar.A != null && nVar.A.containsKey("ad_format")) {
                                                    String strName = BrandSafetyUtils.a(nVar.A).name();
                                                    creativeInfo.p(strName);
                                                    nVar.e("ad_type_upd(scnFrWVs):" + strName);
                                                    Logger.d(InterstitialFinder.J, "scan for webViews ad_format set to  : " + strName);
                                                }
                                                InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f44332n, strA));
                                            }
                                            return;
                                        }
                                        Logger.d(InterstitialFinder.J, "scan for webViews ci not found by View");
                                    }
                                }
                            });
                        }
                    }
                } else if (viewFindViewById != null && nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                    WeakReference<WebView> weakReferenceA2 = adNetworkDiscoveryH.a((List<WeakReference<WebView>>) arrayList4, (String) null);
                    if (weakReferenceA2 == null || weakReferenceA2.get() == null) {
                        Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) - WebView not found");
                    } else {
                        String strA2 = BrandSafetyUtils.a(weakReferenceA2.get());
                        if (nVar.K == null) {
                            a(strA2, ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, strA2));
                        }
                        Logger.d(J, "scan for webViews found (DIRECT_CREATIVE_INFO) " + strA2);
                        nVar.K = strA2;
                        a((c) nVar);
                        CreativeInfo creativeInfoC2 = nVar.h().c();
                        if (creativeInfoC2 != null) {
                            Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) attempting to collect resources for " + strA2 + ", CI: " + creativeInfoC2);
                            com.safedk.android.analytics.brandsafety.creatives.e.a(strA2, creativeInfoC2);
                        }
                    }
                } else if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                    if (nVar.f43774m == null) {
                        nVar.a(ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, "none"));
                    }
                    nVar.a(arrayList5);
                }
                Logger.d(J, "scan for webViews - exit scanning");
                nVar.f44540al = false;
            } catch (Throwable th3) {
                Logger.d(J, "scan for webViews - exit scanning");
                nVar.f44540al = false;
                throw th3;
            }
        } catch (Throwable th4) {
            Logger.e(J, "scan for webViews execution: ", th4);
            Logger.d(J, "scan for webViews - exit scanning");
            nVar.f44540al = false;
        }
    }

    private void g(n nVar, String str) {
        Logger.d(J, "handle web view change, web view change detected from: " + nVar.K + ", to: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        l lVarH = nVar.h();
        if (lVarH != null && lVarH.c() != null && !lVarH.c().ah()) {
            lVarH.c().ai();
            String strH = lVarH.c().h();
            if (strH != null) {
                lVarH.c().c(strH + CreativeInfo.aJ);
            }
        }
        nVar.g().add(new l(UUID.randomUUID().toString()));
        Logger.d(J, "handle WebView Change - new Impression info object created. number of impressions in ad : " + nVar.g().size());
        if (nVar.D == null) {
            nVar.D = UUID.randomUUID().toString();
        }
        nVar.f44533ae = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final n nVar, final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.2
            @Override // java.lang.Runnable
            public void run() {
                BrandSafetyUtils.AdType adTypeB;
                BrandSafetyUtils.AdType adTypeA;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
                String strB = BrandSafetyUtils.b(activity.getClass());
                try {
                    if (nVar != null && nVar.j().isEmpty() && CreativeInfoManager.a(strB) == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.get("ad_format") != null && CreativeInfoManager.a(strB, AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                        String strY = nVar.y();
                        BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(nVar.A);
                        Logger.d(InterstitialFinder.J, "try to find CI, ad format = " + adFormatTypeA + ", placement = " + strY + ", activity sdk = " + strB);
                        List<CreativeInfo> listB = InterstitialFinder.this.b(viewGroup, strB);
                        if (listB != null) {
                            Logger.d(InterstitialFinder.J, "try to find CI, updating ad format value to " + adFormatTypeA);
                            InterstitialFinder.this.a(activity, nVar);
                            for (CreativeInfo creativeInfo : listB) {
                                if (creativeInfo.I() != null && adFormatTypeA != null && (adTypeB = BrandSafetyUtils.b(creativeInfo.I())) != (adTypeA = BrandSafetyUtils.a(adFormatTypeA))) {
                                    Logger.d(InterstitialFinder.J, "try to find CI, skipping CI due to incompatible ad type - CI:" + adTypeB + ", max: " + adTypeA);
                                } else {
                                    creativeInfo.p(adFormatTypeA != null ? adFormatTypeA.name() : null);
                                    nVar.e("ad_type_upd(tryTFndCI):" + adFormatTypeA);
                                    creativeInfo.f(nVar.A.getString("id"));
                                    creativeInfo.h(nVar.A.getString(BrandSafetyEvent.f44592k));
                                    Logger.d(InterstitialFinder.J, "try to find CI - ci event id : " + creativeInfo.m() + ", placement id : " + creativeInfo.F());
                                    InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f44332n, ""));
                                }
                            }
                            return;
                        }
                        Logger.d(InterstitialFinder.J, "try to find CI - did not find CIs for event id: " + nVar.L);
                    }
                } catch (Throwable th2) {
                    Logger.d(InterstitialFinder.J, "Exception while attempting to find CI : " + th2.getMessage(), th2);
                }
            }
        });
    }

    public void b(n nVar, String str) {
        nVar.f44537ai = new h(System.currentTimeMillis(), str);
    }

    public void g(String str, String str2) {
        Logger.d(J, "setCurrentInterstitialDownstreamStruct started");
        List<n> listA = this.F.a(str);
        if (listA.size() == 1) {
            n nVar = listA.get(0);
            if (nVar != null) {
                List<CreativeInfo> listJ = nVar.j();
                if (!listJ.isEmpty() && str2 != null) {
                    for (CreativeInfo creativeInfo : listJ) {
                        creativeInfo.c(creativeInfo.h() + "/" + str2);
                    }
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(J, "setCurrentInterstitialDownstreamStruct number of Infos for " + str + " is " + listA.size() + ", cannot set downstream struct");
    }

    public void l(String str) {
        List<CreativeInfo> listJ;
        Logger.d(J, "setStopCollectingResources started");
        List<n> listA = this.F.a(str);
        if (listA.size() == 1) {
            n nVar = listA.get(0);
            if (nVar != null && (listJ = nVar.j()) != null && !listJ.isEmpty()) {
                for (CreativeInfo creativeInfo : listJ) {
                    String strH = creativeInfo.h();
                    if (strH != null && strH.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.j.f44192c)) {
                        creativeInfo.a(true);
                    }
                }
                return;
            }
            return;
        }
        Logger.d(J, "setStopCollectingResources number of Infos for " + str + " is " + listA.size() + ", cannot stop collecting resources");
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43691b;

        private b() {
            this.f43691b = null;
        }

        public b(String str) {
            this.f43691b = null;
            this.f43691b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f43691b != null) {
                n nVar = InterstitialFinder.this.F.get(this.f43691b);
                if (nVar != null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task timer for info " + nVar.L + ", isCancelled = " + (nVar.f44539ak != null ? Boolean.valueOf(nVar.f44539ak.isCancelled()) : "?") + ", isDone = " + (nVar.f44539ak != null ? Boolean.valueOf(nVar.f44539ak.isDone()) : "?") + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    if (nVar.i() == null && nVar.f44541am != null && CreativeInfoManager.a(BrandSafetyUtils.b(nVar.f44541am.getClass()), AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                        Logger.d(InterstitialFinder.J, "interstitial finder task timer for info " + nVar.L + " calling tryToFindCI");
                        InterstitialFinder.this.a(nVar, nVar.f44541am);
                    }
                    if (nVar.f44541am != null) {
                        Logger.d(InterstitialFinder.J, "interstitial finder task activity sdk is " + BrandSafetyUtils.b(nVar.f44541am.getClass()));
                    }
                    if (!nVar.E && nVar.f43786y == 2) {
                        InterstitialFinder.this.e(nVar, "timer task run");
                    }
                    if (InterstitialFinder.this.O == 0 || jCurrentTimeMillis - InterstitialFinder.this.O >= 900.0d) {
                        InterstitialFinder.this.O = jCurrentTimeMillis;
                        if (!nVar.f44533ae) {
                            InterstitialFinder.this.a(nVar);
                        } else {
                            Logger.d(InterstitialFinder.J, "request to stop taking screenshots has been received, skipping.");
                        }
                        int i10 = nVar.f43786y + 1;
                        nVar.f43786y = i10;
                        if (i10 != 120) {
                            InterstitialFinder.this.e(nVar);
                            if (nVar.j().isEmpty()) {
                                Logger.d(InterstitialFinder.J, "interstitial finder task checking for pending CIs");
                                for (o oVar : InterstitialFinder.this.a(nVar.f43783v, nVar)) {
                                    if (oVar != null && oVar.f44545a != null) {
                                        Logger.d(InterstitialFinder.J, "interstitial finder task calling set CI");
                                        InterstitialFinder.this.b(oVar, nVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(InterstitialFinder.J, "max number of screenshots threshold reached, no need to start timers");
                        InterstitialFinder.this.a(this.f43691b);
                        return;
                    }
                    return;
                }
                return;
            }
            Logger.d(InterstitialFinder.J, "interstitial finder task event id is null, skipping.");
        }
    }

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f43687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f43688b;

        public a(String str, String str2) {
            this.f43687a = str;
            this.f43688b = str2;
        }

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (o10 == null || getClass() != o10.getClass()) {
                return false;
            }
            a aVar = (a) o10;
            boolean zEquals = this.f43687a.equals(aVar.f43687a);
            if (this.f43688b != null) {
                return zEquals && this.f43688b.equals(aVar.f43688b);
            }
            return zEquals;
        }

        public int hashCode() {
            return this.f43688b != null ? this.f43687a.hashCode() * this.f43688b.hashCode() : this.f43687a.hashCode();
        }

        public String toString() {
            return "{placementId=" + this.f43687a + ", eventId=" + this.f43688b + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        }

        public String a() {
            return (this.f43687a != null ? this.f43687a : "") + "_" + (this.f43688b != null ? this.f43688b : "");
        }
    }

    private static View a(ViewGroup viewGroup, String str) {
        Logger.d(J, "find views " + viewGroup.toString());
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Logger.d(J, "find views child " + childAt.toString());
            if (str != null && childAt.getClass().getName().equals(str)) {
                Logger.d(J, "find views found " + str + " : " + childAt.toString());
                return childAt;
            }
            if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CreativeInfo> b(ViewGroup viewGroup, String str) {
        List<CreativeInfo> listA;
        Logger.d(J, "get creative info from ad view started : " + viewGroup.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Logger.d(J, "get creative info from ad view - child " + childAt.toString());
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && (listA = adNetworkDiscoveryH.a(new WeakReference<>(childAt), (String) null, false)) != null) {
                for (CreativeInfo creativeInfo : listA) {
                    creativeInfo.a((Object) childAt);
                    creativeInfo.u("ci_source_sdk_class=" + childAt.getClass().getName());
                    Logger.d(J, "get creative info from ad view - ci found, object : " + childAt.toString());
                }
                return listA;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    public static void a(View view, int i10) {
        Logger.d(J, "find views view : " + new String(new char[i10 * 2]).replace("\u0000", "-") + view.getClass().toString() + new StringBuilder().toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
        synchronized (this.B) {
            com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public void a(l lVar) {
        Logger.d(J, "remove impression screenshots started");
        if (lVar != null && lVar.f44515c != null) {
            Logger.d(J, "Calling remove ad files, filename = " + lVar.f44515c);
            BrandSafetyUtils.d(lVar.f44515c);
            lVar.f44515c = null;
        } else {
            Logger.d(J, "no last activity impression screenshot filename");
        }
        this.C.clear();
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n a(String str, RedirectDetails redirectDetails, m mVar, boolean z10, boolean z11) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void d(String str, String str2, String str3) {
        n nVarA = this.F.a(str, false);
        if (nVarA != null) {
            if (com.safedk.android.analytics.brandsafety.b.f43755y.equals(str3)) {
                nVarA.a(str2, true);
            } else {
                nVarA.e(str2);
            }
            Logger.d(J, "pass message to ad info - message: " + str2 + " has passed to info: " + nVarA);
            return;
        }
        Logger.d(J, "pass message to ad info - info is null");
    }

    public boolean d() {
        Iterator<n> it = this.F.values().iterator();
        while (it.hasNext()) {
            if (!it.next().U) {
                return true;
            }
        }
        return false;
    }
}
