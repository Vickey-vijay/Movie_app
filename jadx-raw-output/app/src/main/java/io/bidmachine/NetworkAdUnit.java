package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkAdUnit {

    @NonNull
    private final AdsFormat adsFormat;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    private final String f58493id = UUID.randomUUID().toString();

    @NonNull
    private final Map<String, String> mediationConfig;

    @NonNull
    private final NetworkAdapter networkAdapter;

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public String getId() {
        return this.f58493id;
    }

    @NonNull
    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    @Nullable
    public String getMediationParameter(@NonNull String str) {
        return this.mediationConfig.get(str);
    }

    @NonNull
    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        this.networkAdapter = networkAdapter;
        this.adsFormat = adsFormat;
        this.mediationConfig = map;
    }

    public void clearAuction() throws Throwable {
        getNetworkAdapter().clearAuction(this);
    }

    public void onLossAuction() throws Throwable {
        getNetworkAdapter().onLossAuction(this);
    }

    public void onWinAuction() throws Throwable {
        getNetworkAdapter().onWinAuction(this);
    }
}
