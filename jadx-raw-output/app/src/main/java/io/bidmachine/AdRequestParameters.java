package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdRequestParameters {

    @NonNull
    private AdPlacementConfig adPlacementConfig;

    @Nullable
    private ResponsePayload bidPayload;

    @Nullable
    private List<NetworkConfig> networkConfigList;

    @Nullable
    private PriceFloorParams priceFloorParams;

    @Nullable
    private SessionAdParams sessionAdParams;

    @Nullable
    private TargetingParams targetingParams;

    @Nullable
    private Integer timeOutMs;

    public abstract boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable;

    @NonNull
    public AdPlacementConfig getAdPlacementConfig() {
        return this.adPlacementConfig;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adPlacementConfig.getAdsFormat();
    }

    @Nullable
    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    @Nullable
    public CustomParams getCustomParams() {
        return this.adPlacementConfig.getCustomParams();
    }

    @Nullable
    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    @Nullable
    public String getPlacementId() {
        return this.adPlacementConfig.getPlacementId();
    }

    @Nullable
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Nullable
    public SessionAdParams getSessionAdParams() {
        return this.sessionAdParams;
    }

    @Nullable
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    @Nullable
    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isPricePassedByPriceFloor(double d10) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d10 > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    public void setAdPlacementConfig(@NonNull AdPlacementConfig adPlacementConfig) {
        AdsFormat adsFormat = this.adPlacementConfig.getAdsFormat();
        AdsFormat adsFormat2 = adPlacementConfig.getAdsFormat();
        if (adsFormat != adsFormat2) {
            Logger.w("setAdPlacementConfig received different AdsFormat. Expected: " + adsFormat + ", actual: " + adsFormat2);
            adPlacementConfig = adPlacementConfig.copy(adsFormat, adPlacementConfig.getPlacementId(), adPlacementConfig.getCustomParams());
        }
        this.adPlacementConfig = adPlacementConfig;
    }

    public void setBidPayload(@Nullable ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    public void setNetworkConfigList(@Nullable List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    public void setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    public void setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
        this.sessionAdParams = sessionAdParams;
    }

    public void setTargetingParams(@Nullable TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    public void setTimeOutMs(@Nullable Integer num) {
        this.timeOutMs = num;
    }

    public AdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig) {
        this.adPlacementConfig = adPlacementConfig;
    }

    @NonNull
    public AdsType getAdsType() {
        return getAdsFormat().getAdsType();
    }

    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (getAdsType() == adRequestParameters.getAdsType()) {
            return true;
        }
        return false;
    }
}
