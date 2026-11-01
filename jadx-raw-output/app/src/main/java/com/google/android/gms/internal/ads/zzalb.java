package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzagc zza(zzaev zzaevVar) throws IOException {
        return zzc(zzaevVar, true, false);
    }

    @Nullable
    public static zzagc zzb(zzaev zzaevVar, boolean z10) throws IOException {
        return zzc(zzaevVar, false, z10);
    }

    @Nullable
    private static zzagc zzc(zzaev zzaevVar, boolean z10, boolean z11) throws IOException {
        long j10;
        zzer zzerVar;
        int i10;
        boolean z12;
        int[] iArr;
        long jZzo = zzaevVar.zzo();
        long j11 = -1;
        long j12 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jZzo != -1 && jZzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j12 = jZzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i11 = (int) j12;
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        while (i13 < i11) {
            zzerVar2.zza(8);
            if (!zzaevVar.zzh(zzerVar2.zzi(), i12, 8, true)) {
                break;
            }
            long jZzz = zzerVar2.zzz();
            int iZzB = zzerVar2.zzB();
            int i14 = 16;
            if (jZzz == 1) {
                zzaevVar.zzi(zzerVar2.zzi(), 8, 8);
                zzerVar2.zzf(16);
                jZzz = zzerVar2.zzD();
            } else {
                if (jZzz == 0) {
                    long jZzo2 = zzaevVar.zzo();
                    if (jZzo2 != j11) {
                        jZzz = (jZzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                i14 = 8;
            }
            long j13 = jZzz;
            long j14 = i14;
            if (j13 < j14) {
                if (iZzB == 1718773093) {
                    if (i14 == 8) {
                        j13 = 8;
                        iZzB = 1718773093;
                    } else {
                        iZzB = 1718773093;
                    }
                }
                return new zzajv(iZzB, j13, i14);
            }
            i13 += i14;
            if (iZzB == 1836019574) {
                i11 += (int) j13;
                if (jZzo != -1 && i11 > jZzo) {
                    i11 = (int) jZzo;
                }
                j11 = -1;
                i12 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j10 = jZzo;
                    zzerVar = zzerVar2;
                    i10 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i12 = 1;
                        break;
                    }
                    z13 |= !(iZzB != 1835295092);
                    if (iZzB == 1937007212) {
                        if (j13 <= 1000000) {
                            iZzB = 1937007212;
                        }
                        i12 = 0;
                        break;
                    }
                    zzer zzerVar3 = zzerVar2;
                    j10 = jZzo;
                    if ((((long) i13) + j13) - j14 >= i11) {
                        i12 = 0;
                        break;
                    }
                    int i15 = (int) (j13 - j14);
                    i13 += i15;
                    if (iZzB != 1718909296) {
                        zzerVar = zzerVar3;
                        i10 = 0;
                        if (i15 != 0) {
                            zzaevVar.zzk(i15);
                        }
                    } else {
                        if (i15 < 8) {
                            return new zzajv(1718909296, i15, 8);
                        }
                        zzerVar = zzerVar3;
                        zzerVar.zza(i15);
                        i10 = 0;
                        zzaevVar.zzi(zzerVar.zzi(), 0, i15);
                        int iZzB2 = zzerVar.zzB();
                        boolean zZzd = zzd(iZzB2, z11) | z13;
                        zzerVar.zzk(4);
                        int iZzd = zzerVar.zzd() / 4;
                        if (!zZzd && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i16 = 0;
                            while (true) {
                                if (i16 >= iZzd) {
                                    z12 = zZzd;
                                    break;
                                }
                                int iZzB3 = zzerVar.zzB();
                                iArr[i16] = iZzB3;
                                if (zzd(iZzB3, z11)) {
                                    z12 = true;
                                    break;
                                }
                                i16++;
                            }
                        } else {
                            z12 = zZzd;
                            iArr = null;
                        }
                        if (!z12) {
                            return new zzalg(iZzB2, iArr);
                        }
                        z13 = z12;
                    }
                }
                zzerVar2 = zzerVar;
                i12 = i10;
                jZzo = j10;
                j11 = -1;
            }
        }
        if (!z13) {
            return zzakx.zza;
        }
        if (z10 != i12) {
            return i12 != 0 ? zzakp.zza : zzakp.zzb;
        }
        return null;
    }

    private static boolean zzd(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z10) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
