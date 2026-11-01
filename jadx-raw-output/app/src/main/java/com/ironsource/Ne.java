package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Ne {
    public static final boolean A = false;
    public static final String A0 = "waitUntilAllProvidersFinishInit";
    public static final String A1 = "providerNetworkKey";
    public static final int B = 60;
    public static final String B0 = "sharedManagersThread";
    public static final String B1 = "spId";
    public static final int C = 10000;
    public static final String C0 = "parallelLoad";
    public static final String C1 = "mpis";
    public static final int D = 10000;
    public static final String D0 = "bidderExclusive";
    public static final String D1 = "auction";
    public static final int E = -1;
    public static final String E0 = "adapterTimeOutInSeconds";
    public static final String E1 = "auctionData";
    public static final int F = 5000;
    public static final String F0 = "atim";
    public static final String F1 = "auctioneerURL";
    public static final int G = 3;
    public static final String G0 = "bannerInterval";
    public static final String G1 = "extAuctioneerURL";
    public static final int H = 3;
    public static final String H0 = "isOneFlow";
    public static final String H1 = "objectPerWaterfall";
    public static final int I = 3;
    public static final String I0 = "expiredDurationInMinutes";
    public static final String I1 = "minTimeBeforeFirstAuction";
    public static final int J = 0;
    public static final String J0 = "server";
    public static final String J1 = "timeToWaitBeforeAuction";
    public static final int K = 2;
    public static final String K0 = "publisher";
    public static final String K1 = "timeToWaitBeforeLoad";
    public static final int L = 15;
    public static final String L0 = "console";
    public static final String L1 = "auctionRetryInterval";
    public static final long M = 10000;
    public static final String M0 = "sendUltraEvents";
    public static final String M1 = "isLoadWhileShow";
    public static final long N = 3000;
    public static final String N0 = "sendEventsToggle";
    public static final String N1 = "auctionTrials";
    public static final boolean O = false;
    public static final String O0 = "eventsCompression";
    public static final String O1 = "auctionTimeout";
    public static final boolean P = false;
    public static final String P0 = "eventsCompressionLevel";
    public static final String P1 = "auctionSavedHistory";
    public static final int Q = 30000;
    public static final String Q0 = "serverEventsURL";
    public static final String Q1 = "disableLoadWhileShowSupportFor";
    public static final int R = -1;
    public static final String R0 = "serverEventsType";
    public static final String R1 = "tokenPerAdapter";
    public static final int S = 5000;
    public static final String S0 = "backupThreshold";
    public static final String S1 = "enableAuctionFallback";
    public static final int T = 1;
    public static final String T0 = "maxNumberOfEvents";
    public static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    public static final boolean U = false;
    public static final String U0 = "maxEventsPerBatch";
    public static final String U1 = "compressAuctionRequest";
    public static final int V = 15000;
    public static final String V0 = "optOut";
    public static final String V1 = "compressAuctionResponse";
    public static final int W = 15000;
    public static final String W0 = "optIn";
    public static final String W1 = "encryptionVersion";
    public static final String X = "providerOrder";
    public static final String X0 = "triggerEvents";
    public static final String X1 = "shouldSendBannerBURLFromImpression";
    public static final String Y = "providerSettings";
    public static final String Y0 = "nonConnectivityEvents";
    public static final String Y1 = "impressionTimeout";
    public static final String Z = "configurations";
    public static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    public static final String Z1 = "optInKeys";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f27115a0 = "genericParams";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f27116a1 = "pixel";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f27117a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f27118b0 = "adUnits";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f27119b1 = "pixelEventsUrl";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f27120b2 = "compressToken";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f27121c0 = "providerLoadName";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f27122c1 = "pixelEventsEnabled";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f27123c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f27124d0 = "application";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f27125d1 = "placements";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f27126d2 = "instanceType";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f27127e0 = "rewardedVideo";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f27128e1 = "placementId";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f27129e2 = "maxAdsPerSession";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f27130f0 = "interstitial";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f27131f1 = "placementName";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f27132f2 = "reward";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f27133g0 = "banner";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f27134g1 = "delivery";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final String f27135g2 = "name";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f27136h0 = "nativeAd";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f27137h1 = "isDefault";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f27138h2 = "amount";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f27139i0 = "integration";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f27140i1 = "capping";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f27141i2 = "bannerRefreshRate";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f27142j0 = "loggers";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f27143j1 = "pacing";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f27144j2 = "protocolVersion";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f27145k0 = "segment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f27146k1 = "enabled";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f27147k2 = "adFormats";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f27148l = "appKey";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f27149l0 = "events";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f27150l1 = "maxImpressions";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f27151l2 = "adUnits";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f27152m = "userId";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f27153m0 = "crashReporter";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f27154m1 = "numOfSeconds";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f27155m2 = "rewarded";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f27156n = "response";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f27157n0 = "token";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f27158n1 = "unit";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f27159o = "error";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f27160o0 = "external";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f27161o1 = "virtualItemName";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27162p = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f27163p0 = "mediationTypes";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f27164p1 = "virtualItemCount";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f27165q = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f27166q0 = "providerDefaultInstance";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final String f27167q1 = "uuidEnabled";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f27168r = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f27169r0 = "testSuite";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f27170r1 = "abt";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f27171s = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f27172s0 = "controllerUrl";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f27173s1 = "delayLoadFailure";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f27174t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f27175t0 = "AdQuality";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f27176t1 = "keysToInclude";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f27177u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f27178u0 = "initMode";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f27179u1 = "reporterURL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f27180v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f27181v0 = "adq_init_blob";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f27182v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f27183w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f27184w0 = "settings";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f27185w1 = "includeANR";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f27186x = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f27187x0 = "collectBiddingDataTimeout";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f27188x1 = "timeout";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f27189y = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f27190y0 = "providers";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f27191y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f27192z = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f27193z0 = "parallelInit";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f27194z1 = "adSourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3821zd f27195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Cd f27196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T3 f27197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f27200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f27201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f27202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P7.a f27203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Q5 f27205k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27210a;

        public String b() {
            return this.f27210a;
        }

        a(String str) {
            this.f27210a = str;
        }
    }

    public Ne(Context context, String str, String str2, String str3) {
        this.f27202h = a.NOT_SET;
        this.f27204j = false;
        this.f27201g = context;
        this.f27203i = Lb.O().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f27200f = IronSourceVideoBridge.jsonObjectInit();
            } else {
                this.f27200f = IronSourceVideoBridge.jsonObjectInit(str3);
            }
            this.f27204j = o();
            t();
            r();
            s();
            this.f27198d = TextUtils.isEmpty(str) ? "" : str;
            this.f27199e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f27200f);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            a();
        }
    }

    public static a a(Ne ne2) {
        return ne2 != null ? ne2.i() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.f27205k = new Q5(jSONObject.optJSONObject(C3754ve.f31473d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C3497h3 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f27137h1, false);
            C3507hd c3507hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                C3497h3 c3497h3 = new C3497h3(iOptInt, strOptString, zOptBoolean, c3507hdA);
                if (c3507hdA == null) {
                    return c3497h3;
                }
                this.f27203i.b(this.f27201g, c3497h3, IronSource.a.BANNER);
                return c3497h3;
            }
        }
        return null;
    }

    private C3398bc f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f27137h1, false);
            C3507hd c3507hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                C3398bc c3398bc = new C3398bc(iOptInt, strOptString, zOptBoolean, c3507hdA);
                if (c3507hdA == null) {
                    return c3398bc;
                }
                this.f27203i.b(this.f27201g, c3398bc, IronSource.a.NATIVE_AD);
                return c3398bc;
            }
        }
        return null;
    }

    private boolean o() {
        int iOptInt;
        try {
            iOptInt = this.f27200f.optInt(f27144j2, 0);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00af  */
    private void r() {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str5;
        Zd zd2;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONObject jSONObject3;
        String str10;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        String str11;
        H9 h10;
        String str12;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        String str13;
        String str14;
        String str15;
        String str16;
        JSONObject jSONObject8;
        U2 u10;
        String str17;
        String str18;
        String str19;
        U2 u11;
        Qb qb2;
        boolean zOptBoolean;
        String str20;
        JSONObject jSONObjectC;
        C3641p2 c3641p2;
        JSONObject jSONObjectC2;
        C3641p2 c3641p3;
        JSONObject jSONObjectC3;
        C3641p2 c3641p4;
        C3641p2 c3641p5;
        try {
            JSONObject jSONObjectC4 = c(this.f27200f, "configurations");
            JSONObject jSONObjectC5 = c(jSONObjectC4, b());
            JSONObject jSONObjectC6 = c(jSONObjectC4, "application");
            JSONObject jSONObjectC7 = c(jSONObjectC5, m());
            JSONObject jSONObjectC8 = c(jSONObjectC5, "interstitial");
            JSONObject jSONObjectC9 = c(jSONObjectC5, "banner");
            JSONObject jSONObjectC10 = c(jSONObjectC5, "nativeAd");
            JSONObject jSONObjectC11 = c(jSONObjectC6, "events");
            JSONObject jSONObjectC12 = c(jSONObjectC6, "loggers");
            JSONObject jSONObjectC13 = c(jSONObjectC6, "token");
            JSONObject jSONObjectC14 = c(jSONObjectC6, "segment");
            JSONObject jSONObjectC15 = c(jSONObjectC6, "auction");
            JSONObject jSONObjectC16 = c(jSONObjectC6, "crashReporter");
            JSONObject jSONObjectC17 = c(jSONObjectC6, "settings");
            JSONObject jSONObjectC18 = c(jSONObjectC6, "external");
            JSONObject jSONObjectC19 = c(jSONObjectC11, f27116a1);
            if (jSONObjectC6 != null) {
                IronSourceUtils.b(this.f27201g, "uuidEnabled", jSONObjectC6.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectC11 != null) {
                String strOptString = jSONObjectC11.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    Lb.U().q().a(strOptString);
                    J9.i().a(strOptString);
                    C3400be.i().a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            H1 h1A = a(jSONObjectC11, Boolean.valueOf(jSONObjectC11.optBoolean("sendUltraEvents", false)));
            String str21 = B0;
            String str22 = A0;
            String str23 = f27173s1;
            String str24 = O1;
            String str25 = f27187x0;
            String str26 = P1;
            String str27 = "auctionTrials";
            String str28 = E1;
            String str29 = G1;
            String str30 = "";
            if (jSONObjectC7 != null) {
                str5 = F1;
                JSONArray jSONArrayOptJSONArray = jSONObjectC7.optJSONArray("placements");
                str3 = "placements";
                JSONObject jSONObjectC20 = c(jSONObjectC7, "events");
                str2 = "events";
                JSONObject jSONObjectD = d(jSONObjectC7, f27190y0);
                str4 = f27190y0;
                long jOptLong = jSONObjectC7.optLong(f27187x0, 3000L);
                boolean zOptBoolean2 = jSONObjectD.optBoolean(f27193z0, false);
                boolean zOptBoolean3 = jSONObjectD.optBoolean(A0, false);
                boolean zOptBoolean4 = jSONObjectC7.optBoolean(B0, true);
                int iA = a(jSONObjectC7, jSONObjectC6, "parallelLoad", 2);
                boolean zA = a(jSONObjectC7, jSONObjectC6, "bidderExclusive", true);
                int iA2 = a(jSONObjectC7, jSONObjectC6, E0, 60);
                int iA3 = a(jSONObjectC7, jSONObjectC6, "expiredDurationInMinutes", -1);
                int iA4 = a(jSONObjectC7, jSONObjectC6, f27173s1, 3);
                boolean zA2 = a(jSONObjectC7, jSONObjectC6, "isOneFlow", false);
                JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC20, jSONObjectC11);
                H1 h1A2 = a(jSONObjectB, Boolean.valueOf(jSONObjectB.optBoolean("sendUltraEvents", false)));
                if (jSONObjectC15 != null) {
                    JSONObject jSONObjectC21 = c(jSONObjectC15, m());
                    jSONObject = jSONObjectC15;
                    jSONObject2 = jSONObjectC11;
                    C3641p2 c3641p6 = new C3641p2(jSONObjectC15.optString(E1, ""), jSONObjectC15.optString(str5, ""), jSONObjectC15.optString(str29, ""), jSONObjectC15.optInt(str27, 2), jSONObjectC15.optInt(str26, 15), jSONObjectC15.optLong(str24, 10000L), jSONObjectC21.optInt(I1, 2000), jSONObjectC21.optInt(L1, 30000), jSONObjectC21.optInt(J1, 5000), jSONObjectC21.optInt(K1, 50), jSONObjectC21.optBoolean("isLoadWhileShow", true), jSONObjectC21.optInt(T1, 30000), jSONObjectC15.optBoolean(U1, false), jSONObjectC15.optBoolean(V1, false), jSONObjectC21.optBoolean(H1, false), jSONObjectC15.optInt(W1, 1), false, jSONObjectC15.optBoolean(R1, true), jSONObjectC21.optBoolean(S1, true));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectC21.optJSONArray(Q1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str29 = str29;
                        str27 = str27;
                        str5 = str5;
                        str24 = str24;
                        str26 = str26;
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            c3641p6.a(jSONArrayOptJSONArray2.optString(i10));
                        }
                    }
                    str29 = str29;
                    str27 = str27;
                    str5 = str5;
                    str24 = str24;
                    str26 = str26;
                    c3641p5 = c3641p6;
                } else {
                    jSONObject2 = jSONObjectC11;
                    jSONObject = jSONObjectC15;
                    c3641p5 = new C3641p2();
                }
                zd2 = new Zd(iA, zA, iA2, iA3, h1A2, c3641p5, iA4, zA2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        C3489gd c3489gdG = g(jSONArrayOptJSONArray.optJSONObject(i11));
                        if (c3489gdG != null) {
                            zd2.a(c3489gdG);
                        }
                    }
                }
            } else {
                str2 = "events";
                str3 = "placements";
                str4 = f27190y0;
                jSONObject = jSONObjectC15;
                str28 = E1;
                str30 = "";
                jSONObjectC6 = jSONObjectC6;
                str23 = f27173s1;
                jSONObject2 = jSONObjectC11;
                str21 = B0;
                str22 = A0;
                str5 = F1;
                zd2 = null;
            }
            if (jSONObjectC8 != null) {
                str7 = str3;
                JSONArray jSONArrayOptJSONArray3 = jSONObjectC8.optJSONArray(str7);
                str8 = str2;
                JSONObject jSONObjectC22 = c(jSONObjectC8, str8);
                str9 = str4;
                JSONObject jSONObjectD2 = d(jSONObjectC8, str9);
                long jOptLong2 = jSONObjectC8.optLong(f27187x0, 3000L);
                boolean zOptBoolean5 = jSONObjectD2.optBoolean(f27193z0, false);
                str22 = str22;
                boolean zOptBoolean6 = jSONObjectD2.optBoolean(str22, false);
                str11 = str21;
                boolean zOptBoolean7 = jSONObjectC8.optBoolean(str11, true);
                jSONObject4 = jSONObjectC6;
                int iA5 = a(jSONObjectC8, jSONObject4, "parallelLoad", 2);
                boolean zA3 = a(jSONObjectC8, jSONObject4, "bidderExclusive", false);
                int iA6 = a(jSONObjectC8, jSONObject4, E0, 60);
                str10 = str23;
                int iA7 = a(jSONObjectC8, jSONObject4, str10, 3);
                boolean zA4 = a(jSONObjectC8, jSONObject4, "isOneFlow", false);
                jSONObject5 = jSONObject2;
                H1 h1A3 = a(IronSourceUtils.b(jSONObjectC22, jSONObject5), Boolean.FALSE);
                if (jSONObject != null) {
                    jSONObject3 = jSONObject;
                    JSONObject jSONObjectC23 = c(jSONObject3, "interstitial");
                    String str31 = str28;
                    String str32 = str30;
                    String strOptString2 = jSONObject3.optString(str31, str32);
                    str28 = str31;
                    String str33 = str5;
                    String strOptString3 = jSONObject3.optString(str33, str32);
                    String str34 = str29;
                    String strOptString4 = jSONObject3.optString(str34, str32);
                    str29 = str34;
                    str5 = str33;
                    String str35 = str27;
                    int iOptInt = jSONObject3.optInt(str35, 2);
                    str27 = str35;
                    str6 = str26;
                    str30 = str32;
                    String str36 = str24;
                    str24 = str36;
                    c3641p4 = new C3641p2(strOptString2, strOptString3, strOptString4, iOptInt, jSONObject3.optInt(str6, 15), jSONObject3.optLong(str36, 10000L), jSONObjectC23.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject3.optBoolean(U1, false), jSONObject3.optBoolean(V1, false), true, jSONObject3.optInt(W1, 1), false, jSONObject3.optBoolean(R1, true), jSONObjectC23.optBoolean(S1, true));
                } else {
                    str6 = str26;
                    jSONObject3 = jSONObject;
                    c3641p4 = new C3641p2();
                }
                h10 = new H9(iA5, zA3, iA6, h1A3, c3641p4, iA7, zA4, jOptLong2, zOptBoolean5, zOptBoolean6, zOptBoolean7);
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        M9 m9E = e(jSONArrayOptJSONArray3.optJSONObject(i12));
                        if (m9E != null) {
                            h10.a(m9E);
                        }
                    }
                }
            } else {
                str25 = f27187x0;
                str6 = str26;
                str7 = str3;
                str8 = str2;
                str9 = str4;
                jSONObject3 = jSONObject;
                str10 = str23;
                jSONObject4 = jSONObjectC6;
                jSONObject5 = jSONObject2;
                str11 = str21;
                zd2 = zd2;
                h10 = null;
            }
            if (jSONObjectC9 != null) {
                JSONArray jSONArrayOptJSONArray4 = jSONObjectC9.optJSONArray(str7);
                JSONObject jSONObjectC24 = c(jSONObjectC9, str8);
                JSONObject jSONObjectD3 = d(jSONObjectC9, str9);
                str12 = str6;
                str29 = str29;
                jSONObject6 = jSONObjectC19;
                JSONArray jSONArray = jSONArrayOptJSONArray4;
                str15 = str5;
                jSONObject7 = jSONObjectC18;
                str14 = str27;
                str16 = str28;
                long jA = a(jSONObjectC9, jSONObject4, F0, 10000L);
                int iA8 = a(jSONObjectC9, jSONObject4, str10, 3);
                int iOptInt2 = jSONObjectC9.optInt(G0, 60);
                long jOptLong3 = jSONObjectC9.optLong(Y1, 15000L);
                boolean zA5 = a(jSONObjectC9, jSONObject4, "isOneFlow", false);
                str13 = str25;
                long jOptLong4 = jSONObjectC9.optLong(str13, 3000L);
                boolean zOptBoolean8 = jSONObjectD3.optBoolean(f27193z0, false);
                str22 = str22;
                boolean zOptBoolean9 = jSONObjectD3.optBoolean(str22, false);
                boolean zOptBoolean10 = jSONObjectC9.optBoolean(str11, true);
                H1 h1A4 = a(IronSourceUtils.b(jSONObjectC24, jSONObject5), Boolean.FALSE);
                jSONObject8 = jSONObject3;
                if (jSONObject8 == null || (jSONObjectC3 = c(jSONObject8, "banner")) == null) {
                    C3641p2 c3641p7 = new C3641p2();
                    c3641p3 = c3641p7;
                } else {
                    String str37 = str30;
                    str16 = str16;
                    String strOptString5 = jSONObject8.optString(str16, str37);
                    String strOptString6 = jSONObject8.optString(str15, str37);
                    String strOptString7 = jSONObject8.optString(str29, str37);
                    str14 = str14;
                    int iOptInt3 = jSONObject8.optInt(str14, 2);
                    str29 = str29;
                    int iOptInt4 = jSONObject8.optInt(str12, 15);
                    str11 = str11;
                    str12 = str12;
                    String str38 = str24;
                    str30 = str37;
                    str22 = str22;
                    str13 = str13;
                    str24 = str38;
                    c3641p3 = new C3641p2(strOptString5, strOptString6, strOptString7, iOptInt3, iOptInt4, jSONObject8.optLong(str38, 10000L), jSONObjectC3.optInt(I1, 2000), jSONObjectC3.optInt(L1, 15000), jSONObjectC3.optInt(J1, 50), 0L, jSONObjectC3.optBoolean("isLoadWhileShow", false), 0, jSONObject8.optBoolean(U1, false), jSONObject8.optBoolean(V1, false), jSONObjectC3.optBoolean(H1, true), jSONObject8.optInt(W1, 1), jSONObjectC3.optBoolean(X1, true), jSONObject8.optBoolean(R1, true), jSONObjectC3.optBoolean(S1, true));
                }
                U2 u12 = new U2(1, jA, false, h1A4, iOptInt2, c3641p3, iA8, zA5, jOptLong4, zOptBoolean8, zOptBoolean9, zOptBoolean10, jOptLong3);
                if (jSONArray != null) {
                    int i13 = 0;
                    while (i13 < jSONArray.length()) {
                        JSONArray jSONArray2 = jSONArray;
                        C3497h3 c3497h3D = d(jSONArray2.optJSONObject(i13));
                        if (c3497h3D != null) {
                            u12.a(c3497h3D);
                        }
                        i13++;
                        jSONArray = jSONArray2;
                    }
                }
                u10 = u12;
            } else {
                str12 = str6;
                str11 = str11;
                jSONObject6 = jSONObjectC19;
                jSONObject7 = jSONObjectC18;
                str13 = str25;
                str14 = str27;
                str15 = str5;
                str16 = str28;
                str30 = str30;
                jSONObject8 = jSONObject3;
                u10 = null;
            }
            if (jSONObjectC10 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectC10.optJSONArray(str7);
                String str39 = str8;
                JSONObject jSONObjectC25 = c(jSONObjectC10, str39);
                JSONObject jSONObjectD4 = d(jSONObjectC10, str9);
                str18 = str30;
                str19 = str39;
                u11 = u10;
                String str40 = str14;
                str17 = str16;
                String str41 = str15;
                String str42 = str24;
                String str43 = str29;
                String str44 = str12;
                long jA2 = a(jSONObjectC10, jSONObject4, F0, 10000L);
                int iA9 = a(jSONObjectC10, jSONObject4, str10, 0);
                long jOptLong5 = jSONObjectC10.optLong(str13, 3000L);
                boolean zOptBoolean11 = jSONObjectD4.optBoolean(f27193z0, false);
                boolean zOptBoolean12 = jSONObjectD4.optBoolean(str22, false);
                boolean zOptBoolean13 = jSONObjectC10.optBoolean(str11, true);
                H1 h1A5 = a(IronSourceUtils.b(jSONObjectC25, jSONObject5), Boolean.FALSE);
                if (jSONObject8 == null || (jSONObjectC2 = c(jSONObject8, "nativeAd")) == null) {
                    C3641p2 c3641p8 = new C3641p2();
                    c3641p2 = c3641p8;
                } else {
                    str17 = str17;
                    str18 = str18;
                    c3641p2 = new C3641p2(jSONObject8.optString(str17, str18), jSONObject8.optString(str41, str18), jSONObject8.optString(str43, str18), jSONObject8.optInt(str40, 2), jSONObject8.optInt(str44, 15), jSONObject8.optLong(str42, 10000L), jSONObjectC2.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject8.optBoolean(U1, false), jSONObject8.optBoolean(V1, false), true, jSONObject8.optInt(W1, 1), false, jSONObject8.optBoolean(R1, true), jSONObjectC2.optBoolean(S1, true));
                }
                qb2 = new Qb(1, jA2, false, h1A5, c3641p2, iA9, jOptLong5, zOptBoolean11, zOptBoolean12, zOptBoolean13);
                if (jSONArrayOptJSONArray5 != null) {
                    for (int i14 = 0; i14 < jSONArrayOptJSONArray5.length(); i14++) {
                        C3398bc c3398bcF = f(jSONArrayOptJSONArray5.optJSONObject(i14));
                        if (c3398bcF != null) {
                            qb2.a(c3398bcF);
                        }
                    }
                }
            } else {
                str17 = str16;
                str18 = str30;
                str19 = str8;
                u11 = u10;
                qb2 = null;
            }
            C3384ag c3384ag = new C3384ag();
            if (jSONObjectC13 != null) {
                JSONArray jSONArrayOptJSONArray6 = jSONObjectC13.optJSONArray(Z1);
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i15 = 0; i15 < jSONArrayOptJSONArray6.length(); i15++) {
                        c3384ag.a(jSONArrayOptJSONArray6.optString(i15));
                    }
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectC13.optJSONObject(f27117a2);
                if (jSONObjectOptJSONObject != null) {
                    c3384ag.a(jSONObjectOptJSONObject);
                }
                c3384ag.a(jSONObjectC13.optBoolean(f27120b2, true));
            }
            C3453ed c3453ed = new C3453ed();
            JSONObject jSONObject9 = jSONObject6;
            if (jSONObject9 != null) {
                String strOptString8 = jSONObject9.optString(f27119b1, C3471fd.f28905a);
                zOptBoolean = jSONObject9.optBoolean(f27122c1, true);
                c3453ed.a(strOptString8);
            } else {
                zOptBoolean = true;
            }
            c3453ed.b(zOptBoolean);
            if (zOptBoolean) {
                c3453ed.b(a(jSONObject5, "optOut"));
                c3453ed.a(a(jSONObject5, "optIn"));
                c3453ed.a(jSONObject5.optBoolean("eventsCompression", false));
                c3453ed.a(jSONObject5.optInt("eventsCompressionLevel", -1));
            }
            O1 o10 = new O1(jSONObjectC12.optInt("server", 3), jSONObjectC12.optInt("publisher", 3), jSONObjectC12.optInt("console", 3), jSONObjectC12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            E1 e10 = new E1();
            if (jSONObjectC16 != null) {
                e10.a(jSONObjectC16.optBoolean("enabled", false));
                e10.c(jSONObjectC16.optString("reporterURL", str18));
                e10.b(jSONObjectC16.optString("reporterKeyword", str18));
                e10.c(jSONObjectC16.optBoolean("includeANR", false));
                e10.a(jSONObjectC16.optInt("timeout", 5000));
                e10.b(jSONObjectC16.optBoolean("setIgnoreDebugger", false));
                JSONArray jSONArrayOptJSONArray7 = jSONObjectC16.optJSONArray("keysToInclude");
                if (jSONArrayOptJSONArray7 != null) {
                    for (int i16 = 0; i16 < jSONArrayOptJSONArray7.length(); i16++) {
                        e10.a(jSONArrayOptJSONArray7.optString(i16));
                    }
                }
            }
            Oe oe2 = jSONObjectC14 != null ? new Oe(jSONObjectC14.optString("name", str18), jSONObjectC14.optString("id", Y1.f27894f), jSONObjectC14.optJSONObject("custom")) : null;
            if (jSONObjectC17 == null) {
                jSONObjectC17 = IronSourceVideoBridge.jsonObjectInit();
            }
            K1 k10 = new K1(jSONObjectC17);
            J1 j10 = new J1();
            JSONObject jSONObject10 = jSONObject7;
            if (jSONObject10 != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject10.optJSONObject(f27163p0);
                Map map = new HashMap();
                if (jSONObjectOptJSONObject2 != null) {
                    map = IronSourceUtils.b(jSONObjectOptJSONObject2);
                }
                j10 = new J1(map);
            }
            A1 a10 = new A1(o10, oe2, c3384ag, jSONObject4.optBoolean("integration", false), e10, k10, j10, c3453ed, jSONObject8 != null ? new C3792y1(jSONObject8.optString(str17)) : new C3792y1(), str, h1A);
            Of ofH = h(jSONObjectC4);
            com.ironsource.mediationsdk.adquality.a aVarC = c(jSONObjectC4);
            T3.a aVar = new T3.a();
            aVar.a(zd2);
            aVar.a(h10);
            aVar.a(u11);
            aVar.a(qb2);
            aVar.a(a10);
            aVar.b(ofH);
            aVar.a(aVarC);
            T3 t3A = aVar.a();
            this.f27197c = t3A;
            IronLog.INTERNAL.verbose(t3A.toString());
            JSONObject jSONObjectC26 = c(jSONObject5, "genericParams");
            if (jSONObjectC26 != null && (jSONObjectC = c(jSONObjectC26, (str20 = str19))) != null) {
                jSONObjectC26.remove(str20);
                Map<String, String> mapB = IronSourceUtils.b(jSONObjectC);
                Lb.U().q().b(mapB);
                C3400be.i().b(mapB);
                J9.i().b(mapB);
            }
            if (jSONObjectC26 != null) {
                Map<String, String> mapB2 = IronSourceUtils.b(jSONObjectC26);
                Lb.U().q().a(mapB2);
                C3400be.i().a(mapB2);
                J9.i().a(mapB2);
            }
        } catch (Exception e11) {
            C3676r4.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
        }
    }

    public String e() {
        JSONObject jSONObject = this.f27200f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f27200f.optString("error");
    }

    public C3395b9 g() {
        return new C3395b9(this.f27198d, this.f27199e);
    }

    public List<IronSource.a> h() {
        C3821zd c3821zd;
        C3821zd c3821zd2;
        C3821zd c3821zd3;
        C3821zd c3821zd4;
        if (this.f27200f == null || this.f27197c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f27197c.f() != null && (c3821zd4 = this.f27195a) != null && !c3821zd4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.f27197c.d() != null && (c3821zd3 = this.f27195a) != null && !c3821zd3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.f27197c.c() != null && (c3821zd2 = this.f27195a) != null && !c3821zd2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.f27197c.e() != null && (c3821zd = this.f27195a) != null && !c3821zd.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    private String b() {
        return this.f27204j ? "adFormats" : "adUnits";
    }

    private C3489gd g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f27137h1, false);
            String strOptString2 = jSONObject.optString("virtualItemName", "");
            int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
            C3507hd c3507hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt2 > 0) {
                C3489gd c3489gd = new C3489gd(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c3507hdA);
                if (c3507hdA == null) {
                    return c3489gd;
                }
                this.f27203i.b(this.f27201g, c3489gd, IronSource.a.REWARDED_VIDEO);
                return c3489gd;
            }
        }
        return null;
    }

    private String m() {
        return this.f27204j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f27200f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f27200f, "configurations"), b());
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        try {
            JSONObject jSONObjectC = c(this.f27200f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, m());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.f27195a = new C3821zd();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                    String strOptString = jSONArrayB.optString(i10);
                    this.f27195a.d(strOptString);
                    NetworkSettings networkSettingsB = Cd.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < jSONArrayB2.length(); i11++) {
                    String strOptString2 = jSONArrayB2.optString(i11);
                    this.f27195a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = Cd.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i11);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i12 = 0; i12 < jSONArrayB3.length(); i12++) {
                    String strOptString3 = jSONArrayB3.optString(i12);
                    this.f27195a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = Cd.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i12);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i13 = 0; i13 < jSONArrayB4.length(); i13++) {
                    String strOptString4 = jSONArrayB4.optString(i13);
                    this.f27195a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = Cd.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void t() {
        Ne ne2;
        Ne ne3 = this;
        try {
            ne3.f27196b = Cd.c();
            JSONObject jSONObjectC = ne3.c(ne3.f27200f, "providerSettings");
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectC2 = ne3.c(jSONObjectOptJSONObject, b());
                    JSONObject jSONObjectC3 = ne3.c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectC4 = ne3.c(jSONObjectC2, m());
                    JSONObject jSONObjectC5 = ne3.c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = ne3.c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = ne3.c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                    if (ne3.f27196b.a(next)) {
                        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = ne3.f27196b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (ne3.b(strOptString4)) {
                            NetworkSettings networkSettingsB2 = ne3.f27196b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(rewardedVideoSettings2.toString());
                            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit(interstitialSettings2.toString());
                            try {
                                NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(jSONObjectJsonObjectInit, jSONObjectB), IronSourceUtils.b(jSONObjectJsonObjectInit2, jSONObjectB2), IronSourceUtils.b(IronSourceVideoBridge.jsonObjectInit(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(IronSourceVideoBridge.jsonObjectInit(nativeAdSettings2.toString()), jSONObjectB4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                                ne2 = this;
                                try {
                                    ne2.f27196b.a(networkSettings);
                                } catch (Exception e10) {
                                    e = e10;
                                    C3676r4.d().a(e);
                                    IronLog.INTERNAL.error(e.toString());
                                    return;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                C3676r4.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            ne2 = ne3;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            ne2.f27196b.a(networkSettings2);
                        }
                        ne3 = ne2;
                        jSONObjectC = jSONObjectC;
                        itKeys = itKeys;
                    }
                }
            }
            ne3.f27196b.b();
        } catch (Exception e12) {
            e = e12;
        }
    }

    public T3 c() {
        return this.f27197c;
    }

    public a i() {
        return this.f27202h;
    }

    public JSONObject j() {
        return this.f27200f;
    }

    public C3821zd k() {
        return this.f27195a;
    }

    public Cd l() {
        return this.f27196b;
    }

    public boolean q() {
        JSONObject jSONObject = this.f27200f;
        return (jSONObject == null || jSONObject.has("error") || this.f27195a == null || this.f27196b == null || this.f27197c == null || !n()) ? false : true;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f27204j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new X9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    private M9 e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean(f27137h1, false);
            C3507hd c3507hdA = a(jSONObject);
            if (iOptInt >= 0 && !TextUtils.isEmpty(strOptString)) {
                M9 m10 = new M9(iOptInt, strOptString, zOptBoolean, c3507hdA);
                if (c3507hdA == null) {
                    return m10;
                }
                this.f27203i.b(this.f27201g, m10, IronSource.a.INTERSTITIAL);
                return m10;
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.f27202h = aVar;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    private void a() {
        this.f27200f = IronSourceVideoBridge.jsonObjectInit();
        this.f27198d = "";
        this.f27199e = "";
        this.f27195a = new C3821zd();
        this.f27196b = Cd.c();
        this.f27197c = new T3.a().a();
        this.f27203i = Lb.O().x();
        b(this.f27200f);
    }

    public String toString() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("appKey", this.f27198d);
            jSONObjectJsonObjectInit.put("userId", this.f27199e);
            jSONObjectJsonObjectInit.put("response", this.f27200f);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }

    private boolean b(String str) {
        return this.f27196b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : IronSourceVideoBridge.jsonObjectInit();
    }

    public Q5 f() {
        return this.f27205k;
    }

    private Context d() {
        return this.f27201g;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f27200f, "configurations"), "adFormats"), str), "adUnits");
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(f27137h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static C3384ag b(Ne ne2) {
        if (ne2 != null && ne2.q()) {
            return ne2.c().b().k();
        }
        return C3384ag.a();
    }

    private Of h(JSONObject jSONObject) {
        Of of2 = new Of();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            of2.b(jSONObjectC.optString("controllerUrl"));
        }
        return of2;
    }

    public Ne(Ne ne2) {
        this.f27202h = a.NOT_SET;
        this.f27204j = false;
        try {
            this.f27201g = ne2.d();
            this.f27200f = IronSourceVideoBridge.jsonObjectInit(ne2.f27200f.toString());
            this.f27198d = ne2.f27198d;
            this.f27199e = ne2.f27199e;
            this.f27204j = ne2.f27204j;
            this.f27195a = ne2.k();
            this.f27196b = ne2.l();
            this.f27197c = ne2.c();
            this.f27202h = ne2.i();
            this.f27203i = Lb.O().x();
            b(this.f27200f);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            a();
        }
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                iArr5[i10] = jSONArrayOptJSONArray.optInt(i10);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                iArr6[i11] = jSONArrayOptJSONArray2.optInt(i11);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                iArr7[i12] = jSONArrayOptJSONArray3.optInt(i12);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            int[] iArr8 = new int[jSONArrayOptJSONArray4.length()];
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                iArr8[i13] = jSONArrayOptJSONArray4.optInt(i13);
            }
            iArr4 = iArr8;
        } else {
            iArr4 = null;
        }
        return new H1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str, z10);
        }
        return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i10 : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j10 : jOptLong;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r7
  0x0036: PHI (r7v3 com.ironsource.ld) = (r7v1 com.ironsource.ld), (r7v2 com.ironsource.ld) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    private C3507hd a(JSONObject jSONObject) {
        EnumC3578ld enumC3578ld = null;
        if (jSONObject == null) {
            return null;
        }
        C3507hd.a aVar = new C3507hd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(f27158n1);
            if (!TextUtils.isEmpty(strOptString)) {
                EnumC3578ld enumC3578ld2 = EnumC3578ld.PER_DAY;
                if (enumC3578ld2.toString().equals(strOptString)) {
                    enumC3578ld = enumC3578ld2;
                } else {
                    enumC3578ld2 = EnumC3578ld.PER_HOUR;
                    if (enumC3578ld2.toString().equals(strOptString)) {
                        enumC3578ld = enumC3578ld2;
                    }
                }
            }
            int iOptInt = jSONObjectOptJSONObject.optInt(f27150l1, 0);
            aVar.a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, enumC3578ld, iOptInt);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
        if (jSONObjectOptJSONObject2 != null) {
            int iOptInt2 = jSONObjectOptJSONObject2.optInt(f27154m1, 0);
            aVar.a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
        }
        return aVar.a();
    }
}
