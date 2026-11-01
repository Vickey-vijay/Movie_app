package com.applovin.shadow.okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.applovin.shadow.okio.Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import java.util.Arrays;
import lk.x;
import mj.r;
import nj.l;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        p.j(byteString, "<this>");
        p.j(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2, int i10) {
        p.j(byteString, "<this>");
        p.j(byteString2, "other");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i10);
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i10, com.applovin.shadow.okio.ByteString byteString2, int i11, int i12) {
        p.j(byteString, "<this>");
        p.j(byteString2, "other");
        return byteString2.rangeEquals(i11, byteString.getData$okio(), i10, i12);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        p.j(byteString, "<this>");
        p.j(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x00db  */
    /* JADX WARN: Code duplicated, block: B:103:0x00df  */
    /* JADX WARN: Code duplicated, block: B:104:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x0163  */
    /* JADX WARN: Code duplicated, block: B:164:0x0167  */
    /* JADX WARN: Code duplicated, block: B:167:0x016d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0171  */
    /* JADX WARN: Code duplicated, block: B:170:0x0174  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:241:0x020e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0212  */
    /* JADX WARN: Code duplicated, block: B:246:0x0218  */
    /* JADX WARN: Code duplicated, block: B:248:0x021c  */
    /* JADX WARN: Code duplicated, block: B:249:0x021f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b  */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0084  */
    /* JADX WARN: Code duplicated, block: B:58:0x0087  */
    /* JADX WARN: Code duplicated, block: B:97:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d8 A[DONT_INVERT] */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i10) {
        byte b10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int length = bArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            byte b11 = bArr[i16];
            if (b11 >= 0) {
                int i19 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (b11 != 10 && b11 != 13) {
                    if (b11 >= 0 && b11 < 32) {
                        z11 = true;
                    } else {
                        if (127 <= b11 && b11 < 160) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                    }
                    return -1;
                }
                if (b11 == 65533) {
                    return -1;
                }
                i17 += b11 < 65536 ? 1 : 2;
                i16++;
                while (true) {
                    i18 = i19;
                    if (i16 >= length || (b10 = bArr[i16]) < 0) {
                        break;
                    }
                    i16++;
                    i19 = i18 + 1;
                    if (i18 == i10) {
                        return i17;
                    }
                    if (b10 != 10 && b10 != 13) {
                        if (b10 >= 0 && b10 < 32) {
                            z10 = true;
                        } else {
                            if (127 <= b10 && b10 < 160) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (!z10) {
                            if (b10 == 65533) {
                                if (b10 < 65536) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                i17 += i11;
                            }
                        }
                    } else if (b10 == 65533) {
                        if (b10 < 65536) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        i17 += i11;
                    }
                    return -1;
                }
            }
            if ((b11 >> 5) == -2) {
                int i20 = i16 + 1;
                if (length <= i20) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b12 = bArr[i20];
                if (!((b12 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                int i21 = (b12 ^ 3968) ^ (b11 << 6);
                if (i21 < 128) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                i12 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (i21 != 10 && i21 != 13) {
                    if (i21 >= 0 && i21 < 32) {
                        z14 = true;
                    } else {
                        if (127 <= i21 && i21 < 160) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (!z14) {
                        if (i21 == 65533) {
                            if (i21 < 65536) {
                                i15 = 1;
                            } else {
                                i15 = 2;
                            }
                            i17 += i15;
                            r rVar = r.f64562a;
                            i16 += 2;
                        }
                    }
                } else if (i21 == 65533) {
                    if (i21 < 65536) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i17 += i15;
                    r rVar2 = r.f64562a;
                    i16 += 2;
                }
                return -1;
            }
            if ((b11 >> 4) == -2) {
                int i22 = i16 + 2;
                if (length <= i22) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b13 = bArr[i16 + 1];
                if (!((b13 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b14 = bArr[i22];
                if (!((b14 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                int i23 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                if (i23 < 2048) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                if (55296 <= i23 && i23 < 57344) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                i12 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (i23 != 10 && i23 != 13) {
                    if (i23 >= 0 && i23 < 32) {
                        z13 = true;
                    } else {
                        if (127 <= i23 && i23 < 160) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (!z13) {
                        if (i23 == 65533) {
                            if (i23 < 65536) {
                                i14 = 1;
                            } else {
                                i14 = 2;
                            }
                            i17 += i14;
                            r rVar3 = r.f64562a;
                            i16 += 3;
                        }
                    }
                } else if (i23 == 65533) {
                    if (i23 < 65536) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    i17 += i14;
                    r rVar4 = r.f64562a;
                    i16 += 3;
                }
                return -1;
            }
            if ((b11 >> 3) != -2) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            int i24 = i16 + 3;
            if (length <= i24) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b15 = bArr[i16 + 1];
            if (!((b15 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b16 = bArr[i16 + 2];
            if (!((b16 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b17 = bArr[i24];
            if (!((b17 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            int i25 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
            if (i25 > 1114111) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            if (55296 <= i25 && i25 < 57344) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            if (i25 < 65536) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            i12 = i18 + 1;
            if (i18 == i10) {
                return i17;
            }
            if (i25 != 10 && i25 != 13) {
                if (i25 >= 0 && i25 < 32) {
                    z12 = true;
                } else {
                    if (127 <= i25 && i25 < 160) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (!z12) {
                    if (i25 == 65533) {
                        if (i25 < 65536) {
                            i13 = 1;
                        } else {
                            i13 = 2;
                        }
                        i17 += i13;
                        r rVar5 = r.f64562a;
                        i16 += 4;
                    }
                }
            } else if (i25 == 65533) {
                if (i25 < 65536) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                i17 += i13;
                r rVar6 = r.f64562a;
                i16 += 4;
            }
            return -1;
            i18 = i12;
        }
        return i17;
    }

    public static final String commonBase64(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString byteString2) {
        p.j(byteString, "<this>");
        p.j(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = byteString.getByte(i10) & 255;
            int i12 = byteString2.getByte(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(com.applovin.shadow.okio.ByteString byteString, int i10, byte[] bArr, int i11, int i12) {
        p.j(byteString, "<this>");
        p.j(bArr, TypedValues.AttributesType.S_TARGET);
        l.g(byteString.getData$okio(), bArr, i11, i10, i12 + i10);
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeBase64(String str) {
        p.j(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new com.applovin.shadow.okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeHex(String str) {
        p.j(str, "<this>");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((decodeHexDigit(str.charAt(i11)) << 4) + decodeHexDigit(str.charAt(i11 + 1)));
        }
        return new com.applovin.shadow.okio.ByteString(bArr);
    }

    public static final com.applovin.shadow.okio.ByteString commonEncodeUtf8(String str) {
        p.j(str, "<this>");
        com.applovin.shadow.okio.ByteString byteString = new com.applovin.shadow.okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, byte[] bArr) {
        p.j(byteString, "<this>");
        p.j(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.ByteString byteString, Object obj) {
        p.j(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof com.applovin.shadow.okio.ByteString) {
            com.applovin.shadow.okio.ByteString byteString2 = (com.applovin.shadow.okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(com.applovin.shadow.okio.ByteString byteString, int i10) {
        p.j(byteString, "<this>");
        return byteString.getData$okio()[i10];
    }

    public static final int commonGetSize(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : byteString.getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return x.x(cArr);
    }

    public static final int commonIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] bArr, int i10) {
        p.j(byteString, "<this>");
        p.j(bArr, "other");
        int length = byteString.getData$okio().length - bArr.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] bArr, int i10) {
        p.j(byteString, "<this>");
        p.j(bArr, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i10), byteString.getData$okio().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final com.applovin.shadow.okio.ByteString commonOf(byte[] bArr) {
        p.j(bArr, "data");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        p.i(bArrCopyOf, "copyOf(this, size)");
        return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i10, byte[] bArr, int i11, int i12) {
        p.j(byteString, "<this>");
        p.j(bArr, "other");
        return i10 >= 0 && i10 <= byteString.getData$okio().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i10, bArr, i11, i12);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, byte[] bArr) {
        p.j(byteString, "<this>");
        p.j(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final com.applovin.shadow.okio.ByteString commonSubstring(com.applovin.shadow.okio.ByteString byteString, int i10, int i11) {
        p.j(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iResolveDefaultParameter <= byteString.getData$okio().length) {
            if (iResolveDefaultParameter - i10 >= 0) {
                return (i10 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new com.applovin.shadow.okio.ByteString(l.l(byteString.getData$okio(), i10, iResolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiLowercase(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                p.i(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiUppercase(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        for (int i10 = 0; i10 < byteString.getData$okio().length; i10++) {
            byte b10 = byteString.getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                p.i(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        p.i(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final com.applovin.shadow.okio.ByteString commonToByteString(byte[] bArr, int i10, int i11) {
        p.j(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i11);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
        return new com.applovin.shadow.okio.ByteString(l.l(bArr, i10, iResolveDefaultParameter + i10));
    }

    public static final String commonToString(com.applovin.shadow.okio.ByteString byteString) {
        com.applovin.shadow.okio.ByteString byteString2 = byteString;
        p.j(byteString2, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strN = x.N(x.N(x.N(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strN + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strN + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(byteString.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString2, 64);
        if (!(iResolveDefaultParameter <= byteString.getData$okio().length)) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        if (!(iResolveDefaultParameter + 0 >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString2 = new com.applovin.shadow.okio.ByteString(l.l(byteString.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb2.append(byteString2.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    public static final String commonUtf8(com.applovin.shadow.okio.ByteString byteString) {
        p.j(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(com.applovin.shadow.okio.ByteString byteString, Buffer buffer, int i10, int i11) {
        p.j(byteString, "<this>");
        p.j(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }
}
