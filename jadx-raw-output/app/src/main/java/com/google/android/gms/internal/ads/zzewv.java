package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewv implements zzikg {
    private final zzikp zza;

    private zzewv(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar2;
    }

    public static zzewv zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewv(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzgupVarZzh;
        zzevn zzevnVarZzc = zzevp.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeX)).booleanValue()) {
            zzgupVarZzh = zzgup.zzi(new zzezj(zzevnVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeY)).intValue(), scheduledExecutorService));
        } else {
            zzgupVarZzh = zzgup.zzh();
        }
        zziko.zzb(zzgupVarZzh);
        return zzgupVarZzh;
    }
}
