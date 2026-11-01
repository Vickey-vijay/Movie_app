package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafe {
    @Nullable
    public static zzap zza(zzaev zzaevVar, boolean z10) throws IOException {
        zzap zzapVarZza = new zzafp().zza(zzaevVar, z10 ? null : zzaim.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }

    public static zzafg zzc(zzer zzerVar) {
        zzerVar.zzk(1);
        int iZzx = zzerVar.zzx();
        long jZzg = zzerVar.zzg();
        long j10 = iZzx;
        int i10 = iZzx / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jZzD = zzerVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZzD;
            jArrCopyOf2[i11] = zzerVar.zzD();
            zzerVar.zzk(2);
        }
        zzerVar.zzk((int) ((jZzg + j10) - ((long) zzerVar.zzg())));
        return new zzafg(jArrCopyOf, jArrCopyOf2);
    }

    public static boolean zzb(zzaev zzaevVar, zzafd zzafdVar) throws IOException {
        zzaevVar.zzl();
        zzeq zzeqVar = new zzeq(new byte[4], 4);
        zzaevVar.zzi(zzeqVar.zza, 0, 4);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(7);
        int iZzj2 = zzeqVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzaevVar.zzc(bArr, 0, 38);
            zzafdVar.zza = new zzafh(bArr, 4);
        } else {
            zzafh zzafhVar = zzafdVar.zza;
            if (zzafhVar == null) {
                throw new IllegalArgumentException();
            }
            if (iZzj == 3) {
                zzer zzerVar = new zzer(iZzj2);
                zzaevVar.zzc(zzerVar.zzi(), 0, iZzj2);
                zzafdVar.zza = zzafhVar.zze(zzc(zzerVar));
            } else if (iZzj == 4) {
                zzer zzerVar2 = new zzer(iZzj2);
                zzaevVar.zzc(zzerVar2.zzi(), 0, iZzj2);
                zzerVar2.zzk(4);
                zzafdVar.zza = new zzafh(zzafhVar.zza, zzafhVar.zzb, zzafhVar.zzc, zzafhVar.zzd, zzafhVar.zze, zzafhVar.zzg, zzafhVar.zzh, zzafhVar.zzj, zzafhVar.zzk, zzafhVar.zzd(zzagn.zzc(Arrays.asList(zzagn.zzb(zzerVar2, false, false).zza))));
            } else if (iZzj == 6) {
                zzer zzerVar3 = new zzer(iZzj2);
                zzaevVar.zzc(zzerVar3.zzi(), 0, iZzj2);
                zzerVar3.zzk(4);
                zzafdVar.zza = new zzafh(zzafhVar.zza, zzafhVar.zzb, zzafhVar.zzc, zzafhVar.zzd, zzafhVar.zze, zzafhVar.zzg, zzafhVar.zzh, zzafhVar.zzj, zzafhVar.zzk, zzafhVar.zzd(new zzap(zzguf.zzj(zzaia.zzb(zzerVar3)))));
            } else {
                zzaevVar.zzf(iZzj2);
            }
        }
        return zZzi;
    }
}
