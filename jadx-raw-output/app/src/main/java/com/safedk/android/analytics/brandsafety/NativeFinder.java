package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class NativeFinder extends b {
    public static final int F = 5;
    protected static final long G = 1000;
    protected static final long H = 500;
    private static final String I = "NativeFinder";
    private static final long J = 10;
    private static final Map<String, WeakReference<MaxNativeAdView>> N = new HashMap();
    private static final Map<String, WeakReference<MaxNativeAdView>> O = new HashMap();
    private static final Map<String, String> P = new HashMap();
    private final LinkedHashSetWithItemLimit<String> K;
    private final Map<d, s> L;
    private final Map<String, o> M;

    public NativeFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.NATIVE, Collections.singletonList("NATIVE"), I, maxAttemptsToCaptureImage);
        this.K = new LinkedHashSetWithItemLimit<>(10L);
        this.L = new HashMap();
        this.M = new HashMap();
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new s(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && SafeDK.getInstance() != null && SafeDK.getInstance().q()) {
            try {
                Bundle messageData = message.getMessageData();
                if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f43758b.contains(messageData.getString("ad_format"))) {
                    Logger.d(I, "Revenue event detected : " + messageData);
                    string = "revenue_event";
                } else {
                    string = messageData.getString("type");
                }
                String string2 = messageData.getString("ad_format");
                String string3 = messageData.getString(BrandSafetyEvent.f44592k);
                String string4 = messageData.getString(BrandSafetyEvent.f44593l);
                String strL = BrandSafetyUtils.l(messageData.getString("ad_view"));
                String string5 = messageData.getString("id", null);
                if (string5 == null) {
                    Logger.d(I, "No eventId in data bundle, cannot match");
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
                    Logger.d(I, "Max message received, package: " + strB + ", ts (seconds): " + jB + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    d dVar = new d(string4, string3, string5, strB, string6, BrandSafetyUtils.AdType.NATIVE);
                    if ("WILL_DISPLAY".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "WILL_DISPLAY event for package=" + strB + ", key=" + dVar + ", view address=" + strL + ", slot count=" + this.f43760d);
                            CreativeInfoManager.a(strB, string3, string7, string5, string2);
                            a(string5, ImpressionLog.f43630f, new ImpressionLog.a(ImpressionLog.G, BrandSafetyUtils.l(messageData.getString("ad_view"))));
                        }
                        a(string6, strB, string7, dVar, strL, messageData, jCurrentTimeMillis);
                        return;
                    }
                    if ("revenue_event".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "REVENUE_EVENT event for package=" + strB + ", key=" + dVar + ", view address=" + strL + ", slot count=" + this.f43760d);
                            a(string5, ImpressionLog.f43635k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                        }
                        a(string6, strB, string7, dVar, strL, messageData);
                        return;
                    }
                    if ("DID_CLICKED".equals(string)) {
                        if (g(string6, strB)) {
                            a(string5, ImpressionLog.f43632h, new ImpressionLog.a[0]);
                            if (this.L.get(dVar) != null) {
                                StringBuilder sbAppend = new StringBuilder().append("DID_CLICKED event for package=");
                                if (strB != null) {
                                    string6 = strB;
                                }
                                Logger.d(I, sbAppend.append(string6).append(", slot count=").append(this.f43760d).toString());
                                c(dVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if ("WILL_LOAD".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "WILL_LOAD event for package=" + strB + ", key=" + dVar + ", slot count=" + this.f43760d);
                            a(string5, ImpressionLog.f43628d, new ImpressionLog.a(ImpressionLog.I, string6));
                            com.safedk.android.analytics.brandsafety.creatives.e.b(strB, string3);
                            return;
                        }
                        return;
                    }
                    if ("DID_HIDE".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "DID_HIDE event for package=" + strB + ", key=" + dVar + ", slot count=" + this.f43760d);
                            a(string5, ImpressionLog.f43633i, new ImpressionLog.a[0]);
                            a(dVar);
                            return;
                        }
                        return;
                    }
                    if ("DID_LOAD".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "DID_LOAD event for package=" + strB + ", key=" + dVar + ", slot count=" + this.f43760d);
                            a(string5, ImpressionLog.f43629e, new ImpressionLog.a(ImpressionLog.I, string6));
                            return;
                        }
                        return;
                    }
                    if ("DID_DISPLAY".equals(string)) {
                        if (strB != null && g(string6, strB)) {
                            Logger.d(I, "DID_DISPLAY event for package=" + strB + ", key=" + dVar + ", slot count=" + this.f43760d);
                            a(string5, ImpressionLog.f43631g, new ImpressionLog.a[0]);
                            a(strB, dVar, string7, messageData, jCurrentTimeMillis);
                            return;
                        }
                        return;
                    }
                    if ("DID_FAIL_DISPLAY".equals(string) && strB != null && g(string6, strB)) {
                        Logger.d(I, "DID_FAIL_DISPLAY event for package=" + strB + ", key=" + dVar + ", slot count=" + this.f43760d);
                        a(string5, ImpressionLog.f43634j, new ImpressionLog.a[0]);
                        b(dVar);
                    }
                }
            } catch (Throwable th2) {
                Logger.e(I, "on message received exception", th2);
            }
        }
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle, long j10) {
        s sVar;
        if (this.K.contains(dVar.f44390c)) {
            Logger.d(I, "handle WILL_DISPLAY - impression with id " + dVar.f44390c + " has already been reported, ignoring.");
            return;
        }
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        Logger.d(I, "handle WILL_DISPLAY - image count for " + this.f43759c.name() + " is " + BrandSafetyUtils.b(this.f43759c) + ", impressions to report(" + this.B.keySet().size() + ") = " + this.B.keySet());
        if (g(str, str2)) {
            synchronized (this.L) {
                s sVar2 = this.L.get(dVar);
                if (sVar2 == null) {
                    s sVarA = a(foregroundActivity, str2, dVar.f44390c, bundle);
                    this.L.put(dVar, sVarA);
                    Logger.d(I, "New activity native created for " + str2 + ", native key is " + dVar + ", current activity native size is " + this.L.size());
                    sVar = sVarA;
                } else {
                    if (sVar2.A == null) {
                        sVar2.A = bundle;
                    }
                    if (sVar2.B == null || sVar2.C == null) {
                        sVar2.a(a(foregroundActivity));
                    }
                    sVar = sVar2;
                }
            }
            sVar.K = TextUtils.isEmpty(str4) ? null : str4;
            sVar.V = true;
            sVar.f44557ab = true;
            sVar.f44558ac = j10;
            a(sVar, false, "handleWillDisplay");
            sVar.Z = this.D.scheduleAtFixedRate(new a(sVar, dVar, this.f43761e), 500L, 1000L, TimeUnit.MILLISECONDS);
            a(sVar, dVar);
            a(sVar, dVar, (WeakReference<MaxNativeAdView>) a(dVar, str4, false).first);
            return;
        }
        this.f43760d++;
    }

    private o a(s sVar, d dVar, WeakReference<MaxNativeAdView> weakReference) {
        o oVarRemove = null;
        if (weakReference != null && weakReference.get() != null) {
            sVar.f44562ag = true;
            synchronized (this.M) {
                oVarRemove = this.M.remove(sVar.K);
                if (oVarRemove != null) {
                    Logger.d(I, "try setting pending info - found pending CI by view address: " + sVar.K + " matching info: " + oVarRemove);
                    a(dVar.f44388a, dVar.f44392e, oVarRemove);
                }
            }
        }
        return oVarRemove;
    }

    private Pair<WeakReference<MaxNativeAdView>, String> a(d dVar, String str, boolean z10) {
        WeakReference<MaxNativeAdView> weakReference;
        synchronized (NativeFinder.class) {
            weakReference = N.get(dVar.f44390c);
            if (TextUtils.isEmpty(str) && weakReference != null && weakReference.get() != null) {
                str = BrandSafetyUtils.a(weakReference.get());
            }
            if (!TextUtils.isEmpty(str) && (weakReference == null || weakReference.get() == null)) {
                WeakReference<MaxNativeAdView> weakReferenceRemove = z10 ? O.remove(str) : O.get(str);
                if (weakReferenceRemove == null || weakReferenceRemove.get() == null) {
                    weakReference = weakReferenceRemove;
                } else {
                    Logger.d(I, "get ad view ref - native ad view found: " + weakReferenceRemove.get() + " for event ID: " + dVar.f44390c);
                    a(dVar.f44390c, dVar.f44391d, weakReferenceRemove.get());
                    weakReference = weakReferenceRemove;
                }
            } else if (z10) {
                O.remove(str);
            }
        }
        return new Pair<>(weakReference, str);
    }

    private void a(String str, String str2, String str3, d dVar, String str4, Bundle bundle) {
        s sVar;
        AdNetworkDiscovery adNetworkDiscoveryH;
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        if (this.K.contains(dVar.f44390c)) {
            Logger.d(I, "handle REVENUE_EVENT - impression with id " + dVar.f44390c + " has already been reported, ignoring.");
            return;
        }
        Pair<WeakReference<MaxNativeAdView>, String> pairA = a(dVar, str4, true);
        WeakReference<MaxNativeAdView> weakReference = (WeakReference) pairA.first;
        String str5 = (String) pairA.second;
        a(str5, dVar);
        if (g(str, str2)) {
            synchronized (this.L) {
                s sVar2 = this.L.get(dVar);
                if (sVar2 == null) {
                    s sVarA = a(foregroundActivity, str2, dVar.f44390c, bundle);
                    this.L.put(dVar, sVarA);
                    Logger.d(I, "New activity native created for " + str2 + ", native key is " + dVar + ", current activity natives size is " + this.L.size());
                    sVar = sVarA;
                } else {
                    if (sVar2.A == null) {
                        sVar2.A = bundle;
                    }
                    if (sVar2.B == null || sVar2.C == null) {
                        sVar2.a(a(foregroundActivity));
                    }
                    sVar = sVar2;
                }
            }
            if (bundle.getString("revenue_event") != null) {
                sVar.P = bundle.getString("revenue_event");
            } else {
                sVar.P = "unknown";
            }
            if (sVar.K == null) {
                sVar.K = TextUtils.isEmpty(str5) ? null : str5;
                synchronized (NativeFinder.class) {
                    P.put(str5, str2);
                }
            }
            sVar.M = str3;
            o oVarA = a(sVar, dVar, weakReference);
            if (oVarA == null && (adNetworkDiscoveryH = CreativeInfoManager.h(dVar.f44391d)) != null) {
                CreativeInfo creativeInfoA = adNetworkDiscoveryH.a((Object) dVar.f44390c);
                Logger.d(I, "set CI details - matched ci: " + creativeInfoA);
                if (creativeInfoA != null) {
                    oVarA = new o(creativeInfoA, CreativeInfo.f44331m, dVar.f44390c);
                    Logger.d(I, "set CI details - try to match by event ID: " + dVar.f44390c + " matching info: " + oVarA);
                    a(dVar.f44388a, dVar.f44392e, oVarA);
                }
            }
            if (oVarA == null) {
                a(sVar, false, "handleRevenueEvent");
            }
            Logger.d(I, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId " + dVar.f44390c);
            sVar.V = true;
            return;
        }
        this.f43760d++;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j10) {
        s sVarA;
        if (this.K.contains(dVar.f44390c)) {
            Logger.d(I, "handle DID_DISPLAY - impression with id " + dVar.f44390c + " has already been reported, ignoring. ");
            return;
        }
        Logger.d(I, "handle DID_DISPLAY package=" + str + " key=" + dVar);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        synchronized (this.L) {
            sVarA = this.L.get(dVar);
            if (sVarA != null) {
                Logger.d(I, "Native info already exists, package=" + str + " activity native=" + sVarA);
                sVarA.f43787z = this.f43760d;
                if (sVarA.B == null || sVarA.C == null) {
                    sVarA.a(a(foregroundActivity));
                }
            } else {
                sVarA = a(foregroundActivity, str, dVar.f44390c, bundle);
                this.L.put(dVar, sVarA);
                Logger.d(I, "New activity native created for " + str + ", key=" + dVar + ", current activity ads size=" + this.L.size());
            }
        }
        sVarA.M = str2;
        sVarA.f44559ad = j10;
        a(sVarA, false, "handleDidDisplay");
    }

    private void a(d dVar) {
        synchronized (this.L) {
            s sVarRemove = this.L.remove(dVar);
            if (sVarRemove != null) {
                Logger.d(I, "handle DID_HIDE, placementId=" + dVar.f44389b);
                sVarRemove.X = true;
            }
        }
    }

    private void b(d dVar) {
        synchronized (this.L) {
            s sVar = this.L.get(dVar);
            if (sVar != null) {
                sVar.N = true;
            }
        }
    }

    private void c(d dVar) {
        s sVar;
        Logger.d(I, "handle DID_CLICKED started");
        synchronized (this.L) {
            sVar = this.L.get(dVar);
        }
        if (sVar != null) {
            sVar.a(true);
            a(sVar, false, "handleDidClicked");
        }
    }

    private s a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.f43760d++;
        Logger.d(I, "slot number incremented to " + this.f43760d + ", eventId is " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        s sVar = new s(a(activity), str, this.f43760d, lowerCase, bundle, str2);
        sVar.f44556aa = new WeakReference<>(activity);
        return sVar;
    }

    protected boolean g(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(I, "sdk " + str2 + ": config item SUPPORTS_NATIVE_IMPRESSION_TRACKING is " + zA + ", config item AD_NETWORK_TO_IGNORE is " + strA + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(I, "Native ads tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    public void a(final String str, final String str2, final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.b(str, str2, maxNativeAdView);
                }
            });
        } else {
            b(str, str2, maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, MaxNativeAdView maxNativeAdView) {
        if (str != null && str2 != null && maxNativeAdView != null) {
            String strA = BrandSafetyUtils.a(maxNativeAdView);
            synchronized (NativeFinder.class) {
                if (!N.containsKey(str)) {
                    a(str, ImpressionLog.f43636l, new ImpressionLog.a(ImpressionLog.G, strA));
                }
                N.put(str, new WeakReference<>(maxNativeAdView));
                P.put(strA, str2);
            }
            Logger.d(I, "add native ad view: " + maxNativeAdView + ", eventId: " + str + ", adViewAddress: " + strA + ", sdk: " + str2 + ", list size: " + N.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        }
    }

    public void a(final MaxNativeAdView maxNativeAdView) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.2
                @Override // java.lang.Runnable
                public void run() {
                    NativeFinder.this.c(maxNativeAdView);
                }
            });
        } else {
            c(maxNativeAdView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MaxNativeAdView maxNativeAdView) {
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            O.put(strA, new WeakReference<>(maxNativeAdView));
        }
        Logger.d(I, "add native ad view: " + maxNativeAdView + ", list size: " + O.size());
    }

    private void a(String str, d dVar) {
        boolean z10;
        Logger.d(I, "report completed event started, view address: " + str + ", key: " + dVar);
        synchronized (this.L) {
            Iterator<Map.Entry<d, s>> it = this.L.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, s> next = it.next();
                d key = next.getKey();
                if (key.f44388a.equals(dVar.f44388a) && !key.f44390c.equals(dVar.f44390c)) {
                    s value = next.getValue();
                    if (value.K != null && value.K.equals(str)) {
                        Logger.d(I, "report completed event, same view address: " + value.K + ", event id: " + key.f44390c);
                        z10 = true;
                    } else {
                        synchronized (NativeFinder.class) {
                            WeakReference<MaxNativeAdView> weakReference = N.get(key.f44390c);
                            if (weakReference == null || weakReference.get() == null || weakReference.get().getParent() == null) {
                                Logger.d(I, "report completed event, closed view address: " + value.K + ", event id: " + key.f44390c);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                    if (z10) {
                        value.a(ImpressionLog.C, new ImpressionLog.a[0]);
                        value.U = true;
                        a(value, true, "reportCompletedEvents");
                        a(value);
                        it.remove();
                    } else {
                        Logger.d(I, "report completed event skipped, view address: " + value.K + ", event id: " + key.f44390c);
                    }
                }
            }
        }
    }

    private void a(final s sVar, final d dVar) {
        sVar.Y = this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NativeFinder.this.L) {
                    NativeFinder.this.a(sVar, true, "handleWillDisplay:reportTimeout");
                    NativeFinder.this.L.remove(dVar);
                    NativeFinder.this.a(sVar);
                }
            }
        }, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar) {
        try {
            Logger.d(I, "clean started, currentActivityAds size is " + this.L.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (sVar != null) {
                Logger.d(I, "clean, adding to reported impressions map. id =  " + sVar.L);
                this.K.add(sVar.L);
                sVar.X = true;
                if (sVar.Y != null) {
                    sVar.Y.cancel(false);
                }
                if (sVar.Z != null) {
                    sVar.Z.cancel(false);
                }
                for (l lVar : sVar.g()) {
                    if (lVar.f44514b != null && lVar.f44514b.f44460b != null) {
                        lVar.f44515c = lVar.f44514b.f44460b;
                        Logger.d(I, "clean, set last impression screenshot filename to " + lVar.f44514b.f44460b);
                    }
                }
                synchronized (NativeFinder.class) {
                    N.remove(sVar.L);
                }
                b(sVar);
            }
        } catch (Throwable th2) {
            Logger.e(I, "Error in clean " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(s sVar, boolean z10, String str) {
        boolean z11 = !sVar.E;
        boolean z12 = !sVar.F && sVar.d();
        long j10 = 0;
        if (sVar.f44558ac > 0 && sVar.f44559ad > 0) {
            j10 = sVar.f44558ac - sVar.f44559ad;
        }
        ArrayList arrayList = new ArrayList();
        if (sVar.j().isEmpty()) {
            Logger.d(I, "reporting event started, root=" + str + ", isMature=" + z10 + ", adInfo=" + sVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            arrayList.add(a(sVar, sVar.h(), z10, z12, j10, (String) null));
        } else {
            for (l lVar : sVar.g()) {
                if (lVar.c() != null && lVar.c().V() == null) {
                    Logger.d(I, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    lVar.a((CreativeInfo) null);
                }
                String str2 = null;
                if (z10 && lVar.f44514b != null && lVar.f44514b.f44459a != null) {
                    str2 = lVar.f44514b.f44459a + "_" + lVar.f44513a;
                    Logger.d(I, "reporting event - imageFileIsValid filename = " + BrandSafetyUtils.a(sVar.f43777p, lVar.f44514b.f44459a, sVar.c(), lVar.f44513a, lVar.f44514b.f44464f));
                }
                Logger.d(I, "reporting event started, root=" + str + ", isMature=" + z10 + ", info=" + sVar + ", uniformity=" + (lVar.f44514b != null ? lVar.f44514b.a(500) : 0.0f));
                arrayList.add(a(sVar, lVar, z10, z12, j10, str2));
                if (z10 && lVar.c() != null && lVar.f44514b != null) {
                    if (this.B.size() <= SafeDK.getInstance().J()) {
                        Logger.d(I, "reporting event waiting to report file " + lVar.f44514b.f44460b);
                        a(sVar, lVar);
                    } else {
                        Logger.d(I, "reporting event no open slot for " + this.f43759c + ", " + lVar.f44514b.f44459a);
                        BrandSafetyUtils.d(lVar.f44514b.f44460b);
                    }
                }
            }
        }
        if (!z10 && sVar.U) {
            Logger.w(I, "reporting event - ad finished, should discard brand safety event: " + arrayList);
        } else if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(I, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z11) {
            sVar.b(true);
        }
        if (z12) {
            sVar.c(true);
        }
    }

    private static BrandSafetyEvent a(s sVar, l lVar, boolean z10, boolean z11, long j10, String str) {
        return new BrandSafetyEvent(sVar.c(), sVar.q(), str, z11, sVar.d() ? sVar.e() : null, lVar.c(), sVar.a(), sVar.p(), lVar.f44513a != null ? lVar.f44513a : "", sVar.D, z10, sVar.r(), lVar.f44514b != null ? lVar.f44514b.f44464f : null, lVar.f44514b != null ? lVar.f44514b.f44461c : 0L, lVar.f44514b != null ? lVar.f44514b.a(500) : 0.0f, lVar.f44514b != null ? lVar.f44514b.f44463e : 0, sVar.f44557ab, sVar.f44562ag, j10, sVar.f44560ae, sVar.f44561af, SafeDK.getInstance().e(), sVar.w(), sVar.M, sVar.N, sVar.P, sVar.Q, b(sVar, lVar).toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        Iterator<s> it = this.L.values().iterator();
        while (it.hasNext()) {
            it.next().X = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        try {
            com.safedk.android.utils.k.b(I, "set CI details started. matchingInfo = " + oVar.toString());
            CreativeInfo creativeInfo = oVar.f44545a;
            if (creativeInfo != null) {
                Logger.d(I, "set CI details - CI exists in matchingInfo, sdk = " + creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                Logger.d(I, "set CI details - starting to iterate over current activity ads");
                synchronized (this.L) {
                    for (d dVar : this.L.keySet()) {
                        if (a(creativeInfo, this.L.get(dVar))) {
                            Logger.d(I, "set CI details - matched by webView/eventID, CI: " + creativeInfo);
                            if (a(dVar.f44388a, dVar.f44392e, oVar)) {
                            }
                        }
                    }
                    Logger.d(I, "set CI details - adding as pending, view address: " + creativeInfo.af() + " matching info: " + oVar);
                    synchronized (this.M) {
                        this.M.put(creativeInfo.af(), oVar);
                    }
                }
                return 1;
            }
        } catch (Throwable th2) {
            Logger.e(I, "set CI details exception: " + th2.getMessage(), th2);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, s sVar) {
        if (sVar == null || creativeInfo == null) {
            Logger.d(I, "verify matching - object is null, nativeInfo: " + sVar + ", creativeInfo: " + creativeInfo);
            return false;
        }
        String strQ = creativeInfo.Q();
        if (sVar.f43783v == null || !sVar.f43783v.equals(strQ)) {
            Logger.d(I, "verify matching - sdks does not match, ci sdk is: " + strQ + " and native sdk is: " + sVar.f43783v);
            return false;
        }
        Logger.d(I, "verify matching - ci sdk is: " + strQ + ", native info: " + sVar);
        if (sVar.L != null && creativeInfo.m() != null && !sVar.L.equals(creativeInfo.m())) {
            Logger.d(I, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + sVar.L);
            return false;
        }
        String strAf = creativeInfo.af();
        if (sVar.K != null && sVar.K.equals(strAf)) {
            Logger.d(I, "verify matching object done, event ID: " + sVar.L + ", object address: " + strAf + ", view address: " + sVar.K);
            return true;
        }
        Logger.d(I, "verify matching object failed, event ID: " + sVar.L + ", object address: " + strAf + ", view address: " + sVar.K);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, String str2, o oVar) {
        s sVar;
        com.safedk.android.utils.k.b(I, "set CI started, adUnitId=" + str + " matchingInfo=" + (oVar == null ? "null" : oVar.toString()));
        if (oVar == null) {
            Logger.d(I, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f44545a;
        if (creativeInfo != null) {
            d dVar = new d(str, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), str2, BrandSafetyUtils.AdType.NATIVE);
            Logger.d(I, "set CI - activity key: " + dVar);
            synchronized (this.L) {
                sVar = this.L.get(dVar);
            }
            com.safedk.android.utils.k.b(I, "set CI - current activity ad: " + (sVar == null ? "null" : sVar) + ", current activity ad keys: " + this.L.keySet());
            if (sVar != null) {
                if (!sVar.W && StatsReporter.b().a(creativeInfo, sVar)) {
                    sVar.W = true;
                }
                CreativeInfo creativeInfoI = sVar.i();
                if (creativeInfoI != null) {
                    Logger.d(I, "set CI - previous CI id: " + creativeInfoI.L());
                    if (creativeInfoI.L().equals(creativeInfo.L())) {
                        CreativeInfoManager.b(creativeInfoI);
                        com.safedk.android.utils.k.b(I, "set CI - already matched, same ad ID. current match: " + creativeInfo.X() + ", previous match: " + creativeInfoI.X());
                    }
                }
                creativeInfo.a(oVar.f44546b, oVar.f44547c);
                sVar.a(creativeInfo);
                Logger.d(I, "set CI - CI is set for activity native " + dVar + ". CI : " + creativeInfo);
                b(sVar, creativeInfo);
                a(sVar, false, "setCreativeInfo");
                return true;
            }
            com.safedk.android.utils.k.b(I, "set CI - no activity ad, cannot set CI. current activity ads: " + this.L);
        } else {
            Logger.d(I, "set CI - no CI");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c a(String str, RedirectDetails redirectDetails, m mVar, boolean z10, boolean z11) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str, String str2, boolean z10) {
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10) {
        boolean zC = BrandSafetyUtils.c(i10);
        Logger.d(I, "should stop sampling, max uniformed pixels count=" + i10 + ", return value=" + zC);
        return zC;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.L != null) {
            for (s sVar : this.L.values()) {
                if (sVar.V) {
                    sVar.a(ImpressionLog.f43650z, new ImpressionLog.a[0]);
                    a(sVar, false, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        if (this.L != null) {
            for (s sVar : this.L.values()) {
                if (sVar.V) {
                    sVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    a(sVar, false, "onForeground");
                }
            }
        }
    }

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f43702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f43703b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43705d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43704c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f43706e = false;

        public a(s sVar, d dVar, int i10) {
            this.f43703b = dVar;
            this.f43702a = sVar;
            this.f43705d = i10;
        }

        private void a(View view) {
            if (view != null) {
                Logger.d(NativeFinder.I, "handle native ad reflection - root= " + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(this.f43703b.f44391d);
                if (adNetworkDiscoveryH != null) {
                    View viewH = adNetworkDiscoveryH.h(view);
                    Logger.d(NativeFinder.I, "handle native ad reflection - native view= " + viewH);
                    if (viewH != null) {
                        List<CreativeInfo> listA = adNetworkDiscoveryH.a(new WeakReference<>(viewH), this.f43702a.M, true);
                        Logger.d(NativeFinder.I, "handle native ad reflection - CIs generated: " + listA);
                        if (listA != null) {
                            for (CreativeInfo creativeInfo : listA) {
                                creativeInfo.a((Object) view);
                                creativeInfo.a(NativeFinder.this.f43759c);
                                creativeInfo.f(this.f43703b.f44390c);
                                creativeInfo.h(this.f43703b.f44389b);
                                Logger.d(NativeFinder.I, "handle native ad reflection - setting ci: " + creativeInfo);
                                NativeFinder.this.a(this.f43703b.f44388a, this.f43703b.f44392e, new o(creativeInfo, CreativeInfo.f44331m, this.f43703b.f44390c));
                            }
                        }
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference weakReference;
            this.f43704c++;
            if (this.f43702a != null) {
                synchronized (NativeFinder.class) {
                    weakReference = (WeakReference) NativeFinder.N.get(this.f43703b.f44390c);
                }
                if (weakReference != null && weakReference.get() != null) {
                    MaxNativeAdView maxNativeAdView = (MaxNativeAdView) weakReference.get();
                    if (CreativeInfoManager.a(this.f43703b.f44391d, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false) && !this.f43706e) {
                        a(maxNativeAdView);
                        this.f43706e = true;
                    }
                    if (maxNativeAdView.getWidth() > 0 && maxNativeAdView.getHeight() > 0) {
                        this.f43702a.f44560ae = maxNativeAdView.getWidth() / maxNativeAdView.getHeight();
                        Logger.d(NativeFinder.I, "native impression task - view size: " + maxNativeAdView.getWidth() + VastAttributes.HORIZONTAL_POSITION + maxNativeAdView.getHeight() + ", proportion: " + this.f43702a.f44560ae);
                    }
                    if (this.f43704c >= this.f43705d || this.f43702a.X) {
                        Logger.d(NativeFinder.I, "Going to report native ad, eventId=" + this.f43702a.L + ", stop timer? " + this.f43702a.X + ", image counter=" + this.f43704c + ", max attempts=" + this.f43705d + ", isImpressionReported=" + this.f43702a.E + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        if (!this.f43702a.E) {
                            NativeFinder.this.a(this.f43702a, false, "NativeImpressionTask");
                        }
                        this.f43702a.Z.cancel(false);
                        return;
                    }
                    if (this.f43702a.f44556aa != null && this.f43702a.f44556aa.get() != null) {
                        a(this.f43702a, (View) weakReference.get());
                    }
                }
            }
        }

        private void a(final s sVar, final View view) {
            if (sVar != null && view != null) {
                try {
                    Logger.d(NativeFinder.I, "Taking screenshot, view=" + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    sVar.c();
                    sVar.f44556aa.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final Bitmap bitmapA = ScreenshotHelper.a(view, SafeDK.getInstance().X());
                            NativeFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.NativeFinder.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    a.this.a(sVar, bitmapA, a.this.f43704c);
                                }
                            });
                        }
                    });
                } catch (Throwable th2) {
                    Logger.e(NativeFinder.I, "Error while taking screenshot", th2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(s sVar, Bitmap bitmap, int i10) {
            if (bitmap != null) {
                String strC = sVar.c();
                BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(strC, bitmap);
                int iA = aVarB.a();
                BrandSafetyUtils.ScreenshotValidity screenshotValidityC = BrandSafetyUtils.c(strC, aVarB);
                if (screenshotValidityC == BrandSafetyUtils.ScreenshotValidity.VALID) {
                    String strA = BrandSafetyUtils.a(bitmap);
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientationB = BrandSafetyUtils.b(bitmap);
                    l lVarH = sVar.h();
                    String strA2 = BrandSafetyUtils.a(bitmap, NativeFinder.this.f43759c, strA, strC, lVarH.f44513a, screenShotOrientationB);
                    Logger.d(NativeFinder.I, "process screenshot - screenshot file created, filename = " + strA2 + ", hash = " + strA);
                    long jC = BrandSafetyUtils.c(strA2);
                    Logger.d(NativeFinder.I, "process screenshot - hash " + strA + ", stored file size is " + jC + " bytes, counter is " + i10 + ", uniform pixel count is " + iA + " (" + ((iA / 500.0f) * 100.0f) + "%)");
                    int size = NativeFinder.this.B.size();
                    if (!NativeFinder.this.e(strA, lVarH.f44513a)) {
                        if (size <= SafeDK.getInstance().J()) {
                            if (lVarH.f44514b != null && lVarH.f44514b.f44459a != null && !lVarH.f44514b.f44459a.equals(strA)) {
                                Logger.d(NativeFinder.I, "process screenshot - removing ad file " + lVarH.f44514b.f44460b);
                                BrandSafetyUtils.d(lVarH.f44514b.f44460b);
                            }
                            lVarH.b(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                            Logger.d(NativeFinder.I, "process screenshot - setting data hash = " + strA + ", file name = " + strA2 + ", file size = " + jC);
                            lVarH.f44514b = new j(strA, strA2, jC, iA, i10, screenShotOrientationB, false);
                            NativeFinder.this.a(sVar, false, "processScreenshot");
                        } else if (!NativeFinder.this.d(strA, lVarH.f44513a)) {
                            Logger.d(NativeFinder.I, "process screenshot - No open slot for " + strA + "_" + lVarH.f44513a);
                            BrandSafetyUtils.d(strA2);
                        } else {
                            Logger.d(NativeFinder.I, "process screenshot - Image " + strA + "_" + lVarH.f44513a + " is already scheduled for upload");
                        }
                    } else {
                        Logger.d(NativeFinder.I, "process screenshot - not saving file for " + strA + "_" + lVarH.f44513a);
                        BrandSafetyUtils.d(strA2);
                    }
                    if (NativeFinder.this.a(iA)) {
                        if (!TextUtils.isEmpty(strA)) {
                            sVar.d(true);
                            sVar.X = true;
                        }
                        lVarH.a(ImpressionLog.f43644t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                        NativeFinder.this.a(sVar, false, "processScreenshot");
                        return;
                    }
                    return;
                }
                Logger.d(NativeFinder.I, "process screenshot - screenshot is not valid: " + screenshotValidityC.name() + ", pixel count: " + iA + ", counter = " + i10 + ", try again...");
            }
        }
    }

    public static String b(MaxNativeAdView maxNativeAdView) {
        String str;
        String strA = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (NativeFinder.class) {
            str = P.get(strA);
        }
        return str;
    }
}
