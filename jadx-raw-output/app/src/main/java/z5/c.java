package z5;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import y5.l;

/* JADX INFO: compiled from: AztecWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements l {
    public static c6.b b(String str, BarcodeFormat barcodeFormat, int i10, int i11, Charset charset, int i12, int i13) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return c(b6.c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // y5.l
    public c6.b a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charsetForName = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i12 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i13 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return b(str, barcodeFormat, i10, i11, charsetForName, i12, i13);
    }

    public static c6.b c(b6.a aVar, int i10, int i11) {
        c6.b bVarA = aVar.a();
        if (bVarA != null) {
            int iJ = bVarA.j();
            int iG = bVarA.g();
            int iMax = Math.max(i10, iJ);
            int iMax2 = Math.max(i11, iG);
            int iMin = Math.min(iMax / iJ, iMax2 / iG);
            int i12 = (iMax - (iJ * iMin)) / 2;
            int i13 = (iMax2 - (iG * iMin)) / 2;
            c6.b bVar = new c6.b(iMax, iMax2);
            int i14 = 0;
            while (i14 < iG) {
                int i15 = 0;
                int i16 = i12;
                while (i15 < iJ) {
                    if (bVarA.d(i15, i14)) {
                        bVar.m(i16, i13, iMin, iMin);
                    }
                    i15++;
                    i16 += iMin;
                }
                i14++;
                i13 += iMin;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
