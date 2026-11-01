package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes8.dex */
public interface AdRewardedListener<AdType extends IAd> {
    void onAdRewarded(@NonNull AdType adtype);
}
