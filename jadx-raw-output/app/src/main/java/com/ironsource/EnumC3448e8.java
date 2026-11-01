package com.ironsource;

import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC3448e8 {
    ISErrorInitNetworkFailed(7001, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(AdError.LOAD_CALLED_WHILE_SHOWING_AD, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(AdError.INCORRECT_STATE_ERROR, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(7104, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(10000, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(10001, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Load failed due to no config");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28767b;

    public final int b() {
        return this.f28766a;
    }

    public final String c() {
        return this.f28767b;
    }

    EnumC3448e8(int i10, String str) {
        this.f28766a = i10;
        this.f28767b = str;
    }
}
