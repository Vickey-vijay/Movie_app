package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class GAMConfig extends NetworkConfig {

    @NonNull
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NonNull
    public static final String KEY_CONTEXT = "context";

    @NonNull
    public static final String KEY_PRICE = "price";

    @NonNull
    public static final String KEY_SUPPORTED_VERSIONS_RANGE = "supported_versions_range";

    public GAMConfig(@Nullable Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    public GAMConfig(@NonNull String str, @Nullable Map<String, String> map) {
        super(str, map);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter(getNetworkKey());
    }
}
