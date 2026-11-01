package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C3813z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3813z5 f31697a = new C3813z5();

    public static /* synthetic */ IronSourceError a(C3813z5 c3813z5, EnumC3448e8 enumC3448e8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c3813z5.a(enumC3448e8, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, EnumC3448e8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, EnumC3448e8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, EnumC3448e8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    private final IronSourceError a(EnumC3448e8 enumC3448e8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC3448e8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + StringUtils.PROCESS_POSTFIX_DELIMITER + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC3448e8.c();
        }
        return new IronSourceError(enumC3448e8.b(), strC);
    }

    public final IronSourceError b(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        return a(EnumC3448e8.ISErrorLoadNetworkFailed, ironSourceError);
    }

    public final IronSourceError c(String str) {
        ck.p.j(str, UnifiedMediationParams.KEY_DESCRIPTION);
        return a(EnumC3448e8.ISErrorLoadNetworkFailed, str);
    }

    public final IronSourceError d(String str) {
        return a(EnumC3448e8.ISErrorRewardedLoadNoConfig, str);
    }

    public final IronSourceError e() {
        return a(this, EnumC3448e8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, EnumC3448e8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, EnumC3448e8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, EnumC3448e8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, EnumC3448e8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, EnumC3448e8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, EnumC3448e8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, EnumC3448e8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, EnumC3448e8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, EnumC3448e8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, EnumC3448e8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, EnumC3448e8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, EnumC3448e8.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, EnumC3448e8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, EnumC3448e8.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, EnumC3448e8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private C3813z5() {
    }

    public static /* synthetic */ IronSourceError b(C3813z5 c3813z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3813z5.b(str);
    }

    public final IronSourceError c(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "networkError");
        return a(EnumC3448e8.ISErrorShowNetworkFailed, ironSourceError);
    }

    public static /* synthetic */ IronSourceError c(C3813z5 c3813z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3813z5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(EnumC3448e8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC3448e8 enumC3448e8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC3448e8.c();
        }
        return new IronSourceError(enumC3448e8.b(), str);
    }

    public final IronSourceError a(IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "networkError");
        return a(EnumC3448e8.ISErrorInitNetworkFailed, ironSourceError);
    }

    public final IronSourceError a() {
        return a(this, EnumC3448e8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C3813z5 c3813z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c3813z5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(EnumC3448e8.ISErrorBannerLoadNoConfig, str);
    }
}
