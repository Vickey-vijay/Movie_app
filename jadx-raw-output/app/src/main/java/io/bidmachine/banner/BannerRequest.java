package io.bidmachine.banner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.IBannerRequestBuilder;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class BannerRequest extends AdRequest<BannerRequest, BannerAdRequestParameters, UnifiedBannerAdRequestParams> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<BannerRequest> {
        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestExpired(@NonNull AdRequest adRequest);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestFailed(@NonNull AdRequest adRequest, @NonNull BMError bMError);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestSuccess(@NonNull AdRequest adRequest, @NonNull AuctionResult auctionResult);
    }

    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, BannerRequest, BannerAdRequestParameters> implements IBannerRequestBuilder<Builder> {
        private BannerSize bannerSize;

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
        public BannerAdRequestParameters createAdRequestParameters() {
            BannerSize bannerSize = this.bannerSize;
            if (bannerSize != null) {
                return new BannerAdRequestParameters(bannerSize);
            }
            throw new IllegalArgumentException("BannerSize can't be null");
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.models.IBannerRequestBuilder
        public Builder setSize(@NonNull BannerSize bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public BannerRequest build(@NonNull BannerAdRequestParameters bannerAdRequestParameters) {
            return new BannerRequest(bannerAdRequestParameters);
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

    public static class b extends UnifiedAdRequestParamsImpl<BannerAdRequestParameters> implements UnifiedBannerAdRequestParams {
        private b(@NonNull BannerAdRequestParameters bannerAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
            super(bannerAdRequestParameters, targetingParams, dataRestrictions);
        }

        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        @NonNull
        public /* bridge */ /* synthetic */ BannerAdRequestParameters getAdRequestParameters() {
            return (BannerAdRequestParameters) super.getAdRequestParameters();
        }
    }

    private BannerRequest(@NonNull BannerAdRequestParameters bannerAdRequestParameters) {
        super(bannerAdRequestParameters);
    }

    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedBannerAdRequestParams createUnifiedAdRequestParams(@NonNull BannerAdRequestParameters bannerAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
        return new b(bannerAdRequestParameters, targetingParams, dataRestrictions);
    }

    public BannerSize getSize() {
        return getAdRequestParameters().getBannerSize();
    }
}
