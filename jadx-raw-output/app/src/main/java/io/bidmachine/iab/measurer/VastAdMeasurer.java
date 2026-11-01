package io.bidmachine.iab.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.vast.VastRequest;

/* JADX INFO: loaded from: classes9.dex */
public interface VastAdMeasurer extends AdMeasurer<View> {
    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdShown();

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdViewReady(@NonNull View view);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onError(@NonNull IabError iabError);

    void onVastModelLoaded(@NonNull VastRequest vastRequest);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void registerAdContainer(@NonNull ViewGroup viewGroup);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void registerAdView(@NonNull View view);
}
