package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface NetworkConfigParams {
    @Nullable
    String getFromNetworkParams(@NonNull String str);

    @Nullable
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable AdsFormat... adsFormatArr);

    @NonNull
    Map<String, String> obtainNetworkParams();

    @Nullable
    String removeFromNetworkParams(@NonNull String str);
}
