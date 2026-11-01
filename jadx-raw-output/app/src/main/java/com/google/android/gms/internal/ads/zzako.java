package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;

    @Nullable
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    static {
        int i10 = zzakk.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x040f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0418  */
    /* JADX WARN: Code duplicated, block: B:151:0x0421  */
    /* JADX WARN: Code duplicated, block: B:152:0x042a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0433  */
    /* JADX WARN: Code duplicated, block: B:156:0x043a  */
    /* JADX WARN: Code duplicated, block: B:157:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x043e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0442  */
    /* JADX WARN: Code duplicated, block: B:160:0x0443 A[PHI: r2
  0x0443: PHI (r2v43 int) = (r2v42 int), (r2v44 int) binds: [B:156:0x043a, B:159:0x0442] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0447  */
    /* JADX WARN: Code duplicated, block: B:163:0x0454  */
    /* JADX WARN: Code duplicated, block: B:166:0x0472  */
    /* JADX WARN: Code duplicated, block: B:167:0x0480  */
    /* JADX WARN: Code duplicated, block: B:170:0x0492 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0494 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0496  */
    /* JADX WARN: Code duplicated, block: B:173:0x049a  */
    /* JADX WARN: Code duplicated, block: B:174:0x049e  */
    private final void zzj(long j10) throws zzat {
        zzap zzapVar;
        SparseArray sparseArray;
        int i10;
        zzfu zzfuVar;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        byte[] bArr3;
        int i15;
        boolean z10;
        int i16;
        List list;
        zzakn zzaknVar;
        zzakn zzaknVar2;
        zzer zzerVar;
        int i17;
        long j11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z11;
        int i18;
        long j12;
        boolean z12;
        long j13;
        int i19;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzt;
        zzakn zzaknVar3;
        int i20;
        boolean z13;
        long[] jArr2;
        final zzako zzakoVar = this;
        while (true) {
            ArrayDeque arrayDeque = zzakoVar.zzn;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j10) {
                break;
            }
            zzfu zzfuVar2 = (zzfu) arrayDeque.pop();
            int i21 = zzfuVar2.zzd;
            int i22 = 12;
            int i23 = 8;
            if (i21 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfuVar2.zzb);
                zzfu zzfuVarZzd = zzfuVar2.zzd(1836475768);
                zzfuVarZzd.getClass();
                SparseArray sparseArray2 = new SparseArray();
                List list2 = zzfuVarZzd.zzb;
                int size = list2.size();
                int i24 = 0;
                long jZzz = -9223372036854775807L;
                while (i24 < size) {
                    zzfv zzfvVar = (zzfv) list2.get(i24);
                    int i25 = zzfvVar.zzd;
                    if (i25 == 1953654136) {
                        zzer zzerVar2 = zzfvVar.zza;
                        zzerVar2.zzh(i22);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzerVar2.zzB()), new zzaki(zzerVar2.zzB() - 1, zzerVar2.zzB(), zzerVar2.zzB(), zzerVar2.zzB()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzaki) pairCreate.second);
                    } else if (i25 == 1835362404) {
                        zzer zzerVar3 = zzfvVar.zza;
                        zzerVar3.zzh(8);
                        jZzz = zzakh.zza(zzerVar3.zzB()) == 0 ? zzerVar3.zzz() : zzerVar3.zzJ();
                    }
                    i24++;
                    i22 = 12;
                }
                zzfu zzfuVarZzd2 = zzfuVar2.zzd(1835365473);
                zzap zzapVarZze = zzfuVarZzd2 != null ? zzakh.zze(zzfuVarZzd2) : null;
                zzafn zzafnVar = new zzafn();
                zzfv zzfvVarZzc = zzfuVar2.zzc(1969517665);
                if (zzfvVarZzc != null) {
                    zzap zzapVarZzc = zzakh.zzc(zzfvVarZzc);
                    zzafnVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar2.zzc(1836476516);
                zzfvVarZzc2.getClass();
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzakh.zzd(zzfvVarZzc2.zza));
                List listZzb = zzakh.zzb(zzfuVar2, zzafnVar, jZzz, zzqVarZzn, (zzakoVar.zzd & 16) != 0, false, new zzgqt(zzakoVar) { // from class: com.google.android.gms.internal.ads.zzakj
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzalc) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray3 = zzakoVar.zzf;
                if (sparseArray3.size() == 0) {
                    String strZza = zzakr.zza(listZzb);
                    int i26 = 0;
                    while (i26 < size2) {
                        zzalf zzalfVar = (zzalf) listZzb.get(i26);
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = zzakoVar.zzI;
                        int i27 = zzalcVar.zzb;
                        zzagh zzaghVarZzu = zzaexVar.zzu(i26, i27);
                        long j14 = zzalcVar.zze;
                        zzaghVarZzu.zzN(j14);
                        List list3 = listZzb;
                        zzv zzvVar = zzalcVar.zzg;
                        int i28 = size2;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzl(strZza);
                        zzakq.zzb(i27, zzafnVar, zztVarZza);
                        zzakq.zza(i27, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVar, zzapVar2);
                        int i29 = zzalcVar.zza;
                        sparseArray3.put(i29, new zzakn(zzaghVarZzu, zzalfVar, zzo(sparseArray2, i29), zztVarZza.zzM()));
                        zzakoVar.zzA = Math.max(zzakoVar.zzA, j14);
                        i26++;
                        listZzb = list3;
                        size2 = i28;
                        strZza = strZza;
                        zzafnVar = zzafnVar;
                    }
                    zzakoVar.zzI.zzv();
                } else {
                    zzgrc.zzi(sparseArray3.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzalf zzalfVar2 = (zzalf) listZzb.get(i30);
                        int i31 = zzalfVar2.zza.zza;
                        ((zzakn) sparseArray3.get(i31)).zza(zzalfVar2, zzo(sparseArray2, i31));
                    }
                }
            } else if (i21 == 1836019558) {
                SparseArray sparseArray4 = zzakoVar.zzf;
                int i32 = zzakoVar.zzd;
                byte[] bArr4 = zzakoVar.zzj;
                List list4 = zzfuVar2.zzc;
                int size3 = list4.size();
                int i33 = 0;
                while (i33 < size3) {
                    zzfu zzfuVar3 = (zzfu) list4.get(i33);
                    if (zzfuVar3.zzd == 1953653094) {
                        zzfv zzfvVarZzc3 = zzfuVar3.zzc(1952868452);
                        zzfvVarZzc3.getClass();
                        zzer zzerVar4 = zzfvVarZzc3.zza;
                        zzerVar4.zzh(i23);
                        int iZzB5 = zzerVar4.zzB() & ViewCompat.MEASURED_SIZE_MASK;
                        int i34 = zzakh.zza;
                        zzakn zzaknVar4 = (zzakn) sparseArray4.get(zzerVar4.zzB());
                        if (zzaknVar4 == null) {
                            zzaknVar4 = null;
                        } else {
                            if ((iZzB5 & 1) != 0) {
                                long jZzJ = zzerVar4.zzJ();
                                zzale zzaleVar = zzaknVar4.zzb;
                                zzaleVar.zzb = jZzJ;
                                zzaleVar.zzc = jZzJ;
                            }
                            zzaki zzakiVar = zzaknVar4.zze;
                            zzaknVar4.zzb.zza = new zzaki((iZzB5 & 2) != 0 ? zzerVar4.zzB() - 1 : zzakiVar.zza, (iZzB5 & 8) != 0 ? zzerVar4.zzB() : zzakiVar.zzb, (iZzB5 & 16) != 0 ? zzerVar4.zzB() : zzakiVar.zzc, (iZzB5 & 32) != 0 ? zzerVar4.zzB() : zzakiVar.zzd);
                        }
                        if (zzaknVar4 == null) {
                            sparseArray = sparseArray4;
                            i10 = i32;
                            zzfuVar = zzfuVar2;
                            bArr = bArr4;
                            i11 = size3;
                            i12 = i33;
                        } else {
                            zzale zzaleVar2 = zzaknVar4.zzb;
                            long j15 = zzaleVar2.zzp;
                            boolean z14 = zzaleVar2.zzq;
                            zzaknVar4.zzc();
                            zzaknVar4.zzl(true);
                            zzfv zzfvVarZzc4 = zzfuVar3.zzc(1952867444);
                            if (zzfvVarZzc4 == null || (i32 & 2) != 0) {
                                zzaleVar2.zzp = j15;
                                zzaleVar2.zzq = z14;
                            } else {
                                zzer zzerVar5 = zzfvVarZzc4.zza;
                                zzerVar5.zzh(8);
                                zzaleVar2.zzp = zzakh.zza(zzerVar5.zzB()) == 1 ? zzerVar5.zzJ() : zzerVar5.zzz();
                                zzaleVar2.zzq = true;
                            }
                            List list5 = zzfuVar3.zzb;
                            int size4 = list5.size();
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i35 >= size4) {
                                    break;
                                }
                                int i38 = size3;
                                zzfv zzfvVar2 = (zzfv) list5.get(i35);
                                if (zzfvVar2.zzd == 1953658222) {
                                    zzer zzerVar6 = zzfvVar2.zza;
                                    zzerVar6.zzh(12);
                                    int iZzH = zzerVar6.zzH();
                                    if (iZzH > 0) {
                                        i37 += iZzH;
                                        i36++;
                                    }
                                }
                                i35++;
                                size3 = i38;
                            }
                            i11 = size3;
                            zzaknVar4.zzh = 0;
                            zzaknVar4.zzg = 0;
                            zzaknVar4.zzf = 0;
                            zzaleVar2.zzd = i36;
                            zzaleVar2.zze = i37;
                            if (zzaleVar2.zzg.length < i36) {
                                zzaleVar2.zzf = new long[i36];
                                zzaleVar2.zzg = new int[i36];
                            }
                            if (zzaleVar2.zzh.length < i37) {
                                int i39 = (i37 * 125) / 100;
                                zzaleVar2.zzh = new int[i39];
                                zzaleVar2.zzi = new long[i39];
                                zzaleVar2.zzj = new boolean[i39];
                                zzaleVar2.zzl = new boolean[i39];
                            }
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (i40 < size4) {
                                zzfv zzfvVar3 = (zzfv) list5.get(i40);
                                if (zzfvVar3.zzd == i14) {
                                    int i43 = i41 + 1;
                                    zzer zzerVar7 = zzfvVar3.zza;
                                    zzerVar7.zzh(8);
                                    int iZzB6 = zzerVar7.zzB() & ViewCompat.MEASURED_SIZE_MASK;
                                    zzalc zzalcVar2 = zzaknVar4.zzd.zza;
                                    zzaki zzakiVar2 = zzaleVar2.zza;
                                    String str = zzfj.zza;
                                    zzaleVar2.zzg[i41] = zzerVar7.zzH();
                                    long[] jArr3 = zzaleVar2.zzf;
                                    long j16 = zzaleVar2.zzb;
                                    jArr3[i41] = j16;
                                    if ((iZzB6 & 1) != 0) {
                                        jArr3[i41] = j16 + ((long) zzerVar7.zzB());
                                    }
                                    boolean z15 = (iZzB6 & 4) != 0;
                                    int i44 = zzakiVar2.zzd;
                                    int iZzB7 = z15 ? zzerVar7.zzB() : i44;
                                    int i45 = iZzB6 & 256;
                                    int i46 = iZzB6 & 512;
                                    int i47 = iZzB6 & 1024;
                                    int i48 = iZzB6 & 2048;
                                    int i49 = iZzB7;
                                    long[] jArr4 = zzalcVar2.zzi;
                                    if (jArr4 != null) {
                                        list = list5;
                                        i16 = i40;
                                        if (jArr4.length != 1 || (jArr2 = zzalcVar2.zzj) == null) {
                                            i17 = i48;
                                            zzaknVar2 = zzaknVar4;
                                            zzerVar = zzerVar7;
                                        } else {
                                            long j17 = jArr4[0];
                                            if (j17 == 0) {
                                                i17 = i48;
                                                zzaknVar2 = zzaknVar4;
                                                zzerVar = zzerVar7;
                                            } else {
                                                i17 = i48;
                                                zzaknVar2 = zzaknVar4;
                                                zzerVar = zzerVar7;
                                                if (zzfj.zzt(j17, 1000000L, zzalcVar2.zzd, RoundingMode.DOWN) + zzfj.zzt(jArr2[0], 1000000L, zzalcVar2.zzc, RoundingMode.DOWN) < zzalcVar2.zze) {
                                                }
                                                iArr = zzaleVar2.zzh;
                                                jArr = zzaleVar2.zzi;
                                                zArr = zzaleVar2.zzj;
                                                if (zzalcVar2.zzb == 2 || (i32 & 1) == 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                i18 = zzaleVar2.zzg[i41] + i42;
                                                j12 = zzalcVar2.zzc;
                                                z12 = z11;
                                                j13 = zzaleVar2.zzp;
                                                i19 = i42;
                                                while (i19 < i18) {
                                                    if (i45 != 0) {
                                                        iZzB = zzerVar.zzB();
                                                    } else {
                                                        iZzB = zzakiVar2.zzb;
                                                    }
                                                    zzk(iZzB);
                                                    if (i46 != 0) {
                                                        iZzB2 = zzerVar.zzB();
                                                    } else {
                                                        iZzB2 = zzakiVar2.zzc;
                                                    }
                                                    zzk(iZzB2);
                                                    if (i47 != 0) {
                                                        iZzB3 = zzerVar.zzB();
                                                    } else if (i19 != 0) {
                                                        iZzB3 = i44;
                                                    } else if (z15) {
                                                        iZzB3 = i49;
                                                        i19 = 0;
                                                    } else {
                                                        i19 = 0;
                                                        iZzB3 = i44;
                                                    }
                                                    if (i17 != 0) {
                                                        iZzB4 = zzerVar.zzB();
                                                    } else {
                                                        iZzB4 = 0;
                                                    }
                                                    jZzt = zzfj.zzt((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                                    jArr[i19] = jZzt;
                                                    int i50 = i47;
                                                    if (zzaleVar2.zzq) {
                                                        zzaknVar3 = zzaknVar2;
                                                    } else {
                                                        zzaknVar3 = zzaknVar2;
                                                        jArr[i19] = jZzt + zzaknVar3.zzd.zzi;
                                                    }
                                                    iArr[i19] = iZzB2;
                                                    if (((iZzB3 >> 16) & 1) != 0) {
                                                        i20 = i19;
                                                        z13 = false;
                                                    } else if (!z12) {
                                                        i20 = i19;
                                                        z13 = true;
                                                    } else if (i19 == 0) {
                                                        z13 = true;
                                                        i20 = 0;
                                                    } else {
                                                        i20 = i19;
                                                        z13 = false;
                                                    }
                                                    zArr[i20] = z13;
                                                    j13 += (long) iZzB;
                                                    i19 = i20 + 1;
                                                    zzaknVar2 = zzaknVar3;
                                                    i47 = i50;
                                                    i17 = i17;
                                                    j12 = j12;
                                                    i18 = i18;
                                                    i45 = i45;
                                                    z15 = z15;
                                                    zArr = zArr;
                                                }
                                                int i51 = i18;
                                                zzaknVar = zzaknVar2;
                                                zzaleVar2.zzp = j13;
                                                i41 = i43;
                                                i42 = i51;
                                            }
                                            j11 = jArr2[0];
                                            iArr = zzaleVar2.zzh;
                                            jArr = zzaleVar2.zzi;
                                            zArr = zzaleVar2.zzj;
                                            if (zzalcVar2.zzb == 2) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            i18 = zzaleVar2.zzg[i41] + i42;
                                            j12 = zzalcVar2.zzc;
                                            z12 = z11;
                                            j13 = zzaleVar2.zzp;
                                            i19 = i42;
                                            while (i19 < i18) {
                                                if (i45 != 0) {
                                                    iZzB = zzerVar.zzB();
                                                } else {
                                                    iZzB = zzakiVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i46 != 0) {
                                                    iZzB2 = zzerVar.zzB();
                                                } else {
                                                    iZzB2 = zzakiVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i47 != 0) {
                                                    iZzB3 = zzerVar.zzB();
                                                } else if (i19 != 0) {
                                                    iZzB3 = i44;
                                                } else if (z15) {
                                                    iZzB3 = i49;
                                                    i19 = 0;
                                                } else {
                                                    i19 = 0;
                                                    iZzB3 = i44;
                                                }
                                                if (i17 != 0) {
                                                    iZzB4 = zzerVar.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                jZzt = zzfj.zzt((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                                jArr[i19] = jZzt;
                                                int i52 = i47;
                                                if (zzaleVar2.zzq) {
                                                    zzaknVar3 = zzaknVar2;
                                                    jArr[i19] = jZzt + zzaknVar3.zzd.zzi;
                                                } else {
                                                    zzaknVar3 = zzaknVar2;
                                                }
                                                iArr[i19] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    i20 = i19;
                                                    z13 = false;
                                                } else if (!z12) {
                                                    i20 = i19;
                                                    z13 = true;
                                                } else if (i19 == 0) {
                                                    z13 = true;
                                                    i20 = 0;
                                                } else {
                                                    i20 = i19;
                                                    z13 = false;
                                                }
                                                zArr[i20] = z13;
                                                j13 += (long) iZzB;
                                                i19 = i20 + 1;
                                                zzaknVar2 = zzaknVar3;
                                                i47 = i52;
                                                i17 = i17;
                                                j12 = j12;
                                                i18 = i18;
                                                i45 = i45;
                                                z15 = z15;
                                                zArr = zArr;
                                            }
                                            int i53 = i18;
                                            zzaknVar = zzaknVar2;
                                            zzaleVar2.zzp = j13;
                                            i41 = i43;
                                            i42 = i53;
                                        }
                                    } else {
                                        i16 = i40;
                                        list = list5;
                                        zzaknVar2 = zzaknVar4;
                                        zzerVar = zzerVar7;
                                        i17 = i48;
                                    }
                                    j11 = 0;
                                    iArr = zzaleVar2.zzh;
                                    jArr = zzaleVar2.zzi;
                                    zArr = zzaleVar2.zzj;
                                    if (zzalcVar2.zzb == 2) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    i18 = zzaleVar2.zzg[i41] + i42;
                                    j12 = zzalcVar2.zzc;
                                    z12 = z11;
                                    j13 = zzaleVar2.zzp;
                                    i19 = i42;
                                    while (i19 < i18) {
                                        if (i45 != 0) {
                                            iZzB = zzerVar.zzB();
                                        } else {
                                            iZzB = zzakiVar2.zzb;
                                        }
                                        zzk(iZzB);
                                        if (i46 != 0) {
                                            iZzB2 = zzerVar.zzB();
                                        } else {
                                            iZzB2 = zzakiVar2.zzc;
                                        }
                                        zzk(iZzB2);
                                        if (i47 != 0) {
                                            iZzB3 = zzerVar.zzB();
                                        } else if (i19 != 0) {
                                            iZzB3 = i44;
                                        } else if (z15) {
                                            iZzB3 = i49;
                                            i19 = 0;
                                        } else {
                                            i19 = 0;
                                            iZzB3 = i44;
                                        }
                                        if (i17 != 0) {
                                            iZzB4 = zzerVar.zzB();
                                        } else {
                                            iZzB4 = 0;
                                        }
                                        jZzt = zzfj.zzt((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                        jArr[i19] = jZzt;
                                        int i54 = i47;
                                        if (zzaleVar2.zzq) {
                                            zzaknVar3 = zzaknVar2;
                                            jArr[i19] = jZzt + zzaknVar3.zzd.zzi;
                                        } else {
                                            zzaknVar3 = zzaknVar2;
                                        }
                                        iArr[i19] = iZzB2;
                                        if (((iZzB3 >> 16) & 1) != 0) {
                                            i20 = i19;
                                            z13 = false;
                                        } else if (!z12) {
                                            i20 = i19;
                                            z13 = true;
                                        } else if (i19 == 0) {
                                            z13 = true;
                                            i20 = 0;
                                        } else {
                                            i20 = i19;
                                            z13 = false;
                                        }
                                        zArr[i20] = z13;
                                        j13 += (long) iZzB;
                                        i19 = i20 + 1;
                                        zzaknVar2 = zzaknVar3;
                                        i47 = i54;
                                        i17 = i17;
                                        j12 = j12;
                                        i18 = i18;
                                        i45 = i45;
                                        z15 = z15;
                                        zArr = zArr;
                                    }
                                    int i55 = i18;
                                    zzaknVar = zzaknVar2;
                                    zzaleVar2.zzp = j13;
                                    i41 = i43;
                                    i42 = i55;
                                } else {
                                    i16 = i40;
                                    i33 = i33;
                                    zzfuVar3 = zzfuVar3;
                                    list = list5;
                                    zzaknVar = zzaknVar4;
                                }
                                i40 = i16 + 1;
                                zzaknVar4 = zzaknVar;
                                size4 = size4;
                                sparseArray4 = sparseArray4;
                                zzfuVar2 = zzfuVar2;
                                bArr4 = bArr4;
                                i33 = i33;
                                zzfuVar3 = zzfuVar3;
                                list5 = list;
                                i32 = i32;
                                i14 = 1953658222;
                            }
                            sparseArray = sparseArray4;
                            i10 = i32;
                            zzfuVar = zzfuVar2;
                            byte[] bArr5 = bArr4;
                            i12 = i33;
                            zzfu zzfuVar4 = zzfuVar3;
                            List list6 = list5;
                            zzalc zzalcVar3 = zzaknVar4.zzd.zza;
                            zzaki zzakiVar3 = zzaleVar2.zza;
                            zzakiVar3.getClass();
                            zzald zzaldVarZza = zzalcVar3.zza(zzakiVar3.zza);
                            zzfv zzfvVarZzc5 = zzfuVar4.zzc(1935763834);
                            if (zzfvVarZzc5 != null) {
                                zzaldVarZza.getClass();
                                int i56 = zzaldVarZza.zzd;
                                zzer zzerVar8 = zzfvVarZzc5.zza;
                                zzerVar8.zzh(8);
                                if ((zzerVar8.zzB() & 1) == 1) {
                                    zzerVar8.zzk(8);
                                }
                                int iZzs = zzerVar8.zzs();
                                int iZzH2 = zzerVar8.zzH();
                                int i57 = zzaleVar2.zze;
                                if (iZzH2 > i57) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i57).length());
                                    sb2.append("Saiz sample count ");
                                    sb2.append(iZzH2);
                                    sb2.append(" is greater than fragment sample count");
                                    sb2.append(i57);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                if (iZzs == 0) {
                                    boolean[] zArr2 = zzaleVar2.zzl;
                                    i15 = 0;
                                    for (int i58 = 0; i58 < iZzH2; i58++) {
                                        int iZzs2 = zzerVar8.zzs();
                                        i15 += iZzs2;
                                        zArr2[i58] = iZzs2 > i56;
                                    }
                                    z10 = false;
                                } else {
                                    boolean z16 = iZzs > i56;
                                    i15 = iZzs * iZzH2;
                                    z10 = false;
                                    Arrays.fill(zzaleVar2.zzl, 0, iZzH2, z16);
                                }
                                Arrays.fill(zzaleVar2.zzl, iZzH2, zzaleVar2.zze, z10);
                                if (i15 > 0) {
                                    zzaleVar2.zza(i15);
                                }
                            }
                            zzfv zzfvVarZzc6 = zzfuVar4.zzc(1935763823);
                            if (zzfvVarZzc6 != null) {
                                zzer zzerVar9 = zzfvVarZzc6.zza;
                                zzerVar9.zzh(8);
                                int iZzB8 = zzerVar9.zzB();
                                if ((iZzB8 & 1) == 1) {
                                    zzerVar9.zzk(8);
                                }
                                int iZzH3 = zzerVar9.zzH();
                                if (iZzH3 != 1) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                    sb3.append("Unexpected saio entry count: ");
                                    sb3.append(iZzH3);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                zzaleVar2.zzc += zzakh.zza(iZzB8) == 0 ? zzerVar9.zzz() : zzerVar9.zzJ();
                            }
                            zzfv zzfvVarZzc7 = zzfuVar4.zzc(1936027235);
                            if (zzfvVarZzc7 != null) {
                                zzl(zzfvVarZzc7.zza, 0, zzaleVar2);
                            }
                            String str2 = zzaldVarZza != null ? zzaldVarZza.zzb : null;
                            zzer zzerVar10 = null;
                            zzer zzerVar11 = null;
                            int i59 = 0;
                            while (i59 < list6.size()) {
                                List list7 = list6;
                                zzfv zzfvVar4 = (zzfv) list7.get(i59);
                                zzer zzerVar12 = zzfvVar4.zza;
                                int i60 = zzfvVar4.zzd;
                                if (i60 == 1935828848) {
                                    zzerVar12.zzh(12);
                                    if (zzerVar12.zzB() == 1936025959) {
                                        zzerVar10 = zzerVar12;
                                    }
                                } else if (i60 == 1936158820) {
                                    zzerVar12.zzh(12);
                                    if (zzerVar12.zzB() == 1936025959) {
                                        zzerVar11 = zzerVar12;
                                    }
                                }
                                i59++;
                                list6 = list7;
                            }
                            List list8 = list6;
                            if (zzerVar10 != null && zzerVar11 != null) {
                                zzerVar10.zzh(8);
                                int iZza = zzakh.zza(zzerVar10.zzB());
                                zzerVar10.zzk(4);
                                if (iZza == 1) {
                                    zzerVar10.zzk(4);
                                }
                                if (zzerVar10.zzB() != 1) {
                                    throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzerVar11.zzh(8);
                                int iZza2 = zzakh.zza(zzerVar11.zzB());
                                zzerVar11.zzk(4);
                                if (iZza2 == 1) {
                                    if (zzerVar11.zzz() == 0) {
                                        throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iZza2 >= 2) {
                                    zzerVar11.zzk(4);
                                }
                                if (zzerVar11.zzz() != 1) {
                                    throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzerVar11.zzk(1);
                                int iZzs3 = zzerVar11.zzs();
                                int i61 = (iZzs3 & 240) >> 4;
                                int i62 = iZzs3 & 15;
                                if (zzerVar11.zzs() == 1) {
                                    int iZzs4 = zzerVar11.zzs();
                                    byte[] bArr6 = new byte[16];
                                    zzerVar11.zzm(bArr6, 0, 16);
                                    if (iZzs4 == 0) {
                                        int iZzs5 = zzerVar11.zzs();
                                        byte[] bArr7 = new byte[iZzs5];
                                        zzerVar11.zzm(bArr7, 0, iZzs5);
                                        bArr3 = bArr7;
                                    } else {
                                        bArr3 = null;
                                    }
                                    zzaleVar2.zzk = true;
                                    zzaleVar2.zzm = new zzald(true, str2, iZzs4, bArr6, i61, i62, bArr3);
                                }
                            }
                            int size5 = list8.size();
                            int i63 = 0;
                            while (i63 < size5) {
                                zzfv zzfvVar5 = (zzfv) list8.get(i63);
                                if (zzfvVar5.zzd == 1970628964) {
                                    zzer zzerVar13 = zzfvVar5.zza;
                                    zzerVar13.zzh(8);
                                    bArr2 = bArr5;
                                    zzerVar13.zzm(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, zza)) {
                                        zzl(zzerVar13, 16, zzaleVar2);
                                    }
                                } else {
                                    bArr2 = bArr5;
                                }
                                i63++;
                                bArr5 = bArr2;
                            }
                            bArr = bArr5;
                        }
                        i13 = 8;
                    } else {
                        sparseArray = sparseArray4;
                        i10 = i32;
                        zzfuVar = zzfuVar2;
                        bArr = bArr4;
                        list4 = list4;
                        i11 = size3;
                        i12 = i33;
                        i13 = i23;
                    }
                    i33 = i12 + 1;
                    i23 = i13;
                    bArr4 = bArr;
                    list4 = list4;
                    size3 = i11;
                    sparseArray4 = sparseArray;
                    zzfuVar2 = zzfuVar;
                    i32 = i10;
                }
                SparseArray sparseArray5 = sparseArray4;
                zzq zzqVarZzn2 = zzn(zzfuVar2.zzb);
                if (zzqVarZzn2 != null) {
                    int size6 = sparseArray5.size();
                    for (int i64 = 0; i64 < size6; i64++) {
                        ((zzakn) sparseArray5.valueAt(i64)).zzb(zzqVarZzn2);
                    }
                }
                zzakoVar = this;
                if (zzakoVar.zzz != -9223372036854775807L) {
                    int size7 = sparseArray5.size();
                    for (int i65 = 0; i65 < size7; i65++) {
                        zzakn zzaknVar5 = (zzakn) sparseArray5.valueAt(i65);
                        long j18 = zzakoVar.zzz;
                        int i66 = zzaknVar5.zzf;
                        while (true) {
                            zzale zzaleVar3 = zzaknVar5.zzb;
                            if (i66 >= zzaleVar3.zze || zzaleVar3.zzi[i66] > j18) {
                                break;
                            }
                            if (zzaleVar3.zzj[i66]) {
                                zzaknVar5.zzi = i66;
                            }
                            i66++;
                        }
                    }
                    zzakoVar.zzz = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfu) arrayDeque.peek()).zzb(zzfuVar2);
            }
        }
        zzi();
    }

    private static int zzk(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i10, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i10 + 8);
        int iZzB = zzerVar.zzB();
        int i11 = zzakh.zza;
        int i12 = iZzB & ViewCompat.MEASURED_SIZE_MASK;
        if ((i12 & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (i12 & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i13 = zzaleVar.zze;
        if (iZzH != i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i13).length());
            sb2.append("Senc sample count ");
            sb2.append(iZzH);
            sb2.append(" is different from fragment sample count");
            sb2.append(i13);
            throw zzat.zzb(sb2.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, iZzH, z10);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzerVar.zzh(8);
        int iZza = zzakh.zza(zzerVar.zzB());
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar.zzz();
            jZzJ2 = zzerVar.zzz();
        } else {
            jZzJ = zzerVar.zzJ();
            jZzJ2 = zzerVar.zzJ();
        }
        long j11 = jZzJ;
        long j12 = j10 + jZzJ2;
        long jZzt = zzfj.zzt(j11, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar.zzk(2);
        int iZzt = zzerVar.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j13 = jZzt;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iZzt) {
            int iZzB = zzerVar.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jZzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i11 = iZzt;
            int[] iArr2 = iArr;
            long jZzt2 = zzfj.zzt(j15, 1000000L, jZzz, RoundingMode.DOWN);
            jArr5[i10] = jZzt2 - jArr4[i10];
            zzerVar.zzk(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr2 = jArr5;
            jArr = jArr;
            iZzt = i11;
            jArr3 = jArr4;
            j14 = j15;
            j13 = jZzt2;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i12 = 101;
            i10 = 1;
        } else {
            i10 = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i10);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i13 < this.zzK.length) {
            zzagh zzaghVarZzu = this.zzI.zzu(i12, 3);
            zzaghVarZzu.zzz((zzv) list.get(i13));
            this.zzK[i13] = zzaghVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x0223  */
    /* JADX WARN: Code duplicated, block: B:105:0x022b  */
    /* JADX WARN: Code duplicated, block: B:106:0x022f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0237  */
    /* JADX WARN: Code duplicated, block: B:111:0x0247  */
    /* JADX WARN: Code duplicated, block: B:112:0x024b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:120:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:125:0x0290  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:437:0x0261 A[EDGE_INSN: B:437:0x0261->B:115:0x0261 BREAK  A[LOOP:6: B:66:0x014c->B:68:0x0152], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x02be A[EDGE_INSN: B:438:0x02be->B:131:0x02be BREAK  A[LOOP:7: B:123:0x0288->B:441:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[LOOP:6: B:66:0x014c->B:68:0x0152, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:68:0x0152 A[LOOP:6: B:66:0x014c->B:68:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzakn zzaknVar;
        zzalc zzalcVar;
        zzagh zzaghVar;
        long jZzd;
        int i10;
        zzer zzerVar;
        byte[] bArrZzi;
        int i11;
        int i12;
        int i13;
        int iZza;
        int i14;
        zzgq zzgqVar;
        zzgq zzgqVar2;
        zzgq zzgqVar3;
        int iZzc;
        int iZzB;
        boolean z10;
        int iZzg;
        zzald zzaldVarZzj;
        zzagg zzaggVar;
        ArrayDeque arrayDeque;
        int i15;
        zzakm zzakmVar;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzi;
        long jZzt;
        long jZzt2;
        String str;
        String str2;
        long jZzz;
        long j11;
        while (true) {
            int i21 = this.zzs;
            if (i21 == 0) {
                if (this.zzv == 0) {
                    zzer zzerVar2 = this.zzm;
                    if (!zzaevVar.zzb(zzerVar2.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzafvVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzerVar2.zzh(0);
                    this.zzu = zzerVar2.zzz();
                    this.zzt = zzerVar2.zzB();
                }
                long j12 = this.zzu;
                if (j12 == 1) {
                    zzer zzerVar3 = this.zzm;
                    zzaevVar.zzc(zzerVar3.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzerVar3.zzJ();
                } else if (j12 == 0) {
                    long jZzo = zzaevVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque2 = this.zzn;
                        jZzo = !arrayDeque2.isEmpty() ? ((zzfu) arrayDeque2.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzaevVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j13 = this.zzu;
                int i22 = this.zzv;
                long j14 = i22;
                if (j13 < j14) {
                    if (this.zzt != 1718773093 || i22 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzu = j14;
                    j13 = j14;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzer zzerVar4 = this.zzk;
                        zzerVar4.zza((int) j13);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar4.zzi(), 0, 8);
                        zzaevVar.zzc(zzerVar4.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzaei) zzm(new zzfv(1936286840, zzerVar4).zza, zzaevVar.zzm()).second);
                    } else {
                        zzaevVar.zze((int) (j13 - j14), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzaevVar.zzn() - j14;
                    int i23 = this.zzt;
                    if ((i23 == 1836019558 || i23 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzafx(this.zzA, jZzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i24 = 0; i24 < size; i24++) {
                            zzale zzaleVar = ((zzakn) sparseArray.valueAt(i24)).zzb;
                            zzaleVar.zzc = jZzn;
                            zzaleVar.zzb = jZzn;
                        }
                    }
                    int i25 = this.zzt;
                    if (i25 == 1835295092) {
                        this.zzC = null;
                        this.zzx = jZzn + this.zzu;
                        this.zzs = 2;
                    } else if (i25 == 1836019574 || i25 == 1953653099 || i25 == 1835297121 || i25 == 1835626086 || i25 == 1937007212 || i25 == 1836019558 || i25 == 1953653094 || i25 == 1836475768 || i25 == 1701082227 || i25 == 1835365473) {
                        long jZzn2 = zzaevVar.zzn();
                        long j15 = this.zzu;
                        long j16 = jZzn2 + j15;
                        if (j15 != this.zzv && i25 == 1835365473) {
                            zzer zzerVar5 = this.zzk;
                            zzerVar5.zza(8);
                            zzaevVar.zzi(zzerVar5.zzi(), 0, 8);
                            zzakh.zzf(zzerVar5);
                            zzaevVar.zzf(zzerVar5.zzg());
                            zzaevVar.zzl();
                        }
                        long j17 = j16 - 8;
                        this.zzn.push(new zzfu(this.zzt, j17));
                        if (this.zzu == this.zzv) {
                            zzj(j17);
                        } else {
                            zzi();
                        }
                    } else if (i25 == 1751411826 || i25 == 1835296868 || i25 == 1836476516 || i25 == 1936286840 || i25 == 1937011556 || i25 == 1937011827 || i25 == 1668576371 || i25 == 1937011555 || i25 == 1937011578 || i25 == 1937013298 || i25 == 1937007471 || i25 == 1668232756 || i25 == 1937011571 || i25 == 1952867444 || i25 == 1952868452 || i25 == 1953196132 || i25 == 1953654136 || i25 == 1953658222 || i25 == 1886614376 || i25 == 1935763834 || i25 == 1935763823 || i25 == 1936027235 || i25 == 1970628964 || i25 == 1935828848 || i25 == 1936158820 || i25 == 1701606260 || i25 == 1835362404 || i25 == 1701671783 || i25 == 1969517665 || i25 == 1801812339 || i25 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzer zzerVar6 = new zzer((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar6.zzi(), 0, 8);
                        this.zzw = zzerVar6;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i21 != 1) {
                long j18 = Long.MAX_VALUE;
                if (i21 != 2) {
                    zzaknVar = this.zzC;
                    if (zzaknVar != null) {
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j19 = Long.MAX_VALUE;
                    zzakn zzaknVar2 = null;
                    for (int i26 = 0; i26 < size2; i26++) {
                        zzakn zzaknVar3 = (zzakn) sparseArray2.valueAt(i26);
                        if ((zzaknVar3.zzk() || zzaknVar3.zzf != zzaknVar3.zzd.zzb) && (!zzaknVar3.zzk() || zzaknVar3.zzh != zzaknVar3.zzb.zzd)) {
                            long jZze = zzaknVar3.zze();
                            if (jZze < j19) {
                                zzaknVar2 = zzaknVar3;
                                j19 = jZze;
                            }
                        }
                    }
                    if (zzaknVar2 != null) {
                        int iZze = (int) (zzaknVar2.zze() - zzaevVar.zzn());
                        if (iZze < 0) {
                            zzee.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzaevVar.zzf(iZze);
                        this.zzC = zzaknVar2;
                        zzaknVar = zzaknVar2;
                        break;
                    }
                    int iZzn = (int) (this.zzx - zzaevVar.zzn());
                    if (iZzn < 0) {
                        throw zzat.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzaevVar.zzf(iZzn);
                    zzi();
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzakn zzaknVar4 = null;
                    for (int i27 = 0; i27 < size3; i27++) {
                        zzale zzaleVar2 = ((zzakn) sparseArray3.valueAt(i27)).zzb;
                        if (zzaleVar2.zzo) {
                            long j20 = zzaleVar2.zzc;
                            if (j20 < j18) {
                                zzaknVar4 = (zzakn) sparseArray3.valueAt(i27);
                                j18 = j20;
                            }
                        }
                    }
                    if (zzaknVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn2 = (int) (j18 - zzaevVar.zzn());
                        if (iZzn2 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzaevVar.zzf(iZzn2);
                        zzale zzaleVar3 = zzaknVar4.zzb;
                        zzer zzerVar7 = zzaleVar3.zzn;
                        zzaevVar.zzc(zzerVar7.zzi(), 0, zzerVar7.zze());
                        zzerVar7.zzh(0);
                        zzaleVar3.zzo = false;
                    }
                }
            } else {
                long j21 = this.zzu - ((long) this.zzv);
                zzer zzerVar8 = this.zzw;
                int i28 = (int) j21;
                if (zzerVar8 != null) {
                    zzaevVar.zzc(zzerVar8.zzi(), 8, i28);
                    zzfv zzfvVar = new zzfv(this.zzt, zzerVar8);
                    ArrayDeque arrayDeque3 = this.zzn;
                    if (arrayDeque3.isEmpty()) {
                        int i29 = zzfvVar.zzd;
                        if (i29 == 1936286840) {
                            Pair pairZzm = zzm(zzfvVar.zza, zzaevVar.zzn());
                            this.zzq.zza((zzaei) pairZzm.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) pairZzm.first).longValue();
                                this.zzI.zzw((zzafy) pairZzm.second);
                                this.zzL = true;
                            }
                        } else if (i29 == 1701671783) {
                            zzer zzerVar9 = zzfvVar.zza;
                            if (this.zzJ.length != 0) {
                                zzerVar9.zzh(8);
                                int iZza2 = zzakh.zza(zzerVar9.zzB());
                                if (iZza2 == 0) {
                                    String strZzM = zzerVar9.zzM((char) 0);
                                    strZzM.getClass();
                                    String strZzM2 = zzerVar9.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz2 = zzerVar9.zzz();
                                    jZzt = zzfj.zzt(zzerVar9.zzz(), 1000000L, jZzz2, RoundingMode.DOWN);
                                    long j22 = this.zzB;
                                    long j23 = j22 != -9223372036854775807L ? j22 + jZzt : -9223372036854775807L;
                                    jZzt2 = zzfj.zzt(zzerVar9.zzz(), 1000L, jZzz2, RoundingMode.DOWN);
                                    str = strZzM;
                                    str2 = strZzM2;
                                    jZzz = zzerVar9.zzz();
                                    j11 = j23;
                                } else if (iZza2 != 1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZza2).length() + 35);
                                    sb2.append("Skipping unsupported emsg version: ");
                                    sb2.append(iZza2);
                                    zzee.zzc("FragmentedMp4Extractor", sb2.toString());
                                } else {
                                    long jZzz3 = zzerVar9.zzz();
                                    long jZzt3 = zzfj.zzt(zzerVar9.zzJ(), 1000000L, jZzz3, RoundingMode.DOWN);
                                    long jZzt4 = zzfj.zzt(zzerVar9.zzz(), 1000L, jZzz3, RoundingMode.DOWN);
                                    long jZzz4 = zzerVar9.zzz();
                                    String strZzM3 = zzerVar9.zzM((char) 0);
                                    strZzM3.getClass();
                                    String strZzM4 = zzerVar9.zzM((char) 0);
                                    strZzM4.getClass();
                                    jZzt2 = jZzt4;
                                    jZzz = jZzz4;
                                    str = strZzM3;
                                    str2 = strZzM4;
                                    j11 = jZzt3;
                                    jZzt = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzerVar9.zzd()];
                                zzerVar9.zzm(bArr, 0, zzerVar9.zzd());
                                zzer zzerVar10 = new zzer(this.zzl.zza(new zzahy(str, str2, jZzt2, jZzz, bArr)));
                                int iZzd = zzerVar10.zzd();
                                for (zzagh zzaghVar2 : this.zzJ) {
                                    zzerVar10.zzh(0);
                                    zzaghVar2.zzc(zzerVar10, iZzd);
                                }
                                if (j11 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakm(jZzt, true, iZzd));
                                    this.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque4 = this.zzo;
                                    if (arrayDeque4.isEmpty()) {
                                        for (zzagh zzaghVar3 : this.zzJ) {
                                            zzaghVar3.zze(j11, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque4.addLast(new zzakm(j11, false, iZzd));
                                        this.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfu) arrayDeque3.peek()).zza(zzfvVar);
                    }
                } else {
                    zzaevVar.zzf(i28);
                }
                zzj(zzaevVar.zzn());
            }
        }
        int i30 = 4;
        if (this.zzs == 3) {
            this.zzD = zzaknVar.zzf();
            String str3 = zzaknVar.zzd.zza.zzg.zzo;
            if (!Objects.equals(str3, "video/avc")) {
                Objects.equals(str3, "video/hevc");
            }
            this.zzG = true;
            if (zzaknVar.zzf < zzaknVar.zzi) {
                zzaevVar.zzf(this.zzD);
                zzald zzaldVarZzj2 = zzaknVar.zzj();
                if (zzaldVarZzj2 != null) {
                    zzale zzaleVar4 = zzaknVar.zzb;
                    zzer zzerVar11 = zzaleVar4.zzn;
                    int i31 = zzaldVarZzj2.zzd;
                    if (i31 != 0) {
                        zzerVar11.zzk(i31);
                    }
                    if (zzaleVar4.zzb(zzaknVar.zzf)) {
                        zzerVar11.zzk(zzerVar11.zzt() * 6);
                    }
                }
                if (!zzaknVar.zzh()) {
                    this.zzC = null;
                }
                i15 = 3;
            } else {
                if (zzaknVar.zzd.zza.zzh == 1) {
                    this.zzD -= 8;
                    zzaevVar.zzf(8);
                }
                if ("audio/ac4".equals(zzaknVar.zzd.zza.zzg.zzo)) {
                    this.zzE = zzaknVar.zzi(this.zzD, 7);
                    int i32 = this.zzD;
                    zzer zzerVar12 = this.zzk;
                    zzady.zzc(i32, zzerVar12);
                    zzaknVar.zza.zzc(zzerVar12, 7);
                    iZzi = this.zzE + 7;
                    this.zzE = iZzi;
                    i20 = 0;
                } else {
                    i20 = 0;
                    iZzi = zzaknVar.zzi(this.zzD, 0);
                    this.zzE = iZzi;
                }
                this.zzD += iZzi;
                this.zzs = 4;
                this.zzF = i20;
                zzalcVar = zzaknVar.zzd.zza;
                zzaghVar = zzaknVar.zza;
                jZzd = zzaknVar.zzd();
                i10 = zzalcVar.zzk;
                if (i10 == 0) {
                    while (true) {
                        i18 = this.zzE;
                        i19 = this.zzD;
                        if (i18 < i19) {
                            break;
                        }
                        this.zzE += zzaghVar.zza(zzaevVar, i19 - i18, false);
                    }
                } else {
                    zzerVar = this.zzh;
                    bArrZzi = zzerVar.zzi();
                    bArrZzi[0] = 0;
                    bArrZzi[1] = 0;
                    bArrZzi[2] = 0;
                    i11 = 4 - i10;
                    while (this.zzE < this.zzD) {
                        i12 = this.zzF;
                        if (i12 == 0) {
                            if (this.zzK.length <= 0 || !this.zzG) {
                                iZzc = zzgm.zzc(zzalcVar.zzg);
                                if (i10 + iZzc > this.zzD - this.zzE) {
                                    iZzc = 0;
                                }
                            } else {
                                iZzc = 0;
                            }
                            zzaevVar.zzc(bArrZzi, i11, i10 + iZzc);
                            zzerVar.zzh(0);
                            iZzB = zzerVar.zzB();
                            if (iZzB >= 0) {
                                throw zzat.zzb("Invalid NAL length", null);
                            }
                            this.zzF = iZzB - iZzc;
                            zzer zzerVar13 = this.zzg;
                            zzerVar13.zzh(0);
                            zzaghVar.zzc(zzerVar13, i30);
                            this.zzE += i30;
                            this.zzD += i11;
                            if (this.zzK.length > 0 || iZzc <= 0 || !zzgm.zzb(zzalcVar.zzg, bArrZzi[i30])) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            this.zzH = z10;
                            zzaghVar.zzc(zzerVar, iZzc);
                            this.zzE += iZzc;
                            if (iZzc <= 0 && !this.zzG && zzgm.zzd(bArrZzi, i30, iZzc, zzalcVar.zzg)) {
                                this.zzG = true;
                            }
                        } else {
                            if (this.zzH) {
                                zzer zzerVar14 = this.zzi;
                                zzerVar14.zza(i12);
                                zzaevVar.zzc(zzerVar14.zzi(), 0, this.zzF);
                                zzaghVar.zzc(zzerVar14, this.zzF);
                                iZza = this.zzF;
                                int iZza3 = zzgm.zza(zzerVar14.zzi(), zzerVar14.zze());
                                zzerVar14.zzh(0);
                                zzerVar14.zzf(iZza3);
                                i14 = zzalcVar.zzg.zzq;
                                if (i14 == -1) {
                                    zzgqVar3 = this.zzp;
                                    if (zzgqVar3.zzb() != 0) {
                                        zzgqVar3.zza(0);
                                    }
                                } else {
                                    zzgqVar = this.zzp;
                                    if (zzgqVar.zzb() != i14) {
                                        zzgqVar.zza(i14);
                                    }
                                }
                                zzgqVar2 = this.zzp;
                                zzgqVar2.zzc(jZzd, zzerVar14);
                                i13 = 4;
                                if ((zzaknVar.zzg() & 4) != 0) {
                                    zzgqVar2.zze();
                                }
                            } else {
                                i13 = i30;
                                iZza = zzaghVar.zza(zzaevVar, i12, false);
                            }
                            this.zzE += iZza;
                            this.zzF -= iZza;
                            i30 = i13;
                        }
                    }
                }
                iZzg = zzaknVar.zzg();
                if (!this.zzG) {
                    iZzg |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                int i33 = iZzg;
                zzaldVarZzj = zzaknVar.zzj();
                if (zzaldVarZzj != null) {
                    zzaggVar = zzaldVarZzj.zzc;
                } else {
                    zzaggVar = null;
                }
                zzaghVar.zze(jZzd, i33, this.zzD, 0, zzaggVar);
                while (true) {
                    arrayDeque = this.zzo;
                    if (!arrayDeque.isEmpty()) {
                        break;
                    }
                    zzakmVar = (zzakm) arrayDeque.removeFirst();
                    int i34 = this.zzy;
                    i16 = zzakmVar.zzc;
                    this.zzy = i34 - i16;
                    j10 = zzakmVar.zza;
                    if (zzakmVar.zzb) {
                        j10 += jZzd;
                    }
                    for (zzagh zzaghVar4 : this.zzJ) {
                        zzaghVar4.zze(j10, 1, i16, this.zzy, null);
                    }
                }
                if (!zzaknVar.zzh()) {
                    this.zzC = null;
                }
                i15 = 3;
            }
        } else {
            zzalcVar = zzaknVar.zzd.zza;
            zzaghVar = zzaknVar.zza;
            jZzd = zzaknVar.zzd();
            i10 = zzalcVar.zzk;
            if (i10 == 0) {
                while (true) {
                    i18 = this.zzE;
                    i19 = this.zzD;
                    if (i18 < i19) {
                        break;
                        break;
                    }
                    this.zzE += zzaghVar.zza(zzaevVar, i19 - i18, false);
                }
            } else {
                zzerVar = this.zzh;
                bArrZzi = zzerVar.zzi();
                bArrZzi[0] = 0;
                bArrZzi[1] = 0;
                bArrZzi[2] = 0;
                i11 = 4 - i10;
                while (this.zzE < this.zzD) {
                    i12 = this.zzF;
                    if (i12 == 0) {
                        if (this.zzK.length <= 0) {
                            iZzc = zzgm.zzc(zzalcVar.zzg);
                            if (i10 + iZzc > this.zzD - this.zzE) {
                                iZzc = 0;
                            }
                        } else {
                            iZzc = zzgm.zzc(zzalcVar.zzg);
                            if (i10 + iZzc > this.zzD - this.zzE) {
                                iZzc = 0;
                            }
                        }
                        zzaevVar.zzc(bArrZzi, i11, i10 + iZzc);
                        zzerVar.zzh(0);
                        iZzB = zzerVar.zzB();
                        if (iZzB >= 0) {
                            throw zzat.zzb("Invalid NAL length", null);
                        }
                        this.zzF = iZzB - iZzc;
                        zzer zzerVar15 = this.zzg;
                        zzerVar15.zzh(0);
                        zzaghVar.zzc(zzerVar15, i30);
                        this.zzE += i30;
                        this.zzD += i11;
                        if (this.zzK.length > 0) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        this.zzH = z10;
                        zzaghVar.zzc(zzerVar, iZzc);
                        this.zzE += iZzc;
                        if (iZzc <= 0) {
                        }
                    } else {
                        if (this.zzH) {
                            zzer zzerVar16 = this.zzi;
                            zzerVar16.zza(i12);
                            zzaevVar.zzc(zzerVar16.zzi(), 0, this.zzF);
                            zzaghVar.zzc(zzerVar16, this.zzF);
                            iZza = this.zzF;
                            int iZza4 = zzgm.zza(zzerVar16.zzi(), zzerVar16.zze());
                            zzerVar16.zzh(0);
                            zzerVar16.zzf(iZza4);
                            i14 = zzalcVar.zzg.zzq;
                            if (i14 == -1) {
                                zzgqVar3 = this.zzp;
                                if (zzgqVar3.zzb() != 0) {
                                    zzgqVar3.zza(0);
                                }
                            } else {
                                zzgqVar = this.zzp;
                                if (zzgqVar.zzb() != i14) {
                                    zzgqVar.zza(i14);
                                }
                            }
                            zzgqVar2 = this.zzp;
                            zzgqVar2.zzc(jZzd, zzerVar16);
                            i13 = 4;
                            if ((zzaknVar.zzg() & 4) != 0) {
                                zzgqVar2.zze();
                            }
                        } else {
                            i13 = i30;
                            iZza = zzaghVar.zza(zzaevVar, i12, false);
                        }
                        this.zzE += iZza;
                        this.zzF -= iZza;
                        i30 = i13;
                    }
                }
            }
            iZzg = zzaknVar.zzg();
            if (!this.zzG) {
                iZzg |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            int i35 = iZzg;
            zzaldVarZzj = zzaknVar.zzj();
            if (zzaldVarZzj != null) {
                zzaggVar = zzaldVarZzj.zzc;
            } else {
                zzaggVar = null;
            }
            zzaghVar.zze(jZzd, i35, this.zzD, 0, zzaggVar);
            while (true) {
                arrayDeque = this.zzo;
                if (!arrayDeque.isEmpty()) {
                    break;
                    break;
                }
                zzakmVar = (zzakm) arrayDeque.removeFirst();
                int i36 = this.zzy;
                i16 = zzakmVar.zzc;
                this.zzy = i36 - i16;
                j10 = zzakmVar.zza;
                if (zzakmVar.zzb) {
                    j10 += jZzd;
                }
                while (i17 < r3) {
                    zzaghVar4.zze(j10, 1, i16, this.zzy, null);
                }
            }
            if (!zzaknVar.zzh()) {
                this.zzC = null;
            }
            i15 = 3;
        }
        this.zzs = i15;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzakn) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        zzi();
    }

    public final /* synthetic */ void zzh(long j10, zzer zzerVar) {
        zzaeh.zza(j10, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i10, @Nullable zzfg zzfgVar, @Nullable zzalc zzalcVar, List list, @Nullable zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j10, zzer zzerVar) {
                this.zza.zzh(j10, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }

    @Nullable
    private static zzq zzn(List list) {
        int i10;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzaky zzakyVar;
        UUID uuid;
        int size = list.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size) {
            zzfv zzfvVar = (zzfv) list.get(i11);
            if (zzfvVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzi = zzfvVar.zza.zzi();
                zzer zzerVar = new zzer(bArrZzi);
                if (zzerVar.zze() < 32) {
                    i10 = i11;
                    arrayList = arrayList2;
                    zzakyVar = null;
                } else {
                    zzerVar.zzh(0);
                    int iZzd = zzerVar.zzd();
                    int iZzB = zzerVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb2.append("Advertised atom size (");
                        sb2.append(iZzB);
                        sb2.append(") does not match buffer size: ");
                        sb2.append(iZzd);
                        zzee.zzc("PsshAtomUtil", sb2.toString());
                    } else {
                        int iZzB2 = zzerVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb3.append("Atom type is not pssh: ");
                            sb3.append(iZzB2);
                            zzee.zzc("PsshAtomUtil", sb3.toString());
                        } else {
                            int iZza = zzakh.zza(zzerVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb4.append("Unsupported pssh version: ");
                                sb4.append(iZza);
                                zzee.zzc("PsshAtomUtil", sb4.toString());
                            } else {
                                UUID uuid2 = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzerVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i12 = 0;
                                    while (i12 < iZzH) {
                                        uuidArr[i12] = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                        i12++;
                                        i11 = i11;
                                        arrayList2 = arrayList2;
                                    }
                                    i10 = i11;
                                    arrayList = arrayList2;
                                } else {
                                    i10 = i11;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzH2 = zzerVar.zzH();
                                int iZzd2 = zzerVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb5.append("Atom data size (");
                                    sb5.append(iZzH2);
                                    sb5.append(") does not match the bytes left: ");
                                    sb5.append(iZzd2);
                                    zzee.zzc("PsshAtomUtil", sb5.toString());
                                    zzakyVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzerVar.zzm(bArr, 0, iZzH2);
                                    zzakyVar = new zzaky(uuid2, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i10 = i11;
                    arrayList = arrayList2;
                    zzakyVar = null;
                }
                if (zzakyVar == null) {
                    uuid = null;
                } else {
                    uuid = zzakyVar.zza;
                }
                if (uuid == null) {
                    zzee.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new zzp(uuid, null, "video/mp4", bArrZzi));
                }
                i11 = i10 + 1;
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzq(arrayList2);
    }

    private static final zzaki zzo(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i10);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzguf zzgufVarZzi;
        zzagc zzagcVarZza = zzalb.zza(zzaevVar);
        if (zzagcVarZza != null) {
            zzgufVarZzi = zzguf.zzj(zzagcVarZza);
        } else {
            zzgufVarZzi = zzguf.zzi();
        }
        this.zzr = zzgufVarZzi;
        if (zzagcVarZza == null) {
            return true;
        }
        return false;
    }
}
