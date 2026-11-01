package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcaa {
    public final long zza;
    public final zzbzy zzb;

    public zzcaa(zzcab zzcabVar, zzbzy zzbzyVar) {
        Objects.requireNonNull(zzcabVar);
        this.zza = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzb = zzbzyVar;
    }
}
