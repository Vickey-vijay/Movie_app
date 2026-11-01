package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzakn {
    public final zzagh zza;
    public zzalf zzd;
    public zzaki zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzale zzb = new zzale();
    public final zzer zzc = new zzer();
    private final zzer zzk = new zzer(1);
    private final zzer zzl = new zzer();

    public final void zzc() {
        zzale zzaleVar = this.zzb;
        zzaleVar.zzd = 0;
        zzaleVar.zzp = 0L;
        zzaleVar.zzq = false;
        zzaleVar.zzk = false;
        zzaleVar.zzo = false;
        zzaleVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    public final /* synthetic */ void zzl(boolean z10) {
        this.zzm = true;
    }

    public final void zza(zzalf zzalfVar, zzaki zzakiVar) {
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zza.zzz(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzalc zzalcVar = this.zzd.zza;
        zzaki zzakiVar = this.zzb.zza;
        String str = zzfj.zza;
        zzald zzaldVarZza = zzalcVar.zza(zzakiVar.zza);
        zzq zzqVarZzb = zzqVar.zzb(zzaldVarZza != null ? zzaldVarZza.zzb : null);
        zzt zztVarZza = this.zzj.zza();
        zztVarZza.zzq(zzqVarZzb);
        this.zza.zzz(zztVarZza.zzM());
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzale zzaleVar = this.zzb;
        return zzaleVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i10;
        if (this.zzm) {
            i10 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i10 = this.zzd.zzg[this.zzf];
        }
        return zzj() != null ? i10 | 1073741824 : i10;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }

    @Nullable
    public final zzald zzj() {
        if (!this.zzm) {
            return null;
        }
        zzale zzaleVar = this.zzb;
        zzaki zzakiVar = zzaleVar.zza;
        String str = zzfj.zza;
        int i10 = zzakiVar.zza;
        zzald zzaldVarZza = zzaleVar.zzm;
        if (zzaldVarZza == null) {
            zzaldVarZza = this.zzd.zza.zza(i10);
        }
        if (zzaldVarZza == null || !zzaldVarZza.zza) {
            return null;
        }
        return zzaldVarZza;
    }

    public zzakn(zzagh zzaghVar, zzalf zzalfVar, zzaki zzakiVar, zzv zzvVar) {
        this.zza = zzaghVar;
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zzj = zzvVar;
        zza(zzalfVar, zzakiVar);
    }

    public final int zzi(int i10, int i11) {
        zzer zzerVar;
        boolean z10;
        int i12;
        zzald zzaldVarZzj = zzj();
        if (zzaldVarZzj == null) {
            return 0;
        }
        int i13 = zzaldVarZzj.zzd;
        if (i13 != 0) {
            zzerVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzaldVarZzj.zze;
            String str = zzfj.zza;
            zzer zzerVar2 = this.zzl;
            int length = bArr.length;
            zzerVar2.zzb(bArr, length);
            zzerVar = zzerVar2;
            i13 = length;
        }
        zzale zzaleVar = this.zzb;
        boolean zZzb = zzaleVar.zzb(this.zzf);
        if (!zZzb && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzer zzerVar3 = this.zzk;
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        zzerVar3.zzi()[0] = (byte) (i12 | i13);
        zzerVar3.zzh(0);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzd(zzerVar3, 1, 1);
        zzaghVar.zzd(zzerVar, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zZzb) {
            zzer zzerVar4 = this.zzc;
            zzerVar4.zza(8);
            byte[] bArrZzi = zzerVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i11;
            bArrZzi[4] = (byte) ((i10 >> 24) & 255);
            bArrZzi[5] = (byte) ((i10 >> 16) & 255);
            bArrZzi[6] = (byte) ((i10 >> 8) & 255);
            bArrZzi[7] = (byte) (i10 & 255);
            zzaghVar.zzd(zzerVar4, 8, 1);
            return i13 + 9;
        }
        int i14 = i13 + 1;
        zzer zzerVar5 = zzaleVar.zzn;
        int iZzt = zzerVar5.zzt();
        zzerVar5.zzk(-2);
        int i15 = (iZzt * 6) + 2;
        if (i11 != 0) {
            zzer zzerVar6 = this.zzc;
            zzerVar6.zza(i15);
            byte[] bArrZzi2 = zzerVar6.zzi();
            zzerVar5.zzm(bArrZzi2, 0, i15);
            int i16 = (((bArrZzi2[2] & 255) << 8) | (bArrZzi2[3] & 255)) + i11;
            bArrZzi2[2] = (byte) ((i16 >> 8) & 255);
            bArrZzi2[3] = (byte) (i16 & 255);
            zzerVar5 = zzerVar6;
        }
        zzaghVar.zzd(zzerVar5, i15, 1);
        return i14 + i15;
    }
}
