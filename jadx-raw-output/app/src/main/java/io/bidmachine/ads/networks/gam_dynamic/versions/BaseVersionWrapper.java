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

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseVersionWrapper implements VersionWrapper {
    private final int minDeviceApiVersion;

    @NonNull
    private final Version versionForWhichCompiled;

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @Nullable
    public abstract /* synthetic */ InternalAd createAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener);

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @Nullable
    public abstract /* synthetic */ Version getVersion() throws Throwable;

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public abstract /* synthetic */ void initialize(@NonNull Context context) throws Throwable;

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public abstract /* synthetic */ boolean isGAMPresent(@NonNull Context context);

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public int getMinDeviceApiVersion() {
        return this.minDeviceApiVersion;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @NonNull
    public Version getVersionForWhichCompiled() {
        return this.versionForWhichCompiled;
    }

    public BaseVersionWrapper(int i10, @NonNull Version version) {
        this.minDeviceApiVersion = i10;
        this.versionForWhichCompiled = version;
    }
}
