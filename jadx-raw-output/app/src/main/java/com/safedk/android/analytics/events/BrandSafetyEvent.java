package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class BrandSafetyEvent extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44573a = "click_url";
    public static final String aI = "revenue_event";
    public static final String aJ = "is_redirect";
    public static final String aK = "is_expand";
    public static final String aL = "is_auto_expand";
    public static final String aM = "redirect_url";
    public static final String aN = "redirect_request_url";
    public static final String aO = "redirect_type";
    private static final String a_ = "BrandSafetyEvent";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public static final String f44575ac = "max_network_name";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static final String f44576ad = "network_name";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public static final String f44577ae = "dsp_name";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public static final String f44578af = "custom_js_network_name";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public static final String f44579ag = "is_first_session";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public static final String f44580ah = "event_id";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f44581ao = "max_creative_id";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f44582ap = "creative_id";
    public static final String aq = "did_fail_display_received";
    public static final String ar = "will_display_received";
    public static final String as = "is_banner_view_detected";
    public static final String at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";
    public static final String aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44583b = "foreground_activity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44584c = "impression_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44585d = "viewing_time";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44587f = "zone_id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44588g = "app_package_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44589h = "dsp_domains";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44590i = "ad_format";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44591j = "ad_format_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f44592k = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f44594m = "sdk_version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f44595n = "impression";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f44596o = "image_file_size";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f44597p = "image_uniformity";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f44598q = "image_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f44599r = "image_orientation";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f44600s = "is_animated";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f44601t = "is_clicked";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f44602u = "ad_recommendations";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f44603v = "is_next_session";
    private int L;
    private String M;
    private String N;
    private transient Bundle O;
    private String P;
    private String Q;
    private long R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private String W;
    private boolean X;
    private long Y;
    private float Z;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    String aP;
    HashSet<String> aQ;
    HashSet<String> aR;
    private String aS;
    private String aT;
    private String aU;
    private boolean aV;
    private RedirectData aW;
    private int aX;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private BrandSafetyUtils.ScreenShotOrientation f44604aa;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private boolean f44605ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private boolean f44606aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private int f44607ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private long f44608al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private float f44609am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private String f44610an;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44586e = "slot_number";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f44593l = "max_ad_unit_id";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final Set<String> f44574ab = new HashSet(Arrays.asList("impression_id", StatsEvent.f44666z, "sdk_uuid", f44586e, "ad_format_type", "zone_id", f44593l));

    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public String a() {
        return this.W;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, long viewingTime, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean isAnimated, long imageFileSize, float imageUniformity, int imageSlot, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, HashSet<String> resourceUrlList, HashSet<String> dspUrlList, boolean isScarAdMobAd) {
        super(sdk, StatsCollector.EventType.BrandSafety);
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aP = null;
        this.aF = false;
        this.aG = false;
        this.aV = false;
        this.f44605ai = false;
        this.f44606aj = false;
        this.f44607ak = 0;
        this.f44608al = 0L;
        this.f44609am = 0.0f;
        this.f44610an = null;
        this.aH = false;
        this.aW = null;
        this.aX = 0;
        synchronized (this) {
            this.L = slotNumber;
            if (timestamp > 0) {
                this.G = k.b(timestamp);
            }
            Logger.d(a_, "BrandSafetyEvent ctor creative info: " + creativeInfo + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            if (creativeInfo != null) {
                if (creativeInfo.Q().equals(sdk)) {
                    Logger.d(a_, "creative info sdk is equal to event SDK");
                    this.N = creativeInfo.G();
                    this.O = creativeInfo.d();
                    Logger.d(a_, "addedCreativeInfoValues " + this.O);
                    if (clickUrl == null) {
                        Logger.d(a_, "self click url is null, setting creative info click url");
                        clickUrl = creativeInfo.M();
                    }
                    Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                } else {
                    Logger.d(a_, "creative info sdk != sdk. creative info sdk: " + creativeInfo.Q() + ", actual sdk: " + creativeInfo.R() + ", sdk: " + sdk);
                }
                if (resourceUrlList != null) {
                    creativeInfo.b(new ArrayList<>(resourceUrlList));
                }
                if (dspUrlList != null) {
                    creativeInfo.a(new ArrayList<>(dspUrlList));
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + resourceUrlList);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + dspUrlList);
            } else {
                boolean zA = CreativeInfoManager.a(sdk, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                Logger.d(a_, "the don't report webview resource is: " + zA);
                if (!zA) {
                    if (resourceUrlList != null) {
                        this.aQ.addAll(resourceUrlList);
                    }
                    if (dspUrlList != null) {
                        this.aR.addAll(dspUrlList);
                    }
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + resourceUrlList);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + dspUrlList);
            }
            if (clickUrl != null && !clickUrl.isEmpty()) {
                clickUrl = i.a(clickUrl);
            }
            this.M = clickUrl;
            this.V = clicked;
            this.P = foregroundActivityName;
            this.Q = impressionMd5;
            this.aS = multiAdUuid;
            this.R = viewingTime;
            this.aB = maxCreativeId;
            if (applovinData != null) {
                this.S = applovinData.getString(f44593l);
                this.aA = applovinData.getString(f44576ad);
                this.T = b(applovinData.getString("ad_format"));
                this.U = applovinData.getString(f44592k);
                this.aC = applovinData.getString("dsp_name");
                this.aD = applovinData.getString(f44578af);
                if (maxCreativeId == null) {
                    this.aB = applovinData.getString("creative_id");
                }
            }
            this.I = isMature;
            if (creativeInfo != null) {
                this.W = hashValue;
                this.f44604aa = screenShotOrientation;
                this.X = isAnimated;
                if (hashValue != null) {
                    this.Y = imageFileSize;
                    this.Z = imageUniformity;
                    this.f44607ak = imageSlot;
                }
            }
            this.az = isFirstSession;
            if (eventId != null) {
                Logger.d(a_, "eventId = " + eventId);
                this.aE = eventId;
            }
            this.aF = didFailDisplayReceived;
            this.aT = debugInfo;
            this.aU = impressionLog;
            this.aP = revenueEventValue;
            this.aH = isScarAdMobAd;
            Logger.d(a_, "Revenue event value = " + revenueEventValue);
            if (creativeInfo != null && isMature) {
                creativeInfo.a((String) null, (String) null);
            }
        }
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isBannerViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> resourceUrlList, HashSet<String> dspUrlList) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, resourceUrlList, dspUrlList, isScarAdMobAd);
        this.aG = true;
        this.f44605ai = willDisplayReceived;
        this.f44606aj = isBannerViewDetected;
        this.f44608al = intervalBetweenDisplayMessages;
        this.f44609am = detectedViewProportions;
        this.f44610an = deviceOrientation;
        this.aW = redirectData;
        this.aX = redirectCount;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isAdViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, (HashSet<String>) null, (HashSet<String>) null, false);
        this.aV = true;
        this.f44605ai = willDisplayReceived;
        this.f44606aj = isAdViewDetected;
        this.f44608al = intervalBetweenDisplayMessages;
        this.f44609am = detectedViewProportions;
        this.f44610an = deviceOrientation;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return this.Q;
    }

    public void d() {
        this.W = null;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized void a(StatsEvent statsEvent) {
        boolean z10 = false;
        synchronized (this) {
            BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
            Logger.d(a_, "doAggregation removing resource urls list and dsp urls list. local resourceUrlList = " + this.aQ + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            Bundle bundle = brandSafetyEvent.O;
            if (bundle != null) {
                Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=" + bundle);
                this.O = bundle;
                this.N = brandSafetyEvent.N;
            } else {
                Logger.d(a_, "webview_resource_urls doAggregation setting resource urls list and dsp urls list.");
                if (brandSafetyEvent.aQ != null) {
                    this.aQ.addAll(brandSafetyEvent.aQ);
                }
                if (brandSafetyEvent.aR != null) {
                    this.aR.addAll(brandSafetyEvent.aR);
                }
            }
            String str = brandSafetyEvent.M;
            if (!TextUtils.isEmpty(str)) {
                this.M = str;
            }
            long j10 = statsEvent.j();
            if (j10 != 0 && j10 < this.G) {
                this.G = j10;
            }
            long j11 = brandSafetyEvent.R;
            if (j11 > 0 && j11 > this.R) {
                this.R = j11;
            }
            if (brandSafetyEvent.W != null) {
                Logger.d(a_, "doAggregation updating screenShotHashValue to '" + brandSafetyEvent.W + "' , image_file_size to " + brandSafetyEvent.Y + " and image_max_uniform_pixels to " + brandSafetyEvent.Z);
                this.W = brandSafetyEvent.W;
                this.Y = brandSafetyEvent.Y;
                this.Z = brandSafetyEvent.Z;
                this.f44607ak = brandSafetyEvent.f44607ak;
                BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.f44604aa;
                if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                    Logger.d(a_, "doAggregation updating screenShotOrientation to '" + screenShotOrientation + "'");
                    this.f44604aa = screenShotOrientation;
                }
            } else {
                Logger.d(a_, "doAggregation updating image hash to null");
                this.W = null;
                this.Y = 0L;
                this.f44607ak = 0;
                this.f44604aa = null;
                this.Z = 0.0f;
            }
            boolean z11 = brandSafetyEvent.V;
            if (z11) {
                if (z11 && brandSafetyEvent.aS == null) {
                    z10 = true;
                }
                this.V = z10;
                Logger.d(a_, "doAggregation updating clicked to " + this.V);
            } else if (brandSafetyEvent.aS != null) {
                this.V = false;
                Logger.d(a_, "doAggregation reset clicked due to multi ad");
            }
            this.X = brandSafetyEvent.X;
            this.aB = brandSafetyEvent.aB;
            this.aS = brandSafetyEvent.aS;
            if (this.aE == null && brandSafetyEvent.aE != null) {
                this.aE = brandSafetyEvent.aE;
                Logger.d(a_, "doAggregation updating eventId to " + this.aE);
            }
            if (this.C != null && !this.C.equals(brandSafetyEvent.C) && this.O != null) {
                Logger.d(a_, "doAggregation incompatible SDK. current: " + this.C + ", new: " + brandSafetyEvent.C);
                this.O.putString(CreativeInfo.f44325g, this.O.getString(CreativeInfo.f44325g, "") + "|sdk=" + this.C + ";newSdk=" + brandSafetyEvent.C);
            }
            if (this.aP == null && brandSafetyEvent.aP != null) {
                this.aP = brandSafetyEvent.aP;
                Logger.d(a_, "doAggregation updating revenueEventValue to " + this.aP);
            }
            if (this.P == null) {
                this.P = brandSafetyEvent.P;
                Logger.d(a_, "doAggregation updating foregroundActivityName to " + this.P);
            }
            this.f44605ai = brandSafetyEvent.f44605ai;
            this.f44606aj = brandSafetyEvent.f44606aj;
            this.f44608al = brandSafetyEvent.f44608al;
            this.aW = brandSafetyEvent.aW;
            this.aX = brandSafetyEvent.aX;
            this.f44609am = brandSafetyEvent.f44609am;
            this.aT = brandSafetyEvent.aT;
            this.aU = brandSafetyEvent.aU;
            this.aF = brandSafetyEvent.aF;
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized Bundle e() {
        Bundle bundleE;
        bundleE = super.e();
        if (this.L > 0) {
            bundleE.putInt(f44586e, this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            bundleE.putString("click_url", this.M);
        }
        if (this.O != null) {
            bundleE.putAll(this.O);
        } else if (this.aH) {
            bundleE.putString(CreativeInfo.f44335q, "/scar-admob");
        } else {
            Logger.d(a_, "toBundle webview_resource_urls : dspUrlList = " + this.aR + " , resourceUrlList = " + this.aQ);
            if (this.aQ != null && !this.aQ.isEmpty()) {
                bundleE.putStringArrayList(CreativeInfo.f44343y, new ArrayList<>(this.aQ));
            }
            if (this.aR != null && !this.aR.isEmpty()) {
                bundleE.putStringArrayList(f44589h, new ArrayList<>(this.aR));
            }
        }
        if (!TextUtils.isEmpty(this.P)) {
            bundleE.putString("foreground_activity", this.P);
        }
        bundleE.putString("impression_id", this.Q);
        if (this.aS != null) {
            bundleE.putString(ay, this.aS);
        }
        if (this.R > 0) {
            bundleE.putLong(f44585d, this.R);
        }
        if (this.S != null) {
            bundleE.putString(f44593l, this.S);
        }
        if (this.aA != null) {
            bundleE.putString(f44575ac, this.aA);
        }
        if (this.aB != null) {
            bundleE.putString(f44581ao, this.aB);
        }
        if (this.aD != null) {
            bundleE.putString(f44578af, this.aD);
        }
        if (this.aC != null && !bundleE.containsKey(CreativeInfo.L)) {
            bundleE.putString(CreativeInfo.L, this.aC);
        }
        if (this.C != null) {
            if (bundleE.getString("ad_format_type") == null || "com.unity3d.ads".equals(this.C) || g.f44970p.equals(this.C)) {
                bundleE.putString("ad_format_type", this.T);
            }
            if (bundleE.getString("zone_id") == null || "com.unity3d.ads".equals(this.C) || g.f44970p.equals(this.C)) {
                bundleE.putString("zone_id", this.U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (bundleE.getString("ad_format_type") == null && this.aW != null && this.aW.f43723k != null) {
            bundleE.putString("ad_format_type", this.aW.f43723k.name());
        }
        bundleE.putString(StatsEvent.f44666z, "impression");
        if (this.W != null) {
            bundleE.putString("image_id", this.W);
            if (!this.aG && !this.aV) {
                bundleE.putBoolean(f44600s, this.X);
            }
            if (this.f44604aa != null) {
                bundleE.putString("image_orientation", this.f44604aa.name().toLowerCase());
            }
            bundleE.putLong(f44596o, this.Y);
            bundleE.putFloat(f44597p, this.Z);
            bundleE.putInt(at, this.f44607ak);
        }
        bundleE.putBoolean(f44601t, this.V);
        bundleE.putBoolean(f44603v, this.J);
        if (!TextUtils.isEmpty(this.aT)) {
            String string = bundleE.getString(CreativeInfo.f44325g);
            if (string != null) {
                bundleE.putString(CreativeInfo.f44325g, string + ImpressionLog.P + this.aT);
            } else {
                bundleE.putString(CreativeInfo.f44325g, this.aT);
            }
        }
        if (!TextUtils.isEmpty(this.aU)) {
            bundleE.putString(CreativeInfo.f44317an, this.aU);
        }
        if (this.aG || this.aV) {
            bundleE.putBoolean(ar, this.f44605ai);
            bundleE.putBoolean(as, this.f44606aj);
            if (this.aG) {
                bundleE.putLong(au, this.f44608al);
            }
            if (this.f44609am > 0.0f) {
                bundleE.putFloat(av, this.f44609am);
            }
            bundleE.putString(aw, this.f44610an);
            if (this.aG && this.aW != null) {
                if (this.aW.f43713a && this.aW.f43715c) {
                    bundleE.putBoolean("is_redirect", true);
                }
                if (this.aW.f43714b && !this.aW.f43715c) {
                    bundleE.putBoolean(aK, true);
                }
                if (this.aW.f43714b && this.aW.f43715c) {
                    bundleE.putBoolean(aL, true);
                }
                if (!TextUtils.isEmpty(this.aW.f43716d)) {
                    bundleE.putString("redirect_url", this.aW.f43716d);
                }
                if (!TextUtils.isEmpty(this.aW.f43717e)) {
                    bundleE.putString(aN, this.aW.f43717e);
                }
                if (!TextUtils.isEmpty(this.aW.f43718f)) {
                    bundleE.putString("redirect_type", this.aW.f43718f);
                }
                this.aW.a("RedirectCount=" + this.aX);
                if (!TextUtils.isEmpty(this.aW.f43720h)) {
                    String string2 = bundleE.getString(CreativeInfo.f44325g);
                    if (string2 != null) {
                        bundleE.putString(CreativeInfo.f44325g, string2 + ImpressionLog.P + this.aW.f43720h);
                    } else {
                        bundleE.putString(CreativeInfo.f44325g, this.aW.f43720h);
                    }
                }
            }
        }
        bundleE.putBoolean(f44579ag, this.az);
        if (this.aE != null) {
            bundleE.putString("event_id", this.aE);
        }
        bundleE.putBoolean(aq, this.aF);
        if (this.aP != null) {
            bundleE.putString("revenue_event", this.aP);
        }
        return bundleE;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> f() {
        HashSet hashSet = new HashSet(f44574ab);
        if (this.C != null && this.C.equals(g.f44962h)) {
            hashSet.add("click_url");
        }
        return hashSet;
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.O != null) {
            objectOutputStream.writeObject(a(this.O));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            Map map = (Map) objectInputStream.readObject();
            if (map != null) {
                this.O = a((Map<String, Object>) map);
            }
        } catch (OptionalDataException e10) {
            if (e10.eof && e10.length == 0) {
                Logger.d(a_, "OptionalDataException in readObject (due to no CI object)");
            } else {
                Logger.d(a_, "OptionalDataException in readObject: eof: " + e10.eof + ", length: " + e10.length, e10);
            }
        }
    }

    private static Map<String, Object> a(Bundle bundle) {
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private String b(String str) {
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=" + str);
        String string = null;
        if (BrandSafetyUtils.f43547j.equals(str)) {
            string = AdFormatType.INTER.toString();
        } else if (BrandSafetyUtils.f43548k.equals(str)) {
            string = AdFormatType.REWARD.toString();
        } else if ("BANNER".equals(str) || BrandSafetyUtils.f43551n.equals(str)) {
            string = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.f43549l.equals(str)) {
            string = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.f43552o.equals(str)) {
            string = AdFormatType.MREC.toString();
        } else if ("NATIVE".equals(str)) {
            string = AdFormatType.NATIVE.toString();
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  " + string);
        return string;
    }

    public String g() {
        return this.aP;
    }

    public void a(String str) {
        this.aP = str;
    }
}
