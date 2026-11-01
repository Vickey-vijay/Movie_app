package f6;

import c6.d;
import c6.f;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import g6.c;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.i;
import y5.j;

/* JADX INFO: compiled from: DataMatrixReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f52881b = new j[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f52882a = new c();

    @Override // y5.h
    public void reset() {
    }

    @Override // y5.h
    public i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        j[] jVarArrB;
        d dVarB;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f fVarB = new h6.a(bVar.a()).b();
            d dVarB2 = this.f52882a.b(fVarB.a());
            jVarArrB = fVarB.b();
            dVarB = dVarB2;
        } else {
            dVarB = this.f52882a.b(b(bVar.a()));
            jVarArrB = f52881b;
        }
        i iVar = new i(dVarB.h(), dVarB.e(), jVarArrB, BarcodeFormat.DATA_MATRIX);
        List<byte[]> listA = dVarB.a();
        if (listA != null) {
            iVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = dVarB.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return iVar;
    }

    public static c6.b b(c6.b bVar) throws NotFoundException {
        int[] iArrI = bVar.i();
        int[] iArrE = bVar.e();
        if (iArrI != null && iArrE != null) {
            int iC = c(iArrI, bVar);
            int i10 = iArrI[1];
            int i11 = iArrE[1];
            int i12 = iArrI[0];
            int i13 = ((iArrE[0] - i12) + 1) / iC;
            int i14 = ((i11 - i10) + 1) / iC;
            if (i13 > 0 && i14 > 0) {
                int i15 = iC / 2;
                int i16 = i10 + i15;
                int i17 = i12 + i15;
                c6.b bVar2 = new c6.b(i13, i14);
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = (i18 * iC) + i16;
                    for (int i20 = 0; i20 < i13; i20++) {
                        if (bVar.d((i20 * iC) + i17, i19)) {
                            bVar2.l(i20, i18);
                        }
                    }
                }
                return bVar2;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int c(int[] iArr, c6.b bVar) throws NotFoundException {
        int iJ = bVar.j();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < iJ && bVar.d(i10, i11)) {
            i10++;
        }
        if (i10 != iJ) {
            int i12 = i10 - iArr[0];
            if (i12 != 0) {
                return i12;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
