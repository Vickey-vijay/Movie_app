package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class IronSource {

    public enum a {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29530a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f29530a;
        }

        a(String str) {
            this.f29530a = str;
        }
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        return r.m().a(context);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return r.m().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        r.m().e(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return r.m().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return r.m().j(str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        r.m().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        r.m().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        r.m().b(activity, str);
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        r.m().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        r.m().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        r.m().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        r.m().g(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        r.m().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        r.m().a(str);
    }
}
