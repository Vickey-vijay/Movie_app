package x6;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f74370a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static v6.f m(int i10, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i11 = 1; i11 <= 40; i11++) {
            v6.f fVarI = v6.f.i(i11);
            if (v(i10, fVarI, errorCorrectionLevel)) {
                return fVarI;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    public static f n(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        v6.f fVarT;
        int iK;
        CharacterSetECI characterSetECIByName;
        boolean z10 = map != null && map.containsKey(EncodeHintType.CHARACTER_SET);
        String string = z10 ? map.get(EncodeHintType.CHARACTER_SET).toString() : "ISO-8859-1";
        Mode modeL = l(str, string);
        c6.a aVar = new c6.a();
        Mode mode = Mode.BYTE;
        if (modeL == mode && z10 && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            d(characterSetECIByName, aVar);
        }
        if ((map != null && map.containsKey(EncodeHintType.GS1_FORMAT)) && Boolean.parseBoolean(map.get(EncodeHintType.GS1_FORMAT).toString())) {
            g(Mode.FNC1_FIRST_POSITION, aVar);
        }
        g(modeL, aVar);
        c6.a aVar2 = new c6.a();
        c(str, modeL, aVar2, string);
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType)) {
                fVarT = v6.f.i(Integer.parseInt(map.get(encodeHintType).toString()));
                if (!v(i(modeL, aVar, aVar2, fVarT), fVarT, errorCorrectionLevel)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                fVarT = t(errorCorrectionLevel, modeL, aVar, aVar2);
            }
        } else {
            fVarT = t(errorCorrectionLevel, modeL, aVar, aVar2);
        }
        c6.a aVar3 = new c6.a();
        aVar3.b(aVar);
        f(modeL == mode ? aVar2.m() : str.length(), fVarT, modeL, aVar3);
        aVar3.b(aVar2);
        v6.f.b bVarF = fVarT.f(errorCorrectionLevel);
        int iH = fVarT.h() - bVarF.d();
        u(iH, aVar3);
        c6.a aVarR = r(aVar3, fVarT.h(), iH, bVarF.c());
        f fVar = new f();
        fVar.c(errorCorrectionLevel);
        fVar.f(modeL);
        fVar.g(fVarT);
        int iE = fVarT.e();
        b bVar = new b(iE, iE);
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_MASK_PATTERN;
            if (map.containsKey(encodeHintType2)) {
                iK = Integer.parseInt(map.get(encodeHintType2).toString());
                if (!f.b(iK)) {
                    iK = -1;
                }
            } else {
                iK = -1;
            }
        } else {
            iK = -1;
        }
        if (iK == -1) {
            iK = k(aVarR, errorCorrectionLevel, fVarT, bVar);
        }
        fVar.d(iK);
        e.a(aVarR, errorCorrectionLevel, fVarT, iK, bVar);
        fVar.e(bVar);
        return fVar;
    }

    public static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new e6.d(e6.a.f52437l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static v6.f t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, c6.a aVar, c6.a aVar2) throws WriterException {
        return m(i(mode, aVar, aVar2, m(i(mode, aVar, aVar2, v6.f.i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* JADX INFO: compiled from: Encoder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74371a;

        static {
            int[] iArr = new int[Mode.values().length];
            f74371a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74371a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74371a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74371a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void c(String str, Mode mode, c6.a aVar, String str2) throws WriterException {
        int i10 = a.f74371a[mode.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else {
            if (i10 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            e(str, aVar);
        }
    }

    public static void d(CharacterSetECI characterSetECI, c6.a aVar) {
        aVar.c(Mode.ECI.getBits(), 4);
        aVar.c(characterSetECI.getValue(), 8);
    }

    public static void e(String str, c6.a aVar) throws WriterException {
        int i10;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            if (bytes.length % 2 != 0) {
                throw new WriterException("Kanji byte size not even");
            }
            int length = bytes.length - 1;
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
                int i13 = 33088;
                if (i12 >= 33088 && i12 <= 40956) {
                    i10 = i12 - i13;
                } else if (i12 < 57408 || i12 > 60351) {
                    i10 = -1;
                } else {
                    i13 = 49472;
                    i10 = i12 - i13;
                }
                if (i10 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                aVar.c(((i10 >> 8) * 192) + (i10 & 255), 13);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    public static Mode l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return Mode.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return Mode.ALPHANUMERIC;
        }
        return z11 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static int p(int i10) {
        int[] iArr = f74370a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws WriterException {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    public static c6.a r(c6.a aVar, int i10, int i11, int i12) throws WriterException {
        if (aVar.m() != i11) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i10, i11, i12, i14, iArr, iArr2);
            int i15 = iArr[0];
            byte[] bArr = new byte[i15];
            aVar.s(i13 << 3, bArr, 0, i15);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new x6.a(bArr, bArrO));
            iMax = Math.max(iMax, i15);
            iMax2 = Math.max(iMax2, bArrO.length);
            i13 += iArr[0];
        }
        if (i11 != i13) {
            throw new WriterException("Data bytes does not match offset");
        }
        c6.a aVar2 = new c6.a();
        for (int i16 = 0; i16 < iMax; i16++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((x6.a) it.next()).a();
                if (i16 < bArrA.length) {
                    aVar2.c(bArrA[i16], 8);
                }
            }
        }
        for (int i17 = 0; i17 < iMax2; i17++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((x6.a) it2.next()).b();
                if (i17 < bArrB.length) {
                    aVar2.c(bArrB[i17], 8);
                }
            }
        }
        if (i10 == aVar2.m()) {
            return aVar2;
        }
        throw new WriterException("Interleaving error: " + i10 + " and " + aVar2.m() + " differ.");
    }

    public static void u(int i10, c6.a aVar) throws WriterException {
        int i11 = i10 << 3;
        if (aVar.l() > i11) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar.l() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.l() < i11; i12++) {
            aVar.a(false);
        }
        int iL = aVar.l() & 7;
        if (iL > 0) {
            while (iL < 8) {
                aVar.a(false);
                iL++;
            }
        }
        int iM = i10 - aVar.m();
        for (int i13 = 0; i13 < iM; i13++) {
            aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static void a(String str, c6.a aVar, String str2) throws WriterException {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.c(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    public static void b(CharSequence charSequence, c6.a aVar) throws WriterException {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iP = p(charSequence.charAt(i10));
            if (iP != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int iP2 = p(charSequence.charAt(i11));
                    if (iP2 != -1) {
                        aVar.c((iP * 45) + iP2, 11);
                        i10 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.c(iP, 6);
                    i10 = i11;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    public static void f(int i10, v6.f fVar, Mode mode, c6.a aVar) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(fVar);
        int i11 = 1 << characterCountBits;
        if (i10 < i11) {
            aVar.c(i10, characterCountBits);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    public static void g(Mode mode, c6.a aVar) {
        aVar.c(mode.getBits(), 4);
    }

    public static void h(CharSequence charSequence, c6.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    public static int i(Mode mode, c6.a aVar, c6.a aVar2, v6.f fVar) {
        return aVar.l() + mode.getCharacterCountBits(fVar) + aVar2.l();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(c6.a aVar, ErrorCorrectionLevel errorCorrectionLevel, v6.f fVar, b bVar) throws WriterException {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, errorCorrectionLevel, fVar, i12, bVar);
            int iJ = j(bVar);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    public static boolean v(int i10, v6.f fVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (fVar.h() - fVar.f(errorCorrectionLevel).d() >= (i10 + 7) / 8) {
            return true;
        }
        return false;
    }
}
