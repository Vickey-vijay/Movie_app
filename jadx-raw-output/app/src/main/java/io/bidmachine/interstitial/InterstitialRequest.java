package io.bidmachine.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdContentType;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.utils.BMError;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class InterstitialRequest extends FullScreenAdRequest<InterstitialRequest> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<InterstitialRequest> {
        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestExpired(@NonNull AdRequest adRequest);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestFailed(@NonNull AdRequest adRequest, @NonNull BMError bMError);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestSuccess(@NonNull AdRequest adRequest, @NonNull AuctionResult auctionResult);
    }

    public static final class Builder extends FullScreenAdRequest.FullScreenRequestBuilder<Builder, InterstitialRequest> {
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public FullScreenAdRequestParameters createAdRequestParameters() {
            return new InterstitialAdRequestParameters(this.adContentType);
        }

        @Override // io.bidmachine.FullScreenAdRequest.FullScreenRequestBuilder
        public Builder setAdContentType(@NonNull AdContentType adContentType) {
            return (Builder) super.setAdContentType(adContentType);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public InterstitialRequest build(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
            return new InterstitialRequest(fullScreenAdRequestParameters);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setBidPayload(@Nullable String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setCustomParams(@Nullable CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setListener(@Nullable AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setLoadingTimeOut(@Nullable Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setPlacementId(@Nullable String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setTargetingParams(@Nullable TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }
    }

    private InterstitialRequest(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }
}
