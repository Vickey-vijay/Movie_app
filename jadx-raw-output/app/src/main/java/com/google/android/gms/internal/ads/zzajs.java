package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j12;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }

    @Nullable
    public static zzajs zzd(long j10, long j11, zzafr zzafrVar, zzer zzerVar) {
        long jMax;
        int iZzs;
        zzerVar.zzk(6);
        int iZzB = zzerVar.zzB();
        long j12 = zzafrVar.zzc;
        long j13 = iZzB;
        int iZzB2 = zzerVar.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzr = zzfj.zzr((((long) iZzB2) * ((long) zzafrVar.zzg)) - 1, zzafrVar.zzd);
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        int iZzt3 = zzerVar.zzt();
        zzerVar.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long j14 = j11 + ((long) zzafrVar.zzc);
        int i10 = 0;
        while (i10 < iZzt) {
            long j15 = j13;
            jArr[i10] = (((long) i10) * jZzr) / ((long) iZzt);
            jArr2[i10] = j14;
            if (iZzt3 == 1) {
                iZzs = zzerVar.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzerVar.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzerVar.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzerVar.zzH();
            }
            j14 += ((long) iZzs) * ((long) iZzt2);
            i10++;
            j13 = j15;
        }
        long j16 = j11 + j12;
        long j17 = j16 + j13;
        if (j10 != -1 && j10 != j17) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(j17).length());
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j17);
            zzee.zzc("VbriSeeker", sb2.toString());
        }
        if (j17 != j14) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j17).length() + 43 + String.valueOf(j14).length() + 28);
            sb3.append("VBRI bytes and ToC mismatch (using max): ");
            sb3.append(j17);
            sb3.append(", ");
            sb3.append(j14);
            sb3.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(j17, j14);
        } else {
            jMax = j17;
        }
        return new zzajs(jArr, jArr2, jZzr, j16, jMax, zzafrVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        long[] jArr = this.zza;
        int iZzm = zzfj.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j11, jArr2[iZzm]);
        if (zzafzVar.zzb >= j10 || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i10 = iZzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j10) {
        return this.zza[zzfj.zzm(this.zzb, j10, true, true)];
    }
}
