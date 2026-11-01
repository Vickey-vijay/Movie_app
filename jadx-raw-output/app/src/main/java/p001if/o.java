package p001if;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdData;

/* JADX INFO: compiled from: GAMNetwork.java */
/* JADX INFO: loaded from: classes2.dex */
public interface o {
    void cache();

    void cache(@NonNull AdsFormat adsFormat);

    boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z10);

    @Nullable
    String getVersion();

    void init(@NonNull Context context);

    boolean isInitialized();

    void loadBanner(@NonNull NetworkAdUnit networkAdUnit, @NonNull d0 d0Var);

    void loadInterstitial(@NonNull NetworkAdUnit networkAdUnit, @NonNull f0 f0Var);

    void loadRewarded(@NonNull NetworkAdUnit networkAdUnit, @NonNull g0 g0Var);

    @Nullable
    InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat);

    void unReserveAd(@NonNull NetworkAdUnit networkAdUnit);
}
