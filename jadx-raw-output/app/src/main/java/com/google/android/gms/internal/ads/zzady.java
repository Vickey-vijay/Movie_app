package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void zzc(int i10, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i10 >> 16) & 255);
        bArrZzi[5] = (byte) ((i10 >> 8) & 255);
        bArrZzi[6] = (byte) (i10 & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int iZzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzadwVar.zzb = iZzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zZzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeqVar.zzh(iZzj * 8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01f1 A[LOOP:1: B:140:0x01ef->B:141:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0236  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[PHI: r15
  0x00c8: PHI (r15v14 int) = (r15v6 int), (r15v2 int) binds: [B:137:0x01e6, B:42:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    public static zzv zza(zzer zzerVar, String str, @Nullable String str2, @Nullable zzq zzqVar) throws zzat {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zZzi;
        int iZzj;
        int iZzj2;
        int iZzc;
        int iZzj3;
        boolean z10;
        int i16;
        int i17;
        int iZzj4;
        int i18;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int iZzc2 = zzeqVar.zzc();
        int iZzj5 = zzeqVar.zzj(3);
        if (iZzj5 > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb2.append("Unsupported AC-4 DSI version: ");
            sb2.append(iZzj5);
            throw zzat.zzc(sb2.toString());
        }
        int iZzj6 = zzeqVar.zzj(7);
        int i19 = true != zzeqVar.zzi() ? 44100 : 48000;
        zzeqVar.zzh(4);
        int iZzj7 = zzeqVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(16);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzeqVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeqVar.zzm();
        }
        zzadw zzadwVar = new zzadw(null);
        int i20 = 0;
        while (true) {
            if (i20 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzeqVar.zzi();
                    iZzj = zzeqVar.zzj(5);
                    iZzj2 = zzeqVar.zzj(5);
                    iZzc = 0;
                    iZzj3 = 0;
                    z10 = false;
                } else {
                    int iZzj8 = zzeqVar.zzj(8);
                    iZzj3 = zzeqVar.zzj(8);
                    if (iZzj3 == 255) {
                        iZzj3 = zzeqVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzeqVar.zzh(iZzj3 * 8);
                        i20++;
                    } else {
                        iZzc = (iZzc2 - zzeqVar.zzc()) / 8;
                        int iZzj9 = zzeqVar.zzj(5);
                        z10 = iZzj9 == 31;
                        iZzj2 = iZzj8;
                        iZzj = iZzj9;
                        zZzi = false;
                    }
                }
                zzadwVar.zzf = iZzj2;
                if (zZzi || z10 || iZzj != 6) {
                    zzadwVar.zzg = zzeqVar.zzj(3);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(5);
                    }
                    zzeqVar.zzh(2);
                    if (iZzj5 == 1) {
                        if (iZzj2 == 1) {
                            zzeqVar.zzh(2);
                        } else if (iZzj2 == 2) {
                            iZzj2 = 2;
                            zzeqVar.zzh(2);
                        }
                    }
                    zzeqVar.zzh(5);
                    zzeqVar.zzh(10);
                    if (iZzj5 == 1) {
                        if (iZzj2 > 0) {
                            zzadwVar.zza = zzeqVar.zzi();
                        }
                        if (zzadwVar.zza) {
                            if (iZzj2 != 1) {
                                if (iZzj2 == 2) {
                                    i17 = 2;
                                } else {
                                    i16 = 2;
                                    i17 = iZzj2;
                                }
                                zzeqVar.zzh(24);
                            } else {
                                i17 = 1;
                            }
                            int iZzj10 = zzeqVar.zzj(5);
                            if (iZzj10 >= 0 && iZzj10 <= 15) {
                                zzadwVar.zzb = iZzj10;
                            }
                            if (iZzj10 < 11 || iZzj10 > 14) {
                                i16 = 2;
                            } else {
                                zzadwVar.zzd = zzeqVar.zzi();
                                i16 = 2;
                                zzadwVar.zze = zzeqVar.zzj(2);
                            }
                            zzeqVar.zzh(24);
                        } else {
                            i16 = 2;
                            i17 = iZzj2;
                        }
                        if (iZzj2 == 1 || iZzj2 == i16) {
                            if (zzeqVar.zzi() && zzeqVar.zzi()) {
                                zzeqVar.zzh(i16);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzg();
                                int i21 = 8;
                                int iZzj11 = zzeqVar.zzj(8);
                                int i22 = 0;
                                while (i22 < iZzj11) {
                                    zzeqVar.zzh(i21);
                                    i22++;
                                    i21 = 8;
                                }
                            }
                        }
                        iZzj2 = i17;
                    }
                    if (!zZzi && !z10) {
                        zzeqVar.zzg();
                        if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                            if (iZzj2 == 0) {
                                for (int i23 = 0; i23 < 2; i23++) {
                                    zzd(zzeqVar, zzadwVar);
                                }
                                iZzj2 = 0;
                            } else {
                                int i24 = 0;
                                for (int i25 = 2; i24 < i25; i25 = 2) {
                                    zze(zzeqVar, zzadwVar);
                                    i24++;
                                }
                            }
                        } else if (iZzj == 3 || iZzj == 4) {
                            if (iZzj2 == 0) {
                                for (int i26 = 0; i26 < 3; i26++) {
                                    zzd(zzeqVar, zzadwVar);
                                }
                                iZzj2 = 0;
                            } else {
                                int i27 = 0;
                                for (int i28 = 3; i27 < i28; i28 = 3) {
                                    zze(zzeqVar, zzadwVar);
                                    i27++;
                                }
                            }
                        } else if (iZzj != 5) {
                            int iZzj12 = zzeqVar.zzj(7);
                            for (int i29 = 0; i29 < iZzj12; i29++) {
                                zzeqVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzeqVar, zzadwVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj13 = zzeqVar.zzj(3);
                            for (int i30 = 0; i30 < iZzj13 + 2; i30++) {
                                zze(zzeqVar, zzadwVar);
                            }
                        }
                    } else if (iZzj2 == 0) {
                        zzd(zzeqVar, zzadwVar);
                        iZzj2 = 0;
                    } else {
                        zze(zzeqVar, zzadwVar);
                    }
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                        i13 = 7;
                        iZzj4 = zzeqVar.zzj(7);
                        for (i18 = 0; i18 < iZzj4; i18++) {
                            zzeqVar.zzh(15);
                        }
                    } else {
                        i13 = 7;
                    }
                } else {
                    i13 = 7;
                    iZzj4 = zzeqVar.zzj(7);
                    while (i18 < iZzj4) {
                        zzeqVar.zzh(15);
                    }
                }
                if (iZzj2 <= 0) {
                    i10 = 5;
                } else {
                    if (zzeqVar.zzi() && !zzg(zzeqVar)) {
                        throw zzat.zzc("Can't parse bitrate DSI.");
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzm();
                        zzeqVar.zzo(zzeqVar.zzj(16));
                        i10 = 5;
                        int iZzj14 = zzeqVar.zzj(5);
                        for (int i31 = 0; i31 < iZzj14; i31++) {
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(8);
                        }
                    } else {
                        i10 = 5;
                    }
                }
                i11 = 8;
                zzeqVar.zzm();
                if (iZzj5 == 1) {
                    int iZzc3 = ((iZzc2 - zzeqVar.zzc()) / 8) - iZzc;
                    if (iZzj3 < iZzc3) {
                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzeqVar.zzo(iZzj3 - iZzc3);
                }
                if (zzadwVar.zza) {
                    i12 = -1;
                    if (zzadwVar.zzb == -1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i20).length() + 45);
                        sb3.append("Can't determine channel mode of presentation ");
                        sb3.append(i20);
                        throw zzat.zzc(sb3.toString());
                    }
                } else {
                    i12 = -1;
                }
            } else {
                i10 = 5;
                i11 = 8;
                i12 = -1;
                i13 = 7;
            }
            if (zzadwVar.zza) {
                int i32 = zzadwVar.zzb;
                boolean z11 = zzadwVar.zzd;
                int i33 = zzadwVar.zze;
                switch (i32) {
                    case 0:
                        i15 = 11;
                        i13 = 1;
                        break;
                    case 1:
                        i15 = 11;
                        i13 = 2;
                        break;
                    case 2:
                        i15 = 11;
                        i13 = 3;
                        break;
                    case 3:
                        i13 = i10;
                        i15 = 11;
                        break;
                    case 4:
                        i15 = 11;
                        i13 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i15 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i13 = i11;
                        i15 = 11;
                        break;
                    case 11:
                        i15 = 11;
                        i13 = 11;
                        break;
                    case 12:
                        i13 = 12;
                        i15 = 11;
                        break;
                    case 13:
                        i13 = 13;
                        i15 = 11;
                        break;
                    case 14:
                        i15 = 11;
                        i13 = 14;
                        break;
                    case 15:
                        i15 = 11;
                        i13 = 24;
                        break;
                    default:
                        i13 = i12;
                        i15 = 11;
                        break;
                }
                if (i32 == i15 || i32 == 12 || i32 == 13 || i32 == 14) {
                    if (!z11) {
                        i13 -= 2;
                    }
                    i14 = i13;
                    if (i33 == 0) {
                        i14 -= 4;
                    } else if (i33 == 1) {
                        i14 -= 2;
                    }
                } else {
                    i14 = i13;
                }
            } else {
                int i34 = zzadwVar.zzc;
                if (i34 > 0) {
                    i14 = i34 + 1;
                    if (zzadwVar.zzg == 4 && i14 == 17) {
                        i14 = 21;
                    }
                } else {
                    int i35 = zzadwVar.zzg;
                    if (i35 == 0) {
                        i14 = 2;
                    } else if (i35 == 1) {
                        i14 = 6;
                    } else if (i35 == 2) {
                        i14 = i11;
                    } else if (i35 == 3) {
                        i14 = 10;
                    } else if (i35 != 4) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i35).length() + 33);
                        sb4.append("AC-4 level ");
                        sb4.append(i35);
                        sb4.append(" has not been defined.");
                        zzee.zzc("Ac4Util", sb4.toString());
                        i14 = 2;
                    } else {
                        i14 = 12;
                    }
                }
            }
            if (i14 <= 0) {
                throw zzat.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzadwVar.zzf), Integer.valueOf(zzadwVar.zzg)};
            String str3 = zzfj.zza;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            zzt zztVar = new zzt();
            zztVar.zza(str);
            zztVar.zzm("audio/ac4");
            zztVar.zzE(i14);
            zztVar.zzF(i19);
            zztVar.zzq(zzqVar);
            zztVar.zze(str2);
            zztVar.zzj(str4);
            return zztVar.zzM();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    public static zzadx zzb(zzeq zzeqVar) {
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = zzeqVar.zzj(16);
        int iZzj3 = zzeqVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzeqVar.zzj(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iZzj3 + i10;
        if (iZzj2 == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iZzj4 = zzeqVar.zzj(2);
        int i14 = 0;
        if (iZzj4 == 3) {
            int i15 = 0;
            while (true) {
                iZzj = i15 + zzeqVar.zzj(2);
                if (!zzeqVar.zzi()) {
                    break;
                }
                i15 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int iZzj5 = zzeqVar.zzj(10);
        if (zzeqVar.zzi() && zzeqVar.zzj(3) > 0) {
            zzeqVar.zzh(2);
        }
        int i16 = true != zzeqVar.zzi() ? 44100 : 48000;
        int iZzj6 = zzeqVar.zzj(4);
        if (i16 == 44100 && iZzj6 == 13) {
            i11 = zzb[13];
        } else {
            if (i16 == 48000 && iZzj6 < 14) {
                i14 = zzb[iZzj6];
                int i17 = iZzj5 % 5;
                if (i17 == 1) {
                    if (iZzj6 != 3 || iZzj6 == 8) {
                        i14++;
                    }
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                            i14++;
                        }
                    } else if (iZzj6 != 3) {
                        i14++;
                    } else {
                        i14++;
                    }
                } else if (iZzj6 == 8 || iZzj6 == 11) {
                    i14++;
                }
            }
            i11 = i14;
        }
        return new zzadx(iZzj4, 2, i16, i13, i11, null);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
