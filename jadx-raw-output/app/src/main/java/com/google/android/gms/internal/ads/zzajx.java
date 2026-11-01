package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajx {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzer zzf;
    private final zzer zzg;
    private int zzh;
    private int zzi;

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzer zzerVar = this.zzg;
            this.zzc = zzerVar.zzH();
            zzerVar.zzk(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + zzerVar.zzH() : -1;
        }
        return true;
    }

    public zzajx(zzer zzerVar, zzer zzerVar2, boolean z10) throws zzat {
        this.zzg = zzerVar;
        this.zzf = zzerVar2;
        this.zze = z10;
        zzerVar2.zzh(12);
        this.zza = zzerVar2.zzH();
        zzerVar.zzh(12);
        this.zzi = zzerVar.zzH();
        zzaey.zza(zzerVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }
}
