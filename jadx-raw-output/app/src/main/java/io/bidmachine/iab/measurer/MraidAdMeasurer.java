package io.bidmachine.iab.measurer;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;

/* JADX INFO: loaded from: classes2.dex */
public interface MraidAdMeasurer extends AdMeasurer<WebView> {
    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdShown();

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onAdViewReady(@NonNull View view);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void onError(@NonNull IabError iabError);

    @NonNull
    String prepareCreativeForMeasure(@NonNull String str);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void registerAdContainer(@NonNull ViewGroup viewGroup);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    /* synthetic */ void registerAdView(@NonNull View view);
}
