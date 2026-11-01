package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdkw implements zzikg {
    private final zzdkr zza;

    private zzdkw(zzdkr zzdkrVar) {
        this.zza = zzdkrVar;
    }

    public static zzdkw zzc(zzdkr zzdkrVar) {
        return new zzdkw(zzdkrVar);
    }

    @Nullable
    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
