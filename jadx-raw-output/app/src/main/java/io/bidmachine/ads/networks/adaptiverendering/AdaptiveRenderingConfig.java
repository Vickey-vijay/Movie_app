package io.bidmachine.ads.networks.adaptiverendering;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0006"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingConfig;", "Lio/bidmachine/NetworkConfig;", "()V", "createNetworkAdapter", "Lio/bidmachine/NetworkAdapter;", VastTagName.COMPANION, "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingConfig extends NetworkConfig {
    public static final String NATIVE_FEATURES_KEY = "features";

    public AdaptiveRenderingConfig() {
        super(AdaptiveRenderingAdapter.KEY, null);
    }

    @Override // io.bidmachine.NetworkConfig
    public NetworkAdapter createNetworkAdapter() {
        return new AdaptiveRenderingAdapter();
    }
}
