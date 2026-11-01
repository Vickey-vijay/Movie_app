package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdav implements zzikg {
    private final zzdao zza;

    private zzdav(zzdao zzdaoVar) {
        this.zza = zzdaoVar;
    }

    public static zzdav zzc(zzdao zzdaoVar) {
        return new zzdav(zzdaoVar);
    }

    @Nullable
    public final zzfjd zza() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzc();
    }
}
