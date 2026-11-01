package io.bidmachine.iab.measurer;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public interface AdMeasurer<AdView extends View> extends Serializable {
    void onAdClicked();

    void onAdShown();

    void onAdViewReady(@NonNull AdView adview);

    void onError(@NonNull IabError iabError);

    void registerAdContainer(@NonNull ViewGroup viewGroup);

    void registerAdView(@NonNull AdView adview);
}
