package com.unity3d.mediation;

import android.content.Context;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.ironsource.C3665q9;
import com.ironsource.C3751vb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45298a;

        public final String getValue() {
            return this.f45298a;
        }

        AdFormat(String str) {
            this.f45298a = str;
        }
    }

    public static final void setMetaData(String str, String str2) {
        p.j(str, C3426d4.i.W);
        p.j(str2, "value");
        IronLog.API.info("key = " + str + ", value = " + str2);
        C3751vb.f31458a.a(str, str2);
    }

    public static final void addImpressionDataListener(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        p.j(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("adding listener: " + levelPlayImpressionDataListener.getClass().getSimpleName());
        C3751vb.f31458a.a(levelPlayImpressionDataListener);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.2.0";
    }

    public static final void init(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(levelPlayInitRequest, "initRequest");
        p.j(levelPlayInitListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3751vb.f31458a.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public static final void launchTestSuite(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("");
        r.m().c(context);
    }

    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        p.j(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("removing listener: " + levelPlayImpressionDataListener.getClass().getSimpleName());
        C3751vb.f31458a.b(levelPlayImpressionDataListener);
    }

    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final boolean setDynamicUserId(String str) {
        p.j(str, IronSourceConstants.EVENTS_DYNAMIC_USER_ID);
        IronLog.API.info("dynamicUserId: " + str);
        return r.m().b(str);
    }

    public static final void setNetworkData(String str, JSONObject jSONObject) {
        p.j(str, "networkKey");
        p.j(jSONObject, "networkData");
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        r.m().b(str, jSONObject);
    }

    public static final void setSegment(LevelPlaySegment levelPlaySegment) {
        p.j(levelPlaySegment, "segment");
        IronLog.API.info("");
        C3751vb.f31458a.b(levelPlaySegment);
    }

    public static final void validateIntegration(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        IronLog.API.info("");
        C3665q9.f30550a.a(context);
    }

    private LevelPlay() {
    }

    public static final void setMetaData(String str, List<String> list) {
        p.j(str, C3426d4.i.W);
        p.j(list, "values");
        IronLog.API.info("key = " + str + ", values = " + list);
        C3751vb.f31458a.a(str, list);
    }
}
