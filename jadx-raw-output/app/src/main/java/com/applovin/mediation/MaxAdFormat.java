package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes2.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10290b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat(BrandSafetyUtils.f43552o, BrandSafetyUtils.f43552o);
    public static final MaxAdFormat LEADER = new MaxAdFormat(BrandSafetyUtils.f43551n, "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat(BrandSafetyUtils.f43547j, "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat(BrandSafetyUtils.f43549l, "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat(BrandSafetyUtils.f43548k, "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        return (this == BANNER || this == LEADER) ? w3.a(i10, this, context) : getSize();
    }

    @Deprecated
    public String getDisplayName() {
        return this.f10290b;
    }

    public String getLabel() {
        return this.f10289a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        return this == MREC ? new AppLovinSdkUtils.Size(d.f44769a, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f10289a + "'}";
    }

    private MaxAdFormat(String str, String str2) {
        this.f10289a = str;
        this.f10290b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase("interstitial") && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_APP_OPEN) && !str.equalsIgnoreCase("app_open")) {
                    if (!str.equalsIgnoreCase("rewarded") && !str.equalsIgnoreCase("reward")) {
                        o.h("AppLovinSdk", "Unknown ad format: " + str);
                        return null;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }
}
