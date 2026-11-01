package io.bidmachine.ads.networks.gam.versions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.utils.version.Version;

/* JADX INFO: loaded from: classes.dex */
public interface VersionWrapper {
    @Nullable
    InternalGAMAd createAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData);

    int getMinDeviceApiVersion();

    @Nullable
    Version getVersion() throws Throwable;

    @NonNull
    Version getVersionForWhichCompiled();

    void initialize(@NonNull Context context) throws Throwable;

    boolean isGAMPresent(@NonNull Context context);
}
