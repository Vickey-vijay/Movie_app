package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdoe {

    @Nullable
    private zzbkp zza;

    public zzdoe(zzdnp zzdnpVar) {
        this.zza = zzdnpVar;
    }

    @Nullable
    public final synchronized zzbkp zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbkp zzbkpVar) {
        this.zza = zzbkpVar;
    }
}
