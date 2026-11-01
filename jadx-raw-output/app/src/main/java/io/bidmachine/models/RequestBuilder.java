package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.models.RequestBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface RequestBuilder<SelfType extends RequestBuilder, ReturnType extends AdRequest> {
    @NonNull
    ReturnType build();

    @NonNull
    SelfType setBidPayload(@Nullable String str);

    @NonNull
    SelfType setCustomParams(@Nullable CustomParams customParams);

    @NonNull
    SelfType setListener(@Nullable AdRequest.AdRequestListener<ReturnType> adRequestListener);

    @NonNull
    SelfType setLoadingTimeOut(@Nullable Integer num);

    @NonNull
    SelfType setNetworks(@Nullable String str);

    @NonNull
    SelfType setNetworks(@Nullable List<NetworkConfig> list);

    @NonNull
    SelfType setPlacementId(@Nullable String str);

    @NonNull
    SelfType setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams);

    @NonNull
    SelfType setSessionAdParams(@Nullable SessionAdParams sessionAdParams);

    @NonNull
    SelfType setTargetingParams(@Nullable TargetingParams targetingParams);
}
