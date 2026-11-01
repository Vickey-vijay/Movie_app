package p6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import y5.l;

/* JADX INFO: compiled from: PDF417Writer.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements l {
    public static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static c6.b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        c6.b bVar = new c6.b(bArr[0].length + i11, bArr.length + i11);
        bVar.clear();
        int iG = (bVar.g() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.l(i13 + i10, iG);
                }
            }
            i12++;
            iG--;
        }
        return bVar;
    }

    @Override // y5.l
    public c6.b a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        t6.d dVar = new t6.d();
        int i12 = 30;
        int i13 = 2;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                dVar.h(Boolean.parseBoolean(map.get(encodeHintType).toString()));
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                dVar.i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                t6.c cVar = (t6.c) map.get(encodeHintType3);
                dVar.j(cVar.a(), cVar.c(), cVar.b(), cVar.d());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i12 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i13 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                dVar.k(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return c(dVar, str, i13, i10, i11, i12);
    }

    public static c6.b c(t6.d dVar, String str, int i10, int i11, int i12, int i13) throws WriterException {
        boolean z10;
        boolean z11;
        boolean z12;
        dVar.e(str, i10);
        byte[][] bArrB = dVar.f().b(1, 4);
        if (i12 > i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bArrB[0].length < bArrB.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            bArrB = d(bArrB);
            z12 = true;
        } else {
            z12 = false;
        }
        int iMin = Math.min(i11 / bArrB[0].length, i12 / bArrB.length);
        if (iMin > 1) {
            byte[][] bArrB2 = dVar.f().b(iMin, iMin << 2);
            if (z12) {
                bArrB2 = d(bArrB2);
            }
            return b(bArrB2, i13);
        }
        return b(bArrB, i13);
    }
}
