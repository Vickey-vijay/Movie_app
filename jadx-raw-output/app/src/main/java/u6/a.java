package u6;

import c6.d;
import c6.f;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;
import v6.c;
import v6.e;
import y5.h;
import y5.i;
import y5.j;

/* JADX INFO: compiled from: QRCodeReader.java */
/* JADX INFO: loaded from: classes10.dex */
public class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f72742b = new j[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f72743a = new c();

    @Override // y5.h
    public void reset() {
    }

    @Override // y5.h
    public final i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        j[] jVarArrB;
        d dVarB;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            f fVarE = new w6.c(bVar.a()).e(map);
            d dVarB2 = this.f72743a.b(fVarE.a(), map);
            jVarArrB = fVarE.b();
            dVarB = dVarB2;
        } else {
            dVarB = this.f72743a.b(b(bVar.a()), map);
            jVarArrB = f72742b;
        }
        if (dVarB.d() instanceof e) {
            ((e) dVarB.d()).a(jVarArrB);
        }
        i iVar = new i(dVarB.h(), dVarB.e(), jVarArrB, BarcodeFormat.QR_CODE);
        List<byte[]> listA = dVarB.a();
        if (listA != null) {
            iVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = dVarB.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        if (dVarB.i()) {
            iVar.h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVarB.g()));
            iVar.h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVarB.f()));
        }
        return iVar;
    }

    public static c6.b b(c6.b bVar) throws NotFoundException {
        int[] iArrI = bVar.i();
        int[] iArrE = bVar.e();
        if (iArrI != null && iArrE != null) {
            float fC = c(iArrI, bVar);
            int i10 = iArrI[1];
            int i11 = iArrE[1];
            int i12 = iArrI[0];
            int i13 = iArrE[0];
            if (i12 < i13 && i10 < i11) {
                int i14 = i11 - i10;
                if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.j()) {
                    throw NotFoundException.getNotFoundInstance();
                }
                int iRound = Math.round(((i13 - i12) + 1) / fC);
                int iRound2 = Math.round((i14 + 1) / fC);
                if (iRound > 0 && iRound2 > 0) {
                    if (iRound2 == iRound) {
                        int i15 = (int) (fC / 2.0f);
                        int i16 = i10 + i15;
                        int i17 = i12 + i15;
                        int i18 = (((int) ((iRound - 1) * fC)) + i17) - i13;
                        if (i18 > 0) {
                            if (i18 <= i15) {
                                i17 -= i18;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        int i19 = (((int) ((iRound2 - 1) * fC)) + i16) - i11;
                        if (i19 > 0) {
                            if (i19 <= i15) {
                                i16 -= i19;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        c6.b bVar2 = new c6.b(iRound, iRound2);
                        for (int i20 = 0; i20 < iRound2; i20++) {
                            int i21 = ((int) (i20 * fC)) + i16;
                            for (int i22 = 0; i22 < iRound; i22++) {
                                if (bVar.d(((int) (i22 * fC)) + i17, i21)) {
                                    bVar2.l(i22, i20);
                                }
                            }
                        }
                        return bVar2;
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static float c(int[] iArr, c6.b bVar) throws NotFoundException {
        int iG = bVar.g();
        int iJ = bVar.j();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iJ && i11 < iG) {
            if (z10 != bVar.d(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 != iJ && i11 != iG) {
            return (i10 - iArr[0]) / 7.0f;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
