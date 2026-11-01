package io.bidmachine.displays;

import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
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
import rf.a;
import rf.g;

/* JADX INFO: loaded from: classes11.dex */
public class DisplayPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends PlacementBuilder<UnifiedAdRequestParamsType> implements g<UnifiedAdRequestParamsType> {
    private final boolean isFullscreen;

    public DisplayPlacementBuilder(boolean z10) {
        super(AdContentType.Static);
        this.isFullscreen = z10;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @Nullable
    public AdObjectParams createAdObjectParams(@NonNull Ad ad2) {
        if (!ad2.hasDisplay()) {
            return null;
        }
        AdObjectParams adObjectParamsCreateHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad2);
        if (adObjectParamsCreateHeaderBiddingAdObjectParams == null) {
            Ad.Display display = ad2.getDisplay();
            if (TextUtils.isEmpty(display.getAdm())) {
                return null;
            }
            a aVar = new a(ad2);
            aVar.setCreativeAdm(display.getAdm());
            aVar.setWidth(display.getW());
            aVar.setHeight(display.getH());
            return aVar;
        }
        return adObjectParamsCreateHeaderBiddingAdObjectParams;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @NonNull
    public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i10) throws Exception {
        Point size = getSize(contextProvider, unifiedadrequestparamstype);
        Placement.DisplayPlacement.Builder h10 = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).setW(size.x).setH(size.y);
        if (this.isFullscreen) {
            h10.setInstl(true);
            h10.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder builderCreateHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderCreateHeaderBiddingPlacement != null) {
            h10.addExtProto(Any.pack(builderCreateHeaderBiddingPlacement.build()));
        } else if (adPlacementConfig != null) {
            h10.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, builderCreateHeaderBiddingPlacement)));
        }
        return h10;
    }

    public Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return Utils.getScreenSize(contextProvider.getContext());
    }
}
