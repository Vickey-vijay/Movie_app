package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzapd {
    private static void zzc(zzeq zzeqVar) {
        int iZzj;
        int iZzj2 = zzeqVar.zzj(2);
        if (iZzj2 == 0) {
            zzeqVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeqVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeqVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeqVar.zzi();
            int i10 = true != zZzi ? 5 : 1;
            int i11 = true == zZzi ? 7 : 5;
            int i12 = true == zZzi ? 8 : 6;
            int i13 = 0;
            while (i13 < iZzf) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeqVar.zzj(2) == 3 && zzeqVar.zzj(i11) * i10 != 0) {
                        zzeqVar.zzg();
                    }
                    iZzj = zzeqVar.zzj(i12) * i10;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeqVar.zzg();
                    }
                    zzeqVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeqVar.zzi()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzd(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        boolean zZzi = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        zzeqVar.zzh(8);
        boolean zZzi = zzeqVar.zzi();
        boolean zZzi2 = zzeqVar.zzi();
        if (zZzi) {
            zzeqVar.zzh(5);
        }
        if (zZzi2) {
            zzeqVar.zzh(6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public static boolean zza(zzeq zzeqVar, zzapb zzapbVar) throws zzat {
        long jZzk;
        zzeqVar.zze();
        int iZzf = zzf(zzeqVar, 3, 8, 8);
        zzapbVar.zza = iZzf;
        if (iZzf == -1) {
            return false;
        }
        zzgrc.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzeqVar.zzc() < 2) {
            jZzk = -1;
        } else {
            jZzk = zzeqVar.zzk(2);
            if (jZzk == 3) {
                if (zzeqVar.zzc() < 8) {
                    jZzk = -1;
                } else {
                    long jZzk2 = zzeqVar.zzk(8);
                    long j10 = 3 + jZzk2;
                    if (jZzk2 != 255) {
                        jZzk = j10;
                    } else if (zzeqVar.zzc() < 32) {
                        jZzk = -1;
                    } else {
                        jZzk = j10 + zzeqVar.zzk(32);
                    }
                }
            }
        }
        zzapbVar.zzb = jZzk;
        if (jZzk == -1) {
            return false;
        }
        if (jZzk > 16) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jZzk).length() + 49);
            sb2.append("Contains sub-stream with an invalid packet label ");
            sb2.append(jZzk);
            throw zzat.zzc(sb2.toString());
        }
        if (jZzk == 0) {
            int i10 = zzapbVar.zza;
            if (i10 == 1) {
                throw zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzf2 = zzf(zzeqVar, 11, 24, 24);
        zzapbVar.zzc = iZzf2;
        return iZzf2 != -1;
    }

    public static zzapc zzb(zzeq zzeqVar) throws zzat {
        int iZzj;
        int i10;
        char c10;
        int i11;
        int iZzj2;
        char c11;
        int iZzj3 = zzeqVar.zzj(8);
        int i12 = 5;
        int iZzj4 = zzeqVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzat.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeqVar.zzj(24);
        }
        int iZzj5 = zzeqVar.zzj(3);
        int i13 = 1;
        if (iZzj5 == 0) {
            i10 = 768;
        } else if (iZzj5 == 1) {
            i10 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i10 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            i10 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c10 = 0;
        } else if (iZzj5 == 2) {
            c10 = 2;
        } else if (iZzj5 == 3) {
            c10 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzat.zzc(sb4.toString());
            }
            c10 = 1;
        }
        zzeqVar.zzh(2);
        zzc(zzeqVar);
        int iZzj6 = zzeqVar.zzj(5);
        int i14 = 0;
        int iZzf = 0;
        while (true) {
            int i15 = 16;
            if (i14 < iZzj6 + 1) {
                int iZzj7 = zzeqVar.zzj(3);
                iZzf += zzf(zzeqVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeqVar.zzi()) {
                    zzc(zzeqVar);
                }
                i14++;
            } else {
                int iZzf2 = zzf(zzeqVar, 4, 8, 16) + 1;
                zzeqVar.zzg();
                int i16 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i16 >= iZzf2) {
                        int i17 = iZzj3;
                        byte[] bArr = null;
                        if (zzeqVar.zzi()) {
                            int iZzf3 = zzf(zzeqVar, 2, 4, 8) + 1;
                            for (int i18 = 0; i18 < iZzf3; i18++) {
                                int iZzf4 = zzf(zzeqVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeqVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeqVar.zzj(4) + 1;
                                    zzeqVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i19 = 0; i19 < iZzj8; i19++) {
                                        bArr2[i19] = (byte) zzeqVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeqVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzat.zzc(sb5.toString());
                        }
                        return new zzapc(i17, (int) (((double) iZzj) * d10), (int) (((double) i10) * d10), bArr3, null);
                    }
                    int iZzj9 = zzeqVar.zzj(2);
                    if (iZzj9 == 0) {
                        i11 = iZzj3;
                        zzd(zzeqVar);
                        if (c10 > 0) {
                            zze(zzeqVar);
                        }
                    } else if (iZzj9 != i13) {
                        if (iZzj9 == 3) {
                            zzf(zzeqVar, 4, 8, i15);
                            int iZzf6 = zzf(zzeqVar, 4, 8, i15);
                            if (zzeqVar.zzi()) {
                                zzf(zzeqVar, 8, i15, 0);
                            }
                            zzeqVar.zzg();
                            if (iZzf6 > 0) {
                                zzeqVar.zzh(iZzf6 * 8);
                            }
                        }
                        i11 = iZzj3;
                    } else {
                        if (zzd(zzeqVar)) {
                            zzeqVar.zzg();
                        }
                        if (c10 > 0) {
                            zze(zzeqVar);
                            iZzj2 = zzeqVar.zzj(2);
                            c11 = c10;
                        } else {
                            iZzj2 = 0;
                            c11 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeqVar.zzh(6);
                            int iZzj10 = zzeqVar.zzj(2);
                            zzeqVar.zzh(4);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(i12);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeqVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeqVar.zzg();
                            }
                        }
                        i11 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeqVar.zzj(2);
                        if (iZzj11 > 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(iFloor);
                        }
                        if (c11 == 0 && iZzj11 == 0) {
                            zzeqVar.zzg();
                        }
                    }
                    i16++;
                    iZzj3 = i11;
                    i12 = 5;
                    i13 = 1;
                    i15 = 16;
                }
            }
        }
    }

    private static int zzf(zzeq zzeqVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Math.addExact(Math.addExact(i13, i14), 1 << i12);
        if (zzeqVar.zzc() < i10) {
            return -1;
        }
        int iZzj = zzeqVar.zzj(i10);
        if (iZzj == i13) {
            if (zzeqVar.zzc() < i11) {
                return -1;
            }
            int iZzj2 = zzeqVar.zzj(i11);
            int i15 = iZzj + iZzj2;
            if (iZzj2 == i14) {
                if (zzeqVar.zzc() < i12) {
                    return -1;
                }
                return i15 + zzeqVar.zzj(i12);
            }
            return i15;
        }
        return iZzj;
    }
}
