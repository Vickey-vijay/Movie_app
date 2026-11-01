package io.bidmachine.interstitial;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsFormat;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.utils.ProtoUtils;

/* JADX INFO: loaded from: classes11.dex */
public class InterstitialAdRequestParameters extends FullScreenAdRequestParameters {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdContentType;

        static {
            int[] iArr = new int[AdContentType.values().length];
            $SwitchMap$io$bidmachine$AdContentType = iArr;
            try {
                iArr[AdContentType.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$AdContentType[AdContentType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public InterstitialAdRequestParameters(@NonNull AdContentType adContentType) {
        super(new AdPlacementConfig.Builder(defineAdsFormat(adContentType)).build(), adContentType);
    }

    @NonNull
    private static AdsFormat defineAdsFormat(@NonNull AdContentType adContentType) {
        int i10 = a.$SwitchMap$io$bidmachine$AdContentType[adContentType.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? AdsFormat.Interstitial : AdsFormat.InterstitialVideo;
        }
        return AdsFormat.InterstitialStatic;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable {
        return ProtoUtils.isInterstitialPlacement(placement);
    }
}
