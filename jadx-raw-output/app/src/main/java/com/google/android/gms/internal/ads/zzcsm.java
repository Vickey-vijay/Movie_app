package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcsm implements zzboh {
    public final /* synthetic */ zzcsn zza;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzcsn zzcsnVar = this.zza;
        if (zzcsnVar.zze(map)) {
            zzcsnVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }

    public zzcsm(zzcsn zzcsnVar) {
        Objects.requireNonNull(zzcsnVar);
        this.zza = zzcsnVar;
    }
}
