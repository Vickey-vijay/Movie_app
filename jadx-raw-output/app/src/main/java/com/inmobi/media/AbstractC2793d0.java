package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2793d0 {
    public static void a(String str, String str2, AdResponse adResponse, C3053n9 c3053n9) {
        ck.p.j(adResponse, "adResponse");
        if (c3053n9 == null) {
            return;
        }
        try {
            int i10 = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String requestId = adResponse.getRequestId();
            ck.p.j("requestID", C3426d4.i.W);
            ck.p.j(requestId, "value");
            Gh gh2 = c3053n9.f24879a;
            if (gh2 != null) {
                gh2.a("requestID", requestId);
            }
            String strValueOf = String.valueOf(adResponse.getPlacementId());
            ck.p.j("placementID", C3426d4.i.W);
            ck.p.j(strValueOf, "value");
            Gh gh3 = c3053n9.f24879a;
            if (gh3 != null) {
                gh3.a("placementID", strValueOf);
            }
            String strValueOf2 = String.valueOf(str);
            ck.p.j("adType", C3426d4.i.W);
            ck.p.j(strValueOf2, "value");
            Gh gh4 = c3053n9.f24879a;
            if (gh4 != null) {
                gh4.a("adType", strValueOf2);
            }
            String strValueOf3 = String.valueOf(str2);
            ck.p.j("placementType", C3426d4.i.W);
            ck.p.j(strValueOf3, "value");
            Gh gh5 = c3053n9.f24879a;
            if (gh5 != null) {
                gh5.a("placementType", strValueOf3);
            }
            String strValueOf4 = String.valueOf(A1.f22333a);
            ck.p.j("bundleID", C3426d4.i.W);
            ck.p.j(strValueOf4, "value");
            Gh gh6 = c3053n9.f24879a;
            if (gh6 != null) {
                gh6.a("bundleID", strValueOf4);
            }
            C3298x5.f25687a.getClass();
            String str3 = (String) C3298x5.f25695i.getSecond();
            ck.p.j("deviceOSVersion", C3426d4.i.W);
            ck.p.j(str3, "value");
            Gh gh7 = c3053n9.f24879a;
            if (gh7 != null) {
                gh7.a("deviceOSVersion", str3);
            }
            String strM = C3298x5.m();
            ck.p.j("networkType", C3426d4.i.W);
            ck.p.j(strM, "value");
            Gh gh8 = c3053n9.f24879a;
            if (gh8 != null) {
                gh8.a("networkType", strM);
            }
            String str4 = Build.MODEL;
            ck.p.i(str4, "MODEL");
            ck.p.j("deviceModel", C3426d4.i.W);
            ck.p.j(str4, "value");
            Gh gh9 = c3053n9.f24879a;
            if (gh9 != null) {
                gh9.a("deviceModel", str4);
            }
            String strValueOf5 = String.valueOf(Ji.f22953c);
            ck.p.j("publisherID", C3426d4.i.W);
            ck.p.j(strValueOf5, "value");
            Gh gh10 = c3053n9.f24879a;
            if (gh10 != null) {
                gh10.a("publisherID", strValueOf5);
            }
            ck.p.j("sdkVersion", C3426d4.i.W);
            ck.p.j("11.1.0", "value");
            Gh gh11 = c3053n9.f24879a;
            if (gh11 != null) {
                gh11.a("sdkVersion", "11.1.0");
            }
            String strValueOf6 = String.valueOf(Ki.f23020b);
            ck.p.j("tpName", C3426d4.i.W);
            ck.p.j(strValueOf6, "value");
            Gh gh12 = c3053n9.f24879a;
            if (gh12 != null) {
                gh12.a("tpName", strValueOf6);
            }
            String strValueOf7 = String.valueOf(Ki.f23019a);
            ck.p.j("tpVersion", C3426d4.i.W);
            ck.p.j(strValueOf7, "value");
            Gh gh13 = c3053n9.f24879a;
            if (gh13 != null) {
                gh13.a("tpVersion", strValueOf7);
            }
            ck.p.j("source", C3426d4.i.W);
            ck.p.j("sdk_android", "value");
            Gh gh14 = c3053n9.f24879a;
            if (gh14 != null) {
                gh14.a("source", "sdk_android");
            }
            String strA = Ki.a();
            ck.p.j("mkVersion", C3426d4.i.W);
            ck.p.j(strA, "value");
            Gh gh15 = c3053n9.f24879a;
            if (gh15 != null) {
                gh15.a("mkVersion", strA);
            }
            String strC = Ji.c();
            ck.p.j("webViewUserAgent", C3426d4.i.W);
            ck.p.j(strC, "value");
            Gh gh16 = c3053n9.f24879a;
            if (gh16 != null) {
                gh16.a("webViewUserAgent", strC);
            }
            String strValueOf8 = String.valueOf(adSet.isPod());
            ck.p.j("sdkAdPod", C3426d4.i.W);
            ck.p.j(strValueOf8, "value");
            Gh gh17 = c3053n9.f24879a;
            if (gh17 != null) {
                gh17.a("sdkAdPod", strValueOf8);
            }
            String strValueOf9 = String.valueOf(adSet.getLogEnabled());
            ck.p.j("isServerSideLogging", C3426d4.i.W);
            ck.p.j(strValueOf9, "value");
            Gh gh18 = c3053n9.f24879a;
            if (gh18 != null) {
                gh18.a("isServerSideLogging", strValueOf9);
            }
            String transactionId = adSet.getTransactionId();
            if (transactionId == null) {
                transactionId = "Not Set";
            }
            ck.p.j("transactionID", C3426d4.i.W);
            ck.p.j(transactionId, "value");
            Gh gh19 = c3053n9.f24879a;
            if (gh19 != null) {
                gh19.a("transactionID", transactionId);
            }
            String strA2 = a();
            ck.p.j("configData", C3426d4.i.W);
            ck.p.j(strA2, "value");
            Gh gh20 = c3053n9.f24879a;
            if (gh20 != null) {
                gh20.a("configData", strA2);
            }
            if (adSet.isPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3053n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i10, ad2.getCreativeId());
                        arrayList2.add(i10, ad2.getImpressionId());
                        i10 = i11;
                    }
                    String strP0 = nj.b0.p0(arrayList, " , ", null, null, 0, null, null, 62, null);
                    ck.p.j("creativeID", C3426d4.i.W);
                    ck.p.j(strP0, "value");
                    Gh gh21 = c3053n9.f24879a;
                    if (gh21 != null) {
                        gh21.a("creativeID", strP0);
                    }
                    String strP1 = nj.b0.p0(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    ck.p.j("impressionID", C3426d4.i.W);
                    ck.p.j(strP1, "value");
                    Gh gh22 = c3053n9.f24879a;
                    if (gh22 != null) {
                        gh22.a("impressionID", strP1);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3053n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad3 = adSet.getAds().get(0);
                String creativeId = ad3.getCreativeId();
                ck.p.j("creativeID", C3426d4.i.W);
                ck.p.j(creativeId, "value");
                Gh gh23 = c3053n9.f24879a;
                if (gh23 != null) {
                    gh23.a("creativeID", creativeId);
                }
                String impressionId = ad3.getImpressionId();
                ck.p.j("impressionID", C3426d4.i.W);
                ck.p.j(impressionId, "value");
                Gh gh24 = c3053n9.f24879a;
                if (gh24 != null) {
                    gh24.a("impressionID", impressionId);
                }
            }
        } catch (JSONException e10) {
            c3053n9.a("AdLogResponseHandler", "error while update vitals", e10);
        }
        a(adResponse, c3053n9);
    }

    public static void a(AdResponse adResponse, C3053n9 c3053n9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3053n9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3053n9.a(logEnabled);
        } catch (JSONException e10) {
            c3053n9.a("AdLogResponseHandler", "error while setting server-side lever", e10);
            c3053n9.a(false);
        }
    }

    public static String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        C2924i4 c2924i5 = Y3.f23815a;
        jSONObject.put("root", ((RootConfig) c2924i5.a(RootConfig.class)).getLastUpdateTimeStamp());
        ck.p.j(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c2924i5.a(AdConfig.class)).getLastUpdateTimeStamp());
        ck.p.j(TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((TelemetryConfig) c2924i5.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        ck.p.j(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c2924i5.a(CrashConfig.class)).getLastUpdateTimeStamp());
        ck.p.j(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c2924i5.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String string = jSONObject.toString();
        ck.p.i(string, "toString(...)");
        return string;
    }
}
