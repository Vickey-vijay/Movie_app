package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.a;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.Serializable;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class CreativeInfo implements Serializable {
    public static final String A = "details?id=";
    public static final String B = "isVideoAd";
    public static final String C = "isPlayable";
    public static final String D = "campaign_id";
    public static final String L = "buyer_id";
    public static final String S = "ad_system";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44313a = "CreativeInfo";
    public static final String aF = "native";
    public static final String aG = "native_banner";
    public static final String aH = "/ad_count_";
    public static final String aI = "/multiple_ads";
    public static final String aJ = "/multi_ad";
    public static final String aK = "webview_resource_urls_expanded";
    public static final String aL = "matchingMethodAddress";
    public static final String aM = "title:";
    public static final String aN = "mainImg:";
    public static final String aO = "icon:";
    public static final String aP = "body:";
    public static final String aQ = "cta:";
    public static final String aR = "star:";
    public static final String aS = "advertiser:";
    public static final String aT = "element:";
    public static final String aU = "ad_domain";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public static final String f44314ak = "end_card_url";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public static final String f44315al = "html";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public static final String f44316am = "vast_ad_tag_uris";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public static final String f44317an = "log";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f44318ao = "event_id";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f44319ap = "text:";
    public static final String aq = "video:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44320b = "prefetchTimestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44321c = "ad_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44322d = "creative_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44323e = "video_url";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44324f = "ci_matching_method";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44325g = "ci_debug_info";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44326h = "exact_";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44327i = "exact_fbLabel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44328j = "exact_markup";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44329k = "exact_video";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44330l = "exact_resource";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f44331m = "exact_ad_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f44332n = "exact_ad_object";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f44333o = "heuristic_mediation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f44334p = "heuristic_pending";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f44335q = "downstream_struct";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f44336r = "vast";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f44337s = "survey";
    private static final long serialVersionUID = 4107472620437040927L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f44338t = "text";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f44339u = "playable";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f44340v = "image";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44341w = "mraid";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44342x = "dsp_creative_id";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44343y = "webview_resource_urls";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44344z = "prefetch_resource_urls";
    private BrandSafetyUtils.AdType E;
    protected String F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected String J;
    protected String K;
    protected String M;
    protected final HashSet<String> N;
    protected final HashSet<String> O;
    protected final HashSet<String> P;
    public String Q;
    Timestamp R;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    protected String X;
    private String Y;
    private boolean Z;
    private String aA;
    private String aB;
    private boolean aC;
    private String aD;
    private String aE;
    protected String aV;
    protected String aW;
    protected String aX;
    protected String aY;
    protected final HashSet<String> aZ;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f44345aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long f44346ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f44347ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f44348ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private int f44349ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private boolean f44350af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private boolean f44351ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private String f44352ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private String f44353ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private List<String> f44354aj;
    protected String ar;
    protected String as;
    protected String at;
    protected final HashSet<String> au;
    boolean av;
    public final ArrayList<String> aw;
    public final Set<String> ax;
    public boolean ay;
    private transient View az;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    boolean f44355ba;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public boolean f44356bb;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    protected boolean f44357bc;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    protected final ImpressionLog f44358bd;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private final List<String> f44359be;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private boolean f44360bf;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private boolean f44361bg;

    public void e() {
        this.f44350af = true;
    }

    public View f() {
        return this.az;
    }

    public void a(View view) {
        this.az = view;
    }

    public boolean g() {
        return this.Z;
    }

    public String h() {
        return this.F;
    }

    public void c(String str) {
        this.F = str;
    }

    public void d(String str) {
        if (str != null) {
            if (this.F == null) {
                this.F = "";
            }
            this.F += str;
        }
    }

    public String i() {
        Logger.d(f44313a, "getAdUnitId started with the stored value: " + this.aV);
        return this.aV;
    }

    public void e(String str) {
        Logger.d(f44313a, "setAdUnitId started with ad unit id: " + str);
        this.aV = str;
    }

    public boolean j() {
        return this.I;
    }

    public String k() {
        return this.as;
    }

    public void a(boolean z10) {
        this.aC = z10;
    }

    public boolean l() {
        return this.aC;
    }

    public String m() {
        return this.aD;
    }

    public void f(String str) {
        this.aD = str;
    }

    public void g(String str) {
        this.aY = str;
    }

    public String n() {
        return this.aY;
    }

    public void h(String str) {
        this.K = str;
    }

    public String o() {
        return this.M;
    }

    public HashSet<String> p() {
        return this.N;
    }

    public HashSet<String> q() {
        return this.O;
    }

    public HashSet<String> r() {
        return this.aZ;
    }

    public HashSet<String> s() {
        return this.P;
    }

    public String t() {
        return this.Q;
    }

    public HashSet<String> u() {
        return this.au;
    }

    public void b(boolean z10) {
        this.V = z10;
    }

    public void c(boolean z10) {
        this.av = z10;
    }

    public boolean v() {
        return this.T || this.V;
    }

    public boolean w() {
        return this.W;
    }

    public void d(boolean z10) {
        Logger.d(f44313a, "VideoAd property has been set to " + z10);
        this.T = z10;
    }

    public boolean x() {
        return this.U;
    }

    public void e(boolean z10) {
        this.U = z10;
    }

    public boolean y() {
        return this.V;
    }

    public boolean z() {
        return this.av;
    }

    public String A() {
        return this.X;
    }

    public boolean B() {
        return this.f44357bc;
    }

    public void f(boolean z10) {
        this.f44357bc = z10;
    }

    public void C() {
        this.f44361bg = true;
    }

    public boolean D() {
        return this.f44361bg;
    }

    public ImpressionLog E() {
        return this.f44358bd;
    }

    public CreativeInfo() {
        this.f44350af = false;
        this.f44359be = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.f44346ab = 0L;
        this.aC = false;
        this.f44351ag = false;
        this.f44360bf = true;
        this.f44352ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.f44355ba = false;
        this.f44356bb = false;
        this.f44357bc = false;
        this.f44358bd = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
    }

    public CreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id2, String creativeId, String clickUrl, String videoUrl, String downstreamStruct) {
        this.f44350af = false;
        this.f44359be = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.f44346ab = 0L;
        this.aC = false;
        this.f44351ag = false;
        this.f44360bf = true;
        this.f44352ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.f44355ba = false;
        this.f44356bb = false;
        this.f44357bc = false;
        this.f44358bd = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
        this.E = adType;
        this.f44345aa = sdk;
        this.Y = id2;
        i(creativeId);
        t(clickUrl);
        o(videoUrl);
        this.f44351ag = true;
        this.f44346ab = k.b(SystemClock.elapsedRealtime());
        this.F = downstreamStruct;
        this.T = TextUtils.isEmpty(videoUrl) ? false : true;
        this.f44358bd.a(ImpressionLog.f43625a, new ImpressionLog.a[0]);
        ac();
    }

    public void i(String str) {
        this.f44347ac = str;
    }

    public void j(String str) {
        this.aB = str;
    }

    public void k(String str) {
        this.ar = str;
    }

    public void l(String str) {
        this.aA = str;
    }

    public void m(String str) {
        this.as = str;
    }

    public static CreativeInfo n(String str) {
        CreativeInfo creativeInfo = new CreativeInfo();
        creativeInfo.Y = str;
        return creativeInfo;
    }

    public String F() {
        return this.K;
    }

    public String G() {
        StringBuilder sb2 = new StringBuilder();
        if (this.G) {
            sb2.append(this.Y);
        }
        sb2.append(this.f44347ac);
        sb2.append(this.J);
        return sb2.toString();
    }

    public String H() {
        return this.J;
    }

    public void o(String str) {
        this.J = D(str);
        z(this.J);
    }

    public String I() {
        return this.aE;
    }

    public void p(String str) {
        if (BrandSafetyEvent.AdFormatType.LEADER.name().equals(str)) {
            this.aE = BrandSafetyEvent.AdFormatType.BANNER.name();
        } else {
            this.aE = str;
        }
    }

    public void q(String str) {
        this.M = str;
    }

    public void a(String str, Set<String> set) {
        a(Arrays.asList(str), set);
    }

    public void a(List<String> list, Set<String> set) {
        Logger.d(f44313a, "add recommendations: " + list + ", resources list: " + set);
        if (list != null) {
            synchronized (this.aw) {
                this.aw.addAll(list);
            }
            Logger.d(f44313a, "add recommendations added : " + list);
        }
        if (set != null) {
            synchronized (this.ax) {
                this.ax.addAll(set);
            }
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                if (!TextUtils.isEmpty(strD)) {
                    synchronized (this.ax) {
                        this.ax.add(strD);
                    }
                    synchronized (this.O) {
                        if (this.O.contains(strD)) {
                            Logger.d(f44313a, "removing recommendation resource " + strD + " from WebView resource urls");
                            this.O.remove(strD);
                        }
                    }
                }
            }
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        boolean zA = CreativeInfoManager.a(this.f44345aa, AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        if (!TextUtils.isEmpty(this.Y) && zA) {
            bundle.putString(f44321c, this.Y);
        }
        if (this.H) {
            bundle.putLong(f44320b, this.f44346ab);
        }
        if (!TextUtils.isEmpty(this.f44347ac)) {
            bundle.putString("creative_id", this.f44347ac);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            bundle.putString(f44342x, this.aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            bundle.putString(L, this.ar);
        }
        if (!TextUtils.isEmpty(this.as)) {
            bundle.putString(S, this.as);
        }
        if (!TextUtils.isEmpty(this.J)) {
            bundle.putString("video_url", this.J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            bundle.putString(f44314ak, this.at);
        }
        if (!TextUtils.isEmpty(this.f44352ah)) {
            bundle.putString(f44324f, this.f44352ah);
        }
        if (!TextUtils.isEmpty(this.f44353ai)) {
            bundle.putString(f44325g, this.f44353ai);
        }
        if (!TextUtils.isEmpty(this.F)) {
            bundle.putString(f44335q, this.F);
        }
        if (!TextUtils.isEmpty(this.K)) {
            bundle.putString("zone_id", this.K);
        }
        bundle.putString("ad_format_type", this.aE);
        if (!TextUtils.isEmpty(this.M)) {
            bundle.putString(BrandSafetyEvent.f44588g, this.M);
        }
        bundle.putString("sdk_version", this.Q);
        if (!TextUtils.isEmpty(this.aY)) {
            bundle.putString(aU, this.aY);
        }
        synchronized (this.N) {
            if (this.N != null && !this.N.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f44589h, new ArrayList<>(this.N));
            }
        }
        synchronized (this.O) {
            if (this.O != null && !this.O.isEmpty()) {
                bundle.putStringArrayList(f44343y, new ArrayList<>(this.O));
            }
        }
        synchronized (this.aZ) {
            if (this.aZ != null && !this.aZ.isEmpty()) {
                bundle.putStringArrayList(aK, new ArrayList<>(this.aZ));
            }
        }
        synchronized (this.P) {
            if (this.P != null && !this.P.isEmpty()) {
                bundle.putStringArrayList(f44344z, new ArrayList<>(this.P));
            }
        }
        synchronized (this.au) {
            if (this.au != null && !this.au.isEmpty()) {
                bundle.putStringArrayList(f44316am, new ArrayList<>(this.au));
            }
        }
        synchronized (this.aw) {
            if (this.ay && this.aw != null && !this.aw.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f44602u, new ArrayList<>(this.aw));
            }
        }
        return bundle;
    }

    public boolean c() {
        return this.f44347ac == null;
    }

    public boolean J() {
        return !this.f44351ag;
    }

    public BrandSafetyUtils.AdType K() {
        return this.E;
    }

    public void a(BrandSafetyUtils.AdType adType) {
        if (adType == null) {
            Logger.d(f44313a, "setAdType - ad type is null, not setting");
            return;
        }
        Logger.d(f44313a, "setAdType - set to ad type: " + adType + " for ci with id: " + this.Y);
        this.E = adType;
        ac();
    }

    public String L() {
        return this.Y;
    }

    public void r(String str) {
        this.Y = str;
    }

    public String M() {
        return this.f44348ad;
    }

    public String N() {
        return this.f44347ac;
    }

    public String O() {
        return this.aB;
    }

    public String P() {
        return this.ar;
    }

    public String Q() {
        return this.f44345aa;
    }

    public void s(String str) {
        this.f44345aa = str;
    }

    public String R() {
        return this.aA;
    }

    public int S() {
        return this.f44349ae;
    }

    public void a(int i10) {
        this.f44349ae = i10;
    }

    public void t(String str) {
        this.f44348ad = str;
        if (TextUtils.isEmpty(this.M)) {
            this.M = a(str);
        }
    }

    public void g(boolean z10) {
        this.I = z10;
    }

    public void a(String str, String str2) {
        this.f44352ah = str;
        u("mi=" + str2);
    }

    public void u(String str) {
        if (str != null) {
            if (this.f44353ai == null) {
                this.f44353ai = str;
            } else if (!this.f44353ai.contains(str)) {
                this.f44353ai += ImpressionLog.P + str;
            } else {
                Logger.d(f44313a, "setDebugInfo ci debug info already contains the string. skipping. content : " + str);
            }
        }
    }

    public void T() {
        this.f44353ai = null;
    }

    public String U() {
        return this.f44353ai;
    }

    public String V() {
        return this.f44352ah;
    }

    public boolean a(Map<Integer, CreativeInfo> map) {
        if (this.f44349ae == 0) {
            return false;
        }
        synchronized (map) {
            map.put(Integer.valueOf(this.f44349ae), this);
        }
        return true;
    }

    public boolean b(Map<Integer, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (this.f44349ae == 0) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(Integer.valueOf(this.f44349ae));
        }
        return creativeInfoRemove != null;
    }

    public boolean c(Map<String, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (!WebView.class.getCanonicalName().equals(this.aW)) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(this.aW);
        }
        return creativeInfoRemove != null;
    }

    public void a(List<String> list) {
        this.f44354aj = list;
    }

    public List<String> W() {
        return this.f44354aj;
    }

    public void b(List<String> list) {
        if (list != null) {
            for (String str : list) {
                String strD = D(str);
                String strE = E(str);
                if (!TextUtils.isEmpty(strD)) {
                    if (b(str) || b(strD) || b(strE) || str.startsWith(aT)) {
                        Logger.d(f44313a, "classifyPrefetchUrl " + this.f44345aa + " url is a prefetch url " + str);
                        z(strD);
                    } else if (v(strD) && !strD.equals(this.f44348ad)) {
                        Logger.d(f44313a, "classifyPrefetchUrl " + this.f44345aa + " url is a dsp url " + str);
                        x(strD);
                    } else {
                        Logger.d(f44313a, "classifyPrefetchUrl " + this.f44345aa + " url is not a prefetch nor a dsp url and will be discarded : " + str);
                    }
                }
            }
        }
    }

    public void c(List<String> list) {
        if (list != null) {
            k.b(f44313a, "add prefetch urls : " + list.toString());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                z(it.next());
            }
        }
    }

    protected boolean v(String str) {
        return e.a(this.f44345aa, str);
    }

    protected boolean b(String str) {
        return k.a(str, (Map<String, String>) null);
    }

    public void w(String str) {
        if (v(str)) {
            x(str);
        }
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
        }
    }

    public void x(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD) && !this.au.contains(strD)) {
            if (!this.ax.contains(strD)) {
                Logger.d(f44313a, "add dsp domain url - adding the following url: " + strD);
                synchronized (this.N) {
                    this.N.add(strD);
                }
                return;
            }
            Logger.d(f44313a, "add dsp domain url: avoid adding a recommendation resource" + strD);
            this.ay = true;
        }
    }

    public void y(String str) {
        String strD = !str.startsWith("text:") ? D(str) : str;
        if (!TextUtils.isEmpty(strD)) {
            if (!this.ax.contains(strD)) {
                if (this.f44359be != null && !this.f44359be.contains(strD)) {
                    if (this.f44350af) {
                        if (!str.startsWith("text:")) {
                            this.aZ.add(strD);
                            return;
                        }
                        return;
                    } else {
                        synchronized (this.O) {
                            this.O.add(strD);
                        }
                        Logger.d(f44313a, "Resource was added successfully to CI, resource: " + strD);
                        return;
                    }
                }
                Logger.d(f44313a, "add resource url: Url is in the WebView urls exclusion list, will not be added : " + strD);
                return;
            }
            Logger.d(f44313a, "add resource url: avoid adding a recommendation resource: " + strD);
            this.ay = true;
        }
    }

    public void b(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    public void z(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD)) {
            if (this.f44359be != null && !this.f44359be.contains(strD)) {
                synchronized (this.P) {
                    this.P.add(strD);
                }
                return;
            }
            Logger.d(f44313a, "add prefetch Url: Url is in the WebView urls exclusion list , will not be added : " + strD);
        }
    }

    public void A(String str) {
        if (str != null) {
            if (this.f44359be != null && !this.f44359be.contains(str)) {
                synchronized (this.P) {
                    this.P.add("text:" + str.trim());
                }
                return;
            }
            Logger.d(f44313a, "add prefetch text: already in the list, will not be added: " + str);
        }
    }

    public void B(String str) {
        if (str != null) {
            if (this.f44359be != null && !this.f44359be.contains(str)) {
                synchronized (this.P) {
                    this.P.add(aT + str);
                }
                return;
            }
            Logger.d(f44313a, "add prefetch element: already in the list, will not be added: " + str);
        }
    }

    public void C(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD)) {
            synchronized (this.au) {
                this.au.add(strD);
            }
        }
        synchronized (this.N) {
            this.N.remove(strD);
        }
    }

    public String toString() {
        Bundle bundleD = d();
        bundleD.putBoolean(B, this.T | this.V);
        bundleD.putBoolean(C, this.W);
        return "matchingObjectAddress=" + this.aW + ", event_id=" + this.aD + ", id=" + this.Y + ", " + bundleD;
    }

    public String X() {
        Bundle bundle = new Bundle();
        bundle.putString(f44321c, this.Y);
        if (this.aW != null) {
            bundle.putString(aL, this.aW);
        }
        if (this.aD != null) {
            bundle.putString("event_id", this.aD);
        }
        return bundle.toString();
    }

    private String a(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(A)) == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(C3426d4.j.f28584c, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf + A.length(), iIndexOf2);
    }

    public Timestamp Y() {
        return this.R;
    }

    public static String D(String str) {
        if (!TextUtils.isEmpty(str)) {
            return k.k(k.E(str));
        }
        return str;
    }

    protected String E(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Throwable th2) {
                Logger.d(f44313a, "Failure in encode url. This url will be sent as is in the next event. " + th2.getMessage() + ". Url=" + str);
                return str;
            }
        }
        return str;
    }

    public void Z() {
        this.Z = true;
    }

    public void F(String str) {
        this.X = str;
    }

    public String aa() {
        return this.f44347ac;
    }

    public long ab() {
        return this.f44346ab;
    }

    public void ac() {
        a aVarI = CreativeInfoManager.i(this.f44345aa);
        if (aVarI != null) {
            if (K().equals(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.R = new Timestamp(System.currentTimeMillis() + aVarI.e(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE));
                Logger.d(f44313a, "set expiration time - sdk: " + this.f44345aa + ", inter max age: " + aVarI.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            } else if (K().equals(BrandSafetyUtils.AdType.BANNER) || K().equals(BrandSafetyUtils.AdType.MREC) || K().equals(BrandSafetyUtils.AdType.NATIVE)) {
                this.R = new Timestamp(System.currentTimeMillis() + aVarI.e(AdNetworkConfiguration.BANNER_CI_MAX_AGE));
                Logger.d(f44313a, "set expiration time - sdk: " + this.f44345aa + ", banner/mrec/native max age: " + aVarI.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            }
        }
    }

    public boolean ad() {
        return this.f44360bf;
    }

    public void h(boolean z10) {
        this.f44360bf = z10;
    }

    public String ae() {
        return this.aX;
    }

    public String af() {
        return this.aW;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
            Logger.d(f44313a, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + this.Y);
        }
    }

    public void b(String str, String str2) {
        this.aW = str;
        this.aX = str2;
    }

    public void ag() {
        long j10 = this.f44346ab;
        this.f44346ab = k.b(SystemClock.elapsedRealtime());
        Logger.d(f44313a, "prefetch timestamp reset. old value = " + j10 + ", new value = " + this.f44346ab);
    }

    public void G(String str) {
        String strD = D(str);
        this.f44359be.add(strD);
        H(strD);
    }

    private void H(String str) {
        if (this.O.contains(str)) {
            Logger.d(f44313a, "removing url from WebView resource urls : " + str);
            this.O.remove(str);
        }
    }

    public boolean ah() {
        return this.f44355ba;
    }

    public void ai() {
        this.f44355ba = true;
    }

    public void a(CreativeInfo creativeInfo) {
    }

    public static List<String> a(List<CreativeInfo> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null || list == null || list.size() == 0) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        for (CreativeInfo creativeInfo : list) {
            if (lowerCase.equals("id")) {
                arrayList.add(creativeInfo.f44347ac);
            } else if (lowerCase.equals("clickurl")) {
                arrayList.add(creativeInfo.f44348ad);
            } else if (lowerCase.equals("adid")) {
                arrayList.add(creativeInfo.Y);
            }
        }
        return arrayList;
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        try {
            this.f44358bd.a(str, aVarArr);
        } catch (NullPointerException e10) {
            Logger.d(f44313a, "add impression log event failed: type=" + str + ", impressionLog=" + this.f44358bd);
        }
    }

    public void a(Long l10, Long l11, String str, ImpressionLog.a... aVarArr) {
        try {
            this.f44358bd.a(l10, l11, str, aVarArr);
        } catch (NullPointerException e10) {
            Logger.d(f44313a, "add impression log event failed: type=" + str + ", impressionLog=" + this.f44358bd);
        }
    }
}
