package t6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PDF417HighLevelEncoder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f72275c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f72273a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, ExifInterface.START_CODE, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f72274b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, ExifInterface.START_CODE, 40, 41, 63, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f72276d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f72277e = StandardCharsets.ISO_8859_1;

    public static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    public static boolean i(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean n(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }

    /* JADX INFO: compiled from: PDF417HighLevelEncoder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72278a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f72278a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72278a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72278a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f72275c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f72273a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f72275c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f72276d, (byte) -1);
        while (true) {
            byte[] bArr3 = f72274b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f72276d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    public static String e(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f72277e;
        } else if (!f72277e.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            h(characterSetECIByName.getValue(), sb2);
        }
        int length = str.length();
        int i10 = a.f72278a[compaction.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int iG = 0;
            int i12 = 0;
            while (i11 < length) {
                int iB = b(str, i11);
                if (iB >= 13) {
                    sb2.append((char) 902);
                    f(str, i11, iB, sb2);
                    i11 += iB;
                    iG = 0;
                    i12 = 2;
                } else {
                    int iC = c(str, i11);
                    if (iC >= 5 || iB == length) {
                        if (i12 != 0) {
                            sb2.append((char) 900);
                            iG = 0;
                            i12 = 0;
                        }
                        iG = g(str, i11, iC, sb2, iG);
                        i11 += iC;
                    } else {
                        int iA = a(str, i11, charset);
                        if (iA == 0) {
                            iA = 1;
                        }
                        int i13 = iA + i11;
                        byte[] bytes2 = str.substring(i11, i13).getBytes(charset);
                        if (bytes2.length == 1 && i12 == 0) {
                            d(bytes2, 0, 1, 0, sb2);
                        } else {
                            d(bytes2, 0, bytes2.length, i12, sb2);
                            i12 = 1;
                            iG = 0;
                        }
                        i11 = i13;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    public static void f(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int iMin = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 BREAK  A[LOOP:0: B:3:0x0011->B:93:0x0011], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0011 A[SYNTHETIC] */
    public static int g(CharSequence charSequence, int i10, int i11, StringBuilder sb2, int i12) {
        StringBuilder sb3 = new StringBuilder(i11);
        int i13 = i12;
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            char cCharAt = charSequence.charAt(i15);
            if (i13 == 0) {
                if (j(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'A'));
                    }
                } else if (i(cCharAt)) {
                    sb3.append((char) 27);
                    i13 = 1;
                } else if (l(cCharAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f72276d[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                    break;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (m(cCharAt)) {
                            sb3.append((char) f72276d[cCharAt]);
                        } else {
                            sb3.append((char) 29);
                            i13 = 0;
                        }
                    } else if (l(cCharAt)) {
                        sb3.append((char) f72275c[cCharAt]);
                    } else if (j(cCharAt)) {
                        sb3.append((char) 28);
                        i13 = 0;
                    } else if (i(cCharAt)) {
                        sb3.append((char) 27);
                        i13 = 1;
                    } else {
                        int i16 = i15 + 1;
                        if (i16 >= i11 || !m(charSequence.charAt(i16))) {
                            sb3.append((char) 29);
                            sb3.append((char) f72276d[cCharAt]);
                        } else {
                            i13 = 3;
                            sb3.append((char) 25);
                        }
                    }
                } else if (i(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'a'));
                    }
                } else if (j(cCharAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt - 'A'));
                } else if (l(cCharAt)) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) f72276d[cCharAt]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char cCharAt2 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb3.charAt(i17));
                sb2.append(cCharAt2);
            } else {
                cCharAt2 = sb3.charAt(i17);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((cCharAt2 * 30) + 29));
        }
        return i13;
    }

    public static void h(int i10, StringBuilder sb2) throws WriterException {
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i10);
        } else if (i10 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i10 / TypedValues.Custom.TYPE_INT) - 1));
            sb2.append((char) (i10 % TypedValues.Custom.TYPE_INT));
        } else {
            if (i10 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
            }
            sb2.append((char) 925);
            sb2.append((char) (810900 - i10));
        }
    }

    public static boolean l(char c10) {
        return f72275c[c10] != -1;
    }

    public static boolean m(char c10) {
        return f72276d[c10] != -1;
    }

    public static int a(String str, int i10, Charset charset) throws WriterException {
        int i11;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i12 = i10;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            int i13 = 0;
            while (i13 < 13 && k(cCharAt) && (i11 = i12 + (i13 = i13 + 1)) < length) {
                cCharAt = str.charAt(i11);
            }
            if (i13 >= 13) {
                return i12 - i10;
            }
            char cCharAt2 = str.charAt(i12);
            if (charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                i12++;
            } else {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
        }
        return i12 - i10;
    }

    public static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            while (k(cCharAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    cCharAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && k(cCharAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    cCharAt = charSequence.charAt(i11);
                }
            }
            if (i12 >= 13) {
                return (i11 - i10) - i12;
            }
            if (i12 <= 0) {
                if (!n(charSequence.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return i11 - i10;
    }
}
