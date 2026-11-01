package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzyu extends zzyw {
    public zzyu(zzbg zzbgVar, int[] iArr, int i10, zzaas zzaasVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzguf.zzq(list);
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzguc zzgucVar = (zzguc) list.get(i11);
            if (zzgucVar != null) {
                zzgucVar.zzf(new zzys(j10, jArr[i11]));
            }
        }
    }

    public static /* synthetic */ zzguf zzd(zzaab[] zzaabVarArr) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 2;
            i11 = 1;
            if (i13 >= 2) {
                break;
            }
            zzaab zzaabVar = zzaabVarArr[i13];
            if (zzaabVar == null || zzaabVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                zzgucVar.zzf(new zzys(0L, 0L));
                arrayList.add(zzgucVar);
            }
            i13++;
        }
        long[][] jArr = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzaab zzaabVar2 = zzaabVarArr[i15];
            if (zzaabVar2 == null) {
                jArr[i15] = new long[0];
            } else {
                int[] iArr = zzaabVar2.zzb;
                jArr[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = zzaabVar2.zza.zza(iArr[i16]).zzj;
                    long[] jArr2 = jArr[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i16] = j10;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr4 = jArr[i17];
            jArr3[i17] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzgva zzgvaVarZza = zzgvu.zzc(zzgvz.zzb()).zzb(2).zza();
        int i18 = 0;
        while (i18 < i10) {
            int length = jArr[i18].length;
            if (length > i11) {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr5 = jArr[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr5.length) {
                        break;
                    }
                    long j11 = jArr5[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19++;
                }
                int i20 = length - 1;
                double d10 = dArr[i20] - dArr[i12];
                int i21 = i12;
                while (i21 < i20) {
                    double d11 = dArr[i21];
                    i21++;
                    zzgvaVarZza.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i21]) * 0.5d) - dArr[i12]) / d10), Integer.valueOf(i18));
                    i12 = 0;
                }
            }
            i18++;
            i12 = 0;
            i10 = 2;
            i11 = 1;
        }
        zzguf zzgufVarZzq = zzguf.zzq(zzgvaVarZza.zzt());
        for (int i22 = 0; i22 < zzgufVarZzq.size(); i22++) {
            int iIntValue = ((Integer) zzgufVarZzq.get(i22)).intValue();
            int i23 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i23;
            jArr3[iIntValue] = jArr[iIntValue][i23];
            zzi(arrayList, jArr3);
        }
        for (int i24 = 0; i24 < 2; i24++) {
            if (arrayList.get(i24) != null) {
                long j12 = jArr3[i24];
                jArr3[i24] = j12 + j12;
            }
        }
        zzi(arrayList, jArr3);
        zzguc zzgucVar2 = new zzguc();
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            zzguc zzgucVar3 = (zzguc) arrayList.get(i25);
            zzgucVar2.zzf(zzgucVar3 == null ? zzguf.zzi() : zzgucVar3.zzi());
        }
        return zzgucVar2.zzi();
    }
}
