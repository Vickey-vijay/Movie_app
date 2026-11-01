package io.bidmachine.ads.networks.gam;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ef.a;
import ef.d;
import ef.n;
import ef.p;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Utils;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class GAMAdapter extends HeaderBiddingAdapter {
    private static final int DEFAULT_EXPIRATION_TIME_SEC = 3600;

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAM";

    @Nullable
    private n gamNetwork;

    public GAMAdapter() {
        this(BuildConfig.ADAPTER_NAME, "null", BuildConfig.ADAPTER_VERSION_NAME, 16);
    }

    @NonNull
    public String getNetworkName() {
        return NETWORK_NAME;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    public GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Nullable
    private Map<AdsFormat, GAMTypeConfig> toGAMTypeConfigMap(@NonNull String str) {
        GAMTypeConfig gAMTypeConfigCreate;
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (gAMTypeConfigCreate = GAMTypeConfigFactory.create(jSONObjectOptJSONObject)) != null) {
                    map.put(gAMTypeConfigCreate.getAdsFormat(), gAMTypeConfigCreate);
                }
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        n nVar = this.gamNetwork;
        if (nVar != null) {
            nVar.unReserveGAMAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedBannerAd createBanner() {
        if (this.gamNetwork != null) {
            return new a(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createInterstitial() {
        if (this.gamNetwork != null) {
            return new d(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public UnifiedFullscreenAd createRewarded() {
        if (this.gamNetwork != null) {
            return new p(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        n nVar = this.gamNetwork;
        if (nVar != null) {
            return nVar.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    public boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        n nVar = this.gamNetwork;
        return nVar != null && nVar.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("ad_unit_id"));
            return;
        }
        n nVar = this.gamNetwork;
        if (nVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("GAM network is null"));
            return;
        }
        GAMUnitData gAMUnitDataReserveMostExpensiveGAMAd = nVar.reserveMostExpensiveGAMAd(networkAdUnit, mediationParameter);
        this.gamNetwork.cache(unifiedAdRequestParams.getAdRequestParameters().getAdsFormat());
        if (gAMUnitDataReserveMostExpensiveGAMAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", gAMUnitDataReserveMostExpensiveGAMAd.getAdUnitId());
        map.put(GAMConfig.KEY_SCORE, String.valueOf(gAMUnitDataReserveMostExpensiveGAMAd.getScore()));
        map.put("price", String.valueOf(gAMUnitDataReserveMostExpensiveGAMAd.getPrice()));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        n nVar = this.gamNetwork;
        if (nVar != null) {
            nVar.unReserveGAMAd(networkAdUnit);
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
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams(GAMConfig.KEY_WATERFALL_CONFIGURATIONS);
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        Map<AdsFormat, GAMTypeConfig> gAMTypeConfigMap = toGAMTypeConfigMap(strRemoveFromNetworkParams2);
        if (gAMTypeConfigMap == null || gAMTypeConfigMap.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        n nVar = new n(applicationContext, versionWrapperFindVersionWrapper, getNetworkName(), gAMTypeConfigMap, networkConfigParams.removeFromNetworkParams(GAMConfig.KEY_REQUEST_AGENT), TimeUnit.SECONDS.toMillis(Utils.parseIntOrDefault(networkConfigParams.removeFromNetworkParams(GAMConfig.KEY_EXPIRATION_TIME_SEC), DEFAULT_EXPIRATION_TIME_SEC)), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams(GAMConfig.KEY_OVERRIDE_CALLBACKS)));
        this.gamNetwork = nVar;
        nVar.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    public GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
