package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GAMConfig extends NetworkConfig {

    @NonNull
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NonNull
    public static final String KEY_EXPIRATION_TIME_SEC = "expiration_time";

    @NonNull
    public static final String KEY_OVERRIDE_CALLBACKS = "override_callbacks";

    @NonNull
    public static final String KEY_PRICE = "price";

    @NonNull
    public static final String KEY_REQUEST_AGENT = "request_agent";

    @NonNull
    public static final String KEY_SCORE = "score";

    @NonNull
    public static final String KEY_SUPPORTED_VERSIONS_RANGE = "supported_versions_range";

    @NonNull
    public static final String KEY_WATERFALL_CONFIGURATIONS = "waterfall_configurations";

    public GAMConfig(@Nullable Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    public GAMConfig(@NonNull String str, @Nullable Map<String, String> map) {
        super(str, map);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter();
    }
}
