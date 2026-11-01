package com.safedk.android.internal.special;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;

/* JADX INFO: loaded from: classes.dex */
public class SpecialsBridge {
    /* JADX WARN: Multi-variable type inference failed */
    public static void appLovinAdViewRenderAd(AppLovinAdView targetInstance, AppLovinAd appLovinAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewRenderAd(Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/sdk/AppLovinAd;)V");
        if (SafeDK.aa()) {
            Logger.d("SafeDK-Special", "appLovinAdViewRenderAd started, ad: " + appLovinAd);
            try {
                if (AppLovinAdSize.INTERSTITIAL.equals(appLovinAd.getSize())) {
                    String clCode = ((AppLovinAdBase) appLovinAd).getClCode();
                    BrandSafetyEvent.AdFormatType adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                    Logger.d("SafeDK-Special", "appLovinAdViewRenderAd clcode:" + clCode + " ad: " + appLovinAd + " formatType: " + adFormatType);
                    CreativeInfoManager.a(g.f44955a, "clcode=" + clCode + C3426d4.j.f28584c, adFormatType, targetInstance);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinAdViewRenderAd failed");
            }
        }
        targetInstance.renderAd(appLovinAd);
    }

    public static void maxAdViewDestroy(MaxAdView targetInstance) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxAdViewDestroy(Lcom/applovin/mediation/ads/MaxAdView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "maxAdViewDestroy started , isOnUiThread = " + k.c());
                CreativeInfoManager.a(targetInstance);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "maxAdViewDestroy failed");
            }
        }
        targetInstance.destroy();
    }

    public static void maxNativeAdListenerOnNativeAdLoaded(MaxNativeAdListener targetInstance, MaxNativeAdView nativeAdView, MaxAd ad2) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxNativeAdListenerOnNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V");
        targetInstance.onNativeAdLoaded(nativeAdView, ad2);
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded Impl started, nativeAdView: " + nativeAdView + ", ad: " + ad2 + ", isOnUiThread = " + k.c());
                CreativeInfoManager.onMaxNativeAdLoaded(nativeAdView, ad2);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded failed", th2);
            }
        }
    }

    public static void appLovinAdViewEventListenerAdOpenedFullscreen(AppLovinAdViewEventListener targetInstance, AppLovinAd ad2, AppLovinAdView adView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewEventListenerAdOpenedFullscreen(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen started, ad: " + ad2 + ", adView: " + adView + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.a(g.f44955a, (String) null, (String) null, RedirectEvent.f44652i);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen failed", th2);
            }
        }
        targetInstance.adOpenedFullscreen(ad2, adView);
    }

    public static void appLovinMaxAdViewAdListenerOnAdExpanded(MaxAdViewAdListener targetInstance, MaxAd ad2) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinMaxAdViewAdListenerOnAdExpanded(Lcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded started, ad: " + ad2 + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.f();
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded failed", th2);
            }
        }
        targetInstance.onAdExpanded(ad2);
    }

    public static void MBridgeVideoView_videoOperate(MBridgeVideoView targetHandler, int var) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MBridgeVideoView_videoOperate(Lcom/mbridge/msdk/video/module/MBridgeVideoView;I)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate " + targetHandler + ", isOnUiThread = " + k.c());
                String strA = BrandSafetyUtils.a(targetHandler);
                if (var == 1) {
                    CampaignEx campaign = targetHandler.getCampaign();
                    Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate " + targetHandler + ", request id " + campaign.getImpressionURL());
                    CreativeInfoManager.a(g.f44969o, h.r(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, targetHandler);
                    CreativeInfoManager.a(g.f44969o, strA, false);
                } else if (var == 3) {
                    CreativeInfoManager.a(g.f44969o, strA, true);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate error " + th2.getMessage());
            }
        }
        targetHandler.videoOperate(var);
    }

    public static void MintegralContainerView_showPlayableView(MBridgeContainerView targetHandler) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MintegralContainerView_showPlayableView(Lcom/mbridge/msdk/video/module/MBridgeContainerView;)V");
        targetHandler.showPlayableView();
        if (SafeDK.aa()) {
            try {
                CampaignEx campaign = targetHandler.getCampaign();
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView " + targetHandler + ", request id " + campaign.getImpressionURL());
                CreativeInfoManager.a(g.f44969o, h.r(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, targetHandler);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView error " + th2.getMessage());
            }
        }
    }

    public static void fyberOnImpression(OnGlobalImpressionDataListener targetInstance, String spotId, String creativeId, ImpressionData impressionData) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnImpression(Lcom/fyber/inneractive/sdk/external/OnGlobalImpressionDataListener;Ljava/lang/String;Ljava/lang/String;Lcom/fyber/inneractive/sdk/external/ImpressionData;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnImpression started, spotId=" + spotId + ", creativeId=" + creativeId + ", impressionData = " + impressionData.toString() + ", isOnUiThread=" + k.c());
                CreativeInfoManager.b(g.f44970p, impressionData, (Object) null);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "Error in fyberOnImpression", th2);
            }
        }
        targetInstance.onImpression(spotId, creativeId, impressionData);
    }

    public static void fyberOnAdExpanded(InneractiveAdViewEventsListener targetInstance, InneractiveAdSpot adSpot) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnAdExpanded(Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnAdExpanded started, isOnUiThread = " + k.c());
                BrandSafetyUtils.a(g.f44970p, (String) null, (String) null, RedirectEvent.f44652i);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "Error in fyberOnAdExpanded", th2);
            }
        }
        targetInstance.onAdExpanded(adSpot);
    }

    public static void inmobiOnInterstitialAdDisplayed(InterstitialAdEventListener targetInstance, InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->inmobiOnInterstitialAdDisplayed(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;Lcom/inmobi/ads/InMobiInterstitial;Lcom/inmobi/ads/AdMetaInfo;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "inmobiOnInterstitialAdDisplayed triggered , isOnUiThread = " + k.c());
                CreativeInfoManager.b(g.f44963i, adMetaInfo.getCreativeID(), (Object) null);
            } catch (Throwable th2) {
                Logger.e("SafeDK-Special", "Exception in inmobiOnInterstitialAdDisplayed", th2);
            }
        }
        targetInstance.onAdDisplayed(inMobiInterstitial, adMetaInfo);
    }
}
