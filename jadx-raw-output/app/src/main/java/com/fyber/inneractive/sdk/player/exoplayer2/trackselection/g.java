package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f17643a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f17644b = new SparseBooleanArray();

    /* JADX WARN: Code duplicated, block: B:100:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01cb A[PHI: r26
  0x01cb: PHI (r26v4 int) = (r26v2 int), (r26v7 int) binds: [B:100:0x01c9, B:93:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01cd A[PHI: r10 r26
  0x01cd: PHI (r10v31 int) = (r10v30 int), (r10v32 int) binds: [B:100:0x01c9, B:93:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r26v6 int) = (r26v2 int), (r26v7 int) binds: [B:100:0x01c9, B:93:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01d1 A[PHI: r26
  0x01d1: PHI (r26v3 int) = (r26v2 int), (r26v7 int) binds: [B:103:0x01cf, B:95:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:191:0x0320  */
    /* JADX WARN: Code duplicated, block: B:290:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        int i10;
        boolean z10;
        int[][] iArr;
        int i11;
        boolean z11;
        int[][] iArr2;
        int i12;
        y yVar;
        c cVar;
        int[] iArr3;
        y yVar2;
        ArrayList arrayList;
        boolean z12;
        int i13;
        boolean zA;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iB;
        int i18;
        int i19;
        int[] iArr4;
        int[] iArr5 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr6 = new int[aVarArr.length + 1][][];
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = zVar.f17628a;
            yVarArr[i20] = new y[i21];
            iArr6[i20] = new int[i21][];
        }
        int length2 = aVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i22 = 0; i22 < length2; i22++) {
            aVarArr[i22].getClass();
            iArr7[i22] = 4;
        }
        for (int i23 = 0; i23 < zVar.f17628a; i23++) {
            y yVar3 = zVar.f17629b[i23];
            int length3 = aVarArr.length;
            int i24 = 0;
            for (int i25 = 0; i25 < aVarArr.length; i25++) {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i25];
                for (int i26 = 0; i26 < yVar3.f17624a; i26++) {
                    o oVar = yVar3.f17625b[i26];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int iB2 = cVar2.b(cVar2.f17433h, oVar) & 3;
                        if (iB2 > i24) {
                            if (iB2 == 3) {
                                length3 = i25;
                                break;
                            }
                            i24 = iB2;
                            length3 = i25;
                        }
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
                    }
                }
            }
            if (length3 == aVarArr.length) {
                iArr4 = new int[yVar3.f17624a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr8 = new int[yVar3.f17624a];
                for (int i27 = 0; i27 < yVar3.f17624a; i27++) {
                    o oVar2 = yVar3.f17625b[i27];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr8[i27] = cVar3.b(cVar3.f17433h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e11) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
                    }
                }
                iArr4 = iArr8;
            }
            int i28 = iArr5[length3];
            yVarArr[length3][i28] = yVar3;
            iArr6[length3][i28] = iArr4;
            iArr5[length3] = i28 + 1;
        }
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr9 = new int[aVarArr.length];
        for (int i29 = 0; i29 < aVarArr.length; i29++) {
            int i30 = iArr5[i29];
            zVarArr[i29] = new z((y[]) Arrays.copyOf(yVarArr[i29], i30));
            iArr6[i29] = (int[][]) Arrays.copyOf(iArr6[i29], i30);
            iArr9[i29] = aVarArr[i29].f16284a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr5[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).f17642c.get();
        int i31 = 0;
        boolean z14 = false;
        while (i31 < length4) {
            if (2 == aVarArr[i31].f16284a) {
                if (z14) {
                    cVar = cVar4;
                } else {
                    z zVar2 = zVarArr[i31];
                    int[][] iArr10 = iArr6[i31];
                    cVar4.getClass();
                    y yVar4 = null;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = -1;
                    int i36 = -1;
                    while (i32 < zVar2.f17628a) {
                        y yVar5 = zVar2.f17629b[i32];
                        z zVar3 = zVar2;
                        ArrayList arrayList2 = new ArrayList(yVar5.f17624a);
                        for (int i37 = 0; i37 < yVar5.f17624a; i37++) {
                            arrayList2.add(Integer.valueOf(i37));
                        }
                        int[] iArr11 = iArr10[i32];
                        int i38 = 0;
                        int i39 = i34;
                        y yVar6 = yVar4;
                        int i40 = i39;
                        int i41 = i35;
                        int[][] iArr12 = iArr10;
                        int iB3 = i41;
                        int i42 = i36;
                        int i43 = i33;
                        int i44 = i42;
                        while (i38 < yVar5.f17624a) {
                            c cVar5 = cVar4;
                            if (d.a(iArr11[i38], true)) {
                                o oVar3 = yVar5.f17625b[i38];
                                if (arrayList2.contains(Integer.valueOf(i38))) {
                                    int i45 = oVar3.f17508j;
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                    z12 = (i45 == -1 || i45 <= Integer.MAX_VALUE) && ((i18 = oVar3.f17509k) == -1 || i18 <= Integer.MAX_VALUE) && ((i19 = oVar3.f17500b) == -1 || i19 <= Integer.MAX_VALUE);
                                    if (z12) {
                                        i13 = 2;
                                    } else {
                                        i13 = 1;
                                    }
                                    iArr3 = iArr11;
                                    zA = d.a(iArr11[i38], false);
                                    if (zA) {
                                        i13 += 1000;
                                    }
                                    if (i13 > i40) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (i13 == i40) {
                                        if (oVar3.b() != iB3) {
                                            iB = oVar3.b();
                                            i14 = i13;
                                            i15 = -1;
                                            if (iB == -1) {
                                                if (iB3 == -1) {
                                                    i17 = 0;
                                                } else {
                                                    i17 = i15;
                                                }
                                            } else if (iB3 == -1) {
                                                i17 = 1;
                                            } else {
                                                i17 = iB - iB3;
                                            }
                                        } else {
                                            i14 = i13;
                                            i15 = -1;
                                            i16 = oVar3.f17500b;
                                            if (i16 == -1) {
                                                if (i44 == -1) {
                                                    i17 = 0;
                                                } else {
                                                    i17 = i15;
                                                }
                                            } else if (i44 == -1) {
                                                i17 = 1;
                                            } else {
                                                i17 = i16 - i44;
                                            }
                                        }
                                        z13 = zA || !z12 ? i17 < 0 : i17 > 0;
                                    } else {
                                        i14 = i13;
                                    }
                                    if (z13) {
                                        int i46 = oVar3.f17500b;
                                        iB3 = oVar3.b();
                                        i44 = i46;
                                        i43 = i38;
                                        yVar6 = yVar2;
                                        i40 = i14;
                                    }
                                } else {
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                }
                                if (z12) {
                                    i13 = 2;
                                } else {
                                    i13 = 1;
                                }
                                iArr3 = iArr11;
                                zA = d.a(iArr11[i38], false);
                                if (zA) {
                                    i13 += 1000;
                                }
                                if (i13 > i40) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (i13 == i40) {
                                    if (oVar3.b() != iB3) {
                                        iB = oVar3.b();
                                        i14 = i13;
                                        i15 = -1;
                                        if (iB == -1) {
                                            if (iB3 == -1) {
                                                i17 = 0;
                                            } else {
                                                i17 = i15;
                                            }
                                        } else if (iB3 == -1) {
                                            i17 = 1;
                                        } else {
                                            i17 = iB - iB3;
                                        }
                                    } else {
                                        i14 = i13;
                                        i15 = -1;
                                        i16 = oVar3.f17500b;
                                        if (i16 == -1) {
                                            if (i44 == -1) {
                                                i17 = 0;
                                            } else {
                                                i17 = i15;
                                            }
                                        } else if (i44 == -1) {
                                            i17 = 1;
                                        } else {
                                            i17 = i16 - i44;
                                        }
                                    }
                                    if (zA) {
                                    }
                                } else {
                                    i14 = i13;
                                }
                                if (z13) {
                                    int i47 = oVar3.f17500b;
                                    iB3 = oVar3.b();
                                    i44 = i47;
                                    i43 = i38;
                                    yVar6 = yVar2;
                                    i40 = i14;
                                }
                            } else {
                                iArr3 = iArr11;
                                yVar2 = yVar5;
                                arrayList = arrayList2;
                            }
                            i38++;
                            cVar4 = cVar5;
                            yVar5 = yVar2;
                            arrayList2 = arrayList;
                            iArr11 = iArr3;
                        }
                        i32++;
                        zVar2 = zVar3;
                        y yVar7 = yVar6;
                        i34 = i40;
                        yVar4 = yVar7;
                        i35 = iB3;
                        iArr10 = iArr12;
                        int i48 = i43;
                        i36 = i44;
                        i33 = i48;
                    }
                    cVar = cVar4;
                    e eVar = yVar4 == null ? null : new e(yVar4, i33);
                    bVarArr[i31] = eVar;
                    z14 = eVar != null;
                }
                int i49 = zVarArr[i31].f17628a;
            } else {
                cVar = cVar4;
            }
            i31++;
            cVar4 = cVar;
        }
        c cVar6 = cVar4;
        boolean z15 = false;
        int i50 = 0;
        boolean z16 = false;
        while (i50 < length4) {
            int i51 = aVarArr[i50].f16284a;
            if (i51 != 1) {
                if (i51 == 2) {
                    i10 = length4;
                } else if (i51 != 3) {
                    z zVar4 = zVarArr[i50];
                    int[][] iArr13 = iArr6[i50];
                    cVar6.getClass();
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    y yVar8 = null;
                    while (i52 < zVar4.f17628a) {
                        y yVar9 = zVar4.f17629b[i52];
                        int[] iArr14 = iArr13[i52];
                        int i55 = length4;
                        int i56 = 0;
                        while (i56 < yVar9.f17624a) {
                            z zVar5 = zVar4;
                            if (d.a(iArr14[i56], true)) {
                                int i57 = (yVar9.f17625b[i56].f17522x & 1) != 0 ? 2 : 1;
                                yVar = yVar9;
                                if (d.a(iArr14[i56], false)) {
                                    i57 += 1000;
                                }
                                if (i57 > i54) {
                                    i54 = i57;
                                    i53 = i56;
                                    yVar8 = yVar;
                                }
                            } else {
                                yVar = yVar9;
                            }
                            i56++;
                            zVar4 = zVar5;
                            yVar9 = yVar;
                        }
                        i52++;
                        length4 = i55;
                    }
                    i10 = length4;
                    bVarArr[i50] = yVar8 == null ? null : new e(yVar8, i53);
                } else {
                    i10 = length4;
                    if (!z16) {
                        z zVar6 = zVarArr[i50];
                        int[][] iArr15 = iArr6[i50];
                        cVar6.getClass();
                        int i58 = 0;
                        int i59 = 0;
                        int i60 = 0;
                        y yVar10 = null;
                        while (i58 < zVar6.f17628a) {
                            y yVar11 = zVar6.f17629b[i58];
                            int[] iArr16 = iArr15[i58];
                            y yVar12 = yVar10;
                            int i61 = i60;
                            int i62 = i59;
                            int i63 = 0;
                            while (i63 < yVar11.f17624a) {
                                z zVar7 = zVar6;
                                if (d.a(iArr16[i63], true)) {
                                    int i64 = yVar11.f17625b[i63].f17522x;
                                    boolean z17 = (i64 & 1) != 0;
                                    boolean z18 = (i64 & 2) != 0;
                                    if (z17) {
                                        i12 = 3;
                                    } else if (z18) {
                                        i12 = 1;
                                    } else {
                                        iArr2 = iArr15;
                                    }
                                    iArr2 = iArr15;
                                    if (d.a(iArr16[i63], false)) {
                                        i12 += 1000;
                                    }
                                    if (i12 > i61) {
                                        i61 = i12;
                                        i62 = i63;
                                        yVar12 = yVar11;
                                    }
                                } else {
                                    iArr2 = iArr15;
                                }
                                i63++;
                                zVar6 = zVar7;
                                iArr15 = iArr2;
                            }
                            i58++;
                            i59 = i62;
                            i60 = i61;
                            yVar10 = yVar12;
                        }
                        e eVar2 = yVar10 == null ? null : new e(yVar10, i59);
                        bVarArr[i50] = eVar2;
                        z10 = eVar2 != null;
                    }
                }
                z10 = z16;
            } else {
                i10 = length4;
                if (z15) {
                    z10 = z16;
                } else {
                    z zVar8 = zVarArr[i50];
                    int[][] iArr17 = iArr6[i50];
                    cVar6.getClass();
                    int i65 = 0;
                    int i66 = 0;
                    int i67 = -1;
                    int i68 = -1;
                    while (i65 < zVar8.f17628a) {
                        y yVar13 = zVar8.f17629b[i65];
                        int[] iArr18 = iArr17[i65];
                        int i69 = i68;
                        int i70 = i67;
                        int i71 = i66;
                        int i72 = 0;
                        while (i72 < yVar13.f17624a) {
                            boolean z19 = z16;
                            if (d.a(iArr18[i72], true)) {
                                o oVar4 = yVar13.f17625b[i72];
                                iArr = iArr17;
                                int i73 = iArr18[i72];
                                if ((oVar4.f17522x & 1) != 0) {
                                    z11 = false;
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                    z11 = false;
                                }
                                if (d.a(i73, z11)) {
                                    i11 += 1000;
                                }
                                if (i11 > i71) {
                                    i69 = i65;
                                    i70 = i72;
                                    i71 = i11;
                                }
                            } else {
                                iArr = iArr17;
                            }
                            i72++;
                            iArr17 = iArr;
                            z16 = z19;
                        }
                        i65++;
                        i66 = i71;
                        i67 = i70;
                        i68 = i69;
                        z16 = z16;
                    }
                    z10 = z16;
                    e eVar3 = i68 == -1 ? null : new e(zVar8.f17629b[i68], i67);
                    bVarArr[i50] = eVar3;
                    z15 = eVar3 != null;
                }
            }
            i50++;
            z16 = z10;
            length4 = i10;
        }
        for (int i74 = 0; i74 < aVarArr.length; i74++) {
            if (this.f17644b.get(i74)) {
                bVarArr[i74] = null;
            } else {
                z zVar9 = zVarArr[i74];
                Map map = (Map) this.f17643a.get(i74);
                if (map != null && map.containsKey(zVar9)) {
                    if (((Map) this.f17643a.get(i74)).get(zVar9) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i74] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i75 = 0; i75 < aVarArr.length; i75++) {
            tVarArr[i75] = bVarArr[i75] != null ? t.f17631b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
