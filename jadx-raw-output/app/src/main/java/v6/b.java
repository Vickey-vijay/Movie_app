package v6;

import c6.k;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f73110a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void f(c6.c cVar, StringBuilder sb2, int i10) throws FormatException {
        while (i10 >= 3) {
            if (cVar.a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iD = cVar.d(10);
            if (iD >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(iD / 100));
            sb2.append(h((iD / 10) % 10));
            sb2.append(h(iD % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (cVar.a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iD2 = cVar.d(7);
            if (iD2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(iD2 / 10));
            sb2.append(h(iD2 % 10));
            return;
        }
        if (i10 == 1) {
            if (cVar.a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iD3 = cVar.d(4);
            if (iD3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(h(iD3));
        }
    }

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73111a;

        static {
            int[] iArr = new int[Mode.values().length];
            f73111a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73111a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73111a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73111a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73111a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f73111a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f73111a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f73111a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f73111a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f73111a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[LOOP:0: B:53:0x001e->B:50:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static c6.d a(byte[] bArr, f fVar, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        ?? r13;
        ArrayList arrayList;
        String string;
        c6.c cVar = new c6.c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        int i10 = 1;
        ArrayList arrayList2 = new ArrayList(1);
        ?? r14 = 0;
        int i11 = -1;
        int iD = -1;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = cVar.a() < 4 ? Mode.TERMINATOR : Mode.forBits(cVar.d(4));
                int[] iArr = a.f73111a;
                ?? r15 = r14;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        r13 = r15;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string2 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string2, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                    case 6:
                    case 7:
                        r15 = i10;
                        r13 = r15;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string3 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string3, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                    case 8:
                        if (cVar.a() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        int iD2 = cVar.d(8);
                        iD = cVar.d(8);
                        i11 = iD2;
                        r15 = r14;
                        r13 = r15;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string4 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string4, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                        break;
                    case 9:
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(g(cVar));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        r15 = r14;
                        r13 = r15;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string5 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string5, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                        break;
                    case 10:
                        int iD3 = cVar.d(4);
                        int iD4 = cVar.d(modeForBits.getCharacterCountBits(fVar));
                        r15 = r14;
                        if (iD3 == i10) {
                            d(cVar, sb2, iD4);
                            r15 = r14;
                        }
                        r13 = r15;
                        if (modeForBits == Mode.TERMINATOR) {
                            String string6 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string6, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                    default:
                        int iD5 = cVar.d(modeForBits.getCharacterCountBits(fVar));
                        int i12 = iArr[modeForBits.ordinal()];
                        if (i12 == i10) {
                            f(cVar, sb2, iD5);
                            r13 = r14;
                        } else if (i12 == 2) {
                            b(cVar, sb2, iD5, r14);
                            r13 = r14;
                        } else if (i12 == 3) {
                            c(cVar, sb2, iD5, characterSetECIByValue, arrayList2, map);
                            r13 = r14;
                        } else {
                            if (i12 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            e(cVar, sb2, iD5);
                            r15 = r14;
                            r13 = r15;
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            String string7 = sb2.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new c6.d(bArr, string7, arrayList, string, i11, iD);
                        }
                        i10 = 1;
                        r14 = r13;
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    public static void c(c6.c cVar, StringBuilder sb2, int i10, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i10 << 3) > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) cVar.d(8);
        }
        try {
            sb2.append(new String(bArr, characterSetECI == null ? k.a(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void d(c6.c cVar, StringBuilder sb2, int i10) throws FormatException {
        if (i10 * 13 > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 96) | ((iD / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void e(c6.c cVar, StringBuilder sb2, int i10) throws FormatException {
        if (i10 * 13 > cVar.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int iD = cVar.d(13);
            int i12 = (iD % 192) | ((iD / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static int g(c6.c cVar) throws FormatException {
        int iD = cVar.d(8);
        if ((iD & 128) == 0) {
            return iD & 127;
        }
        if ((iD & 192) == 128) {
            return cVar.d(8) | ((iD & 63) << 8);
        }
        if ((iD & 224) == 192) {
            return cVar.d(16) | ((iD & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    public static char h(int i10) throws FormatException {
        char[] cArr = f73110a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void b(c6.c cVar, StringBuilder sb2, int i10, boolean z10) throws FormatException {
        while (i10 > 1) {
            if (cVar.a() >= 11) {
                int iD = cVar.d(11);
                sb2.append(h(iD / 45));
                sb2.append(h(iD % 45));
                i10 -= 2;
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (i10 == 1) {
            if (cVar.a() >= 6) {
                sb2.append(h(cVar.d(6)));
            } else {
                throw FormatException.getFormatInstance();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }
}
