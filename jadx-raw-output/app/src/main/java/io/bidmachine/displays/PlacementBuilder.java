package io.bidmachine.displays;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.CustomParams;
import io.bidmachine.Executable;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Collection;
import java.util.List;
import rf.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {

    @NonNull
    private final AdContentType contentType;

    @NonNull
    private final f<UnifiedAdRequestParamsType> headerBiddingPlacementBuilder = new f<>();

    @Nullable
    public abstract AdObjectParams createAdObjectParams(@NonNull Ad ad2);

    @NonNull
    @Deprecated
    public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i10) throws Exception {
        return createPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, null, i10);
    }

    @NonNull
    public abstract Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i10) throws Exception;

    @Nullable
    public AdObjectParams createHeaderBiddingAdObjectParams(@NonNull Ad ad2) {
        return this.headerBiddingPlacementBuilder.createAdObjectParams(ad2);
    }

    @Nullable
    public HeaderBiddingPlacement.Builder createHeaderBiddingPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, int i10) {
        return this.headerBiddingPlacementBuilder.createPlacement(contextProvider, unifiedadrequestparamstype, adsType, getAdContentType(), collection, list, i10);
    }

    public AdContentType getAdContentType() {
        return this.contentType;
    }

    @Nullable
    public HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad2) {
        return this.headerBiddingPlacementBuilder.obtainHeaderBiddingAd(ad2);
    }

    public PlacementBuilder(@NonNull AdContentType adContentType) {
        this.contentType = adContentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSdkPlacement$0(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    @NonNull
    public Placement createSdkPlacement(@NonNull AdPlacementConfig adPlacementConfig, @Nullable HeaderBiddingPlacement.Builder builder) {
        final Placement.Builder builderNewBuilder = Placement.newBuilder();
        builderNewBuilder.setAdType(adPlacementConfig.getAdsFormat().getAdsType().getName());
        String placementId = adPlacementConfig.getPlacementId();
        if (!TextUtils.isEmpty(placementId)) {
            builderNewBuilder.setPlacementId(StringValue.of(placementId));
        }
        Utils.ifNotNull(adPlacementConfig.getCustomParams(), new Executable() { // from class: rf.l
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                PlacementBuilder.lambda$createSdkPlacement$0(builderNewBuilder, (CustomParams) obj);
            }
        });
        if (builder != null) {
            builderNewBuilder.setHbPlacement(builder);
        }
        return builderNewBuilder.build();
    }
}
