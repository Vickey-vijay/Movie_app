package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;
import p001if.h;
import p001if.n;
import p001if.o;
import p001if.s;
import p001if.t;

/* JADX INFO: loaded from: classes5.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAMDynamic";

    @Nullable
    @VisibleForTesting
    public o gamNetwork;

    public GAMAdapter(@NonNull String str) {
        this(str, "null", BuildConfig.ADAPTER_VERSION_NAME, 16);
    }

    @NonNull
    public String getNetworkName() {
        return NETWORK_NAME;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Nullable
    @VisibleForTesting
    public Waterfall.Context parseWaterfallContext(@NonNull String str) {
        try {
            return Waterfall.Context.parseFrom(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public static class a extends NetworkParamsImpl {
        public a(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParamsImpl, io.bidmachine.ads.networks.gam_dynamic.NetworkParams
        @Nullable
        public Struct getExt(@NonNull Context context) {
            return ExtraParamsManager.get().getPrivateStruct(context);
        }
    }

    public GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            oVar.unReserveAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            return new h(oVar);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            return new n(oVar);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            return new t(oVar);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            return oVar.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        o oVar = this.gamNetwork;
        return oVar != null && oVar.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        o oVar = this.gamNetwork;
        if (oVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("GAM network is null"));
            return;
        }
        InternalAdData internalAdDataReserveMostExpensiveAd = oVar.reserveMostExpensiveAd(networkAdUnit, networkAdUnit.getAdsFormat());
        if (internalAdDataReserveMostExpensiveAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", internalAdDataReserveMostExpensiveAd.getAdUnitId());
        map.put("price", String.valueOf(internalAdDataReserveMostExpensiveAd.getPrice()));
        for (Map.Entry<String, Object> entry : internalAdDataReserveMostExpensiveAd.getCustomParamsMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                map.put(key, String.valueOf(value));
            }
        }
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        o oVar = this.gamNetwork;
        if (oVar != null) {
            oVar.unReserveAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        VersionWrapper versionWrapperFindVersionWrapper = VersionManager.findVersionWrapper(strRemoveFromNetworkParams);
        if (versionWrapperFindVersionWrapper == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!versionWrapperFindVersionWrapper.isGAMPresent(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams(GAMConfig.KEY_CONTEXT);
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("context not provided");
            return;
        }
        Waterfall.Context waterfallContext = parseWaterfallContext(strRemoveFromNetworkParams2);
        if (waterfallContext == null) {
            networkInitializationCallback.onFail("context can't transform to model");
            return;
        }
        s sVar = new s(applicationContext, new a(getKey(), getNetworkName()), waterfallContext, versionWrapperFindVersionWrapper);
        this.gamNetwork = sVar;
        sVar.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    public GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
