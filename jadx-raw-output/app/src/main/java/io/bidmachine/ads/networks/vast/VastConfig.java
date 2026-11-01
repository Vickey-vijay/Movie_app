package io.bidmachine.ads.networks.vast;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* JADX INFO: loaded from: classes6.dex */
public class VastConfig extends NetworkConfig {
    public VastConfig() {
        super("vast", null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}
