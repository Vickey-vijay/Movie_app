package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }

    public zzzq(int i10, zzbg zzbgVar, int i11, zzzl zzzlVar, int i12, @Nullable String str, @Nullable String str2) {
        boolean z10;
        boolean z11;
        zzguf zzgufVarZzj;
        int iZzj;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, zzbgVar, i11);
        int i14 = 0;
        this.zzf = zzmn.zzaa(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzzlVar.zzC;
        if (1 != (i15 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzg = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        if (str2 != null) {
            zzgufVarZzj = zzguf.zzj(str2);
        } else if (zzzlVar.zzy.isEmpty()) {
            zzgufVarZzj = zzguf.zzj("");
        } else {
            zzgufVarZzj = zzzlVar.zzy;
        }
        int i17 = 0;
        while (true) {
            if (i17 < zzgufVarZzj.size()) {
                iZzj = zzaaa.zzj(this.zzd, (String) zzgufVarZzj.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            } else {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzi = i17;
        this.zzj = iZzj;
        if (str2 != null) {
            i13 = 1088;
        } else {
            i13 = 0;
        }
        int iZzm = zzaaa.zzm(this.zzd.zzf, i13);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        if ((1088 & zzvVar.zzf) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzn = z12;
        int iZzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = iZzn;
        if (zzaaa.zzi(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int iZzj2 = zzaaa.zzj(this.zzd, str, z13);
        this.zzm = iZzj2;
        if (iZzj <= 0 && ((!zzzlVar.zzy.isEmpty() || iZzm <= 0) && ((!zzzlVar.zzy.isEmpty() || iZzn == Integer.MAX_VALUE) && !this.zzg && (!this.zzh || iZzj2 <= 0)))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (zzmn.zzaa(i12, zzzlVar.zzV) && z14) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgvz zzgvzVarZza;
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i10 = this.zzj;
        zzgts zzgtsVarZzb = zzgtsVarZza.zzb(i10, zzzqVar.zzj);
        int i11 = this.zzk;
        zzgts zzgtsVarZzd = zzgtsVarZzb.zzb(i11, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg);
        Boolean boolValueOf = Boolean.valueOf(this.zzh);
        Boolean boolValueOf2 = Boolean.valueOf(zzzqVar.zzh);
        if (i10 == 0) {
            zzgvzVarZza = zzgvz.zzb();
        } else {
            zzgvzVarZza = zzgvz.zzb().zza();
        }
        zzgts zzgtsVarZzb2 = zzgtsVarZzd.zza(boolValueOf, boolValueOf2, zzgvzVarZza).zzb(this.zzm, zzzqVar.zzm);
        if (i11 == 0) {
            zzgtsVarZzb2 = zzgtsVarZzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzgtsVarZzb2.zze();
    }
}
