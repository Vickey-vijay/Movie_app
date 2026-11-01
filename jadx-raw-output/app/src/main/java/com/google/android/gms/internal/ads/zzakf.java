package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzakf implements zzakb {
    private final zzer zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzs();
        }
        if (i10 == 16) {
            return this.zza.zzt();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & 240) >> 4;
    }

    public zzakf(zzfv zzfvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zza = zzerVar;
        zzerVar.zzh(12);
        this.zzc = zzerVar.zzH() & 255;
        this.zzb = zzerVar.zzH();
    }
}
