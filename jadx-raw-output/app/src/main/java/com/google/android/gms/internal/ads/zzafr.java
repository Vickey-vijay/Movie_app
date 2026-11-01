package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafr {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzafr() {
    }

    public zzafr(zzafr zzafrVar) {
        this.zza = zzafrVar.zza;
        this.zzb = zzafrVar.zzb;
        this.zzc = zzafrVar.zzc;
        this.zzd = zzafrVar.zzd;
        this.zze = zzafrVar.zze;
        this.zzf = zzafrVar.zzf;
        this.zzg = zzafrVar.zzg;
    }

    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (zzafs.zzl(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0 && (i13 = (i10 >>> 12) & 15) != 0 && i13 != 15 && (i14 = (i10 >>> 10) & 3) != 3) {
            int i17 = i13 - 1;
            this.zza = i11;
            this.zzb = zzafs.zza[3 - i12];
            int i18 = zzafs.zzb[i14];
            this.zzd = i18;
            int i19 = 2;
            if (i11 == 2) {
                i18 /= 2;
                this.zzd = i18;
            } else if (i11 == 0) {
                i18 /= 4;
                this.zzd = i18;
            }
            int i20 = (i10 >>> 9) & 1;
            this.zzg = zzafs.zzm(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = zzafs.zzc[i17];
                } else {
                    i16 = zzafs.zzd[i17];
                }
                this.zzf = i16;
                this.zzc = (((i16 * 12) / i18) + i20) * 4;
            } else {
                int i21 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = zzafs.zze[i17];
                    } else {
                        i15 = zzafs.zzf[i17];
                    }
                    this.zzf = i15;
                    this.zzc = ((i15 * 144) / i18) + i20;
                } else {
                    int i22 = zzafs.zzg[i17];
                    this.zzf = i22;
                    if (i12 == 1) {
                        i21 = 72;
                    }
                    this.zzc = ((i21 * i22) / i18) + i20;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i19 = 1;
            }
            this.zze = i19;
            return true;
        }
        return false;
    }
}
