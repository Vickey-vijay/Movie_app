package io.bidmachine.ads.networks.gam.versions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.utils.version.Version;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseVersionWrapper implements VersionWrapper {
    private final int minDeviceApiVersion;

    @NonNull
    private final Version versionForWhichCompiled;

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    @Nullable
    public abstract /* synthetic */ InternalGAMAd createAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData);

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    @Nullable
    public abstract /* synthetic */ Version getVersion() throws Throwable;

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    public abstract /* synthetic */ void initialize(@NonNull Context context) throws Throwable;

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    public abstract /* synthetic */ boolean isGAMPresent(@NonNull Context context);

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    public int getMinDeviceApiVersion() {
        return this.minDeviceApiVersion;
    }

    @Override // io.bidmachine.ads.networks.gam.versions.VersionWrapper
    @NonNull
    public Version getVersionForWhichCompiled() {
        return this.versionForWhichCompiled;
    }

    public BaseVersionWrapper(int i10, @NonNull Version version) {
        this.minDeviceApiVersion = i10;
        this.versionForWhichCompiled = version;
    }
}
