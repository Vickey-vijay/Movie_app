package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:286:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:603:0x0d67 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:604:0x0d69  */
    /* JADX WARN: Code duplicated, block: B:606:0x0d78  */
    /* JADX WARN: Code duplicated, block: B:607:0x0d83  */
    /* JADX WARN: Code duplicated, block: B:609:0x0d9e  */
    /* JADX WARN: Code duplicated, block: B:613:0x0dd6  */
    /* JADX WARN: Code duplicated, block: B:614:0x0e01  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142 A[PHI: r10
  0x0142: PHI (r10v7 int) = (r10v9 int), (r10v2 int) binds: [B:83:0x014b, B:74:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    public static List zzb(zzfu zzfuVar, zzafn zzafnVar, long j10, @Nullable zzq zzqVar, boolean z10, boolean z11, zzgqt zzgqtVar, boolean z12) throws zzat {
        int i10;
        int i11;
        long jZzz;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        ArrayList arrayList;
        long j11;
        long jZzt;
        String str;
        zzfu zzfuVar2;
        long[] jArr;
        long[] jArr2;
        zzv zzvVar;
        zzv zzvVarZzM;
        zzft zzftVar;
        zzap zzapVar;
        zzap zzapVar2;
        zzalc zzalcVar;
        Pair pairZzn;
        long j12;
        zzer zzerVar;
        zzq zzqVarZzb;
        int i18;
        String strZza;
        int i19;
        zzakd zzakdVar;
        int i20;
        zzakd zzakdVar2;
        String str2;
        int i21;
        int i22;
        zzgj zzgjVar;
        zzguf zzgufVarZzi;
        boolean z14;
        String str3;
        boolean z15;
        String str4;
        boolean z16;
        char c10;
        int i23;
        boolean z17;
        int i24;
        String str5;
        int i25;
        boolean z18;
        boolean z19;
        zzguf zzgufVarZzi2;
        String str6;
        boolean z20;
        boolean z21;
        String str7;
        boolean z22;
        boolean z23;
        zzguf zzgufVarZzj;
        String str8;
        String str9;
        long j13;
        long j14;
        zzguf zzgufVar;
        boolean z24;
        zzalc zzalcVar2;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        int i26 = 0;
        while (true) {
            List list = zzfuVar.zzc;
            if (i26 >= list.size()) {
                return arrayList3;
            }
            zzfu zzfuVar3 = (zzfu) list.get(i26);
            if (zzfuVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i11 = i26;
            } else {
                zzfv zzfvVarZzc = zzfuVar.zzc(1836476516);
                zzfvVarZzc.getClass();
                zzfu zzfuVarZzd = zzfuVar3.zzd(1835297121);
                zzfuVarZzd.getClass();
                zzfv zzfvVarZzc2 = zzfuVarZzd.zzc(1751411826);
                zzfvVarZzc2.getClass();
                int iZzi = zzi(zzfvVarZzc2.zza);
                if (iZzi == 1936684398) {
                    i10 = 1;
                } else if (iZzi == 1986618469) {
                    i10 = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728 || iZzi == 1937072752) {
                    i10 = 3;
                } else {
                    i10 = iZzi == 1835365473 ? 5 : -1;
                }
                if (i10 == -1) {
                    arrayList = arrayList3;
                    i11 = i26;
                } else {
                    zzfv zzfvVarZzc3 = zzfuVar3.zzc(1953196132);
                    zzfvVarZzc3.getClass();
                    zzer zzerVar2 = zzfvVarZzc3.zza;
                    zzerVar2.zzh(8);
                    int iZza = zza(zzerVar2.zzB());
                    zzerVar2.zzk(iZza == 0 ? 8 : 16);
                    int iZzB = zzerVar2.zzB();
                    zzerVar2.zzk(4);
                    int iZzg = zzerVar2.zzg();
                    int i27 = 0;
                    while (true) {
                        int i28 = iZza == 0 ? 4 : 8;
                        i11 = i26;
                        if (i27 >= i28) {
                            zzerVar2.zzk(i28);
                        } else {
                            if (zzerVar2.zzi()[iZzg + i27] != -1) {
                                jZzz = iZza == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                                if (jZzz != 0) {
                                    break;
                                }
                                break;
                            }
                            i27++;
                            i26 = i11;
                        }
                        jZzz = -9223372036854775807L;
                        break;
                    }
                    zzerVar2.zzk(10);
                    int iZzt = zzerVar2.zzt();
                    zzerVar2.zzk(4);
                    int iZzB2 = zzerVar2.zzB();
                    int iZzB3 = zzerVar2.zzB();
                    zzerVar2.zzk(4);
                    int iZzB4 = zzerVar2.zzB();
                    int iZzB5 = zzerVar2.zzB();
                    if (iZzB2 != 0) {
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        iZzB4 = -65536;
                                    }
                                    i14 = iZzB4;
                                    i12 = -65536;
                                } else if (iZzB5 == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (true != z13) {
                                    i15 = 270;
                                } else {
                                    i14 = iZzB4;
                                    i12 = -65536;
                                }
                                i17 = i15;
                                i16 = 16;
                            } else {
                                i14 = iZzB4;
                                i12 = iZzB3;
                            }
                            i13 = 0;
                        } else {
                            int i29 = iZzB4;
                            i12 = iZzB3;
                            i13 = iZzB2;
                            i14 = i29;
                        }
                        if ((i13 != -65536 || i13 == 65536) && i12 == 0 && i14 == 0 && iZzB5 == -65536) {
                            i15 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            i17 = i15;
                            i16 = 16;
                        } else {
                            i16 = 16;
                            i17 = 0;
                        }
                    } else {
                        if (iZzB3 == 65536) {
                            if (iZzB4 != -65536) {
                                if (iZzB4 == 65536) {
                                    z24 = iZzB5 != 0;
                                    iZzB4 = 65536;
                                }
                                iZzB3 = 65536;
                            } else {
                                z24 = iZzB5 != 0;
                            }
                            if (true != z24) {
                                i15 = 90;
                            } else {
                                iZzB3 = 65536;
                            }
                            i17 = i15;
                            i16 = 16;
                        }
                        iZzB2 = 0;
                        if (iZzB2 == 0) {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        iZzB4 = -65536;
                                    }
                                    i14 = iZzB4;
                                    i12 = -65536;
                                } else if (iZzB5 == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (true != z13) {
                                    i15 = 270;
                                } else {
                                    i14 = iZzB4;
                                    i12 = -65536;
                                }
                                i17 = i15;
                                i16 = 16;
                            } else {
                                i14 = iZzB4;
                                i12 = iZzB3;
                            }
                            i13 = 0;
                        } else {
                            int i210 = iZzB4;
                            i12 = iZzB3;
                            i13 = iZzB2;
                            i14 = i210;
                        }
                        if (i13 != -65536) {
                            i15 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            i17 = i15;
                            i16 = 16;
                        } else {
                            i15 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                            i17 = i15;
                            i16 = 16;
                        }
                        i16 = 16;
                        i17 = 0;
                    }
                    zzerVar2.zzk(i16);
                    short sZzv = zzerVar2.zzv();
                    zzerVar2.zzk(2);
                    short sZzv2 = zzerVar2.zzv();
                    long j15 = j10 == -9223372036854775807L ? jZzz : j10;
                    arrayList = arrayList3;
                    int i30 = i17;
                    long j16 = zzd(zzfvVarZzc.zza).zzc;
                    long jZzt2 = j15 == -9223372036854775807L ? -9223372036854775807L : zzfj.zzt(j15, 1000000L, j16, RoundingMode.DOWN);
                    zzfu zzfuVarZzd2 = zzfuVarZzd.zzd(1835626086);
                    zzfuVarZzd2.getClass();
                    zzfu zzfuVarZzd3 = zzfuVarZzd2.zzd(1937007212);
                    zzfuVarZzd3.getClass();
                    zzfv zzfvVarZzc4 = zzfuVarZzd.zzc(1835296868);
                    zzfvVarZzc4.getClass();
                    zzer zzerVar3 = zzfvVarZzc4.zza;
                    zzerVar3.zzh(8);
                    int iZza2 = zza(zzerVar3.zzB());
                    zzerVar3.zzk(iZza2 == 0 ? 8 : 16);
                    long jZzz2 = zzerVar3.zzz();
                    int iZzg2 = zzerVar3.zzg();
                    int i31 = 0;
                    while (true) {
                        int i32 = iZza2 == 0 ? 4 : 8;
                        if (i31 < i32) {
                            j11 = j16;
                            if (zzerVar3.zzi()[iZzg2 + i31] != -1) {
                                long jZzz3 = iZza2 == 0 ? zzerVar3.zzz() : zzerVar3.zzJ();
                                if (jZzz3 != 0) {
                                    jZzt = zzfj.zzt(jZzz3, 1000000L, jZzz2, RoundingMode.DOWN);
                                    break;
                                }
                                break;
                            }
                            i31++;
                            j16 = j11;
                        } else {
                            j11 = j16;
                            zzerVar3.zzk(i32);
                        }
                        jZzt = -9223372036854775807L;
                        break;
                    }
                    int iZzt2 = zzerVar3.zzt();
                    char c11 = 2;
                    char[] cArr = {(char) (((iZzt2 >> 10) & 31) + 96), (char) (((iZzt2 >> 5) & 31) + 96), (char) ((iZzt2 & 31) + 96)};
                    int i33 = 0;
                    while (true) {
                        if (i33 >= 3) {
                            str = new String(cArr);
                            break;
                        }
                        char c12 = cArr[i33];
                        if (c12 < 'a' || c12 > 'z') {
                            str = null;
                            break;
                        }
                        i33++;
                    }
                    zzfv zzfvVarZzc5 = zzfuVarZzd3.zzc(1937011556);
                    if (zzfvVarZzc5 == null) {
                        zzee.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        String strZzc = zzaka.zzc(jZzz2, jZzt, str);
                        zzer zzerVar4 = zzfvVarZzc5.zza;
                        zzerVar4.zzh(12);
                        int iZzB6 = zzerVar4.zzB();
                        String str10 = str;
                        zzakd zzakdVar3 = new zzakd(iZzB6);
                        long j17 = jZzt;
                        int i34 = 0;
                        while (i34 < iZzB6) {
                            int iZzg3 = zzerVar4.zzg();
                            zzfu zzfuVar4 = zzfuVar3;
                            int iZzB7 = zzerVar4.zzB();
                            String str11 = "childAtomSize must be positive";
                            zzaey.zza(iZzB7 > 0, "childAtomSize must be positive");
                            int iZzB8 = zzerVar4.zzB();
                            int i35 = iZzt;
                            int i36 = i10;
                            if (iZzB8 == 1635148593 || iZzB8 == 1635148595 || iZzB8 == 1701733238 || iZzB8 == 1831958048 || iZzB8 == 1836070006 || iZzB8 == 1752589105 || iZzB8 == 1751479857 || iZzB8 == 1932670515 || iZzB8 == 1211250227 || iZzB8 == 1748121139 || iZzB8 == 1987063864 || iZzB8 == 1987063865 || iZzB8 == 1635135537 || iZzB8 == 1685479798 || iZzB8 == 1685479729 || iZzB8 == 1685481573 || iZzB8 == 1685481521 || iZzB8 == 1634760241) {
                                int i37 = iZzB;
                                j12 = jZzz2;
                                String str12 = strZzc;
                                sZzv2 = sZzv2;
                                sZzv = sZzv;
                                i36 = i36;
                                zzerVar = zzerVar4;
                                zzerVar.zzh(iZzg3 + 16);
                                zzerVar.zzk(16);
                                int iZzt3 = zzerVar.zzt();
                                int iZzt4 = zzerVar.zzt();
                                zzerVar.zzk(50);
                                int iZzg4 = zzerVar.zzg();
                                if (iZzB8 == 1701733238) {
                                    Pair pairZzr = zzr(zzerVar, iZzg3, iZzB7);
                                    if (pairZzr != null) {
                                        int iIntValue = ((Integer) pairZzr.first).intValue();
                                        zzqVarZzb = zzqVar == null ? null : zzqVar.zzb(((zzald) pairZzr.second).zzb);
                                        zzakdVar3.zza[i34] = (zzald) pairZzr.second;
                                        iZzB8 = iIntValue;
                                    } else {
                                        iZzB8 = 1701733238;
                                        zzqVarZzb = zzqVar;
                                    }
                                    zzerVar.zzh(iZzg4);
                                } else {
                                    zzqVarZzb = zzqVar;
                                }
                                if (iZzB8 == 1831958048) {
                                    i18 = iZzB8;
                                    strZza = "video/mpeg";
                                } else {
                                    i18 = 1211250227;
                                    if (iZzB8 == 1211250227) {
                                        strZza = "video/3gpp";
                                    } else {
                                        i18 = iZzB8;
                                        strZza = null;
                                    }
                                }
                                int i38 = i18;
                                zzq zzqVar2 = zzqVarZzb;
                                float fZzH = 1.0f;
                                i19 = i34;
                                int i39 = -1;
                                int iZzc = -1;
                                int i40 = -1;
                                int i41 = 8;
                                List listZzj = null;
                                int i42 = -1;
                                zzgj zzgjVar2 = null;
                                ByteBuffer byteBufferZzm = null;
                                zzajw zzajwVarZzq = null;
                                zzajy zzajyVar = null;
                                boolean z25 = false;
                                byte[] bArrCopyOfRange = null;
                                int i43 = -1;
                                int i44 = -1;
                                int i45 = -1;
                                int i46 = -1;
                                String str13 = null;
                                int i47 = iZzg4;
                                int i48 = 8;
                                while (i47 - iZzg3 < iZzB7) {
                                    zzerVar.zzh(i47);
                                    int iZzg5 = zzerVar.zzg();
                                    int iZzB9 = zzerVar.zzB();
                                    if (iZzB9 != 0) {
                                        i20 = iZzB9;
                                    } else {
                                        if (zzerVar.zzg() - iZzg3 == iZzB7) {
                                            break;
                                        }
                                        i20 = 0;
                                    }
                                    zzaey.zza(i20 > 0, str11);
                                    int iZzB10 = zzerVar.zzB();
                                    int i49 = iZzB7;
                                    if (iZzB10 == 1635148611) {
                                        int i50 = iZzg5 + 8;
                                        if (strZza == null) {
                                            str7 = null;
                                            z22 = true;
                                        } else {
                                            str7 = null;
                                            z22 = false;
                                        }
                                        zzaey.zza(z22, str7);
                                        zzerVar.zzh(i50);
                                        zzadz zzadzVarZza = zzadz.zza(zzerVar);
                                        List list2 = zzadzVarZza.zza;
                                        zzakdVar3.zzc = zzadzVarZza.zzb;
                                        if (z25) {
                                            z23 = true;
                                        } else {
                                            fZzH = zzadzVarZza.zzk;
                                            z23 = false;
                                        }
                                        String str14 = zzadzVarZza.zzl;
                                        int i51 = zzadzVarZza.zzj;
                                        int i52 = zzadzVarZza.zzg;
                                        int i53 = zzadzVarZza.zzh;
                                        int i54 = zzadzVarZza.zzi;
                                        zzakdVar2 = zzakdVar3;
                                        str2 = str11;
                                        i22 = i39;
                                        str13 = str14;
                                        i43 = i51;
                                        z25 = z23;
                                        i40 = i53;
                                        i21 = zzadzVarZza.zze;
                                        listZzj = list2;
                                        iZzc = i54;
                                        i42 = i52;
                                        i41 = zzadzVarZza.zzf;
                                        strZza = "video/avc";
                                    } else if (iZzB10 == 1752589123) {
                                        int i55 = iZzg5 + 8;
                                        if (strZza == null) {
                                            str6 = null;
                                            z20 = true;
                                        } else {
                                            str6 = null;
                                            z20 = false;
                                        }
                                        zzaey.zza(z20, str6);
                                        zzerVar.zzh(i55);
                                        zzafo zzafoVarZza = zzafo.zza(zzerVar);
                                        List list3 = zzafoVarZza.zza;
                                        zzakdVar3.zzc = zzafoVarZza.zzb;
                                        if (z25) {
                                            z21 = true;
                                        } else {
                                            fZzH = zzafoVarZza.zzl;
                                            z21 = false;
                                        }
                                        int i56 = zzafoVarZza.zzm;
                                        int i57 = zzafoVarZza.zzc;
                                        String str15 = zzafoVarZza.zzn;
                                        int i58 = zzafoVarZza.zzk;
                                        if (i58 == -1) {
                                            i58 = i39;
                                        }
                                        int i59 = zzafoVarZza.zzd;
                                        int i60 = zzafoVarZza.zze;
                                        int i61 = zzafoVarZza.zzh;
                                        int i62 = zzafoVarZza.zzi;
                                        int i63 = zzafoVarZza.zzj;
                                        int i64 = zzafoVarZza.zzf;
                                        int i65 = zzafoVarZza.zzg;
                                        zzakdVar2 = zzakdVar3;
                                        str2 = str11;
                                        str13 = str15;
                                        i22 = i58;
                                        i45 = i60;
                                        i42 = i61;
                                        i46 = i59;
                                        i21 = i64;
                                        zzgjVar2 = zzafoVarZza.zzo;
                                        i41 = i65;
                                        listZzj = list3;
                                        i43 = i56;
                                        z25 = z21;
                                        i40 = i62;
                                        iZzc = i63;
                                        strZza = "video/hevc";
                                        i44 = i57;
                                    } else if (iZzB10 == 1818785347) {
                                        int i66 = iZzg5 + 8;
                                        zzaey.zza("video/hevc".equals(strZza), "lhvC must follow hvcC atom");
                                        if (zzgjVar2 != null) {
                                            z19 = zzgjVar2.zza.size() >= 2;
                                        } else {
                                            z19 = false;
                                            zzgjVar2 = null;
                                        }
                                        zzaey.zza(z19, "must have at least two layers");
                                        zzerVar.zzh(i66);
                                        zzgjVar2.getClass();
                                        zzafo zzafoVarZzb = zzafo.zzb(zzerVar, zzgjVar2);
                                        zzaey.zza(zzakdVar3.zzc == zzafoVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                        int i67 = zzafoVarZzb.zzh;
                                        if (i67 != -1) {
                                            zzaey.zza(i42 == i67, "colorSpace must be the same for both views");
                                        }
                                        int i68 = zzafoVarZzb.zzi;
                                        if (i68 != -1) {
                                            zzaey.zza(i40 == i68, "colorRange must be the same for both views");
                                        }
                                        int i69 = zzafoVarZzb.zzj;
                                        if (i69 != -1) {
                                            zzaey.zza(iZzc == i69, "colorTransfer must be the same for both views");
                                        }
                                        zzaey.zza(i48 == zzafoVarZzb.zzf, "bitdepthLuma must be the same for both views");
                                        zzaey.zza(i41 == zzafoVarZzb.zzg, "bitdepthChroma must be the same for both views");
                                        if (listZzj != null) {
                                            int i70 = zzguf.zzd;
                                            zzguc zzgucVar = new zzguc();
                                            zzgucVar.zzh(listZzj);
                                            zzgucVar.zzh(zzafoVarZzb.zza);
                                            zzgufVarZzi2 = zzgucVar.zzi();
                                        } else {
                                            zzaey.zza(false, "initializationData must be already set from hvcC atom");
                                            zzgufVarZzi2 = null;
                                        }
                                        zzakdVar2 = zzakdVar3;
                                        str2 = str11;
                                        str13 = zzafoVarZzb.zzn;
                                        i22 = i39;
                                        i21 = i48;
                                        strZza = "video/mv-hevc";
                                        listZzj = zzgufVarZzi2;
                                    } else if (iZzB10 == 1986361461) {
                                        zzerVar.zzh(iZzg5 + 8);
                                        zzakdVar2 = zzakdVar3;
                                        int iZzg6 = zzerVar.zzg();
                                        zzajz zzajzVar = null;
                                        while (iZzg6 - iZzg5 < i20) {
                                            zzerVar.zzh(iZzg6);
                                            int iZzB11 = zzerVar.zzB();
                                            zzaey.zza(iZzB11 > 0, str11);
                                            int i71 = i48;
                                            if (zzerVar.zzB() == 1702454643) {
                                                zzerVar.zzh(iZzg6 + 8);
                                                int iZzg7 = zzerVar.zzg();
                                                while (true) {
                                                    if (iZzg7 - iZzg6 >= iZzB11) {
                                                        str5 = str11;
                                                        i40 = i40;
                                                        zzajzVar = null;
                                                        break;
                                                    }
                                                    zzerVar.zzh(iZzg7);
                                                    int iZzB12 = zzerVar.zzB();
                                                    zzaey.zza(iZzB12 > 0, str11);
                                                    str5 = str11;
                                                    if (zzerVar.zzB() == 1937011305) {
                                                        zzerVar.zzk(4);
                                                        int iZzs = zzerVar.zzs() & 15;
                                                        int i72 = iZzs & 1;
                                                        boolean z26 = (iZzs & 2) == 2;
                                                        if ((iZzs & 8) == 8) {
                                                            i25 = 1;
                                                            z18 = true;
                                                        } else {
                                                            i25 = 1;
                                                            z18 = false;
                                                        }
                                                        zzajzVar = new zzajz(new zzakc(i25 != i72 ? 0 : i25, z26, z18));
                                                    } else {
                                                        iZzg7 += iZzB12;
                                                        str11 = str5;
                                                    }
                                                }
                                                iZzg6 += iZzB11;
                                                i40 = i40;
                                                i41 = i41;
                                                i48 = i71;
                                                str11 = str5;
                                            } else {
                                                str5 = str11;
                                                i40 = i40;
                                            }
                                            iZzg6 += iZzB11;
                                            i40 = i40;
                                            i41 = i41;
                                            i48 = i71;
                                            str11 = str5;
                                        }
                                        str2 = str11;
                                        i40 = i40;
                                        i21 = i48;
                                        i41 = i41;
                                        zzakg zzakgVar = zzajzVar == null ? null : new zzakg(zzajzVar);
                                        if (zzakgVar != null) {
                                            if (zzgjVar2 == null) {
                                                z17 = true;
                                                i24 = -1;
                                                zzgjVar2 = null;
                                            } else if (zzgjVar2.zza.size() >= 2) {
                                                zzaey.zza(zzakgVar.zza(), "both eye views must be marked as available");
                                                zzaey.zza(!zzakgVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                            } else {
                                                z17 = true;
                                                i24 = -1;
                                            }
                                            if (i39 != i24) {
                                                i22 = i39;
                                            } else if (z17 != zzakgVar.zzb().zza().zzc()) {
                                                i40 = i40;
                                                i41 = i41;
                                                i22 = 4;
                                            } else {
                                                i22 = 5;
                                            }
                                        }
                                        i22 = i39;
                                        zzgjVar = zzgjVar2;
                                        i40 = i40;
                                        i41 = i41;
                                        zzgjVar2 = zzgjVar;
                                    } else {
                                        zzakdVar2 = zzakdVar3;
                                        str2 = str11;
                                        i40 = i40;
                                        i21 = i48;
                                        i41 = i41;
                                        if (iZzB10 == 1685480259 || iZzB10 == 1685485123 || iZzB10 == 1685485379) {
                                            i22 = i39;
                                            zzgjVar = zzgjVar2;
                                            int i73 = i20 - 8;
                                            int i74 = iZzg5 + 8;
                                            byte[] bArr = new byte[i73];
                                            zzerVar.zzm(bArr, 0, i73);
                                            if (listZzj != null) {
                                                int i75 = zzguf.zzd;
                                                zzguc zzgucVar2 = new zzguc();
                                                zzgucVar2.zzh(listZzj);
                                                zzgucVar2.zzf(bArr);
                                                zzgufVarZzi = zzgucVar2.zzi();
                                            } else {
                                                zzaey.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                zzgufVarZzi = null;
                                            }
                                            zzerVar.zzh(i74);
                                            zzfr zzfrVarZza = zzfr.zza(zzerVar);
                                            if (zzfrVarZza != null) {
                                                str13 = zzfrVarZza.zza;
                                                listZzj = zzgufVarZzi;
                                                strZza = "video/dolby-vision";
                                            } else {
                                                listZzj = zzgufVarZzi;
                                            }
                                        } else if (iZzB10 == 1987076931) {
                                            int i76 = iZzg5 + 12;
                                            if (strZza == null) {
                                                str4 = null;
                                                z16 = true;
                                            } else {
                                                str4 = null;
                                                z16 = false;
                                            }
                                            zzaey.zza(z16, str4);
                                            zzerVar.zzh(i76);
                                            byte bZzs = (byte) zzerVar.zzs();
                                            byte bZzs2 = (byte) zzerVar.zzs();
                                            int iZzs2 = zzerVar.zzs();
                                            int i77 = iZzs2 >> 4;
                                            int i78 = iZzs2 >> 1;
                                            int i79 = i38;
                                            String str16 = i79 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            if (str16.equals("video/x-vnd.on2.vp9")) {
                                                int i80 = zzdo.zza;
                                                i23 = 1;
                                                c10 = 3;
                                                listZzj = zzguf.zzj(new byte[]{1, 1, bZzs, 2, 1, bZzs2, 3, 1, (byte) i77, 4, 1, (byte) (i78 & 7)});
                                            } else {
                                                c10 = 3;
                                                i23 = 1;
                                            }
                                            int i81 = iZzs2 & 1;
                                            int iZzs3 = zzerVar.zzs();
                                            int iZzs4 = zzerVar.zzs();
                                            int iZzb = zzi.zzb(iZzs3);
                                            int i82 = i23 != i81 ? 2 : 1;
                                            i22 = i39;
                                            i42 = iZzb;
                                            i21 = i77;
                                            iZzc = zzi.zzc(iZzs4);
                                            i38 = i79;
                                            i41 = i21;
                                            i40 = i82;
                                            strZza = str16;
                                        } else {
                                            int i83 = i38;
                                            if (iZzB10 == 1635135811) {
                                                int i84 = i20 - 8;
                                                byte[] bArr2 = new byte[i84];
                                                zzerVar.zzm(bArr2, 0, i84);
                                                zzguf zzgufVarZzj2 = zzguf.zzj(bArr2);
                                                zzerVar.zzh(iZzg5 + 8);
                                                zzi zziVarZzk = zzk(zzerVar);
                                                int i85 = zziVarZzk.zzf;
                                                int i86 = zziVarZzk.zzg;
                                                int i87 = zziVarZzk.zzb;
                                                int i88 = zziVarZzk.zzc;
                                                iZzc = zziVarZzk.zzd;
                                                i22 = i39;
                                                i21 = i85;
                                                i38 = i83;
                                                i40 = i88;
                                                listZzj = zzgufVarZzj2;
                                                i41 = i86;
                                                strZza = "video/av01";
                                                i42 = i87;
                                            } else if (iZzB10 == 1668050025) {
                                                if (byteBufferZzm == null) {
                                                    byteBufferZzm = zzm();
                                                }
                                                ByteBuffer byteBuffer = byteBufferZzm;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(zzerVar.zzv());
                                                byteBuffer.putShort(zzerVar.zzv());
                                                i22 = i39;
                                                byteBufferZzm = byteBuffer;
                                                i38 = i83;
                                                i40 = i40;
                                                i41 = i41;
                                            } else if (iZzB10 == 1835295606) {
                                                if (byteBufferZzm == null) {
                                                    byteBufferZzm = zzm();
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferZzm;
                                                short sZzv3 = zzerVar.zzv();
                                                short sZzv4 = zzerVar.zzv();
                                                short sZzv5 = zzerVar.zzv();
                                                short sZzv6 = zzerVar.zzv();
                                                short sZzv7 = zzerVar.zzv();
                                                short sZzv8 = zzerVar.zzv();
                                                i38 = i83;
                                                short sZzv9 = zzerVar.zzv();
                                                zzgj zzgjVar3 = zzgjVar2;
                                                short sZzv10 = zzerVar.zzv();
                                                long jZzz4 = zzerVar.zzz();
                                                long jZzz5 = zzerVar.zzz();
                                                i22 = i39;
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sZzv7);
                                                byteBuffer2.putShort(sZzv8);
                                                byteBuffer2.putShort(sZzv3);
                                                byteBuffer2.putShort(sZzv4);
                                                byteBuffer2.putShort(sZzv5);
                                                byteBuffer2.putShort(sZzv6);
                                                byteBuffer2.putShort(sZzv9);
                                                byteBuffer2.putShort(sZzv10);
                                                byteBuffer2.putShort((short) (jZzz4 / 10000));
                                                byteBuffer2.putShort((short) (jZzz5 / 10000));
                                                byteBufferZzm = byteBuffer2;
                                                zzgjVar2 = zzgjVar3;
                                            } else {
                                                i22 = i39;
                                                i38 = i83;
                                                zzgjVar = zzgjVar2;
                                                if (iZzB10 == 1681012275) {
                                                    if (strZza == null) {
                                                        str3 = null;
                                                        z15 = true;
                                                    } else {
                                                        str3 = null;
                                                        z15 = false;
                                                    }
                                                    zzaey.zza(z15, str3);
                                                    strZza = "video/3gpp";
                                                } else if (iZzB10 == 1702061171) {
                                                    zzaey.zza(strZza == null, null);
                                                    zzajy zzajyVarZzp = zzp(zzerVar, iZzg5);
                                                    strZza = zzajyVarZzp.zza();
                                                    byte[] bArrZzb = zzajyVarZzp.zzb();
                                                    if (bArrZzb != null) {
                                                        zzajyVar = zzajyVarZzp;
                                                        listZzj = zzguf.zzj(bArrZzb);
                                                    } else {
                                                        zzajyVar = zzajyVarZzp;
                                                    }
                                                } else if (iZzB10 == 1651798644) {
                                                    zzajwVarZzq = zzq(zzerVar, iZzg5);
                                                } else if (iZzB10 == 1885434736) {
                                                    zzerVar.zzh(iZzg5 + 8);
                                                    fZzH = zzerVar.zzH() / zzerVar.zzH();
                                                    i40 = i40;
                                                    i41 = i41;
                                                    zzgjVar2 = zzgjVar;
                                                    z25 = true;
                                                } else if (iZzB10 == 1937126244) {
                                                    int i89 = iZzg5 + 8;
                                                    while (true) {
                                                        if (i89 - iZzg5 >= i20) {
                                                            bArrCopyOfRange = null;
                                                            break;
                                                        }
                                                        zzerVar.zzh(i89);
                                                        int iZzB13 = zzerVar.zzB() + i89;
                                                        if (zzerVar.zzB() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(zzerVar.zzi(), i89, iZzB13);
                                                            break;
                                                        }
                                                        i89 = iZzB13;
                                                    }
                                                } else if (iZzB10 == 1936995172) {
                                                    int iZzs5 = zzerVar.zzs();
                                                    zzerVar.zzk(3);
                                                    if (iZzs5 == 0) {
                                                        int iZzs6 = zzerVar.zzs();
                                                        if (iZzs6 == 0) {
                                                            i40 = i40;
                                                            i41 = i41;
                                                            zzgjVar2 = zzgjVar;
                                                            i22 = 0;
                                                        } else if (iZzs6 == 1) {
                                                            i40 = i40;
                                                            i41 = i41;
                                                            zzgjVar2 = zzgjVar;
                                                            i22 = 1;
                                                        } else if (iZzs6 == 2) {
                                                            i40 = i40;
                                                            i41 = i41;
                                                            zzgjVar2 = zzgjVar;
                                                            i22 = 2;
                                                        } else if (iZzs6 == 3) {
                                                            i22 = 3;
                                                            i40 = i40;
                                                            i41 = i41;
                                                            zzgjVar2 = zzgjVar;
                                                        }
                                                    }
                                                } else if (iZzB10 == 1634760259) {
                                                    int i90 = i20 - 12;
                                                    byte[] bArr3 = new byte[i90];
                                                    zzerVar.zzh(iZzg5 + 12);
                                                    zzerVar.zzm(bArr3, 0, i90);
                                                    String strZzc2 = zzdo.zzc(bArr3);
                                                    zzguf zzgufVarZzj3 = zzguf.zzj(bArr3);
                                                    zzi zziVarZzl = zzl(new zzer(bArr3));
                                                    int i91 = zziVarZzl.zzf;
                                                    int i92 = zziVarZzl.zzg;
                                                    str13 = strZzc2;
                                                    i21 = i91;
                                                    i42 = zziVarZzl.zzb;
                                                    i40 = zziVarZzl.zzc;
                                                    zzgjVar2 = zzgjVar;
                                                    i41 = i92;
                                                    iZzc = zziVarZzl.zzd;
                                                    strZza = "video/apv";
                                                    listZzj = zzgufVarZzj3;
                                                } else if (iZzB10 == 1668246642) {
                                                    if (i42 == -1) {
                                                        if (iZzc == -1) {
                                                            int iZzB14 = zzerVar.zzB();
                                                            if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                                int iZzt5 = zzerVar.zzt();
                                                                int iZzt6 = zzerVar.zzt();
                                                                zzerVar.zzk(2);
                                                                if (i20 != 19) {
                                                                    z14 = false;
                                                                } else if ((zzerVar.zzs() & 128) != 0) {
                                                                    i20 = 19;
                                                                    z14 = true;
                                                                } else {
                                                                    i20 = 19;
                                                                    z14 = false;
                                                                }
                                                                int iZzb2 = zzi.zzb(iZzt5);
                                                                int i93 = true != z14 ? 2 : 1;
                                                                i42 = iZzb2;
                                                                iZzc = zzi.zzc(iZzt6);
                                                                i40 = i93;
                                                            } else {
                                                                zzee.zzc("BoxParsers", "Unsupported color type: ".concat(zzfw.zze(iZzB14)));
                                                                iZzc = -1;
                                                                i42 = -1;
                                                                i40 = i40;
                                                                i41 = i41;
                                                                zzgjVar2 = zzgjVar;
                                                            }
                                                        } else {
                                                            i42 = -1;
                                                        }
                                                        i41 = i41;
                                                        zzgjVar2 = zzgjVar;
                                                    }
                                                }
                                                zzgjVar2 = zzgjVar;
                                            }
                                        }
                                        i40 = i40;
                                        i41 = i41;
                                        zzgjVar2 = zzgjVar;
                                    }
                                    i47 += i20;
                                    iZzg3 = iZzg3;
                                    iZzB7 = i49;
                                    zzakdVar3 = zzakdVar2;
                                    i48 = i21;
                                    str11 = str2;
                                    i39 = i22;
                                }
                                zzakd zzakdVar4 = zzakdVar3;
                                int i94 = i39;
                                int i95 = i40;
                                int i96 = i48;
                                int i97 = i41;
                                iZzg3 = iZzg3;
                                iZzB7 = iZzB7;
                                c11 = 2;
                                if (strZza == null) {
                                    i30 = i30;
                                    iZzB = i37;
                                    strZzc = str12;
                                    zzakdVar = zzakdVar4;
                                } else {
                                    zzt zztVar = new zzt();
                                    iZzB = i37;
                                    zztVar.zzb(iZzB);
                                    zztVar.zzm(strZza);
                                    zztVar.zzj(str13);
                                    zztVar.zzt(iZzt3);
                                    zztVar.zzu(iZzt4);
                                    zztVar.zzv(i46);
                                    zztVar.zzw(i45);
                                    zztVar.zzz(fZzH);
                                    i30 = i30;
                                    zztVar.zzy(i30);
                                    zztVar.zzA(bArrCopyOfRange);
                                    zztVar.zzB(i94);
                                    zztVar.zzp(listZzj);
                                    zztVar.zzo(i43);
                                    zztVar.zzD(i44);
                                    zztVar.zzq(zzqVar2);
                                    strZzc = str12;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar = new zzh();
                                    zzhVar.zza(i42);
                                    zzhVar.zzb(i95);
                                    zzhVar.zzc(iZzc);
                                    zzhVar.zzd(byteBufferZzm != null ? byteBufferZzm.array() : null);
                                    zzhVar.zze(i96);
                                    zzhVar.zzf(i97);
                                    zztVar.zzC(zzhVar.zzg());
                                    if (zzajwVarZzq != null) {
                                        zztVar.zzh(zzgxz.zzb(zzajwVarZzq.zza()));
                                        zztVar.zzi(zzgxz.zzb(zzajwVarZzq.zzb()));
                                    } else if (zzajyVar != null) {
                                        zztVar.zzh(zzgxz.zzb(zzajyVar.zzc()));
                                        zztVar.zzi(zzgxz.zzb(zzajyVar.zzd()));
                                    }
                                    zzv zzvVarZzM2 = zztVar.zzM();
                                    zzakdVar = zzakdVar4;
                                    zzakdVar.zzb = zzvVarZzM2;
                                }
                            } else if (iZzB8 == 1836069985 || iZzB8 == 1701733217 || iZzB8 == 1633889587 || iZzB8 == 1700998451 || iZzB8 == 1633889588 || iZzB8 == 1835823201 || iZzB8 == 1685353315 || iZzB8 == 1685353317 || iZzB8 == 1685353320 || iZzB8 == 1685353324 || iZzB8 == 1685353336 || iZzB8 == 1935764850 || iZzB8 == 1935767394 || iZzB8 == 1819304813 || iZzB8 == 1936684916 || iZzB8 == 1953984371 || iZzB8 == 778924082 || iZzB8 == 778924083 || iZzB8 == 1835557169 || iZzB8 == 1835560241 || iZzB8 == 1634492771 || iZzB8 == 1634492791 || iZzB8 == 1970037111 || iZzB8 == 1332770163 || iZzB8 == 1716281667 || iZzB8 == 1767992678 || iZzB8 == 1768973165 || iZzB8 == 1718641517) {
                                sZzv = sZzv;
                                int i98 = iZzB;
                                i36 = i36;
                                zzerVar = zzerVar4;
                                j12 = jZzz2;
                                sZzv2 = sZzv2;
                                zzo(zzerVar4, iZzB8, iZzg3, iZzB7, iZzB, strZzc, z11, zzqVar, zzakdVar3, i34);
                                zzakdVar = zzakdVar3;
                                i19 = i34;
                                iZzg3 = iZzg3;
                                iZzB7 = iZzB7;
                                i30 = i30;
                                iZzB = i98;
                                strZzc = strZzc;
                                c11 = 2;
                            } else {
                                if (iZzB8 == 1414810956 || iZzB8 == 1954034535 || iZzB8 == 2004251764 || iZzB8 == 1937010800 || iZzB8 == 1664495672 || iZzB8 == 1836070003) {
                                    zzerVar4.zzh(iZzg3 + 16);
                                    if (iZzB8 == 1414810956) {
                                        str9 = "application/ttml+xml";
                                    } else {
                                        if (iZzB8 == 1954034535) {
                                            int i99 = iZzB7 - 16;
                                            byte[] bArr4 = new byte[i99];
                                            zzerVar4.zzm(bArr4, 0, i99);
                                            zzgufVarZzj = zzguf.zzj(bArr4);
                                            str8 = "application/x-quicktime-tx3g";
                                        } else if (iZzB8 == 2004251764) {
                                            str9 = "application/x-mp4-vtt";
                                        } else {
                                            if (iZzB8 == 1937010800) {
                                                str9 = "application/ttml+xml";
                                                j13 = jZzz2;
                                                j14 = 0;
                                                zzgufVar = null;
                                            } else if (iZzB8 == 1664495672) {
                                                zzakdVar3.zzd = 1;
                                                str9 = "application/x-mp4-cea-608";
                                            } else {
                                                int iZzg8 = zzerVar4.zzg();
                                                zzerVar4.zzk(4);
                                                if (zzerVar4.zzB() == 1702061171) {
                                                    zzajy zzajyVarZzp2 = zzp(zzerVar4, iZzg8);
                                                    if (zzajyVarZzp2.zzb() != null && zzajyVarZzp2.zzb().length == 64) {
                                                        String strZzj = zzj(zzajyVarZzp2.zzb(), sZzv, sZzv2);
                                                        String str17 = zzfj.zza;
                                                        zzgufVarZzj = zzguf.zzj(strZzj.getBytes(StandardCharsets.UTF_8));
                                                        str8 = "application/vobsub";
                                                    }
                                                    zzakdVar = zzakdVar3;
                                                    zzerVar = zzerVar4;
                                                    i19 = i34;
                                                } else {
                                                    zzgufVarZzj = null;
                                                    str8 = null;
                                                }
                                            }
                                            if (str9 != null) {
                                                zzt zztVar2 = new zzt();
                                                zztVar2.zzb(iZzB);
                                                zztVar2.zzm(str9);
                                                zztVar2.zze(strZzc);
                                                zztVar2.zzr(j14);
                                                zztVar2.zzp(zzgufVar);
                                                zzakdVar3.zzb = zztVar2.zzM();
                                            }
                                            j12 = j13;
                                            zzakdVar = zzakdVar3;
                                            zzerVar = zzerVar4;
                                            i19 = i34;
                                        }
                                        String str18 = str8;
                                        zzgufVar = zzgufVarZzj;
                                        str9 = str18;
                                        j14 = Long.MAX_VALUE;
                                        j13 = jZzz2;
                                        if (str9 != null) {
                                            zzt zztVar3 = new zzt();
                                            zztVar3.zzb(iZzB);
                                            zztVar3.zzm(str9);
                                            zztVar3.zze(strZzc);
                                            zztVar3.zzr(j14);
                                            zztVar3.zzp(zzgufVar);
                                            zzakdVar3.zzb = zztVar3.zzM();
                                        }
                                        j12 = j13;
                                        zzakdVar = zzakdVar3;
                                        zzerVar = zzerVar4;
                                        i19 = i34;
                                    }
                                    zzgufVar = null;
                                    j14 = Long.MAX_VALUE;
                                    j13 = jZzz2;
                                    if (str9 != null) {
                                        zzt zztVar4 = new zzt();
                                        zztVar4.zzb(iZzB);
                                        zztVar4.zzm(str9);
                                        zztVar4.zze(strZzc);
                                        zztVar4.zzr(j14);
                                        zztVar4.zzp(zzgufVar);
                                        zzakdVar3.zzb = zztVar4.zzM();
                                    }
                                    j12 = j13;
                                    zzakdVar = zzakdVar3;
                                    zzerVar = zzerVar4;
                                    i19 = i34;
                                } else if (iZzB8 == 1835365492) {
                                    zzerVar4.zzh(iZzg3 + 16);
                                    zzerVar4.zzM((char) 0);
                                    String strZzM = zzerVar4.zzM((char) 0);
                                    if (strZzM != null) {
                                        zzt zztVar5 = new zzt();
                                        zztVar5.zzb(iZzB);
                                        zztVar5.zzm(strZzM);
                                        zzakdVar3.zzb = zztVar5.zzM();
                                    }
                                } else if (iZzB8 == 1667329389) {
                                    zzt zztVar6 = new zzt();
                                    zztVar6.zzb(iZzB);
                                    zztVar6.zzm("application/x-camera-motion");
                                    zzakdVar3.zzb = zztVar6.zzM();
                                }
                                j12 = jZzz2;
                                zzakdVar = zzakdVar3;
                                zzerVar = zzerVar4;
                                i19 = i34;
                            }
                            zzerVar.zzh(iZzg3 + iZzB7);
                            i34 = i19 + 1;
                            zzqVar = zzqVar;
                            strZzc = strZzc;
                            zzakdVar3 = zzakdVar;
                            iZzB = iZzB;
                            c11 = c11;
                            i30 = i30;
                            zzerVar4 = zzerVar;
                            sZzv2 = sZzv2;
                            sZzv = sZzv;
                            zzfuVar3 = zzfuVar4;
                            i10 = i36;
                            iZzB6 = iZzB6;
                            iZzt = i35;
                            jZzz2 = j12;
                        }
                        int i100 = iZzt;
                        int i101 = i10;
                        long j18 = jZzz2;
                        zzfu zzfuVar5 = zzfuVar3;
                        int i102 = iZzB;
                        zzakd zzakdVar5 = zzakdVar3;
                        zzalc zzalcVar3 = null;
                        if (z10) {
                            zzfuVar2 = zzfuVar5;
                        } else {
                            zzfuVar2 = zzfuVar5;
                            zzfu zzfuVarZzd4 = zzfuVar2.zzd(1701082227);
                            if (zzfuVarZzd4 != null && (pairZzn = zzn(zzfuVarZzd4)) != null) {
                                jArr2 = (long[]) pairZzn.first;
                                jArr = (long[]) pairZzn.second;
                            }
                            zzvVar = zzakdVar5.zzb;
                            if (zzvVar != null) {
                                if (i100 != 0) {
                                    zzftVar = new zzft(i100);
                                    zzt zztVarZza = zzvVar.zza();
                                    zzapVar = zzvVar.zzl;
                                    if (zzapVar != null) {
                                        zzapVar2 = zzapVar.zzg(zzftVar);
                                    } else {
                                        zzapVar2 = new zzap(-9223372036854775807L, zzftVar);
                                    }
                                    zztVarZza.zzk(zzapVar2);
                                    zzvVarZzM = zztVarZza.zzM();
                                } else {
                                    zzvVarZzM = zzvVar;
                                }
                                zzalcVar3 = new zzalc(i102, i101, zzaka.zza(j18, j17, str10), j11, jZzt2, zzaka.zzb(j18, j17, str10), zzvVarZzM, zzakdVar5.zzd, zzakdVar5.zza, zzakdVar5.zzc, jArr2, jArr);
                            }
                            zzalcVar = zzalcVar3;
                            zzgqtVar = zzgqtVar;
                        }
                        jArr = null;
                        jArr2 = null;
                        zzvVar = zzakdVar5.zzb;
                        if (zzvVar != null) {
                            if (i100 != 0) {
                                zzftVar = new zzft(i100);
                                zzt zztVarZza2 = zzvVar.zza();
                                zzapVar = zzvVar.zzl;
                                if (zzapVar != null) {
                                    zzapVar2 = zzapVar.zzg(zzftVar);
                                } else {
                                    zzapVar2 = new zzap(-9223372036854775807L, zzftVar);
                                }
                                zztVarZza2.zzk(zzapVar2);
                                zzvVarZzM = zztVarZza2.zzM();
                            } else {
                                zzvVarZzM = zzvVar;
                            }
                            zzalcVar3 = new zzalc(i102, i101, zzaka.zza(j18, j17, str10), j11, jZzt2, zzaka.zzb(j18, j17, str10), zzvVarZzM, zzakdVar5.zzd, zzakdVar5.zza, zzakdVar5.zzc, jArr2, jArr);
                        }
                        zzalcVar = zzalcVar3;
                        zzgqtVar = zzgqtVar;
                    }
                    zzalcVar2 = (zzalc) zzgqtVar.apply(zzalcVar);
                    if (zzalcVar2 != null) {
                        zzfu zzfuVarZzd5 = zzfuVar2.zzd(1835297121);
                        zzfuVarZzd5.getClass();
                        zzfu zzfuVarZzd6 = zzfuVarZzd5.zzd(1835626086);
                        zzfuVarZzd6.getClass();
                        zzfu zzfuVarZzd7 = zzfuVarZzd6.zzd(1937007212);
                        zzfuVarZzd7.getClass();
                        zzalf zzalfVarZzg = zzg(zzalcVar2, zzfuVarZzd7, zzafnVar, false);
                        arrayList2 = arrayList;
                        arrayList2.add(zzalfVarZzg);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i26 = i11 + 1;
                    arrayList3 = arrayList2;
                }
                zzfuVar2 = zzfuVar3;
                zzalcVar = null;
                zzalcVar2 = (zzalc) zzgqtVar.apply(zzalcVar);
                if (zzalcVar2 != null) {
                    zzfu zzfuVarZzd8 = zzfuVar2.zzd(1835297121);
                    zzfuVarZzd8.getClass();
                    zzfu zzfuVarZzd9 = zzfuVarZzd8.zzd(1835626086);
                    zzfuVarZzd9.getClass();
                    zzfu zzfuVarZzd10 = zzfuVarZzd9.zzd(1937007212);
                    zzfuVarZzd10.getClass();
                    zzalf zzalfVarZzg2 = zzg(zzalcVar2, zzfuVarZzd10, zzafnVar, false);
                    arrayList2 = arrayList;
                    arrayList2.add(zzalfVarZzg2);
                } else {
                    arrayList2 = arrayList;
                }
                i26 = i11 + 1;
                arrayList3 = arrayList2;
            }
            i26 = i11 + 1;
            arrayList3 = arrayList2;
        }
    }

    private static String zzj(byte[] bArr, int i10, int i11) {
        zzgrc.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            int iZze = zzgxz.zze(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3]);
            String str = zzfj.zza;
            int i13 = ((iZze >> 8) & 255) - 128;
            int i14 = (iZze >> 16) & 255;
            int i15 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i14 + ((i15 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i13 * 14075) / 10000) + i14, 255)) << 16) | (Math.max(0, Math.min((i14 - ((i15 * 3455) / 10000)) - ((i13 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgqw.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 7 + String.valueOf(i11).length() + 10 + strZzd.length() + 1);
        sb2.append("size: ");
        sb2.append(i10);
        sb2.append(VastAttributes.HORIZONTAL_POSITION);
        sb2.append(i11);
        sb2.append("\npalette: ");
        sb2.append(strZzd);
        sb2.append("\n");
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    private static void zzo(zzer zzerVar, int i10, int i11, int i12, int i13, @Nullable String str, boolean z10, @Nullable zzq zzqVar, zzakd zzakdVar, int i14) throws zzat {
        int iZzt;
        int iZzB;
        int iRound;
        int iZzH;
        int i15;
        String str2;
        int iZzg;
        int i16;
        String str3;
        int iZzz;
        int i17;
        String string;
        int i18;
        String str4;
        int i19;
        int i20 = i10;
        int i21 = i11;
        int i22 = i12;
        zzq zzqVarZzb = zzqVar;
        zzakdVar = zzakdVar;
        zzerVar.zzh(i21 + 16);
        if (z10) {
            iZzt = zzerVar.zzt();
            zzerVar.zzk(6);
        } else {
            zzerVar.zzk(8);
            iZzt = 0;
        }
        if (iZzt == 0 || iZzt == 1) {
            int iZzt2 = zzerVar.zzt();
            zzerVar.zzk(6);
            int iZzF = zzerVar.zzF();
            zzerVar.zzh(zzerVar.zzg() - 4);
            iZzB = zzerVar.zzB();
            if (iZzt == 1) {
                zzerVar.zzk(16);
            }
            iRound = iZzF;
            iZzH = iZzt2;
            i15 = -1;
        } else {
            if (iZzt != 2) {
                return;
            }
            zzerVar.zzk(16);
            iRound = (int) Math.round(Double.longBitsToDouble(zzerVar.zzD()));
            iZzH = zzerVar.zzH();
            zzerVar.zzk(4);
            int iZzH2 = zzerVar.zzH();
            int iZzH3 = zzerVar.zzH();
            int i23 = iZzH3 & 1;
            int i24 = iZzH3 & 2;
            if (i23 == 0) {
                if (iZzH2 == 8) {
                    i19 = 3;
                } else if (iZzH2 == 16) {
                    i19 = i24 != 0 ? 268435456 : 2;
                } else if (iZzH2 == 24) {
                    i19 = i24 != 0 ? 1342177280 : 21;
                } else if (iZzH2 == 32) {
                    i19 = i24 != 0 ? 1610612736 : 22;
                } else {
                    i19 = -1;
                }
            } else if (iZzH2 == 32) {
                i19 = 4;
            } else {
                i19 = -1;
            }
            zzerVar.zzk(8);
            i15 = i19;
            iZzB = 0;
        }
        if (i20 == 1767992678) {
            iRound = -1;
            iZzH = -1;
        } else if (i20 == 1935764850) {
            iRound = 8000;
            iZzH = 1;
        } else if (i20 == 1935767394) {
            iRound = 16000;
            iZzH = 1;
            i20 = 1935767394;
        }
        int iZzg2 = zzerVar.zzg();
        int iIntValue = 1701733217;
        if (i20 == 1701733217) {
            Pair pairZzr = zzr(zzerVar, i21, i22);
            if (pairZzr != null) {
                iIntValue = ((Integer) pairZzr.first).intValue();
                zzqVarZzb = zzqVarZzb == null ? null : zzqVarZzb.zzb(((zzald) pairZzr.second).zzb);
                zzakdVar.zza[i14] = (zzald) pairZzr.second;
            }
            i20 = iIntValue;
            zzerVar.zzh(iZzg2);
        }
        String str5 = "audio/mhm1";
        if (i20 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i20 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i20 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i20 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i20 == 1685353320 || i20 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i20 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i20 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i20 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i20 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (i20 == 1936684916) {
            str2 = "audio/raw";
            i15 = 2;
        } else if (i20 == 1953984371) {
            str2 = "audio/raw";
            i15 = 268435456;
        } else if (i20 == 1819304813) {
            if (i15 == -1) {
                str2 = "audio/raw";
                i15 = 2;
            } else {
                str2 = "audio/raw";
            }
        } else if (i20 == 778924082 || i20 == 778924083) {
            str2 = "audio/mpeg";
        } else if (i20 == 1835557169) {
            str2 = "audio/mha1";
        } else if (i20 == 1835560241) {
            str2 = "audio/mhm1";
        } else if (i20 == 1634492771) {
            str2 = "audio/alac";
        } else if (i20 == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (i20 == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (i20 == 1332770163) {
            str2 = "audio/opus";
        } else if (i20 == 1716281667) {
            str2 = "audio/flac";
        } else if (i20 == 1835823201) {
            str2 = "audio/true-hd";
        } else if (i20 == 1767992678) {
            str2 = "audio/iamf";
            i20 = 1767992678;
        } else {
            str2 = null;
        }
        int i25 = i15;
        String str6 = null;
        List listZzj = null;
        zzajy zzajyVarZzp = null;
        zzajw zzajwVarZzq = null;
        while (iZzg2 - i21 < i22) {
            zzerVar.zzh(iZzg2);
            int iZzB2 = zzerVar.zzB();
            String str7 = "childAtomSize must be positive";
            zzaey.zza(iZzB2 > 0, "childAtomSize must be positive");
            int iZzB3 = zzerVar.zzB();
            iRound = iRound;
            if (iZzB3 == 1835557187) {
                zzerVar.zzh(iZzg2 + 8);
                zzerVar.zzk(1);
                int iZzs = zzerVar.zzs();
                zzerVar.zzk(1);
                if (Objects.equals(str2, str5)) {
                    i18 = 0;
                    str4 = String.format("mhm1.%02X", Integer.valueOf(iZzs));
                } else {
                    i18 = 0;
                    str4 = String.format("mha1.%02X", Integer.valueOf(iZzs));
                }
                int iZzt3 = zzerVar.zzt();
                byte[] bArr = new byte[iZzt3];
                zzerVar.zzm(bArr, i18, iZzt3);
                listZzj = listZzj == null ? zzguf.zzj(bArr) : zzguf.zzk(bArr, (byte[]) listZzj.get(i18));
                zzakd zzakdVar2 = zzakdVar;
                str3 = str4;
                zzakdVar = zzakdVar2;
            } else {
                str5 = str5;
                if (iZzB3 == 1835557200) {
                    zzerVar.zzh(iZzg2 + 8);
                    int iZzs2 = zzerVar.zzs();
                    if (iZzs2 > 0) {
                        byte[] bArr2 = new byte[iZzs2];
                        zzerVar.zzm(bArr2, 0, iZzs2);
                        if (listZzj == null) {
                            listZzj = zzguf.zzj(bArr2);
                            zzakdVar = zzakdVar;
                            iZzB = iZzB;
                            iZzB2 = iZzB2;
                            str3 = str6;
                            iRound = iRound;
                        } else {
                            listZzj = zzguf.zzk((byte[]) listZzj.get(0), bArr2);
                            iRound = iRound;
                            iZzB = iZzB;
                            str3 = str6;
                        }
                    } else {
                        iRound = iRound;
                        iZzB = iZzB;
                        str3 = str6;
                    }
                } else {
                    if (iZzB3 == 1702061171) {
                        iRound = iRound;
                        zzakdVar = zzakdVar;
                        iZzB = iZzB;
                        iZzB2 = iZzB2;
                        iZzg = iZzg2;
                        i16 = -1;
                    } else if (z10 && iZzB3 == 2002876005) {
                        iZzg = zzerVar.zzg();
                        zzaey.zza(iZzg >= iZzg2, null);
                        while (true) {
                            if (iZzg - iZzg2 >= iZzB2) {
                                iZzg = -1;
                                break;
                            }
                            zzerVar.zzh(iZzg);
                            int iZzB4 = zzerVar.zzB();
                            zzaey.zza(iZzB4 > 0, str7);
                            String str8 = str7;
                            if (zzerVar.zzB() == 1702061171) {
                                break;
                            }
                            iZzg += iZzB4;
                            str7 = str8;
                        }
                        i16 = -1;
                    } else {
                        if (iZzB3 == 1651798644) {
                            zzajwVarZzq = zzq(zzerVar, iZzg2);
                        } else {
                            if (iZzB3 == 1684103987) {
                                zzerVar.zzh(iZzg2 + 8);
                                zzakdVar.zzb = zzadv.zza(zzerVar, Integer.toString(i13), str, zzqVarZzb);
                            } else if (iZzB3 == 1684366131) {
                                zzerVar.zzh(iZzg2 + 8);
                                zzakdVar.zzb = zzadv.zzb(zzerVar, Integer.toString(i13), str, zzqVarZzb);
                            } else if (iZzB3 == 1684103988) {
                                zzerVar.zzh(iZzg2 + 8);
                                zzakdVar.zzb = zzady.zza(zzerVar, Integer.toString(i13), str, zzqVarZzb);
                            } else if (iZzB3 != 1684892784) {
                                if (iZzB3 == 1684305011 || iZzB3 == 1969517683) {
                                    iZzB = iZzB;
                                    iZzB2 = iZzB2;
                                    zzt zztVar = new zzt();
                                    zztVar.zzb(i13);
                                    zztVar.zzm(str2);
                                    zztVar.zzE(iZzH);
                                    iRound = iRound;
                                    zztVar.zzF(iRound);
                                    zztVar.zzq(zzqVarZzb);
                                    zztVar.zze(str);
                                    zzakdVar = zzakdVar;
                                    zzakdVar.zzb = zztVar.zzM();
                                } else if (iZzB3 == 1682927731) {
                                    int i26 = iZzB2 - 8;
                                    byte[] bArr3 = zzb;
                                    int length = bArr3.length;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i26);
                                    zzerVar.zzh(iZzg2 + 8);
                                    zzerVar.zzm(bArrCopyOf, length, i26);
                                    listZzj = zzafu.zza(bArrCopyOf);
                                } else if (iZzB3 == 1684425825) {
                                    int i27 = iZzB2 - 12;
                                    byte[] bArr4 = new byte[i27 + 4];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzerVar.zzh(iZzg2 + 12);
                                    zzerVar.zzm(bArr4, 4, i27);
                                    listZzj = zzguf.zzj(bArr4);
                                } else if (iZzB3 == 1634492771) {
                                    int i28 = iZzB2 - 12;
                                    byte[] bArr5 = new byte[i28];
                                    zzerVar.zzh(iZzg2 + 12);
                                    zzerVar.zzm(bArr5, 0, i28);
                                    int i29 = zzdo.zza;
                                    zzer zzerVar2 = new zzer(bArr5);
                                    zzerVar2.zzh(5);
                                    int iZzs3 = zzerVar2.zzs();
                                    zzerVar2.zzh(9);
                                    int iZzs4 = zzerVar2.zzs();
                                    zzerVar2.zzh(20);
                                    int iZzH4 = zzerVar2.zzH();
                                    int iZzz2 = zzfj.zzz(iZzs3, ByteOrder.LITTLE_ENDIAN);
                                    listZzj = zzguf.zzj(bArr5);
                                    i25 = iZzz2;
                                    zzakdVar = zzakdVar;
                                    iZzH = iZzs4;
                                    iZzB = iZzB;
                                    iZzB2 = iZzB2;
                                    str3 = str6;
                                    iRound = iZzH4;
                                } else if (iZzB3 == 1767990114) {
                                    zzerVar.zzh(iZzg2 + 9);
                                    int iZza = zzgxz.zza(zzerVar.zzP());
                                    byte[] bArr6 = new byte[iZza];
                                    zzerVar.zzm(bArr6, 0, iZza);
                                    int i30 = zzdo.zza;
                                    zzer zzerVar3 = new zzer(bArr6);
                                    String str9 = null;
                                    String str10 = null;
                                    while (zzerVar3.zzd() > 0 && (str9 == null || str10 == null)) {
                                        int iZzs5 = zzerVar3.zzs();
                                        int i31 = iZzs5 >> 3;
                                        int i32 = iZzs5 & 2;
                                        int i33 = iZzs5 & 1;
                                        int iZza2 = zzgxz.zza(zzerVar3.zzP());
                                        int i34 = iZzB;
                                        if (i31 > 4 && i31 < 24 && i32 != 0) {
                                            zzerVar3.zzQ();
                                            zzerVar3.zzQ();
                                        }
                                        if (i33 != 0) {
                                            zzerVar3.zzk(zzgxz.zza(zzerVar3.zzP()));
                                        }
                                        int iZzg3 = zzerVar3.zzg() + iZza2;
                                        int i35 = iZzB2;
                                        if (i31 == 31) {
                                            zzerVar3.zzk(4);
                                            Object[] objArr = {Integer.valueOf(zzerVar3.zzs()), Integer.valueOf(zzerVar3.zzs())};
                                            String str11 = zzfj.zza;
                                            str9 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                        } else {
                                            if (i31 == 0) {
                                                zzerVar3.zzQ();
                                                String strZzK = zzerVar3.zzK(4, StandardCharsets.UTF_8);
                                                if (strZzK.equals("mp4a")) {
                                                    zzerVar3.zzQ();
                                                    zzerVar3.zzk(2);
                                                    zzeq zzeqVar = new zzeq();
                                                    zzeqVar.zza(zzerVar3);
                                                    int iZzj = zzeqVar.zzj(5);
                                                    if (iZzj == 31) {
                                                        iZzj = zzeqVar.zzj(6) + 32;
                                                    }
                                                    StringBuilder sb2 = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
                                                    sb2.append(strZzK);
                                                    sb2.append(".40.");
                                                    sb2.append(iZzj);
                                                    strZzK = sb2.toString();
                                                }
                                                str10 = strZzK;
                                            }
                                            zzerVar3.zzh(iZzg3);
                                            iZzB2 = i35;
                                            iZzB = i34;
                                        }
                                        zzerVar3.zzh(iZzg3);
                                        iZzB2 = i35;
                                        iZzB = i34;
                                    }
                                    iZzB = iZzB;
                                    iZzB2 = iZzB2;
                                    if (str9 == null || str10 == null) {
                                        string = null;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(str9.length() + 1 + str10.length());
                                        sb3.append(str9);
                                        sb3.append(".");
                                        sb3.append(str10);
                                        string = sb3.toString();
                                    }
                                    listZzj = zzguf.zzj(bArr6);
                                    str3 = string;
                                } else {
                                    iZzB = iZzB;
                                    iZzB2 = iZzB2;
                                    if (iZzB3 == 1885564227) {
                                        zzerVar.zzh(iZzg2 + 12);
                                        ByteOrder byteOrder = (zzerVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iZzs6 = zzerVar.zzs();
                                        if (i20 == 1768973165) {
                                            iZzz = zzfj.zzz(iZzs6, byteOrder);
                                            i17 = -1;
                                        } else {
                                            iZzz = (i20 == 1718641517 && iZzs6 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i25;
                                            i17 = -1;
                                        }
                                        str3 = str6;
                                        if (iZzz != i17) {
                                            i25 = iZzz;
                                            str2 = "audio/raw";
                                        } else {
                                            i25 = iZzz;
                                        }
                                    } else {
                                        zzakdVar = zzakdVar;
                                        iRound = iRound;
                                    }
                                }
                                str3 = str6;
                            } else {
                                if (iZzB <= 0) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                    sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb4.append(iZzB);
                                    throw zzat.zzb(sb4.toString(), null);
                                }
                                iRound = iZzB;
                                iZzB = iRound;
                                iZzH = 2;
                                str3 = str6;
                            }
                            iRound = iRound;
                            iZzB = iZzB;
                            str3 = str6;
                        }
                        iRound = iRound;
                        iZzB = iZzB;
                        str3 = str6;
                    }
                    if (iZzg != i16) {
                        zzajyVarZzp = zzp(zzerVar, iZzg);
                        String strZza = zzajyVarZzp.zza();
                        byte[] bArrZzb = zzajyVarZzp.zzb();
                        if (bArrZzb != null) {
                            if ("audio/vorbis".equals(strZza)) {
                                zzer zzerVar4 = new zzer(bArrZzb);
                                int i36 = 1;
                                zzerVar4.zzk(1);
                                int i37 = 0;
                                while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                    zzerVar4.zzk(i36);
                                    i37 += 255;
                                    i36 = 1;
                                }
                                int iZzs7 = i37 + zzerVar4.zzs();
                                int i38 = 0;
                                while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                    zzerVar4.zzk(1);
                                    i38 += 255;
                                }
                                int iZzs8 = i38 + zzerVar4.zzs();
                                byte[] bArr7 = new byte[iZzs7];
                                int iZzg4 = zzerVar4.zzg();
                                System.arraycopy(bArrZzb, iZzg4, bArr7, 0, iZzs7);
                                int i39 = iZzg4 + iZzs7 + iZzs8;
                                int length2 = bArrZzb.length - i39;
                                byte[] bArr8 = new byte[length2];
                                System.arraycopy(bArrZzb, i39, bArr8, 0, length2);
                                listZzj = zzguf.zzk(bArr7, bArr8);
                            } else {
                                if ("audio/mp4a-latm".equals(strZza)) {
                                    zzads zzadsVarZza = zzadt.zza(bArrZzb);
                                    iRound = zzadsVarZza.zza;
                                    iZzH = zzadsVarZza.zzb;
                                    str3 = zzadsVarZza.zzc;
                                } else {
                                    str3 = str6;
                                }
                                listZzj = zzguf.zzj(bArrZzb);
                            }
                            str2 = strZza;
                        }
                        str3 = str6;
                        str2 = strZza;
                    } else {
                        str3 = str6;
                    }
                }
            }
            iZzg2 += iZzB2;
            i21 = i11;
            str6 = str3;
            str5 = str5;
            iZzB = iZzB;
            zzakdVar = zzakdVar;
            i22 = i12;
        }
        zzakd zzakdVar3 = zzakdVar;
        if (zzakdVar3.zzb != null || str2 == null) {
            return;
        }
        zzt zztVar2 = new zzt();
        zztVar2.zzb(i13);
        zztVar2.zzm(str2);
        zztVar2.zzj(str6);
        zztVar2.zzE(iZzH);
        zztVar2.zzF(iRound);
        zztVar2.zzG(i25);
        zztVar2.zzp(listZzj);
        zztVar2.zzq(zzqVarZzb);
        zztVar2.zze(str);
        if (zzajyVarZzp != null) {
            zztVar2.zzh(zzgxz.zzb(zzajyVarZzp.zzc()));
            zztVar2.zzi(zzgxz.zzb(zzajyVarZzp.zzd()));
        } else if (zzajwVarZzq != null) {
            zztVar2.zzh(zzgxz.zzb(zzajwVarZzq.zza()));
            zztVar2.zzi(zzgxz.zzb(zzajwVarZzq.zzb()));
        }
        zzakdVar3.zzb = zztVar2.zzM();
    }

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static zzap zzc(zzfv zzfvVar) {
        int iZzF;
        zzer zzerVar = zzfvVar.zza;
        zzerVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzerVar.zzd() >= 8) {
            int iZzg = zzerVar.zzg();
            int iZzB = zzerVar.zzB() + iZzg;
            int iZzB2 = zzerVar.zzB();
            zzap zzapVar2 = null;
            if (iZzB2 == 1835365473) {
                zzerVar.zzh(iZzg);
                zzerVar.zzk(8);
                zzf(zzerVar);
                while (zzerVar.zzg() < iZzB) {
                    int iZzg2 = zzerVar.zzg();
                    int iZzB3 = zzerVar.zzB() + iZzg2;
                    if (zzerVar.zzB() == 1768715124) {
                        zzerVar.zzh(iZzg2);
                        zzerVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzerVar.zzg() < iZzB3) {
                            zzao zzaoVarZzc = zzakq.zzc(zzerVar);
                            if (zzaoVarZzc != null) {
                                arrayList.add(zzaoVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            break;
                        }
                        break;
                    }
                    zzerVar.zzh(iZzB3);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == 1936553057) {
                zzerVar.zzh(iZzg);
                zzerVar.zzk(12);
                while (zzerVar.zzg() < iZzB) {
                    int iZzg3 = zzerVar.zzg();
                    int iZzB4 = zzerVar.zzB();
                    if (zzerVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzerVar.zzk(4);
                        int i10 = -1;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 2; i12++) {
                            int iZzs = zzerVar.zzs();
                            int iZzs2 = zzerVar.zzs();
                            if (iZzs == 0) {
                                i10 = iZzs2;
                            } else if (iZzs == 1) {
                                i11 = iZzs2;
                            }
                        }
                        if (i10 == 12) {
                            iZzF = 240;
                        } else if (i10 == 13) {
                            iZzF = 120;
                        } else if (i10 == 21 && zzerVar.zzd() >= 8 && zzerVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzerVar.zzB();
                            int iZzB6 = zzerVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzerVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzapVar2 = new zzap(-9223372036854775807L, new zzaix(iZzF, i11));
                        break;
                    }
                    zzerVar.zzh(iZzg3 + iZzB4);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzerVar));
            }
            zzerVar.zzh(iZzB);
        }
        return zzapVar;
    }

    public static zzfy zzd(zzer zzerVar) {
        long jZzD;
        long jZzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            jZzD = zzerVar.zzz();
            jZzD2 = zzerVar.zzz();
        } else {
            jZzD = zzerVar.zzD();
            jZzD2 = zzerVar.zzD();
        }
        return new zzfy(jZzD, jZzD2, zzerVar.zzz());
    }

    /* JADX WARN: Code duplicated, block: B:280:0x070c  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r29v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    public static zzalf zzg(zzalc zzalcVar, zzfu zzfuVar, zzafn zzafnVar, boolean z10) throws zzat {
        zzakb zzakfVar;
        boolean z11;
        int iZzH;
        int iZzH2;
        zzer zzerVar;
        int i10;
        boolean z12;
        ?? CopyOf;
        long j10;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        long[] jArr;
        int i15;
        int[] iArr;
        long[] jArr2;
        ?? r15;
        long j11;
        int i16;
        int i17;
        long j12;
        int i18;
        int i19;
        zzalc zzalcVarZzb;
        int[] iArr2;
        int i20;
        ArrayList arrayList;
        int i21;
        int[] iArr3;
        zzalc zzalcVar2;
        int i22;
        char c10;
        boolean z15;
        int length;
        long j13;
        zzalc zzalcVarZzb2 = zzalcVar;
        zzfv zzfvVarZzc = zzfuVar.zzc(1937011578);
        if (zzfvVarZzc != null) {
            zzakfVar = new zzake(zzfvVarZzc, zzalcVarZzb2.zzg);
        } else {
            zzfv zzfvVarZzc2 = zzfuVar.zzc(1937013298);
            if (zzfvVarZzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzakfVar = new zzakf(zzfvVarZzc2);
        }
        int iZza = zzakfVar.zza();
        if (iZza == 0) {
            return new zzalf(zzalcVar, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzalcVarZzb2.zzb == 2) {
            long j14 = zzalcVarZzb2.zzf;
            if (j14 > 0) {
                zzt zztVarZza = zzalcVarZzb2.zzg.zza();
                zztVarZza.zzx(iZza / (j14 / 1000000.0f));
                zzalcVarZzb2 = zzalcVarZzb2.zzb(zztVarZza.zzM());
            }
        }
        zzfv zzfvVarZzc3 = zzfuVar.zzc(1937007471);
        if (zzfvVarZzc3 == null) {
            zzfvVarZzc3 = zzfuVar.zzc(1668232756);
            zzfvVarZzc3.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        zzfv zzfvVarZzc4 = zzfuVar.zzc(1937011555);
        zzfvVarZzc4.getClass();
        zzer zzerVar2 = zzfvVarZzc4.zza;
        zzfv zzfvVarZzc5 = zzfuVar.zzc(1937011827);
        zzfvVarZzc5.getClass();
        zzer zzerVar3 = zzfvVarZzc5.zza;
        zzfv zzfvVarZzc6 = zzfuVar.zzc(1937011571);
        zzer zzerVar4 = zzfvVarZzc6 != null ? zzfvVarZzc6.zza : null;
        zzfv zzfvVarZzc7 = zzfuVar.zzc(1668576371);
        zzer zzerVar5 = zzfvVarZzc7 != null ? zzfvVarZzc7.zza : null;
        zzajx zzajxVar = new zzajx(zzerVar2, zzfvVarZzc3.zza, z11);
        zzerVar3.zzh(12);
        int iZzH3 = zzerVar3.zzH() - 1;
        int iZzH4 = zzerVar3.zzH();
        int iZzH5 = zzerVar3.zzH();
        if (zzerVar5 != null) {
            zzerVar5.zzh(12);
            iZzH = zzerVar5.zzH();
        } else {
            iZzH = 0;
        }
        if (zzerVar4 != null) {
            zzerVar4.zzh(12);
            int iZzH6 = zzerVar4.zzH();
            if (iZzH6 > 0) {
                iZzH2 = zzerVar4.zzH() - 1;
                zzer zzerVar6 = zzerVar4;
                i10 = iZzH6;
                zzerVar = zzerVar6;
            } else {
                i10 = iZzH6;
                iZzH2 = -1;
                zzerVar = null;
            }
        } else {
            iZzH2 = -1;
            zzerVar = zzerVar4;
            i10 = 0;
        }
        int iZzb = zzakfVar.zzb();
        zzv zzvVar = zzalcVarZzb2.zzg;
        if (iZzb != -1) {
            String str = zzvVar.zzo;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iZzH3 == 0) {
                z12 = iZzH == 0 && i10 == 0;
                iZzH3 = 0;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        ?? r31 = zzerVar == null ? 1 : 0;
        if (z12) {
            int i23 = zzajxVar.zza;
            long[] jArr3 = new long[i23];
            int[] iArr4 = new int[i23];
            while (zzajxVar.zza()) {
                int i24 = zzajxVar.zzb;
                jArr3[i24] = zzajxVar.zzd;
                iArr4[i24] = zzajxVar.zzc;
            }
            long j15 = iZzH5;
            int i25 = 8192 / iZzb;
            int i26 = 0;
            for (int i27 = 0; i27 < i23; i27++) {
                int i28 = iArr4[i27];
                String str2 = zzfj.zza;
                i26 += ((i28 + i25) - 1) / i25;
            }
            long[] jArr4 = new long[i26];
            iArr = new int[i26];
            jArr2 = new long[i26];
            int[] iArr5 = new int[i26];
            int i29 = i26;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i32 < i23) {
                int i35 = iArr4[i32];
                long j16 = jArr3[i32];
                int i36 = i34;
                int i37 = i23;
                int iMax = i33;
                int i38 = i36;
                long[] jArr5 = jArr3;
                int i39 = i35;
                while (i39 > 0) {
                    int iMin = Math.min(i25, i39);
                    jArr4[i38] = j16;
                    int[] iArr6 = iArr4;
                    int i40 = iZzb * iMin;
                    iArr[i38] = i40;
                    i31 += i40;
                    iMax = Math.max(iMax, i40);
                    jArr2[i38] = ((long) i30) * j15;
                    iArr5[i38] = 1;
                    j16 += (long) iArr[i38];
                    i30 += iMin;
                    i39 -= iMin;
                    i38++;
                    iZzb = iZzb;
                    i25 = i25;
                    iArr4 = iArr6;
                }
                i32++;
                jArr3 = jArr5;
                iArr4 = iArr4;
                int i41 = i38;
                i33 = iMax;
                i23 = i37;
                i34 = i41;
            }
            long j17 = j15 * ((long) i30);
            j11 = i31;
            i15 = i29;
            j10 = j17;
            jArr = jArr4;
            i16 = i33;
            r15 = iArr5;
        } else {
            long[] jArrCopyOf = new long[iZza];
            int[] iArrCopyOf = new int[iZza];
            long[] jArrCopyOf2 = new long[iZza];
            ?? r10 = new int[iZza];
            int i42 = iZzH;
            int i43 = iZzH2;
            int iZzH7 = 0;
            long j18 = 0;
            long j19 = 0;
            long j20 = 0;
            int iZzB = 0;
            int i44 = 0;
            int i45 = iZzH3;
            int i46 = i10;
            int i47 = 0;
            int i48 = 0;
            while (true) {
                if (i47 >= iZza) {
                    CopyOf = r10;
                    break;
                }
                long j21 = j18;
                int i49 = i48;
                boolean zZza = true;
                while (true) {
                    if (i49 != 0) {
                        i17 = i49;
                        break;
                    }
                    zZza = zzajxVar.zza();
                    if (!zZza) {
                        i17 = 0;
                        break;
                    }
                    zzer zzerVar7 = zzerVar3;
                    long j22 = zzajxVar.zzd;
                    i49 = zzajxVar.zzc;
                    j21 = j22;
                    zzerVar3 = zzerVar7;
                    iZza = iZza;
                    zZza = zZza;
                }
                if (!zZza) {
                    zzee.zzc("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i47);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i47);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i47);
                    iZza = i47;
                    i48 = i49;
                    CopyOf = Arrays.copyOf((int[]) r10, i47);
                    break;
                }
                if (zzerVar5 != null) {
                    while (iZzH7 == 0) {
                        if (i42 <= 0) {
                            iZzH7 = 0;
                            break;
                        }
                        i42--;
                        iZzH7 = zzerVar5.zzH();
                        iZzB = zzerVar5.zzB();
                    }
                    iZzH7--;
                }
                int i50 = iZzB;
                int iZzc = zzakfVar.zzc();
                zzakb zzakbVar = zzakfVar;
                zzajx zzajxVar2 = zzajxVar;
                long j23 = iZzc;
                j20 += j23;
                int i51 = i44;
                i44 = iZzc > i51 ? iZzc : i51;
                jArrCopyOf[i47] = j21;
                iArrCopyOf[i47] = iZzc;
                jArrCopyOf2[i47] = j19 + ((long) i50);
                r10[i47] = r31;
                int iZzH8 = i43;
                if (i47 == iZzH8) {
                    r10[i47] = 1;
                    arrayList2.add(Integer.valueOf(i47));
                }
                if (zzerVar != null && i47 == iZzH8 && (i46 = i46 - 1) > 0) {
                    iZzH8 = zzerVar.zzH() - 1;
                }
                i43 = iZzH8;
                j19 += (long) iZzH5;
                iZzH4--;
                if (iZzH4 == 0) {
                    if (i45 > 0) {
                        i45--;
                        iZzH4 = zzerVar3.zzH();
                        iZzH5 = zzerVar3.zzB();
                    } else {
                        iZzH4 = 0;
                    }
                }
                long j24 = j21 + j23;
                i48 = i17 - 1;
                i47++;
                iZzB = i50;
                zzerVar3 = zzerVar3;
                iZza = iZza;
                zzakfVar = zzakbVar;
                j18 = j24;
                zzajxVar = zzajxVar2;
            }
            j10 = j19 + ((long) iZzB);
            if (zzerVar5 == null) {
                z13 = true;
                break;
            }
            while (true) {
                if (i42 <= 0) {
                    z13 = true;
                    break;
                }
                if (zzerVar5.zzH() != 0) {
                    z13 = false;
                    break;
                }
                zzerVar5.zzB();
                i42--;
            }
            if (i46 != 0) {
                z14 = z13;
                jArrCopyOf = jArrCopyOf;
                i11 = iZzH4;
                i12 = i46;
                i13 = i45;
                i14 = iZzH7;
            } else if (iZzH4 != 0) {
                z14 = z13;
                jArrCopyOf = jArrCopyOf;
                i11 = iZzH4;
                i13 = i45;
                i14 = iZzH7;
                i12 = 0;
            } else if (i48 == 0) {
                if (i45 != 0) {
                    z14 = z13;
                    i13 = i45;
                    i14 = iZzH7;
                    i12 = 0;
                    i11 = 0;
                } else if (iZzH7 == 0) {
                    if (z13) {
                        jArrCopyOf = jArrCopyOf;
                    } else {
                        i12 = 0;
                        i11 = 0;
                        i13 = 0;
                        i14 = 0;
                        z14 = false;
                    }
                    jArr = jArrCopyOf;
                    i15 = iZza;
                    iArr = iArrCopyOf;
                    jArr2 = jArrCopyOf2;
                    r15 = CopyOf;
                    j11 = j20;
                    i16 = i44;
                } else {
                    z14 = z13;
                    i14 = iZzH7;
                    i12 = 0;
                    i11 = 0;
                    i13 = 0;
                }
                i48 = 0;
            } else {
                z14 = z13;
                jArrCopyOf = jArrCopyOf;
                i13 = i45;
                i14 = iZzH7;
                i12 = 0;
                i11 = 0;
            }
            int i52 = zzalcVarZzb2.zza;
            int length2 = String.valueOf(i52).length() + 66 + String.valueOf(i12).length() + 35 + String.valueOf(i11).length() + 26 + String.valueOf(i48).length() + 33 + String.valueOf(i13).length() + 36;
            int length3 = String.valueOf(i14).length();
            String str3 = true != z14 ? ", ctts invalid" : "";
            StringBuilder sb2 = new StringBuilder(length2 + length3 + str3.length());
            sb2.append("Inconsistent stbl box for track ");
            sb2.append(i52);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i12);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i11);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i48);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i13);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i14);
            sb2.append(str3);
            zzee.zzc("BoxParsers", sb2.toString());
            jArr = jArrCopyOf;
            i15 = iZza;
            iArr = iArrCopyOf;
            jArr2 = jArrCopyOf2;
            r15 = CopyOf;
            j11 = j20;
            i16 = i44;
        }
        long j25 = zzalcVarZzb2.zzf;
        if (j25 > 0) {
            long jZzt = zzfj.zzt(8 * j11, 1000000L, j25, RoundingMode.HALF_DOWN);
            if (jZzt > 0 && jZzt < 2147483647L) {
                zzt zztVarZza2 = zzvVar.zza();
                zztVarZza2.zzh((int) jZzt);
                zzalcVarZzb2 = zzalcVarZzb2.zzb(zztVarZza2.zzM());
            }
        }
        long j26 = zzalcVarZzb2.zzc;
        long jZzt2 = zzfj.zzt(j10, 1000000L, j26, RoundingMode.DOWN);
        int[] iArrZzf = zzgxz.zzf(arrayList2);
        long[] jArr6 = zzalcVarZzb2.zzi;
        if (jArr6 == null) {
            zzfj.zzu(jArr2, 1000000L, j26);
            return new zzalf(zzalcVarZzb2, jArr, iArr, i16, jArr2, r15, iArrZzf, r31, jZzt2, i15);
        }
        int length4 = jArr6.length;
        if (length4 == 1) {
            if (zzalcVarZzb2.zzb != 1 || (length = jArr2.length) < 2) {
                j12 = j26;
                i18 = i15;
            } else {
                long[] jArr7 = zzalcVarZzb2.zzj;
                jArr7.getClass();
                long j27 = jArr7[0];
                long j28 = jArr6[0];
                long j29 = zzalcVarZzb2.zzd;
                i18 = i15;
                long jZzt3 = j27 + zzfj.zzt(j28, j26, j29, RoundingMode.DOWN);
                int i53 = length - 1;
                int iMax2 = Math.max(0, Math.min(4, i53));
                int iMax3 = Math.max(0, Math.min(length - 4, i53));
                if (jArr2[0] <= j27 && j27 < jArr2[iMax2] && jArr2[iMax3] < jZzt3 && jZzt3 <= j10 + 2) {
                    long jMax = Math.max(0L, j10 - jZzt3);
                    long j30 = j27 - jArr2[0];
                    long j31 = zzalcVarZzb2.zzg.zzH;
                    long jZzt4 = zzfj.zzt(j30, j31, j26, RoundingMode.DOWN);
                    long jZzt5 = zzfj.zzt(jMax, j31, j26, RoundingMode.DOWN);
                    if (jZzt4 != 0) {
                        j13 = jZzt4;
                    } else if (jZzt5 != 0) {
                        j13 = 0;
                    }
                    if (j13 <= 2147483647L && jZzt5 <= 2147483647L) {
                        zzafnVar.zza = (int) j13;
                        zzafnVar.zzb = (int) jZzt5;
                        zzfj.zzu(jArr2, 1000000L, j26);
                        return new zzalf(zzalcVarZzb2, jArr, iArr, i16, jArr2, r15, iArrZzf, r31, zzfj.zzt(jArr6[0], 1000000L, j29, RoundingMode.DOWN), i18);
                    }
                }
                j12 = j26;
            }
            i19 = 1;
            length4 = 1;
        } else {
            j12 = j26;
            arrayList2 = arrayList2;
            i18 = i15;
            i19 = 1;
        }
        if (length4 == i19 && jArr6[0] == 0) {
            long[] jArr8 = zzalcVarZzb2.zzj;
            jArr8.getClass();
            long j32 = jArr8[0];
            for (int i54 = 0; i54 < jArr2.length; i54++) {
                jArr2[i54] = zzfj.zzt(jArr2[i54] - j32, 1000000L, j12, RoundingMode.DOWN);
            }
            return new zzalf(zzalcVarZzb2, jArr, iArr, i16, jArr2, r15, iArrZzf, r31, zzfj.zzt(j10 - j32, 1000000L, j12, RoundingMode.DOWN), i18);
        }
        long j33 = j12;
        boolean z16 = zzalcVarZzb2.zzb == 1;
        long[] jArr9 = zzalcVarZzb2.zzj;
        int[] iArr7 = new int[length4];
        int[] iArr8 = new int[length4];
        jArr9.getClass();
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        boolean z17 = false;
        while (i56 < jArr6.length) {
            long j34 = jArr9[i56];
            if (j34 != -1) {
                i21 = i56;
                int i58 = i57;
                zzalc zzalcVar3 = zzalcVarZzb2;
                int i59 = i55;
                iArr3 = iArr8;
                long jZzt6 = zzfj.zzt(jArr6[i56], j33, zzalcVarZzb2.zzd, RoundingMode.DOWN) + j34;
                iArr7[i21] = zzfj.zzm(jArr2, j34, true, true);
                int iZzo = zzfj.zzo(jArr2, jZzt6, z16, false);
                int i60 = iZzo - 1;
                int i61 = 0;
                while (true) {
                    if (iZzo >= jArr2.length) {
                        zzalcVar2 = zzalcVar3;
                        break;
                    }
                    if (jArr2[iZzo] >= jZzt6) {
                        i61++;
                        zzalcVar2 = zzalcVar3;
                        if (i61 > zzalcVar2.zzg.zzq) {
                            break;
                        }
                    } else {
                        i60 = iZzo;
                        zzalcVar2 = zzalcVar3;
                    }
                    iZzo++;
                    zzalcVar3 = zzalcVar2;
                }
                iArr3[i21] = i60 + 1;
                int i62 = iArr7[i21];
                while (true) {
                    i22 = iArr7[i21];
                    if (i22 <= 0) {
                        c10 = 1;
                        break;
                    }
                    c10 = 1;
                    if ((r15[i22] & 1) != 0) {
                        break;
                    }
                    iArr7[i21] = i22 - 1;
                }
                if (i22 == 0) {
                    z15 = false;
                    if ((r15[0] & c10) == 0) {
                        iArr7[i21] = i62;
                        while (true) {
                            i22 = iArr7[i21];
                            if (i22 >= iArr3[i21] || (r15[i22] & c10) != 0) {
                                break;
                            }
                            iArr7[i21] = i22 + 1;
                            c10 = 1;
                        }
                    }
                } else {
                    z15 = false;
                }
                int i63 = iArr3[i21];
                i57 = i58 + (i63 - i22);
                i55 = i63;
                z17 |= i59 != i22 ? true : z15;
            } else {
                i21 = i56;
                iArr3 = iArr8;
                zzalcVar2 = zzalcVarZzb2;
            }
            i56 = i21 + 1;
            zzalcVarZzb2 = zzalcVar2;
            iArr = iArr;
            jArr9 = jArr9;
            jArr = jArr;
            iArr8 = iArr3;
        }
        long[] jArr10 = jArr;
        int[] iArr9 = iArr8;
        long[] jArr11 = jArr9;
        int[] iArr10 = iArr;
        zzalc zzalcVar4 = zzalcVarZzb2;
        int i64 = i57;
        boolean z18 = z17 | (i64 != i18);
        long[] jArr12 = z18 ? new long[i64] : jArr10;
        int[] iArr11 = z18 ? new int[i64] : iArr10;
        if (true == z18) {
            i16 = 0;
        }
        ?? r13 = z18 ? new int[i64] : r15;
        ArrayList arrayList3 = z18 ? new ArrayList() : arrayList2;
        long[] jArr13 = new long[i64];
        int i65 = 0;
        boolean z19 = false;
        int i66 = 0;
        int i67 = i16;
        long j35 = 0;
        while (i66 < jArr6.length) {
            long j36 = jArr11[i66];
            int i68 = iArr7[i66];
            boolean z20 = z19;
            int i69 = iArr9[i66];
            ArrayList arrayList4 = arrayList3;
            if (z18) {
                int i70 = i69 - i68;
                System.arraycopy(jArr10, i68, jArr12, i65, i70);
                iArr2 = iArr10;
                System.arraycopy(iArr2, i68, iArr11, i65, i70);
                System.arraycopy(r15, i68, r13, i65, i70);
            } else {
                iArr2 = iArr10;
            }
            boolean z21 = z20;
            int i71 = i65;
            int i72 = i67;
            while (i68 < i69) {
                long jZzt7 = zzfj.zzt(j35, 1000000L, zzalcVar4.zzd, RoundingMode.DOWN);
                int i73 = i68;
                int i74 = i69;
                ArrayList arrayList5 = arrayList4;
                int i75 = i72;
                int i76 = i66;
                long[] jArr14 = jArr2;
                zzalc zzalcVar5 = zzalcVar4;
                long jZzt8 = zzfj.zzt(jArr2[i68] - j36, 1000000L, j33, RoundingMode.DOWN);
                z21 = (!(jZzt8 >= 0)) | z21;
                jArr13[i71] = jZzt7 + jZzt8;
                if (z18) {
                    i20 = i75;
                    if (iArr11[i71] > i20) {
                        i72 = iArr2[i73];
                    }
                    if (z18 || r31 != 0 || (r13[i71] & 1) == 0) {
                        arrayList = arrayList5;
                    } else {
                        arrayList = arrayList5;
                        arrayList.add(Integer.valueOf(i71));
                    }
                    i71++;
                    i68 = i73 + 1;
                    arrayList4 = arrayList;
                    zzalcVar4 = zzalcVar5;
                    i69 = i74;
                    i66 = i76;
                    jArr2 = jArr14;
                } else {
                    i20 = i75;
                }
                i72 = i20;
                if (z18) {
                    arrayList = arrayList5;
                } else {
                    arrayList = arrayList5;
                }
                i71++;
                i68 = i73 + 1;
                arrayList4 = arrayList;
                zzalcVar4 = zzalcVar5;
                i69 = i74;
                i66 = i76;
                jArr2 = jArr14;
            }
            i67 = i72;
            int i77 = i66;
            j35 += jArr6[i77];
            arrayList3 = arrayList4;
            z19 = z21;
            jArr2 = jArr2;
            i66 = i77 + 1;
            iArr10 = iArr2;
            iArr7 = iArr7;
            i65 = i71;
        }
        boolean z22 = z19;
        ArrayList arrayList6 = arrayList3;
        zzalc zzalcVar6 = zzalcVar4;
        long jZzt9 = zzfj.zzt(j35, 1000000L, zzalcVar6.zzd, RoundingMode.DOWN);
        if (z22) {
            zzt zztVarZza3 = zzalcVar6.zzg.zza();
            zztVarZza3.zzs(true);
            zzalcVarZzb = zzalcVar6.zzb(zztVarZza3.zzM());
        } else {
            zzalcVarZzb = zzalcVar6;
        }
        return new zzalf(zzalcVarZzb, jArr12, iArr11, i67, jArr13, r13, zzgxz.zzf(arrayList6), r31, jZzt9, jArr12.length);
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178 A[PHI: r3
  0x0178: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:76:0x016a, B:77:0x016c, B:82:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    private static zzi zzk(zzer zzerVar) {
        int i10;
        int iZzj;
        int iZzj2;
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(bArrZzi, bArrZzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int iZzj3 = zzeqVar.zzj(3);
        zzeqVar.zzh(6);
        boolean zZzi = zzeqVar.zzi();
        boolean zZzi2 = zzeqVar.zzi();
        boolean z10 = false;
        if (iZzj3 != 2) {
            if (iZzj3 <= 2) {
                i10 = true != zZzi ? 8 : 10;
                zzhVar.zze(i10);
                zzhVar.zzf(i10);
            }
        } else if (zZzi) {
            i10 = true == zZzi2 ? 12 : 10;
            zzhVar.zze(i10);
            zzhVar.zzf(i10);
        } else {
            zZzi = false;
            iZzj3 = 2;
            if (iZzj3 <= 2) {
                if (true != zZzi) {
                }
                zzhVar.zze(i10);
                zzhVar.zzf(i10);
            }
        }
        int i11 = 13;
        zzeqVar.zzh(13);
        zzeqVar.zzg();
        int iZzj4 = zzeqVar.zzj(4);
        if (iZzj4 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 22);
            sb2.append("Unsupported obu_type: ");
            sb2.append(iZzj4);
            zzee.zzb("BoxParsers", sb2.toString());
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported obu_extension_flag");
            return zzhVar.zzg();
        }
        boolean zZzi3 = zzeqVar.zzi();
        zzeqVar.zzg();
        if (zZzi3 && zzeqVar.zzj(8) > 127) {
            zzee.zzb("BoxParsers", "Excessive obu_size");
            return zzhVar.zzg();
        }
        int iZzj5 = zzeqVar.zzj(3);
        zzeqVar.zzg();
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported timing_info_present_flag");
            return zzhVar.zzg();
        }
        if (zzeqVar.zzi()) {
            zzee.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return zzhVar.zzg();
        }
        int iZzj6 = zzeqVar.zzj(5);
        for (int i12 = 0; i12 <= iZzj6; i12++) {
            zzeqVar.zzh(12);
            if (zzeqVar.zzj(5) > 7) {
                zzeqVar.zzg();
            }
        }
        int iZzj7 = zzeqVar.zzj(4);
        int iZzj8 = zzeqVar.zzj(4);
        zzeqVar.zzh(iZzj7 + 1);
        zzeqVar.zzh(iZzj8 + 1);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(7);
        }
        zzeqVar.zzh(7);
        boolean zZzi4 = zzeqVar.zzi();
        if (zZzi4) {
            zzeqVar.zzh(2);
        }
        if ((zzeqVar.zzi() || zzeqVar.zzj(1) > 0) && !zzeqVar.zzi()) {
            zzeqVar.zzh(1);
        }
        if (zZzi4) {
            zzeqVar.zzh(3);
        }
        zzeqVar.zzh(3);
        boolean zZzi5 = zzeqVar.zzi();
        if (iZzj5 != 2) {
            if (iZzj5 != 1) {
            }
            if (zzeqVar.zzi()) {
                int iZzj9 = zzeqVar.zzj(8);
                iZzj = zzeqVar.zzj(8);
                int iZzj10 = zzeqVar.zzj(8);
                if (!z10 || iZzj9 != 1) {
                    i11 = iZzj;
                    iZzj2 = zzeqVar.zzj(1);
                } else if (iZzj != 13) {
                    iZzj9 = 1;
                    i11 = iZzj;
                    iZzj2 = zzeqVar.zzj(1);
                } else if (iZzj10 == 0) {
                    iZzj2 = 1;
                    iZzj9 = 1;
                } else {
                    iZzj9 = 1;
                    iZzj2 = zzeqVar.zzj(1);
                }
                zzhVar.zza(zzi.zzb(iZzj9));
                zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
                zzhVar.zzc(zzi.zzc(i11));
            }
            return zzhVar.zzg();
        }
        if (zZzi5) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            z10 = true;
        }
        if (zzeqVar.zzi()) {
            int iZzj11 = zzeqVar.zzj(8);
            iZzj = zzeqVar.zzj(8);
            int iZzj12 = zzeqVar.zzj(8);
            if (!z10) {
                i11 = iZzj;
                iZzj2 = zzeqVar.zzj(1);
            } else {
                i11 = iZzj;
                iZzj2 = zzeqVar.zzj(1);
            }
            zzhVar.zza(zzi.zzb(iZzj11));
            zzhVar.zzb(iZzj2 != 1 ? 2 : 1);
            zzhVar.zzc(zzi.zzc(i11));
        }
        return zzhVar.zzg();
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(bArrZzi, bArrZzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int iZzj = zzeqVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzeqVar.zzo(1);
            int iZzj2 = zzeqVar.zzj(8);
            for (int i11 = 0; i11 < iZzj2; i11++) {
                zzeqVar.zzh(6);
                boolean zZzi = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int iZzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzeqVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzeqVar.zzj(8);
                    int iZzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zZzi2 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static zzajy zzp(zzer zzerVar, int i10) {
        zzerVar.zzh(i10 + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int iZzs = zzerVar.zzs();
        if ((iZzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String strZze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzajy(strZze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        long jZzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int iZzs2 = zzs(zzerVar);
        byte[] bArr = new byte[iZzs2];
        zzerVar.zzm(bArr, 0, iZzs2);
        return new zzajy(strZze, bArr, jZzz2 <= 0 ? -1L : jZzz2, jZzz > 0 ? jZzz : -1L);
    }

    private static zzajw zzq(zzer zzerVar, int i10) {
        zzerVar.zzh(i10 + 8);
        zzerVar.zzk(4);
        return new zzajw(zzerVar.zzz(), zzerVar.zzz());
    }

    @Nullable
    private static Pair zzr(zzer zzerVar, int i10, int i11) throws zzat {
        zzald zzaldVar;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int iZzg = zzerVar.zzg();
        while (iZzg - i10 < i11) {
            zzerVar.zzh(iZzg);
            int iZzB = zzerVar.zzB();
            zzaey.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i14 = iZzg + 8;
                int i15 = 0;
                int i16 = -1;
                String strZzK = null;
                Integer numValueOf = null;
                while (i14 - iZzg < iZzB) {
                    zzerVar.zzh(i14);
                    int iZzB2 = zzerVar.zzB();
                    int iZzB3 = zzerVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzerVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        strZzK = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i16 = i14;
                        i15 = iZzB2;
                    }
                    i14 += iZzB2;
                }
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzaey.zza(numValueOf != null, "frma atom is mandatory");
                    zzaey.zza(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            zzaldVar = null;
                            break;
                        }
                        zzerVar.zzh(i17);
                        int iZzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int iZza = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (iZza == 0) {
                                zzerVar.zzk(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iZzs = zzerVar.zzs();
                                int i18 = (iZzs & 240) >> 4;
                                i12 = iZzs & 15;
                                i13 = i18;
                            }
                            boolean z10 = zzerVar.zzs() == 1;
                            int iZzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z10 && iZzs2 == 0) {
                                int iZzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzerVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzaldVar = new zzald(z10, strZzK, iZzs2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i17 += iZzB4;
                    }
                    zzaey.zza(zzaldVar != null, "tenc atom is mandatory");
                    String str = zzfj.zza;
                    pairCreate = Pair.create(numValueOf, zzaldVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    @Nullable
    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzfvVarZzc = zzfuVar.zzc(1751411826);
        zzfv zzfvVarZzc2 = zzfuVar.zzc(1801812339);
        zzfv zzfvVarZzc3 = zzfuVar.zzc(1768715124);
        if (zzfvVarZzc != null && zzfvVarZzc2 != null && zzfvVarZzc3 != null && zzi(zzfvVarZzc.zza) == 1835299937) {
            zzer zzerVar = zzfvVarZzc2.zza;
            zzerVar.zzh(12);
            int iZzB = zzerVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i10 = 0; i10 < iZzB; i10++) {
                int iZzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i10] = zzerVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzfvVarZzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int iZzg = zzerVar2.zzg() + zzerVar2.zzB();
                int iZzB3 = zzerVar2.zzB() - 1;
                if (iZzB3 >= 0 && iZzB3 < iZzB) {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzerVar2.zzg();
                        if (iZzg2 < iZzg) {
                            int iZzB4 = zzerVar2.zzB();
                            if (zzerVar2.zzB() == 1684108385) {
                                int iZzB5 = zzerVar2.zzB();
                                int iZzB6 = zzerVar2.zzB();
                                int i11 = iZzB4 - 16;
                                byte[] bArr = new byte[i11];
                                zzerVar2.zzm(bArr, 0, i11);
                                zzfsVar = new zzfs(str, bArr, iZzB6, iZzB5);
                                break;
                            }
                            zzerVar2.zzh(iZzg2 + iZzB4);
                        } else {
                            zzfsVar = null;
                            break;
                        }
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb2.append("Skipped metadata with unknown key index: ");
                    sb2.append(iZzB3);
                    zzee.zzc("BoxParsers", sb2.toString());
                }
                zzerVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzerVar.zzh(iZzg);
    }

    @Nullable
    private static zzap zzh(zzer zzerVar) {
        short sZzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String strZzK = zzerVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static Pair zzn(zzfu zzfuVar) {
        long jZzz;
        long jZzB;
        zzfv zzfvVarZzc = zzfuVar.zzc(1701606260);
        if (zzfvVarZzc == null) {
            return null;
        }
        zzer zzerVar = zzfvVarZzc.zza;
        zzerVar.zzh(8);
        int iZza = zza(zzerVar.zzB());
        int iZzH = zzerVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i10 = 0; i10 < iZzH; i10++) {
            if (iZza == 1) {
                jZzz = zzerVar.zzJ();
            } else {
                jZzz = zzerVar.zzz();
            }
            jArr[i10] = jZzz;
            if (iZza == 1) {
                jZzB = zzerVar.zzD();
            } else {
                jZzB = zzerVar.zzB();
            }
            jArr2[i10] = jZzB;
            if (zzerVar.zzv() == 1) {
                zzerVar.zzk(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static int zzs(zzer zzerVar) {
        int iZzs = zzerVar.zzs();
        int i10 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzerVar.zzs();
            i10 = (i10 << 7) | (iZzs & 127);
        }
        return i10;
    }
}
