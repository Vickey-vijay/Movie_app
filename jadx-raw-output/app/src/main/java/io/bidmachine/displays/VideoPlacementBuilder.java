package io.bidmachine.displays;

import android.graphics.Point;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import rf.g;
import rf.m;

/* JADX INFO: loaded from: classes3.dex */
public class VideoPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends PlacementBuilder<UnifiedAdRequestParamsType> implements g<UnifiedAdRequestParamsType> {
    private final boolean canSkip;

    public VideoPlacementBuilder(boolean z10) {
        super(AdContentType.Video);
        this.canSkip = z10;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull Ad ad2) {
        if (!ad2.hasVideo()) {
            return null;
        }
        AdObjectParams adObjectParamsCreateHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad2);
        if (adObjectParamsCreateHeaderBiddingAdObjectParams == null) {
            Ad.Video video = ad2.getVideo();
            m mVar = new m(ad2);
            mVar.setCreativeAdm(video.getAdm());
            return mVar;
        }
        return adObjectParamsCreateHeaderBiddingAdObjectParams;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @NonNull
    public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i10) throws Exception {
        Point size = getSize(contextProvider, unifiedadrequestparamstype);
        Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.canSkip).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(size.x).setH(size.y).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
        HeaderBiddingPlacement.Builder builderCreateHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderCreateHeaderBiddingPlacement != null) {
            linearValue.addExtProto(Any.pack(builderCreateHeaderBiddingPlacement.build()));
        } else if (adPlacementConfig != null) {
            linearValue.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, builderCreateHeaderBiddingPlacement)));
        }
        return linearValue;
    }

    @Override // rf.g
    public Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return Utils.getScreenSize(contextProvider.getContext());
    }
}
