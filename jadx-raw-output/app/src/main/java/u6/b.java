package u6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;
import x6.c;
import x6.f;
import y5.l;

/* JADX INFO: compiled from: QRCodeWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements l {
    public static c6.b b(f fVar, int i10, int i11, int i12) {
        x6.b bVarA = fVar.a();
        if (bVarA != null) {
            int iE = bVarA.e();
            int iD = bVarA.d();
            int i13 = i12 << 1;
            int i14 = iE + i13;
            int i15 = i13 + iD;
            int iMax = Math.max(i10, i14);
            int iMax2 = Math.max(i11, i15);
            int iMin = Math.min(iMax / i14, iMax2 / i15);
            int i16 = (iMax - (iE * iMin)) / 2;
            int i17 = (iMax2 - (iD * iMin)) / 2;
            c6.b bVar = new c6.b(iMax, iMax2);
            int i18 = 0;
            while (i18 < iD) {
                int i19 = 0;
                int i20 = i16;
                while (i19 < iE) {
                    if (bVarA.b(i19, i18) == 1) {
                        bVar.m(i20, i17, iMin, iMin);
                    }
                    i19++;
                    i20 += iMin;
                }
                i18++;
                i17 += iMin;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // y5.l
    public c6.b a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (barcodeFormat == BarcodeFormat.QR_CODE) {
                if (i10 >= 0 && i11 >= 0) {
                    ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
                    int i12 = 4;
                    if (map != null) {
                        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                        if (map.containsKey(encodeHintType)) {
                            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
                        }
                        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                        if (map.containsKey(encodeHintType2)) {
                            i12 = Integer.parseInt(map.get(encodeHintType2).toString());
                        }
                    }
                    return b(c.n(str, errorCorrectionLevelValueOf, map), i10, i11, i12);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
