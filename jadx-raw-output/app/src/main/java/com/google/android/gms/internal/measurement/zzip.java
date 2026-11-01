package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes8.dex */
final class zzip {
    public static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(zzlu zzluVar, byte[] bArr, int i10, int i11, int i12, zzio zzioVar) throws IOException {
        zzlm zzlmVar = (zzlm) zzluVar;
        Object objZze = zzlmVar.zze();
        int iZzc = zzlmVar.zzc(objZze, bArr, i10, i11, i12, zzioVar);
        zzlmVar.zzf(objZze);
        zzioVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzlu zzluVar, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        int iZzk = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzk = zzk(i12, bArr, iZzk, zzioVar);
            i12 = zzioVar.zza;
        }
        int i13 = iZzk;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzkm.zzf();
        }
        Object objZze = zzluVar.zze();
        int i14 = i12 + i13;
        zzluVar.zzh(objZze, bArr, i13, i14, zzioVar);
        zzluVar.zzf(objZze);
        zzioVar.zzc = objZze;
        return i14;
    }

    public static int zzf(byte[] bArr, int i10, zzkj zzkjVar, zzio zzioVar) throws IOException {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int iZzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza + iZzj;
        while (iZzj < i11) {
            iZzj = zzj(bArr, iZzj, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        if (iZzj == i11) {
            return iZzj;
        }
        throw zzkm.zzf();
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzmm zzmmVar, zzio zzioVar) throws zzkm {
        if ((i10 >>> 3) == 0) {
            throw zzkm.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzm = zzm(bArr, i11, zzioVar);
            zzmmVar.zzh(i10, Long.valueOf(zzioVar.zzb));
            return iZzm;
        }
        if (i13 == 1) {
            zzmmVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzj = zzj(bArr, i11, zzioVar);
            int i14 = zzioVar.zza;
            if (i14 < 0) {
                throw zzkm.zzd();
            }
            if (i14 > bArr.length - iZzj) {
                throw zzkm.zzf();
            }
            if (i14 == 0) {
                zzmmVar.zzh(i10, zzjb.zzb);
            } else {
                zzmmVar.zzh(i10, zzjb.zzl(bArr, iZzj, i14));
            }
            return iZzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzkm.zzb();
            }
            zzmmVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzmm zzmmVarZze = zzmm.zze();
        int i16 = 0;
        while (i11 < i12) {
            int iZzj2 = zzj(bArr, i11, zzioVar);
            int i17 = zzioVar.zza;
            if (i17 == i15) {
                i16 = i17;
                i11 = iZzj2;
                break;
            }
            i16 = i17;
            i11 = zzi(i17, bArr, iZzj2, i12, zzmmVarZze, zzioVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzkm.zze();
        }
        zzmmVar.zzh(i10, zzmmVarZze);
        return i11;
    }

    public static int zzj(byte[] bArr, int i10, zzio zzioVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzioVar);
        }
        zzioVar.zza = b10;
        return i11;
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzio zzioVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzioVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzioVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzioVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzioVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzioVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int iZzj = zzj(bArr, i11, zzioVar);
        zzkdVar.zzh(zzioVar.zza);
        while (iZzj < i12) {
            int iZzj2 = zzj(bArr, iZzj, zzioVar);
            if (i10 != zzioVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i10, zzio zzioVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzioVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zzioVar.zzb = j11;
        return i12;
    }

    public static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int zza(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int iZzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - iZzj) {
                if (i11 == 0) {
                    zzioVar.zzc = zzjb.zzb;
                    return iZzj;
                }
                zzioVar.zzc = zzjb.zzl(bArr, iZzj, i11);
                return iZzj + i11;
            }
            throw zzkm.zzf();
        }
        throw zzkm.zzd();
    }

    public static int zze(zzlu zzluVar, int i10, byte[] bArr, int i11, int i12, zzkj zzkjVar, zzio zzioVar) throws IOException {
        int iZzd = zzd(zzluVar, bArr, i11, i12, zzioVar);
        zzkjVar.add(zzioVar.zzc);
        while (iZzd < i12) {
            int iZzj = zzj(bArr, iZzd, zzioVar);
            if (i10 != zzioVar.zza) {
                break;
            }
            iZzd = zzd(zzluVar, bArr, iZzj, i12, zzioVar);
            zzkjVar.add(zzioVar.zzc);
        }
        return iZzd;
    }

    public static int zzg(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int iZzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzioVar.zzc = "";
                return iZzj;
            }
            zzioVar.zzc = new String(bArr, iZzj, i11, zzkk.zzb);
            return iZzj + i11;
        }
        throw zzkm.zzd();
    }

    public static int zzh(byte[] bArr, int i10, zzio zzioVar) throws zzkm {
        int iZzj = zzj(bArr, i10, zzioVar);
        int i11 = zzioVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzioVar.zzc = "";
                return iZzj;
            }
            zzioVar.zzc = zzna.zzd(bArr, iZzj, i11);
            return iZzj + i11;
        }
        throw zzkm.zzd();
    }
}
