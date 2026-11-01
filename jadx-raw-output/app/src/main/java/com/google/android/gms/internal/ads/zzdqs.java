package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqs implements zzikg {
    private final zzdql zza;

    private zzdqs(zzdql zzdqlVar) {
        this.zza = zzdqlVar;
    }

    public static zzdqs zzc(zzdql zzdqlVar) {
        return new zzdqs(zzdqlVar);
    }

    @Nullable
    public final zzbui zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
