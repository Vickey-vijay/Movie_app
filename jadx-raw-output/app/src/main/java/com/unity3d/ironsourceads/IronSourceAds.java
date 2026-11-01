package com.unity3d.ironsourceads;

import android.content.Context;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.R9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45237a;

        public final String getValue() {
            return this.f45237a;
        }

        AdFormat(String str) {
            this.f45237a = str;
        }
    }

    public static final void setMetaData(String str, String str2) {
        p.j(str, C3426d4.i.W);
        p.j(str2, "value");
        IronLog.API.info("key = " + str + ", value = " + str2);
        R9.f27547a.a(str, str2);
    }

    public static final void enableDebugMode(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.2.0";
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initListener) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(initRequest, "initRequest");
        p.j(initListener, "initializationListener");
        R9.f27547a.a(context, initRequest, initListener);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    private IronSourceAds() {
    }

    public static final void setMetaData(String str, List<String> list) {
        p.j(str, C3426d4.i.W);
        p.j(list, "values");
        IronLog.API.info("key = " + str + ", values = " + list);
        r.m().a(str, list);
    }
}
