package io.bidmachine.banner;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsFormat;
import io.bidmachine.utils.ProtoUtils;

/* JADX INFO: loaded from: classes10.dex */
public class BannerAdRequestParameters extends AdRequestParameters {

    @NonNull
    private final BannerSize bannerSize;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        static {
            int[] iArr = new int[BannerSize.values().length];
            $SwitchMap$io$bidmachine$banner$BannerSize = iArr;
            try {
                iArr[BannerSize.Size_320x50.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$banner$BannerSize[BannerSize.Size_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$banner$BannerSize[BannerSize.Size_300x250.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BannerAdRequestParameters(@NonNull BannerSize bannerSize) {
        super(new AdPlacementConfig.Builder(defineAdsFormat(bannerSize)).build());
        this.bannerSize = bannerSize;
    }

    @NonNull
    private static AdsFormat defineAdsFormat(@NonNull BannerSize bannerSize) {
        int i10 = a.$SwitchMap$io$bidmachine$banner$BannerSize[bannerSize.ordinal()];
        if (i10 == 1) {
            return AdsFormat.Banner_320x50;
        }
        if (i10 != 2) {
            return i10 != 3 ? AdsFormat.Banner : AdsFormat.Banner_300x250;
        }
        return AdsFormat.Banner_728x90;
    }

    private boolean isParametersMatchedInternal(@NonNull BannerAdRequestParameters bannerAdRequestParameters) {
        return this.bannerSize == bannerAdRequestParameters.bannerSize;
    }

    @NonNull
    public BannerSize getBannerSize() {
        return this.bannerSize;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable {
        return ProtoUtils.isBannerPlacement(placement, this.bannerSize);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof BannerAdRequestParameters) && isParametersMatchedInternal((BannerAdRequestParameters) adRequestParameters)) {
            return true;
        }
        return false;
    }
}
