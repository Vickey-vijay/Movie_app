package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    /* JADX WARN: Code duplicated, block: B:445:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgj zzf(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        zzgi zzgiVar;
        boolean z10;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        int i14;
        int i15;
        boolean[][] zArr;
        int i16;
        int i17;
        zzgc zzgcVar;
        int[] iArr;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zZze;
        int i20;
        int i21;
        int i22;
        int iZzg;
        int i23;
        int i24;
        int i25;
        zzgn zzgnVar = new zzgn(bArr, i10, i11);
        zzga zzgaVarZzl = zzl(zzgnVar);
        zzgnVar.zzb(4);
        boolean zZze2 = zzgnVar.zze();
        boolean zZze3 = zzgnVar.zze();
        int iZzf5 = zzgnVar.zzf(6) + 1;
        int iZzf6 = zzgnVar.zzf(3);
        zzgnVar.zzb(17);
        zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf6, null);
        int i26 = 0;
        for (int i27 = true != zzgnVar.zze() ? iZzf6 : 0; i27 <= iZzf6; i27++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zzg();
        }
        int iZzf7 = zzgnVar.zzf(6);
        int iZzg2 = zzgnVar.zzg() + 1;
        zzgc zzgcVar2 = new zzgc(zzguf.zzj(zzgbVarZzm), new int[1]);
        boolean z14 = iZzf5 >= 2 && iZzg2 >= 2;
        boolean z15 = zZze2 && zZze3;
        int i28 = iZzf7 + 1;
        if (!z14 || !z15 || i28 < iZzf5) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzg2, i28);
        int[] iArr3 = new int[iZzg2];
        int[] iArr4 = new int[iZzg2];
        iArr2[0][0] = 0;
        iArr3[0] = 1;
        iArr4[0] = 0;
        for (int i29 = 1; i29 < iZzg2; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= iZzf7; i31++) {
                if (zzgnVar.zze()) {
                    iArr2[i29][i30] = i31;
                    iArr4[i29] = i31;
                    i30++;
                }
                iArr3[i29] = i30;
            }
        }
        int i32 = 8;
        if (zzgnVar.zze()) {
            zzgnVar.zzb(64);
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
            }
            int iZzg3 = zzgnVar.zzg();
            while (i26 < iZzg3) {
                zzgnVar.zzg();
                if (i26 == 0 || zzgnVar.zze()) {
                    boolean zZze4 = zzgnVar.zze();
                    boolean zZze5 = zzgnVar.zze();
                    if (zZze4 || zZze5) {
                        z12 = zZze4;
                        z13 = zZze5;
                        zZze = zzgnVar.zze();
                        if (zZze) {
                            zzgnVar.zzb(19);
                        }
                        zzgnVar.zzb(i32);
                        if (zZze) {
                            zzgnVar.zzb(4);
                        }
                        zzgnVar.zzb(15);
                        i21 = zZze4;
                        i20 = zZze5;
                    }
                    i22 = 0;
                    while (i22 <= iZzf6) {
                        if (!zzgnVar.zze() || zzgnVar.zze()) {
                            zzgnVar.zzg();
                        } else {
                            if (zzgnVar.zze()) {
                                iZzg = 0;
                            }
                            i23 = i21 + i20;
                            int[] iArr5 = iArr4;
                            i24 = 0;
                            while (i24 < i23) {
                                int i33 = i23;
                                for (i25 = 0; i25 <= iZzg; i25++) {
                                    zzgnVar.zzg();
                                    zzgnVar.zzg();
                                    if (zZze) {
                                        zzgnVar.zzg();
                                        zzgnVar.zzg();
                                    }
                                    zzgnVar.zza();
                                }
                                i24++;
                                i23 = i33;
                            }
                            i22++;
                            iZzg3 = iZzg3;
                            iArr4 = iArr5;
                        }
                        iZzg = zzgnVar.zzg();
                        i23 = i21 + i20;
                        int[] iArr6 = iArr4;
                        i24 = 0;
                        while (i24 < i23) {
                            int i34 = i23;
                            while (i25 <= iZzg) {
                                zzgnVar.zzg();
                                zzgnVar.zzg();
                                if (zZze) {
                                    zzgnVar.zzg();
                                    zzgnVar.zzg();
                                }
                                zzgnVar.zza();
                            }
                            i24++;
                            i23 = i34;
                        }
                        i22++;
                        iZzg3 = iZzg3;
                        iArr4 = iArr6;
                    }
                    i26++;
                    i32 = 8;
                } else {
                    z12 = false;
                    z13 = false;
                }
                zZze = false;
                i21 = z12;
                i20 = z13;
                i22 = 0;
                while (i22 <= iZzf6) {
                    if (zzgnVar.zze()) {
                        zzgnVar.zzg();
                        iZzg = zzgnVar.zzg();
                    } else {
                        zzgnVar.zzg();
                        iZzg = zzgnVar.zzg();
                    }
                    i23 = i21 + i20;
                    int[] iArr7 = iArr4;
                    i24 = 0;
                    while (i24 < i23) {
                        int i35 = i23;
                        while (i25 <= iZzg) {
                            zzgnVar.zzg();
                            zzgnVar.zzg();
                            if (zZze) {
                                zzgnVar.zzg();
                                zzgnVar.zzg();
                            }
                            zzgnVar.zza();
                        }
                        i24++;
                        i23 = i35;
                    }
                    i22++;
                    iZzg3 = iZzg3;
                    iArr4 = iArr7;
                }
                i26++;
                i32 = 8;
            }
        }
        int[] iArr8 = iArr4;
        if (!zzgnVar.zze()) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        zzgnVar.zzc();
        zzgb zzgbVarZzm2 = zzm(zzgnVar, false, iZzf6, zzgbVarZzm);
        boolean zZze6 = zzgnVar.zze();
        boolean[] zArr2 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean zZze7 = zzgnVar.zze();
            zArr2[i37] = zZze7;
            if (zZze7) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr2[1]) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int i38 = i36 + 1;
        int[] iArr9 = new int[i36];
        for (int i39 = 0; i39 < i36 - (zZze6 ? 1 : 0); i39++) {
            iArr9[i39] = zzgnVar.zzf(3);
        }
        int[] iArr10 = new int[i38];
        if (zZze6) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr10[i40] = iArr10[i40] + iArr9[i41] + 1;
                }
            }
            iArr10[i36] = 6;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzf5, i36);
        int[] iArr12 = new int[iZzf5];
        iArr12[0] = 0;
        boolean zZze8 = zzgnVar.zze();
        int i42 = 1;
        while (i42 < iZzf5) {
            if (zZze8) {
                iArr12[i42] = zzgnVar.zzf(6);
            } else {
                iArr12[i42] = i42;
            }
            if (zZze6) {
                z11 = zZze6 ? 1 : 0;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = i43 + 1;
                    iArr11[i42][i43] = (iArr12[i42] & ((1 << iArr10[i44]) - 1)) >> iArr10[i43];
                    i43 = i44;
                }
            } else {
                int i45 = 0;
                while (i45 < i36) {
                    iArr11[i42][i45] = zzgnVar.zzf(iArr9[i45] + 1);
                    i45++;
                    zZze6 = zZze6 ? 1 : 0;
                }
                z11 = zZze6;
            }
            i42++;
            zZze6 = z11;
        }
        int[] iArr13 = new int[i28];
        int i46 = 1;
        for (int i47 = 0; i47 < iZzf5; i47++) {
            iArr13[iArr12[i47]] = -1;
            int i48 = 0;
            int i49 = 0;
            while (i48 < 16) {
                if (zArr2[i48]) {
                    i18 = 1;
                    if (i48 == 1) {
                        iArr13[iArr12[i47]] = iArr11[i47][i49];
                        i19 = 1;
                    } else {
                        i19 = i48;
                    }
                    i49++;
                    i48 = i19;
                } else {
                    i18 = 1;
                }
                i48 += i18;
            }
            if (i47 > 0) {
                int i50 = 0;
                while (true) {
                    if (i50 >= i47) {
                        i46++;
                        break;
                    }
                    if (iArr13[iArr12[i47]] == iArr13[iArr12[i50]]) {
                        break;
                    }
                    i50++;
                }
            }
        }
        int iZzf8 = zzgnVar.zzf(4);
        if (i46 < 2 || iZzf8 == 0) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int[] iArr14 = new int[i46];
        for (int i51 = 0; i51 < i46; i51++) {
            iArr14[i51] = zzgnVar.zzf(iZzf8);
        }
        int[] iArr15 = new int[i28];
        for (int i52 = 0; i52 < iZzf5; i52++) {
            iArr15[Math.min(iArr12[i52], iZzf7)] = i52;
        }
        zzguc zzgucVar = new zzguc();
        int i53 = 0;
        while (i53 <= iZzf7) {
            int[] iArr16 = iArr13;
            int iMin = Math.min(iArr13[i53], i46 - 1);
            zzgucVar.zzf(new zzfz(iArr15[i53], iMin >= 0 ? iArr14[iMin] : -1));
            i53++;
            iArr13 = iArr16;
        }
        zzguf zzgufVarZzi = zzgucVar.zzi();
        if (((zzfz) zzgufVarZzi.get(0)).zzb == -1) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int i54 = 1;
        while (true) {
            if (i54 > iZzf7) {
                i12 = -1;
                i54 = -1;
                break;
            }
            i12 = -1;
            if (((zzfz) zzgufVarZzi.get(i54)).zzb != -1) {
                break;
            }
            i54++;
        }
        if (i54 == i12) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls, iZzf5, iZzf5);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, iZzf5, iZzf5);
        for (int i55 = 1; i55 < iZzf5; i55++) {
            for (int i56 = 0; i56 < i55; i56++) {
                boolean[] zArr5 = zArr3[i55];
                boolean[] zArr6 = zArr4[i55];
                boolean zZze9 = zzgnVar.zze();
                zArr6[i56] = zZze9;
                zArr5[i56] = zZze9;
            }
        }
        for (int i57 = 1; i57 < iZzf5; i57++) {
            int i58 = iZzf5 - 1;
            for (int i59 = 0; i59 < i58; i59++) {
                for (int i60 = 0; i60 < i57; i60++) {
                    boolean[] zArr7 = zArr4[i57];
                    if (zArr7[i60] && zArr4[i60][i59]) {
                        zArr7[i59] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr17 = new int[i28];
        for (int i61 = 0; i61 < iZzf5; i61++) {
            int i62 = 0;
            for (int i63 = 0; i63 < i61; i63++) {
                i62 += zArr3[i61][i63] ? 1 : 0;
            }
            iArr17[iArr12[i61]] = i62;
        }
        int i64 = 0;
        for (int i65 = 0; i65 < iZzf5; i65++) {
            if (iArr17[iArr12[i65]] == 0) {
                i64++;
            }
        }
        if (i64 > 1) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int[] iArr18 = new int[iZzf5];
        int[] iArr19 = new int[iZzg2];
        if (zzgnVar.zze()) {
            for (int i66 = 0; i66 < iZzf5; i66++) {
                iArr18[i66] = zzgnVar.zzf(3);
            }
            i13 = iZzf6;
        } else {
            i13 = iZzf6;
            Arrays.fill(iArr18, 0, iZzf5, i13);
        }
        int i67 = 0;
        while (i67 < iZzg2) {
            boolean[][] zArr8 = zArr4;
            int[] iArr20 = iArr17;
            int[] iArr21 = iArr12;
            int iMax = 0;
            for (int i68 = 0; i68 < iArr3[i67]; i68++) {
                iMax = Math.max(iMax, iArr18[((zzfz) zzgufVarZzi.get(iArr2[i67][i68])).zza]);
            }
            iArr19[i67] = iMax + 1;
            i67++;
            zArr4 = zArr8;
            iArr12 = iArr21;
            iArr17 = iArr20;
        }
        boolean[][] zArr9 = zArr4;
        int[] iArr22 = iArr17;
        int[] iArr23 = iArr12;
        if (zzgnVar.zze()) {
            int i69 = 0;
            while (i69 < iZzf5 - 1) {
                int i70 = i69 + 1;
                for (int i71 = i70; i71 < iZzf5; i71++) {
                    if (zArr3[i71][i69]) {
                        zzgnVar.zzb(3);
                    }
                }
                i69 = i70;
            }
        }
        zzgnVar.zza();
        int iZzg4 = zzgnVar.zzg() + 1;
        zzguc zzgucVar2 = new zzguc();
        zzgucVar2.zzf(zzgbVarZzm);
        if (iZzg4 > 1) {
            zzgucVar2.zzf(zzgbVarZzm2);
            zzgb zzgbVarZzm3 = zzgbVarZzm2;
            for (int i72 = 2; i72 < iZzg4; i72++) {
                zzgbVarZzm3 = zzm(zzgnVar, zzgnVar.zze(), i13, zzgbVarZzm3);
                zzgucVar2.zzf(zzgbVarZzm3);
            }
        }
        zzguf zzgufVarZzi2 = zzgucVar2.zzi();
        int iZzg5 = zzgnVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzgj(zzgaVarZzl, null, zzgcVar2, null, null);
        }
        int iZzf9 = zzgnVar.zzf(2);
        boolean[][] zArr10 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzg5, i28);
        int[] iArr24 = new int[iZzg5];
        int[] iArr25 = new int[iZzg5];
        int i73 = 0;
        while (i73 < iZzg2) {
            int i74 = iZzg2;
            iArr24[i73] = 0;
            int i75 = iArr8[i73];
            iArr25[i73] = i75;
            if (iZzf9 == 0) {
                iArr = iArr19;
                i17 = iZzf5;
                zzgcVar = zzgcVar2;
                Arrays.fill(zArr10[i73], 0, iArr3[i73], true);
                iArr24[i73] = iArr3[i73];
            } else {
                i17 = iZzf5;
                zzgcVar = zzgcVar2;
                iArr = iArr19;
                if (iZzf9 == 1) {
                    for (int i76 = 0; i76 < iArr3[i73]; i76++) {
                        zArr10[i73][i76] = iArr2[i73][i76] == i75;
                    }
                    iArr24[i73] = 1;
                } else {
                    zArr10[0][0] = true;
                    iArr24[0] = 1;
                }
                i73++;
                iZzg2 = i74;
                iArr19 = iArr;
                iZzf5 = i17;
                zzgcVar2 = zzgcVar;
            }
            i73++;
            iZzg2 = i74;
            iArr19 = iArr;
            iZzf5 = i17;
            zzgcVar2 = zzgcVar;
        }
        int i77 = iZzf5;
        zzgc zzgcVar3 = zzgcVar2;
        int[] iArr26 = iArr19;
        int i78 = iZzg2;
        int[] iArr27 = new int[i28];
        int i79 = 2;
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzg5, i28);
        int i80 = 0;
        int i81 = 1;
        while (i81 < iZzg5) {
            if (iZzf9 == i79) {
                for (int i82 = 0; i82 < iArr3[i81]; i82++) {
                    zArr10[i81][i82] = zzgnVar.zze();
                    int i83 = iArr24[i81];
                    boolean z16 = zArr10[i81][i82];
                    iArr24[i81] = i83 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr25[i81] = iArr2[i81][i82];
                    }
                }
            }
            if (i80 == 0) {
                if (iArr2[i81][0] == 0 && zArr10[i81][0]) {
                    i80 = 0;
                    for (int i84 = 1; i84 < iArr3[i81]; i84++) {
                        if (iArr2[i81][i84] == i54 && zArr10[i81][i54]) {
                            i80 = i81;
                        }
                    }
                } else {
                    i80 = 0;
                }
            }
            int i85 = 0;
            while (i85 < iArr3[i81]) {
                if (iZzg4 > 1) {
                    zArr11[i81][i85] = zArr10[i81][i85];
                    zArr = zArr10;
                    i16 = iZzf9;
                    i14 = i54;
                    int iZzc = zzgxp.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr11[i81][i85]) {
                        i15 = iZzg4;
                        break;
                    }
                    int i86 = ((zzfz) zzgufVarZzi.get(iArr2[i81][i85])).zza;
                    int i87 = 0;
                    while (true) {
                        if (i87 >= i85) {
                            i15 = iZzg4;
                            break;
                        }
                        i15 = iZzg4;
                        if (zArr9[i86][((zzfz) zzgufVarZzi.get(iArr2[i81][i87])).zza]) {
                            zArr11[i81][i85] = true;
                            break;
                        }
                        i87++;
                        iZzg4 = i15;
                    }
                    if (zArr11[i81][i85]) {
                        if (i80 <= 0 || i81 != i80) {
                            zzgnVar.zzb(iZzc);
                        } else {
                            iArr27[i85] = zzgnVar.zzf(iZzc);
                        }
                    }
                } else {
                    i14 = i54;
                    i15 = iZzg4;
                    zArr = zArr10;
                    i16 = iZzf9;
                }
                i85++;
                iZzf9 = i16;
                zArr10 = zArr;
                i54 = i14;
                iZzg4 = i15;
            }
            int i88 = i54;
            int i89 = iZzg4;
            boolean[][] zArr12 = zArr10;
            int i90 = iZzf9;
            if (iArr24[i81] == 1 && iArr22[iArr25[i81]] > 0) {
                zzgnVar.zza();
            }
            i81++;
            iZzf9 = i90;
            zArr10 = zArr12;
            i54 = i88;
            iZzg4 = i89;
            i79 = 2;
        }
        if (i80 == 0) {
            return new zzgj(zzgaVarZzl, null, zzgcVar3, null, null);
        }
        int iZzg6 = zzgnVar.zzg() + 1;
        zzguc zzgucVarZzv = zzguf.zzv(iZzg6);
        int[] iArr28 = new int[i77];
        int i91 = 0;
        while (i91 < iZzg6) {
            int iZzf10 = zzgnVar.zzf(16);
            int iZzf11 = zzgnVar.zzf(16);
            if (zzgnVar.zze()) {
                iZzf2 = zzgnVar.zzf(2);
                if (iZzf2 == 3) {
                    zzgnVar.zza();
                }
                iZzf3 = zzgnVar.zzf(4);
                iZzf4 = zzgnVar.zzf(4);
            } else {
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzgnVar.zze()) {
                int iZzg7 = zzgnVar.zzg();
                int iZzg8 = zzgnVar.zzg();
                int iZzg9 = zzgnVar.zzg();
                int iZzg10 = zzgnVar.zzg();
                iZzf10 = zzn(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzo(iZzf11, iZzf2, iZzg9, iZzg10);
            }
            zzgucVarZzv.zzf(new zzgd(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i91++;
            zzgufVarZzi = zzgufVarZzi;
            zzgaVarZzl = zzgaVarZzl;
        }
        zzga zzgaVar = zzgaVarZzl;
        zzguf zzgufVar = zzgufVarZzi;
        if (iZzg6 <= 1 || !zzgnVar.zze()) {
            for (int i92 = 1; i92 < i77; i92++) {
                iArr28[i92] = Math.min(i92, iZzg6 - 1);
            }
        } else {
            int iZzc2 = zzgxp.zzc(iZzg6, RoundingMode.CEILING);
            for (int i93 = 1; i93 < i77; i93++) {
                iArr28[i93] = zzgnVar.zzf(iZzc2);
            }
        }
        zzge zzgeVar = new zzge(zzgucVarZzv.zzi(), iArr28);
        zzgnVar.zzb(2);
        for (int i94 = 1; i94 < i77; i94++) {
            if (iArr22[iArr23[i94]] == 0) {
                zzgnVar.zza();
            }
        }
        for (int i95 = 1; i95 < iZzg5; i95++) {
            boolean zZze10 = zzgnVar.zze();
            int i96 = 0;
            while (i96 < iArr26[i95]) {
                if ((i96 <= 0 || !zZze10) ? i96 == 0 : zzgnVar.zze()) {
                    for (int i97 = 0; i97 < iArr3[i95]; i97++) {
                        if (zArr11[i95][i97]) {
                            zzgnVar.zzg();
                        }
                    }
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                i96++;
            }
        }
        int iZzg11 = zzgnVar.zzg() + 2;
        if (zzgnVar.zze()) {
            zzgnVar.zzb(iZzg11);
        } else {
            for (int i98 = 1; i98 < i77; i98++) {
                for (int i99 = 0; i99 < i98; i99++) {
                    if (zArr3[i98][i99]) {
                        zzgnVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzgnVar.zzg();
        for (int i100 = 1; i100 <= iZzg12; i100++) {
            zzgnVar.zzb(8);
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzc();
            if (zzgnVar.zze() || zzgnVar.zze()) {
                zzgnVar.zza();
            }
            boolean zZze11 = zzgnVar.zze();
            boolean zZze12 = zzgnVar.zze();
            if (zZze11 || zZze12) {
                for (int i101 = 0; i101 < i78; i101++) {
                    for (int i102 = 0; i102 < iArr26[i101]; i102++) {
                        boolean zZze13 = zZze11 ? zzgnVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzgnVar.zze() : false;
                        if (zZze13) {
                            zzgnVar.zzb(32);
                        }
                        if (zZze14) {
                            zzgnVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzgnVar.zze();
            if (zZze15) {
                z10 = true;
                iZzf = zzgnVar.zzf(4) + 1;
            } else {
                z10 = true;
                iZzf = i77;
            }
            zzguc zzgucVarZzv2 = zzguf.zzv(iZzf);
            int[] iArr29 = new int[i77];
            int i103 = 0;
            while (i103 < iZzf) {
                zzgnVar.zzb(3);
                int i104 = z10 != zzgnVar.zze() ? 2 : 1;
                int iZzb = zzi.zzb(zzgnVar.zzf(8));
                int iZzc3 = zzi.zzc(zzgnVar.zzf(8));
                zzgnVar.zzb(8);
                zzgucVarZzv2.zzf(new zzgh(iZzb, i104, iZzc3));
                i103++;
                z10 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i105 = 0; i105 < i77; i105++) {
                    iArr29[i105] = zzgnVar.zzf(4);
                }
            }
            zzgiVar = new zzgi(zzgucVarZzv2.zzi(), iArr29);
        } else {
            zzgiVar = null;
        }
        return new zzgj(zzgaVar, zzgufVar, new zzgc(zzgufVarZzi2, iArr27), zzgeVar, zzgiVar);
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    public static String zzk(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i12, length2, zArr);
                    if (iZzi != length2) {
                        zzgucVar.zzf(Integer.valueOf(iZzi));
                    }
                    i12 = iZzi + 3;
                }
                zzguf zzgufVarZzi = zzgucVar.zzi();
                for (int i13 = 0; i13 < zzgufVarZzi.size(); i13++) {
                    if (((Integer) zzgufVarZzi.get(i13)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzgufVarZzi.get(i13)).intValue() + 3, length);
                        zzga zzgaVarZzl = zzl(zzgnVar);
                        if (zzgaVarZzl.zza == 33 && zzgaVarZzl.zzb == 0) {
                            zzgnVar.zzb(4);
                            int iZzf = zzgnVar.zzf(3);
                            zzgnVar.zza();
                            zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
                            return zzdo.zzb(zzgbVarZzm.zza, zzgbVarZzm.zzb, zzgbVarZzm.zzc, zzgbVarZzm.zzd, zzgbVarZzm.zze, zzgbVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static int zzn(int i10, int i11, int i12, int i13) {
        return i10 - (((i11 == 1 || i11 == 2) ? 2 : 1) * (i12 + i13));
    }

    private static int zzo(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    public static int zza(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i20 + 1;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static boolean zzd(byte[] bArr, int i10, int i11, zzv zzvVar) {
        int i12;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i12 = b10 & 31) == 1 || i12 == 9 || i12 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzga zzgaVarZzl = zzl(new zzgn(bArr, 4, i11 + 4));
            int i13 = zzgaVarZzl.zza;
            if (i13 == 35) {
                return false;
            }
            if (i13 <= 14 && i13 % 2 == 0 && zzgaVarZzl.zzc == zzvVar.zzF - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x0200  */
    /* JADX WARN: Code duplicated, block: B:120:0x0208  */
    /* JADX WARN: Code duplicated, block: B:123:0x0214  */
    /* JADX WARN: Code duplicated, block: B:126:0x021f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0228  */
    /* JADX WARN: Code duplicated, block: B:132:0x022f  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x0167 A[PHI: r2
  0x0167: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v12 int) binds: [B:73:0x0150, B:75:0x0154, B:77:0x0158, B:79:0x015c, B:81:0x0160, B:84:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:88:0x016e A[PHI: r2
  0x016e: PHI (r2v10 int) = (r2v4 int), (r2v3 int) binds: [B:86:0x0169, B:83:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    public static zzgl zze(byte[] bArr, int i10, int i11) {
        int iZzg;
        int i12;
        boolean zZze;
        int iZzg2;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzh;
        int i18;
        int iZzg3;
        boolean z11;
        boolean zZze2;
        int i19;
        int i20;
        int i21;
        int i22;
        int iZzg4;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f10;
        float f11;
        int iZzb;
        int iZzc;
        boolean zZze3;
        boolean zZze4;
        int iZzf;
        int iZzf2;
        int i28;
        int i29;
        zzgn zzgnVar = new zzgn(bArr, i10, i11);
        int iZzf3 = zzgnVar.zzf(8);
        int iZzf4 = zzgnVar.zzf(8);
        int iZzf5 = zzgnVar.zzf(8);
        int iZzg5 = zzgnVar.zzg();
        if (iZzf3 == 100 || iZzf3 == 110 || iZzf3 == 122 || iZzf3 == 244 || iZzf3 == 44 || iZzf3 == 83 || iZzf3 == 86 || iZzf3 == 118 || iZzf3 == 128) {
            iZzg = zzgnVar.zzg();
            if (iZzg == 3) {
                zZze = zzgnVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            int iZzg6 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                if (i12 != 3) {
                    i14 = 8;
                } else {
                    i14 = 12;
                }
                for (i15 = 0; i15 < i14; i15++) {
                    if (!zzgnVar.zze()) {
                        if (i15 < 6) {
                            i16 = 16;
                        } else {
                            i16 = 64;
                        }
                        iZzh = 8;
                        i18 = 8;
                        for (i17 = 0; i17 < i16; i17++) {
                            if (iZzh != 0) {
                                iZzh = ((i18 + zzgnVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i18 = iZzh;
                            }
                        }
                    }
                }
            }
            i13 = iZzg6;
            z10 = zZze;
        } else if (iZzf3 == 138) {
            iZzf3 = 138;
            iZzg = zzgnVar.zzg();
            if (iZzg == 3) {
                zZze = zzgnVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            int iZzg7 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                if (i12 != 3) {
                    i14 = 8;
                } else {
                    i14 = 12;
                }
                while (i15 < i14) {
                    if (!zzgnVar.zze()) {
                        if (i15 < 6) {
                            i16 = 16;
                        } else {
                            i16 = 64;
                        }
                        iZzh = 8;
                        i18 = 8;
                        while (i17 < i16) {
                            if (iZzh != 0) {
                                iZzh = ((i18 + zzgnVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i18 = iZzh;
                            }
                        }
                    }
                }
            }
            i13 = iZzg7;
            z10 = zZze;
        } else {
            iZzg = 1;
            i13 = 0;
            z10 = false;
            iZzg2 = 0;
        }
        int iZzg8 = zzgnVar.zzg() + 4;
        int iZzg9 = zzgnVar.zzg();
        if (iZzg9 != 0) {
            if (iZzg9 == 1) {
                boolean zZze5 = zzgnVar.zze();
                zzgnVar.zzh();
                zzgnVar.zzh();
                long jZzg = zzgnVar.zzg();
                for (int i30 = 0; i30 < jZzg; i30++) {
                    zzgnVar.zzg();
                }
                z11 = zZze5;
                iZzg9 = 1;
                iZzg3 = 0;
            } else {
                iZzg3 = 0;
            }
            int iZzg10 = zzgnVar.zzg();
            zzgnVar.zza();
            int iZzg11 = zzgnVar.zzg() + 1;
            int iZzg12 = zzgnVar.zzg() + 1;
            zZze2 = zzgnVar.zze();
            i19 = 2 - (zZze2 ? 1 : 0);
            if (!zZze2) {
                zzgnVar.zza();
            }
            zzgnVar.zza();
            i20 = iZzg11 * 16;
            i21 = iZzg12 * i19 * 16;
            if (zzgnVar.zze()) {
                int iZzg13 = zzgnVar.zzg();
                int iZzg14 = zzgnVar.zzg();
                int iZzg15 = zzgnVar.zzg();
                int iZzg16 = zzgnVar.zzg();
                if (iZzg == 0) {
                    i28 = 1;
                } else {
                    if (iZzg == 3) {
                        i28 = 1;
                    } else {
                        i28 = 2;
                    }
                    if (iZzg == 1) {
                        i29 = 2;
                    } else {
                        i29 = 1;
                    }
                    i19 *= i29;
                }
                i20 -= (iZzg13 + iZzg14) * i28;
                i21 -= (iZzg15 + iZzg16) * i19;
            }
            int i31 = i20;
            int i32 = i21;
            if (iZzf3 != 44 || iZzf3 == 86 || iZzf3 == 100 || iZzf3 == 110 || iZzf3 == 122) {
                if ((iZzf4 & 16) != 0) {
                    i22 = iZzf3;
                    iZzg4 = 0;
                } else {
                    i22 = iZzf3;
                    iZzg4 = 16;
                }
            } else if (iZzf3 == 244) {
                iZzf3 = 244;
                if ((iZzf4 & 16) != 0) {
                    i22 = iZzf3;
                    iZzg4 = 0;
                } else {
                    i22 = iZzf3;
                    iZzg4 = 16;
                }
            } else {
                i22 = iZzf3;
                iZzg4 = 16;
            }
            i23 = -1;
            if (zzgnVar.zze()) {
                if (zzgnVar.zze()) {
                    iZzf = zzgnVar.zzf(8);
                    if (iZzf == 255) {
                        iZzf2 = zzgnVar.zzf(16);
                        int iZzf6 = zzgnVar.zzf(16);
                        if (iZzf2 != 0 || iZzf6 == 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = iZzf2 / iZzf6;
                        }
                    } else if (iZzf < 17) {
                        f11 = zzb[iZzf];
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(iZzf);
                        zzee.zzc("NalUnitUtil", sb2.toString());
                        f11 = 1.0f;
                    }
                } else {
                    f11 = 1.0f;
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zza();
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzb(3);
                    int i33 = true != zzgnVar.zze() ? 2 : 1;
                    if (zzgnVar.zze()) {
                        int iZzf7 = zzgnVar.zzf(8);
                        int iZzf8 = zzgnVar.zzf(8);
                        zzgnVar.zzb(8);
                        iZzb = zzi.zzb(iZzf7);
                        iZzc = zzi.zzc(iZzf8);
                    } else {
                        iZzb = -1;
                        iZzc = -1;
                    }
                    i23 = i33;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzb(65);
                }
                zZze3 = zzgnVar.zze();
                if (zZze3) {
                    zzp(zzgnVar);
                }
                zZze4 = zzgnVar.zze();
                if (zZze4) {
                    zzp(zzgnVar);
                }
                if (zZze3 || zZze4) {
                    zzgnVar.zza();
                }
                zzgnVar.zza();
                if (zzgnVar.zze()) {
                    zzgnVar.zza();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    iZzg4 = zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                i24 = iZzg4;
                i25 = iZzb;
                i27 = iZzc;
                i26 = i23;
                f10 = f11;
            } else {
                i24 = iZzg4;
                i25 = -1;
                i26 = -1;
                i27 = -1;
                f10 = 1.0f;
            }
            return new zzgl(i22, iZzf4, iZzf5, iZzg5, iZzg10, i31, i32, f10, i13, iZzg2, z10, zZze2, iZzg8, iZzg9, iZzg3, z11, i25, i26, i27, i24);
        }
        iZzg3 = zzgnVar.zzg() + 4;
        z11 = false;
        int iZzg17 = zzgnVar.zzg();
        zzgnVar.zza();
        int iZzg18 = zzgnVar.zzg() + 1;
        int iZzg19 = zzgnVar.zzg() + 1;
        zZze2 = zzgnVar.zze();
        i19 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
            zzgnVar.zza();
        }
        zzgnVar.zza();
        i20 = iZzg18 * 16;
        i21 = iZzg19 * i19 * 16;
        if (zzgnVar.zze()) {
            int iZzg110 = zzgnVar.zzg();
            int iZzg111 = zzgnVar.zzg();
            int iZzg112 = zzgnVar.zzg();
            int iZzg113 = zzgnVar.zzg();
            if (iZzg == 0) {
                i28 = 1;
            } else {
                if (iZzg == 3) {
                    i28 = 1;
                } else {
                    i28 = 2;
                }
                if (iZzg == 1) {
                    i29 = 2;
                } else {
                    i29 = 1;
                }
                i19 *= i29;
            }
            i20 -= (iZzg110 + iZzg111) * i28;
            i21 -= (iZzg112 + iZzg113) * i19;
        }
        int i34 = i20;
        int i35 = i21;
        if (iZzf3 != 44) {
            if ((iZzf4 & 16) != 0) {
                i22 = iZzf3;
                iZzg4 = 0;
            } else {
                i22 = iZzf3;
                iZzg4 = 16;
            }
        } else if ((iZzf4 & 16) != 0) {
            i22 = iZzf3;
            iZzg4 = 0;
        } else {
            i22 = iZzf3;
            iZzg4 = 16;
        }
        i23 = -1;
        if (zzgnVar.zze()) {
            if (zzgnVar.zze()) {
                f11 = 1.0f;
            } else {
                iZzf = zzgnVar.zzf(8);
                if (iZzf == 255) {
                    iZzf2 = zzgnVar.zzf(16);
                    int iZzf9 = zzgnVar.zzf(16);
                    if (iZzf2 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 1.0f;
                    }
                } else if (iZzf < 17) {
                    f11 = zzb[iZzf];
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                    sb3.append("Unexpected aspect_ratio_idc value: ");
                    sb3.append(iZzf);
                    zzee.zzc("NalUnitUtil", sb3.toString());
                    f11 = 1.0f;
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zza();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(3);
                if (true != zzgnVar.zze()) {
                }
                if (zzgnVar.zze()) {
                    int iZzf10 = zzgnVar.zzf(8);
                    int iZzf11 = zzgnVar.zzf(8);
                    zzgnVar.zzb(8);
                    iZzb = zzi.zzb(iZzf10);
                    iZzc = zzi.zzc(iZzf11);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                i23 = i33;
            } else {
                iZzb = -1;
                iZzc = -1;
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
                zzgnVar.zzg();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(65);
            }
            zZze3 = zzgnVar.zze();
            if (zZze3) {
                zzp(zzgnVar);
            }
            zZze4 = zzgnVar.zze();
            if (zZze4) {
                zzp(zzgnVar);
            }
            if (zZze3) {
                zzgnVar.zza();
            } else {
                zzgnVar.zza();
            }
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                zzgnVar.zza();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                iZzg4 = zzgnVar.zzg();
                zzgnVar.zzg();
            }
            i24 = iZzg4;
            i25 = iZzb;
            i27 = iZzc;
            i26 = i23;
            f10 = f11;
        } else {
            i24 = iZzg4;
            i25 = -1;
            i26 = -1;
            i27 = -1;
            f10 = 1.0f;
        }
        return new zzgl(i22, iZzf4, iZzf5, iZzg5, iZzg17, i34, i35, f10, i13, iZzg2, z10, zZze2, iZzg8, iZzg9, iZzg3, z11, i25, i26, i27, i24);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    public static zzgg zzg(byte[] bArr, int i10, int i11, @Nullable zzgj zzgjVar) {
        boolean z10;
        int i12;
        int i13;
        int iZzn;
        int iZzo;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzg;
        int i18;
        int i19;
        int i20;
        int iMax;
        float f10;
        int i21;
        int i22;
        int i23;
        int iZzc;
        int i24;
        zzgi zzgiVar;
        int iZzb;
        int i25;
        int i26;
        zzge zzgeVar;
        zzga zzgaVarZzl = zzl(new zzgn(bArr, i10, i11));
        zzgn zzgnVar = new zzgn(bArr, i10 + 2, i11);
        zzgnVar.zzb(4);
        int iZzf = zzgnVar.zzf(3);
        int i27 = zzgaVarZzl.zzb;
        if (i27 == 0 || iZzf != 7) {
            z10 = false;
        } else {
            iZzf = 7;
            z10 = true;
        }
        if (zzgjVar != null) {
            zzguf zzgufVar = zzgjVar.zza;
            if (zzgufVar.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((zzfz) zzgufVar.get(Math.min(i27, zzgufVar.size() - 1))).zza;
            }
        } else {
            i12 = 0;
        }
        zzgb zzgbVarZzm = null;
        if (!z10) {
            zzgnVar.zza();
            zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
        } else if (zzgjVar != null) {
            zzgc zzgcVar = zzgjVar.zzb;
            int i28 = zzgcVar.zzb[i12];
            zzguf zzgufVar2 = zzgcVar.zza;
            if (zzgufVar2.size() > i28) {
                zzgbVarZzm = (zzgb) zzgufVar2.get(i28);
            }
        }
        int iZzg2 = zzgnVar.zzg();
        if (z10) {
            int iZzf2 = zzgnVar.zze() ? zzgnVar.zzf(8) : -1;
            if (zzgjVar == null || (zzgeVar = zzgjVar.zzc) == null) {
                i17 = 0;
                i15 = 0;
                i19 = 0;
                i18 = 0;
                iZzg = 0;
                i16 = 0;
                i14 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzgeVar.zzb[i12];
                }
                if (iZzf2 != -1) {
                    zzguf zzgufVar3 = zzgeVar.zza;
                    if (zzgufVar3.size() > iZzf2) {
                        zzgd zzgdVar = (zzgd) zzgufVar3.get(iZzf2);
                        int i29 = zzgdVar.zza;
                        i14 = zzgdVar.zzd;
                        i16 = zzgdVar.zze;
                        int i30 = zzgdVar.zzb;
                        i19 = i29;
                        i15 = i16;
                        i17 = i14;
                        iZzg = zzgdVar.zzc;
                        i18 = i30;
                    } else {
                        i17 = 0;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        iZzg = 0;
                        i16 = 0;
                        i14 = 0;
                    }
                } else {
                    i17 = 0;
                    i15 = 0;
                    i19 = 0;
                    i18 = 0;
                    iZzg = 0;
                    i16 = 0;
                    i14 = 0;
                }
            }
        } else {
            int iZzg3 = zzgnVar.zzg();
            if (iZzg3 == 3) {
                zzgnVar.zza();
                i13 = 3;
            } else {
                i13 = iZzg3;
            }
            int iZzg4 = zzgnVar.zzg();
            int iZzg5 = zzgnVar.zzg();
            if (zzgnVar.zze()) {
                int iZzg6 = zzgnVar.zzg();
                int iZzg7 = zzgnVar.zzg();
                int iZzg8 = zzgnVar.zzg();
                int iZzg9 = zzgnVar.zzg();
                iZzn = zzn(iZzg4, i13, iZzg6, iZzg7);
                iZzo = zzo(iZzg5, i13, iZzg8, iZzg9);
            } else {
                iZzn = iZzg4;
                iZzo = iZzg5;
            }
            int iZzg10 = zzgnVar.zzg();
            i14 = iZzn;
            i15 = iZzg5;
            i16 = iZzo;
            i17 = iZzg4;
            iZzg = zzgnVar.zzg();
            i18 = iZzg10;
            i19 = iZzg3;
        }
        int iZzg11 = zzgnVar.zzg();
        if (z10) {
            i20 = i14;
            iMax = -1;
        } else {
            int i31 = true != zzgnVar.zze() ? iZzf : 0;
            iMax = -1;
            while (i31 <= iZzf) {
                zzgnVar.zzg();
                iMax = Math.max(zzgnVar.zzg(), iMax);
                zzgnVar.zzg();
                i31++;
                i14 = i14;
            }
            i20 = i14;
        }
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        if (zzgnVar.zze()) {
            int i32 = 6;
            if (z10 && zzgnVar.zze()) {
                zzgnVar.zzb(6);
            } else if (zzgnVar.zze()) {
                int i33 = 0;
                int i34 = 4;
                while (i33 < i34) {
                    int i35 = 0;
                    while (i35 < i32) {
                        if (zzgnVar.zze()) {
                            int iMin = Math.min(64, 1 << ((i33 + i33) + 4));
                            if (i33 > 1) {
                                zzgnVar.zzh();
                            }
                            for (int i36 = 0; i36 < iMin; i36++) {
                                zzgnVar.zzh();
                            }
                            i26 = 3;
                        } else {
                            zzgnVar.zzg();
                            i26 = 3;
                        }
                        i35 += i33 == i26 ? 3 : 1;
                        iMax = iMax;
                        iZzg2 = iZzg2;
                        i32 = 6;
                    }
                    i33++;
                    i34 = 4;
                    i32 = 6;
                }
            }
        }
        int i37 = iMax;
        int i38 = iZzg2;
        zzgnVar.zzb(2);
        if (zzgnVar.zze()) {
            zzgnVar.zzb(8);
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        int iZzg12 = zzgnVar.zzg();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i39 = 0;
        int i40 = iZzg;
        int i41 = -1;
        int i42 = -1;
        while (i39 < iZzg12) {
            if (i39 == 0 || !zzgnVar.zze()) {
                int iZzg13 = zzgnVar.zzg();
                int iZzg14 = zzgnVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i43 = 0;
                while (i43 < iZzg13) {
                    iArr2[i43] = (i43 > 0 ? iArr2[i43 - 1] : 0) - (zzgnVar.zzg() + 1);
                    zzgnVar.zza();
                    i43++;
                }
                int[] iArr3 = new int[iZzg14];
                int i44 = 0;
                while (i44 < iZzg14) {
                    iArr3[i44] = (i44 > 0 ? iArr3[i44 - 1] : 0) + zzgnVar.zzg() + 1;
                    zzgnVar.zza();
                    i44++;
                }
                i42 = iZzg14;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i41 = iZzg13;
            } else {
                int i45 = i41 + i42;
                boolean zZze = zzgnVar.zze();
                boolean z11 = true;
                int iZzg15 = zzgnVar.zzg() + 1;
                int i46 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                int i47 = i45 + 1;
                boolean[] zArr = new boolean[i47];
                int i48 = 0;
                while (i48 <= i45) {
                    if (zzgnVar.zze()) {
                        zArr[i48] = z11;
                    } else {
                        zArr[i48] = zzgnVar.zze();
                    }
                    i48++;
                    z11 = true;
                }
                int i49 = i42 - 1;
                int[] iArr4 = new int[i47];
                int[] iArr5 = new int[i47];
                int i50 = 0;
                while (true) {
                    i25 = i46 * iZzg15;
                    if (i49 < 0) {
                        break;
                    }
                    int i51 = iArrCopyOf[i49] + i25;
                    if (i51 < 0 && zArr[i41 + i49]) {
                        iArr4[i50] = i51;
                        i50++;
                    }
                    i49--;
                }
                if (i25 < 0 && zArr[i45]) {
                    iArr4[i50] = i25;
                    i50++;
                }
                int i52 = i50;
                for (int i53 = 0; i53 < i41; i53++) {
                    int i54 = iArr[i53] + i25;
                    if (i54 < 0 && zArr[i53]) {
                        iArr4[i52] = i54;
                        i52++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i52);
                int i55 = 0;
                for (int i56 = i41 - 1; i56 >= 0; i56--) {
                    int i57 = iArr[i56] + i25;
                    if (i57 > 0 && zArr[i56]) {
                        iArr5[i55] = i57;
                        i55++;
                    }
                }
                if (i25 > 0 && zArr[i45]) {
                    iArr5[i55] = i25;
                    i55++;
                }
                int i58 = i55;
                for (int i59 = 0; i59 < i42; i59++) {
                    int i60 = iArrCopyOf[i59] + i25;
                    if (i60 > 0 && zArr[i41 + i59]) {
                        iArr5[i58] = i60;
                        i58++;
                    }
                }
                i42 = i58;
                iArrCopyOf = Arrays.copyOf(iArr5, i58);
                i41 = i52;
                iArr = iArrCopyOf2;
            }
            i39++;
            iZzg12 = iZzg12;
            iZzf = iZzf;
            zzgaVarZzl = zzgaVarZzl;
            i18 = i18;
            i19 = i19;
            zzgbVarZzm = zzgbVarZzm;
        }
        int i61 = iZzf;
        zzga zzgaVar = zzgaVarZzl;
        int i62 = i19;
        int i63 = i18;
        zzgb zzgbVar = zzgbVarZzm;
        if (zzgnVar.zze()) {
            int iZzg16 = zzgnVar.zzg();
            for (int i64 = 0; i64 < iZzg16; i64++) {
                zzgnVar.zzb(iZzg11 + 5);
            }
        }
        zzgnVar.zzb(2);
        float f11 = 1.0f;
        if (zzgnVar.zze()) {
            if (zzgnVar.zze()) {
                int iZzf3 = zzgnVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzgnVar.zzf(16);
                    int iZzf5 = zzgnVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f11 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f11 = zzb[iZzf3];
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf3).length() + 35);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iZzf3);
                    zzee.zzc("NalUnitUtil", sb2.toString());
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zza();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(3);
                i24 = true != zzgnVar.zze() ? 2 : 1;
                if (zzgnVar.zze()) {
                    int iZzf6 = zzgnVar.zzf(8);
                    int iZzf7 = zzgnVar.zzf(8);
                    zzgnVar.zzb(8);
                    iZzb = zzi.zzb(iZzf6);
                    iZzc = zzi.zzc(iZzf7);
                } else {
                    iZzc = -1;
                    iZzb = -1;
                }
            } else {
                if (zzgjVar != null && (zzgiVar = zzgjVar.zzd) != null) {
                    int i65 = zzgiVar.zzb[i12];
                    zzguf zzgufVar4 = zzgiVar.zza;
                    if (zzgufVar4.size() > i65) {
                        zzgh zzghVar = (zzgh) zzgufVar4.get(i65);
                        iZzb = zzghVar.zza;
                        int i66 = zzghVar.zzb;
                        iZzc = zzghVar.zzc;
                        i24 = i66;
                    }
                }
                iZzc = -1;
                i24 = -1;
                iZzb = -1;
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
                zzgnVar.zzg();
            }
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                i16 += i16;
            }
            i22 = iZzc;
            f10 = f11;
            i21 = i24;
            i23 = iZzb;
        } else {
            f10 = 1.0f;
            i21 = -1;
            i22 = -1;
            i23 = -1;
        }
        return new zzgg(zzgaVar, i61, zzgbVar, i62, i63, i40, i38, i20, i16, i17, i15, f10, i37, i23, i21, i22);
    }

    public static zzgk zzh(byte[] bArr, int i10, int i11) {
        zzgn zzgnVar = new zzgn(bArr, 4, i11);
        int iZzg = zzgnVar.zzg();
        int iZzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        return new zzgk(iZzg, iZzg2, zzgnVar.zze());
    }

    public static int zzi(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzgrc.zzi(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzj(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzj(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzj(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzgb zzm(zzgn zzgnVar, boolean z10, int i10, @Nullable zzgb zzgbVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zZze;
        int iZzf;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (zzgbVar != null) {
                int i16 = zzgbVar.zza;
                zZze = zzgbVar.zzb;
                iZzf = zzgbVar.zzc;
                i14 = zzgbVar.zzd;
                iArr2 = zzgbVar.zze;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iZzf2 = zzgnVar.zzf(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (zzgnVar.zze()) {
                    i15 += 88;
                }
                if (zzgnVar.zze()) {
                    i15 += 8;
                }
            }
            zzgnVar.zzb(i15);
            if (i10 > 0) {
                int i18 = 8 - i10;
                zzgnVar.zzb(i18 + i18);
            }
            return new zzgb(i11, z11, i12, i13, iArr, iZzf2);
        }
        int iZzf3 = zzgnVar.zzf(2);
        zZze = zzgnVar.zze();
        iZzf = zzgnVar.zzf(5);
        i14 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (zzgnVar.zze()) {
                i14 |= 1 << i19;
            }
        }
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = zzgnVar.zzf(8);
        }
        i11 = iZzf3;
        iArr = iArr2;
        z11 = zZze;
        i12 = iZzf;
        i13 = i14;
        int iZzf4 = zzgnVar.zzf(8);
        i15 = 0;
        while (i17 < i10) {
            if (zzgnVar.zze()) {
                i15 += 88;
            }
            if (zzgnVar.zze()) {
                i15 += 8;
            }
        }
        zzgnVar.zzb(i15);
        if (i10 > 0) {
            int i110 = 8 - i10;
            zzgnVar.zzb(i110 + i110);
        }
        return new zzgb(i11, z11, i12, i13, iArr, iZzf4);
    }

    @Nullable
    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzo;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static boolean zzb(zzv zzvVar, byte b10) {
        String strZzq = zzq(zzvVar);
        if ((!Objects.equals(strZzq, "video/avc") || (b10 & 31) != 6) && (!Objects.equals(strZzq, "video/hevc") || ((b10 & 126) >> 1) != 39)) {
            return false;
        }
        return true;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc")) {
            return 1;
        }
        if (Objects.equals(strZzq, "video/hevc")) {
            return 2;
        }
        return 0;
    }

    private static zzga zzl(zzgn zzgnVar) {
        zzgnVar.zza();
        return new zzga(zzgnVar.zzf(6), zzgnVar.zzf(6), zzgnVar.zzf(3) - 1);
    }

    private static void zzp(zzgn zzgnVar) {
        int iZzg = zzgnVar.zzg() + 1;
        zzgnVar.zzb(8);
        for (int i10 = 0; i10 < iZzg; i10++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        zzgnVar.zzb(20);
    }
}
