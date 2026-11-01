package com.wangxiong.sdk;

import android.app.Activity;
import android.content.Context;
import com.wangxiong.sdk.callBack.InitSdkCallback;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainPreloadAdCallback;

/* JADX INFO: loaded from: classes7.dex */
public class WxSDK {
    public static String getDeviceID() {
        return MainSDK.getInstance().getDeviceID();
    }

    public static void initAdCache(Activity activity) {
        MainSDK.getInstance().initAdCache(activity);
    }

    public static void initSdk(Context context, InitSdkCallback initSdkCallback) {
        MainSDK.getInstance().initSdk(context, initSdkCallback);
    }

    public static void preloadBannerAd(MainPreloadAdCallback mainPreloadAdCallback) {
        MainSDK.getInstance().preloadBannerAd(mainPreloadAdCallback);
    }

    public static void preloadInterstitialAd(MainPreloadAdCallback mainPreloadAdCallback) {
        MainSDK.getInstance().preloadInterstitialAd(mainPreloadAdCallback);
    }

    public static void preloadNativeAd(MainPreloadAdCallback mainPreloadAdCallback) {
        MainSDK.getInstance().preloadNativeAd(mainPreloadAdCallback);
    }

    public static void preloadRewardAd(MainPreloadAdCallback mainPreloadAdCallback) {
        MainSDK.getInstance().preloadRewardAd(mainPreloadAdCallback);
    }

    public static void setDebugFlag(boolean z10) {
        MainSDK.getInstance().setDebugFlag(z10);
    }
}
