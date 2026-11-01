package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int zzc(byte[] bArr) {
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i13 = (bArr[7] & 3) << 12;
                i14 = (bArr[6] & 255) << 4;
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = (bArr[5] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b10 = bArr[7];
            } else {
                i13 = (bArr[6] & 3) << 12;
                i14 = (bArr[7] & 255) << 4;
                b11 = bArr[8];
            }
            i12 = (((b11 & 60) >> 2) | i13 | i14) + 1;
            z10 = true;
            if (z10) {
                return (i12 * 16) / 14;
            }
            return i12;
        }
        i10 = (bArr[4] & 3) << 12;
        i11 = (bArr[7] & 255) << 4;
        b10 = bArr[6];
        i12 = (((b10 & 240) >> 4) | i10 | i11) + 1;
        if (z10) {
            return (i12 * 16) / 14;
        }
        return i12;
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzeqVar.zzi(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return i12 + zzeqVar.zzj(iArr[i10]);
    }

    private static zzeq zzi(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        zzeq zzeqVar = new zzeq(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(bArrCopyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeqVar;
    }

    public static zzaes zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzt;
        int iZzj;
        int i10;
        int i11;
        zzeq zzeqVarZzi = zzi(bArr);
        int iZzj2 = zzeqVarZzi.zzj(32);
        int iZzh = zzh(zzeqVarZzi, zzf, true) + 1;
        char c10 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jZzt = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzeqVarZzi.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i12 = iZzh - 2;
            if ((((char) (bArr[i12] << 8)) | (bArr[iZzh - 1] & 255)) != zzfj.zzH(bArr, 0, i12, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeqVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i10 = 512;
            } else if (iZzj3 == 1) {
                i10 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb2.append("Unsupported base duration index in DTS UHD header: ");
                    sb2.append(iZzj3);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i10 = 384;
            }
            int iZzj4 = zzeqVarZzi.zzj(3) + 1;
            int iZzj5 = zzeqVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i11 = 32000;
            } else if (iZzj5 == 1) {
                i11 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb3.append("Unsupported clock rate index in DTS UHD header: ");
                    sb3.append(iZzj5);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i11 = 48000;
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            iZzj = (1 << zzeqVarZzi.zzj(2)) * i11;
            jZzt = zzfj.zzt(i10 * iZzj4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i13 = iZzj;
        long j10 = jZzt;
        int iZzh2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iZzh2 += zzh(zzeqVarZzi, zzg, true);
        }
        for (int i14 = 0; i14 <= 0; i14++) {
            if (c10 != 0) {
                atomicInteger.set(zzh(zzeqVarZzi, zzh, true));
            }
            iZzh2 += atomicInteger.get() != 0 ? zzh(zzeqVarZzi, zzi, true) : 0;
        }
        return new zzaes("audio/vnd.dts.uhd;profile=p2", 2, i13, iZzh + iZzh2, j10, 0, null);
    }

    public static zzv zzb(byte[] bArr, @Nullable String str, @Nullable String str2, int i10, String str3, @Nullable zzq zzqVar) {
        int i11;
        int i12;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(60);
        int i13 = zzb[zzeqVarZzi.zzj(6)];
        int i14 = zzc[zzeqVarZzi.zzj(4)];
        int iZzj = zzeqVarZzi.zzj(5);
        if (iZzj >= 29) {
            i11 = -1;
        } else {
            i11 = (zzd[iZzj] * 1000) / 2;
        }
        zzeqVarZzi.zzh(10);
        if (zzeqVarZzi.zzj(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = i13 + i12;
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i11);
        zztVar.zzE(i15);
        zztVar.zzF(i14);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i10);
        return zztVar.zzM();
    }

    public static zzaes zzd(byte[] bArr) throws zzat {
        int i10;
        int i11;
        int iZzj;
        int i12;
        int iZzj2;
        long jZzt;
        int i13;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(40);
        int iZzj3 = zzeqVarZzi.zzj(2);
        boolean zZzi = zzeqVarZzi.zzi();
        if (true != zZzi) {
            i10 = 16;
        } else {
            i10 = 20;
        }
        if (true != zZzi) {
            i11 = 8;
        } else {
            i11 = 12;
        }
        zzeqVarZzi.zzh(i11);
        int iZzj4 = zzeqVarZzi.zzj(i10) + 1;
        boolean zZzi2 = zzeqVarZzi.zzi();
        int i14 = 0;
        if (zZzi2) {
            iZzj = zzeqVarZzi.zzj(2);
            int iZzj5 = zzeqVarZzi.zzj(3) + 1;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            int iZzj6 = zzeqVarZzi.zzj(3) + 1;
            int iZzj7 = zzeqVarZzi.zzj(3) + 1;
            if (iZzj6 == 1 && iZzj7 == 1) {
                int i15 = iZzj3 + 1;
                int iZzj8 = zzeqVarZzi.zzj(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    if (((iZzj8 >> i16) & 1) == 1) {
                        zzeqVarZzi.zzh(8);
                    }
                }
                int i17 = iZzj5 * 512;
                if (zzeqVarZzi.zzi()) {
                    zzeqVarZzi.zzh(2);
                    int iZzj9 = (zzeqVarZzi.zzj(2) + 1) << 2;
                    int iZzj10 = zzeqVarZzi.zzj(2) + 1;
                    while (i14 < iZzj10) {
                        zzeqVarZzi.zzh(iZzj9);
                        i14++;
                    }
                }
                i14 = i17;
            } else {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            iZzj = -1;
        }
        zzeqVarZzi.zzh(i10);
        zzeqVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(4);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(24);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzo(zzeqVarZzi.zzj(10) + 1);
            }
            zzeqVarZzi.zzh(5);
            int i18 = zze[zzeqVarZzi.zzj(4)];
            iZzj2 = zzeqVarZzi.zzj(8) + 1;
            i12 = i18;
        } else {
            i12 = -2147483647;
            iZzj2 = -1;
        }
        if (zZzi2) {
            if (iZzj != 0) {
                if (iZzj != 1) {
                    if (iZzj == 2) {
                        i13 = 48000;
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj).length() + 51);
                        sb2.append("Unsupported reference clock code in DTS HD header: ");
                        sb2.append(iZzj);
                        throw zzat.zzb(sb2.toString(), null);
                    }
                } else {
                    i13 = 44100;
                }
            } else {
                i13 = 32000;
            }
            jZzt = zzfj.zzt(i14, 1000000L, i13, RoundingMode.DOWN);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzaes("audio/vnd.dts.hd;profile=lbr", iZzj2, i12, iZzj4, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        int i10;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(42);
        if (true != zzeqVarZzi.zzi()) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        return zzeqVarZzi.zzj(i10) + 1;
    }

    public static int zzg(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(32);
        return zzh(zzeqVarZzi, zzj, true) + 1;
    }
}
