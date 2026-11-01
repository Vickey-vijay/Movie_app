package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsy implements zzso {
    public zzsy(zzsx zzsxVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzgxz.zza(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    public static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int iZzc;
        int i16 = 250000;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i11 == 5) {
                    i16 = 500000;
                } else if (i11 == 8) {
                    i16 = 1000000;
                    i11 = 8;
                }
                if (i15 != -1) {
                    iZzc = zzgxs.zzb(i15, 8, RoundingMode.CEILING);
                } else {
                    iZzc = zzc(i11);
                }
                return zzgxz.zza((((long) i16) * ((long) iZzc)) / 1000000);
            }
            return zzgxz.zza((((long) zzc(i11)) * 50000000) / 1000000);
        }
        int iZza = zza(250000, i14, i13);
        int iZza2 = zza(750000, i14, i13);
        String str = zzfj.zza;
        return Math.max(iZza, Math.min(i10 * 4, iZza2));
    }

    private static int zzc(int i10) {
        boolean z10;
        int iZzf = zzaey.zzf(i10);
        if (iZzf != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zzi(z10);
        return iZzf;
    }
}
