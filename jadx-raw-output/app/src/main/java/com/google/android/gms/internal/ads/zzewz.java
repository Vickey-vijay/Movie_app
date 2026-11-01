package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzewz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzewz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzewz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewz(zzikpVar, zzikpVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzgupVarZzh;
        zzexx zzexxVarZzb = ((zzexz) this.zza).zzb();
        Context contextZza = ((zzcmj) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(contextZza)) {
                zzgupVarZzh = zzgup.zzi(zzexxVarZzb);
            } else {
                zzgupVarZzh = zzgup.zzh();
            }
        } else {
            zzgupVarZzh = zzgup.zzh();
        }
        zziko.zzb(zzgupVarZzh);
        return zzgupVarZzh;
    }
}
