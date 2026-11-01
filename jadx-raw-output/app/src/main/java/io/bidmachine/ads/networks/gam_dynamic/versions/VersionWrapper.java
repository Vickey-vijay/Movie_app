package io.bidmachine.ads.networks.gam_dynamic.versions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.version.Version;

/* JADX INFO: loaded from: classes10.dex */
public interface VersionWrapper {
    @Nullable
    InternalAd createAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener);

    int getMinDeviceApiVersion();

    @Nullable
    Version getVersion() throws Throwable;

    @NonNull
    Version getVersionForWhichCompiled();

    void initialize(@NonNull Context context) throws Throwable;

    boolean isGAMPresent(@NonNull Context context);
}
