package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.Nullable;
import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: loaded from: classes8.dex */
public class InternalAdLoadData {

    @Nullable
    private final String adResponse;

    @Nullable
    private final Waterfall.Result.EstimatedPrice price;

    @Nullable
    public String getAdResponse() {
        return this.adResponse;
    }

    @Nullable
    public Waterfall.Result.EstimatedPrice getPrice() {
        return this.price;
    }

    public InternalAdLoadData(@Nullable Waterfall.Result.EstimatedPrice estimatedPrice, @Nullable String str) {
        this.price = estimatedPrice;
        this.adResponse = str;
    }
}
