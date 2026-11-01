package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfrt implements Runnable {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    public final /* synthetic */ zzfsa zzb;

    public zzfrt(zzfsa zzfsaVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzE(this.zza);
    }
}
