package com.safedk.android.internal;

import android.os.Bundle;
import com.ironsource.V2;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static final String A = "imageMimeTypesList";
    public static final String B = "videoMimeTypesList";
    public static final String C = "audioMimeTypesList";
    public static final String D = "maxBannerUniformPixelsPercentageToStopSampling";
    public static final String E = "minBannerUniformPixelsPercentageForUniformImage";
    public static final String F = "maxAttemptsToCaptureBannerImage";
    public static final String G = "bannerImageSamplingInterval";
    public static final String H = "bannerDimensionsMaxSize";
    public static final String I = "isBannersEnabled";
    public static final String J = "https://edge.safedk.com";
    public static final String K = "https://edge.safedk.com";
    public static final long L = 1200000;
    public static final int M = 20;
    public static final String N = "apng;bmp;gif;x-icon;x-icon;png;svg+xml;tiff";
    public static final String O = "wave;wav;x-wav;x-pn-wav;webm;ogg;";
    private static final String P = "SafeDKConfiguration";
    private static final String Q = "settings";
    private static final String R = "android";
    private static final String S = "images";
    private static final String T = "banners";
    private static final String U = "adCaching";
    private static final String V = "general";
    private static final String W = "timers";
    private static final String X = "redirectClickTimeout";
    private static final String Y = "sdkSpecificMinUniformPixelsPercentageForUniformImage";
    private static final String Z = "sdkSpecificCachedCIMaxAge";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44769a = 300;
    private static final int aA = 5;
    private static final int aC = 25000;
    private static final boolean aE = false;
    private static final int aG = 10000;
    private static final int aI = 15000;
    private static final int aK = 15000;
    private static final int aU = 100;
    private static final float aX = 40.0f;
    private static final float aZ = 90.0f;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f44770aa = "sdkSpecificCachedCIExpiration";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f44771ab = 30000;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final int f44772ac = 30000;
    private static final int as = 8192;
    private static final int au = 540;
    private static final float aw = 40.0f;
    private static final float ay = 90.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44773b = 5000;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    private static final int f44774bb = 5;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    private static final int f44775bd = 1;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private static final int f44776bf = 480;

    /* JADX INFO: renamed from: bh, reason: collision with root package name */
    private static final boolean f44777bh = true;

    /* JADX INFO: renamed from: bj, reason: collision with root package name */
    private static final boolean f44778bj = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44779c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44780d = "minValidImageSize";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44781e = "interstitialDimensionsMaxSize";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44782f = "maxUniformPixelsPercentageToStopSampling";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44783g = "maxImagesToStoreOnDevice";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44784h = "minImageSizeToStopSampling";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44785i = "minUniformPixelsPercentageForUniformImage";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44786j = "awsUploadTimeout";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44787k = "resolveUrlTimeout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44788l = "clickValidityTimeout";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f44789m = "interstitialActivitiesToInclude";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f44790n = "interstitialActivitiesToExclude";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f44791o = "edgeServerUrl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f44792p = "backupEdgeServerUrl";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f44793q = "devicesWithDebugLog";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f44794r = "cachedCreativeInfoMaxAge";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f44795s = "cachedMaxNumberOfItems";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f44796t = "cachedNumberOfItemsThreshold";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f44797u = "cacheSupportingSdkUUIDs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f44798v = "safeDKDeactivation";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44799w = "activePercentage";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44800x = "deactivated";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44801y = "alwaysTakeScreenshot";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44802z = "disableWebViewTracking";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private boolean f44803ad = false;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private int f44804ae = f44769a;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private boolean f44805af = false;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f44806ag = 5000;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private int f44807ah = 500;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private int f44808ai = 30000;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f44809aj = 30000;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private boolean f44810ak = false;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private boolean f44811al = true;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private boolean f44812am = false;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private boolean f44813an = false;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private JSONObject f44814ao = new JSONObject();

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private JSONObject f44815ap = new JSONObject();
    private ArrayList<String> aq = new ArrayList<>(Arrays.asList(com.safedk.android.utils.g.f44958d, com.safedk.android.utils.g.f44956b, com.safedk.android.utils.g.f44975u, com.safedk.android.utils.g.f44980z, com.safedk.android.utils.g.f44969o));
    private boolean ar = false;
    private int at = 8192;
    private int av = au;
    private float ax = 40.0f;
    private float az = 90.0f;
    private int aB = 5;
    private long aD = V2.f27791h;
    private boolean aF = false;
    private int aH = 10000;
    private int aJ = 15000;
    private int aL = 15000;
    private ArrayList<String> aM = new ArrayList<>();
    private ArrayList<String> aN = new ArrayList<>();
    private String aO = "https://edge.safedk.com";
    private String aP = "https://edge.safedk.com";
    private ArrayList<String> aQ = new ArrayList<>();
    private ArrayList<String> aR = new ArrayList<>();
    private long aS = L;
    private int aT = 20;
    private int aV = 100;
    private final boolean aW = false;
    private float aY = 40.0f;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    private float f44816ba = 90.0f;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    private int f44817bc = 5;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private int f44818be = 1;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private int f44819bg = f44776bf;

    /* JADX INFO: renamed from: bi, reason: collision with root package name */
    private boolean f44820bi = true;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    private boolean f44821bk = true;

    /* JADX INFO: renamed from: bl, reason: collision with root package name */
    private List<String> f44822bl = Arrays.asList(N.split(";"));

    /* JADX INFO: renamed from: bm, reason: collision with root package name */
    private List<String> f44823bm = Arrays.asList(O.split(";"));

    /* JADX INFO: renamed from: bn, reason: collision with root package name */
    private boolean f44824bn = false;

    public int a() {
        return this.f44808ai;
    }

    public int b() {
        return this.f44809aj;
    }

    public boolean c() {
        return this.ar;
    }

    public int d() {
        return this.at;
    }

    public int e() {
        return this.av;
    }

    public float f() {
        return this.ax;
    }

    public float g() {
        return this.az;
    }

    public boolean h() {
        return this.aF;
    }

    public int i() {
        return this.aB;
    }

    public long j() {
        return this.aD;
    }

    public int k() {
        return this.aH;
    }

    public int l() {
        return this.aJ;
    }

    public int m() {
        return this.aL;
    }

    public float n() {
        return this.aY;
    }

    public float o() {
        return this.f44816ba;
    }

    public int p() {
        return this.f44817bc;
    }

    public int q() {
        return this.f44818be;
    }

    public int r() {
        return this.f44819bg;
    }

    public boolean s() {
        return this.f44820bi;
    }

    public boolean t() {
        return this.f44821bk;
    }

    public List<String> u() {
        return this.f44822bl;
    }

    public List<String> v() {
        return this.f44823bm;
    }

    public void a(boolean z10) {
        this.f44824bn = z10;
    }

    public boolean w() {
        return this.f44813an;
    }

    public boolean x() {
        return !this.f44824bn;
    }

    public void b(boolean z10) {
        this.f44803ad = z10;
    }

    public boolean y() {
        return this.f44803ad;
    }

    public int z() {
        return this.f44804ae;
    }

    public void a(int i10) {
        this.f44806ag = i10;
    }

    public void b(int i10) {
        this.f44807ah = i10;
    }

    public boolean A() {
        return this.f44810ak;
    }

    public boolean B() {
        return this.f44805af;
    }

    public int C() {
        return this.f44806ag;
    }

    public int D() {
        return this.f44807ah;
    }

    public JSONObject E() {
        return this.f44814ao;
    }

    public JSONObject F() {
        return this.f44815ap;
    }

    public Set<String> G() {
        return new HashSet(this.aQ);
    }

    public boolean H() {
        return this.f44812am;
    }

    public int I() {
        return this.aV;
    }

    public boolean a(Bundle bundle, boolean z10) {
        Logger.d(P, "parseSettings started , bundle : " + (bundle == null ? "null" : bundle.toString()));
        Bundle bundle2 = bundle.getBundle("settings");
        if (bundle2 == null) {
            if (z10) {
                Logger.e(P, "Settings bundle is null, cannot parse settings. Saved settings will be used");
            }
            return false;
        }
        Logger.d(P, "parseSettings starting DEACTIVATION");
        if (bundle2.containsKey(f44798v)) {
            Bundle bundle3 = bundle2.getBundle(f44798v);
            if (bundle3.containsKey(f44800x)) {
                this.f44824bn = bundle3.getBoolean(f44800x, false);
                Logger.d(P, "parseSettings deactivated " + this.f44824bn);
            } else {
                this.f44824bn = false;
            }
            if (bundle3.containsKey(f44799w)) {
                this.aV = (int) bundle3.getDouble(f44799w, 100.0d);
                Logger.d(P, "parseSettings activePercentage " + this.aV);
            } else {
                this.aV = 100;
            }
            if (!this.f44824bn && this.aV != 100) {
                Logger.d(P, "Checking active percentage");
                this.f44824bn = !a(Double.valueOf((double) this.aV), SafeDK.getInstance().getUserId());
                Logger.d(P, "After active percentage deactivated=" + this.f44824bn);
            }
        } else {
            this.f44824bn = false;
            this.aV = 100;
            Logger.d(P, "parseSettings SAFE_DK_DEACTIVATION settings block does not exist. Default configuration values will be used.");
        }
        if (bundle2 != null && bundle2.containsKey(S)) {
            Bundle bundle4 = bundle2.getBundle(S);
            Logger.d(P, "parseSettings starting IMAGES : " + bundle4.toString());
            if (bundle4.containsKey(f44780d)) {
                this.at = bundle4.getInt(f44780d, 8192);
                Logger.d(P, "parseSettings minValidImageSize " + this.at);
            } else {
                this.at = 8192;
            }
            if (bundle4.containsKey(f44781e)) {
                this.av = bundle4.getInt(f44781e, au);
                Logger.d(P, "parseSettings interstitialDimensionsMaxSize " + this.av);
            } else {
                this.av = au;
            }
            if (bundle4.containsKey(f44782f)) {
                this.ax = (float) bundle4.getDouble(f44782f, 40.0d);
                Logger.d(P, "parseSettings maxUniformPixelsPercentageToStopSampling " + this.ax);
            } else {
                this.ax = 40.0f;
            }
            if (bundle4.containsKey(f44783g)) {
                this.aB = bundle4.getInt(f44783g, 5);
                Logger.d(P, "parseSettings maxImagesToStoreOnDevice " + this.aB);
            } else {
                this.aB = 5;
            }
            if (bundle4.containsKey(f44784h)) {
                this.aD = bundle4.getInt(f44784h, 25000);
                Logger.d(P, "parseSettings minImageSizeToStopSampling " + this.aD);
            } else {
                this.aD = V2.f27791h;
            }
            if (bundle4.containsKey(f44785i)) {
                this.az = (float) bundle4.getDouble(f44785i, 90.0d);
                Logger.d(P, "parseSettings minUniformPixelsPercentageForUniformImage " + this.az);
                CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, this.az);
            }
            if (bundle4.containsKey(f44801y)) {
                this.aF = bundle4.getBoolean(f44801y, false);
                Logger.d(P, "parseSettings alwaysTakeScreenshot " + this.aF);
            } else {
                this.aF = false;
            }
            try {
                if (bundle4.containsKey(Y)) {
                    Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage " + bundle4.getBundle(Y));
                    Bundle bundle5 = bundle4.getBundle(Y);
                    for (String str : bundle5.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage key = " + str + ", value = " + bundle5.getDouble(str));
                        double d10 = bundle5.getDouble(str);
                        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str);
                        if (sdkPackageByPackageUUID != null) {
                            Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage identified UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + d10);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(sdkPackageByPackageUUID);
                            if (aVarI != null) {
                                aVarI.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, (float) d10);
                                Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + ((float) d10));
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.d(P, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage Exception : " + th2.getMessage(), th2);
            }
        } else {
            this.at = 8192;
            this.av = au;
            this.ax = 40.0f;
            this.aB = 5;
            this.aD = V2.f27791h;
            Logger.d(P, "minUniformPixelsPercentageForUniformImage set to " + this.az);
            this.aF = false;
            Logger.d(P, "parseSettings IMAGES settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting BANNERS");
        if (bundle2 != null && bundle2.containsKey(T)) {
            Bundle bundle6 = bundle2.getBundle(T);
            if (bundle6.containsKey(D)) {
                this.aY = (float) bundle6.getDouble(D, 40.0d);
                Logger.d(P, "parseSettings maxBannerUniformPixelsPercentageToStopSampling " + this.aY);
            } else {
                this.aY = 40.0f;
            }
            if (bundle6.containsKey(E)) {
                this.f44816ba = (float) bundle6.getDouble(E, 90.0d);
                Logger.d(P, "parseSettings minBannerUniformPixelsPercentageForUniformImage " + this.f44816ba);
            } else {
                this.f44816ba = 90.0f;
            }
            if (bundle6.containsKey(F)) {
                this.f44817bc = bundle6.getInt(F, 5);
                Logger.d(P, "parseSettings maxAttemptsToCaptureBannerImage " + this.f44817bc);
            } else {
                this.f44817bc = 5;
            }
            if (bundle6.containsKey(G)) {
                this.f44818be = bundle6.getInt(G, 1);
                Logger.d(P, "parseSettings bannerImageSamplingInterval " + this.f44818be);
            } else {
                this.f44818be = 1;
            }
            if (bundle6.containsKey(H)) {
                this.f44819bg = bundle6.getInt(H, f44776bf);
                Logger.d(P, "parseSettings bannerDimensionsMaxSize " + this.f44819bg);
            } else {
                this.f44819bg = f44776bf;
            }
            if (bundle6.containsKey(I)) {
                this.f44820bi = bundle6.getBoolean(I, true);
                Logger.d(P, "parseSettings bannerIsEnabled " + this.f44820bi);
            } else {
                this.f44820bi = true;
            }
        } else {
            this.aY = 40.0f;
            this.f44816ba = 90.0f;
            this.f44817bc = 5;
            this.f44818be = 1;
            this.f44819bg = f44776bf;
            this.f44820bi = true;
            Logger.d(P, "parseSettings BANNERS settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting TIMERS");
        if (bundle2.containsKey(W)) {
            Bundle bundle7 = bundle2.getBundle(W);
            if (bundle7.containsKey(f44786j)) {
                this.aH = (int) bundle7.getDouble(f44786j, 10000.0d);
                if (z10) {
                    this.aH *= 1000;
                }
                Logger.d(P, "parseSettings awsUploadTimeout (ms) " + this.aH);
            } else {
                this.aH = 10000;
            }
            if (bundle7.containsKey(f44787k)) {
                this.aJ = (int) bundle7.getDouble(f44787k, 15000.0d);
                if (z10) {
                    this.aJ *= 1000;
                }
                Logger.d(P, "parseSettings resolveUrlTimeout (ms) " + this.aJ);
            } else {
                this.aJ = 15000;
            }
            if (bundle7.containsKey(f44788l)) {
                this.aL = ((int) bundle7.getDouble(f44788l, 15000.0d)) * 1000;
                if (z10) {
                    this.aL *= 1000;
                }
                Logger.d(P, "parseSettings clickValidityTimeout (ms) " + this.aL);
            } else {
                this.aL = 15000;
            }
            if (bundle7.containsKey(X)) {
                this.f44808ai = bundle7.getInt(X, 30) * 1000;
                Logger.d(P, "parseSettings redirectClickTimeout (ms) value is " + this.f44808ai + ", isFromServer=" + z10);
            } else {
                this.f44808ai = 30000;
            }
        } else {
            this.aH = 10000;
            this.aJ = 15000;
            this.aL = 15000;
            this.f44808ai = 30000;
            Logger.d(P, "parseSettings TIMERS settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting ANDROID");
        if (bundle2.containsKey("android")) {
            Bundle bundle8 = bundle2.getBundle("android");
            if (bundle8.containsKey(f44789m)) {
                this.aM = bundle8.getStringArrayList(f44789m);
                Logger.d(P, "parseSettings interstitialActivitiesToInclude " + this.aM);
            }
            if (bundle8.containsKey(f44790n)) {
                this.aN = bundle8.getStringArrayList(f44790n);
                Logger.d(P, "parseSettings interstitialActivitiesToExclude " + this.aN);
            }
            if ((this.aM != null && this.aM.size() > 0) || (this.aN != null && this.aN.size() > 0)) {
                Iterator<String> it = this.aM.iterator();
                while (it.hasNext()) {
                    BrandSafetyUtils.j(it.next());
                }
                Iterator<String> it2 = this.aN.iterator();
                while (it2.hasNext()) {
                    BrandSafetyUtils.k(it2.next());
                }
            }
            if (bundle8.containsKey(f44802z)) {
                this.ar = bundle8.getBoolean(f44802z, false);
                Logger.d(P, "parseSettings disableWebViewTracking " + this.ar);
            }
        } else {
            Logger.d(P, "parseSettings ANDROID settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting GENERAL");
        if (bundle2.containsKey(V)) {
            Bundle bundle9 = bundle2.getBundle(V);
            if (bundle9.containsKey(f44791o)) {
                this.aO = bundle9.getString(f44791o, "https://edge.safedk.com");
                this.aO = a(this.aO);
                Logger.d(P, "parseSettings edgeServerUrl " + this.aO);
            } else {
                this.aO = "https://edge.safedk.com";
            }
            if (bundle9.containsKey(f44792p)) {
                this.aP = bundle9.getString(f44792p, "https://edge.safedk.com");
                this.aP = a(this.aP);
                Logger.d(P, "parseSettings backupEdgeServerUrl " + this.aP);
            } else {
                this.aP = "https://edge.safedk.com";
            }
            AppLovinBridge.receiveEdgeUrls(this.aO, this.aP);
            if (bundle9.containsKey(f44793q)) {
                this.aQ = bundle9.getStringArrayList(f44793q);
                Logger.d(P, "parseSettings devicesWithDebugLog " + this.aQ);
            }
        } else {
            Logger.d(P, "parseSettings GENERAL settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(P, "parseSettings starting Ad CACHING");
        if (bundle2.containsKey(U)) {
            Bundle bundle10 = bundle2.getBundle(U);
            if (bundle10.containsKey(f44794r)) {
                this.aS = (int) bundle10.getDouble(f44794r, 1200000.0d);
                Logger.d(P, "parseSettings cachedCreativeInfoMaxAge " + this.aS);
            } else {
                this.aS = L;
            }
            CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, this.aS);
            if (bundle10.containsKey(f44795s)) {
                this.aT = bundle10.getInt(f44795s);
                Logger.d(P, "parseSettings cachedMaxNumberOfItems " + this.aT);
            } else {
                this.aT = 20;
            }
            if (bundle10.containsKey(f44797u)) {
                this.aR = bundle10.getStringArrayList(f44797u);
                Logger.d(P, "parseSettings cacheSupportingSdkUUIDs " + this.aR);
            }
            if (this.aR != null && this.aR.size() > 0) {
                a(this.aR);
            }
            try {
                if (bundle10.containsKey(Z)) {
                    Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge " + bundle10.getBundle(Z));
                    Bundle bundle11 = bundle10.getBundle(Z);
                    for (String str2 : bundle11.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge key = " + str2 + ", value = " + bundle11.getDouble(str2));
                        long j10 = (long) bundle11.getDouble(str2);
                        String sdkPackageByPackageUUID2 = SdksMapping.getSdkPackageByPackageUUID(str2);
                        if (sdkPackageByPackageUUID2 != null) {
                            Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge identified UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j10);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI2 = CreativeInfoManager.i(sdkPackageByPackageUUID2);
                            if (aVarI2 != null) {
                                aVarI2.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, j10);
                                Logger.d(P, "parseSettings sdkSpecificCachedCIMaxAge UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j10);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                Logger.d(P, "parseSettings sdkSpecificCachedCreativeInfoMaxAge Exception : " + th3.getMessage(), th3);
            }
            try {
                if (bundle10.containsKey(f44770aa)) {
                    Logger.d(P, "parseSettings sdkSpecificCachedCreativeInfoMaxAge " + bundle10.getBundle(f44770aa));
                    Bundle bundle12 = bundle10.getBundle(f44770aa);
                    for (String str3 : bundle12.keySet()) {
                        Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle key = " + str3 + ", value = " + bundle12.getBoolean(str3));
                        boolean z11 = bundle12.getBoolean(str3);
                        String sdkPackageByPackageUUID3 = SdksMapping.getSdkPackageByPackageUUID(str3);
                        if (sdkPackageByPackageUUID3 != null) {
                            Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle identified UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z11);
                            com.safedk.android.analytics.brandsafety.creatives.a aVarI3 = CreativeInfoManager.i(sdkPackageByPackageUUID3);
                            if (aVarI3 != null) {
                                aVarI3.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, z11);
                                Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z11);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                Logger.d(P, "parseSettings sdkSpecificCachedCIExpirationBundle Exception : " + th4.getMessage(), th4);
            }
        } else {
            this.aS = L;
            this.aT = 20;
            Logger.d(P, "parseSettings AD_CACHING settings block does not exist. Default configuration values will be used.");
        }
        return true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Logger.d(P, "Attempting to parse sdk specific uniformity threshold. setting : " + jSONObject);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int i10 = jSONObject.getInt(next);
                String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(next);
                if (sdkPackageByPackageUUID != null) {
                    Logger.d(P, "Parse sdk specific uniformity threshold setting identified, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i10);
                    com.safedk.android.analytics.brandsafety.creatives.a aVarI = CreativeInfoManager.i(sdkPackageByPackageUUID);
                    if (aVarI != null) {
                        aVarI.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, i10);
                        Logger.d(P, "Parse sdk specific uniformity threshold set, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i10);
                    }
                }
            }
            return;
        }
        Logger.d(P, "Cannot parse sdk specific uniformity setting, json is null");
    }

    private void a(Bundle bundle) {
        Logger.d(P, "processSdkVersionsBundle started, bundle=" + bundle.toString());
    }

    private void a(ArrayList<String> arrayList) {
        this.aq.clear();
        for (String str : arrayList) {
            Logger.d(P, "Adding cacheSupportingSDKUUID " + str + " to cacheSupportedSdk List");
            this.aq.add(str);
        }
    }

    private String a(String str) {
        if (str != null && str.length() > 0) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                int port = url.getPort();
                if (port == -1) {
                    str = String.format("%s://%s", protocol, host);
                } else {
                    str = String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
                }
            } catch (MalformedURLException e10) {
                Logger.e(P, "Exception sanitizing server url:" + e10.getMessage(), e10);
            }
        }
        return str;
    }

    private boolean a(Double d10, String str) {
        Logger.d(P, "checkActivePercent started, activePercent=" + d10 + ", userId=" + str);
        float fA = DeviceData.a("", str);
        Logger.d(P, "checkActivePercent hashValue ==" + fA);
        return ((double) fA) <= d10.doubleValue();
    }

    public long J() {
        return this.aS;
    }

    public int K() {
        return this.aT;
    }

    public ArrayList<String> L() {
        return this.aq;
    }
}
