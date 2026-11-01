package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzmi extends zzvy {
    private final zzbe zzc;

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i10, zzbdVar, z10);
        if (zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
        } else {
            zzbdVarZzd.zzf = true;
        }
        return zzbdVarZzd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmi(zzmj zzmjVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmjVar);
        this.zzc = new zzbe();
    }
}
