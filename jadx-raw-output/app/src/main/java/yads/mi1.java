package yads;

import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mi1 extends s73 {
    /* JADX WARN: Code duplicated, block: B:119:0x026d  */
    @Override // yads.s73
    public final t73 a(ro[] roVarArr, i73 i73Var, ym1 ym1Var, s63 s63Var) {
        af0 af0Var;
        String str;
        boolean z10;
        sm2 sm2VarA;
        boolean z11;
        mp0 mp0Var;
        int[][] iArr;
        df0 df0Var;
        int[] iArr2;
        i73 i73Var2 = i73Var;
        boolean z12 = true;
        int[] iArr3 = new int[roVarArr.length + 1];
        int length = roVarArr.length + 1;
        h73[][] h73VarArr = new h73[length][];
        int[][][] iArr4 = new int[roVarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i73Var2.f78514b;
            h73VarArr[i10] = new h73[i11];
            iArr4[i10] = new int[i11][];
        }
        int length2 = roVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr5[i12] = roVarArr[i12].l();
        }
        int i13 = 0;
        while (i13 < i73Var2.f78514b) {
            h73 h73VarA = i73Var2.a(i13);
            boolean z13 = h73VarA.f78089d == 5 ? z12 : false;
            int length3 = roVarArr.length;
            boolean z14 = z12;
            int i14 = 0;
            for (int i15 = 0; i15 < roVarArr.length; i15++) {
                ro roVar = roVarArr[i15];
                int iMax = 0;
                for (int i16 = 0; i16 < h73VarA.f78087b; i16++) {
                    iMax = Math.max(iMax, roVar.a(h73VarA.f78090e[i16]) & 7);
                }
                boolean z15 = iArr3[i15] == 0;
                if (iMax > i14 || (iMax == i14 && z13 && !z14 && z15)) {
                    z14 = z15;
                    i14 = iMax;
                    length3 = i15;
                }
            }
            if (length3 == roVarArr.length) {
                iArr2 = new int[h73VarA.f78087b];
            } else {
                ro roVar2 = roVarArr[length3];
                int[] iArr6 = new int[h73VarA.f78087b];
                for (int i17 = 0; i17 < h73VarA.f78087b; i17++) {
                    iArr6[i17] = roVar2.a(h73VarA.f78090e[i17]);
                }
                iArr2 = iArr6;
            }
            int i18 = iArr3[length3];
            h73VarArr[length3][i18] = h73VarA;
            iArr4[length3][i18] = iArr2;
            iArr3[length3] = i18 + 1;
            i13++;
            i73Var2 = i73Var;
            z12 = true;
        }
        i73[] i73VarArr = new i73[roVarArr.length];
        String[] strArr = new String[roVarArr.length];
        int[] iArr7 = new int[roVarArr.length];
        for (int i19 = 0; i19 < roVarArr.length; i19++) {
            int i20 = iArr3[i19];
            i73VarArr[i19] = new i73((h73[]) ib3.a(i20, h73VarArr[i19]));
            iArr4[i19] = (int[][]) ib3.a(i20, iArr4[i19]);
            strArr[i19] = roVarArr[i19].d();
            iArr7[i19] = roVarArr[i19].f82354b;
        }
        li1 li1Var = new li1(iArr7, i73VarArr, iArr5, iArr4, new i73((h73[]) ib3.a(iArr3[roVarArr.length], h73VarArr[roVarArr.length])));
        if0 if0Var = (if0) this;
        synchronized (if0Var.f78615c) {
            af0Var = if0Var.f78618f;
            if (af0Var.L && ib3.f78556a >= 32 && (df0Var = if0Var.f78619g) != null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException();
                }
                df0Var.a(if0Var, looperMyLooper);
            }
        }
        int i21 = li1Var.f79796a;
        mp0[] mp0VarArr = new mp0[i21];
        Pair pairA = if0.a(li1Var, iArr4, iArr5, af0Var);
        if (pairA != null) {
            mp0VarArr[((Integer) pairA.second).intValue()] = (mp0) pairA.first;
        }
        Pair pairA2 = if0Var.a(li1Var, iArr4, af0Var);
        if (pairA2 != null) {
            mp0VarArr[((Integer) pairA2.second).intValue()] = (mp0) pairA2.first;
        }
        if (pairA2 == null) {
            str = null;
        } else {
            mp0 mp0Var2 = (mp0) pairA2.first;
            str = mp0Var2.f80313a.f78090e[mp0Var2.f80314b[0]].f80420d;
        }
        Pair pairA3 = if0.a(li1Var, iArr4, af0Var, str);
        if (pairA3 != null) {
            mp0VarArr[((Integer) pairA3.second).intValue()] = (mp0) pairA3.first;
        }
        for (int i22 = 0; i22 < i21; i22++) {
            int i23 = li1Var.f79797b[i22];
            if (i23 != 2 && i23 != 1 && i23 != 3) {
                i73 i73Var3 = li1Var.f79798c[i22];
                int[][] iArr8 = iArr4[i22];
                int i24 = 0;
                int i25 = 0;
                h73 h73Var = null;
                ye0 ye0Var = null;
                while (i24 < i73Var3.f78514b) {
                    h73 h73VarA2 = i73Var3.a(i24);
                    int[] iArr9 = iArr8[i24];
                    ye0 ye0Var2 = ye0Var;
                    h73 h73Var2 = h73Var;
                    int i26 = i25;
                    int i27 = 0;
                    while (i27 < h73VarA2.f78087b) {
                        i73 i73Var4 = i73Var3;
                        if (if0.a(af0Var.M, iArr9[i27])) {
                            iArr = iArr8;
                            ye0 ye0Var3 = new ye0(iArr9[i27], h73VarA2.f78090e[i27]);
                            if (ye0Var2 == null || fy.a(lq.a(ye0Var3.f84920c, ye0Var2.f84920c)).a(ye0Var3.f84919b, ye0Var2.f84919b).a() > 0) {
                                i26 = i27;
                                h73Var2 = h73VarA2;
                                ye0Var2 = ye0Var3;
                            }
                        } else {
                            iArr = iArr8;
                        }
                        i27++;
                        i73Var3 = i73Var4;
                        iArr8 = iArr;
                    }
                    i24++;
                    i25 = i26;
                    h73Var = h73Var2;
                    ye0Var = ye0Var2;
                }
                mp0VarArr[i22] = h73Var == null ? null : new mp0(0, h73Var, new int[]{i25});
            }
        }
        int i28 = li1Var.f79796a;
        HashMap map = new HashMap();
        for (int i29 = 0; i29 < i28; i29++) {
            if0.a(li1Var.f79798c[i29], af0Var, map);
        }
        if0.a(li1Var.f79801f, af0Var, map);
        for (int i30 = 0; i30 < i28; i30++) {
            o73 o73Var = (o73) map.get(Integer.valueOf(li1Var.f79797b[i30]));
            if (o73Var != null) {
                if (o73Var.f80959c.isEmpty()) {
                    mp0Var = null;
                } else {
                    int iIndexOf = li1Var.f79798c[i30].f78515c.indexOf(o73Var.f80958b);
                    if (iIndexOf < 0 || iIndexOf == -1) {
                        mp0Var = null;
                    } else {
                        mp0Var = new mp0(0, o73Var.f80958b, td1.a(o73Var.f80959c));
                    }
                }
                mp0VarArr[i30] = mp0Var;
            }
        }
        int i31 = li1Var.f79796a;
        for (int i32 = 0; i32 < i31; i32++) {
            i73 i73Var5 = li1Var.f79798c[i32];
            Map map2 = (Map) af0Var.P.get(i32);
            if (map2 != null && map2.containsKey(i73Var5)) {
                Map map3 = (Map) af0Var.P.get(i32);
                bf0 bf0Var = map3 != null ? (bf0) map3.get(i73Var5) : null;
                mp0VarArr[i32] = (bf0Var == null || bf0Var.f75797c.length == 0) ? null : new mp0(bf0Var.f75798d, i73Var5.a(bf0Var.f75796b), bf0Var.f75797c);
            }
        }
        for (int i33 = 0; i33 < i21; i33++) {
            int i34 = li1Var.f79797b[i33];
            if (af0Var.Q.get(i33) || af0Var.A.contains(Integer.valueOf(i34))) {
                mp0VarArr[i33] = null;
            }
        }
        np0 np0Var = if0Var.f78616d;
        im imVar = if0Var.f82549b;
        if (imVar == null) {
            throw new IllegalStateException();
        }
        op0[] op0VarArrA = ((dc) np0Var).a(mp0VarArr, imVar);
        mn2[] mn2VarArr = new mn2[i21];
        for (int i35 = 0; i35 < i21; i35++) {
            mn2VarArr[i35] = (af0Var.Q.get(i35) || af0Var.A.contains(Integer.valueOf(li1Var.f79797b[i35])) || (li1Var.f79797b[i35] != -2 && op0VarArrA[i35] == null)) ? null : mn2.f80286b;
        }
        if (af0Var.N) {
            int i36 = -1;
            int i37 = -1;
            int i38 = 0;
            while (true) {
                if (i38 >= li1Var.f79796a) {
                    z11 = true;
                    break;
                }
                int i39 = li1Var.f79797b[i38];
                op0 op0Var = op0VarArrA[i38];
                if ((i39 == 1 || i39 == 2) && op0Var != null) {
                    int[][] iArr10 = iArr4[i38];
                    int iIndexOf2 = li1Var.f79798c[i38].f78515c.indexOf(op0Var.b());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    int i40 = 0;
                    while (true) {
                        if (i40 >= op0Var.f()) {
                            if (i39 != 1) {
                                if (i37 == -1) {
                                    i37 = i38;
                                    break;
                                }
                                z11 = false;
                                break;
                            }
                            if (i36 == -1) {
                                i36 = i38;
                                break;
                            }
                            z11 = false;
                            break;
                        }
                        if ((iArr10[iIndexOf2][op0Var.b(i40)] & 32) != 32) {
                            break;
                        }
                        i40++;
                    }
                }
                i38++;
            }
            if (z11 & ((i36 == -1 || i37 == -1) ? false : true)) {
                mn2 mn2Var = new mn2(true);
                mn2VarArr[i36] = mn2Var;
                mn2VarArr[i37] = mn2Var;
            }
        }
        Pair pairCreate = Pair.create(mn2VarArr, op0VarArrA);
        op0[] op0VarArr = (op0[]) pairCreate.second;
        List[] listArr = new List[op0VarArr.length];
        for (int i41 = 0; i41 < op0VarArr.length; i41++) {
            op0 op0Var2 = op0VarArr[i41];
            if (op0Var2 != null) {
                sm2VarA = p51.a(op0Var2);
            } else {
                m51 m51Var = p51.f81258c;
                sm2VarA = sm2.f82697f;
            }
            listArr[i41] = sm2VarA;
        }
        boolean z16 = true;
        l51 l51Var = new l51();
        int i42 = 0;
        while (i42 < li1Var.f79796a) {
            i73 i73Var6 = li1Var.f79798c[i42];
            List list = listArr[i42];
            int i43 = 0;
            while (i43 < i73Var6.f78514b) {
                h73 h73VarA3 = i73Var6.a(i43);
                boolean z17 = li1Var.a(i42, i43) != 0 ? z16 : false;
                int i44 = h73VarA3.f78087b;
                int[] iArr11 = new int[i44];
                boolean[] zArr = new boolean[i44];
                for (int i45 = 0; i45 < h73VarA3.f78087b; i45++) {
                    iArr11[i45] = li1Var.f79800e[i42][i43][i45] & 7;
                    int i46 = 0;
                    while (true) {
                        if (i46 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        op0 op0Var3 = (op0) list.get(i46);
                        if (op0Var3.b().equals(h73VarA3) && op0Var3.c(i45) != -1) {
                            z10 = true;
                            break;
                        }
                        i46++;
                    }
                    zArr[i45] = z10;
                }
                l51Var.a(new n83(h73VarA3, z17, iArr11, zArr));
                i43++;
                z16 = true;
            }
            i42++;
            z16 = true;
        }
        i73 i73Var7 = li1Var.f79801f;
        for (int i47 = 0; i47 < i73Var7.f78514b; i47++) {
            h73 h73VarA4 = i73Var7.a(i47);
            int[] iArr12 = new int[h73VarA4.f78087b];
            Arrays.fill(iArr12, 0);
            l51Var.a(new n83(h73VarA4, false, iArr12, new boolean[h73VarA4.f78087b]));
        }
        return new t73((mn2[]) pairCreate.first, (op0[]) pairCreate.second, new o83(l51Var.a()), li1Var);
    }
}
