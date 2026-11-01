package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdlp implements zzikg {
    private final zzdkr zza;

    private zzdlp(zzdkr zzdkrVar) {
        this.zza = zzdkrVar;
    }

    public static zzdlp zzc(zzdkr zzdkrVar) {
        return new zzdlp(zzdkrVar);
    }

    @Nullable
    public final zzcjl zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
