package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnk implements zzikg {
    private final zzdnd zza;

    private zzdnk(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    public static zzdnk zza(zzdnd zzdndVar) {
        return new zzdnk(zzdndVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
