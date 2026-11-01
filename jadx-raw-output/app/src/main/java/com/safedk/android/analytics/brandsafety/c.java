package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    protected static final String S = "network_name";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43762a = "AdInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43763b = "image_hash";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43764c = "sdk_package";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f43765d = "sdk_uid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43766e = "type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43767f = "ad_format_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43768g = "response_code";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43769h = "image_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f43770i = "image_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f43771j = "image_orientation";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f43772k = "text";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43773l = "safedk_version";
    public Bundle A;
    String B;
    String C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    public boolean I;
    AdNetworkDiscovery.WebViewResourceMatchingMethod J;
    String K;
    String L;
    String M;
    boolean N;
    boolean O;
    String P;
    String Q;
    final ImpressionLog R;
    protected boolean T;
    public boolean U;
    private final List<l> V;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected List<String> f43774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected List<String> f43775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f43776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BrandSafetyUtils.AdType f43777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f43778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f43779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f43780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f43781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f43782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f43783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f43784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f43785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f43786y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f43787z;

    public c(String[] strArr, int i10, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        if (strArr != null) {
            this.C = strArr[0];
            this.B = strArr[1];
        }
        this.A = bundle;
        this.f43787z = i10;
    }

    public c(int i10, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        this.A = bundle;
        this.f43787z = i10;
    }

    public c(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, BrandSafetyUtils.AdType adType) {
        this.f43774m = null;
        this.f43775n = null;
        this.f43776o = 0L;
        this.f43782u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f43784w = false;
        this.f43785x = null;
        this.f43786y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f43762a, "AdInfo ctor started, hashValue = " + str + ", fileName = " + str4 + ", maxSdk = " + str2 + ", adType = " + (adType != null ? adType.name() : ""));
        this.f43783v = str2;
        this.f43779r = System.currentTimeMillis();
        this.f43777p = adType;
        j jVar = new j(str, str4, screenShotOrientation);
        synchronized (this) {
            this.V.add(new l(str3, jVar));
        }
        if (str2 != null) {
            this.J = CreativeInfoManager.a(str2);
        }
    }

    public c(String str, long j10, BrandSafetyUtils.AdType adType) {
        this.f43774m = null;
        this.f43775n = null;
        this.f43776o = 0L;
        this.f43782u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f43784w = false;
        this.f43785x = null;
        this.f43786y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f43762a, "AdInfo ctor started, maxSdk = " + str + ", timestamp = " + this.f43779r + ", adType = " + (adType != null ? adType.name() : ""));
        this.f43783v = str;
        this.f43779r = j10;
        this.f43777p = adType;
    }

    public long a() {
        return this.f43779r;
    }

    public String b() {
        return this.f43781t;
    }

    public void a(String str) {
        this.f43781t = str;
    }

    public String c() {
        return this.f43783v;
    }

    public synchronized void b(String str) {
        this.f43783v = str;
    }

    public boolean d() {
        return this.f43784w;
    }

    public void a(boolean z10) {
        this.f43784w = z10;
    }

    public String e() {
        return this.f43785x;
    }

    public boolean c(String str) {
        l lVarH = h();
        if (this.f43785x != null || lVarH == null || (lVarH.c() != null && (!TextUtils.isEmpty(lVarH.c().M()) || lVarH.c().ah()))) {
            return false;
        }
        this.f43785x = str;
        return true;
    }

    public boolean f() {
        return this.D != null;
    }

    public void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            if (CreativeInfoManager.a(this.f43783v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                if (this.D != null && !creativeInfo.ah()) {
                    creativeInfo.ai();
                    String strH = creativeInfo.h();
                    if (strH != null) {
                        creativeInfo.c(strH + CreativeInfo.aJ);
                    }
                }
            } else if (creativeInfo.ah()) {
                if (this.D == null) {
                    this.D = UUID.randomUUID().toString();
                    Logger.d(f43762a, "set CI, generate multi ad UUID: " + this.D);
                } else {
                    synchronized (this) {
                        this.V.add(new l(UUID.randomUUID().toString()));
                        Logger.d(f43762a, "set CI, create new impression for multi ad, impression list: " + this.V);
                    }
                }
            }
            l lVarH = h();
            Logger.d(f43762a, "set CI, impression: " + lVarH);
            if (lVarH != null) {
                if (!creativeInfo.ah() && lVarH.c() != null && lVarH.c().L() != null && !lVarH.c().L().equals(creativeInfo.L())) {
                    Logger.d(f43762a, "set CI, failed to set CI due to unmatched IDs: old: " + creativeInfo.L() + ", new: " + lVarH.c().L());
                    return;
                } else {
                    if (lVarH.b()) {
                        creativeInfo.e();
                    }
                    lVarH.a(creativeInfo);
                }
            }
            Logger.d(f43762a, "set CI, number of CIs: " + j().size() + ", impression IDs: " + E() + ", multi ad UUID: " + this.D);
        }
    }

    public List<l> g() {
        return this.V;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0076, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0021, B:16:0x0033, B:18:0x003b, B:19:0x004c), top: B:24:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x004c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0021, B:16:0x0033, B:18:0x003b, B:19:0x004c), top: B:24:0x0001 }] */
    public synchronized l h() {
        l next;
        if (this.f43774m != null && this.D == null) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.c() == null || !this.f43774m.contains(next.c().af())) {
                }
            }
            if (!this.V.isEmpty()) {
                next = this.V.get(this.V.size() - 1);
            } else {
                Logger.d(f43762a, "Failed to get active impression, view hierarchy: " + this.f43774m + ", impression IDs: " + E());
                next = null;
            }
        } else if (!this.V.isEmpty()) {
            next = this.V.get(this.V.size() - 1);
        } else {
            Logger.d(f43762a, "Failed to get active impression, view hierarchy: " + this.f43774m + ", impression IDs: " + E());
            next = null;
        }
        return next;
    }

    public CreativeInfo i() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.c();
        }
        return null;
    }

    public synchronized List<CreativeInfo> j() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.c() != null) {
                arrayList.add(lVar.c());
            }
        }
        return arrayList;
    }

    public synchronized List<CreativeInfo> k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.c() != null && this.f43774m != null && this.f43774m.contains(lVar.c().af())) {
                arrayList.add(lVar.c());
            }
        }
        return arrayList;
    }

    public j l() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.f44514b;
        }
        return null;
    }

    public synchronized j d(String str) {
        j jVar;
        for (l lVar : this.V) {
            if (lVar.f44513a != null && lVar.f44513a.equals(str)) {
                jVar = lVar.f44514b;
            }
        }
        jVar = null;
        return jVar;
    }

    public synchronized List<j> m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.f44514b != null) {
                arrayList.add(lVar.f44514b);
            }
        }
        return arrayList;
    }

    public String n() {
        l lVarH = h();
        return lVarH != null ? lVarH.f44513a : "";
    }

    private synchronized List<String> E() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f44513a);
        }
        return arrayList;
    }

    public String o() {
        return this.B;
    }

    public String p() {
        return this.C;
    }

    public void a(String[] strArr) {
        this.C = strArr[0];
        this.B = strArr[1];
    }

    public int q() {
        return this.f43787z;
    }

    public Bundle r() {
        return this.A;
    }

    public int s() {
        return this.f43786y;
    }

    public void b(boolean z10) {
        this.E = z10;
    }

    public void c(boolean z10) {
        this.F = z10;
    }

    public void d(boolean z10) {
        this.G = z10;
    }

    public String t() {
        return this.f43778q;
    }

    public void u() {
        l lVarH = h();
        if (lVarH != null && lVarH.c() != null) {
            List<String> listW = lVarH.c().W();
            if (listW != null && !listW.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = listW.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next()).append("\n");
                }
                this.f43778q = sb2.toString();
                return;
            }
            return;
        }
        Logger.d(f43762a, "Cannot extract text as Creative info object is null");
    }

    public long v() {
        return this.f43776o;
    }

    public String toString() {
        return " maxAdSdk: " + (this.f43783v != null ? this.f43783v : "") + " impression IDs: " + E() + " clickUrl: " + (this.f43785x != null ? this.f43785x : "") + " viewAddress: " + (this.K != null ? this.K : "");
    }

    public String w() {
        return this.L;
    }

    public List<String> x() {
        return this.f43774m;
    }

    public void a(List<String> list) {
        Logger.d(f43762a, "setting view hierarchy : " + list);
        this.f43774m = list;
    }

    public void b(List<WeakReference<WebView>> list) {
        StringBuilder sb2 = new StringBuilder("setViewsAddresses added [");
        this.f43775n = new ArrayList();
        synchronized (list) {
            for (WeakReference<WebView> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    String strA = BrandSafetyUtils.a(weakReference.get());
                    this.f43775n.add(strA);
                    sb2.append(strA + Z7.f27998r);
                }
            }
            sb2.append(C3426d4.j.f28588e);
            Logger.d(f43762a, sb2.toString());
        }
    }

    public String y() {
        if (this.A == null || !this.A.containsKey(BrandSafetyEvent.f44592k) || TextUtils.isEmpty(this.A.getString(BrandSafetyEvent.f44592k))) {
            return null;
        }
        return this.A.getString(BrandSafetyEvent.f44592k);
    }

    public String z() {
        if (this.A == null || !this.A.containsKey("creative_id") || TextUtils.isEmpty(this.A.getString("creative_id"))) {
            return null;
        }
        return this.A.getString("creative_id");
    }

    public String A() {
        if (this.A == null || !this.A.containsKey("network_name") || TextUtils.isEmpty(this.A.getString("network_name"))) {
            return null;
        }
        return this.A.getString("network_name");
    }

    public String B() {
        return this.Q;
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.Q == null) {
                this.Q = str;
            } else if (!this.Q.contains(str)) {
                this.Q += ImpressionLog.P + str;
            }
        }
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.R.a(str, aVarArr);
    }

    public void a(Long l10, Long l11, String str, ImpressionLog.a... aVarArr) {
        this.R.a(l10, l11, str, aVarArr);
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.R.b(str, aVarArr);
    }

    public void a(ImpressionLog impressionLog) {
        this.R.a(impressionLog);
    }

    public synchronized void e(boolean z10) {
        this.V.clear();
        this.f43774m = null;
        this.f43776o = 0L;
        this.f43778q = null;
        this.f43779r = System.currentTimeMillis();
        this.f43780s = null;
        this.f43781t = null;
        this.f43782u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f43783v = null;
        this.f43784w = false;
        this.f43785x = null;
        this.f43786y = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.N = false;
        this.O = false;
        if (z10) {
            this.P = null;
        }
        this.Q = null;
    }

    public void C() {
        this.L = null;
        this.K = null;
        this.A = null;
        this.f43787z = 0;
        this.B = null;
        this.C = null;
    }

    public void D() {
        e(true);
        C();
    }

    public void a(d dVar, Bundle bundle, int i10) {
        this.L = dVar.f44390c;
        this.K = dVar.f44394g;
        this.A = bundle;
        this.f43787z = i10;
    }
}
