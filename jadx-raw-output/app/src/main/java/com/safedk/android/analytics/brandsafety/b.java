package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.mediation.ads.MaxAdView;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements a {
    protected static final List<String> A = Arrays.asList("com.unity3d.ads");
    protected static final Map<String, ImpressionLog> E = new LimitedConcurrentHashMap(30);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43736f = "ad_format";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f43737g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f43738h = "WILL_DISPLAY";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f43739i = "WILL_LOAD";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f43740j = "DID_HIDE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f43741k = "DID_CLICKED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f43742l = "DID_LOAD";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f43743m = "DID_DISPLAY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f43744n = "DID_FAIL_DISPLAY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f43745o = "id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final String f43746p = "network_name";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final String f43747q = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final String f43748r = "creative_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final String f43749s = "max_ad_unit_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final String f43750t = "ad_view";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final String f43751u = "dsp_name";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f43752v = 120;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f43753w = "revenue_event";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f43754x = "unknown";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f43755y = "no_CI_report";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final String f43756z = "_BIDDING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f43757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<String> f43758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BrandSafetyUtils.AdType f43759c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43761e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f43760d = 0;
    protected final Map<String, c> B = new ConcurrentHashMap();
    protected final Set<String> C = new HashSet();
    protected final ScheduledExecutorService D = Executors.newScheduledThreadPool(1);

    protected abstract c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5);

    protected b(BrandSafetyUtils.AdType adType, List<String> list, String str, int i10) {
        this.f43761e = 0;
        this.f43757a = str;
        this.f43759c = adType;
        this.f43758b = list;
        this.f43761e = i10;
        Logger.d(this.f43757a, "ctor started, type: " + this.f43759c + ", supported formats: " + this.f43758b + ", maxAttemptsToCaptureImage = " + i10 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        d();
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        AppLovinBridge.registerToReceiveMaxEvents(this);
        AppLovinBridge.registerToReceiveMaxRevenueEvents(this);
        if (Build.VERSION.SDK_INT >= 21) {
            ((ScheduledThreadPoolExecutor) this.D).setRemoveOnCancelPolicy(true);
            Logger.d(this.f43757a, "ctor thread pool removal policy set");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        return new ArrayList();
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public BrandSafetyUtils.AdType a() {
        return this.f43759c;
    }

    public int b() {
        return this.B.size();
    }

    private void d() {
        List<BrandSafetyUtils.d> listC = BrandSafetyUtils.c(this.f43759c);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            BrandSafetyUtils.d dVar = listC.get(i10);
            String str = dVar.a() + "_" + dVar.c();
            synchronized (this.B) {
                this.B.put(str, a(dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e(), dVar.f()));
            }
        }
        Logger.d(this.f43757a, "restore impressions for upload - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
        if (this.B.size() > 0 && StatsCollector.b()) {
            c();
        }
    }

    protected boolean a(String str, View view) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        if (str == null || (adNetworkDiscoveryH = CreativeInfoManager.h(str)) == null) {
            return false;
        }
        return adNetworkDiscoveryH.f(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void a(k.a aVar, String str, String str2) {
        Logger.d(this.f43757a, "handle upload request started, imageToUpload=" + str + ", adInfoCollectionForUpload=" + this.B);
        if (this.B.get(str) != null) {
            Bundle bundleA = a(str, aVar, str2);
            g.a(bundleA);
            Logger.d(this.f43757a, "handle upload request - attempting to remove the file " + (bundleA != null ? bundleA.getString("image_url") : ""));
            e(str);
        } else {
            Logger.d(this.f43757a, "handle upload request - adInfoCollectionForUpload doesn't contain imageToUpload " + str);
        }
        Logger.d(this.f43757a, "handle upload request - adInfoCollectionForUpload remove key " + str);
        synchronized (this.B) {
            this.B.remove(str);
            Logger.d(this.f43757a, "handle upload request - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void d(String str) {
        Logger.d(this.f43757a, "handle discard request started, imageToDiscard=" + str + ", adInfoCollectionForUpload=" + this.B + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        e(str);
        c cVar = this.B.get(str);
        if (cVar != null) {
            for (l lVar : cVar.g()) {
                if (str.contains(lVar.f44513a)) {
                    b(lVar);
                }
            }
        }
        Logger.d(this.f43757a, "handle discard request - adInfoCollectionForUpload remove key " + str);
        synchronized (this.B) {
            this.B.remove(str);
            Logger.d(this.f43757a, "handle discard request - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
        }
    }

    public synchronized void e(String str) {
        Logger.d(this.f43757a, "Cleaning stored impressions: " + str);
        BrandSafetyUtils.a(this.f43759c, str);
        f(str);
    }

    protected void f(String str) {
        Logger.d(this.f43757a, "removal all impression images started, reportedImage = " + str + ", adInfoCollectionForUpload keys = " + this.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            Logger.d(this.f43757a, "removal all impression images impressionId = " + str2);
            synchronized (this.B) {
                Iterator<Map.Entry<String, c>> it = this.B.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next.getKey().endsWith(str2)) {
                        Logger.d(this.f43757a, "removal all impression images removing " + next.getKey() + Z7.f27998r);
                        it.remove();
                    }
                }
                Logger.d(this.f43757a, "removal all impression images - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
            }
        }
        File dir = SafeDK.getInstance().l().getDir("SafeDK_" + this.f43759c, 0);
        Logger.d(this.f43757a, "removal all impression images getting files for dir" + dir.getPath());
        Logger.d(this.f43757a, "removal all impression images files for dir" + dir.getPath() + " : " + com.safedk.android.utils.b.a(dir.getPath()));
    }

    protected String g(String str) {
        String[] strArrSplit;
        if (str == null || (strArrSplit = new File(str).getName().replace(".jpg", "").split("_")) == null || strArrSplit.length < 4) {
            return null;
        }
        return strArrSplit[0] + "_" + strArrSplit[2];
    }

    private Bundle a(String str, k.a aVar, String str2) {
        String strI;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation;
        String str3;
        String strName;
        Bundle bundle = null;
        synchronized (this.B) {
            Logger.d(this.f43757a, "Uploading impression " + str + " to server, timeout=" + SafeDK.getInstance().L() + "ms, adInfoCollectionForUpload = " + this.B + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        }
        c cVar = this.B.get(str);
        if (cVar != null) {
            Iterator<l> it = cVar.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strI = null;
                    screenShotOrientation = null;
                    str3 = null;
                    break;
                }
                l next = it.next();
                if (next.f44514b != null && str.equals(next.f44514b.f44459a + "_" + next.f44513a)) {
                    str3 = next.f44514b.f44460b;
                    screenShotOrientation = next.f44514b.f44464f;
                    if (next.c() == null) {
                        strI = null;
                        break;
                    }
                    strI = next.c().I();
                    break;
                }
            }
            if (str3 != null && new File(str3).exists()) {
                String strP = BrandSafetyUtils.p(str3);
                Logger.d(this.f43757a, "Uploading impression - ad type " + cVar.f43777p + ", file hash is " + strP + ", imageToUpload = " + str + ", match ? " + str.startsWith(strP) + ", fingerprint = " + str2);
                if (!str.startsWith(strP)) {
                    Logger.d(this.f43757a, "Uploading impression - fileHash " + strP + ", imageToUpload = " + str + " does not match, not uploading");
                } else {
                    com.safedk.android.a.a.C0433a c0433aA = new com.safedk.android.a.a(str3, str, SafeDK.getInstance().L(), aVar).a();
                    if (c0433aA != null) {
                        String strA = c0433aA.a();
                        String strC = c0433aA.c();
                        if (strI == null) {
                            BrandSafetyEvent.AdFormatType adFormatTypeA = BrandSafetyUtils.a(cVar.r());
                            strName = adFormatTypeA != null ? adFormatTypeA.name() : null;
                        } else {
                            strName = strI;
                        }
                        if (strName == null) {
                            strName = BrandSafetyUtils.a(this.f43759c).name();
                            Logger.d(this.f43757a, "adFormat set to " + strName);
                        }
                        Logger.d(this.f43757a, "Upload impression image succeeded: " + strA + ", return code =" + c0433aA.b());
                        if (strA != null && !strA.isEmpty()) {
                            bundle = new Bundle();
                            try {
                                bundle.putString(k.f44468c, str2);
                                bundle.putString("ad_format_type", strName);
                                bundle.putString("image_url", strA);
                                bundle.putString("image_orientation", screenShotOrientation.name().toLowerCase());
                                bundle.putString("platform", "android");
                                bundle.putString("image_id", strC);
                                bundle.putString("package", SafeDK.getInstance().l().getPackageName());
                            } catch (Throwable th2) {
                                Logger.e(this.f43757a, th2.getMessage(), th2);
                                new CrashReporter().caughtException(th2);
                            }
                        }
                    } else {
                        Logger.d(this.f43757a, "upload response is null, imageToUpload = " + str);
                        f(str);
                    }
                }
            } else {
                Logger.d(this.f43757a, "Uploading impression - filename " + str3 + "not found, not uploading");
            }
        } else {
            Logger.d(this.f43757a, "impressionInfoToUpload is null");
        }
        return bundle;
    }

    public synchronized void c() {
        Logger.d(this.f43757a, "synchronize impressions and events - impression size is: " + this.B.size() + " and keys: " + this.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f43757a, "synchronize impressions and events - BrandSafetyEvents keys " + StatsCollector.c().a(StatsCollector.EventType.BrandSafety).keySet());
        ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.BrandSafety);
        Iterator<Map.Entry<String, c>> it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c value = next.getValue();
            String key = next.getKey();
            l lVarH = value.h();
            if (lVarH != null) {
                if (lVarH.f44514b != null && lVarH.f44514b.f44460b != null) {
                    Logger.d(this.f43757a, "synchronize impressions and events - deleting file: " + lVarH.f44514b.f44460b);
                    BrandSafetyUtils.d(lVarH.f44514b.f44460b);
                }
                BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) concurrentHashMapA.get(lVarH.f44513a);
                if (brandSafetyEvent == null || key == null || !key.equals(brandSafetyEvent.a())) {
                    Logger.d(this.f43757a, "synchronize impressions and events - remove impressionId: " + lVarH.f44513a + ", impression hash: " + key + ", event hash: " + (brandSafetyEvent != null ? brandSafetyEvent.a() : "null"));
                    it.remove();
                } else if (brandSafetyEvent.a() != null) {
                    Logger.d(this.f43757a, "synchronize impressions and events - clearing image hash value: " + brandSafetyEvent.a());
                    brandSafetyEvent.d();
                }
            }
        }
        Logger.d(this.f43757a, "synchronize impressions and events - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
    }

    public static c h(String str) {
        if (str != null) {
            for (b bVar : SafeDK.getInstance().x().values()) {
                synchronized (bVar.B) {
                    Logger.d("AdFinderBase", "get impression ad info by image ID: " + str + ", type: " + bVar.a() + ", keys: " + bVar.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                }
                c cVar = bVar.B.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public synchronized void a(c cVar, l lVar) {
        if (cVar != null) {
            if (lVar.f44514b != null && lVar.f44514b.f44459a != null && lVar.f44513a != null) {
                Logger.d(this.f43757a, "add info collection for upload " + lVar.f44514b.f44459a + "_" + lVar.f44513a + ", file = " + lVar.f44514b.f44460b);
                this.B.put(lVar.f44514b.f44459a + "_" + lVar.f44513a, cVar);
                Logger.d(this.f43757a, "add info collection for upload - number of loaded impressions to report " + this.B.size() + Z7.f27998r + this.B.keySet());
            }
        }
    }

    public boolean d(String str, String str2) {
        return this.B.containsKey(str + "_" + str2);
    }

    public boolean e(String str, String str2) {
        return this.C.contains(str + "_" + str2);
    }

    protected boolean e(String str, String str2, String str3) {
        BrandSafetyUtils.a aVar;
        boolean z10 = true;
        try {
            if (new File(str).exists()) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (com.safedk.android.utils.k.a(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) || com.safedk.android.utils.k.b(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight())) {
                    BrandSafetyUtils.a aVarB = BrandSafetyUtils.b(str2, bitmapDecodeFile);
                    z10 = BrandSafetyUtils.b(str2, aVarB) == BrandSafetyUtils.ScreenshotValidity.VALID;
                    aVar = aVarB;
                } else {
                    BrandSafetyUtils.a aVarA = BrandSafetyUtils.a(str2, bitmapDecodeFile);
                    z10 = BrandSafetyUtils.a(str2, aVarA) == BrandSafetyUtils.ScreenshotValidity.VALID;
                    aVar = aVarA;
                }
                Logger.d(this.f43757a, "Image file validation check hashValue = " + str3 + ", dimen h,w: " + bitmapDecodeFile.getHeight() + StringUtils.COMMA + bitmapDecodeFile.getWidth() + ", bitmapScanResult result = " + aVar + ", isValid = " + z10 + ", filename = " + str);
            } else {
                Logger.d(this.f43757a, "Image file validation check file does not exist = " + str);
            }
        } catch (Throwable th2) {
            Logger.d(this.f43757a, "Image file validation check exception : " + th2.getMessage(), th2);
        }
        return z10;
    }

    protected String a(List<o> list) {
        if (list == null || list.size() == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(C3426d4.j.f28586d);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 < list.size() - 1) {
                sb2.append(list.get(i11).f44545a.af()).append(", ");
                i10 = i11 + 1;
            } else {
                sb2.append(list.get(list.size() - 1).f44545a.af()).append(C3426d4.j.f28588e);
                return sb2.toString();
            }
        }
    }

    protected static String[] a(Activity activity) {
        String strA;
        String str;
        if (activity != null) {
            String string = activity.toString();
            String strA2 = BrandSafetyUtils.a(string, true);
            strA = BrandSafetyUtils.a(string, false);
            str = strA2;
        } else {
            strA = null;
            str = null;
        }
        return new String[]{strA, str};
    }

    protected void a(c cVar) {
        if (cVar != null) {
            Logger.d(this.f43757a, "attach resource urls to impression - webview_resource_urls before getting WebView resource urls : " + cVar.K + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (cVar.h() != null && cVar.h().c() == null && cVar.g().size() == 1) {
                Logger.d(this.f43757a, "attach resource urls to impression - webview_resource_urls getting WebView resource urls for WebView address: " + cVar.K);
                com.safedk.android.analytics.brandsafety.creatives.e.a(cVar.h(), cVar.K, cVar instanceof n ? false : true);
            }
        }
    }

    protected void a(c cVar, boolean z10) {
        if (cVar == null) {
            Logger.d(this.f43757a, "clearImpressionScreenshotsIfNeeded adInfo is null");
            return;
        }
        if (z10 && !cVar.H && !cVar.I) {
            Logger.d(this.f43757a, "Video is marked as completed, clearing any images taken previously");
            for (l lVar : cVar.g()) {
                if (lVar.c() != null && cVar.K != null && cVar.K.equals(lVar.c().af())) {
                    a(lVar);
                }
            }
            cVar.I = true;
            return;
        }
        Logger.d(this.f43757a, "avoid clearing any images taken previously: videoCompleted=" + z10 + " onVideoCompletedEventHasBeenTriggered=" + cVar.H + " impressionScreenshotsRemoved=" + cVar.I);
    }

    public synchronized void a(l lVar) {
    }

    public static boolean a(c cVar, CreativeInfo creativeInfo) {
        String strA;
        return CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false) && (strA = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null)) != null && strA.contains(cVar.A()) && cVar.z() != null;
    }

    protected void b(c cVar, CreativeInfo creativeInfo) {
        if (a(cVar, creativeInfo)) {
            Logger.d(this.f43757a, "should Replace Prefetch CreativeId With Max CreativeId, Updating CreativeId from " + cVar.i().N() + " to " + cVar.z());
            cVar.i().i(cVar.z());
        }
    }

    static void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i11);
                    list.add(new WeakReference<>(childAt));
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, list);
                    }
                    i10 = i11 + 1;
                } else {
                    return;
                }
            }
        }
    }

    static List<WeakReference<View>> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(viewGroup));
        a(viewGroup, arrayList);
        return arrayList;
    }

    protected List<WeakReference<WebView>> b(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.k.a((Reference<?>) weakReference) && (weakReference.get() instanceof WebView)) {
                WebView webView = (WebView) weakReference.get();
                arrayList.add(new WeakReference(webView));
                Logger.d(this.f43757a, "getWebViews added WebView address " + webView);
            }
        }
        return arrayList;
    }

    static List<String> c(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.k.a((Reference<?>) weakReference)) {
                arrayList.add(BrandSafetyUtils.a(weakReference.get()));
            } else {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    public Activity a(Context context) {
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            Logger.d(this.f43757a, "getActivity: now context type is: " + baseContext.getClass().getName());
        }
        return null;
    }

    static Activity a(Bundle bundle) {
        Logger.d("AdFinderBase", "getMaxAdViewActivity: started, isOnUiThread = " + com.safedk.android.utils.k.c());
        String strL = BrandSafetyUtils.l(bundle.getString(f43750t, null));
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        try {
            for (WeakReference<Activity> weakReference : com.safedk.android.internal.b.getInstance().getAppActivities()) {
                if (weakReference != null && weakReference.get() != null) {
                    Activity activity = weakReference.get();
                    View viewFindViewById = activity.findViewById(R.id.content);
                    if ((viewFindViewById instanceof ViewGroup) && c(a((ViewGroup) viewFindViewById)).contains(strL)) {
                        Logger.d("AdFinderBase", "getMaxAdViewActivity: found activity with name " + activity.getClass().getName());
                        return activity;
                    }
                }
            }
        } catch (Exception e10) {
            Logger.d("AdFinderBase", "getMaxAdViewActivity: exception occurred " + e10.getMessage());
        }
        return foregroundActivity;
    }

    void b(Activity activity) {
        String strA = BrandSafetyUtils.a(com.safedk.android.internal.b.getInstance().getForegroundActivity().getClass().getName(), true);
        String strA2 = BrandSafetyUtils.a(activity.getClass().getName(), true);
        if (strA2 != null && !strA2.equals(strA)) {
            Logger.d(this.f43757a, "compareAdActivityToForeground found ad activity different than foreground, foreground address is: " + strA + ", and activity address is: " + strA2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void d(String str, String str2, String str3) {
    }

    public static boolean f(String str, String str2) {
        ImpressionLog impressionLog;
        if (str == null || (impressionLog = E.get(str)) == null) {
            return false;
        }
        return impressionLog.a(str2);
    }

    public static void a(String str, Long l10, Long l11, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.a(l10, l11, str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(String str, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.a(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(c cVar, String str, ImpressionLog.a... aVarArr) {
        if (cVar != null) {
            if (cVar.K != null) {
                a(cVar.K, str, aVarArr);
                return;
            } else {
                cVar.a(str, aVarArr);
                return;
            }
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void b(String str, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add cumulative impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.b(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add cumulative impression log event - event id is null, not adding impression log event");
    }

    protected static void b(c cVar) {
        if (cVar != null) {
            synchronized (E) {
                if (cVar.L != null && E.remove(cVar.L) != null) {
                    Logger.d("AdFinderBase", "clear impression log, eventId: " + cVar.L + ", impression log map size: " + E.size());
                }
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        if (E.remove(str) != null) {
                            Logger.d("AdFinderBase", "clear impression log, viewAddress: " + str + ", impression log map size: " + E.size());
                        }
                    }
                } else if (cVar.K != null && E.remove(cVar.K) != null) {
                    Logger.d("AdFinderBase", "clear impression log, viewAddress: " + cVar.K + ", impression log map size: " + E.size());
                }
            }
        }
    }

    protected static ImpressionLog b(c cVar, l lVar) {
        ImpressionLog impressionLogRemove;
        ImpressionLog impressionLogRemove2;
        if (cVar == null || lVar == null) {
            return null;
        }
        synchronized (E) {
            if (cVar.L != null && (impressionLogRemove2 = E.remove(cVar.L)) != null) {
                cVar.R.a(impressionLogRemove2);
                Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.L + ", events: " + impressionLogRemove2.a() + ", impression log map size: " + E.size());
            }
            if (!cVar.U) {
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        ImpressionLog impressionLogRemove3 = E.remove(str);
                        if (impressionLogRemove3 != null) {
                            lVar.f44520h.a(impressionLogRemove3);
                            Logger.d("AdFinderBase", "collect impression logs - key: " + str + ", events: " + impressionLogRemove3.a() + ", impression log map size: " + E.size());
                        }
                    }
                } else if (cVar.K != null && (impressionLogRemove = E.remove(cVar.K)) != null) {
                    lVar.f44520h.a(impressionLogRemove);
                    Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.K + ", events: " + impressionLogRemove.a() + ", impression log map size: " + E.size());
                }
            }
        }
        ImpressionLog impressionLog = new ImpressionLog(cVar.R);
        impressionLog.a(lVar.f44520h);
        StringBuilder sbAppend = new StringBuilder("collect impression logs, ad info: ").append(cVar.R.a()).append(", impression: ").append(lVar.f44520h.a());
        if (lVar.c() != null) {
            ImpressionLog impressionLogE = lVar.c().E();
            impressionLog.a(impressionLogE);
            sbAppend.append(", ci: ").append(impressionLogE.a());
        }
        Logger.d("AdFinderBase", sbAppend.append(", total: ").append(impressionLog.a()).toString());
        return impressionLog;
    }

    public static List<String> a(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.toString());
        }
        return arrayList;
    }

    public static List<ViewParent> b(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    public static void a(ViewGroup viewGroup, List<String> list, List<String> list2, int i10) {
        if (viewGroup != null) {
            int i11 = i10 + 1;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i13);
                    list.add(BrandSafetyUtils.a(childAt));
                    list2.add("h" + i11 + "c" + (i13 + 1) + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt);
                    a((ViewGroup) childAt, list, list2, i11);
                    i12 = i13 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static BrandSafetyUtils.AdType a(String str, WebView webView) {
        BrandSafetyUtils.AdType adTypeG;
        if (webView != null) {
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            ViewParent parent = webView;
            do {
                if (parent instanceof View) {
                    View view = (View) parent;
                    if (com.safedk.android.internal.b.getInstance().isInterstitialActivity(view.getContext())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", INTERSTITIAL activity: " + view.getContext() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    if (com.safedk.android.utils.k.a(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", BANNER ratio, isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.BANNER;
                    }
                    if (com.safedk.android.utils.k.b(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", MREC ratio, isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.MREC;
                    }
                    if (parent instanceof MaxAdView) {
                        BrandSafetyUtils.AdType adType = BannerFinder.d().get(BrandSafetyUtils.a(parent));
                        if (adType != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: " + view + ", MaxAdView type: " + adType.name() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            return adType;
                        }
                    } else if (adNetworkDiscoveryH != null && (adTypeG = adNetworkDiscoveryH.g(view)) != null) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view + ", discovery detected type: " + adTypeG);
                        return adTypeG;
                    }
                }
                Logger.d("AdFinderBase", "extract ad type from view: " + parent + ", not detected");
                parent = parent.getParent();
            } while (parent != null);
        }
        Logger.d("AdFinderBase", "extract ad type from view: failed to extract");
        return null;
    }
}
