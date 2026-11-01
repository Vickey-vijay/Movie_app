package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.CreativeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface AuctionResult {
    @Nullable
    String[] getAdDomains();

    @Nullable
    String getCid();

    @Nullable
    CreativeFormat getCreativeFormat();

    @NonNull
    String getCreativeId();

    @NonNull
    Map<String, String> getCustomParams();

    @Nullable
    String getDeal();

    @Nullable
    String getDemandSource();

    @NonNull
    String getId();

    @NonNull
    String getNetworkKey();

    @NonNull
    Map<String, String> getNetworkParams();

    double getPrice();
}
