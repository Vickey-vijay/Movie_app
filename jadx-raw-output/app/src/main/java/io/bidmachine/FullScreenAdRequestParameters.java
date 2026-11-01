package io.bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    private final AdContentType adContentType;

    @Deprecated
    public FullScreenAdRequestParameters(@NonNull AdsFormat adsFormat, @NonNull AdContentType adContentType) {
        this(new AdPlacementConfig.Builder(adsFormat).build(), adContentType);
    }

    public FullScreenAdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig, @NonNull AdContentType adContentType) {
        super(adPlacementConfig);
        this.adContentType = adContentType;
    }

    @NonNull
    public AdContentType getAdContentType() {
        return this.adContentType;
    }

    public boolean isContentTypeMatch(@NonNull AdContentType adContentType) {
        AdContentType adContentType2 = this.adContentType;
        return adContentType2 == AdContentType.All || adContentType2 == adContentType;
    }

    private boolean isParametersMatchedInternal(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters)) {
            return true;
        }
        return false;
    }
}
