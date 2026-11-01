package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.INativeRequestBuilder;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class NativeRequest extends AdRequest<NativeRequest, NativeAdRequestParameters, UnifiedNativeAdRequestParams> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<NativeRequest> {
        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestExpired(@NonNull AdRequest adRequest);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestFailed(@NonNull AdRequest adRequest, @NonNull BMError bMError);

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* synthetic */ void onRequestSuccess(@NonNull AdRequest adRequest, @NonNull AuctionResult auctionResult);
    }

    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, NativeRequest, NativeAdRequestParameters> implements INativeRequestBuilder<Builder> {
        private final List<MediaAssetType> mediaAssetTypes = new ArrayList<MediaAssetType>(MediaAssetType.values().length) { // from class: io.bidmachine.nativead.NativeRequest.Builder.1
            {
                add(MediaAssetType.Icon);
                add(MediaAssetType.Image);
            }
        };

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
        public NativeAdRequestParameters createAdRequestParameters() {
            return new NativeAdRequestParameters(this.mediaAssetTypes);
        }

        @Override // io.bidmachine.models.INativeRequestBuilder
        public Builder setMediaAssetTypes(@NonNull MediaAssetType... mediaAssetTypeArr) {
            if (mediaAssetTypeArr.length > 0) {
                this.mediaAssetTypes.clear();
                this.mediaAssetTypes.addAll(Arrays.asList(mediaAssetTypeArr));
            }
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public NativeRequest build(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
            return new NativeRequest(nativeAdRequestParameters);
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

    public static class b extends UnifiedAdRequestParamsImpl<NativeAdRequestParameters> implements UnifiedNativeAdRequestParams {
        private b(@NonNull NativeAdRequestParameters nativeAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
            super(nativeAdRequestParameters, targetingParams, dataRestrictions);
        }

        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        @NonNull
        public /* bridge */ /* synthetic */ NativeAdRequestParameters getAdRequestParameters() {
            return (NativeAdRequestParameters) super.getAdRequestParameters();
        }
    }

    private NativeRequest(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
        super(nativeAdRequestParameters);
    }

    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedNativeAdRequestParams createUnifiedAdRequestParams(@NonNull NativeAdRequestParameters nativeAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
        return new b(nativeAdRequestParameters, targetingParams, dataRestrictions);
    }

    public boolean containsAssetType(@NonNull MediaAssetType mediaAssetType) {
        return getAdRequestParameters().containsAssetType(mediaAssetType);
    }

    @Override // io.bidmachine.AdRequest
    public void processBidPayload(@NonNull ResponsePayload responsePayload) {
        getAdRequestParameters().setValidateAssets(false);
        super.processBidPayload(responsePayload);
    }
}
