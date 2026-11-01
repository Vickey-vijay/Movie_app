package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;

/* JADX INFO: loaded from: classes.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, UnifiedFullscreenAdRequestParams> {

    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        public AdContentType adContentType = AdContentType.All;

        public SelfType setAdContentType(@NonNull AdContentType adContentType) {
            this.adContentType = adContentType;
            return this;
        }
    }

    public static class b extends UnifiedAdRequestParamsImpl<FullScreenAdRequestParameters> implements UnifiedFullscreenAdRequestParams {
        private b(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
            super(fullScreenAdRequestParameters, targetingParams, dataRestrictions);
        }

        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        @NonNull
        public /* bridge */ /* synthetic */ FullScreenAdRequestParameters getAdRequestParameters() {
            return (FullScreenAdRequestParameters) super.getAdRequestParameters();
        }
    }

    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedFullscreenAdRequestParams createUnifiedAdRequestParams(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters, @NonNull TargetingParams targetingParams, @NonNull DataRestrictions dataRestrictions) {
        return new b(fullScreenAdRequestParameters, targetingParams, dataRestrictions);
    }

    public FullScreenAdRequest(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    @NonNull
    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.bidmachine.AdRequest
    public boolean isPlacementBuilderMatch(@NonNull PlacementBuilder placementBuilder) {
        if (super.isPlacementBuilderMatch(placementBuilder) && getAdRequestParameters().isContentTypeMatch(placementBuilder.getAdContentType())) {
            return true;
        }
        return false;
    }
}
