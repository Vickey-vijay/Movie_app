package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsFormat;
import io.bidmachine.MediaAssetType;
import io.bidmachine.utils.ProtoUtils;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class NativeAdRequestParameters extends AdRequestParameters {

    @NonNull
    private final List<MediaAssetType> mediaAssetTypes;
    private boolean validateAssets;

    public NativeAdRequestParameters(@NonNull List<MediaAssetType> list) {
        super(new AdPlacementConfig.Builder(AdsFormat.Native).build());
        this.validateAssets = true;
        this.mediaAssetTypes = list;
    }

    private boolean isParametersMatchedInternal(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
        return MediaAssetType.isAll(nativeAdRequestParameters.mediaAssetTypes) || nativeAdRequestParameters.mediaAssetTypes.containsAll(this.mediaAssetTypes);
    }

    public boolean containsAssetType(@NonNull MediaAssetType mediaAssetType) {
        return this.mediaAssetTypes.isEmpty() || this.mediaAssetTypes.contains(mediaAssetType) || this.mediaAssetTypes.contains(MediaAssetType.All);
    }

    @NonNull
    public List<MediaAssetType> getMediaAssetTypes() {
        return this.mediaAssetTypes;
    }

    public boolean isValidateAssets() {
        return this.validateAssets;
    }

    public void setValidateAssets(boolean z10) {
        this.validateAssets = z10;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof NativeAdRequestParameters) && isParametersMatchedInternal((NativeAdRequestParameters) adRequestParameters)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable {
        return ProtoUtils.isNativePlacement(placement);
    }
}
