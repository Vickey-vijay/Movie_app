package f6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import i6.e;
import i6.i;
import i6.j;
import i6.k;
import java.util.Map;
import y5.c;
import y5.l;

/* JADX INFO: compiled from: DataMatrixWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements l {
    public static c6.b b(x6.b bVar, int i10, int i11) {
        c6.b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i10, iE);
        int iMax2 = Math.max(i11, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i12 = (iMax - (iE * iMin)) / 2;
        int i13 = (iMax2 - (iD * iMin)) / 2;
        if (i11 >= iD && i10 >= iE) {
            bVar2 = new c6.b(i10, i11);
        } else {
            bVar2 = new c6.b(iE, iD);
            i12 = 0;
            i13 = 0;
        }
        bVar2.clear();
        int i14 = 0;
        while (i14 < iD) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < iE) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.m(i15, i13, iMin, iMin);
                }
                i16++;
                i15 += iMin;
            }
            i14++;
            i13 += iMin;
        }
        return bVar2;
    }

    public static c6.b c(e eVar, k kVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        int iH = kVar.h();
        int iG = kVar.g();
        x6.b bVar = new x6.b(kVar.j(), kVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < iG; i13++) {
            if (i13 % kVar.f54087e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < kVar.j(); i15++) {
                    if (i15 % 2 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.g(i14, i12, z11);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < iH; i17++) {
                if (i17 % kVar.f54086d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                i16++;
                int i18 = kVar.f54086d;
                if (i17 % i18 == i18 - 1) {
                    if (i13 % 2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.g(i16, i12, z10);
                    i16++;
                }
            }
            i12++;
            int i19 = kVar.f54087e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < kVar.j(); i21++) {
                    bVar.g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return b(bVar, i10, i11);
    }

    @Override // y5.l
    public c6.b a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        c cVar;
        if (!str.isEmpty()) {
            if (barcodeFormat == BarcodeFormat.DATA_MATRIX) {
                if (i10 >= 0 && i11 >= 0) {
                    SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
                    c cVar2 = null;
                    if (map != null) {
                        SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                        if (symbolShapeHint2 != null) {
                            symbolShapeHint = symbolShapeHint2;
                        }
                        c cVar3 = (c) map.get(EncodeHintType.MIN_SIZE);
                        if (cVar3 == null) {
                            cVar3 = null;
                        }
                        cVar = (c) map.get(EncodeHintType.MAX_SIZE);
                        if (cVar == null) {
                            cVar = null;
                        }
                        cVar2 = cVar3;
                    } else {
                        cVar = null;
                    }
                    String strB = j.b(str, symbolShapeHint, cVar2, cVar);
                    k kVarL = k.l(strB.length(), symbolShapeHint, cVar2, cVar, true);
                    e eVar = new e(i.b(strB, kVarL), kVarL.h(), kVarL.g());
                    eVar.h();
                    return c(eVar, kVarL, i10, i11);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
