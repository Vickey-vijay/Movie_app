package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class a4 extends z3 {
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!y3.a(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (y3.a(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i10 = i15;
                while (i10 < i12) {
                    byte b12 = bArr[i10];
                    if (!y3.a(b12)) {
                        break;
                    }
                    i10++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                i10 += 2;
                y3.a(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 2;
                i10 += 3;
                y3.a(b11, bArr[i15], bArr[i16], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte b13 = bArr[i15];
                int i17 = i10 + 3;
                byte b14 = bArr[i10 + 2];
                i10 += 4;
                y3.a(b11, b13, b14, bArr[i17], cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 < i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    i10 = i12;
                } else if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 < -62) {
                        return -1;
                    }
                    i10 += 2;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                } else if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        int i13 = i11 - i12;
                        if (i13 == 0) {
                            if (b10 > -12) {
                                return -1;
                            }
                            return b10;
                        }
                        if (i13 == 1) {
                            return d4.a(b10, bArr[i12]);
                        }
                        if (i13 == 2) {
                            return d4.a(b10, bArr[i12], bArr[i10 + 2]);
                        }
                        throw new AssertionError();
                    }
                    int i14 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 > -65) {
                        return -1;
                    }
                    if (b10 == -32 && b11 < -96) {
                        return -1;
                    }
                    if (b10 == -19 && b11 >= -96) {
                        return -1;
                    }
                    i10 += 3;
                    if (bArr[i14] > -65) {
                        return -1;
                    }
                } else {
                    if (i12 >= i11 - 2) {
                        int i15 = i11 - i12;
                        if (i15 == 0) {
                            if (b10 > -12) {
                                return -1;
                            }
                            return b10;
                        }
                        if (i15 == 1) {
                            return d4.a(b10, bArr[i12]);
                        }
                        if (i15 == 2) {
                            return d4.a(b10, bArr[i12], bArr[i10 + 2]);
                        }
                        throw new AssertionError();
                    }
                    int i16 = i10 + 2;
                    byte b12 = bArr[i12];
                    if (b12 > -65) {
                        return -1;
                    }
                    if ((((b12 + 112) + (b10 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i17 = i10 + 3;
                    if (bArr[i16] > -65) {
                        return -1;
                    }
                    i10 += 4;
                    if (bArr[i17] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i10, int i11) {
        return z3.a(byteBuffer, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                    if (i16 <= i14 - 4) {
                        int i18 = i15 + 1;
                        if (i18 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new b4(i15 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                        throw new b4(i15, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }
}
