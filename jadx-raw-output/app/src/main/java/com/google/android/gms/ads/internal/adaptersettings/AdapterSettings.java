package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbgn;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final zzbgn adapterSettingsInternal = zzbd.zzd();

    @KeepForSdk
    private boolean getBoolean(String str, boolean z10) {
        return this.adapterSettingsInternal.zzf(str, z10);
    }

    @KeepForSdk
    private float getFloat(String str, float f10) {
        return this.adapterSettingsInternal.zze(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                if (instance == null) {
                    instance = new AdapterSettings();
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i10) {
        return this.adapterSettingsInternal.zzd(str, i10);
    }

    @KeepForSdk
    private long getLong(String str, long j10) {
        return this.adapterSettingsInternal.zzc(str, j10);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
