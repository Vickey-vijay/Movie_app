package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcdq extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzcdu zza;

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcdu zzcduVar = this.zza;
        zzbhh zzbhhVar = new zzbhh(zzcduVar.zzz(), zzcduVar.zzA().afmaVersion);
        synchronized (zzcduVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbhk.zza(zzcduVar.zzB(), zzbhhVar);
            } catch (IllegalArgumentException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e10);
            }
        }
    }

    public zzcdq(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }
}
