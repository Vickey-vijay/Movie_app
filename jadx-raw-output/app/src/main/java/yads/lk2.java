package yads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lk2 {
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public static ArrayList a(jb2 jb2Var) {
        boolean z10;
        int i10;
        ik2 ik2Var;
        jb2 jb2Var2 = jb2Var;
        if (jb2Var.m() != 0) {
            return null;
        }
        jb2Var2.e(jb2Var2.f78967b + 7);
        int iB = jb2Var.b();
        boolean z11 = true;
        if (iB == 1684433976) {
            jb2 jb2Var3 = new jb2();
            Inflater inflater = new Inflater(true);
            try {
                if (!ib3.a(jb2Var2, jb2Var3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                jb2Var2 = jb2Var3;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iB != 1918990112) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = jb2Var2.f78967b;
        int i12 = jb2Var2.f78968c;
        while (i11 < i12) {
            int iB2 = jb2Var2.b() + i11;
            if (iB2 > i11 && iB2 <= i12) {
                if (jb2Var2.b() == 1835365224) {
                    int iB3 = jb2Var2.b();
                    if (iB3 > 10000) {
                        z10 = z11;
                        i10 = i12;
                        ik2Var = null;
                    } else {
                        float[] fArr = new float[iB3];
                        for (int i13 = 0; i13 < iB3; i13++) {
                            fArr[i13] = Float.intBitsToFloat(jb2Var2.b());
                        }
                        int iB4 = jb2Var2.b();
                        if (iB4 > 32000) {
                            z10 = z11;
                            i10 = i12;
                        } else {
                            double dLog = Math.log(2.0d);
                            int iCeil = (int) Math.ceil(Math.log(((double) iB3) * 2.0d) / dLog);
                            byte[] bArr = jb2Var2.f78966a;
                            ib2 ib2Var = new ib2(bArr.length, bArr);
                            ib2Var.b(jb2Var2.f78967b * 8);
                            float[] fArr2 = new float[iB4 * 5];
                            int i14 = 5;
                            int[] iArr = new int[5];
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < iB4) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < i14) {
                                            int i18 = iArr[i17];
                                            int iA = ib2Var.a(iCeil);
                                            int i19 = ((iA >> 1) ^ (-(iA & 1))) + i18;
                                            if (i19 < iB3 && i19 >= 0) {
                                                fArr2[i16] = fArr[i19];
                                                iArr[i17] = i19;
                                                i17++;
                                                i16++;
                                                i14 = 5;
                                            }
                                        } else {
                                            i15++;
                                            i14 = 5;
                                        }
                                    }
                                } else {
                                    ib2Var.b((ib2Var.d() + 7) & (-8));
                                    int i20 = 32;
                                    int iA2 = ib2Var.a(32);
                                    jk2[] jk2VarArr = new jk2[iA2];
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < iA2) {
                                            int iA3 = ib2Var.a(8);
                                            int iA4 = ib2Var.a(8);
                                            int iA5 = ib2Var.a(i20);
                                            if (iA5 <= 128000) {
                                                int i22 = iA2;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iB4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iA5 * 3];
                                                i10 = i12;
                                                float[] fArr4 = new float[iA5 * 2];
                                                double d10 = dLog;
                                                int i23 = 0;
                                                int i24 = 0;
                                                while (true) {
                                                    if (i23 < iA5) {
                                                        int iA6 = ib2Var.a(iCeil2);
                                                        int i25 = iCeil2;
                                                        i24 += (iA6 >> 1) ^ (-(iA6 & 1));
                                                        if (i24 >= 0 && i24 < iB4) {
                                                            int i26 = i23 * 3;
                                                            int i27 = i24 * 5;
                                                            fArr3[i26] = fArr2[i27];
                                                            fArr3[i26 + 1] = fArr2[i27 + 1];
                                                            fArr3[i26 + 2] = fArr2[i27 + 2];
                                                            int i28 = i23 * 2;
                                                            fArr4[i28] = fArr2[i27 + 3];
                                                            fArr4[i28 + 1] = fArr2[i27 + 4];
                                                            i23++;
                                                            iCeil2 = i25;
                                                        }
                                                    } else {
                                                        jk2VarArr[i21] = new jk2(iA3, fArr3, fArr4, iA4);
                                                        i21++;
                                                        iA2 = i22;
                                                        i12 = i10;
                                                        dLog = d10;
                                                        i20 = 32;
                                                    }
                                                }
                                            }
                                            z10 = true;
                                        } else {
                                            i10 = i12;
                                            z10 = true;
                                            ik2Var = new ik2(jk2VarArr);
                                        }
                                    }
                                }
                                i10 = i12;
                                z10 = true;
                            }
                        }
                        ik2Var = null;
                    }
                    if (ik2Var != null) {
                        arrayList.add(ik2Var);
                    }
                } else {
                    z10 = z11;
                    i10 = i12;
                }
                jb2Var2.e(iB2);
                i11 = iB2;
                z11 = z10;
                i12 = i10;
            }
            return null;
        }
        return arrayList;
    }
}
